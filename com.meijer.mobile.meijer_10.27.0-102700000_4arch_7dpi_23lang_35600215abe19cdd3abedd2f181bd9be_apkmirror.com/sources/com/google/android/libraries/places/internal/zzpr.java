package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.PhotoMetadata;
import com.google.android.libraries.places.api.model.Place;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import qv.InterfaceC16622O;

/* loaded from: classes6.dex */
final class zzpr extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ zzpw zzb;
    final /* synthetic */ Place zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzpr(zzpw zzpwVar, Place place, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzpwVar;
        this.zzc = place;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzpr(this.zzb, this.zzc, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzpr) create((InterfaceC16622O) obj, (Continuation) obj2)).invokeSuspend(Unit.f142422a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF = IntrinsicsKt.f();
        int i10 = this.zza;
        ResultKt.b(obj);
        if (i10 != 0) {
            return obj;
        }
        zzpw zzpwVar = this.zzb;
        List<PhotoMetadata> photoMetadatas = this.zzc.getPhotoMetadatas();
        this.zza = 1;
        Object objZzo = zzpwVar.zzo(photoMetadatas, this);
        if (objZzo == objF) {
            return objF;
        }
        return objZzo;
    }
}
