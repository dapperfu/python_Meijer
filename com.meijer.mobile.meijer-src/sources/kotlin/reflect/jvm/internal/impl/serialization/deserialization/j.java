package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes14.dex */
class j implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f147517a;

    /* renamed from: b, reason: collision with root package name */
    private final ProtoContainer f147518b;

    /* renamed from: c, reason: collision with root package name */
    private final MessageLite f147519c;

    /* renamed from: d, reason: collision with root package name */
    private final AnnotatedCallableKind f147520d;

    /* renamed from: e, reason: collision with root package name */
    private final int f147521e;

    /* renamed from: f, reason: collision with root package name */
    private final ProtoBuf.ValueParameter f147522f;

    public j(MemberDeserializer memberDeserializer, ProtoContainer protoContainer, MessageLite messageLite, AnnotatedCallableKind annotatedCallableKind, int i10, ProtoBuf.ValueParameter valueParameter) {
        this.f147517a = memberDeserializer;
        this.f147518b = protoContainer;
        this.f147519c = messageLite;
        this.f147520d = annotatedCallableKind;
        this.f147521e = i10;
        this.f147522f = valueParameter;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.C(this.f147517a, this.f147518b, this.f147519c, this.f147520d, this.f147521e, this.f147522f);
    }
}
