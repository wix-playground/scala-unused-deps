load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")

scala_library(
    name = "specs2",
    srcs = glob(["*.scala"]),
    visibility = ["//visibility:public"],
    deps = [
        "@io_bazel_rules_scala_org_specs2_specs2_common",
        "@io_bazel_rules_scala_org_specs2_specs2_matcher",
        "@maven//:org_specs2_specs2_mock_2_12",
    ],
)
