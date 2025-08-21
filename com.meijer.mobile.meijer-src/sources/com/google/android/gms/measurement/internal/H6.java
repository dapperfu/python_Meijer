package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.medallia.digital.mobilesdk.l8;
import com.scandit.datacapture.core.source.CameraSettings;

/* loaded from: classes6.dex */
public final class H6 {

    /* renamed from: a, reason: collision with root package name */
    private final X2 f85891a;

    public H6(X2 x22) {
        this.f85891a = x22;
    }

    final void a() {
        X2 x22 = this.f85891a;
        x22.b().f();
        if (e()) {
            if (d()) {
                x22.v().f85832x.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                x22.z().r(CameraSettings.FOCUS_STRATEGY_AUTO, "_cmpx", bundle);
            } else {
                String strA = x22.v().f85832x.a();
                if (TextUtils.isEmpty(strA)) {
                    x22.a().n().a("Cache still valid but referrer not found");
                } else {
                    long jA = x22.v().f85833y.a() / l8.b.f93365c;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (jA - 1) * l8.b.f93365c);
                    Object obj = pair.first;
                    x22.z().r(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                x22.v().f85832x.b(null);
            }
            x22.v().f85833y.b(0L);
        }
    }

    final void b(String str, Bundle bundle) {
        String string;
        X2 x22 = this.f85891a;
        x22.b().f();
        if (x22.e()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = CameraSettings.FOCUS_STRATEGY_AUTO;
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        x22.v().f85832x.b(string);
        x22.v().f85833y.b(x22.zzaZ().a());
    }

    final boolean e() {
        return this.f85891a.v().f85833y.a() > 0;
    }

    final void c() {
        if (e() && d()) {
            this.f85891a.v().f85832x.b(null);
        }
    }

    final boolean d() {
        if (!e()) {
            return false;
        }
        X2 x22 = this.f85891a;
        if (x22.zzaZ().a() - x22.v().f85833y.a() <= x22.u().B(null, C11245d2.f86321k0)) {
            return false;
        }
        return true;
    }
}
