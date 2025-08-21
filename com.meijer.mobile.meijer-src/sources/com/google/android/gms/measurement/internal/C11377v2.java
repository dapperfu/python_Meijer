package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.v2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C11377v2 extends AbstractC11233b6 {
    @Override // com.google.android.gms.measurement.internal.AbstractC11233b6
    protected final boolean j() {
        return false;
    }

    public C11377v2(q6 q6Var) {
        super(q6Var);
    }

    public final boolean k() {
        h();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f85708a.zzaY().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public final void l(String str, C11241c6 c11241c6, com.google.android.gms.internal.measurement.Y2 y22, InterfaceC11356s2 interfaceC11356s2) {
        C11377v2 c11377v2;
        String str2;
        URL url;
        byte[] bArrG;
        f();
        h();
        try {
            url = new URI(c11241c6.a()).toURL();
            this.f86107b.I0();
            bArrG = y22.g();
            c11377v2 = this;
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            c11377v2 = this;
            str2 = str;
        }
        try {
            this.f85708a.b().u(new RunnableC11370u2(c11377v2, str2, url, bArrG, c11241c6.b(), interfaceC11356s2));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            c11377v2.f85708a.a().m().c("Failed to parse URL. Not uploading MeasurementBatch. appId", C11343q2.v(str2), c11241c6.a());
        }
    }

    public final void m(C11384w2 c11384w2, Map map, InterfaceC11356s2 interfaceC11356s2) {
        C11377v2 c11377v2;
        URL url;
        f();
        h();
        com.google.android.gms.common.internal.r.l(c11384w2);
        com.google.android.gms.common.internal.r.l(interfaceC11356s2);
        C11249d6 c11249d6A0 = this.f86107b.A0();
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) C11245d2.f86305f.b(null)).encodedAuthority((String) C11245d2.f86308g.b(null)).path("config/app/".concat(String.valueOf(c11384w2.r0()))).appendQueryParameter("platform", "android");
        c11249d6A0.f85708a.u().y();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            url = new URI(string).toURL();
            c11377v2 = this;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            c11377v2 = this;
        }
        try {
            this.f85708a.b().u(new RunnableC11370u2(c11377v2, c11384w2.o0(), url, null, map, interfaceC11356s2));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            c11377v2.f85708a.a().m().c("Failed to parse config URL. Not fetching. appId", C11343q2.v(c11384w2.o0()), string);
        }
    }
}
