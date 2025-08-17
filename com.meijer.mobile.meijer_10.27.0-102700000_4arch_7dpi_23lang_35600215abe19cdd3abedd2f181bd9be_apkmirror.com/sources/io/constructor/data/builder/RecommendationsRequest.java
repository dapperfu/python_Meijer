package io.constructor.data.builder;

import io.constructor.data.builder.RecommendationsRequest;
import io.constructor.data.model.common.VariationsMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004By\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0018\u00010\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0012R%\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lio/constructor/data/builder/RecommendationsRequest;", "", "builder", "Lio/constructor/data/builder/RecommendationsRequest$Builder;", "(Lio/constructor/data/builder/RecommendationsRequest$Builder;)V", "podId", "", "filters", "", "", "itemIds", "term", "numResults", "", "section", "variationsMap", "Lio/constructor/data/model/common/VariationsMap;", "preFilterExpression", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lio/constructor/data/model/common/VariationsMap;Ljava/lang/String;)V", "getFilters", "()Ljava/util/Map;", "getItemIds", "()Ljava/util/List;", "getNumResults", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPodId", "()Ljava/lang/String;", "getPreFilterExpression", "getSection", "getTerm", "getVariationsMap", "()Lio/constructor/data/model/common/VariationsMap;", "Builder", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class RecommendationsRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<String, List<String>> filters;
    private final List<String> itemIds;
    private final Integer numResults;
    private final String podId;
    private final String preFilterExpression;
    private final String section;
    private final String term;
    private final VariationsMap variationsMap;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010)\u001a\u00020*J \u0010\n\u001a\u00020\u00002\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u0006J\u0014\u0010\u000f\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0003J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0003J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0003J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$R.\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0019\"\u0004\b\u001c\u0010\u0004R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lio/constructor/data/builder/RecommendationsRequest$Builder;", "", "podId", "", "(Ljava/lang/String;)V", "filters", "", "", "getFilters", "()Ljava/util/Map;", "setFilters", "(Ljava/util/Map;)V", "itemIds", "getItemIds", "()Ljava/util/List;", "setItemIds", "(Ljava/util/List;)V", "numResults", "", "getNumResults", "()Ljava/lang/Integer;", "setNumResults", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPodId", "()Ljava/lang/String;", "preFilterExpression", "getPreFilterExpression", "setPreFilterExpression", "section", "getSection", "setSection", "term", "getTerm", "setTerm", "variationsMap", "Lio/constructor/data/model/common/VariationsMap;", "getVariationsMap", "()Lio/constructor/data/model/common/VariationsMap;", "setVariationsMap", "(Lio/constructor/data/model/common/VariationsMap;)V", "build", "Lio/constructor/data/builder/RecommendationsRequest;", "facets", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder {
        private Map<String, ? extends List<String>> filters;
        private List<String> itemIds;
        private Integer numResults;
        private final String podId;
        private String preFilterExpression;
        private String section;
        private String term;
        private VariationsMap variationsMap;

        /* renamed from: setFilters, reason: collision with other method in class */
        public final void m133setFilters(Map<String, ? extends List<String>> map) {
            this.filters = map;
        }

        /* renamed from: setItemIds, reason: collision with other method in class */
        public final void m134setItemIds(List<String> list) {
            this.itemIds = list;
        }

        public final void setNumResults(Integer num) {
            this.numResults = num;
        }

        /* renamed from: setPreFilterExpression, reason: collision with other method in class */
        public final void m135setPreFilterExpression(String str) {
            this.preFilterExpression = str;
        }

        /* renamed from: setSection, reason: collision with other method in class */
        public final void m136setSection(String str) {
            this.section = str;
        }

        /* renamed from: setTerm, reason: collision with other method in class */
        public final void m137setTerm(String str) {
            this.term = str;
        }

        /* renamed from: setVariationsMap, reason: collision with other method in class */
        public final void m138setVariationsMap(VariationsMap variationsMap) {
            this.variationsMap = variationsMap;
        }

        public Builder(String podId) {
            Intrinsics.j(podId, "podId");
            this.podId = podId;
        }

        public final RecommendationsRequest build() {
            return new RecommendationsRequest(this, null);
        }

        public final Map<String, List<String>> getFilters() {
            return this.filters;
        }

        public final List<String> getItemIds() {
            return this.itemIds;
        }

        public final Integer getNumResults() {
            return this.numResults;
        }

        public final String getPodId() {
            return this.podId;
        }

        public final String getPreFilterExpression() {
            return this.preFilterExpression;
        }

        public final String getSection() {
            return this.section;
        }

        public final String getTerm() {
            return this.term;
        }

        public final VariationsMap getVariationsMap() {
            return this.variationsMap;
        }

        public final Builder setFilters(Map<String, ? extends List<String>> facets) {
            Intrinsics.j(facets, "facets");
            m133setFilters(facets);
            return this;
        }

        public final Builder setItemIds(List<String> itemIds) {
            Intrinsics.j(itemIds, "itemIds");
            m134setItemIds(itemIds);
            return this;
        }

        public final Builder setNumResults(int numResults) {
            setNumResults(Integer.valueOf(numResults));
            return this;
        }

        public final Builder setPreFilterExpression(String preFilterExpression) {
            Intrinsics.j(preFilterExpression, "preFilterExpression");
            m135setPreFilterExpression(preFilterExpression);
            return this;
        }

        public final Builder setSection(String section) {
            Intrinsics.j(section, "section");
            m136setSection(section);
            return this;
        }

        public final Builder setTerm(String term) {
            Intrinsics.j(term, "term");
            m137setTerm(term);
            return this;
        }

        public final Builder setVariationsMap(VariationsMap variationsMap) {
            Intrinsics.j(variationsMap, "variationsMap");
            m138setVariationsMap(variationsMap);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"Lio/constructor/data/builder/RecommendationsRequest$Companion;", "", "()V", "build", "Lio/constructor/data/builder/RecommendationsRequest;", "term", "", "block", "Lkotlin/Function1;", "Lio/constructor/data/builder/RecommendationsRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ RecommendationsRequest build$default(Companion companion, String term, Function1 block, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                block = new Function1<Builder, Unit>() { // from class: io.constructor.data.builder.RecommendationsRequest$Companion$build$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(RecommendationsRequest.Builder builder) {
                        Intrinsics.j(builder, "$this$null");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(RecommendationsRequest.Builder builder) {
                        invoke2(builder);
                        return Unit.f142422a;
                    }
                };
            }
            Intrinsics.j(term, "term");
            Intrinsics.j(block, "block");
            Builder builder = new Builder(term);
            block.invoke(builder);
            return builder.build();
        }

        public final RecommendationsRequest build(String term, Function1<? super Builder, Unit> block) {
            Intrinsics.j(term, "term");
            Intrinsics.j(block, "block");
            Builder builder = new Builder(term);
            block.invoke(builder);
            return builder.build();
        }
    }

    public /* synthetic */ RecommendationsRequest(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RecommendationsRequest(String podId, Map<String, ? extends List<String>> map, List<String> list, String str, Integer num, String str2, VariationsMap variationsMap, String str3) {
        Intrinsics.j(podId, "podId");
        this.podId = podId;
        this.filters = map;
        this.itemIds = list;
        this.term = str;
        this.numResults = num;
        this.section = str2;
        this.variationsMap = variationsMap;
        this.preFilterExpression = str3;
    }

    public final Map<String, List<String>> getFilters() {
        return this.filters;
    }

    public final List<String> getItemIds() {
        return this.itemIds;
    }

    public final Integer getNumResults() {
        return this.numResults;
    }

    public final String getPodId() {
        return this.podId;
    }

    public final String getPreFilterExpression() {
        return this.preFilterExpression;
    }

    public final String getSection() {
        return this.section;
    }

    public final String getTerm() {
        return this.term;
    }

    public final VariationsMap getVariationsMap() {
        return this.variationsMap;
    }

    public /* synthetic */ RecommendationsRequest(String str, Map map, List list, String str2, Integer num, String str3, VariationsMap variationsMap, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : map, (i10 & 4) != 0 ? null : list, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : num, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : variationsMap, (i10 & 128) != 0 ? null : str4);
    }

    private RecommendationsRequest(Builder builder) {
        this(builder.getPodId(), builder.getFilters(), builder.getItemIds(), builder.getTerm(), builder.getNumResults(), builder.getSection(), builder.getVariationsMap(), builder.getPreFilterExpression());
    }
}
