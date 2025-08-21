package Lm;

import Lm.k;
import Pj.a;
import Sk.CouponOptions;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.c0;
import androidx.view.d0;
import bk.AbstractC6392a;
import bl.EnumC6394a;
import com.meijer.mobile.coupon.model.search.CouponsSortType;
import com.meijer.mobile.coupons.api.models.Category;
import dl.C13702d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import mv.AbstractC15779K;
import mv.C15809k;
import mv.E0;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.C16563h;
import pv.InterfaceC16548A;
import pv.InterfaceC16549B;
import pv.InterfaceC16553F;
import pv.P;
import pv.S;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002 \"B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020%0)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00103\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u001d\u00109\u001a\b\u0012\u0004\u0012\u000200048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"LLm/l;", "Landroidx/lifecycle/c0;", "Ldl/d;", "couponsRepository", "Lmv/K;", "ioDispatcher", "<init>", "(Ldl/d;Lmv/K;)V", "", "s", "()V", "", "", "sortByOptions", "", "selectedIndex", "Lcom/meijer/mobile/coupon/model/search/CouponsSortType;", "q", "(Ljava/util/List;I)Lcom/meijer/mobile/coupon/model/search/CouponsSortType;", "sortType", "r", "(Ljava/util/List;Lcom/meijer/mobile/coupon/model/search/CouponsSortType;)I", "LQk/c;", "activeCouponPage", "LSk/a;", "couponOptions", "v", "(LQk/c;LSk/a;Ljava/util/List;)V", "LLm/k;", "action", "w", "(LLm/k;)V", "a", "Ldl/d;", "b", "Lmv/K;", "Lpv/B;", "LLm/l$b;", "c", "Lpv/B;", "_viewStateFlow", "Lpv/P;", "d", "Lpv/P;", "u", "()Lpv/P;", "viewStateFlow", "Lpv/A;", "LLm/l$a;", "e", "Lpv/A;", "_effectsFlow", "Lpv/F;", "f", "Lpv/F;", "t", "()Lpv/F;", "effectsFlow", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class l extends c0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C13702d couponsRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16549B<ViewState> _viewStateFlow;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final P<ViewState> viewStateFlow;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<a> _effectsFlow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16553F<a> effectsFlow;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"LLm/l$a;", "", "<init>", "()V", "a", "LLm/l$a$a;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\f¨\u0006\u0017"}, d2 = {"LLm/l$a$a;", "LLm/l$a;", "", "", "sortByOptions", "", "selectedSortTypeIndex", "<init>", "(Ljava/util/List;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "I", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Lm.l$a$a, reason: collision with other inner class name and from toString */
        public static final /* data */ class DisplaySortByDialog extends a {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<String> sortByOptions;

            /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final int selectedSortTypeIndex;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DisplaySortByDialog)) {
                    return false;
                }
                DisplaySortByDialog displaySortByDialog = (DisplaySortByDialog) other;
                return Intrinsics.e(this.sortByOptions, displaySortByDialog.sortByOptions) && this.selectedSortTypeIndex == displaySortByDialog.selectedSortTypeIndex;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DisplaySortByDialog(List<String> sortByOptions, int i10) {
                super(null);
                Intrinsics.j(sortByOptions, "sortByOptions");
                this.sortByOptions = sortByOptions;
                this.selectedSortTypeIndex = i10;
            }

            /* renamed from: a, reason: from getter */
            public final int getSelectedSortTypeIndex() {
                return this.selectedSortTypeIndex;
            }

            public final List<String> b() {
                return this.sortByOptions;
            }

            public int hashCode() {
                return (this.sortByOptions.hashCode() * 31) + Integer.hashCode(this.selectedSortTypeIndex);
            }

            public String toString() {
                return "DisplaySortByDialog(sortByOptions=" + this.sortByOptions + ", selectedSortTypeIndex=" + this.selectedSortTypeIndex + ')';
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eJN\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010&R\u0011\u0010+\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b'\u0010*¨\u0006,"}, d2 = {"LLm/l$b;", "", "LQk/c;", "activeCouponPage", "LSk/a;", "couponOptions", "LPj/a;", "loadingState", "", "Lcom/meijer/mobile/coupons/api/models/Category;", "categories", "", "sortByOptions", "<init>", "(LQk/c;LSk/a;LPj/a;Ljava/util/List;Ljava/util/List;)V", "a", "(LQk/c;LSk/a;LPj/a;Ljava/util/List;Ljava/util/List;)LLm/l$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LQk/c;", "c", "()LQk/c;", "b", "LSk/a;", "f", "()LSk/a;", "LPj/a;", "g", "()LPj/a;", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "h", "Lbl/a;", "()Lbl/a;", "categoryFilter", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Lm.l$b, reason: from toString */
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Qk.c activeCouponPage;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CouponOptions couponOptions;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Pj.a loadingState;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Category> categories;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> sortByOptions;

        public ViewState() {
            this(null, null, null, null, null, 31, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) other;
            return this.activeCouponPage == viewState.activeCouponPage && Intrinsics.e(this.couponOptions, viewState.couponOptions) && Intrinsics.e(this.loadingState, viewState.loadingState) && Intrinsics.e(this.categories, viewState.categories) && Intrinsics.e(this.sortByOptions, viewState.sortByOptions);
        }

        public ViewState(Qk.c activeCouponPage, CouponOptions couponOptions, Pj.a loadingState, List<Category> categories, List<String> sortByOptions) {
            Intrinsics.j(activeCouponPage, "activeCouponPage");
            Intrinsics.j(couponOptions, "couponOptions");
            Intrinsics.j(loadingState, "loadingState");
            Intrinsics.j(categories, "categories");
            Intrinsics.j(sortByOptions, "sortByOptions");
            this.activeCouponPage = activeCouponPage;
            this.couponOptions = couponOptions;
            this.loadingState = loadingState;
            this.categories = categories;
            this.sortByOptions = sortByOptions;
        }

        public static /* synthetic */ ViewState b(ViewState viewState, Qk.c cVar, CouponOptions couponOptions, Pj.a aVar, List list, List list2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cVar = viewState.activeCouponPage;
            }
            if ((i10 & 2) != 0) {
                couponOptions = viewState.couponOptions;
            }
            if ((i10 & 4) != 0) {
                aVar = viewState.loadingState;
            }
            if ((i10 & 8) != 0) {
                list = viewState.categories;
            }
            if ((i10 & 16) != 0) {
                list2 = viewState.sortByOptions;
            }
            List list3 = list2;
            Pj.a aVar2 = aVar;
            return viewState.a(cVar, couponOptions, aVar2, list, list3);
        }

        public final ViewState a(Qk.c activeCouponPage, CouponOptions couponOptions, Pj.a loadingState, List<Category> categories, List<String> sortByOptions) {
            Intrinsics.j(activeCouponPage, "activeCouponPage");
            Intrinsics.j(couponOptions, "couponOptions");
            Intrinsics.j(loadingState, "loadingState");
            Intrinsics.j(categories, "categories");
            Intrinsics.j(sortByOptions, "sortByOptions");
            return new ViewState(activeCouponPage, couponOptions, loadingState, categories, sortByOptions);
        }

        /* renamed from: c, reason: from getter */
        public final Qk.c getActiveCouponPage() {
            return this.activeCouponPage;
        }

        public final List<Category> d() {
            return this.categories;
        }

        public final EnumC6394a e() {
            return this.activeCouponPage == Qk.c.f31041e ? EnumC6394a.f60453b : this.couponOptions.getIsShowClippedCoupons() ? EnumC6394a.f60455d : EnumC6394a.f60454c;
        }

        /* renamed from: f, reason: from getter */
        public final CouponOptions getCouponOptions() {
            return this.couponOptions;
        }

        /* renamed from: g, reason: from getter */
        public final Pj.a getLoadingState() {
            return this.loadingState;
        }

        public final List<String> h() {
            return this.sortByOptions;
        }

        public int hashCode() {
            return (((((((this.activeCouponPage.hashCode() * 31) + this.couponOptions.hashCode()) * 31) + this.loadingState.hashCode()) * 31) + this.categories.hashCode()) * 31) + this.sortByOptions.hashCode();
        }

        public String toString() {
            return "ViewState(activeCouponPage=" + this.activeCouponPage + ", couponOptions=" + this.couponOptions + ", loadingState=" + this.loadingState + ", categories=" + this.categories + ", sortByOptions=" + this.sortByOptions + ')';
        }

        public /* synthetic */ ViewState(Qk.c cVar, CouponOptions couponOptions, Pj.a aVar, List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? Qk.c.f31040d : cVar, (i10 & 2) != 0 ? new CouponOptions(null, null, null, false, false, 0L, null, null, false, null, null, false, false, 8191, null) : couponOptions, (i10 & 4) != 0 ? new a.NotLoading(null, 1, null) : aVar, (i10 & 8) != 0 ? CollectionsKt.m() : list, (i10 & 16) != 0 ? CollectionsKt.m() : list2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.coupons.viewmodel.CouponFilterViewModel$getCouponCategories$1$1", f = "CouponFilterViewModel.kt", l = {74}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f19277a;

        /* renamed from: b, reason: collision with root package name */
        Object f19278b;

        /* renamed from: c, reason: collision with root package name */
        Object f19279c;

        /* renamed from: d, reason: collision with root package name */
        Object f19280d;

        /* renamed from: e, reason: collision with root package name */
        int f19281e;

        /* renamed from: f, reason: collision with root package name */
        int f19282f;

        /* renamed from: g, reason: collision with root package name */
        int f19283g;

        /* renamed from: h, reason: collision with root package name */
        int f19284h;

        /* renamed from: i, reason: collision with root package name */
        int f19285i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f19286j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ EnumC6394a f19288l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(EnumC6394a enumC6394a, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f19288l = enumC6394a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = l.this.new c(this.f19288l, continuation);
            cVar.f19286j = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object value;
            ViewState viewState;
            ArrayList arrayList;
            Object value2;
            Object value3;
            Object objB2;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f19285i;
            try {
                if (i10 == 0) {
                    ResultKt.b(obj);
                    InterfaceC15783O interfaceC15783O = (InterfaceC15783O) this.f19286j;
                    InterfaceC16549B interfaceC16549B = l.this._viewStateFlow;
                    do {
                        value3 = interfaceC16549B.getValue();
                    } while (!interfaceC16549B.e(value3, ViewState.b((ViewState) value3, null, null, new a.Loading(null, AbstractC6392a.INSTANCE.d(Nr.g.f22649C, new Object[0]), 1, null), null, null, 27, null)));
                    l lVar = l.this;
                    EnumC6394a enumC6394a = this.f19288l;
                    Result.Companion companion = Result.INSTANCE;
                    io.reactivex.u<List<Category>> uVarP = lVar.couponsRepository.p(enumC6394a);
                    this.f19286j = interfaceC15783O;
                    this.f19277a = interfaceC15783O;
                    this.f19278b = this;
                    this.f19279c = this;
                    this.f19280d = interfaceC15783O;
                    this.f19281e = 0;
                    this.f19282f = 0;
                    this.f19283g = 0;
                    this.f19284h = 0;
                    this.f19285i = 1;
                    objB2 = tv.c.b(uVarP, this);
                    if (objB2 == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objB2 = obj;
                }
                objB = Result.b(objB2);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            l lVar2 = l.this;
            Throwable thE = Result.e(objB);
            if (thE != null) {
                qw.a.INSTANCE.f(thE, "getCouponCategories failed in CouponFilterViewModel", new Object[0]);
                InterfaceC16549B interfaceC16549B2 = lVar2._viewStateFlow;
                do {
                    value2 = interfaceC16549B2.getValue();
                } while (!interfaceC16549B2.e(value2, ViewState.b((ViewState) value2, null, null, new a.Failed(null, null, 3, null), null, null, 27, null)));
            }
            l lVar3 = l.this;
            if (Result.h(objB)) {
                List list = (List) objB;
                InterfaceC16549B interfaceC16549B3 = lVar3._viewStateFlow;
                do {
                    value = interfaceC16549B3.getValue();
                    viewState = (ViewState) value;
                    Intrinsics.g(list);
                    List<Category> list2 = list;
                    arrayList = new ArrayList(CollectionsKt.x(list2, 10));
                    for (Category category : list2) {
                        arrayList.add(Category.a(category, null, null, 0, false, CollectionsKt.h0(viewState.getCouponOptions().e(), category.getCategoryID()), 15, null));
                    }
                } while (!interfaceC16549B3.e(value, ViewState.b(viewState, null, null, new a.NotLoading(null, 1, null), arrayList, null, 19, null)));
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.coupons.viewmodel.CouponFilterViewModel$onAction$5", f = "CouponFilterViewModel.kt", l = {147}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f19289a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ k f19291c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k kVar, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f19291c = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return l.this.new d(this.f19291c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f19289a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = l.this._effectsFlow;
                a.DisplaySortByDialog displaySortByDialog = new a.DisplaySortByDialog(((k.ShowSortOptions) this.f19291c).a(), l.this.r(((k.ShowSortOptions) this.f19291c).a(), ((k.ShowSortOptions) this.f19291c).getSortType()));
                this.f19289a = 1;
                if (interfaceC16548A.emit(displaySortByDialog, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public l(C13702d couponsRepository, AbstractC15779K ioDispatcher) {
        Intrinsics.j(couponsRepository, "couponsRepository");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.couponsRepository = couponsRepository;
        this.ioDispatcher = ioDispatcher;
        InterfaceC16549B<ViewState> interfaceC16549BA = S.a(new ViewState(null, null, null, null, null, 31, null));
        this._viewStateFlow = interfaceC16549BA;
        this.viewStateFlow = C16563h.c(interfaceC16549BA);
        InterfaceC16548A<a> interfaceC16548AB = C16555H.b(0, 0, null, 7, null);
        this._effectsFlow = interfaceC16548AB;
        this.effectsFlow = C16563h.b(interfaceC16548AB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r(List<String> sortByOptions, CouponsSortType sortType) {
        Integer next;
        if (sortType == null) {
            return -1;
        }
        Iterator<Integer> it = CollectionsKt.n(sortByOptions).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (StringsKt.H(sortByOptions.get(next.intValue()), sortType.getDisplayName(), true)) {
                break;
            }
        }
        Integer num = next;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    private final void s() {
        C15809k.d(d0.a(this), this.ioDispatcher, null, new c(this.viewStateFlow.getValue().e(), null), 2, null);
    }

    public final InterfaceC16553F<a> t() {
        return this.effectsFlow;
    }

    public final P<ViewState> u() {
        return this.viewStateFlow;
    }

    public final void v(Qk.c activeCouponPage, CouponOptions couponOptions, List<String> sortByOptions) {
        Intrinsics.j(activeCouponPage, "activeCouponPage");
        Intrinsics.j(couponOptions, "couponOptions");
        Intrinsics.j(sortByOptions, "sortByOptions");
        InterfaceC16549B<ViewState> interfaceC16549B = this._viewStateFlow;
        while (true) {
            ViewState value = interfaceC16549B.getValue();
            Qk.c cVar = activeCouponPage;
            CouponOptions couponOptions2 = couponOptions;
            List<String> list = sortByOptions;
            if (interfaceC16549B.e(value, ViewState.b(value, cVar, couponOptions2, null, null, list, 12, null))) {
                s();
                return;
            } else {
                activeCouponPage = cVar;
                couponOptions = couponOptions2;
                sortByOptions = list;
            }
        }
    }

    public final void w(k action) {
        ViewState value;
        ViewState viewState;
        CouponOptions couponOptions;
        CouponsSortType couponsSortTypeQ;
        ViewState value2;
        ViewState viewState2;
        CouponOptions couponOptions2;
        ViewState value3;
        ViewState viewState3;
        CouponOptions couponOptions3;
        ViewState value4;
        ViewState viewState4;
        ArrayList arrayList;
        CouponOptions couponOptions4;
        List<String> listE;
        ViewState value5;
        ViewState viewState5;
        List listJ1;
        CouponOptions couponOptions5;
        List<String> listE2;
        Intrinsics.j(action, "action");
        if (action instanceof k.CategorySelection) {
            InterfaceC16549B<ViewState> interfaceC16549B = this._viewStateFlow;
            do {
                value5 = interfaceC16549B.getValue();
                viewState5 = value5;
                List<Category> listD = viewState5.d();
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.f(MapsKt.f(CollectionsKt.x(listD, 10)), 16));
                for (Object obj : listD) {
                    linkedHashMap.put(((Category) obj).getCategoryID(), obj);
                }
                k.CategorySelection categorySelection = (k.CategorySelection) action;
                listJ1 = CollectionsKt.j1(MapsKt.v(linkedHashMap, TuplesKt.a(categorySelection.getCategory().getCategoryID(), categorySelection.getCategory())).values());
                couponOptions5 = viewState5.getCouponOptions();
                listE2 = viewState5.getCouponOptions().e();
                if (categorySelection.getCategory().getIsSelected()) {
                    String categoryID = categorySelection.getCategory().getCategoryID();
                    Intrinsics.g(categoryID);
                    listE2.add(categoryID);
                } else {
                    TypeIntrinsics.a(listE2).remove(categorySelection.getCategory().getCategoryID());
                }
            } while (!interfaceC16549B.e(value5, ViewState.b(viewState5, null, couponOptions5.a((8190 & 1) != 0 ? couponOptions5.categories : listE2, (8190 & 2) != 0 ? couponOptions5.searchCriteria : null, (8190 & 4) != 0 ? couponOptions5.sortType : null, (8190 & 8) != 0 ? couponOptions5.isShowCategoryHeaders : false, (8190 & 16) != 0 ? couponOptions5.isShowClippedCoupons : false, (8190 & 32) != 0 ? couponOptions5.rewardId : 0L, (8190 & 64) != 0 ? couponOptions5.tagId : null, (8190 & 128) != 0 ? couponOptions5.bundleName : null, (8190 & 256) != 0 ? couponOptions5.isShowOnlySpecialOffers : false, (8190 & 512) != 0 ? couponOptions5.offerIds : null, (8190 & 1024) != 0 ? couponOptions5.upcList : null, (8190 & RecyclerView.m.FLAG_MOVED) != 0 ? couponOptions5.isShowRedeemedOffers : false, (8190 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? couponOptions5.isShowSpecialOffers : false), null, listJ1, null, 21, null)));
            return;
        }
        if (Intrinsics.e(action, k.b.f19258a)) {
            InterfaceC16549B<ViewState> interfaceC16549B2 = this._viewStateFlow;
            do {
                value4 = interfaceC16549B2.getValue();
                viewState4 = value4;
                List<Category> listD2 = viewState4.d();
                arrayList = new ArrayList(CollectionsKt.x(listD2, 10));
                Iterator<T> it = listD2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Category.a((Category) it.next(), null, null, 0, false, false, 15, null));
                }
                couponOptions4 = viewState4.getCouponOptions();
                listE = viewState4.getCouponOptions().e();
                listE.clear();
            } while (!interfaceC16549B2.e(value4, ViewState.b(viewState4, null, couponOptions4.a((8190 & 1) != 0 ? couponOptions4.categories : listE, (8190 & 2) != 0 ? couponOptions4.searchCriteria : null, (8190 & 4) != 0 ? couponOptions4.sortType : null, (8190 & 8) != 0 ? couponOptions4.isShowCategoryHeaders : false, (8190 & 16) != 0 ? couponOptions4.isShowClippedCoupons : false, (8190 & 32) != 0 ? couponOptions4.rewardId : 0L, (8190 & 64) != 0 ? couponOptions4.tagId : null, (8190 & 128) != 0 ? couponOptions4.bundleName : null, (8190 & 256) != 0 ? couponOptions4.isShowOnlySpecialOffers : false, (8190 & 512) != 0 ? couponOptions4.offerIds : null, (8190 & 1024) != 0 ? couponOptions4.upcList : null, (8190 & RecyclerView.m.FLAG_MOVED) != 0 ? couponOptions4.isShowRedeemedOffers : false, (8190 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? couponOptions4.isShowSpecialOffers : false), null, arrayList, null, 21, null)));
            return;
        }
        if (action instanceof k.ShowCategoryHeaders) {
            InterfaceC16549B<ViewState> interfaceC16549B3 = this._viewStateFlow;
            do {
                value3 = interfaceC16549B3.getValue();
                viewState3 = value3;
                couponOptions3 = viewState3.getCouponOptions();
            } while (!interfaceC16549B3.e(value3, ViewState.b(viewState3, null, couponOptions3.a((8190 & 1) != 0 ? couponOptions3.categories : null, (8190 & 2) != 0 ? couponOptions3.searchCriteria : null, (8190 & 4) != 0 ? couponOptions3.sortType : null, (8190 & 8) != 0 ? couponOptions3.isShowCategoryHeaders : ((k.ShowCategoryHeaders) action).getChecked(), (8190 & 16) != 0 ? couponOptions3.isShowClippedCoupons : false, (8190 & 32) != 0 ? couponOptions3.rewardId : 0L, (8190 & 64) != 0 ? couponOptions3.tagId : null, (8190 & 128) != 0 ? couponOptions3.bundleName : null, (8190 & 256) != 0 ? couponOptions3.isShowOnlySpecialOffers : false, (8190 & 512) != 0 ? couponOptions3.offerIds : null, (8190 & 1024) != 0 ? couponOptions3.upcList : null, (8190 & RecyclerView.m.FLAG_MOVED) != 0 ? couponOptions3.isShowRedeemedOffers : false, (8190 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? couponOptions3.isShowSpecialOffers : false), null, null, null, 29, null)));
            return;
        }
        if (action instanceof k.ShowClippedCoupons) {
            InterfaceC16549B<ViewState> interfaceC16549B4 = this._viewStateFlow;
            do {
                value2 = interfaceC16549B4.getValue();
                viewState2 = value2;
                couponOptions2 = viewState2.getCouponOptions();
            } while (!interfaceC16549B4.e(value2, ViewState.b(viewState2, null, couponOptions2.a((8190 & 1) != 0 ? couponOptions2.categories : null, (8190 & 2) != 0 ? couponOptions2.searchCriteria : null, (8190 & 4) != 0 ? couponOptions2.sortType : null, (8190 & 8) != 0 ? couponOptions2.isShowCategoryHeaders : false, (8190 & 16) != 0 ? couponOptions2.isShowClippedCoupons : ((k.ShowClippedCoupons) action).getChecked(), (8190 & 32) != 0 ? couponOptions2.rewardId : 0L, (8190 & 64) != 0 ? couponOptions2.tagId : null, (8190 & 128) != 0 ? couponOptions2.bundleName : null, (8190 & 256) != 0 ? couponOptions2.isShowOnlySpecialOffers : false, (8190 & 512) != 0 ? couponOptions2.offerIds : null, (8190 & 1024) != 0 ? couponOptions2.upcList : null, (8190 & RecyclerView.m.FLAG_MOVED) != 0 ? couponOptions2.isShowRedeemedOffers : false, (8190 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? couponOptions2.isShowSpecialOffers : false), null, null, null, 29, null)));
            return;
        }
        if (action instanceof k.ShowSortOptions) {
            C15809k.d(d0.a(this), null, null, new d(action, null), 3, null);
            return;
        }
        if (!(action instanceof k.SelectSortOption)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC16549B<ViewState> interfaceC16549B5 = this._viewStateFlow;
        do {
            value = interfaceC16549B5.getValue();
            viewState = value;
            couponOptions = viewState.getCouponOptions();
            couponsSortTypeQ = q(viewState.h(), ((k.SelectSortOption) action).getSelectedSortTypeIndex());
            if (couponsSortTypeQ == null) {
                couponsSortTypeQ = CouponsSortType.RELEVANCE;
            }
        } while (!interfaceC16549B5.e(value, ViewState.b(viewState, null, couponOptions.a((8190 & 1) != 0 ? couponOptions.categories : null, (8190 & 2) != 0 ? couponOptions.searchCriteria : null, (8190 & 4) != 0 ? couponOptions.sortType : couponsSortTypeQ, (8190 & 8) != 0 ? couponOptions.isShowCategoryHeaders : false, (8190 & 16) != 0 ? couponOptions.isShowClippedCoupons : false, (8190 & 32) != 0 ? couponOptions.rewardId : 0L, (8190 & 64) != 0 ? couponOptions.tagId : null, (8190 & 128) != 0 ? couponOptions.bundleName : null, (8190 & 256) != 0 ? couponOptions.isShowOnlySpecialOffers : false, (8190 & 512) != 0 ? couponOptions.offerIds : null, (8190 & 1024) != 0 ? couponOptions.upcList : null, (8190 & RecyclerView.m.FLAG_MOVED) != 0 ? couponOptions.isShowRedeemedOffers : false, (8190 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? couponOptions.isShowSpecialOffers : false), null, null, null, 29, null)));
    }

    private final CouponsSortType q(List<String> sortByOptions, int selectedIndex) {
        if (selectedIndex < sortByOptions.size()) {
            return CouponsSortType.INSTANCE.a(sortByOptions.get(selectedIndex));
        }
        return null;
    }
}
