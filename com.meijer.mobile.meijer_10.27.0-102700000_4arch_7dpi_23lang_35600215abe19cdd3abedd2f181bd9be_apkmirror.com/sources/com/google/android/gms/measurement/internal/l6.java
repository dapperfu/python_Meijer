package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes6.dex */
final class l6 implements y6 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ q6 f85675a;

    l6(q6 q6Var) {
        Objects.requireNonNull(q6Var);
        this.f85675a = q6Var;
    }

    @Override // com.google.android.gms.measurement.internal.y6
    public final void W(String str, String str2, Bundle bundle) throws IllegalStateException {
        if (TextUtils.isEmpty(str)) {
            q6 q6Var = this.f85675a;
            if (q6Var.v0() != null) {
                q6Var.v0().a().m().b("AppId not known when logging event", str2);
                return;
            }
            return;
        }
        this.f85675a.b().r(new k6(this, str, str2, bundle));
    }
}
