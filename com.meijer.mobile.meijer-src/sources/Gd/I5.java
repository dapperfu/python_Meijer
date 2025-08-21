package Gd;

import android.os.SystemClock;

/* loaded from: classes6.dex */
public final class I5 {
    public static void a(C3782x5 c3782x5, int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        c3782x5.c(b(i10, i11, j10, i12, i13, i14, i15), F3.INPUT_IMAGE_CONSTRUCTION);
    }

    private static H5 b(int i10, int i11, long j10, int i12, int i13, int i14, int i15) {
        return new H5(i10, i11, i14, i12, i13, SystemClock.elapsedRealtime() - j10, i15);
    }
}
