package com.ip2whois

object FullTest {
  def main(args: Array[String]): Unit = {
    try {
      // Configures IP2Location.io API key
      val strApiKey = "YOUR_API_KEY"

      // Lookup domain information
      val strDomain = "locaproxy.com"
      val whois = new IP2Whois(strApiKey)
      val myResult2 = whois.lookUp(strDomain)
      System.out.println(myResult2)

      // Convert normal text to punycode
      System.out.println(whois.toPunycode("täst.de"))

      // Convert punycode to normal text
      System.out.println(whois.toNormalText("xn--tst-qla.de"))

      // Get domain name from URL
      System.out.println(whois.toDomainName("https://www.example.com/exe"))

      // Get domain extension (gTLD or ccTLD) from URL or domain name
      System.out.println(whois.toDomainExtension("example.com"))
    } catch {
      case e: Exception => System.out.println(e)
        e.printStackTrace(System.out)
    }
  }
}
