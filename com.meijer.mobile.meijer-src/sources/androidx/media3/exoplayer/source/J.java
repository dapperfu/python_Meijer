package androidx.media3.exoplayer.source;

import android.util.SparseArray;
import d3.C13599a;
import d3.InterfaceC13610l;

/* loaded from: classes.dex */
final class J<V> {

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC13610l<V> f56987c;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<V> f56986b = new SparseArray<>();

    /* renamed from: a, reason: collision with root package name */
    private int f56985a = -1;

    public void b() {
        for (int i10 = 0; i10 < this.f56986b.size(); i10++) {
            this.f56987c.accept(this.f56986b.valueAt(i10));
        }
        this.f56985a = -1;
        this.f56986b.clear();
    }

    public void d(int i10) {
        int i11 = 0;
        while (i11 < this.f56986b.size() - 1) {
            int i12 = i11 + 1;
            if (i10 < this.f56986b.keyAt(i12)) {
                return;
            }
            this.f56987c.accept(this.f56986b.valueAt(i11));
            this.f56986b.removeAt(i11);
            int i13 = this.f56985a;
            if (i13 > 0) {
                this.f56985a = i13 - 1;
            }
            i11 = i12;
        }
    }

    public void a(int i10, V v10) {
        if (this.f56985a == -1) {
            C13599a.g(this.f56986b.size() == 0);
            this.f56985a = 0;
        }
        if (this.f56986b.size() > 0) {
            SparseArray<V> sparseArray = this.f56986b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            C13599a.a(i10 >= iKeyAt);
            if (iKeyAt == i10) {
                InterfaceC13610l<V> interfaceC13610l = this.f56987c;
                SparseArray<V> sparseArray2 = this.f56986b;
                interfaceC13610l.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f56986b.append(i10, v10);
    }

    public void c(int i10) {
        for (int size = this.f56986b.size() - 1; size >= 0 && i10 < this.f56986b.keyAt(size); size--) {
            this.f56987c.accept(this.f56986b.valueAt(size));
            this.f56986b.removeAt(size);
        }
        this.f56985a = this.f56986b.size() > 0 ? Math.min(this.f56985a, this.f56986b.size() - 1) : -1;
    }

    public V e(int i10) {
        if (this.f56985a == -1) {
            this.f56985a = 0;
        }
        while (true) {
            int i11 = this.f56985a;
            if (i11 <= 0 || i10 >= this.f56986b.keyAt(i11)) {
                break;
            }
            this.f56985a--;
        }
        while (this.f56985a < this.f56986b.size() - 1 && i10 >= this.f56986b.keyAt(this.f56985a + 1)) {
            this.f56985a++;
        }
        return this.f56986b.valueAt(this.f56985a);
    }

    public V f() {
        return this.f56986b.valueAt(r0.size() - 1);
    }

    public boolean g() {
        return this.f56986b.size() == 0;
    }

    public J(InterfaceC13610l<V> interfaceC13610l) {
        this.f56987c = interfaceC13610l;
    }
}
