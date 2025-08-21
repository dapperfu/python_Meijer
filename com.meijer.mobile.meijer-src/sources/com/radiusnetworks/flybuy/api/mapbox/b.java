package com.radiusnetworks.flybuy.api.mapbox;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import retrofit2.Retrofit;

/* loaded from: classes12.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f120874f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List f120875g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ List f120876h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Double f120877i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Double f120878j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, List list, List list2, Double d10, Double d11) {
        super(0);
        this.f120874f = str;
        this.f120875g = list;
        this.f120876h = list2;
        this.f120877i = d10;
        this.f120878j = d11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws SecurityException {
        Retrofit retrofit = c.f120879a;
        String string = null;
        if (retrofit == null) {
            Intrinsics.x("retrofit");
            retrofit = null;
        }
        Object objCreate = retrofit.create(d.class);
        Intrinsics.i(objCreate, "create(...)");
        d dVar = (d) objCreate;
        String str = this.f120874f;
        String strB0 = CollectionsKt.B0(this.f120875g, ",", null, null, 0, null, null, 62, null);
        List list = this.f120876h;
        String strB02 = list != null ? CollectionsKt.B0(list, ",", null, null, 0, null, null, 62, null) : null;
        Double d10 = this.f120877i;
        if (d10 != null) {
            Double d11 = this.f120878j;
            double dDoubleValue = d10.doubleValue();
            if (d11 != null) {
                double dDoubleValue2 = d11.doubleValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(dDoubleValue2);
                sb2.append(',');
                sb2.append(dDoubleValue);
                string = sb2.toString();
            }
        }
        return dVar.a(str, "en", strB0, strB02, string);
    }
}
