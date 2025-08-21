package com.google.android.libraries.places.widget.internal.placedetails;

import com.google.android.libraries.places.api.model.Place;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final /* synthetic */ class zzb extends FunctionReferenceImpl implements Function1 {
    zzb(Object obj) {
        super(1, obj, zze.class, "updateUi", "updateUi(Lcom/google/android/libraries/places/api/model/Place;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Place p02 = (Place) obj;
        Intrinsics.j(p02, "p0");
        zze.zza((zze) this.receiver, p02);
        return Unit.f143329a;
    }
}
