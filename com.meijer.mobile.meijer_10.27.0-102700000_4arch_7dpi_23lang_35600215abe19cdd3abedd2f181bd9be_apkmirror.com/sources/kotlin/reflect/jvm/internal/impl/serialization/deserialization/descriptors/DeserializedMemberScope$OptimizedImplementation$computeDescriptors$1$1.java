package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;

/* loaded from: classes13.dex */
public final class DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Parser f146521a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ByteArrayInputStream f146522b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ DeserializedMemberScope f146523c;

    public DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(Parser parser, ByteArrayInputStream byteArrayInputStream, DeserializedMemberScope deserializedMemberScope) {
        this.f146521a = parser;
        this.f146522b = byteArrayInputStream;
        this.f146523c = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final MessageLite invoke() {
        return (MessageLite) this.f146521a.d(this.f146522b, this.f146523c.s().c().k());
    }
}
