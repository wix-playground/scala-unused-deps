Enable unused dep checking by passing on cmd line or in .bazelrc:
`--extra_toolchains=@io_bazel_rules_scala//scala:minimal_direct_source_deps`

Attempt to fix:
`bazel build //... 2>&1 | grep ^buildozer | while read line; do eval $line; done;`

Experiment with DepFixer:
`bazel run @depfixer//depfixer/src/main/java/com/wix/bazel/depfixer/runner:depfixer_cli -- -targets //simple/a/...`