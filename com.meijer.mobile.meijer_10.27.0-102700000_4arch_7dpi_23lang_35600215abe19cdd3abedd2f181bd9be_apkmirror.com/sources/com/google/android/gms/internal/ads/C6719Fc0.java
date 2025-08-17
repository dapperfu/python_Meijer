package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: com.google.android.gms.internal.ads.Fc0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6719Fc0 {
    public static boolean a(int i10) {
        int i11 = i10 - 1;
        return i11 == 2 || i11 == 4 || i11 == 5 || i11 == 6 || i11 == 7;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int b(android.content.Context r14, com.google.android.gms.internal.ads.C7694cc0 r15) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6719Fc0.b(android.content.Context, com.google.android.gms.internal.ads.cc0):int");
    }

    private static final String c(Context context, C7694cc0 c7694cc0) {
        HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
        String strA = EnumC7234Uf0.OS_ARCH.a();
        if (!TextUtils.isEmpty(strA) && hashSet.contains(strA)) {
            return strA;
        }
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null && strArr.length > 0) {
                return strArr[0];
            }
        } catch (IllegalAccessException e10) {
            c7694cc0.c(2024, 0L, e10);
        } catch (NoSuchFieldException e11) {
            c7694cc0.c(2024, 0L, e11);
        }
        String str = Build.CPU_ABI;
        return str != null ? str : Build.CPU_ABI2;
    }

    private static final void d(byte[] bArr, String str, Context context, C7694cc0 c7694cc0) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("os.arch:");
        sb2.append(EnumC7234Uf0.OS_ARCH.a());
        sb2.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb2.append("supported_abis:");
                sb2.append(Arrays.toString(strArr));
                sb2.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb2.append("CPU_ABI:");
        sb2.append(Build.CPU_ABI);
        sb2.append(";CPU_ABI2:");
        sb2.append(Build.CPU_ABI2);
        sb2.append(";");
        if (bArr != null) {
            sb2.append("ELF:");
            sb2.append(Arrays.toString(bArr));
            sb2.append(";");
        }
        if (str != null) {
            sb2.append("dbg:");
            sb2.append(str);
            sb2.append(";");
        }
        c7694cc0.b(4007, sb2.toString());
    }
}
