package Yl;

import Dh.EmailVerificationSpiffs;
import Eh.EnrollmentOfferResendEmailResponse;
import Tq.j;
import Ul.DepartmentCard;
import Ul.HomeCardError;
import Ul.HomeProductCard;
import Ul.ProductCarouselV3;
import Ul.e;
import Vl.HomeMperks;
import bm.C6264a;
import cm.C6414b;
import cm.C6415c;
import com.meijer.mobile.home.service.models.departmentcard.DepartmentCardJson;
import com.meijer.mobile.home.service.models.homecard.Card;
import com.meijer.mobile.home.service.models.homecard.HomeCardErrorResponse;
import com.meijer.mobile.home.service.models.homecard.HomeCardResponse;
import com.meijer.mobile.home.service.models.homecard.HomeCardResponseV2;
import com.meijer.mobile.home.service.models.homecard.ProductCarouselV3DataJson;
import com.meijer.mobile.home.service.models.homecard.ProductCarouselV3Json;
import com.meijer.mobile.home.service.models.homecard.ProductCarouselV3UpcJson;
import com.meijer.mobile.home.service.models.homecard.ProductsData;
import com.meijer.mobile.home.service.models.mperks.HomeMperksDto;
import com.meijer.mobile.product.model.hybris.api.models.HybrisProduct;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import ei.InterfaceC13669f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.ResponseBody;
import qv.AbstractC16618K;
import qv.C16644i;
import qv.E0;
import qv.InterfaceC16622O;
import retrofit2.HttpException;
import retrofit2.Response;
import yh.InterfaceC18213a;
import zh.k;

