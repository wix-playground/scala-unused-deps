load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "a",
    srcs = glob(["*.scala"]),
    visibility = ["//visibility:public"],
    deps = [
        "//type_annotations/b",
        "//type_annotations/c",
    ]
)
