package com.meijer.mobile.shoppinglist.service.responses;

import com.meijer.mobile.shoppinglist.service.models.ShoppingListItemWireModel;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import gu.c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R \u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/meijer/mobile/shoppinglist/service/responses/GetShoppingListResponseJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/shoppinglist/service/responses/GetShoppingListResponse;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/shoppinglist/service/responses/GetShoppingListResponse;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/shoppinglist/service/responses/GetShoppingListResponse;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "longAdapter", "Lcom/squareup/moshi/h;", "nullableStringAdapter", "", "intAdapter", "", "Lcom/meijer/mobile/shoppinglist/service/models/ShoppingListItemWireModel;", "listOfShoppingListItemWireModelAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.shoppinglist.service.responses.GetShoppingListResponseJsonAdapter, reason: from toString */
/* loaded from: classes11.dex */
public final class GeneratedJsonAdapter extends h<GetShoppingListResponse> {
    private volatile Constructor<GetShoppingListResponse> constructorRef;
    private final h<Integer> intAdapter;
    private final h<List<ShoppingListItemWireModel>> listOfShoppingListItemWireModelAdapter;
    private final h<Long> longAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("listId", "listName", "listTypeId", "totalCount", "listItems");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<Long> hVarF = moshi.f(Long.TYPE, SetsKt.e(), "listId");
        Intrinsics.i(hVarF, "adapter(...)");
        this.longAdapter = hVarF;
        h<String> hVarF2 = moshi.f(String.class, SetsKt.e(), "listName");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.nullableStringAdapter = hVarF2;
        h<Integer> hVarF3 = moshi.f(Integer.TYPE, SetsKt.e(), "listTypeId");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.intAdapter = hVarF3;
        h<List<ShoppingListItemWireModel>> hVarF4 = moshi.f(x.j(List.class, ShoppingListItemWireModel.class), SetsKt.e(), "listItems");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.listOfShoppingListItemWireModelAdapter = hVarF4;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public GetShoppingListResponse fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        Long lFromJson = 0L;
        Integer numFromJson = 0;
        Integer numFromJson2 = null;
        String strFromJson = null;
        List<ShoppingListItemWireModel> listFromJson = null;
        int i10 = -1;
        while (reader.hasNext()) {
            int iZ = reader.z(this.options);
            if (iZ == -1) {
                reader.H();
                reader.skipValue();
            } else if (iZ == 0) {
                lFromJson = this.longAdapter.fromJson(reader);
                if (lFromJson == null) {
                    throw c.w("listId", "listId", reader);
                }
                i10 &= -2;
            } else if (iZ == 1) {
                strFromJson = this.nullableStringAdapter.fromJson(reader);
                i10 &= -3;
            } else if (iZ == 2) {
                numFromJson = this.intAdapter.fromJson(reader);
                if (numFromJson == null) {
                    throw c.w("listTypeId", "listTypeId", reader);
                }
                i10 &= -5;
            } else if (iZ == 3) {
                numFromJson2 = this.intAdapter.fromJson(reader);
                if (numFromJson2 == null) {
                    throw c.w("totalCount", "totalCount", reader);
                }
                i10 &= -9;
            } else if (iZ == 4) {
                listFromJson = this.listOfShoppingListItemWireModelAdapter.fromJson(reader);
                if (listFromJson == null) {
                    throw c.w("listItems", "listItems", reader);
                }
                i10 &= -17;
            } else {
                continue;
            }
        }
        reader.d();
        if (i10 == -32) {
            long jLongValue = lFromJson.longValue();
            int iIntValue = numFromJson.intValue();
            int iIntValue2 = numFromJson2.intValue();
            Intrinsics.h(listFromJson, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.shoppinglist.service.models.ShoppingListItemWireModel>");
            return new GetShoppingListResponse(jLongValue, strFromJson, iIntValue, iIntValue2, listFromJson);
        }
        List<ShoppingListItemWireModel> list = listFromJson;
        Constructor<GetShoppingListResponse> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class<?> cls = c.f134099c;
            Class cls2 = Long.TYPE;
            Class cls3 = Integer.TYPE;
            declaredConstructor = GetShoppingListResponse.class.getDeclaredConstructor(cls2, String.class, cls3, cls3, List.class, cls3, cls);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        GetShoppingListResponse getShoppingListResponseNewInstance = declaredConstructor.newInstance(lFromJson, strFromJson, numFromJson, numFromJson2, list, Integer.valueOf(i10), null);
        Intrinsics.i(getShoppingListResponseNewInstance, "newInstance(...)");
        return getShoppingListResponseNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, GetShoppingListResponse value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("listId");
        this.longAdapter.toJson(writer, (q) Long.valueOf(value_.getListId()));
        writer.l("listName");
        this.nullableStringAdapter.toJson(writer, (q) value_.getListName());
        writer.l("listTypeId");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getListTypeId()));
        writer.l("totalCount");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getTotalCount()));
        writer.l("listItems");
        this.listOfShoppingListItemWireModelAdapter.toJson(writer, (q) value_.b());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(45);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("GetShoppingListResponse");
        sb2.append(')');
        return sb2.toString();
    }
}
