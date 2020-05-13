load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "b",
    runtime_deps = [":resource"],
    srcs = glob(["*.scala"]),
    visibility = ["//visibility:public"],
)

java_library(
    name = "resource",
    resource_strip_prefix = "runtime_deps/b",
    resources = ["resource.txt"],
    visibility = [":__pkg__"],
)