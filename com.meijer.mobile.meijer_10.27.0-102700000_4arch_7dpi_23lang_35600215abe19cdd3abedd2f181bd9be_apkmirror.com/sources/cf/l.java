package cf;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public enum l implements Executor {
    INSTANCE;


    /* renamed from: b, reason: collision with root package name */
    @SuppressLint({"ThreadPoolCreation"})
    private static final Handler f61773b = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f61773b.post(runnable);
    }
}
