package S;

import F.InterfaceC3627y;
import F.P;
import java.util.UUID;

/* loaded from: classes.dex */
public class p extends P {

    /* renamed from: b, reason: collision with root package name */
    private final String f33108b;

    /* renamed from: c, reason: collision with root package name */
    private int f33109c;

    @Override // F.P, C.InterfaceC2971n
    public int a() {
        return h(0);
    }

    @Override // F.P, F.InterfaceC3627y
    public String b() {
        return this.f33108b;
    }

    void j(int i10) {
        this.f33109c = i10;
    }

    p(InterfaceC3627y interfaceC3627y) {
        super(interfaceC3627y);
        this.f33108b = "virtual-" + interfaceC3627y.b() + "-" + UUID.randomUUID().toString();
    }

    @Override // F.P, C.InterfaceC2971n
    public int h(int i10) {
        return G.p.u(super.h(i10) - this.f33109c);
    }
}
