package com.google.android.libraries.places.internal;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.request.target.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import mv.C15819p;

/* loaded from: classes6.dex */
public final class zzor {
    private final Context zza;

    public zzor(Context context) {
        Intrinsics.j(context, "context");
        this.zza = context;
    }

    public final Object zza(Uri uri, zzot zzotVar, Continuation continuation) {
        C15819p c15819p = new C15819p(IntrinsicsKt.c(continuation), 1);
        c15819p.C();
        j jVarZ0 = com.bumptech.glide.b.t(this.zza).b().E0(uri).g().z0(zzotVar);
        Intrinsics.i(jVarZ0, "into(...)");
        Object objU = c15819p.u();
        if (objU == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objU == IntrinsicsKt.f() ? objU : Unit.f143329a;
    }
}
