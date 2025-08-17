package com.google.android.gms.internal.ads;

import Mc.C4153s1;
import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.Jn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class BinderC6871Jn extends AbstractBinderC7934eq {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Xc.b f67971a;

    BinderC6871Jn(C6905Kn c6905Kn, Xc.b bVar) {
        this.f67971a = bVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8041fq
    public final void P1(String str, String str2, Bundle bundle) {
        this.f67971a.b(new Xc.a(new C4153s1(str, bundle, str2)));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8041fq
    public final void d(String str) {
        this.f67971a.a(str);
    }
}
