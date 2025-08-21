package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Jx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7006Jx implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f68834a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f68835b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f68836c;

    public C7006Jx(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03) {
        this.f68834a = interfaceC10213yy0;
        this.f68835b = interfaceC10213yy02;
        this.f68836c = interfaceC10213yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Sc.a aVarA = ((C7037Ku) this.f68834a).a();
        JSONObject jSONObject = (JSONObject) this.f68835b.zzb();
        String str = (String) this.f68836c.zzb();
        boolean zEquals = "native".equals(str);
        Nc.v.t();
        return new C9524sb(UUID.randomUUID().toString(), aVarA, str, jSONObject, false, zEquals);
    }
}
