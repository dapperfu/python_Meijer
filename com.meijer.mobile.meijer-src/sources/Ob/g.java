package Ob;

import java.util.UUID;

/* loaded from: classes4.dex */
public abstract class g implements Pb.a {

    /* renamed from: e, reason: collision with root package name */
    private static s f23272e = new s();

    /* renamed from: a, reason: collision with root package name */
    private String f23273a;

    /* renamed from: b, reason: collision with root package name */
    private Long f23274b;

    /* renamed from: c, reason: collision with root package name */
    private k f23275c;

    /* renamed from: d, reason: collision with root package name */
    private Long f23276d;

    public g() {
        this.f23273a = c(getClass());
        this.f23274b = Long.valueOf(System.currentTimeMillis());
    }

    public Long d() {
        return this.f23274b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f23273a.equals(((g) obj).f23273a);
        }
        return false;
    }

    public String f() {
        return this.f23273a;
    }

    public k g() {
        return this.f23275c;
    }

    private String c(Class<?> cls) {
        return UUID.randomUUID().toString();
    }

    protected void a(f fVar) {
        if (g() == null) {
            this.f23275c = new k();
        }
        this.f23275c.a(fVar.u(), fVar.w());
    }

    public long b() {
        return System.currentTimeMillis() - d().longValue();
    }

    public long e() {
        k kVarG = g();
        if (kVarG == null) {
            return 0L;
        }
        if (kVarG.k()) {
            return kVarG.d().longValue();
        }
        return this.f23276d.longValue();
    }

    protected g(g gVar) {
        this.f23273a = gVar.f();
        this.f23274b = gVar.d();
        this.f23275c = new k(gVar.g());
        this.f23276d = Long.valueOf(gVar.e());
    }
}
