package com.google.android.gms.internal.ads;

import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.q7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9269q7 {
    public static long a(String str) {
        try {
            return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e10) {
            if ("0".equals(str) || "-1".equals(str)) {
                C7987e7.d("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            C7987e7.c(e10, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static G6 b(S6 s62) throws NumberFormatException {
        long j10;
        boolean z10;
        long j11;
        long j12;
        long j13;
        long jA;
        long j14;
        long j15;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map map = s62.f70873c;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long jA2 = str != null ? a(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i10 = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z10 = false;
            j11 = 0;
            j12 = 0;
            while (i10 < strArrSplit.length) {
                String strTrim = strArrSplit[i10].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j12 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j11 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z10 = true;
                }
                i10++;
            }
            j10 = 0;
            i10 = 1;
        } else {
            j10 = 0;
            z10 = false;
            j11 = 0;
            j12 = 0;
        }
        String str3 = (String) map.get("Expires");
        long jA3 = str3 != null ? a(str3) : j10;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j13 = jCurrentTimeMillis;
            jA = a(str4);
        } else {
            j13 = jCurrentTimeMillis;
            jA = j10;
        }
        String str5 = (String) map.get("ETag");
        if (i10 != 0) {
            long j16 = (j12 * 1000) + j13;
            j15 = z10 ? j16 : (j11 * 1000) + j16;
            j14 = j16;
        } else {
            j14 = (jA2 <= j10 || jA3 < jA2) ? j10 : (jA3 - jA2) + j13;
            j15 = j14;
        }
        G6 g62 = new G6();
        g62.f67934a = s62.f70872b;
        g62.f67935b = str5;
        g62.f67939f = j14;
        g62.f67938e = j15;
        g62.f67936c = jA2;
        g62.f67937d = jA;
        g62.f67940g = map;
        g62.f67941h = s62.f70874d;
        return g62;
    }

    static String c(long j10) {
        return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j10));
    }

    private static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
