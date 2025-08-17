package j$.nio.file;

import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138681a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f138682b;

    public /* synthetic */ x(Consumer consumer, int i10) {
        this.f138681a = i10;
        this.f138682b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f138681a) {
            case 0:
                this.f138682b.accept(j$.desugar.sun.nio.fs.g.f(obj));
                break;
            default:
                this.f138682b.accept(j$.desugar.sun.nio.fs.g.f(obj));
                break;
        }
    }
}
