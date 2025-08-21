package com.radiusnetworks.flybuy.api.network;

import com.radiusnetworks.flybuy.api.model.CreateCustomerRequest;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import retrofit2.Retrofit;

/* loaded from: classes12.dex */
public final class c extends Lambda implements Function0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CreateCustomerRequest f120893f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CreateCustomerRequest createCustomerRequest) {
        super(0);
        this.f120893f = createCustomerRequest;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Retrofit retrofit = v.f120925a;
        if (retrofit == null) {
            Intrinsics.x("retrofit");
            retrofit = null;
        }
        return ((w) retrofit.create(w.class)).m(this.f120893f);
    }
}
