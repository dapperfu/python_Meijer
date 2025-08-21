package r1;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.InterfaceC5940z;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.node.C5952f0;
import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.node.InterfaceC5956j;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.u0;
import androidx.compose.ui.node.v0;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B)\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\u00020\u000f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f2\u0006\u0010\u000e\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\u00020\u000f*\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\f2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u0019\u001a\u00020\u000f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010!\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0017\u0010 \u001a\u0013\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000f0\u001d¢\u0006\u0002\b\u001fH\u0002ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J9\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\f2\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b$\u0010%J3\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00000\u00162\b\b\u0002\u0010&\u001a\u00020\u00042\b\b\u0002\u0010#\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004H\u0000¢\u0006\u0004\b'\u0010(J\u0011\u0010*\u001a\u0004\u0018\u00010)H\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0000H\u0000¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u00101\u001a\u0004\b2\u00103R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u00104\u001a\u0004\b5\u00106R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u00107\u001a\u0004\b8\u00109R\"\u0010=\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u00101\u001a\u0004\b:\u00103\"\u0004\b;\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010>R\u0017\u0010E\u001a\u00020@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010G\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u00103R\u0014\u0010I\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bH\u00103R\u0011\u0010M\u001a\u00020J8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0011\u0010Q\u001a\u00020N8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0017\u0010U\u001a\u00020R8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0011\u0010W\u001a\u00020N8F¢\u0006\u0006\u001a\u0004\bV\u0010PR\u0017\u0010Z\u001a\u00020X8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bY\u0010TR\u0011\u0010\\\u001a\u00020N8F¢\u0006\u0006\u001a\u0004\b[\u0010PR\u0014\u0010^\u001a\u00020N8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b]\u0010PR\u0014\u0010`\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b_\u00103R\u0011\u0010b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\ba\u00109R\u0017\u0010e\u001a\b\u0012\u0004\u0012\u00020\u00000\u00168F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u001a\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00000\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bf\u0010dR\u0013\u0010i\u001a\u0004\u0018\u00010\u00008F¢\u0006\u0006\u001a\u0004\bh\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006j"}, d2 = {"Lr1/n;", "", "Landroidx/compose/ui/Modifier$c;", "outerSemanticsNode", "", "mergingEnabled", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "unmergedConfig", "<init>", "(Landroidx/compose/ui/Modifier$c;ZLandroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "", "unmergedChildren", "mergedConfig", "", "B", "(Ljava/util/List;Landroidx/compose/ui/semantics/SemanticsConfiguration;)V", "list", "includeDeactivatedNodes", "d", "(Landroidx/compose/ui/node/LayoutNode;Ljava/util/List;Z)V", "", "f", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "b", "(Ljava/util/List;)V", "Landroidx/compose/ui/semantics/Role;", "role", "Lkotlin/Function1;", "Lr1/u;", "Lkotlin/ExtensionFunctionType;", "properties", "c", "(Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function1;)Lr1/n;", "includeFakeNodes", "C", "(Ljava/util/List;ZZ)Ljava/util/List;", "includeReplacedSemantics", "l", "(ZZZ)Ljava/util/List;", "Landroidx/compose/ui/node/NodeCoordinator;", "e", "()Landroidx/compose/ui/node/NodeCoordinator;", "a", "()Lr1/n;", "Landroidx/compose/ui/Modifier$c;", "getOuterSemanticsNode$ui_release", "()Landroidx/compose/ui/Modifier$c;", "Z", "getMergingEnabled", "()Z", "Landroidx/compose/ui/node/LayoutNode;", "q", "()Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "w", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "x", "setFake$ui_release", "(Z)V", "isFake", "Lr1/n;", "fakeNodeParent", "", "g", "I", "o", "()I", PreferencesHelper.PREF_ID, "y", "isMergingSemanticsOfDescendants", "A", "isUnmergedLeafNode", "Landroidx/compose/ui/layout/z;", "p", "()Landroidx/compose/ui/layout/z;", "layoutInfo", "Landroidx/compose/ui/geometry/Rect;", "v", "()Landroidx/compose/ui/geometry/Rect;", "touchBoundsInRoot", "LH1/r;", "u", "()J", "size", "i", "boundsInRoot", "LU0/f;", "s", "positionInRoot", "j", "boundsInWindow", "h", "boundsInParent", "z", "isTransparent", "n", "config", "k", "()Ljava/util/List;", "children", "t", "replacedChildren", "r", "parent", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: r1.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16820n {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Modifier.c outerSemanticsNode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean mergingEnabled;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final LayoutNode layoutNode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SemanticsConfiguration unmergedConfig;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isFake;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private C16820n fakeNodeParent;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int id;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: r1.n$a */
    static final class a extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Role f159176f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Role role) {
            super(1);
            this.f159176f = role;
        }

        public final void a(u uVar) {
            s.s0(uVar, this.f159176f.getValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lr1/u;", "", "a", "(Lr1/u;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: r1.n$b */
    static final class b extends Lambda implements Function1<u, Unit> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f159177f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str) {
            super(1);
            this.f159177f = str;
        }

        public final void a(u uVar) {
            s.g0(uVar, this.f159177f);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(u uVar) {
            a(uVar);
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"r1/n$c", "Landroidx/compose/ui/node/u0;", "Landroidx/compose/ui/Modifier$c;", "Lr1/u;", "", "T1", "(Lr1/u;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: r1.n$c */
    public static final class c extends Modifier.c implements u0 {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function1<u, Unit> f159178o;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function1<? super u, Unit> function1) {
            this.f159178o = function1;
        }

        @Override // androidx.compose.ui.node.u0
        public void T1(u uVar) {
            this.f159178o.invoke(uVar);
        }
    }

    public final List<C16820n> k() {
        return m(this, false, false, false, 7, null);
    }

    public final List<C16820n> t() {
        return m(this, false, true, false, 4, null);
    }

    private final void B(List<C16820n> unmergedChildren, SemanticsConfiguration mergedConfig) {
        if (this.unmergedConfig.getIsClearingSemantics()) {
            return;
        }
        D(this, unmergedChildren, false, false, 6, null);
        int size = unmergedChildren.size();
        for (int size2 = unmergedChildren.size(); size2 < size; size2++) {
            C16820n c16820n = unmergedChildren.get(size2);
            if (!c16820n.y()) {
                mergedConfig.t(c16820n.unmergedConfig);
                c16820n.B(unmergedChildren, mergedConfig);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List D(C16820n c16820n, List list, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = new ArrayList();
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return c16820n.C(list, z10, z11);
    }

    private final C16820n c(Role role, Function1<? super u, Unit> properties) {
        SemanticsConfiguration semanticsConfiguration = new SemanticsConfiguration();
        semanticsConfiguration.v(false);
        semanticsConfiguration.u(false);
        properties.invoke(semanticsConfiguration);
        C16820n c16820n = new C16820n(new c(properties), false, new LayoutNode(true, role != null ? C16821o.h(this) : C16821o.e(this)), semanticsConfiguration);
        c16820n.isFake = true;
        c16820n.fakeNodeParent = this;
        return c16820n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List g(C16820n c16820n, List list, List list2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            list2 = new ArrayList();
        }
        return c16820n.f(list, list2);
    }

    public static /* synthetic */ List m(C16820n c16820n, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = !c16820n.mergingEnabled;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            z12 = false;
        }
        return c16820n.l(z10, z11, z12);
    }

    private final boolean y() {
        return this.mergingEnabled && this.unmergedConfig.getIsMergingSemanticsOfDescendants();
    }

    public final boolean A() {
        if (this.isFake || !t().isEmpty()) {
            return false;
        }
        LayoutNode parent$ui_release = this.layoutNode.getParent$ui_release();
        while (true) {
            if (parent$ui_release == null) {
                parent$ui_release = null;
                break;
            }
            SemanticsConfiguration semanticsConfiguration = parent$ui_release.getSemanticsConfiguration();
            if (semanticsConfiguration != null && semanticsConfiguration.getIsMergingSemanticsOfDescendants()) {
                break;
            }
            parent$ui_release = parent$ui_release.getParent$ui_release();
        }
        return parent$ui_release == null;
    }

    public final List<C16820n> C(List<C16820n> unmergedChildren, boolean includeFakeNodes, boolean includeDeactivatedNodes) {
        if (this.isFake) {
            return CollectionsKt.m();
        }
        d(this.layoutNode, unmergedChildren, includeDeactivatedNodes);
        if (includeFakeNodes) {
            b(unmergedChildren);
        }
        return unmergedChildren;
    }

    public final C16820n a() {
        return new C16820n(this.outerSemanticsNode, true, this.layoutNode, this.unmergedConfig);
    }

    public final NodeCoordinator e() {
        if (this.isFake) {
            C16820n c16820nR = r();
            if (c16820nR != null) {
                return c16820nR.e();
            }
            return null;
        }
        InterfaceC5956j interfaceC5956jF = C16821o.f(this.layoutNode);
        if (interfaceC5956jF == null) {
            interfaceC5956jF = this.outerSemanticsNode;
        }
        return C5957k.j(interfaceC5956jF, C5952f0.a(8));
    }

    public final List<C16820n> l(boolean includeReplacedSemantics, boolean includeFakeNodes, boolean includeDeactivatedNodes) {
        if (!includeReplacedSemantics && this.unmergedConfig.getIsClearingSemantics()) {
            return CollectionsKt.m();
        }
        ArrayList arrayList = new ArrayList();
        return y() ? g(this, arrayList, null, 2, null) : C(arrayList, includeFakeNodes, includeDeactivatedNodes);
    }

    /* renamed from: o, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final InterfaceC5940z p() {
        return this.layoutNode;
    }

    /* renamed from: q, reason: from getter */
    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final C16820n r() {
        LayoutNode parent$ui_release;
        C16820n c16820n = this.fakeNodeParent;
        if (c16820n != null) {
            return c16820n;
        }
        if (this.mergingEnabled) {
            parent$ui_release = this.layoutNode.getParent$ui_release();
            while (parent$ui_release != null) {
                SemanticsConfiguration semanticsConfiguration = parent$ui_release.getSemanticsConfiguration();
                if (semanticsConfiguration != null && semanticsConfiguration.getIsMergingSemanticsOfDescendants()) {
                    break;
                }
                parent$ui_release = parent$ui_release.getParent$ui_release();
            }
            parent$ui_release = null;
        } else {
            parent$ui_release = null;
        }
        if (parent$ui_release == null) {
            parent$ui_release = this.layoutNode.getParent$ui_release();
            while (true) {
                if (parent$ui_release == null) {
                    parent$ui_release = null;
                    break;
                }
                if (parent$ui_release.getNodes().p(C5952f0.a(8))) {
                    break;
                }
                parent$ui_release = parent$ui_release.getParent$ui_release();
            }
        }
        if (parent$ui_release == null) {
            return null;
        }
        return C16821o.a(parent$ui_release, this.mergingEnabled);
    }

    public final Rect v() {
        InterfaceC5956j interfaceC5956jF;
        if (!this.unmergedConfig.getIsMergingSemanticsOfDescendants() || (interfaceC5956jF = C16821o.f(this.layoutNode)) == null) {
            interfaceC5956jF = this.outerSemanticsNode;
        }
        return v0.c(interfaceC5956jF.getNode(), v0.a(this.unmergedConfig));
    }

    /* renamed from: w, reason: from getter */
    public final SemanticsConfiguration getUnmergedConfig() {
        return this.unmergedConfig;
    }

    /* renamed from: x, reason: from getter */
    public final boolean getIsFake() {
        return this.isFake;
    }

    public C16820n(Modifier.c cVar, boolean z10, LayoutNode layoutNode, SemanticsConfiguration semanticsConfiguration) {
        this.outerSemanticsNode = cVar;
        this.mergingEnabled = z10;
        this.layoutNode = layoutNode;
        this.unmergedConfig = semanticsConfiguration;
        this.id = layoutNode.getSemanticsId();
    }

    private final void b(List<C16820n> unmergedChildren) {
        String str;
        Role roleG = C16821o.g(this);
        if (roleG != null && this.unmergedConfig.getIsMergingSemanticsOfDescendants() && !unmergedChildren.isEmpty()) {
            unmergedChildren.add(c(roleG, new a(roleG)));
        }
        SemanticsConfiguration semanticsConfiguration = this.unmergedConfig;
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (semanticsConfiguration.contains(semanticsProperties.getContentDescription()) && !unmergedChildren.isEmpty() && this.unmergedConfig.getIsMergingSemanticsOfDescendants()) {
            List list = (List) SemanticsConfigurationKt.getOrNull(this.unmergedConfig, semanticsProperties.getContentDescription());
            if (list != null) {
                str = (String) CollectionsKt.u0(list);
            } else {
                str = null;
            }
            if (str != null) {
                unmergedChildren.add(0, c(null, new b(str)));
            }
        }
    }

    private final void d(LayoutNode layoutNode, List<C16820n> list, boolean z10) {
        D0.c<LayoutNode> cVarS0 = layoutNode.s0();
        LayoutNode[] layoutNodeArr = cVarS0.content;
        int size = cVarS0.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            LayoutNode layoutNode2 = layoutNodeArr[i10];
            if (layoutNode2.isAttached() && (z10 || !layoutNode2.getIsDeactivated())) {
                if (layoutNode2.getNodes().p(C5952f0.a(8))) {
                    list.add(C16821o.a(layoutNode2, this.mergingEnabled));
                } else {
                    d(layoutNode2, list, z10);
                }
            }
        }
    }

    private final List<C16820n> f(List<C16820n> unmergedChildren, List<C16820n> list) {
        D(this, unmergedChildren, false, false, 6, null);
        int size = unmergedChildren.size();
        for (int size2 = unmergedChildren.size(); size2 < size; size2++) {
            C16820n c16820n = unmergedChildren.get(size2);
            if (c16820n.y()) {
                list.add(c16820n);
            } else if (!c16820n.unmergedConfig.getIsClearingSemantics()) {
                c16820n.f(unmergedChildren, list);
            }
        }
        return list;
    }

    public final Rect h() {
        LayoutCoordinates layoutCoordinatesQ1;
        C16820n c16820nR = r();
        if (c16820nR == null) {
            return Rect.INSTANCE.a();
        }
        NodeCoordinator nodeCoordinatorE = e();
        if (nodeCoordinatorE != null) {
            if (!nodeCoordinatorE.isAttached()) {
                nodeCoordinatorE = null;
            }
            if (nodeCoordinatorE != null && (layoutCoordinatesQ1 = nodeCoordinatorE.q1()) != null) {
                return LayoutCoordinates.I(C5957k.j(c16820nR.outerSemanticsNode, C5952f0.a(8)), layoutCoordinatesQ1, false, 2, null);
            }
        }
        return Rect.INSTANCE.a();
    }

    public final Rect i() {
        Rect rectA;
        NodeCoordinator nodeCoordinatorE = e();
        if (nodeCoordinatorE != null) {
            if (!nodeCoordinatorE.isAttached()) {
                nodeCoordinatorE = null;
            }
            if (nodeCoordinatorE != null && (rectA = LayoutCoordinatesKt.a(nodeCoordinatorE)) != null) {
                return rectA;
            }
        }
        return Rect.INSTANCE.a();
    }

    public final Rect j() {
        Rect rectB;
        NodeCoordinator nodeCoordinatorE = e();
        if (nodeCoordinatorE != null) {
            if (!nodeCoordinatorE.isAttached()) {
                nodeCoordinatorE = null;
            }
            if (nodeCoordinatorE != null && (rectB = LayoutCoordinatesKt.b(nodeCoordinatorE)) != null) {
                return rectB;
            }
        }
        return Rect.INSTANCE.a();
    }

    public final SemanticsConfiguration n() {
        if (y()) {
            SemanticsConfiguration semanticsConfigurationK = this.unmergedConfig.k();
            B(new ArrayList(), semanticsConfigurationK);
            return semanticsConfigurationK;
        }
        return this.unmergedConfig;
    }

    public final long s() {
        NodeCoordinator nodeCoordinatorE = e();
        if (nodeCoordinatorE != null) {
            if (!nodeCoordinatorE.isAttached()) {
                nodeCoordinatorE = null;
            }
            if (nodeCoordinatorE != null) {
                return LayoutCoordinatesKt.e(nodeCoordinatorE);
            }
        }
        return U0.f.INSTANCE.c();
    }

    public final long u() {
        NodeCoordinator nodeCoordinatorE = e();
        if (nodeCoordinatorE != null) {
            return nodeCoordinatorE.c();
        }
        return H1.r.INSTANCE.a();
    }

    public final boolean z() {
        NodeCoordinator nodeCoordinatorE = e();
        if (nodeCoordinatorE != null) {
            return nodeCoordinatorE.isTransparent();
        }
        return false;
    }
}
