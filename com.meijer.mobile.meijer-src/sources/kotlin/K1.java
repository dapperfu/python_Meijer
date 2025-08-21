package kotlin;

import androidx.compose.ui.layout.C5917b;
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
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ?\u0010\u0011\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0015\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\r2\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J,\u0010\u001c\u001a\u00020\u001b*\u00020\u00172\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00180\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001e\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010 \u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b \u0010\u001fJ)\u0010!\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\u001fJ)\u0010\"\u001a\u00020\r*\u00020\u00132\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Lx0/K1;", "Landroidx/compose/ui/layout/MeasurePolicy;", "", "singleLine", "", "animationProgress", "Lj0/C;", "paddingValues", "<init>", "(ZFLj0/C;)V", "", "Landroidx/compose/ui/layout/r;", "measurables", "", "height", "Lkotlin/Function2;", "intrinsicMeasurer", "h", "(Ljava/util/List;ILkotlin/jvm/functions/Function2;)I", "Landroidx/compose/ui/layout/s;", "width", "f", "(Landroidx/compose/ui/layout/s;Ljava/util/List;ILkotlin/jvm/functions/Function2;)I", "Landroidx/compose/ui/layout/K;", "Landroidx/compose/ui/layout/I;", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;", "j", "(Landroidx/compose/ui/layout/s;Ljava/util/List;I)I", "g", "e", "i", "a", "Z", "b", "F", "c", "Lj0/C;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class K1 implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean singleLine;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float animationProgress;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14882C paddingValues;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/r;", "intrinsicMeasurable", "", "w", "a", "(Landroidx/compose/ui/layout/r;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function2<r, Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f168195f = new a();

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
    static final class b extends Lambda implements Function2<r, Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f168196f = new b();

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
    static final class c extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f168197f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f168198g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f168199h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f168200i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f168201j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ f0 f168202k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ f0 f168203l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ f0 f168204m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ f0 f168205n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ K1 f168206o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f168207p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f168208q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ K f168209r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f0 f0Var, int i10, int i11, int i12, int i13, f0 f0Var2, f0 f0Var3, f0 f0Var4, f0 f0Var5, K1 k12, int i14, int i15, K k10) {
            super(1);
            this.f168197f = f0Var;
            this.f168198g = i10;
            this.f168199h = i11;
            this.f168200i = i12;
            this.f168201j = i13;
            this.f168202k = f0Var2;
            this.f168203l = f0Var3;
            this.f168204m = f0Var4;
            this.f168205n = f0Var5;
            this.f168206o = k12;
            this.f168207p = i14;
            this.f168208q = i15;
            this.f168209r = k10;
        }

        public final void a(f0.a aVar) {
            if (this.f168197f == null) {
                J1.k(aVar, this.f168200i, this.f168201j, this.f168202k, this.f168203l, this.f168204m, this.f168205n, this.f168206o.singleLine, this.f168209r.getDensity(), this.f168206o.paddingValues);
            } else {
                J1.j(aVar, this.f168200i, this.f168201j, this.f168202k, this.f168197f, this.f168203l, this.f168204m, this.f168205n, this.f168206o.singleLine, RangesKt.f(this.f168198g - this.f168199h, 0), this.f168207p + this.f168208q, this.f168206o.animationProgress, this.f168209r.getDensity());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/layout/r;", "intrinsicMeasurable", "", "w", "a", "(Landroidx/compose/ui/layout/r;I)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0})
    static final class d extends Lambda implements Function2<r, Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final d f168210f = new d();

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
    static final class e extends Lambda implements Function2<r, Integer, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f168211f = new e();

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
        int i11;
        int iIntValue;
        int iL;
        r rVar3;
        int iIntValue2;
        r rVar4;
        int size = list.size();
        int i12 = 0;
        while (true) {
            rVar = null;
            if (i12 >= size) {
                rVar2 = null;
                break;
            }
            rVar2 = list.get(i12);
            if (Intrinsics.e(I1.e(rVar2), "Leading")) {
                break;
            }
            i12++;
        }
        r rVar5 = rVar2;
        if (rVar5 != null) {
            i11 = i10;
            iL = J1.l(i11, rVar5.j0(a.e.API_PRIORITY_OTHER));
            iIntValue = function2.invoke(rVar5, Integer.valueOf(i11)).intValue();
        } else {
            i11 = i10;
            iIntValue = 0;
            iL = i11;
        }
        int size2 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                rVar3 = null;
                break;
            }
            rVar3 = list.get(i13);
            if (Intrinsics.e(I1.e(rVar3), "Trailing")) {
                break;
            }
            i13++;
        }
        r rVar6 = rVar3;
        if (rVar6 != null) {
            iL = J1.l(iL, rVar6.j0(a.e.API_PRIORITY_OTHER));
            iIntValue2 = function2.invoke(rVar6, Integer.valueOf(i11)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                rVar4 = null;
                break;
            }
            rVar4 = list.get(i14);
            if (Intrinsics.e(I1.e(rVar4), "Label")) {
                break;
            }
            i14++;
        }
        r rVar7 = rVar4;
        int iIntValue3 = rVar7 != null ? function2.invoke(rVar7, Integer.valueOf(iL)).intValue() : 0;
        int size4 = list.size();
        for (int i15 = 0; i15 < size4; i15++) {
            r rVar8 = list.get(i15);
            if (Intrinsics.e(I1.e(rVar8), "TextField")) {
                int iIntValue4 = function2.invoke(rVar8, Integer.valueOf(iL)).intValue();
                int size5 = list.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size5) {
                        break;
                    }
                    r rVar9 = list.get(i16);
                    if (Intrinsics.e(I1.e(rVar9), "Hint")) {
                        rVar = rVar9;
                        break;
                    }
                    i16++;
                }
                r rVar10 = rVar;
                return J1.g(iIntValue4, iIntValue3 > 0, iIntValue3, iIntValue, iIntValue2, rVar10 != null ? function2.invoke(rVar10, Integer.valueOf(iL)).intValue() : 0, H1.c.b(0, 0, 0, 0, 15, null), interfaceC5933s.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int h(List<? extends r> measurables, int height, Function2<? super r, ? super Integer, Integer> intrinsicMeasurer) {
        r rVar;
        r rVar2;
        r rVar3;
        r rVar4;
        int size = measurables.size();
        for (int i10 = 0; i10 < size; i10++) {
            r rVar5 = measurables.get(i10);
            if (Intrinsics.e(I1.e(rVar5), "TextField")) {
                int iIntValue = intrinsicMeasurer.invoke(rVar5, Integer.valueOf(height)).intValue();
                int size2 = measurables.size();
                int i11 = 0;
                while (true) {
                    rVar = null;
                    if (i11 >= size2) {
                        rVar2 = null;
                        break;
                    }
                    rVar2 = measurables.get(i11);
                    if (Intrinsics.e(I1.e(rVar2), "Label")) {
                        break;
                    }
                    i11++;
                }
                r rVar6 = rVar2;
                int iIntValue2 = rVar6 != null ? intrinsicMeasurer.invoke(rVar6, Integer.valueOf(height)).intValue() : 0;
                int size3 = measurables.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size3) {
                        rVar3 = null;
                        break;
                    }
                    rVar3 = measurables.get(i12);
                    if (Intrinsics.e(I1.e(rVar3), "Trailing")) {
                        break;
                    }
                    i12++;
                }
                r rVar7 = rVar3;
                int iIntValue3 = rVar7 != null ? intrinsicMeasurer.invoke(rVar7, Integer.valueOf(height)).intValue() : 0;
                int size4 = measurables.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size4) {
                        rVar4 = null;
                        break;
                    }
                    rVar4 = measurables.get(i13);
                    if (Intrinsics.e(I1.e(rVar4), "Leading")) {
                        break;
                    }
                    i13++;
                }
                r rVar8 = rVar4;
                int iIntValue4 = rVar8 != null ? intrinsicMeasurer.invoke(rVar8, Integer.valueOf(height)).intValue() : 0;
                int size5 = measurables.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size5) {
                        break;
                    }
                    r rVar9 = measurables.get(i14);
                    if (Intrinsics.e(I1.e(rVar9), "Hint")) {
                        rVar = rVar9;
                        break;
                    }
                    i14++;
                }
                r rVar10 = rVar;
                return J1.h(iIntValue4, iIntValue3, iIntValue, iIntValue2, rVar10 != null ? intrinsicMeasurer.invoke(rVar10, Integer.valueOf(height)).intValue() : 0, H1.c.b(0, 0, 0, 0, 15, null));
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public J d(K k10, List<? extends I> list, long j10) {
        I i10;
        I i11;
        I i12;
        int iL0;
        I i13;
        K1 k12 = this;
        K k11 = k10;
        List<? extends I> list2 = list;
        int iE0 = k11.E0(k12.paddingValues.getTop());
        int iE02 = k11.E0(k12.paddingValues.getBottom());
        int iE03 = k11.E0(J1.i());
        long jD = H1.b.d(j10, 0, 0, 0, 0, 10, null);
        int size = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                i10 = null;
                break;
            }
            i10 = list2.get(i14);
            if (Intrinsics.e(C5937w.a(i10), "Leading")) {
                break;
            }
            i14++;
        }
        I i15 = i10;
        f0 f0VarK0 = i15 != null ? i15.k0(jD) : null;
        int iH = I1.h(f0VarK0);
        int size2 = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size2) {
                i11 = null;
                break;
            }
            i11 = list2.get(i16);
            if (Intrinsics.e(C5937w.a(i11), "Trailing")) {
                break;
            }
            i16++;
        }
        I i17 = i11;
        f0 f0VarK02 = i17 != null ? i17.k0(H1.c.j(jD, -iH, 0, 2, null)) : null;
        int i18 = -iE02;
        int i19 = -(iH + I1.h(f0VarK02));
        long jI = H1.c.i(jD, i19, i18);
        int size3 = list2.size();
        int i20 = 0;
        while (true) {
            if (i20 >= size3) {
                i12 = null;
                break;
            }
            i12 = list2.get(i20);
            if (Intrinsics.e(C5937w.a(i12), "Label")) {
                break;
            }
            i20++;
        }
        I i21 = i12;
        f0 f0VarK03 = i21 != null ? i21.k0(jI) : null;
        if (f0VarK03 != null) {
            iL0 = f0VarK03.l0(C5917b.b());
            if (iL0 == Integer.MIN_VALUE) {
                iL0 = f0VarK03.getHeight();
            }
        } else {
            iL0 = 0;
        }
        int iMax = Math.max(iL0, iE0);
        long jI2 = H1.c.i(H1.b.d(j10, 0, 0, 0, 0, 11, null), i19, f0VarK03 != null ? (i18 - iE03) - iMax : (-iE0) - iE02);
        int size4 = list2.size();
        int i22 = 0;
        while (i22 < size4) {
            I i23 = list2.get(i22);
            if (Intrinsics.e(C5937w.a(i23), "TextField")) {
                f0 f0VarK04 = i23.k0(jI2);
                long jD2 = H1.b.d(jI2, 0, 0, 0, 0, 14, null);
                int size5 = list2.size();
                int i24 = 0;
                while (true) {
                    if (i24 >= size5) {
                        i13 = null;
                        break;
                    }
                    i13 = list2.get(i24);
                    if (Intrinsics.e(C5937w.a(i13), "Hint")) {
                        break;
                    }
                    i24++;
                    list2 = list;
                }
                I i25 = i13;
                f0 f0VarK05 = i25 != null ? i25.k0(jD2) : null;
                int iH2 = J1.h(I1.h(f0VarK0), I1.h(f0VarK02), f0VarK04.getWidth(), I1.h(f0VarK03), I1.h(f0VarK05), j10);
                int iG = J1.g(f0VarK04.getHeight(), f0VarK03 != null, iMax, I1.g(f0VarK0), I1.g(f0VarK02), I1.g(f0VarK05), j10, k11.getDensity(), k12.paddingValues);
                return K.G0(k10, iH2, iG, null, new c(f0VarK03, iE0, iL0, iH2, iG, f0VarK04, f0VarK05, f0VarK0, f0VarK02, k12, iMax, iE03, k11), 4, null);
            }
            i22++;
            k12 = this;
            k11 = k10;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int e(InterfaceC5933s interfaceC5933s, List<? extends r> list, int i10) {
        return h(list, i10, b.f168196f);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int g(InterfaceC5933s interfaceC5933s, List<? extends r> list, int i10) {
        return f(interfaceC5933s, list, i10, d.f168210f);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int i(InterfaceC5933s interfaceC5933s, List<? extends r> list, int i10) {
        return h(list, i10, e.f168211f);
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int j(InterfaceC5933s interfaceC5933s, List<? extends r> list, int i10) {
        return f(interfaceC5933s, list, i10, a.f168195f);
    }

    public K1(boolean z10, float f10, InterfaceC14882C interfaceC14882C) {
        this.singleLine = z10;
        this.animationProgress = f10;
        this.paddingValues = interfaceC14882C;
    }
}
