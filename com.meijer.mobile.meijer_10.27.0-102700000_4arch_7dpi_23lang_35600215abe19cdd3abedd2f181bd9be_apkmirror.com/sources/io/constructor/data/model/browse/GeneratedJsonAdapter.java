package io.constructor.data.model.browse;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import gu.c;
import io.constructor.data.model.common.FilterFacet;
import io.constructor.data.model.common.FilterGroup;
import io.constructor.data.model.common.FilterSortOption;
import io.constructor.data.model.common.RefinedContent;
import io.constructor.data.model.common.Result;
import io.constructor.data.model.common.ResultSources;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\"\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0019R\"\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0019R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lio/constructor/data/model/browse/BrowseResponseInnerJsonAdapter;", "Lcom/squareup/moshi/h;", "Lio/constructor/data/model/browse/BrowseResponseInner;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lio/constructor/data/model/browse/BrowseResponseInner;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/q;Lio/constructor/data/model/browse/BrowseResponseInner;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "Lio/constructor/data/model/browse/Collection;", "nullableCollectionAdapter", "Lcom/squareup/moshi/h;", "", "Lio/constructor/data/model/common/FilterFacet;", "nullableListOfFilterFacetAdapter", "Lio/constructor/data/model/common/FilterGroup;", "nullableListOfFilterGroupAdapter", "Lio/constructor/data/model/common/Result;", "nullableListOfResultAdapter", "Lio/constructor/data/model/common/FilterSortOption;", "nullableListOfFilterSortOptionAdapter", "", "intAdapter", "Lio/constructor/data/model/common/ResultSources;", "nullableResultSourcesAdapter", "Lio/constructor/data/model/common/RefinedContent;", "nullableListOfRefinedContentAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: io.constructor.data.model.browse.BrowseResponseInnerJsonAdapter, reason: from toString */
/* loaded from: classes7.dex */
public final class GeneratedJsonAdapter extends h<BrowseResponseInner> {
    private volatile Constructor<BrowseResponseInner> constructorRef;
    private final h<Integer> intAdapter;
    private final h<Collection> nullableCollectionAdapter;
    private final h<List<FilterFacet>> nullableListOfFilterFacetAdapter;
    private final h<List<FilterGroup>> nullableListOfFilterGroupAdapter;
    private final h<List<FilterSortOption>> nullableListOfFilterSortOptionAdapter;
    private final h<List<RefinedContent>> nullableListOfRefinedContentAdapter;
    private final h<List<Result>> nullableListOfResultAdapter;
    private final h<ResultSources> nullableResultSourcesAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("collection", "facets", "groups", "results", "sort_options", "total_num_results", "result_sources", "refined_content");
        Intrinsics.i(bVarA, "of(\"collection\", \"facets…rces\", \"refined_content\")");
        this.options = bVarA;
        h<Collection> hVarF = moshi.f(Collection.class, SetsKt.e(), "collection");
        Intrinsics.i(hVarF, "moshi.adapter(Collection…emptySet(), \"collection\")");
        this.nullableCollectionAdapter = hVarF;
        h<List<FilterFacet>> hVarF2 = moshi.f(x.j(List.class, FilterFacet.class), SetsKt.e(), "facets");
        Intrinsics.i(hVarF2, "moshi.adapter(Types.newP…    emptySet(), \"facets\")");
        this.nullableListOfFilterFacetAdapter = hVarF2;
        h<List<FilterGroup>> hVarF3 = moshi.f(x.j(List.class, FilterGroup.class), SetsKt.e(), "groups");
        Intrinsics.i(hVarF3, "moshi.adapter(Types.newP…    emptySet(), \"groups\")");
        this.nullableListOfFilterGroupAdapter = hVarF3;
        h<List<Result>> hVarF4 = moshi.f(x.j(List.class, Result.class), SetsKt.e(), "results");
        Intrinsics.i(hVarF4, "moshi.adapter(Types.newP…tySet(),\n      \"results\")");
        this.nullableListOfResultAdapter = hVarF4;
        h<List<FilterSortOption>> hVarF5 = moshi.f(x.j(List.class, FilterSortOption.class), SetsKt.e(), "filterSortOptions");
        Intrinsics.i(hVarF5, "moshi.adapter(Types.newP…t(), \"filterSortOptions\")");
        this.nullableListOfFilterSortOptionAdapter = hVarF5;
        h<Integer> hVarF6 = moshi.f(Integer.TYPE, SetsKt.e(), "resultCount");
        Intrinsics.i(hVarF6, "moshi.adapter(Int::class…t(),\n      \"resultCount\")");
        this.intAdapter = hVarF6;
        h<ResultSources> hVarF7 = moshi.f(ResultSources.class, SetsKt.e(), "resultSources");
        Intrinsics.i(hVarF7, "moshi.adapter(ResultSour…tySet(), \"resultSources\")");
        this.nullableResultSourcesAdapter = hVarF7;
        h<List<RefinedContent>> hVarF8 = moshi.f(x.j(List.class, RefinedContent.class), SetsKt.e(), "refinedContent");
        Intrinsics.i(hVarF8, "moshi.adapter(Types.newP…ySet(), \"refinedContent\")");
        this.nullableListOfRefinedContentAdapter = hVarF8;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public BrowseResponseInner fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        int i10 = -1;
        Collection collectionFromJson = null;
        List<FilterFacet> listFromJson = null;
        List<FilterGroup> listFromJson2 = null;
        List<Result> listFromJson3 = null;
        List<FilterSortOption> listFromJson4 = null;
        Integer numFromJson = null;
        ResultSources resultSourcesFromJson = null;
        List<RefinedContent> listFromJson5 = null;
        while (reader.hasNext()) {
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    break;
                case 0:
                    collectionFromJson = this.nullableCollectionAdapter.fromJson(reader);
                    break;
                case 1:
                    listFromJson = this.nullableListOfFilterFacetAdapter.fromJson(reader);
                    break;
                case 2:
                    listFromJson2 = this.nullableListOfFilterGroupAdapter.fromJson(reader);
                    break;
                case 3:
                    listFromJson3 = this.nullableListOfResultAdapter.fromJson(reader);
                    break;
                case 4:
                    listFromJson4 = this.nullableListOfFilterSortOptionAdapter.fromJson(reader);
                    i10 = -17;
                    break;
                case 5:
                    numFromJson = this.intAdapter.fromJson(reader);
                    if (numFromJson == null) {
                        JsonDataException jsonDataExceptionW = c.w("resultCount", "total_num_results", reader);
                        Intrinsics.i(jsonDataExceptionW, "unexpectedNull(\"resultCo…tal_num_results\", reader)");
                        throw jsonDataExceptionW;
                    }
                    break;
                case 6:
                    resultSourcesFromJson = this.nullableResultSourcesAdapter.fromJson(reader);
                    break;
                case 7:
                    listFromJson5 = this.nullableListOfRefinedContentAdapter.fromJson(reader);
                    break;
            }
        }
        reader.d();
        if (i10 == -17) {
            Integer num = numFromJson;
            List<FilterSortOption> list = listFromJson4;
            List<Result> list2 = listFromJson3;
            List<FilterGroup> list3 = listFromJson2;
            List<FilterFacet> list4 = listFromJson;
            Collection collection = collectionFromJson;
            if (num != null) {
                return new BrowseResponseInner(collection, list4, list3, list2, list, num.intValue(), resultSourcesFromJson, listFromJson5);
            }
            JsonDataException jsonDataExceptionO = c.o("resultCount", "total_num_results", reader);
            Intrinsics.i(jsonDataExceptionO, "missingProperty(\"resultC…tal_num_results\", reader)");
            throw jsonDataExceptionO;
        }
        List<FilterFacet> list5 = listFromJson;
        Collection collection2 = collectionFromJson;
        List<FilterSortOption> list6 = listFromJson4;
        List<Result> list7 = listFromJson3;
        List<FilterGroup> list8 = listFromJson2;
        List<RefinedContent> list9 = listFromJson5;
        ResultSources resultSources = resultSourcesFromJson;
        Constructor<BrowseResponseInner> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class<?> cls = c.f134099c;
            Class cls2 = Integer.TYPE;
            declaredConstructor = BrowseResponseInner.class.getDeclaredConstructor(Collection.class, List.class, List.class, List.class, List.class, cls2, ResultSources.class, List.class, cls2, cls);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "BrowseResponseInner::cla…his.constructorRef = it }");
        }
        Constructor<BrowseResponseInner> constructor = declaredConstructor;
        if (numFromJson != null) {
            BrowseResponseInner browseResponseInnerNewInstance = constructor.newInstance(collection2, list5, list8, list7, list6, numFromJson, resultSources, list9, Integer.valueOf(i10), null);
            Intrinsics.i(browseResponseInnerNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return browseResponseInnerNewInstance;
        }
        JsonDataException jsonDataExceptionO2 = c.o("resultCount", "total_num_results", reader);
        Intrinsics.i(jsonDataExceptionO2, "missingProperty(\"resultC…tal_num_results\", reader)");
        throw jsonDataExceptionO2;
    }

    @Override // com.squareup.moshi.h
    public void toJson(q writer, BrowseResponseInner value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("collection");
        this.nullableCollectionAdapter.toJson(writer, (q) value_.getCollection());
        writer.l("facets");
        this.nullableListOfFilterFacetAdapter.toJson(writer, (q) value_.getFacets());
        writer.l("groups");
        this.nullableListOfFilterGroupAdapter.toJson(writer, (q) value_.getGroups());
        writer.l("results");
        this.nullableListOfResultAdapter.toJson(writer, (q) value_.getResults());
        writer.l("sort_options");
        this.nullableListOfFilterSortOptionAdapter.toJson(writer, (q) value_.getFilterSortOptions());
        writer.l("total_num_results");
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getResultCount()));
        writer.l("result_sources");
        this.nullableResultSourcesAdapter.toJson(writer, (q) value_.getResultSources());
        writer.l("refined_content");
        this.nullableListOfRefinedContentAdapter.toJson(writer, (q) value_.getRefinedContent());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("BrowseResponseInner");
        sb2.append(')');
        String string = sb2.toString();
        Intrinsics.i(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
