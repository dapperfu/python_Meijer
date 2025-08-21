package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class QV implements InterfaceC8660kT {

    /* renamed from: a, reason: collision with root package name */
    private final C9839vW f70422a;

    /* renamed from: b, reason: collision with root package name */
    private final C8653kM f70423b;

    QV(C9839vW c9839vW, C8653kM c8653kM) {
        this.f70422a = c9839vW;
        this.f70423b = c8653kM;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8660kT
    public final C8767lT a(String str, JSONObject jSONObject) throws zzfcq {
        InterfaceC10295zm interfaceC10295zmB;
        if (((Boolean) Oc.A.c().a(C8784lf.f76896M1)).booleanValue()) {
            try {
                interfaceC10295zmB = this.f70423b.b(str);
            } catch (RemoteException e10) {
                Sc.p.e("Coundn't create RTB adapter: ", e10);
                interfaceC10295zmB = null;
            }
        } else {
            interfaceC10295zmB = this.f70422a.a(str);
        }
        if (interfaceC10295zmB == null) {
            return null;
        }
        return new C8767lT(interfaceC10295zmB, new BinderC8128fU(), str);
    }
}
