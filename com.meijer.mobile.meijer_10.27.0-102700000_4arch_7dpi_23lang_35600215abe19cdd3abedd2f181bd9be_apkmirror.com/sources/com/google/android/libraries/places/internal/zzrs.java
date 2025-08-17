package com.google.android.libraries.places.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

/* loaded from: classes6.dex */
public final class zzrs implements InterfaceC17152f {
    final /* synthetic */ InterfaceC17152f zza;

    public zzrs(InterfaceC17152f interfaceC17152f) {
        this.zza = interfaceC17152f;
    }

    @Override // tv.InterfaceC17152f
    public final Object collect(InterfaceC17153g interfaceC17153g, Continuation continuation) {
        Object objCollect = this.zza.collect(new zzrr(interfaceC17153g), continuation);
        return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
    }
}
