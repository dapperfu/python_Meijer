package com.google.android.libraries.places.internal;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.request.target.j;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import qv.C16658p;

/* loaded from: classes6.dex */
public final class zzor {
    private final Context zza;

    public zzor(Context context) {
        Intrinsics.j(context, "context");
        this.zza = context;
    }

    public final Object zza(Uri uri, zzot zzotVar, Continuation continuation) {
        C16658p c16658p = new C16658p(IntrinsicsKt.c(continuation), 1);
        c16658p.C();
        j jVarZ0 = com.bumptech.glide.b.t(this.zza).b().E0(uri).g().z0(zzotVar);
        Intrinsics.i(jVarZ0, "into(...)");
        Object objV = c16658p.v();
        if (objV == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objV == IntrinsicsKt.f() ? objV : Unit.f142422a;
    }
}
