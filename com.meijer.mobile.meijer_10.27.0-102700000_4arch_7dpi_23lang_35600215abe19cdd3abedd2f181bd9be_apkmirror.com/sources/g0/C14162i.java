package g0;

import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13447n;
import java.util.concurrent.CancellationException;
import kotlin.C6325h;
import kotlin.C6330m;
import kotlin.InterfaceC13787E;
import kotlin.InterfaceC13796N;
import kotlin.InterfaceC6326i;
import kotlin.InterfaceC6342y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\b\u0010\t\u001ag\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0016*\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\r2!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u0010H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018\u001am\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0016*\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00032\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u001a2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u0010H\u0082@¢\u0006\u0004\b\u001c\u0010\u001d\u001au\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0016*\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00140\u0010H\u0082@¢\u0006\u0004\b \u0010!\u001a\u001b\u0010#\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\"\u001a\u00020\u0003H\u0002¢\u0006\u0004\b#\u0010$\"\u001a\u0010*\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lg0/j;", "snapLayoutInfoProvider", "Lc0/y;", "", "decayAnimationSpec", "Lc0/i;", "snapAnimationSpec", "Lf0/N;", "l", "(Lg0/j;Lc0/y;Lc0/i;)Lf0/N;", "Lf0/E;", "initialTargetOffset", "initialVelocity", "Lg0/b;", "Lc0/m;", "animation", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "delta", "", "onAnimationStep", "Lg0/a;", "i", "(Lf0/E;FFLg0/b;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "targetOffset", "Lc0/k;", "animationState", "f", "(Lf0/E;FLc0/k;Lc0/y;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelOffset", "animationSpec", "h", "(Lf0/E;FFLc0/k;Lc0/i;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "target", "j", "(FF)F", "LH1/h;", "a", "F", "k", "()F", "MinFlingVelocityDp", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: g0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14162i {

    /* renamed from: a, reason: collision with root package name */
    private static final float f132510a = H1.h.p(HttpResponseStatus.ERROR_BAD_REQUEST);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {313}, m = "animateDecay")
    /* renamed from: g0.i$a */
    static final class a extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        float f132511a;

        /* renamed from: b, reason: collision with root package name */
        Object f132512b;

        /* renamed from: c, reason: collision with root package name */
        Object f132513c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f132514d;

        /* renamed from: e, reason: collision with root package name */
        int f132515e;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f132514d = obj;
            this.f132515e |= Integer.MIN_VALUE;
            return C14162i.f(null, 0.0f, null, null, null, this);
        }

        a(Continuation<? super a> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/h;", "", "Lc0/m;", "", "a", "(Lc0/h;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: g0.i$b */
    static final class b extends Lambda implements Function1<C6325h<Float, C6330m>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f132516f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f132517g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC13787E f132518h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<Float, Unit> f132519i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(float f10, Ref.FloatRef floatRef, InterfaceC13787E interfaceC13787E, Function1<? super Float, Unit> function1) {
            super(1);
            this.f132516f = f10;
            this.f132517g = floatRef;
            this.f132518h = interfaceC13787E;
            this.f132519i = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C6325h<Float, C6330m> c6325h) {
            a(c6325h);
            return Unit.f142422a;
        }

        public final void a(C6325h<Float, C6330m> c6325h) {
            if (Math.abs(c6325h.e().floatValue()) >= Math.abs(this.f132516f)) {
                float fJ = C14162i.j(c6325h.e().floatValue(), this.f132516f);
                C14162i.g(c6325h, this.f132518h, this.f132519i, fJ - this.f132517g.f142832a);
                c6325h.a();
                this.f132517g.f142832a = fJ;
                return;
            }
            C14162i.g(c6325h, this.f132518h, this.f132519i, c6325h.e().floatValue() - this.f132517g.f142832a);
            this.f132517g.f142832a = c6325h.e().floatValue();
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt", f = "SnapFlingBehavior.kt", l = {354}, m = "animateWithTarget")
    /* renamed from: g0.i$c */
    static final class c extends ContinuationImpl {

        /* renamed from: a, reason: collision with root package name */
        float f132520a;

        /* renamed from: b, reason: collision with root package name */
        float f132521b;

        /* renamed from: c, reason: collision with root package name */
        Object f132522c;

        /* renamed from: d, reason: collision with root package name */
        Object f132523d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f132524e;

        /* renamed from: f, reason: collision with root package name */
        int f132525f;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f132524e = obj;
            this.f132525f |= Integer.MIN_VALUE;
            return C14162i.h(null, 0.0f, 0.0f, null, null, null, this);
        }

        c(Continuation<? super c> continuation) {
            super(continuation);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc0/h;", "", "Lc0/m;", "", "a", "(Lc0/h;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: g0.i$d */
    static final class d extends Lambda implements Function1<C6325h<Float, C6330m>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f132526f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Ref.FloatRef f132527g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC13787E f132528h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function1<Float, Unit> f132529i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(float f10, Ref.FloatRef floatRef, InterfaceC13787E interfaceC13787E, Function1<? super Float, Unit> function1) {
            super(1);
            this.f132526f = f10;
            this.f132527g = floatRef;
            this.f132528h = interfaceC13787E;
            this.f132529i = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C6325h<Float, C6330m> c6325h) {
            a(c6325h);
            return Unit.f142422a;
        }

        public final void a(C6325h<Float, C6330m> c6325h) {
            float fE;
            float fJ = C14162i.j(c6325h.e().floatValue(), this.f132526f);
            float f10 = fJ - this.f132527g.f142832a;
            if (C13447n.NewNestedFlingPropagationEnabled) {
                try {
                    fE = this.f132528h.e(f10);
                } catch (CancellationException unused) {
                    c6325h.a();
                    fE = 0.0f;
                }
            } else {
                fE = this.f132528h.e(f10);
            }
            this.f132529i.invoke(Float.valueOf(fE));
            if (Math.abs(f10 - fE) > 0.5f || fJ != c6325h.e().floatValue()) {
                c6325h.a();
            }
            this.f132527g.f142832a += fE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return f11 > 0.0f ? RangesKt.j(f10, f11) : RangesKt.e(f10, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(kotlin.InterfaceC13787E r5, float r6, kotlin.AnimationState<java.lang.Float, kotlin.C6330m> r7, kotlin.InterfaceC6342y<java.lang.Float> r8, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r9, kotlin.coroutines.Continuation<? super g0.C14154a<java.lang.Float, kotlin.C6330m>> r10) {
        /*
            boolean r0 = r10 instanceof g0.C14162i.a
            if (r0 == 0) goto L13
            r0 = r10
            g0.i$a r0 = (g0.C14162i.a) r0
            int r1 = r0.f132515e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f132515e = r1
            goto L18
        L13:
            g0.i$a r0 = new g0.i$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f132514d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r0.f132515e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            float r6 = r0.f132511a
            java.lang.Object r5 = r0.f132513c
            kotlin.jvm.internal.Ref$FloatRef r5 = (kotlin.jvm.internal.Ref.FloatRef) r5
            java.lang.Object r7 = r0.f132512b
            c0.k r7 = (kotlin.AnimationState) r7
            kotlin.ResultKt.b(r10)
            goto L6b
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            kotlin.ResultKt.b(r10)
            kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
            r10.<init>()
            java.lang.Object r2 = r7.m()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L54
            r2 = r3
            goto L55
        L54:
            r2 = 0
        L55:
            r2 = r2 ^ r3
            g0.i$b r4 = new g0.i$b
            r4.<init>(r6, r10, r5, r9)
            r0.f132512b = r7
            r0.f132513c = r10
            r0.f132511a = r6
            r0.f132515e = r3
            java.lang.Object r5 = kotlin.i0.g(r7, r8, r2, r4, r0)
            if (r5 != r1) goto L6a
            return r1
        L6a:
            r5 = r10
        L6b:
            g0.a r8 = new g0.a
            float r5 = r5.f142832a
            float r6 = r6 - r5
            java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.c(r6)
            r8.<init>(r5, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.C14162i.f(f0.E, float, c0.k, c0.y, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C6325h<Float, C6330m> c6325h, InterfaceC13787E interfaceC13787E, Function1<? super Float, Unit> function1, float f10) {
        float fE;
        if (C13447n.NewNestedFlingPropagationEnabled) {
            try {
                fE = interfaceC13787E.e(f10);
            } catch (CancellationException unused) {
                c6325h.a();
                fE = 0.0f;
            }
        } else {
            fE = interfaceC13787E.e(f10);
        }
        function1.invoke(Float.valueOf(fE));
        if (Math.abs(f10 - fE) > 0.5f) {
            c6325h.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(kotlin.InterfaceC13787E r20, float r21, float r22, kotlin.AnimationState<java.lang.Float, kotlin.C6330m> r23, kotlin.InterfaceC6326i<java.lang.Float> r24, kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r25, kotlin.coroutines.Continuation<? super g0.C14154a<java.lang.Float, kotlin.C6330m>> r26) {
        /*
            r0 = r26
            boolean r1 = r0 instanceof g0.C14162i.c
            if (r1 == 0) goto L16
            r1 = r0
            g0.i$c r1 = (g0.C14162i.c) r1
            int r2 = r1.f132525f
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f132525f = r2
        L14:
            r7 = r1
            goto L1c
        L16:
            g0.i$c r1 = new g0.i$c
            r1.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.f132524e
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
            int r2 = r7.f132525f
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            float r1 = r7.f132521b
            float r2 = r7.f132520a
            java.lang.Object r3 = r7.f132523d
            kotlin.jvm.internal.Ref$FloatRef r3 = (kotlin.jvm.internal.Ref.FloatRef) r3
            java.lang.Object r4 = r7.f132522c
            c0.k r4 = (kotlin.AnimationState) r4
            kotlin.ResultKt.b(r0)
            r9 = r2
            r10 = r4
            goto L95
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L43:
            kotlin.ResultKt.b(r0)
            kotlin.jvm.internal.Ref$FloatRef r0 = new kotlin.jvm.internal.Ref$FloatRef
            r0.<init>()
            java.lang.Object r2 = r23.m()
            java.lang.Number r2 = (java.lang.Number) r2
            float r8 = r2.floatValue()
            java.lang.Float r2 = kotlin.coroutines.jvm.internal.Boxing.c(r21)
            java.lang.Object r4 = r23.m()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L6a
            r4 = r3
            goto L6b
        L6a:
            r4 = 0
        L6b:
            r5 = r4 ^ 1
            g0.i$d r6 = new g0.i$d
            r4 = r20
            r9 = r22
            r10 = r25
            r6.<init>(r9, r0, r4, r10)
            r4 = r23
            r7.f132522c = r4
            r7.f132523d = r0
            r9 = r21
            r7.f132520a = r9
            r7.f132521b = r8
            r7.f132525f = r3
            r3 = r2
            r2 = r4
            r4 = r24
            java.lang.Object r3 = kotlin.i0.i(r2, r3, r4, r5, r6, r7)
            if (r3 != r1) goto L91
            return r1
        L91:
            r10 = r23
            r3 = r0
            r1 = r8
        L95:
            java.lang.Object r0 = r10.m()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            float r12 = j(r0, r1)
            g0.a r0 = new g0.a
            float r1 = r3.f142832a
            float r9 = r9 - r1
            java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.c(r9)
            r18 = 29
            r19 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r17 = 0
            c0.k r2 = kotlin.C6329l.g(r10, r11, r12, r13, r15, r17, r18, r19)
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.C14162i.h(f0.E, float, float, c0.k, c0.i, kotlin.jvm.functions.Function1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final float k() {
        return f132510a;
    }

    public static final InterfaceC13796N l(InterfaceC14163j interfaceC14163j, InterfaceC6342y<Float> interfaceC6342y, InterfaceC6326i<Float> interfaceC6326i) {
        return new C14161h(interfaceC14163j, interfaceC6342y, interfaceC6326i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object i(InterfaceC13787E interfaceC13787E, float f10, float f11, InterfaceC14155b<Float, C6330m> interfaceC14155b, Function1<? super Float, Unit> function1, Continuation<? super C14154a<Float, C6330m>> continuation) {
        return interfaceC14155b.a(interfaceC13787E, Boxing.c(f10), Boxing.c(f11), function1, continuation);
    }
}
