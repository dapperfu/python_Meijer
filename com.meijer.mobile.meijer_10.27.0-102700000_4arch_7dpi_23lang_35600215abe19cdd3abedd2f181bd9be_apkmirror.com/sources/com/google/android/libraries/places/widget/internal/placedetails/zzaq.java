package com.google.android.libraries.places.widget.internal.placedetails;

import android.net.Uri;
import android.widget.ImageView;
import com.google.android.libraries.places.internal.zzor;
import com.google.android.libraries.places.internal.zzot;
import com.google.android.libraries.places.internal.zzoy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qv.InterfaceC16622O;

/* loaded from: classes6.dex */
final class zzaq extends SuspendLambda implements Function2 {
    public static final /* synthetic */ int zze = 0;
    int zza;
    final /* synthetic */ zzar zzb;
    final /* synthetic */ zzbp zzc;
    final /* synthetic */ ImageView zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzaq(zzar zzarVar, zzbp zzbpVar, ImageView imageView, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzarVar;
        this.zzc = zzbpVar;
        this.zzd = imageView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzaq(this.zzb, this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaq) create((InterfaceC16622O) obj, (Continuation) obj2)).invokeSuspend(Unit.f142422a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF = IntrinsicsKt.f();
        int i10 = this.zza;
        ResultKt.b(obj);
        if (i10 == 0) {
            final zzar zzarVar = this.zzb;
            zzoy zzoyVar = zzarVar.zzb;
            if (zzoyVar != null) {
                zzbp zzbpVar = this.zzc;
                zzor zzorVarZze = zzoyVar.zze();
                Uri uriZza = ((zzbl) zzbpVar).zza();
                final ImageView imageView = this.zzd;
                Intrinsics.g(imageView);
                zzot zzotVar = new zzot(imageView, new Function1() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzap
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Object invoke(Object obj2) {
                        zzar zzarVar2 = zzarVar;
                        ImageView imageView2 = imageView;
                        Intrinsics.g(imageView2);
                        zzarVar2.zzh(imageView2);
                        return Unit.f142422a;
                    }
                });
                this.zza = 1;
                if (zzorVarZze.zza(uriZza, zzotVar, this) == objF) {
                    return objF;
                }
            }
        }
        return Unit.f142422a;
    }
}
