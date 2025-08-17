package xd;

import android.os.Handler;
import android.os.Looper;

/* renamed from: xd.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class HandlerC18038f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f169558a;

    public HandlerC18038f(Looper looper) {
        super(looper);
        this.f169558a = Looper.getMainLooper();
    }

    public HandlerC18038f(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f169558a = Looper.getMainLooper();
    }
}
