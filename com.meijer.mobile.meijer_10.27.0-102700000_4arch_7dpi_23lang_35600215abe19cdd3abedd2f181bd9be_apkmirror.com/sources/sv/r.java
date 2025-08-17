package sv;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import kotlin.BuilderInference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C16616I;
import qv.EnumC16624Q;
import qv.InterfaceC16622O;
import qv.InterfaceC16654n;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0004\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001ad\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a§\u0001\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u0006*\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152-\b\u0002\u0010\u001d\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0017j\u0004\u0018\u0001`\u001c2/\b\u0001\u0010\u0003\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\f¢\u0006\u0002\b\u000fH\u0000¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lsv/t;", "Lkotlin/Function0;", "", "block", "a", "(Lsv/t;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "E", "Lqv/O;", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "Lsv/v;", "b", "(Lqv/O;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/functions/Function2;)Lsv/v;", "Lsv/a;", "onBufferOverflow", "Lqv/Q;", "start", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "c", "(Lqv/O;Lkotlin/coroutines/CoroutineContext;ILsv/a;Lqv/Q;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lsv/v;", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public final class r {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {HttpResponseStatus.REDIRECTION_FOUND}, m = "awaitClose")
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f161316a;

        /* renamed from: b, reason: collision with root package name */
        Object f161317b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f161318c;

        /* renamed from: d, reason: collision with root package name */
        int f161319d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f161318c = obj;
            this.f161319d |= Integer.MIN_VALUE;
            return r.a(null, null, this);
        }

        a(Continuation<? super a> continuation) {
            super(continuation);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function1<Throwable, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC16654n<Unit> f161320a;

        /* JADX WARN: Multi-variable type inference failed */
        b(InterfaceC16654n<? super Unit> interfaceC16654n) {
            this.f161320a = interfaceC16654n;
        }

        public final void a(Throwable th2) {
            InterfaceC16654n<Unit> interfaceC16654n = this.f161320a;
            Result.Companion companion = Result.INSTANCE;
            interfaceC16654n.resumeWith(Result.b(Unit.f142422a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    public static final <E> v<E> c(InterfaceC16622O interfaceC16622O, CoroutineContext coroutineContext, int i10, EnumC17050a enumC17050a, EnumC16624Q enumC16624Q, Function1<? super Throwable, Unit> function1, @BuilderInference Function2<? super t<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        s sVar = new s(C16616I.k(interfaceC16622O, coroutineContext), j.b(i10, enumC17050a, null, 4, null));
        if (function1 != null) {
            sVar.K(function1);
        }
        sVar.i1(enumC16624Q, sVar, function2);
        return sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(sv.t<?> r4, kotlin.jvm.functions.Function0<kotlin.Unit> r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
        /*
            boolean r0 = r6 instanceof sv.r.a
            if (r0 == 0) goto L13
            r0 = r6
            sv.r$a r0 = (sv.r.a) r0
            int r1 = r0.f161319d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161319d = r1
            goto L18
        L13:
            sv.r$a r0 = new sv.r$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f161318c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f161319d
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f161317b
            r5 = r4
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            java.lang.Object r4 = r0.f161316a
            sv.t r4 = (sv.t) r4
            kotlin.ResultKt.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.ResultKt.b(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            qv.C0$b r2 = qv.C0.INSTANCE
            kotlin.coroutines.CoroutineContext$Element r6 = r6.g(r2)
            if (r6 != r4) goto L7f
            r0.f161316a = r4     // Catch: java.lang.Throwable -> L32
            r0.f161317b = r5     // Catch: java.lang.Throwable -> L32
            r0.f161319d = r3     // Catch: java.lang.Throwable -> L32
            qv.p r6 = new qv.p     // Catch: java.lang.Throwable -> L32
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.c(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.C()     // Catch: java.lang.Throwable -> L32
            sv.r$b r2 = new sv.r$b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.f(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.v()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            kotlin.coroutines.jvm.internal.DebugProbesKt.c(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.invoke()
            kotlin.Unit r4 = kotlin.Unit.f142422a
            return r4
        L7b:
            r5.invoke()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: sv.r.a(sv.t, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <E> v<E> b(InterfaceC16622O interfaceC16622O, CoroutineContext coroutineContext, int i10, @BuilderInference Function2<? super t<? super E>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return c(interfaceC16622O, coroutineContext, i10, EnumC17050a.f161240a, EnumC16624Q.f157611a, null, function2);
    }

    public static /* synthetic */ v d(InterfaceC16622O interfaceC16622O, CoroutineContext coroutineContext, int i10, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f142646a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return b(interfaceC16622O, coroutineContext, i10, function2);
    }

    public static /* synthetic */ v e(InterfaceC16622O interfaceC16622O, CoroutineContext coroutineContext, int i10, EnumC17050a enumC17050a, EnumC16624Q enumC16624Q, Function1 function1, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f142646a;
        }
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            enumC17050a = EnumC17050a.f161240a;
        }
        if ((i11 & 8) != 0) {
            enumC16624Q = EnumC16624Q.f157611a;
        }
        if ((i11 & 16) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        return c(interfaceC16622O, coroutineContext, i10, enumC17050a, enumC16624Q, function12, function2);
    }
}
