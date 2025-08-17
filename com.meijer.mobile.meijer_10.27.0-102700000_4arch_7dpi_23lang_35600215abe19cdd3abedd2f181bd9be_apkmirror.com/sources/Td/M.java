package Td;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
final class M implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f34918a = new Hd.a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f34918a.post(runnable);
    }
}
