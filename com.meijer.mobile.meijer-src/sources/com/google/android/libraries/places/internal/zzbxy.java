package com.google.android.libraries.places.internal;

import De.p;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

/* loaded from: classes6.dex */
class zzbxy {
    private static final Logger zzb = Logger.getLogger(zzbxy.class.getName());
    private static final zzbyv zzc = zzbyv.zze();
    private static final zzbxy zzd;
    protected final zzbyv zza;

    public static zzbxy zzd() {
        return zzd;
    }

    static {
        zzbxy zzbxyVar;
        ClassLoader classLoader = zzbxy.class.getClassLoader();
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e10) {
            zzb.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find Conscrypt. Skipping", (Throwable) e10);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e11) {
                zzb.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator", "createNegotiator", "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e11);
                zzbxyVar = new zzbxy(zzc);
            }
        }
        zzbxyVar = new zzbxx(zzc);
        zzd = zzbxyVar;
    }

    public String zza(SSLSocket sSLSocket, String str, List list) throws IOException {
        if (list != null) {
            zzb(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strZzc = zzc(sSLSocket);
            if (strZzc != null) {
                return strZzc;
            }
            String strValueOf = String.valueOf(list);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 44);
            sb2.append("TLS ALPN negotiation failed with protocols: ");
            sb2.append(strValueOf);
            throw new RuntimeException(sb2.toString());
        } finally {
            this.zza.zzd(sSLSocket);
        }
    }

    protected void zzb(SSLSocket sSLSocket, String str, List list) {
        this.zza.zza(sSLSocket, str, list);
    }

    public String zzc(SSLSocket sSLSocket) {
        return this.zza.zzb(sSLSocket);
    }

    zzbxy(zzbyv zzbyvVar) {
        this.zza = (zzbyv) p.r(zzbyvVar, "platform");
    }
}
