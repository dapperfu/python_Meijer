package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
final class Gv0 extends Zt0 {

    /* renamed from: h, reason: collision with root package name */
    static final int[] f68142h = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, a.e.API_PRIORITY_OTHER};

    /* renamed from: c, reason: collision with root package name */
    private final int f68143c;

    /* renamed from: d, reason: collision with root package name */
    private final Zt0 f68144d;

    /* renamed from: e, reason: collision with root package name */
    private final Zt0 f68145e;

    /* renamed from: f, reason: collision with root package name */
    private final int f68146f;

    /* renamed from: g, reason: collision with root package name */
    private final int f68147g;

    @Override // com.google.android.gms.internal.ads.Zt0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Zt0)) {
            return false;
        }
        Zt0 zt0 = (Zt0) obj;
        if (this.f68143c != zt0.k()) {
            return false;
        }
        if (this.f68143c == 0) {
            return true;
        }
        int iU = u();
        int iU2 = zt0.u();
        if (iU != 0 && iU2 != 0 && iU != iU2) {
            return false;
        }
        Fv0 fv0 = null;
        Ev0 ev0 = new Ev0(this, fv0);
        Vt0 vt0A = ev0.next();
        Ev0 ev02 = new Ev0(zt0, fv0);
        Vt0 vt0A2 = ev02.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int iK = vt0A.k() - i10;
            int iK2 = vt0A2.k() - i11;
            int iMin = Math.min(iK, iK2);
            if (!(i10 == 0 ? vt0A.E(vt0A2, i11, iMin) : vt0A2.E(vt0A, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f68143c;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iK) {
                vt0A = ev0.next();
                i10 = 0;
            } else {
                i10 += iMin;
                vt0A = vt0A;
            }
            if (iMin == iK2) {
                vt0A2 = ev02.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.Zt0
    public final int k() {
        return this.f68143c;
    }

    @Override // com.google.android.gms.internal.ads.Zt0
    protected final int m() {
        return this.f68147g;
    }

    private Gv0(Zt0 zt0, Zt0 zt02) {
        this.f68144d = zt0;
        this.f68145e = zt02;
        int iK = zt0.k();
        this.f68146f = iK;
        this.f68143c = iK + zt02.k();
        this.f68147g = Math.max(zt0.m(), zt02.m()) + 1;
    }

    static int H(int i10) {
        int[] iArr = f68142h;
        int length = iArr.length;
        return i10 >= 47 ? a.e.API_PRIORITY_OTHER : iArr[i10];
    }

    @Override // com.google.android.gms.internal.ads.Zt0
    public final byte e(int i10) {
        Zt0.C(i10, this.f68143c);
        return f(i10);
    }

    @Override // com.google.android.gms.internal.ads.Zt0
    final byte f(int i10) {
        int i11 = this.f68146f;
        return i10 < i11 ? this.f68144d.f(i10) : this.f68145e.f(i10 - i11);
    }

    @Override // com.google.android.gms.internal.ads.Zt0, java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new Cv0(this);
    }

    @Override // com.google.android.gms.internal.ads.Zt0
    protected final void l(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f68146f;
        if (i13 <= i14) {
            this.f68144d.l(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f68145e.l(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f68144d.l(bArr, i10, i11, i15);
            this.f68145e.l(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // com.google.android.gms.internal.ads.Zt0
    protected final boolean n() {
        return this.f68143c >= H(this.f68147g);
    }

    @Override // com.google.android.gms.internal.ads.Zt0
    protected final int o(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f68146f;
        if (i13 <= i14) {
            return this.f68144d.o(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f68145e.o(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f68145e.o(this.f68144d.o(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.ads.Zt0
    public final Zt0 p(int i10, int i11) {
        int iT = Zt0.t(i10, i11, this.f68143c);
        if (iT == 0) {
            return Zt0.f73122b;
        }
        if (iT == this.f68143c) {
            return this;
        }
        int i12 = this.f68146f;
        if (i11 <= i12) {
            return this.f68144d.p(i10, i11);
        }
        if (i10 >= i12) {
            return this.f68145e.p(i10 - i12, i11 - i12);
        }
        Zt0 zt0 = this.f68144d;
        return new Gv0(zt0.p(i10, zt0.k()), this.f68145e.p(0, i11 - this.f68146f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.Zt0
    public final AbstractC8068eu0 q() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        Object[] objArr = 0;
        Ev0 ev0 = new Ev0(this, null);
        while (ev0.hasNext()) {
            arrayList.add(ev0.next().r());
        }
        int i10 = AbstractC8068eu0.f74785e;
        int i11 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i11 = byteBuffer.hasArray() ? i11 | 1 : byteBuffer.isDirect() ? i11 | 2 : i11 | 4;
        }
        return i11 == 2 ? new C7749bu0(arrayList, iRemaining, true, objArr == true ? 1 : 0) : AbstractC8068eu0.e(new Uu0(arrayList), RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
    }

    @Override // com.google.android.gms.internal.ads.Zt0
    final void s(Qt0 qt0) throws IOException {
        this.f68144d.s(qt0);
        this.f68145e.s(qt0);
    }

    @Override // com.google.android.gms.internal.ads.Zt0
    /* renamed from: v */
    public final Ut0 iterator() {
        return new Cv0(this);
    }

    static Zt0 F(Zt0 zt0, Zt0 zt02) {
        if (zt02.k() == 0) {
            return zt0;
        }
        if (zt0.k() == 0) {
            return zt02;
        }
        int iK = zt0.k() + zt02.k();
        if (iK < 128) {
            return G(zt0, zt02);
        }
        if (zt0 instanceof Gv0) {
            Gv0 gv0 = (Gv0) zt0;
            if (gv0.f68145e.k() + zt02.k() < 128) {
                return new Gv0(gv0.f68144d, G(gv0.f68145e, zt02));
            }
            if (gv0.f68144d.m() > gv0.f68145e.m() && gv0.f68147g > zt02.m()) {
                return new Gv0(gv0.f68144d, new Gv0(gv0.f68145e, zt02));
            }
        }
        if (iK >= H(Math.max(zt0.m(), zt02.m()) + 1)) {
            return new Gv0(zt0, zt02);
        }
        return Dv0.a(new Dv0(null), zt0, zt02);
    }

    private static Zt0 G(Zt0 zt0, Zt0 zt02) {
        int iK = zt0.k();
        int iK2 = zt02.k();
        byte[] bArr = new byte[iK + iK2];
        zt0.D(bArr, 0, 0, iK);
        zt02.D(bArr, 0, iK, iK2);
        return new Wt0(bArr);
    }
}
