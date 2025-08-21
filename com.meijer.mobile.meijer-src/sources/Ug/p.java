package Ug;

import com.google.zxing.FormatException;

/* loaded from: classes8.dex */
final class p extends q {

    /* renamed from: b, reason: collision with root package name */
    private final int f37505b;

    /* renamed from: c, reason: collision with root package name */
    private final int f37506c;

    int b() {
        return this.f37505b;
    }

    int c() {
        return this.f37506c;
    }

    boolean d() {
        return this.f37505b == 10;
    }

    boolean e() {
        return this.f37506c == 10;
    }

    p(int i10, int i11, int i12) throws FormatException {
        super(i10);
        if (i11 >= 0 && i11 <= 10 && i12 >= 0 && i12 <= 10) {
            this.f37505b = i11;
            this.f37506c = i12;
            return;
        }
        throw FormatException.a();
    }
}
