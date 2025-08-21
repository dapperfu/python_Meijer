package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7546a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f73160i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f73161a;

    /* renamed from: b, reason: collision with root package name */
    public final int f73162b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public final Uri[] f73163c;

    /* renamed from: d, reason: collision with root package name */
    public final H7[] f73164d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f73165e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f73166f;

    /* renamed from: g, reason: collision with root package name */
    public final long f73167g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f73168h;

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

    public C7546a(long j10) {
        this(0L, -1, -1, new int[0], new H7[0], new long[0], 0L, false);
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f73165e;
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
        if (obj != null && C7546a.class == obj.getClass()) {
            C7546a c7546a = (C7546a) obj;
            if (this.f73162b == c7546a.f73162b && Arrays.equals(this.f73164d, c7546a.f73164d) && Arrays.equals(this.f73165e, c7546a.f73165e) && Arrays.equals(this.f73166f, c7546a.f73166f)) {
                return true;
            }
        }
        return false;
    }

    private C7546a(long j10, int i10, int i11, int[] iArr, H7[] h7Arr, long[] jArr, long j11, boolean z10) {
        Uri uri;
        int length = iArr.length;
        int length2 = h7Arr.length;
        int i12 = 0;
        C8211gC.d(length == length2);
        this.f73161a = 0L;
        this.f73162b = i10;
        this.f73165e = iArr;
        this.f73164d = h7Arr;
        this.f73166f = jArr;
        this.f73167g = 0L;
        this.f73168h = false;
        this.f73163c = new Uri[length2];
        while (true) {
            Uri[] uriArr = this.f73163c;
            if (i12 >= uriArr.length) {
                return;
            }
            H7 h72 = h7Arr[i12];
            if (h72 == null) {
                uri = null;
            } else {
                C8623k5 c8623k5 = h72.f68216b;
                c8623k5.getClass();
                uri = c8623k5.f76414a;
            }
            uriArr[i12] = uri;
            i12++;
        }
    }

    public final C7546a b(int i10) {
        int[] iArr = this.f73165e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.f73166f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new C7546a(0L, 0, -1, iArrCopyOf, (H7[]) Arrays.copyOf(this.f73164d, 0), jArrCopyOf, 0L, false);
    }

    public final int hashCode() {
        return ((((((((this.f73162b * 31) - 1) * 961) + Arrays.hashCode(this.f73164d)) * 31) + Arrays.hashCode(this.f73165e)) * 31) + Arrays.hashCode(this.f73166f)) * 961;
    }
}
