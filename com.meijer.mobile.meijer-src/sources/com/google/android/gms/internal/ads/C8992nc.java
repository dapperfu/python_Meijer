package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.nc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8992nc {

    /* renamed from: e, reason: collision with root package name */
    public static final C8992nc f77938e = new C8992nc(null, new C7546a[0], 0, -9223372036854775807L, 0);

    /* renamed from: f, reason: collision with root package name */
    private static final C7546a f77939f = new C7546a(0).b(0);

    /* renamed from: d, reason: collision with root package name */
    private final C7546a[] f77943d;

    /* renamed from: b, reason: collision with root package name */
    public final long f77941b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f77940a = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f77942c = 0;

    private C8992nc(Object obj, C7546a[] c7546aArr, long j10, long j11, int i10) {
        this.f77943d = c7546aArr;
    }

    public final boolean b(int i10) {
        a(-1);
        int i11 = C7546a.f73160i;
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C8992nc.class == obj.getClass() && Arrays.equals(this.f77943d, ((C8992nc) obj).f77943d);
    }

    static {
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final C7546a a(int i10) {
        return i10 < 0 ? f77939f : this.f77943d[i10];
    }

    public final String toString() {
        return "AdPlaybackState(adsId=" + ((Object) null) + ", adResumePositionUs=0, adGroups=[])";
    }

    public final int hashCode() {
        return (((int) (-9223372036854775807L)) * 961) + Arrays.hashCode(this.f77943d);
    }
}
