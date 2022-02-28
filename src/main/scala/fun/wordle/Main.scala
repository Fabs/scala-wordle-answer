package fun.wordle

import cats.effect.{ExitCode, IO, IOApp}

object Main extends IOApp {
  def run(args: List[String]) =
    WordleServer.stream[IO].compile.drain.as(ExitCode.Success)
}
