package com.meijer.mobile.product.model.search.api;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&BY\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\t\u001a\u00020\u0004\u0012\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fJb\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\t\u001a\u00020\u00042\u000e\b\u0003\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0003\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b \u0010$\u001a\u0004\b!\u0010%R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001b\u0010%¨\u0006'"}, d2 = {"Lcom/meijer/mobile/product/model/search/api/Facet;", "", "", "name", "", "isCategory", "isMultiSelect", "", "priority", "isVisible", "", "Lcom/meijer/mobile/product/model/search/api/Facet$Option;", "topOptions", "options", "<init>", "(Ljava/lang/String;ZZIZLjava/util/List;Ljava/util/List;)V", "copy", "(Ljava/lang/String;ZZIZLjava/util/List;Ljava/util/List;)Lcom/meijer/mobile/product/model/search/api/Facet;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "e", "()Z", "c", "f", "d", "I", "g", "Ljava/util/List;", "()Ljava/util/List;", "Option", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class Facet {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isCategory;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isMultiSelect;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int priority;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isVisible;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Option> topOptions;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Option> options;

    @i(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ8\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/meijer/mobile/product/model/search/api/Facet$Option;", "", "", "name", "", "count", "Lcom/meijer/mobile/product/model/search/api/Query;", "query", "", "isSelected", "<init>", "(Ljava/lang/String;ILcom/meijer/mobile/product/model/search/api/Query;Z)V", "copy", "(Ljava/lang/String;ILcom/meijer/mobile/product/model/search/api/Query;Z)Lcom/meijer/mobile/product/model/search/api/Facet$Option;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "I", "c", "Lcom/meijer/mobile/product/model/search/api/Query;", "()Lcom/meijer/mobile/product/model/search/api/Query;", "d", "Z", "()Z", "search_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Option {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int count;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Query query;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isSelected;

        public Option(@g(name = "name") String name, @g(name = "count") int i10, @g(name = "query") Query query, @g(name = "selected") boolean z10) {
            Intrinsics.j(name, "name");
            Intrinsics.j(query, "query");
            this.name = name;
            this.count = i10;
            this.query = query;
            this.isSelected = z10;
        }

        public final Option copy(@g(name = "name") String name, @g(name = "count") int count, @g(name = "query") Query query, @g(name = "selected") boolean isSelected) {
            Intrinsics.j(name, "name");
            Intrinsics.j(query, "query");
            return new Option(name, count, query, isSelected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Option)) {
                return false;
            }
            Option option = (Option) other;
            return Intrinsics.e(this.name, option.name) && this.count == option.count && Intrinsics.e(this.query, option.query) && this.isSelected == option.isSelected;
        }

        public int hashCode() {
            return (((((this.name.hashCode() * 31) + Integer.hashCode(this.count)) * 31) + this.query.hashCode()) * 31) + Boolean.hashCode(this.isSelected);
        }

        public String toString() {
            return "Option(name=" + this.name + ", count=" + this.count + ", query=" + this.query + ", isSelected=" + this.isSelected + ')';
        }

        /* renamed from: a, reason: from getter */
        public final int getCount() {
            return this.count;
        }

        /* renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: c, reason: from getter */
        public final Query getQuery() {
            return this.query;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        public /* synthetic */ Option(String str, int i10, Query query, boolean z10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? new Query(null, null, 3, null) : query, (i11 & 8) != 0 ? false : z10);
        }
    }

    public Facet(@g(name = "name") String name, @g(name = "category") boolean z10, @g(name = "multiSelect") boolean z11, @g(name = "priority") int i10, @g(name = "visible") boolean z12, @g(name = "topValues") List<Option> topOptions, @g(name = "values") List<Option> options) {
        Intrinsics.j(name, "name");
        Intrinsics.j(topOptions, "topOptions");
        Intrinsics.j(options, "options");
        this.name = name;
        this.isCategory = z10;
        this.isMultiSelect = z11;
        this.priority = i10;
        this.isVisible = z12;
        this.topOptions = topOptions;
        this.options = options;
    }

    public final Facet copy(@g(name = "name") String name, @g(name = "category") boolean isCategory, @g(name = "multiSelect") boolean isMultiSelect, @g(name = "priority") int priority, @g(name = "visible") boolean isVisible, @g(name = "topValues") List<Option> topOptions, @g(name = "values") List<Option> options) {
        Intrinsics.j(name, "name");
        Intrinsics.j(topOptions, "topOptions");
        Intrinsics.j(options, "options");
        return new Facet(name, isCategory, isMultiSelect, priority, isVisible, topOptions, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Facet)) {
            return false;
        }
        Facet facet = (Facet) other;
        return Intrinsics.e(this.name, facet.name) && this.isCategory == facet.isCategory && this.isMultiSelect == facet.isMultiSelect && this.priority == facet.priority && this.isVisible == facet.isVisible && Intrinsics.e(this.topOptions, facet.topOptions) && Intrinsics.e(this.options, facet.options);
    }

    public int hashCode() {
        return (((((((((((this.name.hashCode() * 31) + Boolean.hashCode(this.isCategory)) * 31) + Boolean.hashCode(this.isMultiSelect)) * 31) + Integer.hashCode(this.priority)) * 31) + Boolean.hashCode(this.isVisible)) * 31) + this.topOptions.hashCode()) * 31) + this.options.hashCode();
    }

    public String toString() {
        return "Facet(name=" + this.name + ", isCategory=" + this.isCategory + ", isMultiSelect=" + this.isMultiSelect + ", priority=" + this.priority + ", isVisible=" + this.isVisible + ", topOptions=" + this.topOptions + ", options=" + this.options + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final List<Option> b() {
        return this.options;
    }

    /* renamed from: c, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    public final List<Option> d() {
        return this.topOptions;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getIsCategory() {
        return this.isCategory;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsMultiSelect() {
        return this.isMultiSelect;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }

    public /* synthetic */ Facet(String str, boolean z10, boolean z11, int i10, boolean z12, List list, List list2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10, z11, (i11 & 8) != 0 ? 0 : i10, (i11 & 16) != 0 ? true : z12, (i11 & 32) != 0 ? CollectionsKt.m() : list, (i11 & 64) != 0 ? CollectionsKt.m() : list2);
    }
}
