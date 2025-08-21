package kotlin;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.runtime.C5859f;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.D1;
import androidx.compose.runtime.InterfaceC5884s;
import androidx.compose.runtime.J0;
import androidx.compose.runtime.T0;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.C5917b;
import androidx.compose.ui.layout.C5937w;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.node.InterfaceC5953g;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC4101a;
import kotlin.C4107g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\n\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\t\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a1\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LH1/h;", "inset", "Lkotlin/Function0;", "", "content", "k", "(FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "text", "other", "spaceBetween", "h", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;FLandroidx/compose/runtime/Composer;II)V", "LLi/a;", "anchor", "e", "(LLi/a;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "f", "(LLi/a;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "library_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: Li.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4107g {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Li.g$a */
    static final class a implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC4101a f18981a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f18982b;

        a(AbstractC4101a abstractC4101a, float f10) {
            this.f18981a = abstractC4101a;
            this.f18982b = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(K k10, float f10, List list, int i10, Ref.IntRef intRef, f0.a layout) {
            int i11;
            int height;
            int i12;
            Intrinsics.j(layout, "$this$layout");
            int iE0 = k10.E0(f10);
            Iterator it = list.iterator();
            int width = iE0;
            while (it.hasNext()) {
                f0 f0Var = (f0) it.next();
                if (i10 == 0) {
                    i12 = 0;
                } else {
                    if (f0Var.l0(C5917b.a()) == Integer.MIN_VALUE || f0Var.l0(C5917b.b()) <= i10) {
                        i11 = i10 / 2;
                        height = f0Var.getHeight() / 2;
                    } else {
                        int iL0 = f0Var.l0(C5917b.b()) / f0Var.l0(C5917b.a());
                        int iL02 = intRef.f143740a - f0Var.l0(C5917b.b());
                        i11 = (i10 / 2) - ((intRef.f143740a / iL0) / 2);
                        height = iL02 / 4;
                    }
                    i12 = i11 - height;
                }
                f0.a.l(layout, f0Var, width, i12, 0.0f, 4, null);
                width += f0Var.getWidth();
            }
            return Unit.f143329a;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final J d(final K Layout, List<? extends I> measurables, long j10) {
            Intrinsics.j(Layout, "$this$Layout");
            Intrinsics.j(measurables, "measurables");
            final Ref.IntRef intRef = new Ref.IntRef();
            int iL = H1.b.l(j10);
            List<? extends I> list = measurables;
            final ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            long jD = j10;
            int iL2 = 0;
            while (it.hasNext()) {
                f0 f0VarK0 = ((I) it.next()).k0(jD);
                iL2 += f0VarK0.M0();
                intRef.f143740a = Math.max(intRef.f143740a, f0VarK0.getHeight());
                int i10 = iL - iL2;
                if (i10 > 0) {
                    jD = H1.b.d(jD, 0, i10, 0, 0, 13, null);
                }
                arrayList.add(f0VarK0);
            }
            final int iJ0 = Intrinsics.e(this.f18981a, AbstractC4101a.b.f18957a) ? ((f0) arrayList.get(0)).J0() : ((f0) arrayList.get(arrayList.size() - 1)).J0();
            if (iL2 > H1.b.l(j10)) {
                iL2 = H1.b.l(j10);
            }
            int i11 = iL2;
            int i12 = intRef.f143740a;
            final float f10 = this.f18982b;
            return K.G0(Layout, i11, i12, null, new Function1() { // from class: Li.f
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4107g.a.b(Layout, f10, arrayList, iJ0, intRef, (f0.a) obj);
                }
            }, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Li.g$b */
    static final class b implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f18983a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC4101a f18984b;

        b(Context context, AbstractC4101a abstractC4101a) {
            this.f18983a = context;
            this.f18984b = abstractC4101a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(List list, int i10, Ref.IntRef intRef, Ref.IntRef intRef2, f0.a layout) {
            int i11;
            int height;
            int i12;
            int i13;
            Intrinsics.j(layout, "$this$layout");
            Iterator it = list.iterator();
            int width = 0;
            while (it.hasNext()) {
                f0 f0Var = (f0) it.next();
                if (i10 == 0) {
                    i13 = 0;
                } else {
                    if (f0Var.l0(C5917b.a()) != Integer.MIN_VALUE) {
                        int iL0 = f0Var.l0(C5917b.b()) / f0Var.l0(C5917b.a());
                        int iL02 = intRef.f143740a - f0Var.l0(C5917b.b());
                        i11 = (i10 / 2) - ((intRef.f143740a / iL0) / 2);
                        height = iL02 / 4;
                    } else if (f0Var.l0(C5917b.a()) == Integer.MIN_VALUE) {
                        i12 = intRef2.f143740a / 2;
                        i13 = i12;
                    } else {
                        i11 = i10 / 2;
                        height = f0Var.getHeight() / 2;
                    }
                    i12 = i11 - height;
                    i13 = i12;
                }
                f0.a aVar = layout;
                f0.a.l(aVar, f0Var, width, i13, 0.0f, 4, null);
                width += f0Var.getWidth();
                layout = aVar;
            }
            return Unit.f143329a;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final J d(K Layout, List<? extends I> measurables, long j10) {
            f0 f0Var;
            int height;
            Intrinsics.j(Layout, "$this$Layout");
            Intrinsics.j(measurables, "measurables");
            final Ref.IntRef intRef = new Ref.IntRef();
            int iL = H1.b.l(j10);
            float fK = Layout.K(this.f18983a.getResources().getDisplayMetrics().widthPixels);
            int iE0 = H1.b.l(j10) >= Layout.E0(fK) ? Layout.E0(fK) : H1.b.l(j10);
            final Ref.IntRef intRef2 = new Ref.IntRef();
            List<? extends I> list = measurables;
            final ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            long jD = j10;
            int iL2 = 0;
            while (it.hasNext()) {
                f0 f0VarK0 = ((I) it.next()).k0(jD);
                int iM0 = iL2 + f0VarK0.M0();
                int i10 = iL - iM0;
                if (i10 > 0) {
                    f0Var = f0VarK0;
                    jD = H1.b.d(jD, 0, i10, 0, 0, 13, null);
                } else {
                    f0Var = f0VarK0;
                }
                long j11 = jD;
                if (f0Var.l0(C5917b.b()) != Integer.MIN_VALUE) {
                    intRef2.f143740a = f0Var.l0(C5917b.a());
                    height = f0Var.l0(C5917b.b());
                } else {
                    height = f0Var.getHeight();
                }
                intRef.f143740a = Math.max(intRef.f143740a, height);
                int i11 = iE0 - iM0;
                jD = i11 > 0 ? H1.b.d(j11, 0, i11, 0, 0, 13, null) : j11;
                arrayList.add(f0Var);
                iL2 = iM0;
            }
            final int iJ0 = Intrinsics.e(this.f18984b, AbstractC4101a.b.f18957a) ? ((f0) arrayList.get(0)).J0() : intRef2.f143740a;
            if (iL2 > H1.b.l(j10)) {
                iL2 = H1.b.l(j10);
            }
            return K.G0(Layout, iL2, intRef.f143740a, null, new Function1() { // from class: Li.h
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4107g.b.b(arrayList, iJ0, intRef, intRef2, (f0.a) obj);
                }
            }, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Li.g$c */
    static final class c implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f18985a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f18986b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<f0> f18987c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<f0> f18988d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f18989e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f18990f;

        c(float f10, Context context, Ref.ObjectRef<f0> objectRef, Ref.ObjectRef<f0> objectRef2, Ref.IntRef intRef, Ref.IntRef intRef2) {
            this.f18985a = f10;
            this.f18986b = context;
            this.f18987c = objectRef;
            this.f18988d = objectRef2;
            this.f18989e = intRef;
            this.f18990f = intRef2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit b(Ref.IntRef intRef, Ref.IntRef intRef2, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, K k10, float f10, f0.a layout) {
            Intrinsics.j(layout, "$this$layout");
            int iAbs = (int) Math.abs((intRef.f143740a - intRef2.f143740a) / 2.0d);
            boolean z10 = intRef.f143740a > intRef2.f143740a;
            f0 f0Var = (f0) objectRef.f143742a;
            int iM0 = 0;
            if (f0Var != null) {
                f0.a.l(layout, f0Var, 0, !z10 ? iAbs : 0, 0.0f, 4, null);
                iM0 = f0Var.M0() + ((int) k10.I1(f10));
            }
            f0 f0Var2 = (f0) objectRef2.f143742a;
            if (f0Var2 != null) {
                f0.a.l(layout, f0Var2, iM0, z10 ? iAbs : 0, 0.0f, 4, null);
            }
            return Unit.f143329a;
        }

        /* JADX WARN: Type inference failed for: r4v12, types: [T, androidx.compose.ui.layout.f0] */
        /* JADX WARN: Type inference failed for: r5v15, types: [T, androidx.compose.ui.layout.f0] */
        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final J d(final K Layout, List<? extends I> measurables, long j10) {
            Intrinsics.j(Layout, "$this$Layout");
            Intrinsics.j(measurables, "measurables");
            int iI1 = (int) Layout.I1(this.f18985a);
            long jD = H1.b.d(j10, 0, RangesKt.k(H1.b.l(j10) - iI1, this.f18986b.getResources().getDisplayMetrics().widthPixels), 0, RangesKt.k(H1.b.k(j10), this.f18986b.getResources().getDisplayMetrics().heightPixels), 5, null);
            List<? extends I> list = measurables;
            Ref.ObjectRef<f0> objectRef = this.f18987c;
            Ref.ObjectRef<f0> objectRef2 = this.f18988d;
            Ref.IntRef intRef = this.f18989e;
            Ref.IntRef intRef2 = this.f18990f;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            int iM0 = iI1;
            int iMax = 0;
            long jD2 = jD;
            for (I i10 : list) {
                if (Intrinsics.e(C5937w.a(i10), "other")) {
                    ?? K02 = i10.k0(jD2);
                    iM0 += K02.M0();
                    jD2 = H1.b.d(jD2, 0, H1.b.l(jD2) - K02.M0(), 0, 0, 13, null);
                    iMax = Math.max(iMax, K02.J0());
                    intRef.f143740a = K02.J0();
                    objectRef.f143742a = K02;
                } else if (Intrinsics.e(C5937w.a(i10), "text")) {
                    ?? K03 = i10.k0(jD2);
                    iM0 += K03.M0();
                    jD2 = H1.b.d(jD2, 0, H1.b.l(jD2) - K03.M0(), 0, 0, 13, null);
                    iMax = Math.max(iMax, K03.J0());
                    intRef2.f143740a = i10.W(a.e.API_PRIORITY_OTHER);
                    objectRef2.f143742a = K03;
                }
                arrayList.add(Unit.f143329a);
            }
            final Ref.IntRef intRef3 = this.f18989e;
            int i11 = iMax;
            final Ref.IntRef intRef4 = this.f18990f;
            final Ref.ObjectRef<f0> objectRef3 = this.f18987c;
            final Ref.ObjectRef<f0> objectRef4 = this.f18988d;
            final float f10 = this.f18985a;
            return K.G0(Layout, iM0, i11, null, new Function1() { // from class: Li.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4107g.c.b(intRef3, intRef4, objectRef3, objectRef4, Layout, f10, (f0.a) obj);
                }
            }, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Li.g$d */
    static final class d implements MeasurePolicy {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f18991a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f18992b;

        d(Context context, float f10) {
            this.f18991a = context;
            this.f18992b = f10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(K k10, float f10, List list, Ref.IntRef intRef, f0.a layout) {
            Intrinsics.j(layout, "$this$layout");
            int iE0 = k10.E0(f10);
            Iterator it = list.iterator();
            int width = iE0;
            while (it.hasNext()) {
                f0 f0Var = (f0) it.next();
                f0.a.l(layout, f0Var, width, (intRef.f143740a - f0Var.J0()) / 2, 0.0f, 4, null);
                width += f0Var.getWidth();
            }
            return Unit.f143329a;
        }

        @Override // androidx.compose.ui.layout.MeasurePolicy
        public final J d(final K Layout, List<? extends I> measurables, long j10) {
            Intrinsics.j(Layout, "$this$Layout");
            Intrinsics.j(measurables, "measurables");
            final Ref.IntRef intRef = new Ref.IntRef();
            float fK = Layout.K(this.f18991a.getResources().getDisplayMetrics().widthPixels);
            int iE0 = H1.b.l(j10) >= Layout.E0(fK) ? Layout.E0(fK) : H1.b.l(j10);
            List<? extends I> list = measurables;
            final ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            Iterator<T> it = list.iterator();
            int iL = 0;
            long jD = j10;
            while (it.hasNext()) {
                f0 f0VarK0 = ((I) it.next()).k0(jD);
                iL += f0VarK0.M0();
                intRef.f143740a = Math.max(intRef.f143740a, f0VarK0.l0(C5917b.a()) != Integer.MIN_VALUE ? f0VarK0.l0(C5917b.a()) : f0VarK0.getHeight());
                int i10 = iE0 - iL;
                if (i10 > 0) {
                    jD = H1.b.d(jD, 0, i10, 0, 0, 13, null);
                }
                arrayList.add(f0VarK0);
            }
            if (iL > H1.b.l(j10)) {
                iL = H1.b.l(j10);
            }
            int i11 = iL;
            int i12 = intRef.f143740a;
            final float f10 = this.f18992b;
            return K.G0(Layout, i11, i12, null, new Function1() { // from class: Li.j
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C4107g.d.b(Layout, f10, arrayList, intRef, (f0.a) obj);
                }
            }, 4, null);
        }
    }

    public static final void e(AbstractC4101a abstractC4101a, float f10, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(266645662);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.V(abstractC4101a) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.b(f10) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= composerStartRestartGroup.D(content) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                abstractC4101a = AbstractC4101a.b.f18957a;
            }
            if (i14 != 0) {
                f10 = H1.h.p(0);
            }
            if (ComposerKt.M()) {
                ComposerKt.U(266645662, i12, -1, "com.meijer.mobile.android_acres_library.layouts.AdsBaselineRow (BaselineRowLayout.kt:252)");
            }
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z10 = ((i12 & 14) == 4) | ((i12 & 112) == 32);
            Object objB = composerStartRestartGroup.B();
            if (z10 || objB == Composer.INSTANCE.a()) {
                objB = new a(abstractC4101a, f10);
                composerStartRestartGroup.t(objB);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objB;
            composerStartRestartGroup.P();
            int i15 = (i12 >> 6) & 14;
            Modifier.Companion companion = Modifier.INSTANCE;
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            int i16 = ((i15 << 6) & 896) | 6;
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicy, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            content.invoke(composerStartRestartGroup, Integer.valueOf((i16 >> 6) & 14));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        final AbstractC4101a abstractC4101a2 = abstractC4101a;
        final float f11 = f10;
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Li.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4107g.j(abstractC4101a2, f11, content, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @SuppressLint({"AlwaysProvideAModifier"})
    public static final void f(final AbstractC4101a abstractC4101a, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(518018116);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.V(abstractC4101a) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(content) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                abstractC4101a = AbstractC4101a.b.f18957a;
            }
            if (ComposerKt.M()) {
                ComposerKt.U(518018116, i12, -1, "com.meijer.mobile.android_acres_library.layouts.AdsBaselineRowBullet (BaselineRowLayout.kt:311)");
            }
            Context context = (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(context) | ((i12 & 14) == 4);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new b(context, abstractC4101a);
                composerStartRestartGroup.t(objB);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objB;
            composerStartRestartGroup.P();
            int i14 = (i12 >> 3) & 14;
            Modifier.Companion companion = Modifier.INSTANCE;
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            int i15 = ((i14 << 6) & 896) | 6;
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicy, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            content.invoke(composerStartRestartGroup, Integer.valueOf((i15 >> 6) & 14));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Li.e
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4107g.g(abstractC4101a, content, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(AbstractC4101a abstractC4101a, Function2 function2, int i10, int i11, Composer composer, int i12) {
        f(abstractC4101a, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"AlwaysProvideAModifier"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r17, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r18, float r19, androidx.compose.runtime.Composer r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 578
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C4107g.h(kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(Function2 function2, Function2 function22, float f10, int i10, int i11, Composer composer, int i12) {
        h(function2, function22, f10, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(AbstractC4101a abstractC4101a, float f10, Function2 function2, int i10, int i11, Composer composer, int i12) {
        e(abstractC4101a, f10, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }

    @SuppressLint({"AlwaysProvideAModifier"})
    public static final void k(final float f10, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i10, final int i11) {
        int i12;
        Intrinsics.j(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(2041201649);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (composerStartRestartGroup.b(f10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= composerStartRestartGroup.D(content) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && composerStartRestartGroup.j()) {
            composerStartRestartGroup.K();
        } else {
            if (i13 != 0) {
                f10 = H1.h.p(0);
            }
            if (ComposerKt.M()) {
                ComposerKt.U(2041201649, i12, -1, "com.meijer.mobile.android_acres_library.layouts.AdsButtonBaseline (BaselineRowLayout.kt:45)");
            }
            Context context = (Context) composerStartRestartGroup.o(AndroidCompositionLocals_androidKt.g());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zD = composerStartRestartGroup.D(context) | ((i12 & 14) == 4);
            Object objB = composerStartRestartGroup.B();
            if (zD || objB == Composer.INSTANCE.a()) {
                objB = new d(context, f10);
                composerStartRestartGroup.t(objB);
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) objB;
            composerStartRestartGroup.P();
            int i14 = (i12 >> 3) & 14;
            Modifier.Companion companion = Modifier.INSTANCE;
            int iA = C5859f.a(composerStartRestartGroup, 0);
            InterfaceC5884s interfaceC5884sR = composerStartRestartGroup.r();
            Modifier modifierE = androidx.compose.ui.b.e(composerStartRestartGroup, companion);
            InterfaceC5953g.Companion companion2 = InterfaceC5953g.INSTANCE;
            Function0<InterfaceC5953g> function0A = companion2.a();
            int i15 = ((i14 << 6) & 896) | 6;
            if (composerStartRestartGroup.k() == null) {
                C5859f.c();
            }
            composerStartRestartGroup.F();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.I(function0A);
            } else {
                composerStartRestartGroup.s();
            }
            Composer composerA = D1.a(composerStartRestartGroup);
            D1.c(composerA, measurePolicy, companion2.e());
            D1.c(composerA, interfaceC5884sR, companion2.g());
            Function2<InterfaceC5953g, Integer, Unit> function2B = companion2.b();
            if (composerA.getInserting() || !Intrinsics.e(composerA.B(), Integer.valueOf(iA))) {
                composerA.t(Integer.valueOf(iA));
                composerA.n(Integer.valueOf(iA), function2B);
            }
            D1.c(composerA, modifierE, companion2.f());
            content.invoke(composerStartRestartGroup, Integer.valueOf((i15 >> 6) & 14));
            composerStartRestartGroup.v();
            if (ComposerKt.M()) {
                ComposerKt.T();
            }
        }
        T0 t0L = composerStartRestartGroup.l();
        if (t0L != null) {
            t0L.a(new Function2() { // from class: Li.b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return C4107g.l(f10, content, i10, i11, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(float f10, Function2 function2, int i10, int i11, Composer composer, int i12) {
        k(f10, function2, composer, J0.a(i10 | 1), i11);
        return Unit.f143329a;
    }
}
