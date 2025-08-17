package Hv;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LHv/H0;", "LDv/b;", "", "<init>", "()V", "LGv/f;", "encoder", "value", "g", "(LGv/f;Lkotlin/Unit;)V", "LGv/e;", "decoder", "f", "(LGv/e;)V", "LFv/f;", "a", "()LFv/f;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@PublishedApi
/* loaded from: classes13.dex */
public final class H0 implements Dv.b<Unit> {

    /* renamed from: b, reason: collision with root package name */
    public static final H0 f13277b = new H0();

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ W<Unit> f13278a = new W<>("kotlin.Unit", Unit.f142422a);

    @Override // Dv.b, Dv.h, Dv.a
    /* renamed from: a */
    public Fv.f getDescriptor() {
        return this.f13278a.getDescriptor();
    }

    public void f(Gv.e decoder) {
        Intrinsics.j(decoder, "decoder");
        this.f13278a.d(decoder);
    }

    @Override // Dv.h
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void b(Gv.f encoder, Unit value) {
        Intrinsics.j(encoder, "encoder");
        Intrinsics.j(value, "value");
        this.f13278a.b(encoder, value);
    }

    private H0() {
    }

    @Override // Dv.a
    public /* bridge */ /* synthetic */ Object d(Gv.e eVar) {
        f(eVar);
        return Unit.f142422a;
    }
}
