package l0;

import P0.e;
import V0.InterfaceC5310d1;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.foundation.layout.D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.f0;
import d0.C13444k;
import d0.J;
import i0.C14589e;
import j0.InterfaceC14794C;
import java.util.List;
import kotlin.C15733T;
import kotlin.C15752l;
import kotlin.EnumC13827z;
import kotlin.InterfaceC13820s;
import kotlin.InterfaceC15741a0;
import kotlin.InterfaceC15763w;
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
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a¤\u0001\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0017\u0010\u001c\u001a\u0013\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u0018¢\u0006\u0002\b\u001bH\u0001¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u009e\u0001\u0010,\u001a\u0019\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0(¢\u0006\u0002\b\u001b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0003¢\u0006\u0004\b,\u0010-¨\u0006."}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ll0/A;", "state", "Lj0/C;", "contentPadding", "", "reverseLayout", "isVertical", "Lf0/s;", "flingBehavior", "userScrollEnabled", "Ld0/J;", "overscrollEffect", "", "beyondBoundsItemCount", "LP0/e$b;", "horizontalAlignment", "Landroidx/compose/foundation/layout/d$m;", "verticalArrangement", "LP0/e$c;", "verticalAlignment", "Landroidx/compose/foundation/layout/d$e;", "horizontalArrangement", "Lkotlin/Function1;", "Ll0/w;", "", "Lkotlin/ExtensionFunctionType;", "content", "a", "(Landroidx/compose/ui/Modifier;Ll0/A;Lj0/C;ZZLf0/s;ZLd0/J;ILP0/e$b;Landroidx/compose/foundation/layout/d$m;LP0/e$c;Landroidx/compose/foundation/layout/d$e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Lkotlin/Function0;", "Ll0/j;", "itemProviderLambda", "Lqv/O;", "coroutineScope", "LV0/d1;", "graphicsContext", "Ln0/a0;", "stickyItemsPlacement", "Lkotlin/Function2;", "Ln0/w;", "LH1/b;", "Landroidx/compose/ui/layout/J;", "b", "(Lkotlin/jvm/functions/Function0;Ll0/A;Lj0/C;ZZILP0/e$b;LP0/e$c;Landroidx/compose/foundation/layout/d$e;Landroidx/compose/foundation/layout/d$m;Lqv/O;LV0/d1;Ln0/a0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: l0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15353m {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: l0.m$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f148278f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C15339A f148279g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC14794C f148280h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f148281i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f148282j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC13820s f148283k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ boolean f148284l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ J f148285m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f148286n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ e.b f148287o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ C5658d.m f148288p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ e.c f148289q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ C5658d.e f148290r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Function1<w, Unit> f148291s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f148292t;

        /* renamed from: u, reason: collision with root package name */
        final /* synthetic */ int f148293u;

        /* renamed from: v, reason: collision with root package name */
        final /* synthetic */ int f148294v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Modifier modifier, C15339A c15339a, InterfaceC14794C interfaceC14794C, boolean z10, boolean z11, InterfaceC13820s interfaceC13820s, boolean z12, J j10, int i10, e.b bVar, C5658d.m mVar, e.c cVar, C5658d.e eVar, Function1<? super w, Unit> function1, int i11, int i12, int i13) {
            super(2);
            this.f148278f = modifier;
            this.f148279g = c15339a;
            this.f148280h = interfaceC14794C;
            this.f148281i = z10;
            this.f148282j = z11;
            this.f148283k = interfaceC13820s;
            this.f148284l = z12;
            this.f148285m = j10;
            this.f148286n = i10;
            this.f148287o = bVar;
            this.f148288p = mVar;
            this.f148289q = cVar;
            this.f148290r = eVar;
            this.f148291s = function1;
            this.f148292t = i11;
            this.f148293u = i12;
            this.f148294v = i13;
        }

        public final void a(Composer composer, int i10) {
            C15353m.a(this.f148278f, this.f148279g, this.f148280h, this.f148281i, this.f148282j, this.f148283k, this.f148284l, this.f148285m, this.f148286n, this.f148287o, this.f148288p, this.f148289q, this.f148290r, this.f148291s, composer, J0.a(this.f148292t | 1), J0.a(this.f148293u), this.f148294v);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln0/w;", "LH1/b;", "containerConstraints", "Ll0/q;", "a", "(Ln0/w;J)Ll0/q;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: l0.m$b */
    static final class b extends Lambda implements Function2<InterfaceC15763w, H1.b, q> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C15339A f148295f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f148296g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC14794C f148297h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f148298i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<InterfaceC15350j> f148299j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ C5658d.m f148300k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ C5658d.e f148301l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ int f148302m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f148303n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC5310d1 f148304o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ InterfaceC15741a0 f148305p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ e.b f148306q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ e.c f148307r;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "width", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/f0$a;", "", "Lkotlin/ExtensionFunctionType;", "placement", "Landroidx/compose/ui/layout/J;", "a", "(IILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: l0.m$b$a */
        static final class a extends Lambda implements Function3<Integer, Integer, Function1<? super f0.a, ? extends Unit>, androidx.compose.ui.layout.J> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC15763w f148308f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ long f148309g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f148310h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f148311i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC15763w interfaceC15763w, long j10, int i10, int i11) {
                super(3);
                this.f148308f = interfaceC15763w;
                this.f148309g = j10;
                this.f148310h = i10;
                this.f148311i = i11;
            }

            public final androidx.compose.ui.layout.J a(int i10, int i11, Function1<? super f0.a, Unit> function1) {
                return this.f148308f.g1(H1.c.g(this.f148309g, i10 + this.f148310h), H1.c.f(this.f148309g, i11 + this.f148311i), MapsKt.k(), function1);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.J invoke(Integer num, Integer num2, Function1<? super f0.a, ? extends Unit> function1) {
                return a(num.intValue(), num2.intValue(), function1);
            }
        }

        @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JB\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"l0/m$b$b", "Ll0/s;", "", "index", "", "key", "contentType", "", "Landroidx/compose/ui/layout/f0;", "placeables", "LH1/b;", "constraints", "Ll0/r;", "b", "(ILjava/lang/Object;Ljava/lang/Object;Ljava/util/List;J)Ll0/r;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: l0.m$b$b, reason: collision with other inner class name */
        public static final class C2280b extends s {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ boolean f148312d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ InterfaceC15763w f148313e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ int f148314f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f148315g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ e.b f148316h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ e.c f148317i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ boolean f148318j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ int f148319k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ int f148320l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ long f148321m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ C15339A f148322n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2280b(long j10, boolean z10, InterfaceC15350j interfaceC15350j, InterfaceC15763w interfaceC15763w, int i10, int i11, e.b bVar, e.c cVar, boolean z11, int i12, int i13, long j11, C15339A c15339a) {
                super(j10, z10, interfaceC15350j, interfaceC15763w, null);
                this.f148312d = z10;
                this.f148313e = interfaceC15763w;
                this.f148314f = i10;
                this.f148315g = i11;
                this.f148316h = bVar;
                this.f148317i = cVar;
                this.f148318j = z11;
                this.f148319k = i12;
                this.f148320l = i13;
                this.f148321m = j11;
                this.f148322n = c15339a;
            }

            @Override // l0.s
            public r b(int index, Object key, Object contentType, List<? extends f0> placeables, long constraints) {
                return new r(index, placeables, this.f148312d, this.f148316h, this.f148317i, this.f148313e.getLayoutDirection(), this.f148318j, this.f148319k, this.f148320l, index == this.f148314f + (-1) ? 0 : this.f148315g, this.f148321m, key, contentType, this.f148322n.w(), constraints, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(C15339A c15339a, boolean z10, InterfaceC14794C interfaceC14794C, boolean z11, Function0<? extends InterfaceC15350j> function0, C5658d.m mVar, C5658d.e eVar, int i10, InterfaceC16622O interfaceC16622O, InterfaceC5310d1 interfaceC5310d1, InterfaceC15741a0 interfaceC15741a0, e.b bVar, e.c cVar) {
            super(2);
            this.f148295f = c15339a;
            this.f148296g = z10;
            this.f148297h = interfaceC14794C;
            this.f148298i = z11;
            this.f148299j = function0;
            this.f148300k = mVar;
            this.f148301l = eVar;
            this.f148302m = i10;
            this.f148303n = interfaceC16622O;
            this.f148304o = interfaceC5310d1;
            this.f148305p = interfaceC15741a0;
            this.f148306q = bVar;
            this.f148307r = cVar;
        }

        public final q a(InterfaceC15763w interfaceC15763w, long j10) {
            float spacing;
            InterfaceC15350j interfaceC15350j;
            long jF;
            C15733T.a(this.f148295f.y());
            boolean z10 = this.f148295f.getHasLookaheadOccurred() || interfaceC15763w.v0();
            C13444k.a(j10, this.f148296g ? EnumC13827z.f130585a : EnumC13827z.f130586b);
            int iE0 = this.f148296g ? interfaceC15763w.E0(this.f148297h.b(interfaceC15763w.getLayoutDirection())) : interfaceC15763w.E0(D.g(this.f148297h, interfaceC15763w.getLayoutDirection()));
            int iE02 = this.f148296g ? interfaceC15763w.E0(this.f148297h.c(interfaceC15763w.getLayoutDirection())) : interfaceC15763w.E0(D.f(this.f148297h, interfaceC15763w.getLayoutDirection()));
            int iE03 = interfaceC15763w.E0(this.f148297h.getTop());
            int iE04 = interfaceC15763w.E0(this.f148297h.getBottom());
            int i10 = iE03 + iE04;
            int i11 = iE0 + iE02;
            boolean z11 = this.f148296g;
            int i12 = z11 ? i10 : i11;
            int i13 = (!z11 || this.f148298i) ? (z11 && this.f148298i) ? iE04 : (z11 || this.f148298i) ? iE02 : iE0 : iE03;
            int i14 = i12 - i13;
            long jI = H1.c.i(j10, -i11, -i10);
            InterfaceC15350j interfaceC15350jInvoke = this.f148299j.invoke();
            interfaceC15350jInvoke.getItemScope().i(H1.b.l(jI), H1.b.k(jI));
            if (this.f148296g) {
                C5658d.m mVar = this.f148300k;
                if (mVar == null) {
                    C14589e.b("null verticalArrangement when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                spacing = mVar.getSpacing();
            } else {
                C5658d.e eVar = this.f148301l;
                if (eVar == null) {
                    C14589e.b("null horizontalAlignment when isVertical == false");
                    throw new KotlinNothingValueException();
                }
                spacing = eVar.getSpacing();
            }
            int iE05 = interfaceC15763w.E0(spacing);
            int iA = interfaceC15350jInvoke.a();
            int iK = this.f148296g ? H1.b.k(j10) - i10 : H1.b.l(j10) - i11;
            if (!this.f148298i || iK > 0) {
                interfaceC15350j = interfaceC15350jInvoke;
                jF = H1.n.f((iE0 << 32) | (iE03 & 4294967295L));
            } else {
                boolean z12 = this.f148296g;
                if (!z12) {
                    iE0 += iK;
                }
                if (z12) {
                    iE03 += iK;
                }
                interfaceC15350j = interfaceC15350jInvoke;
                jF = H1.n.f((iE0 << 32) | (iE03 & 4294967295L));
            }
            long j11 = jF;
            InterfaceC15350j interfaceC15350j2 = interfaceC15350j;
            C2280b c2280b = new C2280b(jI, this.f148296g, interfaceC15350j2, interfaceC15763w, iA, iE05, this.f148306q, this.f148307r, this.f148298i, i13, i14, j11, this.f148295f);
            g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            C15339A c15339a = this.f148295f;
            androidx.compose.runtime.snapshots.g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            androidx.compose.runtime.snapshots.g gVarE = companion.e(gVarD);
            try {
                int iN = c15339a.N(interfaceC15350j2, c15339a.s());
                int iT = c15339a.t();
                Unit unit = Unit.f142422a;
                companion.l(gVarD, gVarE, function1G);
                q qVarE = p.e(iA, c2280b, iK, i13, i14, iE05, iN, iT, (interfaceC15763w.v0() || !z10) ? this.f148295f.getScrollToBeConsumed() : this.f148295f.E(), jI, this.f148296g, this.f148300k, this.f148301l, this.f148298i, interfaceC15763w, this.f148295f.w(), this.f148302m, C15752l.a(interfaceC15350j2, this.f148295f.getPinnedItems(), this.f148295f.getBeyondBoundsInfo()), z10, interfaceC15763w.v0(), this.f148295f.getApproachLayoutInfo(), this.f148303n, this.f148295f.B(), this.f148304o, this.f148305p, new a(interfaceC15763w, j10, i11, i10));
                C15339A.n(this.f148295f, qVarE, interfaceC15763w.v0(), false, 4, null);
                return qVarE;
            } catch (Throwable th2) {
                companion.l(gVarD, gVarE, function1G);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ q invoke(InterfaceC15763w interfaceC15763w, H1.b bVar) {
            return a(interfaceC15763w, bVar.getValue());
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
    public static final void a(androidx.compose.ui.Modifier r29, l0.C15339A r30, j0.InterfaceC14794C r31, boolean r32, boolean r33, kotlin.InterfaceC13820s r34, boolean r35, d0.J r36, int r37, P0.e.b r38, androidx.compose.foundation.layout.C5658d.m r39, P0.e.c r40, androidx.compose.foundation.layout.C5658d.e r41, kotlin.jvm.functions.Function1<? super l0.w, kotlin.Unit> r42, androidx.compose.runtime.Composer r43, int r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 887
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.C15353m.a(androidx.compose.ui.Modifier, l0.A, j0.C, boolean, boolean, f0.s, boolean, d0.J, int, P0.e$b, androidx.compose.foundation.layout.d$m, P0.e$c, androidx.compose.foundation.layout.d$e, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
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
    private static final kotlin.jvm.functions.Function2<kotlin.InterfaceC15763w, H1.b, androidx.compose.ui.layout.J> b(kotlin.jvm.functions.Function0<? extends l0.InterfaceC15350j> r21, l0.C15339A r22, j0.InterfaceC14794C r23, boolean r24, boolean r25, int r26, P0.e.b r27, P0.e.c r28, androidx.compose.foundation.layout.C5658d.e r29, androidx.compose.foundation.layout.C5658d.m r30, qv.InterfaceC16622O r31, V0.InterfaceC5310d1 r32, kotlin.InterfaceC15741a0 r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.C15353m.b(kotlin.jvm.functions.Function0, l0.A, j0.C, boolean, boolean, int, P0.e$b, P0.e$c, androidx.compose.foundation.layout.d$e, androidx.compose.foundation.layout.d$m, qv.O, V0.d1, n0.a0, androidx.compose.runtime.Composer, int, int):kotlin.jvm.functions.Function2");
    }
}
