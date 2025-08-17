package ev;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes9.dex */
public final class f extends CountDownLatch implements Pu.g<Throwable>, Pu.a {

    /* renamed from: a, reason: collision with root package name */
    public Throwable f130065a;

    public f() {
        super(1);
    }

    @Override // Pu.g
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(Throwable th2) {
        this.f130065a = th2;
        countDown();
    }

    @Override // Pu.a
    public void run() {
        countDown();
    }
}
