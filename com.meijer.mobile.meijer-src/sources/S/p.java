package S;

import F.InterfaceC3289y;
import F.P;
import java.util.UUID;

/* loaded from: classes.dex */
public class p extends P {

    /* renamed from: b, reason: collision with root package name */
    private final String f34287b;

    /* renamed from: c, reason: collision with root package name */
    private int f34288c;

    @Override // F.P, C.InterfaceC3029n
    public int a() {
        return h(0);
    }

    @Override // F.P, F.InterfaceC3289y
    public String b() {
        return this.f34287b;
    }

    void j(int i10) {
        this.f34288c = i10;
    }

    p(InterfaceC3289y interfaceC3289y) {
        super(interfaceC3289y);
        this.f34287b = "virtual-" + interfaceC3289y.b() + "-" + UUID.randomUUID().toString();
    }

    @Override // F.P, C.InterfaceC3029n
    public int h(int i10) {
        return G.p.u(super.h(i10) - this.f34288c);
    }
}
