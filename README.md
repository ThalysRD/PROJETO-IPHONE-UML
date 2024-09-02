```mermaid
classDiagram
    Iphone <|-- ReprodutorMusical
    Iphone <|-- AparelhoTelefônico
    Iphone <|-- NavegadorNaInternet
    Iphone : +int volume
    Iphone : +boolean ligado
    Iphone: +powerOn()
    Iphone: +volumeUp()
    Iphone: +volumeDown()
    class ReprodutorMusical{
    +play()
    +pause()
    +stop()
    +next()
    +previous()
    }
    class AparelhoTelefônico{
    +makeCall(number: string)
    +answerCall()
    +endCall()
    }
    class NavegadorNaInternet{
      +openURL(url: string)
    +refresh()
    +back()
    +forward()
    }
