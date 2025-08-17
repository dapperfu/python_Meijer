package H4;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* loaded from: classes4.dex */
class C {

    /* renamed from: a, reason: collision with root package name */
    private static final F f12086a;

    /* renamed from: b, reason: collision with root package name */
    static final Property<View, Float> f12087b;

    /* renamed from: c, reason: collision with root package name */
    static final Property<View, Rect> f12088c;

    class a extends Property<View, Float> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(C.b(view));
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            C.e(view, f10.floatValue());
        }
    }

    class b extends Property<View, Rect> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f12086a = new M();
        } else {
            f12086a = new L();
        }
        f12087b = new a(Float.class, "translationAlpha");
        f12088c = new b(Rect.class, "clipBounds");
    }

    static void a(View view) {
        f12086a.a(view);
    }

    static float b(View view) {
        return f12086a.b(view);
    }

    static void c(View view) {
        f12086a.c(view);
    }

    static void d(View view, int i10, int i11, int i12, int i13) {
        f12086a.d(view, i10, i11, i12, i13);
    }

    static void e(View view, float f10) {
        f12086a.e(view, f10);
    }

    static void f(View view, int i10) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        f12086a.f(view, i10);
    }

    static void g(View view, Matrix matrix) {
        f12086a.g(view, matrix);
    }

    static void h(View view, Matrix matrix) {
        f12086a.h(view, matrix);
    }
}
