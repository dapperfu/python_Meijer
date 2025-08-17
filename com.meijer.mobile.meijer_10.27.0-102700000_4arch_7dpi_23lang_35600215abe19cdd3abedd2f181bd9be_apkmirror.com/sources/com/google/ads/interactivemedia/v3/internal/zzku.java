package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzku extends zzkx {
    private final View zzh;

    public zzku(zzjj zzjjVar, String str, String str2, zzan zzanVar, int i10, int i11, View view) {
        super(zzjjVar, "eWuCTuBs0C/3RzXp2Vb1vvOoZ3gI6cRGRcjUOPnlCHO99O+zvrqChDuDIos51zgD", "J2273uJe3SOyR84V1pdek1TQgOTMXJxG9MDUVU7F0ew=", zzanVar, i10, 57);
        this.zzh = view;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzkx
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            Boolean bool = (Boolean) zzls.zzc().zza(zzmj.zzz);
            Boolean bool2 = (Boolean) zzls.zzc().zza(zzmj.zzB);
            zzjn zzjnVar = new zzjn((String) this.zze.invoke(null, this.zzh, this.zza.zzb().getResources().getDisplayMetrics(), bool, bool2));
            zzbn zzbnVarZza = zzbo.zza();
            zzbnVarZza.zzb(zzjnVar.zza.longValue());
            zzbnVarZza.zzd(zzjnVar.zzb.longValue());
            zzbnVarZza.zze(zzjnVar.zzc.longValue());
            if (bool2.booleanValue()) {
                zzbnVarZza.zzc(zzjnVar.zze.longValue());
            }
            if (bool.booleanValue()) {
                zzbnVarZza.zza(zzjnVar.zzd.longValue());
            }
            this.zzd.zzY((zzbo) zzbnVarZza.zzal());
        }
    }
}
