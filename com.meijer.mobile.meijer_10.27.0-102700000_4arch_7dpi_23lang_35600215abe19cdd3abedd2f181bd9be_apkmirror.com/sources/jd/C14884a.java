package jd;

/* renamed from: jd.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14884a {

    /* renamed from: a, reason: collision with root package name */
    private final int f139564a;

    /* renamed from: b, reason: collision with root package name */
    private final int f139565b;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C14884a) {
            C14884a c14884a = (C14884a) obj;
            if (this.f139564a == c14884a.f139564a && this.f139565b == c14884a.f139565b) {
                return true;
            }
        }
        return false;
    }

    public int a() {
        return this.f139565b;
    }

    public int b() {
        return this.f139564a;
    }

    public int hashCode() {
        int i10 = this.f139564a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f139565b;
    }

    public String toString() {
        return this.f139564a + "x" + this.f139565b;
    }

    public C14884a(int i10, int i11) {
        this.f139564a = i10;
        this.f139565b = i11;
    }
}
