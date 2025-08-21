package kf;

import com.google.android.gms.common.api.a;

/* renamed from: kf.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C15122a {
    public static int a(long j10) {
        if (j10 > 2147483647L) {
            return a.e.API_PRIORITY_OTHER;
        }
        if (j10 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j10;
    }
}
