package com.google.android.gms.internal.ads;

import Rc.C5216z;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Cy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6769Cy implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final C9677ty f66929a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f66930b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f66931c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10213yy0 f66932d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC10213yy0 f66933e;

    public C6769Cy(C9677ty c9677ty, InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03, InterfaceC10213yy0 interfaceC10213yy04) {
        this.f66929a = c9677ty;
        this.f66930b = interfaceC10213yy0;
        this.f66931c = interfaceC10213yy02;
        this.f66932d = interfaceC10213yy03;
        this.f66933e = interfaceC10213yy04;
    }

    public static ZF a(C9677ty c9677ty, final Context context, final Sc.a aVar, final Z50 z50, final C9695u60 c9695u60) {
        return new ZF(new PC() { // from class: com.google.android.gms.internal.ads.ry
            @Override // com.google.android.gms.internal.ads.PC
            public final void zzs() {
                C5216z c5216zW = Nc.v.w();
                Context context2 = context;
                C9695u60 c9695u602 = c9695u60;
                c5216zW.n(context2, aVar.f34479a, z50.f72837C.toString(), c9695u602.f79580f);
            }
        }, C7033Kq.f69020g);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return a(this.f66929a, (Context) this.f66930b.zzb(), ((C7037Ku) this.f66931c).a(), ((C7313Sz) this.f66932d).a(), ((QB) this.f66933e).a());
    }
}
