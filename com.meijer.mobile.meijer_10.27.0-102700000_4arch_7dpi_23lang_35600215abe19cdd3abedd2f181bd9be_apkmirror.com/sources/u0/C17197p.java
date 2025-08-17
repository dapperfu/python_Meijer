package u0;

import androidx.compose.runtime.A0;
import androidx.compose.runtime.InterfaceC5724i0;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.C0;
import qv.C16623P;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR*\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rj\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e`\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R+\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lu0/p;", "", "", "animate", "<init>", "(Z)V", "", "f", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "a", "Z", "c", "()Z", "Ljava/util/concurrent/atomic/AtomicReference;", "Lqv/C0;", "Landroidx/compose/foundation/AtomicReference;", "b", "Ljava/util/concurrent/atomic/AtomicReference;", "animationJob", "", "<set-?>", "Landroidx/compose/runtime/i0;", "d", "()F", "e", "(F)V", "cursorAlpha", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: u0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17197p {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean animate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private AtomicReference<C0> animationJob = new AtomicReference<>(null);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5724i0 cursorAlpha = A0.a(0.0f);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)Z"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2", f = "CursorAnimationState.kt", l = {}, m = "invokeSuspend")
    /* renamed from: u0.p$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Boolean>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f162535a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f162536b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "androidx.compose.foundation.text.input.internal.CursorAnimationState$snapToVisibleAndAnimate$2$1", f = "CursorAnimationState.kt", l = {72, 77, 79, 81}, m = "invokeSuspend")
        /* renamed from: u0.p$a$a, reason: collision with other inner class name */
        static final class C2566a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f162538a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C0 f162539b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C17197p f162540c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2566a(C0 c02, C17197p c17197p, Continuation<? super C2566a> continuation) {
                super(2, continuation);
                this.f162539b = c02;
                this.f162540c = c17197p;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C2566a(this.f162539b, this.f162540c, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((C2566a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:34:0x0073, code lost:
            
                if (qv.Z.b(500, r10) != r0) goto L36;
             */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0067  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0068 A[Catch: all -> 0x001d, TryCatch #0 {all -> 0x001d, blocks: (B:8:0x0019, B:36:0x0076, B:30:0x005f, B:33:0x0068, B:14:0x0027, B:15:0x002b, B:28:0x0059, B:29:0x005e, B:23:0x0043, B:25:0x0050), top: B:40:0x000f }] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0073 -> B:36:0x0076). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                /*
                    r10 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                    int r1 = r10.f162538a
                    r2 = 0
                    r3 = 500(0x1f4, double:2.47E-321)
                    r5 = 1065353216(0x3f800000, float:1.0)
                    r6 = 4
                    r7 = 3
                    r8 = 2
                    r9 = 1
                    if (r1 == 0) goto L33
                    if (r1 == r9) goto L2f
                    if (r1 == r8) goto L2b
                    if (r1 == r7) goto L27
                    if (r1 != r6) goto L1f
                    kotlin.ResultKt.b(r11)     // Catch: java.lang.Throwable -> L1d
                    goto L76
                L1d:
                    r11 = move-exception
                    goto L7c
                L1f:
                    java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r11.<init>(r0)
                    throw r11
                L27:
                    kotlin.ResultKt.b(r11)     // Catch: java.lang.Throwable -> L1d
                    goto L68
                L2b:
                    kotlin.ResultKt.b(r11)     // Catch: java.lang.Throwable -> L1d
                    goto L59
                L2f:
                    kotlin.ResultKt.b(r11)
                    goto L43
                L33:
                    kotlin.ResultKt.b(r11)
                    qv.C0 r11 = r10.f162539b
                    if (r11 == 0) goto L43
                    r10.f162538a = r9
                    java.lang.Object r11 = qv.E0.g(r11, r10)
                    if (r11 != r0) goto L43
                    goto L75
                L43:
                    u0.p r11 = r10.f162540c     // Catch: java.lang.Throwable -> L1d
                    u0.C17197p.b(r11, r5)     // Catch: java.lang.Throwable -> L1d
                    u0.p r11 = r10.f162540c     // Catch: java.lang.Throwable -> L1d
                    boolean r11 = r11.getAnimate()     // Catch: java.lang.Throwable -> L1d
                    if (r11 != 0) goto L5f
                    r10.f162538a = r8     // Catch: java.lang.Throwable -> L1d
                    java.lang.Object r11 = qv.Z.a(r10)     // Catch: java.lang.Throwable -> L1d
                    if (r11 != r0) goto L59
                    goto L75
                L59:
                    kotlin.KotlinNothingValueException r11 = new kotlin.KotlinNothingValueException     // Catch: java.lang.Throwable -> L1d
                    r11.<init>()     // Catch: java.lang.Throwable -> L1d
                    throw r11     // Catch: java.lang.Throwable -> L1d
                L5f:
                    r10.f162538a = r7     // Catch: java.lang.Throwable -> L1d
                    java.lang.Object r11 = qv.Z.b(r3, r10)     // Catch: java.lang.Throwable -> L1d
                    if (r11 != r0) goto L68
                    goto L75
                L68:
                    u0.p r11 = r10.f162540c     // Catch: java.lang.Throwable -> L1d
                    u0.C17197p.b(r11, r2)     // Catch: java.lang.Throwable -> L1d
                    r10.f162538a = r6     // Catch: java.lang.Throwable -> L1d
                    java.lang.Object r11 = qv.Z.b(r3, r10)     // Catch: java.lang.Throwable -> L1d
                    if (r11 != r0) goto L76
                L75:
                    return r0
                L76:
                    u0.p r11 = r10.f162540c     // Catch: java.lang.Throwable -> L1d
                    u0.C17197p.b(r11, r5)     // Catch: java.lang.Throwable -> L1d
                    goto L5f
                L7c:
                    u0.p r0 = r10.f162540c
                    u0.C17197p.b(r0, r2)
                    throw r11
                */
                throw new UnsupportedOperationException("Method not decompiled: u0.C17197p.a.C2566a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = C17197p.this.new a(continuation);
            aVar.f162536b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Boolean> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f162535a == 0) {
                ResultKt.b(obj);
                return Boxing.a(U.d.a(C17197p.this.animationJob, null, C16648k.d((InterfaceC16622O) this.f162536b, null, null, new C2566a((C0) C17197p.this.animationJob.getAndSet(null), C17197p.this, null), 3, null)));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(float f10) {
        this.cursorAlpha.B(f10);
    }

    /* renamed from: c, reason: from getter */
    public final boolean getAnimate() {
        return this.animate;
    }

    public final float d() {
        return this.cursorAlpha.b();
    }

    public final Object f(Continuation<? super Unit> continuation) {
        Object objG = C16623P.g(new a(null), continuation);
        return objG == IntrinsicsKt.f() ? objG : Unit.f142422a;
    }

    public C17197p(boolean z10) {
        this.animate = z10;
    }
}
