package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes14.dex */
class h implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f147511a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f147512b;

    /* renamed from: c, reason: collision with root package name */
    private final ProtoBuf.Property f147513c;

    public h(MemberDeserializer memberDeserializer, boolean z10, ProtoBuf.Property property) {
        this.f147511a = memberDeserializer;
        this.f147512b = z10;
        this.f147513c = property;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.n(this.f147511a, this.f147512b, this.f147513c);
    }
}
