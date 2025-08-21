package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import d2.C13595a;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5790y {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f47257a = {R.attr.state_checked};

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f47258b = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Rect f47259c = new Rect();

    /* renamed from: androidx.appcompat.widget.y$a */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final boolean f47260a;

        /* renamed from: b, reason: collision with root package name */
        private static final Method f47261b;

        /* renamed from: c, reason: collision with root package name */
        private static final Field f47262c;

        /* renamed from: d, reason: collision with root package name */
        private static final Field f47263d;

        /* renamed from: e, reason: collision with root package name */
        private static final Field f47264e;

        /* renamed from: f, reason: collision with root package name */
        private static final Field f47265f;

        /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
        static {
            /*
                r0 = 1
                r1 = 0
                r2 = 0
                java.lang.String r3 = "android.graphics.Insets"
                java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L40 java.lang.NoSuchMethodException -> L43
                java.lang.Class<android.graphics.drawable.Drawable> r4 = android.graphics.drawable.Drawable.class
                java.lang.String r5 = "getOpticalInsets"
                java.lang.reflect.Method r4 = r4.getMethod(r5, r1)     // Catch: java.lang.NoSuchFieldException -> L3d java.lang.ClassNotFoundException -> L40 java.lang.NoSuchMethodException -> L43
                java.lang.String r5 = "left"
                java.lang.reflect.Field r5 = r3.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L34 java.lang.ClassNotFoundException -> L37 java.lang.NoSuchMethodException -> L3a
                java.lang.String r6 = "top"
                java.lang.reflect.Field r6 = r3.getField(r6)     // Catch: java.lang.NoSuchFieldException -> L2d java.lang.ClassNotFoundException -> L30 java.lang.NoSuchMethodException -> L32
                java.lang.String r7 = "right"
                java.lang.reflect.Field r7 = r3.getField(r7)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r8 = "bottom"
                java.lang.reflect.Field r3 = r3.getField(r8)     // Catch: java.lang.Throwable -> L46
                r8 = r0
                goto L48
            L2b:
                r7 = r1
                goto L46
            L2d:
                r6 = r1
            L2e:
                r7 = r6
                goto L46
            L30:
                r6 = r1
                goto L2e
            L32:
                r6 = r1
                goto L2e
            L34:
                r5 = r1
            L35:
                r6 = r5
                goto L2e
            L37:
                r5 = r1
            L38:
                r6 = r5
                goto L2e
            L3a:
                r5 = r1
            L3b:
                r6 = r5
                goto L2e
            L3d:
                r4 = r1
                r5 = r4
                goto L35
            L40:
                r4 = r1
                r5 = r4
                goto L38
            L43:
                r4 = r1
                r5 = r4
                goto L3b
            L46:
                r3 = r1
                r8 = r2
            L48:
                if (r8 == 0) goto L57
                androidx.appcompat.widget.C5790y.a.f47261b = r4
                androidx.appcompat.widget.C5790y.a.f47262c = r5
                androidx.appcompat.widget.C5790y.a.f47263d = r6
                androidx.appcompat.widget.C5790y.a.f47264e = r7
                androidx.appcompat.widget.C5790y.a.f47265f = r3
                androidx.appcompat.widget.C5790y.a.f47260a = r0
                goto L63
            L57:
                androidx.appcompat.widget.C5790y.a.f47261b = r1
                androidx.appcompat.widget.C5790y.a.f47262c = r1
                androidx.appcompat.widget.C5790y.a.f47263d = r1
                androidx.appcompat.widget.C5790y.a.f47264e = r1
                androidx.appcompat.widget.C5790y.a.f47265f = r1
                androidx.appcompat.widget.C5790y.a.f47260a = r2
            L63:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C5790y.a.<clinit>():void");
        }

        static Rect a(Drawable drawable) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT < 29 && f47260a) {
                try {
                    Object objInvoke = f47261b.invoke(drawable, null);
                    if (objInvoke != null) {
                        return new Rect(f47262c.getInt(objInvoke), f47263d.getInt(objInvoke), f47264e.getInt(objInvoke), f47265f.getInt(objInvoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return C5790y.f47259c;
        }
    }

    @Deprecated
    public static boolean a(Drawable drawable) {
        return true;
    }

    public static PorterDuff.Mode e(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: androidx.appcompat.widget.y$b */
    static class b {
        static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static Rect d(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return a.a(C13595a.q(drawable));
        }
        Insets insetsA = b.a(drawable);
        return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
    }

    static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29 && i10 < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            c(drawable);
        }
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state != null && state.length != 0) {
            drawable.setState(f47258b);
        } else {
            drawable.setState(f47257a);
        }
        drawable.setState(state);
    }
}
