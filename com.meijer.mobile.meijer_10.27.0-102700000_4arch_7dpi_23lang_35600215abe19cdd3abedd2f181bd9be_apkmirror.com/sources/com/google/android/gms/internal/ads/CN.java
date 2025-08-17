package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class CN extends GN {

    /* renamed from: k, reason: collision with root package name */
    private final Wc.a f65773k;

    public final Map i() {
        return new HashMap(this.f67173a);
    }

    public CN(Executor executor, Qc.u uVar, Wc.a aVar, Wc.c cVar, Context context) {
        super(executor, uVar, cVar, context);
        this.f65773k = aVar;
        aVar.a(this.f67173a);
    }
}
