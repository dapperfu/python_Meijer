package kotlin;

import H1.t;
import V0.D1;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.F0;
import androidx.compose.runtime.G0;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.r;
import androidx.compose.runtime.t1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.layout.p0;
import androidx.compose.ui.layout.r0;
import androidx.recyclerview.widget.RecyclerView;
import j0.C14896Q;
import j0.InterfaceC14882C;
import j0.InterfaceC14894O;
import j0.InterfaceC14902f;
import j0.S;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a#\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0089\u0002\u0010'\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u001b\b\u0002\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020\u001f2\b\b\u0002\u0010#\u001a\u00020\u001f2\b\b\u0002\u0010$\u001a\u00020\u001f2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\r0\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\u0081\u0002\u0010)\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u001b\b\u0002\u0010\u0019\u001a\u0015\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00152\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020\u001f2\b\b\u0002\u0010#\u001a\u00020\u001f2\b\b\u0002\u0010$\u001a\u00020\u001f2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\r0\u0010H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001av\u0010/\u001a\u00020\r2\u0006\u0010+\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00132\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\r0\u00102\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0003ø\u0001\u0000¢\u0006\u0004\b/\u00100\"\"\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u000102018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u00103\u001a\u0004\b4\u00105\"\u0014\u00108\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00107\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00069"}, d2 = {"Lx0/e0;", "drawerState", "Lx0/o1;", "snackbarHostState", "Lx0/c1;", "g", "(Lx0/e0;Lx0/o1;Landroidx/compose/runtime/Composer;II)Lx0/c1;", "Lj0/O;", "contentWindowInsets", "Landroidx/compose/ui/Modifier;", "modifier", "scaffoldState", "Lkotlin/Function0;", "", "topBar", "bottomBar", "Lkotlin/Function1;", "snackbarHost", "floatingActionButton", "Lx0/p0;", "floatingActionButtonPosition", "", "isFloatingActionButtonDocked", "Lj0/f;", "Lkotlin/ExtensionFunctionType;", "drawerContent", "drawerGesturesEnabled", "LV0/D1;", "drawerShape", "LH1/h;", "drawerElevation", "LV0/q0;", "drawerBackgroundColor", "drawerContentColor", "drawerScrimColor", "backgroundColor", "contentColor", "Lj0/C;", "content", "b", "(Lj0/O;Landroidx/compose/ui/Modifier;Lx0/c1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLV0/D1;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "a", "(Landroidx/compose/ui/Modifier;Lx0/c1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;IZLkotlin/jvm/functions/Function3;ZLV0/D1;FJJJJJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "isFabDocked", "fabPosition", "snackbar", "fab", "c", "(ZILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lj0/O;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/F0;", "Lx0/o0;", "Landroidx/compose/runtime/F0;", "f", "()Landroidx/compose/runtime/F0;", "LocalFabPlacement", "F", "FabSpacing", "material_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17987a1 {

    /* renamed from: a, reason: collision with root package name */
    private static final F0<C18028o0> f168688a = r.f(a.f168690f);

    /* renamed from: b, reason: collision with root package name */
    private static final float f168689b = H1.h.p(16);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx0/o0;", "c", "()Lx0/o0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.a1$a */
    static final class a extends Lambda implements Function0<C18028o0> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f168690f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C18028o0 invoke() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.a1$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function3<Modifier, Composer, Integer, Unit> f168691f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f168691f = function3;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1409196448, i10, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:235)");
            }
            this.f168691f.invoke(Modifier.INSTANCE, composer, 54);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.a1$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: A, reason: collision with root package name */
        final /* synthetic */ int f168692A;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC14894O f168693f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f168694g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C17993c1 f168695h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168696i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168697j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function3<C18029o1, Composer, Integer, Unit> f168698k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168699l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f168700m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f168701n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14902f, Composer, Integer, Unit> f168702o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f168703p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ D1 f168704q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ float f168705r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ long f168706s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f168707t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ long f168708u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ long f168709v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ long f168710w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14882C, Composer, Integer, Unit> f168711x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f168712y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ int f168713z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(InterfaceC14894O interfaceC14894O, Modifier modifier, C17993c1 c17993c1, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super C18029o1, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function23, int i10, boolean z10, Function3<? super InterfaceC14902f, ? super Composer, ? super Integer, Unit> function32, boolean z11, D1 d12, float f10, long j10, long j11, long j12, long j13, long j14, Function3<? super InterfaceC14882C, ? super Composer, ? super Integer, Unit> function33, int i11, int i12, int i13) {
            super(2);
            this.f168693f = interfaceC14894O;
            this.f168694g = modifier;
            this.f168695h = c17993c1;
            this.f168696i = function2;
            this.f168697j = function22;
            this.f168698k = function3;
            this.f168699l = function23;
            this.f168700m = i10;
            this.f168701n = z10;
            this.f168702o = function32;
            this.f168703p = z11;
            this.f168704q = d12;
            this.f168705r = f10;
            this.f168706s = j10;
            this.f168707t = j11;
            this.f168708u = j12;
            this.f168709v = j13;
            this.f168710w = j14;
            this.f168711x = function33;
            this.f168712y = i11;
            this.f168713z = i12;
            this.f168692A = i13;
        }

        public final void a(Composer composer, int i10) {
            C17987a1.b(this.f168693f, this.f168694g, this.f168695h, this.f168696i, this.f168697j, this.f168698k, this.f168699l, this.f168700m, this.f168701n, this.f168702o, this.f168703p, this.f168704q, this.f168705r, this.f168706s, this.f168707t, this.f168708u, this.f168709v, this.f168710w, this.f168711x, composer, J0.a(this.f168712y | 1), J0.a(this.f168713z), this.f168692A);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.a1$d */
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f168714f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C17993c1 f168715g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168716h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168717i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function3<C18029o1, Composer, Integer, Unit> f168718j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168719k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f168720l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f168721m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14902f, Composer, Integer, Unit> f168722n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f168723o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ D1 f168724p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ float f168725q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f168726r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ long f168727s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f168728t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ long f168729u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ long f168730v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14882C, Composer, Integer, Unit> f168731w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f168732x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f168733y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ int f168734z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Modifier modifier, C17993c1 c17993c1, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super C18029o1, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function23, int i10, boolean z10, Function3<? super InterfaceC14902f, ? super Composer, ? super Integer, Unit> function32, boolean z11, D1 d12, float f10, long j10, long j11, long j12, long j13, long j14, Function3<? super InterfaceC14882C, ? super Composer, ? super Integer, Unit> function33, int i11, int i12, int i13) {
            super(2);
            this.f168714f = modifier;
            this.f168715g = c17993c1;
            this.f168716h = function2;
            this.f168717i = function22;
            this.f168718j = function3;
            this.f168719k = function23;
            this.f168720l = i10;
            this.f168721m = z10;
            this.f168722n = function32;
            this.f168723o = z11;
            this.f168724p = d12;
            this.f168725q = f10;
            this.f168726r = j10;
            this.f168727s = j11;
            this.f168728t = j12;
            this.f168729u = j13;
            this.f168730v = j14;
            this.f168731w = function33;
            this.f168732x = i11;
            this.f168733y = i12;
            this.f168734z = i13;
        }

        public final void a(Composer composer, int i10) {
            C17987a1.a(this.f168714f, this.f168715g, this.f168716h, this.f168717i, this.f168718j, this.f168719k, this.f168720l, this.f168721m, this.f168722n, this.f168723o, this.f168724p, this.f168725q, this.f168726r, this.f168727s, this.f168728t, this.f168729u, this.f168730v, this.f168731w, composer, J0.a(this.f168732x | 1), J0.a(this.f168733y), this.f168734z);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/Modifier;", "childModifier", "", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.a1$e */
    static final class e extends Lambda implements Function3<Modifier, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17963O0 f168735f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC14894O f168736g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f168737h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f168738i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f168739j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f168740k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168741l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14882C, Composer, Integer, Unit> f168742m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168743n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168744o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Function3<C18029o1, Composer, Integer, Unit> f168745p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ C17993c1 f168746q;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj0/O;", "consumedWindowInsets", "", "a", "(Lj0/O;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.a1$e$a */
        static final class a extends Lambda implements Function1<InterfaceC14894O, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17963O0 f168747f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC14894O f168748g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C17963O0 c17963o0, InterfaceC14894O interfaceC14894O) {
                super(1);
                this.f168747f = c17963o0;
                this.f168748g = interfaceC14894O;
            }

            public final void a(InterfaceC14894O interfaceC14894O) {
                this.f168747f.f(C14896Q.f(this.f168748g, interfaceC14894O));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14894O interfaceC14894O) {
                a(interfaceC14894O);
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.a1$e$b */
        static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f168749f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f168750g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f168751h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC14882C, Composer, Integer, Unit> f168752i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f168753j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ C17963O0 f168754k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f168755l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ Function3<C18029o1, Composer, Integer, Unit> f168756m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ C17993c1 f168757n;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: x0.a1$e$b$a */
            static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function3<C18029o1, Composer, Integer, Unit> f168758f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ C17993c1 f168759g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                a(Function3<? super C18029o1, ? super Composer, ? super Integer, Unit> function3, C17993c1 c17993c1) {
                    super(2);
                    this.f168758f = function3;
                    this.f168759g = c17993c1;
                }

                public final void a(Composer composer, int i10) {
                    if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(433906483, i10, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:217)");
                    }
                    this.f168758f.invoke(this.f168759g.getSnackbarHostState(), composer, 0);
                    if (ComposerKt.M()) {
                        ComposerKt.T();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    a(composer, num.intValue());
                    return Unit.f143329a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(boolean z10, int i10, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super InterfaceC14882C, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, C17963O0 c17963o0, Function2<? super Composer, ? super Integer, Unit> function23, Function3<? super C18029o1, ? super Composer, ? super Integer, Unit> function32, C17993c1 c17993c1) {
                super(2);
                this.f168749f = z10;
                this.f168750g = i10;
                this.f168751h = function2;
                this.f168752i = function3;
                this.f168753j = function22;
                this.f168754k = c17963o0;
                this.f168755l = function23;
                this.f168756m = function32;
                this.f168757n = c17993c1;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1772955108, i10, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:211)");
                }
                C17987a1.c(this.f168749f, this.f168750g, this.f168751h, this.f168752i, ComposableLambdaKt.c(433906483, true, new a(this.f168756m, this.f168757n), composer, 54), this.f168753j, this.f168754k, this.f168755l, composer, 24576);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(C17963O0 c17963o0, InterfaceC14894O interfaceC14894O, long j10, long j11, boolean z10, int i10, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super InterfaceC14882C, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function3<? super C18029o1, ? super Composer, ? super Integer, Unit> function32, C17993c1 c17993c1) {
            super(3);
            this.f168735f = c17963o0;
            this.f168736g = interfaceC14894O;
            this.f168737h = j10;
            this.f168738i = j11;
            this.f168739j = z10;
            this.f168740k = i10;
            this.f168741l = function2;
            this.f168742m = function3;
            this.f168743n = function22;
            this.f168744o = function23;
            this.f168745p = function32;
            this.f168746q = c17993c1;
        }

        public final void a(Modifier modifier, Composer composer, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (composer.V(modifier) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if (!composer.p((i11 & 19) != 18, i11 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-219833176, i11, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:201)");
            }
            boolean zV = composer.V(this.f168735f) | composer.V(this.f168736g);
            C17963O0 c17963o0 = this.f168735f;
            InterfaceC14894O interfaceC14894O = this.f168736g;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new a(c17963o0, interfaceC14894O);
                composer.t(objB);
            }
            t1.a(S.b(modifier, (Function1) objB), null, this.f168737h, this.f168738i, null, 0.0f, ComposableLambdaKt.c(1772955108, true, new b(this.f168739j, this.f168740k, this.f168741l, this.f168742m, this.f168743n, this.f168735f, this.f168744o, this.f168745p, this.f168746q), composer, 54), composer, 1572864, 50);
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

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/r0;", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/r0;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.a1$f */
    static final class f extends Lambda implements Function2<r0, H1.b, J> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168760f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168761g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168762h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f168763i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f168764j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC14894O f168765k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ h f168766l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168767m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14882C, Composer, Integer, Unit> f168768n;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: x0.a1$f$a */
        static final class a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List<f0> f168769f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List<f0> f168770g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ List<f0> f168771h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ List<f0> f168772i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ List<f0> f168773j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ int f168774k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ int f168775l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ int f168776m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ Integer f168777n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ C18028o0 f168778o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ Integer f168779p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(List<? extends f0> list, List<? extends f0> list2, List<? extends f0> list3, List<? extends f0> list4, List<? extends f0> list5, int i10, int i11, int i12, Integer num, C18028o0 c18028o0, Integer num2) {
                super(1);
                this.f168769f = list;
                this.f168770g = list2;
                this.f168771h = list3;
                this.f168772i = list4;
                this.f168773j = list5;
                this.f168774k = i10;
                this.f168775l = i11;
                this.f168776m = i12;
                this.f168777n = num;
                this.f168778o = c18028o0;
                this.f168779p = num2;
            }

            public final void a(f0.a aVar) {
                List<f0> list = this.f168769f;
                int i10 = this.f168774k;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    f0.a.h(aVar, list.get(i11), 0, i10, 0.0f, 4, null);
                }
                List<f0> list2 = this.f168770g;
                int size2 = list2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    f0.a.h(aVar, list2.get(i12), 0, 0, 0.0f, 4, null);
                }
                List<f0> list3 = this.f168771h;
                int i13 = this.f168775l;
                int i14 = this.f168776m;
                int size3 = list3.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    f0.a.h(aVar, list3.get(i15), 0, i13 - i14, 0.0f, 4, null);
                }
                List<f0> list4 = this.f168772i;
                int i16 = this.f168775l;
                Integer num = this.f168777n;
                int size4 = list4.size();
                for (int i17 = 0; i17 < size4; i17++) {
                    f0.a.h(aVar, list4.get(i17), 0, i16 - (num != null ? num.intValue() : 0), 0.0f, 4, null);
                }
                List<f0> list5 = this.f168773j;
                C18028o0 c18028o0 = this.f168778o;
                int i18 = this.f168775l;
                Integer num2 = this.f168779p;
                int size5 = list5.size();
                for (int i19 = 0; i19 < size5; i19++) {
                    f0.a.h(aVar, list5.get(i19), c18028o0 != null ? c18028o0.getLeft() : 0, i18 - (num2 != null ? num2.intValue() : 0), 0.0f, 4, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.a1$f$b */
        static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC14882C, Composer, Integer, Unit> f168780f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ h f168781g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(Function3<? super InterfaceC14882C, ? super Composer, ? super Integer, Unit> function3, h hVar) {
                super(2);
                this.f168780f = function3;
                this.f168781g = hVar;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-570781649, i10, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:534)");
                }
                this.f168780f.invoke(this.f168781g, composer, 6);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.a1$f$c */
        static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C18028o0 f168782f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f168783g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(C18028o0 c18028o0, Function2<? super Composer, ? super Integer, Unit> function2) {
                super(2);
                this.f168782f = c18028o0;
                this.f168783g = function2;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(424088350, i10, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:475)");
                }
                r.a(C17987a1.f().d(this.f168782f), this.f168783g, composer, G0.f50200i);
                if (ComposerKt.M()) {
                    ComposerKt.T();
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                a(composer, num.intValue());
                return Unit.f143329a;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:93:0x023d  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final androidx.compose.ui.layout.J a(androidx.compose.ui.layout.r0 r26, long r27) {
            /*
                Method dump skipped, instructions count: 966
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C17987a1.f.a(androidx.compose.ui.layout.r0, long):androidx.compose.ui.layout.J");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i10, boolean z10, InterfaceC14894O interfaceC14894O, h hVar, Function2<? super Composer, ? super Integer, Unit> function24, Function3<? super InterfaceC14882C, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f168760f = function2;
            this.f168761g = function22;
            this.f168762h = function23;
            this.f168763i = i10;
            this.f168764j = z10;
            this.f168765k = interfaceC14894O;
            this.f168766l = hVar;
            this.f168767m = function24;
            this.f168768n = function3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ J invoke(r0 r0Var, H1.b bVar) {
            return a(r0Var, bVar.getValue());
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.a1$g */
    static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f168784f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f168785g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168786h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14882C, Composer, Integer, Unit> f168787i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168788j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168789k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC14894O f168790l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f168791m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f168792n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(boolean z10, int i10, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super InterfaceC14882C, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, InterfaceC14894O interfaceC14894O, Function2<? super Composer, ? super Integer, Unit> function24, int i11) {
            super(2);
            this.f168784f = z10;
            this.f168785g = i10;
            this.f168786h = function2;
            this.f168787i = function3;
            this.f168788j = function22;
            this.f168789k = function23;
            this.f168790l = interfaceC14894O;
            this.f168791m = function24;
            this.f168792n = i11;
        }

        public final void a(Composer composer, int i10) {
            C17987a1.c(this.f168784f, this.f168785g, this.f168786h, this.f168787i, this.f168788j, this.f168789k, this.f168790l, this.f168791m, composer, J0.a(this.f168792n | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\bR+\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"x0/a1$h", "Lj0/C;", "LH1/t;", "layoutDirection", "LH1/h;", "b", "(LH1/t;)F", "d", "()F", "c", "a", "<set-?>", "Landroidx/compose/runtime/l0;", "e", "()Lj0/C;", "f", "(Lj0/C;)V", "paddingHolder", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: x0.a1$h */
    public static final class h implements InterfaceC14882C {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5872l0 paddingHolder = t1.e(D.a(H1.h.p(0)), null, 2, null);

        public final InterfaceC14882C e() {
            return (InterfaceC14882C) this.paddingHolder.getValue();
        }

        public final void f(InterfaceC14882C interfaceC14882C) {
            this.paddingHolder.setValue(interfaceC14882C);
        }

        h() {
        }

        @Override // j0.InterfaceC14882C
        /* renamed from: a */
        public float getBottom() {
            return e().getBottom();
        }

        @Override // j0.InterfaceC14882C
        public float b(t layoutDirection) {
            return e().b(layoutDirection);
        }

        @Override // j0.InterfaceC14882C
        public float c(t layoutDirection) {
            return e().c(layoutDirection);
        }

        @Override // j0.InterfaceC14882C
        /* renamed from: d */
        public float getTop() {
            return e().getTop();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r39, kotlin.C17993c1 r40, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r41, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r42, kotlin.jvm.functions.Function3<? super kotlin.C18029o1, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r44, int r45, boolean r46, kotlin.jvm.functions.Function3<? super j0.InterfaceC14902f, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r47, boolean r48, V0.D1 r49, float r50, long r51, long r53, long r55, long r57, long r59, kotlin.jvm.functions.Function3<? super j0.InterfaceC14882C, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r61, androidx.compose.runtime.Composer r62, int r63, int r64, int r65) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17987a1.a(androidx.compose.ui.Modifier, x0.c1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, int, boolean, kotlin.jvm.functions.Function3, boolean, V0.D1, float, long, long, long, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:319:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(j0.InterfaceC14894O r43, androidx.compose.ui.Modifier r44, kotlin.C17993c1 r45, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r46, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r47, kotlin.jvm.functions.Function3<? super kotlin.C18029o1, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r48, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r49, int r50, boolean r51, kotlin.jvm.functions.Function3<? super j0.InterfaceC14902f, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, boolean r53, V0.D1 r54, float r55, long r56, long r58, long r60, long r62, long r64, kotlin.jvm.functions.Function3<? super j0.InterfaceC14882C, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r66, androidx.compose.runtime.Composer r67, int r68, int r69, int r70) {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17987a1.b(j0.O, androidx.compose.ui.Modifier, x0.c1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, int, boolean, kotlin.jvm.functions.Function3, boolean, V0.D1, float, long, long, long, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(boolean z10, int i10, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super InterfaceC14882C, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, InterfaceC14894O interfaceC14894O, Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, int i11) {
        int i12;
        Function3<? super InterfaceC14882C, ? super Composer, ? super Integer, Unit> function32;
        Function2<? super Composer, ? super Integer, Unit> function25;
        int i13;
        Composer composerStartRestartGroup = composer.startRestartGroup(-468424875);
        if ((i11 & 6) == 0) {
            i12 = (composerStartRestartGroup.a(z10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= composerStartRestartGroup.d(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(function2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            function32 = function3;
            i12 |= composerStartRestartGroup.D(function32) ? RecyclerView.m.FLAG_MOVED : 1024;
        } else {
            function32 = function3;
        }
        if ((i11 & 24576) == 0) {
            i12 |= composerStartRestartGroup.D(function22) ? 16384 : 8192;
        }
        if ((196608 & i11) == 0) {
            function25 = function23;
            i12 |= composerStartRestartGroup.D(function25) ? 131072 : 65536;
        } else {
            function25 = function23;
        }
        if ((i11 & 1572864) == 0) {
            i12 |= composerStartRestartGroup.V(interfaceC14894O) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i12 |= composerStartRestartGroup.D(function24) ? 8388608 : 4194304;
        }
        if (composerStartRestartGroup.p((i12 & 4793491) != 4793490, i12 & 1)) {
            if (ComposerKt.M()) {
                ComposerKt.U(-468424875, i12, -1, "androidx.compose.material.ScaffoldLayout (Scaffold.kt:378)");
            }
            Object objB = composerStartRestartGroup.B();
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.a()) {
                objB = new h();
                composerStartRestartGroup.t(objB);
            }
            h hVar = (h) objB;
            boolean z11 = ((i12 & 7168) == 2048) | ((57344 & i12) == 16384) | ((i12 & 896) == 256) | ((3670016 & i12) == 1048576) | ((458752 & i12) == 131072) | ((i12 & 112) == 32) | ((i12 & 14) == 4) | ((29360128 & i12) == 8388608);
            Object objB2 = composerStartRestartGroup.B();
            if (z11 || objB2 == companion.a()) {
                i13 = 0;
                f fVar = new f(function2, function22, function25, i10, z10, interfaceC14894O, hVar, function24, function32);
                composerStartRestartGroup.t(fVar);
                objB2 = fVar;
            } else {
                i13 = 0;
            }
            p0.a(null, (Function2) objB2, composerStartRestartGroup, i13, 1);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        } else {
            composerStartRestartGroup.K();
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new g(z10, i10, function2, function3, function22, function23, interfaceC14894O, function24, i11));
        }
    }

    public static final F0<C18028o0> f() {
        return f168688a;
    }

    public static final C17993c1 g(C17998e0 c17998e0, C18029o1 c18029o1, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            c17998e0 = C17995d0.j(EnumC18001f0.f168977a, null, composer, 6, 2);
        }
        if ((i11 & 2) != 0) {
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new C18029o1();
                composer.t(objB);
            }
            c18029o1 = (C18029o1) objB;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(1569641925, i10, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:73)");
        }
        Object objB2 = composer.B();
        if (objB2 == Composer.INSTANCE.a()) {
            objB2 = new C17993c1(c17998e0, c18029o1);
            composer.t(objB2);
        }
        C17993c1 c17993c1 = (C17993c1) objB2;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c17993c1;
    }
}
