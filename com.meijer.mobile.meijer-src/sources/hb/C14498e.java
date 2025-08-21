package hb;

import Db.k;
import Ob.q;
import bb.C6345b;
import bb.C6346c;
import cb.C6499c;
import eb.C13784a;
import eb.C13785b;
import mb.C15701b;
import mb.C15702c;
import nb.C15928c;
import rb.C16880c;
import zb.C18466a;

/* renamed from: hb.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C14498e implements k {

    /* renamed from: p, reason: collision with root package name */
    private static final C13784a f135246p = C13785b.a(C14498e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final ab.d f135247a;

    /* renamed from: b, reason: collision with root package name */
    private final C6346c f135248b;

    /* renamed from: c, reason: collision with root package name */
    private final bb.e f135249c;

    /* renamed from: d, reason: collision with root package name */
    Bb.c f135250d;

    /* renamed from: e, reason: collision with root package name */
    private C18466a f135251e;

    /* renamed from: f, reason: collision with root package name */
    private q f135252f;

    /* renamed from: g, reason: collision with root package name */
    private C6499c f135253g;

    /* renamed from: h, reason: collision with root package name */
    private C16880c f135254h;

    /* renamed from: i, reason: collision with root package name */
    C15702c f135255i;

    /* renamed from: j, reason: collision with root package name */
    private C15701b f135256j;

    /* renamed from: k, reason: collision with root package name */
    Lb.a f135257k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f135258l;

    /* renamed from: m, reason: collision with root package name */
    C15928c f135259m;

    /* renamed from: n, reason: collision with root package name */
    Eb.c f135260n;

    /* renamed from: o, reason: collision with root package name */
    private Eb.b f135261o;

    @Override // Db.k
    public final void a(String str, Object obj) {
        if ("Registration_Properties".equals(str) && (obj instanceof Gb.e) && ((Gb.e) obj).k()) {
            b();
        }
    }

    final void b() {
        if (this.f135258l) {
            return;
        }
        this.f135258l = true;
        this.f135247a.c(this.f135250d);
        this.f135247a.c(this.f135251e);
        this.f135247a.c(this.f135259m);
        this.f135247a.c(this.f135252f);
        this.f135247a.c(this.f135260n);
        this.f135247a.c(this.f135261o);
        this.f135247a.c(this.f135255i);
        this.f135247a.c(this.f135256j);
        this.f135247a.c(this.f135257k);
        this.f135247a.c(this.f135253g);
        this.f135247a.c(this.f135254h);
    }

    public C14498e(C14499f c14499f, C14495b c14495b) {
        this.f135247a = c14495b.f135240w;
        C6346c c6346c = c14495b.f135223f;
        this.f135248b = c6346c;
        C6345b c6345b = c14495b.f135218a;
        this.f135249c = c6345b;
        this.f135250d = new Bb.c(c6346c, c6345b, c14499f.f135270f, c14499f.f135272h, c14495b.f135220c);
        this.f135251e = new C18466a(c6346c, c6345b, c14495b.f135220c, c14495b.f135226i, c14495b.f135224g);
        this.f135259m = new C15928c(c6346c, c6345b, c14499f.f135276l, c14499f.f135277m);
        this.f135252f = new q(c6346c, c6345b, c14495b.f135222e, c14499f.f135280p, c14495b.f135220c, c14495b.f135226i, c14495b.f135227j.a());
        this.f135253g = new C6499c(c14499f.f135281q, c14495b.f135222e, c14495b.f135220c, c6346c, c6345b, c14495b.f135226i, c14495b.f135227j.a());
        this.f135254h = new C16880c(c6346c, c6345b, c14495b.f135220c, c14495b.f135217N, c14495b.f135226i, c14495b.f135227j.a());
        this.f135260n = new Eb.c(c6346c, c6345b, c14499f.f135284t, c14499f.f135283s);
        this.f135261o = new Eb.b(c6346c, c6345b, c14499f.f135284t);
        c14495b.f135220c.h(this, "Registration_Properties");
        this.f135255i = new C15702c(c6346c, c6345b, c14499f.f135285u, c14495b.f135222e);
        this.f135256j = new C15701b(c6346c, c6345b, c14499f.f135285u);
        this.f135257k = new Lb.a(c6346c, c6345b, c14495b.f135206C, c14495b.f135220c, c14499f.f135285u);
    }
}
