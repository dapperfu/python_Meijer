package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;

/* loaded from: classes13.dex */
class k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    private final DeserializedClassDescriptor.b f146575a;

    /* renamed from: b, reason: collision with root package name */
    private final DeserializedClassDescriptor f146576b;

    public k(DeserializedClassDescriptor.b bVar, DeserializedClassDescriptor deserializedClassDescriptor) {
        this.f146575a = bVar;
        this.f146576b = deserializedClassDescriptor;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return DeserializedClassDescriptor.b.f(this.f146575a, this.f146576b, (Name) obj);
    }
}
