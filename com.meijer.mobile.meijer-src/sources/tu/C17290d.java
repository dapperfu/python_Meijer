package tu;

import wu.InterfaceC17927b;

/* renamed from: tu.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17290d implements InterfaceC17927b<Object> {

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f163415a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f163416b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC17292f f163417c;

    @Override // wu.InterfaceC17927b
    public Object generatedComponent() {
        if (this.f163415a == null) {
            synchronized (this.f163416b) {
                try {
                    if (this.f163415a == null) {
                        this.f163415a = this.f163417c.get();
                    }
                } finally {
                }
            }
        }
        return this.f163415a;
    }

    public C17290d(InterfaceC17292f interfaceC17292f) {
        this.f163417c = interfaceC17292f;
    }
}
