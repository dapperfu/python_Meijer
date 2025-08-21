package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Mx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7107Mx implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f69604a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f69605b;

    public C7107Mx(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03) {
        this.f69604a = interfaceC10213yy0;
        this.f69605b = interfaceC10213yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = ((JSONObject) this.f69605b.zzb()) == null ? Collections.EMPTY_SET : Collections.singleton(new ZF((C6870Fx) this.f69604a.zzb(), U70.b()));
        C9358qy0.b(setSingleton);
        return setSingleton;
    }
}
