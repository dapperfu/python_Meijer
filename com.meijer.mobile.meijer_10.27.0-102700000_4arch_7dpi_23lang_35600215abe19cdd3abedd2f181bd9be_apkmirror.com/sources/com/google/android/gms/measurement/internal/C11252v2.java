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
public final class C11252v2 extends AbstractC11108b6 {
    @Override // com.google.android.gms.measurement.internal.AbstractC11108b6
    protected final boolean j() {
        return false;
    }

    public C11252v2(q6 q6Var) {
        super(q6Var);
    }

    public final boolean k() {
        h();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f84868a.zzaY().getSystemService("connectivity");
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

    public final void l(String str, C11116c6 c11116c6, com.google.android.gms.internal.measurement.Y2 y22, InterfaceC11231s2 interfaceC11231s2) {
        C11252v2 c11252v2;
        String str2;
        URL url;
        byte[] bArrG;
        f();
        h();
        try {
            url = new URI(c11116c6.a()).toURL();
            this.f85267b.I0();
            bArrG = y22.g();
            c11252v2 = this;
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            c11252v2 = this;
            str2 = str;
        }
        try {
            this.f84868a.b().u(new RunnableC11245u2(c11252v2, str2, url, bArrG, c11116c6.b(), interfaceC11231s2));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            c11252v2.f84868a.a().m().c("Failed to parse URL. Not uploading MeasurementBatch. appId", C11218q2.v(str2), c11116c6.a());
        }
    }

    public final void m(C11259w2 c11259w2, Map map, InterfaceC11231s2 interfaceC11231s2) {
        C11252v2 c11252v2;
        URL url;
        f();
        h();
        com.google.android.gms.common.internal.r.l(c11259w2);
        com.google.android.gms.common.internal.r.l(interfaceC11231s2);
        C11124d6 c11124d6A0 = this.f85267b.A0();
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) C11120d2.f85465f.b(null)).encodedAuthority((String) C11120d2.f85468g.b(null)).path("config/app/".concat(String.valueOf(c11259w2.r0()))).appendQueryParameter("platform", "android");
        c11124d6A0.f84868a.u().y();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(133005L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            url = new URI(string).toURL();
            c11252v2 = this;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            c11252v2 = this;
        }
        try {
            this.f84868a.b().u(new RunnableC11245u2(c11252v2, c11259w2.o0(), url, null, map, interfaceC11231s2));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            c11252v2.f84868a.a().m().c("Failed to parse config URL. Not fetching. appId", C11218q2.v(c11259w2.o0()), string);
        }
    }
}
