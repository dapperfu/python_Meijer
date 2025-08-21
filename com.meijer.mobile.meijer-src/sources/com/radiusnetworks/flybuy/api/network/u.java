package com.radiusnetworks.flybuy.api.network;

import com.radiusnetworks.flybuy.api.model.UpdateOrderRequest;
import com.radiusnetworks.flybuy.api.model.UpdateOrderRequestData;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import retrofit2.Retrofit;

/* loaded from: classes12.dex */
public final class u extends Lambda implements Function0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f120923f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ UpdateOrderRequestData f120924g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(String str, UpdateOrderRequestData updateOrderRequestData) {
        super(0);
        this.f120923f = str;
        this.f120924g = updateOrderRequestData;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Retrofit retrofit = v.f120925a;
        if (retrofit == null) {
            Intrinsics.x("retrofit");
            retrofit = null;
        }
        return ((w) retrofit.create(w.class)).g(this.f120923f, new UpdateOrderRequest(this.f120924g));
    }
}
