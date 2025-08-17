package com.medallia.digital.mobilesdk;

/* loaded from: classes7.dex */
enum z2 {
    BANNER,
    ALERT,
    THANK_YOU_PROMPT,
    FORM;

    protected static z2 a(String str) {
        z2 z2Var = BANNER;
        if (z2Var.name().equals(str)) {
            return z2Var;
        }
        z2 z2Var2 = ALERT;
        if (z2Var2.name().equals(str)) {
            return z2Var2;
        }
        z2 z2Var3 = THANK_YOU_PROMPT;
        if (z2Var3.name().equals(str)) {
            return z2Var3;
        }
        z2 z2Var4 = FORM;
        if (z2Var4.name().equals(str)) {
            return z2Var4;
        }
        return null;
    }
}
