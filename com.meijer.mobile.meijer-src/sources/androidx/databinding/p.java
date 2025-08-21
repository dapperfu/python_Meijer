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
import androidx.view.AbstractC6127A;
import androidx.view.AbstractC6165l;
import androidx.view.InterfaceC6131E;
import androidx.view.InterfaceC6172s;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import z2.C18440a;

/* loaded from: classes.dex */
public abstract class p extends androidx.databinding.a implements K4.a {

    /* renamed from: q, reason: collision with root package name */
    private static final int f54327q = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f54336a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f54337b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f54338c;

    /* renamed from: d, reason: collision with root package name */
    private q[] f54339d;

    /* renamed from: e, reason: collision with root package name */
    private final View f54340e;

    /* renamed from: f, reason: collision with root package name */
    private androidx.databinding.c<n, p, Void> f54341f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f54342g;

    /* renamed from: h, reason: collision with root package name */
    private Choreographer f54343h;

    /* renamed from: i, reason: collision with root package name */
    private final Choreographer.FrameCallback f54344i;

    /* renamed from: j, reason: collision with root package name */
    private Handler f54345j;

    /* renamed from: k, reason: collision with root package name */
    protected final androidx.databinding.f f54346k;

    /* renamed from: l, reason: collision with root package name */
    private p f54347l;

    /* renamed from: m, reason: collision with root package name */
    private InterfaceC6172s f54348m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f54349n;

    /* renamed from: o, reason: collision with root package name */
    protected boolean f54350o;

    /* renamed from: p, reason: collision with root package name */
    static int f54326p = Build.VERSION.SDK_INT;

    /* renamed from: r, reason: collision with root package name */
    private static final boolean f54328r = true;

    /* renamed from: s, reason: collision with root package name */
    private static final androidx.databinding.d f54329s = new a();

    /* renamed from: t, reason: collision with root package name */
    private static final androidx.databinding.d f54330t = new b();

    /* renamed from: u, reason: collision with root package name */
    private static final androidx.databinding.d f54331u = new c();

    /* renamed from: v, reason: collision with root package name */
    private static final androidx.databinding.d f54332v = new d();

    /* renamed from: w, reason: collision with root package name */
    private static final c.a<n, p, Void> f54333w = new e();

    /* renamed from: x, reason: collision with root package name */
    private static final ReferenceQueue<p> f54334x = new ReferenceQueue<>();

