package oc;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.D;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.f0;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.TabPosition;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a?\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/Modifier;", "Loc/g;", "pagerState", "", "Lx0/B1;", "tabPositions", "Lkotlin/Function1;", "", "pageIndexMapping", "a", "(Landroidx/compose/ui/Modifier;Loc/g;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "Loc/h;", "b", "(Landroidx/compose/ui/Modifier;Loc/h;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "pager-indicators_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: oc.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16021j {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "it", "a", "(I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oc.j$a */
    public static final class a extends Lambda implements Function1<Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f153377f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return a(num.intValue());
        }

        public final Integer a(int i10) {
            return Integer.valueOf(i10);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "measurable", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "a", "(Landroidx/compose/ui/layout/K;Landroidx/compose/ui/layout/I;J)Landroidx/compose/ui/layout/J;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: oc.j$b */
    static final class b extends Lambda implements Function3<K, I, H1.b, J> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<TabPosition> f153378f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f153379g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC16019h f153380h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: oc.j$b$a */
        static final class a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            public static final a f153381f = new a();

            a() {
                super(1);
            }

            public final void a(f0.a layout) {
                Intrinsics.j(layout, "$this$layout");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f142422a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        /* renamed from: oc.j$b$b, reason: collision with other inner class name */
        static final class C2385b extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ f0 f153382f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f153383g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ long f153384h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2385b(f0 f0Var, int i10, long j10) {
                super(1);
                this.f153382f = f0Var;
                this.f153383g = i10;
                this.f153384h = j10;
            }

            public final void a(f0.a layout) {
                Intrinsics.j(layout, "$this$layout");
                f0.a.l(layout, this.f153382f, this.f153383g, Math.max(H1.b.m(this.f153384h) - this.f153382f.getHeight(), 0), 0.0f, 4, null);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(List<TabPosition> list, Function1<? super Integer, Integer> function1, InterfaceC16019h interfaceC16019h) {
            super(3);
            this.f153378f = list;
            this.f153379g = function1;
            this.f153380h = interfaceC16019h;
        }

        public final J a(K layout, I measurable, long j10) {
            Intrinsics.j(layout, "$this$layout");
            Intrinsics.j(measurable, "measurable");
            if (this.f153378f.isEmpty()) {
                return K.G0(layout, H1.b.l(j10), 0, null, a.f153381f, 4, null);
            }
            int iMin = Math.min(CollectionsKt.o(this.f153378f), this.f153379g.invoke(Integer.valueOf(this.f153380h.a())).intValue());
            TabPosition tabPosition = this.f153378f.get(iMin);
            TabPosition tabPosition2 = (TabPosition) CollectionsKt.v0(this.f153378f, iMin - 1);
            TabPosition tabPosition3 = (TabPosition) CollectionsKt.v0(this.f153378f, iMin + 1);
            float fB = this.f153380h.b();
            int iE0 = (fB <= 0.0f || tabPosition3 == null) ? (fB >= 0.0f || tabPosition2 == null) ? layout.E0(tabPosition.getWidth()) : layout.E0(H1.i.c(tabPosition.getWidth(), tabPosition2.getWidth(), -fB)) : layout.E0(H1.i.c(tabPosition.getWidth(), tabPosition3.getWidth(), fB));
            int iE02 = (fB <= 0.0f || tabPosition3 == null) ? (fB >= 0.0f || tabPosition2 == null) ? layout.E0(tabPosition.getLeft()) : layout.E0(H1.i.c(tabPosition.getLeft(), tabPosition2.getLeft(), -fB)) : layout.E0(H1.i.c(tabPosition.getLeft(), tabPosition3.getLeft(), fB));
            f0 f0VarK0 = measurable.k0(H1.c.a(iE0, iE0, 0, H1.b.k(j10)));
            return K.G0(layout, H1.b.l(j10), Math.max(f0VarK0.getHeight(), H1.b.m(j10)), null, new C2385b(f0VarK0, iE02, j10), 4, null);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ J invoke(K k10, I i10, H1.b bVar) {
            return a(k10, i10, bVar.getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"oc/j$c", "Loc/h;", "", "a", "()I", "currentPage", "", "b", "()F", "currentPageOffset", "pager-indicators_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oc.j$c */
    public static final class c implements InterfaceC16019h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PagerState f153385a;

        c(PagerState pagerState) {
            this.f153385a = pagerState;
        }

        @Override // oc.InterfaceC16019h
        public int a() {
            return this.f153385a.k();
        }

        @Override // oc.InterfaceC16019h
        public float b() {
            return this.f153385a.m();
        }
    }

    @Deprecated
    public static final Modifier a(Modifier modifier, PagerState pagerState, List<TabPosition> tabPositions, Function1<? super Integer, Integer> pageIndexMapping) {
        Intrinsics.j(modifier, "<this>");
        Intrinsics.j(pagerState, "pagerState");
        Intrinsics.j(tabPositions, "tabPositions");
        Intrinsics.j(pageIndexMapping, "pageIndexMapping");
        return b(modifier, new c(pagerState), tabPositions, pageIndexMapping);
    }

    private static final Modifier b(Modifier modifier, InterfaceC16019h interfaceC16019h, List<TabPosition> list, Function1<? super Integer, Integer> function1) {
        return D.a(modifier, new b(list, function1, interfaceC16019h));
    }

    public static /* synthetic */ Modifier c(Modifier modifier, PagerState pagerState, List list, Function1 function1, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            function1 = a.f153377f;
        }
        return a(modifier, pagerState, list, function1);
    }
}
