package kotlin;

import androidx.compose.runtime.z1;
import h0.n;
import kotlin.C6313a;
import kotlin.C6330m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.q0;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u0002*\u0004\u0018\u00010\tH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0086@ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\f2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u001c\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\n\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001dR\u0018\u0010 \u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001d\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Lx0/v0;", "", "LH1/h;", "defaultElevation", "pressedElevation", "hoveredElevation", "focusedElevation", "<init>", "(FFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lh0/i;", "d", "(Lh0/i;)F", "", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "f", "(FFFFLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "to", "b", "(Lh0/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/z1;", "c", "()Landroidx/compose/runtime/z1;", "a", "F", "Lc0/a;", "Lc0/m;", "Lc0/a;", "animatable", "Lh0/i;", "lastTargetInteraction", "g", "targetInteraction", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: x0.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17980v0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private float defaultElevation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private float pressedElevation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float hoveredElevation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float focusedElevation;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C6313a<H1.h, C6330m> animatable;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private h0.i lastTargetInteraction;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private h0.i targetInteraction;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", l = {384}, m = "animateElevation")
    /* renamed from: x0.v0$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f168732a;

        /* renamed from: b, reason: collision with root package name */
        Object f168733b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f168734c;

        /* renamed from: e, reason: collision with root package name */
        int f168736e;

        a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f168734c = obj;
            this.f168736e |= Integer.MIN_VALUE;
            return C17980v0.this.b(null, this);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", l = {370}, m = "snapElevation")
    /* renamed from: x0.v0$b */
    static final class b extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        Object f168737a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f168738b;

        /* renamed from: d, reason: collision with root package name */
        int f168740d;

        b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f168738b = obj;
            this.f168740d |= Integer.MIN_VALUE;
            return C17980v0.this.e(this);
        }
    }

    public /* synthetic */ C17980v0(float f10, float f11, float f12, float f13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13);
    }

    private C17980v0(float f10, float f11, float f12, float f13) {
        this.defaultElevation = f10;
        this.pressedElevation = f11;
        this.hoveredElevation = f12;
        this.focusedElevation = f13;
        this.animatable = new C6313a<>(H1.h.l(this.defaultElevation), q0.b(H1.h.INSTANCE), null, null, 12, null);
    }

    private final float d(h0.i iVar) {
        return iVar instanceof n.b ? this.pressedElevation : iVar instanceof h0.g ? this.hoveredElevation : iVar instanceof h0.d ? this.focusedElevation : this.defaultElevation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof kotlin.C17980v0.b
            if (r0 == 0) goto L13
            r0 = r5
            x0.v0$b r0 = (kotlin.C17980v0.b) r0
            int r1 = r0.f168740d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f168740d = r1
            goto L18
        L13:
            x0.v0$b r0 = new x0.v0$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f168738b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f168740d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r0 = r0.f168737a
            x0.v0 r0 = (kotlin.C17980v0) r0
            kotlin.ResultKt.b(r5)     // Catch: java.lang.Throwable -> L2d
            goto L64
        L2d:
            r5 = move-exception
            goto L6b
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L37:
            kotlin.ResultKt.b(r5)
            h0.i r5 = r4.targetInteraction
            float r5 = r4.d(r5)
            c0.a<H1.h, c0.m> r2 = r4.animatable
            java.lang.Object r2 = r2.k()
            H1.h r2 = (H1.h) r2
            float r2 = r2.getValue()
            boolean r2 = H1.h.u(r2, r5)
            if (r2 != 0) goto L70
            c0.a<H1.h, c0.m> r2 = r4.animatable     // Catch: java.lang.Throwable -> L69
            H1.h r5 = H1.h.l(r5)     // Catch: java.lang.Throwable -> L69
            r0.f168737a = r4     // Catch: java.lang.Throwable -> L69
            r0.f168740d = r3     // Catch: java.lang.Throwable -> L69
            java.lang.Object r5 = r2.t(r5, r0)     // Catch: java.lang.Throwable -> L69
            if (r5 != r1) goto L63
            return r1
        L63:
            r0 = r4
        L64:
            h0.i r5 = r0.targetInteraction
            r0.lastTargetInteraction = r5
            goto L70
        L69:
            r5 = move-exception
            r0 = r4
        L6b:
            h0.i r1 = r0.targetInteraction
            r0.lastTargetInteraction = r1
            throw r5
        L70:
            kotlin.Unit r5 = kotlin.Unit.f142422a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17980v0.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(h0.i r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlin.C17980v0.a
            if (r0 == 0) goto L13
            r0 = r7
            x0.v0$a r0 = (kotlin.C17980v0.a) r0
            int r1 = r0.f168736e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f168736e = r1
            goto L18
        L13:
            x0.v0$a r0 = new x0.v0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f168734c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f168736e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.f168733b
            h0.i r6 = (h0.i) r6
            java.lang.Object r0 = r0.f168732a
            x0.v0 r0 = (kotlin.C17980v0) r0
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L31
            goto L6b
        L31:
            r7 = move-exception
            goto L70
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            kotlin.ResultKt.b(r7)
            float r7 = r5.d(r6)
            r5.targetInteraction = r6
            c0.a<H1.h, c0.m> r2 = r5.animatable     // Catch: java.lang.Throwable -> L67
            java.lang.Object r2 = r2.k()     // Catch: java.lang.Throwable -> L67
            H1.h r2 = (H1.h) r2     // Catch: java.lang.Throwable -> L67
            float r2 = r2.getValue()     // Catch: java.lang.Throwable -> L67
            boolean r2 = H1.h.u(r2, r7)     // Catch: java.lang.Throwable -> L67
            if (r2 != 0) goto L6a
            c0.a<H1.h, c0.m> r2 = r5.animatable     // Catch: java.lang.Throwable -> L67
            h0.i r4 = r5.lastTargetInteraction     // Catch: java.lang.Throwable -> L67
            r0.f168732a = r5     // Catch: java.lang.Throwable -> L67
            r0.f168733b = r6     // Catch: java.lang.Throwable -> L67
            r0.f168736e = r3     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = kotlin.C17944i0.d(r2, r7, r4, r6, r0)     // Catch: java.lang.Throwable -> L67
            if (r7 != r1) goto L6a
            return r1
        L67:
            r7 = move-exception
            r0 = r5
            goto L70
        L6a:
            r0 = r5
        L6b:
            r0.lastTargetInteraction = r6
            kotlin.Unit r6 = kotlin.Unit.f142422a
            return r6
        L70:
            r0.lastTargetInteraction = r6
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17980v0.b(h0.i, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final z1<H1.h> c() {
        return this.animatable.g();
    }

    public final Object f(float f10, float f11, float f12, float f13, Continuation<? super Unit> continuation) throws Throwable {
        this.defaultElevation = f10;
        this.pressedElevation = f11;
        this.hoveredElevation = f12;
        this.focusedElevation = f13;
        Object objE = e(continuation);
        return objE == IntrinsicsKt.f() ? objE : Unit.f142422a;
    }
}
