package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7421a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f72320i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f72321a;

    /* renamed from: b, reason: collision with root package name */
    public final int f72322b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public final Uri[] f72323c;

    /* renamed from: d, reason: collision with root package name */
    public final H7[] f72324d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f72325e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f72326f;

    /* renamed from: g, reason: collision with root package name */
    public final long f72327g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f72328h;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
    }

    public C7421a(long j10) {
        this(0L, -1, -1, new int[0], new H7[0], new long[0], 0L, false);
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f72325e;
            if (i12 >= iArr.length || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7421a.class == obj.getClass()) {
            C7421a c7421a = (C7421a) obj;
            if (this.f72322b == c7421a.f72322b && Arrays.equals(this.f72324d, c7421a.f72324d) && Arrays.equals(this.f72325e, c7421a.f72325e) && Arrays.equals(this.f72326f, c7421a.f72326f)) {
                return true;
            }
        }
        return false;
    }

    private C7421a(long j10, int i10, int i11, int[] iArr, H7[] h7Arr, long[] jArr, long j11, boolean z10) {
        Uri uri;
        int length = iArr.length;
        int length2 = h7Arr.length;
        int i12 = 0;
        C8086gC.d(length == length2);
        this.f72321a = 0L;
        this.f72322b = i10;
        this.f72325e = iArr;
        this.f72324d = h7Arr;
        this.f72326f = jArr;
        this.f72327g = 0L;
        this.f72328h = false;
        this.f72323c = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.f72323c;
            if (i12 >= uriArr.length) {
                return;
            }
            H7 h72 = h7Arr[i12];
            if (h72 == null) {
                uri = null;
            } else {
                C8498k5 c8498k5 = h72.f67376b;
                c8498k5.getClass();
                uri = c8498k5.f75574a;
            }
            uriArr[i12] = uri;
            i12++;
        }
    }

    public final C7421a b(int i10) {
        int[] iArr = this.f72325e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.f72326f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new C7421a(0L, 0, -1, iArrCopyOf, (H7[]) Arrays.copyOf(this.f72324d, 0), jArrCopyOf, 0L, false);
    }

    public final int hashCode() {
        return ((((((((this.f72322b * 31) - 1) * 961) + Arrays.hashCode(this.f72324d)) * 31) + Arrays.hashCode(this.f72325e)) * 31) + Arrays.hashCode(this.f72326f)) * 961;
    }
}
