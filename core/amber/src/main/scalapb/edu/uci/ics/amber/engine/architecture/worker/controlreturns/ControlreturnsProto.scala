// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package edu.uci.ics.amber.engine.architecture.worker.controlreturns

object ControlreturnsProto extends _root_.scalapb.GeneratedFileObject {
  lazy val dependencies: Seq[_root_.scalapb.GeneratedFileObject] = Seq(
    edu.uci.ics.amber.engine.architecture.worker.statistics.StatisticsProto,
    scalapb.options.ScalapbProto
  )
  lazy val messagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] =
    Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]](
      edu.uci.ics.amber.engine.architecture.worker.controlreturns.ControlReturnV2
    )
  private lazy val ProtoBytes: _root_.scala.Array[Byte] =
      scalapb.Encoding.fromBase64(scala.collection.immutable.Seq(
  """CkFlZHUvdWNpL2ljcy9hbWJlci9lbmdpbmUvYXJjaGl0ZWN0dXJlL3dvcmtlci9jb250cm9scmV0dXJucy5wcm90bxIsZWR1L
  nVjaS5pY3MuYW1iZXIuZW5naW5lLmFyY2hpdGVjdHVyZS53b3JrZXIaPWVkdS91Y2kvaWNzL2FtYmVyL2VuZ2luZS9hcmNoaXRlY
  3R1cmUvd29ya2VyL3N0YXRpc3RpY3MucHJvdG8aFXNjYWxhcGIvc2NhbGFwYi5wcm90byKTAgoPQ29udHJvbFJldHVyblYyEoQBC
  hF3b3JrZXJfc3RhdGlzdGljcxgBIAEoCzI+LmVkdS51Y2kuaWNzLmFtYmVyLmVuZ2luZS5hcmNoaXRlY3R1cmUud29ya2VyLldvc
  mtlclN0YXRpc3RpY3NCFeI/EhIQd29ya2VyU3RhdGlzdGljc0gAUhB3b3JrZXJTdGF0aXN0aWNzEnAKDHdvcmtlcl9zdGF0ZRgCI
  AEoDjI5LmVkdS51Y2kuaWNzLmFtYmVyLmVuZ2luZS5hcmNoaXRlY3R1cmUud29ya2VyLldvcmtlclN0YXRlQhDiPw0SC3dvcmtlc
  lN0YXRlSABSC3dvcmtlclN0YXRlQgcKBXZhbHVlQgniPwZIAFgAeAFiBnByb3RvMw=="""
      ).mkString)
  lazy val scalaDescriptor: _root_.scalapb.descriptors.FileDescriptor = {
    val scalaProto = com.google.protobuf.descriptor.FileDescriptorProto.parseFrom(ProtoBytes)
    _root_.scalapb.descriptors.FileDescriptor.buildFrom(scalaProto, dependencies.map(_.scalaDescriptor))
  }
  lazy val javaDescriptor: com.google.protobuf.Descriptors.FileDescriptor = {
    val javaProto = com.google.protobuf.DescriptorProtos.FileDescriptorProto.parseFrom(ProtoBytes)
    com.google.protobuf.Descriptors.FileDescriptor.buildFrom(javaProto, _root_.scala.Array(
      edu.uci.ics.amber.engine.architecture.worker.statistics.StatisticsProto.javaDescriptor,
      scalapb.options.ScalapbProto.javaDescriptor
    ))
  }
  @deprecated("Use javaDescriptor instead. In a future version this will refer to scalaDescriptor.", "ScalaPB 0.5.47")
  def descriptor: com.google.protobuf.Descriptors.FileDescriptor = javaDescriptor
}