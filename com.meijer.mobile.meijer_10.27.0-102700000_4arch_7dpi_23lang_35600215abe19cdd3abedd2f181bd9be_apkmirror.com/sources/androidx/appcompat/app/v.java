package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build;
import android.util.LongSparseArray;
import com.fullstory.FS;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
class v {

    /* renamed from: a, reason: collision with root package name */
    private static Field f45989a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f45990b;

    /* renamed from: c, reason: collision with root package name */
    private static Class<?> f45991c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f45992d;

    /* renamed from: e, reason: collision with root package name */
    private static Field f45993e;

    /* renamed from: f, reason: collision with root package name */
    private static boolean f45994f;

    /* renamed from: g, reason: collision with root package name */
    private static Field f45995g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f45996h;

    static void a(Resources resources) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        b(resources);
    }

    private static void b(Resources resources) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        Object obj;
        if (!f45996h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f45995g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                FS.log_e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f45996h = true;
        }
        Field field = f45995g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e11) {
            FS.log_e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f45990b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f45989a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                FS.log_e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
            }
            f45990b = true;
        }
        Field field2 = f45989a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e13) {
                FS.log_e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
            }
        }
        if (obj2 != null) {
            c(obj2);
        }
    }

    private static void c(Object obj) throws NoSuchFieldException, SecurityException {
        LongSparseArray longSparseArray;
        if (!f45992d) {
            try {
                f45991c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                FS.log_e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f45992d = true;
        }
        Class<?> cls = f45991c;
        if (cls == null) {
            return;
        }
        if (!f45994f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f45993e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                FS.log_e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f45994f = true;
        }
        Field field = f45993e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            FS.log_e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
