package com.google.android.gms.internal.ads;

import Pc.C4595z;
import android.content.Context;

/* loaded from: classes6.dex */
public final class RG implements InterfaceC8377iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10088yy0 f69841a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10088yy0 f69842b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10088yy0 f69843c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10088yy0 f69844d;

    public RG(JG jg2, InterfaceC10088yy0 interfaceC10088yy0, InterfaceC10088yy0 interfaceC10088yy02, InterfaceC10088yy0 interfaceC10088yy03, InterfaceC10088yy0 interfaceC10088yy04) {
        this.f69841a = interfaceC10088yy0;
        this.f69842b = interfaceC10088yy02;
        this.f69843c = interfaceC10088yy03;
        this.f69844d = interfaceC10088yy04;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10088yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.f69841a.zzb();
        final Qc.a aVarA = ((C6912Ku) this.f69842b).a();
        final Z50 z50A = ((C7188Sz) this.f69843c).a();
        final C9570u60 c9570u60A = ((QB) this.f69844d).a();
        return new ZF(new PC() { // from class: com.google.android.gms.internal.ads.HG
            @Override // com.google.android.gms.internal.ads.PC
            public final void zzs() {
                C4595z c4595zW = Lc.v.w();
                Context context2 = context;
                C9570u60 c9570u60 = c9570u60A;
                c4595zW.n(context2, aVarA.f29929a, z50A.f71997C.toString(), c9570u60.f78740f);
            }
        }, C6908Kq.f68180g);
    }
}
