package com.google.android.libraries.places.widget;

import android.net.Uri;
import android.widget.ImageView;
import com.google.android.libraries.places.internal.zzor;
import com.google.android.libraries.places.internal.zzot;
import com.google.android.libraries.places.internal.zzoy;
import com.google.android.libraries.places.widget.internal.placedetails.zzbi;
import com.google.android.libraries.places.widget.internal.placedetails.zzbl;
import com.google.android.libraries.places.widget.internal.placedetails.zzbp;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mv.InterfaceC15783O;

/* loaded from: classes6.dex */
final class zzah extends SuspendLambda implements Function2 {
    public static final /* synthetic */ int zze = 0;
    int zza;
    final /* synthetic */ PlaceDetailsFragment zzb;
    final /* synthetic */ zzbp zzc;
    final /* synthetic */ ImageView zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzah(PlaceDetailsFragment placeDetailsFragment, zzbp zzbpVar, ImageView imageView, Continuation continuation) {
        super(2, continuation);
        this.zzb = placeDetailsFragment;
        this.zzc = zzbpVar;
        this.zzd = imageView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzah(this.zzb, this.zzc, this.zzd, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzah) create((InterfaceC15783O) obj, (Continuation) obj2)).invokeSuspend(Unit.f143329a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF = IntrinsicsKt.f();
        int i10 = this.zza;
        ResultKt.b(obj);
        if (i10 == 0) {
            final PlaceDetailsFragment placeDetailsFragment = this.zzb;
            zzbi zzbiVar = placeDetailsFragment.zzB;
            if (zzbiVar == null) {
                Intrinsics.x("viewModel");
                zzbiVar = null;
            }
            zzoy zzoyVarZze = zzbiVar.zze();
            if (zzoyVarZze != null) {
                zzbp zzbpVar = this.zzc;
                zzor zzorVarZze = zzoyVarZze.zze();
                Uri uriZza = ((zzbl) zzbpVar).zza();
                zzot zzotVar = new zzot(this.zzd, new Function1() { // from class: com.google.android.libraries.places.widget.zzag
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Object invoke(Object obj2) {
                        PlaceDetailsFragment.zze(placeDetailsFragment, (ImageView) obj2);
                        return Unit.f143329a;
                    }
                });
                this.zza = 1;
                if (zzorVarZze.zza(uriZza, zzotVar, this) == objF) {
                    return objF;
                }
            }
        }
        return Unit.f143329a;
    }
}
