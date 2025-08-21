package com.google.android.libraries.places.widget.internal.placedetails;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.libraries.places.internal.zzor;
import com.google.android.libraries.places.internal.zzot;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import mv.InterfaceC15783O;

/* loaded from: classes6.dex */
final class zzcc extends SuspendLambda implements Function2 {
    public static final /* synthetic */ int zzf = 0;
    int zza;
    final /* synthetic */ zzcd zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzca zzd;
    final /* synthetic */ Drawable zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzcc(zzcd zzcdVar, String str, zzca zzcaVar, Drawable drawable, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzcdVar;
        this.zzc = str;
        this.zzd = zzcaVar;
        this.zze = drawable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzcc(this.zzb, this.zzc, this.zzd, this.zze, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcc) create((InterfaceC15783O) obj, (Continuation) obj2)).invokeSuspend(Unit.f143329a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zzor zzorVar;
        Object objF = IntrinsicsKt.f();
        int i10 = this.zza;
        ResultKt.b(obj);
        if (i10 == 0 && (zzorVar = this.zzb.zze) != null) {
            String str = this.zzc;
            final zzca zzcaVar = this.zzd;
            final Drawable drawable = this.zze;
            Uri uri = Uri.parse(str);
            zzot zzotVar = new zzot(zzcaVar.zzb(), new Function1() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzcb
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ Object invoke(Object obj2) {
                    zzcaVar.zzb().setImageDrawable(drawable);
                    return Unit.f143329a;
                }
            });
            this.zza = 1;
            if (zzorVar.zza(uri, zzotVar, this) == objF) {
                return objF;
            }
        }
        return Unit.f143329a;
    }
}
