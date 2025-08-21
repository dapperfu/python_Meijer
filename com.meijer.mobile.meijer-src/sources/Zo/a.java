package Zo;

import Co.Department;
import Co.ProductFullDetails;
import Oo.SearchResult;
import Po.Cursor;
import Qo.FilterFacet;
import Qo.FilterFacetOption;
import Qo.FilterSortOption;
import cp.InterfaceC13545a;
import dp.C13707a;
import gp.InterfaceC14400b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.C15805i;
import mv.InterfaceC15783O;
import pp.e;
import zu.v;

@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B3\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJl\u0010\u001f\u001a\u00020\u001e2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\"\b\u0002\u0010\u001d\u001a\u001c\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0018\u00010\u0018j\u0004\u0018\u0001`\u001cH\u0082@¢\u0006\u0004\b\u001f\u0010 J$\u0010#\u001a\u00020\"2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010!\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b#\u0010$J(\u0010(\u001a\u00020'2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\n\u0010&\u001a\u00060\u0011j\u0002`%H\u0096@¢\u0006\u0004\b(\u0010$J\u001e\u0010*\u001a\u0004\u0018\u00010)2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0096@¢\u0006\u0004\b*\u0010+Jj\u0010.\u001a\u00020\u001e2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010,2 \u0010\u001d\u001a\u001c\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0018\u00010\u0018j\u0004\u0018\u0001`\u001c2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096@¢\u0006\u0004\b.\u0010/Jj\u00101\u001a\u00020\u001e2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u00100\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010,2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162 \u0010\u001d\u001a\u001c\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0018\u00010\u0018j\u0004\u0018\u0001`\u001cH\u0096@¢\u0006\u0004\b1\u00102Jj\u00104\u001a\u00020\u001e2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u00103\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010,2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162 \u0010\u001d\u001a\u001c\u0012\u0004\u0012\u00020\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0018\u00010\u0018j\u0004\u0018\u0001`\u001cH\u0096@¢\u0006\u0004\b4\u00102J4\u00106\u001a\b\u0012\u0004\u0012\u00020'0\u001a2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0010\u00105\u001a\f\u0012\b\u0012\u00060\u0011j\u0002`%0\u001aH\u0096A¢\u0006\u0004\b6\u00107R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00108R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00109R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010:R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010;R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006>"}, d2 = {"LZo/a;", "Lcp/a;", "Lgp/b;", "Lzu/v;", "constructorIo", "Ldp/a;", "hybrisDataSource", "Lpp/e;", "sponsorshipsDataStore", "multiProductDataSource", "Lmv/K;", "ioDispatcher", "<init>", "(Lzu/v;Ldp/a;Lpp/e;Lgp/b;Lmv/K;)V", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "filterValue", "filterName", "pageSize", "currentPage", "LQo/g;", "selectedSort", "", "LQo/a;", "", "LQo/c;", "Lcom/meijer/mobile/product/model/search/query/SelectedFilterFacets;", "selectedFacets", "LOo/b;", "m", "(ILjava/lang/String;Ljava/lang/String;IILQo/g;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "query", "LGo/d;", "c", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/core/models/products/ProductCode;", "productCode", "LCo/h;", "b", "LCo/b;", "g", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LPo/a;", "cursor", "h", "(ILjava/lang/String;IILPo/a;Ljava/util/Map;LQo/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "categoryCode", "f", "(ILjava/lang/String;IILPo/a;LQo/g;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectionId", "d", "upcs", "a", "(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lzu/v;", "Ldp/a;", "Lpp/e;", "Lgp/b;", "e", "Lmv/K;", "constructor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class a implements InterfaceC13545a, InterfaceC14400b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v constructorIo;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C13707a hybrisDataSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e sponsorshipsDataStore;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14400b multiProductDataSource;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LOo/b;", "<anonymous>", "(Lmv/O;)LOo/b;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.service.constructor.ConstructorDataSource$getProductsForFilter$2", f = "ConstructorDataSource.kt", l = {192}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: Zo.a$a, reason: collision with other inner class name */
    static final class C0932a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super SearchResult>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f44016a;

        /* renamed from: b, reason: collision with root package name */
        Object f44017b;

        /* renamed from: c, reason: collision with root package name */
        Object f44018c;

        /* renamed from: d, reason: collision with root package name */
        Object f44019d;

        /* renamed from: e, reason: collision with root package name */
        int f44020e;

        /* renamed from: f, reason: collision with root package name */
        int f44021f;

        /* renamed from: g, reason: collision with root package name */
        int f44022g;

        /* renamed from: h, reason: collision with root package name */
        int f44023h;

        /* renamed from: i, reason: collision with root package name */
        int f44024i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f44025j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f44027l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f44028m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f44029n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Map<FilterFacet, List<FilterFacetOption>> f44030o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f44031p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f44032q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ FilterSortOption f44033r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0932a(String str, String str2, int i10, Map<FilterFacet, List<FilterFacetOption>> map, int i11, int i12, FilterSortOption filterSortOption, Continuation<? super C0932a> continuation) {
            super(2, continuation);
            this.f44027l = str;
            this.f44028m = str2;
            this.f44029n = i10;
            this.f44030o = map;
            this.f44031p = i11;
            this.f44032q = i12;
            this.f44033r = filterSortOption;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C0932a c0932a = a.this.new C0932a(this.f44027l, this.f44028m, this.f44029n, this.f44030o, this.f44031p, this.f44032q, this.f44033r, continuation);
            c0932a.f44025j = obj;
            return c0932a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super SearchResult> continuation) {
            return ((C0932a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01f9  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x0203  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 529
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Zo.a.C0932a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LOo/b;", "<anonymous>", "(Lmv/O;)LOo/b;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.service.constructor.ConstructorDataSource$getSearchResults$2", f = "ConstructorDataSource.kt", l = {94}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super SearchResult>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f44034a;

        /* renamed from: b, reason: collision with root package name */
        Object f44035b;

        /* renamed from: c, reason: collision with root package name */
        Object f44036c;

        /* renamed from: d, reason: collision with root package name */
        Object f44037d;

        /* renamed from: e, reason: collision with root package name */
        int f44038e;

        /* renamed from: f, reason: collision with root package name */
        int f44039f;

        /* renamed from: g, reason: collision with root package name */
        int f44040g;

        /* renamed from: h, reason: collision with root package name */
        int f44041h;

        /* renamed from: i, reason: collision with root package name */
        int f44042i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f44043j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ String f44045l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f44046m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Map<FilterFacet, List<FilterFacetOption>> f44047n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f44048o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f44049p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ FilterSortOption f44050q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, int i10, Map<FilterFacet, List<FilterFacetOption>> map, int i11, int i12, FilterSortOption filterSortOption, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f44045l = str;
            this.f44046m = i10;
            this.f44047n = map;
            this.f44048o = i11;
            this.f44049p = i12;
            this.f44050q = filterSortOption;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = a.this.new b(this.f44045l, this.f44046m, this.f44047n, this.f44048o, this.f44049p, this.f44050q, continuation);
            bVar.f44043j = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super SearchResult> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Removed duplicated region for block: B:85:0x0219 A[PHI: r0
          0x0219: PHI (r0v17 java.lang.Object) = (r0v5 java.lang.Object), (r0v7 java.lang.Object) binds: [B:34:0x00e1, B:84:0x0213] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0223  */
        /* JADX WARN: Removed duplicated region for block: B:96:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            /*
                Method dump skipped, instructions count: 561
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Zo.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.product.service.constructor.ConstructorDataSource", f = "ConstructorDataSource.kt", l = {61}, m = "getTypeAheadSuggestions")
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        int f44051a;

        /* renamed from: b, reason: collision with root package name */
        int f44052b;

        /* renamed from: c, reason: collision with root package name */
        int f44053c;

        /* renamed from: d, reason: collision with root package name */
        int f44054d;

        /* renamed from: e, reason: collision with root package name */
        int f44055e;

        /* renamed from: f, reason: collision with root package name */
        Object f44056f;

        /* renamed from: g, reason: collision with root package name */
        Object f44057g;

        /* renamed from: h, reason: collision with root package name */
        Object f44058h;

        /* renamed from: i, reason: collision with root package name */
        Object f44059i;

        /* renamed from: j, reason: collision with root package name */
        Object f44060j;

        /* renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f44061k;

        /* renamed from: m, reason: collision with root package name */
        int f44063m;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f44061k = obj;
            this.f44063m |= Integer.MIN_VALUE;
            return a.this.c(0, null, this);
        }
    }

    public a(v constructorIo, C13707a hybrisDataSource, e sponsorshipsDataStore, InterfaceC14400b multiProductDataSource, AbstractC15779K ioDispatcher) {
        Intrinsics.j(constructorIo, "constructorIo");
        Intrinsics.j(hybrisDataSource, "hybrisDataSource");
        Intrinsics.j(sponsorshipsDataStore, "sponsorshipsDataStore");
        Intrinsics.j(multiProductDataSource, "multiProductDataSource");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.constructorIo = constructorIo;
        this.hybrisDataSource = hybrisDataSource;
        this.sponsorshipsDataStore = sponsorshipsDataStore;
        this.multiProductDataSource = multiProductDataSource;
        this.ioDispatcher = ioDispatcher;
    }

    private final Object m(int i10, String str, String str2, int i11, int i12, FilterSortOption filterSortOption, Map<FilterFacet, List<FilterFacetOption>> map, Continuation<? super SearchResult> continuation) {
        return C15805i.g(this.ioDispatcher, new C0932a(str2, str, i10, map, i12, i11, filterSortOption, null), continuation);
    }

    @Override // cp.InterfaceC13545a, gp.InterfaceC14400b
    public Object a(int i10, List<String> list, Continuation<? super List<ProductFullDetails>> continuation) {
        return this.multiProductDataSource.a(i10, list, continuation);
    }

    @Override // cp.InterfaceC13545a
    public Object b(int i10, String str, Continuation<? super ProductFullDetails> continuation) {
        return this.hybrisDataSource.f(i10, str, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // cp.InterfaceC13545a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(int r17, java.lang.String r18, kotlin.coroutines.Continuation<? super Go.SuggestionResult> r19) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Zo.a.c(int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // cp.InterfaceC13545a
    public Object d(int i10, String str, int i11, int i12, Cursor cursor, FilterSortOption filterSortOption, Map<FilterFacet, List<FilterFacetOption>> map, Continuation<? super SearchResult> continuation) {
        return m(i10, str, "collection_id", i11, i12, filterSortOption, map, continuation);
    }

    @Override // cp.InterfaceC13545a
    public Object f(int i10, String str, int i11, int i12, Cursor cursor, FilterSortOption filterSortOption, Map<FilterFacet, List<FilterFacetOption>> map, Continuation<? super SearchResult> continuation) {
        return m(i10, str, "group_id", i11, i12, filterSortOption, map, continuation);
    }

    @Override // cp.InterfaceC13545a
    public Object g(int i10, Continuation<? super Department> continuation) {
        return this.hybrisDataSource.e(i10, continuation);
    }

    @Override // cp.InterfaceC13545a
    public Object h(int i10, String str, int i11, int i12, Cursor cursor, Map<FilterFacet, List<FilterFacetOption>> map, FilterSortOption filterSortOption, Continuation<? super SearchResult> continuation) {
        return C15805i.g(this.ioDispatcher, new b(str, i10, map, i12, i11, filterSortOption, null), continuation);
    }
}
