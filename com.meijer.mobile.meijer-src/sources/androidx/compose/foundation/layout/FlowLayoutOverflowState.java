package androidx.compose.foundation.layout;

import Z.C5616n;
import androidx.compose.foundation.layout.o;
import androidx.compose.foundation.layout.q;
import androidx.compose.ui.layout.f0;
import j0.C14881B;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J6\u0010\u001a\u001a\u00020\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017H\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ6\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0014\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010%R\u001a\u0010\u0006\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010%R\u001a\u00105\u001a\u00020!8\u0000X\u0080D¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010#R\"\u00109\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010.\u001a\u0004\b6\u0010%\"\u0004\b7\u00108R\"\u0010<\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010.\u001a\u0004\b:\u0010%\"\u0004\b;\u00108R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010=R\u0018\u0010A\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010@R\u001e\u0010D\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b7\u0010CR\u001e\u0010E\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u001f\u0010CRJ\u0010L\u001a6\u0012\u0013\u0012\u00110\t¢\u0006\f\bG\u0012\b\bH\u0012\u0004\b\b(I\u0012\u0013\u0012\u00110\u0004¢\u0006\f\bG\u0012\b\bH\u0012\u0004\b\b(J\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010KR\u0014\u0010M\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010%\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006N"}, d2 = {"Landroidx/compose/foundation/layout/r;", "", "Landroidx/compose/foundation/layout/q$a;", "type", "", "minLinesToShowCollapse", "minCrossAxisSizeToShowCollapse", "<init>", "(Landroidx/compose/foundation/layout/q$a;II)V", "", "hasNext", "lineIndex", "totalCrossAxisSize", "LZ/n;", "f", "(ZII)LZ/n;", "Landroidx/compose/foundation/layout/o$a;", "e", "(ZII)Landroidx/compose/foundation/layout/o$a;", "Landroidx/compose/ui/layout/r;", "seeMoreMeasurable", "collapseMeasurable", "isHorizontal", "LH1/b;", "constraints", "", "m", "(Landroidx/compose/ui/layout/r;Landroidx/compose/ui/layout/r;ZJ)V", "Landroidx/compose/foundation/layout/s;", "measurePolicy", "Landroidx/compose/ui/layout/I;", "l", "(Landroidx/compose/foundation/layout/s;Landroidx/compose/ui/layout/I;Landroidx/compose/ui/layout/I;J)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/foundation/layout/q$a;", "i", "()Landroidx/compose/foundation/layout/q$a;", "b", "I", "g", "c", "getMinCrossAxisSizeToShowCollapse$foundation_layout_release", "d", "Ljava/lang/String;", "getShownItemLazyErrorMessage$foundation_layout_release", "shownItemLazyErrorMessage", "getItemShown$foundation_layout_release", "k", "(I)V", "itemShown", "getItemCount$foundation_layout_release", "j", "itemCount", "Landroidx/compose/ui/layout/I;", "Landroidx/compose/ui/layout/f0;", "h", "Landroidx/compose/ui/layout/f0;", "seeMorePlaceable", "collapsePlaceable", "LZ/n;", "seeMoreSize", "collapseSize", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "isExpandable", "noOfItemsShown", "Lkotlin/jvm/functions/Function2;", "getOverflowMeasurable", "shownItemCount", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.layout.r, reason: from toString */
/* loaded from: classes.dex */
public final /* data */ class FlowLayoutOverflowState {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final q.a type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int minLinesToShowCollapse;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int minCrossAxisSizeToShowCollapse;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String shownItemLazyErrorMessage = "Accessing shownItemCount before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.";

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int itemShown = -1;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int itemCount;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.layout.I seeMoreMeasurable;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private f0 seeMorePlaceable;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.layout.I collapseMeasurable;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private f0 collapsePlaceable;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private C5616n seeMoreSize;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private C5616n collapseSize;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private Function2<? super Boolean, ? super Integer, ? extends androidx.compose.ui.layout.I> getOverflowMeasurable;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.layout.r$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[q.a.values().length];
            try {
                iArr[q.a.f48902a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.a.f48903b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q.a.f48904c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[q.a.f48905d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/f0;", "placeable", "", "a", "(Landroidx/compose/ui/layout/f0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.r$b */
    static final class b extends Lambda implements Function1<f0, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ s f48922g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(s sVar) {
            super(1);
            this.f48922g = sVar;
        }

        public final void a(f0 f0Var) {
            int iH;
            int iK;
            if (f0Var != null) {
                s sVar = this.f48922g;
                iH = sVar.h(f0Var);
                iK = sVar.k(f0Var);
            } else {
                iH = 0;
                iK = 0;
            }
            FlowLayoutOverflowState.this.seeMoreSize = C5616n.a(C5616n.b(iH, iK));
            FlowLayoutOverflowState.this.seeMorePlaceable = f0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0 f0Var) {
            a(f0Var);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/layout/f0;", "placeable", "", "a", "(Landroidx/compose/ui/layout/f0;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.r$c */
    static final class c extends Lambda implements Function1<f0, Unit> {

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ s f48924g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(s sVar) {
            super(1);
            this.f48924g = sVar;
        }

        public final void a(f0 f0Var) {
            int iH;
            int iK;
            if (f0Var != null) {
                s sVar = this.f48924g;
                iH = sVar.h(f0Var);
                iK = sVar.k(f0Var);
            } else {
                iH = 0;
                iK = 0;
            }
            FlowLayoutOverflowState.this.collapseSize = C5616n.a(C5616n.b(iH, iK));
            FlowLayoutOverflowState.this.collapsePlaceable = f0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(f0 f0Var) {
            a(f0Var);
            return Unit.f143329a;
        }
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowLayoutOverflowState)) {
            return false;
        }
        FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) other;
        return this.type == flowLayoutOverflowState.type && this.minLinesToShowCollapse == flowLayoutOverflowState.minLinesToShowCollapse && this.minCrossAxisSizeToShowCollapse == flowLayoutOverflowState.minCrossAxisSizeToShowCollapse;
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + Integer.hashCode(this.minLinesToShowCollapse)) * 31) + Integer.hashCode(this.minCrossAxisSizeToShowCollapse);
    }

    public String toString() {
        return "FlowLayoutOverflowState(type=" + this.type + ", minLinesToShowCollapse=" + this.minLinesToShowCollapse + ", minCrossAxisSizeToShowCollapse=" + this.minCrossAxisSizeToShowCollapse + ')';
    }

    public final o.a e(boolean hasNext, int lineIndex, int totalCrossAxisSize) {
        androidx.compose.ui.layout.I iInvoke;
        C5616n c5616n;
        f0 f0Var;
        androidx.compose.ui.layout.I i10;
        f0 f0Var2;
        int i11 = a.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return null;
        }
        if (i11 != 3 && i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (hasNext) {
            Function2<? super Boolean, ? super Integer, ? extends androidx.compose.ui.layout.I> function2 = this.getOverflowMeasurable;
            if (function2 == null || (iInvoke = function2.invoke(Boolean.TRUE, Integer.valueOf(h()))) == null) {
                iInvoke = this.seeMoreMeasurable;
            }
            c5616n = this.seeMoreSize;
            if (this.getOverflowMeasurable == null) {
                f0Var = this.seeMorePlaceable;
                i10 = iInvoke;
                f0Var2 = f0Var;
            }
            i10 = iInvoke;
            f0Var2 = null;
        } else {
            if (lineIndex < this.minLinesToShowCollapse - 1 || totalCrossAxisSize < this.minCrossAxisSizeToShowCollapse) {
                iInvoke = null;
            } else {
                Function2<? super Boolean, ? super Integer, ? extends androidx.compose.ui.layout.I> function22 = this.getOverflowMeasurable;
                if (function22 == null || (iInvoke = function22.invoke(Boolean.FALSE, Integer.valueOf(h()))) == null) {
                    iInvoke = this.collapseMeasurable;
                }
            }
            c5616n = this.collapseSize;
            if (this.getOverflowMeasurable == null) {
                f0Var = this.collapsePlaceable;
                i10 = iInvoke;
                f0Var2 = f0Var;
            }
            i10 = iInvoke;
            f0Var2 = null;
        }
        if (i10 == null) {
            return null;
        }
        Intrinsics.g(c5616n);
        return new o.a(i10, f0Var2, c5616n.getPackedValue(), false, 8, null);
    }

    public final C5616n f(boolean hasNext, int lineIndex, int totalCrossAxisSize) {
        int i10 = a.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (hasNext) {
                    return this.seeMoreSize;
                }
                if (lineIndex + 1 < this.minLinesToShowCollapse || totalCrossAxisSize < this.minCrossAxisSizeToShowCollapse) {
                    return null;
                }
                return this.collapseSize;
            }
            if (hasNext) {
                return this.seeMoreSize;
            }
        }
        return null;
    }

    /* renamed from: g, reason: from getter */
    public final int getMinLinesToShowCollapse() {
        return this.minLinesToShowCollapse;
    }

    public final int h() {
        int i10 = this.itemShown;
        if (i10 != -1) {
            return i10;
        }
        throw new IllegalStateException(this.shownItemLazyErrorMessage);
    }

    /* renamed from: i, reason: from getter */
    public final q.a getType() {
        return this.type;
    }

    public final void j(int i10) {
        this.itemCount = i10;
    }

    public final void k(int i10) {
        this.itemShown = i10;
    }

    public final void m(androidx.compose.ui.layout.r seeMoreMeasurable, androidx.compose.ui.layout.r collapseMeasurable, boolean isHorizontal, long constraints) {
        long jC = C14881B.c(constraints, isHorizontal ? j0.y.f139753a : j0.y.f139754b);
        if (seeMoreMeasurable != null) {
            int iG = p.g(seeMoreMeasurable, isHorizontal, H1.b.k(jC));
            this.seeMoreSize = C5616n.a(C5616n.b(iG, p.e(seeMoreMeasurable, isHorizontal, iG)));
            this.seeMoreMeasurable = seeMoreMeasurable instanceof androidx.compose.ui.layout.I ? (androidx.compose.ui.layout.I) seeMoreMeasurable : null;
            this.seeMorePlaceable = null;
        }
        if (collapseMeasurable != null) {
            int iG2 = p.g(collapseMeasurable, isHorizontal, H1.b.k(jC));
            this.collapseSize = C5616n.a(C5616n.b(iG2, p.e(collapseMeasurable, isHorizontal, iG2)));
            this.collapseMeasurable = collapseMeasurable instanceof androidx.compose.ui.layout.I ? (androidx.compose.ui.layout.I) collapseMeasurable : null;
            this.collapsePlaceable = null;
        }
    }

    public FlowLayoutOverflowState(q.a aVar, int i10, int i11) {
        this.type = aVar;
        this.minLinesToShowCollapse = i10;
        this.minCrossAxisSizeToShowCollapse = i11;
    }

    public final void l(s measurePolicy, androidx.compose.ui.layout.I seeMoreMeasurable, androidx.compose.ui.layout.I collapseMeasurable, long constraints) {
        j0.y yVar;
        if (measurePolicy.b()) {
            yVar = j0.y.f139753a;
        } else {
            yVar = j0.y.f139754b;
        }
        long jF = C14881B.f(C14881B.e(C14881B.c(constraints, yVar), 0, 0, 0, 0, 10, null), yVar);
        if (seeMoreMeasurable != null) {
            p.h(seeMoreMeasurable, measurePolicy, jF, new b(measurePolicy));
            this.seeMoreMeasurable = seeMoreMeasurable;
        }
        if (collapseMeasurable != null) {
            p.h(collapseMeasurable, measurePolicy, jF, new c(measurePolicy));
            this.collapseMeasurable = collapseMeasurable;
        }
    }
}
