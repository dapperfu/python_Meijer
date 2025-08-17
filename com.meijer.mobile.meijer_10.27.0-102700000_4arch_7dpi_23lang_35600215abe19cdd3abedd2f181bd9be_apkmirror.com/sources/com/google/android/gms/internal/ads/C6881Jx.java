package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Jx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6881Jx implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f67994a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f67995b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f67996c;

    public C6881Jx(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03) {
        this.f67994a = interfaceC10088yy0;
        this.f67995b = interfaceC10088yy02;
        this.f67996c = interfaceC10088yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Qc.a aVarA = ((C6912Ku) this.f67994a).a();
        JSONObject jSONObject = (JSONObject) this.f67995b.zzb();
        String str = (String) this.f67996c.zzb();
        boolean zEquals = "native".equals(str);
        Lc.v.t();
        return new C9399sb(UUID.randomUUID().toString(), aVarA, str, jSONObject, false, zEquals);
    }
}
