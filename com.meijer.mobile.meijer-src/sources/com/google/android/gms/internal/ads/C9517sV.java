package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.sV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9517sV implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f79102a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f79103b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f79104c;

    public C9517sV(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03) {
        this.f79102a = interfaceC10213yy0;
        this.f79103b = interfaceC10213yy02;
        this.f79104c = interfaceC10213yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C9410rV((Context) this.f79102a.zzb(), (Executor) this.f79103b.zzb(), (DL) this.f79104c.zzb());
    }
}
