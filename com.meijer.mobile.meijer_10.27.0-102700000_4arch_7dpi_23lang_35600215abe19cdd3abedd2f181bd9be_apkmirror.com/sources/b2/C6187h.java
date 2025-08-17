package b2;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import com.fullstory.FS;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* renamed from: b2.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6187h {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f59722a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    private static final WeakHashMap<d, SparseArray<c>> f59723b = new WeakHashMap<>(0);

    /* renamed from: c, reason: collision with root package name */
    private static final Object f59724c = new Object();

    /* renamed from: b2.h$d */
    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        final Resources f59728a;

        /* renamed from: b, reason: collision with root package name */
        final Resources.Theme f59729b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f59728a.equals(dVar.f59728a) && o2.c.a(this.f59729b, dVar.f59729b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return o2.c.b(this.f59728a, this.f59729b);
        }

        d(Resources resources, Resources.Theme theme) {
            this.f59728a = resources;
            this.f59729b = theme;
        }
    }

    /* renamed from: b2.h$e */
    public static abstract class e {
        public abstract void f(int i10);

        public abstract void g(Typeface typeface);

        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i10, Handler handler) {
            e(handler).post(new Runnable() { // from class: b2.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f59735a.f(i10);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: b2.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f59733a.g(typeface);
                }
            });
        }
    }

    /* renamed from: b2.h$f */
    public static final class f {

        /* renamed from: b2.h$f$a */
        static class a {

            /* renamed from: a, reason: collision with root package name */
            private static final Object f59730a = new Object();

            /* renamed from: b, reason: collision with root package name */
            private static Method f59731b;

            /* renamed from: c, reason: collision with root package name */
            private static boolean f59732c;

            /* JADX WARN: Removed duplicated region for block: B:31:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @android.annotation.SuppressLint({"BanUncheckedReflection"})
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            static void a(android.content.res.Resources.Theme r6) {
                /*
                    java.lang.Object r0 = b2.C6187h.f.a.f59730a
                    monitor-enter(r0)
                    boolean r1 = b2.C6187h.f.a.f59732c     // Catch: java.lang.Throwable -> L17
                    r2 = 0
                    if (r1 != 0) goto L23
                    r1 = 1
                    java.lang.Class<android.content.res.Resources$Theme> r3 = android.content.res.Resources.Theme.class
                    java.lang.String r4 = "rebase"
                    java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r2)     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    b2.C6187h.f.a.f59731b = r3     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L17 java.lang.NoSuchMethodException -> L19
                    goto L21
                L17:
                    r6 = move-exception
                    goto L39
                L19:
                    r3 = move-exception
                    java.lang.String r4 = "ResourcesCompat"
                    java.lang.String r5 = "Failed to retrieve rebase() method"
                    com.fullstory.FS.log_i(r4, r5, r3)     // Catch: java.lang.Throwable -> L17
                L21:
                    b2.C6187h.f.a.f59732c = r1     // Catch: java.lang.Throwable -> L17
                L23:
                    java.lang.reflect.Method r1 = b2.C6187h.f.a.f59731b     // Catch: java.lang.Throwable -> L17
                    if (r1 == 0) goto L37
                    r1.invoke(r6, r2)     // Catch: java.lang.Throwable -> L17 java.lang.reflect.InvocationTargetException -> L2b java.lang.IllegalAccessException -> L2d
                    goto L37
                L2b:
                    r6 = move-exception
                    goto L2e
                L2d:
                    r6 = move-exception
                L2e:
                    java.lang.String r1 = "ResourcesCompat"
                    java.lang.String r3 = "Failed to invoke rebase() method via reflection"
                    com.fullstory.FS.log_i(r1, r3, r6)     // Catch: java.lang.Throwable -> L17
                    b2.C6187h.f.a.f59731b = r2     // Catch: java.lang.Throwable -> L17
                L37:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                    return
                L39:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: b2.C6187h.f.a.a(android.content.res.Resources$Theme):void");
            }
        }

        /* renamed from: b2.h$f$b */
        static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    /* renamed from: b2.h$a */
    static class a {
        static Drawable a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getDrawable(i10, theme);
        }

        static Drawable b(Resources resources, int i10, int i11, Resources.Theme theme) {
            return resources.getDrawableForDensity(i10, i11, theme);
        }
    }

    /* renamed from: b2.h$b */
    static class b {
        static int a(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColor(i10, theme);
        }

        static ColorStateList b(Resources resources, int i10, Resources.Theme theme) {
            return resources.getColorStateList(i10, theme);
        }
    }

    /* renamed from: b2.h$c */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final ColorStateList f59725a;

        /* renamed from: b, reason: collision with root package name */
        final Configuration f59726b;

        /* renamed from: c, reason: collision with root package name */
        final int f59727c;

        c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            int iHashCode;
            this.f59725a = colorStateList;
            this.f59726b = configuration;
            if (theme == null) {
                iHashCode = 0;
            } else {
                iHashCode = theme.hashCode();
            }
            this.f59727c = iHashCode;
        }
    }

    private static void a(d dVar, int i10, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f59724c) {
            try {
                WeakHashMap<d, SparseArray<c>> weakHashMap = f59723b;
                SparseArray<c> sparseArray = weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i10, new c(colorStateList, dVar.f59728a.getConfiguration(), theme));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f59727c == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.content.res.ColorStateList b(b2.C6187h.d r5, int r6) {
        /*
            java.lang.Object r0 = b2.C6187h.f59724c
            monitor-enter(r0)
            java.util.WeakHashMap<b2.h$d, android.util.SparseArray<b2.h$c>> r1 = b2.C6187h.f59723b     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L32
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L45
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L32
            if (r2 <= 0) goto L45
            java.lang.Object r2 = r1.get(r6)     // Catch: java.lang.Throwable -> L32
            b2.h$c r2 = (b2.C6187h.c) r2     // Catch: java.lang.Throwable -> L32
            if (r2 == 0) goto L45
            android.content.res.Configuration r3 = r2.f59726b     // Catch: java.lang.Throwable -> L32
            android.content.res.Resources r4 = r5.f59728a     // Catch: java.lang.Throwable -> L32
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L32
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L42
            android.content.res.Resources$Theme r5 = r5.f59729b     // Catch: java.lang.Throwable -> L32
            if (r5 != 0) goto L34
            int r3 = r2.f59727c     // Catch: java.lang.Throwable -> L32
            if (r3 == 0) goto L3e
            goto L34
        L32:
            r5 = move-exception
            goto L48
        L34:
            if (r5 == 0) goto L42
            int r3 = r2.f59727c     // Catch: java.lang.Throwable -> L32
            int r5 = r5.hashCode()     // Catch: java.lang.Throwable -> L32
            if (r3 != r5) goto L42
        L3e:
            android.content.res.ColorStateList r5 = r2.f59725a     // Catch: java.lang.Throwable -> L32
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return r5
        L42:
            r1.remove(r6)     // Catch: java.lang.Throwable -> L32
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r5 = 0
            return r5
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C6187h.b(b2.h$d, int):android.content.res.ColorStateList");
    }

    public static ColorStateList e(Resources resources, int i10, Resources.Theme theme) throws Resources.NotFoundException {
        d dVar = new d(resources, theme);
        ColorStateList colorStateListB = b(dVar, i10);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        ColorStateList colorStateListL = l(resources, i10, theme);
        if (colorStateListL == null) {
            return b.b(resources, i10, theme);
        }
        a(dVar, i10, colorStateListL, theme);
        return colorStateListL;
    }

    private static TypedValue k() {
        ThreadLocal<TypedValue> threadLocal = f59722a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Typeface o(android.content.Context r13, android.content.res.Resources r14, android.util.TypedValue r15, int r16, int r17, b2.C6187h.e r18, android.os.Handler r19, boolean r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.C6187h.o(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, b2.h$e, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }

    public static Typeface c(Context context, int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i10, new TypedValue(), 0, null, null, false, true);
    }

    public static int d(Resources resources, int i10, Resources.Theme theme) throws Resources.NotFoundException {
        return b.a(resources, i10, theme);
    }

    public static Drawable f(Resources resources, int i10, Resources.Theme theme) throws Resources.NotFoundException {
        return a.a(resources, i10, theme);
    }

    public static Drawable g(Resources resources, int i10, int i11, Resources.Theme theme) throws Resources.NotFoundException {
        return a.b(resources, i10, i11, theme);
    }

    public static Typeface h(Context context, int i10) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i10, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface i(Context context, int i10, TypedValue typedValue, int i11, e eVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return n(context, i10, typedValue, i11, eVar, null, true, false);
    }

    public static void j(Context context, int i10, e eVar, Handler handler) throws Resources.NotFoundException {
        o2.i.g(eVar);
        if (context.isRestricted()) {
            eVar.c(-4, handler);
        } else {
            n(context, i10, new TypedValue(), 0, eVar, handler, false, false);
        }
    }

    private static ColorStateList l(Resources resources, int i10, Resources.Theme theme) {
        if (m(resources, i10)) {
            return null;
        }
        try {
            return C6182c.a(resources, resources.getXml(i10), theme);
        } catch (Exception e10) {
            FS.log_w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
            return null;
        }
    }

    private static boolean m(Resources resources, int i10) throws Resources.NotFoundException {
        TypedValue typedValueK = k();
        resources.getValue(i10, typedValueK, true);
        int i11 = typedValueK.type;
        if (i11 >= 28 && i11 <= 31) {
            return true;
        }
        return false;
    }

    private static Typeface n(Context context, int i10, TypedValue typedValue, int i11, e eVar, Handler handler, boolean z10, boolean z11) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        resources.getValue(i10, typedValue, true);
        Typeface typefaceO = o(context, resources, typedValue, i10, i11, eVar, handler, z10, z11);
        if (typefaceO == null && eVar == null && !z11) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i10) + " could not be retrieved.");
        }
        return typefaceO;
    }
}
