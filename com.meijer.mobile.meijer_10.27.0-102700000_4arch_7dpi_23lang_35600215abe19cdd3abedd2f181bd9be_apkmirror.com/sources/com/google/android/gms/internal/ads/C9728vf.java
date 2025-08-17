package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.vf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9728vf extends AbstractC9835wf {
    C9728vf() {
    }

    private static final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < str.length() && str.charAt(i11) == ',') {
            i11++;
        }
        while (length > 0) {
            int i12 = length - 1;
            if (str.charAt(i12) != ',') {
                break;
            }
            length = i12;
        }
        if (length < i11) {
            return null;
        }
        if (i11 == 0) {
            if (length == str.length()) {
                return str;
            }
        } else {
            i10 = i11;
        }
        return str.substring(i10, length);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC9835wf
    public final String a(String str, String str2) {
        String strB = b(str);
        String strB2 = b(str2);
        if (TextUtils.isEmpty(strB)) {
            return strB2;
        }
        if (TextUtils.isEmpty(strB2)) {
            return strB;
        }
        return strB + "," + strB2;
    }
}
