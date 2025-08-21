package androidx.media3.exoplayer;

import a3.C5645b;
import a3.F;
import h3.AbstractC14445a;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
final class G0 extends AbstractC14445a {

    /* renamed from: h, reason: collision with root package name */
    private final int f55817h;

    /* renamed from: i, reason: collision with root package name */
    private final int f55818i;

    /* renamed from: j, reason: collision with root package name */
    private final int[] f55819j;

    /* renamed from: k, reason: collision with root package name */
    private final int[] f55820k;

    /* renamed from: l, reason: collision with root package name */
    private final a3.F[] f55821l;

    /* renamed from: m, reason: collision with root package name */
    private final Object[] f55822m;

    /* renamed from: n, reason: collision with root package name */
    private final HashMap<Object, Integer> f55823n;

    class a extends androidx.media3.exoplayer.source.m {

        /* renamed from: f, reason: collision with root package name */
        private final F.c f55824f;

        a(a3.F f10) {
            super(f10);
            this.f55824f = new F.c();
        }

        @Override // androidx.media3.exoplayer.source.m, a3.F
        public F.b g(int i10, F.b bVar, boolean z10) {
            F.b bVarG = super.g(i10, bVar, z10);
            if (super.n(bVarG.f44412c, this.f55824f).f()) {
                bVarG.u(bVar.f44410a, bVar.f44411b, bVar.f44412c, bVar.f44413d, bVar.f44414e, C5645b.f44595g, true);
                return bVarG;
            }
            bVarG.f44415f = true;
            return bVarG;
        }
    }

    public G0(Collection<? extends InterfaceC6213q0> collection, p3.s sVar) {
        this(G(collection), H(collection), sVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private G0(a3.F[] fArr, Object[] objArr, p3.s sVar) {
        super(false, sVar);
        int i10 = 0;
        int length = fArr.length;
        this.f55821l = fArr;
        this.f55819j = new int[length];
        this.f55820k = new int[length];
        this.f55822m = objArr;
        this.f55823n = new HashMap<>();
        int length2 = fArr.length;
        int iP = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length2) {
            a3.F f10 = fArr[i10];
            this.f55821l[i12] = f10;
            this.f55820k[i12] = iP;
            this.f55819j[i12] = i11;
            iP += f10.p();
            i11 += this.f55821l[i12].i();
            this.f55823n.put(objArr[i12], Integer.valueOf(i12));
            i10++;
            i12++;
        }
        this.f55817h = iP;
        this.f55818i = i11;
    }

    @Override // h3.AbstractC14445a
    protected int A(int i10) {
        return this.f55820k[i10];
    }

    @Override // h3.AbstractC14445a
    protected a3.F D(int i10) {
        return this.f55821l[i10];
    }

    public G0 E(p3.s sVar) {
        a3.F[] fArr = new a3.F[this.f55821l.length];
        int i10 = 0;
        while (true) {
            a3.F[] fArr2 = this.f55821l;
            if (i10 >= fArr2.length) {
                return new G0(fArr, this.f55822m, sVar);
            }
            fArr[i10] = new a(fArr2[i10]);
            i10++;
        }
    }

    List<a3.F> F() {
        return Arrays.asList(this.f55821l);
    }

    @Override // a3.F
    public int i() {
        return this.f55818i;
    }

    @Override // a3.F
    public int p() {
        return this.f55817h;
    }

    @Override // h3.AbstractC14445a
    protected int s(Object obj) {
        Integer num = this.f55823n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // h3.AbstractC14445a
    protected int t(int i10) {
        return d3.P.f(this.f55819j, i10 + 1, false, false);
    }

    @Override // h3.AbstractC14445a
    protected int u(int i10) {
        return d3.P.f(this.f55820k, i10 + 1, false, false);
    }

    @Override // h3.AbstractC14445a
    protected Object x(int i10) {
        return this.f55822m[i10];
    }

    @Override // h3.AbstractC14445a
    protected int z(int i10) {
        return this.f55819j[i10];
    }

    private static a3.F[] G(Collection<? extends InterfaceC6213q0> collection) {
        a3.F[] fArr = new a3.F[collection.size()];
        Iterator<? extends InterfaceC6213q0> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = it.next().b();
            i10++;
        }
        return fArr;
    }

    private static Object[] H(Collection<? extends InterfaceC6213q0> collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator<? extends InterfaceC6213q0> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = it.next().a();
            i10++;
        }
        return objArr;
    }
}
