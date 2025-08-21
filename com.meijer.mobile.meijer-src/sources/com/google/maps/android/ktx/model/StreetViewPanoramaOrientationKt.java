package com.google.maps.android.ktx.model;

import com.google.android.gms.maps.model.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0006\u001a\u00020\u00052\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, d2 = {"Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/a$a;", "", "Lkotlin/ExtensionFunctionType;", "optionsActions", "Lcom/google/android/gms/maps/model/a;", "streetViewPanoramaOrientation", "(Lkotlin/jvm/functions/Function1;)Lcom/google/android/gms/maps/model/a;", "maps-ktx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StreetViewPanoramaOrientationKt {
    public static final a streetViewPanoramaOrientation(Function1<? super a.C1271a, Unit> optionsActions) {
        Intrinsics.j(optionsActions, "optionsActions");
        a.C1271a c1271a = new a.C1271a();
        optionsActions.invoke(c1271a);
        a aVarB = c1271a.b();
        Intrinsics.i(aVarB, "build(...)");
        return aVarB;
    }
}
