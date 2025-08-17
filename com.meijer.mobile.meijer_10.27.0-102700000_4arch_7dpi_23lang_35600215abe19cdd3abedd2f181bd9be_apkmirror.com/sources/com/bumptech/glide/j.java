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
import m7.AbstractC15566a;
import m7.C15567b;
import m7.C15572g;
import m7.C15574i;
import m7.C15575j;
import m7.InterfaceC15569d;
import m7.InterfaceC15570e;
import m7.InterfaceC15571f;
import o7.C16001a;
import p7.C16268e;

/* loaded from: classes4.dex */
public class j<TranscodeType> extends AbstractC15566a<j<TranscodeType>> implements Cloneable {

    /* renamed from: O, reason: collision with root package name */
    protected static final C15572g f63711O = new C15572g().f(X6.a.f39159c).Y(g.LOW).i0(true);

    /* renamed from: A, reason: collision with root package name */
    private final Context f63712A;

    /* renamed from: B, reason: collision with root package name */
    private final k f63713B;

    /* renamed from: C, reason: collision with root package name */
    private final Class<TranscodeType> f63714C;

    /* renamed from: D, reason: collision with root package name */
    private final b f63715D;

    /* renamed from: E, reason: collision with root package name */
    private final d f63716E;

    /* renamed from: F, reason: collision with root package name */
    private l<?, ? super TranscodeType> f63717F;

    /* renamed from: G, reason: collision with root package name */
    private Object f63718G;

    /* renamed from: H, reason: collision with root package name */
    private List<InterfaceC15571f<TranscodeType>> f63719H;

    /* renamed from: I, reason: collision with root package name */
    private j<TranscodeType> f63720I;

    /* renamed from: J, reason: collision with root package name */
    private j<TranscodeType> f63721J;

    /* renamed from: K, reason: collision with root package name */
    private Float f63722K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f63723L = true;

    /* renamed from: M, reason: collision with root package name */
    private boolean f63724M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f63725N;

