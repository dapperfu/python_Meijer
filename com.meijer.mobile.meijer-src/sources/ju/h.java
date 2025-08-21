package ju;

import android.view.View;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import ju.g;

/* loaded from: classes12.dex */
public abstract class h<VH extends g> implements InterfaceC15068c {

    /* renamed from: d, reason: collision with root package name */
    private static AtomicLong f141279d = new AtomicLong(0);

    /* renamed from: a, reason: collision with root package name */
    protected InterfaceC15070e f141280a;

    /* renamed from: b, reason: collision with root package name */
    private final long f141281b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, Object> f141282c;

    public h() {
        this(f141279d.decrementAndGet());
    }

    @Override // ju.InterfaceC15068c
    public int a() {
        return 1;
    }

    public abstract void b(VH vh2, int i10);

    @Override // ju.InterfaceC15068c
    public void g(InterfaceC15070e interfaceC15070e) {
        this.f141280a = null;
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
        this.f141282c = new HashMap();
        this.f141281b = j10;
    }

    @Override // ju.InterfaceC15068c
    public void c(InterfaceC15070e interfaceC15070e) {
        this.f141280a = interfaceC15070e;
    }

    public VH f(View view) {
        return (VH) new g(view);
    }

    @Override // ju.InterfaceC15068c
    public h getItem(int i10) {
        if (i10 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("Wanted item at position " + i10 + " but an Item is a Group of size 1");
    }

    public long i() {
        return this.f141281b;
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
