package com.google.zxing;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final int f91641a;

    /* renamed from: b, reason: collision with root package name */
    private final int f91642b;

    public int a() {
        return this.f91642b;
    }

    public int b() {
        return this.f91641a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f91641a == eVar.f91641a && this.f91642b == eVar.f91642b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f91641a * 32713) + this.f91642b;
    }

    public String toString() {
        return this.f91641a + "x" + this.f91642b;
    }
}
