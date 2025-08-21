package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.kM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8653kM {

    /* renamed from: a, reason: collision with root package name */
    private final Q60 f76473a;

    /* renamed from: b, reason: collision with root package name */
    private final C8334hM f76474b;

    C8653kM(Q60 q60, C8334hM c8334hM) {
        this.f76473a = q60;
        this.f76474b = c8334hM;
    }

    final InterfaceC6756Cl a() throws RemoteException {
        InterfaceC6756Cl interfaceC6756ClB = this.f76473a.b();
        if (interfaceC6756ClB != null) {
            return interfaceC6756ClB;
        }
        Sc.p.g("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final S60 c(String str, JSONObject jSONObject) throws zzfcq {
        InterfaceC6858Fl interfaceC6858FlD;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                interfaceC6858FlD = new BinderC7838cm(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                interfaceC6858FlD = new BinderC7838cm(new zzbrw());
            } else {
                InterfaceC6756Cl interfaceC6756ClA = a();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        interfaceC6858FlD = interfaceC6756ClA.a(string) ? interfaceC6756ClA.d("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : interfaceC6756ClA.L(string) ? interfaceC6756ClA.d(string) : interfaceC6756ClA.d("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e10) {
                        Sc.p.e("Invalid custom event.", e10);
                    }
                } else {
                    interfaceC6858FlD = interfaceC6756ClA.d(str);
                }
            }
            S60 s60 = new S60(interfaceC6858FlD);
            this.f76474b.c(str, s60);
            return s60;
        } catch (Throwable th2) {
            if (((Boolean) Oc.A.c().a(C8784lf.f77253l9)).booleanValue()) {
                this.f76474b.c(str, null);
            }
            throw new zzfcq(th2);
        }
    }

    public final boolean d() {
        return this.f76473a.b() != null;
    }

    public final InterfaceC10295zm b(String str) throws RemoteException {
        InterfaceC10295zm interfaceC10295zmP = a().p(str);
        this.f76474b.d(str, interfaceC10295zmP);
        return interfaceC10295zmP;
    }
}
