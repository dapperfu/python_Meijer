package com.google.android.gms.measurement.internal;

import android.content.Intent;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.h6, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C11281h6 extends AbstractC11388x {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ q6 f86447e;

    @Override // com.google.android.gms.measurement.internal.AbstractC11388x
    public final void a() {
        q6 q6Var = this.f86447e;
        q6Var.b().f();
        String str = (String) q6Var.w0().pollFirst();
        if (str != null) {
            q6Var.x0(q6Var.zzaZ().c());
            q6Var.a().u().b("Sending trigger URI notification to app", str);
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            q6.U(q6Var.zzaY(), intent);
        }
        q6Var.t0();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C11281h6(q6 q6Var, C3 c32) {
        super(c32);
        Objects.requireNonNull(q6Var);
        this.f86447e = q6Var;
    }
}
