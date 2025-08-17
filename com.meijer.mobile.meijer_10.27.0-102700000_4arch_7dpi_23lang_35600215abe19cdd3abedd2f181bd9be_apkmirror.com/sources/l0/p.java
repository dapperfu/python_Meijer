package l0;

import androidx.compose.foundation.layout.C5658d;
import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.ui.layout.f0;
import i0.C14589e;
import java.util.ArrayList;
import java.util.List;
import kotlin.C15733T;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0013\u001a\u009f\u0002\u00101\u001a\u0002002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b2\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u000e2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'2/\u0010/\u001a+\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0015\u0012\u0013\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,0*¢\u0006\u0002\b-\u0012\u0004\u0012\u00020.0)H\u0000ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001ac\u00107\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\u0018032\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b2\u0006\u00105\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u000e2\b\u00106\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b7\u00108\u001a;\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u00109\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00000\u001bH\u0002¢\u0006\u0004\b:\u0010;\u001a\u0093\u0001\u0010D\u001a\b\u0012\u0004\u0012\u00020\u0018032\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\bD\u0010E\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"", "itemsCount", "Ll0/s;", "measuredItemProvider", "mainAxisAvailableSize", "beforeContentPadding", "afterContentPadding", "spaceBetweenItems", "firstVisibleItemIndex", "firstVisibleItemScrollOffset", "", "scrollToBeConsumed", "LH1/b;", "constraints", "", "isVertical", "Landroidx/compose/foundation/layout/d$m;", "verticalArrangement", "Landroidx/compose/foundation/layout/d$e;", "horizontalArrangement", "reverseLayout", "LH1/d;", "density", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Ll0/r;", "itemAnimator", "beyondBoundsItemCount", "", "pinnedItems", "hasLookaheadOccurred", "isLookingAhead", "Ll0/n;", "approachLayoutInfo", "Lqv/O;", "coroutineScope", "Ln0/T;", "placementScopeInvalidator", "LV0/d1;", "graphicsContext", "Ln0/a0;", "stickyItemsPlacement", "Lkotlin/Function3;", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/f0$a;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/ui/layout/J;", "layout", "Ll0/q;", "e", "(ILl0/s;IIIIIIFJZLandroidx/compose/foundation/layout/d$m;Landroidx/compose/foundation/layout/d$e;ZLH1/d;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;ILjava/util/List;ZZLl0/n;Lqv/O;Landroidx/compose/runtime/l0;LV0/d1;Ln0/a0;Lkotlin/jvm/functions/Function3;)Ll0/q;", "", "visibleItems", "consumedScroll", "lastApproachLayoutInfo", "c", "(Ljava/util/List;Ll0/s;IILjava/util/List;FZLl0/n;)Ljava/util/List;", "currentFirstItemIndex", "d", "(ILl0/s;ILjava/util/List;)Ljava/util/List;", "items", "extraItemsBefore", "extraItemsAfter", "layoutWidth", "layoutHeight", "finalMainAxisOffset", "maxOffset", "itemsScrollOffset", "a", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;IIIIIZLandroidx/compose/foundation/layout/d$m;Landroidx/compose/foundation/layout/d$e;ZLH1/d;)Ljava/util/List;", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class p {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f148323f = new a();

        a() {
            super(1);
        }

        public final void a(f0.a aVar) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ InterfaceC5730l0<Unit> f148324f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<r> f148325g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List<r> f148326h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f148327i;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
        @SourceDebugExtension
        static final class a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List<r> f148328f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ List<r> f148329g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ boolean f148330h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(List<r> list, List<r> list2, boolean z10) {
                super(1);
                this.f148328f = list;
                this.f148329g = list2;
                this.f148330h = z10;
            }

            public final void a(f0.a aVar) {
                List<r> list = this.f148328f;
                boolean z10 = this.f148330h;
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    list.get(i10).p(aVar, z10);
                }
                List<r> list2 = this.f148329g;
                boolean z11 = this.f148330h;
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    list2.get(i11).p(aVar, z11);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f142422a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC5730l0<Unit> interfaceC5730l0, List<r> list, List<r> list2, boolean z10) {
            super(1);
            this.f148324f = interfaceC5730l0;
            this.f148325g = list;
            this.f148326h = list2;
            this.f148327i = z10;
        }

        public final void a(f0.a aVar) {
            aVar.A(new a(this.f148325g, this.f148326h, this.f148327i));
            C15733T.a(this.f148324f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Ll0/r;", "a", "(I)Ll0/r;"}, k = 3, mv = {1, 9, 0})
    static final class c extends Lambda implements Function1<Integer, r> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ s f148331f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(s sVar) {
            super(1);
            this.f148331f = sVar;
        }

        public final r a(int i10) {
            return s.e(this.f148331f, i10, 0L, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ r invoke(Integer num) {
            return a(num.intValue());
        }
    }

    private static final List<r> a(List<r> list, List<r> list2, List<r> list3, int i10, int i11, int i12, int i13, int i14, boolean z10, C5658d.m mVar, C5658d.e eVar, boolean z11, H1.d dVar) {
        int i15 = z10 ? i11 : i10;
        int i16 = 0;
        boolean z12 = i12 < Math.min(i15, i13);
        if (z12) {
            if (!(i14 == 0)) {
                C14589e.c("non-zero itemsScrollOffset");
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z12) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                C14589e.a("no extra items");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i16 < size) {
                iArr[i16] = list.get(b(i16, z11, size)).getSize();
                i16++;
            }
            int[] iArr2 = new int[size];
            if (z10) {
                if (mVar == null) {
                    C14589e.b("null verticalArrangement when isVertical == true");
                    throw new KotlinNothingValueException();
                }
                mVar.b(dVar, i15, iArr, iArr2);
            } else {
                if (eVar == null) {
                    C14589e.b("null horizontalArrangement when isVertical == false");
                    throw new KotlinNothingValueException();
                }
                eVar.c(dVar, i15, iArr, H1.t.f12006a, iArr2);
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
                    int size2 = iArr2[first];
                    r rVar = list.get(b(first, z11, size));
                    if (z11) {
                        size2 = (i15 - size2) - rVar.getSize();
                    }
                    rVar.q(size2, i10, i11);
                    arrayList.add(rVar);
                    if (first == last) {
                        break;
                    }
                    first += step;
                }
            }
        } else {
            int size3 = list2.size();
            int mainAxisSizeWithSpacings = i14;
            for (int i17 = 0; i17 < size3; i17++) {
                r rVar2 = list2.get(i17);
                mainAxisSizeWithSpacings -= rVar2.getMainAxisSizeWithSpacings();
                rVar2.q(mainAxisSizeWithSpacings, i10, i11);
                arrayList.add(rVar2);
            }
            int size4 = list.size();
            int mainAxisSizeWithSpacings2 = i14;
            for (int i18 = 0; i18 < size4; i18++) {
                r rVar3 = list.get(i18);
                rVar3.q(mainAxisSizeWithSpacings2, i10, i11);
                arrayList.add(rVar3);
                mainAxisSizeWithSpacings2 += rVar3.getMainAxisSizeWithSpacings();
            }
            int size5 = list3.size();
            while (i16 < size5) {
                r rVar4 = list3.get(i16);
                rVar4.q(mainAxisSizeWithSpacings2, i10, i11);
                arrayList.add(rVar4);
                mainAxisSizeWithSpacings2 += rVar4.getMainAxisSizeWithSpacings();
                i16++;
            }
        }
        return arrayList;
    }

    private static final List<r> d(int i10, s sVar, int i11, List<Integer> list) {
        s sVar2;
        int iMax = Math.max(0, i10 - i11);
        int i12 = i10 - 1;
        ArrayList arrayList = null;
        if (iMax <= i12) {
            int i13 = i12;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                sVar2 = sVar;
                arrayList.add(s.e(sVar2, i13, 0L, 2, null));
                if (i13 == iMax) {
                    break;
                }
                i13--;
                sVar = sVar2;
            }
        } else {
            sVar2 = sVar;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i14 = size - 1;
                int iIntValue = list.get(size).intValue();
                if (iIntValue < iMax) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(s.e(sVar2, iIntValue, 0L, 2, null));
                }
                if (i14 < 0) {
                    break;
                }
                size = i14;
            }
        }
        return arrayList == null ? CollectionsKt.m() : arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final l0.q e(int r42, l0.s r43, int r44, int r45, int r46, int r47, int r48, int r49, float r50, long r51, boolean r53, androidx.compose.foundation.layout.C5658d.m r54, androidx.compose.foundation.layout.C5658d.e r55, boolean r56, H1.d r57, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator<l0.r> r58, int r59, java.util.List<java.lang.Integer> r60, boolean r61, boolean r62, l0.n r63, qv.InterfaceC16622O r64, androidx.compose.runtime.InterfaceC5730l0<kotlin.Unit> r65, V0.InterfaceC5310d1 r66, kotlin.InterfaceC15741a0 r67, kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Integer, ? super kotlin.jvm.functions.Function1<? super androidx.compose.ui.layout.f0.a, kotlin.Unit>, ? extends androidx.compose.ui.layout.J> r68) {
        /*
            Method dump skipped, instructions count: 1119
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.p.e(int, l0.s, int, int, int, int, int, int, float, long, boolean, androidx.compose.foundation.layout.d$m, androidx.compose.foundation.layout.d$e, boolean, H1.d, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator, int, java.util.List, boolean, boolean, l0.n, qv.O, androidx.compose.runtime.l0, V0.d1, n0.a0, kotlin.jvm.functions.Function3):l0.q");
    }

    private static final int b(int i10, boolean z10, int i11) {
        return !z10 ? i10 : (i11 - i10) - 1;
    }

    private static final List<r> c(List<r> list, s sVar, int i10, int i11, List<Integer> list2, float f10, boolean z10, n nVar) {
        ArrayList arrayList;
        InterfaceC15349i interfaceC15349i;
        r rVar;
        r rVar2;
        int mainAxisSizeWithSpacings;
        r rVar3;
        int index;
        int iMin;
        r rVar4;
        r rVar5;
        int i12 = i10 - 1;
        int iMin2 = Math.min(((r) CollectionsKt.D0(list)).getIndex() + i11, i12);
        int index2 = ((r) CollectionsKt.D0(list)).getIndex() + 1;
        if (index2 <= iMin2) {
            int i13 = index2;
            arrayList = null;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(s.e(sVar, i13, 0L, 2, null));
                if (i13 == iMin2) {
                    break;
                }
                i13++;
            }
        } else {
            arrayList = null;
        }
        if (z10 && nVar != null && !nVar.h().isEmpty()) {
            List<InterfaceC15349i> listH = nVar.h();
            int size = listH.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    interfaceC15349i = null;
                    break;
                }
                if (listH.get(size).getIndex() > iMin2 && (size == 0 || listH.get(size - 1).getIndex() <= iMin2)) {
                    break;
                }
            }
            interfaceC15349i = listH.get(size);
            InterfaceC15349i interfaceC15349i2 = (InterfaceC15349i) CollectionsKt.D0(nVar.h());
            if (interfaceC15349i != null && (index = interfaceC15349i.getIndex()) <= (iMin = Math.min(interfaceC15349i2.getIndex(), i12))) {
                int i14 = index;
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size2) {
                                rVar5 = null;
                                break;
                            }
                            rVar5 = arrayList.get(i15);
                            if (rVar5.getIndex() == i14) {
                                break;
                            }
                            i15++;
                        }
                        rVar4 = rVar5;
                    } else {
                        rVar4 = null;
                    }
                    if (rVar4 == null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(s.e(sVar, i14, 0L, 2, null));
                    }
                    if (i14 == iMin) {
                        break;
                    }
                    i14++;
                }
            }
            float viewportEndOffset = ((nVar.getViewportEndOffset() - interfaceC15349i2.getOffset()) - interfaceC15349i2.getSize()) - f10;
            if (viewportEndOffset > 0.0f) {
                int index3 = interfaceC15349i2.getIndex() + 1;
                int i16 = 0;
                while (index3 < i10 && i16 < viewportEndOffset) {
                    if (index3 <= iMin2) {
                        int size3 = list.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= size3) {
                                rVar3 = null;
                                break;
                            }
                            rVar3 = list.get(i17);
                            if (rVar3.getIndex() == index3) {
                                break;
                            }
                            i17++;
                        }
                        rVar = rVar3;
                    } else if (arrayList != null) {
                        int size4 = arrayList.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 >= size4) {
                                rVar2 = null;
                                break;
                            }
                            rVar2 = arrayList.get(i18);
                            if (rVar2.getIndex() == index3) {
                                break;
                            }
                            i18++;
                        }
                        rVar = rVar2;
                    } else {
                        rVar = null;
                    }
                    if (rVar != null) {
                        index3++;
                        mainAxisSizeWithSpacings = rVar.getMainAxisSizeWithSpacings();
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(s.e(sVar, index3, 0L, 2, null));
                        index3++;
                        mainAxisSizeWithSpacings = ((r) CollectionsKt.D0(arrayList)).getMainAxisSizeWithSpacings();
                    }
                    i16 += mainAxisSizeWithSpacings;
                }
            }
        }
        if (arrayList != null && ((r) CollectionsKt.D0(arrayList)).getIndex() > iMin2) {
            iMin2 = ((r) CollectionsKt.D0(arrayList)).getIndex();
        }
        int size5 = list2.size();
        for (int i19 = 0; i19 < size5; i19++) {
            int iIntValue = list2.get(i19).intValue();
            if (iIntValue > iMin2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(s.e(sVar, iIntValue, 0L, 2, null));
            }
        }
        return arrayList == null ? CollectionsKt.m() : arrayList;
    }
}
