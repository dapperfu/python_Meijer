package com.adobe.marketing.mobile.analytics.internal;

import Q5.t;
import f6.l;
import j$.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
class i {

    /* renamed from: a, reason: collision with root package name */
    private static final String f62111a = "i";

    /* renamed from: b, reason: collision with root package name */
    private static final boolean[] f62112b = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};

    /* renamed from: c, reason: collision with root package name */
    private static final Map<String, String> f62113c = new HashMap(256);

    /* renamed from: d, reason: collision with root package name */
    private static int f62114d = 0;

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        Map<String, String> map = f62113c;
        synchronized (map) {
            try {
                String str2 = map.get(str);
                if (str2 != null) {
                    return str2;
                }
                byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                byte[] bArr = new byte[bytes.length];
                int i10 = 0;
                byte b10 = 0;
                for (byte b11 : bytes) {
                    if ((b11 != 46 || b10 != 46) && f62112b[b11 & 255]) {
                        bArr[i10] = b11;
                        i10++;
                        b10 = b11;
                    }
                }
                if (i10 == 0) {
                    return null;
                }
                int i11 = bArr[0] == 46 ? 1 : 0;
                int i12 = (i10 - (bArr[i10 + (-1)] == 46 ? 1 : 0)) - i11;
                if (i12 <= 0) {
                    return null;
                }
                String str3 = new String(bArr, i11, i12, StandardCharsets.UTF_8);
                Map<String, String> map2 = f62113c;
                synchronized (map2) {
                    try {
                        if (f62114d > 250) {
                            map2.clear();
                            f62114d = 0;
                        }
                        map2.put(str, str3);
                        f62114d++;
                    } finally {
                    }
                }
                return str3;
            } finally {
            }
        }
    }

    private static void a(Object obj, h hVar, List<String> list, int i10) {
        if (hVar == null || list == null) {
            return;
        }
        int size = list.size();
        String str = i10 < size ? list.get(i10) : null;
        if (str == null) {
            return;
        }
        h hVar2 = new h();
        if (hVar.a(str)) {
            hVar2 = hVar.b(str);
        }
        if (size - 1 == i10) {
            hVar2.f62109a = obj;
            hVar.c(str, hVar2);
        } else {
            hVar.c(str, hVar2);
            a(obj, hVar2, list, i10 + 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r3.group(2) == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String b(java.util.Map<java.lang.String, java.lang.String> r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "c"
            java.lang.String r1 = "Context data matcher failed with %s"
            java.lang.String r2 = "Analytics"
            boolean r3 = f6.i.a(r9)
            if (r3 != 0) goto Lae
            if (r8 == 0) goto Lae
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L16
            goto Lae
        L16:
            java.lang.String r3 = ".*(&c\\.(.*)&\\.c).*"
            java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3)
            java.util.regex.Matcher r3 = r3.matcher(r9)
            r4 = 2
            boolean r5 = r3.matches()     // Catch: java.lang.IllegalStateException -> L2e java.lang.IndexOutOfBoundsException -> L30
            if (r5 == 0) goto L32
            java.lang.String r5 = r3.group(r4)     // Catch: java.lang.IllegalStateException -> L2e java.lang.IndexOutOfBoundsException -> L30
            if (r5 != 0) goto L5e
            goto L32
        L2e:
            r5 = move-exception
            goto L4b
        L30:
            r5 = move-exception
            goto L55
        L32:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r9)
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            com.adobe.marketing.mobile.analytics.internal.h r8 = j(r8)
            r9.put(r0, r8)
            i(r9, r1)
            java.lang.String r8 = r1.toString()
            return r8
        L4b:
            java.lang.String r6 = com.adobe.marketing.mobile.analytics.internal.i.f62111a
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            Q5.t.a(r2, r6, r1, r5)
            goto L5e
        L55:
            java.lang.String r6 = com.adobe.marketing.mobile.analytics.internal.i.f62111a
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            Q5.t.a(r2, r6, r1, r5)
        L5e:
            java.lang.String r4 = r3.group(r4)     // Catch: java.lang.IllegalStateException -> L97 java.lang.IndexOutOfBoundsException -> L99
            java.util.Map r4 = f(r4)     // Catch: java.lang.IllegalStateException -> L97 java.lang.IndexOutOfBoundsException -> L99
            r4.putAll(r8)     // Catch: java.lang.IllegalStateException -> L97 java.lang.IndexOutOfBoundsException -> L99
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.IllegalStateException -> L97 java.lang.IndexOutOfBoundsException -> L99
            r5 = 1
            int r6 = r3.start(r5)     // Catch: java.lang.IllegalStateException -> L97 java.lang.IndexOutOfBoundsException -> L99
            r7 = 0
            java.lang.String r6 = r9.substring(r7, r6)     // Catch: java.lang.IllegalStateException -> L97 java.lang.IndexOutOfBoundsException -> L99
            r8.<init>(r6)     // Catch: java.lang.IllegalStateException -> L97 java.lang.IndexOutOfBoundsException -> L99
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.IllegalStateException -> L97 java.lang.IndexOutOfBoundsException -> L99
            r6.<init>()     // Catch: java.lang.IllegalStateException -> L97 java.lang.IndexOutOfBoundsException -> L99
            com.adobe.marketing.mobile.analytics.internal.h r4 = j(r4)     // Catch: java.lang.IllegalStateException -> L97 java.lang.IndexOutOfBoundsException -> L99
            r6.put(r0, r4)     // Catch: java.lang.IllegalStateException -> L97 java.lang.IndexOutOfBoundsException -> L99
            i(r6, r8)     // Catch: java.lang.IllegalStateException -> L97 java.lang.IndexOutOfBoundsException -> L99
            int r0 = r3.end(r5)     // Catch: java.lang.IllegalStateException -> L97 java.lang.IndexOutOfBoundsException -> L99
            java.lang.String r0 = r9.substring(r0)     // Catch: java.lang.IllegalStateException -> L97 java.lang.IndexOutOfBoundsException -> L99
            r8.append(r0)     // Catch: java.lang.IllegalStateException -> L97 java.lang.IndexOutOfBoundsException -> L99
            java.lang.String r8 = r8.toString()     // Catch: java.lang.IllegalStateException -> L97 java.lang.IndexOutOfBoundsException -> L99
            return r8
        L97:
            r8 = move-exception
            goto L9b
        L99:
            r8 = move-exception
            goto La5
        L9b:
            java.lang.String r0 = com.adobe.marketing.mobile.analytics.internal.i.f62111a
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            Q5.t.a(r2, r0, r1, r8)
            goto Lae
        La5:
            java.lang.String r0 = com.adobe.marketing.mobile.analytics.internal.i.f62111a
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            Q5.t.a(r2, r0, r1, r8)
        Lae:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adobe.marketing.mobile.analytics.internal.i.b(java.util.Map, java.lang.String):java.lang.String");
    }

    public static Map<String, Object> c(Map<String, String> map) {
        HashMap map2 = new HashMap();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String strD = d(entry.getKey());
                if (strD != null) {
                    map2.put(strD, entry.getValue());
                }
            }
        }
        return map2;
    }

    private static String e(List<String> list, String str) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static Map<String, String> f(String str) {
        HashMap map = new HashMap(64);
        ArrayList arrayList = new ArrayList(16);
        for (String str2 : str.split("&")) {
            if (str2.endsWith(".") && !str2.contains("=")) {
                arrayList.add(str2);
            } else if (!str2.startsWith(".")) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length == 2) {
                    try {
                        map.put(e(arrayList, strArrSplit[0]), URLDecoder.decode(strArrSplit[1], String.valueOf(StandardCharsets.UTF_8)));
                    } catch (Exception e10) {
                        t.f("Analytics", f62111a, "Appending the context data information failed with %s", e10);
                    }
                }
            } else if (!arrayList.isEmpty()) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        return map;
    }

    static String g(Iterable<?> iterable, String str) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (!it.hasNext()) {
                break;
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    private static void h(String str, Object obj, StringBuilder sb2) {
        if (str == null || obj == null || (obj instanceof h) || str.length() <= 0) {
            return;
        }
        if (!(obj instanceof String) || ((String) obj).length() > 0) {
            sb2.append("&");
            sb2.append(str);
            sb2.append("=");
            if (obj instanceof List) {
                sb2.append(l.b(g((List) obj, ",")));
            } else {
                sb2.append(l.b(obj.toString()));
            }
        }
    }

    public static void i(Map<String, Object> map, StringBuilder sb2) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String strB = l.b(entry.getKey());
            if (strB != null) {
                Object value = entry.getValue();
                if (value instanceof h) {
                    h hVar = (h) value;
                    Object obj = hVar.f62109a;
                    if (obj != null) {
                        h(strB, obj, sb2);
                    }
                    Map<String, Object> map2 = hVar.f62110b;
                    if (map2 != null && map2.size() > 0) {
                        sb2.append("&");
                        sb2.append(strB);
                        sb2.append(".");
                        i(hVar.f62110b, sb2);
                        sb2.append("&.");
                        sb2.append(strB);
                    }
                } else {
                    h(strB, value, sb2);
                }
            }
        }
    }

    public static h j(Map<String, String> map) {
        h hVar = new h();
        for (Map.Entry<String, Object> entry : c(map).entrySet()) {
            String key = entry.getKey();
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                int iIndexOf = key.indexOf(46, i10);
                if (iIndexOf >= 0) {
                    arrayList.add(key.substring(i10, iIndexOf));
                    i10 = iIndexOf + 1;
                }
            }
            arrayList.add(key.substring(i10, key.length()));
            a(entry.getValue(), hVar, arrayList, 0);
        }
        return hVar;
    }
}
