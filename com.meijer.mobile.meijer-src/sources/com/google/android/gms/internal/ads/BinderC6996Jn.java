package com.google.android.gms.internal.ads;

import Oc.C4431s1;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Jn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class BinderC6996Jn extends AbstractBinderC8059eq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Zc.b f68811a;

    BinderC6996Jn(C7030Kn c7030Kn, Zc.b bVar) {
        this.f68811a = bVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8166fq
    public final void U1(String str, String str2, Bundle bundle) {
        this.f68811a.b(new Zc.a(new C4431s1(str, bundle, str2)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8166fq
    public final void d(String str) {
        this.f68811a.a(str);
    }
}
