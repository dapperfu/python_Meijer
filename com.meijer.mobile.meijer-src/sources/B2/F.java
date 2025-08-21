package B2;

import com.google.android.gms.common.api.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import mv.C0;
import mv.C15809k;
import mv.InterfaceC15783O;
import ov.k;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\t\u0012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R0\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"LB2/F;", "T", "", "Lmv/O;", "scope", "Lkotlin/Function1;", "", "", "onComplete", "Lkotlin/Function2;", "onUndeliveredElement", "Lkotlin/coroutines/Continuation;", "consumeMessage", "<init>", "(Lmv/O;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "msg", "e", "(Ljava/lang/Object;)V", "a", "Lmv/O;", "b", "Lkotlin/jvm/functions/Function2;", "Lov/g;", "c", "Lov/g;", "messageQueue", "LB2/b;", "d", "LB2/b;", "remainingMessages", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class F<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC15783O scope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function2<T, Continuation<? super Unit>, Object> consumeMessage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ov.g<T> messageQueue;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C2905b remainingMessages;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "ex", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends Lambda implements Function1<Throwable, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1<Throwable, Unit> f2211f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ F<T> f2212g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<T, Throwable, Unit> f2213h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super Throwable, Unit> function1, F<T> f10, Function2<? super T, ? super Throwable, Unit> function2) {
            super(1);
            this.f2211f = function1;
            this.f2212g = f10;
            this.f2213h = function2;
        }

        public final void a(Throwable th2) {
            Unit unit;
            this.f2211f.invoke(th2);
            ((F) this.f2212g).messageQueue.q(th2);
            do {
                Object objF = ov.k.f(((F) this.f2212g).messageQueue.n());
                if (objF != null) {
                    this.f2213h.invoke(objF, th2);
                    unit = Unit.f143329a;
                } else {
                    unit = null;
                }
            } while (unit != null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {121, 121}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        Object f2214a;

        /* renamed from: b, reason: collision with root package name */
        int f2215b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ F<T> f2216c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(F<T> f10, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f2216c = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f2216c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            if (r1.invoke(r6, r5) != r0) goto L18;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[PHI: r1 r6
          0x0051: PHI (r1v1 kotlin.jvm.functions.Function2) = (r1v2 kotlin.jvm.functions.Function2), (r1v4 kotlin.jvm.functions.Function2) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]
          0x0051: PHI (r6v5 java.lang.Object) = (r6v12 java.lang.Object), (r6v0 java.lang.Object) binds: [B:13:0x004e, B:9:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:18:0x005d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r5.f2215b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.b(r6)
                goto L5d
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f2214a
                kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
                kotlin.ResultKt.b(r6)
                goto L51
            L22:
                kotlin.ResultKt.b(r6)
                B2.F<T> r6 = r5.f2216c
                B2.b r6 = B2.F.c(r6)
                int r6 = r6.b()
                if (r6 <= 0) goto L6c
            L31:
                B2.F<T> r6 = r5.f2216c
                mv.O r6 = B2.F.d(r6)
                mv.C15784P.h(r6)
                B2.F<T> r6 = r5.f2216c
                kotlin.jvm.functions.Function2 r1 = B2.F.a(r6)
                B2.F<T> r6 = r5.f2216c
                ov.g r6 = B2.F.b(r6)
                r5.f2214a = r1
                r5.f2215b = r3
                java.lang.Object r6 = r6.e(r5)
                if (r6 != r0) goto L51
                goto L5c
            L51:
                r4 = 0
                r5.f2214a = r4
                r5.f2215b = r2
                java.lang.Object r6 = r1.invoke(r6, r5)
                if (r6 != r0) goto L5d
            L5c:
                return r0
            L5d:
                B2.F<T> r6 = r5.f2216c
                B2.b r6 = B2.F.c(r6)
                int r6 = r6.a()
                if (r6 != 0) goto L31
                kotlin.Unit r6 = kotlin.Unit.f143329a
                return r6
            L6c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Check failed."
                r6.<init>(r0)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: B2.F.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public F(InterfaceC15783O scope, Function1<? super Throwable, Unit> onComplete, Function2<? super T, ? super Throwable, Unit> onUndeliveredElement, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> consumeMessage) {
        Intrinsics.j(scope, "scope");
        Intrinsics.j(onComplete, "onComplete");
        Intrinsics.j(onUndeliveredElement, "onUndeliveredElement");
        Intrinsics.j(consumeMessage, "consumeMessage");
        this.scope = scope;
        this.consumeMessage = consumeMessage;
        this.messageQueue = ov.j.b(a.e.API_PRIORITY_OTHER, null, null, 6, null);
        this.remainingMessages = new C2905b(0);
        C0 c02 = (C0) scope.getCoroutineContext().g(C0.INSTANCE);
        if (c02 != null) {
            c02.R(new a(onComplete, this, onUndeliveredElement));
        }
    }

    public final void e(T msg) throws Throwable {
        Object objK = this.messageQueue.k(msg);
        if (objK instanceof k.Closed) {
            Throwable thE = ov.k.e(objK);
            if (thE != null) {
                throw thE;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!ov.k.i(objK)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.remainingMessages.c() == 0) {
            C15809k.d(this.scope, null, null, new b(this, null), 3, null);
        }
    }
}
