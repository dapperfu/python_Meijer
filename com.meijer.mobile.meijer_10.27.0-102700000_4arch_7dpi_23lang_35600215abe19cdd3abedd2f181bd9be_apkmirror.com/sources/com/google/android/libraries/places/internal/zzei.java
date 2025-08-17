package com.google.android.libraries.places.internal;

import com.google.common.util.concurrent.A;
import com.google.common.util.concurrent.s;
import com.google.common.util.concurrent.t;
import com.google.common.util.concurrent.u;
import java.util.concurrent.Executors;

/* loaded from: classes6.dex */
public final class zzei implements zzbep {
    public static zzei zza() {
        return zzeh.zza;
    }

    public static s zzc() {
        t tVarB = u.b(Executors.newScheduledThreadPool(4, new A().f("Maps Platform Background-%d").g(10).b()));
        zzber.zza(tVarB);
        return tVarB;
    }

    @Override // com.google.android.libraries.places.internal.zzcbd
    public final /* synthetic */ Object zzb() {
        return zzc();
    }
}
