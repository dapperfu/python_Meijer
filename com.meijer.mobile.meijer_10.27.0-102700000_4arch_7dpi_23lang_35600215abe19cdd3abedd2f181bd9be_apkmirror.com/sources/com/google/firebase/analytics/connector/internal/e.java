package com.google.firebase.analytics.connector.internal;

import Nd.a;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes7.dex */
final class e implements a.InterfaceC0341a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f88623a;

    @Override // Od.A
    public final void a(String str, String str2, Bundle bundle, long j10) {
        if (str == null || !b.c(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str2);
        bundle2.putLong("timestampInMillis", j10);
        bundle2.putBundle("params", bundle);
        this.f88623a.a().a(3, bundle2);
    }

    public e(f fVar) {
        Objects.requireNonNull(fVar);
        this.f88623a = fVar;
    }
}
