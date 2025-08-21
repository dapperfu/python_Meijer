package com.launchdarkly.sdk.internal.http;

import jh.C15034c;

/* loaded from: classes8.dex */
public abstract class HttpErrors {

    public static final class HttpErrorException extends Exception {
    }

    public static boolean c(int i10) {
        return i10 < 400 || i10 >= 500 || i10 == 400 || i10 == 408 || i10 == 429;
    }

    public static boolean a(C15034c c15034c, String str, String str2, int i10, String str3) {
        if (i10 <= 0 || c(i10)) {
            c15034c.q("Error {} ({}): {}", str2, str3, str);
            return true;
        }
        c15034c.g("Error {} (giving up permanently): {}", str2, str);
        return false;
    }

    public static String b(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("HTTP error ");
        sb2.append(i10);
        sb2.append((i10 == 401 || i10 == 403) ? " (invalid SDK key)" : "");
        return sb2.toString();
    }
}
