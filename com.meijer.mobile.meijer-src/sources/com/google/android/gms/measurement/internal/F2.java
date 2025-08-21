package com.google.android.gms.measurement.internal;

import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.scandit.datacapture.core.source.CameraSettings;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import qd.C16631b;

/* loaded from: classes6.dex */
final class F2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.U f85849a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ServiceConnection f85850b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ G2 f85851c;

    F2(G2 g22, com.google.android.gms.internal.measurement.U u10, ServiceConnection serviceConnection) {
        this.f85849a = u10;
        this.f85850b = serviceConnection;
        Objects.requireNonNull(g22);
        this.f85851c = g22;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        Bundle bundleL6;
        G2 g22 = this.f85851c;
        H2 h22 = g22.f85868b;
        X2 x22 = h22.f85885a;
        x22.b().f();
        Bundle bundle = new Bundle();
        String strA = g22.a();
        bundle.putString("package_name", strA);
        try {
            bundleL6 = this.f85849a.L6(bundle);
        } catch (Exception e10) {
            h22.f85885a.a().m().b("Exception occurred while retrieving the Install Referrer", e10.getMessage());
        }
        if (bundleL6 == null) {
            x22.a().m().a("Install Referrer Service returned a null response");
            bundleL6 = null;
        }
        X2 x23 = h22.f85885a;
        x23.b().f();
        X2.o();
        if (bundleL6 != null) {
            long j10 = bundleL6.getLong("install_begin_timestamp_seconds", 0L) * 1000;
            if (j10 == 0) {
                x23.a().p().a("Service response is missing Install Referrer install timestamp");
            } else {
                String string = bundleL6.getString("install_referrer");
                if (string == null || string.isEmpty()) {
                    x23.a().m().a("No referrer defined in Install Referrer response");
                } else {
                    x23.a().u().b("InstallReferrer API result", string);
                    Bundle bundleQ0 = x23.A().q0(Uri.parse("?".concat(string)));
                    if (bundleQ0 == null) {
                        x23.a().m().a("No campaign params defined in Install Referrer result");
                    } else {
                        List listAsList = Arrays.asList(((String) C11245d2.f86313h1.b(null)).split(","));
                        Iterator<String> it = bundleQ0.keySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (listAsList.contains(it.next())) {
                                long j11 = bundleL6.getLong("referrer_click_timestamp_server_seconds", 0L) * 1000;
                                if (j11 > 0) {
                                    bundleQ0.putLong("click_timestamp", j11);
                                }
                            }
                        }
                        if (j10 == x23.v().f85815g.a()) {
                            x23.a().u().a("Logging Install Referrer campaign from module while it may have already been logged.");
                        }
                        if (x23.e()) {
                            x23.v().f85815g.b(j10);
                            x23.a().u().b("Logging Install Referrer campaign from gmscore with ", "referrer API v2");
                            bundleQ0.putString("_cis", "referrer API v2");
                            x23.z().u(CameraSettings.FOCUS_STRATEGY_AUTO, "_cmp", bundleQ0, strA);
                        }
                    }
                }
            }
        }
        C16631b.b().c(x23.zzaY(), this.f85850b);
    }
}
