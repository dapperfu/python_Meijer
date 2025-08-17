package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Nx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7016Nx implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f68973a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f68974b;

    public C7016Nx(InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03) {
        this.f68973a = interfaceC10088yy0;
        this.f68974b = interfaceC10088yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((JSONObject) this.f68974b.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new ZF((C6745Fx) this.f68973a.zzb(), U70.b()));
        C9233qy0.b(setSingleton);
        return setSingleton;
    }
}
