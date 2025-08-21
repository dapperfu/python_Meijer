package m0;

import V0.InterfaceC5453d1;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.snapshots.g;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.f0;
import d0.C13577k;
import i0.C14592e;
import j0.InterfaceC14882C;
import java.util.ArrayList;
import java.util.List;
import kotlin.C15860T;
import kotlin.C15879l;
import kotlin.EnumC13937z;
import kotlin.InterfaceC13930s;
import kotlin.InterfaceC15868a0;
import kotlin.InterfaceC15890w;
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
import m0.C15622H;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008a\u0001\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0002\b\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u008a\u0001\u0010(\u001a\u0019\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'0$¢\u0006\u0002\b\u00172\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0003¢\u0006\u0004\b(\u0010)¨\u0006*"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lm0/I;", "state", "Lm0/F;", "slots", "Lj0/C;", "contentPadding", "", "reverseLayout", "isVertical", "Lf0/s;", "flingBehavior", "userScrollEnabled", "Ld0/J;", "overscrollEffect", "Landroidx/compose/foundation/layout/d$m;", "verticalArrangement", "Landroidx/compose/foundation/layout/d$e;", "horizontalArrangement", "Lkotlin/Function1;", "Lm0/C;", "", "Lkotlin/ExtensionFunctionType;", "content", "a", "(Landroidx/compose/ui/Modifier;Lm0/I;Lm0/F;Lj0/C;ZZLf0/s;ZLd0/J;Landroidx/compose/foundation/layout/d$m;Landroidx/compose/foundation/layout/d$e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Lkotlin/Function0;", "Lm0/k;", "itemProviderLambda", "Lmv/O;", "coroutineScope", "LV0/d1;", "graphicsContext", "Ln0/a0;", "stickyItemsScrollBehavior", "Lkotlin/Function2;", "Ln0/w;", "LH1/b;", "Landroidx/compose/ui/layout/J;", "b", "(Lkotlin/jvm/functions/Function0;Lm0/I;Lm0/F;Lj0/C;ZZLandroidx/compose/foundation/layout/d$e;Landroidx/compose/foundation/layout/d$m;Lmv/O;LV0/d1;Ln0/a0;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: m0.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15642q {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: m0.q$a */
    static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f150372f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ C15623I f150373g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC15620F f150374h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f150375i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ boolean f150376j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f150377k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ InterfaceC13930s f150378l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f150379m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ d0.J f150380n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ C5800d.m f150381o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ C5800d.e f150382p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ Function1<InterfaceC15617C, Unit> f150383q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f150384r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ int f150385s;

        /* renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f150386t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Modifier modifier, C15623I c15623i, InterfaceC15620F interfaceC15620F, InterfaceC14882C interfaceC14882C, boolean z10, boolean z11, InterfaceC13930s interfaceC13930s, boolean z12, d0.J j10, C5800d.m mVar, C5800d.e eVar, Function1<? super InterfaceC15617C, Unit> function1, int i10, int i11, int i12) {
            super(2);
            this.f150372f = modifier;
            this.f150373g = c15623i;
            this.f150374h = interfaceC15620F;
            this.f150375i = interfaceC14882C;
            this.f150376j = z10;
            this.f150377k = z11;
            this.f150378l = interfaceC13930s;
            this.f150379m = z12;
            this.f150380n = j10;
            this.f150381o = mVar;
            this.f150382p = eVar;
            this.f150383q = function1;
            this.f150384r = i10;
            this.f150385s = i11;
            this.f150386t = i12;
        }

        public final void a(Composer composer, int i10) {
            C15642q.a(this.f150372f, this.f150373g, this.f150374h, this.f150375i, this.f150376j, this.f150377k, this.f150378l, this.f150379m, this.f150380n, this.f150381o, this.f150382p, this.f150383q, composer, J0.a(this.f150384r | 1), J0.a(this.f150385s), this.f150386t);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ln0/w;", "LH1/b;", "containerConstraints", "Lm0/u;", "a", "(Ln0/w;J)Lm0/u;"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: m0.q$b */
    static final class b extends Lambda implements Function2<InterfaceC15890w, H1.b, C15646u> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ C15623I f150387f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f150388g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC14882C f150389h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f150390i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Function0<InterfaceC15636k> f150391j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ InterfaceC15620F f150392k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ C5800d.m f150393l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ C5800d.e f150394m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ InterfaceC15783O f150395n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC5453d1 f150396o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ InterfaceC15868a0 f150397p;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "width", "height", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/f0$a;", "", "Lkotlin/ExtensionFunctionType;", "placement", "Landroidx/compose/ui/layout/J;", "a", "(IILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
        /* renamed from: m0.q$b$a */
        static final class a extends Lambda implements Function3<Integer, Integer, Function1<? super f0.a, ? extends Unit>, androidx.compose.ui.layout.J> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ InterfaceC15890w f150398f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ long f150399g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f150400h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f150401i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(InterfaceC15890w interfaceC15890w, long j10, int i10, int i11) {
                super(3);
                this.f150398f = interfaceC15890w;
                this.f150399g = j10;
                this.f150400h = i10;
                this.f150401i = i11;
            }

            public final androidx.compose.ui.layout.J a(int i10, int i11, Function1<? super f0.a, Unit> function1) {
                return this.f150398f.g1(H1.c.g(this.f150399g, i10 + this.f150400h), H1.c.f(this.f150399g, i11 + this.f150401i), MapsKt.k(), function1);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ androidx.compose.ui.layout.J invoke(Integer num, Integer num2, Function1<? super f0.a, ? extends Unit> function1) {
                return a(num.intValue(), num2.intValue(), function1);
            }
        }

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001Jb\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"m0/q$b$b", "Lm0/w;", "", "index", "", "key", "contentType", "crossAxisSize", "mainAxisSpacing", "", "Landroidx/compose/ui/layout/f0;", "placeables", "LH1/b;", "constraints", "lane", "span", "Lm0/v;", "b", "(ILjava/lang/Object;Ljava/lang/Object;IILjava/util/List;JII)Lm0/v;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: m0.q$b$b, reason: collision with other inner class name */
        public static final class C2319b extends AbstractC15648w {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ InterfaceC15890w f150402d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ C15623I f150403e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ boolean f150404f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f150405g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f150406h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f150407i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ long f150408j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2319b(InterfaceC15636k interfaceC15636k, InterfaceC15890w interfaceC15890w, int i10, C15623I c15623i, boolean z10, boolean z11, int i11, int i12, long j10) {
                super(interfaceC15636k, interfaceC15890w, i10);
                this.f150402d = interfaceC15890w;
                this.f150403e = c15623i;
                this.f150404f = z10;
                this.f150405g = z11;
                this.f150406h = i11;
                this.f150407i = i12;
                this.f150408j = j10;
            }

            @Override // m0.AbstractC15648w
            public C15647v b(int index, Object key, Object contentType, int crossAxisSize, int mainAxisSpacing, List<? extends f0> placeables, long constraints, int lane, int span) {
                return new C15647v(index, key, this.f150404f, crossAxisSize, mainAxisSpacing, this.f150405g, this.f150402d.getLayoutDirection(), this.f150406h, this.f150407i, placeables, this.f150408j, contentType, this.f150403e.t(), constraints, lane, span, null);
            }
        }

        @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"m0/q$b$c", "Lm0/y;", "", "index", "", "Lm0/v;", "items", "", "Lm0/c;", "spans", "mainAxisSpacing", "Lm0/x;", "b", "(I[Lm0/v;Ljava/util/List;I)Lm0/x;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: m0.q$b$c */
        public static final class c extends AbstractC15650y {

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ boolean f150409g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ C15619E f150410h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(boolean z10, C15619E c15619e, int i10, int i11, C2319b c2319b, C15622H c15622h) {
                super(z10, c15619e, i10, i11, c2319b, c15622h);
                this.f150409g = z10;
                this.f150410h = c15619e;
            }

            @Override // m0.AbstractC15650y
            public C15649x b(int index, C15647v[] items, List<C15628c> spans, int mainAxisSpacing) {
                return new C15649x(index, items, this.f150410h, spans, this.f150409g, mainAxisSpacing);
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00030\u0002j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u0003`\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "line", "Ljava/util/ArrayList;", "Lkotlin/Pair;", "LH1/b;", "Lkotlin/collections/ArrayList;", "a", "(I)Ljava/util/ArrayList;"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: m0.q$b$d */
        static final class d extends Lambda implements Function1<Integer, ArrayList<Pair<? extends Integer, ? extends H1.b>>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ C15622H f150411f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ c f150412g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(C15622H c15622h, c cVar) {
                super(1);
                this.f150411f = c15622h;
                this.f150412g = cVar;
            }

            public final ArrayList<Pair<Integer, H1.b>> a(int i10) {
                C15622H.c cVarC = this.f150411f.c(i10);
                int firstItemIndex = cVarC.getFirstItemIndex();
                ArrayList<Pair<Integer, H1.b>> arrayList = new ArrayList<>(cVarC.b().size());
                List<C15628c> listB = cVarC.b();
                c cVar = this.f150412g;
                int size = listB.size();
                int i11 = 0;
                for (int i12 = 0; i12 < size; i12++) {
                    int iD = C15628c.d(listB.get(i12).getPackedValue());
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
        b(C15623I c15623i, boolean z10, InterfaceC14882C interfaceC14882C, boolean z11, Function0<? extends InterfaceC15636k> function0, InterfaceC15620F interfaceC15620F, C5800d.m mVar, C5800d.e eVar, InterfaceC15783O interfaceC15783O, InterfaceC5453d1 interfaceC5453d1, InterfaceC15868a0 interfaceC15868a0) {
            super(2);
            this.f150387f = c15623i;
            this.f150388g = z10;
            this.f150389h = interfaceC14882C;
            this.f150390i = z11;
            this.f150391j = function0;
            this.f150392k = interfaceC15620F;
            this.f150393l = mVar;
            this.f150394m = eVar;
            this.f150395n = interfaceC15783O;
            this.f150396o = interfaceC5453d1;
            this.f150397p = interfaceC15868a0;
        }

        public final C15646u a(InterfaceC15890w interfaceC15890w, long j10) {
            float spacing;
            long jF;
            int iD;
            int i10;
            int iQ;
            C15860T.a(this.f150387f.v());
            boolean z10 = this.f150387f.getHasLookaheadOccurred() || interfaceC15890w.v0();
            C13577k.a(j10, this.f150388g ? EnumC13937z.f131419a : EnumC13937z.f131420b);
            int iE0 = this.f150388g ? interfaceC15890w.E0(this.f150389h.b(interfaceC15890w.getLayoutDirection())) : interfaceC15890w.E0(androidx.compose.foundation.layout.D.g(this.f150389h, interfaceC15890w.getLayoutDirection()));
            int iE02 = this.f150388g ? interfaceC15890w.E0(this.f150389h.c(interfaceC15890w.getLayoutDirection())) : interfaceC15890w.E0(androidx.compose.foundation.layout.D.f(this.f150389h, interfaceC15890w.getLayoutDirection()));
            int iE03 = interfaceC15890w.E0(this.f150389h.getTop());
            int iE04 = interfaceC15890w.E0(this.f150389h.getBottom());
            int i11 = iE03 + iE04;
            int i12 = iE0 + iE02;
            boolean z11 = this.f150388g;
            int i13 = z11 ? i11 : i12;
            if (z11 && !this.f150390i) {
                iE02 = iE03;
            } else if (z11 && this.f150390i) {
                iE02 = iE04;
            } else if (!z11 && !this.f150390i) {
                iE02 = iE0;
            }
            int i14 = i13 - iE02;
            long jI = H1.c.i(j10, -i12, -i11);
            InterfaceC15636k interfaceC15636kInvoke = this.f150391j.invoke();
            C15622H c15622hI = interfaceC15636kInvoke.i();
            C15619E c15619eA = this.f150392k.a(interfaceC15890w, jI);
            int length = c15619eA.getSizes().length;
            c15622hI.h(length);
            if (this.f150388g) {
                C5800d.m mVar = this.f150393l;
                if (mVar == null) {
                    C14592e.b("null verticalArrangement when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                spacing = mVar.getSpacing();
            } else {
                C5800d.e eVar = this.f150394m;
                if (eVar == null) {
                    C14592e.b("null horizontalArrangement when isVertical == false");
                    throw new KotlinNothingValueException();
                }
                spacing = eVar.getSpacing();
            }
            int iE05 = interfaceC15890w.E0(spacing);
            int iA = interfaceC15636kInvoke.a();
            int iK = this.f150388g ? H1.b.k(j10) - i11 : H1.b.l(j10) - i12;
            int i15 = iE02;
            if (!this.f150390i || iK > 0) {
                jF = H1.n.f((iE0 << 32) | (iE03 & 4294967295L));
            } else {
                boolean z12 = this.f150388g;
                if (!z12) {
                    iE0 += iK;
                }
                if (z12) {
                    iE03 += iK;
                }
                jF = H1.n.f((iE0 << 32) | (iE03 & 4294967295L));
            }
            C2319b c2319b = new C2319b(interfaceC15636kInvoke, interfaceC15890w, iE05, this.f150387f, this.f150388g, this.f150390i, i15, i14, jF);
            c cVar = new c(this.f150388g, c15619eA, iA, iE05, c2319b, c15622hI);
            d dVar = new d(c15622hI, cVar);
            g.Companion companion = androidx.compose.runtime.snapshots.g.INSTANCE;
            C15623I c15623i = this.f150387f;
            androidx.compose.runtime.snapshots.g gVarD = companion.d();
            Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
            androidx.compose.runtime.snapshots.g gVarE = companion.e(gVarD);
            try {
                int iK2 = c15623i.K(interfaceC15636kInvoke, c15623i.p());
                if (iK2 < iA || iA <= 0) {
                    iD = c15622hI.d(iK2);
                    i10 = i14;
                    iQ = c15623i.q();
                } else {
                    iD = c15622hI.d(iA - 1);
                    i10 = i14;
                    iQ = 0;
                }
                Unit unit = Unit.f143329a;
                companion.l(gVarD, gVarE, function1G);
                C15646u c15646uE = C15645t.e(iA, cVar, c2319b, iK, i15, i10, iE05, iD, iQ, (interfaceC15890w.v0() || !z10) ? this.f150387f.getScrollToBeConsumed() : this.f150387f.B(), jI, this.f150388g, this.f150393l, this.f150394m, this.f150390i, interfaceC15890w, this.f150387f.t(), length, C15879l.a(interfaceC15636kInvoke, this.f150387f.getPinnedItems(), this.f150387f.getBeyondBoundsInfo()), z10, interfaceC15890w.v0(), this.f150387f.getApproachLayoutInfo(), this.f150395n, this.f150387f.y(), this.f150396o, dVar, this.f150397p, new a(interfaceC15890w, j10, i12, i11));
                C15623I.l(this.f150387f, c15646uE, interfaceC15890w.v0(), false, 4, null);
                return c15646uE;
            } catch (Throwable th2) {
                companion.l(gVarD, gVarE, function1G);
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ C15646u invoke(InterfaceC15890w interfaceC15890w, H1.b bVar) {
            return a(interfaceC15890w, bVar.getValue());
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
    public static final void a(androidx.compose.ui.Modifier r23, m0.C15623I r24, m0.InterfaceC15620F r25, j0.InterfaceC14882C r26, boolean r27, boolean r28, kotlin.InterfaceC13930s r29, boolean r30, d0.J r31, androidx.compose.foundation.layout.C5800d.m r32, androidx.compose.foundation.layout.C5800d.e r33, kotlin.jvm.functions.Function1<? super m0.InterfaceC15617C, kotlin.Unit> r34, androidx.compose.runtime.Composer r35, int r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C15642q.a(androidx.compose.ui.Modifier, m0.I, m0.F, j0.C, boolean, boolean, f0.s, boolean, d0.J, androidx.compose.foundation.layout.d$m, androidx.compose.foundation.layout.d$e, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008f A[PHI: r3
      0x008f: PHI (r3v23 boolean) = (r3v21 boolean), (r3v24 boolean) binds: [B:44:0x008d, B:40:0x0087] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final kotlin.jvm.functions.Function2<kotlin.InterfaceC15890w, H1.b, androidx.compose.ui.layout.J> b(kotlin.jvm.functions.Function0<? extends m0.InterfaceC15636k> r18, m0.C15623I r19, m0.InterfaceC15620F r20, j0.InterfaceC14882C r21, boolean r22, boolean r23, androidx.compose.foundation.layout.C5800d.e r24, androidx.compose.foundation.layout.C5800d.m r25, mv.InterfaceC15783O r26, V0.InterfaceC5453d1 r27, kotlin.InterfaceC15868a0 r28, androidx.compose.runtime.Composer r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C15642q.b(kotlin.jvm.functions.Function0, m0.I, m0.F, j0.C, boolean, boolean, androidx.compose.foundation.layout.d$e, androidx.compose.foundation.layout.d$m, mv.O, V0.d1, n0.a0, androidx.compose.runtime.Composer, int, int):kotlin.jvm.functions.Function2");
    }
}
