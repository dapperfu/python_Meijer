package com.medallia.digital.mobilesdk;

import android.os.Build;
import android.text.TextUtils;
import com.medallia.digital.mobilesdk.s0;

/* loaded from: classes8.dex */
class n1 extends y5<String> {
    protected n1(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (char c10 : charArray) {
            if (z10 && Character.isLetter(c10)) {
                sb2.append(Character.toUpperCase(c10));
                z10 = false;
            } else {
                if (Character.isWhitespace(c10)) {
                    z10 = true;
                }
                sb2.append(c10);
            }
        }
        return sb2.toString();
    }

    private String s() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str2.startsWith(str)) {
            return a(str2);
        }
        return a(str) + " " + str2;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    protected CollectorContract c() {
        return s0.a.f93770b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public String j() {
        String strS = s();
        a4.b(String.format("Collectors > Model: %s", strS));
        return strS;
    }
}
