package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzkk extends zzkx {
    private static volatile String zzh;
    private static final Object zzi = new Object();

    public zzkk(zzjj zzjjVar, String str, String str2, zzan zzanVar, int i10, int i11) {
        super(zzjjVar, "cfPFolnFcyO2M4b7dfdBFR1LJKqZp4Fuk/UdR9bfuLBzuF+2QIdBkATGw9zmvT3l", "2ySKasqG9MJf+B86/j4Y0JFrwsiYz8yWF0K2o6c0cu0=", zzanVar, i10, 1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzkx
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzB("E");
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (String) this.zze.invoke(null, null);
                    }
                } finally {
                }
            }
        }
        synchronized (this.zzd) {
            this.zzd.zzB(zzh);
        }
    }
}
