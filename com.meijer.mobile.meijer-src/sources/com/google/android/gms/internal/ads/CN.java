package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class CN extends GN {

    /* renamed from: k, reason: collision with root package name */
    private final Yc.a f66613k;

    public final Map i() {
        return new HashMap(this.f68013a);
    }

    public CN(Executor executor, Sc.u uVar, Yc.a aVar, Yc.c cVar, Context context) {
        super(executor, uVar, cVar, context);
        this.f66613k = aVar;
        aVar.a(this.f68013a);
    }
}
