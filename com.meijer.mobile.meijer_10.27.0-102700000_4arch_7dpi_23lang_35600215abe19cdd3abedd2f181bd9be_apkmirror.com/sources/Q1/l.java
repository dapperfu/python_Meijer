package Q1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class l extends e {

    /* renamed from: K0, reason: collision with root package name */
    public ArrayList<e> f29693K0;

    public l() {
        this.f29693K0 = new ArrayList<>();
    }

    public void X0(e eVar) {
        this.f29693K0.add(eVar);
        if (eVar.D() != null) {
            ((l) eVar.D()).a1(eVar);
        }
        eVar.J0(this);
    }

    public ArrayList<e> Y0() {
        return this.f29693K0;
    }

    public void Z0() {
        ArrayList<e> arrayList = this.f29693K0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.f29693K0.get(i10);
            if (eVar instanceof l) {
                ((l) eVar).Z0();
            }
        }
    }

    public void a1(e eVar) {
        this.f29693K0.remove(eVar);
        eVar.i0();
    }

    public void b1() {
        this.f29693K0.clear();
    }

    @Override // Q1.e
    public void i0() {
        this.f29693K0.clear();
        super.i0();
    }

    public l(int i10, int i11) {
        super(i10, i11);
        this.f29693K0 = new ArrayList<>();
    }

    @Override // Q1.e
    public void k0(M1.c cVar) {
        super.k0(cVar);
        int size = this.f29693K0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f29693K0.get(i10).k0(cVar);
        }
    }
}
