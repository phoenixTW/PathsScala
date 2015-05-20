package lib

class Database {
  var collectionOfPaths = collection.immutable.Map[String, String]()

  def hasPath(source: String, destination: String): Boolean = {
    collectionOfPaths.getOrElse(source, "default") == destination
  }

  def insert(source: String, destination: String): Boolean = {
    if(collectionOfPaths.getOrElse(source, "default") == destination) {
      return false
    }

    collectionOfPaths += (source -> destination)
    true
  }
}
