package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.kM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8528kM {

    /* renamed from: a, reason: collision with root package name */
    private final Q60 f75633a;

    /* renamed from: b, reason: collision with root package name */
    private final C8209hM f75634b;

    C8528kM(Q60 q60, C8209hM c8209hM) {
        this.f75633a = q60;
        this.f75634b = c8209hM;
    }

    final InterfaceC6631Cl a() throws RemoteException {
        InterfaceC6631Cl interfaceC6631ClB = this.f75633a.b();
        if (interfaceC6631ClB != null) {
            return interfaceC6631ClB;
        }
        Qc.p.g("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final S60 c(String str, JSONObject jSONObject) throws zzfcq {
        InterfaceC6733Fl interfaceC6733FlD;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                interfaceC6733FlD = new BinderC7713cm(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                interfaceC6733FlD = new BinderC7713cm(new zzbrw());
            } else {
                InterfaceC6631Cl interfaceC6631ClA = a();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        interfaceC6733FlD = interfaceC6631ClA.a(string) ? interfaceC6631ClA.d("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : interfaceC6631ClA.L(string) ? interfaceC6631ClA.d(string) : interfaceC6631ClA.d("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e10) {
                        Qc.p.e("Invalid custom event.", e10);
                    }
                } else {
                    interfaceC6733FlD = interfaceC6631ClA.d(str);
                }
            }
            S60 s60 = new S60(interfaceC6733FlD);
            this.f75634b.c(str, s60);
            return s60;
        } catch (Throwable th2) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76413l9)).booleanValue()) {
                this.f75634b.c(str, null);
            }
            throw new zzfcq(th2);
        }
    }

    public final boolean d() {
        return this.f75633a.b() != null;
    }

    public final InterfaceC10170zm b(String str) throws RemoteException {
        InterfaceC10170zm interfaceC10170zmP = a().p(str);
        this.f75634b.d(str, interfaceC10170zmP);
        return interfaceC10170zmP;
    }
}
