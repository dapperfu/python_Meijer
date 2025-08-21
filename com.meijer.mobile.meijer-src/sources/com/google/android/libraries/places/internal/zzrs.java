package com.google.android.libraries.places.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import pv.InterfaceC16561f;
import pv.InterfaceC16562g;

/* loaded from: classes6.dex */
public final class zzrs implements InterfaceC16561f {
    final /* synthetic */ InterfaceC16561f zza;

    public zzrs(InterfaceC16561f interfaceC16561f) {
        this.zza = interfaceC16561f;
    }

    @Override // pv.InterfaceC16561f
    public final Object collect(InterfaceC16562g interfaceC16562g, Continuation continuation) {
        Object objCollect = this.zza.collect(new zzrr(interfaceC16562g), continuation);
        return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f143329a;
    }
}
