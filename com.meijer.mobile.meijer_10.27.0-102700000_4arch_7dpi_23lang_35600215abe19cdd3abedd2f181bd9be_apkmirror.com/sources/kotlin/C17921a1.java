package kotlin;

import H1.t;
import V0.D1;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.F0;
import androidx.compose.runtime.G0;
import androidx.compose.runtime.InterfaceC5730l0;
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
import j0.C14808Q;
import j0.InterfaceC14794C;
import j0.InterfaceC14806O;
import j0.InterfaceC14814f;
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
public final class C17921a1 {

    /* renamed from: a, reason: collision with root package name */
    private static final F0<C17962o0> f167600a = r.f(a.f167602f);

    /* renamed from: b, reason: collision with root package name */
    private static final float f167601b = H1.h.p(16);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lx0/o0;", "c", "()Lx0/o0;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.a1$a */
    static final class a extends Lambda implements Function0<C17962o0> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f167602f = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final C17962o0 invoke() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.a1$b */
    static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function3<Modifier, Composer, Integer, Unit> f167603f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Function3<? super Modifier, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f167603f = function3;
        }

        public final void a(Composer composer, int i10) {
            if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                composer.K();
                return;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(-1409196448, i10, -1, "androidx.compose.material.Scaffold.<anonymous> (Scaffold.kt:235)");
            }
            this.f167603f.invoke(Modifier.INSTANCE, composer, 54);
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

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.a1$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: A, reason: collision with root package name */
        final /* synthetic */ int f167604A;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC14806O f167605f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Modifier f167606g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C17927c1 f167607h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167608i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167609j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function3<C17963o1, Composer, Integer, Unit> f167610k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167611l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f167612m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f167613n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14814f, Composer, Integer, Unit> f167614o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f167615p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ D1 f167616q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ float f167617r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ long f167618s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f167619t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ long f167620u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ long f167621v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ long f167622w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14794C, Composer, Integer, Unit> f167623x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f167624y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ int f167625z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(InterfaceC14806O interfaceC14806O, Modifier modifier, C17927c1 c17927c1, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super C17963o1, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function23, int i10, boolean z10, Function3<? super InterfaceC14814f, ? super Composer, ? super Integer, Unit> function32, boolean z11, D1 d12, float f10, long j10, long j11, long j12, long j13, long j14, Function3<? super InterfaceC14794C, ? super Composer, ? super Integer, Unit> function33, int i11, int i12, int i13) {
            super(2);
            this.f167605f = interfaceC14806O;
            this.f167606g = modifier;
            this.f167607h = c17927c1;
            this.f167608i = function2;
            this.f167609j = function22;
            this.f167610k = function3;
            this.f167611l = function23;
            this.f167612m = i10;
            this.f167613n = z10;
            this.f167614o = function32;
            this.f167615p = z11;
            this.f167616q = d12;
            this.f167617r = f10;
            this.f167618s = j10;
            this.f167619t = j11;
            this.f167620u = j12;
            this.f167621v = j13;
            this.f167622w = j14;
            this.f167623x = function33;
            this.f167624y = i11;
            this.f167625z = i12;
            this.f167604A = i13;
        }

        public final void a(Composer composer, int i10) {
            C17921a1.b(this.f167605f, this.f167606g, this.f167607h, this.f167608i, this.f167609j, this.f167610k, this.f167611l, this.f167612m, this.f167613n, this.f167614o, this.f167615p, this.f167616q, this.f167617r, this.f167618s, this.f167619t, this.f167620u, this.f167621v, this.f167622w, this.f167623x, composer, J0.a(this.f167624y | 1), J0.a(this.f167625z), this.f167604A);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: x0.a1$d */
    static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f167626f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C17927c1 f167627g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167628h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167629i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function3<C17963o1, Composer, Integer, Unit> f167630j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167631k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f167632l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f167633m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14814f, Composer, Integer, Unit> f167634n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f167635o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ D1 f167636p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ float f167637q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ long f167638r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ long f167639s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f167640t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ long f167641u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ long f167642v;

        /* renamed from: w, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14794C, Composer, Integer, Unit> f167643w;

        /* renamed from: x, reason: collision with root package name */
        final /* synthetic */ int f167644x;

        /* renamed from: y, reason: collision with root package name */
        final /* synthetic */ int f167645y;

        /* renamed from: z, reason: collision with root package name */
        final /* synthetic */ int f167646z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(Modifier modifier, C17927c1 c17927c1, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function3<? super C17963o1, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function23, int i10, boolean z10, Function3<? super InterfaceC14814f, ? super Composer, ? super Integer, Unit> function32, boolean z11, D1 d12, float f10, long j10, long j11, long j12, long j13, long j14, Function3<? super InterfaceC14794C, ? super Composer, ? super Integer, Unit> function33, int i11, int i12, int i13) {
            super(2);
            this.f167626f = modifier;
            this.f167627g = c17927c1;
            this.f167628h = function2;
            this.f167629i = function22;
            this.f167630j = function3;
            this.f167631k = function23;
            this.f167632l = i10;
            this.f167633m = z10;
            this.f167634n = function32;
            this.f167635o = z11;
            this.f167636p = d12;
            this.f167637q = f10;
            this.f167638r = j10;
            this.f167639s = j11;
            this.f167640t = j12;
            this.f167641u = j13;
            this.f167642v = j14;
            this.f167643w = function33;
            this.f167644x = i11;
            this.f167645y = i12;
            this.f167646z = i13;
        }

        public final void a(Composer composer, int i10) {
            C17921a1.a(this.f167626f, this.f167627g, this.f167628h, this.f167629i, this.f167630j, this.f167631k, this.f167632l, this.f167633m, this.f167634n, this.f167635o, this.f167636p, this.f167637q, this.f167638r, this.f167639s, this.f167640t, this.f167641u, this.f167642v, this.f167643w, composer, J0.a(this.f167644x | 1), J0.a(this.f167645y), this.f167646z);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/Modifier;", "childModifier", "", "a", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.a1$e */
    static final class e extends Lambda implements Function3<Modifier, Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C17897O0 f167647f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ InterfaceC14806O f167648g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f167649h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f167650i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f167651j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f167652k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167653l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14794C, Composer, Integer, Unit> f167654m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167655n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167656o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Function3<C17963o1, Composer, Integer, Unit> f167657p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ C17927c1 f167658q;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lj0/O;", "consumedWindowInsets", "", "a", "(Lj0/O;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.a1$e$a */
        static final class a extends Lambda implements Function1<InterfaceC14806O, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17897O0 f167659f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ InterfaceC14806O f167660g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(C17897O0 c17897o0, InterfaceC14806O interfaceC14806O) {
                super(1);
                this.f167659f = c17897o0;
                this.f167660g = interfaceC14806O;
            }

            public final void a(InterfaceC14806O interfaceC14806O) {
                this.f167659f.f(C14808Q.f(this.f167660g, interfaceC14806O));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InterfaceC14806O interfaceC14806O) {
                a(interfaceC14806O);
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.a1$e$b */
        static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f167661f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f167662g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f167663h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC14794C, Composer, Integer, Unit> f167664i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f167665j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ C17897O0 f167666k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f167667l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ Function3<C17963o1, Composer, Integer, Unit> f167668m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ C17927c1 f167669n;

            @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
            /* renamed from: x0.a1$e$b$a */
            static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ Function3<C17963o1, Composer, Integer, Unit> f167670f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ C17927c1 f167671g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                a(Function3<? super C17963o1, ? super Composer, ? super Integer, Unit> function3, C17927c1 c17927c1) {
                    super(2);
                    this.f167670f = function3;
                    this.f167671g = c17927c1;
                }

                public final void a(Composer composer, int i10) {
                    if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                        composer.K();
                        return;
                    }
                    if (ComposerKt.M()) {
                        ComposerKt.U(433906483, i10, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:217)");
                    }
                    this.f167670f.invoke(this.f167671g.getSnackbarHostState(), composer, 0);
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(boolean z10, int i10, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super InterfaceC14794C, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, C17897O0 c17897o0, Function2<? super Composer, ? super Integer, Unit> function23, Function3<? super C17963o1, ? super Composer, ? super Integer, Unit> function32, C17927c1 c17927c1) {
                super(2);
                this.f167661f = z10;
                this.f167662g = i10;
                this.f167663h = function2;
                this.f167664i = function3;
                this.f167665j = function22;
                this.f167666k = c17897o0;
                this.f167667l = function23;
                this.f167668m = function32;
                this.f167669n = c17927c1;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(1772955108, i10, -1, "androidx.compose.material.Scaffold.<anonymous>.<anonymous> (Scaffold.kt:211)");
                }
                C17921a1.c(this.f167661f, this.f167662g, this.f167663h, this.f167664i, ComposableLambdaKt.c(433906483, true, new a(this.f167668m, this.f167669n), composer, 54), this.f167665j, this.f167666k, this.f167667l, composer, 24576);
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(C17897O0 c17897o0, InterfaceC14806O interfaceC14806O, long j10, long j11, boolean z10, int i10, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super InterfaceC14794C, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, Function3<? super C17963o1, ? super Composer, ? super Integer, Unit> function32, C17927c1 c17927c1) {
            super(3);
            this.f167647f = c17897o0;
            this.f167648g = interfaceC14806O;
            this.f167649h = j10;
            this.f167650i = j11;
            this.f167651j = z10;
            this.f167652k = i10;
            this.f167653l = function2;
            this.f167654m = function3;
            this.f167655n = function22;
            this.f167656o = function23;
            this.f167657p = function32;
            this.f167658q = c17927c1;
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
            boolean zV = composer.V(this.f167647f) | composer.V(this.f167648g);
            C17897O0 c17897o0 = this.f167647f;
            InterfaceC14806O interfaceC14806O = this.f167648g;
            Object objB = composer.B();
            if (zV || objB == Composer.INSTANCE.a()) {
                objB = new a(c17897o0, interfaceC14806O);
                composer.t(objB);
            }
            t1.a(S.b(modifier, (Function1) objB), null, this.f167649h, this.f167650i, null, 0.0f, ComposableLambdaKt.c(1772955108, true, new b(this.f167651j, this.f167652k, this.f167653l, this.f167654m, this.f167655n, this.f167647f, this.f167656o, this.f167657p, this.f167658q), composer, 54), composer, 1572864, 50);
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier, Composer composer, Integer num) {
            a(modifier, composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/r0;", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/r0;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: x0.a1$f */
    static final class f extends Lambda implements Function2<r0, H1.b, J> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167672f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167673g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167674h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f167675i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f167676j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC14806O f167677k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ h f167678l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167679m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14794C, Composer, Integer, Unit> f167680n;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: x0.a1$f$a */
        static final class a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List<f0> f167681f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List<f0> f167682g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ List<f0> f167683h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ List<f0> f167684i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ List<f0> f167685j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ int f167686k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ int f167687l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ int f167688m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ Integer f167689n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ C17962o0 f167690o;

            /* renamed from: p, reason: collision with root package name */
            final /* synthetic */ Integer f167691p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(List<? extends f0> list, List<? extends f0> list2, List<? extends f0> list3, List<? extends f0> list4, List<? extends f0> list5, int i10, int i11, int i12, Integer num, C17962o0 c17962o0, Integer num2) {
                super(1);
                this.f167681f = list;
                this.f167682g = list2;
                this.f167683h = list3;
                this.f167684i = list4;
                this.f167685j = list5;
                this.f167686k = i10;
                this.f167687l = i11;
                this.f167688m = i12;
                this.f167689n = num;
                this.f167690o = c17962o0;
                this.f167691p = num2;
            }

            public final void a(f0.a aVar) {
                List<f0> list = this.f167681f;
                int i10 = this.f167686k;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    f0.a.h(aVar, list.get(i11), 0, i10, 0.0f, 4, null);
                }
                List<f0> list2 = this.f167682g;
                int size2 = list2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    f0.a.h(aVar, list2.get(i12), 0, 0, 0.0f, 4, null);
                }
                List<f0> list3 = this.f167683h;
                int i13 = this.f167687l;
                int i14 = this.f167688m;
                int size3 = list3.size();
                for (int i15 = 0; i15 < size3; i15++) {
                    f0.a.h(aVar, list3.get(i15), 0, i13 - i14, 0.0f, 4, null);
                }
                List<f0> list4 = this.f167684i;
                int i16 = this.f167687l;
                Integer num = this.f167689n;
                int size4 = list4.size();
                for (int i17 = 0; i17 < size4; i17++) {
                    f0.a.h(aVar, list4.get(i17), 0, i16 - (num != null ? num.intValue() : 0), 0.0f, 4, null);
                }
                List<f0> list5 = this.f167685j;
                C17962o0 c17962o0 = this.f167690o;
                int i18 = this.f167687l;
                Integer num2 = this.f167691p;
                int size5 = list5.size();
                for (int i19 = 0; i19 < size5; i19++) {
                    f0.a.h(aVar, list5.get(i19), c17962o0 != null ? c17962o0.getLeft() : 0, i18 - (num2 != null ? num2.intValue() : 0), 0.0f, 4, null);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.a1$f$b */
        static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ Function3<InterfaceC14794C, Composer, Integer, Unit> f167692f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ h f167693g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(Function3<? super InterfaceC14794C, ? super Composer, ? super Integer, Unit> function3, h hVar) {
                super(2);
                this.f167692f = function3;
                this.f167693g = hVar;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(-570781649, i10, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:534)");
                }
                this.f167692f.invoke(this.f167693g, composer, 6);
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

        @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "(Landroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: x0.a1$f$c */
        static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C17962o0 f167694f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Function2<Composer, Integer, Unit> f167695g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            c(C17962o0 c17962o0, Function2<? super Composer, ? super Integer, Unit> function2) {
                super(2);
                this.f167694f = c17962o0;
                this.f167695g = function2;
            }

            public final void a(Composer composer, int i10) {
                if (!composer.p((i10 & 3) != 2, i10 & 1)) {
                    composer.K();
                    return;
                }
                if (ComposerKt.M()) {
                    ComposerKt.U(424088350, i10, -1, "androidx.compose.material.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:475)");
                }
                r.a(C17921a1.f().d(this.f167694f), this.f167695g, composer, G0.f49976i);
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C17921a1.f.a(androidx.compose.ui.layout.r0, long):androidx.compose.ui.layout.J");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, int i10, boolean z10, InterfaceC14806O interfaceC14806O, h hVar, Function2<? super Composer, ? super Integer, Unit> function24, Function3<? super InterfaceC14794C, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f167672f = function2;
            this.f167673g = function22;
            this.f167674h = function23;
            this.f167675i = i10;
            this.f167676j = z10;
            this.f167677k = interfaceC14806O;
            this.f167678l = hVar;
            this.f167679m = function24;
            this.f167680n = function3;
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
        final /* synthetic */ boolean f167696f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f167697g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167698h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Function3<InterfaceC14794C, Composer, Integer, Unit> f167699i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167700j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167701k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC14806O f167702l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f167703m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f167704n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(boolean z10, int i10, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super InterfaceC14794C, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, InterfaceC14806O interfaceC14806O, Function2<? super Composer, ? super Integer, Unit> function24, int i11) {
            super(2);
            this.f167696f = z10;
            this.f167697g = i10;
            this.f167698h = function2;
            this.f167699i = function3;
            this.f167700j = function22;
            this.f167701k = function23;
            this.f167702l = interfaceC14806O;
            this.f167703m = function24;
            this.f167704n = i11;
        }

        public final void a(Composer composer, int i10) {
            C17921a1.c(this.f167696f, this.f167697g, this.f167698h, this.f167699i, this.f167700j, this.f167701k, this.f167702l, this.f167703m, composer, J0.a(this.f167704n | 1));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\u0006J\u0015\u0010\n\u001a\u00020\u0004H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\bR+\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00018F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"x0/a1$h", "Lj0/C;", "LH1/t;", "layoutDirection", "LH1/h;", "b", "(LH1/t;)F", "d", "()F", "c", "a", "<set-?>", "Landroidx/compose/runtime/l0;", "e", "()Lj0/C;", "f", "(Lj0/C;)V", "paddingHolder", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: x0.a1$h */
    public static final class h implements InterfaceC14794C {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final InterfaceC5730l0 paddingHolder = t1.e(D.a(H1.h.p(0)), null, 2, null);

        public final InterfaceC14794C e() {
            return (InterfaceC14794C) this.paddingHolder.getValue();
        }

        public final void f(InterfaceC14794C interfaceC14794C) {
            this.paddingHolder.setValue(interfaceC14794C);
        }

        h() {
        }

        @Override // j0.InterfaceC14794C
        /* renamed from: a */
        public float getBottom() {
            return e().getBottom();
        }

        @Override // j0.InterfaceC14794C
        public float b(t layoutDirection) {
            return e().b(layoutDirection);
        }

        @Override // j0.InterfaceC14794C
        public float c(t layoutDirection) {
            return e().c(layoutDirection);
        }

        @Override // j0.InterfaceC14794C
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
    public static final void a(androidx.compose.ui.Modifier r39, kotlin.C17927c1 r40, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r41, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r42, kotlin.jvm.functions.Function3<? super kotlin.C17963o1, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r43, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r44, int r45, boolean r46, kotlin.jvm.functions.Function3<? super j0.InterfaceC14814f, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r47, boolean r48, V0.D1 r49, float r50, long r51, long r53, long r55, long r57, long r59, kotlin.jvm.functions.Function3<? super j0.InterfaceC14794C, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r61, androidx.compose.runtime.Composer r62, int r63, int r64, int r65) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17921a1.a(androidx.compose.ui.Modifier, x0.c1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, int, boolean, kotlin.jvm.functions.Function3, boolean, V0.D1, float, long, long, long, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
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
    public static final void b(j0.InterfaceC14806O r43, androidx.compose.ui.Modifier r44, kotlin.C17927c1 r45, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r46, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r47, kotlin.jvm.functions.Function3<? super kotlin.C17963o1, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r48, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r49, int r50, boolean r51, kotlin.jvm.functions.Function3<? super j0.InterfaceC14814f, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, boolean r53, V0.D1 r54, float r55, long r56, long r58, long r60, long r62, long r64, kotlin.jvm.functions.Function3<? super j0.InterfaceC14794C, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r66, androidx.compose.runtime.Composer r67, int r68, int r69, int r70) {
        /*
            Method dump skipped, instructions count: 1332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C17921a1.b(j0.O, androidx.compose.ui.Modifier, x0.c1, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function2, int, boolean, kotlin.jvm.functions.Function3, boolean, V0.D1, float, long, long, long, long, long, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(boolean z10, int i10, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super InterfaceC14794C, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function22, Function2<? super Composer, ? super Integer, Unit> function23, InterfaceC14806O interfaceC14806O, Function2<? super Composer, ? super Integer, Unit> function24, Composer composer, int i11) {
        int i12;
        Function3<? super InterfaceC14794C, ? super Composer, ? super Integer, Unit> function32;
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
            i12 |= composerStartRestartGroup.V(interfaceC14806O) ? 1048576 : 524288;
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
                f fVar = new f(function2, function22, function25, i10, z10, interfaceC14806O, hVar, function24, function32);
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
            t0L.a(new g(z10, i10, function2, function3, function22, function23, interfaceC14806O, function24, i11));
        }
    }

    public static final F0<C17962o0> f() {
        return f167600a;
    }

    public static final C17927c1 g(C17932e0 c17932e0, C17963o1 c17963o1, Composer composer, int i10, int i11) {
        if ((i11 & 1) != 0) {
            c17932e0 = C17929d0.j(EnumC17935f0.f167889a, null, composer, 6, 2);
        }
        if ((i11 & 2) != 0) {
            Object objB = composer.B();
            if (objB == Composer.INSTANCE.a()) {
                objB = new C17963o1();
                composer.t(objB);
            }
            c17963o1 = (C17963o1) objB;
        }
        if (ComposerKt.M()) {
            ComposerKt.U(1569641925, i10, -1, "androidx.compose.material.rememberScaffoldState (Scaffold.kt:73)");
        }
        Object objB2 = composer.B();
        if (objB2 == Composer.INSTANCE.a()) {
            objB2 = new C17927c1(c17932e0, c17963o1);
            composer.t(objB2);
        }
        C17927c1 c17927c1 = (C17927c1) objB2;
        if (ComposerKt.M()) {
            ComposerKt.T();
        }
        return c17927c1;
    }
}
