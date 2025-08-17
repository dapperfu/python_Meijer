package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.b5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7539b5 {

    /* renamed from: a, reason: collision with root package name */
    public final String f72711a;

    /* renamed from: b, reason: collision with root package name */
    public final int f72712b;

    /* renamed from: c, reason: collision with root package name */
    public final String f72713c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f72714d;

    private C7539b5(String str, int i10, String str2, Set set) {
        this.f72712b = i10;
        this.f72711a = str;
        this.f72713c = str2;
        this.f72714d = set;
    }

    public static C7539b5 b() {
        return new C7539b5("", 0, "", Collections.EMPTY_SET);
    }

    public static C7539b5 a(String str, int i10) {
        String str2;
        String strTrim = str.trim();
        C8086gC.d(!strTrim.isEmpty());
        int iIndexOf = strTrim.indexOf(" ");
        if (iIndexOf == -1) {
            str2 = "";
        } else {
            String strTrim2 = strTrim.substring(iIndexOf).trim();
            strTrim = strTrim.substring(0, iIndexOf);
            str2 = strTrim2;
        }
        int i11 = OV.f69091a;
        String[] strArrSplit = strTrim.split("\\.", -1);
        String str3 = strArrSplit[0];
        HashSet hashSet = new HashSet();
        for (int i12 = 1; i12 < strArrSplit.length; i12++) {
            hashSet.add(strArrSplit[i12]);
        }
        return new C7539b5(str3, i10, str2, hashSet);
    }
}
