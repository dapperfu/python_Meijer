package com.google.maps.android.ktx.model;

import Md.C4185k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a,\u0010\u0005\u001a\u00020\u00012\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "LMd/k;", "", "Lkotlin/ExtensionFunctionType;", "optionsActions", "groundOverlayOptions", "(Lkotlin/jvm/functions/Function1;)LMd/k;", "maps-ktx_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class GroundOverlayOptionsKt {
    public static final C4185k groundOverlayOptions(Function1<? super C4185k, Unit> optionsActions) {
        Intrinsics.j(optionsActions, "optionsActions");
        C4185k c4185k = new C4185k();
        optionsActions.invoke(c4185k);
        return c4185k;
    }
}
