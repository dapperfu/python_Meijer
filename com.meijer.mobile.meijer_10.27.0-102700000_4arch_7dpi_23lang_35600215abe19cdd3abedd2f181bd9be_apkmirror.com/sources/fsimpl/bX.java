package fsimpl;

import android.content.res.Resources;
import android.content.res.ResourcesImpl;
import android.graphics.Bitmap;
import android.util.ArrayMap;
import android.util.LongSparseArray;
import com.fullstory.jni.FSNative;
import com.fullstory.util.Log;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes14.dex */
public class bX {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f131798a;

    /* renamed from: b, reason: collision with root package name */
    static final Map f131799b = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Field f131800c;

    /* renamed from: d, reason: collision with root package name */
    private static final Field f131801d;

    /* renamed from: e, reason: collision with root package name */
    private static final Field f131802e;

    /* renamed from: f, reason: collision with root package name */
    private static final Field f131803f;

    /* renamed from: g, reason: collision with root package name */
    private static final Field f131804g;

    /* renamed from: h, reason: collision with root package name */
    private static final Field f131805h;

    static {
        Field fieldA;
        if (FSNative.f64361b) {
            f131800c = fT.a(Resources.class, "mResourcesImpl");
            f131801d = fT.a(ResourcesImpl.class, "mAccessLock");
            f131802e = fT.a(ResourcesImpl.class, "mDrawableCache");
            Class clsA = fT.a("android.content.res.ThemedResourceCache");
            f131803f = fT.a(30, clsA, "mUnthemedEntries");
            f131804g = fT.a(30, clsA, "mNullThemedEntries");
            fieldA = fT.a(clsA, "mThemedEntries");
        } else {
            fieldA = null;
            f131800c = null;
            f131801d = null;
            f131802e = null;
            f131803f = null;
            f131804g = null;
        }
        f131805h = fieldA;
        f131798a = (f131800c == null || f131801d == null || f131802e == null || f131803f == null || f131804g == null || f131805h == null) ? false : true;
    }

    public static void a(Resources resources) {
        if (f131798a) {
            Map map = f131799b;
            synchronized (map) {
                map.put(resources, null);
            }
        }
    }

    public static void a(bV bVVar) {
        ArrayList arrayList;
        if (f131798a) {
            Map map = f131799b;
            synchronized (map) {
                arrayList = null;
                for (Resources resources : map.keySet()) {
                    if (resources != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(resources);
                    }
                }
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a(bVVar, (Resources) it.next());
                }
            }
        }
    }

    private static void a(bV bVVar, Resources resources) {
        Object obj;
        try {
            ResourcesImpl resourcesImpl = (ResourcesImpl) f131800c.get(resources);
            if (resourcesImpl == null || (obj = f131801d.get(resourcesImpl)) == null) {
                return;
            }
            synchronized (obj) {
                Object obj2 = f131802e.get(resourcesImpl);
                if (obj2 != null) {
                    b(bVVar, resources, f131803f.get(obj2));
                    b(bVVar, resources, f131804g.get(obj2));
                    a(bVVar, resources, f131805h.get(obj2));
                }
            }
        } catch (Throwable th2) {
            if (Log.DISABLE_LOGGING) {
                return;
            }
            th2.printStackTrace();
        }
    }

    static void a(bV bVVar, Resources resources, Bitmap bitmap, long j10) {
        if (bitmap != null) {
            bVVar.a(resources, bitmap, j10);
        }
    }

    private static void a(bV bVVar, Resources resources, ArrayMap arrayMap) {
        Iterator it = arrayMap.values().iterator();
        while (it.hasNext()) {
            b(bVVar, resources, it.next());
        }
    }

    private static void a(bV bVVar, Resources resources, LongSparseArray longSparseArray) {
        Object obj;
        int size = longSparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object objValueAt = longSparseArray.valueAt(i10);
            if ((objValueAt instanceof WeakReference) && (obj = ((WeakReference) objValueAt).get()) != null) {
                long jKeyAt = longSparseArray.keyAt(i10);
                if (bW.a(obj)) {
                    bW.a(bVVar, resources, obj, jKeyAt);
                } else if (bZ.a(obj)) {
                    bZ.a(bVVar, resources, obj, jKeyAt);
                } else if (C14006cd.a(obj)) {
                    C14006cd.a(bVVar, resources, obj, jKeyAt);
                }
            }
        }
    }

    private static void a(bV bVVar, Resources resources, Object obj) {
        if (obj instanceof ArrayMap) {
            a(bVVar, resources, (ArrayMap) obj);
        }
    }

    private static void b(bV bVVar, Resources resources, Object obj) {
        if (obj instanceof LongSparseArray) {
            a(bVVar, resources, (LongSparseArray) obj);
        }
    }
}
