package com.studyakka.hello

import akka.actor.{Actor, ActorSystem, Props}

class HelloActor extends Actor {
  def receive = {
    case "Hello" => println("World")
  }
}

object Main extends App {
  val system = ActorSystem("system")
  val actor = system.actorOf(Props[HelloActor])
  actor ! "Hello"
}
