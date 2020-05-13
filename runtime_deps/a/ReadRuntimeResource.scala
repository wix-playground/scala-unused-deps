package a

import java.io.{BufferedReader, InputStream, InputStreamReader}

object Main {
  def main(args: Array[String]): Unit = {
    println(new ReadRuntimeResource().read())
  }
}

class ReadRuntimeResource {
  def read(): String = Option(getClass.getResourceAsStream("/resource.txt"))
    .map(readFirstLine)
    .getOrElse("Not from resource")

  private def readFirstLine(input: InputStream): String = {
    new BufferedReader(new InputStreamReader(input)).readLine()
  }
}
