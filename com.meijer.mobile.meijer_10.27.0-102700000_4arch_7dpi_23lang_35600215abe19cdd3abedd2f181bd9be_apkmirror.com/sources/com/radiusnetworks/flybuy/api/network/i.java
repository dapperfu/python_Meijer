package com.radiusnetworks.flybuy.api.network;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import retrofit2.Retrofit;

/* loaded from: classes11.dex */
public final class i extends Lambda implements Function0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f119928f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f119929g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f119930h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(double d10, double d11, float f10) {
        super(0);
        this.f119928f = d10;
        this.f119929g = d11;
        this.f119930h = f10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Retrofit retrofit = u.f119952a;
        if (retrofit == null) {
            Intrinsics.y("retrofit");
            retrofit = null;
        }
        return ((v) retrofit.create(v.class)).m(String.valueOf(this.f119928f), String.valueOf(this.f119929g), this.f119930h);
    }
}