    public <Y extends com.bumptech.glide.request.target.j<TranscodeType>> Y z0(Y y10) {
        return (Y) A0(y10, null, C16268e.b());
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63726a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f63727b;

        static {
            int[] iArr = new int[g.values().length];
            f63727b = iArr;
            try {
                iArr[g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63727b[g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63727b[g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63727b[g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f63726a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f63726a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f63726a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f63726a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f63726a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f63726a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f63726a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f63726a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private j<TranscodeType> I0(Uri uri, j<TranscodeType> jVar) {
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? jVar : s0(jVar);
    }

    private InterfaceC15569d J0(Object obj, com.bumptech.glide.request.target.j<TranscodeType> jVar, InterfaceC15571f<TranscodeType> interfaceC15571f, AbstractC15566a<?> abstractC15566a, InterfaceC15570e interfaceC15570e, l<?, ? super TranscodeType> lVar, g gVar, int i10, int i11, Executor executor) {
        Context context = this.f63712A;
        d dVar = this.f63716E;
        return C15574i.x(context, dVar, obj, this.f63718G, this.f63714C, abstractC15566a, i10, i11, gVar, jVar, interfaceC15571f, this.f63719H, interfaceC15570e, dVar.f(), lVar.b(), executor);
    }

    private j<TranscodeType> s0(j<TranscodeType> jVar) {
        return jVar.j0(this.f63712A.getTheme()).g0(C16001a.a(this.f63712A));
    }

    private InterfaceC15569d t0(com.bumptech.glide.request.target.j<TranscodeType> jVar, InterfaceC15571f<TranscodeType> interfaceC15571f, AbstractC15566a<?> abstractC15566a, Executor executor) {
        return u0(new Object(), jVar, interfaceC15571f, null, this.f63717F, abstractC15566a.v(), abstractC15566a.s(), abstractC15566a.r(), abstractC15566a, executor);
    }

    private InterfaceC15569d u0(Object obj, com.bumptech.glide.request.target.j<TranscodeType> jVar, InterfaceC15571f<TranscodeType> interfaceC15571f, InterfaceC15570e interfaceC15570e, l<?, ? super TranscodeType> lVar, g gVar, int i10, int i11, AbstractC15566a<?> abstractC15566a, Executor executor) {
        C15567b c15567b;
        InterfaceC15570e interfaceC15570e2;
        Object obj2;
        com.bumptech.glide.request.target.j<TranscodeType> jVar2;
        InterfaceC15571f<TranscodeType> interfaceC15571f2;
        l<?, ? super TranscodeType> lVar2;
        g gVar2;
        int i12;
        int i13;
        AbstractC15566a<?> abstractC15566a2;
        Executor executor2;
        j<TranscodeType> jVar3;
        if (this.f63721J != null) {
            c15567b = new C15567b(obj, interfaceC15570e);
            interfaceC15570e2 = c15567b;
            jVar3 = this;
            obj2 = obj;
            jVar2 = jVar;
            interfaceC15571f2 = interfaceC15571f;
            lVar2 = lVar;
            gVar2 = gVar;
            i12 = i10;
            i13 = i11;
            abstractC15566a2 = abstractC15566a;
            executor2 = executor;
        } else {
            c15567b = null;
            interfaceC15570e2 = interfaceC15570e;
            obj2 = obj;
            jVar2 = jVar;
            interfaceC15571f2 = interfaceC15571f;
            lVar2 = lVar;
            gVar2 = gVar;
            i12 = i10;
            i13 = i11;
            abstractC15566a2 = abstractC15566a;
            executor2 = executor;
            jVar3 = this;
        }
        InterfaceC15569d interfaceC15569dV0 = jVar3.v0(obj2, jVar2, interfaceC15571f2, interfaceC15570e2, lVar2, gVar2, i12, i13, abstractC15566a2, executor2);
        if (c15567b == null) {
            return interfaceC15569dV0;
        }
        int iS = this.f63721J.s();
        int iR = this.f63721J.r();
        if (p7.l.t(i10, i11) && !this.f63721J.O()) {
            iS = abstractC15566a.s();
            iR = abstractC15566a.r();
        }
        j<TranscodeType> jVar4 = this.f63721J;
        C15567b c15567b2 = c15567b;
        c15567b2.n(interfaceC15569dV0, jVar4.u0(obj, jVar, interfaceC15571f, c15567b2, jVar4.f63717F, jVar4.v(), iS, iR, this.f63721J, executor));
        return c15567b2;
    }

    private InterfaceC15569d v0(Object obj, com.bumptech.glide.request.target.j<TranscodeType> jVar, InterfaceC15571f<TranscodeType> interfaceC15571f, InterfaceC15570e interfaceC15570e, l<?, ? super TranscodeType> lVar, g gVar, int i10, int i11, AbstractC15566a<?> abstractC15566a, Executor executor) {
        j<TranscodeType> jVar2 = this.f63720I;
        if (jVar2 == null) {
            if (this.f63722K == null) {
                return J0(obj, jVar, interfaceC15571f, abstractC15566a, interfaceC15570e, lVar, gVar, i10, i11, executor);
            }
            C15575j c15575j = new C15575j(obj, interfaceC15570e);
            c15575j.m(J0(obj, jVar, interfaceC15571f, abstractC15566a, c15575j, lVar, gVar, i10, i11, executor), J0(obj, jVar, interfaceC15571f, abstractC15566a.clone().h0(this.f63722K.floatValue()), c15575j, lVar, x0(gVar), i10, i11, executor));
            return c15575j;
        }
        if (this.f63725N) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        l<?, ? super TranscodeType> lVar2 = jVar2.f63723L ? lVar : jVar2.f63717F;
        g gVarV = jVar2.H() ? this.f63720I.v() : x0(gVar);
        int iS = this.f63720I.s();
        int iR = this.f63720I.r();
        if (p7.l.t(i10, i11) && !this.f63720I.O()) {
            iS = abstractC15566a.s();
            iR = abstractC15566a.r();
        }
        C15575j c15575j2 = new C15575j(obj, interfaceC15570e);
        InterfaceC15569d interfaceC15569dJ0 = J0(obj, jVar, interfaceC15571f, abstractC15566a, c15575j2, lVar, gVar, i10, i11, executor);
        this.f63725N = true;
        j jVar3 = (j<TranscodeType>) this.f63720I;
        InterfaceC15569d interfaceC15569dU0 = jVar3.u0(obj, jVar, interfaceC15571f, c15575j2, lVar2, gVarV, iS, iR, jVar3, executor);
        this.f63725N = false;
        c15575j2.m(interfaceC15569dJ0, interfaceC15569dU0);
        return c15575j2;
    }

    private g x0(g gVar) {
        int i10 = a.f63727b[gVar.ordinal()];
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

    @Override // m7.AbstractC15566a
    public boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (super.equals(jVar) && Objects.equals(this.f63714C, jVar.f63714C) && this.f63717F.equals(jVar.f63717F) && Objects.equals(this.f63718G, jVar.f63718G) && Objects.equals(this.f63719H, jVar.f63719H) && Objects.equals(this.f63720I, jVar.f63720I) && Objects.equals(this.f63721J, jVar.f63721J) && Objects.equals(this.f63722K, jVar.f63722K) && this.f63723L == jVar.f63723L && this.f63724M == jVar.f63724M) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"CheckResult"})
    protected j(b bVar, k kVar, Class<TranscodeType> cls, Context context) {
        this.f63715D = bVar;
        this.f63713B = kVar;
        this.f63714C = cls;
        this.f63712A = context;
        this.f63717F = kVar.h(cls);
        this.f63716E = bVar.i();
        y0(kVar.f());
        a(kVar.g());
    }

    private <Y extends com.bumptech.glide.request.target.j<TranscodeType>> Y B0(Y y10, InterfaceC15571f<TranscodeType> interfaceC15571f, AbstractC15566a<?> abstractC15566a, Executor executor) {
        p7.k.d(y10);
        if (this.f63724M) {
            InterfaceC15569d interfaceC15569dT0 = t0(y10, interfaceC15571f, abstractC15566a, executor);
            InterfaceC15569d request = y10.getRequest();
            if (interfaceC15569dT0.e(request) && !D0(abstractC15566a, request)) {
                if (!((InterfaceC15569d) p7.k.d(request)).isRunning()) {
                    request.i();
                }
                return y10;
            }
            this.f63713B.d(y10);
            y10.setRequest(interfaceC15569dT0);
            this.f63713B.o(y10, interfaceC15569dT0);
            return y10;
        }
        throw new IllegalArgumentException("You must call #load() before calling #into()");
    }

    private boolean D0(AbstractC15566a<?> abstractC15566a, InterfaceC15569d interfaceC15569d) {
        if (!abstractC15566a.G() && interfaceC15569d.isComplete()) {
            return true;
        }
        return false;
    }

    private j<TranscodeType> H0(Object obj) {
        if (E()) {
            return clone().H0(obj);
        }
        this.f63718G = obj;
        this.f63724M = true;
        return e0();
    }

    @SuppressLint({"CheckResult"})
    private void y0(List<InterfaceC15571f<Object>> list) {
        Iterator<InterfaceC15571f<Object>> it = list.iterator();
        while (it.hasNext()) {
            p0((InterfaceC15571f) it.next());
        }
    }

    <Y extends com.bumptech.glide.request.target.j<TranscodeType>> Y A0(Y y10, InterfaceC15571f<TranscodeType> interfaceC15571f, Executor executor) {
        return (Y) B0(y10, interfaceC15571f, this, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.bumptech.glide.request.target.k<android.widget.ImageView, TranscodeType> C0(android.widget.ImageView r4) {
        /*
            r3 = this;
            p7.l.a()
            p7.k.d(r4)
            boolean r0 = r3.N()
            if (r0 != 0) goto L4c
            boolean r0 = r3.L()
            if (r0 == 0) goto L4c
            android.widget.ImageView$ScaleType r0 = r4.getScaleType()
            if (r0 == 0) goto L4c
            int[] r0 = com.bumptech.glide.j.a.f63726a
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
            m7.a r0 = r3.clone()
            m7.a r0 = r0.R()
            goto L4d
        L31:
            m7.a r0 = r3.clone()
            m7.a r0 = r0.S()
            goto L4d
        L3a:
            m7.a r0 = r3.clone()
            m7.a r0 = r0.R()
            goto L4d
        L43:
            m7.a r0 = r3.clone()
            m7.a r0 = r0.Q()
            goto L4d
        L4c:
            r0 = r3
        L4d:
            com.bumptech.glide.d r1 = r3.f63716E
            java.lang.Class<TranscodeType> r2 = r3.f63714C
            com.bumptech.glide.request.target.k r4 = r1.a(r4, r2)
            r1 = 0
            java.util.concurrent.Executor r2 = p7.C16268e.b()
            com.bumptech.glide.request.target.j r4 = r3.B0(r4, r1, r0, r2)
            com.bumptech.glide.request.target.k r4 = (com.bumptech.glide.request.target.k) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.j.C0(android.widget.ImageView):com.bumptech.glide.request.target.k");
    }

    public j<TranscodeType> E0(Uri uri) {
        return I0(uri, H0(uri));
    }

    public j<TranscodeType> F0(Object obj) {
        return H0(obj);
    }

    public j<TranscodeType> G0(String str) {
        return H0(str);
    }

    @Override // m7.AbstractC15566a
    public int hashCode() {
        return p7.l.p(this.f63724M, p7.l.p(this.f63723L, p7.l.o(this.f63722K, p7.l.o(this.f63721J, p7.l.o(this.f63720I, p7.l.o(this.f63719H, p7.l.o(this.f63718G, p7.l.o(this.f63717F, p7.l.o(this.f63714C, super.hashCode())))))))));
    }

    public j<TranscodeType> p0(InterfaceC15571f<TranscodeType> interfaceC15571f) {
        if (E()) {
            return clone().p0(interfaceC15571f);
        }
        if (interfaceC15571f != null) {
            if (this.f63719H == null) {
                this.f63719H = new ArrayList();
            }
            this.f63719H.add(interfaceC15571f);
        }
        return e0();
    }

    @Override // m7.AbstractC15566a
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public j<TranscodeType> a(AbstractC15566a<?> abstractC15566a) {
        p7.k.d(abstractC15566a);
        return (j) super.a(abstractC15566a);
    }

    @Override // m7.AbstractC15566a
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public j<TranscodeType> clone() {
        j<TranscodeType> jVar = (j) super.clone();
        jVar.f63717F = jVar.f63717F.clone();
        if (jVar.f63719H != null) {
            jVar.f63719H = new ArrayList(jVar.f63719H);
        }
        j<TranscodeType> jVar2 = jVar.f63720I;
        if (jVar2 != null) {
            jVar.f63720I = jVar2.clone();
        }
        j<TranscodeType> jVar3 = jVar.f63721J;
        if (jVar3 != null) {
            jVar.f63721J = jVar3.clone();
        }
        return jVar;
    }
}
