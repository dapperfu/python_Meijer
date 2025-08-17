package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.Objects;

/* loaded from: classes6.dex */
final class k6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f85662a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f85663b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Bundle f85664c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ l6 f85665d;

    k6(l6 l6Var, String str, String str2, Bundle bundle) {
        this.f85662a = str;
        this.f85663b = str2;
        this.f85664c = bundle;
        Objects.requireNonNull(l6Var);
        this.f85665d = l6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q6 q6Var = this.f85665d.f85675a;
        z6 z6VarL0 = q6Var.L0();
        long jA = q6Var.zzaZ().a();
        String str = this.f85662a;
        q6Var.g((G) com.google.android.gms.common.internal.r.l(z6VarL0.P(str, this.f85663b, this.f85664c, CameraSettings.FOCUS_STRATEGY_AUTO, jA, false, true)), str);
    }
}
