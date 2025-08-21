package zt;

import eb.C13784a;
import eb.C13785b;
import kt.C15422h;
import ut.C17476j;
import ut.C17478l;

/* loaded from: classes12.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    private static final C13784a f173242b = C13785b.a(h.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final qt.d f173243a;

    public h(qt.d dVar) {
        this.f173243a = dVar;
    }

    public final void a(C17476j c17476j) {
        String.format("Location Event : %s", c17476j.toString());
        kt.k kVar = c17476j.f164588a;
        if (kVar instanceof C15422h) {
            C15422h c15422h = (C15422h) kVar;
            C17478l c17478l = new C17478l();
            c17478l.f164593a = c15422h.a();
            c17478l.f164595c = c17476j.f164589b;
            c17478l.f164594b = c15422h;
            c17478l.f164596d = c17476j.f164590c;
            c17478l.f164597e = c17476j.f164591d;
            c17478l.f164598f = c17476j.f164592e;
            this.f173243a.b(c17478l);
        }
    }
}
