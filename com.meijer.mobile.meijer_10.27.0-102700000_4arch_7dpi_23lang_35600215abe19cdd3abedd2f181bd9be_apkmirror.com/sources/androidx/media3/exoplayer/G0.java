package androidx.media3.exoplayer;

import a3.C5562b;
import a3.F;
import h3.AbstractC14332a;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class G0 extends AbstractC14332a {

    /* renamed from: h, reason: collision with root package name */
    private final int f55593h;

    /* renamed from: i, reason: collision with root package name */
    private final int f55594i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f55595j;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f55596k;

    /* renamed from: l, reason: collision with root package name */
    private final a3.F[] f55597l;

    /* renamed from: m, reason: collision with root package name */
    private final Object[] f55598m;

    /* renamed from: n, reason: collision with root package name */
    private final HashMap<Object, Integer> f55599n;

    class a extends androidx.media3.exoplayer.source.m {

        /* renamed from: f, reason: collision with root package name */
        private final F.c f55600f;

        a(a3.F f10) {
            super(f10);
            this.f55600f = new F.c();
        }

        @Override // androidx.media3.exoplayer.source.m, a3.F
        public F.b g(int i10, F.b bVar, boolean z10) {
            F.b bVarG = super.g(i10, bVar, z10);
            if (super.n(bVarG.f43594c, this.f55600f).f()) {
                bVarG.u(bVar.f43592a, bVar.f43593b, bVar.f43594c, bVar.f43595d, bVar.f43596e, C5562b.f43777g, true);
                return bVarG;
            }
            bVarG.f43597f = true;
            return bVarG;
        }
    }

    public G0(Collection<? extends InterfaceC6071q0> collection, p3.s sVar) {
        this(G(collection), H(collection), sVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private G0(a3.F[] fArr, Object[] objArr, p3.s sVar) {
        super(false, sVar);
        int i10 = 0;
        int length = fArr.length;
        this.f55597l = fArr;
        this.f55595j = new int[length];
        this.f55596k = new int[length];
        this.f55598m = objArr;
        this.f55599n = new HashMap<>();
        int length2 = fArr.length;
        int iP = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length2) {
            a3.F f10 = fArr[i10];
            this.f55597l[i12] = f10;
            this.f55596k[i12] = iP;
            this.f55595j[i12] = i11;
            iP += f10.p();
            i11 += this.f55597l[i12].i();
            this.f55599n.put(objArr[i12], Integer.valueOf(i12));
            i10++;
            i12++;
        }
        this.f55593h = iP;
        this.f55594i = i11;
    }

    @Override // h3.AbstractC14332a
    protected int A(int i10) {
        return this.f55596k[i10];
    }

    @Override // h3.AbstractC14332a
    protected a3.F D(int i10) {
        return this.f55597l[i10];
    }

    public G0 E(p3.s sVar) {
        a3.F[] fArr = new a3.F[this.f55597l.length];
        int i10 = 0;
        while (true) {
            a3.F[] fArr2 = this.f55597l;
            if (i10 >= fArr2.length) {
                return new G0(fArr, this.f55598m, sVar);
            }
            fArr[i10] = new a(fArr2[i10]);
            i10++;
        }
    }

    List<a3.F> F() {
        return Arrays.asList(this.f55597l);
    }

    @Override // a3.F
    public int i() {
        return this.f55594i;
    }

    @Override // a3.F
    public int p() {
        return this.f55593h;
    }

    @Override // h3.AbstractC14332a
    protected int s(Object obj) {
        Integer num = this.f55599n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // h3.AbstractC14332a
    protected int t(int i10) {
        return d3.P.f(this.f55595j, i10 + 1, false, false);
    }

    @Override // h3.AbstractC14332a
    protected int u(int i10) {
        return d3.P.f(this.f55596k, i10 + 1, false, false);
    }

    @Override // h3.AbstractC14332a
    protected Object x(int i10) {
        return this.f55598m[i10];
    }

    @Override // h3.AbstractC14332a
    protected int z(int i10) {
        return this.f55595j[i10];
    }

    private static a3.F[] G(Collection<? extends InterfaceC6071q0> collection) {
        a3.F[] fArr = new a3.F[collection.size()];
        Iterator<? extends InterfaceC6071q0> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = it.next().b();
            i10++;
        }
        return fArr;
    }

    private static Object[] H(Collection<? extends InterfaceC6071q0> collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends InterfaceC6071q0> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = it.next().a();
            i10++;
        }
        return objArr;
    }
}
