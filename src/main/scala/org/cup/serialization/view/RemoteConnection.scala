package org.cup.serialization.view

object RemoteConnection {
  import Serialization._
  def write[T <% Writable](t: T) = t.serialized
}