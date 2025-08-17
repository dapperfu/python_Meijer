package wd;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes6.dex */
public class j extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f166038a;

    public j(Looper looper) {
        super(looper);
        this.f166038a = Looper.getMainLooper();
    }

    public j(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f166038a = Looper.getMainLooper();
    }
}
