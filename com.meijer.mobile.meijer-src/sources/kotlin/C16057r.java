package kotlin;

import H1.t;
import P0.e;
import androidx.compose.foundation.layout.C5800d;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.f0;
import g0.C14294l;
import g0.InterfaceC14293k;
import i0.C14592e;
import java.util.ArrayList;
import java.util.List;
import kotlin.C15860T;
import kotlin.EnumC13937z;
import kotlin.InterfaceC15890w;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0003\u001añ\u0001\u0010)\u001a\u00020(*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2/\u0010'\u001a+\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\"¢\u0006\u0002\b%\u0012\u0004\u0012\u00020&0!H\u0000ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001aO\u0010/\u001a\b\u0012\u0004\u0012\u00020-0\u00192\u0006\u0010+\u001a\u00020\u00012\u0006\u0010,\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020-0\"H\u0002¢\u0006\u0004\b/\u00100\u001aG\u00102\u001a\b\u0012\u0004\u0012\u00020-0\u00192\u0006\u00101\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u00192\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020-0\"H\u0002¢\u0006\u0004\b2\u00103\u001aO\u00107\u001a\u0004\u0018\u00010-2\u0006\u00104\u001a\u00020\u00012\f\u00105\u001a\b\u0012\u0004\u0012\u00020-0\u00192\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u00106\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b7\u00108\u001aj\u0010=\u001a\u00020-*\u00020\u00002\u0006\u00109\u001a\u00020\u00012\u0006\u0010:\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010<\u001a\u00020;2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a\u0093\u0001\u0010J\u001a\b\u0012\u0004\u0012\u00020-0I*\u00020\u00002\f\u0010?\u001a\b\u0012\u0004\u0012\u00020-0\u00192\f\u0010@\u001a\b\u0012\u0004\u0012\u00020-0\u00192\f\u0010A\u001a\b\u0012\u0004\u0012\u00020-0\u00192\u0006\u0010B\u001a\u00020\u00012\u0006\u0010C\u001a\u00020\u00012\u0006\u0010D\u001a\u00020\u00012\u0006\u0010E\u001a\u00020\u00012\u0006\u0010F\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010H\u001a\u00020G2\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0001H\u0002¢\u0006\u0004\bJ\u0010K\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006L"}, d2 = {"Ln0/w;", "", "pageCount", "Lo0/q;", "pagerItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenPages", "currentPage", "currentPageOffset", "LH1/b;", "constraints", "Lf0/z;", "orientation", "LP0/e$c;", "verticalAlignment", "LP0/e$b;", "horizontalAlignment", "", "reverseLayout", "LH1/n;", "visualPageOffset", "pageAvailableSize", "beyondViewportPageCount", "", "pinnedPages", "Lg0/k;", "snapPosition", "Ln0/T;", "placementScopeInvalidator", "Lmv/O;", "coroutineScope", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/f0$a;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/J;", "layout", "Lo0/t;", "h", "(Ln0/w;ILo0/q;IIIIIIJLf0/z;LP0/e$c;LP0/e$b;ZJIILjava/util/List;Lg0/k;Landroidx/compose/runtime/l0;Lmv/O;Lkotlin/jvm/functions/Function3;)Lo0/t;", "currentLastPage", "pagesCount", "Lo0/e;", "getAndMeasure", "e", "(IIILjava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "currentFirstPage", "f", "(IILjava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "viewportSize", "visiblePagesInfo", "itemSize", "b", "(ILjava/util/List;IIILg0/k;I)Lo0/e;", "index", "childConstraints", "LH1/t;", "layoutDirection", "g", "(Ln0/w;IJLo0/q;JLf0/z;LP0/e$b;LP0/e$c;LH1/t;ZI)Lo0/e;", "pages", "extraPagesBefore", "extraPagesAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "pagesScrollOffset", "LH1/d;", "density", "", "c", "(Ln0/w;Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIILf0/z;ZLH1/d;II)Ljava/util/List;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: o0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16057r {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: o0.r$a */
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Unit> f153513f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<C16044e> f153514g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: o0.r$a$a, reason: collision with other inner class name */
        static final class C2375a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List<C16044e> f153515f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2375a(List<C16044e> list) {
                super(1);
                this.f153515f = list;
            }

            public final void a(f0.a aVar) {
                List<C16044e> list = this.f153515f;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).g(aVar);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InterfaceC5872l0<Unit> interfaceC5872l0, List<C16044e> list) {
            super(1);
            this.f153513f = interfaceC5872l0;
            this.f153514g = list;
        }

        public final void a(f0.a aVar) {
            aVar.A(new C2375a(this.f153514g));
            C15860T.a(this.f153513f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: o0.r$b */
    static final class b extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f153516f = new b();

        b() {
            super(1);
        }

        public final void a(f0.a aVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lo0/e;", "a", "(I)Lo0/e;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: o0.r$c */
    static final class c extends Lambda implements Function1<Integer, C16044e> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC15890w f153517f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f153518g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C16056q f153519h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f153520i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ EnumC13937z f153521j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ e.b f153522k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ e.c f153523l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f153524m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f153525n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(InterfaceC15890w interfaceC15890w, long j10, C16056q c16056q, long j11, EnumC13937z enumC13937z, e.b bVar, e.c cVar, boolean z10, int i10) {
            super(1);
            this.f153517f = interfaceC15890w;
            this.f153518g = j10;
            this.f153519h = c16056q;
            this.f153520i = j11;
            this.f153521j = enumC13937z;
            this.f153522k = bVar;
            this.f153523l = cVar;
            this.f153524m = z10;
            this.f153525n = i10;
        }

        public final C16044e a(int i10) {
            InterfaceC15890w interfaceC15890w = this.f153517f;
            return C16057r.g(interfaceC15890w, i10, this.f153518g, this.f153519h, this.f153520i, this.f153521j, this.f153522k, this.f153523l, interfaceC15890w.getLayoutDirection(), this.f153524m, this.f153525n);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C16044e invoke(Integer num) {
            return a(num.intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lo0/e;", "a", "(I)Lo0/e;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: o0.r$d */
    static final class d extends Lambda implements Function1<Integer, C16044e> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC15890w f153526f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f153527g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ C16056q f153528h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ long f153529i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ EnumC13937z f153530j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ e.b f153531k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ e.c f153532l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ boolean f153533m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f153534n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(InterfaceC15890w interfaceC15890w, long j10, C16056q c16056q, long j11, EnumC13937z enumC13937z, e.b bVar, e.c cVar, boolean z10, int i10) {
            super(1);
            this.f153526f = interfaceC15890w;
            this.f153527g = j10;
            this.f153528h = c16056q;
            this.f153529i = j11;
            this.f153530j = enumC13937z;
            this.f153531k = bVar;
            this.f153532l = cVar;
            this.f153533m = z10;
            this.f153534n = i10;
        }

        public final C16044e a(int i10) {
            InterfaceC15890w interfaceC15890w = this.f153526f;
            return C16057r.g(interfaceC15890w, i10, this.f153527g, this.f153528h, this.f153529i, this.f153530j, this.f153531k, this.f153532l, interfaceC15890w.getLayoutDirection(), this.f153533m, this.f153534n);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C16044e invoke(Integer num) {
            return a(num.intValue());
        }
    }

    private static final List<C16044e> e(int i10, int i11, int i12, List<Integer> list, Function1<? super Integer, C16044e> function1) {
        int iMin = Math.min(i12 + i10, i11 - 1);
        int i13 = i10 + 1;
        ArrayList arrayList = null;
        if (i13 <= iMin) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i13)));
                if (i13 == iMin) {
                    break;
                }
                i13++;
            }
        }
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            int iIntValue = list.get(i14).intValue();
            if (iMin + 1 <= iIntValue && iIntValue < i11) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? CollectionsKt.m() : arrayList;
    }

    public static final C16059t h(InterfaceC15890w interfaceC15890w, int i10, C16056q c16056q, int i11, int i12, int i13, int i14, int i15, int i16, long j10, EnumC13937z enumC13937z, e.c cVar, e.b bVar, boolean z10, long j11, int i17, int i18, List<Integer> list, InterfaceC14293k interfaceC14293k, InterfaceC5872l0<Unit> interfaceC5872l0, InterfaceC15783O interfaceC15783O, Function3<? super Integer, ? super Integer, ? super Function1<? super f0.a, Unit>, ? extends J> function3) {
        int i19;
        boolean z11;
        int iMax;
        int i20;
        int i21;
        int i22;
        List<C16044e> arrayList;
        List arrayList2;
        List arrayList3;
        int i23;
        if (!(i12 >= 0)) {
            C14592e.a("negative beforeContentPadding");
        }
        if (!(i13 >= 0)) {
            C14592e.a("negative afterContentPadding");
        }
        int iF = RangesKt.f(i17 + i14, 0);
        if (i10 <= 0) {
            return new C16059t(CollectionsKt.m(), i17, i14, i13, enumC13937z, -i12, i11 + i13, false, i18, null, null, 0.0f, 0, false, interfaceC14293k, function3.invoke(Integer.valueOf(H1.b.n(j10)), Integer.valueOf(H1.b.m(j10)), b.f153516f), false, null, null, interfaceC15783O, 393216, null);
        }
        EnumC13937z enumC13937z2 = enumC13937z;
        EnumC13937z enumC13937z3 = EnumC13937z.f131419a;
        long jB = H1.c.b(0, enumC13937z2 == enumC13937z3 ? H1.b.l(j10) : i17, 0, enumC13937z2 != enumC13937z3 ? H1.b.k(j10) : i17, 5, null);
        int i24 = i15;
        int i25 = i16;
        while (i24 > 0 && i25 > 0) {
            i24--;
            i25 -= iF;
        }
        int i26 = i25 * (-1);
        if (i24 >= i10) {
            i24 = i10 - 1;
            i26 = 0;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i27 = -i12;
        int i28 = (i14 < 0 ? i14 : 0) + i27;
        int i29 = i26 + i28;
        int iMax2 = 0;
        while (i29 < 0 && i24 > 0) {
            int i30 = i24 - 1;
            C16044e c16044eG = g(interfaceC15890w, i30, jB, c16056q, j11, enumC13937z2, bVar, cVar, interfaceC15890w.getLayoutDirection(), z10, i17);
            arrayDeque.add(0, c16044eG);
            iMax2 = Math.max(iMax2, c16044eG.getCrossAxisSize());
            i29 += iF;
            i28 = i28;
            i24 = i30;
            enumC13937z2 = enumC13937z;
        }
        int i31 = i28;
        int i32 = iMax2;
        if (i29 < i31) {
            i29 = i31;
        }
        int i33 = i29 - i31;
        int i34 = i11 + i13;
        int i35 = i24;
        int iF2 = RangesKt.f(i34, 0);
        int i36 = -i33;
        int i37 = i35;
        int i38 = 0;
        boolean z12 = false;
        while (i38 < arrayDeque.size()) {
            if (i36 >= iF2) {
                arrayDeque.remove(i38);
                z12 = true;
            } else {
                i37++;
                i36 += iF;
                i38++;
            }
        }
        int iMax3 = i32;
        int i39 = i37;
        boolean z13 = z12;
        int i40 = i33;
        while (i39 < i10 && (i36 < iF2 || i36 <= 0 || arrayDeque.isEmpty())) {
            int i41 = iF2;
            int i42 = i39;
            C16044e c16044eG2 = g(interfaceC15890w, i42, jB, c16056q, j11, enumC13937z, bVar, cVar, interfaceC15890w.getLayoutDirection(), z10, i17);
            int i43 = i40;
            int i44 = i10 - 1;
            i36 += i42 == i44 ? i17 : iF;
            if (i36 > i31 || i42 == i44) {
                iMax3 = Math.max(iMax3, c16044eG2.getCrossAxisSize());
                arrayDeque.add(c16044eG2);
                i23 = i35;
                i40 = i43;
            } else {
                i23 = i42 + 1;
                i40 = i43 - iF;
                z13 = true;
            }
            i39 = i42 + 1;
            i35 = i23;
            iF2 = i41;
        }
        int i45 = i40;
        if (i36 < i11) {
            int i46 = i11 - i36;
            i20 = i45 - i46;
            i36 += i46;
            iMax = iMax3;
            i21 = i35;
            while (i20 < i12 && i21 > 0) {
                int i47 = i21 - 1;
                C16044e c16044eG3 = g(interfaceC15890w, i47, jB, c16056q, j11, enumC13937z, bVar, cVar, interfaceC15890w.getLayoutDirection(), z10, i17);
                arrayDeque.add(0, c16044eG3);
                iMax = Math.max(iMax, c16044eG3.getCrossAxisSize());
                i20 += iF;
                i39 = i39;
                i21 = i47;
            }
            i19 = i39;
            z11 = false;
            if (i20 < 0) {
                i36 += i20;
                i20 = 0;
            }
        } else {
            i19 = i39;
            z11 = false;
            iMax = iMax3;
            i20 = i45;
            i21 = i35;
        }
        if (!(i20 >= 0 ? true : z11)) {
            C14592e.a("invalid currentFirstPageScrollOffset");
        }
        int i48 = iMax;
        int i49 = -i20;
        C16044e c16044e = (C16044e) arrayDeque.first();
        if (i12 > 0 || i14 < 0) {
            int size = arrayDeque.size();
            i22 = i49;
            int i50 = 0;
            while (i50 < size && i20 != 0 && iF <= i20 && i50 != CollectionsKt.o(arrayDeque)) {
                i20 -= iF;
                i50++;
                c16044e = (C16044e) arrayDeque.get(i50);
            }
        } else {
            i22 = i49;
        }
        int i51 = i20;
        C16044e c16044e2 = c16044e;
        List<C16044e> listF = f(i21, i18, list, new d(interfaceC15890w, jB, c16056q, j11, enumC13937z, bVar, cVar, z10, i17));
        int size2 = listF.size();
        int iMax4 = i48;
        int i52 = 0;
        while (i52 < size2) {
            iMax4 = Math.max(iMax4, listF.get(i52).getCrossAxisSize());
            i52++;
            listF = listF;
        }
        List<C16044e> list2 = listF;
        List<C16044e> listE = e(((C16044e) arrayDeque.last()).getIndex(), i10, i18, list, new c(interfaceC15890w, jB, c16056q, j11, enumC13937z, bVar, cVar, z10, i17));
        int size3 = listE.size();
        for (int i53 = 0; i53 < size3; i53++) {
            iMax4 = Math.max(iMax4, listE.get(i53).getCrossAxisSize());
        }
        boolean z14 = Intrinsics.e(c16044e2, arrayDeque.first()) && list2.isEmpty() && listE.isEmpty();
        EnumC13937z enumC13937z4 = EnumC13937z.f131419a;
        int iG = H1.c.g(j10, enumC13937z == enumC13937z4 ? iMax4 : i36);
        if (enumC13937z == enumC13937z4) {
            iMax4 = i36;
        }
        int iF3 = H1.c.f(j10, iMax4);
        int i54 = i19;
        int i55 = i36;
        List<C16044e> listC = c(interfaceC15890w, arrayDeque, list2, listE, iG, iF3, i55, i11, i22, enumC13937z, z10, interfaceC15890w, i14, i17);
        if (z14) {
            arrayList = listC;
        } else {
            arrayList = new ArrayList<>(listC.size());
            int size4 = listC.size();
            int i56 = 0;
            while (i56 < size4) {
                C16044e c16044e3 = listC.get(i56);
                C16044e c16044e4 = c16044e3;
                C16044e c16044e5 = c16044e2;
                int i57 = i54;
                if (c16044e4.getIndex() >= ((C16044e) arrayDeque.first()).getIndex() && c16044e4.getIndex() <= ((C16044e) arrayDeque.last()).getIndex()) {
                    arrayList.add(c16044e3);
                }
                i56++;
                i54 = i57;
                c16044e2 = c16044e5;
            }
        }
        C16044e c16044e6 = c16044e2;
        int i58 = i54;
        if (list2.isEmpty()) {
            arrayList2 = CollectionsKt.m();
        } else {
            arrayList2 = new ArrayList(listC.size());
            int size5 = listC.size();
            for (int i59 = 0; i59 < size5; i59++) {
                C16044e c16044e7 = listC.get(i59);
                if (c16044e7.getIndex() < ((C16044e) arrayDeque.first()).getIndex()) {
                    arrayList2.add(c16044e7);
                }
            }
        }
        List list3 = arrayList2;
        if (listE.isEmpty()) {
            arrayList3 = CollectionsKt.m();
        } else {
            arrayList3 = new ArrayList(listC.size());
            int size6 = listC.size();
            for (int i60 = 0; i60 < size6; i60++) {
                C16044e c16044e8 = listC.get(i60);
                if (c16044e8.getIndex() > ((C16044e) arrayDeque.last()).getIndex()) {
                    arrayList3.add(c16044e8);
                }
            }
        }
        List list4 = arrayList3;
        C16044e c16044eB = b(i11 + i12 + i13, arrayList, i12, i13, iF, interfaceC14293k, i10);
        return new C16059t(arrayList, i17, i14, i13, enumC13937z, i27, i34, z10, i18, c16044e6, c16044eB, iF == 0 ? 0.0f : RangesKt.n((interfaceC14293k.a(r0, i17, i12, i13, c16044eB != null ? c16044eB.getIndex() : 0, i10) - (c16044eB != null ? c16044eB.getOffset() : 0)) / iF, -0.5f, 0.5f), i51, i58 < i10 || i55 > i11, interfaceC14293k, function3.invoke(Integer.valueOf(iG), Integer.valueOf(iF3), new a(interfaceC5872l0, listC)), z13, list3, list4, interfaceC15783O);
    }

    private static final List<C16044e> c(InterfaceC15890w interfaceC15890w, List<C16044e> list, List<C16044e> list2, List<C16044e> list3, int i10, int i11, int i12, int i13, int i14, EnumC13937z enumC13937z, boolean z10, H1.d dVar, int i15, int i16) {
        ArrayList arrayList;
        int i17 = i14;
        int i18 = i16 + i15;
        int i19 = enumC13937z == EnumC13937z.f131419a ? i11 : i10;
        int i20 = 0;
        boolean z11 = i12 < Math.min(i19, i13);
        if (z11) {
            if (!(i17 == 0)) {
                C14592e.c("non-zero pagesScrollOffset=" + i17);
            }
        }
        ArrayList arrayList2 = new ArrayList(list.size() + list2.size() + list3.size());
        if (z11) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                C14592e.a("No extra pages");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i20 < size) {
                iArr[i20] = i16;
                i20++;
            }
            int[] iArr2 = new int[size];
            C5800d.f fVarC = C5800d.a.f48788a.c(interfaceC15890w.K(i15));
            if (enumC13937z == EnumC13937z.f131419a) {
                fVarC.b(dVar, i19, iArr, iArr2);
                arrayList = arrayList2;
            } else {
                arrayList = arrayList2;
                fVarC.c(dVar, i19, iArr, t.f13338a, iArr2);
            }
            IntProgression intProgressionH0 = ArraysKt.h0(iArr2);
            if (z10) {
                intProgressionH0 = RangesKt.v(intProgressionH0);
            }
            int first = intProgressionH0.getFirst();
            int last = intProgressionH0.getLast();
            int step = intProgressionH0.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int size2 = iArr2[first];
                    C16044e c16044e = list.get(d(first, z10, size));
                    if (z10) {
                        size2 = (i19 - size2) - c16044e.getSize();
                    }
                    c16044e.h(size2, i10, i11);
                    arrayList.add(c16044e);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            arrayList = arrayList2;
            int size3 = list2.size();
            int i21 = i17;
            for (int i22 = 0; i22 < size3; i22++) {
                C16044e c16044e2 = list2.get(i22);
                i21 -= i18;
                c16044e2.h(i21, i10, i11);
                arrayList.add(c16044e2);
            }
            int size4 = list.size();
            for (int i23 = 0; i23 < size4; i23++) {
                C16044e c16044e3 = list.get(i23);
                c16044e3.h(i17, i10, i11);
                arrayList.add(c16044e3);
                i17 += i18;
            }
            int size5 = list3.size();
            while (i20 < size5) {
                C16044e c16044e4 = list3.get(i20);
                c16044e4.h(i17, i10, i11);
                arrayList.add(c16044e4);
                i17 += i18;
                i20++;
            }
        }
        return arrayList;
    }

    private static final int d(int i10, boolean z10, int i11) {
        return !z10 ? i10 : (i11 - i10) - 1;
    }

    private static final List<C16044e> f(int i10, int i11, List<Integer> list, Function1<? super Integer, C16044e> function1) {
        int iMax = Math.max(0, i10 - i11);
        int i12 = i10 - 1;
        ArrayList arrayList = null;
        if (iMax <= i12) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i12)));
                if (i12 == iMax) {
                    break;
                }
                i12--;
            }
        }
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            int iIntValue = list.get(i13).intValue();
            if (iIntValue < iMax) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? CollectionsKt.m() : arrayList;
    }

    private static final C16044e b(int i10, List<C16044e> list, int i11, int i12, int i13, InterfaceC14293k interfaceC14293k, int i14) {
        C16044e c16044e;
        if (list.isEmpty()) {
            c16044e = null;
        } else {
            C16044e c16044e2 = list.get(0);
            C16044e c16044e3 = c16044e2;
            float f10 = -Math.abs(C14294l.a(i10, i11, i12, i13, c16044e3.getOffset(), c16044e3.getIndex(), interfaceC14293k, i14));
            int iO = CollectionsKt.o(list);
            if (1 <= iO) {
                int i15 = 1;
                while (true) {
                    C16044e c16044e4 = list.get(i15);
                    C16044e c16044e5 = c16044e4;
                    float f11 = -Math.abs(C14294l.a(i10, i11, i12, i13, c16044e5.getOffset(), c16044e5.getIndex(), interfaceC14293k, i14));
                    if (Float.compare(f10, f11) < 0) {
                        f10 = f11;
                        c16044e2 = c16044e4;
                    }
                    if (i15 == iO) {
                        break;
                    }
                    i15++;
                }
            }
            c16044e = c16044e2;
        }
        return c16044e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C16044e g(InterfaceC15890w interfaceC15890w, int i10, long j10, C16056q c16056q, long j11, EnumC13937z enumC13937z, e.b bVar, e.c cVar, t tVar, boolean z10, int i11) {
        return new C16044e(i10, i11, interfaceC15890w.p0(i10, j10), j11, c16056q.d(i10), enumC13937z, bVar, cVar, tVar, z10, null);
    }
}
