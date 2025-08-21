package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import o7.AbstractC16076a;
import o7.C16077b;
import o7.C16082g;
import o7.C16084i;
import o7.C16085j;
import o7.InterfaceC16079d;
import o7.InterfaceC16080e;
import o7.InterfaceC16081f;
import q7.C16609a;
import r7.C16872e;

/* loaded from: classes4.dex */
public class j<TranscodeType> extends AbstractC16076a<j<TranscodeType>> implements Cloneable {

    /* renamed from: O, reason: collision with root package name */
    protected static final C16082g f64551O = new C16082g().f(Z6.a.f43637c).Y(g.LOW).i0(true);

    /* renamed from: A, reason: collision with root package name */
    private final Context f64552A;

    /* renamed from: B, reason: collision with root package name */
    private final k f64553B;

    /* renamed from: C, reason: collision with root package name */
    private final Class<TranscodeType> f64554C;

    /* renamed from: D, reason: collision with root package name */
    private final b f64555D;

    /* renamed from: E, reason: collision with root package name */
    private final d f64556E;

    /* renamed from: F, reason: collision with root package name */
    private l<?, ? super TranscodeType> f64557F;

    /* renamed from: G, reason: collision with root package name */
    private Object f64558G;

    /* renamed from: H, reason: collision with root package name */
    private List<InterfaceC16081f<TranscodeType>> f64559H;

    /* renamed from: I, reason: collision with root package name */
    private j<TranscodeType> f64560I;

    /* renamed from: J, reason: collision with root package name */
    private j<TranscodeType> f64561J;

    /* renamed from: K, reason: collision with root package name */
    private Float f64562K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f64563L = true;

    /* renamed from: M, reason: collision with root package name */
    private boolean f64564M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f64565N;

