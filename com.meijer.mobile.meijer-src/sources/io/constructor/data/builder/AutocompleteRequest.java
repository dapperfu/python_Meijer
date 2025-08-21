package io.constructor.data.builder;

import io.constructor.data.builder.AutocompleteRequest;
import io.constructor.data.model.common.VariationsMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u008b\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0018\u00010\b\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012(\b\u0002\u0010\u000f\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\b\u0018\u00010\b¢\u0006\u0002\u0010\u0010R%\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R1\u0010\u000f\u001a\"\u0012\u0004\u0012\u00020\u0006\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\t0\b\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lio/constructor/data/builder/AutocompleteRequest;", "", "builder", "Lio/constructor/data/builder/AutocompleteRequest$Builder;", "(Lio/constructor/data/builder/AutocompleteRequest$Builder;)V", "term", "", "filters", "", "", "numResultsPerSection", "", "hiddenFields", "variationsMap", "Lio/constructor/data/model/common/VariationsMap;", "sectionFilters", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Lio/constructor/data/model/common/VariationsMap;Ljava/util/Map;)V", "getFilters", "()Ljava/util/Map;", "getHiddenFields", "()Ljava/util/List;", "getNumResultsPerSection", "getSectionFilters", "getTerm", "()Ljava/lang/String;", "getVariationsMap", "()Lio/constructor/data/model/common/VariationsMap;", "Builder", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class AutocompleteRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<String, List<String>> filters;
    private final List<String> hiddenFields;
    private final Map<String, Integer> numResultsPerSection;
    private final Map<String, Map<String, List<String>>> sectionFilters;
    private final String term;
    private final VariationsMap variationsMap;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010 \u001a\u00020!J \u0010\n\u001a\u00020\u00002\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u0006J\u0014\u0010\u000f\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007J\u001a\u0010\u0014\u001a\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u0006J.\u0010\u0017\u001a\u00020\u00002&\u0010\u0015\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u0006\u0018\u00010\u0006J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bR.\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0007\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR:\u0010\u0015\u001a\"\u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00070\u0006\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lio/constructor/data/builder/AutocompleteRequest$Builder;", "", "term", "", "(Ljava/lang/String;)V", "filters", "", "", "getFilters", "()Ljava/util/Map;", "setFilters", "(Ljava/util/Map;)V", "hiddenFields", "getHiddenFields", "()Ljava/util/List;", "setHiddenFields", "(Ljava/util/List;)V", "numResultsPerSection", "", "getNumResultsPerSection", "setNumResultsPerSection", "sectionFilters", "getSectionFilters", "setSectionFilters", "getTerm", "()Ljava/lang/String;", "variationsMap", "Lio/constructor/data/model/common/VariationsMap;", "getVariationsMap", "()Lio/constructor/data/model/common/VariationsMap;", "setVariationsMap", "(Lio/constructor/data/model/common/VariationsMap;)V", "build", "Lio/constructor/data/builder/AutocompleteRequest;", "facets", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder {
        private Map<String, ? extends List<String>> filters;
        private List<String> hiddenFields;
        private Map<String, Integer> numResultsPerSection;
        private Map<String, ? extends Map<String, ? extends List<String>>> sectionFilters;
        private final String term;
        private VariationsMap variationsMap;

        /* renamed from: setFilters, reason: collision with other method in class */
        public final void m105setFilters(Map<String, ? extends List<String>> map) {
            this.filters = map;
        }

        /* renamed from: setHiddenFields, reason: collision with other method in class */
        public final void m106setHiddenFields(List<String> list) {
            this.hiddenFields = list;
        }

        /* renamed from: setNumResultsPerSection, reason: collision with other method in class */
        public final void m107setNumResultsPerSection(Map<String, Integer> map) {
            this.numResultsPerSection = map;
        }

        /* renamed from: setSectionFilters, reason: collision with other method in class */
        public final void m108setSectionFilters(Map<String, ? extends Map<String, ? extends List<String>>> map) {
            this.sectionFilters = map;
        }

        /* renamed from: setVariationsMap, reason: collision with other method in class */
        public final void m109setVariationsMap(VariationsMap variationsMap) {
            this.variationsMap = variationsMap;
        }

        public Builder(String term) {
            Intrinsics.j(term, "term");
            this.term = term;
        }

        public final AutocompleteRequest build() {
            return new AutocompleteRequest(this, null);
        }

        public final Map<String, List<String>> getFilters() {
            return this.filters;
        }

        public final List<String> getHiddenFields() {
            return this.hiddenFields;
        }

        public final Map<String, Integer> getNumResultsPerSection() {
            return this.numResultsPerSection;
        }

        public final Map<String, Map<String, List<String>>> getSectionFilters() {
            return this.sectionFilters;
        }

        public final String getTerm() {
            return this.term;
        }

        public final VariationsMap getVariationsMap() {
            return this.variationsMap;
        }

        public final Builder setFilters(Map<String, ? extends List<String>> facets) {
            Intrinsics.j(facets, "facets");
            m105setFilters(facets);
            return this;
        }

        public final Builder setHiddenFields(List<String> hiddenFields) {
            Intrinsics.j(hiddenFields, "hiddenFields");
            m106setHiddenFields(hiddenFields);
            return this;
        }

        public final Builder setNumResultsPerSection(Map<String, Integer> numResultsPerSection) {
            Intrinsics.j(numResultsPerSection, "numResultsPerSection");
            m107setNumResultsPerSection(numResultsPerSection);
            return this;
        }

        public final Builder setSectionFilters(Map<String, ? extends Map<String, ? extends List<String>>> sectionFilters) {
            m108setSectionFilters(sectionFilters);
            return this;
        }

        public final Builder setVariationsMap(VariationsMap variationsMap) {
            Intrinsics.j(variationsMap, "variationsMap");
            m109setVariationsMap(variationsMap);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0002\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\f"}, d2 = {"Lio/constructor/data/builder/AutocompleteRequest$Companion;", "", "()V", "build", "Lio/constructor/data/builder/AutocompleteRequest;", "term", "", "block", "Lkotlin/Function1;", "Lio/constructor/data/builder/AutocompleteRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ AutocompleteRequest build$default(Companion companion, String term, Function1 block, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                block = new Function1<Builder, Unit>() { // from class: io.constructor.data.builder.AutocompleteRequest$Companion$build$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(AutocompleteRequest.Builder builder) {
                        Intrinsics.j(builder, "$this$null");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AutocompleteRequest.Builder builder) {
                        invoke2(builder);
                        return Unit.f143329a;
                    }
                };
            }
            Intrinsics.j(term, "term");
            Intrinsics.j(block, "block");
            Builder builder = new Builder(term);
            block.invoke(builder);
            return builder.build();
        }

        public final AutocompleteRequest build(String term, Function1<? super Builder, Unit> block) {
            Intrinsics.j(term, "term");
            Intrinsics.j(block, "block");
            Builder builder = new Builder(term);
            block.invoke(builder);
            return builder.build();
        }
    }

    public /* synthetic */ AutocompleteRequest(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AutocompleteRequest(String term, Map<String, ? extends List<String>> map, Map<String, Integer> map2, List<String> list, VariationsMap variationsMap, Map<String, ? extends Map<String, ? extends List<String>>> map3) {
        Intrinsics.j(term, "term");
        this.term = term;
        this.filters = map;
        this.numResultsPerSection = map2;
        this.hiddenFields = list;
        this.variationsMap = variationsMap;
        this.sectionFilters = map3;
    }

    public final Map<String, List<String>> getFilters() {
        return this.filters;
    }

    public final List<String> getHiddenFields() {
        return this.hiddenFields;
    }

    public final Map<String, Integer> getNumResultsPerSection() {
        return this.numResultsPerSection;
    }

    public final Map<String, Map<String, List<String>>> getSectionFilters() {
        return this.sectionFilters;
    }

    public final String getTerm() {
        return this.term;
    }

    public final VariationsMap getVariationsMap() {
        return this.variationsMap;
    }

    public /* synthetic */ AutocompleteRequest(String str, Map map, Map map2, List list, VariationsMap variationsMap, Map map3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i10 & 2) != 0 ? null : map, (i10 & 4) != 0 ? null : map2, (i10 & 8) != 0 ? null : list, (i10 & 16) != 0 ? null : variationsMap, (i10 & 32) != 0 ? null : map3);
    }

    private AutocompleteRequest(Builder builder) {
        this(builder.getTerm(), builder.getFilters(), builder.getNumResultsPerSection(), builder.getHiddenFields(), builder.getVariationsMap(), builder.getSectionFilters());
    }
}
