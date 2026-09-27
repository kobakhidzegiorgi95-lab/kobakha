param(
    [Parameter(Mandatory = $true)]
    [string]$SourceFile
)

$ErrorActionPreference = "Stop"
$sourcePath = (Resolve-Path -LiteralPath $SourceFile).Path
$sourceDirectory = Split-Path -Parent $sourcePath
$className = [System.IO.Path]::GetFileNameWithoutExtension($sourcePath)
$libraryPath = Join-Path $PSScriptRoot "karel.jar"

if ($sourceDirectory -ne $PSScriptRoot) {
    throw "Run a Karel source file from the project root."
}

& javac -cp $libraryPath $sourcePath
if ($LASTEXITCODE -ne 0) {
    exit $LASTEXITCODE
}

& java -cp "$PSScriptRoot;$libraryPath" stanford.karel.Karel "code=$className"
exit $LASTEXITCODE