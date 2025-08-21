package ym;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.meijer.mobile.legacy.notifications.broadcastreceiver.NotificationDismissedReceiver;
import tu.C17291e;
import wu.f;

/* renamed from: ym.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC18330a extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f171470a = false;

    /* renamed from: b, reason: collision with root package name */
    private final Object f171471b = new Object();

    protected void a(Context context) {
        if (this.f171470a) {
            return;
        }
        synchronized (this.f171471b) {
            try {
                if (!this.f171470a) {
                    ((InterfaceC18332c) C17291e.a(context)).o((NotificationDismissedReceiver) f.a(this));
                    this.f171470a = true;
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
