package F;

import C.InterfaceC2970m;
import C.InterfaceC2971n;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class U implements InterfaceC2970m {

    /* renamed from: b, reason: collision with root package name */
    private final int f9917b;

    @Override // C.InterfaceC2970m
    public List<InterfaceC2971n> a(List<InterfaceC2971n> list) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC2971n interfaceC2971n : list) {
            o2.i.b(interfaceC2971n instanceof InterfaceC3627y, "The camera info doesn't contain internal implementation.");
            if (interfaceC2971n.getLensFacing() == this.f9917b) {
                arrayList.add(interfaceC2971n);
            }
        }
        return arrayList;
    }

    public int b() {
        return this.f9917b;
    }

    public U(int i10) {
        this.f9917b = i10;
    }
}
