package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzkp extends zzkx {
    private final StackTraceElement[] zzh;

    public zzkp(zzjj zzjjVar, String str, String str2, zzan zzanVar, int i10, int i11, StackTraceElement[] stackTraceElementArr) {
        super(zzjjVar, "Tr7fGRhozrcGWgreSsweTKh/4NOM+Jnt9yuIucqZU1XFuQj1cofQtHqK781u41Fk", "JHli6WI5R8sw7EkxbHsVjy9IYG7FikIpacvBlSmCeKs=", zzanVar, i10, 45);
        this.zzh = stackTraceElementArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzkx
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzh;
        if (stackTraceElementArr != null) {
            zzja zzjaVar = new zzja((String) this.zze.invoke(null, stackTraceElementArr));
            synchronized (this.zzd) {
                try {
                    this.zzd.zzF(zzjaVar.zza.longValue());
                    if (zzjaVar.zzb.booleanValue()) {
                        this.zzd.zzac(true != zzjaVar.zzc.booleanValue() ? 2 : 1);
                    } else {
                        this.zzd.zzac(3);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
