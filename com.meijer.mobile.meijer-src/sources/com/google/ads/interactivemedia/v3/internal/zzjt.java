package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes4.dex */
public final class zzjt extends zzkx {
    private final Activity zzh;
    private final View zzi;

    public zzjt(zzjj zzjjVar, String str, String str2, zzan zzanVar, int i10, int i11, View view, Activity activity) {
        super(zzjjVar, "3uIyPH12G92QFP63DNIOh82j8VF90h9kFqPNhDqRUCo8ufPXfg4SvIOT6xTdvJUh", "mkv0O+E3pw6iWtJ8IDlF26p17YivjEWbfcApoyQN9bA=", zzanVar, i10, 62);
        this.zzi = view;
        this.zzh = activity;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzkx
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi == null) {
            return;
        }
        Boolean bool = (Boolean) zzls.zzc().zza(zzmj.zzm);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.zze.invoke(null, this.zzi, this.zzh, bool);
        synchronized (this.zzd) {
            try {
                this.zzd.zzc(((Long) objArr[0]).longValue());
                this.zzd.zze(((Long) objArr[1]).longValue());
                if (zBooleanValue) {
                    this.zzd.zzd((String) objArr[2]);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