    /* renamed from: y, reason: collision with root package name */
    private static final View.OnAttachStateChangeListener f54335y = new f();

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
                p.this.f54337b = false;
            }
            p.w0();
            if (p.this.f54340e.isAttachedToWindow()) {
                p.this.a0();
            } else {
                p.this.f54340e.removeOnAttachStateChangeListener(p.f54335y);
                p.this.f54340e.addOnAttachStateChangeListener(p.f54335y);
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
            p.this.f54336a.run();
        }
    }

    protected static class i {

        /* renamed from: a, reason: collision with root package name */
        public final String[][] f54353a;

        /* renamed from: b, reason: collision with root package name */
        public final int[][] f54354b;

        /* renamed from: c, reason: collision with root package name */
        public final int[][] f54355c;

        public void a(int i10, String[] strArr, int[] iArr, int[] iArr2) {
            this.f54353a[i10] = strArr;
            this.f54354b[i10] = iArr;
            this.f54355c[i10] = iArr2;
        }

        public i(int i10) {
            this.f54353a = new String[i10][];
            this.f54354b = new int[i10][];
            this.f54355c = new int[i10][];
        }
    }

    private static class j implements InterfaceC6131E, androidx.databinding.m<AbstractC6127A<?>> {

        /* renamed from: a, reason: collision with root package name */
        final q<AbstractC6127A<?>> f54356a;

        /* renamed from: b, reason: collision with root package name */
        WeakReference<InterfaceC6172s> f54357b = null;

        private InterfaceC6172s e() {
            WeakReference<InterfaceC6172s> weakReference = this.f54357b;
            if (weakReference == null) {
                return null;
            }
            return weakReference.get();
        }

        public q<AbstractC6127A<?>> f() {
            return this.f54356a;
        }

        @Override // androidx.view.InterfaceC6131E
        public void onChanged(Object obj) {
            p pVarA = this.f54356a.a();
            if (pVarA != null) {
                q<AbstractC6127A<?>> qVar = this.f54356a;
                pVarA.g0(qVar.f54362b, qVar.b(), 0);
            }
        }

        public j(p pVar, int i10, ReferenceQueue<p> referenceQueue) {
            this.f54356a = new q<>(pVar, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.m
        public void a(InterfaceC6172s interfaceC6172s) {
            InterfaceC6172s interfaceC6172sE = e();
            AbstractC6127A<?> abstractC6127AB = this.f54356a.b();
            if (abstractC6127AB != null) {
                if (interfaceC6172sE != null) {
                    abstractC6127AB.n(this);
                }
                if (interfaceC6172s != null) {
                    abstractC6127AB.i(interfaceC6172s, this);
                }
            }
            if (interfaceC6172s != null) {
                this.f54357b = new WeakReference<>(interfaceC6172s);
            }
        }

        @Override // androidx.databinding.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(AbstractC6127A<?> abstractC6127A) {
            InterfaceC6172s interfaceC6172sE = e();
            if (interfaceC6172sE != null) {
                abstractC6127A.i(interfaceC6172sE, this);
            }
        }

        @Override // androidx.databinding.m
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void b(AbstractC6127A<?> abstractC6127A) {
            abstractC6127A.n(this);
        }
    }

    private static class k extends k.a implements androidx.databinding.m<androidx.databinding.k> {

        /* renamed from: a, reason: collision with root package name */
        final q<androidx.databinding.k> f54358a;

        @Override // androidx.databinding.m
        public void a(InterfaceC6172s interfaceC6172s) {
        }

        public q<androidx.databinding.k> e() {
            return this.f54358a;
        }

        public k(p pVar, int i10, ReferenceQueue<p> referenceQueue) {
            this.f54358a = new q<>(pVar, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.m
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void c(androidx.databinding.k kVar) {
            kVar.f3(this);
        }

        @Override // androidx.databinding.m
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(androidx.databinding.k kVar) {
            kVar.O(this);
        }
    }

    private static class l extends l.a implements androidx.databinding.m<androidx.databinding.l> {

        /* renamed from: a, reason: collision with root package name */
        final q<androidx.databinding.l> f54359a;

        @Override // androidx.databinding.m
        public void a(InterfaceC6172s interfaceC6172s) {
        }

        public q<androidx.databinding.l> e() {
            return this.f54359a;
        }

        public l(p pVar, int i10, ReferenceQueue<p> referenceQueue) {
            this.f54359a = new q<>(pVar, i10, this, referenceQueue);
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
        final q<androidx.databinding.h> f54360a;

        @Override // androidx.databinding.m
        public void a(InterfaceC6172s interfaceC6172s) {
        }

        @Override // androidx.databinding.h.a
        public void d(androidx.databinding.h hVar, int i10) {
            p pVarA = this.f54360a.a();
            if (pVarA != null && this.f54360a.b() == hVar) {
                pVarA.g0(this.f54360a.f54362b, hVar, i10);
            }
        }

        public q<androidx.databinding.h> f() {
            return this.f54360a;
        }

        public m(p pVar, int i10, ReferenceQueue<p> referenceQueue) {
            this.f54360a = new q<>(pVar, i10, this, referenceQueue);
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
        this.f54336a = new g();
        this.f54337b = false;
        this.f54338c = false;
        this.f54346k = fVar;
        this.f54339d = new q[i10];
        this.f54340e = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (f54328r) {
            this.f54343h = Choreographer.getInstance();
            this.f54344i = new h();
        } else {
            this.f54344i = null;
            this.f54345j = new Handler(Looper.myLooper());
        }
    }

    protected void D0(View[] viewArr) {
        for (View view : viewArr) {
            view.setTag(C18440a.f172291a, this);
        }
    }

    protected abstract void W();

    public abstract boolean h0();

    public abstract void l0();

    protected abstract boolean u0(int i10, Object obj, int i11);

    class e extends c.a<n, p, Void> {
        @Override // androidx.databinding.c.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(n nVar, p pVar, int i10, Void r42) {
            if (i10 == 1) {
                if (nVar.c(pVar)) {
                    return;
                }
                pVar.f54338c = true;
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
            p.d0(view).f54336a.run();
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
        if (this.f54342g) {
            z0();
            return;
        }
        if (h0()) {
            this.f54342g = true;
            this.f54338c = false;
            androidx.databinding.c<n, p, Void> cVar = this.f54341f;
            if (cVar != null) {
                cVar.d(this, 1, null);
                if (this.f54338c) {
                    this.f54341f.d(this, 2, null);
                }
            }
            if (!this.f54338c) {
                W();
                androidx.databinding.c<n, p, Void> cVar2 = this.f54341f;
                if (cVar2 != null) {
                    cVar2.d(this, 3, null);
                }
            }
            this.f54342g = false;
        }
    }

    private static int b0(String str, int i10, i iVar, int i11) {
        CharSequence charSequenceSubSequence = str.subSequence(str.indexOf(47) + 1, str.length() - 2);
        String[] strArr = iVar.f54353a[i11];
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
            return (p) view.getTag(C18440a.f172291a);
        }
        return null;
    }

    public static int f0() {
        return f54326p;
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

    protected static Object[] r0(androidx.databinding.f fVar, View view, int i10, i iVar, SparseIntArray sparseIntArray) {
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
            Reference<? extends p> referencePoll = f54334x.poll();
            if (referencePoll == null) {
                return;
            }
            if (referencePoll instanceof q) {
                ((q) referencePoll).e();
            }
        }
    }

    protected void A0(p pVar) {
        if (pVar != null) {
            pVar.f54347l = this;
        }
    }

    protected void B0(View view) {
        view.setTag(C18440a.f172291a, this);
    }

    protected boolean G0(int i10) {
        q qVar = this.f54339d[i10];
        if (qVar != null) {
            return qVar.e();
        }
        return false;
    }

    protected boolean I0(int i10, androidx.databinding.h hVar) {
        return L0(i10, hVar, f54329s);
    }

    protected boolean L0(int i10, Object obj, androidx.databinding.d dVar) {
        if (obj == null) {
            return G0(i10);
        }
        q qVar = this.f54339d[i10];
        if (qVar == null) {
            y0(i10, obj, dVar);
            return true;
        }
        if (qVar.b() == obj) {
            return false;
        }
        G0(i10);
        y0(i10, obj, dVar);
        return true;
    }

    public void T(n nVar) {
        if (this.f54341f == null) {
            this.f54341f = new androidx.databinding.c<>(f54333w);
        }
        this.f54341f.a(nVar);
    }

    public void a0() {
        p pVar = this.f54347l;
        if (pVar == null) {
            X();
        } else {
            pVar.a0();
        }
    }

    protected void g0(int i10, Object obj, int i11) {
        if (this.f54349n || this.f54350o || !u0(i10, obj, i11)) {
            return;
        }
        z0();
    }

    @Override // K4.a
    public View getRoot() {
        return this.f54340e;
    }

    protected void y0(int i10, Object obj, androidx.databinding.d dVar) {
        if (obj == null) {
            return;
        }
        q qVarA = this.f54339d[i10];
        if (qVarA == null) {
            qVarA = dVar.a(this, i10, f54334x);
            this.f54339d[i10] = qVarA;
            InterfaceC6172s interfaceC6172s = this.f54348m;
            if (interfaceC6172s != null) {
                qVarA.c(interfaceC6172s);
            }
        }
        qVarA.d(obj);
    }

    protected void z0() {
        p pVar = this.f54347l;
        if (pVar != null) {
            pVar.z0();
            return;
        }
        InterfaceC6172s interfaceC6172s = this.f54348m;
        if (interfaceC6172s == null || interfaceC6172s.getLifecycle().b().b(AbstractC6165l.b.f55502d)) {
            synchronized (this) {
                try {
                    if (this.f54337b) {
                        return;
                    }
                    this.f54337b = true;
                    if (f54328r) {
                        this.f54343h.postFrameCallback(this.f54344i);
                    } else {
                        this.f54345j.post(this.f54336a);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    protected static p U(Object obj, View view, int i10) {
        return androidx.databinding.g.a(V(obj), view, i10);
    }

    protected static void Z(p pVar) {
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

    protected static <T extends p> T i0(LayoutInflater layoutInflater, int i10, ViewGroup viewGroup, boolean z10, Object obj) {
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
