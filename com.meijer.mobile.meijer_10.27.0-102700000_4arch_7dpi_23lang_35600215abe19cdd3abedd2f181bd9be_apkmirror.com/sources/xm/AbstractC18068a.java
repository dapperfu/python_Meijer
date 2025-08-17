package xm;

import Au.f;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.meijer.mobile.legacy.notifications.broadcastreceiver.NotificationDismissedReceiver;
import xu.C18099e;

/* renamed from: xm.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC18068a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f169693a = false;

    /* renamed from: b, reason: collision with root package name */
    private final Object f169694b = new Object();

    protected void a(Context context) {
        if (this.f169693a) {
            return;
        }
        synchronized (this.f169694b) {
            try {
                if (!this.f169693a) {
                    ((InterfaceC18070c) C18099e.a(context)).o((NotificationDismissedReceiver) f.a(this));
                    this.f169693a = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context);
    }
}
