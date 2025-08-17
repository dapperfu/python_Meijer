package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Qx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7118Qx implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f69688a;

    public C7118Qx(InterfaceC10088yy0 interfaceC10088yy0) {
        this.f69688a = interfaceC10088yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((C7188Sz) this.f69688a).a().f72071z);
        } catch (JSONException unused) {
            return null;
        }
    }
}
