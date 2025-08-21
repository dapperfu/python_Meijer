package com.radiusnetworks.flybuy.api.network;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import retrofit2.Retrofit;

/* loaded from: classes12.dex */
public final class j extends Lambda implements Function0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f120901f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f120902g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f120903h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(double d10, double d11, float f10) {
        super(0);
        this.f120901f = d10;
        this.f120902g = d11;
        this.f120903h = f10;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Retrofit retrofit = v.f120925a;
        if (retrofit == null) {
            Intrinsics.x("retrofit");
            retrofit = null;
        }
        return ((w) retrofit.create(w.class)).n(String.valueOf(this.f120901f), String.valueOf(this.f120902g), this.f120903h);
    }
}
