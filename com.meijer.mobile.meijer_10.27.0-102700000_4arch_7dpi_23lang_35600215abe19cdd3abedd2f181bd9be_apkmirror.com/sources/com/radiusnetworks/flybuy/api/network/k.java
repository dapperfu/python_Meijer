package com.radiusnetworks.flybuy.api.network;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import retrofit2.Retrofit;

/* loaded from: classes11.dex */
public final class k extends Lambda implements Function0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f119936f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f119937g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f119938h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Integer f119939i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Integer f119940j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f119941k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(double d10, double d11, float f10, Integer num, Integer num2, String str) {
        super(0);
        this.f119936f = d10;
        this.f119937g = d11;
        this.f119938h = f10;
        this.f119939i = num;
        this.f119940j = num2;
        this.f119941k = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Retrofit retrofit = u.f119952a;
        if (retrofit == null) {
            Intrinsics.y("retrofit");
            retrofit = null;
        }
        return ((v) retrofit.create(v.class)).d(String.valueOf(this.f119936f), String.valueOf(this.f119937g), this.f119938h, this.f119939i, this.f119940j, this.f119941k);
    }
}
