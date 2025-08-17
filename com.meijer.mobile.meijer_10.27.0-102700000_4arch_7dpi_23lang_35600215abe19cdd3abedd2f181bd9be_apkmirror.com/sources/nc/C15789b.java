package nc;

import H1.n;
import H1.r;
import H1.s;
import H1.t;
import androidx.compose.foundation.layout.C5658d;
import androidx.compose.runtime.C5717f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.T0;
import androidx.compose.runtime.V0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.A;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5811g;
import androidx.compose.ui.platform.C5892t0;
import androidx.compose.ui.platform.Q1;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aq\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\f\b\u0002\u0010\f\u001a\u00060\u0004j\u0002`\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001ak\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00072\n\u0010\f\u001a\u00060\u0004j\u0002`\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015*\n\u0010\u0016\"\u00020\u00042\u00020\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lnc/f;", "mainAxisSize", "Lnc/d;", "Lcom/google/accompanist/flowlayout/FlowMainAxisAlignment;", "mainAxisAlignment", "LH1/h;", "mainAxisSpacing", "Lnc/a;", "crossAxisAlignment", "crossAxisSpacing", "lastLineMainAxisAlignment", "Lkotlin/Function0;", "", "content", "b", "(Landroidx/compose/ui/Modifier;Lnc/f;Lnc/d;FLnc/a;FLnc/d;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lnc/c;", "orientation", "a", "(Landroidx/compose/ui/Modifier;Lnc/c;Lnc/f;Lnc/d;FLnc/a;FLnc/d;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "FlowMainAxisAlignment", "flowlayout_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* renamed from: nc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15789b {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: nc.b$a */
    static final class a implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ nc.c f151128a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f151129b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ f f151130c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f151131d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ d f151132e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ d f151133f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ EnumC15788a f151134g;

        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        /* renamed from: nc.b$a$a, reason: collision with other inner class name */
        static final class C2338a extends Lambda implements Function1<f0.a, Unit> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ List<List<f0>> f151135f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ K f151136g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ float f151137h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ d f151138i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ d f151139j;

            /* renamed from: k, reason: collision with root package name */
            final /* synthetic */ nc.c f151140k;

            /* renamed from: l, reason: collision with root package name */
            final /* synthetic */ int f151141l;

            /* renamed from: m, reason: collision with root package name */
            final /* synthetic */ EnumC15788a f151142m;

            /* renamed from: n, reason: collision with root package name */
            final /* synthetic */ List<Integer> f151143n;

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ List<Integer> f151144o;

            @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
            /* renamed from: nc.b$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C2339a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[EnumC15788a.values().length];
                    iArr[EnumC15788a.Start.ordinal()] = 1;
                    iArr[EnumC15788a.End.ordinal()] = 2;
                    iArr[EnumC15788a.Center.ordinal()] = 3;
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2338a(List<List<f0>> list, K k10, float f10, d dVar, d dVar2, nc.c cVar, int i10, EnumC15788a enumC15788a, List<Integer> list2, List<Integer> list3) {
                super(1);
                this.f151135f = list;
                this.f151136g = k10;
                this.f151137h = f10;
                this.f151138i = dVar;
                this.f151139j = dVar2;
                this.f151140k = cVar;
                this.f151141l = i10;
                this.f151142m = enumC15788a;
                this.f151143n = list2;
                this.f151144o = list3;
            }

            public final void a(f0.a layout) {
                int iIntValue;
                Iterator it;
                int[] iArr;
                List<Integer> list;
                List<Integer> list2;
                int i10;
                int i11;
                Intrinsics.j(layout, "$this$layout");
                List<List<f0>> list3 = this.f151135f;
                K k10 = this.f151136g;
                float f10 = this.f151137h;
                d dVar = this.f151138i;
                d dVar2 = this.f151139j;
                nc.c cVar = this.f151140k;
                int i12 = this.f151141l;
                EnumC15788a enumC15788a = this.f151142m;
                List<Integer> list4 = this.f151143n;
                List<Integer> list5 = this.f151144o;
                int i13 = 0;
                for (Object obj : list3) {
                    int i14 = i13 + 1;
                    if (i13 < 0) {
                        CollectionsKt.w();
                    }
                    List list6 = (List) obj;
                    int size = list6.size();
                    int i15 = 0;
                    int[] iArr2 = new int[size];
                    int i16 = 0;
                    while (i16 < size) {
                        List<List<f0>> list7 = list3;
                        iArr2[i16] = C15789b.d((f0) list6.get(i16), cVar) + (i16 < CollectionsKt.o(list6) ? k10.E0(f10) : 0);
                        i16++;
                        list3 = list7;
                    }
                    List<List<f0>> list8 = list3;
                    C5658d.m arrangement = i13 < CollectionsKt.o(list8) ? dVar.getArrangement() : dVar2.getArrangement();
                    int[] iArr3 = new int[size];
                    for (int i17 = 0; i17 < size; i17++) {
                        iArr3[i17] = 0;
                    }
                    arrangement.b(k10, i12, iArr2, iArr3);
                    Iterator it2 = list6.iterator();
                    int i18 = 0;
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            CollectionsKt.w();
                        }
                        f0 f0Var = (f0) next;
                        int i20 = C2339a.$EnumSwitchMapping$0[enumC15788a.ordinal()];
                        if (i20 == 1) {
                            iIntValue = i15;
                        } else if (i20 == 2) {
                            iIntValue = list4.get(i13).intValue() - C15789b.c(f0Var, cVar);
                        } else {
                            if (i20 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            iIntValue = n.l(P0.e.INSTANCE.e().a(r.INSTANCE.a(), s.a(i15, list4.get(i13).intValue() - C15789b.c(f0Var, cVar)), t.f12006a));
                        }
                        if (cVar == nc.c.Horizontal) {
                            list = list4;
                            iArr = iArr3;
                            i10 = i13;
                            it = it2;
                            list2 = list5;
                            i11 = 0;
                            f0.a.h(layout, f0Var, iArr3[i18], list5.get(i13).intValue() + iIntValue, 0.0f, 4, null);
                        } else {
                            it = it2;
                            iArr = iArr3;
                            list = list4;
                            list2 = list5;
                            i10 = i13;
                            i11 = 0;
                            f0.a.h(layout, f0Var, list2.get(i10).intValue() + iIntValue, iArr[i18], 0.0f, 4, null);
                        }
                        list5 = list2;
                        i13 = i10;
                        it2 = it;
                        i18 = i19;
                        list4 = list;
                        iArr3 = iArr;
                        i15 = i11;
                    }
                    i13 = i14;
                    list3 = list8;
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
                a(aVar);
                return Unit.f142422a;
            }
        }

        a(nc.c cVar, float f10, f fVar, float f11, d dVar, d dVar2, EnumC15788a enumC15788a) {
            this.f151128a = cVar;
            this.f151129b = f10;
            this.f151130c = fVar;
            this.f151131d = f11;
            this.f151132e = dVar;
            this.f151133f = dVar2;
            this.f151134g = enumC15788a;
        }

        private static final void b(List<List<f0>> list, Ref.IntRef intRef, K k10, float f10, List<f0> list2, List<Integer> list3, Ref.IntRef intRef2, List<Integer> list4, Ref.IntRef intRef3, Ref.IntRef intRef4) {
            List<List<f0>> list5 = list;
            if (!list5.isEmpty()) {
                intRef.f142833a += k10.E0(f10);
            }
            list5.add(CollectionsKt.j1(list2));
            list3.add(Integer.valueOf(intRef2.f142833a));
            list4.add(Integer.valueOf(intRef.f142833a));
            intRef.f142833a += intRef2.f142833a;
            intRef3.f142833a = Math.max(intRef3.f142833a, intRef4.f142833a);
            list2.clear();
            intRef4.f142833a = 0;
            intRef2.f142833a = 0;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final J d(K k10, List<? extends I> measurables, long j10) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            Ref.IntRef intRef;
            f0 f0Var;
            Ref.IntRef intRef2;
            Ref.IntRef intRef3;
            K Layout = k10;
            Intrinsics.j(Layout, "$this$Layout");
            Intrinsics.j(measurables, "measurables");
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayList arrayList7 = new ArrayList();
            Ref.IntRef intRef4 = new Ref.IntRef();
            Ref.IntRef intRef5 = new Ref.IntRef();
            ArrayList arrayList8 = new ArrayList();
            Ref.IntRef intRef6 = new Ref.IntRef();
            Ref.IntRef intRef7 = new Ref.IntRef();
            ArrayList arrayList9 = arrayList8;
            OrientationIndependentConstraints orientationIndependentConstraints = new OrientationIndependentConstraints(j10, this.f151128a, null);
            long jB = this.f151128a == nc.c.Horizontal ? H1.c.b(0, orientationIndependentConstraints.getMainAxisMax(), 0, 0, 13, null) : H1.c.b(0, 0, 0, orientationIndependentConstraints.getMainAxisMax(), 7, null);
            Iterator<? extends I> it = measurables.iterator();
            while (it.hasNext()) {
                f0 f0VarK0 = it.next().k0(jB);
                OrientationIndependentConstraints orientationIndependentConstraints2 = orientationIndependentConstraints;
                if (a(arrayList9, intRef6, Layout, this.f151129b, orientationIndependentConstraints, this.f151128a, f0VarK0)) {
                    Layout = k10;
                    arrayList = arrayList9;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    arrayList4 = arrayList7;
                    intRef = intRef6;
                    f0Var = f0VarK0;
                    intRef2 = intRef5;
                    intRef3 = intRef7;
                } else {
                    Layout = k10;
                    arrayList = arrayList9;
                    arrayList2 = arrayList5;
                    arrayList3 = arrayList6;
                    arrayList4 = arrayList7;
                    intRef = intRef6;
                    f0Var = f0VarK0;
                    intRef2 = intRef5;
                    intRef3 = intRef7;
                    b(arrayList2, intRef2, Layout, this.f151131d, arrayList, arrayList3, intRef3, arrayList4, intRef4, intRef);
                }
                if (!arrayList.isEmpty()) {
                    intRef.f142833a += Layout.E0(this.f151129b);
                }
                arrayList.add(f0Var);
                intRef.f142833a += C15789b.d(f0Var, this.f151128a);
                intRef3.f142833a = Math.max(intRef3.f142833a, C15789b.c(f0Var, this.f151128a));
                intRef5 = intRef2;
                intRef7 = intRef3;
                arrayList7 = arrayList4;
                intRef6 = intRef;
                arrayList5 = arrayList2;
                arrayList9 = arrayList;
                arrayList6 = arrayList3;
                orientationIndependentConstraints = orientationIndependentConstraints2;
            }
            OrientationIndependentConstraints orientationIndependentConstraints3 = orientationIndependentConstraints;
            ArrayList arrayList10 = arrayList6;
            Ref.IntRef intRef8 = intRef7;
            ArrayList arrayList11 = arrayList9;
            Ref.IntRef intRef9 = intRef6;
            ArrayList arrayList12 = arrayList5;
            ArrayList arrayList13 = arrayList7;
            Ref.IntRef intRef10 = intRef5;
            if (!arrayList11.isEmpty()) {
                b(arrayList12, intRef10, Layout, this.f151131d, arrayList11, arrayList10, intRef8, arrayList13, intRef4, intRef9);
            }
            int iMax = (orientationIndependentConstraints3.getMainAxisMax() == Integer.MAX_VALUE || this.f151130c != f.Expand) ? Math.max(intRef4.f142833a, orientationIndependentConstraints3.getMainAxisMin()) : orientationIndependentConstraints3.getMainAxisMax();
            int iMax2 = Math.max(intRef10.f142833a, orientationIndependentConstraints3.getCrossAxisMin());
            nc.c cVar = this.f151128a;
            nc.c cVar2 = nc.c.Horizontal;
            return K.G0(k10, cVar == cVar2 ? iMax : iMax2, cVar == cVar2 ? iMax2 : iMax, null, new C2338a(arrayList12, k10, this.f151129b, this.f151132e, this.f151133f, cVar, iMax, this.f151134g, arrayList10, arrayList13), 4, null);
        }

        private static final boolean a(List<f0> list, Ref.IntRef intRef, K k10, float f10, OrientationIndependentConstraints orientationIndependentConstraints, nc.c cVar, f0 f0Var) {
            if (!list.isEmpty() && intRef.f142833a + k10.E0(f10) + C15789b.d(f0Var, cVar) > orientationIndependentConstraints.getMainAxisMax()) {
                return false;
            }
            return true;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: nc.b$b, reason: collision with other inner class name */
    static final class C2340b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f151145f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ nc.c f151146g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ f f151147h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ d f151148i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f151149j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ EnumC15788a f151150k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ float f151151l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ d f151152m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f151153n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f151154o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C2340b(Modifier modifier, nc.c cVar, f fVar, d dVar, float f10, EnumC15788a enumC15788a, float f11, d dVar2, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f151145f = modifier;
            this.f151146g = cVar;
            this.f151147h = fVar;
            this.f151148i = dVar;
            this.f151149j = f10;
            this.f151150k = enumC15788a;
            this.f151151l = f11;
            this.f151152m = dVar2;
            this.f151153n = function2;
            this.f151154o = i10;
        }

        public final void a(Composer composer, int i10) {
            C15789b.a(this.f151145f, this.f151146g, this.f151147h, this.f151148i, this.f151149j, this.f151150k, this.f151151l, this.f151152m, this.f151153n, composer, this.f151154o | 1);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: nc.b$c */
    static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Modifier f151155f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ f f151156g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ d f151157h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ float f151158i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ EnumC15788a f151159j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f151160k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ d f151161l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Function2<Composer, Integer, Unit> f151162m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f151163n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int f151164o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(Modifier modifier, f fVar, d dVar, float f10, EnumC15788a enumC15788a, float f11, d dVar2, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f151155f = modifier;
            this.f151156g = fVar;
            this.f151157h = dVar;
            this.f151158i = f10;
            this.f151159j = enumC15788a;
            this.f151160k = f11;
            this.f151161l = dVar2;
            this.f151162m = function2;
            this.f151163n = i10;
            this.f151164o = i11;
        }

        public final void a(Composer composer, int i10) {
            C15789b.b(this.f151155f, this.f151156g, this.f151157h, this.f151158i, this.f151159j, this.f151160k, this.f151161l, this.f151162m, composer, this.f151163n | 1, this.f151164o);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            a(composer, num.intValue());
            return Unit.f142422a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Modifier modifier, nc.c cVar, f fVar, d dVar, float f10, EnumC15788a enumC15788a, float f11, d dVar2, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10) {
        Modifier modifier2;
        int i11;
        d dVar3;
        float f12;
        EnumC15788a enumC15788a2;
        float f13;
        d dVar4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1567419051);
        if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i11 = (composerStartRestartGroup.V(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.V(cVar) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.V(fVar) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            dVar3 = dVar;
            i11 |= composerStartRestartGroup.V(dVar3) ? RecyclerView.m.FLAG_MOVED : 1024;
        } else {
            dVar3 = dVar;
        }
        if ((57344 & i10) == 0) {
            f12 = f10;
            i11 |= composerStartRestartGroup.b(f12) ? 16384 : 8192;
        } else {
            f12 = f10;
        }
        if ((458752 & i10) == 0) {
            enumC15788a2 = enumC15788a;
            i11 |= composerStartRestartGroup.V(enumC15788a2) ? 131072 : 65536;
        } else {
            enumC15788a2 = enumC15788a;
        }
        if ((3670016 & i10) == 0) {
            f13 = f11;
            i11 |= composerStartRestartGroup.b(f13) ? 1048576 : 524288;
        } else {
            f13 = f11;
        }
        if ((29360128 & i10) == 0) {
            dVar4 = dVar2;
            i11 |= composerStartRestartGroup.V(dVar4) ? 8388608 : 4194304;
        } else {
            dVar4 = dVar2;
        }
        if ((234881024 & i10) == 0) {
            i11 |= composerStartRestartGroup.V(function2) ? 67108864 : 33554432;
        }
        if ((191739611 & i11) == 38347922 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (ComposerKt.M()) {
                ComposerKt.U(-1567419051, i11, -1, "com.google.accompanist.flowlayout.Flow (Flow.kt:131)");
            }
            a aVar = new a(cVar, f12, fVar, f13, dVar3, dVar4, enumC15788a2);
            int i12 = ((i11 >> 24) & 14) | ((i11 << 3) & 112);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            H1.d dVar5 = (H1.d) composerStartRestartGroup.o(C5892t0.g());
            t tVar = (t) composerStartRestartGroup.o(C5892t0.m());
            Q1 q12 = (Q1) composerStartRestartGroup.o(C5892t0.t());
            InterfaceC5811g.Companion companion = InterfaceC5811g.INSTANCE;
            Function0<InterfaceC5811g> function0A = companion.a();
            Function3<V0<InterfaceC5811g>, Composer, Integer, Unit> function3C = A.c(modifier2);
            int i13 = ((i12 << 9) & 7168) | 6;
            if (composerStartRestartGroup.k() == null) {
                C5717f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            composerStartRestartGroup.G();
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, aVar, companion.e());
            D1.c(composerA, dVar5, companion.c());
            D1.c(composerA, tVar, companion.d());
            D1.c(composerA, q12, companion.h());
            composerStartRestartGroup.c();
            function3C.invoke(V0.a(V0.b(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            function2.invoke(composerStartRestartGroup, Integer.valueOf((i13 >> 9) & 14));
            composerStartRestartGroup.U();
            composerStartRestartGroup.v();
            composerStartRestartGroup.U();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L == null) {
            return;
        }
        t0L.a(new C2340b(modifier2, cVar, fVar, dVar, f10, enumC15788a, f11, dVar2, function2, i10));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.Modifier r22, nc.f r23, nc.d r24, float r25, nc.EnumC15788a r26, float r27, nc.d r28, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.C15789b.b(androidx.compose.ui.Modifier, nc.f, nc.d, float, nc.a, float, nc.d, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(f0 f0Var, nc.c cVar) {
        return cVar == nc.c.Horizontal ? f0Var.getHeight() : f0Var.getWidth();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(f0 f0Var, nc.c cVar) {
        return cVar == nc.c.Horizontal ? f0Var.getWidth() : f0Var.getHeight();
    }
}
