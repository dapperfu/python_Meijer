package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Qx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7243Qx implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f70528a;

    public C7243Qx(InterfaceC10213yy0 interfaceC10213yy0) {
        this.f70528a = interfaceC10213yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return new JSONObject(((C7313Sz) this.f70528a).a().f72911z);
        } catch (JSONException unused) {
            return null;
        }
    }
}
