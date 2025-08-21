package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.C5800d;
import androidx.compose.ui.layout.f0;
import j0.C14884E;
import j0.InterfaceC14885F;
import j0.RowColumnParentData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0005J=\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJi\u0010\u001e\u001a\u00020\u001d2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010#\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$J/\u0010'\u001a\u00020&2\u0006\u0010\u0017\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00103\u001a\u0002008&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u00068À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/layout/s;", "Lj0/F;", "Landroidx/compose/ui/layout/f0;", "", "h", "(Landroidx/compose/ui/layout/f0;)I", "k", "mainAxisMin", "crossAxisMin", "mainAxisMax", "crossAxisMax", "", "isPrioritizing", "LH1/b;", "a", "(IIIIZ)J", "", "placeables", "Landroidx/compose/ui/layout/K;", "measureScope", "beforeCrossAxisAlignmentLine", "", "mainAxisPositions", "mainAxisLayoutSize", "crossAxisLayoutSize", "crossAxisOffset", "currentLineIndex", "startIndex", "endIndex", "Landroidx/compose/ui/layout/J;", "f", "([Landroidx/compose/ui/layout/f0;Landroidx/compose/ui/layout/K;I[III[IIII)Landroidx/compose/ui/layout/J;", "placeable", "LH1/t;", "layoutDirection", "q", "(Landroidx/compose/ui/layout/f0;ILH1/t;I)I", "childrenMainAxisSize", "", "c", "(I[I[ILandroidx/compose/ui/layout/K;)V", "b", "()Z", "isHorizontal", "Landroidx/compose/foundation/layout/d$e;", "r", "()Landroidx/compose/foundation/layout/d$e;", "horizontalArrangement", "Landroidx/compose/foundation/layout/d$m;", "s", "()Landroidx/compose/foundation/layout/d$m;", "verticalArrangement", "Landroidx/compose/foundation/layout/m;", "m", "()Landroidx/compose/foundation/layout/m;", "crossAxisAlignment", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface s extends InterfaceC14885F {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/f0$a;", "", "a", "(Landroidx/compose/ui/layout/f0$a;)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends Lambda implements Function1<f0.a, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int[] f48925f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f48926g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f48927h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ int f48928i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ f0[] f48929j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ s f48930k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ int f48931l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ H1.t f48932m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f48933n;

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ int[] f48934o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int[] iArr, int i10, int i11, int i12, f0[] f0VarArr, s sVar, int i13, H1.t tVar, int i14, int[] iArr2) {
            super(1);
            this.f48925f = iArr;
            this.f48926g = i10;
            this.f48927h = i11;
            this.f48928i = i12;
            this.f48929j = f0VarArr;
            this.f48930k = sVar;
            this.f48931l = i13;
            this.f48932m = tVar;
            this.f48933n = i14;
            this.f48934o = iArr2;
        }

        public final void a(f0.a aVar) {
            f0.a aVar2;
            int[] iArr = this.f48925f;
            int i10 = iArr != null ? iArr[this.f48926g] : 0;
            int i11 = this.f48927h;
            while (i11 < this.f48928i) {
                f0 f0Var = this.f48929j[i11];
                Intrinsics.g(f0Var);
                int iQ = this.f48930k.q(f0Var, this.f48931l, this.f48932m, this.f48933n) + i10;
                if (this.f48930k.b()) {
                    aVar2 = aVar;
                    f0.a.h(aVar2, f0Var, this.f48934o[i11 - this.f48927h], iQ, 0.0f, 4, null);
                } else {
                    aVar2 = aVar;
                    f0.a.h(aVar2, f0Var, iQ, this.f48934o[i11 - this.f48927h], 0.0f, 4, null);
                }
                i11++;
                aVar = aVar2;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0.a aVar) {
            a(aVar);
            return Unit.f143329a;
        }
    }

    boolean b();

    AbstractC5809m m();

    C5800d.e r();

    C5800d.m s();

    @Override // j0.InterfaceC14885F
    default long a(int mainAxisMin, int crossAxisMin, int mainAxisMax, int crossAxisMax, boolean isPrioritizing) {
        if (b()) {
            return G.a(isPrioritizing, mainAxisMin, crossAxisMin, mainAxisMax, crossAxisMax);
        }
        return C5807k.b(isPrioritizing, mainAxisMin, crossAxisMin, mainAxisMax, crossAxisMax);
    }

    @Override // j0.InterfaceC14885F
    default void c(int mainAxisLayoutSize, int[] childrenMainAxisSize, int[] mainAxisPositions, androidx.compose.ui.layout.K measureScope) {
        if (b()) {
            r().c(measureScope, mainAxisLayoutSize, childrenMainAxisSize, measureScope.getLayoutDirection(), mainAxisPositions);
        } else {
            s().b(measureScope, mainAxisLayoutSize, childrenMainAxisSize, mainAxisPositions);
        }
    }

    @Override // j0.InterfaceC14885F
    default androidx.compose.ui.layout.J f(f0[] placeables, androidx.compose.ui.layout.K measureScope, int beforeCrossAxisAlignmentLine, int[] mainAxisPositions, int mainAxisLayoutSize, int crossAxisLayoutSize, int[] crossAxisOffset, int currentLineIndex, int startIndex, int endIndex) {
        int i10;
        int i11;
        H1.t layoutDirection;
        if (b()) {
            i11 = mainAxisLayoutSize;
            i10 = crossAxisLayoutSize;
        } else {
            i10 = mainAxisLayoutSize;
            i11 = crossAxisLayoutSize;
        }
        if (b()) {
            layoutDirection = H1.t.f13338a;
        } else {
            layoutDirection = measureScope.getLayoutDirection();
        }
        return androidx.compose.ui.layout.K.G0(measureScope, i11, i10, null, new a(crossAxisOffset, currentLineIndex, startIndex, endIndex, placeables, this, crossAxisLayoutSize, layoutDirection, beforeCrossAxisAlignmentLine, mainAxisPositions), 4, null);
    }

    @Override // j0.InterfaceC14885F
    default int h(f0 f0Var) {
        if (b()) {
            return f0Var.M0();
        }
        return f0Var.J0();
    }

    @Override // j0.InterfaceC14885F
    default int k(f0 f0Var) {
        if (b()) {
            return f0Var.J0();
        }
        return f0Var.M0();
    }

    default int q(f0 placeable, int crossAxisLayoutSize, H1.t layoutDirection, int beforeCrossAxisAlignmentLine) {
        AbstractC5809m abstractC5809mM;
        RowColumnParentData rowColumnParentDataD = C14884E.d(placeable);
        if (rowColumnParentDataD == null || (abstractC5809mM = rowColumnParentDataD.getCrossAxisAlignment()) == null) {
            abstractC5809mM = m();
        }
        return abstractC5809mM.a(crossAxisLayoutSize - k(placeable), layoutDirection, placeable, beforeCrossAxisAlignmentLine);
    }
}
