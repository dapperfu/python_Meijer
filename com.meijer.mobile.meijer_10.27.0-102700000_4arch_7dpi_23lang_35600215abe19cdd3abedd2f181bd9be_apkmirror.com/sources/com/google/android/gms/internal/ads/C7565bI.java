package com.google.android.gms.internal.ads;

import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7565bI implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f72783a;

    public C7565bI(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02) {
        this.f72783a = interfaceC10088yy0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* synthetic */ Object zzb() {
        Qc.a aVarA = ((C6912Ku) this.f72783a).a();
        Lc.v.t();
        return new C9399sb(UUID.randomUUID().toString(), aVarA, "native", new JSONObject(), false, true);
    }
}
