package com.google.android.gms.internal.ads;

import com.medallia.digital.mobilesdk.l8;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class I4 implements InterfaceC8924o4 {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f67541d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: e, reason: collision with root package name */
    private static final Pattern f67542e = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: a, reason: collision with root package name */
    private final StringBuilder f67543a = new StringBuilder();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f67544b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final GQ f67545c = new GQ();

    public static float b(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long c(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = strGroup != null ? Long.parseLong(strGroup) * l8.b.f92526c : 0L;
        String strGroup2 = matcher.group(i10 + 2);
        strGroup2.getClass();
        long j11 = j10 + (Long.parseLong(strGroup2) * l8.b.f92525b);
        String strGroup3 = matcher.group(i10 + 3);
        strGroup3.getClass();
        long j12 = j11 + (Long.parseLong(strGroup3) * 1000);
        String strGroup4 = matcher.group(i10 + 4);
        if (strGroup4 != null) {
            j12 += Long.parseLong(strGroup4);
        }
        return j12 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0199  */
    @Override // com.google.android.gms.internal.ads.InterfaceC8924o4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(byte[] r17, int r18, int r19, com.google.android.gms.internal.ads.C8817n4 r20, com.google.android.gms.internal.ads.ME r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.I4.a(byte[], int, int, com.google.android.gms.internal.ads.n4, com.google.android.gms.internal.ads.ME):void");
    }
}
