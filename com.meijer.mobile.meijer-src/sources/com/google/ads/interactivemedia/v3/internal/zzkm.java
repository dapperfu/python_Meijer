package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzkm extends zzkx {
    public zzkm(zzjj zzjjVar, String str, String str2, zzan zzanVar, int i10, int i11) {
        super(zzjjVar, "WJxg1URLvX6rcpqRUIsbqvQQ1IP2DTbqCnO94k2HzDT20g/TX5PQfsUm+ZqlzVLQ", "LGTID+NGga+m4ngnAg8xV1SySs8i6u03pUOYhiZVnnQ=", zzanVar, i10, 73);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzkx
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        try {
            boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            zzan zzanVar = this.zzd;
            int i10 = 1;
            if (true == zBooleanValue) {
                i10 = 2;
            }
            zzanVar.zzaf(i10);
        } catch (InvocationTargetException unused) {
            this.zzd.zzaf(3);
        }
    }
}
