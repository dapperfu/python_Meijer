package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.reflect.jvm.internal.impl.descriptors.DeserializedDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes13.dex */
public interface DeserializedMemberDescriptor extends DeserializedDescriptor, DescriptorWithContainerSource {
    TypeTable D();

    NameResolver G();

    DeserializedContainerSource H();

    MessageLite c0();
}
