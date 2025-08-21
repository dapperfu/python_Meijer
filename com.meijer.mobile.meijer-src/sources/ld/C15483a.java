package ld;

/* renamed from: ld.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15483a {

    /* renamed from: a, reason: collision with root package name */
    private final int f149578a;

    /* renamed from: b, reason: collision with root package name */
    private final int f149579b;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C15483a) {
            C15483a c15483a = (C15483a) obj;
            if (this.f149578a == c15483a.f149578a && this.f149579b == c15483a.f149579b) {
                return true;
            }
        }
        return false;
    }

    public int a() {
        return this.f149579b;
    }

    public int b() {
        return this.f149578a;
    }

    public int hashCode() {
        int i10 = this.f149578a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f149579b;
    }

    public String toString() {
        return this.f149578a + "x" + this.f149579b;
    }

    public C15483a(int i10, int i11) {
        this.f149578a = i10;
        this.f149579b = i11;
    }
}
