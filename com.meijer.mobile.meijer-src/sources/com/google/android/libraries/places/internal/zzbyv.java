package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes6.dex */
public class zzbyv {
    public static final Logger zza = Logger.getLogger(zzbyv.class.getName());
    private static final String[] zzb = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};
    private static final zzbyv zzc = zzh();
    private final Provider zzd;

    public zzbyv(Provider provider) {
        this.zzd = provider;
    }

    public static zzbyv zze() {
        return zzc;
    }

    public void zza(SSLSocket sSLSocket, String str, List list) {
    }

    public String zzb(SSLSocket sSLSocket) {
        return null;
    }

    public int zzc() {
        return 3;
    }

    public void zzd(SSLSocket sSLSocket) {
    }

    public final Provider zzf() {
        return this.zzd;
    }

    public static byte[] zzg(List list) {
        zzcbj zzcbjVar = new zzcbj();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzbyw zzbywVar = (zzbyw) list.get(i10);
            if (zzbywVar != zzbyw.HTTP_1_0) {
                zzcbjVar.zzA(zzbywVar.toString().length());
                zzcbjVar.zzv(zzbywVar.toString());
            }
        }
        return zzcbjVar.zzr(zzcbjVar.zzb());
    }

    private static zzbyv zzh() throws IllegalAccessException, NoSuchMethodException, NoSuchAlgorithmException, ClassNotFoundException, SecurityException, KeyManagementException, IllegalArgumentException, InvocationTargetException {
        Provider provider;
        Provider provider2;
        Method method;
        Method method2;
        Method method3;
        Provider[] providers = Security.getProviders();
        int length = providers.length;
        int i10 = 0;
        loop0: while (true) {
            if (i10 >= length) {
                provider = null;
                break;
            }
            Provider provider3 = providers[i10];
            String[] strArr = zzb;
            int length2 = strArr.length;
            for (int i11 = 0; i11 < 5; i11++) {
                String str = strArr[i11];
                if (str.equals(provider3.getClass().getName())) {
                    zza.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "getAndroidSecurityProvider", "Found registered provider {0}", str);
                    provider = provider3;
                    break loop0;
                }
            }
            i10++;
        }
        if (provider == null) {
            try {
                Provider provider4 = SSLContext.getDefault().getProvider();
                try {
                    try {
                        SSLContext sSLContext = SSLContext.getInstance("TLS", provider4);
                        sSLContext.init(null, null, null);
                        SSLEngine.class.getMethod("getApplicationProtocol", null).invoke(sSLContext.createSSLEngine(), null);
                        return new zzbys(provider4, SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null), null);
                    } catch (ClassNotFoundException | NoSuchMethodException unused) {
                        provider2 = provider4;
                        return new zzbyv(provider2);
                    }
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException unused2) {
                    Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    StringBuilder sb2 = new StringBuilder(36);
                    sb2.append("org.eclipse.jetty.alpn.ALPN");
                    sb2.append("$Provider");
                    Class<?> cls2 = Class.forName(sb2.toString());
                    StringBuilder sb3 = new StringBuilder(42);
                    sb3.append("org.eclipse.jetty.alpn.ALPN");
                    sb3.append("$ClientProvider");
                    Class<?> cls3 = Class.forName(sb3.toString());
                    StringBuilder sb4 = new StringBuilder(42);
                    sb4.append("org.eclipse.jetty.alpn.ALPN");
                    sb4.append("$ServerProvider");
                    try {
                        return new zzbyt(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), cls3, Class.forName(sb4.toString()), provider4);
                    } catch (ClassNotFoundException | NoSuchMethodException unused3) {
                        provider2 = provider4;
                        return new zzbyv(provider2);
                    }
                }
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(e10);
            }
        }
        zzbyq zzbyqVar = new zzbyq(null, "setUseSessionTickets", Boolean.TYPE);
        zzbyq zzbyqVar2 = new zzbyq(null, "setHostname", String.class);
        zzbyq zzbyqVar3 = new zzbyq(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
        zzbyq zzbyqVar4 = new zzbyq(null, "setAlpnProtocols", byte[].class);
        try {
            Class<?> cls4 = Class.forName("android.net.TrafficStats");
            method = cls4.getMethod("tagSocket", Socket.class);
            try {
                method2 = method;
                method3 = cls4.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                method2 = method;
                method3 = null;
                int i12 = 1;
                if (!provider.getName().equals("GmsCore_OpenSSL")) {
                    try {
                        zzbyv.class.getClassLoader().loadClass("android.net.Network");
                    } catch (ClassNotFoundException e11) {
                        zza.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid5", "Can't find class", (Throwable) e11);
                        try {
                            zzbyv.class.getClassLoader().loadClass("android.app.ActivityOptions");
                            i12 = 2;
                        } catch (ClassNotFoundException e12) {
                            zza.logp(Level.FINE, "io.grpc.okhttp.internal.Platform", "isAtLeastAndroid41", "Can't find class", (Throwable) e12);
                            i12 = 3;
                        }
                    }
                }
                return new zzbyr(zzbyqVar, zzbyqVar2, method2, method3, zzbyqVar3, zzbyqVar4, provider, i12);
            }
        } catch (ClassNotFoundException | NoSuchMethodException unused5) {
            method = null;
        }
        int i122 = 1;
        if (!provider.getName().equals("GmsCore_OpenSSL") && !provider.getName().equals("Conscrypt") && !provider.getName().equals("Ssl_Guard")) {
            zzbyv.class.getClassLoader().loadClass("android.net.Network");
        }
        return new zzbyr(zzbyqVar, zzbyqVar2, method2, method3, zzbyqVar3, zzbyqVar4, provider, i122);
    }
}
