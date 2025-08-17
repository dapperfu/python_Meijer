package com.google.android.gms.measurement.internal;

import android.app.ActivityManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.Objects;

/* loaded from: classes6.dex */
final class M5 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ N5 f85122a;

    final void a() {
        N5 n52 = this.f85122a;
        n52.f();
        X2 x22 = n52.f84868a;
        if (x22.v().y(x22.zzaZ().a())) {
            x22.v().f84981m.b(true);
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (runningAppProcessInfo.importance == 100) {
                x22.a().u().a("Detected application was in foreground");
                c(x22.zzaZ().a(), false);
            }
        }
    }

    final void b(long j10, boolean z10) {
        N5 n52 = this.f85122a;
        n52.f();
        n52.o();
        X2 x22 = n52.f84868a;
        if (x22.v().y(j10)) {
            x22.v().f84981m.b(true);
            n52.f84868a.J().n();
        }
        x22.v().f84985q.b(j10);
        if (x22.v().f84981m.a()) {
            c(j10, z10);
        }
    }

    final void c(long j10, boolean z10) {
        N5 n52 = this.f85122a;
        n52.f();
        if (n52.f84868a.e()) {
            X2 x22 = n52.f84868a;
            x22.v().f84985q.b(j10);
            x22.a().u().b("Session started, time", Long.valueOf(x22.zzaZ().c()));
            long j11 = j10 / 1000;
            X2 x23 = n52.f84868a;
            x23.z().z(CameraSettings.FOCUS_STRATEGY_AUTO, "_sid", Long.valueOf(j11), j10);
            x22.v().f84986r.b(j11);
            x22.v().f84981m.b(false);
            Bundle bundle = new Bundle();
            bundle.putLong("_sid", j11);
            x23.z().s(CameraSettings.FOCUS_STRATEGY_AUTO, "_s", j10, bundle);
            String strA = x22.v().f84991w.a();
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("_ffr", strA);
            x23.z().s(CameraSettings.FOCUS_STRATEGY_AUTO, "_ssr", j10, bundle2);
        }
    }

    M5(N5 n52) {
        Objects.requireNonNull(n52);
        this.f85122a = n52;
    }
}
