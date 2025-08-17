package F;

/* loaded from: classes.dex */
public class o0 extends P {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3627y f10010b;

    /* renamed from: c, reason: collision with root package name */
    private final r0 f10011c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f10012d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f10013e;

    /* renamed from: f, reason: collision with root package name */
    private final androidx.camera.core.impl.f f10014f;

    @Override // F.P, F.InterfaceC3627y
    public InterfaceC3627y getImplementation() {
        return this.f10010b;
    }

    public androidx.camera.core.impl.f j() {
        return this.f10014f;
    }

    public void k(boolean z10) {
        this.f10013e = z10;
    }

    public void l(boolean z10) {
        this.f10012d = z10;
    }

    public o0(InterfaceC3627y interfaceC3627y, androidx.camera.core.impl.f fVar) {
        super(interfaceC3627y);
        this.f10012d = false;
        this.f10013e = false;
        this.f10010b = interfaceC3627y;
        this.f10014f = fVar;
        this.f10011c = fVar.R(null);
        l(fVar.M());
        k(fVar.T());
    }
}
