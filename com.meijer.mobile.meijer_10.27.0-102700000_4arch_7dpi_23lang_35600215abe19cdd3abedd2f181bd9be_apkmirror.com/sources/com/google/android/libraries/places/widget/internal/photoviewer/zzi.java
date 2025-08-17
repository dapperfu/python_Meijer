package com.google.android.libraries.places.widget.internal.photoviewer;

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
final class zzi extends SuspendLambda implements Function2 {
    public static final /* synthetic */ int zzc = 0;
    int zza;
    final /* synthetic */ zzj zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzi(zzj zzjVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzjVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzi(this.zzb, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzi) create((InterfaceC16622O) obj, (Continuation) obj2)).invokeSuspend(Unit.f142422a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF = IntrinsicsKt.f();
        int i10 = this.zza;
        ResultKt.b(obj);
        if (i10 == 0) {
            final zzj zzjVar = this.zzb;
            com.google.android.libraries.places.widget.model.zzi zziVar = zzjVar.zze;
            ImageView imageView = null;
            if (zziVar == null) {
                Intrinsics.y("pageData");
                zziVar = null;
            }
            Uri uri = Uri.parse(zziVar.zza());
            zzoy zzoyVarZza = zzjVar.zza();
            if (zzoyVarZza != null) {
                zzor zzorVarZze = zzoyVarZza.zze();
                ImageView imageView2 = zzjVar.zzc;
                if (imageView2 == null) {
                    Intrinsics.y("image");
                } else {
                    imageView = imageView2;
                }
                zzot zzotVar = new zzot(imageView, new Function1() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzh
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Object invoke(Object obj2) {
                        zzj.zzd(zzjVar);
                        return Unit.f142422a;
                    }
                });
                this.zza = 1;
                if (zzorVarZze.zza(uri, zzotVar, this) == objF) {
                    return objF;
                }
            }
        }
        return Unit.f142422a;
    }
}
