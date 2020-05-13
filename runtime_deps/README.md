Remove compile time dependency which brings runtime dep transitively

Reproduce: `bazel run //runtime_deps/a:ReadResource`

a dependes on b, where the b has runtime dep on a resource.

Building with `//scala:minimal_direct_source_deps` suggests to remove b from a deps, which changes runtime behaviour. 

Wishlist:
- maybe propagate runtime deps

```bash
ERROR: /home/vaidas/projects/scala-unused-deps/runtime_deps/a/BUILD:3:1: scala //runtime_deps/a:a failed (Exit 1)
error: Target '//runtime_deps/b:b' is specified as a dependency to //runtime_deps/a:a but isn't used, please remove it from the deps.
You can use the following buildozer command:
buildozer 'remove deps //runtime_deps/b:b' //runtime_deps/a:a
```