resolvers += Resolver.typesafeRepo("maven-releases")
resolvers += Resolver.bintrayIvyRepo("stonexx","sbt-plugins")
libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.25"

addSbtPlugin("com.github.stonexx.sbt" % "sbt-webpack" %  "1.3.1")
