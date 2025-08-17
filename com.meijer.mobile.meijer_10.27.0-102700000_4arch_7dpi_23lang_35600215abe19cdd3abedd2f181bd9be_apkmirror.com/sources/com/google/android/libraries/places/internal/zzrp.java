package com.google.android.libraries.places.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

/* loaded from: classes6.dex */
public final class zzrp implements InterfaceC17152f {
    final /* synthetic */ InterfaceC17152f zza;
    final /* synthetic */ Function2 zzb;

    public zzrp(InterfaceC17152f interfaceC17152f, Function2 function2) {
        this.zza = interfaceC17152f;
        this.zzb = function2;
    }

    @Override // tv.InterfaceC17152f
    public final Object collect(InterfaceC17153g interfaceC17153g, Continuation continuation) {
        Object objCollect = this.zza.collect(new zzro(interfaceC17153g, this.zzb), continuation);
        return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
    }
}
