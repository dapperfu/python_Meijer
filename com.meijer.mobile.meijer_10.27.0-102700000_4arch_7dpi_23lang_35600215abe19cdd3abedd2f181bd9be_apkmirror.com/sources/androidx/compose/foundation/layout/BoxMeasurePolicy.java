package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000f\u001a\u00020\u000e*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/i;", "Landroidx/compose/ui/layout/MeasurePolicy;", "LP0/e;", "alignment", "", "propagateMinConstraints", "<init>", "(LP0/e;Z)V", "Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LP0/e;", "b", "Z", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.layout.i, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
final /* data */ class BoxMeasurePolicy implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final P0.e alignment;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean propagateMinConstraints;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.i$a */
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f48599f = new a();

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
    /* renamed from: androidx.compose.foundation.layout.i$b */
    static final class b extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0 f48600f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.I f48601g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.K f48602h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f48603i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f48604j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ BoxMeasurePolicy f48605k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(f0 f0Var, androidx.compose.ui.layout.I i10, androidx.compose.ui.layout.K k10, int i11, int i12, BoxMeasurePolicy boxMeasurePolicy) {
            super(1);
            this.f48600f = f0Var;
            this.f48601g = i10;
            this.f48602h = k10;
            this.f48603i = i11;
            this.f48604j = i12;
            this.f48605k = boxMeasurePolicy;
        }

        public final void a(f0.a aVar) {
            C5662h.h(aVar, this.f48600f, this.f48601g, this.f48602h.getLayoutDirection(), this.f48603i, this.f48604j, this.f48605k.alignment);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.foundation.layout.i$c */
    static final class c extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0[] f48606f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List<androidx.compose.ui.layout.I> f48607g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.K f48608h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f48609i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Ref.IntRef f48610j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ BoxMeasurePolicy f48611k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(f0[] f0VarArr, List<? extends androidx.compose.ui.layout.I> list, androidx.compose.ui.layout.K k10, Ref.IntRef intRef, Ref.IntRef intRef2, BoxMeasurePolicy boxMeasurePolicy) {
            super(1);
            this.f48606f = f0VarArr;
            this.f48607g = list;
            this.f48608h = k10;
            this.f48609i = intRef;
            this.f48610j = intRef2;
            this.f48611k = boxMeasurePolicy;
        }

        public final void a(f0.a aVar) {
            f0[] f0VarArr = this.f48606f;
            List<androidx.compose.ui.layout.I> list = this.f48607g;
            androidx.compose.ui.layout.K k10 = this.f48608h;
            Ref.IntRef intRef = this.f48609i;
            Ref.IntRef intRef2 = this.f48610j;
            BoxMeasurePolicy boxMeasurePolicy = this.f48611k;
            int length = f0VarArr.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                f0 f0Var = f0VarArr[i10];
                Intrinsics.h(f0Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                C5662h.h(aVar, f0Var, list.get(i11), k10.getLayoutDirection(), intRef.f142833a, intRef2.f142833a, boxMeasurePolicy.alignment);
                i10++;
                i11++;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoxMeasurePolicy)) {
            return false;
        }
        BoxMeasurePolicy boxMeasurePolicy = (BoxMeasurePolicy) other;
        return Intrinsics.e(this.alignment, boxMeasurePolicy.alignment) && this.propagateMinConstraints == boxMeasurePolicy.propagateMinConstraints;
    }

    public int hashCode() {
        return (this.alignment.hashCode() * 31) + Boolean.hashCode(this.propagateMinConstraints);
    }

    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.alignment + ", propagateMinConstraints=" + this.propagateMinConstraints + ')';
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public androidx.compose.ui.layout.J d(androidx.compose.ui.layout.K k10, List<? extends androidx.compose.ui.layout.I> list, long j10) {
        int iN;
        int iM;
        f0 f0VarK0;
        if (list.isEmpty()) {
            return androidx.compose.ui.layout.K.G0(k10, H1.b.n(j10), H1.b.m(j10), null, a.f48599f, 4, null);
        }
        long jB = this.propagateMinConstraints ? j10 : H1.b.b(j10 & (-8589934589L));
        if (list.size() == 1) {
            androidx.compose.ui.layout.I i10 = list.get(0);
            if (C5662h.f(i10)) {
                iN = H1.b.n(j10);
                iM = H1.b.m(j10);
                f0VarK0 = i10.k0(H1.b.INSTANCE.c(H1.b.n(j10), H1.b.m(j10)));
            } else {
                f0VarK0 = i10.k0(jB);
                iN = Math.max(H1.b.n(j10), f0VarK0.getWidth());
                iM = Math.max(H1.b.m(j10), f0VarK0.getHeight());
            }
            int i11 = iN;
            int i12 = iM;
            return androidx.compose.ui.layout.K.G0(k10, i11, i12, null, new b(f0VarK0, i10, k10, i11, i12, this), 4, null);
        }
        f0[] f0VarArr = new f0[list.size()];
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.f142833a = H1.b.n(j10);
        Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.f142833a = H1.b.m(j10);
        List<? extends androidx.compose.ui.layout.I> list2 = list;
        int size = list2.size();
        boolean z10 = false;
        for (int i13 = 0; i13 < size; i13++) {
            androidx.compose.ui.layout.I i14 = list.get(i13);
            if (C5662h.f(i14)) {
                z10 = true;
            } else {
                f0 f0VarK02 = i14.k0(jB);
                f0VarArr[i13] = f0VarK02;
                intRef.f142833a = Math.max(intRef.f142833a, f0VarK02.getWidth());
                intRef2.f142833a = Math.max(intRef2.f142833a, f0VarK02.getHeight());
            }
        }
        if (z10) {
            int i15 = intRef.f142833a;
            int i16 = i15 != Integer.MAX_VALUE ? i15 : 0;
            int i17 = intRef2.f142833a;
            long jA = H1.c.a(i16, i15, i17 != Integer.MAX_VALUE ? i17 : 0, i17);
            int size2 = list2.size();
            for (int i18 = 0; i18 < size2; i18++) {
                androidx.compose.ui.layout.I i19 = list.get(i18);
                if (C5662h.f(i19)) {
                    f0VarArr[i18] = i19.k0(jA);
                }
            }
        }
        return androidx.compose.ui.layout.K.G0(k10, intRef.f142833a, intRef2.f142833a, null, new c(f0VarArr, list, k10, intRef, intRef2, this), 4, null);
    }

    public BoxMeasurePolicy(P0.e eVar, boolean z10) {
        this.alignment = eVar;
        this.propagateMinConstraints = z10;
    }
}
