package com.android.volley.toolbox;

import com.android.volley.a;
import j$.util.DesugarTimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes4.dex */
public class e {
    static List<com.android.volley.e> a(List<com.android.volley.e> list, a.C1250a c1250a) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<com.android.volley.e> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<com.android.volley.e> list2 = c1250a.f63725h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (com.android.volley.e eVar : c1250a.f63725h) {
                    if (!treeSet.contains(eVar.a())) {
                        arrayList.add(eVar);
                    }
                }
            }
        } else if (!c1250a.f63724g.isEmpty()) {
            for (Map.Entry<String, String> entry : c1250a.f63724g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new com.android.volley.e(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    static String b(long j10) {
        return d("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j10));
    }

    static Map<String, String> c(a.C1250a c1250a) {
        if (c1250a == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        String str = c1250a.f63719b;
        if (str != null) {
            map.put("If-None-Match", str);
        }
        long j10 = c1250a.f63721d;
        if (j10 > 0) {
            map.put("If-Modified-Since", b(j10));
        }
        return map;
    }

    private static SimpleDateFormat d(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static a.C1250a e(com.android.volley.h hVar) throws NumberFormatException {
        long j10;
        boolean z10;
        long j11;
        long j12;
        long j13;
        long j14;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = hVar.f63754c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long jG = str != null ? g(str) : 0L;
        String str2 = map.get("Cache-Control");
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
                        j11 = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j12 = Long.parseLong(strTrim.substring(23));
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
        String str3 = map.get("Expires");
        long jG2 = str3 != null ? g(str3) : j10;
        String str4 = map.get("Last-Modified");
        long jG3 = str4 != null ? g(str4) : j10;
        String str5 = map.get("ETag");
        if (i10 != 0) {
            long j15 = jCurrentTimeMillis + (j11 * 1000);
            j14 = z10 ? j15 : (j12 * 1000) + j15;
            j13 = j15;
        } else {
            j13 = (jG <= j10 || jG2 < jG) ? j10 : jCurrentTimeMillis + (jG2 - jG);
            j14 = j13;
        }
        a.C1250a c1250a = new a.C1250a();
        c1250a.f63718a = hVar.f63753b;
        c1250a.f63719b = str5;
        c1250a.f63723f = j13;
        c1250a.f63722e = j14;
        c1250a.f63720c = jG;
        c1250a.f63721d = jG3;
        c1250a.f63724g = map;
        c1250a.f63725h = hVar.f63755d;
        return c1250a;
    }

    public static String f(Map<String, String> map, String str) {
        String str2;
        if (map != null && (str2 = map.get("Content-Type")) != null) {
            String[] strArrSplit = str2.split(";", 0);
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                String[] strArrSplit2 = strArrSplit[i10].trim().split("=", 0);
                if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                    return strArrSplit2[1];
                }
            }
        }
        return str;
    }

    public static long g(String str) {
        try {
            return d("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e10) {
            if ("0".equals(str) || "-1".equals(str)) {
                com.android.volley.n.e("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            com.android.volley.n.d(e10, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    static List<com.android.volley.e> h(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new com.android.volley.e(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    static Map<String, String> i(List<com.android.volley.e> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (com.android.volley.e eVar : list) {
            treeMap.put(eVar.a(), eVar.b());
        }
        return treeMap;
    }
}
