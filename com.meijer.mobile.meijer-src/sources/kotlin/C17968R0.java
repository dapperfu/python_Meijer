package kotlin;

import androidx.compose.ui.layout.C5937w;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.InterfaceC5933s;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.layout.r;
import com.google.android.gms.common.api.a;
import j0.InterfaceC14882C;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u0001B3\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJC\u0010\u0016\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u0019\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u00122\u0018\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0014H\u0002¢\u0006\u0004\b\u0019\u0010\u0017J,\u0010\u001f\u001a\u00020\u001e*\u00020\u001a2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000f2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J)\u0010!\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b!\u0010\"J)\u0010#\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b#\u0010\"J)\u0010$\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b$\u0010\"J)\u0010%\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b%\u0010\"R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010,\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-"}, d2 = {"Lx0/R0;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Lkotlin/Function1;", "LU0/k;", "", "onLabelMeasured", "", "singleLine", "", "animationProgress", "Lj0/C;", "paddingValues", "<init>", "(Lkotlin/jvm/functions/Function1;ZFLj0/C;)V", "Landroidx/compose/ui/layout/s;", "", "Landroidx/compose/ui/layout/r;", "measurables", "", "height", "Lkotlin/Function2;", "intrinsicMeasurer", "h", "(Landroidx/compose/ui/layout/s;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I", "width", "f", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;", "j", "(Landroidx/compose/ui/layout/s;Ljava/util/List;I)I", "g", "e", "i", "a", "Lkotlin/jvm/functions/Function1;", "b", "Z", "c", "F", "Lj0/C;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: x0.R0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17968R0 implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Function1<U0.k, Unit> onLabelMeasured;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean singleLine;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float animationProgress;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14882C paddingValues;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/r;", "intrinsicMeasurable", "", "w", "a", "(Landroidx/compose/ui/layout/r;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.R0$a */
    static final class a extends Lambda implements Function2<r, Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f168481f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(r rVar, Integer num) {
            return a(rVar, num.intValue());
        }

        public final Integer a(r rVar, int i10) {
            return Integer.valueOf(rVar.A(i10));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/r;", "intrinsicMeasurable", "", "h", "a", "(Landroidx/compose/ui/layout/r;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.R0$b */
    static final class b extends Lambda implements Function2<r, Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f168482f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(r rVar, Integer num) {
            return a(rVar, num.intValue());
        }

        public final Integer a(r rVar, int i10) {
            return Integer.valueOf(rVar.j0(i10));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.R0$c */
    static final class c extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f168483f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f168484g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ f0 f168485h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ f0 f168486i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ f0 f168487j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ f0 f168488k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ f0 f168489l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ f0 f168490m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ C17968R0 f168491n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ K f168492o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, int i11, f0 f0Var, f0 f0Var2, f0 f0Var3, f0 f0Var4, f0 f0Var5, f0 f0Var6, C17968R0 c17968r0, K k10) {
            super(1);
            this.f168483f = i10;
            this.f168484g = i11;
            this.f168485h = f0Var;
            this.f168486i = f0Var2;
            this.f168487j = f0Var3;
            this.f168488k = f0Var4;
            this.f168489l = f0Var5;
            this.f168490m = f0Var6;
            this.f168491n = c17968r0;
            this.f168492o = k10;
        }

        public final void a(f0.a aVar) {
            C17967Q0.k(aVar, this.f168483f, this.f168484g, this.f168485h, this.f168486i, this.f168487j, this.f168488k, this.f168489l, this.f168490m, this.f168491n.animationProgress, this.f168491n.singleLine, this.f168492o.getDensity(), this.f168492o.getLayoutDirection(), this.f168491n.paddingValues);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/r;", "intrinsicMeasurable", "", "w", "a", "(Landroidx/compose/ui/layout/r;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.R0$d */
    static final class d extends Lambda implements Function2<r, Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f168493f = new d();

        d() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(r rVar, Integer num) {
            return a(rVar, num.intValue());
        }

        public final Integer a(r rVar, int i10) {
            return Integer.valueOf(rVar.W(i10));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/r;", "intrinsicMeasurable", "", "h", "a", "(Landroidx/compose/ui/layout/r;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: x0.R0$e */
    static final class e extends Lambda implements Function2<r, Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f168494f = new e();

        e() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(r rVar, Integer num) {
            return a(rVar, num.intValue());
        }

        public final Integer a(r rVar, int i10) {
            return Integer.valueOf(rVar.d0(i10));
        }
    }

    private final int f(InterfaceC5933s interfaceC5933s, List<? extends r> list, int i10, Function2<? super r, ? super Integer, Integer> function2) {
        r rVar;
        r rVar2;
        int iL;
        int iIntValue;
        r rVar3;
        int iIntValue2;
        r rVar4;
        int size = list.size();
        int i11 = 0;
        while (true) {
            rVar = null;
            if (i11 >= size) {
                rVar2 = null;
                break;
            }
            rVar2 = list.get(i11);
            if (Intrinsics.e(I1.e(rVar2), "Leading")) {
                break;
            }
            i11++;
        }
        r rVar5 = rVar2;
        if (rVar5 != null) {
            iL = C17967Q0.l(i10, rVar5.j0(a.e.API_PRIORITY_OTHER));
            iIntValue = function2.invoke(rVar5, Integer.valueOf(i10)).intValue();
        } else {
            iL = i10;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                rVar3 = null;
                break;
            }
            rVar3 = list.get(i12);
            if (Intrinsics.e(I1.e(rVar3), "Trailing")) {
                break;
            }
            i12++;
        }
        r rVar6 = rVar3;
        if (rVar6 != null) {
            iL = C17967Q0.l(iL, rVar6.j0(a.e.API_PRIORITY_OTHER));
            iIntValue2 = function2.invoke(rVar6, Integer.valueOf(i10)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size3) {
                rVar4 = null;
                break;
            }
            rVar4 = list.get(i13);
            if (Intrinsics.e(I1.e(rVar4), "Label")) {
                break;
            }
            i13++;
        }
        r rVar7 = rVar4;
        int iIntValue3 = rVar7 != null ? function2.invoke(rVar7, Integer.valueOf(J1.b.c(iL, i10, this.animationProgress))).intValue() : 0;
        int size4 = list.size();
        for (int i14 = 0; i14 < size4; i14++) {
            r rVar8 = list.get(i14);
            if (Intrinsics.e(I1.e(rVar8), "TextField")) {
                int iIntValue4 = function2.invoke(rVar8, Integer.valueOf(iL)).intValue();
                int size5 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size5) {
                        break;
                    }
                    r rVar9 = list.get(i15);
                    if (Intrinsics.e(I1.e(rVar9), "Hint")) {
                        rVar = rVar9;
                        break;
                    }
                    i15++;
                }
                r rVar10 = rVar;
                return C17967Q0.h(iIntValue, iIntValue2, iIntValue4, iIntValue3, rVar10 != null ? function2.invoke(rVar10, Integer.valueOf(iL)).intValue() : 0, this.animationProgress, H1.c.b(0, 0, 0, 0, 15, null), interfaceC5933s.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int h(InterfaceC5933s interfaceC5933s, List<? extends r> list, int i10, Function2<? super r, ? super Integer, Integer> function2) {
        r rVar;
        r rVar2;
        r rVar3;
        r rVar4;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            r rVar5 = list.get(i11);
            if (Intrinsics.e(I1.e(rVar5), "TextField")) {
                int iIntValue = function2.invoke(rVar5, Integer.valueOf(i10)).intValue();
                int size2 = list.size();
                int i12 = 0;
                while (true) {
                    rVar = null;
                    if (i12 >= size2) {
                        rVar2 = null;
                        break;
                    }
                    rVar2 = list.get(i12);
                    if (Intrinsics.e(I1.e(rVar2), "Label")) {
                        break;
                    }
                    i12++;
                }
                r rVar6 = rVar2;
                int iIntValue2 = rVar6 != null ? function2.invoke(rVar6, Integer.valueOf(i10)).intValue() : 0;
                int size3 = list.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                        rVar3 = null;
                        break;
                    }
                    rVar3 = list.get(i13);
                    if (Intrinsics.e(I1.e(rVar3), "Trailing")) {
                        break;
                    }
                    i13++;
                }
                r rVar7 = rVar3;
                int iIntValue3 = rVar7 != null ? function2.invoke(rVar7, Integer.valueOf(i10)).intValue() : 0;
                int size4 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        rVar4 = null;
                        break;
                    }
                    rVar4 = list.get(i14);
                    if (Intrinsics.e(I1.e(rVar4), "Leading")) {
                        break;
                    }
                    i14++;
                }
                r rVar8 = rVar4;
                int iIntValue4 = rVar8 != null ? function2.invoke(rVar8, Integer.valueOf(i10)).intValue() : 0;
                int size5 = list.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size5) {
                        break;
                    }
                    r rVar9 = list.get(i15);
                    if (Intrinsics.e(I1.e(rVar9), "Hint")) {
                        rVar = rVar9;
                        break;
                    }
                    i15++;
                }
                r rVar10 = rVar;
                return C17967Q0.i(iIntValue4, iIntValue3, iIntValue, iIntValue2, rVar10 != null ? function2.invoke(rVar10, Integer.valueOf(i10)).intValue() : 0, this.animationProgress, H1.c.b(0, 0, 0, 0, 15, null), interfaceC5933s.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public J d(K k10, List<? extends I> list, long j10) {
        I i10;
        I i11;
        I i12;
        I i13;
        C17968R0 c17968r0 = this;
        K k11 = k10;
        int iE0 = k11.E0(c17968r0.paddingValues.getBottom());
        long jD = H1.b.d(j10, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                i10 = null;
                break;
            }
            i10 = list.get(i14);
            if (Intrinsics.e(C5937w.a(i10), "Leading")) {
                break;
            }
            i14++;
        }
        I i15 = i10;
        f0 f0VarK0 = i15 != null ? i15.k0(jD) : null;
        int iH = I1.h(f0VarK0);
        int size2 = list.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size2) {
                i11 = null;
                break;
            }
            i11 = list.get(i16);
            if (Intrinsics.e(C5937w.a(i11), "Trailing")) {
                break;
            }
            i16++;
        }
        I i17 = i11;
        f0 f0VarK02 = i17 != null ? i17.k0(H1.c.j(jD, -iH, 0, 2, null)) : null;
        int iH2 = iH + I1.h(f0VarK02);
        int iE02 = k11.E0(c17968r0.paddingValues.b(k11.getLayoutDirection())) + k11.E0(c17968r0.paddingValues.c(k11.getLayoutDirection()));
        int i18 = -iH2;
        int i19 = -iE0;
        long jI = H1.c.i(jD, J1.b.c(i18 - iE02, -iE02, c17968r0.animationProgress), i19);
        int size3 = list.size();
        int i20 = 0;
        while (true) {
            if (i20 >= size3) {
                i12 = null;
                break;
            }
            i12 = list.get(i20);
            if (Intrinsics.e(C5937w.a(i12), "Label")) {
                break;
            }
            i20++;
        }
        I i21 = i12;
        f0 f0VarK03 = i21 != null ? i21.k0(jI) : null;
        c17968r0.onLabelMeasured.invoke(U0.k.c(f0VarK03 != null ? U0.l.a(f0VarK03.getWidth(), f0VarK03.getHeight()) : U0.k.INSTANCE.b()));
        long j11 = j10;
        long jD2 = H1.b.d(H1.c.i(j11, i18, i19 - Math.max(I1.g(f0VarK03) / 2, k11.E0(c17968r0.paddingValues.getTop()))), 0, 0, 0, 0, 11, null);
        int size4 = list.size();
        int i22 = 0;
        while (i22 < size4) {
            I i23 = list.get(i22);
            if (Intrinsics.e(C5937w.a(i23), "TextField")) {
                f0 f0VarK04 = i23.k0(jD2);
                long jD3 = H1.b.d(jD2, 0, 0, 0, 0, 14, null);
                int size5 = list.size();
                int i24 = 0;
                while (true) {
                    if (i24 >= size5) {
                        i13 = null;
                        break;
                    }
                    i13 = list.get(i24);
                    if (Intrinsics.e(C5937w.a(i13), "Hint")) {
                        break;
                    }
                    i24++;
                }
                I i25 = i13;
                f0 f0VarK05 = i25 != null ? i25.k0(jD3) : null;
                int i26 = C17967Q0.i(I1.h(f0VarK0), I1.h(f0VarK02), f0VarK04.getWidth(), I1.h(f0VarK03), I1.h(f0VarK05), c17968r0.animationProgress, j11, k11.getDensity(), c17968r0.paddingValues);
                int iH3 = C17967Q0.h(I1.g(f0VarK0), I1.g(f0VarK02), f0VarK04.getHeight(), I1.g(f0VarK03), I1.g(f0VarK05), c17968r0.animationProgress, j10, k10.getDensity(), c17968r0.paddingValues);
                int size6 = list.size();
                int i27 = 0;
                while (i27 < size6) {
                    I i28 = list.get(i27);
                    if (Intrinsics.e(C5937w.a(i28), "border")) {
                        f0 f0Var = f0VarK04;
                        int i29 = i26;
                        int i30 = iH3;
                        return K.G0(k10, i29, i30, null, new c(i30, i29, f0VarK0, f0VarK02, f0Var, f0VarK03, f0VarK05, i28.k0(H1.c.a(i26 != Integer.MAX_VALUE ? i26 : 0, i26, iH3 != Integer.MAX_VALUE ? iH3 : 0, iH3)), c17968r0, k10), 4, null);
                    }
                    i27++;
                    f0VarK04 = f0VarK04;
                    i26 = i26;
                    f0VarK0 = f0VarK0;
                    iH3 = iH3;
                    c17968r0 = this;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i22++;
            c17968r0 = this;
            k11 = k10;
            j11 = j10;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int e(InterfaceC5933s interfaceC5933s, List<? extends r> list, int i10) {
        return h(interfaceC5933s, list, i10, b.f168482f);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int g(InterfaceC5933s interfaceC5933s, List<? extends r> list, int i10) {
        return f(interfaceC5933s, list, i10, d.f168493f);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int i(InterfaceC5933s interfaceC5933s, List<? extends r> list, int i10) {
        return h(interfaceC5933s, list, i10, e.f168494f);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int j(InterfaceC5933s interfaceC5933s, List<? extends r> list, int i10) {
        return f(interfaceC5933s, list, i10, a.f168481f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C17968R0(Function1<? super U0.k, Unit> function1, boolean z10, float f10, InterfaceC14882C interfaceC14882C) {
        this.onLabelMeasured = function1;
        this.singleLine = z10;
        this.animationProgress = f10;
        this.paddingValues = interfaceC14882C;
    }
}
