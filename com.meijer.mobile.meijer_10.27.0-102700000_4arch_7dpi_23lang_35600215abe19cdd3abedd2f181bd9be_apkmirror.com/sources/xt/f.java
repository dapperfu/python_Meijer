package xt;

import kt.k;
import ut.C17315a;

/* loaded from: classes11.dex */
public final class f implements c {

    /* renamed from: a, reason: collision with root package name */
    private final e f169933a;

    /* renamed from: b, reason: collision with root package name */
    private final g f169934b;

    public f(e eVar, g gVar) {
        this.f169933a = eVar;
        this.f169934b = gVar;
    }

    @Override // xt.c
    public final float a(k kVar, C17315a c17315a) {
        kVar.a2();
        e eVar = this.f169933a;
        kVar.d2();
        return Math.abs(eVar.a(null, c17315a) - e.b(null));
    }

    public final float b(k kVar) {
        kVar.a2();
        kVar.d2();
        throw null;
    }

    public final boolean c(k kVar, C17315a c17315a) {
        kVar.a2();
        e eVar = this.f169933a;
        kVar.d2();
        if (eVar.a(null, c17315a) <= e.b(null)) {
            return true;
        }
        return false;
    }
}
