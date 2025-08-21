package com.google.android.gms.internal.ads;

import Rc.C5212v;
import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.qB, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9277qB implements InterfaceC8502iy0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC10213yy0 f78586a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC10213yy0 f78587b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC10213yy0 f78588c;

    public C9277qB(InterfaceC10213yy0 interfaceC10213yy0, InterfaceC10213yy0 interfaceC10213yy02, InterfaceC10213yy0 interfaceC10213yy03) {
        this.f78586a = interfaceC10213yy0;
        this.f78587b = interfaceC10213yy02;
        this.f78588c = interfaceC10213yy03;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10213yy0
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.f78586a.zzb();
        final Sc.a aVarA = ((C7037Ku) this.f78587b).a();
        final C9695u60 c9695u60A = ((QB) this.f78588c).a();
        return new InterfaceC9533sf0() { // from class: com.google.android.gms.internal.ads.pB
            @Override // com.google.android.gms.internal.ads.InterfaceC9533sf0
            public final Object apply(Object obj) {
                Z50 z50 = (Z50) obj;
                C5212v c5212v = new C5212v(context);
                c5212v.p(z50.f72836B);
                c5212v.q(z50.f72837C.toString());
                c5212v.o(aVarA.f34479a);
                c5212v.n(c9695u60A.f79580f);
                return c5212v;
            }
        };
    }
}
