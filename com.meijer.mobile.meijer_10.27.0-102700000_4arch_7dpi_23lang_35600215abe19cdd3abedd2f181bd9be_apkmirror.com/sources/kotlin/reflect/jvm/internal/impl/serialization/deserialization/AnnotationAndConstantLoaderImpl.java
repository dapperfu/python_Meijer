package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.serialization.SerializerExtensionProtocol;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* loaded from: classes13.dex */
public final class AnnotationAndConstantLoaderImpl extends AbstractAnnotationLoader<AnnotationDescriptor> implements AnnotationAndConstantLoader<AnnotationDescriptor, ConstantValue<?>> {

    /* renamed from: b, reason: collision with root package name */
    private final AnnotationDeserializer f146355b;

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public ConstantValue<?> f(ProtoContainer container, ProtoBuf.Property proto, KotlinType expectedType) {
        Intrinsics.j(container, "container");
        Intrinsics.j(proto, "proto");
        Intrinsics.j(expectedType, "expectedType");
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationAndConstantLoaderImpl(ModuleDescriptor module, NotFoundClasses notFoundClasses, SerializerExtensionProtocol protocol) {
        super(protocol);
        Intrinsics.j(module, "module");
        Intrinsics.j(notFoundClasses, "notFoundClasses");
        Intrinsics.j(protocol, "protocol");
        this.f146355b = new AnnotationDeserializer(module, notFoundClasses);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationLoader
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public AnnotationDescriptor i(ProtoBuf.Annotation proto, NameResolver nameResolver) {
        Intrinsics.j(proto, "proto");
        Intrinsics.j(nameResolver, "nameResolver");
        return this.f146355b.a(proto, nameResolver);
    }

    @Override // kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotationAndConstantLoader
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public ConstantValue<?> h(ProtoContainer container, ProtoBuf.Property proto, KotlinType expectedType) {
        Intrinsics.j(container, "container");
        Intrinsics.j(proto, "proto");
        Intrinsics.j(expectedType, "expectedType");
        ProtoBuf.Annotation.Argument.Value value = (ProtoBuf.Annotation.Argument.Value) ProtoBufUtilKt.a(proto, m().b());
        if (value == null) {
            return null;
        }
        return this.f146355b.f(expectedType, value, container.b());
    }
}
