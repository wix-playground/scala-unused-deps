package a

import b.LoggingProvider

class Hello {
  def print(text: String): Unit = {
    new LoggingProvider().logger.log(text)
  }
}