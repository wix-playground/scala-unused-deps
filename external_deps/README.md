Demonstrates issue with unused deps inside external source dependency

How to reproduce: `bazel build //external_deps/a`

Problems with fixing external dependecies:
- In case one does not control external dependency and can't update it, it bocomes a blocking state 
  (either don't depend on it, or do not use unused deps checking)
- bazelisk command is useless (due to alias in use and external workspace)

Wishlist:
- Don't err on external deps
- Add configuration to allow *error*, *warning*, *none*. Most likely *none* is the only reasonable option

```bash
ERROR: /home/vaidas/.cache/bazel/_bazel_vaidas/fe796626ea1b61600b06a08b03d1d927/external/ext_b/BUILD:3:1: scala @ext_b//:b failed (Exit 1)
error: Target '@maven//:commons_io_commons_io' is specified as a dependency to @ext_b//:b but isn't used, please remove it from the deps.
You can use the following buildozer command:
buildozer 'remove deps @maven//:commons_io_commons_io' @ext_b//:b
```