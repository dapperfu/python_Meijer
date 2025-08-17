package Pi;

import F1.k;
import Ji.C;
import Ji.LocalThemeScope;
import Ni.l;
import P0.e;
import Pi.C4997z;
import V0.C5346q0;
import V0.C5349s0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.C5662h;
import androidx.compose.foundation.layout.C5664j;
import androidx.compose.foundation.layout.C5665k;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.InterfaceC5742s;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.platform.InterfaceC5886r0;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import ii.C14732c;
import j0.C14801J;
import j0.C14802K;
import j0.C14815g;
import j0.InterfaceC14800I;
import j0.InterfaceC14814f;
import java.util.Map;
import ji.q1;
import kotlin.C17738x;
import kotlin.C17891L0;
import kotlin.C17893M0;
import kotlin.C18153w;
import kotlin.EnumC17895N0;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l0.C15342b;
import l0.InterfaceC15343c;
import ni.C15803G;
import ni.C15817c0;
import qv.C16648k;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007*\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014²\u0006\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00128\n@\nX\u008a\u008e\u0002"}, d2 = {"LPi/z;", "LNi/c;", "LNi/l$b;", "state", "<init>", "(LNi/l$b;)V", "LJi/M;", "", "a", "(LJi/M;Landroidx/compose/runtime/Composer;I)V", "f", "LNi/l$b;", "o", "()LNi/l$b;", "", "getName", "()Ljava/lang/String;", "name", "LPi/z2;", "clipboardHelper", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Pi.z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4997z implements Ni.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l.C4362b state;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Pi.z$a */
    static final class a implements Function3<InterfaceC14814f, Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28218a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f28219b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C17893M0 f28220c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC5886r0 f28221d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<C5000z2> f28222e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.z$a$a, reason: collision with other inner class name */
        static final class C0653a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC14814f f28223a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f28224b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f28225c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ C17893M0 f28226d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC5886r0 f28227e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<C5000z2> f28228f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Pi.z$a$a$a, reason: collision with other inner class name */
            static final class C0654a implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ InterfaceC14814f f28229a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f28230b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f28231c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C17893M0 f28232d;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.components.AnnotatedLabelShowcase$Content$1$1$1$1$1$1$1$1$1$1$1", f = "AnnotatedLabelShowcase.kt", l = {98}, m = "invokeSuspend")
                /* renamed from: Pi.z$a$a$a$a, reason: collision with other inner class name */
                static final class C0655a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f28233a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C17893M0 f28234b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0655a(C17893M0 c17893m0, Continuation<? super C0655a> continuation) {
                        super(2, continuation);
                        this.f28234b = c17893m0;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C0655a(this.f28234b, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((C0655a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f28233a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            C17893M0 c17893m0 = this.f28234b;
                            this.f28233a = 1;
                            if (c17893m0.i(this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                public final void b(InterfaceC15343c item, Composer composer, int i10) {
                    Intrinsics.j(item, "$this$item");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(601276434, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AnnotatedLabelShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnnotatedLabelShowcase.kt:92)");
                    }
                    InterfaceC14814f interfaceC14814f = this.f28229a;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    e.Companion companion2 = P0.e.INSTANCE;
                    Modifier modifierC = interfaceC14814f.c(companion, companion2.k());
                    LocalThemeScope localThemeScope = this.f28230b;
                    final InterfaceC16622O interfaceC16622O = this.f28231c;
                    final C17893M0 c17893m0 = this.f28232d;
                    MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
                    int iA = C5717f.a(composer, 0);
                    InterfaceC5742s interfaceC5742sR = composer.r();
                    Modifier modifierE = androidx.compose.ui.b.e(composer, modifierC);
                    InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
                    Function0<InterfaceC5811g> function0A = companion3.a();
                    if (composer.k() == null) {
                        C5717f.c();
                    }
                    composer.F();
                    if (composer.getInserting()) {
                        composer.I(function0A);
                    } else {
                        composer.s();
                    }
                    Composer composerA = androidx.compose.runtime.D1.a(composer);
                    androidx.compose.runtime.D1.c(composerA, measurePolicyG, companion3.e());
                    androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion3.g());
                    Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
                    if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                        composerA.t(Integer.valueOf(iA));
                        composerA.n(Integer.valueOf(iA), function2B);
                    }
                    androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
                    C5664j c5664j = C5664j.f48612a;
                    ni.O o10 = ni.O.f151547a;
                    composer.startReplaceGroup(-1633490746);
                    boolean zD = composer.D(interfaceC16622O) | composer.D(c17893m0);
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: Pi.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C4997z.a.C0653a.C0654a.c(interfaceC16622O, c17893m0);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    ni.P0.i(localThemeScope, o10, (Function0) objB, C.f.o.f15522e, "Close code snippet", null, false, false, 0L, composer, 27696, 240);
                    composer.v();
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                C0654a(InterfaceC14814f interfaceC14814f, LocalThemeScope localThemeScope, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0) {
                    this.f28229a = interfaceC14814f;
                    this.f28230b = localThemeScope;
                    this.f28231c = interfaceC16622O;
                    this.f28232d = c17893m0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InterfaceC16622O interfaceC16622O, C17893M0 c17893m0) {
                    C16648k.d(interfaceC16622O, null, null, new C0655a(c17893m0, null), 3, null);
                    return Unit.f142422a;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
                    b(interfaceC15343c, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Pi.z$a$a$b */
            static final class b implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f28235a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<C5000z2> f28236b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* renamed from: Pi.z$a$a$b$a, reason: collision with other inner class name */
                static final class C0656a implements Function2<Composer, Integer, Unit> {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f28237a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ InterfaceC5730l0<C5000z2> f28238b;

                    C0656a(LocalThemeScope localThemeScope, InterfaceC5730l0<C5000z2> interfaceC5730l0) {
                        this.f28237a = localThemeScope;
                        this.f28238b = interfaceC5730l0;
                    }

                    public final void a(Composer composer, int i10) {
                        if ((i10 & 3) == 2 && composer.j()) {
                            composer.K();
                            return;
                        }
                        if (ComposerKt.M()) {
                            ComposerKt.U(-525488276, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AnnotatedLabelShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnnotatedLabelShowcase.kt:107)");
                        }
                        LocalThemeScope localThemeScope = this.f28237a;
                        q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, this.f28237a.getAdsTypography().getBodyCompact().getOne(), null, 383, null);
                        C5000z2 c5000z2I = C4997z.i(this.f28238b);
                        String snippet = c5000z2I != null ? c5000z2I.getSnippet() : null;
                        if (snippet == null) {
                            snippet = "";
                        }
                        ri.j.h(localThemeScope, label, snippet, null, composer, 0, 4);
                        if (ComposerKt.M()) {
                            ComposerKt.T();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        a(composer, num.intValue());
                        return Unit.f142422a;
                    }
                }

                b(LocalThemeScope localThemeScope, InterfaceC5730l0<C5000z2> interfaceC5730l0) {
                    this.f28235a = localThemeScope;
                    this.f28236b = interfaceC5730l0;
                }

                public final void a(InterfaceC15343c item, Composer composer, int i10) {
                    Intrinsics.j(item, "$this$item");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(619670793, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AnnotatedLabelShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnnotatedLabelShowcase.kt:106)");
                    }
                    C17738x.a(null, ComposableLambdaKt.c(-525488276, true, new C0656a(this.f28235a, this.f28236b), composer, 54), composer, 48, 1);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
                    a(interfaceC15343c, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @SourceDebugExtension
            /* renamed from: Pi.z$a$a$c */
            static final class c implements Function3<InterfaceC15343c, Composer, Integer, Unit> {

                /* renamed from: a, reason: collision with root package name */
                final /* synthetic */ LocalThemeScope f28239a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ InterfaceC5886r0 f28240b;

                /* renamed from: c, reason: collision with root package name */
                final /* synthetic */ InterfaceC16622O f28241c;

                /* renamed from: d, reason: collision with root package name */
                final /* synthetic */ C17893M0 f28242d;

                /* renamed from: e, reason: collision with root package name */
                final /* synthetic */ InterfaceC5730l0<C5000z2> f28243e;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.components.AnnotatedLabelShowcase$Content$1$1$1$1$1$1$3$1$1$1", f = "AnnotatedLabelShowcase.kt", l = {126, 126}, m = "invokeSuspend")
                /* renamed from: Pi.z$a$a$c$a, reason: collision with other inner class name */
                static final class C0657a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f28244a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ LocalThemeScope f28245b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C0657a(LocalThemeScope localThemeScope, Continuation<? super C0657a> continuation) {
                        super(2, continuation);
                        this.f28245b = localThemeScope;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C0657a(this.f28245b, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((C0657a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
                    
                        if (Gi.i.i((Gi.i) r0, "Copied to clipboard!", null, null, false, null, null, null, null, r13, 254, null) == r12) goto L15;
                     */
                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                        /*
                            r13 = this;
                            java.lang.Object r12 = kotlin.coroutines.intrinsics.IntrinsicsKt.f()
                            int r0 = r13.f28244a
                            r1 = 2
                            r2 = 1
                            if (r0 == 0) goto L1f
                            if (r0 == r2) goto L1a
                            if (r0 != r1) goto L12
                            kotlin.ResultKt.b(r14)
                            goto L47
                        L12:
                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                            r0.<init>(r1)
                            throw r0
                        L1a:
                            kotlin.ResultKt.b(r14)
                            r0 = r14
                            goto L2f
                        L1f:
                            kotlin.ResultKt.b(r14)
                            Ji.M r0 = r13.f28245b
                            r13.f28244a = r2
                            r3 = 0
                            r4 = 0
                            java.lang.Object r0 = Ji.LocalThemeScope.g(r0, r3, r13, r2, r4)
                            if (r0 != r12) goto L2f
                            goto L46
                        L2f:
                            Gi.i r0 = (Gi.i) r0
                            r13.f28244a = r1
                            java.lang.String r1 = "Copied to clipboard!"
                            r2 = 0
                            r3 = 0
                            r4 = 0
                            r5 = 0
                            r6 = 0
                            r7 = 0
                            r8 = 0
                            r10 = 254(0xfe, float:3.56E-43)
                            r11 = 0
                            r9 = r13
                            java.lang.Object r0 = Gi.i.i(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                            if (r0 != r12) goto L47
                        L46:
                            return r12
                        L47:
                            kotlin.Unit r0 = kotlin.Unit.f142422a
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: Pi.C4997z.a.C0653a.c.C0657a.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
                @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.components.AnnotatedLabelShowcase$Content$1$1$1$1$1$1$3$1$1$2", f = "AnnotatedLabelShowcase.kt", l = {130}, m = "invokeSuspend")
                /* renamed from: Pi.z$a$a$c$b */
                static final class b extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                    /* renamed from: a, reason: collision with root package name */
                    int f28246a;

                    /* renamed from: b, reason: collision with root package name */
                    final /* synthetic */ C17893M0 f28247b;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    b(C17893M0 c17893m0, Continuation<? super b> continuation) {
                        super(2, continuation);
                        this.f28247b = c17893m0;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new b(this.f28247b, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                        return ((b) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object objF = IntrinsicsKt.f();
                        int i10 = this.f28246a;
                        if (i10 != 0) {
                            if (i10 == 1) {
                                ResultKt.b(obj);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            ResultKt.b(obj);
                            C17893M0 c17893m0 = this.f28247b;
                            this.f28246a = 1;
                            if (c17893m0.i(this) == objF) {
                                return objF;
                            }
                        }
                        return Unit.f142422a;
                    }
                }

                c(LocalThemeScope localThemeScope, InterfaceC5886r0 interfaceC5886r0, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, InterfaceC5730l0<C5000z2> interfaceC5730l0) {
                    this.f28239a = localThemeScope;
                    this.f28240b = interfaceC5886r0;
                    this.f28241c = interfaceC16622O;
                    this.f28242d = c17893m0;
                    this.f28243e = interfaceC5730l0;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(InterfaceC5886r0 interfaceC5886r0, InterfaceC16622O interfaceC16622O, InterfaceC5730l0 interfaceC5730l0, LocalThemeScope localThemeScope, C17893M0 c17893m0) {
                    AnnotatedString.b bVar = new AnnotatedString.b(0, 1, null);
                    C5000z2 c5000z2I = C4997z.i(interfaceC5730l0);
                    String snippet = c5000z2I != null ? c5000z2I.getSnippet() : null;
                    if (snippet == null) {
                        snippet = "";
                    }
                    bVar.g(snippet);
                    interfaceC5886r0.a(bVar.q());
                    C16648k.d(interfaceC16622O, null, null, new C0657a(localThemeScope, null), 3, null);
                    C16648k.d(interfaceC16622O, null, null, new b(c17893m0, null), 3, null);
                    return Unit.f142422a;
                }

                public final void b(InterfaceC15343c item, Composer composer, int i10) {
                    Intrinsics.j(item, "$this$item");
                    if ((i10 & 17) == 16 && composer.j()) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(-336255605, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AnnotatedLabelShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnnotatedLabelShowcase.kt:117)");
                    }
                    LocalThemeScope localThemeScope = this.f28239a;
                    C15817c0 c15817c0 = C15817c0.f151691a;
                    composer.startReplaceGroup(-1224400529);
                    boolean zD = composer.D(this.f28240b) | composer.D(this.f28241c) | composer.D(this.f28239a) | composer.D(this.f28242d);
                    final InterfaceC5886r0 interfaceC5886r0 = this.f28240b;
                    final InterfaceC16622O interfaceC16622O = this.f28241c;
                    final InterfaceC5730l0<C5000z2> interfaceC5730l0 = this.f28243e;
                    final LocalThemeScope localThemeScope2 = this.f28239a;
                    final C17893M0 c17893m0 = this.f28242d;
                    Object objB = composer.B();
                    if (zD || objB == Composer.INSTANCE.a()) {
                        objB = new Function0() { // from class: Pi.A
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return C4997z.a.C0653a.c.c(interfaceC5886r0, interfaceC16622O, interfaceC5730l0, localThemeScope2, c17893m0);
                            }
                        };
                        composer.t(objB);
                    }
                    composer.P();
                    ni.P0.j(localThemeScope, c15817c0, (Function0) objB, C.a.C3840l.f15349e, "COPY", null, "Copy code snippet to clipboard", false, false, 0L, false, composer, 1600560, 0, 976);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
                    b(interfaceC15343c, composer, num.intValue());
                    return Unit.f142422a;
                }
            }

            public final void b(InterfaceC15343c item, Composer composer, int i10) {
                Intrinsics.j(item, "$this$item");
                if ((i10 & 17) == 16 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-140197123, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AnnotatedLabelShowcase.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AnnotatedLabelShowcase.kt:90)");
                }
                composer.startReplaceGroup(-1224400529);
                boolean zV = composer.V(this.f28223a) | composer.D(this.f28224b) | composer.D(this.f28225c) | composer.D(this.f28226d) | composer.D(this.f28227e);
                final InterfaceC14814f interfaceC14814f = this.f28223a;
                final LocalThemeScope localThemeScope = this.f28224b;
                final InterfaceC16622O interfaceC16622O = this.f28225c;
                final C17893M0 c17893m0 = this.f28226d;
                final InterfaceC5730l0<C5000z2> interfaceC5730l0 = this.f28228f;
                final InterfaceC5886r0 interfaceC5886r0 = this.f28227e;
                Object objB = composer.B();
                if (zV || objB == Composer.INSTANCE.a()) {
                    objB = new Function1() { // from class: Pi.x
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C4997z.a.C0653a.c(interfaceC14814f, localThemeScope, interfaceC16622O, c17893m0, interfaceC5730l0, interfaceC5886r0, (l0.w) obj);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                C15342b.a(null, null, null, false, null, null, null, false, null, (Function1) objB, composer, 0, 511);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            C0653a(InterfaceC14814f interfaceC14814f, LocalThemeScope localThemeScope, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, InterfaceC5886r0 interfaceC5886r0, InterfaceC5730l0<C5000z2> interfaceC5730l0) {
                this.f28223a = interfaceC14814f;
                this.f28224b = localThemeScope;
                this.f28225c = interfaceC16622O;
                this.f28226d = c17893m0;
                this.f28227e = interfaceC5886r0;
                this.f28228f = interfaceC5730l0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit c(InterfaceC14814f interfaceC14814f, LocalThemeScope localThemeScope, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, InterfaceC5730l0 interfaceC5730l0, InterfaceC5886r0 interfaceC5886r0, l0.w LazyColumn) {
                Intrinsics.j(LazyColumn, "$this$LazyColumn");
                l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(601276434, true, new C0654a(interfaceC14814f, localThemeScope, interfaceC16622O, c17893m0)), 3, null);
                l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(619670793, true, new b(localThemeScope, interfaceC5730l0)), 3, null);
                l0.w.g(LazyColumn, null, null, D2.f25729a.a(), 3, null);
                l0.w.g(LazyColumn, null, null, ComposableLambdaKt.composableLambdaInstance(-336255605, true, new c(localThemeScope, interfaceC5886r0, interfaceC16622O, c17893m0, interfaceC5730l0)), 3, null);
                return Unit.f142422a;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC15343c interfaceC15343c, Composer composer, Integer num) {
                b(interfaceC15343c, composer, num.intValue());
                return Unit.f142422a;
            }
        }

        a(LocalThemeScope localThemeScope, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, InterfaceC5886r0 interfaceC5886r0, InterfaceC5730l0<C5000z2> interfaceC5730l0) {
            this.f28218a = localThemeScope;
            this.f28219b = interfaceC16622O;
            this.f28220c = c17893m0;
            this.f28221d = interfaceC5886r0;
            this.f28222e = interfaceC5730l0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(InterfaceC14814f interfaceC14814f, LocalThemeScope localThemeScope, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, InterfaceC5886r0 interfaceC5886r0, InterfaceC5730l0 interfaceC5730l0, l0.w LazyRow) {
            Intrinsics.j(LazyRow, "$this$LazyRow");
            l0.w.g(LazyRow, null, null, ComposableLambdaKt.composableLambdaInstance(-140197123, true, new C0653a(interfaceC14814f, localThemeScope, interfaceC16622O, c17893m0, interfaceC5886r0, interfaceC5730l0)), 3, null);
            return Unit.f142422a;
        }

        public final void b(final InterfaceC14814f ModalBottomSheetLayout, Composer composer, int i10) {
            int i11;
            Intrinsics.j(ModalBottomSheetLayout, "$this$ModalBottomSheetLayout");
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(ModalBottomSheetLayout) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(435421338, i11, -1, "com.meijer.mobile.androidacres.showcase.components.AnnotatedLabelShowcase.Content.<anonymous> (AnnotatedLabelShowcase.kt:83)");
            }
            Modifier modifierM = androidx.compose.foundation.layout.D.m(androidx.compose.foundation.layout.D.i(androidx.compose.foundation.b.d(Modifier.INSTANCE, C5346q0.INSTANCE.k(), null, 2, null), H1.h.p(16)), 0.0f, 0.0f, 0.0f, H1.h.p(50), 7, null);
            composer.startReplaceGroup(-1224400529);
            boolean zD = ((i11 & 14) == 4) | composer.D(this.f28218a) | composer.D(this.f28219b) | composer.D(this.f28220c) | composer.D(this.f28221d);
            final LocalThemeScope localThemeScope = this.f28218a;
            final InterfaceC16622O interfaceC16622O = this.f28219b;
            final C17893M0 c17893m0 = this.f28220c;
            final InterfaceC5886r0 interfaceC5886r0 = this.f28221d;
            final InterfaceC5730l0<C5000z2> interfaceC5730l0 = this.f28222e;
            Object objB = composer.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                Function1 function1 = new Function1() { // from class: Pi.w
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C4997z.a.c(ModalBottomSheetLayout, localThemeScope, interfaceC16622O, c17893m0, interfaceC5886r0, interfaceC5730l0, (l0.w) obj);
                    }
                };
                composer.t(function1);
                objB = function1;
            }
            composer.P();
            C15342b.c(modifierM, null, null, false, null, null, null, false, null, (Function1) objB, composer, 6, 510);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14814f interfaceC14814f, Composer composer, Integer num) {
            b(interfaceC14814f, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pi.z$b */
    static final class b implements Function2<Composer, Integer, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LocalThemeScope f28248a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C4997z f28249b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f28250c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C17893M0 f28251d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<C5000z2> f28252e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Pi.z$b$a */
        static final class a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f28253a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ InterfaceC16622O f28254b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ C17893M0 f28255c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC5730l0<C5000z2> f28256d;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
            @DebugMetadata(c = "com.meijer.mobile.androidacres.showcase.components.AnnotatedLabelShowcase$Content$2$1$1$2$4$1$1", f = "AnnotatedLabelShowcase.kt", l = {321}, m = "invokeSuspend")
            /* renamed from: Pi.z$b$a$a, reason: collision with other inner class name */
            static final class C0658a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

                /* renamed from: a, reason: collision with root package name */
                int f28257a;

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ C17893M0 f28258b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0658a(C17893M0 c17893m0, Continuation<? super C0658a> continuation) {
                    super(2, continuation);
                    this.f28258b = c17893m0;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C0658a(this.f28258b, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                    return ((C0658a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object objF = IntrinsicsKt.f();
                    int i10 = this.f28257a;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            ResultKt.b(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.b(obj);
                        C17893M0 c17893m0 = this.f28258b;
                        this.f28257a = 1;
                        if (c17893m0.l(this) == objF) {
                            return objF;
                        }
                    }
                    return Unit.f142422a;
                }
            }

            a(LocalThemeScope localThemeScope, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, InterfaceC5730l0<C5000z2> interfaceC5730l0) {
                this.f28253a = localThemeScope;
                this.f28254b = interfaceC16622O;
                this.f28255c = c17893m0;
                this.f28256d = interfaceC5730l0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit e(Context context, String str) {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(Context context, String str) {
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                return Unit.f142422a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit g(InterfaceC16622O interfaceC16622O, InterfaceC5730l0 interfaceC5730l0, C17893M0 c17893m0) {
                C4997z.j(interfaceC5730l0, new C5000z2("AdsLabel(\n    template = Template.Label(style = adsTypography.body.One),\n    hyperlinkMap = mapOf(\n        termsTag to {\n            context.startActivity(\n                Intent(\n                    Intent.ACTION_VIEW,\n                    Uri.parse(termsUrl)\n                )\n            )\n        },\n        privacyTag to {\n            context.startActivity(\n                Intent(\n                    Intent.ACTION_VIEW,\n                    Uri.parse(privacyUrl)\n                )\n            )\n        }\n    ),\n    annotatedString = buildAnnotatedString {\n        append(\"You agree to follow all of our extensive and amazing policies for \")\n        appendHyperlink(\n            spanStyle = SpanStyle(\n                color = Color.Blue,\n                fontWeight = FontWeight.Bold\n            ),\n            tag = termsTag,\n            displayedText = \"Terms of Service\",\n            linkUrl = termsUrl\n        )\n        append(\" and \")\n        appendHyperlink(\n            spanStyle = SpanStyle(\n                color = Color.Blue,\n                fontWeight = FontWeight.Bold\n            ),\n            tag = privacyTag,\n            displayedText = \"Privacy Policy\",\n            linkUrl = privacyUrl\n        )\n    }\n)"));
                C16648k.d(interfaceC16622O, null, null, new C0658a(c17893m0, null), 3, null);
                return Unit.f142422a;
            }

            public final void d(Composer composer, int i10) {
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-1221882412, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AnnotatedLabelShowcase.Content.<anonymous>.<anonymous> (AnnotatedLabelShowcase.kt:147)");
                }
                final Context context = (Context) composer.o(AndroidCompositionLocals_androidKt.g());
                C5658d c5658d = C5658d.f48555a;
                float f10 = 8;
                C5658d.f fVarO = c5658d.o(H1.h.p(f10));
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierG = d0.T.g(companion, d0.T.c(0, composer, 0, 1), false, null, false, 14, null);
                LocalThemeScope localThemeScope = this.f28253a;
                final InterfaceC16622O interfaceC16622O = this.f28254b;
                final C17893M0 c17893m0 = this.f28255c;
                final InterfaceC5730l0<C5000z2> interfaceC5730l0 = this.f28256d;
                e.Companion companion2 = P0.e.INSTANCE;
                MeasurePolicy measurePolicyA = C5665k.a(fVarO, companion2.k(), composer, 6);
                int iA = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR = composer.r();
                Modifier modifierE = androidx.compose.ui.b.e(composer, modifierG);
                InterfaceC5811g.Companion companion3 = InterfaceC5811g.INSTANCE;
                Function0<InterfaceC5811g> function0A = companion3.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A);
                } else {
                    composer.s();
                }
                Composer composerA = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA, measurePolicyA, companion3.e());
                androidx.compose.runtime.D1.c(composerA, interfaceC5742sR, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B = companion3.b();
                if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                    composerA.t(Integer.valueOf(iA));
                    composerA.n(Integer.valueOf(iA), function2B);
                }
                androidx.compose.runtime.D1.c(composerA, modifierE, companion3.f());
                C14815g c14815g = C14815g.f139108a;
                ri.j.h(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 383, null), "Here is an example of using \"AdsLabel\" overload with the \"text\" option (not using the mixed styles one).", null, composer, 384, 4);
                ri.j.i(localThemeScope, new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), Integer.valueOf(C14732c.f138030m), com.medallia.digital.mobilesdk.l3.f92485d, null), null, composer, 0, 2);
                q1.Label label = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 383, null);
                AnnotatedString.b bVar = new AnnotatedString.b(0, 1, null);
                bVar.n(new SpanStyle(C5349s0.d(4285248394L), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                bVar.g("Here is ");
                bVar.j();
                C5346q0.Companion companion4 = C5346q0.INSTANCE;
                bVar.n(new SpanStyle(companion4.a(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                bVar.g("an example ");
                bVar.j();
                bVar.n(new SpanStyle(C5349s0.d(4283875798L), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                bVar.g("of mixing ");
                bVar.j();
                long jH = companion4.h();
                C18153w.Companion companion5 = C18153w.INSTANCE;
                bVar.n(new SpanStyle(jH, 0L, null, C18153w.c(companion5.a()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65526, null));
                bVar.g("some ");
                bVar.j();
                long jA = companion4.a();
                FontWeight.Companion companion6 = FontWeight.INSTANCE;
                bVar.n(new SpanStyle(jA, 0L, companion6.f(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65530, null));
                bVar.g("different text ");
                bVar.j();
                long jG = companion4.g();
                k.Companion companion7 = F1.k.INSTANCE;
                bVar.n(new SpanStyle(jG, 0L, null, null, null, null, null, 0L, null, null, null, 0L, companion7.b(), null, null, null, 61438, null));
                bVar.g("styles together with AdsLabel()!!! ");
                bVar.j();
                bVar.n(new SpanStyle(companion4.b(), 0L, companion6.b(), null, null, null, null, 0L, null, null, null, 0L, companion7.d(), null, null, null, 61434, null));
                bVar.g("(using the \"annotatedString\" overload)");
                bVar.j();
                Unit unit = Unit.f142422a;
                ri.j.g(localThemeScope, label, bVar.q(), null, null, composer, 0, 12);
                Modifier modifierH = androidx.compose.foundation.layout.J.h(companion, 0.0f, 1, null);
                MeasurePolicy measurePolicyB = androidx.compose.foundation.layout.G.b(c5658d.g(), companion2.i(), composer, 48);
                int iA2 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR2 = composer.r();
                Modifier modifierE2 = androidx.compose.ui.b.e(composer, modifierH);
                Function0<InterfaceC5811g> function0A2 = companion3.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A2);
                } else {
                    composer.s();
                }
                Composer composerA2 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA2, measurePolicyB, companion3.e());
                androidx.compose.runtime.D1.c(composerA2, interfaceC5742sR2, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B2 = companion3.b();
                if (composerA2.getInserting() || !Intrinsics.e(composerA2.B(), Integer.valueOf(iA2))) {
                    composerA2.t(Integer.valueOf(iA2));
                    composerA2.n(Integer.valueOf(iA2), function2B2);
                }
                androidx.compose.runtime.D1.c(composerA2, modifierE2, companion3.f());
                q1.Label label2 = new q1.Label(InterfaceC14800I.b(C14801J.f139030a, companion, 1.0f, false, 2, null), null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 382, null);
                composer.startReplaceGroup(-1633490746);
                boolean zD = composer.D(context);
                Object objB = composer.B();
                final String str = "https://www.meijer.com/terms.html";
                if (zD || objB == Composer.INSTANCE.a()) {
                    objB = new Function0() { // from class: Pi.B
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4997z.b.a.e(context, str);
                        }
                    };
                    composer.t(objB);
                }
                composer.P();
                Pair pairA = TuplesKt.a("terms", (Function0) objB);
                composer.startReplaceGroup(-1633490746);
                boolean zD2 = composer.D(context);
                Object objB2 = composer.B();
                final String str2 = "https://www.meijer.com/privacy-policy.html";
                if (zD2 || objB2 == Composer.INSTANCE.a()) {
                    objB2 = new Function0() { // from class: Pi.C
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4997z.b.a.f(context, str2);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                Map mapO = MapsKt.o(pairA, TuplesKt.a("privacy", (Function0) objB2));
                AnnotatedString.b bVar2 = new AnnotatedString.b(0, 1, null);
                bVar2.g("You agree to follow all of our extensive and amazing policies for ");
                ri.j.p(bVar2, new SpanStyle(companion4.b(), 0L, companion6.a(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65530, null), "terms", "Terms of Service", "https://www.meijer.com/terms.html");
                bVar2.g(" and ");
                ri.j.p(bVar2, new SpanStyle(companion4.b(), 0L, companion6.a(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65530, null), "privacy", "Privacy Policy", "https://www.meijer.com/privacy-policy.html");
                ri.j.g(localThemeScope, label2, bVar2.q(), mapO, null, composer, 0, 8);
                C14802K.a(androidx.compose.foundation.layout.J.z(companion, localThemeScope.getAdsSpacing().getThree().getDp()), composer, 0);
                C15803G c15803g = C15803G.f151439a;
                composer.startReplaceGroup(-1746271574);
                boolean zD3 = composer.D(interfaceC16622O) | composer.D(c17893m0);
                Object objB3 = composer.B();
                if (zD3 || objB3 == Composer.INSTANCE.a()) {
                    objB3 = new Function0() { // from class: Pi.D
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C4997z.b.a.g(interfaceC16622O, interfaceC5730l0, c17893m0);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                ni.P0.i(localThemeScope, c15803g, (Function0) objB3, C.j.p.f15591d, "View code", null, false, false, 0L, composer, 27696, 240);
                composer.v();
                Modifier modifierB = d0.T.b(androidx.compose.foundation.layout.J.z(androidx.compose.foundation.layout.D.i(androidx.compose.foundation.b.d(companion, companion4.a(), null, 2, null), H1.h.p(f10)), H1.h.p(2000)), d0.T.c(0, composer, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyG = C5662h.g(companion2.o(), false);
                int iA3 = C5717f.a(composer, 0);
                InterfaceC5742s interfaceC5742sR3 = composer.r();
                Modifier modifierE3 = androidx.compose.ui.b.e(composer, modifierB);
                Function0<InterfaceC5811g> function0A3 = companion3.a();
                if (composer.k() == null) {
                    C5717f.c();
                }
                composer.F();
                if (composer.getInserting()) {
                    composer.I(function0A3);
                } else {
                    composer.s();
                }
                Composer composerA3 = androidx.compose.runtime.D1.a(composer);
                androidx.compose.runtime.D1.c(composerA3, measurePolicyG, companion3.e());
                androidx.compose.runtime.D1.c(composerA3, interfaceC5742sR3, companion3.g());
                Function2<InterfaceC5811g, Integer, Unit> function2B3 = companion3.b();
                if (composerA3.getInserting() || !Intrinsics.e(composerA3.B(), Integer.valueOf(iA3))) {
                    composerA3.t(Integer.valueOf(iA3));
                    composerA3.n(Integer.valueOf(iA3), function2B3);
                }
                androidx.compose.runtime.D1.c(composerA3, modifierE3, companion3.f());
                C5664j c5664j = C5664j.f48612a;
                q1.Label label3 = new q1.Label(null, null, null, null, 0, false, 0, localThemeScope.getAdsTypography().getBody().getOne(), null, 383, null);
                AnnotatedString.b bVar3 = new AnnotatedString.b(0, 1, null);
                bVar3.n(new SpanStyle(C5349s0.d(4285248394L), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                bVar3.g("AdsLabel");
                bVar3.j();
                bVar3.n(new SpanStyle(companion4.k(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                bVar3.g("(");
                bVar3.j();
                bVar3.n(new SpanStyle(C5349s0.d(4283875798L), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                bVar3.g("\n    annotatedString = ");
                bVar3.j();
                bVar3.n(new SpanStyle(companion4.k(), 0L, null, C18153w.c(companion5.a()), null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65526, null));
                bVar3.g("buildAnnotatedString ");
                bVar3.j();
                bVar3.n(new SpanStyle(companion4.k(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                bVar3.g("{");
                bVar3.g("\n        pushStyle(");
                bVar3.j();
                bVar3.n(new SpanStyle(C5349s0.d(4283875798L), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                bVar3.g("\n            style = ");
                bVar3.j();
                bVar3.n(new SpanStyle(companion4.k(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                bVar3.g("SpanStyle(");
                bVar3.j();
                bVar3.n(new SpanStyle(C5349s0.d(4283875798L), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                bVar3.g("\n                fontWeight = ");
                bVar3.j();
                bVar3.n(new SpanStyle(companion4.k(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                bVar3.g("FontWeight.");
                bVar3.j();
                bVar3.n(new SpanStyle(C5349s0.d(4291263931L), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                bVar3.g("Bold");
                bVar3.j();
                bVar3.n(new SpanStyle(companion4.k(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65534, null));
                bVar3.g(",\n                ...");
                bVar3.g("\n            )");
                bVar3.g("\n        )");
                bVar3.g("\n        append(\"Some text\")");
                bVar3.g("\n        pop()");
                bVar3.g("\n        ...");
                bVar3.g("\n    }");
                bVar3.j();
                ri.j.g(localThemeScope, label3, bVar3.q(), null, null, composer, 0, 12);
                composer.v();
                composer.v();
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                d(composer, num.intValue());
                return Unit.f142422a;
            }
        }

        b(LocalThemeScope localThemeScope, C4997z c4997z, InterfaceC16622O interfaceC16622O, C17893M0 c17893m0, InterfaceC5730l0<C5000z2> interfaceC5730l0) {
            this.f28248a = localThemeScope;
            this.f28249b = c4997z;
            this.f28250c = interfaceC16622O;
            this.f28251d = c17893m0;
            this.f28252e = interfaceC5730l0;
        }

        public final void a(Composer composer, int i10) {
            if ((i10 & 3) == 2 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-360024767, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AnnotatedLabelShowcase.Content.<anonymous> (AnnotatedLabelShowcase.kt:143)");
            }
            Ri.b.b(this.f28248a, null, this.f28249b.d("Mixed Styles"), "1.0", null, ComposableLambdaKt.c(-1221882412, true, new a(this.f28248a, this.f28250c, this.f28251d, this.f28252e), composer, 54), composer, 199680, 9);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    public C4997z(l.C4362b state) {
        Intrinsics.j(state, "state");
        this.state = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(C4997z c4997z, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c4997z.a(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(C4997z c4997z, LocalThemeScope localThemeScope, int i10, Composer composer, int i11) {
        c4997z.f(localThemeScope, composer, androidx.compose.runtime.J0.a(i10 | 1));
        return Unit.f142422a;
    }

    @Override // Ni.c
    public void a(LocalThemeScope localThemeScope, Composer composer, final int i10) {
        int i11;
        final LocalThemeScope localThemeScope2 = localThemeScope;
        Intrinsics.j(localThemeScope2, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(2083603720);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? composerStartRestartGroup.V(localThemeScope2) : composerStartRestartGroup.D(localThemeScope2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.V(this) ? 32 : 16;
        }
        if ((i11 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(2083603720, i11, -1, "com.meijer.mobile.androidacres.showcase.components.AnnotatedLabelShowcase.Content (AnnotatedLabelShowcase.kt:72)");
            }
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = androidx.compose.runtime.J.k(EmptyCoroutineContext.f142646a, composerStartRestartGroup);
                composerStartRestartGroup.t(objB);
            }
            InterfaceC16622O interfaceC16622O = (InterfaceC16622O) objB;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objB2 = composerStartRestartGroup.B();
            if (objB2 == companion.a()) {
                objB2 = androidx.compose.runtime.t1.e(null, null, 2, null);
                composerStartRestartGroup.t(objB2);
            }
            InterfaceC5730l0 interfaceC5730l0 = (InterfaceC5730l0) objB2;
            composerStartRestartGroup.P();
            InterfaceC5886r0 interfaceC5886r0 = (InterfaceC5886r0) composerStartRestartGroup.o(C5892t0.e());
            C17893M0 c17893m0J = C17891L0.j(EnumC17895N0.f167226a, null, null, true, composerStartRestartGroup, 3078, 6);
            ComposableLambda composableLambdaC = ComposableLambdaKt.c(435421338, true, new a(localThemeScope2, interfaceC16622O, c17893m0J, interfaceC5886r0, interfaceC5730l0), composerStartRestartGroup, 54);
            localThemeScope2 = localThemeScope;
            C17891L0.b(composableLambdaC, null, c17893m0J, false, null, 0.0f, 0L, 0L, 0L, ComposableLambdaKt.c(-360024767, true, new b(localThemeScope2, this, interfaceC16622O, c17893m0J, interfaceC5730l0), composerStartRestartGroup, 54), composerStartRestartGroup, (C17893M0.f167209e << 6) | 805306374, 506);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.u
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4997z.k(this.f27867a, localThemeScope2, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public void f(final LocalThemeScope localThemeScope, Composer composer, final int i10) {
        Intrinsics.j(localThemeScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(1822344799);
        if ((i10 & 1) == 0 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(1822344799, i10, -1, "com.meijer.mobile.androidacres.showcase.components.AnnotatedLabelShowcase.Controls (AnnotatedLabelShowcase.kt:401)");
            }
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        androidx.compose.runtime.T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Pi.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4997z.l(this.f27890a, localThemeScope, i10, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // Ni.c
    public String getName() {
        return "Annotated Label";
    }

    @Override // Ni.c
    /* renamed from: o, reason: from getter */
    public l.C4362b getState() {
        return this.state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5000z2 i(InterfaceC5730l0<C5000z2> interfaceC5730l0) {
        return interfaceC5730l0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(InterfaceC5730l0<C5000z2> interfaceC5730l0, C5000z2 c5000z2) {
        interfaceC5730l0.setValue(c5000z2);
    }
}
