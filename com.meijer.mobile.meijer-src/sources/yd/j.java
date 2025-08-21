package yd;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes7.dex */
public class j extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f171360a;

    public j(Looper looper) {
        super(looper);
        this.f171360a = Looper.getMainLooper();
    }

    public j(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f171360a = Looper.getMainLooper();
    }
}
