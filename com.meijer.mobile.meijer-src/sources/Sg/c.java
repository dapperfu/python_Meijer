package Sg;

import com.google.zxing.o;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f34581a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f34582b;

    /* renamed from: c, reason: collision with root package name */
    private final o[] f34583c;

    public o[] a() {
        return this.f34583c;
    }

    public int[] b() {
        return this.f34582b;
    }

    public int c() {
        return this.f34581a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.f34581a == ((c) obj).f34581a;
    }

    public int hashCode() {
        return this.f34581a;
    }

    public c(int i10, int[] iArr, int i11, int i12, int i13) {
        this.f34581a = i10;
        this.f34582b = iArr;
        float f10 = i11;
        float f11 = i13;
        this.f34583c = new o[]{new o(f10, f11), new o(i12, f11)};
    }
}
