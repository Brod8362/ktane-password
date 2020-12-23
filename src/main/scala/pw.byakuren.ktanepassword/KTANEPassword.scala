package pw.byakuren.ktanepassword

import scala.io.StdIn.readLine

object KTANEPassword extends App {

  var available = Seq("about", "after", "again", "below", "could", "every", "first", "found", "great", "house",
    "large", "learn", "never", "other", "place", "plant", "point", "right", "small", "sound",
    "spell", "still", "study", "their", "there", "these", "thing", "think", "three", "water",
    "where", "which", "world", "would", "write")
  var index = 0
  while (available.size > 1) {
    val size = available.size
    if (size < 5) {
      println(available)
    } else {
      System.out.println(s"$size remain")
    }
    val input = readLine()
    available = available.filter(a => input.toCharArray.contains(a.charAt(index)))
    index += 1
  }
  System.out.println(available.head)
}