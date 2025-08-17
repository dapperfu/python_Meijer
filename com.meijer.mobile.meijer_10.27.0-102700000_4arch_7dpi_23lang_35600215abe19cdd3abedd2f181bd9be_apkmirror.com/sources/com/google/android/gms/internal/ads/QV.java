package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class QV implements InterfaceC8535kT {

    /* renamed from: a, reason: collision with root package name */
    private final C9714vW f69582a;

    /* renamed from: b, reason: collision with root package name */
    private final C8528kM f69583b;

    QV(C9714vW c9714vW, C8528kM c8528kM) {
        this.f69582a = c9714vW;
        this.f69583b = c8528kM;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8535kT
    public final C8642lT a(String str, JSONObject jSONObject) throws zzfcq {
        InterfaceC10170zm interfaceC10170zmB;
        if (((Boolean) Mc.A.c().a(C8659lf.f76056M1)).booleanValue()) {
            try {
                interfaceC10170zmB = this.f69583b.b(str);
            } catch (RemoteException e10) {
                Qc.p.e("Coundn't create RTB adapter: ", e10);
                interfaceC10170zmB = null;
            }
        } else {
            interfaceC10170zmB = this.f69582a.a(str);
        }
        if (interfaceC10170zmB == null) {
            return null;
        }
        return new C8642lT(interfaceC10170zmB, new BinderC8003fU(), str);
    }
}
