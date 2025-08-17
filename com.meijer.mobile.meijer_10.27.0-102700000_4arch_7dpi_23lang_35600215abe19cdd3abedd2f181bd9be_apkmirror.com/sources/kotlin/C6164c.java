package kotlin;

import H1.r;
import androidx.compose.ui.layout.I;
import androidx.compose.ui.layout.InterfaceC5791s;
import androidx.compose.ui.layout.J;
import androidx.compose.ui.layout.K;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.f0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J,\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u0017\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J)\u0010\u0018\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Lb0/c;", "Landroidx/compose/ui/layout/MeasurePolicy;", "Lb0/f;", "scope", "<init>", "(Lb0/f;)V", "Landroidx/compose/ui/layout/K;", "", "Landroidx/compose/ui/layout/I;", "measurables", "LH1/b;", "constraints", "Landroidx/compose/ui/layout/J;", "d", "(Landroidx/compose/ui/layout/K;Ljava/util/List;J)Landroidx/compose/ui/layout/J;", "Landroidx/compose/ui/layout/s;", "Landroidx/compose/ui/layout/r;", "", "height", "i", "(Landroidx/compose/ui/layout/s;Ljava/util/List;I)I", "width", "g", "e", "j", "a", "Lb0/f;", "getScope", "()Lb0/f;", "", "b", "Z", "getHasLookaheadOccurred", "()Z", "setHasLookaheadOccurred", "(Z)V", "hasLookaheadOccurred", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: b0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6164c implements MeasurePolicy {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C6167f scope;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean hasLookaheadOccurred;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: b0.c$a */
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<f0> f59521f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends f0> list) {
            super(1);
            this.f59521f = list;
        }

        public final void a(f0.a aVar) {
            List<f0> list = this.f59521f;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                f0.a.h(aVar, list.get(i10), 0, 0, 0.0f, 4, null);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f142422a;
        }
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public J d(K k10, List<? extends I> list, long j10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            f0 f0VarK0 = list.get(i10).k0(j10);
            iMax = Math.max(iMax, f0VarK0.getWidth());
            iMax2 = Math.max(iMax2, f0VarK0.getHeight());
            arrayList.add(f0VarK0);
        }
        if (k10.v0()) {
            this.hasLookaheadOccurred = true;
            this.scope.a().setValue(r.b(r.c((4294967295L & iMax2) | (iMax << 32))));
        } else if (!this.hasLookaheadOccurred) {
            this.scope.a().setValue(r.b(r.c((4294967295L & iMax2) | (iMax << 32))));
        }
        return K.G0(k10, iMax, iMax2, null, new a(arrayList), 4, null);
    }

    public C6164c(C6167f c6167f) {
        this.scope = c6167f;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int e(InterfaceC5791s interfaceC5791s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iJ0 = list.get(0).j0(i10);
        int iO = CollectionsKt.o(list);
        int i11 = 1;
        if (1 <= iO) {
            while (true) {
                int iJ02 = list.get(i11).j0(i10);
                if (iJ02 > iJ0) {
                    iJ0 = iJ02;
                }
                if (i11 == iO) {
                    break;
                }
                i11++;
            }
        }
        return iJ0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int g(InterfaceC5791s interfaceC5791s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iW = list.get(0).W(i10);
        int iO = CollectionsKt.o(list);
        int i11 = 1;
        if (1 <= iO) {
            while (true) {
                int iW2 = list.get(i11).W(i10);
                if (iW2 > iW) {
                    iW = iW2;
                }
                if (i11 == iO) {
                    break;
                }
                i11++;
            }
        }
        return iW;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int i(InterfaceC5791s interfaceC5791s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iD0 = list.get(0).d0(i10);
        int iO = CollectionsKt.o(list);
        int i11 = 1;
        if (1 <= iO) {
            while (true) {
                int iD02 = list.get(i11).d0(i10);
                if (iD02 > iD0) {
                    iD0 = iD02;
                }
                if (i11 == iO) {
                    break;
                }
                i11++;
            }
        }
        return iD0;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int j(InterfaceC5791s interfaceC5791s, List<? extends androidx.compose.ui.layout.r> list, int i10) {
        if (list.isEmpty()) {
            return 0;
        }
        int iA = list.get(0).A(i10);
        int iO = CollectionsKt.o(list);
        int i11 = 1;
        if (1 <= iO) {
            while (true) {
                int iA2 = list.get(i11).A(i10);
                if (iA2 > iA) {
                    iA = iA2;
                }
                if (i11 == iO) {
                    break;
                }
                i11++;
            }
        }
        return iA;
    }
}
