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

/* loaded from: classes15.dex */
public class bX {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f133048a;

    /* renamed from: b, reason: collision with root package name */
    static final Map f133049b = new WeakHashMap();

    /* renamed from: c, reason: collision with root package name */
    private static final Field f133050c;

    /* renamed from: d, reason: collision with root package name */
    private static final Field f133051d;

    /* renamed from: e, reason: collision with root package name */
    private static final Field f133052e;

    /* renamed from: f, reason: collision with root package name */
    private static final Field f133053f;

    /* renamed from: g, reason: collision with root package name */
    private static final Field f133054g;

    /* renamed from: h, reason: collision with root package name */
    private static final Field f133055h;

    static {
        Field fieldA;
        if (FSNative.f65201b) {
            f133050c = fT.a(Resources.class, "mResourcesImpl");
            f133051d = fT.a(ResourcesImpl.class, "mAccessLock");
            f133052e = fT.a(ResourcesImpl.class, "mDrawableCache");
            Class clsA = fT.a("android.content.res.ThemedResourceCache");
            f133053f = fT.a(30, clsA, "mUnthemedEntries");
            f133054g = fT.a(30, clsA, "mNullThemedEntries");
            fieldA = fT.a(clsA, "mThemedEntries");
        } else {
            fieldA = null;
            f133050c = null;
            f133051d = null;
            f133052e = null;
            f133053f = null;
            f133054g = null;
        }
        f133055h = fieldA;
        f133048a = (f133050c == null || f133051d == null || f133052e == null || f133053f == null || f133054g == null || f133055h == null) ? false : true;
    }

    public static void a(Resources resources) {
        if (f133048a) {
            Map map = f133049b;
            synchronized (map) {
                map.put(resources, null);
            }
        }
    }

    public static void a(bV bVVar) {
        ArrayList arrayList;
        if (f133048a) {
            Map map = f133049b;
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
            ResourcesImpl resourcesImpl = (ResourcesImpl) f133050c.get(resources);
            if (resourcesImpl == null || (obj = f133051d.get(resourcesImpl)) == null) {
                return;
            }
            synchronized (obj) {
                Object obj2 = f133052e.get(resourcesImpl);
                if (obj2 != null) {
                    b(bVVar, resources, f133053f.get(obj2));
                    b(bVVar, resources, f133054g.get(obj2));
                    a(bVVar, resources, f133055h.get(obj2));
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
                } else if (C14131cd.a(obj)) {
                    C14131cd.a(bVVar, resources, obj, jKeyAt);
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
