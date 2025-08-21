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
    public static final j f54193b;

    /* renamed from: a, reason: collision with root package name */
    private final m f54194a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final f f54195a;

        public a() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f54195a = new e();
                return;
            }
            if (i10 >= 30) {
                this.f54195a = new d();
            } else if (i10 >= 29) {
                this.f54195a = new c();
            } else {
                this.f54195a = new b();
            }
        }

        public j a() {
            return this.f54195a.b();
        }

        public a b(int i10, c2.d dVar) {
            this.f54195a.c(i10, dVar);
            return this;
        }

        @Deprecated
        public a c(c2.d dVar) {
            this.f54195a.e(dVar);
            return this;
        }

        @Deprecated
        public a d(c2.d dVar) {
            this.f54195a.g(dVar);
            return this;
        }

        public a(j jVar) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34) {
                this.f54195a = new e(jVar);
                return;
            }
            if (i10 >= 30) {
                this.f54195a = new d(jVar);
            } else if (i10 >= 29) {
                this.f54195a = new c(jVar);
            } else {
                this.f54195a = new b(jVar);
            }
        }
    }

    private static class b extends f {

        /* renamed from: e, reason: collision with root package name */
        private static Field f54196e;

        /* renamed from: f, reason: collision with root package name */
        private static boolean f54197f;

        /* renamed from: g, reason: collision with root package name */
        private static Constructor<WindowInsets> f54198g;

        /* renamed from: h, reason: collision with root package name */
        private static boolean f54199h;

        /* renamed from: c, reason: collision with root package name */
        private WindowInsets f54200c;

        /* renamed from: d, reason: collision with root package name */
        private c2.d f54201d;

        b() {
            this.f54200c = i();
        }

        private static WindowInsets i() {
            if (!f54197f) {
                try {
                    f54196e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    FS.log_i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f54197f = true;
            }
            Field field = f54196e;
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
            if (!f54199h) {
                try {
                    f54198g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    FS.log_i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f54199h = true;
            }
            Constructor<WindowInsets> constructor = f54198g;
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
            this.f54201d = dVar;
        }

        @Override // androidx.core.view.j.f
        void g(c2.d dVar) {
            WindowInsets windowInsets = this.f54200c;
            if (windowInsets != null) {
                this.f54200c = windowInsets.replaceSystemWindowInsets(dVar.f61161a, dVar.f61162b, dVar.f61163c, dVar.f61164d);
            }
        }

        b(j jVar) {
            super(jVar);
            this.f54200c = jVar.A();
        }

        @Override // androidx.core.view.j.f
        j b() {
            a();
            j jVarB = j.B(this.f54200c);
            jVarB.v(this.f54204b);
            jVarB.y(this.f54201d);
            return jVarB;
        }
    }

    private static class c extends f {

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets.Builder f54202c;

        c() {
            this.f54202c = l2.e.a();
        }

        @Override // androidx.core.view.j.f
        void d(c2.d dVar) {
            this.f54202c.setMandatorySystemGestureInsets(dVar.e());
        }

        @Override // androidx.core.view.j.f
        void e(c2.d dVar) {
            this.f54202c.setStableInsets(dVar.e());
        }

        @Override // androidx.core.view.j.f
        void f(c2.d dVar) {
            this.f54202c.setSystemGestureInsets(dVar.e());
        }

        @Override // androidx.core.view.j.f
        void g(c2.d dVar) {
            this.f54202c.setSystemWindowInsets(dVar.e());
        }

        @Override // androidx.core.view.j.f
        void h(c2.d dVar) {
            this.f54202c.setTappableElementInsets(dVar.e());
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
            this.f54202c = builderA;
        }

        @Override // androidx.core.view.j.f
        j b() {
            a();
            j jVarB = j.B(this.f54202c.build());
            jVarB.v(this.f54204b);
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
            this.f54202c.setInsets(o.a(i10), dVar.e());
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
            this.f54202c.setInsets(p.a(i10), dVar.e());
        }
    }

    private static class f {

        /* renamed from: a, reason: collision with root package name */
        private final j f54203a;

        /* renamed from: b, reason: collision with root package name */
        c2.d[] f54204b;

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
            this.f54203a = jVar;
        }

        protected final void a() {
            c2.d[] dVarArr = this.f54204b;
            if (dVarArr != null) {
                c2.d dVarF = dVarArr[n.e(1)];
                c2.d dVarF2 = this.f54204b[n.e(2)];
                if (dVarF2 == null) {
                    dVarF2 = this.f54203a.f(2);
                }
                if (dVarF == null) {
                    dVarF = this.f54203a.f(1);
                }
                g(c2.d.a(dVarF, dVarF2));
                c2.d dVar = this.f54204b[n.e(16)];
                if (dVar != null) {
                    f(dVar);
                }
                c2.d dVar2 = this.f54204b[n.e(32)];
                if (dVar2 != null) {
                    d(dVar2);
                }
                c2.d dVar3 = this.f54204b[n.e(64)];
                if (dVar3 != null) {
                    h(dVar3);
                }
            }
        }

        void c(int i10, c2.d dVar) {
            if (this.f54204b == null) {
                this.f54204b = new c2.d[10];
            }
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f54204b[n.e(i11)] = dVar;
                }
            }
        }
    }

    private static class g extends m {

        /* renamed from: i, reason: collision with root package name */
        private static boolean f54205i;

        /* renamed from: j, reason: collision with root package name */
        private static Method f54206j;

        /* renamed from: k, reason: collision with root package name */
        private static Class<?> f54207k;

        /* renamed from: l, reason: collision with root package name */
        private static Field f54208l;

        /* renamed from: m, reason: collision with root package name */
        private static Field f54209m;

        /* renamed from: c, reason: collision with root package name */
        final WindowInsets f54210c;

        /* renamed from: d, reason: collision with root package name */
        private c2.d[] f54211d;

        /* renamed from: e, reason: collision with root package name */
        private c2.d f54212e;

        /* renamed from: f, reason: collision with root package name */
        private j f54213f;

        /* renamed from: g, reason: collision with root package name */
        c2.d f54214g;

        /* renamed from: h, reason: collision with root package name */
        int f54215h;

        g(j jVar, WindowInsets windowInsets) {
            super(jVar);
            this.f54212e = null;
            this.f54210c = windowInsets;
        }

        @SuppressLint({"PrivateApi"})
        private static void B() throws ClassNotFoundException, SecurityException {
            try {
                f54206j = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f54207k = cls;
                f54208l = cls.getDeclaredField("mVisibleInsets");
                f54209m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f54208l.setAccessible(true);
                f54209m.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                FS.log_e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f54205i = true;
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
            return !x(i10, false).equals(c2.d.f61160e);
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
                return z10 ? c2.d.b(0, Math.max(y().f61162b, l().f61162b), 0, 0) : (this.f54215h & 4) != 0 ? c2.d.f61160e : c2.d.b(0, l().f61162b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    c2.d dVarY = y();
                    c2.d dVarJ = j();
                    return c2.d.b(Math.max(dVarY.f61161a, dVarJ.f61161a), 0, Math.max(dVarY.f61163c, dVarJ.f61163c), Math.max(dVarY.f61164d, dVarJ.f61164d));
                }
                if ((this.f54215h & 2) != 0) {
                    return c2.d.f61160e;
                }
                c2.d dVarL = l();
                j jVar = this.f54213f;
                dVarH = jVar != null ? jVar.h() : null;
                int iMin = dVarL.f61164d;
                if (dVarH != null) {
                    iMin = Math.min(iMin, dVarH.f61164d);
                }
                return c2.d.b(dVarL.f61161a, 0, dVarL.f61163c, iMin);
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
                    return c2.d.f61160e;
                }
                j jVar2 = this.f54213f;
                androidx.core.view.b bVarE = jVar2 != null ? jVar2.e() : f();
                return bVarE != null ? c2.d.b(bVarE.b(), bVarE.d(), bVarE.c(), bVarE.a()) : c2.d.f61160e;
            }
            c2.d[] dVarArr = this.f54211d;
            dVarH = dVarArr != null ? dVarArr[n.e(8)] : null;
            if (dVarH != null) {
                return dVarH;
            }
            c2.d dVarL2 = l();
            c2.d dVarY2 = y();
            int i12 = dVarL2.f61164d;
            if (i12 > dVarY2.f61164d) {
                return c2.d.b(0, 0, 0, i12);
            }
            c2.d dVar = this.f54214g;
            return (dVar == null || dVar.equals(c2.d.f61160e) || (i11 = this.f54214g.f61164d) <= dVarY2.f61164d) ? c2.d.f61160e : c2.d.b(0, 0, 0, i11);
        }

        @SuppressLint({"WrongConstant"})
        private c2.d w(int i10, boolean z10) {
            c2.d dVarA = c2.d.f61160e;
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    dVarA = c2.d.a(dVarA, x(i11, z10));
                }
            }
            return dVarA;
        }

        private c2.d y() {
            j jVar = this.f54213f;
            return jVar != null ? jVar.h() : c2.d.f61160e;
        }

        private c2.d z(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f54205i) {
                B();
            }
            Method method = f54206j;
            if (method != null && f54207k != null && f54208l != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        FS.log_w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f54208l.get(f54209m.get(objInvoke));
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
            jVar.x(this.f54213f);
            jVar.w(this.f54214g);
            jVar.z(this.f54215h);
        }

        @Override // androidx.core.view.j.m
        final c2.d l() {
            if (this.f54212e == null) {
                this.f54212e = c2.d.b(this.f54210c.getSystemWindowInsetLeft(), this.f54210c.getSystemWindowInsetTop(), this.f54210c.getSystemWindowInsetRight(), this.f54210c.getSystemWindowInsetBottom());
            }
            return this.f54212e;
        }

        @Override // androidx.core.view.j.m
        j n(int i10, int i11, int i12, int i13) {
            a aVar = new a(j.B(this.f54210c));
            aVar.d(j.r(l(), i10, i11, i12, i13));
            aVar.c(j.r(j(), i10, i11, i12, i13));
            return aVar.a();
        }

        @Override // androidx.core.view.j.m
        boolean p() {
            return this.f54210c.isRound();
        }

        @Override // androidx.core.view.j.m
        public void r(c2.d[] dVarArr) {
            this.f54211d = dVarArr;
        }

        @Override // androidx.core.view.j.m
        void s(c2.d dVar) {
            this.f54214g = dVar;
        }

        @Override // androidx.core.view.j.m
        void t(j jVar) {
            this.f54213f = jVar;
        }

        @Override // androidx.core.view.j.m
        void v(int i10) {
            this.f54215h = i10;
        }

        @Override // androidx.core.view.j.m
        void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            c2.d dVarZ = z(view);
            if (dVarZ == null) {
                dVarZ = c2.d.f61160e;
            }
            s(dVarZ);
        }

        @Override // androidx.core.view.j.m
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            g gVar = (g) obj;
            if (!Objects.equals(this.f54214g, gVar.f54214g) || !C(this.f54215h, gVar.f54215h)) {
                return false;
            }
            return true;
        }

        g(j jVar, g gVar) {
            this(jVar, new WindowInsets(gVar.f54210c));
        }
    }

    private static class h extends g {

        /* renamed from: n, reason: collision with root package name */
        private c2.d f54216n;

        h(j jVar, WindowInsets windowInsets) {
            super(jVar, windowInsets);
            this.f54216n = null;
        }

        @Override // androidx.core.view.j.m
        j b() {
            return j.B(this.f54210c.consumeStableInsets());
        }

        @Override // androidx.core.view.j.m
        j c() {
            return j.B(this.f54210c.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.j.m
        final c2.d j() {
            if (this.f54216n == null) {
                this.f54216n = c2.d.b(this.f54210c.getStableInsetLeft(), this.f54210c.getStableInsetTop(), this.f54210c.getStableInsetRight(), this.f54210c.getStableInsetBottom());
            }
            return this.f54216n;
        }

        @Override // androidx.core.view.j.m
        boolean o() {
            return this.f54210c.isConsumed();
        }

        @Override // androidx.core.view.j.m
        public void u(c2.d dVar) {
            this.f54216n = dVar;
        }

        h(j jVar, h hVar) {
            super(jVar, hVar);
            this.f54216n = null;
            this.f54216n = hVar.f54216n;
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
            return Objects.equals(this.f54210c, iVar.f54210c) && Objects.equals(this.f54214g, iVar.f54214g) && g.C(this.f54215h, iVar.f54215h);
        }

        i(j jVar, i iVar) {
            super(jVar, iVar);
        }

        @Override // androidx.core.view.j.m
        j a() {
            return j.B(this.f54210c.consumeDisplayCutout());
        }

        @Override // androidx.core.view.j.m
        androidx.core.view.b f() {
            return androidx.core.view.b.f(this.f54210c.getDisplayCutout());
        }

        @Override // androidx.core.view.j.m
        public int hashCode() {
            return this.f54210c.hashCode();
        }
    }

    /* renamed from: androidx.core.view.j$j, reason: collision with other inner class name */
    private static class C1113j extends i {

        /* renamed from: o, reason: collision with root package name */
        private c2.d f54217o;

        /* renamed from: p, reason: collision with root package name */
        private c2.d f54218p;

        /* renamed from: q, reason: collision with root package name */
        private c2.d f54219q;

        C1113j(j jVar, WindowInsets windowInsets) {
            super(jVar, windowInsets);
            this.f54217o = null;
            this.f54218p = null;
            this.f54219q = null;
        }

        @Override // androidx.core.view.j.h, androidx.core.view.j.m
        public void u(c2.d dVar) {
        }

        @Override // androidx.core.view.j.m
        c2.d i() {
            if (this.f54218p == null) {
                this.f54218p = c2.d.d(this.f54210c.getMandatorySystemGestureInsets());
            }
            return this.f54218p;
        }

        @Override // androidx.core.view.j.m
        c2.d k() {
            if (this.f54217o == null) {
                this.f54217o = c2.d.d(this.f54210c.getSystemGestureInsets());
            }
            return this.f54217o;
        }

        @Override // androidx.core.view.j.m
        c2.d m() {
            if (this.f54219q == null) {
                this.f54219q = c2.d.d(this.f54210c.getTappableElementInsets());
            }
            return this.f54219q;
        }

        @Override // androidx.core.view.j.g, androidx.core.view.j.m
        j n(int i10, int i11, int i12, int i13) {
            return j.B(this.f54210c.inset(i10, i11, i12, i13));
        }

        C1113j(j jVar, C1113j c1113j) {
            super(jVar, c1113j);
            this.f54217o = null;
            this.f54218p = null;
            this.f54219q = null;
        }
    }

    private static class k extends C1113j {

        /* renamed from: r, reason: collision with root package name */
        static final j f54220r = j.B(WindowInsets.CONSUMED);

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
            return c2.d.d(this.f54210c.getInsets(o.a(i10)));
        }

        @Override // androidx.core.view.j.g, androidx.core.view.j.m
        public c2.d h(int i10) {
            return c2.d.d(this.f54210c.getInsetsIgnoringVisibility(o.a(i10)));
        }

        @Override // androidx.core.view.j.g, androidx.core.view.j.m
        public boolean q(int i10) {
            return this.f54210c.isVisible(o.a(i10));
        }
    }

    private static class l extends k {

        /* renamed from: s, reason: collision with root package name */
        static final j f54221s = j.B(WindowInsets.CONSUMED);

        l(j jVar, WindowInsets windowInsets) {
            super(jVar, windowInsets);
        }

        l(j jVar, l lVar) {
            super(jVar, lVar);
        }

        @Override // androidx.core.view.j.k, androidx.core.view.j.g, androidx.core.view.j.m
        public c2.d g(int i10) {
            return c2.d.d(this.f54210c.getInsets(p.a(i10)));
        }

        @Override // androidx.core.view.j.k, androidx.core.view.j.g, androidx.core.view.j.m
        public c2.d h(int i10) {
            return c2.d.d(this.f54210c.getInsetsIgnoringVisibility(p.a(i10)));
        }

        @Override // androidx.core.view.j.k, androidx.core.view.j.g, androidx.core.view.j.m
        public boolean q(int i10) {
            return this.f54210c.isVisible(p.a(i10));
        }
    }

    private static class m {

        /* renamed from: b, reason: collision with root package name */
        static final j f54222b = new a().a().a().b().c();

        /* renamed from: a, reason: collision with root package name */
        final j f54223a;

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
            return this.f54223a;
        }

        j b() {
            return this.f54223a;
        }

        j c() {
            return this.f54223a;
        }

        c2.d g(int i10) {
            return c2.d.f61160e;
        }

        c2.d h(int i10) {
            if ((i10 & 8) == 0) {
                return c2.d.f61160e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        c2.d j() {
            return c2.d.f61160e;
        }

        c2.d l() {
            return c2.d.f61160e;
        }

        j n(int i10, int i11, int i12, int i13) {
            return f54222b;
        }

        m(j jVar) {
            this.f54223a = jVar;
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
            this.f54194a = new l(this, windowInsets);
            return;
        }
        if (i10 >= 30) {
            this.f54194a = new k(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f54194a = new C1113j(this, windowInsets);
        } else if (i10 >= 28) {
            this.f54194a = new i(this, windowInsets);
        } else {
            this.f54194a = new h(this, windowInsets);
        }
    }

    public static j B(WindowInsets windowInsets) {
        return C(windowInsets, null);
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f54193b = l.f54221s;
        } else if (i10 >= 30) {
            f54193b = k.f54220r;
        } else {
            f54193b = m.f54222b;
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
        int iMax = Math.max(0, dVar.f61161a - i10);
        int iMax2 = Math.max(0, dVar.f61162b - i11);
        int iMax3 = Math.max(0, dVar.f61163c - i12);
        int iMax4 = Math.max(0, dVar.f61164d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? dVar : c2.d.b(iMax, iMax2, iMax3, iMax4);
    }

    public WindowInsets A() {
        m mVar = this.f54194a;
        if (mVar instanceof g) {
            return ((g) mVar).f54210c;
        }
        return null;
    }

    @Deprecated
    public j a() {
        return this.f54194a.a();
    }

    @Deprecated
    public j b() {
        return this.f54194a.b();
    }

    @Deprecated
    public j c() {
        return this.f54194a.c();
    }

    void d(View view) {
        this.f54194a.d(view);
    }

    public androidx.core.view.b e() {
        return this.f54194a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return o2.c.a(this.f54194a, ((j) obj).f54194a);
        }
        return false;
    }

    public c2.d f(int i10) {
        return this.f54194a.g(i10);
    }

    public c2.d g(int i10) {
        return this.f54194a.h(i10);
    }

    @Deprecated
    public c2.d h() {
        return this.f54194a.j();
    }

    public int hashCode() {
        m mVar = this.f54194a;
        if (mVar == null) {
            return 0;
        }
        return mVar.hashCode();
    }

    @Deprecated
    public c2.d i() {
        return this.f54194a.k();
    }

    @Deprecated
    public int j() {
        return this.f54194a.l().f61164d;
    }

    @Deprecated
    public int k() {
        return this.f54194a.l().f61161a;
    }

    @Deprecated
    public int l() {
        return this.f54194a.l().f61163c;
    }

    @Deprecated
    public int m() {
        return this.f54194a.l().f61162b;
    }

    @Deprecated
    public c2.d n() {
        return this.f54194a.l();
    }

    @Deprecated
    public boolean p() {
        return !this.f54194a.l().equals(c2.d.f61160e);
    }

    public j q(int i10, int i11, int i12, int i13) {
        return this.f54194a.n(i10, i11, i12, i13);
    }

    public boolean s() {
        return this.f54194a.o();
    }

    public boolean t(int i10) {
        return this.f54194a.q(i10);
    }

    @Deprecated
    public j u(int i10, int i11, int i12, int i13) {
        return new a(this).d(c2.d.b(i10, i11, i12, i13)).a();
    }

    void v(c2.d[] dVarArr) {
        this.f54194a.r(dVarArr);
    }

    void w(c2.d dVar) {
        this.f54194a.s(dVar);
    }

    void x(j jVar) {
        this.f54194a.t(jVar);
    }

    void y(c2.d dVar) {
        this.f54194a.u(dVar);
    }

    void z(int i10) {
        this.f54194a.v(i10);
    }

    public boolean o() {
        c2.d dVarF = f(n.a());
        c2.d dVar = c2.d.f61160e;
        if (dVarF.equals(dVar) && g(n.a() ^ n.d()).equals(dVar) && e() == null) {
            return false;
        }
        return true;
    }

    public j(j jVar) {
        if (jVar != null) {
            m mVar = jVar.f54194a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 34 && (mVar instanceof l)) {
                this.f54194a = new l(this, (l) mVar);
            } else if (i10 >= 30 && (mVar instanceof k)) {
                this.f54194a = new k(this, (k) mVar);
            } else if (i10 >= 29 && (mVar instanceof C1113j)) {
                this.f54194a = new C1113j(this, (C1113j) mVar);
            } else if (i10 >= 28 && (mVar instanceof i)) {
                this.f54194a = new i(this, (i) mVar);
            } else if (mVar instanceof h) {
                this.f54194a = new h(this, (h) mVar);
            } else if (mVar instanceof g) {
                this.f54194a = new g(this, (g) mVar);
            } else {
                this.f54194a = new m(this);
            }
            mVar.e(this);
            return;
        }
        this.f54194a = new m(this);
    }
}
