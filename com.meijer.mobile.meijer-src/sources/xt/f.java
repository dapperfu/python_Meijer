package xt;

import kt.k;
import ut.C17467a;

/* loaded from: classes12.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    private final e f171025a;

    /* renamed from: b, reason: collision with root package name */
    private final g f171026b;

    public f(e eVar, g gVar) {
        this.f171025a = eVar;
        this.f171026b = gVar;
    }

    @Override // xt.c
    public final float a(k kVar, C17467a c17467a) {
        kVar.a2();
        e eVar = this.f171025a;
        kVar.c2();
        return Math.abs(eVar.a(null, c17467a) - e.b(null));
    }

    public final float b(k kVar) {
        kVar.a2();
        kVar.c2();
        throw null;
    }

    public final boolean c(k kVar, C17467a c17467a) {
        kVar.a2();
        e eVar = this.f171025a;
        kVar.c2();
        if (eVar.a(null, c17467a) <= e.b(null)) {
            return true;
        }
        return false;
    }
}
