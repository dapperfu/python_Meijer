package com.google.maps.android.ktx.model;

import Od.C4467o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0005\u001a\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "LOd/o;", "", "Lkotlin/ExtensionFunctionType;", "optionsActions", "markerOptions", "(Lkotlin/jvm/functions/Function1;)LOd/o;", "maps-ktx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MarkerOptionsKt {
    public static final C4467o markerOptions(Function1<? super C4467o, Unit> optionsActions) {
        Intrinsics.j(optionsActions, "optionsActions");
        C4467o c4467o = new C4467o();
        optionsActions.invoke(c4467o);
        return c4467o;
    }
}
