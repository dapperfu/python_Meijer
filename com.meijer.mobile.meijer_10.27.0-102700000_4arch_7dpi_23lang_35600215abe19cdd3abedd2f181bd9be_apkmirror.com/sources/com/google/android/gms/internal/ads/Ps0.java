package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class Ps0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f69431a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f69432b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long a(String str, String str2) throws NumberFormatException {
        long j10 = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j10 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                C9917xL.c("HttpUtil", "Unexpected Content-Length [" + str + "]");
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            Matcher matcher = f69431a.matcher(str2);
            if (matcher.matches()) {
                try {
                    String strGroup = matcher.group(2);
                    if (strGroup != null) {
                        long j11 = Long.parseLong(strGroup);
                        String strGroup2 = matcher.group(1);
                        if (strGroup2 != null) {
                            long j12 = (j11 - Long.parseLong(strGroup2)) + 1;
                            if (j10 < 0) {
                                return j12;
                            }
                            if (j10 != j12) {
                                C9917xL.f("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + "]");
                                return Math.max(j10, j12);
                            }
                            return j10;
                        }
                        throw null;
                    }
                    throw null;
                } catch (NumberFormatException unused2) {
                    C9917xL.c("HttpUtil", "Unexpected Content-Range [" + str2 + "]");
                    return j10;
                }
            }
            return j10;
        }
        return j10;
    }

    public static long b(String str) {
        if (!TextUtils.isEmpty(str)) {
            Matcher matcher = f69432b.matcher(str);
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                strGroup.getClass();
                return Long.parseLong(strGroup);
            }
            return -1L;
        }
        return -1L;
    }
}
