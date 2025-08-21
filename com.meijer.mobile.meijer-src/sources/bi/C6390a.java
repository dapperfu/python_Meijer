package bi;

import Zq.b;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J4\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lbi/a;", "", "LZq/b;", "storeInfoRepository", "<init>", "(LZq/b;)V", "", "zipCode", "", "searchRadius", "maxStores", "Lkotlin/Result;", "Lcom/meijer/mobile/storeinfo/api/model/Store;", "b", "(Ljava/lang/String;IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LZq/b;", "ux_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: bi.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6390a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b storeInfoRepository;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accounts.ux.usecase.neareststore.GetNearestStoreUseCase", f = "GetNearestStoreUseCase.kt", l = {23}, m = "invoke-BWLJW6A")
    /* renamed from: bi.a$a, reason: collision with other inner class name */
    static final class C1203a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f60424a;

        /* renamed from: b, reason: collision with root package name */
        Object f60425b;

        /* renamed from: c, reason: collision with root package name */
        Object f60426c;

        /* renamed from: d, reason: collision with root package name */
        Object f60427d;

        /* renamed from: e, reason: collision with root package name */
        Object f60428e;

        /* renamed from: f, reason: collision with root package name */
        int f60429f;

        /* renamed from: g, reason: collision with root package name */
        int f60430g;

        /* renamed from: h, reason: collision with root package name */
        int f60431h;

        /* renamed from: i, reason: collision with root package name */
        int f60432i;

        /* renamed from: j, reason: collision with root package name */
        int f60433j;

        /* renamed from: k, reason: collision with root package name */
        int f60434k;

        /* renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f60435l;

        /* renamed from: n, reason: collision with root package name */
        int f60437n;

        C1203a(Continuation<? super C1203a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f60435l = obj;
            this.f60437n |= Integer.MIN_VALUE;
            Object objB = C6390a.this.b(null, 0, 0, this);
            return objB == IntrinsicsKt.f() ? objB : Result.a(objB);
        }
    }

    public C6390a(b storeInfoRepository) {
        Intrinsics.j(storeInfoRepository, "storeInfoRepository");
        this.storeInfoRepository = storeInfoRepository;
    }

    public static /* synthetic */ Object c(C6390a c6390a, String str, int i10, int i11, Continuation continuation, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 50;
        }
        if ((i12 & 4) != 0) {
            i11 = 10;
        }
        return c6390a.b(str, i10, i11, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r5, int r6, int r7, kotlin.coroutines.Continuation<? super kotlin.Result<com.meijer.mobile.storeinfo.api.model.Store>> r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof bi.C6390a.C1203a
            if (r0 == 0) goto L13
            r0 = r8
            bi.a$a r0 = (bi.C6390a.C1203a) r0
            int r1 = r0.f60437n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f60437n = r1
            goto L18
        L13:
            bi.a$a r0 = new bi.a$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f60435l
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f60437n
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r5 = r0.f60428e
            bi.a r5 = (bi.C6390a) r5
            java.lang.Object r5 = r0.f60427d
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f60426c
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            java.lang.Object r5 = r0.f60425b
            bi.a r5 = (bi.C6390a) r5
            java.lang.Object r5 = r0.f60424a
            java.lang.String r5 = (java.lang.String) r5
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Exception -> L3d
            goto L70
        L3d:
            r5 = move-exception
            goto L75
        L3f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L47:
            kotlin.ResultKt.b(r8)
            kotlin.Result$Companion r8 = kotlin.Result.INSTANCE     // Catch: java.lang.Exception -> L3d
            Zq.b r8 = a(r4)     // Catch: java.lang.Exception -> L3d
            r0.f60424a = r5     // Catch: java.lang.Exception -> L3d
            r0.f60425b = r4     // Catch: java.lang.Exception -> L3d
            r0.f60426c = r0     // Catch: java.lang.Exception -> L3d
            r0.f60427d = r0     // Catch: java.lang.Exception -> L3d
            r0.f60428e = r4     // Catch: java.lang.Exception -> L3d
            r0.f60429f = r6     // Catch: java.lang.Exception -> L3d
            r0.f60430g = r7     // Catch: java.lang.Exception -> L3d
            r2 = 0
            r0.f60431h = r2     // Catch: java.lang.Exception -> L3d
            r0.f60432i = r2     // Catch: java.lang.Exception -> L3d
            r0.f60433j = r2     // Catch: java.lang.Exception -> L3d
            r0.f60434k = r2     // Catch: java.lang.Exception -> L3d
            r0.f60437n = r3     // Catch: java.lang.Exception -> L3d
            java.lang.Object r8 = r8.c(r5, r6, r7, r0)     // Catch: java.lang.Exception -> L3d
            if (r8 != r1) goto L70
            return r1
        L70:
            java.lang.Object r5 = kotlin.Result.b(r8)     // Catch: java.lang.Exception -> L3d
            return r5
        L75:
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            mv.E0.i(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bi.C6390a.b(java.lang.String, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
