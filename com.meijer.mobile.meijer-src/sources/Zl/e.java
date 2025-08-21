package Zl;

import Vl.e;
import com.meijer.mobile.home.service.models.contentManagementSystem.HomeCMSBannerResponse;
import dl.C13702d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.C15805i;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0014"}, d2 = {"LZl/e;", "", "LYl/b;", "homeCmsContentApi", "Ldl/d;", "couponsRepository", "Lmv/K;", "ioDispatcher", "<init>", "(LYl/b;Ldl/d;Lmv/K;)V", "LVl/e$a;", "cmsComponent", "Lcom/meijer/mobile/home/service/models/contentManagementSystem/HomeCMSBannerResponse;", "c", "(LVl/e$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LYl/b;", "b", "Ldl/d;", "Lmv/K;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Yl.b homeCmsContentApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C13702d couponsRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lcom/meijer/mobile/home/service/models/contentManagementSystem/HomeCMSBannerResponse;", "<anonymous>", "(Lmv/O;)Lcom/meijer/mobile/home/service/models/contentManagementSystem/HomeCMSBannerResponse;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.service.datasource.CMSContentDataSource$getCMSContent$2", f = "CMSContentDataSource.kt", l = {37, 44}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super HomeCMSBannerResponse>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f43966a;

        /* renamed from: b, reason: collision with root package name */
        Object f43967b;

        /* renamed from: c, reason: collision with root package name */
        Object f43968c;

        /* renamed from: d, reason: collision with root package name */
        Object f43969d;

        /* renamed from: e, reason: collision with root package name */
        int f43970e;

        /* renamed from: f, reason: collision with root package name */
        int f43971f;

        /* renamed from: g, reason: collision with root package name */
        int f43972g;

        /* renamed from: h, reason: collision with root package name */
        int f43973h;

        /* renamed from: i, reason: collision with root package name */
        int f43974i;

        /* renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f43975j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ e.a f43976k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ e f43977l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(e.a aVar, e eVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f43976k = aVar;
            this.f43977l = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = new a(this.f43976k, this.f43977l, continuation);
            aVar.f43975j = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super HomeCMSBannerResponse> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
        
            if (r12 == r0) goto L36;
         */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 301
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: Zl.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public e(Yl.b homeCmsContentApi, C13702d couponsRepository, AbstractC15779K ioDispatcher) {
        Intrinsics.j(homeCmsContentApi, "homeCmsContentApi");
        Intrinsics.j(couponsRepository, "couponsRepository");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.homeCmsContentApi = homeCmsContentApi;
        this.couponsRepository = couponsRepository;
        this.ioDispatcher = ioDispatcher;
    }

    public final Object c(e.a aVar, Continuation<? super HomeCMSBannerResponse> continuation) {
        return C15805i.g(this.ioDispatcher, new a(aVar, this, null), continuation);
    }
}
