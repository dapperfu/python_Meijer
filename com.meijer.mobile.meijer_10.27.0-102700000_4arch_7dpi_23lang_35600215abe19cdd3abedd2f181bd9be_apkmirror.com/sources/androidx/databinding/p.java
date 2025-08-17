package androidx.databinding;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.c;
import androidx.databinding.h;
import androidx.databinding.k;
import androidx.databinding.l;
import androidx.view.AbstractC5985A;
import androidx.view.AbstractC6023l;
import androidx.view.InterfaceC5989E;
import androidx.view.InterfaceC6030s;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import z2.C18377a;

/* loaded from: classes.dex */
public abstract class p extends androidx.databinding.a implements J4.a {

    /* renamed from: q, reason: collision with root package name */
    private static final int f54103q = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f54112a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f54113b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f54114c;

    /* renamed from: d, reason: collision with root package name */
    private q[] f54115d;

    /* renamed from: e, reason: collision with root package name */
    private final View f54116e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.databinding.c<n, p, Void> f54117f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f54118g;

    /* renamed from: h, reason: collision with root package name */
    private Choreographer f54119h;

    /* renamed from: i, reason: collision with root package name */
    private final Choreographer.FrameCallback f54120i;

    /* renamed from: j, reason: collision with root package name */
    private Handler f54121j;

    /* renamed from: k, reason: collision with root package name */
    protected final androidx.databinding.f f54122k;

    /* renamed from: l, reason: collision with root package name */
    private p f54123l;

    /* renamed from: m, reason: collision with root package name */
    private InterfaceC6030s f54124m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f54125n;

    /* renamed from: o, reason: collision with root package name */
    protected boolean f54126o;

    /* renamed from: p, reason: collision with root package name */
    static int f54102p = Build.VERSION.SDK_INT;

    /* renamed from: r, reason: collision with root package name */
    private static final boolean f54104r = true;

    /* renamed from: s, reason: collision with root package name */
    private static final androidx.databinding.d f54105s = new a();

    /* renamed from: t, reason: collision with root package name */
    private static final androidx.databinding.d f54106t = new b();

    /* renamed from: u, reason: collision with root package name */
    private static final androidx.databinding.d f54107u = new c();

    /* renamed from: v, reason: collision with root package name */
    private static final androidx.databinding.d f54108v = new d();

    /* renamed from: w, reason: collision with root package name */
    private static final c.a<n, p, Void> f54109w = new e();

    /* renamed from: x, reason: collision with root package name */
    private static final ReferenceQueue<p> f54110x = new ReferenceQueue<>();

    /* renamed from: y, reason: collision with root package name */
    private static final View.OnAttachStateChangeListener f54111y = new f();

    class a implements androidx.databinding.d {
        @Override // androidx.databinding.d
        public q a(p pVar, int i10, ReferenceQueue<p> referenceQueue) {
            return new m(pVar, i10, referenceQueue).f();
        }

        a() {
        }
    }

    class b implements androidx.databinding.d {
        @Override // androidx.databinding.d
        public q a(p pVar, int i10, ReferenceQueue<p> referenceQueue) {
            return new k(pVar, i10, referenceQueue).e();
        }

        b() {
        }
    }

    class c implements androidx.databinding.d {
        @Override // androidx.databinding.d
        public q a(p pVar, int i10, ReferenceQueue<p> referenceQueue) {
            return new l(pVar, i10, referenceQueue).e();
        }

        c() {
        }
    }

    class d implements androidx.databinding.d {
        @Override // androidx.databinding.d
        public q a(p pVar, int i10, ReferenceQueue<p> referenceQueue) {
            return new j(pVar, i10, referenceQueue).f();
        }

        d() {
        }
    }

