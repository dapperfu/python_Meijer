package com.google.android.libraries.places.widget.internal.placedetails;

import com.google.android.libraries.places.api.model.PhotoMetadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qv.InterfaceC16622O;

/* loaded from: classes6.dex */
final class zzbd extends SuspendLambda implements Function2 {
    int zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ InterfaceC16622O zzc;
    final /* synthetic */ zzbi zzd;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzbd zzbdVar = new zzbd(this.zzc, this.zzd, continuation);
        zzbdVar.zzb = obj;
        return zzbdVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzbd(InterfaceC16622O interfaceC16622O, zzbi zzbiVar, Continuation continuation) {
        super(2, continuation);
        this.zzc = interfaceC16622O;
        this.zzd = zzbiVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzbd) create((zzau) obj, (Continuation) obj2)).invokeSuspend(Unit.f142422a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzau zzauVar;
        Object objF = IntrinsicsKt.f();
        if (this.zza != 0) {
            zzauVar = (zzau) this.zzb;
            ResultKt.b(obj);
        } else {
            ResultKt.b(obj);
            zzau zzauVar2 = (zzau) this.zzb;
            zzbi zzbiVar = this.zzd;
            PhotoMetadata photoMetadataZza = zzauVar2.zza();
            int iZzb = zzauVar2.zzb();
            this.zzb = zzauVar2;
            this.zza = 1;
            Object objZzo = zzbiVar.zzo(photoMetadataZza, iZzb, this);
            if (objZzo != objF) {
                zzauVar = zzauVar2;
                obj = objZzo;
            } else {
                return objF;
            }
        }
        zzauVar.zzc().m((zzbp) obj);
        return Unit.f142422a;
    }
}
