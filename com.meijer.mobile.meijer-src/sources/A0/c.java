package A0;

import U0.l;
import V0.F1;
import V0.W;
import V0.q1;
import V0.s1;
import X0.Stroke;
import androidx.compose.foundation.layout.C5804h;
import androidx.compose.foundation.layout.C5806j;
import androidx.compose.foundation.layout.J;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.o1;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.InterfaceC5953g;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import d0.C13576j;
import kotlin.C17972T0;
import kotlin.C6418E;
import kotlin.C6443c;
import kotlin.C6453j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.n0;
import r0.C16806i;
import r0.RoundedCornerShape;
import r1.C16819m;
import r1.u;

@Metadata(d1 = {"\u0000Z\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aJ\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a*\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a>\u0010\u001c\u001a\u00020\n*\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\"\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001f\"\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"\"\u0014\u0010%\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u001f\"\u0014\u0010&\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001f\"\u0014\u0010(\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u001f\"\u0014\u0010*\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\u001f\"\u0014\u0010,\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010\u001f\"\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063²\u0006\f\u00101\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u00102\u001a\u00020\u00108\nX\u008a\u0084\u0002"}, d2 = {"", "refreshing", "LA0/g;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "LV0/q0;", "backgroundColor", "contentColor", "scale", "", "d", "(ZLA0/g;Landroidx/compose/ui/Modifier;JJZLandroidx/compose/runtime/Composer;II)V", "color", "b", "(LA0/g;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "", "progress", "LA0/a;", "a", "(F)LA0/a;", "LX0/f;", "LV0/q1;", "arrow", "Landroidx/compose/ui/geometry/Rect;", "bounds", "alpha", "values", "k", "(LX0/f;LV0/q1;Landroidx/compose/ui/geometry/Rect;JFLA0/a;)V", "LH1/h;", "F", "IndicatorSize", "Lr0/h;", "Lr0/h;", "SpinnerShape", "c", "ArcRadius", "StrokeWidth", "e", "ArrowWidth", "f", "ArrowHeight", "g", "Elevation", "Lc0/n0;", "h", "Lc0/n0;", "AlphaTween", "showElevation", "targetAlpha", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final float f15a = H1.h.p(40);

    /* renamed from: b, reason: collision with root package name */
    private static final RoundedCornerShape f16b = C16806i.f();

    /* renamed from: c, reason: collision with root package name */
    private static final float f17c = H1.h.p((float) 7.5d);

    /* renamed from: d, reason: collision with root package name */
    private static final float f18d = H1.h.p((float) 2.5d);

    /* renamed from: e, reason: collision with root package name */
    private static final float f19e = H1.h.p(10);

    /* renamed from: f, reason: collision with root package name */
    private static final float f20f = H1.h.p(5);

    /* renamed from: g, reason: collision with root package name */
    private static final float f21g = H1.h.p(6);

    /* renamed from: h, reason: collision with root package name */
    private static final n0<Float> f22h = C6453j.l(HttpResponseStatus.REDIRECTION_MULTIPLE_CHOICES, 0, C6418E.d(), 2, null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f23f = new a();

        a() {
            super(1);
        }

        public final void a(u uVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class b extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ A0.g f24f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ z1<Float> f25g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f26h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ q1 f27i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(A0.g gVar, z1<Float> z1Var, long j10, q1 q1Var) {
            super(1);
            this.f24f = gVar;
            this.f25g = z1Var;
            this.f26h = j10;
            this.f27i = q1Var;
        }

        public final void a(X0.f fVar) throws Throwable {
            X0.d dVar;
            long j10;
            A0.a aVarA = c.a(this.f24f.j());
            float fFloatValue = this.f25g.getValue().floatValue();
            float rotation = aVarA.getRotation();
            long j11 = this.f26h;
            q1 q1Var = this.f27i;
            long jQ1 = fVar.Q1();
            X0.d drawContext = fVar.getDrawContext();
            long jB = drawContext.b();
            drawContext.g().save();
            try {
                drawContext.getTransform().g(rotation, jQ1);
                float fI1 = fVar.I1(c.f17c) + (fVar.I1(c.f18d) / 2.0f);
                Rect rect = new Rect(U0.f.m(l.b(fVar.b())) - fI1, U0.f.n(l.b(fVar.b())) - fI1, U0.f.m(l.b(fVar.b())) + fI1, U0.f.n(l.b(fVar.b())) + fI1);
                try {
                    try {
                        X0.f.k1(fVar, j11, aVarA.getStartAngle(), aVarA.getEndAngle() - aVarA.getStartAngle(), false, rect.n(), rect.m(), fFloatValue, new Stroke(fVar.I1(c.f18d), 0.0f, F1.INSTANCE.c(), 0, null, 26, null), null, 0, 768, null);
                        c.k(fVar, q1Var, rect, j11, fFloatValue, aVarA);
                        drawContext.g().i();
                        drawContext.h(jB);
                    } catch (Throwable th2) {
                        th = th2;
                        dVar = drawContext;
                        j10 = jB;
                        dVar.g().i();
                        dVar.h(j10);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    j10 = jB;
                    dVar = drawContext;
                }
            } catch (Throwable th4) {
                th = th4;
                dVar = drawContext;
                j10 = jB;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) throws Throwable {
            a(fVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: A0.c$c, reason: collision with other inner class name */
    static final class C0000c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ A0.g f28f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f29g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f30h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f31i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0000c(A0.g gVar, long j10, Modifier modifier, int i10) {
            super(2);
            this.f28f = gVar;
            this.f29g = j10;
            this.f30h = modifier;
            this.f31i = i10;
        }

        public final void a(Composer composer, int i10) {
            c.b(this.f28f, this.f29g, this.f30h, composer, J0.a(this.f31i | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function0<Float> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ A0.g f32f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(A0.g gVar) {
            super(0);
            this.f32f = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(this.f32f.j() < 1.0f ? 0.3f : 1.0f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "refreshing", "", "a", "(ZLandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class e extends Lambda implements Function3<Boolean, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f33f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ A0.g f34g;

        public final void a(boolean z10, Composer composer, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.a(z10) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if (!composer.p((i11 & 19) != 18, i11 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(1853731063, i11, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator.<anonymous>.<anonymous> (PullRefreshIndicator.kt:104)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierF = J.f(companion, 0.0f, 1, null);
            P0.e eVarE = P0.e.INSTANCE.e();
            long j10 = this.f33f;
            A0.g gVar = this.f34g;
            MeasurePolicy measurePolicyG = C5804h.g(eVarE, false);
            int iA = C5859f.a(composer, 0);
            InterfaceC5884s interfaceC5884sR = composer.r();
            Modifier modifierE = androidx.compose.ui.b.e(composer, modifierF);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
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
            D1.c(composerA, measurePolicyG, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            C5806j c5806j = C5806j.f48836a;
            float fP = H1.h.p(H1.h.p(c.f17c + c.f18d) * 2);
            if (z10) {
                composer.startReplaceGroup(-1566007818);
                C17972T0.a(J.v(companion, fP), j10, c.f18d, 0L, 0, composer, 390, 24);
                composer.P();
            } else {
                composer.startReplaceGroup(-1565760097);
                c.b(gVar, j10, J.v(companion, fP), composer, 384);
                composer.P();
            }
            composer.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, A0.g gVar) {
            super(3);
            this.f33f = j10;
            this.f34g = gVar;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Composer composer, Integer num) {
            a(bool.booleanValue(), composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f35f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ A0.g f36g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Modifier f37h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f38i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ long f39j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f40k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f41l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f42m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(boolean z10, A0.g gVar, Modifier modifier, long j10, long j11, boolean z11, int i10, int i11) {
            super(2);
            this.f35f = z10;
            this.f36g = gVar;
            this.f37h = modifier;
            this.f38i = j10;
            this.f39j = j11;
            this.f40k = z11;
            this.f41l = i10;
            this.f42m = i11;
        }

        public final void a(Composer composer, int i10) {
            c.d(this.f35f, this.f36g, this.f37h, this.f38i, this.f39j, this.f40k, composer, J0.a(this.f41l | 1), this.f42m);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "c", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    static final class g extends Lambda implements Function0<Boolean> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f43f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ A0.g f44g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(boolean z10, A0.g gVar) {
            super(0);
            this.f43f = z10;
            this.f44g = gVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(this.f43f || this.f44g.i() > 0.5f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final A0.a a(float f10) {
        float fMax = (Math.max(Math.min(1.0f, f10) - 0.4f, 0.0f) * 5) / 3;
        float fAbs = Math.abs(f10) - 1.0f;
        float f11 = fAbs >= 0.0f ? fAbs : 0.0f;
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        float fPow = (((0.4f * fMax) - 0.25f) + (f11 - (((float) Math.pow(f11, 2)) / 4))) * 0.5f;
        float f12 = 360;
        return new A0.a(fPow, fPow * f12, ((0.8f * fMax) + fPow) * f12, Math.min(1.0f, fMax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(A0.g gVar, long j10, Modifier modifier, Composer composer, int i10) {
        int i11;
        int i12;
        Composer composerStartRestartGroup = composer.startRestartGroup(-486016981);
        if ((i10 & 6) == 0) {
            i11 = (composerStartRestartGroup.D(gVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= composerStartRestartGroup.e(j10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= composerStartRestartGroup.V(modifier) ? 256 : 128;
        }
        if (composerStartRestartGroup.p((i11 & 147) != 146, i11 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(-486016981, i11, -1, "androidx.compose.material.pullrefresh.CircularArrowIndicator (PullRefreshIndicator.kt:128)");
            }
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            Object obj = objB;
            if (objB == companion.a()) {
                q1 q1VarA = W.a();
                q1VarA.g(s1.INSTANCE.a());
                composerStartRestartGroup.t(q1VarA);
                obj = q1VarA;
            }
            q1 q1Var = (q1) obj;
            boolean zV = composerStartRestartGroup.V(gVar);
            Object objB2 = composerStartRestartGroup.B();
            if (zV || objB2 == companion.a()) {
                objB2 = o1.e(new d(gVar));
                composerStartRestartGroup.t(objB2);
            }
            boolean z10 = true;
            z1<Float> z1VarD = C6443c.d(c((z1) objB2), f22h, 0.0f, null, null, composerStartRestartGroup, 48, 28);
            Modifier modifierD = C16819m.d(modifier, false, a.f23f, 1, null);
            boolean zD = composerStartRestartGroup.D(gVar) | composerStartRestartGroup.V(z1VarD);
            if ((i11 & 112) != 32) {
                z10 = false;
            }
            boolean zD2 = zD | z10 | composerStartRestartGroup.D(q1Var);
            Object objB3 = composerStartRestartGroup.B();
            if (zD2 || objB3 == companion.a()) {
                i12 = 0;
                b bVar = new b(gVar, z1VarD, j10, q1Var);
                composerStartRestartGroup.t(bVar);
                objB3 = bVar;
            } else {
                i12 = 0;
            }
            C13576j.a(modifierD, (Function1) objB3, composerStartRestartGroup, i12);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new C0000c(gVar, j10, modifier, i10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(boolean r32, A0.g r33, androidx.compose.ui.Modifier r34, long r35, long r37, boolean r39, androidx.compose.runtime.Composer r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 657
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: A0.c.d(boolean, A0.g, androidx.compose.ui.Modifier, long, long, boolean, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final float c(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }

    private static final boolean e(z1<Boolean> z1Var) {
        return z1Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(X0.f fVar, q1 q1Var, Rect rect, long j10, float f10, A0.a aVar) {
        q1Var.reset();
        q1Var.r(0.0f, 0.0f);
        float f11 = f19e;
        q1Var.u(fVar.I1(f11) * aVar.getScale(), 0.0f);
        q1Var.u((fVar.I1(f11) * aVar.getScale()) / 2, fVar.I1(f20f) * aVar.getScale());
        q1Var.k(U0.g.a(((Math.min(rect.getWidth(), rect.getHeight()) / 2.0f) + U0.f.m(rect.k())) - ((fVar.I1(f11) * aVar.getScale()) / 2.0f), U0.f.n(rect.k()) + (fVar.I1(f18d) / 2.0f)));
        q1Var.close();
        float endAngle = aVar.getEndAngle();
        long jQ1 = fVar.Q1();
        X0.d drawContext = fVar.getDrawContext();
        long jB = drawContext.b();
        drawContext.g().save();
        try {
            drawContext.getTransform().g(endAngle, jQ1);
            X0.f.W1(fVar, q1Var, j10, f10, null, null, 0, 56, null);
        } finally {
            drawContext.g().i();
            drawContext.h(jB);
        }
    }
}
