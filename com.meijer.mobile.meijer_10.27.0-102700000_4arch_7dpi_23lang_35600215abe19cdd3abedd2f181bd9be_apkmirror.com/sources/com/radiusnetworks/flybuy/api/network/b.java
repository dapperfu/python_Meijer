package com.radiusnetworks.flybuy.api.network;

import com.radiusnetworks.flybuy.api.model.CreateCustomerRequest;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import retrofit2.Retrofit;

/* loaded from: classes11.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CreateCustomerRequest f119917f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(CreateCustomerRequest createCustomerRequest) {
        super(0);
        this.f119917f = createCustomerRequest;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Retrofit retrofit = u.f119952a;
        if (retrofit == null) {
            Intrinsics.y("retrofit");
            retrofit = null;
        }
        return ((v) retrofit.create(v.class)).l(this.f119917f);
    }
}
