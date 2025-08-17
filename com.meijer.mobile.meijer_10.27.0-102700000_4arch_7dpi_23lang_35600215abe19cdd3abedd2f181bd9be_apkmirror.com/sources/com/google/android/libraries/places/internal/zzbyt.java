package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* loaded from: classes6.dex */
final class zzbyt extends zzbyv {
    private final Method zzb;
    private final Method zzc;
    private final Method zzd;
    private final Class zze;
    private final Class zzf;

    @Override // com.google.android.libraries.places.internal.zzbyv
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.libraries.places.internal.zzbyv
    public final void zza(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            zzbyw zzbywVar = (zzbyw) list.get(i10);
            if (zzbywVar != zzbyw.HTTP_1_0) {
                arrayList.add(zzbywVar.toString());
            }
        }
        try {
            this.zzb.invoke(null, sSLSocket, Proxy.newProxyInstance(zzbyv.class.getClassLoader(), new Class[]{this.zze, this.zzf}, new zzbyu(arrayList)));
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            throw new AssertionError(e11);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbyv
    public final String zzb(SSLSocket sSLSocket) {
        try {
            zzbyu zzbyuVar = (zzbyu) Proxy.getInvocationHandler(this.zzc.invoke(null, sSLSocket));
            if (!zzbyuVar.zza() && zzbyuVar.zzb() == null) {
                zzbyv.zza.logp(Level.INFO, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "getSelectedProtocol", "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            }
            if (zzbyuVar.zza()) {
                return null;
            }
            return zzbyuVar.zzb();
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException unused2) {
            throw new AssertionError();
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbyv
    public final void zzd(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.zzd.invoke(null, sSLSocket);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException e10) {
            zzbyv.zza.logp(Level.FINE, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "afterHandshake", "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e10);
        }
    }

    public zzbyt(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.zzb = method;
        this.zzc = method2;
        this.zzd = method3;
        this.zze = cls;
        this.zzf = cls2;
    }
}
