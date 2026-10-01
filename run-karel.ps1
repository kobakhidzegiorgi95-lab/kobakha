param(
    [Parameter(Mandatory = $true)]
    [string]$SourceFile
)

$ErrorActionPreference = "Stop"
$sourcePath = (Resolve-Path -LiteralPath $SourceFile).Path
$sourceDirectory = Split-Path -Parent $sourcePath
$className = [System.IO.Path]::GetFileNameWithoutExtension($sourcePath)
$libraryPath = Join-Path $PSScriptRoot "karel.jar"
$projectRootPrefix = $PSScriptRoot.TrimEnd('\') + '\'

if (-not $sourcePath.StartsWith($projectRootPrefix, [System.StringComparison]::OrdinalIgnoreCase)) {
    throw "Run a Karel source file from within the project."
}

& javac -cp $libraryPath $sourcePath
if ($LASTEXITCODE -ne 0) {
    exit $LASTEXITCODE
}

& java -cp "$sourceDirectory;$PSScriptRoot;$libraryPath" stanford.karel.Karel "code=$className"
exit $LASTEXITCODE