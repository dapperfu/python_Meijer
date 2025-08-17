package Mb;

import java.util.UUID;

/* loaded from: classes4.dex */
public abstract class g implements Nb.a {

    /* renamed from: e, reason: collision with root package name */
    private static s f19085e = new s();

    /* renamed from: a, reason: collision with root package name */
    private String f19086a;

    /* renamed from: b, reason: collision with root package name */
    private Long f19087b;

    /* renamed from: c, reason: collision with root package name */
    private k f19088c;

    /* renamed from: d, reason: collision with root package name */
    private Long f19089d;

    public g() {
        this.f19086a = c(getClass());
        this.f19087b = Long.valueOf(System.currentTimeMillis());
    }

    public Long d() {
        return this.f19087b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f19086a.equals(((g) obj).f19086a);
        }
        return false;
    }

    public String f() {
        return this.f19086a;
    }

    public k g() {
        return this.f19088c;
    }

    private String c(Class<?> cls) {
        return UUID.randomUUID().toString();
    }

    protected void a(f fVar) {
        if (g() == null) {
            this.f19088c = new k();
        }
        this.f19088c.a(fVar.u(), fVar.w());
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
        return this.f19089d.longValue();
    }

    protected g(g gVar) {
        this.f19086a = gVar.f();
        this.f19087b = gVar.d();
        this.f19088c = new k(gVar.g());
        this.f19089d = Long.valueOf(gVar.e());
    }
}
