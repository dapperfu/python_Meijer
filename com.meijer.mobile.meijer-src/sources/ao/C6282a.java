package ao;

import com.meijer.mobile.mperks.creditcard.api.models.RewardClubTermsResponse;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000eH\u0086@¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lao/a;", "", "Lao/b;", "rewardsService", "<init>", "(Lao/b;)V", "", "firstName", "lastName", "", "termsID", "j$/time/LocalDate", "birthDate", "lastFourOfCard", "", "b", "(Ljava/lang/String;Ljava/lang/String;JLj$/time/LocalDate;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "c", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "clubID", "newTerms", "Lcom/meijer/mobile/mperks/creditcard/api/models/RewardClubTermsResponse;", "a", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lao/b;", "creditcard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ao.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C6282a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C6283b rewardsService;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.mperks.creditcard.domain.RewardsRepository", f = "RewardsRepository.kt", l = {24}, m = "optIntoMeijerCreditCardRewards")
    /* renamed from: ao.a$a, reason: collision with other inner class name */
    static final class C1175a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f59573a;

        /* renamed from: b, reason: collision with root package name */
        Object f59574b;

        /* renamed from: c, reason: collision with root package name */
        Object f59575c;

        /* renamed from: d, reason: collision with root package name */
        Object f59576d;

        /* renamed from: e, reason: collision with root package name */
        Object f59577e;

        /* renamed from: f, reason: collision with root package name */
        long f59578f;

        /* renamed from: g, reason: collision with root package name */
        int f59579g;

        /* renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f59580h;

        /* renamed from: j, reason: collision with root package name */
        int f59582j;

        C1175a(Continuation<? super C1175a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f59580h = obj;
            this.f59582j |= Integer.MIN_VALUE;
            return C6282a.this.b(null, null, 0L, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.mperks.creditcard.domain.RewardsRepository", f = "RewardsRepository.kt", l = {40}, m = "optOutOfMeijerCreditCardRewards")
    /* renamed from: ao.a$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f59583a;

        /* renamed from: b, reason: collision with root package name */
        int f59584b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f59585c;

        /* renamed from: e, reason: collision with root package name */
        int f59587e;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f59585c = obj;
            this.f59587e |= Integer.MIN_VALUE;
            return C6282a.this.c(this);
        }
    }

    public C6282a(C6283b rewardsService) {
        Intrinsics.j(rewardsService, "rewardsService");
        this.rewardsService = rewardsService;
    }

    public final Object a(int i10, boolean z10, Continuation<? super RewardClubTermsResponse> continuation) {
        return this.rewardsService.c(i10, z10, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r12, java.lang.String r13, long r14, j$.time.LocalDate r16, java.lang.String r17, kotlin.coroutines.Continuation<? super java.lang.Boolean> r18) {
        /*
            r11 = this;
            r0 = r18
            boolean r1 = r0 instanceof ao.C6282a.C1175a
            if (r1 == 0) goto L16
            r1 = r0
            ao.a$a r1 = (ao.C6282a.C1175a) r1
            int r2 = r1.f59582j
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f59582j = r2
        L14:
            r9 = r1
            goto L1c
        L16:
            ao.a$a r1 = new ao.a$a
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r9.f59580h
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r9.f59582j
            r10 = 1
            if (r2 == 0) goto L4c
            if (r2 != r10) goto L44
            java.lang.Object r12 = r9.f59577e
            ao.a r12 = (ao.C6282a) r12
            java.lang.Object r12 = r9.f59576d
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r9.f59575c
            j$.time.LocalDate r12 = (j$.time.LocalDate) r12
            java.lang.Object r12 = r9.f59574b
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r12 = r9.f59573a
            java.lang.String r12 = (java.lang.String) r12
            kotlin.ResultKt.b(r0)     // Catch: java.lang.Throwable -> L41
            goto L72
        L41:
            r0 = move-exception
            r12 = r0
            goto L79
        L44:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L4c:
            kotlin.ResultKt.b(r0)
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L41
            ao.b r2 = r11.rewardsService     // Catch: java.lang.Throwable -> L41
            r9.f59573a = r12     // Catch: java.lang.Throwable -> L41
            r9.f59574b = r13     // Catch: java.lang.Throwable -> L41
            r7 = r16
            r9.f59575c = r7     // Catch: java.lang.Throwable -> L41
            r8 = r17
            r9.f59576d = r8     // Catch: java.lang.Throwable -> L41
            r9.f59577e = r11     // Catch: java.lang.Throwable -> L41
            r9.f59578f = r14     // Catch: java.lang.Throwable -> L41
            r0 = 0
            r9.f59579g = r0     // Catch: java.lang.Throwable -> L41
            r9.f59582j = r10     // Catch: java.lang.Throwable -> L41
            r3 = r12
            r4 = r13
            r5 = r14
            java.lang.Object r0 = r2.d(r3, r4, r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L41
            if (r0 != r1) goto L72
            return r1
        L72:
            bo.a r0 = (bo.MCCOptInOutResponse) r0     // Catch: java.lang.Throwable -> L41
            java.lang.Object r12 = kotlin.Result.b(r0)     // Catch: java.lang.Throwable -> L41
            goto L83
        L79:
            kotlin.Result$Companion r13 = kotlin.Result.INSTANCE
            java.lang.Object r12 = kotlin.ResultKt.a(r12)
            java.lang.Object r12 = kotlin.Result.b(r12)
        L83:
            boolean r13 = kotlin.Result.h(r12)
            if (r13 == 0) goto Lb0
            bo.a r12 = (bo.MCCOptInOutResponse) r12     // Catch: java.lang.Throwable -> L9a
            boolean r13 = r12.b()     // Catch: java.lang.Throwable -> L9a
            if (r13 == 0) goto L9d
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.Boxing.a(r10)     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r12 = kotlin.Result.b(r12)     // Catch: java.lang.Throwable -> L9a
            goto Lb4
        L9a:
            r0 = move-exception
            r12 = r0
            goto Laa
        L9d:
            com.meijer.mobile.core.networking.exceptions.RetrofitException$a r13 = com.meijer.mobile.core.networking.exceptions.RetrofitException.INSTANCE     // Catch: java.lang.Throwable -> L9a
            bo.b r12 = r12.getStatusCode()     // Catch: java.lang.Throwable -> L9a
            r14 = 2
            r15 = 0
            com.meijer.mobile.core.networking.exceptions.RetrofitException r12 = com.meijer.mobile.core.networking.exceptions.RetrofitException.Companion.f(r13, r12, r15, r14, r15)     // Catch: java.lang.Throwable -> L9a
            throw r12     // Catch: java.lang.Throwable -> L9a
        Laa:
            kotlin.Result$Companion r13 = kotlin.Result.INSTANCE
            java.lang.Object r12 = kotlin.ResultKt.a(r12)
        Lb0:
            java.lang.Object r12 = kotlin.Result.b(r12)
        Lb4:
            kotlin.ResultKt.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.C6282a.b(java.lang.String, java.lang.String, long, j$.time.LocalDate, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation<? super java.lang.Boolean> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ao.C6282a.b
            if (r0 == 0) goto L13
            r0 = r5
            ao.a$b r0 = (ao.C6282a.b) r0
            int r1 = r0.f59587e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f59587e = r1
            goto L18
        L13:
            ao.a$b r0 = new ao.a$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f59585c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f59587e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f59583a
            ao.a r0 = (ao.C6282a) r0
            kotlin.ResultKt.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L4c
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.ResultKt.b(r5)
            kotlin.Result$Companion r5 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L2d
            ao.b r5 = r4.rewardsService     // Catch: java.lang.Throwable -> L2d
            r0.f59583a = r4     // Catch: java.lang.Throwable -> L2d
            r2 = 0
            r0.f59584b = r2     // Catch: java.lang.Throwable -> L2d
            r0.f59587e = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = r5.e(r0)     // Catch: java.lang.Throwable -> L2d
            if (r5 != r1) goto L4c
            return r1
        L4c:
            bo.a r5 = (bo.MCCOptInOutResponse) r5     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r5 = kotlin.Result.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L5d
        L53:
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L5d:
            boolean r0 = kotlin.Result.h(r5)
            if (r0 == 0) goto L87
            bo.a r5 = (bo.MCCOptInOutResponse) r5     // Catch: java.lang.Throwable -> L74
            boolean r5 = r5.b()     // Catch: java.lang.Throwable -> L74
            if (r5 == 0) goto L76
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r3)     // Catch: java.lang.Throwable -> L74
            java.lang.Object r5 = kotlin.Result.b(r5)     // Catch: java.lang.Throwable -> L74
            goto L8b
        L74:
            r5 = move-exception
            goto L81
        L76:
            com.meijer.mobile.core.networking.exceptions.RetrofitException$a r5 = com.meijer.mobile.core.networking.exceptions.RetrofitException.INSTANCE     // Catch: java.lang.Throwable -> L74
            bo.c r0 = bo.EnumC6399c.f60477i     // Catch: java.lang.Throwable -> L74
            r1 = 2
            r2 = 0
            com.meijer.mobile.core.networking.exceptions.RetrofitException r5 = com.meijer.mobile.core.networking.exceptions.RetrofitException.Companion.f(r5, r0, r2, r1, r2)     // Catch: java.lang.Throwable -> L74
            throw r5     // Catch: java.lang.Throwable -> L74
        L81:
            kotlin.Result$Companion r0 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
        L87:
            java.lang.Object r5 = kotlin.Result.b(r5)
        L8b:
            kotlin.ResultKt.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ao.C6282a.c(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
