package cats

trait <=>[A, B] {
  def to: A => B
  def from: B => A
}

trait <~>[F[_], G[_]] {
  def to: F ~> G
  def from: G ~> F
}
