package Pc;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.ads.HandlerC6857Jd0;

/* loaded from: classes4.dex */
public final class q0 extends HandlerC6857Jd0 {
    public q0(Looper looper) {
        super(looper);
    }

    @Override // com.google.android.gms.internal.ads.HandlerC6857Jd0
    protected final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th2) {
            Lc.v.t();
            D0.n(Lc.v.s().e(), th2);
            throw th2;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e10) {
            Lc.v.s().x(e10, "AdMobHandler.handleMessage");
        }
    }
}
