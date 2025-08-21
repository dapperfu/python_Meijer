package androidx.compose.ui.node;

import androidx.compose.ui.layout.AbstractC5916a;
import androidx.compose.ui.layout.C5917b;
import androidx.compose.ui.layout.C5932q;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\b*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0017\u0010\u0010J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0010J\u001e\u0010\u001b\u001a\u00020\u0019*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H$ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010+\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\"\u0010.\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010#\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R\"\u00102\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010#\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'R\"\u00105\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010#\u001a\u0004\b3\u0010%\"\u0004\b4\u0010'R\"\u00108\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010#\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R\u0018\u00109\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010;R\u0014\u0010>\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010%R\u0014\u0010@\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010%R$\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0011*\u00020\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\b/\u0010A\u0082\u0001\u0002CD\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006E"}, d2 = {"Landroidx/compose/ui/node/a;", "", "Landroidx/compose/ui/node/b;", "alignmentLinesOwner", "<init>", "(Landroidx/compose/ui/node/b;)V", "Landroidx/compose/ui/layout/a;", "alignmentLine", "", "initialPosition", "Landroidx/compose/ui/node/NodeCoordinator;", "initialCoordinator", "", "c", "(Landroidx/compose/ui/layout/a;ILandroidx/compose/ui/node/NodeCoordinator;)V", "o", "()V", "", "h", "()Ljava/util/Map;", "i", "(Landroidx/compose/ui/node/NodeCoordinator;Landroidx/compose/ui/layout/a;)I", "n", "p", "m", "LU0/f;", "position", "d", "(Landroidx/compose/ui/node/NodeCoordinator;J)J", "a", "Landroidx/compose/ui/node/b;", "f", "()Landroidx/compose/ui/node/b;", "", "b", "Z", "g", "()Z", "setDirty$ui_release", "(Z)V", "dirty", "getUsedDuringParentMeasurement$ui_release", "u", "usedDuringParentMeasurement", "l", "t", "usedDuringParentLayout", "e", "getPreviousUsedDuringParentLayout$ui_release", "q", "previousUsedDuringParentLayout", "getUsedByModifierMeasurement$ui_release", "s", "usedByModifierMeasurement", "getUsedByModifierLayout$ui_release", "r", "usedByModifierLayout", "queryOwner", "", "Ljava/util/Map;", "alignmentLineMap", "j", "queried", "k", "required", "(Landroidx/compose/ui/node/NodeCoordinator;)Ljava/util/Map;", "alignmentLinesMap", "Landroidx/compose/ui/node/I;", "Landroidx/compose/ui/node/P;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.ui.node.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5941a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5943b alignmentLinesOwner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean dirty;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean usedDuringParentMeasurement;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean usedDuringParentLayout;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean previousUsedDuringParentLayout;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean usedByModifierMeasurement;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean usedByModifierLayout;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private InterfaceC5943b queryOwner;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Map<AbstractC5916a, Integer> alignmentLineMap;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/b;", "childOwner", "", "a", "(Landroidx/compose/ui/node/b;)V"}, k = 3, mv = {1, 9, 0})
    @SourceDebugExtension
    /* renamed from: androidx.compose.ui.node.a$a, reason: collision with other inner class name */
    static final class C1067a extends Lambda implements Function1<InterfaceC5943b, Unit> {
        C1067a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC5943b interfaceC5943b) {
            a(interfaceC5943b);
            return Unit.f143329a;
        }

        public final void a(InterfaceC5943b interfaceC5943b) {
            if (interfaceC5943b.getIsPlaced()) {
                if (interfaceC5943b.getAlignmentLines().getDirty()) {
                    interfaceC5943b.U();
                }
                Map map = interfaceC5943b.getAlignmentLines().alignmentLineMap;
                AbstractC5941a abstractC5941a = AbstractC5941a.this;
                for (Map.Entry entry : map.entrySet()) {
                    abstractC5941a.c((AbstractC5916a) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC5943b.Y());
                }
                NodeCoordinator wrappedBy = interfaceC5943b.Y().getWrappedBy();
                Intrinsics.g(wrappedBy);
                while (!Intrinsics.e(wrappedBy, AbstractC5941a.this.getAlignmentLinesOwner().Y())) {
                    Set<AbstractC5916a> setKeySet = AbstractC5941a.this.e(wrappedBy).keySet();
                    AbstractC5941a abstractC5941a2 = AbstractC5941a.this;
                    for (AbstractC5916a abstractC5916a : setKeySet) {
                        abstractC5941a2.c(abstractC5916a, abstractC5941a2.i(wrappedBy, abstractC5916a), wrappedBy);
                    }
                    wrappedBy = wrappedBy.getWrappedBy();
                    Intrinsics.g(wrappedBy);
                }
            }
        }
    }

    public /* synthetic */ AbstractC5941a(InterfaceC5943b interfaceC5943b, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC5943b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(AbstractC5916a alignmentLine, int initialPosition, NodeCoordinator initialCoordinator) {
        float f10 = initialPosition;
        long jE = U0.f.e((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L));
        while (true) {
            jE = d(initialCoordinator, jE);
            initialCoordinator = initialCoordinator.getWrappedBy();
            Intrinsics.g(initialCoordinator);
            if (Intrinsics.e(initialCoordinator, this.alignmentLinesOwner.Y())) {
                break;
            } else if (e(initialCoordinator).containsKey(alignmentLine)) {
                float fI = i(initialCoordinator, alignmentLine);
                jE = U0.f.e((Float.floatToRawIntBits(fI) << 32) | (Float.floatToRawIntBits(fI) & 4294967295L));
            }
        }
        int iRound = Math.round(alignmentLine instanceof C5932q ? Float.intBitsToFloat((int) (jE & 4294967295L)) : Float.intBitsToFloat((int) (jE >> 32)));
        Map<AbstractC5916a, Integer> map = this.alignmentLineMap;
        if (map.containsKey(alignmentLine)) {
            iRound = C5917b.c(alignmentLine, ((Number) MapsKt.l(this.alignmentLineMap, alignmentLine)).intValue(), iRound);
        }
        map.put(alignmentLine, Integer.valueOf(iRound));
    }

    protected abstract long d(NodeCoordinator nodeCoordinator, long j10);

    protected abstract Map<AbstractC5916a, Integer> e(NodeCoordinator nodeCoordinator);

    protected abstract int i(NodeCoordinator nodeCoordinator, AbstractC5916a abstractC5916a);

    public final void m() {
        this.dirty = true;
        InterfaceC5943b interfaceC5943bM = this.alignmentLinesOwner.M();
        if (interfaceC5943bM == null) {
            return;
        }
        if (this.usedDuringParentMeasurement) {
            interfaceC5943bM.t0();
        } else if (this.previousUsedDuringParentLayout || this.usedDuringParentLayout) {
            interfaceC5943bM.requestLayout();
        }
        if (this.usedByModifierMeasurement) {
            this.alignmentLinesOwner.t0();
        }
        if (this.usedByModifierLayout) {
            this.alignmentLinesOwner.requestLayout();
        }
        interfaceC5943bM.getAlignmentLines().m();
    }

    public final void p() {
        this.dirty = true;
        this.usedDuringParentMeasurement = false;
        this.previousUsedDuringParentLayout = false;
        this.usedDuringParentLayout = false;
        this.usedByModifierMeasurement = false;
        this.usedByModifierLayout = false;
        this.queryOwner = null;
    }

    private AbstractC5941a(InterfaceC5943b interfaceC5943b) {
        this.alignmentLinesOwner = interfaceC5943b;
        this.dirty = true;
        this.alignmentLineMap = new HashMap();
    }

    /* renamed from: f, reason: from getter */
    public final InterfaceC5943b getAlignmentLinesOwner() {
        return this.alignmentLinesOwner;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getDirty() {
        return this.dirty;
    }

    public final Map<AbstractC5916a, Integer> h() {
        return this.alignmentLineMap;
    }

    public final boolean j() {
        return this.usedDuringParentMeasurement || this.previousUsedDuringParentLayout || this.usedByModifierMeasurement || this.usedByModifierLayout;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getUsedDuringParentLayout() {
        return this.usedDuringParentLayout;
    }

    public final void n() {
        this.alignmentLineMap.clear();
        this.alignmentLinesOwner.o0(new C1067a());
        this.alignmentLineMap.putAll(e(this.alignmentLinesOwner.Y()));
        this.dirty = false;
    }

    public final void q(boolean z10) {
        this.previousUsedDuringParentLayout = z10;
    }

    public final void r(boolean z10) {
        this.usedByModifierLayout = z10;
    }

    public final void s(boolean z10) {
        this.usedByModifierMeasurement = z10;
    }

    public final void t(boolean z10) {
        this.usedDuringParentLayout = z10;
    }

    public final void u(boolean z10) {
        this.usedDuringParentMeasurement = z10;
    }

    public final boolean k() {
        o();
        if (this.queryOwner != null) {
            return true;
        }
        return false;
    }

    public final void o() {
        InterfaceC5943b interfaceC5943b;
        AbstractC5941a abstractC5941aR;
        AbstractC5941a abstractC5941aR2;
        if (j()) {
            interfaceC5943b = this.alignmentLinesOwner;
        } else {
            InterfaceC5943b interfaceC5943bM = this.alignmentLinesOwner.M();
            if (interfaceC5943bM != null) {
                interfaceC5943b = interfaceC5943bM.getAlignmentLines().queryOwner;
                if (interfaceC5943b == null || !interfaceC5943b.getAlignmentLines().j()) {
                    InterfaceC5943b interfaceC5943b2 = this.queryOwner;
                    if (interfaceC5943b2 != null && !interfaceC5943b2.getAlignmentLines().j()) {
                        InterfaceC5943b interfaceC5943bM2 = interfaceC5943b2.M();
                        if (interfaceC5943bM2 != null && (abstractC5941aR2 = interfaceC5943bM2.getAlignmentLines()) != null) {
                            abstractC5941aR2.o();
                        }
                        InterfaceC5943b interfaceC5943bM3 = interfaceC5943b2.M();
                        if (interfaceC5943bM3 != null && (abstractC5941aR = interfaceC5943bM3.getAlignmentLines()) != null) {
                            interfaceC5943b = abstractC5941aR.queryOwner;
                        } else {
                            interfaceC5943b = null;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        this.queryOwner = interfaceC5943b;
    }
}
