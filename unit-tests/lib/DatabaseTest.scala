package lib

import org.scalatest.FlatSpec

class DatabaseTest extends FlatSpec {

  "hasPath" should "give true for Bangalore to Tokyo" in {
    val db = new Database()
    db.insert("Bangalore", "Tokyo")
    assert(true == db.hasPath("Bangalore", "Tokyo"))
  }

  "hasPath" should "give false for Bangalore to Jharkhand" in {
    val db = new Database()
    db.insert("Bangalore", "Tokyo")
    assert(false == db.hasPath("Bangalore", "Jharkhand"))
  }

  "insert" should "return true for fresh insertion" in {
    val db = new Database()
    assert(true == db.insert("Bangalore", "Tokyo"))

  }

  "insert" should "return false for existing insertion" in {
    val db = new Database()
    assert(true == db.insert("Bangalore", "Tokyo"))
    assert(false == db.insert("Bangalore", "Tokyo"))
  }
}
