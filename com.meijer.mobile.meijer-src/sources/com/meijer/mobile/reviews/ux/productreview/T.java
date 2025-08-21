package com.meijer.mobile.reviews.ux.productreview;

import Jp.Filter;
import androidx.view.InterfaceC6157f;
import com.bazaarvoice.bvandroidsdk.EqualityOperator;
import com.bazaarvoice.bvandroidsdk.ReviewOptions;
import com.meijer.mobile.reviews.ux.productreview.AbstractC12834a;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pv.C16563h;
import pv.InterfaceC16549B;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0002!\u001dB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\u000b\u001a\u00020\n2\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u001d\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001c0 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/T;", "Landroidx/lifecycle/c0;", "Landroidx/lifecycle/f;", "<init>", "()V", "", "LJp/a;", "initFilters", "LJp/b;", "initSortBy", "", "v", "(Ljava/util/Set;LJp/b;)V", "s", "r", "filter", "q", "(Ljava/util/Set;)V", "sortBy", "u", "(LJp/b;)V", "t", "(LJp/a;)V", "Lcom/meijer/mobile/reviews/ux/productreview/a;", "action", "p", "(Lcom/meijer/mobile/reviews/ux/productreview/a;)V", "Lpv/B;", "Lcom/meijer/mobile/reviews/ux/productreview/T$b;", "a", "Lpv/B;", "_filterAndSortFlow", "Lpv/P;", "b", "Lpv/P;", "o", "()Lpv/P;", "filterAndSortFlow", "c", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class T extends androidx.view.c0 implements InterfaceC6157f {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f116570d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final Set<Filter> f116571e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set<Filter> f116572f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<FilterAndSortState> _filterAndSortFlow;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pv.P<FilterAndSortState> filterAndSortFlow;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/T$a;", "", "<init>", "()V", "", "LJp/a;", "ratingOptions", "Ljava/util/Set;", "b", "()Ljava/util/Set;", "localeOptions", "a", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.reviews.ux.productreview.T$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Set<Filter> a() {
            return T.f116572f;
        }

        public final Set<Filter> b() {
            return T.f116571e;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/reviews/ux/productreview/T$b;", "", "LJp/b;", "sortBy", "", "LJp/a;", "filters", "<init>", "(LJp/b;Ljava/util/Set;)V", "a", "(LJp/b;Ljava/util/Set;)Lcom/meijer/mobile/reviews/ux/productreview/T$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LJp/b;", "d", "()LJp/b;", "b", "Ljava/util/Set;", "c", "()Ljava/util/Set;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.reviews.ux.productreview.T$b, reason: from toString */
    public static final /* data */ class FilterAndSortState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Jp.b sortBy;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Set<Filter> filters;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FilterAndSortState)) {
                return false;
            }
            FilterAndSortState filterAndSortState = (FilterAndSortState) other;
            return this.sortBy == filterAndSortState.sortBy && Intrinsics.e(this.filters, filterAndSortState.filters);
        }

        public int hashCode() {
            return (this.sortBy.hashCode() * 31) + this.filters.hashCode();
        }

        public String toString() {
            return "FilterAndSortState(sortBy=" + this.sortBy + ", filters=" + this.filters + ')';
        }

        public FilterAndSortState(Jp.b sortBy, Set<Filter> filters) {
            Intrinsics.j(sortBy, "sortBy");
            Intrinsics.j(filters, "filters");
            this.sortBy = sortBy;
            this.filters = filters;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FilterAndSortState b(FilterAndSortState filterAndSortState, Jp.b bVar, Set set, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bVar = filterAndSortState.sortBy;
            }
            if ((i10 & 2) != 0) {
                set = filterAndSortState.filters;
            }
            return filterAndSortState.a(bVar, set);
        }

        public final FilterAndSortState a(Jp.b sortBy, Set<Filter> filters) {
            Intrinsics.j(sortBy, "sortBy");
            Intrinsics.j(filters, "filters");
            return new FilterAndSortState(sortBy, filters);
        }

        public final Set<Filter> c() {
            return this.filters;
        }

        /* renamed from: d, reason: from getter */
        public final Jp.b getSortBy() {
            return this.sortBy;
        }
    }

    static {
        ReviewOptions.Filter filter = ReviewOptions.Filter.Rating;
        EqualityOperator equalityOperator = EqualityOperator.EQ;
        f116571e = SetsKt.i(new Filter(filter, equalityOperator, "1", Lp.c.f19417x), new Filter(filter, equalityOperator, "2", Lp.c.f19360T0), new Filter(filter, equalityOperator, "3", Lp.c.f19356R0), new Filter(filter, equalityOperator, "4", Lp.c.f19395m), new Filter(filter, equalityOperator, "5", Lp.c.f19393l));
        f116572f = SetsKt.d(new Filter(ReviewOptions.Filter.ContentLocale, equalityOperator, "en_US", Lp.c.f19401p));
    }

    private final void q(Set<Filter> filter) {
        FilterAndSortState value;
        FilterAndSortState filterAndSortState;
        ArrayList arrayList;
        InterfaceC16549B<FilterAndSortState> interfaceC16549B = this._filterAndSortFlow;
        do {
            value = interfaceC16549B.getValue();
            filterAndSortState = value;
            Set<Filter> setC = filterAndSortState.c();
            arrayList = new ArrayList();
            for (Object obj : setC) {
                if (!filter.contains((Filter) obj)) {
                    arrayList.add(obj);
                }
            }
        } while (!interfaceC16549B.e(value, FilterAndSortState.b(filterAndSortState, null, CollectionsKt.o1(arrayList), 1, null)));
    }

    private final void r() {
        FilterAndSortState value;
        InterfaceC16549B<FilterAndSortState> interfaceC16549B = this._filterAndSortFlow;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, FilterAndSortState.b(value, U.f116577a, null, 2, null)));
    }

    private final void s() {
        FilterAndSortState value;
        InterfaceC16549B<FilterAndSortState> interfaceC16549B = this._filterAndSortFlow;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, value.a(U.f116577a, SetsKt.e())));
    }

    private final void t(Filter filter) {
        FilterAndSortState value;
        FilterAndSortState filterAndSortState;
        InterfaceC16549B<FilterAndSortState> interfaceC16549B = this._filterAndSortFlow;
        do {
            value = interfaceC16549B.getValue();
            filterAndSortState = value;
        } while (!interfaceC16549B.e(value, FilterAndSortState.b(filterAndSortState, null, filterAndSortState.c().contains(filter) ? SetsKt.k(filterAndSortState.c(), filter) : SetsKt.m(filterAndSortState.c(), filter), 1, null)));
    }

    private final void u(Jp.b sortBy) {
        FilterAndSortState value;
        InterfaceC16549B<FilterAndSortState> interfaceC16549B = this._filterAndSortFlow;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, FilterAndSortState.b(value, sortBy, null, 2, null)));
    }

    private final void v(Set<Filter> initFilters, Jp.b initSortBy) {
        FilterAndSortState value;
        InterfaceC16549B<FilterAndSortState> interfaceC16549B = this._filterAndSortFlow;
        do {
            value = interfaceC16549B.getValue();
        } while (!interfaceC16549B.e(value, value.a(initSortBy == null ? U.f116577a : initSortBy, initFilters == null ? SetsKt.e() : initFilters)));
    }

    public final pv.P<FilterAndSortState> o() {
        return this.filterAndSortFlow;
    }

    public final void p(AbstractC12834a action) {
        Intrinsics.j(action, "action");
        if (action instanceof AbstractC12834a.SetFilterAndSort) {
            AbstractC12834a.SetFilterAndSort setFilterAndSort = (AbstractC12834a.SetFilterAndSort) action;
            v(setFilterAndSort.a(), setFilterAndSort.getInitSortBy());
            return;
        }
        if (action instanceof AbstractC12834a.ResetFilter) {
            q(((AbstractC12834a.ResetFilter) action).a());
            return;
        }
        if (action instanceof AbstractC12834a.b) {
            r();
            return;
        }
        if (action instanceof AbstractC12834a.c) {
            s();
        } else if (action instanceof AbstractC12834a.SelectFilter) {
            t(((AbstractC12834a.SelectFilter) action).getFilter());
        } else {
            if (!(action instanceof AbstractC12834a.SelectSortBy)) {
                throw new NoWhenBranchMatchedException();
            }
            u(((AbstractC12834a.SelectSortBy) action).getSortBy());
        }
    }

    public T() {
        InterfaceC16549B<FilterAndSortState> interfaceC16549BA = pv.S.a(new FilterAndSortState(U.f116577a, SetsKt.e()));
        this._filterAndSortFlow = interfaceC16549BA;
        this.filterAndSortFlow = C16563h.c(interfaceC16549BA);
    }
}
