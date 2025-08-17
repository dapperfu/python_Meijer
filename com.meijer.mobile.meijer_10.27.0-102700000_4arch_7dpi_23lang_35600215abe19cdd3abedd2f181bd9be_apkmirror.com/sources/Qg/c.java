package Qg;

import com.google.zxing.o;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f30031a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f30032b;

    /* renamed from: c, reason: collision with root package name */
    private final o[] f30033c;

    public o[] a() {
        return this.f30033c;
    }

    public int[] b() {
        return this.f30032b;
    }

    public int c() {
        return this.f30031a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && this.f30031a == ((c) obj).f30031a;
    }

    public int hashCode() {
        return this.f30031a;
    }

    public c(int i10, int[] iArr, int i11, int i12, int i13) {
        this.f30031a = i10;
        this.f30032b = iArr;
        float f10 = i11;
        float f11 = i13;
        this.f30033c = new o[]{new o(f10, f11), new o(i12, f11)};
    }
}
