import org.junit.Assert

class Foo {
  def foo: String = "foo!"

  def asserts(): Unit = {
    Assert.assertTrue(true)
  }
}