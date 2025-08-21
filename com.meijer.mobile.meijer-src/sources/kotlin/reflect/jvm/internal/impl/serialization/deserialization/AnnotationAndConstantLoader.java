package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes14.dex */
public interface AnnotationAndConstantLoader<A, C> extends AnnotationLoader<A> {
    C f(ProtoContainer protoContainer, ProtoBuf.Property property, KotlinType kotlinType);

    C h(ProtoContainer protoContainer, ProtoBuf.Property property, KotlinType kotlinType);
}
