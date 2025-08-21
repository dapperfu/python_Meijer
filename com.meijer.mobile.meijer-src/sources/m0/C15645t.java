package m0;

import androidx.compose.foundation.layout.C5800d;
import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.ui.layout.f0;
import i0.C14592e;
import java.util.ArrayList;
import java.util.List;
import kotlin.C15860T;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\u001aÜ\u0002\u00108\u001a\u0002072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001d2\u0006\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'23\u0010.\u001a/\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b*\u0012\b\b+\u0012\u0004\b\b(,\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000e0-0\u001d0)2\b\u00100\u001a\u0004\u0018\u00010/2/\u00106\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u0002030)¢\u0006\u0002\b4\u0012\u0004\u0012\u00020501H\u0000ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001aM\u0010>\u001a\b\u0012\u0004\u0012\u00020;0\u001d2\u0006\u0010:\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00102\f\u0010<\u001a\b\u0012\u0004\u0012\u00020;0\u001d2\b\u0010=\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b>\u0010?\u001a\u0093\u0001\u0010I\u001a\b\u0012\u0004\u0012\u00020\u001a0H2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020;0\u001d2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001d2\u0006\u0010C\u001a\u00020\u00002\u0006\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u00002\u0006\u0010F\u001a\u00020\u00002\u0006\u0010G\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\bI\u0010J\u001a-\u0010N\u001a\u000203\"\u0004\b\u0000\u0010K*\b\u0012\u0004\u0012\u00028\u00000H2\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000LH\u0002¢\u0006\u0004\bN\u0010O\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006P"}, d2 = {"", "itemsCount", "Lm0/y;", "measuredLineProvider", "Lm0/w;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenLines", "firstVisibleLineIndex", "firstVisibleLineScrollOffset", "", "scrollToBeConsumed", "LH1/b;", "constraints", "", "isVertical", "Landroidx/compose/foundation/layout/d$m;", "verticalArrangement", "Landroidx/compose/foundation/layout/d$e;", "horizontalArrangement", "reverseLayout", "LH1/d;", "density", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Lm0/v;", "itemAnimator", "slotsPerLine", "", "pinnedItems", "isInLookaheadScope", "isLookingAhead", "Lm0/r;", "approachLayoutInfo", "Lmv/O;", "coroutineScope", "Ln0/T;", "placementScopeInvalidator", "LV0/d1;", "graphicsContext", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "line", "Lkotlin/Pair;", "prefetchInfoRetriever", "Ln0/a0;", "stickyItemsScrollBehavior", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/f0$a;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/J;", "layout", "Lm0/u;", "e", "(ILm0/y;Lm0/w;IIIIIIFJZLandroidx/compose/foundation/layout/d$m;Landroidx/compose/foundation/layout/d$e;ZLH1/d;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLm0/r;Lmv/O;Landroidx/compose/runtime/l0;LV0/d1;Lkotlin/jvm/functions/Function1;Ln0/a0;Lkotlin/jvm/functions/Function3;)Lm0/u;", "lastVisibleItemIndex", "Lm0/x;", "visibleLines", "lastApproachLayoutInfo", "d", "(IILm0/y;ZLjava/util/List;Lm0/r;)Ljava/util/List;", "lines", "itemsBefore", "itemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "firstLineScrollOffset", "", "b", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/d$m;Landroidx/compose/foundation/layout/d$e;ZLH1/d;)Ljava/util/List;", "T", "", "arr", "a", "(Ljava/util/List;[Ljava/lang/Object;)V", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: m0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15645t {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m0.t$a */
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f150413f = new a();

        a() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m0.t$b */
    static final class b extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5872l0<Unit> f150414f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<C15647v> f150415g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<C15647v> f150416h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f150417i;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        /* renamed from: m0.t$b$a */
        static final class a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List<C15647v> f150418f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List<C15647v> f150419g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f150420h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List<C15647v> list, List<C15647v> list2, boolean z10) {
                super(1);
                this.f150418f = list;
                this.f150419g = list2;
                this.f150420h = z10;
            }

            public final void a(f0.a aVar) {
                List<C15647v> list = this.f150418f;
                boolean z10 = this.f150420h;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).t(aVar, z10);
                }
                List<C15647v> list2 = this.f150419g;
                boolean z11 = this.f150420h;
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    list2.get(i11).t(aVar, z11);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f143329a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC5872l0<Unit> interfaceC5872l0, List<C15647v> list, List<C15647v> list2, boolean z10) {
            super(1);
            this.f150414f = interfaceC5872l0;
            this.f150415g = list;
            this.f150416h = list2;
            this.f150417i = z10;
        }

        public final void a(f0.a aVar) {
            aVar.A(new a(this.f150415g, this.f150416h, this.f150417i));
            C15860T.a(this.f150414f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lm0/v;", "a", "(I)Lm0/v;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: m0.t$c */
    static final class c extends Lambda implements Function1<Integer, C15647v> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ AbstractC15650y f150421f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ AbstractC15648w f150422g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AbstractC15650y abstractC15650y, AbstractC15648w abstractC15648w) {
            super(1);
            this.f150421f = abstractC15650y;
            this.f150422g = abstractC15648w;
        }

        public final C15647v a(int i10) {
            int iD = this.f150421f.d(i10);
            return this.f150422g.a(i10, 0, iD, this.f150421f.a(0, iD));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ C15647v invoke(Integer num) {
            return a(num.intValue());
        }
    }

    private static final <T> void a(List<T> list, T[] tArr) {
        for (T t10 : tArr) {
            list.add(t10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad A[LOOP:1: B:25:0x0072->B:39:0x00ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b0 A[EDGE_INSN: B:49:0x00b0->B:40:0x00b0 BREAK  A[LOOP:1: B:25:0x0072->B:39:0x00ad], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.util.List<m0.C15649x> d(int r6, int r7, m0.AbstractC15650y r8, boolean r9, java.util.List<m0.C15649x> r10, m0.InterfaceC15643r r11) {
        /*
            r0 = 0
            if (r9 == 0) goto Lb0
            if (r11 == 0) goto Lb0
            java.util.List r9 = r11.h()
            java.util.Collection r9 = (java.util.Collection) r9
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto Lb0
            java.util.List r9 = r11.h()
            int r1 = r9.size()
            int r1 = r1 + (-1)
        L1b:
            r2 = -1
            if (r2 >= r1) goto L44
            java.lang.Object r2 = r9.get(r1)
            m0.j r2 = (m0.InterfaceC15635j) r2
            int r2 = r2.getIndex()
            if (r2 <= r6) goto L41
            if (r1 == 0) goto L3a
            int r2 = r1 + (-1)
            java.lang.Object r2 = r9.get(r2)
            m0.j r2 = (m0.InterfaceC15635j) r2
            int r2 = r2.getIndex()
            if (r2 > r6) goto L41
        L3a:
            java.lang.Object r6 = r9.get(r1)
            m0.j r6 = (m0.InterfaceC15635j) r6
            goto L45
        L41:
            int r1 = r1 + (-1)
            goto L1b
        L44:
            r6 = r0
        L45:
            java.util.List r9 = r11.h()
            java.lang.Object r9 = kotlin.collections.CollectionsKt.D0(r9)
            m0.j r9 = (m0.InterfaceC15635j) r9
            java.lang.Object r10 = kotlin.collections.CollectionsKt.F0(r10)
            m0.x r10 = (m0.C15649x) r10
            r11 = 0
            if (r10 == 0) goto L5f
            int r10 = r10.getIndex()
            int r10 = r10 + 1
            goto L60
        L5f:
            r10 = r11
        L60:
            if (r6 == 0) goto Lb0
            int r6 = r6.getIndex()
            int r9 = r9.getIndex()
            int r7 = r7 + (-1)
            int r7 = java.lang.Math.min(r9, r7)
            if (r6 > r7) goto Lb0
        L72:
            if (r0 == 0) goto L9b
            r9 = r0
            java.util.Collection r9 = (java.util.Collection) r9
            int r9 = r9.size()
            r1 = r11
        L7c:
            if (r1 >= r9) goto L9b
            java.lang.Object r2 = r0.get(r1)
            m0.x r2 = (m0.C15649x) r2
            m0.v[] r2 = r2.getItems()
            int r3 = r2.length
            r4 = r11
        L8a:
            if (r4 >= r3) goto L98
            r5 = r2[r4]
            int r5 = r5.getIndex()
            if (r5 != r6) goto L95
            goto Lab
        L95:
            int r4 = r4 + 1
            goto L8a
        L98:
            int r1 = r1 + 1
            goto L7c
        L9b:
            if (r0 != 0) goto La2
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        La2:
            m0.x r9 = r8.c(r10)
            int r10 = r10 + 1
            r0.add(r9)
        Lab:
            if (r6 == r7) goto Lb0
            int r6 = r6 + 1
            goto L72
        Lb0:
            if (r0 != 0) goto Lb7
            java.util.List r6 = kotlin.collections.CollectionsKt.m()
            return r6
        Lb7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C15645t.d(int, int, m0.y, boolean, java.util.List, m0.r):java.util.List");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0445  */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final m0.C15646u e(int r55, m0.AbstractC15650y r56, m0.AbstractC15648w r57, int r58, int r59, int r60, int r61, int r62, int r63, float r64, long r65, boolean r67, androidx.compose.foundation.layout.C5800d.m r68, androidx.compose.foundation.layout.C5800d.e r69, boolean r70, H1.d r71, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<m0.C15647v> r72, int r73, java.util.List<java.lang.Integer> r74, boolean r75, boolean r76, m0.InterfaceC15643r r77, mv.InterfaceC15783O r78, androidx.compose.runtime.InterfaceC5872l0<kotlin.Unit> r79, V0.InterfaceC5453d1 r80, kotlin.jvm.functions.Function1<? super java.lang.Integer, ? extends java.util.List<kotlin.Pair<java.lang.Integer, H1.b>>> r81, kotlin.InterfaceC15868a0 r82, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.f0.a, kotlin.Unit>, ? extends androidx.compose.ui.layout.J> r83) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.C15645t.e(int, m0.y, m0.w, int, int, int, int, int, int, float, long, boolean, androidx.compose.foundation.layout.d$m, androidx.compose.foundation.layout.d$e, boolean, H1.d, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator, int, java.util.List, boolean, boolean, m0.r, mv.O, androidx.compose.runtime.l0, V0.d1, kotlin.jvm.functions.Function1, n0.a0, kotlin.jvm.functions.Function3):m0.u");
    }

    private static final List<C15647v> b(List<C15649x> list, List<C15647v> list2, List<C15647v> list3, int i10, int i11, int i12, int i13, int i14, boolean z10, C5800d.m mVar, C5800d.e eVar, boolean z11, H1.d dVar) {
        int i15 = z10 ? i11 : i10;
        boolean z12 = i12 < Math.min(i15, i13);
        if (z12) {
            if (!(i14 == 0)) {
                C14592e.c("non-zero firstLineScrollOffset");
            }
        }
        List<C15649x> list4 = list;
        int size = list4.size();
        int length = 0;
        for (int i16 = 0; i16 < size; i16++) {
            length += list.get(i16).getItems().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (z12) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                C14592e.a("no items");
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i17 = 0; i17 < size2; i17++) {
                iArr[i17] = list.get(c(i17, z11, size2)).getMainAxisSize();
            }
            int[] iArr2 = new int[size2];
            if (z10) {
                if (mVar == null) {
                    C14592e.b("null verticalArrangement");
                    throw new KotlinNothingValueException();
                }
                mVar.b(dVar, i15, iArr, iArr2);
            } else {
                if (eVar == null) {
                    C14592e.b("null horizontalArrangement");
                    throw new KotlinNothingValueException();
                }
                eVar.c(dVar, i15, iArr, H1.t.f13338a, iArr2);
            }
            IntProgression intProgressionH0 = ArraysKt.h0(iArr2);
            if (z11) {
                intProgressionH0 = RangesKt.v(intProgressionH0);
            }
            int first = intProgressionH0.getFirst();
            int last = intProgressionH0.getLast();
            int step = intProgressionH0.getStep();
            if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
                while (true) {
                    int mainAxisSize = iArr2[first];
                    C15649x c15649x = list.get(c(first, z11, size2));
                    if (z11) {
                        mainAxisSize = (i15 - mainAxisSize) - c15649x.getMainAxisSize();
                    }
                    a(arrayList, c15649x.f(mainAxisSize, i10, i11));
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size() - 1;
            if (size3 >= 0) {
                int mainAxisSizeWithSpacings = i14;
                while (true) {
                    int i18 = size3 - 1;
                    C15647v c15647v = list2.get(size3);
                    mainAxisSizeWithSpacings -= c15647v.getMainAxisSizeWithSpacings();
                    c15647v.h(mainAxisSizeWithSpacings, 0, i10, i11);
                    arrayList.add(c15647v);
                    if (i18 < 0) {
                        break;
                    }
                    size3 = i18;
                }
            }
            int size4 = list4.size();
            int mainAxisSizeWithSpacings2 = i14;
            for (int i19 = 0; i19 < size4; i19++) {
                C15649x c15649x2 = list.get(i19);
                a(arrayList, c15649x2.f(mainAxisSizeWithSpacings2, i10, i11));
                mainAxisSizeWithSpacings2 += c15649x2.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            for (int i20 = 0; i20 < size5; i20++) {
                C15647v c15647v2 = list3.get(i20);
                c15647v2.h(mainAxisSizeWithSpacings2, 0, i10, i11);
                arrayList.add(c15647v2);
                mainAxisSizeWithSpacings2 += c15647v2.getMainAxisSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final int c(int i10, boolean z10, int i11) {
        return !z10 ? i10 : (i11 - i10) - 1;
    }
}
