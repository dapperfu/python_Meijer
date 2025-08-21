package com.google.android.libraries.places.internal;

import De.p;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes6.dex */
final class zzbxx extends zzbxy {
    private static final zzbyq zzb;
    private static final zzbyq zzc;
    private static final zzbyq zzd;
    private static final zzbyq zze;
    private static final zzbyq zzf;
    private static final zzbyq zzg;
    private static final Method zzh;
    private static final Method zzi;
    private static final Method zzj;
    private static final Method zzk;
    private static final Method zzl;
    private static final Method zzm;
    private static final Constructor zzn;

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(2:72|3)|(6:74|4|68|5|64|6)|(2:76|7)|44|70|45|66|46|62|63|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x011a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0122, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0124, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0126, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0128, code lost:
    
        com.google.android.libraries.places.internal.zzbxy.zzb.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0138, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013a, code lost:
    
        com.google.android.libraries.places.internal.zzbxy.zzb.logp(java.util.logging.Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (java.lang.Throwable) r0);
     */
    static {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzbxx.<clinit>():void");
    }

    @Override // com.google.android.libraries.places.internal.zzbxy
    protected final void zzb(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Constructor constructor;
        Method method;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((zzbyw) it.next()).toString());
        }
        boolean z10 = false;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (!str.contains("_")) {
                        try {
                            p.l(zzbpf.zzb(str).getAuthority().indexOf(64) == -1, "Userinfo must not be present on authority: '%s'", str);
                            Method method2 = zzh;
                            if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                zzb.zzb(sSLSocket, Boolean.TRUE);
                            } else {
                                zzi.invoke(null, sSLSocket, Boolean.TRUE);
                            }
                            Method method3 = zzm;
                            if (method3 == null || (constructor = zzn) == null || Ie.b.f(Ie.a.a(str).b())) {
                                zzc.zzb(sSLSocket, str);
                            } else {
                                method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                            }
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } catch (InvocationTargetException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException(e12);
            }
        }
        Method method4 = zzl;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, null);
                zzj.invoke(sSLParameters, strArr);
                z10 = true;
            } catch (InvocationTargetException e13) {
                if (!(e13.getTargetException() instanceof UnsupportedOperationException)) {
                    throw e13;
                }
                zzbxy.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "configureTlsExtensions", "setApplicationProtocol unsupported, will try old methods");
            }
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z10 && (method = zzk) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
            return;
        }
        Object[] objArr = {zzbyv.zzg(list)};
        zzbyv zzbyvVar = this.zza;
        if (zzbyvVar.zzc() == 1) {
            zze.zzc(sSLSocket, objArr);
        }
        if (zzbyvVar.zzc() == 3) {
            throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
        zzg.zzc(sSLSocket, objArr);
    }

    @Override // com.google.android.libraries.places.internal.zzbxy
    public final String zzc(SSLSocket sSLSocket) {
        Method method = zzl;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                if (!(e11.getTargetException() instanceof UnsupportedOperationException)) {
                    throw new RuntimeException(e11);
                }
                zzbxy.zzb.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        if (this.zza.zzc() == 1) {
            try {
                byte[] bArr = (byte[]) zzd.zzc(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, zzbyy.zzb);
                }
            } catch (Exception e12) {
                zzbxy.zzb.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getAlpnSelectedProtocol()", (Throwable) e12);
            }
        }
        if (this.zza.zzc() != 3) {
            try {
                byte[] bArr2 = (byte[]) zzf.zzc(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, zzbyy.zzb);
                }
            } catch (Exception e13) {
                zzbxy.zzb.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getNpnSelectedProtocol()", (Throwable) e13);
            }
        }
        return null;
    }

    zzbxx(zzbyv zzbyvVar) {
        super(zzbyvVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbxy
    public final String zza(SSLSocket sSLSocket, String str, List list) throws IOException {
        String strZzc = zzc(sSLSocket);
        if (strZzc == null) {
            return super.zza(sSLSocket, str, list);
        }
        return strZzc;
    }
}
