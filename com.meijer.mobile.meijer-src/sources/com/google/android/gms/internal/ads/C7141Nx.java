package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Nx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7141Nx implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f69813a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f69814b;

    public C7141Nx(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03) {
        this.f69813a = interfaceC10213yy0;
        this.f69814b = interfaceC10213yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((JSONObject) this.f69814b.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new ZF((C6870Fx) this.f69813a.zzb(), U70.b()));
        C9358qy0.b(setSingleton);
        return setSingleton;
    }
}
