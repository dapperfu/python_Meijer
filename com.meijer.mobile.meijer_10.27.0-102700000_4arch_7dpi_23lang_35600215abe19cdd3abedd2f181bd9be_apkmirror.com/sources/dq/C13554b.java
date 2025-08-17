package dq;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import tv.C17154h;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0086\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ldq/b;", "", "LWp/a;", "repository", "<init>", "(LWp/a;)V", "Ltv/f;", "Lkotlin/Result;", "", "b", "()Ltv/f;", "a", "LWp/a;", "shopandscan_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dq.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13554b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Wp.a repository;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltv/g;", "Lkotlin/Result;", "", "<anonymous>", "(Ltv/g;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.shopandscan.domain.usecase.trip.ShopAndScanCancelTripUseCase$invoke$1", f = "ShopAndScanCancelTripUseCase.kt", l = {20, com.google.android.gms.common.api.b.RECONNECTION_TIMED_OUT}, m = "invokeSuspend")
    /* renamed from: dq.b$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC17153g<? super Result<? extends Unit>>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f127508a;

        /* renamed from: b, reason: collision with root package name */
        int f127509b;

        /* renamed from: c, reason: collision with root package name */
        int f127510c;

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f127511d;

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = C13554b.this.new a(continuation);
            aVar.f127511d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super Result<Unit>> interfaceC17153g, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC17153g, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
        
            if (r1.emit(r3, r5) == r0) goto L23;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, tv.g] */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, tv.g] */
        /* JADX WARN: Type inference failed for: r1v9, types: [tv.g] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r5.f127510c
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r5.f127511d
                tv.g r0 = (tv.InterfaceC17153g) r0
                kotlin.ResultKt.b(r6)
                goto L6e
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                java.lang.Object r1 = r5.f127508a
                tv.g r1 = (tv.InterfaceC17153g) r1
                java.lang.Object r1 = r5.f127511d
                tv.g r1 = (tv.InterfaceC17153g) r1
                kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L2a
                goto L4c
            L2a:
                r6 = move-exception
                goto L53
            L2c:
                kotlin.ResultKt.b(r6)
                java.lang.Object r6 = r5.f127511d
                r1 = r6
                tv.g r1 = (tv.InterfaceC17153g) r1
                dq.b r6 = dq.C13554b.this
                kotlin.Result$Companion r4 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L2a
                Wp.a r6 = dq.C13554b.a(r6)     // Catch: java.lang.Throwable -> L2a
                r5.f127511d = r1     // Catch: java.lang.Throwable -> L2a
                r5.f127508a = r1     // Catch: java.lang.Throwable -> L2a
                r4 = 0
                r5.f127509b = r4     // Catch: java.lang.Throwable -> L2a
                r5.f127510c = r3     // Catch: java.lang.Throwable -> L2a
                java.lang.Object r6 = r6.j(r5)     // Catch: java.lang.Throwable -> L2a
                if (r6 != r0) goto L4c
                goto L6d
            L4c:
                kotlin.Unit r6 = kotlin.Unit.f142422a     // Catch: java.lang.Throwable -> L2a
                java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Throwable -> L2a
                goto L5d
            L53:
                kotlin.Result$Companion r3 = kotlin.Result.INSTANCE
                java.lang.Object r6 = kotlin.ResultKt.a(r6)
                java.lang.Object r6 = kotlin.Result.b(r6)
            L5d:
                kotlin.Result r3 = kotlin.Result.a(r6)
                r5.f127511d = r1
                r5.f127508a = r6
                r5.f127510c = r2
                java.lang.Object r6 = r1.emit(r3, r5)
                if (r6 != r0) goto L6e
            L6d:
                return r0
            L6e:
                kotlin.Unit r6 = kotlin.Unit.f142422a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: dq.C13554b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C13554b(Wp.a repository) {
        Intrinsics.j(repository, "repository");
        this.repository = repository;
    }

    public final InterfaceC17152f<Result<Unit>> b() {
        return C17154h.E(new a(null));
    }
}
