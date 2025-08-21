package jd;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes4.dex */
public final class O extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    Context f140273a;

    /* renamed from: b, reason: collision with root package name */
    private final N f140274b;

    public final synchronized void b() {
        try {
            Context context = this.f140273a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f140273a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void a(Context context) {
        this.f140273a = context;
    }

    public O(N n10) {
        this.f140274b = n10;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String schemeSpecificPart;
        Uri data = intent.getData();
        if (data != null) {
            schemeSpecificPart = data.getSchemeSpecificPart();
        } else {
            schemeSpecificPart = null;
        }
        if ("com.google.android.gms".equals(schemeSpecificPart)) {
            this.f140274b.a();
            b();
        }
    }
}
