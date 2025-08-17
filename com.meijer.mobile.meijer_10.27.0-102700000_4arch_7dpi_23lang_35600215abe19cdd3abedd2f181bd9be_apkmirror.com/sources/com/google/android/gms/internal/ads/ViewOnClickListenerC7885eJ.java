package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import io.constructor.data.local.PreferencesHelper;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.eJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC7885eJ implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final C8315iL f73802a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f73803b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC7101Qh f73804c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC7069Pi f73805d;

    /* renamed from: e, reason: collision with root package name */
    String f73806e;

    /* renamed from: f, reason: collision with root package name */
    Long f73807f;

    /* renamed from: g, reason: collision with root package name */
    WeakReference f73808g;

    public ViewOnClickListenerC7885eJ(C8315iL c8315iL, com.google.android.gms.common.util.f fVar) {
        this.f73802a = c8315iL;
        this.f73803b = fVar;
    }

    private final void d() {
        View view;
        this.f73806e = null;
        this.f73807f = null;
        WeakReference weakReference = this.f73808g;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.f73808g = null;
    }

    public final InterfaceC7101Qh a() {
        return this.f73804c;
    }

    public final void b() {
        if (this.f73804c == null || this.f73807f == null) {
            return;
        }
        d();
        try {
            this.f73804c.zze();
        } catch (RemoteException e10) {
            Qc.p.i("#007 Could not call remote method.", e10);
        }
    }

    public final void c(final InterfaceC7101Qh interfaceC7101Qh) {
        this.f73804c = interfaceC7101Qh;
        InterfaceC7069Pi interfaceC7069Pi = this.f73805d;
        if (interfaceC7069Pi != null) {
            this.f73802a.n("/unconfirmedClick", interfaceC7069Pi);
        }
        InterfaceC7069Pi interfaceC7069Pi2 = new InterfaceC7069Pi() { // from class: com.google.android.gms.internal.ads.dJ
            @Override // com.google.android.gms.internal.ads.InterfaceC7069Pi
            public final void a(Object obj, Map map) {
                ViewOnClickListenerC7885eJ viewOnClickListenerC7885eJ = this.f73394a;
                try {
                    viewOnClickListenerC7885eJ.f73807f = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    Qc.p.d("Failed to call parse unconfirmedClickTimestamp.");
                }
                InterfaceC7101Qh interfaceC7101Qh2 = interfaceC7101Qh;
                viewOnClickListenerC7885eJ.f73806e = (String) map.get(PreferencesHelper.PREF_ID);
                String str = (String) map.get("asset_id");
                if (interfaceC7101Qh2 == null) {
                    Qc.p.b("Received unconfirmed click but UnconfirmedClickListener is null.");
                    return;
                }
                try {
                    interfaceC7101Qh2.i(str);
                } catch (RemoteException e10) {
                    Qc.p.i("#007 Could not call remote method.", e10);
                }
            }
        };
        this.f73805d = interfaceC7069Pi2;
        this.f73802a.l("/unconfirmedClick", interfaceC7069Pi2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.f73808g;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.f73806e != null && this.f73807f != null) {
            HashMap map = new HashMap();
            map.put(PreferencesHelper.PREF_ID, this.f73806e);
            map.put("time_interval", String.valueOf(this.f73803b.a() - this.f73807f.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.f73802a.j("sendMessageToNativeJs", map);
        }
        d();
    }
}
