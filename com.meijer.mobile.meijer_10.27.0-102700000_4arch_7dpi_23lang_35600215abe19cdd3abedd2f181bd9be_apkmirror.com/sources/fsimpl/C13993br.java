package fsimpl;

import android.util.SparseArray;
import android.view.View;
import com.fullstory.instrumentation.Bootstrap;
import com.fullstory.instrumentation.frameworks.lottie.FSLottieLottieAnimationView;
import com.fullstory.util.Log;
import java.lang.reflect.Field;

/* renamed from: fsimpl.br, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C13993br {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f131875f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f131876g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f131877h;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f131878i;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f131879j;

    /* renamed from: k, reason: collision with root package name */
    private static boolean f131880k;

    /* renamed from: l, reason: collision with root package name */
    private static boolean f131881l;

    /* renamed from: m, reason: collision with root package name */
    private static boolean f131882m;

    /* renamed from: n, reason: collision with root package name */
    private static boolean f131883n;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f131872c = new Object();

    /* renamed from: o, reason: collision with root package name */
    private static Object f131884o = null;

    /* renamed from: p, reason: collision with root package name */
    private static SparseArray f131885p = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f131871b = fT.a("com.swmansion.rnscreens.Screen");

    /* renamed from: a, reason: collision with root package name */
    public static final Class f131870a = fT.a("com.reactnativenavigation.react.ReactView");

    /* renamed from: d, reason: collision with root package name */
    private static final Class f131873d = fT.a("com.facebook.react.views.modal.ReactModalHostView");

    /* renamed from: e, reason: collision with root package name */
    private static final Class f131874e = fT.a("com.facebook.react.uimanager.NativeViewHierarchyManager");

    private static View a(int i10) {
        Object obj;
        SparseArray sparseArray;
        View view;
        synchronized (f131872c) {
            obj = f131884o;
            sparseArray = f131885p;
        }
        if (obj == null || sparseArray == null) {
            return null;
        }
        synchronized (obj) {
            view = (View) sparseArray.get(i10);
        }
        return view;
    }

    public static View a(Object obj, int i10) {
        if (i10 == -1) {
            return null;
        }
        return bR.a() ? bQ.a(obj, i10) : a(i10);
    }

    public static void a(Object obj) {
        synchronized (f131872c) {
            Object obj2 = f131884o;
            if (obj2 == null || obj2 != obj) {
                SparseArray sparseArrayB = b(obj);
                f131884o = obj;
                f131885p = sparseArrayB;
            }
        }
    }

    public static void a(boolean z10) {
        f131875f = z10;
    }

    public static boolean a() {
        return f131876g;
    }

    public static boolean a(View view) {
        return view instanceof FSLottieLottieAnimationView;
    }

    private static boolean a(Class cls, View view) {
        if (cls == null) {
            return false;
        }
        return cls.isInstance(view);
    }

    private static SparseArray b(Object obj) {
        Class cls = f131874e;
        if (cls != null && cls.isInstance(obj)) {
            try {
                Field declaredField = cls.getDeclaredField("mTagsToViews");
                declaredField.setAccessible(true);
                return (SparseArray) declaredField.get(obj);
            } catch (Throwable th2) {
                Log.w("Failed to get mTagsToViews from NativeViewHierarchyManager", th2);
            }
        }
        return null;
    }

    public static void b(boolean z10) {
        f131876g = z10;
    }

    public static boolean b() {
        return f131877h;
    }

    public static boolean b(View view) {
        return a(f131873d, view);
    }

    public static void c(boolean z10) {
        f131877h = z10;
    }

    public static boolean c() {
        return f131878i;
    }

    public static boolean c(View view) {
        return a(f131870a, view);
    }

    public static void d(boolean z10) {
        f131878i = z10;
    }

    public static boolean d() {
        C13966ar currentSessionKnobs = Bootstrap.getCurrentSessionKnobs();
        return currentSessionKnobs != null && currentSessionKnobs.r();
    }

    public static boolean d(View view) {
        return a(f131871b, view);
    }

    public static void e(boolean z10) {
        f131879j = z10;
    }

    public static boolean e() {
        return f131879j;
    }

    public static boolean e(View view) {
        int id2;
        if (!e() || view == null || (id2 = view.getId()) == -1) {
            return false;
        }
        return view == (bR.a() ? bQ.a(view.getContext(), id2) : a(id2));
    }

    public static void f(boolean z10) {
        f131880k = z10;
    }

    public static boolean f() {
        return e() && bR.a();
    }

    public static void g(boolean z10) {
        f131881l = z10;
    }

    public static boolean g() {
        return f131880k;
    }

    public static void h(boolean z10) {
        f131882m = z10;
    }

    public static boolean h() {
        return f131881l;
    }

    public static void i(boolean z10) {
        f131883n = z10;
    }

    public static boolean i() {
        return f131882m;
    }

    public static boolean j() {
        return f131883n;
    }
}
