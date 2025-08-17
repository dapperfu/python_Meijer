package com.google.android.libraries.places.widget.internal.placedetails;

import com.google.android.libraries.places.internal.zzrw;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17152f;

/* loaded from: classes6.dex */
final class zzbe extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ List zzb;
    final /* synthetic */ zzbi zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbe(List list, zzbi zzbiVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = list;
        this.zzc = zzbiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzbe zzbeVar = new zzbe(this.zzb, this.zzc, continuation);
        zzbeVar.zzd = obj;
        return zzbeVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbe) create((InterfaceC16622O) obj, (Continuation) obj2)).invokeSuspend(Unit.f142422a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF = IntrinsicsKt.f();
        int i10 = this.zza;
        ResultKt.b(obj);
        if (i10 == 0) {
            InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.zzd;
            InterfaceC17152f interfaceC17152fZza = zzrw.zza(C17154h.a(this.zzb), C17154h.I(), new zzbd(interfaceC16622O, this.zzc, null));
            this.zza = 1;
            if (C17154h.j(interfaceC17152fZza, this) == objF) {
                return objF;
            }
        }
        return Unit.f142422a;
    }
}
