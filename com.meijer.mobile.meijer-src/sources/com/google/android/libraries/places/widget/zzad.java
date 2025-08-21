package com.google.android.libraries.places.widget;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final /* synthetic */ class zzad extends FunctionReferenceImpl implements Function1 {
    zzad(Object obj) {
        super(1, obj, PlaceDetailsFragment.class, "onPlaceLoadFailed", "onPlaceLoadFailed(Ljava/lang/Exception;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Exception p02 = (Exception) obj;
        Intrinsics.j(p02, "p0");
        PlaceDetailsFragment.zzb((PlaceDetailsFragment) this.receiver, p02);
        return Unit.f143329a;
    }
}