    class g implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            synchronized (this) {
                p.this.f54113b = false;
            }
            p.w0();
            if (p.this.f54116e.isAttachedToWindow()) {
                p.this.a0();
            } else {
                p.this.f54116e.removeOnAttachStateChangeListener(p.f54111y);
                p.this.f54116e.addOnAttachStateChangeListener(p.f54111y);
            }
        }

        g() {
        }
    }

    class h implements Choreographer.FrameCallback {
        h() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            p.this.f54112a.run();
        }
    }

    protected static class i {

        /* renamed from: a, reason: collision with root package name */
        public final String[][] f54129a;

        /* renamed from: b, reason: collision with root package name */
        public final int[][] f54130b;

        /* renamed from: c, reason: collision with root package name */
        public final int[][] f54131c;

        public void a(int i10, String[] strArr, int[] iArr, int[] iArr2) {
            this.f54129a[i10] = strArr;
            this.f54130b[i10] = iArr;
            this.f54131c[i10] = iArr2;
        }

        public i(int i10) {
            this.f54129a = new String[i10][];
            this.f54130b = new int[i10][];
            this.f54131c = new int[i10][];
        }
    }

    private static class j implements InterfaceC5989E, androidx.databinding.m<AbstractC5985A<?>> {

        /* renamed from: a, reason: collision with root package name */
        final q<AbstractC5985A<?>> f54132a;

        /* renamed from: b, reason: collision with root package name */
        WeakReference<InterfaceC6030s> f54133b = null;

        private InterfaceC6030s e() {
            WeakReference<InterfaceC6030s> weakReference = this.f54133b;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        public q<AbstractC5985A<?>> f() {
            return this.f54132a;
        }

        @Override // androidx.view.InterfaceC5989E
        public void onChanged(Object obj) {
            p pVarA = this.f54132a.a();
            if (pVarA != null) {
                q<AbstractC5985A<?>> qVar = this.f54132a;
                pVarA.g0(qVar.f54138b, qVar.b(), 0);
            }
        }

        public j(p pVar, int i10, ReferenceQueue<p> referenceQueue) {
            this.f54132a = new q<>(pVar, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.m
        public void a(InterfaceC6030s interfaceC6030s) {
            InterfaceC6030s interfaceC6030sE = e();
            AbstractC5985A<?> abstractC5985AB = this.f54132a.b();
            if (abstractC5985AB != null) {
                if (interfaceC6030sE != null) {
                    abstractC5985AB.n(this);
                }
                if (interfaceC6030s != null) {
                    abstractC5985AB.i(interfaceC6030s, this);
                }
            }
            if (interfaceC6030s != null) {
                this.f54133b = new WeakReference<>(interfaceC6030s);
            }
        }

        @Override // androidx.databinding.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(AbstractC5985A<?> abstractC5985A) {
            InterfaceC6030s interfaceC6030sE = e();
            if (interfaceC6030sE != null) {
                abstractC5985A.i(interfaceC6030sE, this);
            }
        }

        @Override // androidx.databinding.m
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void b(AbstractC5985A<?> abstractC5985A) {
            abstractC5985A.n(this);
        }
    }

    private static class k extends k.a implements androidx.databinding.m<androidx.databinding.k> {

        /* renamed from: a, reason: collision with root package name */
        final q<androidx.databinding.k> f54134a;

        @Override // androidx.databinding.m
        public void a(InterfaceC6030s interfaceC6030s) {
        }

        public q<androidx.databinding.k> e() {
            return this.f54134a;
        }

        public k(p pVar, int i10, ReferenceQueue<p> referenceQueue) {
            this.f54134a = new q<>(pVar, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(androidx.databinding.k kVar) {
            kVar.h3(this);
        }

        @Override // androidx.databinding.m
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(androidx.databinding.k kVar) {
            kVar.O(this);
        }
    }

    private static class l extends l.a implements androidx.databinding.m<androidx.databinding.l> {

        /* renamed from: a, reason: collision with root package name */
        final q<androidx.databinding.l> f54135a;

        @Override // androidx.databinding.m
        public void a(InterfaceC6030s interfaceC6030s) {
        }

        public q<androidx.databinding.l> e() {
            return this.f54135a;
        }

        public l(p pVar, int i10, ReferenceQueue<p> referenceQueue) {
            this.f54135a = new q<>(pVar, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(androidx.databinding.l lVar) {
            lVar.o(this);
        }

        @Override // androidx.databinding.m
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(androidx.databinding.l lVar) {
            lVar.p(this);
        }
    }

    private static class m extends h.a implements androidx.databinding.m<androidx.databinding.h> {

        /* renamed from: a, reason: collision with root package name */
        final q<androidx.databinding.h> f54136a;

        @Override // androidx.databinding.m
        public void a(InterfaceC6030s interfaceC6030s) {
        }

        @Override // androidx.databinding.h.a
        public void d(androidx.databinding.h hVar, int i10) {
            p pVarA = this.f54136a.a();
            if (pVarA != null && this.f54136a.b() == hVar) {
                pVarA.g0(this.f54136a.f54138b, hVar, i10);
            }
        }

        public q<androidx.databinding.h> f() {
            return this.f54136a;
        }

        public m(p pVar, int i10, ReferenceQueue<p> referenceQueue) {
            this.f54136a = new q<>(pVar, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.m
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void c(androidx.databinding.h hVar) {
            hVar.addOnPropertyChangedCallback(this);
        }

        @Override // androidx.databinding.m
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void b(androidx.databinding.h hVar) {
            hVar.removeOnPropertyChangedCallback(this);
        }
    }

    protected p(androidx.databinding.f fVar, View view, int i10) {
        this.f54112a = new g();
        this.f54113b = false;
        this.f54114c = false;
        this.f54122k = fVar;
        this.f54115d = new q[i10];
        this.f54116e = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (f54104r) {
            this.f54119h = Choreographer.getInstance();
            this.f54120i = new h();
        } else {
            this.f54120i = null;
            this.f54121j = new Handler(Looper.myLooper());
        }
    }

    protected void E0(View[] viewArr) {
        for (View view : viewArr) {
            view.setTag(C18377a.f171495a, this);
        }
    }

    protected abstract void W();

    public abstract boolean h0();

    public abstract void o0();

    protected abstract boolean u0(int i10, Object obj, int i11);

    class e extends c.a<n, p, Void> {
        @Override // androidx.databinding.c.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(n nVar, p pVar, int i10, Void r42) {
            if (i10 == 1) {
                if (nVar.c(pVar)) {
                    return;
                }
                pVar.f54114c = true;
            } else if (i10 == 2) {
                nVar.b(pVar);
            } else {
                if (i10 != 3) {
                    return;
                }
                nVar.a(pVar);
            }
        }

        e() {
        }
    }

    class f implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        f() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        @TargetApi(19)
        public void onViewAttachedToWindow(View view) {
            p.d0(view).f54112a.run();
            view.removeOnAttachStateChangeListener(this);
        }
    }

    private static androidx.databinding.f V(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof androidx.databinding.f) {
            return (androidx.databinding.f) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    private void X() {
        if (this.f54118g) {
            A0();
            return;
        }
        if (h0()) {
            this.f54118g = true;
            this.f54114c = false;
            androidx.databinding.c<n, p, Void> cVar = this.f54117f;
            if (cVar != null) {
                cVar.d(this, 1, null);
                if (this.f54114c) {
                    this.f54117f.d(this, 2, null);
                }
            }
            if (!this.f54114c) {
                W();
                androidx.databinding.c<n, p, Void> cVar2 = this.f54117f;
                if (cVar2 != null) {
                    cVar2.d(this, 3, null);
                }
            }
            this.f54118g = false;
        }
    }

    private static int b0(String str, int i10, i iVar, int i11) {
        CharSequence charSequenceSubSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = iVar.f54129a[i11];
        int length = strArr.length;
        while (i10 < length) {
            if (TextUtils.equals(charSequenceSubSequence, strArr[i10])) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    static p d0(View view) {
        if (view != null) {
            return (p) view.getTag(C18377a.f171495a);
        }
        return null;
    }

    public static int f0() {
        return f54102p;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void q0(androidx.databinding.f r18, android.view.View r19, java.lang.Object[] r20, androidx.databinding.p.i r21, android.util.SparseIntArray r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.databinding.p.q0(androidx.databinding.f, android.view.View, java.lang.Object[], androidx.databinding.p$i, android.util.SparseIntArray, boolean):void");
    }

    protected static Object[] s0(androidx.databinding.f fVar, View view, int i10, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        q0(fVar, view, objArr, iVar, sparseIntArray, true);
        return objArr;
    }

    protected static Object[] t0(androidx.databinding.f fVar, View[] viewArr, int i10, i iVar, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        for (View view : viewArr) {
            q0(fVar, view, objArr, iVar, sparseIntArray, true);
        }
        return objArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void w0() {
        while (true) {
            Reference<? extends p> referencePoll = f54110x.poll();
            if (referencePoll == null) {
                return;
            }
            if (referencePoll instanceof q) {
                ((q) referencePoll).e();
            }
        }
    }

    protected void A0() {
        p pVar = this.f54123l;
        if (pVar != null) {
            pVar.A0();
            return;
        }
        InterfaceC6030s interfaceC6030s = this.f54124m;
        if (interfaceC6030s == null || interfaceC6030s.getLifecycle().b().b(AbstractC6023l.b.f55278d)) {
            synchronized (this) {
                try {
                    if (this.f54113b) {
                        return;
                    }
                    this.f54113b = true;
                    if (f54104r) {
                        this.f54119h.postFrameCallback(this.f54120i);
                    } else {
                        this.f54121j.post(this.f54112a);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    protected void C0(p pVar) {
        if (pVar != null) {
            pVar.f54123l = this;
        }
    }

    protected void D0(View view) {
        view.setTag(C18377a.f171495a, this);
    }

    protected boolean G0(int i10) {
        q qVar = this.f54115d[i10];
        if (qVar != null) {
            return qVar.e();
        }
        return false;
    }

    protected boolean H0(int i10, androidx.databinding.h hVar) {
        return I0(i10, hVar, f54105s);
    }

    protected boolean I0(int i10, Object obj, androidx.databinding.d dVar) {
        if (obj == null) {
            return G0(i10);
        }
        q qVar = this.f54115d[i10];
        if (qVar == null) {
            x0(i10, obj, dVar);
            return true;
        }
        if (qVar.b() == obj) {
            return false;
        }
        G0(i10);
        x0(i10, obj, dVar);
        return true;
    }

    public void T(n nVar) {
        if (this.f54117f == null) {
            this.f54117f = new androidx.databinding.c<>(f54109w);
        }
        this.f54117f.a(nVar);
    }

    public void a0() {
        p pVar = this.f54123l;
        if (pVar == null) {
            X();
        } else {
            pVar.a0();
        }
    }

    protected void g0(int i10, Object obj, int i11) {
        if (this.f54125n || this.f54126o || !u0(i10, obj, i11)) {
            return;
        }
        A0();
    }

    @Override // J4.a
    public View getRoot() {
        return this.f54116e;
    }

    protected void x0(int i10, Object obj, androidx.databinding.d dVar) {
        if (obj == null) {
            return;
        }
        q qVarA = this.f54115d[i10];
        if (qVarA == null) {
            qVarA = dVar.a(this, i10, f54110x);
            this.f54115d[i10] = qVarA;
            InterfaceC6030s interfaceC6030s = this.f54124m;
            if (interfaceC6030s != null) {
                qVarA.c(interfaceC6030s);
            }
        }
        qVarA.d(obj);
    }

    protected static p U(Object obj, View view, int i10) {
        return androidx.databinding.g.a(V(obj), view, i10);
    }

    protected static void Y(p pVar) {
        pVar.X();
    }

    private static int c0(ViewGroup viewGroup, int i10) {
        String str;
        String str2 = (String) viewGroup.getChildAt(i10).getTag();
        String strSubstring = str2.substring(0, str2.length() - 1);
        int length = strSubstring.length();
        int childCount = viewGroup.getChildCount();
        for (int i11 = i10 + 1; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt.getTag() instanceof String) {
                str = (String) childAt.getTag();
            } else {
                str = null;
            }
            if (str != null && str.startsWith(strSubstring)) {
                if (str.length() == str2.length() && str.charAt(str.length() - 1) == '0') {
                    break;
                }
                if (p0(str, length)) {
                    i10 = i11;
                }
            }
        }
        return i10;
    }

    protected static <T extends p> T k0(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, boolean z10, Object obj) {
        return (T) androidx.databinding.g.f(layoutInflater, i10, viewGroup, z10, V(obj));
    }

    private static boolean p0(String str, int i10) {
        int length = str.length();
        if (length == i10) {
            return false;
        }
        while (i10 < length) {
            if (!Character.isDigit(str.charAt(i10))) {
                return false;
            }
            i10++;
        }
        return true;
    }

    private static int v0(String str, int i10) {
        int iCharAt = 0;
        while (i10 < str.length()) {
            iCharAt = (iCharAt * 10) + (str.charAt(i10) - '0');
            i10++;
        }
        return iCharAt;
    }

    protected p(Object obj, View view, int i10) {
        this(V(obj), view, i10);
    }
}
