load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library", "scala_binary")

scala_library(
    name = "a",
    deps = ["//runtime_deps/b"],
    srcs = glob(["*.scala"]),
    visibility = ["//visibility:public"],
)

scala_binary(
    name = "ReadResource",
    main_class = "a.Main",
    deps = [":a"],
)