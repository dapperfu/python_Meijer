package xu;

/* renamed from: xu.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C18098d implements Au.b<Object> {

    /* renamed from: a, reason: collision with root package name */
    private volatile Object f169947a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f169948b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC18100f f169949c;

    @Override // Au.b
    public Object generatedComponent() {
        if (this.f169947a == null) {
            synchronized (this.f169948b) {
                try {
                    if (this.f169947a == null) {
                        this.f169947a = this.f169949c.get();
                    }
                } finally {
                }
            }
        }
        return this.f169947a;
    }

    public C18098d(InterfaceC18100f interfaceC18100f) {
        this.f169949c = interfaceC18100f;
    }
}
