package r8;

import g8.C14219b;
import g8.l;
import g8.u;
import u8.C17233a;

/* renamed from: r8.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16732b implements H8.c {

    /* renamed from: a, reason: collision with root package name */
    private final C16734d f157860a = new C16734d();

    /* renamed from: b, reason: collision with root package name */
    private final J8.b f157861b = new z8.d();

    @Override // H8.c
    public void a(n8.b bVar, H8.a aVar, boolean z10) {
        String strA;
        if (u.b()) {
            String strF = C17233a.h().f();
            if (strF == null) {
                strA = null;
            } else {
                strA = this.f157861b.a(strF);
            }
            C16733c c16733cA = this.f157860a.a(aVar, strA, n8.b.d(!z10, aVar.a().a().a()), C14219b.e().f133003c);
            l.k().b();
            l.t(c16733cA);
        }
    }
}
