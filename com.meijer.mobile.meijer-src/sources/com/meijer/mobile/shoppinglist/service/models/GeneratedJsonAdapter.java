package com.meijer.mobile.shoppinglist.service.models;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import gu.C14410c;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/meijer/mobile/shoppinglist/service/models/FavoriteListItemWireModelJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/shoppinglist/service/models/FavoriteListItemWireModel;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/shoppinglist/service/models/FavoriteListItemWireModel;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/shoppinglist/service/models/FavoriteListItemWireModel;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "longAdapter", "Lcom/squareup/moshi/h;", "", "intAdapter", "nullableStringAdapter", "", "booleanAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.shoppinglist.service.models.FavoriteListItemWireModelJsonAdapter, reason: from toString */
/* loaded from: classes12.dex */
public final class GeneratedJsonAdapter extends h<FavoriteListItemWireModel> {
    private final h<Boolean> booleanAdapter;
    private volatile Constructor<FavoriteListItemWireModel> constructorRef;
    private final h<Integer> intAdapter;
    private final h<Long> longAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("listItemId", "listItemTypeId", "itemDisplayOrder", "itemPartNumber", "itemDescription", "isItemInActiveList");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<Long> hVarF = moshi.f(Long.TYPE, SetsKt.e(), "listItemId");
        Intrinsics.i(hVarF, "adapter(...)");
        this.longAdapter = hVarF;
        h<Integer> hVarF2 = moshi.f(Integer.TYPE, SetsKt.e(), "listItemTypeId");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.intAdapter = hVarF2;
        h<String> hVarF3 = moshi.f(String.class, SetsKt.e(), "itemPartNumber");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.nullableStringAdapter = hVarF3;
        h<Boolean> hVarF4 = moshi.f(Boolean.TYPE, SetsKt.e(), "isItemInActiveList");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.booleanAdapter = hVarF4;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public FavoriteListItemWireModel fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        Boolean bool = Boolean.FALSE;
        reader.b();
        int i10 = -1;
        Long lFromJson = 0L;
        Integer numFromJson = 0;
        Integer numFromJson2 = null;
        Boolean boolFromJson = bool;
        String strFromJson = null;
        String strFromJson2 = null;
        while (reader.hasNext()) {
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    break;
                case 0:
                    lFromJson = this.longAdapter.fromJson(reader);
                    if (lFromJson == null) {
                        throw C14410c.w("listItemId", "listItemId", reader);
                    }
                    i10 &= -2;
                    break;
                case 1:
                    numFromJson = this.intAdapter.fromJson(reader);
                    if (numFromJson == null) {
                        throw C14410c.w("listItemTypeId", "listItemTypeId", reader);
                    }
                    i10 &= -3;
                    break;
                case 2:
                    numFromJson2 = this.intAdapter.fromJson(reader);
                    if (numFromJson2 == null) {
                        throw C14410c.w("itemDisplayOrder", "itemDisplayOrder", reader);
                    }
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
                    boolFromJson = this.booleanAdapter.fromJson(reader);
                    if (boolFromJson == null) {
                        throw C14410c.w("isItemInActiveList", "isItemInActiveList", reader);
                    }
                    i10 &= -33;
                    break;
            }
        }
        reader.d();
        if (i10 == -64) {
            return new FavoriteListItemWireModel(lFromJson.longValue(), numFromJson.intValue(), numFromJson2.intValue(), strFromJson, strFromJson2, boolFromJson.booleanValue());
        }
        Constructor<FavoriteListItemWireModel> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class cls = Boolean.TYPE;
            Class<?> cls2 = C14410c.f134472c;
            Class cls3 = Long.TYPE;
            Class cls4 = Integer.TYPE;
            declaredConstructor = FavoriteListItemWireModel.class.getDeclaredConstructor(cls3, cls4, cls4, String.class, String.class, cls, cls4, cls2);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "also(...)");
        }
        FavoriteListItemWireModel favoriteListItemWireModelNewInstance = declaredConstructor.newInstance(lFromJson, numFromJson, numFromJson2, strFromJson, strFromJson2, boolFromJson, Integer.valueOf(i10), null);
        Intrinsics.i(favoriteListItemWireModelNewInstance, "newInstance(...)");
        return favoriteListItemWireModelNewInstance;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, FavoriteListItemWireModel value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("listItemId");
        this.longAdapter.toJson(writer, (q) Long.valueOf(value_.getListItemId()));
        writer.l("listItemTypeId");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getListItemTypeId()));
        writer.l("itemDisplayOrder");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getItemDisplayOrder()));
        writer.l("itemPartNumber");
        this.nullableStringAdapter.toJson(writer, (q) value_.getItemPartNumber());
        writer.l("itemDescription");
        this.nullableStringAdapter.toJson(writer, (q) value_.getItemDescription());
        writer.l("isItemInActiveList");
        this.booleanAdapter.toJson(writer, (q) Boolean.valueOf(value_.getIsItemInActiveList()));
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(47);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("FavoriteListItemWireModel");
        sb2.append(')');
        return sb2.toString();
    }
}
