package com.meijer.mobile.meijer.activity.find.filter;

import Qo.FilterFacet;
import Qo.FilterFacetOption;
import Qo.FilterSortOption;
import Qo.l;
import android.annotation.SuppressLint;
import android.os.Parcelable;
import androidx.view.d0;
import bk.AbstractC6392a;
import com.meijer.mobile.meijer.Y;
import com.meijer.mobile.meijer.activity.find.filter.i;
import com.meijer.mobile.meijer.activity.find.filter.j;
import com.meijer.mobile.meijer.activity.find.filter.k;
import com.meijer.mobile.meijer.activity.find.filter.s;
import com.meijer.mobile.meijer.activity.personalized.modals.B0;
import ev.C13889a;
import fj.DeliveryMode;
import fj.EntryChange;
import fj.ShoppingCart;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16555H;
import pv.InterfaceC16548A;
import pv.InterfaceC16562g;
import uk.AbstractC17440a;
import ur.AbstractC17454a;
import vr.AbstractC17720a;
import wr.InterfaceC17909a;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010 \u001a\u00020\u00032\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001cH\u0002¢\u0006\u0004\b \u0010!J%\u0010'\u001a\u00020\u00032\u0006\u0010#\u001a\u00020\"2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0003H\u0003¢\u0006\u0004\b)\u0010\u0017J\u000f\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010\u0017J\u0017\u00100\u001a\u00020\u00032\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00122\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b2\u00103J\u001f\u00106\u001a\u0002042\u0006\u0010/\u001a\u00020.2\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b6\u00107J\u0019\u00109\u001a\u00020\"2\b\u00108\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u0002042\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u0002H\u0014¢\u0006\u0004\b>\u0010?J\u001f\u0010C\u001a\u00020\u00122\u000e\u0010B\u001a\n\u0012\u0004\u0012\u00020A\u0018\u00010@H\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bF\u0010GJ%\u0010I\u001a\u00020\u00122\u0006\u0010I\u001a\u00020H2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020J0@H\u0016¢\u0006\u0004\bI\u0010LJ)\u0010P\u001a\u00020\u0012\"\u0004\b\u0000\u0010;2\u0012\u0010O\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00028\u00000MH\u0016¢\u0006\u0004\bP\u0010QR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001a\u0010_\u001a\b\u0012\u0004\u0012\u0002040\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u001a\u0010c\u001a\u00060\"j\u0002``8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010e\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010bR\u0014\u0010h\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020.0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u001c\u0010o\u001a\b\u0012\u0004\u0012\u00020\"0$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0018\u0010s\u001a\u0004\u0018\u00010p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0011\u0010u\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\bt\u0010,R\u0014\u0010w\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010\u0017¨\u0006x"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/filter/o;", "LMk/a;", "Lcom/meijer/mobile/meijer/activity/find/filter/j;", "Lcom/meijer/mobile/meijer/activity/find/filter/k;", "Lcom/meijer/mobile/meijer/activity/find/filter/i;", "Lwr/a;", "Lcom/meijer/mobile/meijer/activity/personalized/modals/B0;", "productQueryPagingDataSource", "Lhi/a;", "analyticsEngine", "Lil/m;", "cartRepository", "Lwr/f;", "cartInteractor", "Lzl/k;", "featureManager", "<init>", "(Lcom/meijer/mobile/meijer/activity/personalized/modals/B0;Lhi/a;Lil/m;Lwr/f;Lzl/k;)V", "", "Z", "()V", "K", "Q", "()Lcom/meijer/mobile/meijer/activity/find/filter/k;", "LQo/g;", "sort", "W", "(LQo/g;)Lcom/meijer/mobile/meijer/activity/find/filter/k;", "Lkotlin/Pair;", "LQo/a;", "LQo/c;", "filterPair", "V", "(Lkotlin/Pair;)Lcom/meijer/mobile/meijer/activity/find/filter/k;", "", "name", "", "Lcom/meijer/mobile/meijer/activity/find/filter/s;", "content", "I", "(Ljava/lang/String;Ljava/util/List;)Lcom/meijer/mobile/meijer/activity/find/filter/k;", "J", "", "R", "()Z", "X", "LQo/l$k;", "query", "U", "(LQo/l$k;)Lcom/meijer/mobile/meijer/activity/find/filter/k;", "H", "(LQo/l$k;)V", "Lcom/meijer/mobile/meijer/activity/find/filter/k$b;", "pageState", "Y", "(LQo/l$k;Lcom/meijer/mobile/meijer/activity/find/filter/k$b;)Lcom/meijer/mobile/meijer/activity/find/filter/k$b;", "price", "N", "(Ljava/lang/String;)Ljava/lang/String;", "T", "(LQo/l$k;)Lcom/meijer/mobile/meijer/activity/find/filter/k$b;", "intent", "P", "(Lcom/meijer/mobile/meijer/activity/find/filter/j;)Lcom/meijer/mobile/meijer/activity/find/filter/k;", "Luk/c;", "Lfj/C;", "cartResource", "observeCart", "(Luk/c;)V", "LJu/a;", "getDisposable", "()LJu/a;", "Lur/a;", "processedRequest", "Lfj/j;", "entryChange", "(Lur/a;Luk/c;)V", "Luk/a;", "Lvr/a;", "challenge", "throwChallenge", "(Luk/a;)V", "f", "Lcom/meijer/mobile/meijer/activity/personalized/modals/B0;", "g", "Lhi/a;", "h", "Lil/m;", "i", "Lwr/f;", "j", "Lzl/k;", "Ljava/util/Stack;", "k", "Ljava/util/Stack;", "_contentHistory", "Lcom/meijer/mobile/core/model/common/ResourceId;", "l", "Ljava/lang/String;", "cartId", "m", "fulfillmentMode", "n", "LJu/a;", "disposables", "Lpv/A;", "o", "Lpv/A;", "_queryStore", "p", "Ljava/util/List;", "hiddenFacets", "LQo/l;", "q", "LQo/l;", "productQuery", "S", "isOnLandingPage", "O", "loadingState", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class o extends Mk.a<j, k, i> implements InterfaceC17909a {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final B0 productQueryPagingDataSource;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14523a analyticsEngine;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final il.m cartRepository;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final wr.f cartInteractor;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final zl.k featureManager;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Stack<k.SortAndFilterPageState> _contentHistory;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private String cartId;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private String fulfillmentMode;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16548A<l.k> _queryStore;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private List<String> hiddenFacets;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Qo.l productQuery;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.filter.FilterViewModel$1", f = "FilterViewModel.kt", l = {85}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107605a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.meijer.mobile.meijer.activity.find.filter.o$a$a, reason: collision with other inner class name */
        /* synthetic */ class C1615a implements InterfaceC16562g, FunctionAdapter {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f107607a;

            C1615a(o oVar) {
                this.f107607a = oVar;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC16562g) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.e(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.f107607a, o.class, "collectQuerySearchResultForUi", "collectQuerySearchResultForUi(Lcom/meijer/mobile/product/model/search/query/ProductQuery$SortableAndFilterable;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // pv.InterfaceC16562g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(l.k kVar, Continuation<? super Unit> continuation) {
                Object objG = a.g(this.f107607a, kVar, continuation);
                return objG == IntrinsicsKt.f() ? objG : Unit.f143329a;
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return o.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object g(o oVar, l.k kVar, Continuation continuation) {
            oVar.H(kVar);
            return Unit.f143329a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107605a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = o.this._queryStore;
                C1615a c1615a = new C1615a(o.this);
                this.f107605a = 1;
                if (interfaceC16548A.collect(c1615a, this) == objF) {
                    return objF;
                }
            }
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.filter.FilterViewModel$drillUpListItems$1$1", f = "FilterViewModel.kt", l = {271}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107608a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Parcelable f107610c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Parcelable parcelable, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f107610c = parcelable;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return o.this.new b(this.f107610c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107608a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                B0 b02 = o.this.productQueryPagingDataSource;
                Qo.l lVar = (Qo.l) this.f107610c;
                this.f107608a = 1;
                obj = b02.a(lVar, this);
                if (obj == objF) {
                    return objF;
                }
            }
            Qo.l lVar2 = (Qo.l) obj;
            o oVar = o.this;
            if (!lVar2.j() && !lVar2.getIsPending()) {
                Intrinsics.h(lVar2, "null cannot be cast to non-null type com.meijer.mobile.product.model.search.query.ProductQuery.SortableAndFilterable");
                oVar.x(oVar.T((l.k) lVar2));
            }
            Parcelable parcelable = this.f107610c;
            if (lVar2.getError() != null) {
                qw.a.INSTANCE.f(lVar2.getError(), "Failed to load query " + Reflection.b(parcelable.getClass()).u(), new Object[0]);
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.filter.FilterViewModel$setInitialProductQuery$1", f = "FilterViewModel.kt", l = {312}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107611a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l.k f107613c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return o.this.new c(this.f107613c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(l.k kVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f107613c = kVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107611a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = o.this._queryStore;
                l.k kVar = this.f107613c;
                l.k kVarX0 = kVar.x0(kVar.u3(), this.f107613c.c1(), this.f107613c.getSelectedSort(), this.f107613c.F3());
                this.f107611a = 1;
                if (interfaceC16548A.emit(kVarX0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.filter.FilterViewModel$setSelectedFilter$1", f = "FilterViewModel.kt", l = {174}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107614a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Pair<FilterFacet, FilterFacetOption> f107616c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Pair<FilterFacet, FilterFacetOption> pair, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f107616c = pair;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return o.this.new d(this.f107616c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LinkedHashMap linkedHashMap;
            List listQ0;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107614a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = o.this._queryStore;
                Object objD0 = CollectionsKt.D0(o.this._queryStore.d());
                Pair<FilterFacet, FilterFacetOption> pair = this.f107616c;
                l.k kVar = (l.k) objD0;
                Map<FilterFacet, List<FilterFacetOption>> mapF3 = kVar.F3();
                if (mapF3 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<FilterFacet, List<FilterFacetOption>> entry : mapF3.entrySet()) {
                        if (Intrinsics.e(entry.getKey().getName(), pair.c().getName())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                } else {
                    linkedHashMap = null;
                }
                Kn.a.f17577a.b(pair.c().getName(), pair.d().getDisplayName());
                if (kVar.F3() == null) {
                    kVar.n0(MapsKt.r(new Pair(pair.c(), CollectionsKt.e(pair.d()))));
                } else if (linkedHashMap != null && !linkedHashMap.isEmpty()) {
                    Map<FilterFacet, List<FilterFacetOption>> mapF32 = kVar.F3();
                    Intrinsics.g(mapF32);
                    Object objR0 = CollectionsKt.r0(linkedHashMap.keySet());
                    Map<FilterFacet, List<FilterFacetOption>> mapF33 = kVar.F3();
                    Intrinsics.g(mapF33);
                    List<FilterFacetOption> list = mapF33.get(CollectionsKt.r0(linkedHashMap.keySet()));
                    Intrinsics.h(list, "null cannot be cast to non-null type kotlin.collections.List<com.meijer.mobile.product.model.search.query.FilterFacetOption>");
                    List<FilterFacetOption> list2 = list;
                    List<FilterFacetOption> list3 = list2;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list3) {
                        if (Intrinsics.e(((FilterFacetOption) obj2).getValue(), pair.d().getValue())) {
                            arrayList.add(obj2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        listQ0 = CollectionsKt.L0(list3, arrayList);
                    } else {
                        listQ0 = CollectionsKt.Q0(list2, pair.d());
                    }
                    mapF32.put(objR0, listQ0);
                } else {
                    Map<FilterFacet, List<FilterFacetOption>> mapF34 = kVar.F3();
                    Intrinsics.g(mapF34);
                    mapF34.put(pair.c(), CollectionsKt.e(pair.d()));
                }
                this.f107614a = 1;
                if (interfaceC16548A.emit(objD0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.activity.find.filter.FilterViewModel$setSelectedSort$1", f = "FilterViewModel.kt", l = {161}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f107617a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ FilterSortOption f107619c;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return o.this.new e(this.f107619c, continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(FilterSortOption filterSortOption, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f107619c = filterSortOption;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((e) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f107617a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC16548A interfaceC16548A = o.this._queryStore;
                Object objD0 = CollectionsKt.D0(o.this._queryStore.d());
                ((l.k) objD0).q1(this.f107619c);
                this.f107617a = 1;
                if (interfaceC16548A.emit(objD0, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    private final String N(String price) {
        List listB1 = price != null ? StringsKt.b1(price, new String[]{"-"}, false, 0, 6, null) : null;
        Integer numValueOf = listB1 != null ? Integer.valueOf(listB1.size()) : null;
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return '$' + ((String) listB1.get(0));
        }
        if (numValueOf == null || numValueOf.intValue() != 2) {
            return "";
        }
        return '$' + StringsKt.C1((String) listB1.get(0)).toString() + " - $" + StringsKt.C1((String) listB1.get(1)).toString();
    }

    @Override // wr.InterfaceC17909a
    public void processedRequest(AbstractC17454a processedRequest, uk.c<EntryChange> entryChange) {
        Intrinsics.j(processedRequest, "processedRequest");
        Intrinsics.j(entryChange, "entryChange");
    }

    @Override // wr.InterfaceC17909a
    public <T> void throwChallenge(AbstractC17440a<AbstractC17720a, T> challenge) {
        Intrinsics.j(challenge, "challenge");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(B0 productQueryPagingDataSource, InterfaceC14523a analyticsEngine, il.m cartRepository, wr.f cartInteractor, zl.k featureManager) {
        super(new k.Loading(false, 1, null));
        Intrinsics.j(productQueryPagingDataSource, "productQueryPagingDataSource");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        Intrinsics.j(cartRepository, "cartRepository");
        Intrinsics.j(cartInteractor, "cartInteractor");
        Intrinsics.j(featureManager, "featureManager");
        this.productQueryPagingDataSource = productQueryPagingDataSource;
        this.analyticsEngine = analyticsEngine;
        this.cartRepository = cartRepository;
        this.cartInteractor = cartInteractor;
        this.featureManager = featureManager;
        this._contentHistory = new Stack<>();
        this.cartId = "-1";
        this.fulfillmentMode = "RESOURCE_ID_UNASSIGNED";
        this.disposables = new Ju.a();
        this._queryStore = C16555H.b(3, 0, null, 6, null);
        C15809k.d(d0.a(this), null, null, new a(null), 3, null);
        K();
        wr.f.r(cartInteractor, false, this, 1, null);
        cartInteractor.p();
        this.hiddenFacets = featureManager.d(AbstractC18503f.D.f172845h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(l.k query) {
        if (this._contentHistory.isEmpty()) {
            this._contentHistory.push(T(query));
        } else {
            Stack<k.SortAndFilterPageState> stack = this._contentHistory;
            k.SortAndFilterPageState sortAndFilterPageStatePop = stack.pop();
            Intrinsics.i(sortAndFilterPageStatePop, "pop(...)");
            stack.push(Y(query, sortAndFilterPageStatePop));
        }
        k.SortAndFilterPageState sortAndFilterPageStatePeek = this._contentHistory.peek();
        Intrinsics.i(sortAndFilterPageStatePeek, "peek(...)");
        x(sortAndFilterPageStatePeek);
    }

    private final k I(String name, List<? extends s> content) {
        this._contentHistory.push(Y((l.k) CollectionsKt.D0(this._queryStore.d()), new k.SortAndFilterPageState(content, name, false, false)));
        k.SortAndFilterPageState sortAndFilterPageStatePeek = this._contentHistory.peek();
        Intrinsics.i(sortAndFilterPageStatePeek, "peek(...)");
        return sortAndFilterPageStatePeek;
    }

    @SuppressLint({"CheckResult"})
    private final k J() {
        Parcelable parcelableV;
        if (this._contentHistory.size() < 2) {
            return R() ? X() : (k) Mk.a.w(this, i.b.f107570a, false, 2, null);
        }
        Qo.l lVar = this.productQuery;
        if (lVar instanceof l.Department) {
            Intrinsics.g(lVar);
            parcelableV = l.Department.v((l.Department) lVar, null, 0, 0, null, null, 0, null, false, null, null, null, null, ((l.k) CollectionsKt.D0(this._queryStore.d())).F3(), ((l.k) CollectionsKt.D0(this._queryStore.d())).getSelectedSort(), null, 20479, null);
        } else if (lVar instanceof l.Search) {
            Intrinsics.g(lVar);
            parcelableV = l.Search.v((l.Search) lVar, null, null, null, 0, 0, null, null, 0, null, false, null, null, ((l.k) CollectionsKt.D0(this._queryStore.d())).F3(), ((l.k) CollectionsKt.D0(this._queryStore.d())).getSelectedSort(), null, null, null, null, null, 511999, null);
        } else if (lVar instanceof l.BrowseCollection) {
            Intrinsics.g(lVar);
            parcelableV = l.BrowseCollection.v((l.BrowseCollection) lVar, null, 0, 0, null, null, 0, null, false, null, null, null, ((l.k) CollectionsKt.D0(this._queryStore.d())).F3(), ((l.k) CollectionsKt.D0(this._queryStore.d())).getSelectedSort(), null, null, 26623, null);
        } else {
            parcelableV = null;
        }
        if (parcelableV != null) {
            C15809k.d(d0.a(this), null, null, new b(parcelableV, null), 3, null);
        }
        this._contentHistory.pop();
        k.SortAndFilterPageState sortAndFilterPageStatePeek = this._contentHistory.peek();
        Intrinsics.i(sortAndFilterPageStatePeek, "peek(...)");
        return Y((l.k) CollectionsKt.D0(this._queryStore.d()), sortAndFilterPageStatePeek);
    }

    private final void K() {
        io.reactivex.l<String> lVarSubscribeOn = this.cartRepository.N().subscribeOn(C13889a.b());
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.activity.find.filter.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o.L(this.f107590a, (String) obj);
            }
        };
        Dk.a.a(lVarSubscribeOn.subscribe(new Lu.g() { // from class: com.meijer.mobile.meijer.activity.find.filter.m
            @Override // Lu.g
            public final void accept(Object obj) {
                o.M(function1, obj);
            }
        }), this.disposables);
    }

    private final k Q() {
        l.k kVar = (l.k) CollectionsKt.D0(this._queryStore.d());
        kVar.n0(null);
        kVar.q1(null);
        Mk.a.w(this, new i.FinishWithResult(kVar), false, 2, null);
        return new k.Loading(true);
    }

    private final boolean R() {
        return this._queryStore.d().size() > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k.SortAndFilterPageState T(l.k query) {
        String displayName;
        s headerItem;
        ArrayList arrayList = new ArrayList();
        int i10 = 10;
        if (query.c1().isEmpty()) {
            List<FilterSortOption> listU3 = query.u3();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.x(listU3, 10));
            for (FilterSortOption filterSortOption : listU3) {
                String displayName2 = filterSortOption.getDisplayName();
                FilterSortOption selectedSort = query.getSelectedSort();
                arrayList2.add(new s.SimpleSortItem(filterSortOption, Intrinsics.e(displayName2, selectedSort != null ? selectedSort.getDisplayName() : null)));
            }
            arrayList.addAll(arrayList2);
        } else {
            List<FilterSortOption> listU32 = query.u3();
            ArrayList arrayList3 = new ArrayList(CollectionsKt.x(listU32, 10));
            for (FilterSortOption filterSortOption2 : listU32) {
                String displayName3 = filterSortOption2.getDisplayName();
                FilterSortOption selectedSort2 = query.getSelectedSort();
                arrayList3.add(new s.SimpleSortItem(filterSortOption2, Intrinsics.e(displayName3, selectedSort2 != null ? selectedSort2.getDisplayName() : null)));
            }
            Integer numValueOf = Integer.valueOf(Cj.o.f5018G0);
            FilterSortOption selectedSort3 = query.getSelectedSort();
            if (selectedSort3 == null || (displayName = selectedSort3.getDisplayName()) == null) {
                displayName = "Relevance";
            }
            arrayList.add(new s.DrillDownItem(arrayList3, null, numValueOf, displayName, false, 16, null));
            arrayList.add(new s.HeaderItem(AbstractC6392a.INSTANCE.d(Y.f100493J5, new Object[0]), false, 2, null));
            List<FilterFacet> listC1 = query.c1();
            ArrayList<FilterFacet> arrayList4 = new ArrayList();
            for (Object obj : listC1) {
                if (!this.hiddenFacets.contains(((FilterFacet) obj).getName())) {
                    arrayList4.add(obj);
                }
            }
            ArrayList arrayList5 = new ArrayList(CollectionsKt.x(arrayList4, 10));
            for (FilterFacet filterFacet : arrayList4) {
                if (filterFacet.b() != null) {
                    List<FilterFacetOption> listB = filterFacet.b();
                    Intrinsics.g(listB);
                    List<FilterFacetOption> list = listB;
                    ArrayList arrayList6 = new ArrayList(CollectionsKt.x(list, i10));
                    for (FilterFacetOption filterFacetOption : list) {
                        ArrayList arrayList7 = arrayList6;
                        arrayList7.add(new s.SimpleFilterItem(filterFacet, filterFacetOption, Integer.valueOf(filterFacetOption.getCount()), false, 8, null));
                        arrayList6 = arrayList7;
                    }
                    ArrayList arrayList8 = arrayList6;
                    String displayName4 = filterFacet.getDisplayName();
                    if (displayName4 == null) {
                        displayName4 = filterFacet.getName();
                    }
                    headerItem = new s.DrillDownItem(arrayList8, displayName4, null, null, false, 16, null);
                } else {
                    AbstractC6392a.Companion companion = AbstractC6392a.INSTANCE;
                    String displayName5 = filterFacet.getDisplayName();
                    if (displayName5 == null) {
                        displayName5 = filterFacet.getName();
                    }
                    headerItem = new s.HeaderItem(companion.c(displayName5), false, 2, null);
                }
                arrayList5.add(headerItem);
                i10 = 10;
            }
            arrayList.addAll(arrayList5);
        }
        return Y((l.k) CollectionsKt.D0(this._queryStore.d()), new k.SortAndFilterPageState(arrayList, null, query.c1().isEmpty(), false));
    }

    private final k X() {
        return (k) Mk.a.w(this, new i.ShowSaveChangesDialogEvent(Y.f100569N5, Y.f100512K5, Y.f100550M5, Y.f100531L5), false, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.meijer.mobile.meijer.activity.find.filter.k.SortAndFilterPageState Y(Qo.l.k r17, com.meijer.mobile.meijer.activity.find.filter.k.SortAndFilterPageState r18) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meijer.mobile.meijer.activity.find.filter.o.Y(Qo.l$k, com.meijer.mobile.meijer.activity.find.filter.k$b):com.meijer.mobile.meijer.activity.find.filter.k$b");
    }

    private final void Z() {
        this.analyticsEngine.b(C14756c.a("filter updated"), new Function1() { // from class: com.meijer.mobile.meijer.activity.find.filter.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o.a0(this.f107592a, (TrackingData) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(o oVar, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.n("Product Search Results Page");
        track.v("search");
        track.h("fulfillmentType", oVar.fulfillmentMode);
        track.h("cartID", oVar.cartId);
        track.h("&&events", "event33");
        track.h("productFilterBy", Kn.a.f17577a.a());
        return Unit.f143329a;
    }

    @Override // Mk.a
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public k q() {
        return new k.Loading(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // Mk.a
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public k s(j intent) {
        Intrinsics.j(intent, "intent");
        if (intent instanceof j.LoadItems) {
            return U(((j.LoadItems) intent).getQuery());
        }
        if (intent instanceof j.SelectSort) {
            return W(((j.SelectSort) intent).getFilterSortOption());
        }
        if (intent instanceof j.SelectFilter) {
            return V(((j.SelectFilter) intent).a());
        }
        if (intent instanceof j.e) {
            Z();
            return (k) Mk.a.w(this, new i.FinishWithResult((l.k) CollectionsKt.D0(this._queryStore.d())), false, 2, null);
        }
        if (intent instanceof j.c) {
            return J();
        }
        if (intent instanceof j.DrillDown) {
            j.DrillDown drillDown = (j.DrillDown) intent;
            return I(drillDown.getName(), drillDown.a());
        }
        if (intent instanceof j.d) {
            return Q();
        }
        if (!(intent instanceof j.SetQuery)) {
            throw new NoWhenBranchMatchedException();
        }
        this.productQuery = ((j.SetQuery) intent).getQuery();
        return new k.Loading(false);
    }

    public final boolean S() {
        return this._contentHistory.size() == 1;
    }

    @Override // wr.InterfaceC17909a
    /* renamed from: getDisposable, reason: from getter */
    public Ju.a getDisposables() {
        return this.disposables;
    }

    @Override // wr.InterfaceC17909a
    public void observeCart(uk.c<ShoppingCart> cartResource) {
        ShoppingCart shoppingCartA;
        DeliveryMode deliveryMode;
        this.fulfillmentMode = (cartResource == null || (shoppingCartA = cartResource.a()) == null || (deliveryMode = shoppingCartA.getDeliveryMode()) == null || !deliveryMode.c()) ? "pickup" : "delivery";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(o oVar, String str) {
        Intrinsics.g(str);
        oVar.cartId = str;
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final k U(l.k query) {
        C15809k.d(d0.a(this), null, null, new c(query, null), 3, null);
        return new k.Loading(false, 1, null);
    }

    private final k V(Pair<FilterFacet, FilterFacetOption> filterPair) {
        C15809k.d(d0.a(this), null, null, new d(filterPair, null), 3, null);
        return new k.Loading(true);
    }

    private final k W(FilterSortOption sort) {
        C15809k.d(d0.a(this), null, null, new e(sort, null), 3, null);
        return new k.Loading(true);
    }
}
