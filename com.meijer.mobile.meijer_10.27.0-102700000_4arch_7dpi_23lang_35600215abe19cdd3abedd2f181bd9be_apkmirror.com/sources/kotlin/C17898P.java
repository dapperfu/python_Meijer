package kotlin;

import M0.SnapshotStateList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import h0.n;
import kotlin.C6313a;
import kotlin.C6330m;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.q0;
import qv.InterfaceC16622O;
import tv.InterfaceC17152f;
import tv.InterfaceC17153g;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0016"}, d2 = {"Lx0/P;", "Lx0/w;", "LH1/h;", "defaultElevation", "pressedElevation", "disabledElevation", "hoveredElevation", "focusedElevation", "<init>", "(FFFFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "enabled", "Lh0/j;", "interactionSource", "Landroidx/compose/runtime/z1;", "a", "(ZLh0/j;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/z1;", "F", "b", "c", "d", "e", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17898P implements InterfaceC17981w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float defaultElevation;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float pressedElevation;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float disabledElevation;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float hoveredElevation;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float focusedElevation;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.DefaultButtonElevation$elevation$1$1", f = "Button.kt", l = {507}, m = "invokeSuspend")
    /* renamed from: x0.P$a */
    static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f167290a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0.j f167291b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ SnapshotStateList<h0.i> f167292c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh0/i;", "interaction", "", "a", "(Lh0/i;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.P$a$a, reason: collision with other inner class name */
        static final class C2660a<T> implements InterfaceC17153g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SnapshotStateList<h0.i> f167293a;

            C2660a(SnapshotStateList<h0.i> snapshotStateList) {
                this.f167293a = snapshotStateList;
            }

            @Override // tv.InterfaceC17153g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(h0.i iVar, Continuation<? super Unit> continuation) {
                if (iVar instanceof h0.g) {
                    this.f167293a.add(iVar);
                } else if (iVar instanceof h0.h) {
                    this.f167293a.remove(((h0.h) iVar).getEnter());
                } else if (iVar instanceof h0.d) {
                    this.f167293a.add(iVar);
                } else if (iVar instanceof h0.e) {
                    this.f167293a.remove(((h0.e) iVar).getFocus());
                } else if (iVar instanceof n.b) {
                    this.f167293a.add(iVar);
                } else if (iVar instanceof n.c) {
                    this.f167293a.remove(((n.c) iVar).getPress());
                } else if (iVar instanceof n.a) {
                    this.f167293a.remove(((n.a) iVar).getPress());
                }
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(h0.j jVar, SnapshotStateList<h0.i> snapshotStateList, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f167291b = jVar;
            this.f167292c = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new a(this.f167291b, this.f167292c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f167290a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                InterfaceC17152f<h0.i> interfaceC17152fB = this.f167291b.b();
                C2660a c2660a = new C2660a(this.f167292c);
                this.f167290a = 1;
                if (interfaceC17152fB.collect(c2660a, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.DefaultButtonElevation$elevation$2$1", f = "Button.kt", l = {554, 563}, m = "invokeSuspend")
    /* renamed from: x0.P$b */
    static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f167294a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C6313a<H1.h, C6330m> f167295b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f167296c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f167297d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ C17898P f167298e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ h0.i f167299f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(C6313a<H1.h, C6330m> c6313a, float f10, boolean z10, C17898P c17898p, h0.i iVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f167295b = c6313a;
            this.f167296c = f10;
            this.f167297d = z10;
            this.f167298e = c17898p;
            this.f167299f = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.f167295b, this.f167296c, this.f167297d, this.f167298e, this.f167299f, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            if (r7.t(r1, r6) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
        
            if (kotlin.C17944i0.d(r7, r1, r3, r4, r6) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                int r1 = r6.f167294a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L17:
                kotlin.ResultKt.b(r7)
                goto La0
            L1c:
                kotlin.ResultKt.b(r7)
                c0.a<H1.h, c0.m> r7 = r6.f167295b
                java.lang.Object r7 = r7.k()
                H1.h r7 = (H1.h) r7
                float r7 = r7.getValue()
                float r1 = r6.f167296c
                boolean r7 = H1.h.u(r7, r1)
                if (r7 != 0) goto La0
                boolean r7 = r6.f167297d
                if (r7 != 0) goto L48
                c0.a<H1.h, c0.m> r7 = r6.f167295b
                float r1 = r6.f167296c
                H1.h r1 = H1.h.l(r1)
                r6.f167294a = r3
                java.lang.Object r7 = r7.t(r1, r6)
                if (r7 != r0) goto La0
                goto L9f
            L48:
                c0.a<H1.h, c0.m> r7 = r6.f167295b
                java.lang.Object r7 = r7.k()
                H1.h r7 = (H1.h) r7
                float r7 = r7.getValue()
                x0.P r1 = r6.f167298e
                float r1 = kotlin.C17898P.d(r1)
                boolean r1 = H1.h.u(r7, r1)
                r3 = 0
                if (r1 == 0) goto L6e
                h0.n$b r7 = new h0.n$b
                U0.f$a r1 = U0.f.INSTANCE
                long r4 = r1.c()
                r7.<init>(r4, r3)
                r3 = r7
                goto L91
            L6e:
                x0.P r1 = r6.f167298e
                float r1 = kotlin.C17898P.c(r1)
                boolean r1 = H1.h.u(r7, r1)
                if (r1 == 0) goto L80
                h0.g r3 = new h0.g
                r3.<init>()
                goto L91
            L80:
                x0.P r1 = r6.f167298e
                float r1 = kotlin.C17898P.b(r1)
                boolean r7 = H1.h.u(r7, r1)
                if (r7 == 0) goto L91
                h0.d r3 = new h0.d
                r3.<init>()
            L91:
                c0.a<H1.h, c0.m> r7 = r6.f167295b
                float r1 = r6.f167296c
                h0.i r4 = r6.f167299f
                r6.f167294a = r2
                java.lang.Object r7 = kotlin.C17944i0.d(r7, r1, r3, r4, r6)
                if (r7 != r0) goto La0
            L9f:
                return r0
            La0:
                kotlin.Unit r7 = kotlin.Unit.f142422a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C17898P.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ C17898P(float f10, float f11, float f12, float f13, float f14, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, f11, f12, f13, f14);
    }

    private C17898P(float f10, float f11, float f12, float f13, float f14) {
        this.defaultElevation = f10;
        this.pressedElevation = f11;
        this.disabledElevation = f12;
        this.hoveredElevation = f13;
        this.focusedElevation = f14;
    }

    @Override // kotlin.InterfaceC17981w
    public z1<H1.h> a(boolean z10, h0.j jVar, Composer composer, int i10) {
        C6313a c6313a;
        composer.startReplaceGroup(-1588756907);
        if (ComposerKt.M()) {
            ComposerKt.U(-1588756907, i10, -1, "androidx.compose.material.DefaultButtonElevation.elevation (Button.kt:503)");
        }
        Object objB = composer.B();
        Composer.Companion companion = Composer.INSTANCE;
        if (objB == companion.a()) {
            objB = o1.f();
            composer.t(objB);
        }
        SnapshotStateList snapshotStateList = (SnapshotStateList) objB;
        boolean z11 = true;
        boolean z12 = (((i10 & 112) ^ 48) > 32 && composer.V(jVar)) || (i10 & 48) == 32;
        Object objB2 = composer.B();
        if (z12 || objB2 == companion.a()) {
            objB2 = new a(jVar, snapshotStateList, null);
            composer.t(objB2);
        }
        J.g(jVar, (Function2) objB2, composer, (i10 >> 3) & 14);
        h0.i iVar = (h0.i) CollectionsKt.F0(snapshotStateList);
        float f10 = !z10 ? this.disabledElevation : iVar instanceof n.b ? this.pressedElevation : iVar instanceof h0.g ? this.hoveredElevation : iVar instanceof h0.d ? this.focusedElevation : this.defaultElevation;
        Object objB3 = composer.B();
        if (objB3 == companion.a()) {
            Object c6313a2 = new C6313a(H1.h.l(f10), q0.b(H1.h.INSTANCE), null, null, 12, null);
            composer.t(c6313a2);
            objB3 = c6313a2;
        }
        C6313a c6313a3 = (C6313a) objB3;
        H1.h hVarL = H1.h.l(f10);
        boolean zD = composer.D(c6313a3) | composer.b(f10) | ((((i10 & 14) ^ 6) > 4 && composer.a(z10)) || (i10 & 6) == 4);
        if ((((i10 & 896) ^ 384) <= 256 || !composer.V(this)) && (i10 & 384) != 256) {
            z11 = false;
        }
        boolean zD2 = zD | z11 | composer.D(iVar);
        Object objB4 = composer.B();
        if (zD2 || objB4 == companion.a()) {
            c6313a = c6313a3;
            Object bVar = new b(c6313a, f10, z10, this, iVar, null);
            composer.t(bVar);
            objB4 = bVar;
        } else {
            c6313a = c6313a3;
        }
        J.g(hVarL, (Function2) objB4, composer, 0);
        z1<H1.h> z1VarG = c6313a.g();
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        composer.P();
        return z1VarG;
    }
}
