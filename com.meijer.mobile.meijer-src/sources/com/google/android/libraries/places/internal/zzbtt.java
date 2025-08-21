package com.google.android.libraries.places.internal;

import De.p;
import De.w;
import io.constructor.BuildConfig;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
final class zzbtt implements zzbjn {
    public static final /* synthetic */ int zza = 0;
    private final w zzd;
    private static final Logger zzb = Logger.getLogger(zzbtt.class.getName());
    private static final zzbtr zze = new zzbtr();
    private static final w zzc = new zzbts();

    public zzbtt() {
        w wVar = zzc;
        zzbtr zzbtrVar = zze;
        this.zzd = (w) p.q(wVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjn
    public final zzbjm zza(SocketAddress socketAddress) throws IOException {
        if (socketAddress instanceof InetSocketAddress) {
            return zzc((InetSocketAddress) socketAddress);
        }
        return null;
    }

    private final zzbjm zzc(InetSocketAddress inetSocketAddress) throws IOException {
        String str = null;
        try {
            URI uri = new URI(BuildConfig.SERVICE_SCHEME, null, inetSocketAddress.getHostString(), inetSocketAddress.getPort(), null, null, null);
            ProxySelector proxySelector = (ProxySelector) this.zzd.get();
            if (proxySelector == null) {
                zzb.logp(Level.FINE, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "proxy selector is null, so continuing without proxy lookup");
                return null;
            }
            List<Proxy> listSelect = proxySelector.select(uri);
            if (listSelect.size() > 1) {
                zzb.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "More than 1 proxy detected, gRPC will select the first one");
            }
            Proxy proxy = listSelect.get(0);
            if (proxy.type() == Proxy.Type.DIRECT) {
                return null;
            }
            InetSocketAddress inetSocketAddress2 = (InetSocketAddress) proxy.address();
            PasswordAuthentication passwordAuthenticationZza = zzbtr.zza(inetSocketAddress2.getHostString(), inetSocketAddress2.getAddress(), inetSocketAddress2.getPort(), BuildConfig.SERVICE_SCHEME, "", null);
            if (inetSocketAddress2.isUnresolved()) {
                inetSocketAddress2 = new InetSocketAddress(InetAddress.getByName(inetSocketAddress2.getHostName()), inetSocketAddress2.getPort());
            }
            zzbgs zzbgsVarZze = zzbgt.zze();
            zzbgsVarZze.zzb(inetSocketAddress);
            zzbgsVarZze.zza(inetSocketAddress2);
            if (passwordAuthenticationZza == null) {
                return zzbgsVarZze.zze();
            }
            zzbgsVarZze.zzc(passwordAuthenticationZza.getUserName());
            if (passwordAuthenticationZza.getPassword() != null) {
                str = new String(passwordAuthenticationZza.getPassword());
            }
            zzbgsVarZze.zzd(str);
            return zzbgsVarZze.zze();
        } catch (URISyntaxException e10) {
            zzb.logp(Level.WARNING, "io.grpc.internal.ProxyDetectorImpl", "detectProxy", "Failed to construct URI for proxy lookup, proceeding without proxy", (Throwable) e10);
            return null;
        }
    }
}
