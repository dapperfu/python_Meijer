package F;

import C.InterfaceC3028m;
import C.InterfaceC3029n;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class U implements InterfaceC3028m {

    /* renamed from: b, reason: collision with root package name */
    private final int f8684b;

    @Override // C.InterfaceC3028m
    public List<InterfaceC3029n> a(List<InterfaceC3029n> list) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC3029n interfaceC3029n : list) {
            o2.i.b(interfaceC3029n instanceof InterfaceC3289y, "The camera info doesn't contain internal implementation.");
            if (interfaceC3029n.getLensFacing() == this.f8684b) {
                arrayList.add(interfaceC3029n);
            }
        }
        return arrayList;
    }

    public int b() {
        return this.f8684b;
    }

    public U(int i10) {
        this.f8684b = i10;
    }
}
