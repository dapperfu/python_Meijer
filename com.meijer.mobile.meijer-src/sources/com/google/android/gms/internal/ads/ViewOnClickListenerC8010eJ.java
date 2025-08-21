package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import io.constructor.data.local.PreferencesHelper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.eJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC8010eJ implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final C8440iL f74642a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f74643b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC7226Qh f74644c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC7194Pi f74645d;

    /* renamed from: e, reason: collision with root package name */
    String f74646e;

    /* renamed from: f, reason: collision with root package name */
    Long f74647f;

    /* renamed from: g, reason: collision with root package name */
    WeakReference f74648g;

    public ViewOnClickListenerC8010eJ(C8440iL c8440iL, com.google.android.gms.common.util.f fVar) {
        this.f74642a = c8440iL;
        this.f74643b = fVar;
    }

    private final void d() {
        View view;
        this.f74646e = null;
        this.f74647f = null;
        WeakReference weakReference = this.f74648g;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.f74648g = null;
    }

    public final InterfaceC7226Qh a() {
        return this.f74644c;
    }

    public final void b() {
        if (this.f74644c == null || this.f74647f == null) {
            return;
        }
        d();
        try {
            this.f74644c.zze();
        } catch (RemoteException e10) {
            Sc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void c(final InterfaceC7226Qh interfaceC7226Qh) {
        this.f74644c = interfaceC7226Qh;
        InterfaceC7194Pi interfaceC7194Pi = this.f74645d;
        if (interfaceC7194Pi != null) {
            this.f74642a.n("/unconfirmedClick", interfaceC7194Pi);
        }
        InterfaceC7194Pi interfaceC7194Pi2 = new InterfaceC7194Pi() { // from class: com.google.android.gms.internal.ads.dJ
            @Override // com.google.android.gms.internal.ads.InterfaceC7194Pi
            public final void a(Object obj, Map map) {
                ViewOnClickListenerC8010eJ viewOnClickListenerC8010eJ = this.f74234a;
                try {
                    viewOnClickListenerC8010eJ.f74647f = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    Sc.p.d("Failed to call parse unconfirmedClickTimestamp.");
                }
                InterfaceC7226Qh interfaceC7226Qh2 = interfaceC7226Qh;
                viewOnClickListenerC8010eJ.f74646e = (String) map.get(PreferencesHelper.PREF_ID);
                String str = (String) map.get("asset_id");
                if (interfaceC7226Qh2 == null) {
                    Sc.p.b("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    interfaceC7226Qh2.i(str);
                } catch (RemoteException e10) {
                    Sc.p.i("#007 Could not call remote method.", e10);
                }
            }
        };
        this.f74645d = interfaceC7194Pi2;
        this.f74642a.l("/unconfirmedClick", interfaceC7194Pi2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.f74648g;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f74646e != null && this.f74647f != null) {
            HashMap map = new HashMap();
            map.put(PreferencesHelper.PREF_ID, this.f74646e);
            map.put("time_interval", String.valueOf(this.f74643b.a() - this.f74647f.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.f74642a.j("sendMessageToNativeJs", map);
        }
        d();
    }
}
