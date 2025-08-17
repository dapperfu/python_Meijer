package com.google.firebase.analytics.connector.internal;

import Nd.a;
import Od.w;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes7.dex */
final class c implements a.InterfaceC0341a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f88618a;

    @Override // Od.A
    public final void a(String str, String str2, Bundle bundle, long j10) {
        d dVar = this.f88618a;
        if (dVar.f88619a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            int i10 = b.f88617g;
            String strA = w.a(str2);
            if (strA != null) {
                str2 = strA;
            }
            bundle2.putString("events", str2);
            dVar.a().a(2, bundle2);
        }
    }

    public c(d dVar) {
        Objects.requireNonNull(dVar);
        this.f88618a = dVar;
    }
}
