package Zl;

import Tq.j;
import Vl.HomeCouponCard;
import com.medallia.digital.mobilesdk.l3;
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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017¨\u0006\u0018"}, d2 = {"LZl/g;", "", "LYl/c;", "legacyHomeCardsApi", "LYi/a;", "userTokenProvider", "LTq/j;", "storeProvider", "Lmv/K;", "ioDispatcher", "<init>", "(LYl/c;LYi/a;LTq/j;Lmv/K;)V", "", "itemCount", "LVl/f;", "d", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LYl/c;", "b", "LYi/a;", "c", "LTq/j;", "Lmv/K;", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Yl.c legacyHomeCardsApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Yi.a userTokenProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j storeProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "LVl/f;", "<anonymous>", "(Lmv/O;)LVl/f;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.home.service.datasource.LegacyHomeCardsDataSource$getHandPickedOffersCard$2", f = "LegacyHomeCardsDataSource.kt", l = {33, l3.f93325e}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super HomeCouponCard>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f43982a;

        /* renamed from: b, reason: collision with root package name */
        int f43983b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f43985d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f43985d = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return g.this.new a(this.f43985d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super HomeCouponCard> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
        
            if (r14 == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws android.security.keystore.UserNotAuthenticatedException {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r13.f43983b
                r2 = 2
                r3 = 1
                java.lang.String r4 = "HandpickedOffers"
                r5 = 0
                if (r1 == 0) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.ResultKt.b(r14)
                goto L6c
            L15:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1d:
                java.lang.Object r1 = r13.f43982a
                Yl.c r1 = (Yl.c) r1
                kotlin.ResultKt.b(r14)
                goto L3f
            L25:
                kotlin.ResultKt.b(r14)
                Zl.g r14 = Zl.g.this
                Yl.c r1 = Zl.g.a(r14)
                Zl.g r14 = Zl.g.this
                Yi.a r14 = Zl.g.c(r14)
                r13.f43982a = r1
                r13.f43983b = r3
                java.lang.Object r14 = r14.c(r13)
                if (r14 != r0) goto L3f
                goto L6b
            L3f:
                com.meijer.mobile.authentication.core.model.BearerToken r14 = (com.meijer.mobile.authentication.core.model.BearerToken) r14
                com.meijer.mobile.home.service.models.homecard.LegacyHomeCardItem r3 = new com.meijer.mobile.home.service.models.homecard.LegacyHomeCardItem
                int r6 = r13.f43985d
                r3.<init>(r4, r6)
                java.util.List r9 = kotlin.collections.CollectionsKt.e(r3)
                java.util.List r12 = kotlin.collections.CollectionsKt.e(r4)
                Zl.g r3 = Zl.g.this
                Tq.j r3 = Zl.g.b(r3)
                int r11 = r3.g()
                com.meijer.mobile.home.service.models.homecard.LegacyHomeCardsRequest r7 = new com.meijer.mobile.home.service.models.homecard.LegacyHomeCardsRequest
                r8 = 0
                r10 = 1
                r7.<init>(r8, r9, r10, r11, r12)
                r13.f43982a = r5
                r13.f43983b = r2
                java.lang.Object r14 = r1.a(r14, r7, r13)
                if (r14 != r0) goto L6c
            L6b:
                return r0
            L6c:
                retrofit2.Response r14 = (retrofit2.Response) r14
                boolean r0 = r14.isSuccessful()
                if (r0 == 0) goto Lb8
                java.lang.Object r14 = r14.body()
                kotlin.jvm.internal.Intrinsics.g(r14)
                com.meijer.mobile.home.service.models.homecard.LegacyHomeCardsResponse r14 = (com.meijer.mobile.home.service.models.homecard.LegacyHomeCardsResponse) r14
                java.util.List r14 = r14.a()
                java.lang.Iterable r14 = (java.lang.Iterable) r14
                java.util.Iterator r14 = r14.iterator()
            L87:
                boolean r0 = r14.hasNext()
                if (r0 == 0) goto L9f
                java.lang.Object r0 = r14.next()
                r1 = r0
                com.meijer.mobile.home.service.models.homecard.HandPickedOfferCard r1 = (com.meijer.mobile.home.service.models.homecard.HandPickedOfferCard) r1
                java.lang.String r1 = r1.getCardType()
                boolean r1 = kotlin.jvm.internal.Intrinsics.e(r1, r4)
                if (r1 == 0) goto L87
                goto La0
            L9f:
                r0 = r5
            La0:
                com.meijer.mobile.home.service.models.homecard.HandPickedOfferCard r0 = (com.meijer.mobile.home.service.models.homecard.HandPickedOfferCard) r0
                if (r0 == 0) goto Lb7
                java.util.List r14 = r0.d()
                boolean r14 = r14.isEmpty()
                if (r14 != 0) goto Laf
                goto Lb0
            Laf:
                r0 = r5
            Lb0:
                if (r0 == 0) goto Lb7
                Vl.f r14 = dm.C13703a.a(r0)
                return r14
            Lb7:
                return r5
            Lb8:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r14)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Zl.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public g(Yl.c legacyHomeCardsApi, Yi.a userTokenProvider, j storeProvider, AbstractC15779K ioDispatcher) {
        Intrinsics.j(legacyHomeCardsApi, "legacyHomeCardsApi");
        Intrinsics.j(userTokenProvider, "userTokenProvider");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.legacyHomeCardsApi = legacyHomeCardsApi;
        this.userTokenProvider = userTokenProvider;
        this.storeProvider = storeProvider;
        this.ioDispatcher = ioDispatcher;
    }

    public final Object d(int i10, Continuation<? super HomeCouponCard> continuation) {
        return C15805i.g(this.ioDispatcher, new a(i10, null), continuation);
    }
}
