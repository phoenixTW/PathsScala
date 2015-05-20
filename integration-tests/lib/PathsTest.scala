package lib

import org.scalatest.{FlatSpec, GivenWhenThen}

class PathsTest extends FlatSpec {
  "execute" should "return true for direct path between Bangalore to Tokyo" in {
    val db = new Database()
    db.insert("Bangalore", "Tokyo")
    assert(Paths.execute(db, "Bangalore", "Tokyo") == true)
  }

  it should "return false for Bangalore to Pune" in {
    val db = new Database()
    db.insert("Bangalore", "Tokyo")
    assert(Paths.execute(db, "Bangalore", "Pune") == false)
  }

}
