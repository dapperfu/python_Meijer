package V1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class m extends e {

    /* renamed from: w0, reason: collision with root package name */
    public ArrayList<e> f39627w0 = new ArrayList<>();

    public void K0() {
        ArrayList<e> arrayList = this.f39627w0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.f39627w0.get(i10);
            if (eVar instanceof m) {
                ((m) eVar).K0();
            }
        }
    }

    public void L0(e eVar) {
        this.f39627w0.remove(eVar);
        eVar.w0(null);
    }

    public void M0() {
        this.f39627w0.clear();
    }

    @Override // V1.e
    public void Y() {
        this.f39627w0.clear();
        super.Y();
    }

    public void b(e eVar) {
        this.f39627w0.add(eVar);
        if (eVar.G() != null) {
            ((m) eVar.G()).L0(eVar);
        }
        eVar.w0(this);
    }

    @Override // V1.e
    public void a0(U1.c cVar) {
        super.a0(cVar);
        int size = this.f39627w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f39627w0.get(i10).a0(cVar);
        }
    }
}
