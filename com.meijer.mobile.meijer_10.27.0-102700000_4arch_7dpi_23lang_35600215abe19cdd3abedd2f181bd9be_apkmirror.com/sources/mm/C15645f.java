package mm;

import com.meijer.mobile.instoreshopping.service.accounts.models.BlockedUserRequest;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lmm/f;", "Lmm/e;", "Lmm/b;", "accountsDataSource", "<init>", "(Lmm/b;)V", "Lcom/meijer/mobile/instoreshopping/service/accounts/models/BlockedUserRequest;", "request", "", "b", "(Lcom/meijer/mobile/instoreshopping/service/accounts/models/BlockedUserRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lmm/b;", "instoreshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: mm.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C15645f implements InterfaceC15644e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C15641b accountsDataSource;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "com.meijer.mobile.instoreshopping.service.accounts.AccountsRepositoryImpl", f = "AccountsRepositoryImpl.kt", l = {23}, m = "getMPerksBarcode")
    /* renamed from: mm.f$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f150173a;

        /* renamed from: c, reason: collision with root package name */
        int f150175c;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f150173a = obj;
            this.f150175c |= Integer.MIN_VALUE;
            return C15645f.this.a(this);
        }
    }

    public C15645f(C15641b accountsDataSource) {
        Intrinsics.j(accountsDataSource, "accountsDataSource");
        this.accountsDataSource = accountsDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // mm.InterfaceC15644e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(kotlin.coroutines.Continuation<? super java.lang.String> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof mm.C15645f.a
            if (r0 == 0) goto L13
            r0 = r5
            mm.f$a r0 = (mm.C15645f.a) r0
            int r1 = r0.f150175c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f150175c = r1
            goto L18
        L13:
            mm.f$a r0 = new mm.f$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f150173a
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f150175c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.b(r5)
            mm.b r5 = r4.accountsDataSource
            r0.f150175c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.meijer.mobile.instoreshopping.service.accounts.models.MPerksBarcodeResponse r5 = (com.meijer.mobile.instoreshopping.service.accounts.models.MPerksBarcodeResponse) r5
            java.lang.String r5 = r5.getBarcode()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mm.C15645f.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // mm.InterfaceC15644e
    public Object b(BlockedUserRequest blockedUserRequest, Continuation<? super Boolean> continuation) {
        return this.accountsDataSource.d(blockedUserRequest, continuation);
    }
}
