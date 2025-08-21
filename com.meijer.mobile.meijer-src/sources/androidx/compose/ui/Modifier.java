package androidx.compose.ui;

import androidx.compose.ui.node.C5957k;
import androidx.compose.ui.node.InterfaceC5956j;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.k0;
import com.fullstory.instrumentation.frameworks.compose.FSComposeModifier;
import j1.C14920a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import mv.C0;
import mv.C15784P;
import mv.E0;
import mv.InterfaceC15783O;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\bg\u0018\u0000 \u00122\u00020\u0001:\u0003\u0012\u0013\u0014J7\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n0\tH&¢\u0006\u0004\b\u000e\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0004¢\u0006\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier$b;", "operation", "foldIn", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "any", "(Lkotlin/jvm/functions/Function1;)Z", "all", "other", "then", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "a", "b", "c", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Modifier extends FSComposeModifier {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f50738b;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0010\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0096\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/Modifier$a;", "Landroidx/compose/ui/Modifier;", "<init>", "()V", "R", "initial", "Lkotlin/Function2;", "Landroidx/compose/ui/Modifier$b;", "operation", "foldIn", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lkotlin/Function1;", "", "predicate", "any", "(Lkotlin/jvm/functions/Function1;)Z", "all", "other", "then", "(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "", "toString", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.Modifier$a, reason: from kotlin metadata */
    public static final class Companion implements Modifier {

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ Companion f50738b = new Companion();

        @Override // androidx.compose.ui.Modifier
        public boolean all(Function1<? super b, Boolean> predicate) {
            return true;
        }

        @Override // androidx.compose.ui.Modifier
        public boolean any(Function1<? super b, Boolean> predicate) {
            return false;
        }

        @Override // androidx.compose.ui.Modifier
        public <R> R foldIn(R initial, Function2<? super R, ? super b, ? extends R> operation) {
            return initial;
        }

        @Override // androidx.compose.ui.Modifier
        public Modifier then(Modifier other) {
            return other;
        }

        public String toString() {
            return "Modifier";
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J7\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0007J#\u0010\f\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\tH\u0016¢\u0006\u0004\b\u000e\u0010\rø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Landroidx/compose/ui/Modifier$b;", "Landroidx/compose/ui/Modifier;", "R", "initial", "Lkotlin/Function2;", "operation", "foldIn", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "Lkotlin/Function1;", "", "predicate", "any", "(Lkotlin/jvm/functions/Function1;)Z", "all", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b extends Modifier {

        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            @Deprecated
            public static boolean a(b bVar, Function1<? super b, Boolean> function1) {
                return b.super.all(function1);
            }

            @Deprecated
            public static boolean b(b bVar, Function1<? super b, Boolean> function1) {
                return b.super.any(function1);
            }

            @Deprecated
            public static <R> R c(b bVar, R r10, Function2<? super R, ? super b, ? extends R> function2) {
                return (R) b.super.foldIn(r10, function2);
            }

            @Deprecated
            public static <R> R d(b bVar, R r10, Function2<? super b, ? super R, ? extends R> function2) {
                return (R) b.super.foldOut(r10, function2);
            }

            @Deprecated
            public static Modifier e(b bVar, Modifier modifier) {
                return b.super.then(modifier);
            }
        }

        @Override // androidx.compose.ui.Modifier
        default boolean all(Function1<? super b, Boolean> predicate) {
            return predicate.invoke(this).booleanValue();
        }

        @Override // androidx.compose.ui.Modifier
        default boolean any(Function1<? super b, Boolean> predicate) {
            return predicate.invoke(this).booleanValue();
        }

        @Override // androidx.compose.ui.Modifier
        default <R> R foldIn(R initial, Function2<? super R, ? super b, ? extends R> operation) {
            return operation.invoke(initial, this);
        }

        default <R> R foldOut(R initial, Function2<? super b, ? super R, ? extends R> operation) {
            return operation.invoke(this, initial);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u001f\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u001b\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0000H\u0010¢\u0006\u0004\b\u0016\u0010\u0017R*\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00008\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010.\u001a\u00020#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R$\u00102\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010\u001a\u001a\u0004\b0\u0010\u001c\"\u0004\b1\u0010\u0017R$\u00106\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u0010\u001a\u001a\u0004\b4\u0010\u001c\"\u0004\b5\u0010\u0017R$\u0010>\u001a\u0004\u0018\u0001078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\"\u0010J\u001a\u00020C8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010N\u001a\u00020C8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bK\u0010E\u001a\u0004\bL\u0010G\"\u0004\bM\u0010IR\u0016\u0010P\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010ER\u0016\u0010R\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010ER*\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010\u0014R$\u0010[\u001a\u00020C2\u0006\u0010\u0018\u001a\u00020C8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bY\u0010E\u001a\u0004\bZ\u0010GR\u0011\u0010^\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u001a\u0010a\u001a\u00020C8VX\u0096\u0004¢\u0006\f\u0012\u0004\b`\u0010\u0003\u001a\u0004\b_\u0010G¨\u0006b"}, d2 = {"Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/j;", "<init>", "()V", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "", "J2", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "r2", "x2", "y2", "s2", "w2", "t2", "u2", "v2", "Lkotlin/Function0;", "effect", "I2", "(Lkotlin/jvm/functions/Function0;)V", "owner", "A2", "(Landroidx/compose/ui/Modifier$c;)V", "<set-?>", "a", "Landroidx/compose/ui/Modifier$c;", "A", "()Landroidx/compose/ui/Modifier$c;", "getNode$annotations", "node", "Lmv/O;", "b", "Lmv/O;", "scope", "", "c", "I", "l2", "()I", "E2", "(I)V", "kindSet", "d", "g2", "z2", "aggregateChildKindSet", "e", "n2", "G2", "parent", "f", "h2", "B2", "child", "Landroidx/compose/ui/node/k0;", "g", "Landroidx/compose/ui/node/k0;", "m2", "()Landroidx/compose/ui/node/k0;", "F2", "(Landroidx/compose/ui/node/k0;)V", "ownerScope", "h", "Landroidx/compose/ui/node/NodeCoordinator;", "i2", "()Landroidx/compose/ui/node/NodeCoordinator;", "", "i", "Z", "k2", "()Z", "D2", "(Z)V", "insertedNodeAwaitingAttachForInvalidation", "j", "p2", "H2", "updatedNodeAwaitingAttachForInvalidation", "k", "onAttachRunExpected", "l", "onDetachRunExpected", "m", "Lkotlin/jvm/functions/Function0;", "getDetachedListener$ui_release", "()Lkotlin/jvm/functions/Function0;", "C2", "detachedListener", "n", "q2", "isAttached", "j2", "()Lmv/O;", "coroutineScope", "o2", "getShouldAutoInvalidate$annotations", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension
    public static abstract class c implements InterfaceC5956j {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private InterfaceC15783O scope;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int kindSet;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private c parent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private c child;

        /* renamed from: g, reason: collision with root package name and from kotlin metadata */
        private k0 ownerScope;

        /* renamed from: h, reason: collision with root package name and from kotlin metadata */
        private NodeCoordinator coordinator;

        /* renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean insertedNodeAwaitingAttachForInvalidation;

        /* renamed from: j, reason: collision with root package name and from kotlin metadata */
        private boolean updatedNodeAwaitingAttachForInvalidation;

        /* renamed from: k, reason: collision with root package name and from kotlin metadata */
        private boolean onAttachRunExpected;

        /* renamed from: l, reason: collision with root package name and from kotlin metadata */
        private boolean onDetachRunExpected;

        /* renamed from: m, reason: collision with root package name and from kotlin metadata */
        private Function0<Unit> detachedListener;

        /* renamed from: n, reason: collision with root package name and from kotlin metadata */
        private boolean isAttached;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private c node = this;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int aggregateChildKindSet = -1;

        public boolean o2() {
            return true;
        }

        public void t2() {
        }

        public void u2() {
        }

        public void v2() {
        }

        @Override // androidx.compose.ui.node.InterfaceC5956j
        /* renamed from: A, reason: from getter */
        public final c getNode() {
            return this.node;
        }

        public void A2(c owner) {
            this.node = owner;
        }

        public final void B2(c cVar) {
            this.child = cVar;
        }

        public final void C2(Function0<Unit> function0) {
            this.detachedListener = function0;
        }

        public final void D2(boolean z10) {
            this.insertedNodeAwaitingAttachForInvalidation = z10;
        }

        public final void E2(int i10) {
            this.kindSet = i10;
        }

        public final void F2(k0 k0Var) {
            this.ownerScope = k0Var;
        }

        public final void G2(c cVar) {
            this.parent = cVar;
        }

        public final void H2(boolean z10) {
            this.updatedNodeAwaitingAttachForInvalidation = z10;
        }

        public void J2(NodeCoordinator coordinator) {
            this.coordinator = coordinator;
        }

        /* renamed from: g2, reason: from getter */
        public final int getAggregateChildKindSet() {
            return this.aggregateChildKindSet;
        }

        /* renamed from: h2, reason: from getter */
        public final c getChild() {
            return this.child;
        }

        /* renamed from: i2, reason: from getter */
        public final NodeCoordinator getCoordinator() {
            return this.coordinator;
        }

        public final InterfaceC15783O j2() {
            InterfaceC15783O interfaceC15783O = this.scope;
            if (interfaceC15783O != null) {
                return interfaceC15783O;
            }
            InterfaceC15783O interfaceC15783OA = C15784P.a(C5957k.p(this).getCoroutineContext().n0(E0.a((C0) C5957k.p(this).getCoroutineContext().g(C0.INSTANCE))));
            this.scope = interfaceC15783OA;
            return interfaceC15783OA;
        }

        /* renamed from: k2, reason: from getter */
        public final boolean getInsertedNodeAwaitingAttachForInvalidation() {
            return this.insertedNodeAwaitingAttachForInvalidation;
        }

        /* renamed from: l2, reason: from getter */
        public final int getKindSet() {
            return this.kindSet;
        }

        /* renamed from: m2, reason: from getter */
        public final k0 getOwnerScope() {
            return this.ownerScope;
        }

        /* renamed from: n2, reason: from getter */
        public final c getParent() {
            return this.parent;
        }

        /* renamed from: p2, reason: from getter */
        public final boolean getUpdatedNodeAwaitingAttachForInvalidation() {
            return this.updatedNodeAwaitingAttachForInvalidation;
        }

        /* renamed from: q2, reason: from getter */
        public final boolean getIsAttached() {
            return this.isAttached;
        }

        public void r2() {
            if (this.isAttached) {
                C14920a.b("node attached multiple times");
            }
            if (!(this.coordinator != null)) {
                C14920a.b("attach invoked on a node without a coordinator");
            }
            this.isAttached = true;
            this.onAttachRunExpected = true;
        }

        public void s2() {
            if (!this.isAttached) {
                C14920a.b("Cannot detach a node that is not attached");
            }
            if (this.onAttachRunExpected) {
                C14920a.b("Must run runAttachLifecycle() before markAsDetached()");
            }
            if (this.onDetachRunExpected) {
                C14920a.b("Must run runDetachLifecycle() before markAsDetached()");
            }
            this.isAttached = false;
            InterfaceC15783O interfaceC15783O = this.scope;
            if (interfaceC15783O != null) {
                C15784P.d(interfaceC15783O, new ModifierNodeDetachedCancellationException());
                this.scope = null;
            }
        }

        public void w2() {
            if (!this.isAttached) {
                C14920a.b("reset() called on an unattached node");
            }
            v2();
        }

        public void x2() {
            if (!this.isAttached) {
                C14920a.b("Must run markAsAttached() prior to runAttachLifecycle");
            }
            if (!this.onAttachRunExpected) {
                C14920a.b("Must run runAttachLifecycle() only once after markAsAttached()");
            }
            this.onAttachRunExpected = false;
            t2();
            this.onDetachRunExpected = true;
        }

        public void y2() {
            if (!this.isAttached) {
                C14920a.b("node detached multiple times");
            }
            if (!(this.coordinator != null)) {
                C14920a.b("detach invoked on a node without a coordinator");
            }
            if (!this.onDetachRunExpected) {
                C14920a.b("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
            }
            this.onDetachRunExpected = false;
            Function0<Unit> function0 = this.detachedListener;
            if (function0 != null) {
                function0.invoke();
            }
            u2();
        }

        public final void z2(int i10) {
            this.aggregateChildKindSet = i10;
        }

        public final void I2(Function0<Unit> effect) {
            C5957k.p(this).C(effect);
        }
    }

    boolean all(Function1<? super b, Boolean> predicate);

    boolean any(Function1<? super b, Boolean> predicate);

    <R> R foldIn(R initial, Function2<? super R, ? super b, ? extends R> operation);

    default Modifier then(Modifier other) {
        return other == INSTANCE ? this : new CombinedModifier(this, other);
    }
}
