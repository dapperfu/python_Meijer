package tf;

import tf.AbstractC17252G;

/* renamed from: tf.C, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C17248C extends AbstractC17252G.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f162640a;

    /* renamed from: b, reason: collision with root package name */
    private final String f162641b;

    /* renamed from: c, reason: collision with root package name */
    private final String f162642c;

    /* renamed from: d, reason: collision with root package name */
    private final String f162643d;

    /* renamed from: e, reason: collision with root package name */
    private final int f162644e;

    /* renamed from: f, reason: collision with root package name */
    private final nf.f f162645f;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC17252G.a) {
            AbstractC17252G.a aVar = (AbstractC17252G.a) obj;
            if (this.f162640a.equals(aVar.a()) && this.f162641b.equals(aVar.f()) && this.f162642c.equals(aVar.g()) && this.f162643d.equals(aVar.e()) && this.f162644e == aVar.c() && this.f162645f.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // tf.AbstractC17252G.a
    public String a() {
        return this.f162640a;
    }

    @Override // tf.AbstractC17252G.a
    public int c() {
        return this.f162644e;
    }

    @Override // tf.AbstractC17252G.a
    public nf.f d() {
        return this.f162645f;
    }

    @Override // tf.AbstractC17252G.a
    public String e() {
        return this.f162643d;
    }

    @Override // tf.AbstractC17252G.a
    public String f() {
        return this.f162641b;
    }

    @Override // tf.AbstractC17252G.a
    public String g() {
        return this.f162642c;
    }

    public int hashCode() {
        return ((((((((((this.f162640a.hashCode() ^ 1000003) * 1000003) ^ this.f162641b.hashCode()) * 1000003) ^ this.f162642c.hashCode()) * 1000003) ^ this.f162643d.hashCode()) * 1000003) ^ this.f162644e) * 1000003) ^ this.f162645f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f162640a + ", versionCode=" + this.f162641b + ", versionName=" + this.f162642c + ", installUuid=" + this.f162643d + ", deliveryMechanism=" + this.f162644e + ", developmentPlatformProvider=" + this.f162645f + "}";
    }

    C17248C(String str, String str2, String str3, String str4, int i10, nf.f fVar) {
        if (str != null) {
            this.f162640a = str;
            if (str2 != null) {
                this.f162641b = str2;
                if (str3 != null) {
                    this.f162642c = str3;
                    if (str4 != null) {
                        this.f162643d = str4;
                        this.f162644e = i10;
                        if (fVar != null) {
                            this.f162645f = fVar;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }
}
