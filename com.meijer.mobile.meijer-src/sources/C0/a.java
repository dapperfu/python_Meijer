package C0;

import J0.IntRef;
import androidx.compose.runtime.AbstractC5869k;
import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.C5860f0;
import androidx.compose.runtime.C5862g0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.I0;
import androidx.compose.runtime.InterfaceC5867j;
import androidx.compose.runtime.InterfaceC5898z;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.P;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.y1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u00016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000fJ\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018H\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\bH\u0002¢\u0006\u0004\b\"\u0010\nJ\u0015\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0018¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0018¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00020\b¢\u0006\u0004\b'\u0010\nJ\u0015\u0010*\u001a\u00020\b2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0015\u0010.\u001a\u00020\b2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\u00020\b2\u0006\u0010-\u001a\u00020,¢\u0006\u0004\b0\u0010/J\u001f\u00102\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u00101\u001a\u00020\u0018¢\u0006\u0004\b2\u00103J'\u00104\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u0018¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b8\u0010%J\r\u00109\u001a\u00020\b¢\u0006\u0004\b9\u0010\nJ\u0017\u0010;\u001a\u00020\b2\b\u0010:\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\b¢\u0006\u0004\b=\u0010\nJ\r\u0010>\u001a\u00020\b¢\u0006\u0004\b>\u0010\nJ\r\u0010?\u001a\u00020\b¢\u0006\u0004\b?\u0010\nJ\r\u0010@\u001a\u00020\b¢\u0006\u0004\b@\u0010\nJ\u001d\u0010B\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020A¢\u0006\u0004\bB\u0010CJ%\u0010F\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020A2\u0006\u0010E\u001a\u00020D¢\u0006\u0004\bF\u0010GJ\u0015\u0010I\u001a\u00020\b2\u0006\u0010H\u001a\u00020\u0018¢\u0006\u0004\bI\u0010%J)\u0010N\u001a\u00020\b2\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020\b0J2\u0006\u0010M\u001a\u00020K¢\u0006\u0004\bN\u0010OJ\u0017\u0010Q\u001a\u00020\b2\b\u0010P\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bQ\u0010<J@\u0010W\u001a\u00020\b\"\u0004\b\u0000\u0010R\"\u0004\b\u0001\u0010S2\u0006\u0010)\u001a\u00028\u00012\u001d\u0010V\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0T¢\u0006\u0002\bU¢\u0006\u0004\bW\u0010XJ\u001d\u0010Z\u001a\u00020\b2\u0006\u0010Y\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\bZ\u0010\u001cJ%\u0010[\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b[\u0010!J\r\u0010\\\u001a\u00020\b¢\u0006\u0004\b\\\u0010\nJ\r\u0010]\u001a\u00020\b¢\u0006\u0004\b]\u0010\nJ\u001d\u0010_\u001a\u00020\b2\u0006\u0010Y\u001a\u00020\u00182\u0006\u0010^\u001a\u00020\u0018¢\u0006\u0004\b_\u0010\u001cJ\r\u0010`\u001a\u00020\b¢\u0006\u0004\b`\u0010\nJ\u0017\u0010a\u001a\u00020\b2\b\u0010P\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\ba\u0010<J\u001b\u0010d\u001a\u00020\b2\f\u0010c\u001a\b\u0012\u0004\u0012\u00020\b0b¢\u0006\u0004\bd\u0010eJ\u001d\u0010h\u001a\u00020\b2\u0006\u0010g\u001a\u00020f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\bh\u0010iJ%\u0010m\u001a\u00020\b2\u000e\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010j2\u0006\u0010l\u001a\u00020f¢\u0006\u0004\bm\u0010nJ/\u0010t\u001a\u00020\b2\b\u0010p\u001a\u0004\u0018\u00010o2\u0006\u0010r\u001a\u00020q2\u0006\u0010\u001e\u001a\u00020s2\u0006\u0010\u001d\u001a\u00020s¢\u0006\u0004\bt\u0010uJ%\u0010x\u001a\u00020\b2\u0006\u0010M\u001a\u00020v2\u0006\u0010r\u001a\u00020q2\u0006\u0010w\u001a\u00020s¢\u0006\u0004\bx\u0010yJ\r\u0010z\u001a\u00020\b¢\u0006\u0004\bz\u0010\nJ!\u0010|\u001a\u00020\b2\u0006\u0010{\u001a\u00020\u00042\n\b\u0002\u0010l\u001a\u0004\u0018\u00010f¢\u0006\u0004\b|\u0010}J\r\u0010~\u001a\u00020\b¢\u0006\u0004\b~\u0010\nJ\r\u0010R\u001a\u00020\b¢\u0006\u0004\bR\u0010\nJ\r\u0010\u007f\u001a\u00020\b¢\u0006\u0004\b\u007f\u0010\nR\u0015\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b6\u0010\u0080\u0001R'\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\bm\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u0010\u0086\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u00108R\u0017\u0010\u0089\u0001\u001a\u00030\u0087\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0088\u0001R%\u0010\u008c\u0001\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\bh\u00108\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0004\bS\u0010\u000fR\u0017\u0010\u008d\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010\u0017R\u0017\u0010\u008e\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010\u0017R'\u0010\u0091\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u008f\u00018\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0007\n\u0005\bz\u0010\u0090\u0001R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010\u0017R\u0017\u0010\u0092\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010\u0017R\u0017\u0010\u0093\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010\u0017R\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0014\u0010\u0099\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u008b\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u009a\u0001"}, d2 = {"LC0/a;", "", "Landroidx/compose/runtime/ComposerImpl;", "composer", "Landroidx/compose/runtime/changelist/a;", "changeList", "<init>", "(Landroidx/compose/runtime/ComposerImpl;Landroidx/compose/runtime/changelist/a;)V", "", "C", "()V", "E", "", "useParentSlot", "F", "(Z)V", "n", "Landroidx/compose/runtime/Anchor;", "anchor", "m", "(Landroidx/compose/runtime/Anchor;)V", "forParent", "J", "I", "", "removeFrom", "moveCount", "L", "(II)V", "to", "from", "count", "H", "(III)V", "D", "location", "z", "(I)V", "A", "M", "Landroidx/compose/runtime/O0;", "value", "P", "(Landroidx/compose/runtime/O0;)V", "Landroidx/compose/runtime/I0;", "scope", "Y", "(Landroidx/compose/runtime/I0;)V", "k", "groupSlotIndex", "d0", "(Ljava/lang/Object;I)V", "a0", "(Ljava/lang/Object;Landroidx/compose/runtime/Anchor;I)V", "a", "(Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)V", "Z", "S", "data", "b0", "(Ljava/lang/Object;)V", "l", "g", "X", "Q", "Landroidx/compose/runtime/SlotTable;", "u", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;)V", "Landroidx/compose/runtime/changelist/b;", "fixups", "v", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/changelist/b;)V", "offset", "w", "Lkotlin/Function1;", "Landroidx/compose/runtime/j;", "action", "composition", "f", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/j;)V", "node", "e0", "T", "V", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "c0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "nodeIndex", "R", "y", "N", "i", "group", "j", "B", "x", "Lkotlin/Function0;", "effect", "W", "(Lkotlin/jvm/functions/Function0;)V", "LJ0/d;", "effectiveNodeIndexOut", "e", "(LJ0/d;Landroidx/compose/runtime/Anchor;)V", "", "nodes", "effectiveNodeIndex", "b", "(Ljava/util/List;LJ0/d;)V", "Landroidx/compose/runtime/f0;", "resolvedState", "Landroidx/compose/runtime/k;", "parentContext", "Landroidx/compose/runtime/g0;", "c", "(Landroidx/compose/runtime/f0;Landroidx/compose/runtime/k;Landroidx/compose/runtime/g0;Landroidx/compose/runtime/g0;)V", "Landroidx/compose/runtime/z;", "reference", "O", "(Landroidx/compose/runtime/z;Landroidx/compose/runtime/k;Landroidx/compose/runtime/g0;)V", "h", "other", "t", "(Landroidx/compose/runtime/changelist/a;LJ0/d;)V", "o", "d", "Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/changelist/a;", "p", "()Landroidx/compose/runtime/changelist/a;", "U", "(Landroidx/compose/runtime/changelist/a;)V", "startedGroup", "Landroidx/compose/runtime/P;", "Landroidx/compose/runtime/P;", "startedGroups", "q", "()Z", "implicitRootStart", "writersReaderDelta", "pendingUps", "Landroidx/compose/runtime/y1;", "Ljava/util/ArrayList;", "pendingDownNodes", "moveFrom", "moveTo", "Landroidx/compose/runtime/W0;", "s", "()Landroidx/compose/runtime/W0;", "reader", "r", "pastParent", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class a {

    /* renamed from: n, reason: collision with root package name */
    public static final int f4001n = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ComposerImpl composer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.runtime.changelist.a changeList;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean startedGroup;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int writersReaderDelta;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int pendingUps;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int moveCount;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final P startedGroups = new P();

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean implicitRootStart = true;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private ArrayList pendingDownNodes = y1.c(null, 1, null);

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int removeFrom = -1;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int moveFrom = -1;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int moveTo = -1;

    private final void E() {
        K(this, false, 1, null);
        M();
    }

    private final void m(Anchor anchor) {
        G(this, false, 1, null);
        this.changeList.p(anchor);
        this.startedGroup = true;
    }

    public final void T() {
        this.startedGroup = false;
        this.startedGroups.a();
        this.writersReaderDelta = 0;
    }

    public final void b0(Object data) {
        G(this, false, 1, null);
        this.changeList.G(data);
    }

    public final void d() {
        G(this, false, 1, null);
        this.changeList.i();
    }

    public final void d0(Object value, int groupSlotIndex) {
        F(true);
        this.changeList.I(value, groupSlotIndex);
    }

    private final void D() {
        int i10 = this.pendingUps;
        if (i10 > 0) {
            this.changeList.J(i10);
            this.pendingUps = 0;
        }
        if (y1.f(this.pendingDownNodes)) {
            this.changeList.k(y1.k(this.pendingDownNodes));
            y1.a(this.pendingDownNodes);
        }
    }

    static /* synthetic */ void G(a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        aVar.F(z10);
    }

    private final void I() {
        int i10 = this.moveCount;
        if (i10 > 0) {
            int i11 = this.removeFrom;
            if (i11 >= 0) {
                L(i11, i10);
                this.removeFrom = -1;
            } else {
                H(this.moveTo, this.moveFrom, i10);
                this.moveFrom = -1;
                this.moveTo = -1;
            }
            this.moveCount = 0;
        }
    }

    private final void J(boolean forParent) {
        int parent = forParent ? s().getParent() : s().getCurrent();
        int i10 = parent - this.writersReaderDelta;
        if (!(i10 >= 0)) {
            ComposerKt.t("Tried to seek backward");
        }
        if (i10 > 0) {
            this.changeList.e(i10);
            this.writersReaderDelta = parent;
        }
    }

    static /* synthetic */ void K(a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        aVar.J(z10);
    }

    private final void n() {
        if (this.startedGroup || !this.implicitRootStart) {
            return;
        }
        G(this, false, 1, null);
        this.changeList.q();
        this.startedGroup = true;
    }

    private final SlotReader s() {
        return this.composer.getReader();
    }

    public final void A(int location) {
        this.writersReaderDelta = location;
    }

    public final void O(InterfaceC5898z composition, AbstractC5869k parentContext, C5862g0 reference) {
        this.changeList.w(composition, parentContext, reference);
    }

    public final void P(O0 value) {
        this.changeList.x(value);
    }

    public final void R(int nodeIndex, int count) {
        if (count > 0) {
            if (!(nodeIndex >= 0)) {
                ComposerKt.t("Invalid remove index " + nodeIndex);
            }
            if (this.removeFrom == nodeIndex) {
                this.moveCount += count;
                return;
            }
            I();
            this.removeFrom = nodeIndex;
            this.moveCount = count;
        }
    }

    public final void S() {
        this.changeList.A();
    }

    public final void U(androidx.compose.runtime.changelist.a aVar) {
        this.changeList = aVar;
    }

    public final void V(boolean z10) {
        this.implicitRootStart = z10;
    }

    public final void W(Function0<Unit> effect) {
        this.changeList.B(effect);
    }

    public final void X() {
        this.changeList.C();
    }

    public final void Y(I0 scope) {
        this.changeList.D(scope);
    }

    public final void Z(int count) {
        if (count > 0) {
            E();
            this.changeList.E(count);
        }
    }

    public final void a(Anchor anchor, Object value) {
        this.changeList.f(anchor, value);
    }

    public final void a0(Object value, Anchor anchor, int groupSlotIndex) {
        this.changeList.F(value, anchor, groupSlotIndex);
    }

    public final void b(List<? extends Object> nodes, IntRef effectiveNodeIndex) {
        this.changeList.g(nodes, effectiveNodeIndex);
    }

    public final void c(C5860f0 resolvedState, AbstractC5869k parentContext, C5862g0 from, C5862g0 to2) {
        this.changeList.h(resolvedState, parentContext, from, to2);
    }

    public final void f(Function1<? super InterfaceC5867j, Unit> action, InterfaceC5867j composition) {
        this.changeList.l(action, composition);
    }

    public final void h() {
        this.changeList.n();
        this.writersReaderDelta = 0;
    }

    public final void k(I0 scope) {
        this.changeList.o(scope);
    }

    public final void l() {
        if (this.startedGroup) {
            G(this, false, 1, null);
            G(this, false, 1, null);
            this.changeList.m();
            this.startedGroup = false;
        }
    }

    /* renamed from: p, reason: from getter */
    public final androidx.compose.runtime.changelist.a getChangeList() {
        return this.changeList;
    }

    /* renamed from: q, reason: from getter */
    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final void t(androidx.compose.runtime.changelist.a other, IntRef effectiveNodeIndex) {
        this.changeList.r(other, effectiveNodeIndex);
    }

    public final void y(int from, int to2, int count) {
        if (count > 0) {
            int i10 = this.moveCount;
            if (i10 > 0 && this.moveFrom == from - i10 && this.moveTo == to2 - i10) {
                this.moveCount = i10 + count;
                return;
            }
            I();
            this.moveFrom = from;
            this.moveTo = to2;
            this.moveCount = count;
        }
    }

    public final void z(int location) {
        this.writersReaderDelta += location - s().getCurrent();
    }

    public a(ComposerImpl composerImpl, androidx.compose.runtime.changelist.a aVar) {
        this.composer = composerImpl;
        this.changeList = aVar;
    }

    private final void C() {
        D();
    }

    private final void F(boolean useParentSlot) {
        J(useParentSlot);
    }

    private final void H(int to2, int from, int count) {
        C();
        this.changeList.v(to2, from, count);
    }

    private final void L(int removeFrom, int moveCount) {
        C();
        this.changeList.z(removeFrom, moveCount);
    }

    public final void B() {
        I();
        if (y1.f(this.pendingDownNodes)) {
            y1.i(this.pendingDownNodes);
        } else {
            this.pendingUps++;
        }
    }

    public final void M() {
        SlotReader slotReaderS;
        int parent;
        if (s().getGroupsSize() > 0 && this.startedGroups.f(-2) != (parent = (slotReaderS = s()).getParent())) {
            n();
            if (parent > 0) {
                Anchor anchorA = slotReaderS.a(parent);
                this.startedGroups.h(parent);
                m(anchorA);
            }
        }
    }

    public final void N() {
        D();
        if (this.startedGroup) {
            X();
            l();
        }
    }

    public final void Q() {
        E();
        this.changeList.y();
        this.writersReaderDelta += s().p();
    }

    public final <T, V> void c0(V value, Function2<? super T, ? super V, Unit> block) {
        C();
        this.changeList.H(value, block);
    }

    public final void e(IntRef effectiveNodeIndexOut, Anchor anchor) {
        D();
        this.changeList.j(effectiveNodeIndexOut, anchor);
    }

    public final void e0(Object node) {
        C();
        this.changeList.K(node);
    }

    public final void g() {
        boolean z10;
        int parent = s().getParent();
        if (this.startedGroups.f(-1) <= parent) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            ComposerKt.t("Missed recording an endGroup");
        }
        if (this.startedGroups.f(-1) == parent) {
            G(this, false, 1, null);
            this.startedGroups.g();
            this.changeList.m();
        }
    }

    public final void i() {
        I();
    }

    public final void j(int nodeIndex, int group) {
        int iN;
        i();
        D();
        if (s().J(group)) {
            iN = 1;
        } else {
            iN = s().N(group);
        }
        if (iN > 0) {
            R(nodeIndex, iN);
        }
    }

    public final void o() {
        boolean z10;
        D();
        if (this.startedGroups.tos == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            ComposerKt.t("Missed recording an endGroup()");
        }
    }

    public final boolean r() {
        if (s().getParent() - this.writersReaderDelta < 0) {
            return true;
        }
        return false;
    }

    public final void u(Anchor anchor, SlotTable from) {
        D();
        E();
        I();
        this.changeList.s(anchor, from);
    }

    public final void v(Anchor anchor, SlotTable from, androidx.compose.runtime.changelist.b fixups) {
        D();
        E();
        I();
        this.changeList.t(anchor, from, fixups);
    }

    public final void w(int offset) {
        E();
        this.changeList.u(offset);
    }

    public final void x(Object node) {
        I();
        y1.j(this.pendingDownNodes, node);
    }
}
