package com.google.android.libraries.places.widget.internal.placedetails;

import androidx.view.InterfaceC5989E;
import kotlin.Function;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
final /* synthetic */ class zzak implements InterfaceC5989E, FunctionAdapter {
    private final /* synthetic */ Function1 zza;

    zzak(Function1 function) {
        Intrinsics.j(function, "function");
        this.zza = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC5989E) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return this.zza;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.view.InterfaceC5989E
    public final /* synthetic */ void onChanged(Object obj) {
        this.zza.invoke(obj);
    }
}
