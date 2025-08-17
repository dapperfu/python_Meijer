package com.radiusnetworks.flybuy.api.mapbox;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import retrofit2.Retrofit;

/* loaded from: classes11.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f119901f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f119902g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Double f119903h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Double f119904i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, String str2, Double d10, Double d11) {
        super(0);
        this.f119901f = str;
        this.f119902g = str2;
        this.f119903h = d10;
        this.f119904i = d11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws SecurityException {
        Retrofit retrofit = c.f119905a;
        String string = null;
        if (retrofit == null) {
            Intrinsics.y("retrofit");
            retrofit = null;
        }
        Object objCreate = retrofit.create(d.class);
        Intrinsics.i(objCreate, "create(...)");
        d dVar = (d) objCreate;
        String str = this.f119901f;
        List<String> listE = CollectionsKt.e(this.f119902g);
        Double d10 = this.f119903h;
        if (d10 != null) {
            Double d11 = this.f119904i;
            double dDoubleValue = d10.doubleValue();
            if (d11 != null) {
                double dDoubleValue2 = d11.doubleValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dDoubleValue);
                sb2.append(',');
                sb2.append(dDoubleValue2);
                string = sb2.toString();
            }
        }
        return dVar.a(str, "en", listE, string);
    }
}
