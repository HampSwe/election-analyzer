//> using scala "3.2.1"
//> using lib "net.ruippeixotog::scala-scraper:3.0.0"

import net.ruippeixotog.scalascraper.browser.JsoupBrowser

import net.ruippeixotog.scalascraper.dsl.DSL._
import net.ruippeixotog.scalascraper.dsl.DSL.Extract._
import net.ruippeixotog.scalascraper.dsl.DSL.Parse._

@main
def run(): Unit =

    val browser = JsoupBrowser()
    val doc = browser.get("http://example.com")

    val tmp = doc.title

    println(tmp)