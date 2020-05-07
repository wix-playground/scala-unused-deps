load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "b",
    srcs = glob(["*.scala"]),
    deps = [
        "//simple/a",
        "//simple/c",
    ],
)
