package kotlin;

import H1.t;
import V0.C5489q0;
import V0.F1;
import X0.Stroke;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.z1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.f0;
import d0.C13576j;
import d0.Q;
import kotlin.C6426M;
import kotlin.C6427N;
import kotlin.C6428O;
import kotlin.C6430Q;
import kotlin.C6453j;
import kotlin.CubicBezierEasing;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import r1.C16819m;
import r1.u;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001aD\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a:\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a>\u0010\u0014\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a.\u0010\u0016\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001aD\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00182\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a6\u0010\u001f\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a&\u0010!\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a>\u0010#\u001a\u00020\u000b*\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002ø\u0001\u0000¢\u0006\u0004\b#\u0010$\"\u0014\u0010%\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014\"\u0014\u0010'\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0014\"\u0014\u0010)\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0014\"\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,\"\u0014\u0010/\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010,\"\u0014\u00100\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010,\"\u0014\u00101\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010,\"\u0014\u00103\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006<²\u0006\f\u00104\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\f\u00105\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\f\u00106\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\f\u00107\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\f\u00109\u001a\u0002088\nX\u008a\u0084\u0002²\u0006\f\u0010:\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\f\u0010;\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\f\u0010\u001b\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "H", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "", "progress", "modifier", "LV0/q0;", "color", "backgroundColor", "LV0/F1;", "strokeCap", "", "g", "(FLandroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "f", "(Landroidx/compose/ui/Modifier;JJILandroidx/compose/runtime/Composer;II)V", "LX0/f;", "startFraction", "endFraction", "strokeWidth", "F", "(LX0/f;FFJFI)V", "G", "(LX0/f;JFI)V", "LH1/h;", "a", "(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V", "startAngle", "sweep", "LX0/k;", "stroke", "C", "(LX0/f;FFJLX0/k;)V", "D", "(LX0/f;JLX0/k;)V", "E", "(LX0/f;FFFJLX0/k;)V", "LinearIndicatorHeight", "b", "LinearIndicatorWidth", "c", "CircularIndicatorDiameter", "Lc0/w;", "d", "Lc0/w;", "FirstLineHeadEasing", "e", "FirstLineTailEasing", "SecondLineHeadEasing", "SecondLineTailEasing", "h", "CircularEasing", "firstLineHead", "firstLineTail", "secondLineHead", "secondLineTail", "", "currentRotation", "baseRotation", "endAngle", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.T0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17972T0 {

    /* renamed from: a, reason: collision with root package name */
    private static final float f168517a = C17970S0.f168497a.a();

    /* renamed from: b, reason: collision with root package name */
    private static final float f168518b = H1.h.p(240);

    /* renamed from: c, reason: collision with root package name */
    private static final float f168519c = H1.h.p(40);

    /* renamed from: d, reason: collision with root package name */
    private static final CubicBezierEasing f168520d = new CubicBezierEasing(0.2f, 0.0f, 0.8f, 1.0f);

    /* renamed from: e, reason: collision with root package name */
    private static final CubicBezierEasing f168521e = new CubicBezierEasing(0.4f, 0.0f, 1.0f, 1.0f);

    /* renamed from: f, reason: collision with root package name */
    private static final CubicBezierEasing f168522f = new CubicBezierEasing(0.0f, 0.0f, 0.65f, 1.0f);

    /* renamed from: g, reason: collision with root package name */
    private static final CubicBezierEasing f168523g = new CubicBezierEasing(0.1f, 0.0f, 0.45f, 1.0f);

    /* renamed from: h, reason: collision with root package name */
    private static final CubicBezierEasing f168524h = new CubicBezierEasing(0.4f, 0.0f, 0.2f, 1.0f);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.T0$a */
    static final class a extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f168525f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Stroke f168526g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f168527h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f168528i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ z1<Integer> f168529j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ z1<Float> f168530k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ z1<Float> f168531l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ z1<Float> f168532m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j10, Stroke stroke, float f10, long j11, z1<Integer> z1Var, z1<Float> z1Var2, z1<Float> z1Var3, z1<Float> z1Var4) {
            super(1);
            this.f168525f = j10;
            this.f168526g = stroke;
            this.f168527h = f10;
            this.f168528i = j11;
            this.f168529j = z1Var;
            this.f168530k = z1Var2;
            this.f168531l = z1Var3;
            this.f168532m = z1Var4;
        }

        public final void a(X0.f fVar) {
            C17972T0.D(fVar, this.f168525f, this.f168526g);
            C17972T0.E(fVar, C17972T0.d(this.f168531l) + (((C17972T0.e(this.f168529j) * 216.0f) % 360.0f) - 90.0f) + C17972T0.b(this.f168532m), this.f168527h, Math.abs(C17972T0.c(this.f168530k) - C17972T0.d(this.f168531l)), this.f168528i, this.f168526g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.T0$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f168533f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f168534g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f168535h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f168536i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f168537j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f168538k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f168539l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Modifier modifier, long j10, float f10, long j11, int i10, int i11, int i12) {
            super(2);
            this.f168533f = modifier;
            this.f168534g = j10;
            this.f168535h = f10;
            this.f168536i = j11;
            this.f168537j = i10;
            this.f168538k = i11;
            this.f168539l = i12;
        }

        public final void a(Composer composer, int i10) {
            C17972T0.a(this.f168533f, this.f168534g, this.f168535h, this.f168536i, this.f168537j, composer, J0.a(this.f168538k | 1), this.f168539l);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/Q$b;", "", "", "a", "(Lc0/Q$b;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.T0$c */
    static final class c extends Lambda implements Function1<C6430Q.b<Float>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f168540f = new c();

        c() {
            super(1);
        }

        public final void a(C6430Q.b<Float> bVar) {
            bVar.d(1332);
            bVar.e(bVar.f(Float.valueOf(0.0f), 0), C17972T0.f168524h);
            bVar.f(Float.valueOf(290.0f), 666);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C6430Q.b<Float> bVar) {
            a(bVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/Q$b;", "", "", "a", "(Lc0/Q$b;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.T0$d */
    static final class d extends Lambda implements Function1<C6430Q.b<Float>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f168541f = new d();

        d() {
            super(1);
        }

        public final void a(C6430Q.b<Float> bVar) {
            bVar.d(1332);
            bVar.e(bVar.f(Float.valueOf(0.0f), 666), C17972T0.f168524h);
            bVar.f(Float.valueOf(290.0f), bVar.getDurationMillis());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C6430Q.b<Float> bVar) {
            a(bVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.T0$e */
    static final class e extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f168542f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f168543g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f168544h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f168545i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(long j10, int i10, float f10, long j11) {
            super(1);
            this.f168542f = j10;
            this.f168543g = i10;
            this.f168544h = f10;
            this.f168545i = j11;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f143329a;
        }

        public final void a(X0.f fVar) {
            float fG = U0.k.g(fVar.b());
            C17972T0.G(fVar, this.f168542f, fG, this.f168543g);
            C17972T0.F(fVar, 0.0f, this.f168544h, this.f168545i, fG, this.f168543g);
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.T0$f */
    static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f168546f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f168547g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f168548h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f168549i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f168550j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f168551k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f168552l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(float f10, Modifier modifier, long j10, long j11, int i10, int i11, int i12) {
            super(2);
            this.f168546f = f10;
            this.f168547g = modifier;
            this.f168548h = j10;
            this.f168549i = j11;
            this.f168550j = i10;
            this.f168551k = i11;
            this.f168552l = i12;
        }

        public final void a(Composer composer, int i10) {
            C17972T0.g(this.f168546f, this.f168547g, this.f168548h, this.f168549i, this.f168550j, composer, J0.a(this.f168551k | 1), this.f168552l);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LX0/f;", "", "a", "(LX0/f;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.T0$g */
    static final class g extends Lambda implements Function1<X0.f, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f168553f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f168554g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f168555h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ z1<Float> f168556i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ z1<Float> f168557j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ z1<Float> f168558k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ z1<Float> f168559l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j10, int i10, long j11, z1<Float> z1Var, z1<Float> z1Var2, z1<Float> z1Var3, z1<Float> z1Var4) {
            super(1);
            this.f168553f = j10;
            this.f168554g = i10;
            this.f168555h = j11;
            this.f168556i = z1Var;
            this.f168557j = z1Var2;
            this.f168558k = z1Var3;
            this.f168559l = z1Var4;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(X0.f fVar) {
            a(fVar);
            return Unit.f143329a;
        }

        public final void a(X0.f fVar) {
            X0.f fVar2;
            float fG = U0.k.g(fVar.b());
            C17972T0.G(fVar, this.f168553f, fG, this.f168554g);
            if (C17972T0.h(this.f168556i) - C17972T0.i(this.f168557j) > 0.0f) {
                fVar2 = fVar;
                C17972T0.F(fVar2, C17972T0.h(this.f168556i), C17972T0.i(this.f168557j), this.f168555h, fG, this.f168554g);
            } else {
                fVar2 = fVar;
            }
            if (C17972T0.j(this.f168558k) - C17972T0.k(this.f168559l) > 0.0f) {
                C17972T0.F(fVar2, C17972T0.j(this.f168558k), C17972T0.k(this.f168559l), this.f168555h, fG, this.f168554g);
            }
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.T0$h */
    static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f168560f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f168561g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f168562h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f168563i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f168564j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f168565k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Modifier modifier, long j10, long j11, int i10, int i11, int i12) {
            super(2);
            this.f168560f = modifier;
            this.f168561g = j10;
            this.f168562h = j11;
            this.f168563i = i10;
            this.f168564j = i11;
            this.f168565k = i12;
        }

        public final void a(Composer composer, int i10) {
            C17972T0.f(this.f168560f, this.f168561g, this.f168562h, this.f168563i, composer, J0.a(this.f168564j | 1), this.f168565k);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/Q$b;", "", "", "a", "(Lc0/Q$b;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.T0$i */
    static final class i extends Lambda implements Function1<C6430Q.b<Float>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final i f168566f = new i();

        i() {
            super(1);
        }

        public final void a(C6430Q.b<Float> bVar) {
            bVar.d(1800);
            bVar.e(bVar.f(Float.valueOf(0.0f), 0), C17972T0.f168520d);
            bVar.f(Float.valueOf(1.0f), 750);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C6430Q.b<Float> bVar) {
            a(bVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/Q$b;", "", "", "a", "(Lc0/Q$b;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.T0$j */
    static final class j extends Lambda implements Function1<C6430Q.b<Float>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final j f168567f = new j();

        j() {
            super(1);
        }

        public final void a(C6430Q.b<Float> bVar) {
            bVar.d(1800);
            bVar.e(bVar.f(Float.valueOf(0.0f), 333), C17972T0.f168521e);
            bVar.f(Float.valueOf(1.0f), 1183);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C6430Q.b<Float> bVar) {
            a(bVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/Q$b;", "", "", "a", "(Lc0/Q$b;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.T0$k */
    static final class k extends Lambda implements Function1<C6430Q.b<Float>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final k f168568f = new k();

        k() {
            super(1);
        }

        public final void a(C6430Q.b<Float> bVar) {
            bVar.d(1800);
            bVar.e(bVar.f(Float.valueOf(0.0f), 1000), C17972T0.f168522f);
            bVar.f(Float.valueOf(1.0f), 1567);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C6430Q.b<Float> bVar) {
            a(bVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc0/Q$b;", "", "", "a", "(Lc0/Q$b;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.T0$l */
    static final class l extends Lambda implements Function1<C6430Q.b<Float>, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final l f168569f = new l();

        l() {
            super(1);
        }

        public final void a(C6430Q.b<Float> bVar) {
            bVar.d(1800);
            bVar.e(bVar.f(Float.valueOf(0.0f), 1267), C17972T0.f168523g);
            bVar.f(Float.valueOf(1.0f), 1800);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(C6430Q.b<Float> bVar) {
            a(bVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.T0$m */
    static final class m extends Lambda implements Function3<K, I, H1.b, J> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f168570f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.T0$m$a */
        static final class a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ f0 f168571f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f168572g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f0 f0Var, int i10) {
                super(1);
                this.f168571f = f0Var;
                this.f168572g = i10;
            }

            public final void a(f0.a aVar) {
                f0.a.h(aVar, this.f168571f, 0, -this.f168572g, 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(float f10) {
            super(3);
            this.f168570f = f10;
        }

        public final J a(K k10, I i10, long j10) {
            int iE0 = k10.E0(this.f168570f);
            int i11 = iE0 * 2;
            f0 f0VarK0 = i10.k0(H1.c.i(j10, 0, i11));
            return K.G0(k10, f0VarK0.getWidth(), f0VarK0.getHeight() - i11, null, new a(f0VarK0, iE0), 4, null);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ J invoke(K k10, I i10, H1.b bVar) {
            return a(k10, i10, bVar.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.T0$n */
    static final class n extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final n f168573f = new n();

        n() {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(X0.f fVar, long j10, Stroke stroke) {
        C(fVar, 0.0f, 360.0f, j10, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(X0.f fVar, long j10, float f10, int i10) {
        F(fVar, 0.0f, 1.0f, j10, f10, i10);
    }

    public static final Modifier H(Modifier modifier) {
        float fP = H1.h.p(10);
        return D.k(C16819m.c(androidx.compose.ui.layout.D.a(modifier, new m(fP)), true, n.f168573f), 0.0f, fP, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0253  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r30, long r31, float r33, long r34, int r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17972T0.a(androidx.compose.ui.Modifier, long, float, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void f(Modifier modifier, long j10, long j11, int i10, Composer composer, int i11, int i12) {
        Modifier modifier2;
        int i13;
        long j12;
        long j13;
        int iA;
        Modifier modifier3;
        int i14;
        long j14;
        long j15;
        Modifier modifier4;
        long jQ;
        int i15;
        long j16;
        long j17;
        long j18;
        int i16;
        long j19;
        Composer composerStartRestartGroup = composer.startRestartGroup(1501635280);
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 6;
            modifier2 = modifier;
        } else if ((i11 & 6) == 0) {
            modifier2 = modifier;
            i13 = (composerStartRestartGroup.V(modifier2) ? 4 : 2) | i11;
        } else {
            modifier2 = modifier;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            j12 = j10;
            i13 |= ((i12 & 2) == 0 && composerStartRestartGroup.e(j12)) ? 32 : 16;
        } else {
            j12 = j10;
        }
        if ((i11 & 384) == 0) {
            j13 = j11;
            i13 |= ((i12 & 4) == 0 && composerStartRestartGroup.e(j13)) ? 256 : 128;
        } else {
            j13 = j11;
        }
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                iA = i10;
                int i18 = composerStartRestartGroup.d(iA) ? 2048 : 1024;
                i13 |= i18;
            } else {
                iA = i10;
            }
            i13 |= i18;
        } else {
            iA = i10;
        }
        if (composerStartRestartGroup.p((i13 & 1171) != 1170, i13 & 1)) {
            composerStartRestartGroup.E();
            if ((i11 & 1) == 0 || composerStartRestartGroup.N()) {
                modifier4 = i17 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i12 & 2) != 0) {
                    j12 = C17943E0.f167967a.a(composerStartRestartGroup, 6).j();
                    i13 &= -113;
                }
                long j20 = j12;
                if ((i12 & 4) != 0) {
                    jQ = C5489q0.q(j20, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    i13 &= -897;
                } else {
                    jQ = j13;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    iA = F1.INSTANCE.a();
                }
                long j21 = jQ;
                i15 = i13;
                j16 = j20;
                j17 = j21;
            } else {
                composerStartRestartGroup.K();
                if ((i12 & 2) != 0) {
                    i13 &= -113;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                }
                modifier4 = modifier2;
                j17 = j13;
                long j22 = j12;
                i15 = i13;
                j16 = j22;
            }
            composerStartRestartGroup.w();
            if (ComposerKt.M()) {
                ComposerKt.U(1501635280, i15, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:144)");
            }
            C6427N c6427nC = C6428O.c(null, composerStartRestartGroup, 0, 1);
            C6426M c6426mE = C6453j.e(C6453j.f(i.f168566f), null, 0L, 6, null);
            int i19 = C6427N.f60709f;
            int i20 = C6426M.f60705d;
            int i21 = i15;
            Modifier modifier5 = modifier4;
            long j23 = j17;
            z1<Float> z1VarA = C6428O.a(c6427nC, 0.0f, 1.0f, c6426mE, null, composerStartRestartGroup, (i20 << 9) | i19 | 432, 8);
            z1<Float> z1VarA2 = C6428O.a(c6427nC, 0.0f, 1.0f, C6453j.e(C6453j.f(j.f168567f), null, 0L, 6, null), null, composerStartRestartGroup, i19 | 432 | (i20 << 9), 8);
            z1<Float> z1VarA3 = C6428O.a(c6427nC, 0.0f, 1.0f, C6453j.e(C6453j.f(k.f168568f), null, 0L, 6, null), null, composerStartRestartGroup, i19 | 432 | (i20 << 9), 8);
            z1<Float> z1VarA4 = C6428O.a(c6427nC, 0.0f, 1.0f, C6453j.e(C6453j.f(l.f168569f), null, 0L, 6, null), null, composerStartRestartGroup, i19 | 432 | (i20 << 9), 8);
            Modifier modifierW = androidx.compose.foundation.layout.J.w(Q.a(H(modifier5)), f168518b, f168517a);
            boolean zV = ((((i21 & 7168) ^ 3072) > 2048 && composerStartRestartGroup.d(iA)) || (i21 & 3072) == 2048) | ((((i21 & 896) ^ 384) > 256 && composerStartRestartGroup.e(j23)) || (i21 & 384) == 256) | composerStartRestartGroup.V(z1VarA) | composerStartRestartGroup.V(z1VarA2) | ((((i21 & 112) ^ 48) > 32 && composerStartRestartGroup.e(j16)) || (i21 & 48) == 32) | composerStartRestartGroup.V(z1VarA3) | composerStartRestartGroup.V(z1VarA4);
            Object objB = composerStartRestartGroup.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                j18 = j16;
                i16 = iA;
                j19 = j23;
                objB = new g(j19, i16, j18, z1VarA, z1VarA2, z1VarA3, z1VarA4);
                composerStartRestartGroup.t(objB);
            } else {
                j18 = j16;
                i16 = iA;
                j19 = j23;
            }
            C13576j.a(modifierW, (Function1) objB, composerStartRestartGroup, 0);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
            modifier3 = modifier5;
            j15 = j19;
            i14 = i16;
            j14 = j18;
        } else {
            composerStartRestartGroup.K();
            modifier3 = modifier2;
            i14 = iA;
            j14 = j12;
            j15 = j13;
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new h(modifier3, j14, j15, i14, i11, i12));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(float r25, androidx.compose.ui.Modifier r26, long r27, long r29, int r31, androidx.compose.runtime.Composer r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17972T0.g(float, androidx.compose.ui.Modifier, long, long, int, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final void C(X0.f fVar, float f10, float f11, long j10, Stroke stroke) {
        float f12 = 2;
        float width = stroke.getWidth() / f12;
        float fI = U0.k.i(fVar.b()) - (f12 * width);
        X0.f.k1(fVar, j10, f10, f11, false, U0.g.a(width, width), U0.l.a(fI, fI), 0.0f, stroke, null, 0, 832, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(X0.f fVar, float f10, float f11, float f12, long j10, Stroke stroke) {
        float fP;
        if (F1.e(stroke.getCap(), F1.INSTANCE.a())) {
            fP = 0.0f;
        } else {
            fP = ((f11 / H1.h.p(f168519c / 2)) * 57.29578f) / 2.0f;
        }
        C(fVar, f10 + fP, Math.max(f12, 0.1f), j10, stroke);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(X0.f fVar, float f10, float f11, long j10, float f12, int i10) {
        boolean z10;
        float f13;
        float f14;
        float fI = U0.k.i(fVar.b());
        float fG = U0.k.g(fVar.b());
        float f15 = 2;
        float f16 = fG / f15;
        if (fVar.getLayoutDirection() == t.f13338a) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f13 = f10;
        } else {
            f13 = 1.0f - f11;
        }
        float f17 = f13 * fI;
        if (z10) {
            f14 = f11;
        } else {
            f14 = 1.0f - f10;
        }
        float f18 = f14 * fI;
        if (!F1.e(i10, F1.INSTANCE.a()) && fG <= fI) {
            float f19 = f12 / f15;
            ClosedFloatingPointRange<Float> closedFloatingPointRangeB = RangesKt.b(f19, fI - f19);
            float fFloatValue = ((Number) RangesKt.r(Float.valueOf(f17), closedFloatingPointRangeB)).floatValue();
            float fFloatValue2 = ((Number) RangesKt.r(Float.valueOf(f18), closedFloatingPointRangeB)).floatValue();
            if (Math.abs(f11 - f10) > 0.0f) {
                X0.f.O0(fVar, j10, U0.g.a(fFloatValue, f16), U0.g.a(fFloatValue2, f16), f12, i10, null, 0.0f, null, 0, 480, null);
                return;
            }
            return;
        }
        X0.f.O0(fVar, j10, U0.g.a(f17, f16), U0.g.a(f18, f16), f12, 0, null, 0.0f, null, 0, 496, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(z1<Integer> z1Var) {
        return z1Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float h(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float i(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float k(z1<Float> z1Var) {
        return z1Var.getValue().floatValue();
    }
}
