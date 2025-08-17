package com.meijer.mobile.product.model.constructor;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import gu.c;
import io.constructor.data.model.common.FilterFacet;
import io.constructor.data.model.common.FilterGroup;
import io.constructor.data.model.common.Result;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001aR\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/meijer/mobile/product/model/constructor/SponsoredProductsResponseInnerJsonAdapter;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/product/model/constructor/SponsoredProductsResponseInner;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "a", "(Lcom/squareup/moshi/k;)Lcom/meijer/mobile/product/model/constructor/SponsoredProductsResponseInner;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "b", "(Lcom/squareup/moshi/q;Lcom/meijer/mobile/product/model/constructor/SponsoredProductsResponseInner;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "Lio/constructor/data/model/common/FilterFacet;", "listOfFilterFacetAdapter", "Lcom/squareup/moshi/h;", "Lio/constructor/data/model/common/FilterGroup;", "listOfFilterGroupAdapter", "Lio/constructor/data/model/common/Result;", "listOfResultAdapter", "nullableStringAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "constructor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.product.model.constructor.SponsoredProductsResponseInnerJsonAdapter, reason: from toString */
/* loaded from: classes11.dex */
public final class GeneratedJsonAdapter extends h<SponsoredProductsResponseInner> {
    private volatile Constructor<SponsoredProductsResponseInner> constructorRef;
    private final h<List<FilterFacet>> listOfFilterFacetAdapter;
    private final h<List<FilterGroup>> listOfFilterGroupAdapter;
    private final h<List<Result>> listOfResultAdapter;
    private final h<String> nullableStringAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("facets", "groups", "results", "onClickBeacon", "onViewBeacon", "onLoadBeacon");
        Intrinsics.i(bVarA, "of(...)");
        this.options = bVarA;
        h<List<FilterFacet>> hVarF = moshi.f(x.j(List.class, FilterFacet.class), SetsKt.e(), "facets");
        Intrinsics.i(hVarF, "adapter(...)");
        this.listOfFilterFacetAdapter = hVarF;
        h<List<FilterGroup>> hVarF2 = moshi.f(x.j(List.class, FilterGroup.class), SetsKt.e(), "groups");
        Intrinsics.i(hVarF2, "adapter(...)");
        this.listOfFilterGroupAdapter = hVarF2;
        h<List<Result>> hVarF3 = moshi.f(x.j(List.class, Result.class), SetsKt.e(), "results");
        Intrinsics.i(hVarF3, "adapter(...)");
        this.listOfResultAdapter = hVarF3;
        h<String> hVarF4 = moshi.f(String.class, SetsKt.e(), "onClickBeacon");
        Intrinsics.i(hVarF4, "adapter(...)");
        this.nullableStringAdapter = hVarF4;
    }

    @Override // com.squareup.moshi.h
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public SponsoredProductsResponseInner fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        int i10 = -1;
        List<FilterFacet> listFromJson = null;
        List<FilterGroup> listFromJson2 = null;
        List<Result> listFromJson3 = null;
        String strFromJson = null;
        String strFromJson2 = null;
        String strFromJson3 = null;
        while (reader.hasNext()) {
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    break;
                case 0:
                    listFromJson = this.listOfFilterFacetAdapter.fromJson(reader);
                    if (listFromJson == null) {
                        throw c.w("facets", "facets", reader);
                    }
                    i10 &= -2;
                    break;
                case 1:
                    listFromJson2 = this.listOfFilterGroupAdapter.fromJson(reader);
                    if (listFromJson2 == null) {
                        throw c.w("groups", "groups", reader);
                    }
                    i10 &= -3;
                    break;
                case 2:
                    listFromJson3 = this.listOfResultAdapter.fromJson(reader);
                    if (listFromJson3 == null) {
                        throw c.w("results", "results", reader);
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
                    strFromJson3 = this.nullableStringAdapter.fromJson(reader);
                    i10 &= -33;
                    break;
            }
        }
        reader.d();
        if (i10 != -64) {
            Constructor<SponsoredProductsResponseInner> declaredConstructor = this.constructorRef;
            if (declaredConstructor == null) {
                declaredConstructor = SponsoredProductsResponseInner.class.getDeclaredConstructor(List.class, List.class, List.class, String.class, String.class, String.class, Integer.TYPE, c.f134099c);
                this.constructorRef = declaredConstructor;
                Intrinsics.i(declaredConstructor, "also(...)");
            }
            SponsoredProductsResponseInner sponsoredProductsResponseInnerNewInstance = declaredConstructor.newInstance(listFromJson, listFromJson2, listFromJson3, strFromJson, strFromJson2, strFromJson3, Integer.valueOf(i10), null);
            Intrinsics.i(sponsoredProductsResponseInnerNewInstance, "newInstance(...)");
            return sponsoredProductsResponseInnerNewInstance;
        }
        Intrinsics.h(listFromJson, "null cannot be cast to non-null type kotlin.collections.List<io.constructor.data.model.common.FilterFacet>");
        Intrinsics.h(listFromJson2, "null cannot be cast to non-null type kotlin.collections.List<io.constructor.data.model.common.FilterGroup>");
        Intrinsics.h(listFromJson3, "null cannot be cast to non-null type kotlin.collections.List<io.constructor.data.model.common.Result>");
        String str = strFromJson3;
        String str2 = strFromJson2;
        String str3 = strFromJson;
        return new SponsoredProductsResponseInner(listFromJson, listFromJson2, listFromJson3, str3, str2, str);
    }

    @Override // com.squareup.moshi.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void toJson(q writer, SponsoredProductsResponseInner value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("facets");
        this.listOfFilterFacetAdapter.toJson(writer, (q) value_.a());
        writer.l("groups");
        this.listOfFilterGroupAdapter.toJson(writer, (q) value_.b());
        writer.l("results");
        this.listOfResultAdapter.toJson(writer, (q) value_.f());
        writer.l("onClickBeacon");
        this.nullableStringAdapter.toJson(writer, (q) value_.getOnClickBeacon());
        writer.l("onViewBeacon");
        this.nullableStringAdapter.toJson(writer, (q) value_.getOnViewBeacon());
        writer.l("onLoadBeacon");
        this.nullableStringAdapter.toJson(writer, (q) value_.getOnLoadBeacon());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(52);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SponsoredProductsResponseInner");
        sb2.append(')');
        return sb2.toString();
    }
}
