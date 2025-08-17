package s3;

import a3.G;
import d3.C13466a;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: s3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC16856c implements y {

    /* renamed from: a, reason: collision with root package name */
    protected final G f159920a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f159921b;

    /* renamed from: c, reason: collision with root package name */
    protected final int[] f159922c;

    /* renamed from: d, reason: collision with root package name */
    private final int f159923d;

    /* renamed from: e, reason: collision with root package name */
    private final a3.t[] f159924e;

    /* renamed from: f, reason: collision with root package name */
    private final long[] f159925f;

    /* renamed from: g, reason: collision with root package name */
    private int f159926g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f159927h;

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
            AbstractC16856c abstractC16856c = (AbstractC16856c) obj;
            if (this.f159920a.equals(abstractC16856c.f159920a) && Arrays.equals(this.f159922c, abstractC16856c.f159922c)) {
                return true;
            }
        }
        return false;
    }

    @Override // s3.InterfaceC16850B
    public final int f(int i10) {
        for (int i11 = 0; i11 < this.f159921b; i11++) {
            if (this.f159922c[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public static /* synthetic */ int l(a3.t tVar, a3.t tVar2) {
        return tVar2.f43944j - tVar.f43944j;
    }

    @Override // s3.InterfaceC16850B
    public final a3.t a(int i10) {
        return this.f159924e[i10];
    }

    @Override // s3.InterfaceC16850B
    public final int c(int i10) {
        return this.f159922c[i10];
    }

    @Override // s3.InterfaceC16850B
    public final G g() {
        return this.f159920a;
    }

    @Override // s3.y
    public void h(boolean z10) {
        this.f159927h = z10;
    }

    public int hashCode() {
        if (this.f159926g == 0) {
            this.f159926g = (System.identityHashCode(this.f159920a) * 31) + Arrays.hashCode(this.f159922c);
        }
        return this.f159926g;
    }

    @Override // s3.y
    public final int i() {
        return this.f159922c[b()];
    }

    @Override // s3.y
    public final a3.t j() {
        return this.f159924e[b()];
    }

    @Override // s3.InterfaceC16850B
    public final int length() {
        return this.f159922c.length;
    }

    public AbstractC16856c(G g10, int[] iArr, int i10) {
        boolean z10;
        if (iArr.length > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.g(z10);
        this.f159923d = i10;
        this.f159920a = (G) C13466a.e(g10);
        int length = iArr.length;
        this.f159921b = length;
        this.f159924e = new a3.t[length];
        for (int i11 = 0; i11 < iArr.length; i11++) {
            this.f159924e[i11] = g10.a(iArr[i11]);
        }
        Arrays.sort(this.f159924e, new Comparator() { // from class: s3.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AbstractC16856c.l((a3.t) obj, (a3.t) obj2);
            }
        });
        this.f159922c = new int[this.f159921b];
        int i12 = 0;
        while (true) {
            int i13 = this.f159921b;
            if (i12 < i13) {
                this.f159922c[i12] = g10.b(this.f159924e[i12]);
                i12++;
            } else {
                this.f159925f = new long[i13];
                this.f159927h = false;
                return;
            }
        }
    }
}
