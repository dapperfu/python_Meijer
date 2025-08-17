package com.meijer.mobile.meijer.activity.find.filter;

import Qo.FilterFacet;
import Qo.FilterFacetOption;
import Qo.FilterSortOption;
import Qo.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/j;", "", "<init>", "()V", "e", "c", "d", "h", "b", "g", "f", "a", "Lcom/meijer/mobile/meijer/activity/find/filter/j$a;", "Lcom/meijer/mobile/meijer/activity/find/filter/j$b;", "Lcom/meijer/mobile/meijer/activity/find/filter/j$c;", "Lcom/meijer/mobile/meijer/activity/find/filter/j$d;", "Lcom/meijer/mobile/meijer/activity/find/filter/j$e;", "Lcom/meijer/mobile/meijer/activity/find/filter/j$f;", "Lcom/meijer/mobile/meijer/activity/find/filter/j$g;", "Lcom/meijer/mobile/meijer/activity/find/filter/j$h;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class j {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/j$a;", "Lcom/meijer/mobile/meijer/activity/find/filter/j;", "", "name", "", "Lcom/meijer/mobile/meijer/activity/find/filter/s;", "items", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.filter.j$a, reason: from toString */
    public static final /* data */ class DrillDown extends j {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<s> items;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DrillDown)) {
                return false;
            }
            DrillDown drillDown = (DrillDown) other;
            return Intrinsics.e(this.name, drillDown.name) && Intrinsics.e(this.items, drillDown.items);
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.items.hashCode();
        }

        public String toString() {
            return "DrillDown(name=" + this.name + ", items=" + this.items + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public DrillDown(String name, List<? extends s> items) {
            super(null);
            Intrinsics.j(name, "name");
            Intrinsics.j(items, "items");
            this.name = name;
            this.items = items;
        }

        public final List<s> a() {
            return this.items;
        }

        /* renamed from: b, reason: from getter */
        public final String getName() {
            return this.name;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/j$b;", "Lcom/meijer/mobile/meijer/activity/find/filter/j;", "LQo/l$k;", "query", "<init>", "(LQo/l$k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LQo/l$k;", "()LQo/l$k;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.filter.j$b, reason: from toString */
    public static final /* data */ class LoadItems extends j {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final l.k query;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoadItems) && Intrinsics.e(this.query, ((LoadItems) other).query);
        }

        public int hashCode() {
            return this.query.hashCode();
        }

        public String toString() {
            return "LoadItems(query=" + this.query + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadItems(l.k query) {
            super(null);
            Intrinsics.j(query, "query");
            this.query = query;
        }

        /* renamed from: a, reason: from getter */
        public final l.k getQuery() {
            return this.query;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/j$c;", "Lcom/meijer/mobile/meijer/activity/find/filter/j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class c extends j {

        /* renamed from: a, reason: collision with root package name */
        public static final c f106722a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return 1074769642;
        }

        public String toString() {
            return "PopOrBack";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/j$d;", "Lcom/meijer/mobile/meijer/activity/find/filter/j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class d extends j {

        /* renamed from: a, reason: collision with root package name */
        public static final d f106723a = new d();

        private d() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return 201085086;
        }

        public String toString() {
            return "Reset";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/j$e;", "Lcom/meijer/mobile/meijer/activity/find/filter/j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class e extends j {

        /* renamed from: a, reason: collision with root package name */
        public static final e f106724a = new e();

        private e() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof e);
        }

        public int hashCode() {
            return -391599564;
        }

        public String toString() {
            return "SeeResults";
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/j$f;", "Lcom/meijer/mobile/meijer/activity/find/filter/j;", "Lkotlin/Pair;", "LQo/a;", "LQo/c;", "filterFacetOptionPair", "", "notSelected", "<init>", "(Lkotlin/Pair;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lkotlin/Pair;", "()Lkotlin/Pair;", "b", "Z", "getNotSelected", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.filter.j$f, reason: from toString */
    public static final /* data */ class SelectFilter extends j {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Pair<FilterFacet, FilterFacetOption> filterFacetOptionPair;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean notSelected;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SelectFilter)) {
                return false;
            }
            SelectFilter selectFilter = (SelectFilter) other;
            return Intrinsics.e(this.filterFacetOptionPair, selectFilter.filterFacetOptionPair) && this.notSelected == selectFilter.notSelected;
        }

        public int hashCode() {
            return (this.filterFacetOptionPair.hashCode() * 31) + Boolean.hashCode(this.notSelected);
        }

        public String toString() {
            return "SelectFilter(filterFacetOptionPair=" + this.filterFacetOptionPair + ", notSelected=" + this.notSelected + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectFilter(Pair<FilterFacet, FilterFacetOption> filterFacetOptionPair, boolean z10) {
            super(null);
            Intrinsics.j(filterFacetOptionPair, "filterFacetOptionPair");
            this.filterFacetOptionPair = filterFacetOptionPair;
            this.notSelected = z10;
        }

        public final Pair<FilterFacet, FilterFacetOption> a() {
            return this.filterFacetOptionPair;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/j$g;", "Lcom/meijer/mobile/meijer/activity/find/filter/j;", "LQo/g;", "filterSortOption", "<init>", "(LQo/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LQo/g;", "()LQo/g;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.filter.j$g, reason: from toString */
    public static final /* data */ class SelectSort extends j {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final FilterSortOption filterSortOption;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectSort) && Intrinsics.e(this.filterSortOption, ((SelectSort) other).filterSortOption);
        }

        public int hashCode() {
            return this.filterSortOption.hashCode();
        }

        public String toString() {
            return "SelectSort(filterSortOption=" + this.filterSortOption + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectSort(FilterSortOption filterSortOption) {
            super(null);
            Intrinsics.j(filterSortOption, "filterSortOption");
            this.filterSortOption = filterSortOption;
        }

        /* renamed from: a, reason: from getter */
        public final FilterSortOption getFilterSortOption() {
            return this.filterSortOption;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/j$h;", "Lcom/meijer/mobile/meijer/activity/find/filter/j;", "LQo/l;", "query", "<init>", "(LQo/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LQo/l;", "()LQo/l;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.filter.j$h, reason: from toString */
    public static final /* data */ class SetQuery extends j {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Qo.l query;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SetQuery) && Intrinsics.e(this.query, ((SetQuery) other).query);
        }

        public int hashCode() {
            return this.query.hashCode();
        }

        public String toString() {
            return "SetQuery(query=" + this.query + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SetQuery(Qo.l query) {
            super(null);
            Intrinsics.j(query, "query");
            this.query = query;
        }

        /* renamed from: a, reason: from getter */
        public final Qo.l getQuery() {
            return this.query;
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private j() {
    }
}
