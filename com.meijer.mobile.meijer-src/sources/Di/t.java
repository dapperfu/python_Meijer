package Di;

import Di.t;
import Ki.C;
import Ki.LocalThemeScope;
import V0.W;
import android.content.Context;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.A0;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5866i0;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.C5937w;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.T;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d0.C13576j;
import j0.C14889J;
import ki.q1;
import kotlin.C1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import oi.P0;
import qi.C16671b;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e0\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001d\u0010%R\u0016\u0010'\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001eR\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R \u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)¨\u0006.²\u0006\u000e\u0010-\u001a\u00020,8\n@\nX\u008a\u008e\u0002"}, d2 = {"LDi/t;", "LDi/o;", "", "Lki/q1$m;", "template", "", "titleLabel", "bodyLabel", "LKi/M;", "localThemeScope", "<init>", "(Lki/q1$m;Ljava/lang/String;Ljava/lang/String;LKi/M;)V", "text", "Lkotlin/Function0;", "", "onClick", "F", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "onCloseClick", "T", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier;", "a", "()Lkotlin/jvm/functions/Function3;", "b", "Lki/q1$m;", "D0", "()Lki/q1$m;", "c", "Ljava/lang/String;", "E0", "()Ljava/lang/String;", "d", "C0", "e", "LKi/M;", "()LKi/M;", "f", "actionLabel", "g", "Lkotlin/jvm/functions/Function0;", "onLabelClick", "h", "", "bannerHeight", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class t implements o, Ji.b {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q1.m template;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String titleLabel;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String bodyLabel;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final LocalThemeScope localThemeScope;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String actionLabel;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onLabelClick;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onCloseClick;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    static final class a implements Function3<Modifier, Composer, Integer, Unit> {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Di.t$a$a, reason: collision with other inner class name */
        static final class C0119a implements Function2<Composer, Integer, Unit> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ t f6279a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ LocalThemeScope f6280b;

            C0119a(t tVar, LocalThemeScope localThemeScope) {
                this.f6279a = tVar;
                this.f6280b = localThemeScope;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit k(InterfaceC5866i0 interfaceC5866i0, LayoutCoordinates coordinates) {
                Intrinsics.j(coordinates, "coordinates");
                g(interfaceC5866i0, (int) (coordinates.c() & 4294967295L));
                return Unit.f143329a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit l(long j10, InterfaceC5866i0 interfaceC5866i0, X0.f Canvas) {
                Intrinsics.j(Canvas, "$this$Canvas");
                float f10 = 8;
                float fI1 = Canvas.I1(H1.h.p(f10));
                float fI12 = Canvas.I1(H1.h.p(f10));
                long jB = U0.a.b((Float.floatToRawIntBits(fI1) << 32) | (Float.floatToRawIntBits(fI12) & 4294967295L));
                V0.q1 q1VarA = W.a();
                long jE = U0.f.e((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
                float fI13 = Canvas.I1(H1.h.p(6));
                float fE = e(interfaceC5866i0);
                V0.q1.p(q1VarA, U0.j.c(U0.h.b(jE, U0.k.d((Float.floatToRawIntBits(fE) & 4294967295L) | (Float.floatToRawIntBits(fI13) << 32))), (12 & 2) != 0 ? U0.a.INSTANCE.a() : jB, (12 & 4) != 0 ? U0.a.INSTANCE.a() : 0L, (12 & 8) != 0 ? U0.a.INSTANCE.a() : 0L, (12 & 16) != 0 ? U0.a.INSTANCE.a() : jB), null, 2, null);
                X0.f.W1(Canvas, q1VarA, j10, 0.0f, null, null, 0, 60, null);
                return Unit.f143329a;
            }

            public final void d(Composer composer, int i10) {
                float f10;
                int i11;
                Composer.Companion companion;
                Modifier.Companion companion2;
                if ((i10 & 3) == 2 && composer.j()) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-357951301, i10, -1, "com.meijer.mobile.android_acres_library.composables.notification.NotificationScopeImpl.getComposer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (NotificationComposable.kt:139)");
                }
                final long value = this.f6279a.getTemplate().getColors().a(this.f6279a.getTemplate().getState(), composer, 0).getValue().getValue();
                composer.startReplaceGroup(1849434622);
                Object objB = composer.B();
                Composer.Companion companion3 = Composer.INSTANCE;
                if (objB == companion3.a()) {
                    objB = A0.a(0.0f);
                    composer.t(objB);
                }
                final InterfaceC5866i0 interfaceC5866i0 = (InterfaceC5866i0) objB;
                composer.P();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                float f11 = 1;
                Modifier modifierB = C5937w.b(D.m(J.d(companion4, 0.0f, 1, null), H1.h.p(f11), H1.h.p(f11), 0.0f, H1.h.p(f11), 4, null), kotlin.q.f19047g);
                composer.startReplaceGroup(5004770);
                Object objB2 = composer.B();
                if (objB2 == companion3.a()) {
                    objB2 = new Function1() { // from class: Di.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return t.a.C0119a.k(interfaceC5866i0, (LayoutCoordinates) obj);
                        }
                    };
                    composer.t(objB2);
                }
                composer.P();
                Modifier modifierA = T.a(modifierB, (Function1) objB2);
                composer.startReplaceGroup(-1633490746);
                boolean zE = composer.e(value);
                Object objB3 = composer.B();
                if (zE || objB3 == companion3.a()) {
                    objB3 = new Function1() { // from class: Di.r
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return t.a.C0119a.l(value, interfaceC5866i0, (X0.f) obj);
                        }
                    };
                    composer.t(objB3);
                }
                composer.P();
                C13576j.a(modifierA, (Function1) objB3, composer, 6);
                C16671b.b(this.f6280b, this.f6279a.getTemplate().getStateIcon(), null, null, composer, 0, 6);
                composer.startReplaceGroup(-393761515);
                if (!StringsKt.s0(this.f6279a.getTitleLabel())) {
                    si.j.h(this.f6280b, this.f6279a.getTemplate().getTitleLabel(), this.f6279a.getTitleLabel(), null, composer, 0, 4);
                }
                composer.P();
                si.j.h(this.f6280b, this.f6279a.getTemplate().getBodyLabel(), this.f6279a.getBodyLabel(), null, composer, 0, 4);
                composer.startReplaceGroup(-393748893);
                if (StringsKt.s0(this.f6279a.actionLabel)) {
                    f10 = f11;
                    i11 = 6;
                    companion = companion3;
                    companion2 = companion4;
                } else {
                    Modifier modifierB2 = C5937w.b(companion4, kotlin.q.f19043c);
                    f10 = f11;
                    companion = companion3;
                    i11 = 6;
                    companion2 = companion4;
                    P0.k(this.f6280b, oi.A0.f153872a, this.f6279a.actionLabel, this.f6279a.onLabelClick, modifierB2, null, false, 0L, false, composer, 24624, 240);
                }
                composer.P();
                if (this.f6279a.onCloseClick != null) {
                    final t tVar = this.f6279a;
                    LocalThemeScope localThemeScope = this.f6280b;
                    float f12 = i11;
                    C1.f167869a.a(C5937w.b(J.z(J.d(D.k(companion2, 0.0f, H1.h.p(f12), 1, null), 0.0f, 1, null), H1.h.p(f10)), kotlin.q.f19046f), 0.0f, tVar.getTemplate().getColors().getButtonDivider(), composer, (C1.f167873e << 9) | 6, 2);
                    float f13 = 4;
                    Modifier modifierB3 = C5937w.b(D.m(companion2, H1.h.p(f13), H1.h.p(f12), H1.h.p(f13), 0.0f, 8, null), kotlin.q.f19042b);
                    oi.T t10 = oi.T.f154124a;
                    C.f.p pVar = C.f.p.f17068e;
                    composer.startReplaceGroup(5004770);
                    boolean zD = composer.D(tVar);
                    Object objB4 = composer.B();
                    if (zD || objB4 == companion.a()) {
                        objB4 = new Function0() { // from class: Di.s
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return t.a.C0119a.f(tVar);
                            }
                        };
                        composer.t(objB4);
                    }
                    composer.P();
                    P0.i(localThemeScope, t10, (Function0) objB4, pVar, "Close", modifierB3, false, false, 0L, composer, 27696, 224);
                }
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                d(composer, num.intValue());
                return Unit.f143329a;
            }

            private static final float e(InterfaceC5866i0 interfaceC5866i0) {
                return interfaceC5866i0.b();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit f(t tVar) {
                Function0 function0 = tVar.onCloseClick;
                if (function0 != null) {
                }
                return Unit.f143329a;
            }

            private static final void g(InterfaceC5866i0 interfaceC5866i0, float f10) {
                interfaceC5866i0.A(f10);
            }
        }

        a() {
        }

        public final void a(Modifier it, Composer composer, int i10) {
            Intrinsics.j(it, "it");
            if ((i10 & 17) == 16 && composer.j()) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-2013092415, i10, -1, "com.meijer.mobile.android_acres_library.composables.notification.NotificationScopeImpl.getComposer.<anonymous> (NotificationComposable.kt:135)");
            }
            LocalThemeScope localThemeScope = t.this.getLocalThemeScope();
            t tVar = t.this;
            Modifier modifier = tVar.getTemplate().getModifier();
            MeasurePolicy measurePolicyB = G.b(C5800d.f48779a.g(), P0.e.INSTANCE.l(), composer, 0);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifier);
            InterfaceC5953g.Companion companion = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion.a();
            if (composer.k() == null) {
                C5859f.c();
            }
            composer.F();
            if (composer.getInserting()) {
                composer.I(function0A);
            } else {
                composer.s();
            }
            Composer composerA = D1.a(composer);
            D1.c(composerA, measurePolicyB, companion.e());
            D1.c(composerA, interfaceC5884sR, companion.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion.f());
            C14889J c14889j = C14889J.f139620a;
            kotlin.m.b(0.0f, (Context) composer.o(AndroidCompositionLocals_androidKt.g()), ComposableLambdaKt.c(-357951301, true, new C0119a(tVar, localThemeScope), composer, 54), composer, 384, 1);
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
            a(modifier, composer, num.intValue());
            return Unit.f143329a;
        }
    }

    public t(q1.m template, String titleLabel, String bodyLabel, LocalThemeScope localThemeScope) {
        Intrinsics.j(template, "template");
        Intrinsics.j(titleLabel, "titleLabel");
        Intrinsics.j(bodyLabel, "bodyLabel");
        Intrinsics.j(localThemeScope, "localThemeScope");
        this.template = template;
        this.titleLabel = titleLabel;
        this.bodyLabel = bodyLabel;
        this.localThemeScope = localThemeScope;
        this.actionLabel = "";
        this.onLabelClick = new Function0() { // from class: Di.p
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t.F0();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F0() {
        return Unit.f143329a;
    }

    /* renamed from: C0, reason: from getter */
    public String getBodyLabel() {
        return this.bodyLabel;
    }

    /* renamed from: D0, reason: from getter */
    public q1.m getTemplate() {
        return this.template;
    }

    /* renamed from: E0, reason: from getter */
    public String getTitleLabel() {
        return this.titleLabel;
    }

    @Override // Di.o
    public void F(String text, Function0<Unit> onClick) {
        Intrinsics.j(text, "text");
        Intrinsics.j(onClick, "onClick");
        this.onLabelClick = onClick;
        this.actionLabel = text;
    }

    @Override // Di.o
    public void T(Function0<Unit> onCloseClick) {
        Intrinsics.j(onCloseClick, "onCloseClick");
        this.onCloseClick = onCloseClick;
    }

    @Override // Ji.b
    public Function3<Modifier, Composer, Integer, Unit> a() {
        return ComposableLambdaKt.composableLambdaInstance(-2013092415, true, new a());
    }

    @Override // Ji.h, Ai.InterfaceC2817g1
    /* renamed from: c, reason: from getter */
    public LocalThemeScope getLocalThemeScope() {
        return this.localThemeScope;
    }
}
