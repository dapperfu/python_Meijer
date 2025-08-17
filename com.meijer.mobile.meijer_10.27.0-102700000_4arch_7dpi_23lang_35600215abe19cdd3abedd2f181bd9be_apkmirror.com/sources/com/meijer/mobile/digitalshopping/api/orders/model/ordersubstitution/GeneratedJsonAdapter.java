package com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution;

import com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution.OrderSubstitutionResponse;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import gu.c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/OrderSubstitutionResponse_LineItemJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/OrderSubstitutionResponse$LineItem;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/OrderSubstitutionResponse$LineItem;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/digitalshopping/api/orders/model/ordersubstitution/OrderSubstitutionResponse$LineItem;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "nullableIntAdapter", "Lcom/squareup/moshi/h;", "", "nullableDoubleAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.digitalshopping.api.orders.model.ordersubstitution.OrderSubstitutionResponse_LineItemJsonAdapter, reason: from toString */
/* loaded from: classes9.dex */
public final class GeneratedJsonAdapter extends h<OrderSubstitutionResponse.LineItem> {
    private volatile Constructor<OrderSubstitutionResponse.LineItem> constructorRef;
    private final h<Double> nullableDoubleAdapter;
    private final h<Integer> nullableIntAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("itemId", "productId", "productsubsitutedFor", "upc", "UPCSubstitutedFor", "name", "quantity", "ActualQuantityPicked", "customerSubstitutionPreference", "price", "pricePerUnit");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<Integer> hVarF = moshi.f(Integer.class, SetsKt.e(), "itemId");
        Intrinsics.i(hVarF, "adapter(...)");
        this.nullableIntAdapter = hVarF;
        h<Double> hVarF2 = moshi.f(Double.class, SetsKt.e(), "productId");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullableDoubleAdapter = hVarF2;
        h<String> hVarF3 = moshi.f(String.class, SetsKt.e(), "upc");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.nullableStringAdapter = hVarF3;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public OrderSubstitutionResponse.LineItem fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        int i10 = -1;
        Integer numFromJson = null;
        Double dFromJson = null;
        Double dFromJson2 = null;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        Double dFromJson3 = null;
        Double dFromJson4 = null;
        String strFromJson4 = null;
        Double dFromJson5 = null;
        Double dFromJson6 = null;
        while (reader.hasNext()) {
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    break;
                case 0:
                    numFromJson = this.nullableIntAdapter.fromJson(reader);
                    i10 &= -2;
                    break;
                case 1:
                    dFromJson = this.nullableDoubleAdapter.fromJson(reader);
                    i10 &= -3;
                    break;
                case 2:
                    dFromJson2 = this.nullableDoubleAdapter.fromJson(reader);
                    i10 &= -5;
                    break;
                case 3:
                    strFromJson = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -9;
                    break;
                case 4:
                    strFromJson2 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -17;
                    break;
                case 5:
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
                case 6:
                    dFromJson3 = this.nullableDoubleAdapter.fromJson(reader);
                    i10 &= -65;
                    break;
                case 7:
                    dFromJson4 = this.nullableDoubleAdapter.fromJson(reader);
                    i10 &= -129;
                    break;
                case 8:
                    strFromJson4 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -257;
                    break;
                case 9:
                    dFromJson5 = this.nullableDoubleAdapter.fromJson(reader);
                    i10 &= -513;
                    break;
                case 10:
                    dFromJson6 = this.nullableDoubleAdapter.fromJson(reader);
                    i10 &= -1025;
                    break;
            }
        }
        reader.d();
        if (i10 == -2048) {
            String str = strFromJson4;
            Double d10 = dFromJson4;
            Double d11 = dFromJson3;
            String str2 = strFromJson3;
            String str3 = strFromJson2;
            String str4 = strFromJson;
            return new OrderSubstitutionResponse.LineItem(numFromJson, dFromJson, dFromJson2, str4, str3, str2, d11, d10, str, dFromJson5, dFromJson6);
        }
        String str5 = strFromJson4;
        Double d12 = dFromJson4;
        Double d13 = dFromJson3;
        String str6 = strFromJson3;
        String str7 = strFromJson2;
        String str8 = strFromJson;
        Double d14 = dFromJson2;
        Double d15 = dFromJson;
        Integer num = numFromJson;
        Constructor<OrderSubstitutionResponse.LineItem> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = OrderSubstitutionResponse.LineItem.class.getDeclaredConstructor(Integer.class, Double.class, Double.class, String.class, String.class, String.class, Double.class, Double.class, String.class, Double.class, Double.class, Integer.TYPE, c.f134099c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        OrderSubstitutionResponse.LineItem lineItemNewInstance = declaredConstructor.newInstance(num, d15, d14, str8, str7, str6, d13, d12, str5, dFromJson5, dFromJson6, Integer.valueOf(i10), null);
        Intrinsics.i(lineItemNewInstance, "newInstance(...)");
        return lineItemNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, OrderSubstitutionResponse.LineItem value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("itemId");
        this.nullableIntAdapter.toJson(writer, (q) value_.getItemId());
        writer.l("productId");
        this.nullableDoubleAdapter.toJson(writer, (q) value_.getProductId());
        writer.l("productsubsitutedFor");
        this.nullableDoubleAdapter.toJson(writer, (q) value_.getProductSubstitutedFor());
        writer.l("upc");
        this.nullableStringAdapter.toJson(writer, (q) value_.getUpc());
        writer.l("UPCSubstitutedFor");
        this.nullableStringAdapter.toJson(writer, (q) value_.getUpcSubstitutedFor());
        writer.l("name");
        this.nullableStringAdapter.toJson(writer, (q) value_.getName());
        writer.l("quantity");
        this.nullableDoubleAdapter.toJson(writer, (q) value_.getQuantity());
        writer.l("ActualQuantityPicked");
        this.nullableDoubleAdapter.toJson(writer, (q) value_.getActualQuantityPicked());
        writer.l("customerSubstitutionPreference");
        this.nullableStringAdapter.toJson(writer, (q) value_.getCustomerSubstitutionPreference());
        writer.l("price");
        this.nullableDoubleAdapter.toJson(writer, (q) value_.getPrice());
        writer.l("pricePerUnit");
        this.nullableDoubleAdapter.toJson(writer, (q) value_.getPricePerUnit());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(56);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("OrderSubstitutionResponse.LineItem");
        sb2.append(')');
        return sb2.toString();
    }
}
