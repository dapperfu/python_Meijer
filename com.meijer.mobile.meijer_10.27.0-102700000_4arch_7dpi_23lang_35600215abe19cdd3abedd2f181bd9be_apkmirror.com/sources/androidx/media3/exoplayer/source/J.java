package androidx.media3.exoplayer.source;

import android.util.SparseArray;
import d3.C13466a;
import d3.InterfaceC13477l;

/* loaded from: classes.dex */
final class J<V> {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC13477l<V> f56763c;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<V> f56762b = new SparseArray<>();

    /* renamed from: a, reason: collision with root package name */
    private int f56761a = -1;

    public void b() {
        for (int i10 = 0; i10 < this.f56762b.size(); i10++) {
            this.f56763c.accept(this.f56762b.valueAt(i10));
        }
        this.f56761a = -1;
        this.f56762b.clear();
    }

    public void d(int i10) {
        int i11 = 0;
        while (i11 < this.f56762b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f56762b.keyAt(i12)) {
                return;
            }
            this.f56763c.accept(this.f56762b.valueAt(i11));
            this.f56762b.removeAt(i11);
            int i13 = this.f56761a;
            if (i13 > 0) {
                this.f56761a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public void a(int i10, V v10) {
        if (this.f56761a == -1) {
            C13466a.g(this.f56762b.size() == 0);
            this.f56761a = 0;
        }
        if (this.f56762b.size() > 0) {
            SparseArray<V> sparseArray = this.f56762b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            C13466a.a(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                InterfaceC13477l<V> interfaceC13477l = this.f56763c;
                SparseArray<V> sparseArray2 = this.f56762b;
                interfaceC13477l.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f56762b.append(i10, v10);
    }

    public void c(int i10) {
        for (int size = this.f56762b.size() - 1; size >= 0 && i10 < this.f56762b.keyAt(size); size--) {
            this.f56763c.accept(this.f56762b.valueAt(size));
            this.f56762b.removeAt(size);
        }
        this.f56761a = this.f56762b.size() > 0 ? Math.min(this.f56761a, this.f56762b.size() - 1) : -1;
    }

    public V e(int i10) {
        if (this.f56761a == -1) {
            this.f56761a = 0;
        }
        while (true) {
            int i11 = this.f56761a;
            if (i11 <= 0 || i10 >= this.f56762b.keyAt(i11)) {
                break;
            }
            this.f56761a--;
        }
        while (this.f56761a < this.f56762b.size() - 1 && i10 >= this.f56762b.keyAt(this.f56761a + 1)) {
            this.f56761a++;
        }
        return this.f56762b.valueAt(this.f56761a);
    }

    public V f() {
        return this.f56762b.valueAt(r0.size() - 1);
    }

    public boolean g() {
        return this.f56762b.size() == 0;
    }

    public J(InterfaceC13477l<V> interfaceC13477l) {
        this.f56763c = interfaceC13477l;
    }
}
