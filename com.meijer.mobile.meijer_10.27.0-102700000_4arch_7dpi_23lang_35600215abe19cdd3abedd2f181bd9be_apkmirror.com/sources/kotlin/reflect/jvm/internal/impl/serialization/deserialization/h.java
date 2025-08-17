package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes13.dex */
class h implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    private final MemberDeserializer f146604a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f146605b;

    /* renamed from: c, reason: collision with root package name */
    private final ProtoBuf.Property f146606c;

    public h(MemberDeserializer memberDeserializer, boolean z10, ProtoBuf.Property property) {
        this.f146604a = memberDeserializer;
        this.f146605b = z10;
        this.f146606c = property;
    }

    @Override // kotlin.jvm.functions.Function0
    public Object invoke() {
        return MemberDeserializer.n(this.f146604a, this.f146605b, this.f146606c);
    }
}
