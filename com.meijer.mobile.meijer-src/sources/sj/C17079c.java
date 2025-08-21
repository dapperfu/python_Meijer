package sj;

import fj.CartChanges;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.AbstractC15779K;
import mv.C15805i;
import mv.InterfaceC15783O;
import nk.i;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0016B%\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ8\u0010\u0014\u001a\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e2\f\b\u0002\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lsj/c;", "", "LYi/a;", "tokenProvider", "Lsj/a;", "cartApi", "Lmv/K;", "ioDispatcher", "<init>", "(LYi/a;Lsj/a;Lmv/K;)V", "", "Lnk/i;", "entries", "", "Lcom/meijer/mobile/core/model/common/StoreId;", "storeId", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "cartId", "Lfj/e;", "c", "(Ljava/util/List;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "LYi/a;", "b", "Lsj/a;", "Lmv/K;", "getIoDispatcher", "()Lmv/K;", "d", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sj.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C17079c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Yi.a tokenProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC17077a cartApi;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AbstractC15779K ioDispatcher;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "Lfj/e;", "<anonymous>", "(Lmv/O;)Lfj/e;"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.cart.service.hybris.CartEntryDataSource$updateItems$2", f = "CartEntryDataSource.kt", l = {54, 55}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: sj.c$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super CartChanges>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f160795a;

        /* renamed from: b, reason: collision with root package name */
        int f160796b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f160798d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f160799e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<i> f160800f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(String str, int i10, List<? extends i> list, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f160798d = str;
            this.f160799e = i10;
            this.f160800f = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C17079c.this.new b(this.f160798d, this.f160799e, this.f160800f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super CartChanges> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
        
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
                int r1 = r13.f160796b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                java.lang.Object r0 = r13.f160795a
                com.meijer.mobile.authentication.core.model.BearerToken r0 = (com.meijer.mobile.authentication.core.model.BearerToken) r0
                kotlin.ResultKt.b(r14)
                r10 = r13
                goto L5a
            L17:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1f:
                kotlin.ResultKt.b(r14)
                goto L36
            L23:
                kotlin.ResultKt.b(r14)
                sj.c r14 = sj.C17079c.this
                Yi.a r14 = sj.C17079c.b(r14)
                r13.f160796b = r3
                java.lang.Object r14 = r14.c(r13)
                if (r14 != r0) goto L36
                r10 = r13
                goto L59
            L36:
                r4 = r14
                com.meijer.mobile.authentication.core.model.BearerToken r4 = (com.meijer.mobile.authentication.core.model.BearerToken) r4
                sj.c r14 = sj.C17079c.this
                sj.a r3 = sj.C17079c.a(r14)
                java.lang.String r5 = r13.f160798d
                int r6 = r13.f160799e
                java.util.List<nk.i> r14 = r13.f160800f
                com.meijer.mobile.cart.model.hybris.HybrisBatchEntryUpdateRequest r8 = kj.n.a(r14)
                r13.f160795a = r4
                r13.f160796b = r2
                r7 = 0
                r9 = 0
                r11 = 40
                r12 = 0
                r10 = r13
                java.lang.Object r14 = sj.InterfaceC17077a.G(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                if (r14 != r0) goto L5a
            L59:
                return r0
            L5a:
                retrofit2.Response r14 = (retrofit2.Response) r14
                boolean r0 = r14.isSuccessful()
                if (r0 == 0) goto L8b
                java.lang.Object r0 = r14.body()
                com.meijer.mobile.cart.model.hybris.CartModifications r0 = (com.meijer.mobile.cart.model.hybris.CartModifications) r0
                r1 = 0
                if (r0 == 0) goto L87
                int r2 = r10.f160799e
                java.lang.Integer r2 = kotlin.coroutines.jvm.internal.Boxing.d(r2)
                java.util.List<nk.i> r3 = r10.f160800f
                okhttp3.Headers r14 = r14.headers()
                java.lang.String r4 = "totalunitcount"
                java.lang.String r14 = r14.get(r4)
                if (r14 == 0) goto L83
                java.lang.Integer r1 = kotlin.text.StringsKt.v(r14)
            L83:
                fj.e r1 = kj.C15215e.b(r0, r2, r3, r1)
            L87:
                kotlin.jvm.internal.Intrinsics.g(r1)
                return r1
            L8b:
                retrofit2.HttpException r0 = new retrofit2.HttpException
                r0.<init>(r14)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: sj.C17079c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C17079c(Yi.a tokenProvider, InterfaceC17077a cartApi, AbstractC15779K ioDispatcher) {
        Intrinsics.j(tokenProvider, "tokenProvider");
        Intrinsics.j(cartApi, "cartApi");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.tokenProvider = tokenProvider;
        this.cartApi = cartApi;
        this.ioDispatcher = ioDispatcher;
    }

    public static /* synthetic */ Object d(C17079c c17079c, List list, int i10, String str, Continuation continuation, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = "current";
        }
        return c17079c.c(list, i10, str, continuation);
    }

    public final Object c(List<? extends i> list, int i10, String str, Continuation<? super CartChanges> continuation) {
        if (list.isEmpty()) {
            return new CartChanges(Boxing.d(i10), null, null, 6, null);
        }
        return C15805i.g(this.ioDispatcher, new b(str, i10, list, null), continuation);
    }
}
