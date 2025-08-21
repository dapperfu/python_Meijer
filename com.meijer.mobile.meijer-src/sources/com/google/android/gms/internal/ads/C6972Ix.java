package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Ix, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6972Ix implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f68572a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f68573b;

    public C6972Ix(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03) {
        this.f68572a = interfaceC10213yy0;
        this.f68573b = interfaceC10213yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((JSONObject) this.f68573b.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new ZF((C6870Fx) this.f68572a.zzb(), U70.b()));
        C9358qy0.b(setSingleton);
        return setSingleton;
    }
}
