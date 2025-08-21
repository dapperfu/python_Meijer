package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.Objects;

/* loaded from: classes6.dex */
final class k6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f86502a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f86503b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Bundle f86504c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ l6 f86505d;

    k6(l6 l6Var, String str, String str2, Bundle bundle) {
        this.f86502a = str;
        this.f86503b = str2;
        this.f86504c = bundle;
        Objects.requireNonNull(l6Var);
        this.f86505d = l6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q6 q6Var = this.f86505d.f86515a;
        z6 z6VarL0 = q6Var.L0();
        long jA = q6Var.zzaZ().a();
        String str = this.f86502a;
        q6Var.g((G) com.google.android.gms.common.internal.r.l(z6VarL0.P(str, this.f86503b, this.f86504c, CameraSettings.FOCUS_STRATEGY_AUTO, jA, false, true)), str);
    }
}
