package Pg;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;

/* loaded from: classes7.dex */
final class x {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f25407c = {1, 1, 2};

    /* renamed from: a, reason: collision with root package name */
    private final v f25408a = new v();

    /* renamed from: b, reason: collision with root package name */
    private final w f25409b = new w();

    com.google.zxing.m a(int i10, Gg.a aVar, int i11) throws NotFoundException {
        int[] iArrN = y.n(aVar, i11, false, f25407c);
        try {
            return this.f25409b.b(i10, aVar, iArrN);
        } catch (ReaderException unused) {
            return this.f25408a.b(i10, aVar, iArrN);
        }
    }

    x() {
    }
}
