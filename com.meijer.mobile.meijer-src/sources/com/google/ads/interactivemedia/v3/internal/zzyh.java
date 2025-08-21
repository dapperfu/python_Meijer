package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Method;

/* loaded from: classes4.dex */
final class zzyh extends zzyl {
    final /* synthetic */ Method zza;
    final /* synthetic */ Object zzb;

    zzyh(Method method, Object obj) {
        this.zza = method;
        this.zzb = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzyl
    public final Object zza(Class cls) throws Exception {
        zzyl.zzb(cls);
        return this.zza.invoke(this.zzb, cls);
    }
}
