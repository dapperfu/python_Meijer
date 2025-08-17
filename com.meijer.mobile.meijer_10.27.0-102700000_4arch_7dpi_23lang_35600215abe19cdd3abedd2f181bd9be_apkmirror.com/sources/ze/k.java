package ze;

import ze.AbstractC18449d;

/* loaded from: classes5.dex */
final class k extends AbstractC18449d.a {

    /* renamed from: a, reason: collision with root package name */
    private int f171817a;

    /* renamed from: b, reason: collision with root package name */
    private int f171818b;

    /* renamed from: c, reason: collision with root package name */
    private String f171819c;

    /* renamed from: d, reason: collision with root package name */
    private String f171820d;

    /* renamed from: e, reason: collision with root package name */
    private String f171821e;

    /* renamed from: f, reason: collision with root package name */
    private byte f171822f;

    @Override // ze.AbstractC18449d.a
    public final AbstractC18449d a() {
        if (this.f171822f == 3) {
            return new n(this.f171817a, this.f171818b, this.f171819c, this.f171820d, this.f171821e);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f171822f & 1) == 0) {
            sb2.append(" width");
        }
        if ((this.f171822f & 2) == 0) {
            sb2.append(" height");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // ze.AbstractC18449d.a
    public final AbstractC18449d.a b(String str) {
        this.f171819c = str;
        return this;
    }

    @Override // ze.AbstractC18449d.a
    public final AbstractC18449d.a c(String str) {
        this.f171820d = str;
        return this;
    }

    @Override // ze.AbstractC18449d.a
    public final AbstractC18449d.a d(int i10) {
        this.f171818b = i10;
        this.f171822f = (byte) (this.f171822f | 2);
        return this;
    }

    @Override // ze.AbstractC18449d.a
    public final AbstractC18449d.a e(String str) {
        this.f171821e = str;
        return this;
    }

    @Override // ze.AbstractC18449d.a
    public final AbstractC18449d.a f(int i10) {
        this.f171817a = i10;
        this.f171822f = (byte) (this.f171822f | 1);
        return this;
    }

    k() {
    }
}
