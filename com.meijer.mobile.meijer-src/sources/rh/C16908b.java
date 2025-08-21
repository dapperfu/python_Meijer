package rh;

import com.squareup.moshi.t;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lrh/b;", "", "Lrh/a;", "accountLinkingApi", "Lcom/squareup/moshi/t;", "moshi", "<init>", "(Lrh/a;Lcom/squareup/moshi/t;)V", "", "phoneNumber", "", "a", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lrh/a;", "b", "Lcom/squareup/moshi/t;", "accountlinking_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: rh.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C16908b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC16907a accountLinkingApi;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t moshi;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.accountlinking.api.AccountLinkingRepository", f = "AccountLinkingRepository.kt", l = {38}, m = "isPhoneNumberTextable")
    /* renamed from: rh.b$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f159547a;

        /* renamed from: b, reason: collision with root package name */
        Object f159548b;

        /* renamed from: c, reason: collision with root package name */
        int f159549c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f159550d;

        /* renamed from: f, reason: collision with root package name */
        int f159552f;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f159550d = obj;
            this.f159552f |= Integer.MIN_VALUE;
            return C16908b.this.a(null, this);
        }
    }

    public C16908b(InterfaceC16907a accountLinkingApi, t moshi) {
        Intrinsics.j(accountLinkingApi, "accountLinkingApi");
        Intrinsics.j(moshi, "moshi");
        this.accountLinkingApi = accountLinkingApi;
        this.moshi = moshi;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r5, kotlin.coroutines.Continuation<? super java.lang.Boolean> r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof rh.C16908b.a
            if (r0 == 0) goto L13
            r0 = r6
            rh.b$a r0 = (rh.C16908b.a) r0
            int r1 = r0.f159552f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f159552f = r1
            goto L18
        L13:
            rh.b$a r0 = new rh.b$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f159550d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f159552f
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f159548b
            rh.b r5 = (rh.C16908b) r5
            java.lang.Object r5 = r0.f159547a
            java.lang.String r5 = (java.lang.String) r5
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L31
            goto L57
        L31:
            r5 = move-exception
            goto L6c
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.ResultKt.b(r6)
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L31
            rh.a r6 = r4.accountLinkingApi     // Catch: java.lang.Throwable -> L31
            com.meijer.mobile.accountlinking.api.model.ValidatePhoneNumberRequest r2 = new com.meijer.mobile.accountlinking.api.model.ValidatePhoneNumberRequest     // Catch: java.lang.Throwable -> L31
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L31
            r0.f159547a = r5     // Catch: java.lang.Throwable -> L31
            r0.f159548b = r4     // Catch: java.lang.Throwable -> L31
            r5 = 0
            r0.f159549c = r5     // Catch: java.lang.Throwable -> L31
            r0.f159552f = r3     // Catch: java.lang.Throwable -> L31
            java.lang.Object r6 = r6.a(r2, r0)     // Catch: java.lang.Throwable -> L31
            if (r6 != r1) goto L57
            return r1
        L57:
            com.meijer.mobile.accountlinking.api.model.ValidatePhoneNumberResponse r6 = (com.meijer.mobile.accountlinking.api.model.ValidatePhoneNumberResponse) r6     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = r6.getIsTextable()     // Catch: java.lang.Throwable -> L31
            java.lang.String r6 = "true"
            boolean r5 = kotlin.text.StringsKt.H(r5, r6, r3)     // Catch: java.lang.Throwable -> L31
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.a(r5)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r5 = kotlin.Result.b(r5)     // Catch: java.lang.Throwable -> L31
            goto L76
        L6c:
            kotlin.Result$Companion r6 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        L76:
            java.lang.Throwable r6 = kotlin.Result.e(r5)
            if (r6 != 0) goto L7d
            return r5
        L7d:
            boolean r5 = r6 instanceof retrofit2.HttpException
            r0 = 0
            if (r5 == 0) goto L86
            r5 = r6
            retrofit2.HttpException r5 = (retrofit2.HttpException) r5
            goto L87
        L86:
            r5 = r0
        L87:
            if (r5 == 0) goto Ld3
            retrofit2.Response r5 = r5.response()     // Catch: java.lang.Throwable -> L9a
            if (r5 == 0) goto L9c
            okhttp3.ResponseBody r5 = r5.errorBody()     // Catch: java.lang.Throwable -> L9a
            if (r5 == 0) goto L9c
            java.lang.String r5 = r5.string()     // Catch: java.lang.Throwable -> L9a
            goto L9d
        L9a:
            r5 = move-exception
            goto La2
        L9c:
            r5 = r0
        L9d:
            java.lang.Object r5 = kotlin.Result.b(r5)     // Catch: java.lang.Throwable -> L9a
            goto Lac
        La2:
            kotlin.Result$Companion r1 = kotlin.Result.INSTANCE
            java.lang.Object r5 = kotlin.ResultKt.a(r5)
            java.lang.Object r5 = kotlin.Result.b(r5)
        Lac:
            boolean r1 = kotlin.Result.g(r5)
            if (r1 == 0) goto Lb3
            r5 = r0
        Lb3:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto Ld3
            com.squareup.moshi.t r1 = r4.moshi
            java.lang.Class<com.meijer.mobile.accountlinking.api.model.ValidatePhoneNumberErrorResponse> r2 = com.meijer.mobile.accountlinking.api.model.ValidatePhoneNumberErrorResponse.class
            com.squareup.moshi.h r1 = r1.c(r2)
            java.lang.Object r5 = r1.fromJson(r5)
            com.meijer.mobile.accountlinking.api.model.ValidatePhoneNumberErrorResponse r5 = (com.meijer.mobile.accountlinking.api.model.ValidatePhoneNumberErrorResponse) r5
            if (r5 == 0) goto Lcb
            java.lang.String r0 = r5.getErrorMessage()
        Lcb:
            if (r0 == 0) goto Ld3
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>(r0, r6)
            r6 = r5
        Ld3:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rh.C16908b.a(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
