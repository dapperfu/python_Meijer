package Ad;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes6.dex */
public class e extends Handler {

    /* renamed from: a, reason: collision with root package name */
    private final Looper f308a;

    public e(Looper looper) {
        super(looper);
        this.f308a = Looper.getMainLooper();
    }

    public e(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        this.f308a = Looper.getMainLooper();
    }
}
