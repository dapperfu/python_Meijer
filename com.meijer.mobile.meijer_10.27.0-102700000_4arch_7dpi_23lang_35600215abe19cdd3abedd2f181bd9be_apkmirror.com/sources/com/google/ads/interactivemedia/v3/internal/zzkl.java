package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzkl extends zzkx {
    public zzkl(zzjj zzjjVar, String str, String str2, zzan zzanVar, int i10, int i11) {
        super(zzjjVar, "Hb0vKX9wD3x34PqrFXFQkWzGN6jA8oDPwhdOE9VH8klm/7xqWsceE+q5DBD73yqQ", "Rgz7SvLgO6udVINIJRFaOiuq50OedaBgOUX844mlsQM=", zzanVar, i10, 3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzkx
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool = (Boolean) zzls.zzc().zza(zzmj.zzt);
        bool.booleanValue();
        zzip zzipVar = new zzip((String) this.zze.invoke(null, this.zza.zzb(), bool));
        synchronized (this.zzd) {
            this.zzd.zzj(zzipVar.zza);
            this.zzd.zzC(zzipVar.zzb);
        }
    }
}
