package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes14.dex */
class g implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f147508a;

    /* renamed from: b, reason: collision with root package name */
    private final MessageLite f147509b;

    /* renamed from: c, reason: collision with root package name */
    private final AnnotatedCallableKind f147510c;

    public g(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        this.f147508a = memberDeserializer;
        this.f147509b = messageLite;
        this.f147510c = annotatedCallableKind;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.k(this.f147508a, this.f147509b, this.f147510c);
    }
}
