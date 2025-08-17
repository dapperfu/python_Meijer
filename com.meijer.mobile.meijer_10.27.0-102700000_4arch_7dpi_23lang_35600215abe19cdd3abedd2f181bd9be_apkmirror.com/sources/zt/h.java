package zt;

import cb.C6380a;
import cb.C6381b;
import kt.C15319h;
import ut.C17324j;
import ut.C17326l;

/* loaded from: classes12.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    private static final C6380a f173281b = C6381b.a(h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final qt.d f173282a;

    public h(qt.d dVar) {
        this.f173282a = dVar;
    }

    public final void a(C17324j c17324j) {
        String.format("Location Event : %s", c17324j.toString());
        kt.k kVar = c17324j.f163510a;
        if (kVar instanceof C15319h) {
            C15319h c15319h = (C15319h) kVar;
            C17326l c17326l = new C17326l();
            c17326l.f163515a = c15319h.a();
            c17326l.f163517c = c17324j.f163511b;
            c17326l.f163516b = c15319h;
            c17326l.f163518d = c17324j.f163512c;
            c17326l.f163519e = c17324j.f163513d;
            c17326l.f163520f = c17324j.f163514e;
            this.f173282a.b(c17326l);
        }
    }
}
