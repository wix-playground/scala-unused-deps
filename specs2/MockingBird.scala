package specs2

import org.specs2.mock.Mockito

trait Bird

class MockingBird extends Mockito {
  val bird = mock[Bird]
}
