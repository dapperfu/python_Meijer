package fsimpl;

import android.util.SparseArray;
import android.view.View;
import com.fullstory.instrumentation.Bootstrap;
import com.fullstory.instrumentation.frameworks.lottie.FSLottieLottieAnimationView;
import com.fullstory.util.Log;
import java.lang.reflect.Field;

/* renamed from: fsimpl.br, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14118br {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f133125f;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f133126g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f133127h;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f133128i;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f133129j;

    /* renamed from: k, reason: collision with root package name */
    private static boolean f133130k;

    /* renamed from: l, reason: collision with root package name */
    private static boolean f133131l;

    /* renamed from: m, reason: collision with root package name */
    private static boolean f133132m;

    /* renamed from: n, reason: collision with root package name */
    private static boolean f133133n;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f133122c = new Object();

    /* renamed from: o, reason: collision with root package name */
    private static Object f133134o = null;

    /* renamed from: p, reason: collision with root package name */
    private static SparseArray f133135p = null;

    /* renamed from: b, reason: collision with root package name */
    public static final Class f133121b = fT.a("com.swmansion.rnscreens.Screen");

    /* renamed from: a, reason: collision with root package name */
    public static final Class f133120a = fT.a("com.reactnativenavigation.react.ReactView");

    /* renamed from: d, reason: collision with root package name */
    private static final Class f133123d = fT.a("com.facebook.react.views.modal.ReactModalHostView");

    /* renamed from: e, reason: collision with root package name */
    private static final Class f133124e = fT.a("com.facebook.react.uimanager.NativeViewHierarchyManager");

    private static View a(int i10) {
        Object obj;
        SparseArray sparseArray;
        View view;
        synchronized (f133122c) {
            obj = f133134o;
            sparseArray = f133135p;
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
        synchronized (f133122c) {
            Object obj2 = f133134o;
            if (obj2 == null || obj2 != obj) {
                SparseArray sparseArrayB = b(obj);
                f133134o = obj;
                f133135p = sparseArrayB;
            }
        }
    }

    public static void a(boolean z10) {
        f133125f = z10;
    }

    public static boolean a() {
        return f133126g;
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
        Class cls = f133124e;
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
        f133126g = z10;
    }

    public static boolean b() {
        return f133127h;
    }

    public static boolean b(View view) {
        return a(f133123d, view);
    }

    public static void c(boolean z10) {
        f133127h = z10;
    }

    public static boolean c() {
        return f133128i;
    }

    public static boolean c(View view) {
        return a(f133120a, view);
    }

    public static void d(boolean z10) {
        f133128i = z10;
    }

    public static boolean d() {
        C14091ar currentSessionKnobs = Bootstrap.getCurrentSessionKnobs();
        return currentSessionKnobs != null && currentSessionKnobs.r();
    }

    public static boolean d(View view) {
        return a(f133121b, view);
    }

    public static void e(boolean z10) {
        f133129j = z10;
    }

    public static boolean e() {
        return f133129j;
    }

    public static boolean e(View view) {
        int id2;
        if (!e() || view == null || (id2 = view.getId()) == -1) {
            return false;
        }
        return view == (bR.a() ? bQ.a(view.getContext(), id2) : a(id2));
    }

    public static void f(boolean z10) {
        f133130k = z10;
    }

    public static boolean f() {
        return e() && bR.a();
    }

    public static void g(boolean z10) {
        f133131l = z10;
    }

    public static boolean g() {
        return f133130k;
    }

    public static void h(boolean z10) {
        f133132m = z10;
    }

    public static boolean h() {
        return f133131l;
    }

    public static void i(boolean z10) {
        f133133n = z10;
    }

    public static boolean i() {
        return f133132m;
    }

    public static boolean j() {
        return f133133n;
    }
}
