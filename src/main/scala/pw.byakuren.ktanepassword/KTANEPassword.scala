package pw.byakuren.ktanepassword

import scala.io.StdIn.readLine

object KTANEPassword extends App {

  var available = Seq("about", "after", "again", "below", "could", "every", "first", "found", "great", "house",
    "large", "learn", "never", "other", "place", "plant", "point", "right", "small", "sound",
    "spell", "still", "study", "their", "there", "these", "thing", "think", "three", "water",
    "where", "which", "world", "would", "write")
  var index = 0
  while (available.size > 1) {
    System.out.println(s"${available.size} remain")
    val input = readLine()
    var nAvailable: Seq[String] = Seq()
    for (c <- input.toCharArray) {
      nAvailable++=available.filter(_.charAt(index)==c)
    }
    index+=1
    available = nAvailable
  }
  System.out.println(available.head)
}