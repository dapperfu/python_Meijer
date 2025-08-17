package com.radiusnetworks.flybuy.api.network;

import com.radiusnetworks.flybuy.api.model.LoginRequest;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import retrofit2.Retrofit;

/* loaded from: classes11.dex */
public final class l extends Lambda implements Function0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ LoginRequest f119942f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(LoginRequest loginRequest) {
        super(0);
        this.f119942f = loginRequest;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Retrofit retrofit = u.f119952a;
        if (retrofit == null) {
            Intrinsics.y("retrofit");
            retrofit = null;
        }
        return ((v) retrofit.create(v.class)).b(this.f119942f);
    }
}
