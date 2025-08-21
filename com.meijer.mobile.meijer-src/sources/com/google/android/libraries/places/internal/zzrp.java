package com.google.android.libraries.places.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

/* loaded from: classes6.dex */
public final class zzrp implements InterfaceC16561f {
    final /* synthetic */ InterfaceC16561f zza;
    final /* synthetic */ Function2 zzb;

    public zzrp(InterfaceC16561f interfaceC16561f, Function2 function2) {
        this.zza = interfaceC16561f;
        this.zzb = function2;
    }

    @Override // pv.InterfaceC16561f
    public final Object collect(InterfaceC16562g interfaceC16562g, Continuation continuation) {
        Object objCollect = this.zza.collect(new zzro(interfaceC16562g, this.zzb), continuation);
        return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
    }
}
