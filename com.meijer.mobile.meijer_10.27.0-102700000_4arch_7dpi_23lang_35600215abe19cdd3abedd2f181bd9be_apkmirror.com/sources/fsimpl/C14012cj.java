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
/* loaded from: classes14.dex */
class C14012cj {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f131926a;

    /* renamed from: b, reason: collision with root package name */
    private static final List f131927b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f131928c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private boolean f131929d = false;

    static {
        int i10;
        ArrayList arrayList = new ArrayList();
        f131927b = arrayList;
        if (Build.VERSION.SDK_INT < 28) {
            a(arrayList, a("sTypefaceCache"));
            i10 = 1;
        } else {
            a(arrayList, a("sStyledTypefaceCache", "sStyledCacheLock"));
            a(arrayList, a("sWeightTypefaceCache", "sWeightCacheLock"));
            i10 = 2;
        }
        f131926a = arrayList.size() == i10;
    }

    C14012cj() {
    }

    private static C14007ce a(String str) {
        Object objA = fT.a(fT.a(28, 30, Typeface.class, str), (Object) null);
        if (objA instanceof LongSparseArray) {
            return new C14007ce((LongSparseArray) objA);
        }
        return null;
    }

    private static C14007ce a(String str, String str2) {
        Field fieldA = fT.a(30, Typeface.class, str);
        Field fieldA2 = fT.a(30, Typeface.class, str2);
        Object objA = fT.a(fieldA, (Object) null);
        Object objA2 = fT.a(fieldA2, (Object) null);
        if (objA2 == null || !(objA instanceof LongSparseArray)) {
            return null;
        }
        return new C14007ce((LongSparseArray) objA, objA2);
    }

    private static void a(List list, C14007ce c14007ce) {
        if (c14007ce != null) {
            list.add(c14007ce);
        }
    }

    private void a(Map map, Typeface typeface, String str) {
        int iB = C14082f.b(typeface);
        boolean zIsItalic = typeface.isItalic();
        if (b(map, typeface, str + C14100fr.a(zIsItalic, iB))) {
            return;
        }
        if (zIsItalic && b(map, typeface, str + C14100fr.a(zIsItalic, HttpResponseStatus.ERROR_BAD_REQUEST))) {
            return;
        }
        this.f131928c.put(typeface, str + C14100fr.a(false, HttpResponseStatus.ERROR_BAD_REQUEST));
    }

    private void a(Map map, C14007ce c14007ce, Map map2, Typeface typeface, String str) {
        List<Typeface> listA;
        long jA = C14082f.a(typeface);
        if (jA == -1 || (listA = c14007ce.a(jA)) == null) {
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
        this.f131928c.put(typeface, str);
        return true;
    }

    public void a(C14013ck c14013ck, Map map) {
        if (!f131926a || this.f131929d) {
            return;
        }
        try {
            this.f131928c.clear();
            Map mapH = c14013ck.H();
            for (Map.Entry entry : map.entrySet()) {
                Typeface typeface = (Typeface) entry.getKey();
                String str = (String) entry.getValue();
                Iterator it = f131927b.iterator();
                while (it.hasNext()) {
                    a(mapH, (C14007ce) it.next(), map, typeface, str);
                }
            }
            map.putAll(this.f131928c);
            this.f131928c.clear();
        } catch (Throwable th2) {
            this.f131929d = true;
            Log.e("Unexpected error scanning scanning for new typeface mappings", th2);
            C14107fy.a(th2);
        }
    }
}
