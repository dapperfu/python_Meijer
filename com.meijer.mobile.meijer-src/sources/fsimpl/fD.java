package fsimpl;

import com.fullstory.util.Log;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public class fD {
    private static int a(gh ghVar, Object obj) {
        return obj == null ? fE.a(ghVar) : obj instanceof Map ? b(ghVar, (Map) obj) : obj.getClass().isArray() ? b(ghVar, obj) : obj instanceof Collection ? a(ghVar, (Collection) obj) : fE.a(ghVar, obj);
    }

    private static int a(gh ghVar, Collection collection) {
        fH fHVar = new fH(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            int iA = a(ghVar, it.next());
            if (iA != 0) {
                fHVar.a(iA);
            }
        }
        return cV.a(ghVar, (byte) 2, cW.a(ghVar, cW.a(ghVar, fHVar.c())));
    }

    public static int a(gh ghVar, Map map) {
        if (map == null || map.isEmpty()) {
            return cX.a(ghVar, 0, 0);
        }
        int size = map.size();
        fH fHVar = new fH(size);
        fH fHVar2 = new fH(size);
        for (Map.Entry entry : map.entrySet()) {
            String strD = fY.d((CharSequence) entry.getKey());
            if (strD == null) {
                Log.d("Skipping entry containing null or empty key");
            } else {
                int iA = a(ghVar, entry.getValue());
                if (iA != 0) {
                    fHVar.a(ghVar.a(strD));
                    fHVar2.a(iA);
                }
            }
        }
        return cX.a(ghVar, cX.a(ghVar, fHVar.c()), cX.b(ghVar, fHVar2.c()));
    }

    private static Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof Map ? b((Map) obj) : obj.getClass().isArray() ? b(obj) : obj instanceof Collection ? c(obj) : fE.a(obj);
    }

    public static HashMap a(Map map) {
        if (map == null || map.isEmpty()) {
            return new HashMap();
        }
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            String strD = fY.d((CharSequence) entry.getKey());
            if (strD == null) {
                Log.d("Skipping entry containing null or empty key");
            } else {
                map2.put(strD, a(entry.getValue()));
            }
        }
        return map2;
    }

    private static int b(gh ghVar, Object obj) {
        int length = Array.getLength(obj);
        fH fHVar = new fH(length);
        for (int i10 = 0; i10 < length; i10++) {
            int iA = a(ghVar, Array.get(obj, i10));
            if (iA != 0) {
                fHVar.a(iA);
            }
        }
        return cV.a(ghVar, (byte) 2, cW.a(ghVar, cW.a(ghVar, fHVar.c())));
    }

    private static int b(gh ghVar, Map map) {
        for (Object obj : map.keySet()) {
            if (!(obj instanceof String) && obj != null) {
                Log.e("Skipping Map containing non-String keys");
                return 0;
            }
        }
        return cV.a(ghVar, (byte) 1, a(ghVar, map));
    }

    private static HashMap b(Map map) {
        for (Object obj : map.keySet()) {
            if (!(obj instanceof String) && obj != null) {
                Log.e("Skipping Map containing non-String keys");
                return null;
            }
        }
        return a(map);
    }

    private static List b(Object obj) {
        int length = Array.getLength(obj);
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(a(Array.get(obj, i10)));
        }
        return arrayList;
    }

    private static Collection c(Object obj) {
        Collection collection = (Collection) obj;
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return arrayList;
    }
}
