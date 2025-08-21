package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzkn extends zzkx {
    private List zzh;
    private final Context zzi;

    public zzkn(zzjj zzjjVar, String str, String str2, zzan zzanVar, int i10, int i11, Context context) {
        super(zzjjVar, "gANfG8QAlaK6xQCfJ/5aephG6QXU3ANaJQYu4UcXCXizoZBn4LR1yFNp7MuwRzwn", "Nr8jAt12veLGV/WZ2ZuqlAKaqFe0ZsEk8BW6f32S8cI=", zzanVar, i10, 31);
        this.zzh = null;
        this.zzi = context;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzkx
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzW(-1L);
        this.zzd.zzS(-1L);
        Context contextZzb = this.zzi;
        if (contextZzb == null) {
            contextZzb = this.zza.zzb();
        }
        if (this.zzh == null) {
            this.zzh = (List) this.zze.invoke(null, contextZzb);
        }
        List list = this.zzh;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.zzd) {
            this.zzd.zzW(((Long) this.zzh.get(0)).longValue());
            this.zzd.zzS(((Long) this.zzh.get(1)).longValue());
        }
    }
}
