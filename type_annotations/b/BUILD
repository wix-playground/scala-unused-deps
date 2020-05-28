load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "b",
    srcs = glob(["*.scala"]),
    visibility = ["//visibility:public"],
    deps = [
        "//type_annotations/c",
#        "//type_annotations/d",
    ],
)
