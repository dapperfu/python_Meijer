package t8;

import i8.C14695b;
import i8.l;
import i8.u;
import w8.C17850a;

/* renamed from: t8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17206b implements J8.c {

    /* renamed from: a, reason: collision with root package name */
    private final C17208d f162350a = new C17208d();

    /* renamed from: b, reason: collision with root package name */
    private final L8.b f162351b = new B8.d();

    @Override // J8.c
    public void a(p8.b bVar, J8.a aVar, boolean z10) {
        String strA;
        if (u.b()) {
            String strF = C17850a.h().f();
            if (strF == null) {
                strA = null;
            } else {
                strA = this.f162351b.a(strF);
            }
            C17207c c17207cA = this.f162350a.a(aVar, strA, p8.b.d(!z10, aVar.a().a().a()), C14695b.e().f137219c);
            l.k().b();
            l.t(c17207cA);
        }
    }
}
