package kotlin;

import g1.EnumC14186s;
import g1.InterfaceC14171c;
import g1.J;
import g1.PointerInputChange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001e\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0080@¢\u0006\u0004\b\u0007\u0010\b\u001a=\u0010\u000f\u001a\u00020\u0006*\u00020\t2'\u0010\u000e\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\n¢\u0006\u0002\b\rH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lg1/c;", "", "a", "(Lg1/c;)Z", "Lg1/s;", "pass", "", "b", "(Lg1/c;Lg1/s;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lg1/J;", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "d", "(Lg1/J;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: f0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13821t {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt", f = "ForEachGesture.kt", l = {84}, m = "awaitAllPointersUp")
    /* renamed from: f0.t$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f130501a;

        /* renamed from: b, reason: collision with root package name */
        Object f130502b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f130503c;

        /* renamed from: d, reason: collision with root package name */
        int f130504d;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f130503c = obj;
            this.f130504d |= Integer.MIN_VALUE;
            return C13821t.b(null, null, this);
        }

        a(Continuation<? super a> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg1/c;", "", "<anonymous>", "(Lg1/c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", f = "ForEachGesture.kt", l = {102, 105, 110}, m = "invokeSuspend")
    /* renamed from: f0.t$b */
    static final class b extends RestrictedSuspendLambda implements Function2<InterfaceC14171c, Continuation<? super Unit>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f130505b;

        /* renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f130506c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f130507d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function2<InterfaceC14171c, Continuation<? super Unit>, Object> f130508e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(CoroutineContext coroutineContext, Function2<? super InterfaceC14171c, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f130507d = coroutineContext;
            this.f130508e = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f130507d, this.f130508e, continuation);
            bVar.f130506c = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC14171c interfaceC14171c, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC14171c, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
        
            if (r9 != r0) goto L12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0071, code lost:
        
            if (r9 == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0044 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v2, types: [g1.c, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v22 */
        /* JADX WARN: Type inference failed for: r1v3, types: [g1.c, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005a -> B:12:0x0029). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0071 -> B:12:0x0029). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r8.f130505b
                r2 = 3
                r3 = 2
                r4 = 0
                r5 = 1
                if (r1 == 0) goto L35
                if (r1 == r5) goto L2d
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r1 = r8.f130506c
                g1.c r1 = (g1.InterfaceC14171c) r1
                kotlin.ResultKt.b(r9)
                goto L29
            L1a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L22:
                java.lang.Object r1 = r8.f130506c
                g1.c r1 = (g1.InterfaceC14171c) r1
                kotlin.ResultKt.b(r9)     // Catch: java.util.concurrent.CancellationException -> L2b
            L29:
                r9 = r1
                goto L3c
            L2b:
                r9 = move-exception
                goto L61
            L2d:
                java.lang.Object r1 = r8.f130506c
                g1.c r1 = (g1.InterfaceC14171c) r1
                kotlin.ResultKt.b(r9)     // Catch: java.util.concurrent.CancellationException -> L2b
                goto L52
            L35:
                kotlin.ResultKt.b(r9)
                java.lang.Object r9 = r8.f130506c
                g1.c r9 = (g1.InterfaceC14171c) r9
            L3c:
                kotlin.coroutines.CoroutineContext r1 = r8.f130507d
                boolean r1 = qv.E0.n(r1)
                if (r1 == 0) goto L75
                kotlin.jvm.functions.Function2<g1.c, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r8.f130508e     // Catch: java.util.concurrent.CancellationException -> L5d
                r8.f130506c = r9     // Catch: java.util.concurrent.CancellationException -> L5d
                r8.f130505b = r5     // Catch: java.util.concurrent.CancellationException -> L5d
                java.lang.Object r1 = r1.invoke(r9, r8)     // Catch: java.util.concurrent.CancellationException -> L5d
                if (r1 != r0) goto L51
                goto L73
            L51:
                r1 = r9
            L52:
                r8.f130506c = r1     // Catch: java.util.concurrent.CancellationException -> L2b
                r8.f130505b = r3     // Catch: java.util.concurrent.CancellationException -> L2b
                java.lang.Object r9 = kotlin.C13821t.c(r1, r4, r8, r5, r4)     // Catch: java.util.concurrent.CancellationException -> L2b
                if (r9 != r0) goto L29
                goto L73
            L5d:
                r1 = move-exception
                r7 = r1
                r1 = r9
                r9 = r7
            L61:
                kotlin.coroutines.CoroutineContext r6 = r8.f130507d
                boolean r6 = qv.E0.n(r6)
                if (r6 == 0) goto L74
                r8.f130506c = r1
                r8.f130505b = r2
                java.lang.Object r9 = kotlin.C13821t.c(r1, r4, r8, r5, r4)
                if (r9 != r0) goto L29
            L73:
                return r0
            L74:
                throw r9
            L75:
                kotlin.Unit r9 = kotlin.Unit.f142422a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C13821t.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (a(r7) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:19:0x0052). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(g1.InterfaceC14171c r7, g1.EnumC14186s r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof kotlin.C13821t.a
            if (r0 == 0) goto L13
            r0 = r9
            f0.t$a r0 = (kotlin.C13821t.a) r0
            int r1 = r0.f130504d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f130504d = r1
            goto L18
        L13:
            f0.t$a r0 = new f0.t$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f130503c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f130504d
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.f130502b
            g1.s r7 = (g1.EnumC14186s) r7
            java.lang.Object r8 = r0.f130501a
            g1.c r8 = (g1.InterfaceC14171c) r8
            kotlin.ResultKt.b(r9)
            r6 = r8
            r8 = r7
            r7 = r6
            goto L52
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.ResultKt.b(r9)
            boolean r9 = a(r7)
            if (r9 != 0) goto L72
        L45:
            r0.f130501a = r7
            r0.f130502b = r8
            r0.f130504d = r3
            java.lang.Object r9 = r7.K0(r8, r0)
            if (r9 != r1) goto L52
            return r1
        L52:
            g1.q r9 = (g1.C14185q) r9
            java.util.List r9 = r9.c()
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
            r4 = 0
        L60:
            if (r4 >= r2) goto L72
            java.lang.Object r5 = r9.get(r4)
            g1.B r5 = (g1.PointerInputChange) r5
            boolean r5 = r5.getPressed()
            if (r5 == 0) goto L6f
            goto L45
        L6f:
            int r4 = r4 + 1
            goto L60
        L72:
            kotlin.Unit r7 = kotlin.Unit.f142422a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C13821t.b(g1.c, g1.s, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object c(InterfaceC14171c interfaceC14171c, EnumC14186s enumC14186s, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC14186s = EnumC14186s.f132680c;
        }
        return b(interfaceC14171c, enumC14186s, continuation);
    }

    public static final boolean a(InterfaceC14171c interfaceC14171c) {
        List<PointerInputChange> listC = interfaceC14171c.a1().c();
        int size = listC.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            if (listC.get(i10).getPressed()) {
                z10 = true;
                break;
            }
            i10++;
        }
        return !z10;
    }

    public static final Object d(J j10, Function2<? super InterfaceC14171c, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super Unit> continuation) {
        Object objG0 = j10.g0(new b(continuation.getContext(), function2, null), continuation);
        if (objG0 == IntrinsicsKt.f()) {
            return objG0;
        }
        return Unit.f142422a;
    }
}
