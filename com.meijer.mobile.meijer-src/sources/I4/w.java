package I4;

import I4.AbstractC3830k;
import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class w extends AbstractC3830k {

    /* renamed from: R, reason: collision with root package name */
    int f14316R;

    /* renamed from: U, reason: collision with root package name */
    private AbstractC3830k[] f14319U;

    /* renamed from: P, reason: collision with root package name */
    ArrayList<AbstractC3830k> f14314P = new ArrayList<>();

    /* renamed from: Q, reason: collision with root package name */
    private boolean f14315Q = true;

    /* renamed from: S, reason: collision with root package name */
    boolean f14317S = false;

    /* renamed from: T, reason: collision with root package name */
    private int f14318T = 0;

    class a extends s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3830k f14320a;

        a(AbstractC3830k abstractC3830k) {
            this.f14320a = abstractC3830k;
        }

        @Override // I4.s, I4.AbstractC3830k.h
        public void j(AbstractC3830k abstractC3830k) {
            this.f14320a.g0();
            abstractC3830k.c0(this);
        }
    }

    class b extends s {
        b() {
        }

        @Override // I4.s, I4.AbstractC3830k.h
        public void m(AbstractC3830k abstractC3830k) {
            w.this.f14314P.remove(abstractC3830k);
            if (w.this.L()) {
                return;
            }
            w.this.X(AbstractC3830k.i.f14303c, false);
            w wVar = w.this;
            wVar.f14245B = true;
            wVar.X(AbstractC3830k.i.f14302b, false);
        }
    }

    static class c extends s {

        /* renamed from: a, reason: collision with root package name */
        w f14323a;

        @Override // I4.s, I4.AbstractC3830k.h
        public void j(AbstractC3830k abstractC3830k) {
            w wVar = this.f14323a;
            int i10 = wVar.f14316R - 1;
            wVar.f14316R = i10;
            if (i10 == 0) {
                wVar.f14317S = false;
                wVar.s();
            }
            abstractC3830k.c0(this);
        }

        @Override // I4.s, I4.AbstractC3830k.h
        public void l(AbstractC3830k abstractC3830k) {
            w wVar = this.f14323a;
            if (wVar.f14317S) {
                return;
            }
            wVar.o0();
            this.f14323a.f14317S = true;
        }

        c(w wVar) {
            this.f14323a = wVar;
        }
    }

    private void A0(AbstractC3830k[] abstractC3830kArr) {
        Arrays.fill(abstractC3830kArr, (Object) null);
        this.f14319U = abstractC3830kArr;
    }

    private int x0(long j10) {
        for (int i10 = 1; i10 < this.f14314P.size(); i10++) {
            if (this.f14314P.get(i10).f14254K > j10) {
                return i10 - 1;
            }
        }
        return this.f14314P.size() - 1;
    }

    public w D0(int i10) {
        if (i10 == 0) {
            this.f14315Q = true;
            return this;
        }
        if (i10 == 1) {
            this.f14315Q = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
    }

    @Override // I4.AbstractC3830k
    boolean L() {
        for (int i10 = 0; i10 < this.f14314P.size(); i10++) {
            if (this.f14314P.get(i10).L()) {
                return true;
            }
        }
        return false;
    }

    @Override // I4.AbstractC3830k
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public w d(View view) {
        for (int i10 = 0; i10 < this.f14314P.size(); i10++) {
            this.f14314P.get(i10).d(view);
        }
        return (w) super.d(view);
    }

    @Override // I4.AbstractC3830k
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public w d0(View view) {
        for (int i10 = 0; i10 < this.f14314P.size(); i10++) {
            this.f14314P.get(i10).d0(view);
        }
        return (w) super.d0(view);
    }

    private void F0() {
        c cVar = new c(this);
        Iterator<AbstractC3830k> it = this.f14314P.iterator();
        while (it.hasNext()) {
            it.next().c(cVar);
        }
        this.f14316R = this.f14314P.size();
    }

    private AbstractC3830k[] G0() {
        AbstractC3830k[] abstractC3830kArr = this.f14319U;
        this.f14319U = null;
        if (abstractC3830kArr == null) {
            abstractC3830kArr = new AbstractC3830k[this.f14314P.size()];
        }
        return (AbstractC3830k[]) this.f14314P.toArray(abstractC3830kArr);
    }

    private void u0(AbstractC3830k abstractC3830k) {
        this.f14314P.add(abstractC3830k);
        abstractC3830k.f14272r = this;
    }

    @Override // I4.AbstractC3830k
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public w k0(TimeInterpolator timeInterpolator) {
        this.f14318T |= 1;
        ArrayList<AbstractC3830k> arrayList = this.f14314P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f14314P.get(i10).k0(timeInterpolator);
            }
        }
        return (w) super.k0(timeInterpolator);
    }

    @Override // I4.AbstractC3830k
    public boolean M() {
        int size = this.f14314P.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f14314P.get(i10).M()) {
                return false;
            }
        }
        return true;
    }

    @Override // I4.AbstractC3830k
    void a0() {
        this.f14252I = 0L;
        b bVar = new b();
        for (int i10 = 0; i10 < this.f14314P.size(); i10++) {
            AbstractC3830k abstractC3830k = this.f14314P.get(i10);
            abstractC3830k.c(bVar);
            abstractC3830k.a0();
            long jI = abstractC3830k.I();
            if (this.f14315Q) {
                this.f14252I = Math.max(this.f14252I, jI);
            } else {
                long j10 = this.f14252I;
                abstractC3830k.f14254K = j10;
                this.f14252I = j10 + jI;
            }
        }
    }

    @Override // I4.AbstractC3830k
    protected void g0() {
        if (this.f14314P.isEmpty()) {
            o0();
            s();
            return;
        }
        F0();
        if (this.f14315Q) {
            Iterator<AbstractC3830k> it = this.f14314P.iterator();
            while (it.hasNext()) {
                it.next().g0();
            }
            return;
        }
        for (int i10 = 1; i10 < this.f14314P.size(); i10++) {
            this.f14314P.get(i10 - 1).c(new a(this.f14314P.get(i10)));
        }
        AbstractC3830k abstractC3830k = this.f14314P.get(0);
        if (abstractC3830k != null) {
            abstractC3830k.g0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // I4.AbstractC3830k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void h0(long r20, long r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r3 = r22
            long r5 = r0.I()
            I4.w r7 = r0.f14272r
            r8 = 0
            if (r7 == 0) goto L22
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 >= 0) goto L18
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 < 0) goto Lc2
        L18:
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L22
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L22
            goto Lc2
        L22:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r10 = 0
            r11 = 1
            if (r7 >= 0) goto L2a
            r12 = r11
            goto L2b
        L2a:
            r12 = r10
        L2b:
            int r13 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r13 < 0) goto L33
            int r14 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r14 < 0) goto L3b
        L33:
            int r14 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r14 > 0) goto L42
            int r14 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r14 <= 0) goto L42
        L3b:
            r0.f14245B = r10
            I4.k$i r14 = I4.AbstractC3830k.i.f14301a
            r0.X(r14, r12)
        L42:
            boolean r14 = r0.f14315Q
            if (r14 == 0) goto L5f
        L46:
            java.util.ArrayList<I4.k> r7 = r0.f14314P
            int r7 = r7.size()
            if (r10 >= r7) goto L5c
            java.util.ArrayList<I4.k> r7 = r0.f14314P
            java.lang.Object r7 = r7.get(r10)
            I4.k r7 = (I4.AbstractC3830k) r7
            r7.h0(r1, r3)
            int r10 = r10 + 1
            goto L46
        L5c:
            r16 = r8
            goto La7
        L5f:
            int r10 = r0.x0(r3)
            if (r7 < 0) goto L8a
        L65:
            java.util.ArrayList<I4.k> r7 = r0.f14314P
            int r7 = r7.size()
            if (r10 >= r7) goto L5c
            java.util.ArrayList<I4.k> r7 = r0.f14314P
            java.lang.Object r7 = r7.get(r10)
            I4.k r7 = (I4.AbstractC3830k) r7
            long r14 = r7.f14254K
            r16 = r8
            long r8 = r1 - r14
            int r18 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r18 >= 0) goto L80
            goto La7
        L80:
            long r14 = r3 - r14
            r7.h0(r8, r14)
            int r10 = r10 + 1
            r8 = r16
            goto L65
        L8a:
            r16 = r8
        L8c:
            if (r10 < 0) goto La7
            java.util.ArrayList<I4.k> r7 = r0.f14314P
            java.lang.Object r7 = r7.get(r10)
            I4.k r7 = (I4.AbstractC3830k) r7
            long r8 = r7.f14254K
            long r14 = r1 - r8
            long r8 = r3 - r8
            r7.h0(r14, r8)
            int r7 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r7 < 0) goto La4
            goto La7
        La4:
            int r10 = r10 + (-1)
            goto L8c
        La7:
            I4.w r7 = r0.f14272r
            if (r7 == 0) goto Lc2
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto Lb3
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 <= 0) goto Lb9
        Lb3:
            if (r13 >= 0) goto Lc2
            int r2 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r2 < 0) goto Lc2
        Lb9:
            if (r1 <= 0) goto Lbd
            r0.f14245B = r11
        Lbd:
            I4.k$i r1 = I4.AbstractC3830k.i.f14302b
            r0.X(r1, r12)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: I4.w.h0(long, long):void");
    }

    @Override // I4.AbstractC3830k
    public void i(y yVar) {
        if (O(yVar.f14326b)) {
            Iterator<AbstractC3830k> it = this.f14314P.iterator();
            while (it.hasNext()) {
                AbstractC3830k next = it.next();
                if (next.O(yVar.f14326b)) {
                    next.i(yVar);
                    yVar.f14327c.add(next);
                }
            }
        }
    }

    @Override // I4.AbstractC3830k
    public void l(y yVar) {
        if (O(yVar.f14326b)) {
            Iterator<AbstractC3830k> it = this.f14314P.iterator();
            while (it.hasNext()) {
                AbstractC3830k next = it.next();
                if (next.O(yVar.f14326b)) {
                    next.l(yVar);
                    yVar.f14327c.add(next);
                }
            }
        }
    }

    public AbstractC3830k v0(int i10) {
        if (i10 < 0 || i10 >= this.f14314P.size()) {
            return null;
        }
        return this.f14314P.get(i10);
    }

    public int w0() {
        return this.f14314P.size();
    }

    @Override // I4.AbstractC3830k
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public w i0(long j10) {
        ArrayList<AbstractC3830k> arrayList;
        super.i0(j10);
        if (this.f14257c >= 0 && (arrayList = this.f14314P) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f14314P.get(i10).i0(j10);
            }
        }
        return this;
    }

    @Override // I4.AbstractC3830k
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public w n0(long j10) {
        return (w) super.n0(j10);
    }

    @Override // I4.AbstractC3830k
    public void Y(View view) {
        super.Y(view);
        int size = this.f14314P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f14314P.get(i10).Y(view);
        }
    }

    @Override // I4.AbstractC3830k
    protected void cancel() {
        super.cancel();
        AbstractC3830k[] abstractC3830kArrG0 = G0();
        int size = this.f14314P.size();
        for (int i10 = 0; i10 < size; i10++) {
            abstractC3830kArrG0[i10].cancel();
        }
        A0(abstractC3830kArrG0);
    }

    @Override // I4.AbstractC3830k
    public void e0(View view) {
        super.e0(view);
        AbstractC3830k[] abstractC3830kArrG0 = G0();
        int size = this.f14314P.size();
        for (int i10 = 0; i10 < size; i10++) {
            abstractC3830kArrG0[i10].e0(view);
        }
        A0(abstractC3830kArrG0);
    }

    @Override // I4.AbstractC3830k
    public void j0(AbstractC3830k.e eVar) {
        super.j0(eVar);
        this.f14318T |= 8;
        int size = this.f14314P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f14314P.get(i10).j0(eVar);
        }
    }

    @Override // I4.AbstractC3830k
    void k(y yVar) {
        super.k(yVar);
        int size = this.f14314P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f14314P.get(i10).k(yVar);
        }
    }

    @Override // I4.AbstractC3830k
    public void l0(AbstractC3826g abstractC3826g) {
        super.l0(abstractC3826g);
        this.f14318T |= 4;
        if (this.f14314P != null) {
            for (int i10 = 0; i10 < this.f14314P.size(); i10++) {
                this.f14314P.get(i10).l0(abstractC3826g);
            }
        }
    }

    @Override // I4.AbstractC3830k
    public void m0(u uVar) {
        super.m0(uVar);
        this.f14318T |= 2;
        int size = this.f14314P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f14314P.get(i10).m0(uVar);
        }
    }

    @Override // I4.AbstractC3830k
    /* renamed from: o */
    public AbstractC3830k clone() {
        w wVar = (w) super.clone();
        wVar.f14314P = new ArrayList<>();
        int size = this.f14314P.size();
        for (int i10 = 0; i10 < size; i10++) {
            wVar.u0(this.f14314P.get(i10).clone());
        }
        return wVar;
    }

    @Override // I4.AbstractC3830k
    String p0(String str) {
        String strP0 = super.p0(str);
        for (int i10 = 0; i10 < this.f14314P.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strP0);
            sb2.append("\n");
            sb2.append(this.f14314P.get(i10).p0(str + "  "));
            strP0 = sb2.toString();
        }
        return strP0;
    }

    @Override // I4.AbstractC3830k
    void q(ViewGroup viewGroup, z zVar, z zVar2, ArrayList<y> arrayList, ArrayList<y> arrayList2) {
        long jD = D();
        int size = this.f14314P.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC3830k abstractC3830k = this.f14314P.get(i10);
            if (jD > 0 && (this.f14315Q || i10 == 0)) {
                long jD2 = abstractC3830k.D();
                if (jD2 > 0) {
                    abstractC3830k.n0(jD2 + jD);
                } else {
                    abstractC3830k.n0(jD);
                }
            }
            abstractC3830k.q(viewGroup, zVar, zVar2, arrayList, arrayList2);
        }
    }

    @Override // I4.AbstractC3830k
    /* renamed from: q0, reason: merged with bridge method [inline-methods] */
    public w c(AbstractC3830k.h hVar) {
        return (w) super.c(hVar);
    }

    public w t0(AbstractC3830k abstractC3830k) {
        u0(abstractC3830k);
        long j10 = this.f14257c;
        if (j10 >= 0) {
            abstractC3830k.i0(j10);
        }
        if ((this.f14318T & 1) != 0) {
            abstractC3830k.k0(v());
        }
        if ((this.f14318T & 2) != 0) {
            z();
            abstractC3830k.m0(null);
        }
        if ((this.f14318T & 4) != 0) {
            abstractC3830k.l0(y());
        }
        if ((this.f14318T & 8) != 0) {
            abstractC3830k.j0(u());
        }
        return this;
    }

    @Override // I4.AbstractC3830k
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public w c0(AbstractC3830k.h hVar) {
        return (w) super.c0(hVar);
    }
}
