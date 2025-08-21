package io.constructor.data.model.search;

import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import gu.C14410c;
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

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001aR\u001c\u0010&\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001aR\"\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001aR\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lio/constructor/data/model/search/SearchResponseInnerJsonAdapter;", "Lcom/squareup/moshi/h;", "Lio/constructor/data/model/search/SearchResponseInner;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lio/constructor/data/model/search/SearchResponseInner;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/q;Lio/constructor/data/model/search/SearchResponseInner;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "Lio/constructor/data/model/common/FilterFacet;", "nullableListOfFilterFacetAdapter", "Lcom/squareup/moshi/h;", "Lio/constructor/data/model/common/FilterGroup;", "nullableListOfFilterGroupAdapter", "Lio/constructor/data/model/common/Result;", "nullableListOfResultAdapter", "Lio/constructor/data/model/common/FilterSortOption;", "nullableListOfFilterSortOptionAdapter", "", "nullableIntAdapter", "Lio/constructor/data/model/search/Redirect;", "nullableRedirectAdapter", "Lio/constructor/data/model/common/ResultSources;", "nullableResultSourcesAdapter", "Lio/constructor/data/model/common/RefinedContent;", "nullableListOfRefinedContentAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: io.constructor.data.model.search.SearchResponseInnerJsonAdapter, reason: from toString */
/* loaded from: classes8.dex */
public final class GeneratedJsonAdapter extends h<SearchResponseInner> {
    private volatile Constructor<SearchResponseInner> constructorRef;
    private final h<Integer> nullableIntAdapter;
    private final h<List<FilterFacet>> nullableListOfFilterFacetAdapter;
    private final h<List<FilterGroup>> nullableListOfFilterGroupAdapter;
    private final h<List<FilterSortOption>> nullableListOfFilterSortOptionAdapter;
    private final h<List<RefinedContent>> nullableListOfRefinedContentAdapter;
    private final h<List<Result>> nullableListOfResultAdapter;
    private final h<Redirect> nullableRedirectAdapter;
    private final h<ResultSources> nullableResultSourcesAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("facets", "groups", "results", "sort_options", "total_num_results", "redirect", "result_sources", "refined_content");
        Intrinsics.i(bVarA, "of(\"facets\", \"groups\", \"…rces\", \"refined_content\")");
        this.options = bVarA;
        h<List<FilterFacet>> hVarF = moshi.f(x.j(List.class, FilterFacet.class), SetsKt.e(), "facets");
        Intrinsics.i(hVarF, "moshi.adapter(Types.newP…    emptySet(), \"facets\")");
        this.nullableListOfFilterFacetAdapter = hVarF;
        h<List<FilterGroup>> hVarF2 = moshi.f(x.j(List.class, FilterGroup.class), SetsKt.e(), "groups");
        Intrinsics.i(hVarF2, "moshi.adapter(Types.newP…    emptySet(), \"groups\")");
        this.nullableListOfFilterGroupAdapter = hVarF2;
        h<List<Result>> hVarF3 = moshi.f(x.j(List.class, Result.class), SetsKt.e(), "results");
        Intrinsics.i(hVarF3, "moshi.adapter(Types.newP…tySet(),\n      \"results\")");
        this.nullableListOfResultAdapter = hVarF3;
        h<List<FilterSortOption>> hVarF4 = moshi.f(x.j(List.class, FilterSortOption.class), SetsKt.e(), "filterSortOptions");
        Intrinsics.i(hVarF4, "moshi.adapter(Types.newP…t(), \"filterSortOptions\")");
        this.nullableListOfFilterSortOptionAdapter = hVarF4;
        h<Integer> hVarF5 = moshi.f(Integer.class, SetsKt.e(), "resultCount");
        Intrinsics.i(hVarF5, "moshi.adapter(Int::class…mptySet(), \"resultCount\")");
        this.nullableIntAdapter = hVarF5;
        h<Redirect> hVarF6 = moshi.f(Redirect.class, SetsKt.e(), "redirect");
        Intrinsics.i(hVarF6, "moshi.adapter(Redirect::…  emptySet(), \"redirect\")");
        this.nullableRedirectAdapter = hVarF6;
        h<ResultSources> hVarF7 = moshi.f(ResultSources.class, SetsKt.e(), "resultSources");
        Intrinsics.i(hVarF7, "moshi.adapter(ResultSour…tySet(), \"resultSources\")");
        this.nullableResultSourcesAdapter = hVarF7;
        h<List<RefinedContent>> hVarF8 = moshi.f(x.j(List.class, RefinedContent.class), SetsKt.e(), "refinedContent");
        Intrinsics.i(hVarF8, "moshi.adapter(Types.newP…ySet(), \"refinedContent\")");
        this.nullableListOfRefinedContentAdapter = hVarF8;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public SearchResponseInner fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        int i10 = -1;
        List<FilterFacet> listFromJson = null;
        List<FilterGroup> listFromJson2 = null;
        List<Result> listFromJson3 = null;
        List<FilterSortOption> listFromJson4 = null;
        Integer numFromJson = null;
        Redirect redirectFromJson = null;
        ResultSources resultSourcesFromJson = null;
        List<RefinedContent> listFromJson5 = null;
        while (reader.hasNext()) {
            switch (reader.z(this.options)) {
                case -1:
                    reader.H();
                    reader.skipValue();
                    break;
                case 0:
                    listFromJson = this.nullableListOfFilterFacetAdapter.fromJson(reader);
                    break;
                case 1:
                    listFromJson2 = this.nullableListOfFilterGroupAdapter.fromJson(reader);
                    break;
                case 2:
                    listFromJson3 = this.nullableListOfResultAdapter.fromJson(reader);
                    break;
                case 3:
                    listFromJson4 = this.nullableListOfFilterSortOptionAdapter.fromJson(reader);
                    i10 = -9;
                    break;
                case 4:
                    numFromJson = this.nullableIntAdapter.fromJson(reader);
                    break;
                case 5:
                    redirectFromJson = this.nullableRedirectAdapter.fromJson(reader);
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
        if (i10 == -9) {
            List<RefinedContent> list = listFromJson5;
            ResultSources resultSources = resultSourcesFromJson;
            Redirect redirect = redirectFromJson;
            Integer num = numFromJson;
            List<FilterSortOption> list2 = listFromJson4;
            return new SearchResponseInner(listFromJson, listFromJson2, listFromJson3, list2, num, redirect, resultSources, list);
        }
        List<RefinedContent> list3 = listFromJson5;
        ResultSources resultSources2 = resultSourcesFromJson;
        Redirect redirect2 = redirectFromJson;
        Integer num2 = numFromJson;
        List<FilterSortOption> list4 = listFromJson4;
        List<Result> list5 = listFromJson3;
        List<FilterGroup> list6 = listFromJson2;
        List<FilterFacet> list7 = listFromJson;
        Constructor<SearchResponseInner> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            declaredConstructor = SearchResponseInner.class.getDeclaredConstructor(List.class, List.class, List.class, List.class, Integer.class, Redirect.class, ResultSources.class, List.class, Integer.TYPE, C14410c.f134472c);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "SearchResponseInner::cla…his.constructorRef = it }");
        }
        SearchResponseInner searchResponseInnerNewInstance = declaredConstructor.newInstance(list7, list6, list5, list4, num2, redirect2, resultSources2, list3, Integer.valueOf(i10), null);
        Intrinsics.i(searchResponseInnerNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
        return searchResponseInnerNewInstance;
    }

    @Override // com.squareup.moshi.h
    public void toJson(q writer, SearchResponseInner value_) throws IOException {
        Intrinsics.j(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.b();
        writer.l("facets");
        this.nullableListOfFilterFacetAdapter.toJson(writer, (q) value_.getFacets());
        writer.l("groups");
        this.nullableListOfFilterGroupAdapter.toJson(writer, (q) value_.getGroups());
        writer.l("results");
        this.nullableListOfResultAdapter.toJson(writer, (q) value_.getResults());
        writer.l("sort_options");
        this.nullableListOfFilterSortOptionAdapter.toJson(writer, (q) value_.getFilterSortOptions());
        writer.l("total_num_results");
        this.nullableIntAdapter.toJson(writer, (q) value_.getResultCount());
        writer.l("redirect");
        this.nullableRedirectAdapter.toJson(writer, (q) value_.getRedirect());
        writer.l("result_sources");
        this.nullableResultSourcesAdapter.toJson(writer, (q) value_.getResultSources());
        writer.l("refined_content");
        this.nullableListOfRefinedContentAdapter.toJson(writer, (q) value_.getRefinedContent());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(41);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("SearchResponseInner");
        sb2.append(')');
        String string = sb2.toString();
        Intrinsics.i(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
