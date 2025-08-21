package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesClient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import mv.C15799f;
import mv.C15809k;
import mv.InterfaceC15783O;

/* loaded from: classes6.dex */
final class zzps extends SuspendLambda implements Function2 {
    int zza;
    final /* synthetic */ List zzb;
    final /* synthetic */ zzpw zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzps(List list, zzpw zzpwVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = list;
        this.zzc = zzpwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        zzps zzpsVar = new zzps(this.zzb, this.zzc, continuation);
        zzpsVar.zzd = obj;
        return zzpsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzps) create((InterfaceC15783O) obj, (Continuation) obj2)).invokeSuspend(Unit.f143329a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objF = IntrinsicsKt.f();
        int i10 = this.zza;
        ResultKt.b(obj);
        if (i10 == 0) {
            InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.zzd;
            List list = this.zzb;
            zzpw zzpwVar = this.zzc;
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(C15809k.b(interfaceC15783O, null, null, new zzpr(zzpwVar, (Place) it.next(), null), 3, null));
            }
            this.zza = 1;
            obj = C15799f.a(arrayList, this);
            if (obj == objF) {
                return objF;
            }
        }
        zzpw zzpwVar2 = this.zzc;
        zzpwVar2.zzf.m((List) obj);
        PlacesClient placesClientZzd = zzpwVar2.zzd();
        if (placesClientZzd != null) {
            placesClientZzd.zzm();
        }
        return Unit.f143329a;
    }
}
