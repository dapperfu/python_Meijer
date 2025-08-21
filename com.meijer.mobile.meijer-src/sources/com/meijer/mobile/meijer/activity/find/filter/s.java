package com.meijer.mobile.meijer.activity.find.filter;

import Qo.FilterFacet;
import Qo.FilterFacetOption;
import Qo.FilterSortOption;
import bk.AbstractC6392a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/s;", "", "<init>", "()V", "d", "c", "b", "a", "Lcom/meijer/mobile/meijer/activity/find/filter/s$a;", "Lcom/meijer/mobile/meijer/activity/find/filter/s$b;", "Lcom/meijer/mobile/meijer/activity/find/filter/s$c;", "Lcom/meijer/mobile/meijer/activity/find/filter/s$d;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class s {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJN\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b \u0010\u0010R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/s$a;", "Lcom/meijer/mobile/meijer/activity/find/filter/s;", "", "content", "", "name", "", "nameRes", "subText", "", "selected", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Z)V", "a", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Z)Lcom/meijer/mobile/meijer/activity/find/filter/s$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ljava/lang/String;", "d", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "f", "Z", "getSelected", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.filter.s$a, reason: from toString */
    public static final /* data */ class DrillDownItem extends s {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<s> content;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer nameRes;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String subText;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean selected;

        public /* synthetic */ DrillDownItem(List list, String str, Integer num, String str2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, num, str2, (i10 & 16) != 0 ? false : z10);
        }

        public static /* synthetic */ DrillDownItem b(DrillDownItem drillDownItem, List list, String str, Integer num, String str2, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = drillDownItem.content;
            }
            if ((i10 & 2) != 0) {
                str = drillDownItem.name;
            }
            if ((i10 & 4) != 0) {
                num = drillDownItem.nameRes;
            }
            if ((i10 & 8) != 0) {
                str2 = drillDownItem.subText;
            }
            if ((i10 & 16) != 0) {
                z10 = drillDownItem.selected;
            }
            boolean z11 = z10;
            Integer num2 = num;
            return drillDownItem.a(list, str, num2, str2, z11);
        }

        public final DrillDownItem a(List<? extends s> content, String name, Integer nameRes, String subText, boolean selected) {
            Intrinsics.j(content, "content");
            return new DrillDownItem(content, name, nameRes, subText, selected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DrillDownItem)) {
                return false;
            }
            DrillDownItem drillDownItem = (DrillDownItem) other;
            return Intrinsics.e(this.content, drillDownItem.content) && Intrinsics.e(this.name, drillDownItem.name) && Intrinsics.e(this.nameRes, drillDownItem.nameRes) && Intrinsics.e(this.subText, drillDownItem.subText) && this.selected == drillDownItem.selected;
        }

        public int hashCode() {
            int iHashCode = this.content.hashCode() * 31;
            String str = this.name;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.nameRes;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.subText;
            return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.selected);
        }

        public String toString() {
            return "DrillDownItem(content=" + this.content + ", name=" + this.name + ", nameRes=" + this.nameRes + ", subText=" + this.subText + ", selected=" + this.selected + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public DrillDownItem(List<? extends s> content, String str, Integer num, String str2, boolean z10) {
            super(null);
            Intrinsics.j(content, "content");
            this.content = content;
            this.name = str;
            this.nameRes = num;
            this.subText = str2;
            this.selected = z10;
        }

        public final List<s> c() {
            return this.content;
        }

        /* renamed from: d, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: e, reason: from getter */
        public final Integer getNameRes() {
            return this.nameRes;
        }

        /* renamed from: f, reason: from getter */
        public final String getSubText() {
            return this.subText;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/s$b;", "Lcom/meijer/mobile/meijer/activity/find/filter/s;", "Lbk/a;", "textItem", "", "selected", "<init>", "(Lbk/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lbk/a;", "()Lbk/a;", "b", "Z", "getSelected", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.filter.s$b, reason: from toString */
    public static final /* data */ class HeaderItem extends s {

        /* renamed from: c, reason: collision with root package name */
        public static final int f107627c = AbstractC6392a.f60445b;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AbstractC6392a textItem;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean selected;

        public /* synthetic */ HeaderItem(AbstractC6392a abstractC6392a, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(abstractC6392a, (i10 & 2) != 0 ? false : z10);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HeaderItem)) {
                return false;
            }
            HeaderItem headerItem = (HeaderItem) other;
            return Intrinsics.e(this.textItem, headerItem.textItem) && this.selected == headerItem.selected;
        }

        public int hashCode() {
            AbstractC6392a abstractC6392a = this.textItem;
            return ((abstractC6392a == null ? 0 : abstractC6392a.hashCode()) * 31) + Boolean.hashCode(this.selected);
        }

        public String toString() {
            return "HeaderItem(textItem=" + this.textItem + ", selected=" + this.selected + ')';
        }

        public HeaderItem(AbstractC6392a abstractC6392a, boolean z10) {
            super(null);
            this.textItem = abstractC6392a;
            this.selected = z10;
        }

        /* renamed from: a, reason: from getter */
        public final AbstractC6392a getTextItem() {
            return this.textItem;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/s$c;", "Lcom/meijer/mobile/meijer/activity/find/filter/s;", "LQo/a;", "filterFacet", "LQo/c;", "filterItem", "", "quantity", "", "selected", "<init>", "(LQo/a;LQo/c;Ljava/lang/Number;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LQo/a;", "()LQo/a;", "b", "LQo/c;", "()LQo/c;", "c", "Ljava/lang/Number;", "()Ljava/lang/Number;", "d", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.filter.s$c, reason: from toString */
    public static final /* data */ class SimpleFilterItem extends s {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final FilterFacet filterFacet;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FilterFacetOption filterItem;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Number quantity;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean selected;

        public /* synthetic */ SimpleFilterItem(FilterFacet filterFacet, FilterFacetOption filterFacetOption, Number number, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(filterFacet, filterFacetOption, number, (i10 & 8) != 0 ? false : z10);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SimpleFilterItem)) {
                return false;
            }
            SimpleFilterItem simpleFilterItem = (SimpleFilterItem) other;
            return Intrinsics.e(this.filterFacet, simpleFilterItem.filterFacet) && Intrinsics.e(this.filterItem, simpleFilterItem.filterItem) && Intrinsics.e(this.quantity, simpleFilterItem.quantity) && this.selected == simpleFilterItem.selected;
        }

        public int hashCode() {
            return (((((this.filterFacet.hashCode() * 31) + this.filterItem.hashCode()) * 31) + this.quantity.hashCode()) * 31) + Boolean.hashCode(this.selected);
        }

        public String toString() {
            return "SimpleFilterItem(filterFacet=" + this.filterFacet + ", filterItem=" + this.filterItem + ", quantity=" + this.quantity + ", selected=" + this.selected + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SimpleFilterItem(FilterFacet filterFacet, FilterFacetOption filterItem, Number quantity, boolean z10) {
            super(null);
            Intrinsics.j(filterFacet, "filterFacet");
            Intrinsics.j(filterItem, "filterItem");
            Intrinsics.j(quantity, "quantity");
            this.filterFacet = filterFacet;
            this.filterItem = filterItem;
            this.quantity = quantity;
            this.selected = z10;
        }

        /* renamed from: a, reason: from getter */
        public final FilterFacet getFilterFacet() {
            return this.filterFacet;
        }

        /* renamed from: b, reason: from getter */
        public final FilterFacetOption getFilterItem() {
            return this.filterItem;
        }

        /* renamed from: c, reason: from getter */
        public final Number getQuantity() {
            return this.quantity;
        }

        /* renamed from: d, reason: from getter */
        public boolean getSelected() {
            return this.selected;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/s$d;", "Lcom/meijer/mobile/meijer/activity/find/filter/s;", "LQo/g;", "sortItem", "", "selected", "<init>", "(LQo/g;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LQo/g;", "b", "()LQo/g;", "Z", "()Z", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.filter.s$d, reason: from toString */
    public static final /* data */ class SimpleSortItem extends s {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final FilterSortOption sortItem;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean selected;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SimpleSortItem)) {
                return false;
            }
            SimpleSortItem simpleSortItem = (SimpleSortItem) other;
            return Intrinsics.e(this.sortItem, simpleSortItem.sortItem) && this.selected == simpleSortItem.selected;
        }

        public int hashCode() {
            return (this.sortItem.hashCode() * 31) + Boolean.hashCode(this.selected);
        }

        public String toString() {
            return "SimpleSortItem(sortItem=" + this.sortItem + ", selected=" + this.selected + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SimpleSortItem(FilterSortOption sortItem, boolean z10) {
            super(null);
            Intrinsics.j(sortItem, "sortItem");
            this.sortItem = sortItem;
            this.selected = z10;
        }

        /* renamed from: a, reason: from getter */
        public boolean getSelected() {
            return this.selected;
        }

        /* renamed from: b, reason: from getter */
        public final FilterSortOption getSortItem() {
            return this.sortItem;
        }
    }

    public /* synthetic */ s(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private s() {
    }
}
