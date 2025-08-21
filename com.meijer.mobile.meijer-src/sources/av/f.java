package av;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes10.dex */
public final class f extends CountDownLatch implements Lu.g<Throwable>, Lu.a {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f59687a;

    public f() {
        super(1);
    }

    @Override // Lu.g
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable th2) {
        this.f59687a = th2;
        countDown();
    }

    @Override // Lu.a
    public void run() {
        countDown();
    }
}
