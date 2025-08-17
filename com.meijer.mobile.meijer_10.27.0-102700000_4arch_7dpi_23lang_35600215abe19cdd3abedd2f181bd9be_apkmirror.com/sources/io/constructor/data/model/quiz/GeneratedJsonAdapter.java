package io.constructor.data.model.quiz;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import com.squareup.moshi.t;
import com.squareup.moshi.x;
import gu.c;
import io.constructor.data.model.common.Feature;
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

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\"\u0010\u001e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001aR\"\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001aR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001aR\"\u0010$\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020#\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001aR\"\u0010&\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020%\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001aR\u001c\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010'0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001aR\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lio/constructor/data/model/quiz/QuizResultsResponseInnerJsonAdapter;", "Lcom/squareup/moshi/h;", "Lio/constructor/data/model/quiz/QuizResultsResponseInner;", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lcom/squareup/moshi/t;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Lio/constructor/data/model/quiz/QuizResultsResponseInner;", "Lcom/squareup/moshi/q;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/q;Lio/constructor/data/model/quiz/QuizResultsResponseInner;)V", "Lcom/squareup/moshi/k$b;", "options", "Lcom/squareup/moshi/k$b;", "", "Lio/constructor/data/model/common/FilterFacet;", "nullableListOfFilterFacetAdapter", "Lcom/squareup/moshi/h;", "Lio/constructor/data/model/common/FilterGroup;", "nullableListOfFilterGroupAdapter", "Lio/constructor/data/model/common/Result;", "nullableListOfResultAdapter", "Lio/constructor/data/model/common/FilterSortOption;", "nullableListOfFilterSortOptionAdapter", "", "intAdapter", "Lio/constructor/data/model/common/RefinedContent;", "nullableListOfRefinedContentAdapter", "Lio/constructor/data/model/common/Feature;", "nullableListOfFeatureAdapter", "Lio/constructor/data/model/common/ResultSources;", "nullableResultSourcesAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: io.constructor.data.model.quiz.QuizResultsResponseInnerJsonAdapter, reason: from toString */
/* loaded from: classes7.dex */
public final class GeneratedJsonAdapter extends h<QuizResultsResponseInner> {
    private volatile Constructor<QuizResultsResponseInner> constructorRef;
    private final h<Integer> intAdapter;
    private final h<List<Feature>> nullableListOfFeatureAdapter;
    private final h<List<FilterFacet>> nullableListOfFilterFacetAdapter;
    private final h<List<FilterGroup>> nullableListOfFilterGroupAdapter;
    private final h<List<FilterSortOption>> nullableListOfFilterSortOptionAdapter;
    private final h<List<RefinedContent>> nullableListOfRefinedContentAdapter;
    private final h<List<Result>> nullableListOfResultAdapter;
    private final h<ResultSources> nullableResultSourcesAdapter;
    private final k.b options;

