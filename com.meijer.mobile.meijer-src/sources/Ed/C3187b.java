package Ed;

import com.google.android.gms.common.api.a;

/* renamed from: Ed.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C3187b {
    static int a(int i10, int i11) {
        if (i11 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int i12 = i10 + (i10 >> 1) + 1;
        if (i12 < i11) {
            int iHighestOneBit = Integer.highestOneBit(i11 - 1);
            i12 = iHighestOneBit + iHighestOneBit;
        }
        return i12 < 0 ? a.e.API_PRIORITY_OTHER : i12;
    }
}
