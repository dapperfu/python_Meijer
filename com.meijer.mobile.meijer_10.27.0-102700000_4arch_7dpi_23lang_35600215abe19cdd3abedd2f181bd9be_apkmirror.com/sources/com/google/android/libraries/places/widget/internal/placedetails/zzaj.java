package com.google.android.libraries.places.widget.internal.placedetails;

import com.google.android.libraries.places.api.model.Place;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final /* synthetic */ class zzaj extends FunctionReferenceImpl implements Function1 {
    zzaj(Object obj) {
        super(1, obj, zzal.class, "updateUi", "updateUi(Lcom/google/android/libraries/places/api/model/Place;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Place p02 = (Place) obj;
        Intrinsics.j(p02, "p0");
        zzal.zza((zzal) this.receiver, p02);
        return Unit.f142422a;
    }
}
