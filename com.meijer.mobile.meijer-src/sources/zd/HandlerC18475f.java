package zd;

import android.os.Handler;
import android.os.Looper;

/* renamed from: zd.f, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class HandlerC18475f extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f172707a;

    public HandlerC18475f(Looper looper) {
        super(looper);
        this.f172707a = Looper.getMainLooper();
    }

    public HandlerC18475f(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f172707a = Looper.getMainLooper();
    }
}
