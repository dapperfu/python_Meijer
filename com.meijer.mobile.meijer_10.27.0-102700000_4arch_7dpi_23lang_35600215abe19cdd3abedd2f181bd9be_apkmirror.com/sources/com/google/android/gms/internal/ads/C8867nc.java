package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.nc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8867nc {

    /* renamed from: e, reason: collision with root package name */
    public static final C8867nc f77098e = new C8867nc(null, new C7421a[0], 0, -9223372036854775807L, 0);

    /* renamed from: f, reason: collision with root package name */
    private static final C7421a f77099f = new C7421a(0).b(0);

    /* renamed from: d, reason: collision with root package name */
    private final C7421a[] f77103d;

    /* renamed from: b, reason: collision with root package name */
    public final long f77101b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f77100a = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f77102c = 0;

    private C8867nc(Object obj, C7421a[] c7421aArr, long j10, long j11, int i10) {
        this.f77103d = c7421aArr;
    }

    public final boolean b(int i10) {
        a(-1);
        int i11 = C7421a.f72320i;
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C8867nc.class == obj.getClass() && Arrays.equals(this.f77103d, ((C8867nc) obj).f77103d);
    }

    static {
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final C7421a a(int i10) {
        return i10 < 0 ? f77099f : this.f77103d[i10];
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.f77103d);
    }
}
