package com.meijer.mobile.reviews.ux.productreview;

import Jp.Filter;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/a;", "", "<init>", "()V", "f", "c", "b", "a", "e", "d", "Lcom/meijer/mobile/reviews/ux/productreview/a$a;", "Lcom/meijer/mobile/reviews/ux/productreview/a$b;", "Lcom/meijer/mobile/reviews/ux/productreview/a$c;", "Lcom/meijer/mobile/reviews/ux/productreview/a$d;", "Lcom/meijer/mobile/reviews/ux/productreview/a$e;", "Lcom/meijer/mobile/reviews/ux/productreview/a$f;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.reviews.ux.productreview.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC12708a {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/a$a;", "Lcom/meijer/mobile/reviews/ux/productreview/a;", "", "LJp/a;", "filter", "<init>", "(Ljava/util/Set;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.reviews.ux.productreview.a$a, reason: collision with other inner class name and from toString */
    public static final /* data */ class ResetFilter extends AbstractC12708a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<Filter> filter;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ResetFilter) && Intrinsics.e(this.filter, ((ResetFilter) other).filter);
        }

        public int hashCode() {
            return this.filter.hashCode();
        }

        public String toString() {
            return "ResetFilter(filter=" + this.filter + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResetFilter(Set<Filter> filter) {
            super(null);
            Intrinsics.j(filter, "filter");
            this.filter = filter;
        }

        public final Set<Filter> a() {
            return this.filter;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/a$b;", "Lcom/meijer/mobile/reviews/ux/productreview/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.reviews.ux.productreview.a$b */
    public static final /* data */ class b extends AbstractC12708a {

        /* renamed from: a, reason: collision with root package name */
        public static final b f115661a = new b();

        private b() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof b);
        }

        public int hashCode() {
            return -187712444;
        }

        public String toString() {
            return "ResetSortBy";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/a$c;", "Lcom/meijer/mobile/reviews/ux/productreview/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.reviews.ux.productreview.a$c */
    public static final /* data */ class c extends AbstractC12708a {

        /* renamed from: a, reason: collision with root package name */
        public static final c f115662a = new c();

        private c() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return 297202489;
        }

        public String toString() {
            return "ResetToDefaultValues";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/a$d;", "Lcom/meijer/mobile/reviews/ux/productreview/a;", "LJp/a;", "filter", "<init>", "(LJp/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJp/a;", "()LJp/a;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.reviews.ux.productreview.a$d, reason: from toString */
    public static final /* data */ class SelectFilter extends AbstractC12708a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Filter filter;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectFilter) && Intrinsics.e(this.filter, ((SelectFilter) other).filter);
        }

        public int hashCode() {
            return this.filter.hashCode();
        }

        public String toString() {
            return "SelectFilter(filter=" + this.filter + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectFilter(Filter filter) {
            super(null);
            Intrinsics.j(filter, "filter");
            this.filter = filter;
        }

        /* renamed from: a, reason: from getter */
        public final Filter getFilter() {
            return this.filter;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/a$e;", "Lcom/meijer/mobile/reviews/ux/productreview/a;", "LJp/b;", "sortBy", "<init>", "(LJp/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJp/b;", "()LJp/b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.reviews.ux.productreview.a$e, reason: from toString */
    public static final /* data */ class SelectSortBy extends AbstractC12708a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Jp.b sortBy;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SelectSortBy) && this.sortBy == ((SelectSortBy) other).sortBy;
        }

        public int hashCode() {
            return this.sortBy.hashCode();
        }

        public String toString() {
            return "SelectSortBy(sortBy=" + this.sortBy + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SelectSortBy(Jp.b sortBy) {
            super(null);
            Intrinsics.j(sortBy, "sortBy");
            this.sortBy = sortBy;
        }

        /* renamed from: a, reason: from getter */
        public final Jp.b getSortBy() {
            return this.sortBy;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/a$f;", "Lcom/meijer/mobile/reviews/ux/productreview/a;", "", "LJp/a;", "initFilters", "LJp/b;", "initSortBy", "<init>", "(Ljava/util/Set;LJp/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/Set;", "()Ljava/util/Set;", "b", "LJp/b;", "()LJp/b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.reviews.ux.productreview.a$f, reason: from toString */
    public static final /* data */ class SetFilterAndSort extends AbstractC12708a {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<Filter> initFilters;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Jp.b initSortBy;

        /* JADX WARN: Multi-variable type inference failed */
        public SetFilterAndSort() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SetFilterAndSort)) {
                return false;
            }
            SetFilterAndSort setFilterAndSort = (SetFilterAndSort) other;
            return Intrinsics.e(this.initFilters, setFilterAndSort.initFilters) && this.initSortBy == setFilterAndSort.initSortBy;
        }

        public int hashCode() {
            Set<Filter> set = this.initFilters;
            int iHashCode = (set == null ? 0 : set.hashCode()) * 31;
            Jp.b bVar = this.initSortBy;
            return iHashCode + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            return "SetFilterAndSort(initFilters=" + this.initFilters + ", initSortBy=" + this.initSortBy + ')';
        }

        public /* synthetic */ SetFilterAndSort(Set set, Jp.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : set, (i10 & 2) != 0 ? null : bVar);
        }

        public final Set<Filter> a() {
            return this.initFilters;
        }

        /* renamed from: b, reason: from getter */
        public final Jp.b getInitSortBy() {
            return this.initSortBy;
        }

        public SetFilterAndSort(Set<Filter> set, Jp.b bVar) {
            super(null);
            this.initFilters = set;
            this.initSortBy = bVar;
        }
    }

    public /* synthetic */ AbstractC12708a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private AbstractC12708a() {
    }
}
