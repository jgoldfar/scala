object Test {
  def idMap[C[_],T](m: { def map[U](f: T => U): C[U] }): C[T] = m.map(t => t)
  idMap(Some(0))
}