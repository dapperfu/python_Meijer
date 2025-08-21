package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Method;

/* loaded from: classes4.dex */
final class zzyi extends zzyl {
    final /* synthetic */ Method zza;
    final /* synthetic */ int zzb;

    zzyi(Method method, int i10) {
        this.zza = method;
        this.zzb = i10;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzyl
    public final Object zza(Class cls) throws Exception {
        zzyl.zzb(cls);
        return this.zza.invoke(null, cls, Integer.valueOf(this.zzb));
    }
}
