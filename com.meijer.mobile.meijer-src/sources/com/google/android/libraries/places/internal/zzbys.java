package com.google.android.libraries.places.internal;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes6.dex */
final class zzbys extends zzbyv {
    private final Method zzb;
    private final Method zzc;

    @Override // com.google.android.libraries.places.internal.zzbyv
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.libraries.places.internal.zzbyv
    public final String zzb(SSLSocket sSLSocket) {
        try {
            return (String) this.zzc.invoke(sSLSocket, null);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* synthetic */ zzbys(Provider provider, Method method, Method method2, byte[] bArr) {
        super(provider);
        this.zzb = method;
        this.zzc = method2;
    }

    @Override // com.google.android.libraries.places.internal.zzbyv
    public final void zza(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbyw zzbywVar = (zzbyw) it.next();
            if (zzbywVar != zzbyw.HTTP_1_0) {
                arrayList.add(zzbywVar.toString());
            }
        }
        try {
            this.zzb.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }
}
