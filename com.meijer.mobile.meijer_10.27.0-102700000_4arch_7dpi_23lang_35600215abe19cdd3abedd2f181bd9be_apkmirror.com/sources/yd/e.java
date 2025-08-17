package yd;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes6.dex */
public class e extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f170459a;

    public e(Looper looper) {
        super(looper);
        this.f170459a = Looper.getMainLooper();
    }

    public e(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f170459a = Looper.getMainLooper();
    }
}
