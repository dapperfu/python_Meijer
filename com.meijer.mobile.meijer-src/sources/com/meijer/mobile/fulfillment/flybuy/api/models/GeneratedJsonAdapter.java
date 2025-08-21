package com.meijer.mobile.fulfillment.flybuy.api.models;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import gu.C14410c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/meijer/mobile/fulfillment/flybuy/api/models/FlyBuyOrderResponseJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/fulfillment/flybuy/api/models/FlyBuyOrderResponse;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/fulfillment/flybuy/api/models/FlyBuyOrderResponse;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/fulfillment/flybuy/api/models/FlyBuyOrderResponse;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "Lcom/meijer/mobile/fulfillment/flybuy/api/models/FlyBuyOrderData;", "listOfFlyBuyOrderDataAdapter", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/fulfillment/flybuy/api/models/PagesResponse;", "nullablePagesResponseAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "flybuy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.fulfillment.flybuy.api.models.FlyBuyOrderResponseJsonAdapter, reason: from toString */
/* loaded from: classes10.dex */
public final class GeneratedJsonAdapter extends h<FlyBuyOrderResponse> {
    private volatile Constructor<FlyBuyOrderResponse> constructorRef;
    private final h<List<FlyBuyOrderData>> listOfFlyBuyOrderDataAdapter;
    private final h<PagesResponse> nullablePagesResponseAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("data", "pages");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<List<FlyBuyOrderData>> hVarF = moshi.f(x.j(List.class, FlyBuyOrderData.class), SetsKt.e(), "flyBuyOrderData");
        Intrinsics.i(hVarF, "adapter(...)");
        this.listOfFlyBuyOrderDataAdapter = hVarF;
        h<PagesResponse> hVarF2 = moshi.f(PagesResponse.class, SetsKt.e(), "flyBuyOrderPages");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullablePagesResponseAdapter = hVarF2;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public FlyBuyOrderResponse fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        List<FlyBuyOrderData> listFromJson = null;
        PagesResponse pagesResponseFromJson = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0) {
                listFromJson = this.listOfFlyBuyOrderDataAdapter.fromJson(reader);
                if (listFromJson == null) {
                    throw C14410c.w("flyBuyOrderData", "data", reader);
                }
                i10 = -2;
            } else if (iZ == 1) {
                pagesResponseFromJson = this.nullablePagesResponseAdapter.fromJson(reader);
            }
        }
        reader.d();
        if (i10 == -2) {
            Intrinsics.h(listFromJson, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.fulfillment.flybuy.api.models.FlyBuyOrderData>");
            return new FlyBuyOrderResponse(listFromJson, pagesResponseFromJson);
        }
        Constructor<FlyBuyOrderResponse> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = FlyBuyOrderResponse.class.getDeclaredConstructor(List.class, PagesResponse.class, Integer.TYPE, C14410c.f134472c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        FlyBuyOrderResponse flyBuyOrderResponseNewInstance = declaredConstructor.newInstance(listFromJson, pagesResponseFromJson, Integer.valueOf(i10), null);
        Intrinsics.i(flyBuyOrderResponseNewInstance, "newInstance(...)");
        return flyBuyOrderResponseNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, FlyBuyOrderResponse value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("data");
        this.listOfFlyBuyOrderDataAdapter.toJson(writer, (q) value_.a());
        writer.l("pages");
        this.nullablePagesResponseAdapter.toJson(writer, (q) value_.getFlyBuyOrderPages());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("FlyBuyOrderResponse");
        sb2.append(')');
        return sb2.toString();
    }
}
