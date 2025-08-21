package j3;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final /* synthetic */ class F implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f139778a;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f139778a.post(runnable);
    }
}
