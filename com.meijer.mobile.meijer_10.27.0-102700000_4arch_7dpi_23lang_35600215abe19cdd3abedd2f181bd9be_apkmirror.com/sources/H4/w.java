package H4;

import H4.AbstractC3664k;
import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class w extends AbstractC3664k {

    /* renamed from: R, reason: collision with root package name */
    int f12252R;

    /* renamed from: U, reason: collision with root package name */
    private AbstractC3664k[] f12255U;

    /* renamed from: P, reason: collision with root package name */
    ArrayList<AbstractC3664k> f12250P = new ArrayList<>();

    /* renamed from: Q, reason: collision with root package name */
    private boolean f12251Q = true;

    /* renamed from: S, reason: collision with root package name */
    boolean f12253S = false;

    /* renamed from: T, reason: collision with root package name */
    private int f12254T = 0;

    class a extends s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC3664k f12256a;

        a(AbstractC3664k abstractC3664k) {
            this.f12256a = abstractC3664k;
        }

        @Override // H4.s, H4.AbstractC3664k.h
        public void a(AbstractC3664k abstractC3664k) {
            this.f12256a.g0();
            abstractC3664k.b0(this);
        }
    }

    class b extends s {
        b() {
        }

        @Override // H4.s, H4.AbstractC3664k.h
        public void j(AbstractC3664k abstractC3664k) {
            w.this.f12250P.remove(abstractC3664k);
            if (w.this.L()) {
                return;
            }
            w.this.X(AbstractC3664k.i.f12239c, false);
            w wVar = w.this;
            wVar.f12181B = true;
            wVar.X(AbstractC3664k.i.f12238b, false);
        }
    }

    static class c extends s {

        /* renamed from: a, reason: collision with root package name */
        w f12259a;

        @Override // H4.s, H4.AbstractC3664k.h
        public void a(AbstractC3664k abstractC3664k) {
            w wVar = this.f12259a;
            int i10 = wVar.f12252R - 1;
            wVar.f12252R = i10;
            if (i10 == 0) {
                wVar.f12253S = false;
                wVar.s();
            }
            abstractC3664k.b0(this);
        }

        @Override // H4.s, H4.AbstractC3664k.h
        public void m(AbstractC3664k abstractC3664k) {
            w wVar = this.f12259a;
            if (wVar.f12253S) {
                return;
            }
            wVar.o0();
            this.f12259a.f12253S = true;
        }

        c(w wVar) {
            this.f12259a = wVar;
        }
    }

    private void A0(AbstractC3664k[] abstractC3664kArr) {
        Arrays.fill(abstractC3664kArr, (Object) null);
        this.f12255U = abstractC3664kArr;
    }

    private int x0(long j10) {
        for (int i10 = 1; i10 < this.f12250P.size(); i10++) {
            if (this.f12250P.get(i10).f12190K > j10) {
                return i10 - 1;
            }
        }
        return this.f12250P.size() - 1;
    }

    public w D0(int i10) {
        if (i10 == 0) {
            this.f12251Q = true;
            return this;
        }
        if (i10 == 1) {
            this.f12251Q = false;
            return this;
        }
        throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
    }

    @Override // H4.AbstractC3664k
    boolean L() {
        for (int i10 = 0; i10 < this.f12250P.size(); i10++) {
            if (this.f12250P.get(i10).L()) {
                return true;
            }
        }
        return false;
    }

    @Override // H4.AbstractC3664k
    /* renamed from: s0, reason: merged with bridge method [inline-methods] */
    public w d(View view) {
        for (int i10 = 0; i10 < this.f12250P.size(); i10++) {
            this.f12250P.get(i10).d(view);
        }
        return (w) super.d(view);
    }

    @Override // H4.AbstractC3664k
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public w d0(View view) {
        for (int i10 = 0; i10 < this.f12250P.size(); i10++) {
            this.f12250P.get(i10).d0(view);
        }
        return (w) super.d0(view);
    }

    private void F0() {
        c cVar = new c(this);
        Iterator<AbstractC3664k> it = this.f12250P.iterator();
        while (it.hasNext()) {
            it.next().c(cVar);
        }
        this.f12252R = this.f12250P.size();
    }

    private AbstractC3664k[] G0() {
        AbstractC3664k[] abstractC3664kArr = this.f12255U;
        this.f12255U = null;
        if (abstractC3664kArr == null) {
            abstractC3664kArr = new AbstractC3664k[this.f12250P.size()];
        }
        return (AbstractC3664k[]) this.f12250P.toArray(abstractC3664kArr);
    }

    private void u0(AbstractC3664k abstractC3664k) {
        this.f12250P.add(abstractC3664k);
        abstractC3664k.f12208r = this;
    }

    @Override // H4.AbstractC3664k
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public w k0(TimeInterpolator timeInterpolator) {
        this.f12254T |= 1;
        ArrayList<AbstractC3664k> arrayList = this.f12250P;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f12250P.get(i10).k0(timeInterpolator);
            }
        }
        return (w) super.k0(timeInterpolator);
    }

    @Override // H4.AbstractC3664k
    public boolean M() {
        int size = this.f12250P.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f12250P.get(i10).M()) {
                return false;
            }
        }
        return true;
    }

    @Override // H4.AbstractC3664k
    void a0() {
        this.f12188I = 0L;
        b bVar = new b();
        for (int i10 = 0; i10 < this.f12250P.size(); i10++) {
            AbstractC3664k abstractC3664k = this.f12250P.get(i10);
            abstractC3664k.c(bVar);
            abstractC3664k.a0();
            long jI = abstractC3664k.I();
            if (this.f12251Q) {
                this.f12188I = Math.max(this.f12188I, jI);
            } else {
                long j10 = this.f12188I;
                abstractC3664k.f12190K = j10;
                this.f12188I = j10 + jI;
            }
        }
    }

    @Override // H4.AbstractC3664k
    protected void g0() {
        if (this.f12250P.isEmpty()) {
            o0();
            s();
            return;
        }
        F0();
        if (this.f12251Q) {
            Iterator<AbstractC3664k> it = this.f12250P.iterator();
            while (it.hasNext()) {
                it.next().g0();
            }
            return;
        }
        for (int i10 = 1; i10 < this.f12250P.size(); i10++) {
            this.f12250P.get(i10 - 1).c(new a(this.f12250P.get(i10)));
        }
        AbstractC3664k abstractC3664k = this.f12250P.get(0);
        if (abstractC3664k != null) {
            abstractC3664k.g0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // H4.AbstractC3664k
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
            H4.w r7 = r0.f12208r
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
            r0.f12181B = r10
            H4.k$i r14 = H4.AbstractC3664k.i.f12237a
            r0.X(r14, r12)
        L42:
            boolean r14 = r0.f12251Q
            if (r14 == 0) goto L5f
        L46:
            java.util.ArrayList<H4.k> r7 = r0.f12250P
            int r7 = r7.size()
            if (r10 >= r7) goto L5c
            java.util.ArrayList<H4.k> r7 = r0.f12250P
            java.lang.Object r7 = r7.get(r10)
            H4.k r7 = (H4.AbstractC3664k) r7
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
            java.util.ArrayList<H4.k> r7 = r0.f12250P
            int r7 = r7.size()
            if (r10 >= r7) goto L5c
            java.util.ArrayList<H4.k> r7 = r0.f12250P
            java.lang.Object r7 = r7.get(r10)
            H4.k r7 = (H4.AbstractC3664k) r7
            long r14 = r7.f12190K
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
            java.util.ArrayList<H4.k> r7 = r0.f12250P
            java.lang.Object r7 = r7.get(r10)
            H4.k r7 = (H4.AbstractC3664k) r7
            long r8 = r7.f12190K
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
            H4.w r7 = r0.f12208r
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
            r0.f12181B = r11
        Lbd:
            H4.k$i r1 = H4.AbstractC3664k.i.f12238b
            r0.X(r1, r12)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H4.w.h0(long, long):void");
    }

    @Override // H4.AbstractC3664k
    public void i(y yVar) {
        if (O(yVar.f12262b)) {
            Iterator<AbstractC3664k> it = this.f12250P.iterator();
            while (it.hasNext()) {
                AbstractC3664k next = it.next();
                if (next.O(yVar.f12262b)) {
                    next.i(yVar);
                    yVar.f12263c.add(next);
                }
            }
        }
    }

    @Override // H4.AbstractC3664k
    public void l(y yVar) {
        if (O(yVar.f12262b)) {
            Iterator<AbstractC3664k> it = this.f12250P.iterator();
            while (it.hasNext()) {
                AbstractC3664k next = it.next();
                if (next.O(yVar.f12262b)) {
                    next.l(yVar);
                    yVar.f12263c.add(next);
                }
            }
        }
    }

    public AbstractC3664k v0(int i10) {
        if (i10 < 0 || i10 >= this.f12250P.size()) {
            return null;
        }
        return this.f12250P.get(i10);
    }

    public int w0() {
        return this.f12250P.size();
    }

    @Override // H4.AbstractC3664k
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public w i0(long j10) {
        ArrayList<AbstractC3664k> arrayList;
        super.i0(j10);
        if (this.f12193c >= 0 && (arrayList = this.f12250P) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f12250P.get(i10).i0(j10);
            }
        }
        return this;
    }

    @Override // H4.AbstractC3664k
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public w n0(long j10) {
        return (w) super.n0(j10);
    }

    @Override // H4.AbstractC3664k
    public void Y(View view) {
        super.Y(view);
        int size = this.f12250P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f12250P.get(i10).Y(view);
        }
    }

    @Override // H4.AbstractC3664k
    protected void cancel() {
        super.cancel();
        AbstractC3664k[] abstractC3664kArrG0 = G0();
        int size = this.f12250P.size();
        for (int i10 = 0; i10 < size; i10++) {
            abstractC3664kArrG0[i10].cancel();
        }
        A0(abstractC3664kArrG0);
    }

    @Override // H4.AbstractC3664k
    public void e0(View view) {
        super.e0(view);
        AbstractC3664k[] abstractC3664kArrG0 = G0();
        int size = this.f12250P.size();
        for (int i10 = 0; i10 < size; i10++) {
            abstractC3664kArrG0[i10].e0(view);
        }
        A0(abstractC3664kArrG0);
    }

    @Override // H4.AbstractC3664k
    public void j0(AbstractC3664k.e eVar) {
        super.j0(eVar);
        this.f12254T |= 8;
        int size = this.f12250P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f12250P.get(i10).j0(eVar);
        }
    }

    @Override // H4.AbstractC3664k
    void k(y yVar) {
        super.k(yVar);
        int size = this.f12250P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f12250P.get(i10).k(yVar);
        }
    }

    @Override // H4.AbstractC3664k
    public void l0(AbstractC3660g abstractC3660g) {
        super.l0(abstractC3660g);
        this.f12254T |= 4;
        if (this.f12250P != null) {
            for (int i10 = 0; i10 < this.f12250P.size(); i10++) {
                this.f12250P.get(i10).l0(abstractC3660g);
            }
        }
    }

    @Override // H4.AbstractC3664k
    public void m0(u uVar) {
        super.m0(uVar);
        this.f12254T |= 2;
        int size = this.f12250P.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f12250P.get(i10).m0(uVar);
        }
    }

    @Override // H4.AbstractC3664k
    /* renamed from: o */
    public AbstractC3664k clone() {
        w wVar = (w) super.clone();
        wVar.f12250P = new ArrayList<>();
        int size = this.f12250P.size();
        for (int i10 = 0; i10 < size; i10++) {
            wVar.u0(this.f12250P.get(i10).clone());
        }
        return wVar;
    }

    @Override // H4.AbstractC3664k
    String p0(String str) {
        String strP0 = super.p0(str);
        for (int i10 = 0; i10 < this.f12250P.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strP0);
            sb2.append("\n");
            sb2.append(this.f12250P.get(i10).p0(str + "  "));
            strP0 = sb2.toString();
        }
        return strP0;
    }

    @Override // H4.AbstractC3664k
    void q(ViewGroup viewGroup, z zVar, z zVar2, ArrayList<y> arrayList, ArrayList<y> arrayList2) {
        long jD = D();
        int size = this.f12250P.size();
        for (int i10 = 0; i10 < size; i10++) {
            AbstractC3664k abstractC3664k = this.f12250P.get(i10);
            if (jD > 0 && (this.f12251Q || i10 == 0)) {
                long jD2 = abstractC3664k.D();
                if (jD2 > 0) {
                    abstractC3664k.n0(jD2 + jD);
                } else {
                    abstractC3664k.n0(jD);
                }
            }
            abstractC3664k.q(viewGroup, zVar, zVar2, arrayList, arrayList2);
        }
    }

    @Override // H4.AbstractC3664k
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public w c(AbstractC3664k.h hVar) {
        return (w) super.c(hVar);
    }

    public w t0(AbstractC3664k abstractC3664k) {
        u0(abstractC3664k);
        long j10 = this.f12193c;
        if (j10 >= 0) {
            abstractC3664k.i0(j10);
        }
        if ((this.f12254T & 1) != 0) {
            abstractC3664k.k0(v());
        }
        if ((this.f12254T & 2) != 0) {
            z();
            abstractC3664k.m0(null);
        }
        if ((this.f12254T & 4) != 0) {
            abstractC3664k.l0(y());
        }
        if ((this.f12254T & 8) != 0) {
            abstractC3664k.j0(u());
        }
        return this;
    }

    @Override // H4.AbstractC3664k
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public w b0(AbstractC3664k.h hVar) {
        return (w) super.b0(hVar);
    }
}
