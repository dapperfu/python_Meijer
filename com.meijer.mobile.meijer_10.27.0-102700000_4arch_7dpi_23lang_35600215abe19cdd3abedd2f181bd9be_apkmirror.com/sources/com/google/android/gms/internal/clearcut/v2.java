package com.google.android.gms.internal.clearcut;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.fullstory.FS;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class v2 {

    /* renamed from: f, reason: collision with root package name */
    private static HashMap<String, String> f81586f;

    /* renamed from: k, reason: collision with root package name */
    private static Object f81591k;

    /* renamed from: l, reason: collision with root package name */
    private static boolean f81592l;

    /* renamed from: a, reason: collision with root package name */
    private static final Uri f81581a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b, reason: collision with root package name */
    private static final Uri f81582b = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f81583c = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f81584d = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f81585e = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    private static final HashMap<String, Boolean> f81587g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private static final HashMap<String, Integer> f81588h = new HashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private static final HashMap<String, Long> f81589i = new HashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private static final HashMap<String, Float> f81590j = new HashMap<>();

    /* renamed from: m, reason: collision with root package name */
    private static String[] f81593m = new String[0];

    public static long a(ContentResolver contentResolver, String str, long j10) throws NumberFormatException {
        Object objI = i(contentResolver);
        long j11 = 0;
        Long lValueOf = (Long) b(f81589i, str, 0L);
        if (lValueOf != null) {
            return lValueOf.longValue();
        }
        String strC = c(contentResolver, str, null);
        if (strC != null) {
            try {
                long j12 = Long.parseLong(strC);
                lValueOf = Long.valueOf(j12);
                j11 = j12;
            } catch (NumberFormatException unused) {
            }
        }
        g(objI, f81589i, str, lValueOf);
        return j11;
    }

    private static <T> T b(HashMap<String, T> map, String str, T t10) {
        synchronized (v2.class) {
            try {
                if (!map.containsKey(str)) {
                    return null;
                }
                T t11 = map.get(str);
                if (t11 != null) {
                    t10 = t11;
                }
                return t10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    public static String c(ContentResolver contentResolver, String str, String str2) {
        String str3;
        synchronized (v2.class) {
            try {
                e(contentResolver);
                Object obj = f81591k;
                if (!f81586f.containsKey(str)) {
                    for (String str4 : f81593m) {
                        if (str.startsWith(str4)) {
                            if (!f81592l || f81586f.isEmpty()) {
                                f81586f.putAll(d(contentResolver, f81593m));
                                f81592l = true;
                                if (f81586f.containsKey(str) && (str3 = f81586f.get(str)) != null) {
                                    str = str3;
                                }
                            }
                        }
                    }
                    Cursor cursorQuery = contentResolver.query(f81581a, null, null, new String[]{str}, null);
                    if (cursorQuery != null) {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string = cursorQuery.getString(1);
                                if (string != null && string.equals(null)) {
                                    string = null;
                                }
                                f(obj, str, string);
                                str = string != null ? string : null;
                                cursorQuery.close();
                                return str;
                            }
                        } catch (Throwable th2) {
                            if (cursorQuery == null) {
                                throw th2;
                            }
                            cursorQuery.close();
                            throw th2;
                        }
                    }
                    f(obj, str, null);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
                String str5 = f81586f.get(str);
                if (str5 != null) {
                    str = str5;
                }
                return str;
            } finally {
            }
        }
    }

    private static Map<String, String> d(ContentResolver contentResolver, String... strArr) {
        Cursor cursorQuery = contentResolver.query(f81582b, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (cursorQuery == null) {
            return treeMap;
        }
        while (cursorQuery.moveToNext()) {
            try {
                treeMap.put(cursorQuery.getString(0), cursorQuery.getString(1));
            } finally {
                cursorQuery.close();
            }
        }
        return treeMap;
    }

    private static void e(ContentResolver contentResolver) {
        if (f81586f == null) {
            f81585e.set(false);
            f81586f = new HashMap<>();
            f81591k = new Object();
            f81592l = false;
            contentResolver.registerContentObserver(f81581a, true, new w2(null));
            return;
        }
        if (f81585e.getAndSet(false)) {
            f81586f.clear();
            f81587g.clear();
            f81588h.clear();
            f81589i.clear();
            f81590j.clear();
            f81591k = new Object();
            f81592l = false;
        }
    }

    private static void f(Object obj, String str, String str2) {
        synchronized (v2.class) {
            try {
                if (obj == f81591k) {
                    f81586f.put(str, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static <T> void g(Object obj, HashMap<String, T> map, String str, T t10) {
        synchronized (v2.class) {
            try {
                if (obj == f81591k) {
                    map.put(str, t10);
                    f81586f.remove(str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean h(ContentResolver contentResolver, String str, boolean z10) {
        Object objI = i(contentResolver);
        HashMap<String, Boolean> map = f81587g;
        Boolean bool = (Boolean) b(map, str, Boolean.valueOf(z10));
        if (bool != null) {
            return bool.booleanValue();
        }
        String strC = c(contentResolver, str, null);
        if (strC != null && !strC.equals("")) {
            if (f81583c.matcher(strC).matches()) {
                bool = Boolean.TRUE;
                z10 = true;
            } else if (f81584d.matcher(strC).matches()) {
                bool = Boolean.FALSE;
                z10 = false;
            } else {
                FS.log_w("Gservices", "attempt to read gservices key " + str + " (value \"" + strC + "\") as boolean");
            }
        }
        g(objI, map, str, bool);
        return z10;
    }

    private static Object i(ContentResolver contentResolver) {
        Object obj;
        synchronized (v2.class) {
            e(contentResolver);
            obj = f81591k;
        }
        return obj;
    }
}
