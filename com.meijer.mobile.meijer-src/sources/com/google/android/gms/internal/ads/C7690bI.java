package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7690bI implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f73623a;

    public C7690bI(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02) {
        this.f73623a = interfaceC10213yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* synthetic */ Object zzb() {
        Sc.a aVarA = ((C7037Ku) this.f73623a).a();
        Nc.v.t();
        return new C9524sb(UUID.randomUUID().toString(), aVarA, "native", new JSONObject(), false, true);
    }
}
