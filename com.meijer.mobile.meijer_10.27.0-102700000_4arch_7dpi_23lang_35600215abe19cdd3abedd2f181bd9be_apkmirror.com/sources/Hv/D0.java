package Hv;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LHv/D0;", "LDv/b;", "Lkotlin/ULong;", "<init>", "()V", "LGv/f;", "encoder", "value", "", "g", "(LGv/f;J)V", "LGv/e;", "decoder", "f", "(LGv/e;)J", "LFv/f;", "b", "LFv/f;", "a", "()LFv/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes13.dex */
public final class D0 implements Dv.b<ULong> {

    /* renamed from: a, reason: collision with root package name */
    public static final D0 f13267a = new D0();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Fv.f descriptor = B.a("kotlin.ULong", Ev.a.B(LongCompanionObject.f142825a));

    @Override // Dv.b, Dv.h, Dv.a
    /* renamed from: a */
    public Fv.f getDescriptor() {
        return descriptor;
    }

    @Override // Dv.h
    public /* bridge */ /* synthetic */ void b(Gv.f fVar, Object obj) {
        g(fVar, ((ULong) obj).getData());
    }

    public long f(Gv.e decoder) {
        Intrinsics.j(decoder, "decoder");
        return ULong.b(decoder.f(getDescriptor()).k());
    }

    public void g(Gv.f encoder, long value) {
        Intrinsics.j(encoder, "encoder");
        encoder.D(getDescriptor()).q(value);
    }

    private D0() {
    }

    @Override // Dv.a
    public /* bridge */ /* synthetic */ Object d(Gv.e eVar) {
        return ULong.a(f(eVar));
    }
}
