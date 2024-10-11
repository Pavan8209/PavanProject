
object CricketMatch extends App{

    val mi = Team("Mumbai Indians", 183)
    val csk = Team("Chennai Super Kings", 183)

    println("Welcome to ipl match between:")
    println("mumbai indians vs chennai super kings")
    for (i <- 16 to 20) {
      println(s"Over $i:")
      csk.bat(mi)
      println(s"Score: ${csk.name} - ${csk.score}")
      mi.bat(csk)
      println(s"score: ${mi.name} - ${mi.score}")
    }

    if (mi.score > csk.score) {
      println(s"${mi.name} wins!")
    } else if (csk.score > mi.score) {
      println(s"${csk.name} wins!")
    } else {
      println("ESCN namde!")
    }
}

case class Team(name: String, var score: Int) {
  def bat(opponent: Team): Unit = {

    val runs = scala.util.Random.nextInt(10)
    score += runs
    println(s"${name} scores $runs runs in this over")
    if (runs < 6) {
      println(s"${name} loses a wicket!")
    }
  }
}



