package com.google.android.gms.internal.atv_ads_framework;

import io.constructor.BuildConfig;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.atv_ads_framework.a0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10199a0 {

    /* renamed from: a, reason: collision with root package name */
    private static final J f80953a = J.r("http", BuildConfig.SERVICE_SCHEME, "mailto", "ftp");

    /* renamed from: b, reason: collision with root package name */
    private static final J f80954b = J.s("audio/3gpp2", "audio/3gpp", "audio/aac", "audio/midi", "audio/mp3", "audio/mp4", "audio/mpeg", "audio/oga", "audio/ogg", "audio/opus", "audio/x-m4a", "audio/x-matroska", "audio/x-wav", "audio/wav", "audio/webm", "image/bmp", "image/gif", "image/jpeg", "image/jpg", "image/png", "image/svg+xml", "image/tiff", "image/webp", "image/x-icon", "video/mpeg", "video/mp4", "video/ogg", "video/webm", "video/x-matroska");

    /* renamed from: c, reason: collision with root package name */
    private static final J f80955c = J.p();

    public static String a(String str, String str2) {
        char cCharAt;
        int i10;
        char cCharAt2;
        char cCharAt3;
        J j10 = f80955c;
        String strA = C10218g.a(str);
        W it = f80953a.iterator();
        while (it.hasNext()) {
            if (strA.startsWith(String.valueOf((String) it.next()).concat(":"))) {
                return str;
            }
        }
        if (!strA.startsWith("data:")) {
            Iterator it2 = j10.iterator();
            while (it2.hasNext()) {
                if (strA.startsWith(String.valueOf(C10218g.a(((Z) it2.next()).name()).replace('_', '-')).concat(":"))) {
                    return str;
                }
            }
            for (int i11 = 0; i11 < str.length() && (cCharAt = str.charAt(i11)) != '#' && cCharAt != '/'; i11++) {
                if (cCharAt != ':') {
                    if (cCharAt == '?') {
                        return str;
                    }
                }
            }
            return str;
        }
        String strA2 = C10218g.a(str);
        if (strA2.startsWith("data:") && strA2.length() > 5) {
            int i12 = 5;
            while (i12 < strA2.length() && (cCharAt3 = strA2.charAt(i12)) != ';' && cCharAt3 != ',') {
                i12++;
            }
            if (f80954b.contains(strA2.substring(5, i12)) && strA2.startsWith(";base64,", i12) && (i10 = i12 + 8) < strA2.length()) {
                while (i10 < strA2.length() && (cCharAt2 = strA2.charAt(i10)) != '=') {
                    if ((cCharAt2 < 'a' || cCharAt2 > 'z') && !((cCharAt2 >= '0' && cCharAt2 <= '9') || cCharAt2 == '+' || cCharAt2 == '/')) {
                        break;
                    }
                    i10++;
                }
                while (i10 < strA2.length()) {
                    if (strA2.charAt(i10) == '=') {
                        i10++;
                    }
                }
                return str;
            }
        }
        return "about:invalid#zTvAdsFrameworkz";
    }
}
