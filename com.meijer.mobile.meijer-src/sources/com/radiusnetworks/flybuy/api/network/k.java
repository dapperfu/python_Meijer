package com.radiusnetworks.flybuy.api.network;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import retrofit2.Retrofit;

/* loaded from: classes12.dex */
public final class k extends Lambda implements Function0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f120904f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Integer f120905g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Integer f120906h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f120907i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Boolean f120908j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, Integer num, Integer num2, String str2, Boolean bool) {
        super(0);
        this.f120904f = str;
        this.f120905g = num;
        this.f120906h = num2;
        this.f120907i = str2;
        this.f120908j = bool;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Retrofit retrofit = v.f120925a;
        if (retrofit == null) {
            Intrinsics.x("retrofit");
            retrofit = null;
        }
        return ((w) retrofit.create(w.class)).l(this.f120904f, this.f120905g, this.f120906h, this.f120907i, this.f120908j);
    }
}
