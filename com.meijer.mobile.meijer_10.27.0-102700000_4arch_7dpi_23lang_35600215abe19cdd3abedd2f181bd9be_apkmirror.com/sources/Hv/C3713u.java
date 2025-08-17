package Hv;

import Fv.e;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LHv/u;", "LDv/b;", "Lkotlin/time/Duration;", "<init>", "()V", "LGv/f;", "encoder", "value", "", "g", "(LGv/f;J)V", "LGv/e;", "decoder", "f", "(LGv/e;)J", "LFv/f;", "b", "LFv/f;", "a", "()LFv/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* renamed from: Hv.u, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C3713u implements Dv.b<Duration> {

    /* renamed from: a, reason: collision with root package name */
    public static final C3713u f13370a = new C3713u();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Fv.f descriptor = new PrimitiveDescriptor("kotlin.time.Duration", e.i.f11113a);

    @Override // Dv.b, Dv.h, Dv.a
    /* renamed from: a */
    public Fv.f getDescriptor() {
        return descriptor;
    }

    @Override // Dv.h
    public /* bridge */ /* synthetic */ void b(Gv.f fVar, Object obj) {
        g(fVar, ((Duration) obj).getRawValue());
    }

    public long f(Gv.e decoder) {
        Intrinsics.j(decoder, "decoder");
        return Duration.INSTANCE.d(decoder.A());
    }

    public void g(Gv.f encoder, long value) {
        Intrinsics.j(encoder, "encoder");
        encoder.E(Duration.Y(value));
    }

    private C3713u() {
    }

    @Override // Dv.a
    public /* bridge */ /* synthetic */ Object d(Gv.e eVar) {
        return Duration.o(f(eVar));
    }
}
