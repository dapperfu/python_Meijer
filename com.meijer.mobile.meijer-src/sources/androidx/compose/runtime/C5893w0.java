package androidx.compose.runtime;

import androidx.compose.runtime.InterfaceC5840b0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J9\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00028\u00000\nH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/runtime/w0;", "Landroidx/compose/runtime/b0;", "frameClock", "<init>", "(Landroidx/compose/runtime/b0;)V", "", "e", "()V", "f", "R", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "frameTimeNanos", "onFrame", "O", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Landroidx/compose/runtime/b0;", "Landroidx/compose/runtime/W;", "b", "Landroidx/compose/runtime/W;", "latch", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5893w0 implements InterfaceC5840b0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5840b0 frameClock;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final W latch = new W();

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.PausableMonotonicFrameClock", f = "PausableMonotonicFrameClock.kt", l = {61, 62}, m = "withFrameNanos")
    /* renamed from: androidx.compose.runtime.w0$a */
    static final class a<R> extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f50714a;

        /* renamed from: b, reason: collision with root package name */
        Object f50715b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f50716c;

        /* renamed from: e, reason: collision with root package name */
        int f50718e;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f50716c = obj;
            this.f50718e |= Integer.MIN_VALUE;
            return C5893w0.this.O(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.runtime.InterfaceC5840b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <R> java.lang.Object O(kotlin.jvm.functions.Function1<? super java.lang.Long, ? extends R> r6, kotlin.coroutines.Continuation<? super R> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.compose.runtime.C5893w0.a
            if (r0 == 0) goto L13
            r0 = r7
            androidx.compose.runtime.w0$a r0 = (androidx.compose.runtime.C5893w0.a) r0
            int r1 = r0.f50718e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f50718e = r1
            goto L18
        L13:
            androidx.compose.runtime.w0$a r0 = new androidx.compose.runtime.w0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f50716c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f50718e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.ResultKt.b(r7)
            return r7
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f50715b
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            java.lang.Object r2 = r0.f50714a
            androidx.compose.runtime.w0 r2 = (androidx.compose.runtime.C5893w0) r2
            kotlin.ResultKt.b(r7)
            goto L53
        L40:
            kotlin.ResultKt.b(r7)
            androidx.compose.runtime.W r7 = r5.latch
            r0.f50714a = r5
            r0.f50715b = r6
            r0.f50718e = r4
            java.lang.Object r7 = r7.c(r0)
            if (r7 != r1) goto L52
            goto L62
        L52:
            r2 = r5
        L53:
            androidx.compose.runtime.b0 r7 = r2.frameClock
            r2 = 0
            r0.f50714a = r2
            r0.f50715b = r2
            r0.f50718e = r3
            java.lang.Object r6 = r7.O(r6, r0)
            if (r6 != r1) goto L63
        L62:
            return r1
        L63:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C5893w0.O(kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void e() {
        this.latch.d();
    }

    public final void f() {
        this.latch.f();
    }

    public C5893w0(InterfaceC5840b0 interfaceC5840b0) {
        this.frameClock = interfaceC5840b0;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public <R> R b(R r10, Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) InterfaceC5840b0.a.a(this, r10, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <E extends CoroutineContext.Element> E g(CoroutineContext.Key<E> key) {
        return (E) InterfaceC5840b0.a.b(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext n0(CoroutineContext coroutineContext) {
        return InterfaceC5840b0.a.d(this, coroutineContext);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext x0(CoroutineContext.Key<?> key) {
        return InterfaceC5840b0.a.c(this, key);
    }
}
