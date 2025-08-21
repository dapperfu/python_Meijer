package om;

import al.InterfaceC5699b;
import android.security.keystore.UserNotAuthenticatedException;
import com.medallia.digital.mobilesdk.l3;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\t\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\u0006\u0010\t\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014¨\u0006\u0015"}, d2 = {"Lom/a;", "", "Lal/b;", "couponAPI", "LYi/a;", "authTokenProvider", "<init>", "(Lal/b;LYi/a;)V", "Lcom/meijer/mobile/coupons/api/models/CouponsRequest;", "request", "Lkotlin/Result;", "Lcom/meijer/mobile/coupons/api/models/CouponsResponseJson;", "b", "(Lcom/meijer/mobile/coupons/api/models/CouponsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponRequest;", "Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponResponse;", "a", "(Lcom/meijer/mobile/coupons/api/models/ClipUnclipCouponRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "Lal/b;", "LYi/a;", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: om.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C16221a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5699b couponAPI;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Yi.a authTokenProvider;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.instoreshopping.service.coupons.CouponDataSource", f = "CouponDataSource.kt", l = {29, 29}, m = "clipCoupon-gIAlu-s")
    /* renamed from: om.a$a, reason: collision with other inner class name */
    static final class C2394a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f154772a;

        /* renamed from: b, reason: collision with root package name */
        Object f154773b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f154774c;

        /* renamed from: e, reason: collision with root package name */
        int f154776e;

        C2394a(Continuation<? super C2394a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UserNotAuthenticatedException {
            this.f154774c = obj;
            this.f154776e |= Integer.MIN_VALUE;
            Object objA = C16221a.this.a(null, this);
            return objA == IntrinsicsKt.f() ? objA : Result.a(objA);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.instoreshopping.service.coupons.CouponDataSource", f = "CouponDataSource.kt", l = {26, 26}, m = "getCoupons-gIAlu-s")
    /* renamed from: om.a$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f154777a;

        /* renamed from: b, reason: collision with root package name */
        Object f154778b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f154779c;

        /* renamed from: e, reason: collision with root package name */
        int f154781e;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UserNotAuthenticatedException {
            this.f154779c = obj;
            this.f154781e |= Integer.MIN_VALUE;
            Object objB = C16221a.this.b(null, this);
            return objB == IntrinsicsKt.f() ? objB : Result.a(objB);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.instoreshopping.service.coupons.CouponDataSource", f = "CouponDataSource.kt", l = {l3.f93325e, l3.f93325e}, m = "unclipCoupon-gIAlu-s")
    /* renamed from: om.a$c */
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f154782a;

        /* renamed from: b, reason: collision with root package name */
        Object f154783b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f154784c;

        /* renamed from: e, reason: collision with root package name */
        int f154786e;

        c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UserNotAuthenticatedException {
            this.f154784c = obj;
            this.f154786e |= Integer.MIN_VALUE;
            Object objC = C16221a.this.c(null, this);
            return objC == IntrinsicsKt.f() ? objC : Result.a(objC);
        }
    }

    public C16221a(InterfaceC5699b couponAPI, Yi.a authTokenProvider) {
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
            boolean r0 = r8 instanceof om.C16221a.C2394a
            if (r0 == 0) goto L13
            r0 = r8
            om.a$a r0 = (om.C16221a.C2394a) r0
            int r1 = r0.f154776e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f154776e = r1
            goto L18
        L13:
            om.a$a r0 = new om.a$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f154774c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f154776e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f154772a
            com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest r7 = (com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest) r7
            kotlin.ResultKt.b(r8)
            goto L6c
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.f154773b
            al.b r7 = (al.InterfaceC5699b) r7
            java.lang.Object r2 = r0.f154772a
            com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest r2 = (com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest) r2
            kotlin.ResultKt.b(r8)
            goto L5c
        L44:
            kotlin.ResultKt.b(r8)
            al.b r8 = r6.couponAPI
            Yi.a r2 = r6.authTokenProvider
            r0.f154772a = r7
            r0.f154773b = r8
            r0.f154776e = r4
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
            r0.f154772a = r2
            r4 = 0
            r0.f154773b = r4
            r0.f154776e = r3
            java.lang.Object r8 = r7.f(r8, r2, r0)
            if (r8 != r1) goto L6c
        L6b:
            return r1
        L6c:
            retrofit2.Response r8 = (retrofit2.Response) r8
            java.lang.Object r7 = tm.C17273a.a(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: om.C16221a.a(com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest, kotlin.coroutines.Continuation):java.lang.Object");
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
            boolean r0 = r8 instanceof om.C16221a.b
            if (r0 == 0) goto L13
            r0 = r8
            om.a$b r0 = (om.C16221a.b) r0
            int r1 = r0.f154781e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f154781e = r1
            goto L18
        L13:
            om.a$b r0 = new om.a$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f154779c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f154781e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f154777a
            com.meijer.mobile.coupons.api.models.CouponsRequest r7 = (com.meijer.mobile.coupons.api.models.CouponsRequest) r7
            kotlin.ResultKt.b(r8)
            goto L6c
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.f154778b
            al.b r7 = (al.InterfaceC5699b) r7
            java.lang.Object r2 = r0.f154777a
            com.meijer.mobile.coupons.api.models.CouponsRequest r2 = (com.meijer.mobile.coupons.api.models.CouponsRequest) r2
            kotlin.ResultKt.b(r8)
            goto L5c
        L44:
            kotlin.ResultKt.b(r8)
            al.b r8 = r6.couponAPI
            Yi.a r2 = r6.authTokenProvider
            r0.f154777a = r7
            r0.f154778b = r8
            r0.f154781e = r4
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
            r0.f154777a = r2
            r4 = 0
            r0.f154778b = r4
            r0.f154781e = r3
            java.lang.Object r8 = r7.b(r8, r2, r0)
            if (r8 != r1) goto L6c
        L6b:
            return r1
        L6c:
            retrofit2.Response r8 = (retrofit2.Response) r8
            java.lang.Object r7 = tm.C17273a.a(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: om.C16221a.b(com.meijer.mobile.coupons.api.models.CouponsRequest, kotlin.coroutines.Continuation):java.lang.Object");
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
            boolean r0 = r8 instanceof om.C16221a.c
            if (r0 == 0) goto L13
            r0 = r8
            om.a$c r0 = (om.C16221a.c) r0
            int r1 = r0.f154786e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f154786e = r1
            goto L18
        L13:
            om.a$c r0 = new om.a$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f154784c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f154786e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f154782a
            com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest r7 = (com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest) r7
            kotlin.ResultKt.b(r8)
            goto L6c
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.f154783b
            al.b r7 = (al.InterfaceC5699b) r7
            java.lang.Object r2 = r0.f154782a
            com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest r2 = (com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest) r2
            kotlin.ResultKt.b(r8)
            goto L5c
        L44:
            kotlin.ResultKt.b(r8)
            al.b r8 = r6.couponAPI
            Yi.a r2 = r6.authTokenProvider
            r0.f154782a = r7
            r0.f154783b = r8
            r0.f154786e = r4
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
            r0.f154782a = r2
            r4 = 0
            r0.f154783b = r4
            r0.f154786e = r3
            java.lang.Object r8 = r7.e(r8, r2, r0)
            if (r8 != r1) goto L6c
        L6b:
            return r1
        L6c:
            retrofit2.Response r8 = (retrofit2.Response) r8
            java.lang.Object r7 = tm.C17273a.a(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: om.C16221a.c(com.meijer.mobile.coupons.api.models.ClipUnclipCouponRequest, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
