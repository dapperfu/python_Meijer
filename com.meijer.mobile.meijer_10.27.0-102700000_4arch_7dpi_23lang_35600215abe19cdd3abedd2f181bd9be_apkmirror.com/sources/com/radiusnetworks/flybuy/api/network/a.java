package com.radiusnetworks.flybuy.api.network;

import com.radiusnetworks.flybuy.api.model.ClaimOrderRequest;
import com.radiusnetworks.flybuy.api.model.ClaimOrderRequestData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import retrofit2.Retrofit;

/* loaded from: classes11.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f119915f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ClaimOrderRequestData f119916g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, ClaimOrderRequestData claimOrderRequestData) {
        super(0);
        this.f119915f = str;
        this.f119916g = claimOrderRequestData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Retrofit retrofit = u.f119952a;
        if (retrofit == null) {
            Intrinsics.y("retrofit");
            retrofit = null;
        }
        return ((v) retrofit.create(v.class)).c(this.f119915f, new ClaimOrderRequest(this.f119916g));
    }
}
