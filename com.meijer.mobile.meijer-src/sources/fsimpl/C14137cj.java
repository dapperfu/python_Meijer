package fsimpl;

import android.graphics.Typeface;
import android.os.Build;
import android.util.LongSparseArray;
import com.fullstory.util.Log;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: fsimpl.cj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C14137cj {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f133176a;

    /* renamed from: b, reason: collision with root package name */
    private static final List f133177b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f133178c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private boolean f133179d = false;

    static {
        int i10;
        ArrayList arrayList = new ArrayList();
        f133177b = arrayList;
        if (Build.VERSION.SDK_INT < 28) {
            a(arrayList, a("sTypefaceCache"));
            i10 = 1;
        } else {
            a(arrayList, a("sStyledTypefaceCache", "sStyledCacheLock"));
            a(arrayList, a("sWeightTypefaceCache", "sWeightCacheLock"));
            i10 = 2;
        }
        f133176a = arrayList.size() == i10;
    }

    C14137cj() {
    }

    private static C14132ce a(String str) {
        Object objA = fT.a(fT.a(28, 30, Typeface.class, str), (Object) null);
        if (objA instanceof LongSparseArray) {
            return new C14132ce((LongSparseArray) objA);
        }
        return null;
    }

    private static C14132ce a(String str, String str2) {
        Field fieldA = fT.a(30, Typeface.class, str);
        Field fieldA2 = fT.a(30, Typeface.class, str2);
        Object objA = fT.a(fieldA, (Object) null);
        Object objA2 = fT.a(fieldA2, (Object) null);
        if (objA2 == null || !(objA instanceof LongSparseArray)) {
            return null;
        }
        return new C14132ce((LongSparseArray) objA, objA2);
    }

    private static void a(List list, C14132ce c14132ce) {
        if (c14132ce != null) {
            list.add(c14132ce);
        }
    }

    private void a(Map map, Typeface typeface, String str) {
        int iB = C14207f.b(typeface);
        boolean zIsItalic = typeface.isItalic();
        if (b(map, typeface, str + C14225fr.a(zIsItalic, iB))) {
            return;
        }
        if (zIsItalic && b(map, typeface, str + C14225fr.a(zIsItalic, HttpResponseStatus.ERROR_BAD_REQUEST))) {
            return;
        }
        this.f133178c.put(typeface, str + C14225fr.a(false, HttpResponseStatus.ERROR_BAD_REQUEST));
    }

    private void a(Map map, C14132ce c14132ce, Map map2, Typeface typeface, String str) {
        List<Typeface> listA;
        long jA = C14207f.a(typeface);
        if (jA == -1 || (listA = c14132ce.a(jA)) == null) {
            return;
        }
        for (Typeface typeface2 : listA) {
            if (!map2.containsKey(typeface2)) {
                a(map, typeface2, str);
            }
        }
    }

    private boolean b(Map map, Typeface typeface, String str) {
        if (!map.containsKey(str)) {
            return false;
        }
        this.f133178c.put(typeface, str);
        return true;
    }

    public void a(C14138ck c14138ck, Map map) {
        if (!f133176a || this.f133179d) {
            return;
        }
        try {
            this.f133178c.clear();
            Map mapH = c14138ck.H();
            for (Map.Entry entry : map.entrySet()) {
                Typeface typeface = (Typeface) entry.getKey();
                String str = (String) entry.getValue();
                Iterator it = f133177b.iterator();
                while (it.hasNext()) {
                    a(mapH, (C14132ce) it.next(), map, typeface, str);
                }
            }
            map.putAll(this.f133178c);
            this.f133178c.clear();
        } catch (Throwable th2) {
            this.f133179d = true;
            Log.e("Unexpected error scanning scanning for new typeface mappings", th2);
            C14232fy.a(th2);
        }
    }
}
