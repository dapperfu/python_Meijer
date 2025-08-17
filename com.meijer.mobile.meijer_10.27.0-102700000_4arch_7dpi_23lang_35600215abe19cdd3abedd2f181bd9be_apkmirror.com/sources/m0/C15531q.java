package m0;

import V0.InterfaceC5310d1;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.f0;
import d0.C13444k;
import i0.C14589e;
import j0.InterfaceC14794C;
import java.util.ArrayList;
import java.util.List;
import kotlin.C15733T;
import kotlin.C15752l;
import kotlin.EnumC13827z;
import kotlin.InterfaceC13820s;
import kotlin.InterfaceC15741a0;
import kotlin.InterfaceC15763w;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import m0.C15511H;
import qv.InterfaceC16622O;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008a\u0001\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u008a\u0001\u0010(\u001a\u0019\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0$¢\u0006\u0002\b\u00172\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0003¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lm0/I;", "state", "Lm0/F;", "slots", "Lj0/C;", "contentPadding", "", "reverseLayout", "isVertical", "Lf0/s;", "flingBehavior", "userScrollEnabled", "Ld0/J;", "overscrollEffect", "Landroidx/compose/foundation/layout/d$m;", "verticalArrangement", "Landroidx/compose/foundation/layout/d$e;", "horizontalArrangement", "Lkotlin/Function1;", "Lm0/C;", "", "Lkotlin/ExtensionFunctionType;", "content", "a", "(Landroidx/compose/ui/Modifier;Lm0/I;Lm0/F;Lj0/C;ZZLf0/s;ZLd0/J;Landroidx/compose/foundation/layout/d$m;Landroidx/compose/foundation/layout/d$e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Lkotlin/Function0;", "Lm0/k;", "itemProviderLambda", "Lqv/O;", "coroutineScope", "LV0/d1;", "graphicsContext", "Ln0/a0;", "stickyItemsScrollBehavior", "Lkotlin/Function2;", "Ln0/w;", "LH1/b;", "Landroidx/compose/ui/layout/J;", "b", "(Lkotlin/jvm/functions/Function0;Lm0/I;Lm0/F;Lj0/C;ZZLandroidx/compose/foundation/layout/d$e;Landroidx/compose/foundation/layout/d$m;Lqv/O;LV0/d1;Ln0/a0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: m0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15531q {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: m0.q$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f149630f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C15512I f149631g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC15509F f149632h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC14794C f149633i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f149634j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f149635k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC13820s f149636l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f149637m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ d0.J f149638n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ C5658d.m f149639o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ C5658d.e f149640p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC15506C, Unit> f149641q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f149642r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f149643s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f149644t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Modifier modifier, C15512I c15512i, InterfaceC15509F interfaceC15509F, InterfaceC14794C interfaceC14794C, boolean z10, boolean z11, InterfaceC13820s interfaceC13820s, boolean z12, d0.J j10, C5658d.m mVar, C5658d.e eVar, Function1<? super InterfaceC15506C, Unit> function1, int i10, int i11, int i12) {
            super(2);
            this.f149630f = modifier;
            this.f149631g = c15512i;
            this.f149632h = interfaceC15509F;
            this.f149633i = interfaceC14794C;
            this.f149634j = z10;
            this.f149635k = z11;
            this.f149636l = interfaceC13820s;
            this.f149637m = z12;
            this.f149638n = j10;
            this.f149639o = mVar;
            this.f149640p = eVar;
            this.f149641q = function1;
            this.f149642r = i10;
            this.f149643s = i11;
            this.f149644t = i12;
        }

        public final void a(Composer composer, int i10) {
            C15531q.a(this.f149630f, this.f149631g, this.f149632h, this.f149633i, this.f149634j, this.f149635k, this.f149636l, this.f149637m, this.f149638n, this.f149639o, this.f149640p, this.f149641q, composer, J0.a(this.f149642r | 1), J0.a(this.f149643s), this.f149644t);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln0/w;", "LH1/b;", "containerConstraints", "Lm0/u;", "a", "(Ln0/w;J)Lm0/u;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: m0.q$b */
    static final class b extends Lambda implements Function2<InterfaceC15763w, H1.b, C15535u> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C15512I f149645f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f149646g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC14794C f149647h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f149648i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<InterfaceC15525k> f149649j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC15509F f149650k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ C5658d.m f149651l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ C5658d.e f149652m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC16622O f149653n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC5310d1 f149654o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ InterfaceC15741a0 f149655p;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "width", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/f0$a;", "", "Lkotlin/ExtensionFunctionType;", "placement", "Landroidx/compose/ui/layout/J;", "a", "(IILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: m0.q$b$a */
        static final class a extends Lambda implements Function3<Integer, Integer, Function1<? super f0.a, ? extends Unit>, androidx.compose.ui.layout.J> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC15763w f149656f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ long f149657g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f149658h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f149659i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC15763w interfaceC15763w, long j10, int i10, int i11) {
                super(3);
                this.f149656f = interfaceC15763w;
                this.f149657g = j10;
                this.f149658h = i10;
                this.f149659i = i11;
            }

            public final androidx.compose.ui.layout.J a(int i10, int i11, Function1<? super f0.a, Unit> function1) {
                return this.f149656f.g1(H1.c.g(this.f149657g, i10 + this.f149658h), H1.c.f(this.f149657g, i11 + this.f149659i), MapsKt.k(), function1);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.J invoke(Integer num, Integer num2, Function1<? super f0.a, ? extends Unit> function1) {
                return a(num.intValue(), num2.intValue(), function1);
            }
        }

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001Jb\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"m0/q$b$b", "Lm0/w;", "", "index", "", "key", "contentType", "crossAxisSize", "mainAxisSpacing", "", "Landroidx/compose/ui/layout/f0;", "placeables", "LH1/b;", "constraints", "lane", "span", "Lm0/v;", "b", "(ILjava/lang/Object;Ljava/lang/Object;IILjava/util/List;JII)Lm0/v;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: m0.q$b$b, reason: collision with other inner class name */
        public static final class C2297b extends AbstractC15537w {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC15763w f149660d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C15512I f149661e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f149662f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f149663g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f149664h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f149665i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ long f149666j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2297b(InterfaceC15525k interfaceC15525k, InterfaceC15763w interfaceC15763w, int i10, C15512I c15512i, boolean z10, boolean z11, int i11, int i12, long j10) {
                super(interfaceC15525k, interfaceC15763w, i10);
                this.f149660d = interfaceC15763w;
                this.f149661e = c15512i;
                this.f149662f = z10;
                this.f149663g = z11;
                this.f149664h = i11;
                this.f149665i = i12;
                this.f149666j = j10;
            }

            @Override // m0.AbstractC15537w
            public C15536v b(int index, Object key, Object contentType, int crossAxisSize, int mainAxisSpacing, List<? extends f0> placeables, long constraints, int lane, int span) {
                return new C15536v(index, key, this.f149662f, crossAxisSize, mainAxisSpacing, this.f149663g, this.f149660d.getLayoutDirection(), this.f149664h, this.f149665i, placeables, this.f149666j, contentType, this.f149661e.t(), constraints, lane, span, null);
            }
        }

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"m0/q$b$c", "Lm0/y;", "", "index", "", "Lm0/v;", "items", "", "Lm0/c;", "spans", "mainAxisSpacing", "Lm0/x;", "b", "(I[Lm0/v;Ljava/util/List;I)Lm0/x;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: m0.q$b$c */
        public static final class c extends AbstractC15539y {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f149667g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ C15508E f149668h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(boolean z10, C15508E c15508e, int i10, int i11, C2297b c2297b, C15511H c15511h) {
                super(z10, c15508e, i10, i11, c2297b, c15511h);
                this.f149667g = z10;
                this.f149668h = c15508e;
            }

            @Override // m0.AbstractC15539y
            public C15538x b(int index, C15536v[] items, List<C15517c> spans, int mainAxisSpacing) {
                return new C15538x(index, items, this.f149668h, spans, this.f149667g, mainAxisSpacing);
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00030\u0002j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003`\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "line", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "LH1/b;", "Lkotlin/collections/ArrayList;", "a", "(I)Ljava/util/ArrayList;"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: m0.q$b$d */
        static final class d extends Lambda implements Function1<Integer, ArrayList<Pair<? extends Integer, ? extends H1.b>>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C15511H f149669f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ c f149670g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C15511H c15511h, c cVar) {
                super(1);
                this.f149669f = c15511h;
                this.f149670g = cVar;
            }

            public final ArrayList<Pair<Integer, H1.b>> a(int i10) {
                C15511H.c cVarC = this.f149669f.c(i10);
                int firstItemIndex = cVarC.getFirstItemIndex();
                ArrayList<Pair<Integer, H1.b>> arrayList = new ArrayList<>(cVarC.b().size());
                List<C15517c> listB = cVarC.b();
                c cVar = this.f149670g;
                int size = listB.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    int iD = C15517c.d(listB.get(i12).getPackedValue());
                    arrayList.add(TuplesKt.a(Integer.valueOf(firstItemIndex), H1.b.a(cVar.a(i11, iD))));
                    firstItemIndex++;
                    i11 += iD;
                }
                return arrayList;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ ArrayList<Pair<? extends Integer, ? extends H1.b>> invoke(Integer num) {
                return a(num.intValue());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(C15512I c15512i, boolean z10, InterfaceC14794C interfaceC14794C, boolean z11, Function0<? extends InterfaceC15525k> function0, InterfaceC15509F interfaceC15509F, C5658d.m mVar, C5658d.e eVar, InterfaceC16622O interfaceC16622O, InterfaceC5310d1 interfaceC5310d1, InterfaceC15741a0 interfaceC15741a0) {
            super(2);
            this.f149645f = c15512i;
            this.f149646g = z10;
            this.f149647h = interfaceC14794C;
            this.f149648i = z11;
            this.f149649j = function0;
            this.f149650k = interfaceC15509F;
            this.f149651l = mVar;
            this.f149652m = eVar;
            this.f149653n = interfaceC16622O;
            this.f149654o = interfaceC5310d1;
            this.f149655p = interfaceC15741a0;
        }

        public final C15535u a(InterfaceC15763w interfaceC15763w, long j10) {
            float spacing;
            long jF;
            int iD;
            int i10;
            int iQ;
            C15733T.a(this.f149645f.v());
            boolean z10 = this.f149645f.getHasLookaheadOccurred() || interfaceC15763w.v0();
            C13444k.a(j10, this.f149646g ? EnumC13827z.f130585a : EnumC13827z.f130586b);
            int iE0 = this.f149646g ? interfaceC15763w.E0(this.f149647h.b(interfaceC15763w.getLayoutDirection())) : interfaceC15763w.E0(androidx.compose.foundation.layout.D.g(this.f149647h, interfaceC15763w.getLayoutDirection()));
            int iE02 = this.f149646g ? interfaceC15763w.E0(this.f149647h.c(interfaceC15763w.getLayoutDirection())) : interfaceC15763w.E0(androidx.compose.foundation.layout.D.f(this.f149647h, interfaceC15763w.getLayoutDirection()));
            int iE03 = interfaceC15763w.E0(this.f149647h.getTop());
            int iE04 = interfaceC15763w.E0(this.f149647h.getBottom());
            int i11 = iE03 + iE04;
            int i12 = iE0 + iE02;
            boolean z11 = this.f149646g;
            int i13 = z11 ? i11 : i12;
            if (z11 && !this.f149648i) {
                iE02 = iE03;
            } else if (z11 && this.f149648i) {
                iE02 = iE04;
            } else if (!z11 && !this.f149648i) {
                iE02 = iE0;
            }
            int i14 = i13 - iE02;
            long jI = H1.c.i(j10, -i12, -i11);
            InterfaceC15525k interfaceC15525kInvoke = this.f149649j.invoke();
            C15511H c15511hI = interfaceC15525kInvoke.i();
            C15508E c15508eA = this.f149650k.a(interfaceC15763w, jI);
            int length = c15508eA.getSizes().length;
            c15511hI.h(length);
            if (this.f149646g) {
                C5658d.m mVar = this.f149651l;
                if (mVar == null) {
                    C14589e.b("null verticalArrangement when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                spacing = mVar.getSpacing();
            } else {
                C5658d.e eVar = this.f149652m;
                if (eVar == null) {
                    C14589e.b("null horizontalArrangement when isVertical == false");
                    throw new KotlinNothingValueException();
                }
                spacing = eVar.getSpacing();
            }
            int iE05 = interfaceC15763w.E0(spacing);
            int iA = interfaceC15525kInvoke.a();
            int iK = this.f149646g ? H1.b.k(j10) - i11 : H1.b.l(j10) - i12;
            int i15 = iE02;
            if (!this.f149648i || iK > 0) {
                jF = H1.n.f((iE0 << 32) | (iE03 & 4294967295L));
            } else {
                boolean z12 = this.f149646g;
                if (!z12) {
                    iE0 += iK;
                }
                if (z12) {
                    iE03 += iK;
                }
                jF = H1.n.f((iE0 << 32) | (iE03 & 4294967295L));
            }
            C2297b c2297b = new C2297b(interfaceC15525kInvoke, interfaceC15763w, iE05, this.f149645f, this.f149646g, this.f149648i, i15, i14, jF);
            c cVar = new c(this.f149646g, c15508eA, iA, iE05, c2297b, c15511hI);
            d dVar = new d(c15511hI, cVar);
            g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            C15512I c15512i = this.f149645f;
            androidx.compose.runtime.snapshots.g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            androidx.compose.runtime.snapshots.g gVarE = companion.e(gVarD);
            try {
                int iK2 = c15512i.K(interfaceC15525kInvoke, c15512i.p());
                if (iK2 < iA || iA <= 0) {
                    iD = c15511hI.d(iK2);
                    i10 = i14;
                    iQ = c15512i.q();
                } else {
                    iD = c15511hI.d(iA - 1);
                    i10 = i14;
                    iQ = 0;
                }
                Unit unit = Unit.f142422a;
                companion.l(gVarD, gVarE, function1G);
                C15535u c15535uE = C15534t.e(iA, cVar, c2297b, iK, i15, i10, iE05, iD, iQ, (interfaceC15763w.v0() || !z10) ? this.f149645f.getScrollToBeConsumed() : this.f149645f.B(), jI, this.f149646g, this.f149651l, this.f149652m, this.f149648i, interfaceC15763w, this.f149645f.t(), length, C15752l.a(interfaceC15525kInvoke, this.f149645f.getPinnedItems(), this.f149645f.getBeyondBoundsInfo()), z10, interfaceC15763w.v0(), this.f149645f.getApproachLayoutInfo(), this.f149653n, this.f149645f.y(), this.f149654o, dVar, this.f149655p, new a(interfaceC15763w, j10, i12, i11));
                C15512I.l(this.f149645f, c15535uE, interfaceC15763w.v0(), false, 4, null);
                return c15535uE;
            } catch (Throwable th2) {
                companion.l(gVarD, gVarE, function1G);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ C15535u invoke(InterfaceC15763w interfaceC15763w, H1.b bVar) {
            return a(interfaceC15763w, bVar.getValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(androidx.compose.ui.Modifier r23, m0.C15512I r24, m0.InterfaceC15509F r25, j0.InterfaceC14794C r26, boolean r27, boolean r28, kotlin.InterfaceC13820s r29, boolean r30, d0.J r31, androidx.compose.foundation.layout.C5658d.m r32, androidx.compose.foundation.layout.C5658d.e r33, kotlin.jvm.functions.Function1<? super m0.InterfaceC15506C, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, int r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C15531q.a(androidx.compose.ui.Modifier, m0.I, m0.F, j0.C, boolean, boolean, f0.s, boolean, d0.J, androidx.compose.foundation.layout.d$m, androidx.compose.foundation.layout.d$e, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008f A[PHI: r3
      0x008f: PHI (r3v23 boolean) = (r3v21 boolean), (r3v24 boolean) binds: [B:44:0x008d, B:40:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.jvm.functions.Function2<kotlin.InterfaceC15763w, H1.b, androidx.compose.ui.layout.J> b(kotlin.jvm.functions.Function0<? extends m0.InterfaceC15525k> r18, m0.C15512I r19, m0.InterfaceC15509F r20, j0.InterfaceC14794C r21, boolean r22, boolean r23, androidx.compose.foundation.layout.C5658d.e r24, androidx.compose.foundation.layout.C5658d.m r25, qv.InterfaceC16622O r26, V0.InterfaceC5310d1 r27, kotlin.InterfaceC15741a0 r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C15531q.b(kotlin.jvm.functions.Function0, m0.I, m0.F, j0.C, boolean, boolean, androidx.compose.foundation.layout.d$e, androidx.compose.foundation.layout.d$m, qv.O, V0.d1, n0.a0, androidx.compose.runtime.Composer, int, int):kotlin.jvm.functions.Function2");
    }
}
