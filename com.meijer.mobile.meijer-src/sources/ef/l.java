package ef;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public enum l implements Executor {
    INSTANCE;


    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    private static final Handler f130155b = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f130155b.post(runnable);
    }
}
