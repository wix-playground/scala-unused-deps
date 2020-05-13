load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "a",
    srcs = glob(["*.scala"]),
    deps = ["@ext_b//:b"],
    visibility = ["//visibility:public"],
)