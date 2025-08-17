package com.google.android.gms.internal.ads;

import android.graphics.Color;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes6.dex */
final class H4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f67337a;

    /* renamed from: b, reason: collision with root package name */
    public final int f67338b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f67339c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f67340d;

    /* renamed from: e, reason: collision with root package name */
    public final float f67341e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f67342f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f67343g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f67344h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f67345i;

    /* renamed from: j, reason: collision with root package name */
    public final int f67346j;

    private H4(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f67337a = str;
        this.f67338b = i10;
        this.f67339c = num;
        this.f67340d = num2;
        this.f67341e = f10;
        this.f67342f = z10;
        this.f67343g = z11;
        this.f67344h = z12;
        this.f67345i = z13;
        this.f67346j = i11;
    }

    private static boolean e(String str) throws NumberFormatException {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            C9917xL.g("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    public static H4 b(String str, F4 f42) throws NumberFormatException {
        H4 h42;
        boolean z10;
        int i10;
        C8086gC.d(str.startsWith("Style:"));
        String[] strArrSplit = TextUtils.split(str.substring(6), ",");
        int length = strArrSplit.length;
        int i11 = f42.f66713k;
        if (length != i11) {
            C9917xL.f("SsaStyle", String.format(Locale.US, "Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i11), Integer.valueOf(length), str));
            return null;
        }
        try {
            String strTrim = strArrSplit[f42.f66703a].trim();
            int i12 = f42.f66704b;
            int iD = i12 != -1 ? d(strArrSplit[i12].trim()) : -1;
            int i13 = f42.f66705c;
            Integer numC = i13 != -1 ? c(strArrSplit[i13].trim()) : null;
            int i14 = f42.f66706d;
            Integer numC2 = i14 != -1 ? c(strArrSplit[i14].trim()) : null;
            int i15 = f42.f66707e;
            float f10 = -3.4028235E38f;
            if (i15 != -1) {
                String strTrim2 = strArrSplit[i15].trim();
                try {
                    f10 = Float.parseFloat(strTrim2);
                    h42 = null;
                } catch (NumberFormatException e10) {
                    StringBuilder sb2 = new StringBuilder();
                    h42 = null;
                    try {
                        sb2.append("Failed to parse font size: '");
                        sb2.append(strTrim2);
                        sb2.append("'");
                        C9917xL.g("SsaStyle", sb2.toString(), e10);
                    } catch (RuntimeException e11) {
                        e = e11;
                        C9917xL.g("SsaStyle", "Skipping malformed 'Style:' line: '" + str + "'", e);
                        return h42;
                    }
                }
            } else {
                h42 = null;
            }
            int i16 = f42.f66708f;
            boolean z11 = false;
            if (i16 == -1 || !e(strArrSplit[i16].trim())) {
                z10 = false;
            } else {
                z10 = false;
                z11 = true;
            }
            int i17 = f42.f66709g;
            boolean z12 = (i17 == -1 || !e(strArrSplit[i17].trim())) ? z10 : true;
            int i18 = f42.f66710h;
            boolean z13 = i18 != -1 && e(strArrSplit[i18].trim());
            int i19 = f42.f66711i;
            boolean z14 = i19 != -1 && e(strArrSplit[i19].trim());
            int i20 = f42.f66712j;
            if (i20 != -1) {
                String strTrim3 = strArrSplit[i20].trim();
                try {
                    int i21 = Integer.parseInt(strTrim3.trim());
                    if (i21 == 1 || i21 == 3) {
                        i10 = i21;
                    }
                } catch (NumberFormatException unused) {
                }
                C9917xL.f("SsaStyle", "Ignoring unknown BorderStyle: ".concat(String.valueOf(strTrim3)));
                i10 = -1;
            } else {
                i10 = -1;
            }
            return new H4(strTrim, iD, numC, numC2, f10, z11, z12, z13, z14, i10);
        } catch (RuntimeException e12) {
            e = e12;
            h42 = null;
        }
    }

    public static Integer c(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            C8086gC.d(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(Ii0.b(((j10 >> 24) & 255) ^ 255), Ii0.b(j10 & 255), Ii0.b((j10 >> 8) & 255), Ii0.b((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            C9917xL.g("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(String str) throws NumberFormatException {
        int i10;
        try {
            i10 = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return i10;
            default:
                C9917xL.f("SsaStyle", "Ignoring unknown alignment: ".concat(String.valueOf(str)));
                return -1;
        }
    }
}
