package tc;

import android.annotation.SuppressLint;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
abstract class j {
    @SuppressLint({"ThreadPoolCreation"})
    static Executor a() {
        return new n(Executors.newSingleThreadExecutor());
    }
}
