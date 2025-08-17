package androidx.core.view;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.fullstory.FS;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import p2.B0;

/* loaded from: classes.dex */
public class j {

    /* renamed from: b, reason: collision with root package name */
    public static final j f53969b;

    /* renamed from: a, reason: collision with root package name */
    private final m f53970a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final f f53971a;

        public a() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f53971a = new e();
                return;
            }
            if (i10 >= 30) {
                this.f53971a = new d();
            } else if (i10 >= 29) {
                this.f53971a = new c();
            } else {
                this.f53971a = new b();
            }
        }

        public j a() {
            return this.f53971a.b();
        }

        public a b(int i10, c2.d dVar) {
            this.f53971a.c(i10, dVar);
            return this;
        }

        @Deprecated
        public a c(c2.d dVar) {
            this.f53971a.e(dVar);
            return this;
        }

        @Deprecated
        public a d(c2.d dVar) {
            this.f53971a.g(dVar);
            return this;
        }

        public a(j jVar) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f53971a = new e(jVar);
                return;
            }
            if (i10 >= 30) {
                this.f53971a = new d(jVar);
            } else if (i10 >= 29) {
                this.f53971a = new c(jVar);
            } else {
                this.f53971a = new b(jVar);
            }
        }
    }

    private static class b extends f {

        /* renamed from: e, reason: collision with root package name */
        private static Field f53972e;

        /* renamed from: f, reason: collision with root package name */
        private static boolean f53973f;

        /* renamed from: g, reason: collision with root package name */
        private static Constructor<WindowInsets> f53974g;

        /* renamed from: h, reason: collision with root package name */
        private static boolean f53975h;

        /* renamed from: c, reason: collision with root package name */
        private WindowInsets f53976c;

        /* renamed from: d, reason: collision with root package name */
        private c2.d f53977d;

        b() {
            this.f53976c = i();
        }

        private static WindowInsets i() {
            if (!f53973f) {
                try {
                    f53972e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    FS.log_i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f53973f = true;
            }
            Field field = f53972e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    FS.log_i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f53975h) {
                try {
                    f53974g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    FS.log_i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f53975h = true;
            }
            Constructor<WindowInsets> constructor = f53974g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    FS.log_i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // androidx.core.view.j.f
        void e(c2.d dVar) {
            this.f53977d = dVar;
        }

        @Override // androidx.core.view.j.f
        void g(c2.d dVar) {
            WindowInsets windowInsets = this.f53976c;
            if (windowInsets != null) {
                this.f53976c = windowInsets.replaceSystemWindowInsets(dVar.f61362a, dVar.f61363b, dVar.f61364c, dVar.f61365d);
            }
        }

        b(j jVar) {
            super(jVar);
            this.f53976c = jVar.A();
        }

        @Override // androidx.core.view.j.f
        j b() {
            a();
            j jVarB = j.B(this.f53976c);
            jVarB.v(this.f53980b);
            jVarB.y(this.f53977d);
            return jVarB;
        }
    }

    private static class c extends f {

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f53978c;

        c() {
            this.f53978c = l2.e.a();
        }

        @Override // androidx.core.view.j.f
        void d(c2.d dVar) {
            this.f53978c.setMandatorySystemGestureInsets(dVar.e());
        }

        @Override // androidx.core.view.j.f
        void e(c2.d dVar) {
            this.f53978c.setStableInsets(dVar.e());
        }

        @Override // androidx.core.view.j.f
        void f(c2.d dVar) {
            this.f53978c.setSystemGestureInsets(dVar.e());
        }

        @Override // androidx.core.view.j.f
        void g(c2.d dVar) {
            this.f53978c.setSystemWindowInsets(dVar.e());
        }

        @Override // androidx.core.view.j.f
        void h(c2.d dVar) {
            this.f53978c.setTappableElementInsets(dVar.e());
        }

        c(j jVar) {
            WindowInsets.Builder builderA;
            super(jVar);
            WindowInsets windowInsetsA = jVar.A();
            if (windowInsetsA != null) {
                builderA = B0.a(windowInsetsA);
            } else {
                builderA = l2.e.a();
            }
            this.f53978c = builderA;
        }

        @Override // androidx.core.view.j.f
        j b() {
            a();
            j jVarB = j.B(this.f53978c.build());
            jVarB.v(this.f53980b);
            return jVarB;
        }
    }

    private static class d extends c {
        d() {
        }

        d(j jVar) {
            super(jVar);
        }

        @Override // androidx.core.view.j.f
        void c(int i10, c2.d dVar) {
            this.f53978c.setInsets(o.a(i10), dVar.e());
        }
    }

    private static class e extends d {
        e() {
        }

        e(j jVar) {
            super(jVar);
        }

        @Override // androidx.core.view.j.d, androidx.core.view.j.f
        void c(int i10, c2.d dVar) {
            this.f53978c.setInsets(p.a(i10), dVar.e());
        }
    }

    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private final j f53979a;

        /* renamed from: b, reason: collision with root package name */
        c2.d[] f53980b;

        f() {
            this(new j((j) null));
        }

        j b() {
            throw null;
        }

        void d(c2.d dVar) {
        }

        void e(c2.d dVar) {
            throw null;
        }

        void f(c2.d dVar) {
        }

        void g(c2.d dVar) {
            throw null;
        }

        void h(c2.d dVar) {
        }

        f(j jVar) {
            this.f53979a = jVar;
        }

        protected final void a() {
            c2.d[] dVarArr = this.f53980b;
            if (dVarArr != null) {
                c2.d dVarF = dVarArr[n.e(1)];
                c2.d dVarF2 = this.f53980b[n.e(2)];
                if (dVarF2 == null) {
                    dVarF2 = this.f53979a.f(2);
                }
                if (dVarF == null) {
                    dVarF = this.f53979a.f(1);
                }
                g(c2.d.a(dVarF, dVarF2));
                c2.d dVar = this.f53980b[n.e(16)];
                if (dVar != null) {
                    f(dVar);
                }
                c2.d dVar2 = this.f53980b[n.e(32)];
                if (dVar2 != null) {
                    d(dVar2);
                }
                c2.d dVar3 = this.f53980b[n.e(64)];
                if (dVar3 != null) {
                    h(dVar3);
                }
            }
        }

        void c(int i10, c2.d dVar) {
            if (this.f53980b == null) {
                this.f53980b = new c2.d[10];
            }
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f53980b[n.e(i11)] = dVar;
                }
            }
        }
    }

    private static class g extends m {

        /* renamed from: i, reason: collision with root package name */
        private static boolean f53981i;

        /* renamed from: j, reason: collision with root package name */
        private static Method f53982j;

        /* renamed from: k, reason: collision with root package name */
        private static Class<?> f53983k;

        /* renamed from: l, reason: collision with root package name */
        private static Field f53984l;

        /* renamed from: m, reason: collision with root package name */
        private static Field f53985m;

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets f53986c;

        /* renamed from: d, reason: collision with root package name */
        private c2.d[] f53987d;

        /* renamed from: e, reason: collision with root package name */
        private c2.d f53988e;

        /* renamed from: f, reason: collision with root package name */
        private j f53989f;

        /* renamed from: g, reason: collision with root package name */
        c2.d f53990g;

        /* renamed from: h, reason: collision with root package name */
        int f53991h;

        g(j jVar, WindowInsets windowInsets) {
            super(jVar);
            this.f53988e = null;
            this.f53986c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        private static void B() throws ClassNotFoundException, SecurityException {
            try {
                f53982j = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f53983k = cls;
                f53984l = cls.getDeclaredField("mVisibleInsets");
                f53985m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f53984l.setAccessible(true);
                f53985m.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                FS.log_e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f53981i = true;
        }

        static boolean C(int i10, int i11) {
            return (i10 & 6) == (i11 & 6);
        }

        protected boolean A(int i10) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 8 && i10 != 128) {
                    return true;
                }
            }
            return !x(i10, false).equals(c2.d.f61361e);
        }

        @Override // androidx.core.view.j.m
        public c2.d g(int i10) {
            return w(i10, false);
        }

        @Override // androidx.core.view.j.m
        public c2.d h(int i10) {
            return w(i10, true);
        }

        @Override // androidx.core.view.j.m
        @SuppressLint({"WrongConstant"})
        boolean q(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0 && !A(i11)) {
                    return false;
                }
            }
            return true;
        }

        protected c2.d x(int i10, boolean z10) {
            c2.d dVarH;
            int i11;
            if (i10 == 1) {
                return z10 ? c2.d.b(0, Math.max(y().f61363b, l().f61363b), 0, 0) : (this.f53991h & 4) != 0 ? c2.d.f61361e : c2.d.b(0, l().f61363b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    c2.d dVarY = y();
                    c2.d dVarJ = j();
                    return c2.d.b(Math.max(dVarY.f61362a, dVarJ.f61362a), 0, Math.max(dVarY.f61364c, dVarJ.f61364c), Math.max(dVarY.f61365d, dVarJ.f61365d));
                }
                if ((this.f53991h & 2) != 0) {
                    return c2.d.f61361e;
                }
                c2.d dVarL = l();
                j jVar = this.f53989f;
                dVarH = jVar != null ? jVar.h() : null;
                int iMin = dVarL.f61365d;
                if (dVarH != null) {
                    iMin = Math.min(iMin, dVarH.f61365d);
                }
                return c2.d.b(dVarL.f61362a, 0, dVarL.f61364c, iMin);
            }
            if (i10 != 8) {
                if (i10 == 16) {
                    return k();
                }
                if (i10 == 32) {
                    return i();
                }
                if (i10 == 64) {
                    return m();
                }
                if (i10 != 128) {
                    return c2.d.f61361e;
                }
                j jVar2 = this.f53989f;
                androidx.core.view.b bVarE = jVar2 != null ? jVar2.e() : f();
                return bVarE != null ? c2.d.b(bVarE.b(), bVarE.d(), bVarE.c(), bVarE.a()) : c2.d.f61361e;
            }
            c2.d[] dVarArr = this.f53987d;
            dVarH = dVarArr != null ? dVarArr[n.e(8)] : null;
            if (dVarH != null) {
                return dVarH;
            }
            c2.d dVarL2 = l();
            c2.d dVarY2 = y();
            int i12 = dVarL2.f61365d;
            if (i12 > dVarY2.f61365d) {
                return c2.d.b(0, 0, 0, i12);
            }
            c2.d dVar = this.f53990g;
            return (dVar == null || dVar.equals(c2.d.f61361e) || (i11 = this.f53990g.f61365d) <= dVarY2.f61365d) ? c2.d.f61361e : c2.d.b(0, 0, 0, i11);
        }

        @SuppressLint({"WrongConstant"})
        private c2.d w(int i10, boolean z10) {
            c2.d dVarA = c2.d.f61361e;
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    dVarA = c2.d.a(dVarA, x(i11, z10));
                }
            }
            return dVarA;
        }

        private c2.d y() {
            j jVar = this.f53989f;
            return jVar != null ? jVar.h() : c2.d.f61361e;
        }

        private c2.d z(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f53981i) {
                B();
            }
            Method method = f53982j;
            if (method != null && f53983k != null && f53984l != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        FS.log_w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f53984l.get(f53985m.get(objInvoke));
                    if (rect != null) {
                        return c2.d.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    FS.log_e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        @Override // androidx.core.view.j.m
        void e(j jVar) {
            jVar.x(this.f53989f);
            jVar.w(this.f53990g);
            jVar.z(this.f53991h);
        }

        @Override // androidx.core.view.j.m
        final c2.d l() {
            if (this.f53988e == null) {
                this.f53988e = c2.d.b(this.f53986c.getSystemWindowInsetLeft(), this.f53986c.getSystemWindowInsetTop(), this.f53986c.getSystemWindowInsetRight(), this.f53986c.getSystemWindowInsetBottom());
            }
            return this.f53988e;
        }

        @Override // androidx.core.view.j.m
        j n(int i10, int i11, int i12, int i13) {
            a aVar = new a(j.B(this.f53986c));
            aVar.d(j.r(l(), i10, i11, i12, i13));
            aVar.c(j.r(j(), i10, i11, i12, i13));
            return aVar.a();
        }

        @Override // androidx.core.view.j.m
        boolean p() {
            return this.f53986c.isRound();
        }

        @Override // androidx.core.view.j.m
        public void r(c2.d[] dVarArr) {
            this.f53987d = dVarArr;
        }

        @Override // androidx.core.view.j.m
        void s(c2.d dVar) {
            this.f53990g = dVar;
        }

        @Override // androidx.core.view.j.m
        void t(j jVar) {
            this.f53989f = jVar;
        }

        @Override // androidx.core.view.j.m
        void v(int i10) {
            this.f53991h = i10;
        }

        @Override // androidx.core.view.j.m
        void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            c2.d dVarZ = z(view);
            if (dVarZ == null) {
                dVarZ = c2.d.f61361e;
            }
            s(dVarZ);
        }

        @Override // androidx.core.view.j.m
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            g gVar = (g) obj;
            if (!Objects.equals(this.f53990g, gVar.f53990g) || !C(this.f53991h, gVar.f53991h)) {
                return false;
            }
            return true;
        }

        g(j jVar, g gVar) {
            this(jVar, new WindowInsets(gVar.f53986c));
        }
    }

    private static class h extends g {

        /* renamed from: n, reason: collision with root package name */
        private c2.d f53992n;

        h(j jVar, WindowInsets windowInsets) {
            super(jVar, windowInsets);
            this.f53992n = null;
        }

        @Override // androidx.core.view.j.m
        j b() {
            return j.B(this.f53986c.consumeStableInsets());
        }

        @Override // androidx.core.view.j.m
        j c() {
            return j.B(this.f53986c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.j.m
        final c2.d j() {
            if (this.f53992n == null) {
                this.f53992n = c2.d.b(this.f53986c.getStableInsetLeft(), this.f53986c.getStableInsetTop(), this.f53986c.getStableInsetRight(), this.f53986c.getStableInsetBottom());
            }
            return this.f53992n;
        }

        @Override // androidx.core.view.j.m
        boolean o() {
            return this.f53986c.isConsumed();
        }

        @Override // androidx.core.view.j.m
        public void u(c2.d dVar) {
            this.f53992n = dVar;
        }

        h(j jVar, h hVar) {
            super(jVar, hVar);
            this.f53992n = null;
            this.f53992n = hVar.f53992n;
        }
    }

    private static class i extends h {
        i(j jVar, WindowInsets windowInsets) {
            super(jVar, windowInsets);
        }

        @Override // androidx.core.view.j.g, androidx.core.view.j.m
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f53986c, iVar.f53986c) && Objects.equals(this.f53990g, iVar.f53990g) && g.C(this.f53991h, iVar.f53991h);
        }

        i(j jVar, i iVar) {
            super(jVar, iVar);
        }

        @Override // androidx.core.view.j.m
        j a() {
            return j.B(this.f53986c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.j.m
        androidx.core.view.b f() {
            return androidx.core.view.b.f(this.f53986c.getDisplayCutout());
        }

        @Override // androidx.core.view.j.m
        public int hashCode() {
            return this.f53986c.hashCode();
        }
    }

    /* renamed from: androidx.core.view.j$j, reason: collision with other inner class name */
    private static class C1100j extends i {

        /* renamed from: o, reason: collision with root package name */
        private c2.d f53993o;

        /* renamed from: p, reason: collision with root package name */
        private c2.d f53994p;

        /* renamed from: q, reason: collision with root package name */
        private c2.d f53995q;

        C1100j(j jVar, WindowInsets windowInsets) {
            super(jVar, windowInsets);
            this.f53993o = null;
            this.f53994p = null;
            this.f53995q = null;
        }

        @Override // androidx.core.view.j.h, androidx.core.view.j.m
        public void u(c2.d dVar) {
        }

        @Override // androidx.core.view.j.m
        c2.d i() {
            if (this.f53994p == null) {
                this.f53994p = c2.d.d(this.f53986c.getMandatorySystemGestureInsets());
            }
            return this.f53994p;
        }

        @Override // androidx.core.view.j.m
        c2.d k() {
            if (this.f53993o == null) {
                this.f53993o = c2.d.d(this.f53986c.getSystemGestureInsets());
            }
            return this.f53993o;
        }

        @Override // androidx.core.view.j.m
        c2.d m() {
            if (this.f53995q == null) {
                this.f53995q = c2.d.d(this.f53986c.getTappableElementInsets());
            }
            return this.f53995q;
        }

        @Override // androidx.core.view.j.g, androidx.core.view.j.m
        j n(int i10, int i11, int i12, int i13) {
            return j.B(this.f53986c.inset(i10, i11, i12, i13));
        }

        C1100j(j jVar, C1100j c1100j) {
            super(jVar, c1100j);
            this.f53993o = null;
            this.f53994p = null;
            this.f53995q = null;
        }
    }

    private static class k extends C1100j {

        /* renamed from: r, reason: collision with root package name */
        static final j f53996r = j.B(WindowInsets.CONSUMED);

        k(j jVar, WindowInsets windowInsets) {
            super(jVar, windowInsets);
        }

        @Override // androidx.core.view.j.g, androidx.core.view.j.m
        final void d(View view) {
        }

        k(j jVar, k kVar) {
            super(jVar, kVar);
        }

        @Override // androidx.core.view.j.g, androidx.core.view.j.m
        public c2.d g(int i10) {
            return c2.d.d(this.f53986c.getInsets(o.a(i10)));
        }

        @Override // androidx.core.view.j.g, androidx.core.view.j.m
        public c2.d h(int i10) {
            return c2.d.d(this.f53986c.getInsetsIgnoringVisibility(o.a(i10)));
        }

        @Override // androidx.core.view.j.g, androidx.core.view.j.m
        public boolean q(int i10) {
            return this.f53986c.isVisible(o.a(i10));
        }
    }

    private static class l extends k {

        /* renamed from: s, reason: collision with root package name */
        static final j f53997s = j.B(WindowInsets.CONSUMED);

        l(j jVar, WindowInsets windowInsets) {
            super(jVar, windowInsets);
        }

        l(j jVar, l lVar) {
            super(jVar, lVar);
        }

        @Override // androidx.core.view.j.k, androidx.core.view.j.g, androidx.core.view.j.m
        public c2.d g(int i10) {
            return c2.d.d(this.f53986c.getInsets(p.a(i10)));
        }

        @Override // androidx.core.view.j.k, androidx.core.view.j.g, androidx.core.view.j.m
        public c2.d h(int i10) {
            return c2.d.d(this.f53986c.getInsetsIgnoringVisibility(p.a(i10)));
        }

        @Override // androidx.core.view.j.k, androidx.core.view.j.g, androidx.core.view.j.m
        public boolean q(int i10) {
            return this.f53986c.isVisible(p.a(i10));
        }
    }

    private static class m {

        /* renamed from: b, reason: collision with root package name */
        static final j f53998b = new a().a().a().b().c();

        /* renamed from: a, reason: collision with root package name */
        final j f53999a;

        void d(View view) {
        }

        void e(j jVar) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return p() == mVar.p() && o() == mVar.o() && o2.c.a(l(), mVar.l()) && o2.c.a(j(), mVar.j()) && o2.c.a(f(), mVar.f());
        }

        androidx.core.view.b f() {
            return null;
        }

        boolean o() {
            return false;
        }

        boolean p() {
            return false;
        }

        boolean q(int i10) {
            return true;
        }

        public void r(c2.d[] dVarArr) {
        }

        void s(c2.d dVar) {
        }

        void t(j jVar) {
        }

        public void u(c2.d dVar) {
        }

        void v(int i10) {
        }

        j a() {
            return this.f53999a;
        }

        j b() {
            return this.f53999a;
        }

        j c() {
            return this.f53999a;
        }

        c2.d g(int i10) {
            return c2.d.f61361e;
        }

        c2.d h(int i10) {
            if ((i10 & 8) == 0) {
                return c2.d.f61361e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        c2.d j() {
            return c2.d.f61361e;
        }

        c2.d l() {
            return c2.d.f61361e;
        }

        j n(int i10, int i11, int i12, int i13) {
            return f53998b;
        }

        m(j jVar) {
            this.f53999a = jVar;
        }

        public int hashCode() {
            return o2.c.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        c2.d i() {
            return l();
        }

        c2.d k() {
            return l();
        }

        c2.d m() {
            return l();
        }
    }

    public static final class n {
        @SuppressLint({"WrongConstant"})
        static int a() {
            return -1;
        }

        public static int b() {
            return 4;
        }

        public static int c() {
            return 128;
        }

        public static int d() {
            return 8;
        }

        static int e(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            if (i10 == 512) {
                return 9;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i10);
        }

        public static int f() {
            return 32;
        }

        public static int g() {
            return 2;
        }

        public static int h() {
            return 1;
        }

        public static int i() {
            return 519;
        }

        public static int j() {
            return 16;
        }

        public static int k() {
            return 64;
        }
    }

    private static final class o {
        static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    private static final class p {
        static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    } else if (i12 == 512) {
                        iStatusBars = WindowInsets.Type.systemOverlays();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    private j(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            this.f53970a = new l(this, windowInsets);
            return;
        }
        if (i10 >= 30) {
            this.f53970a = new k(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f53970a = new C1100j(this, windowInsets);
        } else if (i10 >= 28) {
            this.f53970a = new i(this, windowInsets);
        } else {
            this.f53970a = new h(this, windowInsets);
        }
    }

    public static j B(WindowInsets windowInsets) {
        return C(windowInsets, null);
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f53969b = l.f53997s;
        } else if (i10 >= 30) {
            f53969b = k.f53996r;
        } else {
            f53969b = m.f53998b;
        }
    }

    public static j C(WindowInsets windowInsets, View view) {
        j jVar = new j((WindowInsets) o2.i.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            jVar.x(ViewCompat.G(view));
            jVar.d(view.getRootView());
            jVar.z(view.getWindowSystemUiVisibility());
        }
        return jVar;
    }

    static c2.d r(c2.d dVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, dVar.f61362a - i10);
        int iMax2 = Math.max(0, dVar.f61363b - i11);
        int iMax3 = Math.max(0, dVar.f61364c - i12);
        int iMax4 = Math.max(0, dVar.f61365d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? dVar : c2.d.b(iMax, iMax2, iMax3, iMax4);
    }

    public WindowInsets A() {
        m mVar = this.f53970a;
        if (mVar instanceof g) {
            return ((g) mVar).f53986c;
        }
        return null;
    }

    @Deprecated
    public j a() {
        return this.f53970a.a();
    }

    @Deprecated
    public j b() {
        return this.f53970a.b();
    }

    @Deprecated
    public j c() {
        return this.f53970a.c();
    }

    void d(View view) {
        this.f53970a.d(view);
    }

    public androidx.core.view.b e() {
        return this.f53970a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return o2.c.a(this.f53970a, ((j) obj).f53970a);
        }
        return false;
    }

    public c2.d f(int i10) {
        return this.f53970a.g(i10);
    }

    public c2.d g(int i10) {
        return this.f53970a.h(i10);
    }

    @Deprecated
    public c2.d h() {
        return this.f53970a.j();
    }

    public int hashCode() {
        m mVar = this.f53970a;
        if (mVar == null) {
            return 0;
        }
        return mVar.hashCode();
    }

    @Deprecated
    public c2.d i() {
        return this.f53970a.k();
    }

    @Deprecated
    public int j() {
        return this.f53970a.l().f61365d;
    }

    @Deprecated
    public int k() {
        return this.f53970a.l().f61362a;
    }

    @Deprecated
    public int l() {
        return this.f53970a.l().f61364c;
    }

    @Deprecated
    public int m() {
        return this.f53970a.l().f61363b;
    }

    @Deprecated
    public c2.d n() {
        return this.f53970a.l();
    }

    @Deprecated
    public boolean p() {
        return !this.f53970a.l().equals(c2.d.f61361e);
    }

    public j q(int i10, int i11, int i12, int i13) {
        return this.f53970a.n(i10, i11, i12, i13);
    }

    public boolean s() {
        return this.f53970a.o();
    }

    public boolean t(int i10) {
        return this.f53970a.q(i10);
    }

    @Deprecated
    public j u(int i10, int i11, int i12, int i13) {
        return new a(this).d(c2.d.b(i10, i11, i12, i13)).a();
    }

    void v(c2.d[] dVarArr) {
        this.f53970a.r(dVarArr);
    }

    void w(c2.d dVar) {
        this.f53970a.s(dVar);
    }

    void x(j jVar) {
        this.f53970a.t(jVar);
    }

    void y(c2.d dVar) {
        this.f53970a.u(dVar);
    }

    void z(int i10) {
        this.f53970a.v(i10);
    }

    public boolean o() {
        c2.d dVarF = f(n.a());
        c2.d dVar = c2.d.f61361e;
        if (dVarF.equals(dVar) && g(n.a() ^ n.d()).equals(dVar) && e() == null) {
            return false;
        }
        return true;
    }

    public j(j jVar) {
        if (jVar != null) {
            m mVar = jVar.f53970a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34 && (mVar instanceof l)) {
                this.f53970a = new l(this, (l) mVar);
            } else if (i10 >= 30 && (mVar instanceof k)) {
                this.f53970a = new k(this, (k) mVar);
            } else if (i10 >= 29 && (mVar instanceof C1100j)) {
                this.f53970a = new C1100j(this, (C1100j) mVar);
            } else if (i10 >= 28 && (mVar instanceof i)) {
                this.f53970a = new i(this, (i) mVar);
            } else if (mVar instanceof h) {
                this.f53970a = new h(this, (h) mVar);
            } else if (mVar instanceof g) {
                this.f53970a = new g(this, (g) mVar);
            } else {
                this.f53970a = new m(this);
            }
            mVar.e(this);
            return;
        }
        this.f53970a = new m(this);
    }
}
