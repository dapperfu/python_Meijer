package nm;

import android.security.keystore.UserNotAuthenticatedException;
import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\t\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\t\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0015"}, d2 = {"Lnm/a;", "", "LZk/b;", "couponAPI", "LXi/a;", "authTokenProvider", "<init>", "(LZk/b;LXi/a;)V", "Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "request", "Lkotlin/Result;", "Lcom/meijer/mobile/coupons/api/models/CouponsResponseJson;", "b", "(Lcom/meijer/mobile/coupons/api/models/CouponsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponRequest;", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "a", "(Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "LZk/b;", "LXi/a;", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nm.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C15887a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Zk.b couponAPI;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Xi.a authTokenProvider;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.instoreshopping.service.coupons.CouponDataSource", f = "CouponDataSource.kt", l = {29, 29}, m = "clipCoupon-gIAlu-s")
    /* renamed from: nm.a$a, reason: collision with other inner class name */
    static final class C2347a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f151877a;

        /* renamed from: b, reason: collision with root package name */
        Object f151878b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f151879c;

        /* renamed from: e, reason: collision with root package name */
        int f151881e;

        C2347a(Continuation<? super C2347a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UserNotAuthenticatedException {
            this.f151879c = obj;
            this.f151881e |= Integer.MIN_VALUE;
            Object objA = C15887a.this.a(null, this);
            return objA == IntrinsicsKt.f() ? objA : Result.a(objA);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.instoreshopping.service.coupons.CouponDataSource", f = "CouponDataSource.kt", l = {26, 26}, m = "getCoupons-gIAlu-s")
    /* renamed from: nm.a$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f151882a;

        /* renamed from: b, reason: collision with root package name */
        Object f151883b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f151884c;

        /* renamed from: e, reason: collision with root package name */
        int f151886e;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UserNotAuthenticatedException {
            this.f151884c = obj;
            this.f151886e |= Integer.MIN_VALUE;
            Object objB = C15887a.this.b(null, this);
            return objB == IntrinsicsKt.f() ? objB : Result.a(objB);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.instoreshopping.service.coupons.CouponDataSource", f = "CouponDataSource.kt", l = {l3.f92486e, l3.f92486e}, m = "unclipCoupon-gIAlu-s")
    /* renamed from: nm.a$c */
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f151887a;

        /* renamed from: b, reason: collision with root package name */
        Object f151888b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f151889c;

        /* renamed from: e, reason: collision with root package name */
        int f151891e;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UserNotAuthenticatedException {
            this.f151889c = obj;
            this.f151891e |= Integer.MIN_VALUE;
            Object objC = C15887a.this.c(null, this);
            return objC == IntrinsicsKt.f() ? objC : Result.a(objC);
        }
    }

    public C15887a(Zk.b couponAPI, Xi.a authTokenProvider) {
        Intrinsics.j(couponAPI, "couponAPI");
        Intrinsics.j(authTokenProvider, "authTokenProvider");
        this.couponAPI = couponAPI;
        this.authTokenProvider = authTokenProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest r7, kotlin.coroutines.Continuation<? super kotlin.Result<com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse>> r8) throws android.security.keystore.UserNotAuthenticatedException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof nm.C15887a.C2347a
            if (r0 == 0) goto L13
            r0 = r8
            nm.a$a r0 = (nm.C15887a.C2347a) r0
            int r1 = r0.f151881e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f151881e = r1
            goto L18
        L13:
            nm.a$a r0 = new nm.a$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f151879c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f151881e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f151877a
            com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest r7 = (com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest) r7
            kotlin.ResultKt.b(r8)
            goto L6c
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.f151878b
            Zk.b r7 = (Zk.b) r7
            java.lang.Object r2 = r0.f151877a
            com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest r2 = (com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest) r2
            kotlin.ResultKt.b(r8)
            goto L5c
        L44:
            kotlin.ResultKt.b(r8)
            Zk.b r8 = r6.couponAPI
            Xi.a r2 = r6.authTokenProvider
            r0.f151877a = r7
            r0.f151878b = r8
            r0.f151881e = r4
            java.lang.Object r2 = r2.c(r0)
            if (r2 != r1) goto L58
            goto L6b
        L58:
            r5 = r2
            r2 = r7
            r7 = r8
            r8 = r5
        L5c:
            com.meijer.mobile.authentication.core.model.BearerToken r8 = (com.meijer.mobile.authentication.core.model.BearerToken) r8
            r0.f151877a = r2
            r4 = 0
            r0.f151878b = r4
            r0.f151881e = r3
            java.lang.Object r8 = r7.f(r8, r2, r0)
            if (r8 != r1) goto L6c
        L6b:
            return r1
        L6c:
            retrofit2.Response r8 = (retrofit2.Response) r8
            java.lang.Object r7 = sm.C16985a.a(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nm.C15887a.a(com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.meijer.mobile.coupons.api.models.CouponsRequest r7, kotlin.coroutines.Continuation<? super kotlin.Result<com.meijer.mobile.coupons.api.models.CouponsResponseJson>> r8) throws android.security.keystore.UserNotAuthenticatedException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof nm.C15887a.b
            if (r0 == 0) goto L13
            r0 = r8
            nm.a$b r0 = (nm.C15887a.b) r0
            int r1 = r0.f151886e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f151886e = r1
            goto L18
        L13:
            nm.a$b r0 = new nm.a$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f151884c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f151886e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f151882a
            com.meijer.mobile.coupons.api.models.CouponsRequest r7 = (com.meijer.mobile.coupons.api.models.CouponsRequest) r7
            kotlin.ResultKt.b(r8)
            goto L6c
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.f151883b
            Zk.b r7 = (Zk.b) r7
            java.lang.Object r2 = r0.f151882a
            com.meijer.mobile.coupons.api.models.CouponsRequest r2 = (com.meijer.mobile.coupons.api.models.CouponsRequest) r2
            kotlin.ResultKt.b(r8)
            goto L5c
        L44:
            kotlin.ResultKt.b(r8)
            Zk.b r8 = r6.couponAPI
            Xi.a r2 = r6.authTokenProvider
            r0.f151882a = r7
            r0.f151883b = r8
            r0.f151886e = r4
            java.lang.Object r2 = r2.c(r0)
            if (r2 != r1) goto L58
            goto L6b
        L58:
            r5 = r2
            r2 = r7
            r7 = r8
            r8 = r5
        L5c:
            com.meijer.mobile.authentication.core.model.BearerToken r8 = (com.meijer.mobile.authentication.core.model.BearerToken) r8
            r0.f151882a = r2
            r4 = 0
            r0.f151883b = r4
            r0.f151886e = r3
            java.lang.Object r8 = r7.b(r8, r2, r0)
            if (r8 != r1) goto L6c
        L6b:
            return r1
        L6c:
            retrofit2.Response r8 = (retrofit2.Response) r8
            java.lang.Object r7 = sm.C16985a.a(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nm.C15887a.b(com.meijer.mobile.coupons.api.models.CouponsRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest r7, kotlin.coroutines.Continuation<? super kotlin.Result<com.meijer.mobile.coupons.api.models.ClipUnclipCouponResponse>> r8) throws android.security.keystore.UserNotAuthenticatedException {
        /*
            r6 = this;
            boolean r0 = r8 instanceof nm.C15887a.c
            if (r0 == 0) goto L13
            r0 = r8
            nm.a$c r0 = (nm.C15887a.c) r0
            int r1 = r0.f151891e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f151891e = r1
            goto L18
        L13:
            nm.a$c r0 = new nm.a$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f151889c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f151891e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f151887a
            com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest r7 = (com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest) r7
            kotlin.ResultKt.b(r8)
            goto L6c
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.f151888b
            Zk.b r7 = (Zk.b) r7
            java.lang.Object r2 = r0.f151887a
            com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest r2 = (com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest) r2
            kotlin.ResultKt.b(r8)
            goto L5c
        L44:
            kotlin.ResultKt.b(r8)
            Zk.b r8 = r6.couponAPI
            Xi.a r2 = r6.authTokenProvider
            r0.f151887a = r7
            r0.f151888b = r8
            r0.f151891e = r4
            java.lang.Object r2 = r2.c(r0)
            if (r2 != r1) goto L58
            goto L6b
        L58:
            r5 = r2
            r2 = r7
            r7 = r8
            r8 = r5
        L5c:
            com.meijer.mobile.authentication.core.model.BearerToken r8 = (com.meijer.mobile.authentication.core.model.BearerToken) r8
            r0.f151887a = r2
            r4 = 0
            r0.f151888b = r4
            r0.f151891e = r3
            java.lang.Object r8 = r7.e(r8, r2, r0)
            if (r8 != r1) goto L6c
        L6b:
            return r1
        L6c:
            retrofit2.Response r8 = (retrofit2.Response) r8
            java.lang.Object r7 = sm.C16985a.a(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nm.C15887a.c(com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
