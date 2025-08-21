package s3;

import a3.G;
import d3.C13599a;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: s3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC17002c implements y {

    /* renamed from: a, reason: collision with root package name */
    protected final G f159783a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f159784b;

    /* renamed from: c, reason: collision with root package name */
    protected final int[] f159785c;

    /* renamed from: d, reason: collision with root package name */
    private final int f159786d;

    /* renamed from: e, reason: collision with root package name */
    private final a3.t[] f159787e;

    /* renamed from: f, reason: collision with root package name */
    private final long[] f159788f;

    /* renamed from: g, reason: collision with root package name */
    private int f159789g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f159790h;

    @Override // s3.y
    public void d(float f10) {
    }

    @Override // s3.y
    public void disable() {
    }

    @Override // s3.y
    public void enable() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC17002c abstractC17002c = (AbstractC17002c) obj;
            if (this.f159783a.equals(abstractC17002c.f159783a) && Arrays.equals(this.f159785c, abstractC17002c.f159785c)) {
                return true;
            }
        }
        return false;
    }

    @Override // s3.InterfaceC16996B
    public final int f(int i10) {
        for (int i11 = 0; i11 < this.f159784b; i11++) {
            if (this.f159785c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public static /* synthetic */ int l(a3.t tVar, a3.t tVar2) {
        return tVar2.f44762j - tVar.f44762j;
    }

    @Override // s3.InterfaceC16996B
    public final a3.t a(int i10) {
        return this.f159787e[i10];
    }

    @Override // s3.InterfaceC16996B
    public final int c(int i10) {
        return this.f159785c[i10];
    }

    @Override // s3.InterfaceC16996B
    public final G g() {
        return this.f159783a;
    }

    @Override // s3.y
    public void h(boolean z10) {
        this.f159790h = z10;
    }

    public int hashCode() {
        if (this.f159789g == 0) {
            this.f159789g = (System.identityHashCode(this.f159783a) * 31) + Arrays.hashCode(this.f159785c);
        }
        return this.f159789g;
    }

    @Override // s3.y
    public final int i() {
        return this.f159785c[b()];
    }

    @Override // s3.y
    public final a3.t j() {
        return this.f159787e[b()];
    }

    @Override // s3.InterfaceC16996B
    public final int length() {
        return this.f159785c.length;
    }

    public AbstractC17002c(G g10, int[] iArr, int i10) {
        boolean z10;
        if (iArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13599a.g(z10);
        this.f159786d = i10;
        this.f159783a = (G) C13599a.e(g10);
        int length = iArr.length;
        this.f159784b = length;
        this.f159787e = new a3.t[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f159787e[i11] = g10.a(iArr[i11]);
        }
        Arrays.sort(this.f159787e, new Comparator() { // from class: s3.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC17002c.l((a3.t) obj, (a3.t) obj2);
            }
        });
        this.f159785c = new int[this.f159784b];
        int i12 = 0;
        while (true) {
            int i13 = this.f159784b;
            if (i12 < i13) {
                this.f159785c[i12] = g10.b(this.f159787e[i12]);
                i12++;
            } else {
                this.f159788f = new long[i13];
                this.f159790h = false;
                return;
            }
        }
    }
}
