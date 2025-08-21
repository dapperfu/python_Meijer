package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.io.ByteArrayInputStream;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.Parser;

/* loaded from: classes14.dex */
public final class DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1 implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Parser f147428a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ByteArrayInputStream f147429b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ DeserializedMemberScope f147430c;

    public DeserializedMemberScope$OptimizedImplementation$computeDescriptors$1$1(Parser parser, ByteArrayInputStream byteArrayInputStream, DeserializedMemberScope deserializedMemberScope) {
        this.f147428a = parser;
        this.f147429b = byteArrayInputStream;
        this.f147430c = deserializedMemberScope;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final MessageLite invoke() {
        return (MessageLite) this.f147428a.d(this.f147429b, this.f147430c.s().c().k());
    }
}
