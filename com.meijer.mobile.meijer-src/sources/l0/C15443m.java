package l0;

import P0.e;
import V0.InterfaceC5453d1;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.f0;
import d0.C13577k;
import d0.J;
import i0.C14592e;
import j0.InterfaceC14882C;
import java.util.List;
import kotlin.C15860T;
import kotlin.C15879l;
import kotlin.EnumC13937z;
import kotlin.InterfaceC13930s;
import kotlin.InterfaceC15868a0;
import kotlin.InterfaceC15890w;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¤\u0001\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¢\u0006\u0002\b\u001bH\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u009e\u0001\u0010,\u001a\u0019\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0(¢\u0006\u0002\b\u001b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0003¢\u0006\u0004\b,\u0010-¨\u0006."}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ll0/A;", "state", "Lj0/C;", "contentPadding", "", "reverseLayout", "isVertical", "Lf0/s;", "flingBehavior", "userScrollEnabled", "Ld0/J;", "overscrollEffect", "", "beyondBoundsItemCount", "LP0/e$b;", "horizontalAlignment", "Landroidx/compose/foundation/layout/d$m;", "verticalArrangement", "LP0/e$c;", "verticalAlignment", "Landroidx/compose/foundation/layout/d$e;", "horizontalArrangement", "Lkotlin/Function1;", "Ll0/w;", "", "Lkotlin/ExtensionFunctionType;", "content", "a", "(Landroidx/compose/ui/Modifier;Ll0/A;Lj0/C;ZZLf0/s;ZLd0/J;ILP0/e$b;Landroidx/compose/foundation/layout/d$m;LP0/e$c;Landroidx/compose/foundation/layout/d$e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Lkotlin/Function0;", "Ll0/j;", "itemProviderLambda", "Lmv/O;", "coroutineScope", "LV0/d1;", "graphicsContext", "Ln0/a0;", "stickyItemsPlacement", "Lkotlin/Function2;", "Ln0/w;", "LH1/b;", "Landroidx/compose/ui/layout/J;", "b", "(Lkotlin/jvm/functions/Function0;Ll0/A;Lj0/C;ZZILP0/e$b;LP0/e$c;Landroidx/compose/foundation/layout/d$e;Landroidx/compose/foundation/layout/d$m;Lmv/O;LV0/d1;Ln0/a0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: l0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15443m {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: l0.m$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f149065f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C15429A f149066g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f149067h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f149068i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f149069j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC13930s f149070k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f149071l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ J f149072m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f149073n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ e.b f149074o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ C5800d.m f149075p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ e.c f149076q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ C5800d.e f149077r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Function1<w, Unit> f149078s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f149079t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f149080u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f149081v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Modifier modifier, C15429A c15429a, InterfaceC14882C interfaceC14882C, boolean z10, boolean z11, InterfaceC13930s interfaceC13930s, boolean z12, J j10, int i10, e.b bVar, C5800d.m mVar, e.c cVar, C5800d.e eVar, Function1<? super w, Unit> function1, int i11, int i12, int i13) {
            super(2);
            this.f149065f = modifier;
            this.f149066g = c15429a;
            this.f149067h = interfaceC14882C;
            this.f149068i = z10;
            this.f149069j = z11;
            this.f149070k = interfaceC13930s;
            this.f149071l = z12;
            this.f149072m = j10;
            this.f149073n = i10;
            this.f149074o = bVar;
            this.f149075p = mVar;
            this.f149076q = cVar;
            this.f149077r = eVar;
            this.f149078s = function1;
            this.f149079t = i11;
            this.f149080u = i12;
            this.f149081v = i13;
        }

        public final void a(Composer composer, int i10) {
            C15443m.a(this.f149065f, this.f149066g, this.f149067h, this.f149068i, this.f149069j, this.f149070k, this.f149071l, this.f149072m, this.f149073n, this.f149074o, this.f149075p, this.f149076q, this.f149077r, this.f149078s, composer, J0.a(this.f149079t | 1), J0.a(this.f149080u), this.f149081v);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln0/w;", "LH1/b;", "containerConstraints", "Ll0/q;", "a", "(Ln0/w;J)Ll0/q;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: l0.m$b */
    static final class b extends Lambda implements Function2<InterfaceC15890w, H1.b, q> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C15429A f149082f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f149083g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f149084h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f149085i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<InterfaceC15440j> f149086j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ C5800d.m f149087k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ C5800d.e f149088l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f149089m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f149090n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC5453d1 f149091o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ InterfaceC15868a0 f149092p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ e.b f149093q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ e.c f149094r;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "width", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/f0$a;", "", "Lkotlin/ExtensionFunctionType;", "placement", "Landroidx/compose/ui/layout/J;", "a", "(IILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: l0.m$b$a */
        static final class a extends Lambda implements Function3<Integer, Integer, Function1<? super f0.a, ? extends Unit>, androidx.compose.ui.layout.J> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC15890w f149095f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ long f149096g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f149097h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f149098i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC15890w interfaceC15890w, long j10, int i10, int i11) {
                super(3);
                this.f149095f = interfaceC15890w;
                this.f149096g = j10;
                this.f149097h = i10;
                this.f149098i = i11;
            }

            public final androidx.compose.ui.layout.J a(int i10, int i11, Function1<? super f0.a, Unit> function1) {
                return this.f149095f.g1(H1.c.g(this.f149096g, i10 + this.f149097h), H1.c.f(this.f149096g, i11 + this.f149098i), MapsKt.k(), function1);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.J invoke(Integer num, Integer num2, Function1<? super f0.a, ? extends Unit> function1) {
                return a(num.intValue(), num2.intValue(), function1);
            }
        }

        @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JB\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"l0/m$b$b", "Ll0/s;", "", "index", "", "key", "contentType", "", "Landroidx/compose/ui/layout/f0;", "placeables", "LH1/b;", "constraints", "Ll0/r;", "b", "(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;J)Ll0/r;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: l0.m$b$b, reason: collision with other inner class name */
        public static final class C2288b extends s {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f149099d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC15890w f149100e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f149101f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f149102g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ e.b f149103h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ e.c f149104i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ boolean f149105j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ int f149106k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ int f149107l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ long f149108m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ C15429A f149109n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2288b(long j10, boolean z10, InterfaceC15440j interfaceC15440j, InterfaceC15890w interfaceC15890w, int i10, int i11, e.b bVar, e.c cVar, boolean z11, int i12, int i13, long j11, C15429A c15429a) {
                super(j10, z10, interfaceC15440j, interfaceC15890w, null);
                this.f149099d = z10;
                this.f149100e = interfaceC15890w;
                this.f149101f = i10;
                this.f149102g = i11;
                this.f149103h = bVar;
                this.f149104i = cVar;
                this.f149105j = z11;
                this.f149106k = i12;
                this.f149107l = i13;
                this.f149108m = j11;
                this.f149109n = c15429a;
            }

            @Override // l0.s
            public r b(int index, Object key, Object contentType, List<? extends f0> placeables, long constraints) {
                return new r(index, placeables, this.f149099d, this.f149103h, this.f149104i, this.f149100e.getLayoutDirection(), this.f149105j, this.f149106k, this.f149107l, index == this.f149101f + (-1) ? 0 : this.f149102g, this.f149108m, key, contentType, this.f149109n.w(), constraints, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(C15429A c15429a, boolean z10, InterfaceC14882C interfaceC14882C, boolean z11, Function0<? extends InterfaceC15440j> function0, C5800d.m mVar, C5800d.e eVar, int i10, InterfaceC15783O interfaceC15783O, InterfaceC5453d1 interfaceC5453d1, InterfaceC15868a0 interfaceC15868a0, e.b bVar, e.c cVar) {
            super(2);
            this.f149082f = c15429a;
            this.f149083g = z10;
            this.f149084h = interfaceC14882C;
            this.f149085i = z11;
            this.f149086j = function0;
            this.f149087k = mVar;
            this.f149088l = eVar;
            this.f149089m = i10;
            this.f149090n = interfaceC15783O;
            this.f149091o = interfaceC5453d1;
            this.f149092p = interfaceC15868a0;
            this.f149093q = bVar;
            this.f149094r = cVar;
        }

        public final q a(InterfaceC15890w interfaceC15890w, long j10) {
            float spacing;
            InterfaceC15440j interfaceC15440j;
            long jF;
            C15860T.a(this.f149082f.y());
            boolean z10 = this.f149082f.getHasLookaheadOccurred() || interfaceC15890w.v0();
            C13577k.a(j10, this.f149083g ? EnumC13937z.f131419a : EnumC13937z.f131420b);
            int iE0 = this.f149083g ? interfaceC15890w.E0(this.f149084h.b(interfaceC15890w.getLayoutDirection())) : interfaceC15890w.E0(D.g(this.f149084h, interfaceC15890w.getLayoutDirection()));
            int iE02 = this.f149083g ? interfaceC15890w.E0(this.f149084h.c(interfaceC15890w.getLayoutDirection())) : interfaceC15890w.E0(D.f(this.f149084h, interfaceC15890w.getLayoutDirection()));
            int iE03 = interfaceC15890w.E0(this.f149084h.getTop());
            int iE04 = interfaceC15890w.E0(this.f149084h.getBottom());
            int i10 = iE03 + iE04;
            int i11 = iE0 + iE02;
            boolean z11 = this.f149083g;
            int i12 = z11 ? i10 : i11;
            int i13 = (!z11 || this.f149085i) ? (z11 && this.f149085i) ? iE04 : (z11 || this.f149085i) ? iE02 : iE0 : iE03;
            int i14 = i12 - i13;
            long jI = H1.c.i(j10, -i11, -i10);
            InterfaceC15440j interfaceC15440jInvoke = this.f149086j.invoke();
            interfaceC15440jInvoke.getItemScope().i(H1.b.l(jI), H1.b.k(jI));
            if (this.f149083g) {
                C5800d.m mVar = this.f149087k;
                if (mVar == null) {
                    C14592e.b("null verticalArrangement when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                spacing = mVar.getSpacing();
            } else {
                C5800d.e eVar = this.f149088l;
                if (eVar == null) {
                    C14592e.b("null horizontalAlignment when isVertical == false");
                    throw new KotlinNothingValueException();
                }
                spacing = eVar.getSpacing();
            }
            int iE05 = interfaceC15890w.E0(spacing);
            int iA = interfaceC15440jInvoke.a();
            int iK = this.f149083g ? H1.b.k(j10) - i10 : H1.b.l(j10) - i11;
            if (!this.f149085i || iK > 0) {
                interfaceC15440j = interfaceC15440jInvoke;
                jF = H1.n.f((iE0 << 32) | (iE03 & 4294967295L));
            } else {
                boolean z12 = this.f149083g;
                if (!z12) {
                    iE0 += iK;
                }
                if (z12) {
                    iE03 += iK;
                }
                interfaceC15440j = interfaceC15440jInvoke;
                jF = H1.n.f((iE0 << 32) | (iE03 & 4294967295L));
            }
            long j11 = jF;
            InterfaceC15440j interfaceC15440j2 = interfaceC15440j;
            C2288b c2288b = new C2288b(jI, this.f149083g, interfaceC15440j2, interfaceC15890w, iA, iE05, this.f149093q, this.f149094r, this.f149085i, i13, i14, j11, this.f149082f);
            g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            C15429A c15429a = this.f149082f;
            androidx.compose.runtime.snapshots.g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            androidx.compose.runtime.snapshots.g gVarE = companion.e(gVarD);
            try {
                int iN = c15429a.N(interfaceC15440j2, c15429a.s());
                int iT = c15429a.t();
                Unit unit = Unit.f143329a;
                companion.l(gVarD, gVarE, function1G);
                q qVarE = p.e(iA, c2288b, iK, i13, i14, iE05, iN, iT, (interfaceC15890w.v0() || !z10) ? this.f149082f.getScrollToBeConsumed() : this.f149082f.E(), jI, this.f149083g, this.f149087k, this.f149088l, this.f149085i, interfaceC15890w, this.f149082f.w(), this.f149089m, C15879l.a(interfaceC15440j2, this.f149082f.getPinnedItems(), this.f149082f.getBeyondBoundsInfo()), z10, interfaceC15890w.v0(), this.f149082f.getApproachLayoutInfo(), this.f149090n, this.f149082f.B(), this.f149091o, this.f149092p, new a(interfaceC15890w, j10, i11, i10));
                C15429A.n(this.f149082f, qVarE, interfaceC15890w.v0(), false, 4, null);
                return qVarE;
            } catch (Throwable th2) {
                companion.l(gVarD, gVarE, function1G);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ q invoke(InterfaceC15890w interfaceC15890w, H1.b bVar) {
            return a(interfaceC15890w, bVar.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r29, l0.C15429A r30, j0.InterfaceC14882C r31, boolean r32, boolean r33, kotlin.InterfaceC13930s r34, boolean r35, d0.J r36, int r37, P0.e.b r38, androidx.compose.foundation.layout.C5800d.m r39, P0.e.c r40, androidx.compose.foundation.layout.C5800d.e r41, kotlin.jvm.functions.Function1<? super l0.w, kotlin.Unit> r42, androidx.compose.runtime.Composer r43, int r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.C15443m.a(androidx.compose.ui.Modifier, l0.A, j0.C, boolean, boolean, f0.s, boolean, d0.J, int, P0.e$b, androidx.compose.foundation.layout.d$m, P0.e$c, androidx.compose.foundation.layout.d$e, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0075 A[PHI: r4
      0x0075: PHI (r4v17 boolean) = (r4v15 boolean), (r4v18 boolean) binds: [B:36:0x0073, B:32:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091 A[PHI: r9
      0x0091: PHI (r9v11 P0.e$b) = (r9v8 P0.e$b), (r9v12 P0.e$b) binds: [B:46:0x008f, B:42:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ad A[PHI: r12
      0x00ad: PHI (r12v12 P0.e$c) = (r12v9 P0.e$c), (r12v13 P0.e$c) binds: [B:56:0x00ab, B:52:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9 A[PHI: r13
      0x00c9: PHI (r13v12 androidx.compose.foundation.layout.d$e) = (r13v9 androidx.compose.foundation.layout.d$e), (r13v13 androidx.compose.foundation.layout.d$e) binds: [B:66:0x00c7, B:62:0x00c1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5 A[PHI: r14
      0x00e5: PHI (r14v12 androidx.compose.foundation.layout.d$m) = (r14v9 androidx.compose.foundation.layout.d$m), (r14v13 androidx.compose.foundation.layout.d$m) binds: [B:76:0x00e3, B:72:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0105 A[PHI: r5
      0x0105: PHI (r5v7 n0.a0) = (r5v5 n0.a0), (r5v8 n0.a0) binds: [B:86:0x0103, B:82:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.jvm.functions.Function2<kotlin.InterfaceC15890w, H1.b, androidx.compose.ui.layout.J> b(kotlin.jvm.functions.Function0<? extends l0.InterfaceC15440j> r21, l0.C15429A r22, j0.InterfaceC14882C r23, boolean r24, boolean r25, int r26, P0.e.b r27, P0.e.c r28, androidx.compose.foundation.layout.C5800d.e r29, androidx.compose.foundation.layout.C5800d.m r30, mv.InterfaceC15783O r31, V0.InterfaceC5453d1 r32, kotlin.InterfaceC15868a0 r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.C15443m.b(kotlin.jvm.functions.Function0, l0.A, j0.C, boolean, boolean, int, P0.e$b, P0.e$c, androidx.compose.foundation.layout.d$e, androidx.compose.foundation.layout.d$m, mv.O, V0.d1, n0.a0, androidx.compose.runtime.Composer, int, int):kotlin.jvm.functions.Function2");
    }
}