@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B]\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0097@¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b\"\u0010!J\u0018\u0010%\u001a\u00020$2\u0006\u0010\u001e\u001a\u00020#H\u0096@¢\u0006\u0004\b%\u0010&J\u0018\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0096@¢\u0006\u0004\b*\u0010+J\u0018\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020,H\u0096@¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201H\u0096@¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u000204H\u0096@¢\u0006\u0004\b5\u00103J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020706H\u0096@¢\u0006\u0004\b8\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010=R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010>R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010?R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010@R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010AR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR?\u0010K\u001a&\u0012\f\u0012\n F*\u0004\u0018\u00010E0E F*\u0012\u0012\f\u0012\n F*\u0004\u0018\u00010E0E\u0018\u00010D0D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR?\u0010O\u001a&\u0012\f\u0012\n F*\u0004\u0018\u00010L0L F*\u0012\u0012\f\u0012\n F*\u0004\u0018\u00010L0L\u0018\u00010D0D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bM\u0010H\u001a\u0004\bN\u0010JR?\u0010S\u001a&\u0012\f\u0012\n F*\u0004\u0018\u00010P0P F*\u0012\u0012\f\u0012\n F*\u0004\u0018\u00010P0P\u0018\u00010D0D8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bQ\u0010H\u001a\u0004\bR\u0010JR\u0014\u0010W\u001a\u00020T8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006X"}, d2 = {"LYl/d;", "LYl/f;", "LXl/a;", "homeCardsApi", "LYl/h;", "legacyHomeDataSource", "Lzh/k;", "profileDataSource", "LTq/j;", "storeProvider", "Lyo/k;", "userManager", "Lyl/k;", "featureManager", "Lei/f;", "experienceCloudIdProvider", "Lyh/a;", "accountServerAPI", "LXi/a;", "userTokenGateway", "Lqv/K;", "ioDispatcher", "<init>", "(LXl/a;LYl/h;Lzh/k;LTq/j;Lyo/k;Lyl/k;Lei/f;Lyh/a;LXi/a;Lqv/K;)V", "LUl/e$b;", "couponComponent", "LUl/b;", "c", "(LUl/e$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LUl/e$f;", "productComponent", "LUl/j;", "b", "(LUl/e$f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "g", "LUl/e$f$d;", "LUl/k;", "f", "(LUl/e$f$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LUl/e$c;", "departmentCarouselType", "LUl/c;", "d", "(LUl/e$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LUl/e$e;", "mPerksComponent", "LVl/b;", "h", "(LUl/e$e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LDh/m;", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LEh/d;", "a", "", "LUl/e;", "i", "LXl/a;", "LYl/h;", "Lzh/k;", "LTq/j;", "Lyo/k;", "Lyl/k;", "Lei/f;", "Lyh/a;", "LXi/a;", "j", "Lqv/K;", "Lcom/squareup/moshi/h;", "Lcom/meijer/mobile/home/service/models/homecard/HomeCardResponse;", "kotlin.jvm.PlatformType", "k", "Lkotlin/Lazy;", "A", "()Lcom/squareup/moshi/h;", "errorMoshi", "Lcom/meijer/mobile/home/service/models/homecard/HomeCardResponseV2;", "l", "B", "errorMoshiV2", "Lcom/meijer/mobile/home/service/models/homecard/ProductCarouselV3Json;", "m", "C", "errorMoshiV3", "", "D", "()I", "storeId", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class d implements Yl.f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Xl.a homeCardsApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Yl.h legacyHomeDataSource;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k profileDataSource;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j storeProvider;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final yl.k featureManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC13669f experienceCloudIdProvider;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC18213a accountServerAPI;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Xi.a userTokenGateway;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Lazy errorMoshi;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Lazy errorMoshiV2;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Lazy errorMoshiV3;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LUl/c;", "<anonymous>", "(Lqv/O;)LUl/c;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.service.datasource.AzureHomeDataSource$fetchDepartmentCard$2", f = "AzureHomeDataSource.kt", l = {266}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super DepartmentCard>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f40321a;

        /* renamed from: b, reason: collision with root package name */
        int f40322b;

        /* renamed from: c, reason: collision with root package name */
        int f40323c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f40324d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e.c f40326f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e.c cVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f40326f = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = d.this.new a(this.f40326f, continuation);
            aVar.f40324d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super DepartmentCard> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f40323c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f40324d;
                    d dVar = d.this;
                    e.c cVar = this.f40326f;
                    Result.Companion companion = Result.INSTANCE;
                    Xl.a aVar = dVar.homeCardsApi;
                    String str = cVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
                    this.f40324d = interfaceC16622O;
                    this.f40321a = interfaceC16622O;
                    this.f40322b = 0;
                    this.f40323c = 1;
                    obj = aVar.b(str, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b((DepartmentCardJson) obj);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            if (Result.h(objB)) {
                objB = C6264a.a((DepartmentCardJson) objB);
            }
            Object objB2 = Result.b(objB);
            ResultKt.b(objB2);
            return objB2;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.home.service.datasource.AzureHomeDataSource", f = "AzureHomeDataSource.kt", l = {290}, m = "fetchEnrollmentOfferResendEmailResponse")
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f40327a;

        /* renamed from: c, reason: collision with root package name */
        int f40329c;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f40327a = obj;
            this.f40329c |= Integer.MIN_VALUE;
            return d.this.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "LEh/d;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lqv/O;)LEh/d;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.service.datasource.AzureHomeDataSource$fetchEnrollmentOfferResendEmailResponse$2", f = "AzureHomeDataSource.kt", l = {293, 294}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super EnrollmentOfferResendEmailResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f40330a;

        /* renamed from: b, reason: collision with root package name */
        Object f40331b;

        /* renamed from: c, reason: collision with root package name */
        Object f40332c;

        /* renamed from: d, reason: collision with root package name */
        Object f40333d;

        /* renamed from: e, reason: collision with root package name */
        Object f40334e;

        /* renamed from: f, reason: collision with root package name */
        int f40335f;

        /* renamed from: g, reason: collision with root package name */
        int f40336g;

        /* renamed from: h, reason: collision with root package name */
        int f40337h;

        /* renamed from: i, reason: collision with root package name */
        int f40338i;

        /* renamed from: j, reason: collision with root package name */
        int f40339j;

        /* renamed from: k, reason: collision with root package name */
        private /* synthetic */ Object f40340k;

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            c cVar = d.this.new c(continuation);
            cVar.f40340k = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super EnrollmentOfferResendEmailResponse> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00b1, code lost:
        
            if (r14 == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 239
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Yl.d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "LUl/e;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.service.datasource.AzureHomeDataSource$fetchHomeCards$2", f = "AzureHomeDataSource.kt", l = {HttpResponseStatus.REDIRECTION_NOT_MODIFIED}, m = "invokeSuspend")
    /* renamed from: Yl.d$d, reason: collision with other inner class name */
    static final class C0866d extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends Ul.e>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f40342a;

        /* renamed from: b, reason: collision with root package name */
        int f40343b;

        /* renamed from: c, reason: collision with root package name */
        int f40344c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f40345d;

        C0866d(Continuation<? super C0866d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C0866d c0866d = d.this.new C0866d(continuation);
            c0866d.f40345d = obj;
            return c0866d;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends Ul.e>> continuation) {
            return ((C0866d) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f40344c;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f40345d;
                    d dVar = d.this;
                    Result.Companion companion = Result.INSTANCE;
                    Xl.a aVar = dVar.homeCardsApi;
                    this.f40345d = interfaceC16622O;
                    this.f40342a = interfaceC16622O;
                    this.f40343b = 0;
                    this.f40344c = 1;
                    obj = aVar.c(this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b((List) obj);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            if (Result.h(objB)) {
                objB = C6415c.a((List) objB);
            }
            Object objB2 = Result.b(objB);
            ResultKt.b(objB2);
            return objB2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LUl/h;", "<anonymous>", "(Lqv/O;)LUl/h;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.service.datasource.AzureHomeDataSource$fetchHomeProductDataFor$2", f = "AzureHomeDataSource.kt", l = {106}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class e extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super HomeProductCard>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f40347a;

        /* renamed from: b, reason: collision with root package name */
        int f40348b;

        /* renamed from: c, reason: collision with root package name */
        int f40349c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f40350d;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e.f f40352f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[mk.d.values().length];
                try {
                    iArr[mk.d.f150121b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[mk.d.f150120a.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(e.f fVar, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f40352f = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            e eVar = d.this.new e(this.f40352f, continuation);
            eVar.f40350d = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super HomeProductCard> continuation) {
            return ((e) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            ResponseBody responseBodyErrorBody;
            int i10;
            Object objG;
            Object objF = IntrinsicsKt.f();
            int i11 = this.f40349c;
            try {
                if (i11 == 0) {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f40350d;
                    d dVar = d.this;
                    e.f fVar = this.f40352f;
                    Result.Companion companion = Result.INSTANCE;
                    Xl.a aVar = dVar.homeCardsApi;
                    String str = fVar.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
                    String strA = dVar.userManager.a();
                    int iD = dVar.D();
                    mk.d listType = fVar.getListType();
                    int i12 = listType == null ? -1 : a.$EnumSwitchMapping$0[listType.ordinal()];
                    if (i12 == -1) {
                        i10 = 0;
                    } else if (i12 != 1) {
                        i10 = 2;
                        if (i12 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else {
                        i10 = 1;
                    }
                    this.f40350d = interfaceC16622O;
                    this.f40347a = interfaceC16622O;
                    this.f40348b = 0;
                    this.f40349c = 1;
                    objG = aVar.g(str, strA, iD, 1, i10, this);
                    if (objG == objF) {
                        return objF;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                    objG = obj;
                }
                objB = Result.b((HomeCardResponse) objG);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(th2));
            }
            e.f fVar2 = this.f40352f;
            if (Result.h(objB)) {
                HomeCardResponse homeCardResponse = (HomeCardResponse) objB;
                HomeCardResponse.Companion companion3 = HomeCardResponse.INSTANCE;
                Card card = homeCardResponse.getCard();
                ProductsData data = homeCardResponse.getData();
                List<HybrisProduct> listA = data != null ? data.a() : null;
                if (listA == null) {
                    listA = CollectionsKt.m();
                }
                List<HybrisProduct> list = listA;
                ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(Io.d.b((HybrisProduct) it.next()));
                }
                objB = companion3.a(card, arrayList, fVar2, homeCardResponse.getError());
            }
            Object objB2 = Result.b(objB);
            d dVar2 = d.this;
            e.f fVar3 = this.f40352f;
            Throwable thE = Result.e(objB2);
            if (thE == null) {
                return objB2;
            }
            if (!(thE instanceof HttpException)) {
                throw com.meijer.mobile.core.networking.exceptions.a.a(thE);
            }
            com.squareup.moshi.h hVarA = dVar2.A();
            Response<?> response = ((HttpException) thE).response();
            String strString = (response == null || (responseBodyErrorBody = response.errorBody()) == null) ? null : responseBodyErrorBody.string();
            if (strString == null) {
                strString = "";
            }
            HomeCardResponse homeCardResponse2 = (HomeCardResponse) hVarA.fromJson(strString);
            return HomeCardResponse.Companion.c(HomeCardResponse.INSTANCE, null, CollectionsKt.m(), fVar3, homeCardResponse2 != null ? homeCardResponse2.getError() : null, null, null, 48, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LUl/h;", "<anonymous>", "(Lqv/O;)LUl/h;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.service.datasource.AzureHomeDataSource$fetchHomeProductV2DataFor$2", f = "AzureHomeDataSource.kt", l = {188, 166}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class f extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super HomeProductCard>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f40353a;

        /* renamed from: b, reason: collision with root package name */
        Object f40354b;

        /* renamed from: c, reason: collision with root package name */
        Object f40355c;

        /* renamed from: d, reason: collision with root package name */
        Object f40356d;

        /* renamed from: e, reason: collision with root package name */
        Object f40357e;

        /* renamed from: f, reason: collision with root package name */
        Object f40358f;

        /* renamed from: g, reason: collision with root package name */
        Object f40359g;

        /* renamed from: h, reason: collision with root package name */
        Object f40360h;

        /* renamed from: i, reason: collision with root package name */
        int f40361i;

        /* renamed from: j, reason: collision with root package name */
        int f40362j;

        /* renamed from: k, reason: collision with root package name */
        int f40363k;

        /* renamed from: l, reason: collision with root package name */
        int f40364l;

        /* renamed from: m, reason: collision with root package name */
        int f40365m;

        /* renamed from: n, reason: collision with root package name */
        int f40366n;

        /* renamed from: o, reason: collision with root package name */
        int f40367o;

        /* renamed from: p, reason: collision with root package name */
        int f40368p;

        /* renamed from: q, reason: collision with root package name */
        private /* synthetic */ Object f40369q;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ e.f f40371s;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[mk.d.values().length];
                try {
                    iArr[mk.d.f150121b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[mk.d.f150120a.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(e.f fVar, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f40371s = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = d.this.new f(this.f40371s, continuation);
            fVar.f40369q = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super HomeProductCard> continuation) {
            return ((f) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x0195, code lost:
        
            if (r0 == r9) goto L56;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0146  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instructions count: 660
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Yl.d.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LUl/k;", "<anonymous>", "(Lqv/O;)LUl/k;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.service.datasource.AzureHomeDataSource$fetchProductCarouselV3$2", f = "AzureHomeDataSource.kt", l = {227}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class g extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super ProductCarouselV3>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f40372a;

        /* renamed from: b, reason: collision with root package name */
        Object f40373b;

        /* renamed from: c, reason: collision with root package name */
        Object f40374c;

        /* renamed from: d, reason: collision with root package name */
        Object f40375d;

        /* renamed from: e, reason: collision with root package name */
        int f40376e;

        /* renamed from: f, reason: collision with root package name */
        int f40377f;

        /* renamed from: g, reason: collision with root package name */
        int f40378g;

        /* renamed from: h, reason: collision with root package name */
        int f40379h;

        /* renamed from: i, reason: collision with root package name */
        int f40380i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f40381j;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ e.f.d f40383l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(e.f.d dVar, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f40383l = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            g gVar = d.this.new g(this.f40383l, continuation);
            gVar.f40381j = obj;
            return gVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super ProductCarouselV3> continuation) {
            return ((g) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            String strString;
            HomeCardError homeCardErrorA;
            HomeCardErrorResponse error;
            ResponseBody responseBodyErrorBody;
            List<String> listM;
            HomeCardError homeCardErrorA2;
            List<ProductCarouselV3UpcJson> listA;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f40380i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f40381j;
                    d dVar = d.this;
                    e.f.d dVar2 = this.f40383l;
                    Result.Companion companion = Result.INSTANCE;
                    Xl.a aVar = dVar.homeCardsApi;
                    String str = dVar2.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String();
                    String strA = dVar.userManager.a();
                    int iD = dVar.D();
                    this.f40381j = interfaceC16622O;
                    this.f40372a = interfaceC16622O;
                    this.f40373b = this;
                    this.f40374c = this;
                    this.f40375d = interfaceC16622O;
                    this.f40376e = 0;
                    this.f40377f = 0;
                    this.f40378g = 0;
                    this.f40379h = 0;
                    this.f40380i = 1;
                    obj = aVar.e(str, strA, iD, this);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            e.f.d dVar3 = this.f40383l;
            if (Result.h(objB)) {
                ProductCarouselV3Json productCarouselV3Json = (ProductCarouselV3Json) objB;
                ProductCarouselV3Json.Companion companion3 = ProductCarouselV3Json.INSTANCE;
                Card card = productCarouselV3Json.getCard();
                ProductCarouselV3DataJson data = productCarouselV3Json.getData();
                if (data != null && (listA = data.a()) != null) {
                    listM = new ArrayList<>();
                    Iterator<T> it = listA.iterator();
                    while (it.hasNext()) {
                        String upc = ((ProductCarouselV3UpcJson) it.next()).getUpc();
                        if (upc != null) {
                            listM.add(upc);
                        }
                    }
                } else {
                    listM = null;
                }
                if (listM == null) {
                    listM = CollectionsKt.m();
                }
                HomeCardErrorResponse error2 = productCarouselV3Json.getError();
                if (error2 != null) {
                    homeCardErrorA2 = C6414b.a(error2);
                } else {
                    homeCardErrorA2 = null;
                }
                objB = companion3.a(card, listM, dVar3, homeCardErrorA2);
            }
            Object objB2 = Result.b(objB);
            d dVar4 = d.this;
            e.f.d dVar5 = this.f40383l;
            Throwable thE = Result.e(objB2);
            if (thE != null) {
                try {
                    if (thE instanceof HttpException) {
                        com.squareup.moshi.h hVarC = dVar4.C();
                        Response<?> response = ((HttpException) thE).response();
                        if (response != null && (responseBodyErrorBody = response.errorBody()) != null) {
                            strString = responseBodyErrorBody.string();
                        } else {
                            strString = null;
                        }
                        if (strString == null) {
                            strString = "";
                        }
                        ProductCarouselV3Json productCarouselV3Json2 = (ProductCarouselV3Json) hVarC.fromJson(strString);
                        ProductCarouselV3Json.Companion companion4 = ProductCarouselV3Json.INSTANCE;
                        List<String> listM2 = CollectionsKt.m();
                        if (productCarouselV3Json2 != null && (error = productCarouselV3Json2.getError()) != null) {
                            homeCardErrorA = C6414b.a(error);
                        } else {
                            homeCardErrorA = null;
                        }
                        objB2 = Result.b(companion4.a(null, listM2, dVar5, homeCardErrorA));
                    } else {
                        throw com.meijer.mobile.core.networking.exceptions.a.a(thE);
                    }
                } catch (Throwable th2) {
                    Result.Companion companion5 = Result.INSTANCE;
                    objB2 = Result.b(ResultKt.a(th2));
                }
            }
            ResultKt.b(objB2);
            return objB2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "LVl/b;", "<anonymous>", "(Lqv/O;)LVl/b;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.service.datasource.AzureHomeDataSource$fetchmPerksCards$2", f = "AzureHomeDataSource.kt", l = {275}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class h extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super HomeMperks>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f40384a;

        /* renamed from: b, reason: collision with root package name */
        Object f40385b;

        /* renamed from: c, reason: collision with root package name */
        Object f40386c;

        /* renamed from: d, reason: collision with root package name */
        Object f40387d;

        /* renamed from: e, reason: collision with root package name */
        int f40388e;

        /* renamed from: f, reason: collision with root package name */
        int f40389f;

        /* renamed from: g, reason: collision with root package name */
        int f40390g;

        /* renamed from: h, reason: collision with root package name */
        int f40391h;

        /* renamed from: i, reason: collision with root package name */
        int f40392i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f40393j;

        h(Continuation<? super h> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            h hVar = d.this.new h(continuation);
            hVar.f40393j = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super HomeMperks> continuation) {
            return ((h) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objB;
            Object objF = IntrinsicsKt.f();
            int i10 = this.f40392i;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.b(obj);
                    InterfaceC16622O interfaceC16622O = (InterfaceC16622O) this.f40393j;
                    d dVar = d.this;
                    Result.Companion companion = Result.INSTANCE;
                    Xl.a aVar = dVar.homeCardsApi;
                    String strA = dVar.userManager.a();
                    int iD = dVar.D();
                    this.f40393j = interfaceC16622O;
                    this.f40384a = interfaceC16622O;
                    this.f40385b = this;
                    this.f40386c = this;
                    this.f40387d = interfaceC16622O;
                    this.f40388e = 0;
                    this.f40389f = 0;
                    this.f40390g = 0;
                    this.f40391h = 0;
                    this.f40392i = 1;
                    obj = Xl.a.d(aVar, "rewards", strA, iD, 1, 0, this, 16, null);
                    if (obj == objF) {
                        return objF;
                    }
                }
                objB = Result.b(obj);
            } catch (Exception e10) {
                E0.i(getContext());
                Result.Companion companion2 = Result.INSTANCE;
                objB = Result.b(ResultKt.a(e10));
            }
            if (Result.h(objB)) {
                objB = dm.c.a((HomeMperksDto) objB);
            }
            Object objB2 = Result.b(objB);
            ResultKt.b(objB2);
            return objB2;
        }
    }

    public d(Xl.a homeCardsApi, Yl.h legacyHomeDataSource, k profileDataSource, j storeProvider, yo.k userManager, yl.k featureManager, InterfaceC13669f experienceCloudIdProvider, InterfaceC18213a accountServerAPI, Xi.a userTokenGateway, AbstractC16618K ioDispatcher) {
        Intrinsics.j(homeCardsApi, "homeCardsApi");
        Intrinsics.j(legacyHomeDataSource, "legacyHomeDataSource");
        Intrinsics.j(profileDataSource, "profileDataSource");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(experienceCloudIdProvider, "experienceCloudIdProvider");
        Intrinsics.j(accountServerAPI, "accountServerAPI");
        Intrinsics.j(userTokenGateway, "userTokenGateway");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.homeCardsApi = homeCardsApi;
        this.legacyHomeDataSource = legacyHomeDataSource;
        this.profileDataSource = profileDataSource;
        this.storeProvider = storeProvider;
        this.userManager = userManager;
        this.featureManager = featureManager;
        this.experienceCloudIdProvider = experienceCloudIdProvider;
        this.accountServerAPI = accountServerAPI;
        this.userTokenGateway = userTokenGateway;
        this.ioDispatcher = ioDispatcher;
        this.errorMoshi = LazyKt.b(new Function0() { // from class: Yl.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.z();
            }
        });
        this.errorMoshiV2 = LazyKt.b(new Function0() { // from class: Yl.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.x();
            }
        });
        this.errorMoshiV3 = LazyKt.b(new Function0() { // from class: Yl.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d.y();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.squareup.moshi.h<HomeCardResponse> A() {
        return (com.squareup.moshi.h) this.errorMoshi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.squareup.moshi.h<HomeCardResponseV2> B() {
        return (com.squareup.moshi.h) this.errorMoshiV2.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.squareup.moshi.h<ProductCarouselV3Json> C() {
        return (com.squareup.moshi.h) this.errorMoshiV3.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int D() {
        return (this.userManager.b() || this.storeProvider.d()) ? this.storeProvider.g() : yo.g.a().getStoreId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.squareup.moshi.h x() {
        return No.b.f22554a.b().c(HomeCardResponseV2.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.squareup.moshi.h y() {
        return No.b.f22554a.b().c(ProductCarouselV3Json.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.squareup.moshi.h z() {
        return No.b.f22554a.b().c(HomeCardResponse.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // Yl.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation<? super Eh.EnrollmentOfferResendEmailResponse> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof Yl.d.b
            if (r0 == 0) goto L13
            r0 = r6
            Yl.d$b r0 = (Yl.d.b) r0
            int r1 = r0.f40329c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40329c = r1
            goto L18
        L13:
            Yl.d$b r0 = new Yl.d$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f40327a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f40329c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.ResultKt.b(r6)
            qv.K r6 = r5.ioDispatcher
            Yl.d$c r2 = new Yl.d$c
            r4 = 0
            r2.<init>(r4)
            r0.f40329c = r3
            java.lang.Object r6 = qv.C16644i.g(r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.Intrinsics.i(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Yl.d.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // Yl.f
    public Object b(e.f fVar, Continuation<? super Ul.j> continuation) {
        return C16644i.g(this.ioDispatcher, new e(fVar, null), continuation);
    }

    @Override // Yl.f
    public Object c(e.b bVar, Continuation<? super Ul.b> continuation) {
        return this.legacyHomeDataSource.a(bVar, continuation);
    }

    @Override // Yl.f
    public Object d(e.c cVar, Continuation<? super DepartmentCard> continuation) {
        return C16644i.g(this.ioDispatcher, new a(cVar, null), continuation);
    }

    @Override // Yl.f
    public Object e(Continuation<? super EmailVerificationSpiffs> continuation) {
        return this.profileDataSource.j(continuation);
    }

    @Override // Yl.f
    public Object f(e.f.d dVar, Continuation<? super ProductCarouselV3> continuation) {
        return C16644i.g(this.ioDispatcher, new g(dVar, null), continuation);
    }

    @Override // Yl.f
    public Object g(e.f fVar, Continuation<? super Ul.j> continuation) {
        return C16644i.g(this.ioDispatcher, new f(fVar, null), continuation);
    }

    @Override // Yl.f
    public Object h(e.C0792e c0792e, Continuation<? super HomeMperks> continuation) {
        return C16644i.g(this.ioDispatcher, new h(null), continuation);
    }

    @Override // Yl.f
    public Object i(Continuation<? super List<? extends Ul.e>> continuation) {
        return C16644i.g(this.ioDispatcher, new C0866d(null), continuation);
    }
}
