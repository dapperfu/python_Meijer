package fsimpl;

import android.graphics.Color;

/* loaded from: classes14.dex */
public class fA {
    public static int a(long j10) {
        return Color.argb(Color.alpha(j10), Color.red(j10), Color.green(j10), Color.blue(j10));
    }

    public static int[] a(long[] jArr) {
        int length = jArr != null ? jArr.length : 0;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = a(jArr[i10]);
        }
        return iArr;
    }
}