    public <Y extends com.bumptech.glide.request.target.j<TranscodeType>> Y z0(Y y10) {
        return (Y) A0(y10, null, C16872e.b());
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f64566a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f64567b;

        static {
            int[] iArr = new int[g.values().length];
            f64567b = iArr;
            try {
                iArr[g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64567b[g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64567b[g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f64567b[g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f64566a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f64566a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f64566a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f64566a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f64566a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f64566a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f64566a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f64566a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private j<TranscodeType> J0(Uri uri, j<TranscodeType> jVar) {
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? jVar : s0(jVar);
    }

    private InterfaceC16079d K0(Object obj, com.bumptech.glide.request.target.j<TranscodeType> jVar, InterfaceC16081f<TranscodeType> interfaceC16081f, AbstractC16076a<?> abstractC16076a, InterfaceC16080e interfaceC16080e, l<?, ? super TranscodeType> lVar, g gVar, int i10, int i11, Executor executor) {
        Context context = this.f64552A;
        d dVar = this.f64556E;
        return C16084i.x(context, dVar, obj, this.f64558G, this.f64554C, abstractC16076a, i10, i11, gVar, jVar, interfaceC16081f, this.f64559H, interfaceC16080e, dVar.f(), lVar.b(), executor);
    }

    private j<TranscodeType> s0(j<TranscodeType> jVar) {
        return jVar.j0(this.f64552A.getTheme()).g0(C16609a.a(this.f64552A));
    }

    private InterfaceC16079d t0(com.bumptech.glide.request.target.j<TranscodeType> jVar, InterfaceC16081f<TranscodeType> interfaceC16081f, AbstractC16076a<?> abstractC16076a, Executor executor) {
        return u0(new Object(), jVar, interfaceC16081f, null, this.f64557F, abstractC16076a.v(), abstractC16076a.s(), abstractC16076a.r(), abstractC16076a, executor);
    }

    private InterfaceC16079d u0(Object obj, com.bumptech.glide.request.target.j<TranscodeType> jVar, InterfaceC16081f<TranscodeType> interfaceC16081f, InterfaceC16080e interfaceC16080e, l<?, ? super TranscodeType> lVar, g gVar, int i10, int i11, AbstractC16076a<?> abstractC16076a, Executor executor) {
        C16077b c16077b;
        InterfaceC16080e interfaceC16080e2;
        Object obj2;
        com.bumptech.glide.request.target.j<TranscodeType> jVar2;
        InterfaceC16081f<TranscodeType> interfaceC16081f2;
        l<?, ? super TranscodeType> lVar2;
        g gVar2;
        int i12;
        int i13;
        AbstractC16076a<?> abstractC16076a2;
        Executor executor2;
        j<TranscodeType> jVar3;
        if (this.f64561J != null) {
            c16077b = new C16077b(obj, interfaceC16080e);
            interfaceC16080e2 = c16077b;
            jVar3 = this;
            obj2 = obj;
            jVar2 = jVar;
            interfaceC16081f2 = interfaceC16081f;
            lVar2 = lVar;
            gVar2 = gVar;
            i12 = i10;
            i13 = i11;
            abstractC16076a2 = abstractC16076a;
            executor2 = executor;
        } else {
            c16077b = null;
            interfaceC16080e2 = interfaceC16080e;
            obj2 = obj;
            jVar2 = jVar;
            interfaceC16081f2 = interfaceC16081f;
            lVar2 = lVar;
            gVar2 = gVar;
            i12 = i10;
            i13 = i11;
            abstractC16076a2 = abstractC16076a;
            executor2 = executor;
            jVar3 = this;
        }
        InterfaceC16079d interfaceC16079dV0 = jVar3.v0(obj2, jVar2, interfaceC16081f2, interfaceC16080e2, lVar2, gVar2, i12, i13, abstractC16076a2, executor2);
        if (c16077b == null) {
            return interfaceC16079dV0;
        }
        int iS = this.f64561J.s();
        int iR = this.f64561J.r();
        if (r7.l.t(i10, i11) && !this.f64561J.O()) {
            iS = abstractC16076a.s();
            iR = abstractC16076a.r();
        }
        j<TranscodeType> jVar4 = this.f64561J;
        C16077b c16077b2 = c16077b;
        c16077b2.n(interfaceC16079dV0, jVar4.u0(obj, jVar, interfaceC16081f, c16077b2, jVar4.f64557F, jVar4.v(), iS, iR, this.f64561J, executor));
        return c16077b2;
    }

    private InterfaceC16079d v0(Object obj, com.bumptech.glide.request.target.j<TranscodeType> jVar, InterfaceC16081f<TranscodeType> interfaceC16081f, InterfaceC16080e interfaceC16080e, l<?, ? super TranscodeType> lVar, g gVar, int i10, int i11, AbstractC16076a<?> abstractC16076a, Executor executor) {
        j<TranscodeType> jVar2 = this.f64560I;
        if (jVar2 == null) {
            if (this.f64562K == null) {
                return K0(obj, jVar, interfaceC16081f, abstractC16076a, interfaceC16080e, lVar, gVar, i10, i11, executor);
            }
            C16085j c16085j = new C16085j(obj, interfaceC16080e);
            c16085j.m(K0(obj, jVar, interfaceC16081f, abstractC16076a, c16085j, lVar, gVar, i10, i11, executor), K0(obj, jVar, interfaceC16081f, abstractC16076a.clone().h0(this.f64562K.floatValue()), c16085j, lVar, x0(gVar), i10, i11, executor));
            return c16085j;
        }
        if (this.f64565N) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        l<?, ? super TranscodeType> lVar2 = jVar2.f64563L ? lVar : jVar2.f64557F;
        g gVarV = jVar2.H() ? this.f64560I.v() : x0(gVar);
        int iS = this.f64560I.s();
        int iR = this.f64560I.r();
        if (r7.l.t(i10, i11) && !this.f64560I.O()) {
            iS = abstractC16076a.s();
            iR = abstractC16076a.r();
        }
        C16085j c16085j2 = new C16085j(obj, interfaceC16080e);
        InterfaceC16079d interfaceC16079dK0 = K0(obj, jVar, interfaceC16081f, abstractC16076a, c16085j2, lVar, gVar, i10, i11, executor);
        this.f64565N = true;
        j jVar3 = (j<TranscodeType>) this.f64560I;
        InterfaceC16079d interfaceC16079dU0 = jVar3.u0(obj, jVar, interfaceC16081f, c16085j2, lVar2, gVarV, iS, iR, jVar3, executor);
        this.f64565N = false;
        c16085j2.m(interfaceC16079dK0, interfaceC16079dU0);
        return c16085j2;
    }

    private g x0(g gVar) {
        int i10 = a.f64567b[gVar.ordinal()];
        if (i10 == 1) {
            return g.NORMAL;
        }
        if (i10 == 2) {
            return g.HIGH;
        }
        if (i10 == 3 || i10 == 4) {
            return g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + v());
    }

    @Override // o7.AbstractC16076a
    public boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (super.equals(jVar) && Objects.equals(this.f64554C, jVar.f64554C) && this.f64557F.equals(jVar.f64557F) && Objects.equals(this.f64558G, jVar.f64558G) && Objects.equals(this.f64559H, jVar.f64559H) && Objects.equals(this.f64560I, jVar.f64560I) && Objects.equals(this.f64561J, jVar.f64561J) && Objects.equals(this.f64562K, jVar.f64562K) && this.f64563L == jVar.f64563L && this.f64564M == jVar.f64564M) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"CheckResult"})
    protected j(b bVar, k kVar, Class<TranscodeType> cls, Context context) {
        this.f64555D = bVar;
        this.f64553B = kVar;
        this.f64554C = cls;
        this.f64552A = context;
        this.f64557F = kVar.h(cls);
        this.f64556E = bVar.i();
        y0(kVar.f());
        a(kVar.g());
    }

    private <Y extends com.bumptech.glide.request.target.j<TranscodeType>> Y B0(Y y10, InterfaceC16081f<TranscodeType> interfaceC16081f, AbstractC16076a<?> abstractC16076a, Executor executor) {
        r7.k.d(y10);
        if (this.f64564M) {
            InterfaceC16079d interfaceC16079dT0 = t0(y10, interfaceC16081f, abstractC16076a, executor);
            InterfaceC16079d request = y10.getRequest();
            if (interfaceC16079dT0.h(request) && !D0(abstractC16076a, request)) {
                if (!((InterfaceC16079d) r7.k.d(request)).isRunning()) {
                    request.i();
                }
                return y10;
            }
            this.f64553B.d(y10);
            y10.setRequest(interfaceC16079dT0);
            this.f64553B.o(y10, interfaceC16079dT0);
            return y10;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    private boolean D0(AbstractC16076a<?> abstractC16076a, InterfaceC16079d interfaceC16079d) {
        if (!abstractC16076a.G() && interfaceC16079d.isComplete()) {
            return true;
        }
        return false;
    }

    private j<TranscodeType> H0(Object obj) {
        if (E()) {
            return clone().H0(obj);
        }
        this.f64558G = obj;
        this.f64564M = true;
        return e0();
    }

    @SuppressLint({"CheckResult"})
    private void y0(List<InterfaceC16081f<Object>> list) {
        Iterator<InterfaceC16081f<Object>> it = list.iterator();
        while (it.hasNext()) {
            p0((InterfaceC16081f) it.next());
        }
    }

    <Y extends com.bumptech.glide.request.target.j<TranscodeType>> Y A0(Y y10, InterfaceC16081f<TranscodeType> interfaceC16081f, Executor executor) {
        return (Y) B0(y10, interfaceC16081f, this, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bumptech.glide.request.target.k<android.widget.ImageView, TranscodeType> C0(android.widget.ImageView r4) {
        /*
            r3 = this;
            r7.l.a()
            r7.k.d(r4)
            boolean r0 = r3.N()
            if (r0 != 0) goto L4c
            boolean r0 = r3.L()
            if (r0 == 0) goto L4c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4c
            int[] r0 = com.bumptech.glide.j.a.f64566a
            android.widget.ImageView$ScaleType r1 = r4.getScaleType()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L43;
                case 2: goto L3a;
                case 3: goto L31;
                case 4: goto L31;
                case 5: goto L31;
                case 6: goto L28;
                default: goto L27;
            }
        L27:
            goto L4c
        L28:
            o7.a r0 = r3.clone()
            o7.a r0 = r0.R()
            goto L4d
        L31:
            o7.a r0 = r3.clone()
            o7.a r0 = r0.S()
            goto L4d
        L3a:
            o7.a r0 = r3.clone()
            o7.a r0 = r0.R()
            goto L4d
        L43:
            o7.a r0 = r3.clone()
            o7.a r0 = r0.Q()
            goto L4d
        L4c:
            r0 = r3
        L4d:
            com.bumptech.glide.d r1 = r3.f64556E
            java.lang.Class<TranscodeType> r2 = r3.f64554C
            com.bumptech.glide.request.target.k r4 = r1.a(r4, r2)
            r1 = 0
            java.util.concurrent.Executor r2 = r7.C16872e.b()
            com.bumptech.glide.request.target.j r4 = r3.B0(r4, r1, r0, r2)
            com.bumptech.glide.request.target.k r4 = (com.bumptech.glide.request.target.k) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.j.C0(android.widget.ImageView):com.bumptech.glide.request.target.k");
    }

    public j<TranscodeType> E0(Uri uri) {
        return J0(uri, H0(uri));
    }

    public j<TranscodeType> F0(Object obj) {
        return H0(obj);
    }

    public j<TranscodeType> G0(String str) {
        return H0(str);
    }

    @Override // o7.AbstractC16076a
    public int hashCode() {
        return r7.l.p(this.f64564M, r7.l.p(this.f64563L, r7.l.o(this.f64562K, r7.l.o(this.f64561J, r7.l.o(this.f64560I, r7.l.o(this.f64559H, r7.l.o(this.f64558G, r7.l.o(this.f64557F, r7.l.o(this.f64554C, super.hashCode())))))))));
    }

    public j<TranscodeType> p0(InterfaceC16081f<TranscodeType> interfaceC16081f) {
        if (E()) {
            return clone().p0(interfaceC16081f);
        }
        if (interfaceC16081f != null) {
            if (this.f64559H == null) {
                this.f64559H = new ArrayList();
            }
            this.f64559H.add(interfaceC16081f);
        }
        return e0();
    }

    @Override // o7.AbstractC16076a
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public j<TranscodeType> a(AbstractC16076a<?> abstractC16076a) {
        r7.k.d(abstractC16076a);
        return (j) super.a(abstractC16076a);
    }

    @Override // o7.AbstractC16076a
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public j<TranscodeType> clone() {
        j<TranscodeType> jVar = (j) super.clone();
        jVar.f64557F = jVar.f64557F.clone();
        if (jVar.f64559H != null) {
            jVar.f64559H = new ArrayList(jVar.f64559H);
        }
        j<TranscodeType> jVar2 = jVar.f64560I;
        if (jVar2 != null) {
            jVar.f64560I = jVar2.clone();
        }
        j<TranscodeType> jVar3 = jVar.f64561J;
        if (jVar3 != null) {
            jVar.f64561J = jVar3.clone();
        }
        return jVar;
    }
}
