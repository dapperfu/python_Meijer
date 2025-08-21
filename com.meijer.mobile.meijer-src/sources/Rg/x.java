package Rg;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;

/* loaded from: classes8.dex */
final class x {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f32621c = {1, 1, 2};

    /* renamed from: a, reason: collision with root package name */
    private final v f32622a = new v();

    /* renamed from: b, reason: collision with root package name */
    private final w f32623b = new w();

    com.google.zxing.m a(int i10, Ig.a aVar, int i11) throws NotFoundException {
        int[] iArrN = y.n(aVar, i11, false, f32621c);
        try {
            return this.f32623b.b(i10, aVar, iArrN);
        } catch (ReaderException unused) {
            return this.f32622a.b(i10, aVar, iArrN);
        }
    }

    x() {
    }
}
