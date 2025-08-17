package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.mb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8759mb0 {

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static final C8759mb0 f76831d = new C8759mb0();

    /* renamed from: a, reason: collision with root package name */
    private WeakReference f76832a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f76833b = false;

    /* renamed from: c, reason: collision with root package name */
    private boolean f76834c = false;

    public static C8759mb0 a() {
        return f76831d;
    }

    public final void d(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.f76834c || this.f76833b)) {
            return;
        }
        Iterator it = C7692cb0.a().c().iterator();
        while (it.hasNext()) {
            ((C6885Ka0) it.next()).g().m(z11 || z10);
        }
    }

    public final void c() {
        Context context = (Context) this.f76832a.get();
        if (context == null) {
            return;
        }
        boolean zIsDeviceLocked = ((KeyguardManager) context.getSystemService("keyguard")).isDeviceLocked();
        d(this.f76833b, zIsDeviceLocked);
        this.f76834c = zIsDeviceLocked;
    }

    public final void e(Context context) {
        if (context == null) {
            return;
        }
        this.f76832a = new WeakReference(context);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        context.registerReceiver(new C8652lb0(this), intentFilter);
    }
}
