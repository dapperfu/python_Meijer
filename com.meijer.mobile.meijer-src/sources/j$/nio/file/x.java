package j$.nio.file;

import java.util.function.Consumer;

/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f139270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Consumer f139271b;

    public /* synthetic */ x(Consumer consumer, int i10) {
        this.f139270a = i10;
        this.f139271b = consumer;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f139270a) {
            case 0:
                this.f139271b.accept(j$.desugar.sun.nio.fs.g.f(obj));
                break;
            default:
                this.f139271b.accept(j$.desugar.sun.nio.fs.g.f(obj));
                break;
        }
    }
}
