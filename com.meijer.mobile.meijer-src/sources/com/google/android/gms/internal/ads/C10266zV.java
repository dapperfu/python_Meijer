package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.zV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10266zV implements InterfaceC8660kT {

    /* renamed from: a, reason: collision with root package name */
    private final Map f81274a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final C8653kM f81275b;

    @Override // com.google.android.gms.internal.ads.InterfaceC8660kT
    public final C8767lT a(String str, JSONObject jSONObject) throws zzfcq {
        C8767lT c8767lT;
        synchronized (this) {
            try {
                c8767lT = (C8767lT) this.f81274a.get(str);
                if (c8767lT == null) {
                    c8767lT = new C8767lT(this.f81275b.c(str, jSONObject), new BinderC8235gU(), str);
                    this.f81274a.put(str, c8767lT);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c8767lT;
    }

    public C10266zV(C8653kM c8653kM) {
        this.f81275b = c8653kM;
    }
}
