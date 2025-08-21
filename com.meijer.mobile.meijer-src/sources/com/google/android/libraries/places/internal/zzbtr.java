package com.google.android.libraries.places.internal;

import io.constructor.BuildConfig;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.logging.Level;

/* loaded from: classes6.dex */
final class zzbtr {
    zzbtr() {
    }

    public static final PasswordAuthentication zza(String str, InetAddress inetAddress, int i10, String str2, String str3, String str4) {
        URL url;
        try {
            url = new URL(BuildConfig.SERVICE_SCHEME, str, i10, "");
        } catch (MalformedURLException unused) {
            int i11 = zzbtt.zza;
            zzbtt.zzb.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl$1", "requestPasswordAuthentication", "failed to create URL for Authenticator: {0} {1}", new Object[]{BuildConfig.SERVICE_SCHEME, str});
            url = null;
        }
        return Authenticator.requestPasswordAuthentication(str, inetAddress, i10, BuildConfig.SERVICE_SCHEME, "", null, url, Authenticator.RequestorType.PROXY);
    }
}
