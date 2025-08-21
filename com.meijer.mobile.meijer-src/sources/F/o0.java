package F;

/* loaded from: classes.dex */
public class o0 extends P {

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3289y f8777b;

    /* renamed from: c, reason: collision with root package name */
    private final r0 f8778c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f8779d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f8780e;

    /* renamed from: f, reason: collision with root package name */
    private final androidx.camera.core.impl.f f8781f;

    @Override // F.P, F.InterfaceC3289y
    public InterfaceC3289y getImplementation() {
        return this.f8777b;
    }

    public androidx.camera.core.impl.f j() {
        return this.f8781f;
    }

    public void k(boolean z10) {
        this.f8780e = z10;
    }

    public void l(boolean z10) {
        this.f8779d = z10;
    }

    public o0(InterfaceC3289y interfaceC3289y, androidx.camera.core.impl.f fVar) {
        super(interfaceC3289y);
        this.f8779d = false;
        this.f8780e = false;
        this.f8777b = interfaceC3289y;
        this.f8781f = fVar;
        this.f8778c = fVar.R(null);
        l(fVar.M());
        k(fVar.T());
    }
}
