package io.constructor.data.builder;

import androidx.recyclerview.widget.RecyclerView;
import io.constructor.data.builder.BrowseItemsRequest;
import io.constructor.data.model.common.VariationsMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u0000 ,2\u00020\u0001:\u0002+,B\u000f\b\u0012\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004BÁ\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0017R%\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0019\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010#\u001a\u0004\b$\u0010\"R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lio/constructor/data/builder/BrowseItemsRequest;", "", "builder", "Lio/constructor/data/builder/BrowseItemsRequest$Builder;", "(Lio/constructor/data/builder/BrowseItemsRequest$Builder;)V", "ids", "", "", "filters", "", "page", "", "perPage", "sortBy", "sortOrder", "section", "hiddenFields", "hiddenFacets", "groupsSortBy", "groupsSortOrder", "variationsMap", "Lio/constructor/data/model/common/VariationsMap;", "preFilterExpression", "(Ljava/util/List;Ljava/util/Map;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lio/constructor/data/model/common/VariationsMap;Ljava/lang/String;)V", "getFilters", "()Ljava/util/Map;", "getGroupsSortBy", "()Ljava/lang/String;", "getGroupsSortOrder", "getHiddenFacets", "()Ljava/util/List;", "getHiddenFields", "getIds", "getPage", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPerPage", "getPreFilterExpression", "getSection", "getSortBy", "getSortOrder", "getVariationsMap", "()Lio/constructor/data/model/common/VariationsMap;", "Builder", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class BrowseItemsRequest {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Map<String, List<String>> filters;
    private final String groupsSortBy;
    private final String groupsSortOrder;
    private final List<String> hiddenFacets;
    private final List<String> hiddenFields;
    private final List<String> ids;
    private final Integer page;
    private final Integer perPage;
    private final String preFilterExpression;
    private final String section;
    private final String sortBy;
    private final String sortOrder;
    private final VariationsMap variationsMap;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u00108\u001a\u000209J \u0010\n\u001a\u00020\u00002\u0018\u0010:\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0007J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0004J\u0014\u0010\u0017\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0014\u0010\u001a\u001a\u00020\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010%\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u001dJ\u000e\u0010(\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u0004J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010)\u001a\u00020\u0004J\u000e\u0010.\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0004J\u000e\u00101\u001a\u00020\u00002\u0006\u0010/\u001a\u00020\u0004J\u000e\u00106\u001a\u00020\u00002\u0006\u00102\u001a\u000203R.\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0005R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010#\u001a\u0004\u0018\u00010\u001dX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\"\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\u001c\u0010&\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\u0010R\u001c\u0010)\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010\u0010R\u001c\u0010,\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u000e\"\u0004\b.\u0010\u0010R\u001c\u0010/\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u000e\"\u0004\b1\u0010\u0010R\u001c\u00102\u001a\u0004\u0018\u000103X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006;"}, d2 = {"Lio/constructor/data/builder/BrowseItemsRequest$Builder;", "", "ids", "", "", "(Ljava/util/List;)V", "filters", "", "getFilters", "()Ljava/util/Map;", "setFilters", "(Ljava/util/Map;)V", "groupsSortBy", "getGroupsSortBy", "()Ljava/lang/String;", "setGroupsSortBy", "(Ljava/lang/String;)V", "groupsSortOrder", "getGroupsSortOrder", "setGroupsSortOrder", "hiddenFacets", "getHiddenFacets", "()Ljava/util/List;", "setHiddenFacets", "hiddenFields", "getHiddenFields", "setHiddenFields", "getIds", "page", "", "getPage", "()Ljava/lang/Integer;", "setPage", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "perPage", "getPerPage", "setPerPage", "preFilterExpression", "getPreFilterExpression", "setPreFilterExpression", "section", "getSection", "setSection", "sortBy", "getSortBy", "setSortBy", "sortOrder", "getSortOrder", "setSortOrder", "variationsMap", "Lio/constructor/data/model/common/VariationsMap;", "getVariationsMap", "()Lio/constructor/data/model/common/VariationsMap;", "setVariationsMap", "(Lio/constructor/data/model/common/VariationsMap;)V", "build", "Lio/constructor/data/builder/BrowseItemsRequest;", "facets", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Builder {
        private Map<String, ? extends List<String>> filters;
        private String groupsSortBy;
        private String groupsSortOrder;
        private List<String> hiddenFacets;
        private List<String> hiddenFields;
        private final List<String> ids;
        private Integer page;
        private Integer perPage;
        private String preFilterExpression;
        private String section;
        private String sortBy;
        private String sortOrder;
        private VariationsMap variationsMap;

        /* renamed from: setFilters, reason: collision with other method in class */
        public final void m111setFilters(Map<String, ? extends List<String>> map) {
            this.filters = map;
        }

        /* renamed from: setGroupsSortBy, reason: collision with other method in class */
        public final void m112setGroupsSortBy(String str) {
            this.groupsSortBy = str;
        }

        /* renamed from: setGroupsSortOrder, reason: collision with other method in class */
        public final void m113setGroupsSortOrder(String str) {
            this.groupsSortOrder = str;
        }

        /* renamed from: setHiddenFacets, reason: collision with other method in class */
        public final void m114setHiddenFacets(List<String> list) {
            this.hiddenFacets = list;
        }

        /* renamed from: setHiddenFields, reason: collision with other method in class */
        public final void m115setHiddenFields(List<String> list) {
            this.hiddenFields = list;
        }

        public final void setPage(Integer num) {
            this.page = num;
        }

        public final void setPerPage(Integer num) {
            this.perPage = num;
        }

        /* renamed from: setPreFilterExpression, reason: collision with other method in class */
        public final void m116setPreFilterExpression(String str) {
            this.preFilterExpression = str;
        }

        /* renamed from: setSection, reason: collision with other method in class */
        public final void m117setSection(String str) {
            this.section = str;
        }

        /* renamed from: setSortBy, reason: collision with other method in class */
        public final void m118setSortBy(String str) {
            this.sortBy = str;
        }

        /* renamed from: setSortOrder, reason: collision with other method in class */
        public final void m119setSortOrder(String str) {
            this.sortOrder = str;
        }

        /* renamed from: setVariationsMap, reason: collision with other method in class */
        public final void m120setVariationsMap(VariationsMap variationsMap) {
            this.variationsMap = variationsMap;
        }

        public Builder(List<String> ids) {
            Intrinsics.j(ids, "ids");
            this.ids = ids;
        }

        public final BrowseItemsRequest build() {
            return new BrowseItemsRequest(this, null);
        }

        public final Map<String, List<String>> getFilters() {
            return this.filters;
        }

        public final String getGroupsSortBy() {
            return this.groupsSortBy;
        }

        public final String getGroupsSortOrder() {
            return this.groupsSortOrder;
        }

        public final List<String> getHiddenFacets() {
            return this.hiddenFacets;
        }

        public final List<String> getHiddenFields() {
            return this.hiddenFields;
        }

        public final List<String> getIds() {
            return this.ids;
        }

        public final Integer getPage() {
            return this.page;
        }

        public final Integer getPerPage() {
            return this.perPage;
        }

        public final String getPreFilterExpression() {
            return this.preFilterExpression;
        }

        public final String getSection() {
            return this.section;
        }

        public final String getSortBy() {
            return this.sortBy;
        }

        public final String getSortOrder() {
            return this.sortOrder;
        }

        public final VariationsMap getVariationsMap() {
            return this.variationsMap;
        }

        public final Builder setFilters(Map<String, ? extends List<String>> facets) {
            Intrinsics.j(facets, "facets");
            m111setFilters(facets);
            return this;
        }

        public final Builder setGroupsSortBy(String groupsSortBy) {
            Intrinsics.j(groupsSortBy, "groupsSortBy");
            m112setGroupsSortBy(groupsSortBy);
            return this;
        }

        public final Builder setGroupsSortOrder(String groupsSortOrder) {
            Intrinsics.j(groupsSortOrder, "groupsSortOrder");
            m113setGroupsSortOrder(groupsSortOrder);
            return this;
        }

        public final Builder setHiddenFacets(List<String> hiddenFacets) {
            Intrinsics.j(hiddenFacets, "hiddenFacets");
            m114setHiddenFacets(hiddenFacets);
            return this;
        }

        public final Builder setHiddenFields(List<String> hiddenFields) {
            Intrinsics.j(hiddenFields, "hiddenFields");
            m115setHiddenFields(hiddenFields);
            return this;
        }

        public final Builder setPage(int page) {
            setPage(Integer.valueOf(page));
            return this;
        }

        public final Builder setPerPage(int perPage) {
            setPerPage(Integer.valueOf(perPage));
            return this;
        }

        public final Builder setPreFilterExpression(String preFilterExpression) {
            Intrinsics.j(preFilterExpression, "preFilterExpression");
            m116setPreFilterExpression(preFilterExpression);
            return this;
        }

        public final Builder setSection(String section) {
            Intrinsics.j(section, "section");
            m117setSection(section);
            return this;
        }

        public final Builder setSortBy(String sortBy) {
            Intrinsics.j(sortBy, "sortBy");
            m118setSortBy(sortBy);
            return this;
        }

        public final Builder setSortOrder(String sortOrder) {
            Intrinsics.j(sortOrder, "sortOrder");
            m119setSortOrder(sortOrder);
            return this;
        }

        public final Builder setVariationsMap(VariationsMap variationsMap) {
            Intrinsics.j(variationsMap, "variationsMap");
            m120setVariationsMap(variationsMap);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J5\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0019\b\u0002\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\fH\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\r"}, d2 = {"Lio/constructor/data/builder/BrowseItemsRequest$Companion;", "", "()V", "build", "Lio/constructor/data/builder/BrowseItemsRequest;", "ids", "", "", "block", "Lkotlin/Function1;", "Lio/constructor/data/builder/BrowseItemsRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ BrowseItemsRequest build$default(Companion companion, List ids, Function1 block, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                block = new Function1<Builder, Unit>() { // from class: io.constructor.data.builder.BrowseItemsRequest$Companion$build$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(BrowseItemsRequest.Builder builder) {
                        Intrinsics.j(builder, "$this$null");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(BrowseItemsRequest.Builder builder) {
                        invoke2(builder);
                        return Unit.f143329a;
                    }
                };
            }
            Intrinsics.j(ids, "ids");
            Intrinsics.j(block, "block");
            Builder builder = new Builder(ids);
            block.invoke(builder);
            return builder.build();
        }

        public final BrowseItemsRequest build(List<String> ids, Function1<? super Builder, Unit> block) {
            Intrinsics.j(ids, "ids");
            Intrinsics.j(block, "block");
            Builder builder = new Builder(ids);
            block.invoke(builder);
            return builder.build();
        }
    }

    public /* synthetic */ BrowseItemsRequest(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BrowseItemsRequest(List<String> ids, Map<String, ? extends List<String>> map, Integer num, Integer num2, String str, String str2, String str3, List<String> list, List<String> list2, String str4, String str5, VariationsMap variationsMap, String str6) {
        Intrinsics.j(ids, "ids");
        this.ids = ids;
        this.filters = map;
        this.page = num;
        this.perPage = num2;
        this.sortBy = str;
        this.sortOrder = str2;
        this.section = str3;
        this.hiddenFields = list;
        this.hiddenFacets = list2;
        this.groupsSortBy = str4;
        this.groupsSortOrder = str5;
        this.variationsMap = variationsMap;
        this.preFilterExpression = str6;
    }

    public final Map<String, List<String>> getFilters() {
        return this.filters;
    }

    public final String getGroupsSortBy() {
        return this.groupsSortBy;
    }

    public final String getGroupsSortOrder() {
        return this.groupsSortOrder;
    }

    public final List<String> getHiddenFacets() {
        return this.hiddenFacets;
    }

    public final List<String> getHiddenFields() {
        return this.hiddenFields;
    }

    public final List<String> getIds() {
        return this.ids;
    }

    public final Integer getPage() {
        return this.page;
    }

    public final Integer getPerPage() {
        return this.perPage;
    }

    public final String getPreFilterExpression() {
        return this.preFilterExpression;
    }

    public final String getSection() {
        return this.section;
    }

    public final String getSortBy() {
        return this.sortBy;
    }

    public final String getSortOrder() {
        return this.sortOrder;
    }

    public final VariationsMap getVariationsMap() {
        return this.variationsMap;
    }

    public /* synthetic */ BrowseItemsRequest(List list, Map map, Integer num, Integer num2, String str, String str2, String str3, List list2, List list3, String str4, String str5, VariationsMap variationsMap, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? null : map, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : num2, (i10 & 16) != 0 ? null : str, (i10 & 32) != 0 ? null : str2, (i10 & 64) != 0 ? null : str3, (i10 & 128) != 0 ? null : list2, (i10 & 256) != 0 ? null : list3, (i10 & 512) != 0 ? null : str4, (i10 & 1024) != 0 ? null : str5, (i10 & RecyclerView.m.FLAG_MOVED) != 0 ? null : variationsMap, (i10 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? null : str6);
    }

    private BrowseItemsRequest(Builder builder) {
        this(builder.getIds(), builder.getFilters(), builder.getPage(), builder.getPerPage(), builder.getSortBy(), builder.getSortOrder(), builder.getSection(), builder.getHiddenFields(), builder.getHiddenFacets(), builder.getGroupsSortBy(), builder.getGroupsSortOrder(), builder.getVariationsMap(), builder.getPreFilterExpression());
    }
}
