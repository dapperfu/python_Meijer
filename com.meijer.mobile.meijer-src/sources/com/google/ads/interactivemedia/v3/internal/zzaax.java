package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;

/* loaded from: classes4.dex */
final class zzaax extends zzwj {
    final /* synthetic */ Class zza;
    final /* synthetic */ zzaay zzb;

    zzaax(zzaay zzaayVar, Class cls) {
        this.zza = cls;
        this.zzb = zzaayVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final Object read(zzacc zzaccVar) throws IOException {
        Object obj = this.zzb.zzb.read(zzaccVar);
        if (obj == null || this.zza.isInstance(obj)) {
            return obj;
        }
        Class cls = this.zza;
        Class<?> cls2 = obj.getClass();
        throw new zzwe("Expected a " + cls.getName() + " but was " + cls2.getName() + "; at path " + zzaccVar.zzf());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final void write(zzace zzaceVar, Object obj) throws IOException {
        this.zzb.zzb.write(zzaceVar, obj);
    }
}
