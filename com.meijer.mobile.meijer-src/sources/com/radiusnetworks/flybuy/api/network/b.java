package com.radiusnetworks.flybuy.api.network;

import com.radiusnetworks.flybuy.api.model.ClaimOrderRequest;
import com.radiusnetworks.flybuy.api.model.ClaimOrderRequestData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import retrofit2.Retrofit;

/* loaded from: classes12.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f120891f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ClaimOrderRequestData f120892g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, ClaimOrderRequestData claimOrderRequestData) {
        super(0);
        this.f120891f = str;
        this.f120892g = claimOrderRequestData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Retrofit retrofit = v.f120925a;
        if (retrofit == null) {
            Intrinsics.x("retrofit");
            retrofit = null;
        }
        return ((w) retrofit.create(w.class)).d(this.f120891f, new ClaimOrderRequest(this.f120892g));
    }
}
