package com.google.zxing;

/* loaded from: classes7.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final int f90802a;

    /* renamed from: b, reason: collision with root package name */
    private final int f90803b;

    public int a() {
        return this.f90803b;
    }

    public int b() {
        return this.f90802a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f90802a == eVar.f90802a && this.f90803b == eVar.f90803b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f90802a * 32713) + this.f90803b;
    }

    public String toString() {
        return this.f90802a + "x" + this.f90803b;
    }
}
