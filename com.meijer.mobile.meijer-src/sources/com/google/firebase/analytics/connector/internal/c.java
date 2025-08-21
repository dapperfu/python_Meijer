package com.google.firebase.analytics.connector.internal;

import Pd.a;
import Qd.w;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes8.dex */
final class c implements a.InterfaceC0428a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f89458a;

    @Override // Qd.A
    public final void a(String str, String str2, Bundle bundle, long j10) {
        d dVar = this.f89458a;
        if (dVar.f89459a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            int i10 = b.f89457g;
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
        this.f89458a = dVar;
    }
}
