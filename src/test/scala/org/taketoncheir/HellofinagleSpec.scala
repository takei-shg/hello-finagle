import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
import org.taketoncheir.Hellofinagle

object HellofinagleSpec extends Properties("List") {

  property("cumul") = forAll {
    (xs: List[Int]) => Hellofinagle.cumulative(xs).size == xs.size
  }
}

