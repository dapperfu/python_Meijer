package Zo;

import Co.ProductFullDetails;
import Tq.j;
import ap.InterfaceC6143a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.AbstractC16618K;
import qv.C16644i;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"LZo/c;", "", "LXi/a;", "authTokenProvider", "Lap/a;", "mperksOffersApi", "LTq/j;", "storeProvider", "Lqv/K;", "ioDispatcher", "<init>", "(LXi/a;Lap/a;LTq/j;Lqv/K;)V", "", "couponId", "sourceId", "", "LCo/h;", "d", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LXi/a;", "b", "Lap/a;", "c", "LTq/j;", "Lqv/K;", "constructor_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Xi.a authTokenProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6143a mperksOffersApi;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j storeProvider;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lqv/O;", "", "LCo/h;", "<anonymous>", "(Lqv/O;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.product.service.constructor.MperksOffersRepository$getProductsAssociatedWithCoupon$2", f = "MperksOffersRepository.kt", l = {35, 34}, m = "invokeSuspend")
    @SourceDebugExtension
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super List<? extends ProductFullDetails>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f43201a;

        /* renamed from: b, reason: collision with root package name */
        int f43202b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f43204d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f43205e;

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super List<? extends ProductFullDetails>> continuation) {
            return invoke2(interfaceC16622O, (Continuation<? super List<ProductFullDetails>>) continuation);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, long j11, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f43204d = j10;
            this.f43205e = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return c.this.new a(this.f43204d, this.f43205e, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC16622O interfaceC16622O, Continuation<? super List<ProductFullDetails>> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        
            if (r14 == r0) goto L16;
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
                int r1 = r13.f43202b
                r2 = 1
                r3 = 2
                r4 = 0
                if (r1 == 0) goto L25
                if (r1 == r2) goto L1c
                if (r1 != r3) goto L14
                kotlin.ResultKt.b(r14)
                r12 = r13
                goto L5d
            L14:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1c:
                java.lang.Object r1 = r13.f43201a
                ap.a r1 = (ap.InterfaceC6143a) r1
                kotlin.ResultKt.b(r14)
            L23:
                r5 = r1
                goto L40
            L25:
                kotlin.ResultKt.b(r14)
                Zo.c r14 = Zo.c.this
                ap.a r1 = Zo.c.b(r14)
                Zo.c r14 = Zo.c.this
                Xi.a r14 = Zo.c.a(r14)
                r13.f43201a = r1
                r13.f43202b = r2
                java.lang.Object r14 = r14.b(r13)
                if (r14 != r0) goto L23
                r12 = r13
                goto L5c
            L40:
                r6 = r14
                com.meijer.mobile.authentication.core.model.BearerToken r6 = (com.meijer.mobile.authentication.core.model.BearerToken) r6
                long r7 = r13.f43204d
                long r9 = r13.f43205e
                Zo.c r14 = Zo.c.this
                Tq.j r14 = Zo.c.c(r14)
                int r11 = r14.g()
                r13.f43201a = r4
                r13.f43202b = r3
                r12 = r13
                java.lang.Object r14 = r5.a(r6, r7, r9, r11, r12)
                if (r14 != r0) goto L5d
            L5c:
                return r0
            L5d:
                retrofit2.Response r14 = (retrofit2.Response) r14
                boolean r0 = r14.isSuccessful()
                if (r0 == 0) goto Lab
                java.lang.Object r14 = r14.body()
                com.meijer.mobile.product.service.constructor.api.model.GetConstructorProductsResponse r14 = (com.meijer.mobile.product.service.constructor.api.model.GetConstructorProductsResponse) r14
                if (r14 == 0) goto La3
                java.util.List r14 = r14.a()
                if (r14 == 0) goto La3
                java.lang.Iterable r14 = (java.lang.Iterable) r14
                Zo.c r0 = Zo.c.this
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = 10
                int r2 = kotlin.collections.CollectionsKt.x(r14, r2)
                r1.<init>(r2)
                java.util.Iterator r14 = r14.iterator()
            L86:
                boolean r2 = r14.hasNext()
                if (r2 == 0) goto La2
                java.lang.Object r2 = r14.next()
                io.constructor.data.model.common.Result r2 = (io.constructor.data.model.common.Result) r2
                Tq.j r5 = Zo.c.c(r0)
                int r5 = r5.g()
                Co.h r2 = Bo.c.c(r2, r5, r4, r3, r4)
                r1.add(r2)
                goto L86
            La2:
                r4 = r1
            La3:
                if (r4 != 0) goto Laa
                java.util.List r14 = kotlin.collections.CollectionsKt.m()
                return r14
            Laa:
                return r4
            Lab:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r14)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Zo.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public c(Xi.a authTokenProvider, InterfaceC6143a mperksOffersApi, j storeProvider, AbstractC16618K ioDispatcher) {
        Intrinsics.j(authTokenProvider, "authTokenProvider");
        Intrinsics.j(mperksOffersApi, "mperksOffersApi");
        Intrinsics.j(storeProvider, "storeProvider");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.authTokenProvider = authTokenProvider;
        this.mperksOffersApi = mperksOffersApi;
        this.storeProvider = storeProvider;
        this.ioDispatcher = ioDispatcher;
    }

    public final Object d(long j10, long j11, Continuation<? super List<ProductFullDetails>> continuation) {
        return C16644i.g(this.ioDispatcher, new a(j10, j11, null), continuation);
    }
}
