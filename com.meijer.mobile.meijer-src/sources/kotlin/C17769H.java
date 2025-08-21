package kotlin;

import H1.r;
import androidx.compose.foundation.text.EnumC5824n;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.text.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Selection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a%\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005*\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a1\u0010\u000f\u001a\u00020\u000e2\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00000\t0\u00062\u0006\u0010\r\u001a\u00020\fH\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\"\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a*\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001c\u001a\u00020\u000e*\u00020\fH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001e\u0010 \u001a\u00020\u001f*\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0015H\u0000ø\u0001\u0000¢\u0006\u0004\b \u0010!\"\u0014\u0010$\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006%"}, d2 = {"Lw0/p;", "lhs", "rhs", "h", "(Lw0/p;Lw0/p;)Lw0/p;", "T", "", "e", "(Ljava/util/List;)Ljava/util/List;", "Lkotlin/Pair;", "Lw0/n;", "selectableSubSelectionPairs", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerCoordinates", "Landroidx/compose/ui/geometry/Rect;", "g", "(Ljava/util/List;Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;", "Lw0/G;", "manager", "LH1/r;", "magnifierSize", "LU0/f;", "c", "(Lw0/G;J)J", "Lw0/p$a;", "anchor", "f", "(Lw0/G;JLw0/p$a;)J", "i", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;", "offset", "", "d", "(Landroidx/compose/ui/geometry/Rect;J)Z", "a", "Landroidx/compose/ui/geometry/Rect;", "invertedInfiniteRect", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: w0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17769H {

    /* renamed from: a, reason: collision with root package name */
    private static final Rect f166533a = new Rect(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: w0.H$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC5824n.values().length];
            try {
                iArr[EnumC5824n.f49915b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5824n.f49916c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5824n.f49914a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final Rect g(List<? extends Pair<? extends InterfaceC17798n, Selection>> list, LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinatesB;
        int[] iArr;
        List<? extends Pair<? extends InterfaceC17798n, Selection>> list2 = list;
        if (list2.isEmpty()) {
            return f166533a;
        }
        Rect rect = f166533a;
        float left = rect.getLeft();
        float top = rect.getTop();
        float right = rect.getRight();
        float bottom = rect.getBottom();
        int size = list2.size();
        char c10 = 0;
        int i10 = 0;
        while (i10 < size) {
            Pair<? extends InterfaceC17798n, Selection> pair = list2.get(i10);
            InterfaceC17798n interfaceC17798nA = pair.a();
            Selection selectionB = pair.b();
            int offset = selectionB.getStart().getOffset();
            int offset2 = selectionB.getEnd().getOffset();
            if (offset != offset2 && (layoutCoordinatesB = interfaceC17798nA.B()) != null) {
                int iMin = Math.min(offset, offset2);
                int iMax = Math.max(offset, offset2) - 1;
                if (iMin == iMax) {
                    iArr = new int[1];
                    iArr[c10] = iMin;
                } else {
                    int[] iArr2 = new int[2];
                    iArr2[c10] = iMin;
                    iArr2[1] = iMax;
                    iArr = iArr2;
                }
                Rect rect2 = f166533a;
                float left2 = rect2.getLeft();
                float top2 = rect2.getTop();
                float right2 = rect2.getRight();
                float bottom2 = rect2.getBottom();
                int length = iArr.length;
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11;
                    Rect rectF = interfaceC17798nA.f(iArr[i12]);
                    left2 = Math.min(left2, rectF.getLeft());
                    top2 = Math.min(top2, rectF.getTop());
                    right2 = Math.max(right2, rectF.l());
                    bottom2 = Math.max(bottom2, rectF.i());
                    i11 = i12 + 1;
                }
                long jE = U0.f.e((Float.floatToRawIntBits(left2) << 32) | (Float.floatToRawIntBits(top2) & 4294967295L));
                long jE2 = U0.f.e((Float.floatToRawIntBits(bottom2) & 4294967295L) | (Float.floatToRawIntBits(right2) << 32));
                long J10 = layoutCoordinates.J(layoutCoordinatesB, jE);
                long J11 = layoutCoordinates.J(layoutCoordinatesB, jE2);
                left = Math.min(left, Float.intBitsToFloat((int) (J10 >> 32)));
                top = Math.min(top, Float.intBitsToFloat((int) (J10 & 4294967295L)));
                right = Math.max(right, Float.intBitsToFloat((int) (J11 >> 32)));
                bottom = Math.max(bottom, Float.intBitsToFloat((int) (J11 & 4294967295L)));
            }
            i10++;
            list2 = list;
            c10 = 0;
        }
        return new Rect(left, top, right, bottom);
    }

    public static final Selection h(Selection selection, Selection selection2) {
        Selection selectionF;
        return (selection == null || (selectionF = selection.f(selection2)) == null) ? selection2 : selectionF;
    }

    public static final long c(C17768G c17768g, long j10) {
        int i10;
        Selection selectionD = c17768g.D();
        if (selectionD == null) {
            return U0.f.INSTANCE.b();
        }
        EnumC5824n enumC5824nV = c17768g.v();
        if (enumC5824nV == null) {
            i10 = -1;
        } else {
            i10 = a.$EnumSwitchMapping$0[enumC5824nV.ordinal()];
        }
        if (i10 != -1) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw new IllegalStateException("SelectionContainer does not support cursor");
                }
                return f(c17768g, j10, selectionD.getEnd());
            }
            return f(c17768g, j10, selectionD.getStart());
        }
        return U0.f.INSTANCE.b();
    }

    public static final boolean d(Rect rect, long j10) {
        float left = rect.getLeft();
        float fL = rect.l();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        if (left <= fIntBitsToFloat && fIntBitsToFloat <= fL) {
            float top = rect.getTop();
            float fI = rect.i();
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
            if (top <= fIntBitsToFloat2 && fIntBitsToFloat2 <= fI) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> e(List<? extends T> list) {
        int size = list.size();
        if (size != 0 && size != 1) {
            return CollectionsKt.p(CollectionsKt.s0(list), CollectionsKt.D0(list));
        }
        return list;
    }

    private static final long f(C17768G c17768g, long j10, Selection.AnchorInfo anchorInfo) {
        float fN;
        InterfaceC17798n interfaceC17798nP = c17768g.p(anchorInfo);
        if (interfaceC17798nP == null) {
            return U0.f.INSTANCE.b();
        }
        LayoutCoordinates layoutCoordinatesQ = c17768g.q();
        if (layoutCoordinatesQ == null) {
            return U0.f.INSTANCE.b();
        }
        LayoutCoordinates layoutCoordinatesB = interfaceC17798nP.B();
        if (layoutCoordinatesB == null) {
            return U0.f.INSTANCE.b();
        }
        int offset = anchorInfo.getOffset();
        if (offset > interfaceC17798nP.g()) {
            return U0.f.INSTANCE.b();
        }
        U0.f fVarS = c17768g.s();
        Intrinsics.g(fVarS);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (layoutCoordinatesB.J(layoutCoordinatesQ, fVarS.getPackedValue()) >> 32));
        long jK = interfaceC17798nP.k(offset);
        if (y.h(jK)) {
            fN = interfaceC17798nP.d(offset);
        } else {
            float fD = interfaceC17798nP.d(y.n(jK));
            float fA = interfaceC17798nP.a(y.i(jK) - 1);
            fN = RangesKt.n(fIntBitsToFloat, Math.min(fD, fA), Math.max(fD, fA));
        }
        if (fN == -1.0f) {
            return U0.f.INSTANCE.b();
        }
        if (!r.e(j10, r.INSTANCE.a()) && Math.abs(fIntBitsToFloat - fN) > ((int) (j10 >> 32)) / 2) {
            return U0.f.INSTANCE.b();
        }
        if (interfaceC17798nP.h(offset) == -1.0f) {
            return U0.f.INSTANCE.b();
        }
        return layoutCoordinatesQ.J(layoutCoordinatesB, U0.f.e((Float.floatToRawIntBits(fN) << 32) | (4294967295L & Float.floatToRawIntBits(r9))));
    }

    public static final Rect i(LayoutCoordinates layoutCoordinates) {
        Rect rectB = LayoutCoordinatesKt.b(layoutCoordinates);
        return U0.h.a(layoutCoordinates.N(rectB.n()), layoutCoordinates.N(rectB.j()));
    }
}
