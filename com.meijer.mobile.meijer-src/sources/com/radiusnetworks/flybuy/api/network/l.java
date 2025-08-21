package com.radiusnetworks.flybuy.api.network;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import retrofit2.Retrofit;

/* loaded from: classes12.dex */
public final class l extends Lambda implements Function0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f120909f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f120910g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f120911h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Integer f120912i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Integer f120913j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f120914k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(double d10, double d11, float f10, Integer num, Integer num2, String str) {
        super(0);
        this.f120909f = d10;
        this.f120910g = d11;
        this.f120911h = f10;
        this.f120912i = num;
        this.f120913j = num2;
        this.f120914k = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Retrofit retrofit = v.f120925a;
        if (retrofit == null) {
            Intrinsics.x("retrofit");
            retrofit = null;
        }
        return ((w) retrofit.create(w.class)).e(String.valueOf(this.f120909f), String.valueOf(this.f120910g), this.f120911h, this.f120912i, this.f120913j, this.f120914k);
    }
}
