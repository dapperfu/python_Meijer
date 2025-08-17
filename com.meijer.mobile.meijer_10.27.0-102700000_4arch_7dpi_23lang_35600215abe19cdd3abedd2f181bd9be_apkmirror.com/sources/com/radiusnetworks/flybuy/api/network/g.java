package com.radiusnetworks.flybuy.api.network;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import retrofit2.Retrofit;

/* loaded from: classes11.dex */
public final class g extends Lambda implements Function0 {

    /* renamed from: f, reason: collision with root package name */
    public static final g f119926f = new g();

    public g() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Retrofit retrofit = u.f119952a;
        if (retrofit == null) {
            Intrinsics.y("retrofit");
            retrofit = null;
        }
        return ((v) retrofit.create(v.class)).a();
    }
}
