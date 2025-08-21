package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes14.dex */
class i implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f147514a;

    /* renamed from: b, reason: collision with root package name */
    private final MessageLite f147515b;

    /* renamed from: c, reason: collision with root package name */
    private final AnnotatedCallableKind f147516c;

    public i(MemberDeserializer memberDeserializer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind) {
        this.f147514a = memberDeserializer;
        this.f147515b = messageLite;
        this.f147516c = annotatedCallableKind;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.p(this.f147514a, this.f147515b, this.f147516c);
    }
}
