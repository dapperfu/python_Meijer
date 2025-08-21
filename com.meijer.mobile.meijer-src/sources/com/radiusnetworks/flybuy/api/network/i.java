package com.radiusnetworks.flybuy.api.network;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import retrofit2.Retrofit;

/* loaded from: classes12.dex */
public final class i extends Lambda implements Function0 {

    /* renamed from: f, reason: collision with root package name */
    public static final i f120900f = new i();

    public i() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Retrofit retrofit = v.f120925a;
        if (retrofit == null) {
            Intrinsics.x("retrofit");
            retrofit = null;
        }
        return ((w) retrofit.create(w.class)).b();
    }
}
