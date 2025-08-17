package Sg;

import com.google.zxing.FormatException;

/* loaded from: classes7.dex */
final class p extends q {

    /* renamed from: b, reason: collision with root package name */
    private final int f33629b;

    /* renamed from: c, reason: collision with root package name */
    private final int f33630c;

    int b() {
        return this.f33629b;
    }

    int c() {
        return this.f33630c;
    }

    boolean d() {
        return this.f33629b == 10;
    }

    boolean e() {
        return this.f33630c == 10;
    }

    p(int i10, int i11, int i12) throws FormatException {
        super(i10);
        if (i11 >= 0 && i11 <= 10 && i12 >= 0 && i12 <= 10) {
            this.f33629b = i11;
            this.f33630c = i12;
            return;
        }
        throw FormatException.a();
    }
}
