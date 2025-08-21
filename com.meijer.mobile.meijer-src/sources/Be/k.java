package Be;

import Be.d;

/* loaded from: classes4.dex */
final class k extends d.a {

    /* renamed from: a, reason: collision with root package name */
    private int f2731a;

    /* renamed from: b, reason: collision with root package name */
    private int f2732b;

    /* renamed from: c, reason: collision with root package name */
    private String f2733c;

    /* renamed from: d, reason: collision with root package name */
    private String f2734d;

    /* renamed from: e, reason: collision with root package name */
    private String f2735e;

    /* renamed from: f, reason: collision with root package name */
    private byte f2736f;

    @Override // Be.d.a
    public final d a() {
        if (this.f2736f == 3) {
            return new n(this.f2731a, this.f2732b, this.f2733c, this.f2734d, this.f2735e);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f2736f & 1) == 0) {
            sb2.append(" width");
        }
        if ((this.f2736f & 2) == 0) {
            sb2.append(" height");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // Be.d.a
    public final d.a b(String str) {
        this.f2733c = str;
        return this;
    }

    @Override // Be.d.a
    public final d.a c(String str) {
        this.f2734d = str;
        return this;
    }

    @Override // Be.d.a
    public final d.a d(int i10) {
        this.f2732b = i10;
        this.f2736f = (byte) (this.f2736f | 2);
        return this;
    }

    @Override // Be.d.a
    public final d.a e(String str) {
        this.f2735e = str;
        return this;
    }

    @Override // Be.d.a
    public final d.a f(int i10) {
        this.f2731a = i10;
        this.f2736f = (byte) (this.f2736f | 1);
        return this;
    }

    k() {
    }
}