    public GeneratedJsonAdapter(t moshi) {
        Intrinsics.j(moshi, "moshi");
        k.b bVarA = k.b.a("facets", "groups", "results", "sort_options", "total_num_results", "refined_content", "features", "result_sources");
        Intrinsics.i(bVarA, "of(\"facets\", \"groups\", \"…tures\", \"result_sources\")");
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
        h<Integer> hVarF5 = moshi.f(Integer.TYPE, SetsKt.e(), "resultCount");
        Intrinsics.i(hVarF5, "moshi.adapter(Int::class…t(),\n      \"resultCount\")");
        this.intAdapter = hVarF5;
        h<List<RefinedContent>> hVarF6 = moshi.f(x.j(List.class, RefinedContent.class), SetsKt.e(), "refinedContent");
        Intrinsics.i(hVarF6, "moshi.adapter(Types.newP…ySet(), \"refinedContent\")");
        this.nullableListOfRefinedContentAdapter = hVarF6;
        h<List<Feature>> hVarF7 = moshi.f(x.j(List.class, Feature.class), SetsKt.e(), "features");
        Intrinsics.i(hVarF7, "moshi.adapter(Types.newP…ySet(),\n      \"features\")");
        this.nullableListOfFeatureAdapter = hVarF7;
        h<ResultSources> hVarF8 = moshi.f(ResultSources.class, SetsKt.e(), "resultSources");
        Intrinsics.i(hVarF8, "moshi.adapter(ResultSour…tySet(), \"resultSources\")");
        this.nullableResultSourcesAdapter = hVarF8;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.moshi.h
    public QuizResultsResponseInner fromJson(k reader) throws IllegalAccessException, NoSuchMethodException, InstantiationException, IOException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(reader, "reader");
        reader.b();
        int i10 = -1;
        List<FilterFacet> listFromJson = null;
        List<FilterGroup> listFromJson2 = null;
        List<Result> listFromJson3 = null;
        List<FilterSortOption> listFromJson4 = null;
        Integer numFromJson = null;
        List<RefinedContent> listFromJson5 = null;
        List<Feature> listFromJson6 = null;
        ResultSources resultSourcesFromJson = null;
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
                    numFromJson = this.intAdapter.fromJson(reader);
                    if (numFromJson == null) {
                        JsonDataException jsonDataExceptionW = c.w("resultCount", "total_num_results", reader);
                        Intrinsics.i(jsonDataExceptionW, "unexpectedNull(\"resultCo…tal_num_results\", reader)");
                        throw jsonDataExceptionW;
                    }
                    break;
                case 5:
                    listFromJson5 = this.nullableListOfRefinedContentAdapter.fromJson(reader);
                    break;
                case 6:
                    listFromJson6 = this.nullableListOfFeatureAdapter.fromJson(reader);
                    break;
                case 7:
                    resultSourcesFromJson = this.nullableResultSourcesAdapter.fromJson(reader);
                    break;
            }
        }
        reader.d();
        if (i10 == -9) {
            Integer num = numFromJson;
            List<FilterSortOption> list = listFromJson4;
            List<Result> list2 = listFromJson3;
            List<FilterGroup> list3 = listFromJson2;
            List<FilterFacet> list4 = listFromJson;
            if (num == null) {
                JsonDataException jsonDataExceptionO = c.o("resultCount", "total_num_results", reader);
                Intrinsics.i(jsonDataExceptionO, "missingProperty(\"resultC…tal_num_results\", reader)");
                throw jsonDataExceptionO;
            }
            ResultSources resultSources = resultSourcesFromJson;
            return new QuizResultsResponseInner(list4, list3, list2, list, num.intValue(), listFromJson5, listFromJson6, resultSources);
        }
        List<FilterGroup> list5 = listFromJson2;
        List<FilterFacet> list6 = listFromJson;
        List<FilterSortOption> list7 = listFromJson4;
        List<Result> list8 = listFromJson3;
        ResultSources resultSources2 = resultSourcesFromJson;
        List<Feature> list9 = listFromJson6;
        List<RefinedContent> list10 = listFromJson5;
        Constructor<QuizResultsResponseInner> declaredConstructor = this.constructorRef;
        if (declaredConstructor == null) {
            Class<?> cls = c.f134099c;
            Class cls2 = Integer.TYPE;
            declaredConstructor = QuizResultsResponseInner.class.getDeclaredConstructor(List.class, List.class, List.class, List.class, cls2, List.class, List.class, ResultSources.class, cls2, cls);
            this.constructorRef = declaredConstructor;
            Intrinsics.i(declaredConstructor, "QuizResultsResponseInner…his.constructorRef = it }");
        }
        Constructor<QuizResultsResponseInner> constructor = declaredConstructor;
        if (numFromJson != null) {
            QuizResultsResponseInner quizResultsResponseInnerNewInstance = constructor.newInstance(list6, list5, list8, list7, numFromJson, list10, list9, resultSources2, Integer.valueOf(i10), null);
            Intrinsics.i(quizResultsResponseInnerNewInstance, "localConstructor.newInst…torMarker */ null\n      )");
            return quizResultsResponseInnerNewInstance;
        }
        JsonDataException jsonDataExceptionO2 = c.o("resultCount", "total_num_results", reader);
        Intrinsics.i(jsonDataExceptionO2, "missingProperty(\"resultC…tal_num_results\", reader)");
        throw jsonDataExceptionO2;
    }

    @Override // com.squareup.moshi.h
    public void toJson(q writer, QuizResultsResponseInner value_) throws IOException {
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
        this.intAdapter.toJson(writer, (q) Integer.valueOf(value_.getResultCount()));
        writer.l("refined_content");
        this.nullableListOfRefinedContentAdapter.toJson(writer, (q) value_.getRefinedContent());
        writer.l("features");
        this.nullableListOfFeatureAdapter.toJson(writer, (q) value_.getFeatures());
        writer.l("result_sources");
        this.nullableResultSourcesAdapter.toJson(writer, (q) value_.getResultSources());
        writer.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(46);
        sb2.append("GeneratedJsonAdapter(");
        sb2.append("QuizResultsResponseInner");
        sb2.append(')');
        String string = sb2.toString();
        Intrinsics.i(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
