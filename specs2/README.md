With specs2-matchers and specs2-common:

```bash
ERROR: /home/vaidas/projects/scala-unused-deps/specs2/BUILD:3:1: Couldn't build file specs2/specs2.jar: scala //specs2:specs2 failed (Exit 1)
error: Target '@io_bazel_rules_scala_org_specs2_specs2_common//:io_bazel_rules_scala_org_specs2_specs2_common' is specified as a dependency to //specs2:specs2 but isn't used, please remove it from the deps.
You can use the following buildozer command:
buildozer 'remove deps @io_bazel_rules_scala_org_specs2_specs2_common//:io_bazel_rules_scala_org_specs2_specs2_common' //specs2:specs2
error: Target '@io_bazel_rules_scala_org_specs2_specs2_matcher//:io_bazel_rules_scala_org_specs2_specs2_matcher' is specified as a dependency to //specs2:specs2 but isn't used, please remove it from the deps.
You can use the following buildozer command:
buildozer 'remove deps @io_bazel_rules_scala_org_specs2_specs2_matcher//:io_bazel_rules_scala_org_specs2_specs2_matcher' //specs2:specs2
```

Without specs2-matchers and specs2-common:
```bash
ERROR: /home/vaidas/projects/scala-unused-deps/specs2/BUILD:3:1: Couldn't build file specs2/specs2.jar: scala //specs2:specs2 failed (Exit 1)
specs2/MockingBird.scala:7: error: Symbol 'type org.specs2.reflect.ClassesOf' is missing from the classpath.
This symbol is required by 'trait org.specs2.mock.mockito.MocksCreation'.
Make sure that type ClassesOf is in your classpath and check for conflicting dependencies with `-Ylog-classpath`.
A full rebuild may help if 'MocksCreation.class' was compiled against an incompatible version of org.specs2.reflect.
class MockingBird extends Mockito {
                          ^
one error found
one error found
java.lang.RuntimeException: Build failed
	at io.bazel.rulesscala.scalac.ScalacProcessor.compileScalaSources(ScalacProcessor.java:256)
	at io.bazel.rulesscala.scalac.ScalacProcessor.processRequest(ScalacProcessor.java:76)
	at io.bazel.rulesscala.worker.GenericWorker.runPersistentWorker(GenericWorker.java:45)
	at io.bazel.rulesscala.worker.GenericWorker.run(GenericWorker.java:111)
	at io.bazel.rulesscala.scalac.ScalaCInvoker.main(ScalaCInvoker.java:41)
```