package lib

object Paths {
  def main(args: Array[String]) {
    val db = new Database()
    db.insert("Bangalore", "Tokyo")
    println(execute(db, args(0), args(1)))
  }

  def execute(db: Database, source: String, destination: String): Boolean = {
    db.hasPath(source, destination)
  }
}
