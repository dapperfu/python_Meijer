package com.radiusnetworks.flybuy.api.network;

import com.radiusnetworks.flybuy.api.model.UpdateOrderRequest;
import com.radiusnetworks.flybuy.api.model.UpdateOrderRequestData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import retrofit2.Retrofit;

/* loaded from: classes11.dex */
public final class t extends Lambda implements Function0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f119950f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ UpdateOrderRequestData f119951g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String str, UpdateOrderRequestData updateOrderRequestData) {
        super(0);
        this.f119950f = str;
        this.f119951g = updateOrderRequestData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Retrofit retrofit = u.f119952a;
        if (retrofit == null) {
            Intrinsics.y("retrofit");
            retrofit = null;
        }
        return ((v) retrofit.create(v.class)).f(this.f119950f, new UpdateOrderRequest(this.f119951g));
    }
}
