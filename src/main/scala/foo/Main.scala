package foo

import com.typesafe.scalalogging.Logger
import org.slf4j.LoggerFactory

object Main {
  val logger = Logger(LoggerFactory.getLogger(Main.getClass))

  def main(args: Array[String]) = {
    println("hello, stdout")
    logger.debug("hello")
  }

}
