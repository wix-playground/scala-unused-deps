load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "b",
    srcs = glob(["*.scala"]),
    visibility = ["//visibility:public"],
    deps = ["@junit_junit", "@commons_io_commons_io"],
)
