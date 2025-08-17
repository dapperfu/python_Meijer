package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.zV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10141zV implements InterfaceC8535kT {

    /* renamed from: a, reason: collision with root package name */
    private final Map f80434a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final C8528kM f80435b;

    @Override // com.google.android.gms.internal.ads.InterfaceC8535kT
    public final C8642lT a(String str, JSONObject jSONObject) throws zzfcq {
        C8642lT c8642lT;
        synchronized (this) {
            try {
                c8642lT = (C8642lT) this.f80434a.get(str);
                if (c8642lT == null) {
                    c8642lT = new C8642lT(this.f80435b.c(str, jSONObject), new BinderC8110gU(), str);
                    this.f80434a.put(str, c8642lT);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c8642lT;
    }

    public C10141zV(C8528kM c8528kM) {
        this.f80435b = c8528kM;
    }
}
