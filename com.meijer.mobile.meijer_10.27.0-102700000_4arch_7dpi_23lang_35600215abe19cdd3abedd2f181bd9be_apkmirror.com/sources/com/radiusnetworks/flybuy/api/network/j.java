package com.radiusnetworks.flybuy.api.network;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import retrofit2.Retrofit;

/* loaded from: classes11.dex */
public final class j extends Lambda implements Function0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f119931f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Integer f119932g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Integer f119933h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f119934i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Boolean f119935j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, Integer num, Integer num2, String str2, Boolean bool) {
        super(0);
        this.f119931f = str;
        this.f119932g = num;
        this.f119933h = num2;
        this.f119934i = str2;
        this.f119935j = bool;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Retrofit retrofit = u.f119952a;
        if (retrofit == null) {
            Intrinsics.y("retrofit");
            retrofit = null;
        }
        return ((v) retrofit.create(v.class)).k(this.f119931f, this.f119932g, this.f119933h, this.f119934i, this.f119935j);
    }
}
