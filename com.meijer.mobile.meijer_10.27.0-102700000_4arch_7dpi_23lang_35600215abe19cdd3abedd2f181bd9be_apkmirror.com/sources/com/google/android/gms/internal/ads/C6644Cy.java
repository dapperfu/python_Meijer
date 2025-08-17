package com.google.android.gms.internal.ads;

import Pc.C4595z;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Cy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6644Cy implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final C9552ty f66089a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f66090b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f66091c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10088yy0 f66092d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC10088yy0 f66093e;

    public C6644Cy(C9552ty c9552ty, InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04) {
        this.f66089a = c9552ty;
        this.f66090b = interfaceC10088yy0;
        this.f66091c = interfaceC10088yy02;
        this.f66092d = interfaceC10088yy03;
        this.f66093e = interfaceC10088yy04;
    }

    public static ZF a(C9552ty c9552ty, final Context context, final Qc.a aVar, final Z50 z50, final C9570u60 c9570u60) {
        return new ZF(new PC() { // from class: com.google.android.gms.internal.ads.ry
            @Override // com.google.android.gms.internal.ads.PC
            public final void zzs() {
                C4595z c4595zW = Lc.v.w();
                Context context2 = context;
                C9570u60 c9570u602 = c9570u60;
                c4595zW.n(context2, aVar.f29929a, z50.f71997C.toString(), c9570u602.f78740f);
            }
        }, C6908Kq.f68180g);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        return a(this.f66089a, (Context) this.f66090b.zzb(), ((C6912Ku) this.f66091c).a(), ((C7188Sz) this.f66092d).a(), ((QB) this.f66093e).a());
    }
}
