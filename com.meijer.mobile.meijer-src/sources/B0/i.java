package B0;

import U0.k;
import V0.C5489q0;
import h0.C14434a;
import h0.C14435b;
import h0.C14436c;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6439a;
import kotlin.C6441b;
import kotlin.C6456m;
import kotlin.InterfaceC6452i;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C15809k;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0015\u001a\u00020\r*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R \u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001cR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"LB0/i;", "", "", "bounded", "Lkotlin/Function0;", "LB0/b;", "rippleAlpha", "<init>", "(ZLkotlin/jvm/functions/Function0;)V", "Lh0/i;", "interaction", "Lmv/O;", "scope", "", "c", "(Lh0/i;Lmv/O;)V", "LX0/f;", "", "radius", "LV0/q0;", "color", "b", "(LX0/f;FJ)V", "a", "Z", "Lkotlin/jvm/functions/Function0;", "Lc0/a;", "Lc0/m;", "Lc0/a;", "animatedAlpha", "", "d", "Ljava/util/List;", "interactions", "e", "Lh0/i;", "currentInteraction", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class i {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean bounded;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function0<RippleAlpha> rippleAlpha;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C6439a<Float, C6456m> animatedAlpha = C6441b.b(0.0f, 0.0f, 2, null);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<h0.i> interactions = new ArrayList();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private h0.i currentInteraction;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$1", f = "Ripple.kt", l = {480}, m = "invokeSuspend")
    static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f2178a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f2180c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC6452i<Float> f2181d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f10, InterfaceC6452i<Float> interfaceC6452i, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f2180c = f10;
            this.f2181d = interfaceC6452i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return i.this.new a(this.f2180c, this.f2181d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f2178a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C6439a c6439a = i.this.animatedAlpha;
                Float fC = Boxing.c(this.f2180c);
                InterfaceC6452i<Float> interfaceC6452i = this.f2181d;
                this.f2178a = 1;
                if (C6439a.f(c6439a, fC, interfaceC6452i, null, null, this, 12, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.material.ripple.StateLayer$handleInteraction$2", f = "Ripple.kt", l = {484}, m = "invokeSuspend")
    static final class b extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f2182a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC6452i<Float> f2184c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC6452i<Float> interfaceC6452i, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f2184c = interfaceC6452i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return i.this.new b(this.f2184c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((b) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f2182a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                C6439a c6439a = i.this.animatedAlpha;
                Float fC = Boxing.c(0.0f);
                InterfaceC6452i<Float> interfaceC6452i = this.f2184c;
                this.f2182a = 1;
                if (C6439a.f(c6439a, fC, interfaceC6452i, null, null, this, 12, null) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    public final void b(X0.f fVar, float f10, long j10) throws Throwable {
        long j11;
        float fFloatValue = this.animatedAlpha.m().floatValue();
        if (fFloatValue <= 0.0f) {
            return;
        }
        long jQ = C5489q0.q(j10, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.bounded) {
            X0.f.f1(fVar, jQ, f10, 0L, 0.0f, null, null, 0, 124, null);
            return;
        }
        float fI = k.i(fVar.b());
        float fG = k.g(fVar.b());
        int iB = androidx.compose.ui.graphics.b.INSTANCE.b();
        X0.d drawContext = fVar.getDrawContext();
        long jB = drawContext.b();
        drawContext.g().save();
        try {
            drawContext.getTransform().c(0.0f, 0.0f, fI, fG, iB);
            j11 = jB;
            try {
                X0.f.f1(fVar, jQ, f10, 0L, 0.0f, null, null, 0, 124, null);
                drawContext.g().i();
                drawContext.h(j11);
            } catch (Throwable th2) {
                th = th2;
                drawContext.g().i();
                drawContext.h(j11);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j11 = jB;
        }
    }

    public final void c(h0.i interaction, InterfaceC15783O scope) {
        boolean z10 = interaction instanceof h0.g;
        if (z10) {
            this.interactions.add(interaction);
        } else if (interaction instanceof h0.h) {
            this.interactions.remove(((h0.h) interaction).getEnter());
        } else if (interaction instanceof h0.d) {
            this.interactions.add(interaction);
        } else if (interaction instanceof h0.e) {
            this.interactions.remove(((h0.e) interaction).getFocus());
        } else if (interaction instanceof C14435b) {
            this.interactions.add(interaction);
        } else if (interaction instanceof C14436c) {
            this.interactions.remove(((C14436c) interaction).getStart());
        } else if (!(interaction instanceof C14434a)) {
            return;
        } else {
            this.interactions.remove(((C14434a) interaction).getStart());
        }
        h0.i iVar = (h0.i) CollectionsKt.F0(this.interactions);
        if (Intrinsics.e(this.currentInteraction, iVar)) {
            return;
        }
        if (iVar != null) {
            RippleAlpha rippleAlphaInvoke = this.rippleAlpha.invoke();
            C15809k.d(scope, null, null, new a(z10 ? rippleAlphaInvoke.getHoveredAlpha() : interaction instanceof h0.d ? rippleAlphaInvoke.getFocusedAlpha() : interaction instanceof C14435b ? rippleAlphaInvoke.getDraggedAlpha() : 0.0f, f.d(iVar), null), 3, null);
        } else {
            C15809k.d(scope, null, null, new b(f.e(this.currentInteraction), null), 3, null);
        }
        this.currentInteraction = iVar;
    }

    public i(boolean z10, Function0<RippleAlpha> function0) {
        this.bounded = z10;
        this.rippleAlpha = function0;
    }
}
