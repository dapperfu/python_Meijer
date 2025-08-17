package Ro;

import Co.Department;
import Co.ProductFullDetails;
import Co.ProductVariantGroup;
import Go.SuggestionResult;
import Ho.ProductSponsorship;
import Ho.SponsoredData;
import Oo.SearchResult;
import Po.Cursor;
import Qo.FilterFacet;
import Qo.FilterFacetOption;
import Qo.FilterSortOption;
import Tq.j;
import Wk.ProductComplexPromo;
import com.fullstory.FS;
import cp.InterfaceC13412a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import pp.C16348c;
import qv.AbstractC16618K;
import qv.C16644i;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17140B;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;
import tv.S;
import yl.AbstractC18227f;
import yo.k;

@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 V2\u00020\u0001:\u0001WB[\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b#\u0010$J\u001c\u0010(\u001a\u00020'2\n\u0010&\u001a\u00060\u0018j\u0002`%H\u0086@¢\u0006\u0004\b(\u0010$J\"\u0010+\u001a\b\u0012\u0004\u0012\u00020*0)2\n\u0010&\u001a\u00060\u0018j\u0002`%H\u0086@¢\u0006\u0004\b+\u0010$J\"\u0010-\u001a\b\u0012\u0004\u0012\u00020,0)2\n\u0010&\u001a\u00060\u0018j\u0002`%H\u0086@¢\u0006\u0004\b-\u0010$J(\u0010/\u001a\b\u0012\u0004\u0012\u00020'0)2\u0010\u0010.\u001a\f\u0012\b\u0012\u00060\u0018j\u0002`%0)H\u0086@¢\u0006\u0004\b/\u00100Jr\u0010=\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u0002012\n\b\u0002\u00105\u001a\u0004\u0018\u0001042\"\b\u0002\u0010:\u001a\u001c\u0012\u0004\u0012\u000207\u0012\n\u0012\b\u0012\u0004\u0012\u0002080)\u0018\u000106j\u0004\u0018\u0001`92\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b=\u0010>J%\u0010@\u001a\u00020\u001d2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010?\u001a\b\u0012\u0004\u0012\u00020'0)H\u0000¢\u0006\u0004\b@\u0010AJ2\u0010E\u001a\b\u0012\u0004\u0012\u00020'0)2\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010C\u001a\u00020B2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0018H\u0086@¢\u0006\u0004\bE\u0010FJ/\u0010I\u001a\b\u0012\u0004\u0012\u00020'0)2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020'0)2\f\u0010H\u001a\b\u0012\u0004\u0012\u00020'0)¢\u0006\u0004\bI\u0010JJ'\u0010K\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020'062\f\u0010H\u001a\b\u0012\u0004\u0012\u00020'0)¢\u0006\u0004\bK\u0010LJ\u001e\u0010P\u001a\u0004\u0018\u00010O2\n\u0010N\u001a\u000601j\u0002`MH\u0086@¢\u0006\u0004\bP\u0010QJh\u0010S\u001a\u00020\u001b2\u0006\u0010R\u001a\u00020\u00182\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u0002012\n\b\u0002\u00105\u001a\u0004\u0018\u0001042\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\"\b\u0002\u0010:\u001a\u001c\u0012\u0004\u0012\u000207\u0012\n\u0012\b\u0012\u0004\u0012\u0002080)\u0018\u000106j\u0004\u0018\u0001`9H\u0086@¢\u0006\u0004\bS\u0010TJh\u0010V\u001a\u00020\u001b2\u0006\u0010U\u001a\u00020\u00182\b\b\u0002\u00102\u001a\u0002012\b\b\u0002\u00103\u001a\u0002012\n\b\u0002\u00105\u001a\u0004\u0018\u0001042\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\"\b\u0002\u0010:\u001a\u001c\u0012\u0004\u0012\u000207\u0012\n\u0012\b\u0012\u0004\u0012\u0002080)\u0018\u000106j\u0004\u0018\u0001`9H\u0086@¢\u0006\u0004\bV\u0010TR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010cR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010dR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010eR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010fR\u0014\u0010i\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010hR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020\u00180j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010kR#\u0010s\u001a\b\u0012\u0004\u0012\u00020\"0m8\u0006¢\u0006\u0012\n\u0004\b+\u0010n\u0012\u0004\bq\u0010r\u001a\u0004\bo\u0010pR\u0014\u0010N\u001a\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bt\u0010u¨\u0006v"}, d2 = {"LRo/c;", "", "LTq/j;", "storeProvider", "Lyo/k;", "userManager", "Lyl/k;", "featureManager", "Lcp/a;", "dataSource", "LRo/a;", "tracker", "LSk/a;", "complexPromoDataSource", "Lpp/c;", "criteoSponsorshipsDataSource", "Lpp/e;", "sponsorshipsDataStore", "LSo/b;", "apolloDataSource", "Lqv/K;", "ioDispatcher", "<init>", "(LTq/j;Lyo/k;Lyl/k;Lcp/a;LRo/a;LSk/a;Lpp/c;Lpp/e;LSo/b;Lqv/K;)V", "", "originalQuery", "query", "LOo/b;", "searchResult", "", "h", "(Ljava/lang/String;Ljava/lang/String;LOo/b;)V", "v", "(Ljava/lang/String;)V", "LGo/d;", "s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/core/models/products/ProductCode;", "productCode", "LCo/h;", "l", "", "LCo/k;", "m", "LWk/a;", "k", "upcs", "j", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "pageSize", "currentPage", "LPo/a;", "cursor", "", "LQo/a;", "LQo/c;", "Lcom/meijer/mobile/product/model/search/query/SelectedFilterFacets;", "selectedFacets", "LQo/g;", "selectedSort", "p", "(Ljava/lang/String;IILPo/a;Ljava/util/Map;LQo/g;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "potentialSponsoredProducts", "w", "(Lpp/e;Ljava/util/List;)V", "", "isDepartmentSearch", "filters", "q", "(Ljava/lang/String;ZLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "products", "criteoSponsoredProducts", "u", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "g", "(Ljava/util/List;)Ljava/util/Map;", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "LCo/b;", "i", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "categoryCode", "o", "(Ljava/lang/String;IILPo/a;LQo/g;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectionId", "n", "a", "LTq/j;", "b", "Lyo/k;", "c", "Lyl/k;", "d", "Lcp/a;", "e", "LRo/a;", "f", "LSk/a;", "Lpp/c;", "Lpp/e;", "LSo/b;", "Lqv/K;", "", "J", "debounceInMillis", "Ltv/B;", "Ltv/B;", "typeAheadQuerySubject", "Ltv/f;", "Ltv/f;", "t", "()Ltv/f;", "getTypeAheadSuggestionsStream$annotations", "()V", "typeAheadSuggestionsStream", "r", "()I", "repository_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j storeProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k userManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yl.k featureManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13412a dataSource;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final a tracker;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Sk.a complexPromoDataSource;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C16348c criteoSponsorshipsDataSource;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final pp.e sponsorshipsDataStore;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final So.b apolloDataSource;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long debounceInMillis;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17140B<String> typeAheadQuerySubject;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17152f<SuggestionResult> typeAheadSuggestionsStream;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LOo/b;", "<anonymous>", "(Lqv/O;)LOo/b;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.repository.ProductsRepository$getProductsForCollection$2", f = "ProductsRepository.kt", l = {433, 448}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super SearchResult>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f32584a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f32585b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f32586c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f32587d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f32588e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Cursor f32589f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ FilterSortOption f32590g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Map<FilterFacet, List<FilterFacetOption>> f32591h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10, c cVar, String str, int i11, Cursor cursor, FilterSortOption filterSortOption, Map<FilterFacet, List<FilterFacetOption>> map, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f32585b = i10;
            this.f32586c = cVar;
            this.f32587d = str;
            this.f32588e = i11;
            this.f32589f = cursor;
            this.f32590g = filterSortOption;
            this.f32591h = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f32585b, this.f32586c, this.f32587d, this.f32588e, this.f32589f, this.f32590g, this.f32591h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super SearchResult> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
        
            if (r14 == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
        
            if (r14 == r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r13.f32584a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                kotlin.ResultKt.b(r14)
                r9 = r13
                goto L99
            L14:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1c:
                kotlin.ResultKt.b(r14)
                r9 = r13
                goto L62
            L21:
                kotlin.ResultKt.b(r14)
                int r14 = r13.f32585b
                if (r14 != 0) goto L31
                Ro.c r14 = r13.f32586c
                pp.e r14 = Ro.c.d(r14)
                r14.c()
            L31:
                Ro.c r14 = r13.f32586c
                yl.k r14 = Ro.c.c(r14)
                yl.f$m r1 = yl.AbstractC18227f.C18239m.f170590h
                boolean r14 = r14.e(r1)
                if (r14 == 0) goto L74
                Ro.c r14 = r13.f32586c
                So.b r4 = Ro.c.a(r14)
                Ro.c r14 = r13.f32586c
                int r5 = Ro.c.e(r14)
                java.lang.String r6 = r13.f32587d
                int r7 = r13.f32588e
                int r8 = r13.f32585b
                Po.a r9 = r13.f32589f
                Qo.g r10 = r13.f32590g
                java.util.Map<Qo.a, java.util.List<Qo.c>> r11 = r13.f32591h
                r13.f32584a = r3
                r12 = r13
                java.lang.Object r14 = r4.d(r5, r6, r7, r8, r9, r10, r11, r12)
                r9 = r12
                if (r14 != r0) goto L62
                goto L98
            L62:
                int r0 = r9.f32585b
                Ro.c r1 = r9.f32586c
                java.lang.String r2 = r9.f32587d
                Oo.b r14 = (Oo.SearchResult) r14
                if (r0 != 0) goto L73
                Ro.a r0 = Ro.c.f(r1)
                r0.c(r2, r14)
            L73:
                return r14
            L74:
                r9 = r13
                Ro.c r14 = r9.f32586c
                cp.a r1 = Ro.c.b(r14)
                Ro.c r14 = r9.f32586c
                int r14 = Ro.c.e(r14)
                java.lang.String r3 = r9.f32587d
                int r4 = r9.f32588e
                int r5 = r9.f32585b
                Qo.g r7 = r9.f32590g
                java.util.Map<Qo.a, java.util.List<Qo.c>> r8 = r9.f32591h
                r9.f32584a = r2
                r6 = 0
                r10 = 16
                r11 = 0
                r2 = r14
                java.lang.Object r14 = cp.InterfaceC13412a.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r14 != r0) goto L99
            L98:
                return r0
            L99:
                int r0 = r9.f32585b
                Ro.c r1 = r9.f32586c
                java.lang.String r2 = r9.f32587d
                Oo.b r14 = (Oo.SearchResult) r14
                if (r0 != 0) goto Laa
                Ro.a r0 = Ro.c.f(r1)
                r0.c(r2, r14)
            Laa:
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: Ro.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LOo/b;", "<anonymous>", "(Lqv/O;)LOo/b;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.repository.ProductsRepository$getProductsForDepartment$2", f = "ProductsRepository.kt", l = {380, 395}, m = "invokeSuspend")
    /* renamed from: Ro.c$c, reason: collision with other inner class name */
    static final class C0732c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super SearchResult>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f32592a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f32593b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ c f32594c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f32595d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f32596e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Cursor f32597f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ FilterSortOption f32598g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Map<FilterFacet, List<FilterFacetOption>> f32599h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0732c(int i10, c cVar, String str, int i11, Cursor cursor, FilterSortOption filterSortOption, Map<FilterFacet, List<FilterFacetOption>> map, Continuation<? super C0732c> continuation) {
            super(2, continuation);
            this.f32593b = i10;
            this.f32594c = cVar;
            this.f32595d = str;
            this.f32596e = i11;
            this.f32597f = cursor;
            this.f32598g = filterSortOption;
            this.f32599h = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C0732c(this.f32593b, this.f32594c, this.f32595d, this.f32596e, this.f32597f, this.f32598g, this.f32599h, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super SearchResult> continuation) {
            return ((C0732c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
        
            if (r14 == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0096, code lost:
        
            if (r14 == r0) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r13.f32592a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 == r3) goto L1c
                if (r1 != r2) goto L14
                kotlin.ResultKt.b(r14)
                r9 = r13
                goto L99
            L14:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1c:
                kotlin.ResultKt.b(r14)
                r9 = r13
                goto L62
            L21:
                kotlin.ResultKt.b(r14)
                int r14 = r13.f32593b
                if (r14 != 0) goto L31
                Ro.c r14 = r13.f32594c
                pp.e r14 = Ro.c.d(r14)
                r14.c()
            L31:
                Ro.c r14 = r13.f32594c
                yl.k r14 = Ro.c.c(r14)
                yl.f$s r1 = yl.AbstractC18227f.C18245s.f170602h
                boolean r14 = r14.e(r1)
                if (r14 == 0) goto L74
                Ro.c r14 = r13.f32594c
                So.b r4 = Ro.c.a(r14)
                Ro.c r14 = r13.f32594c
                int r5 = Ro.c.e(r14)
                java.lang.String r6 = r13.f32595d
                int r7 = r13.f32596e
                int r8 = r13.f32593b
                Po.a r9 = r13.f32597f
                Qo.g r10 = r13.f32598g
                java.util.Map<Qo.a, java.util.List<Qo.c>> r11 = r13.f32599h
                r13.f32592a = r3
                r12 = r13
                java.lang.Object r14 = r4.f(r5, r6, r7, r8, r9, r10, r11, r12)
                r9 = r12
                if (r14 != r0) goto L62
                goto L98
            L62:
                int r0 = r9.f32593b
                Ro.c r1 = r9.f32594c
                java.lang.String r2 = r9.f32595d
                Oo.b r14 = (Oo.SearchResult) r14
                if (r0 != 0) goto L73
                Ro.a r0 = Ro.c.f(r1)
                r0.e(r2, r14)
            L73:
                return r14
            L74:
                r9 = r13
                Ro.c r14 = r9.f32594c
                cp.a r1 = Ro.c.b(r14)
                Ro.c r14 = r9.f32594c
                int r14 = Ro.c.e(r14)
                java.lang.String r3 = r9.f32595d
                int r4 = r9.f32596e
                int r5 = r9.f32593b
                Qo.g r7 = r9.f32598g
                java.util.Map<Qo.a, java.util.List<Qo.c>> r8 = r9.f32599h
                r9.f32592a = r2
                r6 = 0
                r10 = 16
                r11 = 0
                r2 = r14
                java.lang.Object r14 = cp.InterfaceC13412a.i(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                if (r14 != r0) goto L99
            L98:
                return r0
            L99:
                int r0 = r9.f32593b
                Ro.c r1 = r9.f32594c
                java.lang.String r2 = r9.f32595d
                Oo.b r14 = (Oo.SearchResult) r14
                if (r0 != 0) goto Laa
                Ro.a r0 = Ro.c.f(r1)
                r0.e(r2, r14)
            Laa:
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: Ro.c.C0732c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.product.repository.ProductsRepository", f = "ProductsRepository.kt", l = {190, 208}, m = "getSearchResults")
    static final class d extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f32600a;

        /* renamed from: b, reason: collision with root package name */
        Object f32601b;

        /* renamed from: c, reason: collision with root package name */
        Object f32602c;

        /* renamed from: d, reason: collision with root package name */
        Object f32603d;

        /* renamed from: e, reason: collision with root package name */
        Object f32604e;

        /* renamed from: f, reason: collision with root package name */
        int f32605f;

        /* renamed from: g, reason: collision with root package name */
        int f32606g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f32607h;

        /* renamed from: j, reason: collision with root package name */
        int f32609j;

        d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32607h = obj;
            this.f32609j |= Integer.MIN_VALUE;
            return c.this.p(null, 0, 0, null, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.product.repository.ProductsRepository", f = "ProductsRepository.kt", l = {285}, m = "getSponsoredProductsFromCriteo")
    static final class e extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f32610a;

        /* renamed from: b, reason: collision with root package name */
        Object f32611b;

        /* renamed from: c, reason: collision with root package name */
        Object f32612c;

        /* renamed from: d, reason: collision with root package name */
        boolean f32613d;

        /* renamed from: e, reason: collision with root package name */
        int f32614e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f32615f;

        /* renamed from: h, reason: collision with root package name */
        int f32617h;

        e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f32615f = obj;
            this.f32617h |= Integer.MIN_VALUE;
            return c.this.q(null, false, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Ltv/f;", "Ltv/g;", "collector", "", "collect", "(Ltv/g;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class f implements InterfaceC17152f<SuggestionResult> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC17152f f32618a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f32619b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC17153g f32620a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f32621b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "com.meijer.mobile.product.repository.ProductsRepository$special$$inlined$map$1$2", f = "ProductsRepository.kt", l = {51, 50}, m = "emit")
            /* renamed from: Ro.c$f$a$a, reason: collision with other inner class name */
            public static final class C0733a extends ContinuationImpl {

                /* renamed from: a, reason: collision with root package name */
                /* synthetic */ Object f32622a;

                /* renamed from: b, reason: collision with root package name */
                int f32623b;

                /* renamed from: c, reason: collision with root package name */
                Object f32624c;

                /* renamed from: e, reason: collision with root package name */
                Object f32626e;

                /* renamed from: f, reason: collision with root package name */
                Object f32627f;

                /* renamed from: g, reason: collision with root package name */
                Object f32628g;

                /* renamed from: h, reason: collision with root package name */
                Object f32629h;

                /* renamed from: i, reason: collision with root package name */
                Object f32630i;

                /* renamed from: j, reason: collision with root package name */
                Object f32631j;

                /* renamed from: k, reason: collision with root package name */
                int f32632k;

                /* renamed from: l, reason: collision with root package name */
                int f32633l;

                public C0733a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f32622a = obj;
                    this.f32623b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC17153g interfaceC17153g, c cVar) {
                this.f32620a = interfaceC17153g;
                this.f32621b = cVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x009f, code lost:
            
                if (r2.emit(r11, r0) == r1) goto L22;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // tv.InterfaceC17153g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r10, kotlin.coroutines.Continuation r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof Ro.c.f.a.C0733a
                    if (r0 == 0) goto L13
                    r0 = r11
                    Ro.c$f$a$a r0 = (Ro.c.f.a.C0733a) r0
                    int r1 = r0.f32623b
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f32623b = r1
                    goto L18
                L13:
                    Ro.c$f$a$a r0 = new Ro.c$f$a$a
                    r0.<init>(r11)
                L18:
                    java.lang.Object r11 = r0.f32622a
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r2 = r0.f32623b
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L5f
                    if (r2 == r4) goto L3d
                    if (r2 != r3) goto L35
                    java.lang.Object r10 = r0.f32628g
                    tv.g r10 = (tv.InterfaceC17153g) r10
                    java.lang.Object r10 = r0.f32626e
                    Ro.c$f$a$a r10 = (Ro.c.f.a.C0733a) r10
                    kotlin.ResultKt.b(r11)
                    goto La2
                L35:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L3d:
                    int r10 = r0.f32632k
                    java.lang.Object r2 = r0.f32631j
                    java.lang.String r2 = (java.lang.String) r2
                    java.lang.Object r2 = r0.f32630i
                    kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                    java.lang.Object r2 = r0.f32629h
                    tv.g r2 = (tv.InterfaceC17153g) r2
                    java.lang.Object r4 = r0.f32628g
                    tv.g r4 = (tv.InterfaceC17153g) r4
                    java.lang.Object r5 = r0.f32627f
                    java.lang.Object r6 = r0.f32626e
                    Ro.c$f$a$a r6 = (Ro.c.f.a.C0733a) r6
                    java.lang.Object r7 = r0.f32624c
                    kotlin.ResultKt.b(r11)
                    r8 = r6
                    r6 = r10
                    r10 = r7
                    r7 = r8
                    goto L88
                L5f:
                    kotlin.ResultKt.b(r11)
                    tv.g r2 = r9.f32620a
                    r11 = r10
                    java.lang.String r11 = (java.lang.String) r11
                    Ro.c r5 = r9.f32621b
                    r0.f32624c = r10
                    r0.f32626e = r0
                    r0.f32627f = r10
                    r0.f32628g = r2
                    r0.f32629h = r2
                    r0.f32630i = r0
                    r0.f32631j = r11
                    r6 = 0
                    r0.f32632k = r6
                    r0.f32633l = r6
                    r0.f32623b = r4
                    java.lang.Object r11 = r5.s(r11, r0)
                    if (r11 != r1) goto L85
                    goto La1
                L85:
                    r5 = r10
                    r7 = r0
                    r4 = r2
                L88:
                    r0.f32624c = r10
                    r0.f32626e = r7
                    r0.f32627f = r5
                    r0.f32628g = r4
                    r10 = 0
                    r0.f32629h = r10
                    r0.f32630i = r10
                    r0.f32631j = r10
                    r0.f32632k = r6
                    r0.f32623b = r3
                    java.lang.Object r10 = r2.emit(r11, r0)
                    if (r10 != r1) goto La2
                La1:
                    return r1
                La2:
                    kotlin.Unit r10 = kotlin.Unit.f142422a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: Ro.c.f.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public f(InterfaceC17152f interfaceC17152f, c cVar) {
            this.f32618a = interfaceC17152f;
            this.f32619b = cVar;
        }

        @Override // tv.InterfaceC17152f
        public Object collect(InterfaceC17153g<? super SuggestionResult> interfaceC17153g, Continuation continuation) {
            Object objCollect = this.f32618a.collect(new a(interfaceC17153g, this.f32619b), continuation);
            return objCollect == IntrinsicsKt.f() ? objCollect : Unit.f142422a;
        }
    }

    public c(j storeProvider, k userManager, yl.k featureManager, InterfaceC13412a dataSource, a tracker, Sk.a complexPromoDataSource, C16348c criteoSponsorshipsDataSource, pp.e sponsorshipsDataStore, So.b apolloDataSource, AbstractC16618K ioDispatcher) {
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(dataSource, "dataSource");
        Intrinsics.j(tracker, "tracker");
        Intrinsics.j(complexPromoDataSource, "complexPromoDataSource");
        Intrinsics.j(criteoSponsorshipsDataSource, "criteoSponsorshipsDataSource");
        Intrinsics.j(sponsorshipsDataStore, "sponsorshipsDataStore");
        Intrinsics.j(apolloDataSource, "apolloDataSource");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.storeProvider = storeProvider;
        this.userManager = userManager;
        this.featureManager = featureManager;
        this.dataSource = dataSource;
        this.tracker = tracker;
        this.complexPromoDataSource = complexPromoDataSource;
        this.criteoSponsorshipsDataSource = criteoSponsorshipsDataSource;
        this.sponsorshipsDataStore = sponsorshipsDataStore;
        this.apolloDataSource = apolloDataSource;
        this.ioDispatcher = ioDispatcher;
        long millis = TimeUnit.MILLISECONDS.toMillis(300L);
        this.debounceInMillis = millis;
        InterfaceC17140B<String> interfaceC17140BA = S.a("");
        this.typeAheadQuerySubject = interfaceC17140BA;
        this.typeAheadSuggestionsStream = new f(C17154h.q(interfaceC17140BA, millis), this);
    }

    private final void h(String originalQuery, String query, SearchResult searchResult) {
        FS.event("Product Searched", MapsKt.o(TuplesKt.a("search", MapsKt.o(TuplesKt.a("q_orig", originalQuery), TuplesKt.a("q", query))), TuplesKt.a("total_result_count", Integer.valueOf(searchResult.getPagination().getTotalResults())), TuplesKt.a("searchMethod", "ProductsRepository.getSearchResults")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int r() {
        if (this.userManager.b() || this.storeProvider.d()) {
            return this.storeProvider.g();
        }
        return 20;
    }

    public final Map<Integer, ProductFullDetails> g(List<ProductFullDetails> criteoSponsoredProducts) {
        Intrinsics.j(criteoSponsoredProducts, "criteoSponsoredProducts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!criteoSponsoredProducts.isEmpty()) {
            int i10 = 2;
            int i11 = 0;
            for (Object obj : criteoSponsoredProducts) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    CollectionsKt.w();
                }
                ProductFullDetails productFullDetails = (ProductFullDetails) obj;
                if (i11 > 0) {
                    i10 += 3;
                    linkedHashMap.put(Integer.valueOf(i10), productFullDetails);
                } else {
                    linkedHashMap.put(Integer.valueOf(i10), productFullDetails);
                }
                i11 = i12;
            }
        }
        return linkedHashMap;
    }

    public final Object i(int i10, Continuation<? super Department> continuation) {
        return this.dataSource.g(i10, continuation);
    }

    public final Object j(List<String> list, Continuation<? super List<ProductFullDetails>> continuation) {
        return this.featureManager.e(AbstractC18227f.s0.f170603h) ? this.apolloDataSource.a(this.storeProvider.g(), list, continuation) : this.dataSource.a(this.storeProvider.g(), list, continuation);
    }

    public final Object k(String str, Continuation<? super List<ProductComplexPromo>> continuation) {
        return this.complexPromoDataSource.b(str, r(), continuation);
    }

    public final Object l(String str, Continuation<? super ProductFullDetails> continuation) {
        return this.featureManager.e(AbstractC18227f.W.f170562h) ? this.apolloDataSource.b(r(), str, continuation) : this.dataSource.b(r(), str, continuation);
    }

    public final Object m(String str, Continuation<? super List<ProductVariantGroup>> continuation) {
        return this.apolloDataSource.r(str, r(), continuation);
    }

    public final Object n(String str, int i10, int i11, Cursor cursor, FilterSortOption filterSortOption, Map<FilterFacet, List<FilterFacetOption>> map, Continuation<? super SearchResult> continuation) {
        return C16644i.g(this.ioDispatcher, new b(i11, this, str, i10, cursor, filterSortOption, map, null), continuation);
    }

    public final Object o(String str, int i10, int i11, Cursor cursor, FilterSortOption filterSortOption, Map<FilterFacet, List<FilterFacetOption>> map, Continuation<? super SearchResult> continuation) {
        return C16644i.g(this.ioDispatcher, new C0732c(i11, this, str, i10, cursor, filterSortOption, map, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(java.lang.String r14, int r15, int r16, Po.Cursor r17, java.util.Map<Qo.FilterFacet, java.util.List<Qo.FilterFacetOption>> r18, Qo.FilterSortOption r19, java.lang.String r20, kotlin.coroutines.Continuation<? super Oo.SearchResult> r21) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Ro.c.p(java.lang.String, int, int, Po.a, java.util.Map, Qo.g, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(java.lang.String r5, boolean r6, java.lang.String r7, kotlin.coroutines.Continuation<? super java.util.List<Co.ProductFullDetails>> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof Ro.c.e
            if (r0 == 0) goto L13
            r0 = r8
            Ro.c$e r0 = (Ro.c.e) r0
            int r1 = r0.f32617h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32617h = r1
            goto L18
        L13:
            Ro.c$e r0 = new Ro.c$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f32615f
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f32617h
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r5 = r0.f32612c
            Ro.c r5 = (Ro.c) r5
            java.lang.Object r5 = r0.f32611b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.f32610a
            java.lang.String r5 = (java.lang.String) r5
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L35
            goto L5a
        L35:
            r5 = move-exception
            goto L61
        L37:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3f:
            kotlin.ResultKt.b(r8)
            kotlin.Result$Companion r8 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L35
            pp.c r8 = r4.criteoSponsorshipsDataSource     // Catch: java.lang.Throwable -> L35
            r0.f32610a = r5     // Catch: java.lang.Throwable -> L35
            r0.f32611b = r7     // Catch: java.lang.Throwable -> L35
            r0.f32612c = r4     // Catch: java.lang.Throwable -> L35
            r0.f32613d = r6     // Catch: java.lang.Throwable -> L35
            r2 = 0
            r0.f32614e = r2     // Catch: java.lang.Throwable -> L35
            r0.f32617h = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r8 = r8.f(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> L35
            if (r8 != r1) goto L5a
            return r1
        L5a:
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L35
            java.lang.Object r5 = kotlin.Result.b(r8)     // Catch: java.lang.Throwable -> L35
            goto L6b
        L61:
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L6b:
            boolean r6 = kotlin.Result.h(r5)
            r7 = 10
            if (r6 == 0) goto L9e
            r6 = r5
            java.util.List r6 = (java.util.List) r6
            pp.e r8 = r4.sponsorshipsDataStore
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.collections.CollectionsKt.x(r6, r7)
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
        L87:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L9b
            java.lang.Object r1 = r6.next()
            pp.f r1 = (pp.SponsoredProduct) r1
            Ho.a r1 = r1.getSponsorship()
            r0.add(r1)
            goto L87
        L9b:
            r8.d(r0)
        L9e:
            boolean r6 = kotlin.Result.h(r5)
            if (r6 == 0) goto Lce
            java.util.List r5 = (java.util.List) r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.CollectionsKt.x(r5, r7)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        Lb5:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Lc9
            java.lang.Object r7 = r5.next()
            pp.f r7 = (pp.SponsoredProduct) r7
            Co.h r7 = r7.getProduct()
            r6.add(r7)
            goto Lb5
        Lc9:
            java.lang.Object r5 = kotlin.Result.b(r6)
            goto Ld2
        Lce:
            java.lang.Object r5 = kotlin.Result.b(r5)
        Ld2:
            kotlin.ResultKt.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: Ro.c.q(java.lang.String, boolean, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object s(String str, Continuation<? super SuggestionResult> continuation) {
        return this.dataSource.c(this.storeProvider.g(), str, continuation);
    }

    public final InterfaceC17152f<SuggestionResult> t() {
        return this.typeAheadSuggestionsStream;
    }

    public final List<ProductFullDetails> u(List<ProductFullDetails> products, List<ProductFullDetails> criteoSponsoredProducts) {
        Intrinsics.j(products, "products");
        Intrinsics.j(criteoSponsoredProducts, "criteoSponsoredProducts");
        Map<Integer, ProductFullDetails> mapG = g(criteoSponsoredProducts);
        if (products.isEmpty() || mapG.isEmpty()) {
            return products;
        }
        Collection<ProductFullDetails> collectionValues = mapG.values();
        ArrayList arrayList = new ArrayList(CollectionsKt.x(collectionValues, 10));
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            arrayList.add(((ProductFullDetails) it.next()).getCode());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : products) {
            if (!arrayList.contains(((ProductFullDetails) obj).getCode())) {
                arrayList2.add(obj);
            }
        }
        List listM1 = CollectionsKt.m1(arrayList2);
        int i10 = 0;
        for (Map.Entry<Integer, ProductFullDetails> entry : mapG.entrySet()) {
            if (entry.getKey().intValue() < listM1.size() && i10 < 8) {
                listM1.add(entry.getKey().intValue(), entry.getValue());
                i10++;
            }
        }
        return CollectionsKt.j1(listM1);
    }

    public final void v(String query) {
        Intrinsics.j(query, "query");
        InterfaceC17140B<String> interfaceC17140B = this.typeAheadQuerySubject;
        while (!interfaceC17140B.e(interfaceC17140B.getValue(), query)) {
        }
    }

    public final void w(pp.e sponsorshipsDataStore, List<ProductFullDetails> potentialSponsoredProducts) {
        Intrinsics.j(sponsorshipsDataStore, "sponsorshipsDataStore");
        Intrinsics.j(potentialSponsoredProducts, "potentialSponsoredProducts");
        ArrayList<ProductFullDetails> arrayList = new ArrayList();
        for (Object obj : potentialSponsoredProducts) {
            ProductFullDetails productFullDetails = (ProductFullDetails) obj;
            if (!productFullDetails.getBeaconInfo().g().isEmpty() || !productFullDetails.getBeaconInfo().e().isEmpty()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.x(arrayList, 10));
        for (ProductFullDetails productFullDetails2 : arrayList) {
            arrayList2.add(new ProductSponsorship(productFullDetails2.getCode(), Ho.b.f13066d, new SponsoredData(productFullDetails2.getCode(), productFullDetails2.getBeaconInfo().g(), productFullDetails2.getBeaconInfo().e(), productFullDetails2.getBeaconInfo().getOnLoadBeacon(), productFullDetails2.getBeaconInfo().getOnBasketChangeBeacon(), "", "", "")));
        }
        sponsorshipsDataStore.d(arrayList2);
    }
}
