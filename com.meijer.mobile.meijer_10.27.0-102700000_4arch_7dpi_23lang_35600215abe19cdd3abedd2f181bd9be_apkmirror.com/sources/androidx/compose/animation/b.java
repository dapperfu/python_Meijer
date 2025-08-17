package androidx.compose.animation;

import H1.n;
import H1.r;
import H1.t;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.InterfaceC5791s;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u0017\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J)\u0010\u0018\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"Landroidx/compose/animation/b;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "rootScope", "<init>", "(Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;)V", "Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;", "Landroidx/compose/ui/layout/s;", "Landroidx/compose/ui/layout/r;", "", "height", "i", "(Landroidx/compose/ui/layout/s;Ljava/util/List;I)I", "width", "g", "e", "j", "a", "Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "()Landroidx/compose/animation/AnimatedContentTransitionScopeImpl;", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class b implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AnimatedContentTransitionScopeImpl<?> rootScope;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f0[] f47801f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ b f47802g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f47803h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f47804i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f0[] f0VarArr, b bVar, int i10, int i11) {
            super(1);
            this.f47801f = f0VarArr;
            this.f47802g = bVar;
            this.f47803h = i10;
            this.f47804i = i11;
        }

        public final void a(f0.a aVar) {
            f0[] f0VarArr;
            f0[] f0VarArr2 = this.f47801f;
            b bVar = this.f47802g;
            int i10 = this.f47803h;
            int i11 = this.f47804i;
            int length = f0VarArr2.length;
            int i12 = 0;
            while (i12 < length) {
                f0 f0Var = f0VarArr2[i12];
                if (f0Var != null) {
                    f0VarArr = f0VarArr2;
                    long jA = bVar.a().getContentAlignment().a(r.c((f0Var.getWidth() << 32) | (f0Var.getHeight() & 4294967295L)), r.c((i11 & 4294967295L) | (i10 << 32)), t.f12006a);
                    f0.a.h(aVar, f0Var, n.k(jA), n.l(jA), 0.0f, 4, null);
                } else {
                    f0VarArr = f0VarArr2;
                }
                i12++;
                f0VarArr2 = f0VarArr;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    public final AnimatedContentTransitionScopeImpl<?> a() {
        return this.rootScope;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public J d(K k10, List<? extends I> list, long j10) {
        f0 f0Var;
        f0 f0Var2;
        int width;
        int height;
        int size = list.size();
        f0[] f0VarArr = new f0[size];
        long jA = r.INSTANCE.a();
        List<? extends I> list2 = list;
        int size2 = list2.size();
        int i10 = 0;
        while (true) {
            f0Var = null;
            if (i10 >= size2) {
                break;
            }
            I i11 = list.get(i10);
            Object parentData = i11.getParentData();
            AnimatedContentTransitionScopeImpl.a aVar = parentData instanceof AnimatedContentTransitionScopeImpl.a ? (AnimatedContentTransitionScopeImpl.a) parentData : null;
            if (aVar != null && aVar.b()) {
                f0 f0VarK0 = i11.k0(j10);
                long jC = r.c((f0VarK0.getWidth() << 32) | (f0VarK0.getHeight() & 4294967295L));
                Unit unit = Unit.f142422a;
                f0VarArr[i10] = f0VarK0;
                jA = jC;
            }
            i10++;
        }
        int size3 = list2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            I i13 = list.get(i12);
            if (f0VarArr[i12] == null) {
                f0VarArr[i12] = i13.k0(j10);
            }
        }
        if (k10.v0()) {
            width = (int) (jA >> 32);
        } else {
            if (size == 0) {
                f0Var2 = null;
            } else {
                f0Var2 = f0VarArr[0];
                int iM0 = ArraysKt.m0(f0VarArr);
                if (iM0 != 0) {
                    int width2 = f0Var2 != null ? f0Var2.getWidth() : 0;
                    IntIterator it = new IntRange(1, iM0).iterator();
                    while (it.hasNext()) {
                        f0 f0Var3 = f0VarArr[it.nextInt()];
                        int width3 = f0Var3 != null ? f0Var3.getWidth() : 0;
                        if (width2 < width3) {
                            f0Var2 = f0Var3;
                            width2 = width3;
                        }
                    }
                }
            }
            width = f0Var2 != null ? f0Var2.getWidth() : 0;
        }
        if (k10.v0()) {
            height = (int) (jA & 4294967295L);
        } else {
            if (size != 0) {
                f0Var = f0VarArr[0];
                int iM02 = ArraysKt.m0(f0VarArr);
                if (iM02 != 0) {
                    int height2 = f0Var != null ? f0Var.getHeight() : 0;
                    IntIterator it2 = new IntRange(1, iM02).iterator();
                    while (it2.hasNext()) {
                        f0 f0Var4 = f0VarArr[it2.nextInt()];
                        int height3 = f0Var4 != null ? f0Var4.getHeight() : 0;
                        if (height2 < height3) {
                            f0Var = f0Var4;
                            height2 = height3;
                        }
                    }
                }
            }
            height = f0Var != null ? f0Var.getHeight() : 0;
        }
        if (!k10.v0()) {
            this.rootScope.l(r.c((width << 32) | (height & 4294967295L)));
        }
        return K.G0(k10, width, height, null, new a(f0VarArr, this, width, height), 4, null);
    }

    public b(AnimatedContentTransitionScopeImpl<?> animatedContentTransitionScopeImpl) {
        this.rootScope = animatedContentTransitionScopeImpl;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int e(InterfaceC5791s interfaceC5791s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).j0(i10));
            int iO = CollectionsKt.o(list);
            int i11 = 1;
            if (1 <= iO) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).j0(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iO) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf == null) {
            return 0;
        }
        return numValueOf.intValue();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int g(InterfaceC5791s interfaceC5791s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).W(i10));
            int iO = CollectionsKt.o(list);
            int i11 = 1;
            if (1 <= iO) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).W(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iO) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf == null) {
            return 0;
        }
        return numValueOf.intValue();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int i(InterfaceC5791s interfaceC5791s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).d0(i10));
            int iO = CollectionsKt.o(list);
            int i11 = 1;
            if (1 <= iO) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).d0(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iO) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf == null) {
            return 0;
        }
        return numValueOf.intValue();
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int j(InterfaceC5791s interfaceC5791s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
        Integer numValueOf;
        if (list.isEmpty()) {
            numValueOf = null;
        } else {
            numValueOf = Integer.valueOf(list.get(0).A(i10));
            int iO = CollectionsKt.o(list);
            int i11 = 1;
            if (1 <= iO) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).A(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iO) {
                        break;
                    }
                    i11++;
                }
            }
        }
        if (numValueOf == null) {
            return 0;
        }
        return numValueOf.intValue();
    }
}
