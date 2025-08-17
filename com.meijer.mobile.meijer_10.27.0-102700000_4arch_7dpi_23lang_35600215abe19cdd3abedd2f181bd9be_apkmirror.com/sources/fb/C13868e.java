package fb;

import Bb.k;
import Mb.q;
import ab.C5593c;
import cb.C6380a;
import cb.C6381b;
import kb.C15130b;
import kb.C15131c;
import lb.C15394c;
import pb.C16276c;
import xb.C18029a;
import zb.C18415c;

/* renamed from: fb.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C13868e implements k {

    /* renamed from: p, reason: collision with root package name */
    private static final C6380a f130900p = C6381b.a(C13868e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Ya.d f130901a;

    /* renamed from: b, reason: collision with root package name */
    private final Za.c f130902b;

    /* renamed from: c, reason: collision with root package name */
    private final Za.e f130903c;

    /* renamed from: d, reason: collision with root package name */
    C18415c f130904d;

    /* renamed from: e, reason: collision with root package name */
    private C18029a f130905e;

    /* renamed from: f, reason: collision with root package name */
    private q f130906f;

    /* renamed from: g, reason: collision with root package name */
    private C5593c f130907g;

    /* renamed from: h, reason: collision with root package name */
    private C16276c f130908h;

    /* renamed from: i, reason: collision with root package name */
    C15131c f130909i;

    /* renamed from: j, reason: collision with root package name */
    private C15130b f130910j;

    /* renamed from: k, reason: collision with root package name */
    Jb.a f130911k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f130912l;

    /* renamed from: m, reason: collision with root package name */
    C15394c f130913m;

    /* renamed from: n, reason: collision with root package name */
    Cb.c f130914n;

    /* renamed from: o, reason: collision with root package name */
    private Cb.b f130915o;

    @Override // Bb.k
    public final void a(String str, Object obj) {
        if ("Registration_Properties".equals(str) && (obj instanceof Eb.e) && ((Eb.e) obj).k()) {
            b();
        }
    }

    final void b() {
        if (this.f130912l) {
            return;
        }
        this.f130912l = true;
        this.f130901a.c(this.f130904d);
        this.f130901a.c(this.f130905e);
        this.f130901a.c(this.f130913m);
        this.f130901a.c(this.f130906f);
        this.f130901a.c(this.f130914n);
        this.f130901a.c(this.f130915o);
        this.f130901a.c(this.f130909i);
        this.f130901a.c(this.f130910j);
        this.f130901a.c(this.f130911k);
        this.f130901a.c(this.f130907g);
        this.f130901a.c(this.f130908h);
    }

    public C13868e(C13869f c13869f, C13865b c13865b) {
        this.f130901a = c13865b.f130894w;
        Za.c cVar = c13865b.f130877f;
        this.f130902b = cVar;
        Za.b bVar = c13865b.f130872a;
        this.f130903c = bVar;
        this.f130904d = new C18415c(cVar, bVar, c13869f.f130924f, c13869f.f130926h, c13865b.f130874c);
        this.f130905e = new C18029a(cVar, bVar, c13865b.f130874c, c13865b.f130880i, c13865b.f130878g);
        this.f130913m = new C15394c(cVar, bVar, c13869f.f130930l, c13869f.f130931m);
        this.f130906f = new q(cVar, bVar, c13865b.f130876e, c13869f.f130934p, c13865b.f130874c, c13865b.f130880i, c13865b.f130881j.a());
        this.f130907g = new C5593c(c13869f.f130935q, c13865b.f130876e, c13865b.f130874c, cVar, bVar, c13865b.f130880i, c13865b.f130881j.a());
        this.f130908h = new C16276c(cVar, bVar, c13865b.f130874c, c13865b.f130871N, c13865b.f130880i, c13865b.f130881j.a());
        this.f130914n = new Cb.c(cVar, bVar, c13869f.f130938t, c13869f.f130937s);
        this.f130915o = new Cb.b(cVar, bVar, c13869f.f130938t);
        c13865b.f130874c.h(this, "Registration_Properties");
        this.f130909i = new C15131c(cVar, bVar, c13869f.f130939u, c13865b.f130876e);
        this.f130910j = new C15130b(cVar, bVar, c13869f.f130939u);
        this.f130911k = new Jb.a(cVar, bVar, c13865b.f130860C, c13865b.f130874c, c13869f.f130939u);
    }
}
