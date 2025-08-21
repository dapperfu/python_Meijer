package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.mb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8884mb0 {

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static final C8884mb0 f77671d = new C8884mb0();

    /* renamed from: a, reason: collision with root package name */
    private WeakReference f77672a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f77673b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f77674c = false;

    public static C8884mb0 a() {
        return f77671d;
    }

    public final void d(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.f77674c || this.f77673b)) {
            return;
        }
        Iterator it = C7817cb0.a().c().iterator();
        while (it.hasNext()) {
            ((C7010Ka0) it.next()).g().m(z11 || z10);
        }
    }

    public final void c() {
        Context context = (Context) this.f77672a.get();
        if (context == null) {
            return;
        }
        boolean zIsDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        d(this.f77673b, zIsDeviceLocked);
        this.f77674c = zIsDeviceLocked;
    }

    public final void e(Context context) {
        if (context == null) {
            return;
        }
        this.f77672a = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new C8777lb0(this), intentFilter);
    }
}
