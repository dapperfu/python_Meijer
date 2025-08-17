package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ProtoContainer;

/* loaded from: classes13.dex */
public interface AnnotationLoader<A> {
    List<A> a(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i10, ProtoBuf.ValueParameter valueParameter);

    List<A> b(ProtoContainer.Class r12);

    List<A> c(ProtoBuf.Type type, NameResolver nameResolver);

    List<A> d(ProtoContainer protoContainer, ProtoBuf.EnumEntry enumEntry);

    List<A> e(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind);

    List<A> g(ProtoBuf.TypeParameter typeParameter, NameResolver nameResolver);

    A i(ProtoBuf.Annotation annotation, NameResolver nameResolver);

    List<A> j(ProtoContainer protoContainer, ProtoBuf.Property property);

    List<A> k(ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind);

    List<A> l(ProtoContainer protoContainer, ProtoBuf.Property property);
}
