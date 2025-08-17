package nu;

import android.view.View;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import nu.g;

/* loaded from: classes11.dex */
public abstract class h<VH extends g> implements InterfaceC15948c {

    /* renamed from: d, reason: collision with root package name */
    private static AtomicLong f152829d = new AtomicLong(0);

    /* renamed from: a, reason: collision with root package name */
    protected InterfaceC15950e f152830a;

    /* renamed from: b, reason: collision with root package name */
    private final long f152831b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Object> f152832c;

    public h() {
        this(f152829d.decrementAndGet());
    }

    @Override // nu.InterfaceC15948c
    public int a() {
        return 1;
    }

    public abstract void b(VH vh2, int i10);

    @Override // nu.InterfaceC15948c
    public void f(InterfaceC15950e interfaceC15950e) {
        this.f152830a = null;
    }

    public Object h(h hVar) {
        return null;
    }

    public abstract int j();

    public int k(int i10, int i11) {
        return i10;
    }

    public boolean n() {
        return true;
    }

    public boolean o() {
        return true;
    }

    public boolean p() {
        return true;
    }

    public void r(VH vh2) {
    }

    public void s(VH vh2) {
    }

    protected h(long j10) {
        this.f152832c = new HashMap();
        this.f152831b = j10;
    }

    @Override // nu.InterfaceC15948c
    public void c(InterfaceC15950e interfaceC15950e) {
        this.f152830a = interfaceC15950e;
    }

    public VH g(View view) {
        return (VH) new g(view);
    }

    @Override // nu.InterfaceC15948c
    public h getItem(int i10) {
        if (i10 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("Wanted item at position " + i10 + " but an Item is a Group of size 1");
    }

    public long i() {
        return this.f152831b;
    }

    public void d(VH vh2, int i10, List<Object> list) {
        b(vh2, i10);
    }

    public void e(VH vh2, int i10, List<Object> list, j jVar, k kVar) {
        vh2.d(this, jVar, kVar);
        d(vh2, i10, list);
    }

    public int l() {
        return j();
    }

    public boolean m(h hVar) {
        return equals(hVar);
    }

    public boolean q(h hVar) {
        if (l() != hVar.l() || i() != hVar.i()) {
            return false;
        }
        return true;
    }

    public void t(VH vh2) {
        vh2.f();
    }
}
