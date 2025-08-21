package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import java.util.Locale;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
/* renamed from: com.google.android.gms.internal.ads.iD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8427iD {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f75754a = {0, 0, 0, 1};

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f75755b = {"", "A", "B", "C"};

    /* renamed from: c, reason: collision with root package name */
    private static final Pattern f75756c = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f75757d = 0;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair b(java.lang.String r10, java.lang.String[] r11, com.google.android.gms.internal.ads.Vz0 r12) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8427iD.b(java.lang.String, java.lang.String[], com.google.android.gms.internal.ads.Vz0):android.util.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:136:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair a(com.google.android.gms.internal.ads.C r23) {
        /*
            Method dump skipped, instructions count: 1728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8427iD.a(com.google.android.gms.internal.ads.C):android.util.Pair");
    }

    public static String d(int i10, boolean z10, int i11, int i12, int[] iArr, int i13) {
        int i14;
        StringBuilder sb2 = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", f75755b[i10], Integer.valueOf(i11), Integer.valueOf(i12), Character.valueOf(true != z10 ? 'L' : 'H'), Integer.valueOf(i13)));
        int i15 = 6;
        while (true) {
            if (i15 <= 0) {
                break;
            }
            int i16 = i15 - 1;
            if (iArr[i16] != 0) {
                break;
            }
            i15 = i16;
        }
        for (i14 = 0; i14 < i15; i14++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i14])));
        }
        return sb2.toString();
    }

    public static byte[] e(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11 + 4];
        System.arraycopy(f75754a, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i10, bArr2, 4, i11);
        return bArr2;
    }

    public static String c(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }
}
