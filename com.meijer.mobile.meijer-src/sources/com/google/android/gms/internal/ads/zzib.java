package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class zzib extends zzbd {

    /* renamed from: c, reason: collision with root package name */
    public final int f81547c;

    /* renamed from: d, reason: collision with root package name */
    public final String f81548d;

    /* renamed from: e, reason: collision with root package name */
    public final int f81549e;

    /* renamed from: f, reason: collision with root package name */
    public final C f81550f;

    /* renamed from: g, reason: collision with root package name */
    public final int f81551g;

    /* renamed from: h, reason: collision with root package name */
    public final C7578aF0 f81552h;

    /* renamed from: i, reason: collision with root package name */
    final boolean f81553i;

    private zzib(int i10, Throwable th2, int i11) {
        this(i10, th2, null, i11, null, -1, null, 4, false);
    }

    static {
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private zzib(int i10, Throwable th2, String str, int i11, String str2, int i12, C c10, int i13, boolean z10) {
        String str3;
        int i14;
        String string;
        String str4;
        if (i10 == 0) {
            str3 = str2;
            i14 = i12;
            string = "Source error";
        } else if (i10 != 1) {
            string = "Unexpected runtime error";
            str3 = str2;
            i14 = i12;
        } else {
            String strValueOf = String.valueOf(c10);
            int i15 = OV.f69931a;
            if (i13 == 0) {
                str4 = "NO";
            } else if (i13 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i13 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i13 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i13 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            StringBuilder sb2 = new StringBuilder();
            str3 = str2;
            sb2.append(str3);
            sb2.append(" error, index=");
            i14 = i12;
            sb2.append(i14);
            sb2.append(", format=");
            sb2.append(strValueOf);
            sb2.append(", format_supported=");
            sb2.append(str4);
            string = sb2.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), th2, i11, i10, str3, i14, c10, i13, null, SystemClock.elapsedRealtime(), z10);
    }

    public static zzib b(Throwable th2, String str, int i10, C c10, int i11, boolean z10, int i12) {
        if (c10 == null) {
            i11 = 4;
        }
        return new zzib(1, th2, null, i12, str, i10, c10, i11, z10);
    }

    public static zzib c(IOException iOException, int i10) {
        return new zzib(0, iOException, i10);
    }

    public static zzib d(RuntimeException runtimeException, int i10) {
        return new zzib(2, runtimeException, i10);
    }

    final zzib a(C7578aF0 c7578aF0) {
        String message = getMessage();
        int i10 = OV.f69931a;
        return new zzib(message, getCause(), this.f81415a, this.f81547c, this.f81548d, this.f81549e, this.f81550f, this.f81551g, c7578aF0, this.f81416b, this.f81553i);
    }

    private zzib(String str, Throwable th2, int i10, int i11, String str2, int i12, C c10, int i13, C7578aF0 c7578aF0, long j10, boolean z10) {
        boolean z11;
        super(str, th2, i10, Bundle.EMPTY, j10);
        if (!z10) {
            z11 = true;
        } else if (i11 == 1) {
            i11 = 1;
            z11 = true;
        } else {
            z11 = false;
        }
        C8211gC.d(z11);
        C8211gC.d(th2 != null);
        this.f81547c = i11;
        this.f81548d = str2;
        this.f81549e = i12;
        this.f81550f = c10;
        this.f81551g = i13;
        this.f81552h = c7578aF0;
        this.f81553i = z10;
    }
}
