package So;

import Co.Department;
import Co.ProductFullDetails;
import Go.SuggestionResult;
import Qo.FilterFacet;
import Qo.FilterFacetOption;
import Qo.FilterSortOption;
import So.MultiUPCQuery;
import So.ProductCollectionQuery;
import So.ProductDepartmentQuery;
import So.ProductDetailQuery;
import So.ProductSearchQuery;
import Xo.ProductFilterInput;
import Xo.ProductSortInput;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.NoDataException;
import com.meijer.mobile.product.service.apollo.exception.ProductCollectionNotFoundException;
import com.meijer.mobile.product.service.apollo.exception.ProductDepartmentNotFoundException;
import com.meijer.mobile.product.service.apollo.exception.ProductNotFoundException;
import com.meijer.mobile.product.service.apollo.exception.ProductSearchException;
import cp.InterfaceC13545a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.C15805i;
import mv.InterfaceC15783O;
import y6.C18291a;
import y6.C18292b;
import yo.k;
import z6.AbstractC18451C;
import z6.C18456e;
import zu.v;

@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u000e0\u0011*\u001c\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\fj\u0004\u0018\u0001`\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0011*\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0080@¢\u0006\u0004\b\u001f\u0010 J(\u0010'\u001a\u00020&2\n\u0010#\u001a\u00060!j\u0002`\"2\n\u0010%\u001a\u00060\u0019j\u0002`$H\u0096@¢\u0006\u0004\b'\u0010(J.\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u000e2\n\u0010%\u001a\u00060\u0019j\u0002`$2\n\u0010#\u001a\u00060!j\u0002`\"H\u0086@¢\u0006\u0004\b*\u0010+J\u0018\u0010.\u001a\u00020-2\u0006\u0010\u001d\u001a\u00020,H\u0080@¢\u0006\u0004\b.\u0010/Jj\u00107\u001a\u0002062\n\u0010#\u001a\u00060!j\u0002`\"2\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020!2\b\u00103\u001a\u0004\u0018\u0001022 \u00104\u001a\u001c\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\fj\u0004\u0018\u0001`\u00102\b\u00105\u001a\u0004\u0018\u00010\u0015H\u0096@¢\u0006\u0004\b7\u00108J4\u0010:\u001a\b\u0012\u0004\u0012\u00020&0\u000e2\n\u0010#\u001a\u00060!j\u0002`\"2\u0010\u00109\u001a\f\u0012\b\u0012\u00060\u0019j\u0002`$0\u000eH\u0096@¢\u0006\u0004\b:\u0010;J\u0018\u0010>\u001a\u00020=2\u0006\u0010\u001d\u001a\u00020<H\u0080@¢\u0006\u0004\b>\u0010?Jj\u0010A\u001a\u0002062\n\u0010#\u001a\u00060!j\u0002`\"2\u0006\u0010@\u001a\u00020\u00192\u0006\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020!2\b\u00103\u001a\u0004\u0018\u0001022\b\u00105\u001a\u0004\u0018\u00010\u00152 \u00104\u001a\u001c\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\fj\u0004\u0018\u0001`\u0010H\u0096@¢\u0006\u0004\bA\u0010BJ\u0018\u0010E\u001a\u00020D2\u0006\u0010\u001d\u001a\u00020CH\u0080@¢\u0006\u0004\bE\u0010FJj\u0010H\u001a\u0002062\n\u0010#\u001a\u00060!j\u0002`\"2\u0006\u0010G\u001a\u00020\u00192\u0006\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020!2\b\u00103\u001a\u0004\u0018\u0001022\b\u00105\u001a\u0004\u0018\u00010\u00152 \u00104\u001a\u001c\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0018\u00010\fj\u0004\u0018\u0001`\u0010H\u0096@¢\u0006\u0004\bH\u0010BJ$\u0010J\u001a\u00020I2\n\u0010#\u001a\u00060!j\u0002`\"2\u0006\u0010\u001d\u001a\u00020\u0019H\u0096@¢\u0006\u0004\bJ\u0010(J\u001e\u0010L\u001a\u0004\u0018\u00010K2\n\u0010#\u001a\u00060!j\u0002`\"H\u0096@¢\u0006\u0004\bL\u0010MR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010NR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010OR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010PR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010QR\u0014\u0010S\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010NR\u0014\u0010T\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010N¨\u0006U"}, d2 = {"LSo/b;", "Lcp/a;", "Ly6/b;", "apolloClient", "Lzu/v;", "constructorIo", "Lyo/k;", "userManager", "Lmv/K;", "ioDispatcher", "<init>", "(Ly6/b;Lzu/v;Lyo/k;Lmv/K;)V", "", "LQo/a;", "", "LQo/c;", "Lcom/meijer/mobile/product/model/search/query/SelectedFilterFacets;", "Lz6/C;", "LXo/a;", "v", "(Ljava/util/Map;)Lz6/C;", "LQo/g;", "LXo/c;", "u", "(LQo/g;)Lz6/C;", "", "o", "()Lz6/C;", "LSo/f;", "query", "LSo/f$k;", "p", "(LSo/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "Lcom/meijer/mobile/core/models/products/ProductCode;", "productCode", "LCo/h;", "b", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LCo/k;", "r", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LSo/g;", "LSo/g$q;", "q", "(LSo/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pageSize", "currentPage", "LPo/a;", "cursor", "selectedFacets", "selectedSort", "LOo/b;", "h", "(ILjava/lang/String;IILPo/a;Ljava/util/Map;LQo/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upcs", "a", "(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LSo/e;", "LSo/e$f;", "t", "(LSo/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "categoryCode", "f", "(ILjava/lang/String;IILPo/a;LQo/g;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LSo/d;", "LSo/d$d;", "s", "(LSo/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectionId", "d", "LGo/d;", "c", "LCo/b;", "g", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ly6/b;", "Lzu/v;", "Lyo/k;", "Lmv/K;", "e", "searchClient", "collectionClient", "apollo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class b implements InterfaceC13545a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C18292b apolloClient;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v constructorIo;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k userManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C18292b searchClient;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C18292b collectionClient;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmv/O;", "", "LCo/h;", "<anonymous>", "(Lmv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.service.apollo.ApolloProductDataSource$getMultiUpc$2", f = "ApolloProductDataSource.kt", l = {288}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super List<? extends ProductFullDetails>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f34930a;

        /* renamed from: b, reason: collision with root package name */
        int f34931b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<String> f34932c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f34933d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b f34934e;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super List<? extends ProductFullDetails>> continuation) {
            return invoke2(interfaceC15783O, (Continuation<? super List<ProductFullDetails>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(List<String> list, int i10, b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f34932c = list;
            this.f34933d = i10;
            this.f34934e = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f34932c, this.f34933d, this.f34934e, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC15783O interfaceC15783O, Continuation<? super List<ProductFullDetails>> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws ProductNotFoundException {
            List<MultiUPCQuery.ProductsMultiUpc> listA;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f34931b;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                MultiUPCQuery multiUPCQuery = new MultiUPCQuery(this.f34932c, this.f34933d);
                C18291a c18291aW = this.f34934e.apolloClient.w(multiUPCQuery);
                this.f34930a = multiUPCQuery;
                this.f34931b = 1;
                obj = c18291aW.b(this);
                if (obj == objF) {
                    return objF;
                }
            }
            C18456e c18456e = (C18456e) obj;
            ApolloException apolloException = c18456e.exception;
            if (apolloException == null) {
                MultiUPCQuery.Data data = (MultiUPCQuery.Data) c18456e.data;
                if (data != null && (listA = data.a()) != null) {
                    List<MultiUPCQuery.ProductsMultiUpc> list = listA;
                    int i11 = this.f34933d;
                    ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Wo.a.e((MultiUPCQuery.ProductsMultiUpc) it.next(), Boxing.d(i11)));
                    }
                    return arrayList;
                }
                throw new ProductNotFoundException();
            }
            Intrinsics.g(apolloException);
            throw Vo.a.a(apolloException);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.product.service.apollo.ApolloProductDataSource", f = "ApolloProductDataSource.kt", l = {133}, m = "getProductDetails")
    /* renamed from: So.b$b, reason: collision with other inner class name */
    static final class C0782b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        int f34935a;

        /* renamed from: b, reason: collision with root package name */
        Object f34936b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f34937c;

        /* renamed from: e, reason: collision with root package name */
        int f34939e;

        C0782b(Continuation<? super C0782b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34937c = obj;
            this.f34939e |= Integer.MIN_VALUE;
            return b.this.b(0, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LSo/f$k;", "<anonymous>", "(Lmv/O;)LSo/f$k;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.service.apollo.ApolloProductDataSource$getProductDetailsResponse$2", f = "ApolloProductDataSource.kt", l = {98}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ProductDetailQuery.Product>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f34940a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductDetailQuery f34942c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ProductDetailQuery productDetailQuery, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f34942c = productDetailQuery;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new c(this.f34942c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ProductDetailQuery.Product> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws ProductNotFoundException {
            ProductDetailQuery.Product product;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f34940a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C18291a c18291aW = b.this.apolloClient.w(this.f34942c);
                this.f34940a = 1;
                obj = c18291aW.b(this);
                if (obj == objF) {
                    return objF;
                }
            }
            C18456e c18456e = (C18456e) obj;
            qw.a.INSTANCE.z("ApolloProductDetailsQueryResponse").q(String.valueOf(c18456e.data), new Object[0]);
            ApolloException apolloException = c18456e.exception;
            if (apolloException == null) {
                ProductDetailQuery.Data data = (ProductDetailQuery.Data) c18456e.data;
                if (data != null && (product = data.getProduct()) != null) {
                    return product;
                }
                throw new ProductNotFoundException();
            }
            Intrinsics.g(apolloException);
            throw Vo.a.a(apolloException);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LSo/g$q;", "<anonymous>", "(Lmv/O;)LSo/g$q;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.service.apollo.ApolloProductDataSource$getProductSearchResponse$2", f = "ApolloProductDataSource.kt", l = {219}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ProductSearchQuery.Search>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f34943a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductSearchQuery f34945c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ProductSearchQuery productSearchQuery, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f34945c = productSearchQuery;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new d(this.f34945c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ProductSearchQuery.Search> continuation) {
            return ((d) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws ProductSearchException {
            ProductSearchQuery.Search search;
            ProductSearchQuery.OnSearchProductDisplayResult onSearchProductDisplayResult;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f34943a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C18291a c18291aW = b.this.searchClient.w(this.f34945c);
                this.f34943a = 1;
                obj = c18291aW.b(this);
                if (obj == objF) {
                    return objF;
                }
            }
            C18456e c18456e = (C18456e) obj;
            qw.a.INSTANCE.z("ApolloSearchProductQueryResponse").q(String.valueOf(c18456e.data), new Object[0]);
            ApolloException apolloException = c18456e.exception;
            if (apolloException == null) {
                ProductSearchQuery.Data data = (ProductSearchQuery.Data) c18456e.data;
                ProductSearchQuery.Search search2 = null;
                if (data != null) {
                    search = data.getSearch();
                } else {
                    search = null;
                }
                if (search != null) {
                    onSearchProductDisplayResult = search.getOnSearchProductDisplayResult();
                } else {
                    onSearchProductDisplayResult = null;
                }
                if (onSearchProductDisplayResult != null) {
                    search2 = search;
                }
                if (search2 != null) {
                    return search2;
                }
                throw new ProductSearchException();
            }
            Intrinsics.g(apolloException);
            throw Vo.a.a(apolloException);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.product.service.apollo.ApolloProductDataSource", f = "ApolloProductDataSource.kt", l = {168}, m = "getProductVariants")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f34946a;

        /* renamed from: b, reason: collision with root package name */
        Object f34947b;

        /* renamed from: c, reason: collision with root package name */
        Object f34948c;

        /* renamed from: d, reason: collision with root package name */
        Object f34949d;

        /* renamed from: e, reason: collision with root package name */
        Object f34950e;

        /* renamed from: f, reason: collision with root package name */
        int f34951f;

        /* renamed from: g, reason: collision with root package name */
        int f34952g;

        /* renamed from: h, reason: collision with root package name */
        int f34953h;

        /* renamed from: i, reason: collision with root package name */
        int f34954i;

        /* renamed from: j, reason: collision with root package name */
        int f34955j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f34956k;

        /* renamed from: m, reason: collision with root package name */
        int f34958m;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34956k = obj;
            this.f34958m |= Integer.MIN_VALUE;
            return b.this.r(null, 0, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.product.service.apollo.ApolloProductDataSource", f = "ApolloProductDataSource.kt", l = {470}, m = "getProductsForCollection")
    static final class f extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        int f34959a;

        /* renamed from: b, reason: collision with root package name */
        int f34960b;

        /* renamed from: c, reason: collision with root package name */
        int f34961c;

        /* renamed from: d, reason: collision with root package name */
        Object f34962d;

        /* renamed from: e, reason: collision with root package name */
        Object f34963e;

        /* renamed from: f, reason: collision with root package name */
        Object f34964f;

        /* renamed from: g, reason: collision with root package name */
        Object f34965g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f34966h;

        /* renamed from: j, reason: collision with root package name */
        int f34968j;

        f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34966h = obj;
            this.f34968j |= Integer.MIN_VALUE;
            return b.this.d(0, null, 0, 0, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LSo/d$d;", "<anonymous>", "(Lmv/O;)LSo/d$d;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.service.apollo.ApolloProductDataSource$getProductsForCollectionResponse$2", f = "ApolloProductDataSource.kt", l = {432}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ProductCollectionQuery.Collection>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f34969a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductCollectionQuery f34971c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ProductCollectionQuery productCollectionQuery, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f34971c = productCollectionQuery;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new g(this.f34971c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ProductCollectionQuery.Collection> continuation) {
            return ((g) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws ProductCollectionNotFoundException {
            ProductCollectionQuery.Collection collection;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f34969a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C18291a c18291aW = b.this.collectionClient.w(this.f34971c);
                this.f34969a = 1;
                obj = c18291aW.b(this);
                if (obj == objF) {
                    return objF;
                }
            }
            C18456e c18456e = (C18456e) obj;
            ApolloException apolloException = c18456e.exception;
            if (apolloException == null) {
                ProductCollectionQuery.Data data = (ProductCollectionQuery.Data) c18456e.data;
                if (data != null && (collection = data.getCollection()) != null) {
                    return collection;
                }
                throw new ProductCollectionNotFoundException();
            }
            Intrinsics.g(apolloException);
            throw Vo.a.a(apolloException);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.product.service.apollo.ApolloProductDataSource", f = "ApolloProductDataSource.kt", l = {375}, m = "getProductsForDepartment")
    static final class h extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        int f34972a;

        /* renamed from: b, reason: collision with root package name */
        int f34973b;

        /* renamed from: c, reason: collision with root package name */
        int f34974c;

        /* renamed from: d, reason: collision with root package name */
        Object f34975d;

        /* renamed from: e, reason: collision with root package name */
        Object f34976e;

        /* renamed from: f, reason: collision with root package name */
        Object f34977f;

        /* renamed from: g, reason: collision with root package name */
        Object f34978g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f34979h;

        /* renamed from: j, reason: collision with root package name */
        int f34981j;

        h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34979h = obj;
            this.f34981j |= Integer.MIN_VALUE;
            return b.this.f(0, null, 0, 0, null, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LSo/e$f;", "<anonymous>", "(Lmv/O;)LSo/e$f;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.service.apollo.ApolloProductDataSource$getProductsForDepartmentResponse$2", f = "ApolloProductDataSource.kt", l = {337}, m = "invokeSuspend")
    static final class i extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super ProductDepartmentQuery.Department>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f34982a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ProductDepartmentQuery f34984c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(ProductDepartmentQuery productDepartmentQuery, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f34984c = productDepartmentQuery;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new i(this.f34984c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super ProductDepartmentQuery.Department> continuation) {
            return ((i) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws ProductDepartmentNotFoundException {
            ProductDepartmentQuery.Department department;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f34982a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C18291a c18291aW = b.this.collectionClient.w(this.f34984c);
                this.f34982a = 1;
                obj = c18291aW.b(this);
                if (obj == objF) {
                    return objF;
                }
            }
            C18456e c18456e = (C18456e) obj;
            ApolloException apolloException = c18456e.exception;
            if (apolloException == null) {
                ProductDepartmentQuery.Data data = (ProductDepartmentQuery.Data) c18456e.data;
                if (data != null && (department = data.getDepartment()) != null) {
                    return department;
                }
                throw new ProductDepartmentNotFoundException();
            }
            Intrinsics.g(apolloException);
            throw Vo.a.a(apolloException);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.product.service.apollo.ApolloProductDataSource", f = "ApolloProductDataSource.kt", l = {259}, m = "getSearchResults")
    static final class j extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        int f34985a;

        /* renamed from: b, reason: collision with root package name */
        int f34986b;

        /* renamed from: c, reason: collision with root package name */
        int f34987c;

        /* renamed from: d, reason: collision with root package name */
        Object f34988d;

        /* renamed from: e, reason: collision with root package name */
        Object f34989e;

        /* renamed from: f, reason: collision with root package name */
        Object f34990f;

        /* renamed from: g, reason: collision with root package name */
        Object f34991g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f34992h;

        /* renamed from: j, reason: collision with root package name */
        int f34994j;

        j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f34992h = obj;
            this.f34994j |= Integer.MIN_VALUE;
            return b.this.h(0, null, 0, 0, null, null, null, this);
        }
    }

    public b(C18292b apolloClient, v constructorIo, k userManager, AbstractC15779K ioDispatcher) {
        Intrinsics.j(apolloClient, "apolloClient");
        Intrinsics.j(constructorIo, "constructorIo");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.apolloClient = apolloClient;
        this.constructorIo = constructorIo;
        this.userManager = userManager;
        this.ioDispatcher = ioDispatcher;
        this.searchClient = apolloClient.u().a("x-meijer-gql-query", "search").c();
        this.collectionClient = apolloClient.u().a("x-meijer-gql-query", "browse").c();
    }

    private final AbstractC18451C<String> o() {
        return this.userManager.b() ? AbstractC18451C.INSTANCE.c(this.userManager.a()) : AbstractC18451C.INSTANCE.a();
    }

    private final AbstractC18451C<ProductSortInput> u(FilterSortOption filterSortOption) {
        if (filterSortOption == null) {
            return AbstractC18451C.INSTANCE.a();
        }
        AbstractC18451C.Companion companion = AbstractC18451C.INSTANCE;
        return companion.b(new ProductSortInput(filterSortOption.getSortBy(), companion.c(filterSortOption.getSortOrder())));
    }

    private final AbstractC18451C<List<ProductFilterInput>> v(Map<FilterFacet, List<FilterFacetOption>> map) {
        if (map == null || map.isEmpty()) {
            return AbstractC18451C.INSTANCE.a();
        }
        AbstractC18451C.Companion companion = AbstractC18451C.INSTANCE;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<FilterFacet, List<FilterFacetOption>> entry : map.entrySet()) {
            arrayList.add(new ProductFilterInput(entry.getKey().getName(), CollectionsKt.B0(entry.getValue(), ",", null, null, 0, null, new Function1() { // from class: So.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b.w((FilterFacetOption) obj);
                }
            }, 30, null)));
        }
        return companion.b(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence w(FilterFacetOption it) {
        Intrinsics.j(it, "it");
        String value = it.getValue();
        return value == null ? "" : value;
    }

    @Override // cp.InterfaceC13545a, gp.InterfaceC14400b
    public Object a(int i10, List<String> list, Continuation<? super List<ProductFullDetails>> continuation) {
        return C15805i.g(this.ioDispatcher, new a(list, i10, this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // cp.InterfaceC13545a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(int r5, java.lang.String r6, kotlin.coroutines.Continuation<? super Co.ProductFullDetails> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof So.b.C0782b
            if (r0 == 0) goto L13
            r0 = r7
            So.b$b r0 = (So.b.C0782b) r0
            int r1 = r0.f34939e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34939e = r1
            goto L18
        L13:
            So.b$b r0 = new So.b$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f34937c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f34939e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            int r5 = r0.f34935a
            java.lang.Object r6 = r0.f34936b
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.b(r7)
            goto L4c
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            kotlin.ResultKt.b(r7)
            So.f r7 = new So.f
            r7.<init>(r6, r5)
            r0.f34936b = r6
            r0.f34935a = r5
            r0.f34939e = r3
            java.lang.Object r7 = r4.p(r7, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            So.f$k r7 = (So.ProductDetailQuery.Product) r7
            java.lang.Integer r5 = kotlin.coroutines.jvm.internal.Boxing.d(r5)
            Co.h r5 = Wo.d.g(r7, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: So.b.b(int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // cp.InterfaceC13545a
    public Object c(int i10, String str, Continuation<? super SuggestionResult> continuation) {
        throw new NoDataException(new Throwable("Wrong data source. Use ConstructorDataSource instead."));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // cp.InterfaceC13545a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(int r25, java.lang.String r26, int r27, int r28, Po.Cursor r29, Qo.FilterSortOption r30, java.util.Map<Qo.FilterFacet, java.util.List<Qo.FilterFacetOption>> r31, kotlin.coroutines.Continuation<? super Oo.SearchResult> r32) {
        /*
            r24 = this;
            r0 = r24
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            boolean r5 = r4 instanceof So.b.f
            if (r5 == 0) goto L1d
            r5 = r4
            So.b$f r5 = (So.b.f) r5
            int r6 = r5.f34968j
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L1d
            int r6 = r6 - r7
            r5.f34968j = r6
            goto L22
        L1d:
            So.b$f r5 = new So.b$f
            r5.<init>(r4)
        L22:
            java.lang.Object r4 = r5.f34966h
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r7 = r5.f34968j
            r8 = 1
            if (r7 == 0) goto L51
            if (r7 != r8) goto L49
            int r1 = r5.f34961c
            int r2 = r5.f34960b
            java.lang.Object r3 = r5.f34965g
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r3 = r5.f34964f
            Qo.g r3 = (Qo.FilterSortOption) r3
            java.lang.Object r3 = r5.f34963e
            Po.a r3 = (Po.Cursor) r3
            java.lang.Object r3 = r5.f34962d
            java.lang.String r3 = (java.lang.String) r3
            kotlin.ResultKt.b(r4)
            r12 = r2
            r10 = r3
            goto Laa
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L51:
            kotlin.ResultKt.b(r4)
            if (r1 == 0) goto L5b
            java.lang.String r4 = r1.getNextCursor()
            goto L5c
        L5b:
            r4 = 0
        L5c:
            if (r4 != 0) goto L60
            java.lang.String r4 = ""
        L60:
            r13 = r4
            z6.C r14 = r0.v(r3)
            z6.C r15 = r0.u(r2)
            z6.C r18 = r0.o()
            zu.v r4 = r0.constructorIo
            int r20 = r4.G()
            zu.v r4 = r0.constructorIo
            java.lang.String r19 = r4.A()
            Xo.b r16 = new Xo.b
            r22 = 16
            r23 = 0
            r21 = 0
            r17 = r25
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            So.d r9 = new So.d
            r11 = r25
            r10 = r26
            r12 = r27
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r5.f34962d = r10
            r5.f34963e = r1
            r5.f34964f = r2
            r5.f34965g = r3
            r5.f34959a = r11
            r5.f34960b = r12
            r1 = r28
            r5.f34961c = r1
            r5.f34968j = r8
            java.lang.Object r4 = r0.s(r9, r5)
            if (r4 != r6) goto Laa
            return r6
        Laa:
            So.d$d r4 = (So.ProductCollectionQuery.Collection) r4
            Oo.b r1 = Wo.b.h(r4, r10, r1, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: So.b.d(int, java.lang.String, int, int, Po.a, Qo.g, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // cp.InterfaceC13545a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(int r25, java.lang.String r26, int r27, int r28, Po.Cursor r29, Qo.FilterSortOption r30, java.util.Map<Qo.FilterFacet, java.util.List<Qo.FilterFacetOption>> r31, kotlin.coroutines.Continuation<? super Oo.SearchResult> r32) {
        /*
            r24 = this;
            r0 = r24
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            boolean r5 = r4 instanceof So.b.h
            if (r5 == 0) goto L1d
            r5 = r4
            So.b$h r5 = (So.b.h) r5
            int r6 = r5.f34981j
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L1d
            int r6 = r6 - r7
            r5.f34981j = r6
            goto L22
        L1d:
            So.b$h r5 = new So.b$h
            r5.<init>(r4)
        L22:
            java.lang.Object r4 = r5.f34979h
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r7 = r5.f34981j
            r8 = 1
            if (r7 == 0) goto L51
            if (r7 != r8) goto L49
            int r1 = r5.f34974c
            int r2 = r5.f34973b
            java.lang.Object r3 = r5.f34978g
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r3 = r5.f34977f
            Qo.g r3 = (Qo.FilterSortOption) r3
            java.lang.Object r3 = r5.f34976e
            Po.a r3 = (Po.Cursor) r3
            java.lang.Object r3 = r5.f34975d
            java.lang.String r3 = (java.lang.String) r3
            kotlin.ResultKt.b(r4)
            r12 = r2
            r10 = r3
            goto Laa
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L51:
            kotlin.ResultKt.b(r4)
            if (r1 == 0) goto L5b
            java.lang.String r4 = r1.getNextCursor()
            goto L5c
        L5b:
            r4 = 0
        L5c:
            if (r4 != 0) goto L60
            java.lang.String r4 = ""
        L60:
            r13 = r4
            z6.C r14 = r0.v(r3)
            z6.C r15 = r0.u(r2)
            z6.C r18 = r0.o()
            zu.v r4 = r0.constructorIo
            int r20 = r4.G()
            zu.v r4 = r0.constructorIo
            java.lang.String r19 = r4.A()
            Xo.b r16 = new Xo.b
            r22 = 16
            r23 = 0
            r21 = 0
            r17 = r25
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            So.e r9 = new So.e
            r11 = r25
            r10 = r26
            r12 = r27
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r5.f34975d = r10
            r5.f34976e = r1
            r5.f34977f = r2
            r5.f34978g = r3
            r5.f34972a = r11
            r5.f34973b = r12
            r1 = r28
            r5.f34974c = r1
            r5.f34981j = r8
            java.lang.Object r4 = r0.t(r9, r5)
            if (r4 != r6) goto Laa
            return r6
        Laa:
            So.e$f r4 = (So.ProductDepartmentQuery.Department) r4
            Oo.b r1 = Wo.c.h(r4, r10, r1, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: So.b.f(int, java.lang.String, int, int, Po.a, Qo.g, java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // cp.InterfaceC13545a
    public Object g(int i10, Continuation<? super Department> continuation) {
        throw new NoDataException(new Throwable("Wrong data source. Use ConstructorDataSource instead."));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // cp.InterfaceC13545a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(int r25, java.lang.String r26, int r27, int r28, Po.Cursor r29, java.util.Map<Qo.FilterFacet, java.util.List<Qo.FilterFacetOption>> r30, Qo.FilterSortOption r31, kotlin.coroutines.Continuation<? super Oo.SearchResult> r32) {
        /*
            r24 = this;
            r0 = r24
            r1 = r29
            r2 = r30
            r3 = r31
            r4 = r32
            boolean r5 = r4 instanceof So.b.j
            if (r5 == 0) goto L1d
            r5 = r4
            So.b$j r5 = (So.b.j) r5
            int r6 = r5.f34994j
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L1d
            int r6 = r6 - r7
            r5.f34994j = r6
            goto L22
        L1d:
            So.b$j r5 = new So.b$j
            r5.<init>(r4)
        L22:
            java.lang.Object r4 = r5.f34992h
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r7 = r5.f34994j
            r8 = 1
            if (r7 == 0) goto L51
            if (r7 != r8) goto L49
            int r1 = r5.f34987c
            int r2 = r5.f34986b
            java.lang.Object r3 = r5.f34991g
            Qo.g r3 = (Qo.FilterSortOption) r3
            java.lang.Object r3 = r5.f34990f
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r3 = r5.f34989e
            Po.a r3 = (Po.Cursor) r3
            java.lang.Object r3 = r5.f34988d
            java.lang.String r3 = (java.lang.String) r3
            kotlin.ResultKt.b(r4)
            r12 = r2
            r10 = r3
            goto Lac
        L49:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L51:
            kotlin.ResultKt.b(r4)
            So.g r9 = new So.g
            if (r1 == 0) goto L5d
            java.lang.String r4 = r1.getNextCursor()
            goto L5e
        L5d:
            r4 = 0
        L5e:
            if (r4 != 0) goto L62
            java.lang.String r4 = ""
        L62:
            r13 = r4
            z6.C r14 = r0.v(r2)
            z6.C r15 = r0.u(r3)
            z6.C r18 = r0.o()
            zu.v r4 = r0.constructorIo
            int r20 = r4.G()
            zu.v r4 = r0.constructorIo
            java.lang.String r19 = r4.A()
            Xo.b r16 = new Xo.b
            r22 = 16
            r23 = 0
            r21 = 0
            r17 = r25
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r10 = r26
            r12 = r27
            r11 = r17
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r5.f34988d = r10
            r5.f34989e = r1
            r5.f34990f = r2
            r5.f34991g = r3
            r11 = r25
            r5.f34985a = r11
            r5.f34986b = r12
            r1 = r28
            r5.f34987c = r1
            r5.f34994j = r8
            java.lang.Object r4 = r0.q(r9, r5)
            if (r4 != r6) goto Lac
            return r6
        Lac:
            So.g$q r4 = (So.ProductSearchQuery.Search) r4
            Oo.b r1 = Wo.e.h(r4, r10, r1, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: So.b.h(int, java.lang.String, int, int, Po.a, java.util.Map, Qo.g, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object p(ProductDetailQuery productDetailQuery, Continuation<? super ProductDetailQuery.Product> continuation) {
        return C15805i.g(this.ioDispatcher, new c(productDetailQuery, null), continuation);
    }

    public final Object q(ProductSearchQuery productSearchQuery, Continuation<? super ProductSearchQuery.Search> continuation) {
        return C15805i.g(this.ioDispatcher, new d(productSearchQuery, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(java.lang.String r6, int r7, kotlin.coroutines.Continuation<? super java.util.List<Co.ProductVariantGroup>> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof So.b.e
            if (r0 == 0) goto L13
            r0 = r8
            So.b$e r0 = (So.b.e) r0
            int r1 = r0.f34958m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34958m = r1
            goto L18
        L13:
            So.b$e r0 = new So.b$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f34956k
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f34958m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            java.lang.Object r6 = r0.f34950e
            So.b r6 = (So.b) r6
            java.lang.Object r6 = r0.f34949d
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            java.lang.Object r6 = r0.f34948c
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            java.lang.Object r6 = r0.f34947b
            So.b r6 = (So.b) r6
            java.lang.Object r6 = r0.f34946a
            java.lang.String r6 = (java.lang.String) r6
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Exception -> L3e
            goto L6f
        L3e:
            r6 = move-exception
            goto L8d
        L40:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L48:
            kotlin.ResultKt.b(r8)
            kotlin.Result$Companion r8 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3e
            So.f r8 = new So.f     // Catch: java.lang.Exception -> L3e
            r8.<init>(r6, r7)     // Catch: java.lang.Exception -> L3e
            r0.f34946a = r6     // Catch: java.lang.Exception -> L3e
            r0.f34947b = r5     // Catch: java.lang.Exception -> L3e
            r0.f34948c = r0     // Catch: java.lang.Exception -> L3e
            r0.f34949d = r0     // Catch: java.lang.Exception -> L3e
            r0.f34950e = r5     // Catch: java.lang.Exception -> L3e
            r0.f34951f = r7     // Catch: java.lang.Exception -> L3e
            r0.f34952g = r4     // Catch: java.lang.Exception -> L3e
            r0.f34953h = r4     // Catch: java.lang.Exception -> L3e
            r0.f34954i = r4     // Catch: java.lang.Exception -> L3e
            r0.f34955j = r4     // Catch: java.lang.Exception -> L3e
            r0.f34958m = r3     // Catch: java.lang.Exception -> L3e
            java.lang.Object r8 = r5.p(r8, r0)     // Catch: java.lang.Exception -> L3e
            if (r8 != r1) goto L6f
            return r1
        L6f:
            So.f$k r8 = (So.ProductDetailQuery.Product) r8     // Catch: java.lang.Exception -> L3e
            So.f$q r6 = r8.getStoreSpecificProductDetails()     // Catch: java.lang.Exception -> L3e
            if (r6 == 0) goto L84
            So.f$r r6 = r6.getVariants()     // Catch: java.lang.Exception -> L3e
            if (r6 == 0) goto L84
            java.util.List r6 = Wo.d.e(r6)     // Catch: java.lang.Exception -> L3e
            if (r6 == 0) goto L84
            goto L88
        L84:
            java.util.List r6 = kotlin.collections.CollectionsKt.m()     // Catch: java.lang.Exception -> L3e
        L88:
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Exception -> L3e
            goto L9e
        L8d:
            kotlin.coroutines.CoroutineContext r7 = r0.getContext()
            mv.E0.i(r7)
            kotlin.Result$Companion r7 = kotlin.Result.INSTANCE
            java.lang.Object r6 = kotlin.ResultKt.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        L9e:
            boolean r7 = kotlin.Result.h(r6)
            java.lang.String r8 = "PDP"
            if (r7 == 0) goto Lca
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            qw.a$a r0 = qw.a.INSTANCE
            qw.a$b r0 = r0.z(r8)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ApolloDataSource Variants: "
            r1.append(r2)
            r1.append(r7)
            r7 = 10
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r0.a(r7, r1)
        Lca:
            java.lang.Throwable r7 = kotlin.Result.e(r6)
            if (r7 == 0) goto Ldd
            qw.a$a r0 = qw.a.INSTANCE
            qw.a$b r8 = r0.z(r8)
            java.lang.String r0 = "ApolloDataSource Variants ERROR"
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r8.f(r7, r0, r1)
        Ldd:
            kotlin.ResultKt.b(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: So.b.r(java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object s(ProductCollectionQuery productCollectionQuery, Continuation<? super ProductCollectionQuery.Collection> continuation) {
        return C15805i.g(this.ioDispatcher, new g(productCollectionQuery, null), continuation);
    }

    public final Object t(ProductDepartmentQuery productDepartmentQuery, Continuation<? super ProductDepartmentQuery.Department> continuation) {
        return C15805i.g(this.ioDispatcher, new i(productDepartmentQuery, null), continuation);
    }
}
