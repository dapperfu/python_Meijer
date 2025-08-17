package androidx.compose.runtime.changelist;

import J0.IntRef;
import androidx.compose.runtime.AbstractC5727k;
import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.C5718f0;
import androidx.compose.runtime.C5720g0;
import androidx.compose.runtime.I0;
import androidx.compose.runtime.InterfaceC5719g;
import androidx.compose.runtime.InterfaceC5725j;
import androidx.compose.runtime.InterfaceC5756z;
import androidx.compose.runtime.O0;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J)\u0010\u0010\u001a\u00020\b2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\"\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u001c¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\b¢\u0006\u0004\b)\u0010\u0003J\r\u0010*\u001a\u00020\b¢\u0006\u0004\b*\u0010\u0003J\u0017\u0010,\u001a\u00020\b2\b\u0010+\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\b¢\u0006\u0004\b.\u0010\u0003J\u0015\u0010/\u001a\u00020\b2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\b¢\u0006\u0004\b1\u0010\u0003J\r\u00102\u001a\u00020\b¢\u0006\u0004\b2\u0010\u0003J\r\u00103\u001a\u00020\b¢\u0006\u0004\b3\u0010\u0003J\u001d\u00106\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J%\u0010:\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\u0006\u00105\u001a\u0002042\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0015\u0010=\u001a\u00020\b2\u0006\u0010<\u001a\u00020\u001c¢\u0006\u0004\b=\u0010(J)\u0010B\u001a\u00020\b2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\b0>2\u0006\u0010A\u001a\u00020?¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\b2\b\u0010D\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\bE\u0010-J@\u0010K\u001a\u00020\b\"\u0004\b\u0000\u0010F\"\u0004\b\u0001\u0010G2\u0006\u0010\u0013\u001a\u00028\u00012\u001d\u0010J\u001a\u0019\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0H¢\u0006\u0002\bI¢\u0006\u0004\bK\u0010LJ\u001d\u0010O\u001a\u00020\b2\u0006\u0010M\u001a\u00020\u001c2\u0006\u0010N\u001a\u00020\u001c¢\u0006\u0004\bO\u0010PJ%\u0010R\u001a\u00020\b2\u0006\u0010Q\u001a\u00020\u001c2\u0006\u00105\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u001c¢\u0006\u0004\bR\u0010SJ\u0015\u0010U\u001a\u00020\b2\u0006\u0010T\u001a\u00020\u001c¢\u0006\u0004\bU\u0010(J\u0015\u0010V\u001a\u00020\b2\u0006\u0010&\u001a\u00020\u001c¢\u0006\u0004\bV\u0010(J\u001d\u0010Y\u001a\u00020\b2\u000e\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0W¢\u0006\u0004\bY\u0010ZJ\u001b\u0010]\u001a\u00020\b2\f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\b0[¢\u0006\u0004\b]\u0010^J\u001d\u0010a\u001a\u00020\b2\u0006\u0010`\u001a\u00020_2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\ba\u0010bJ%\u0010e\u001a\u00020\b2\u000e\u0010X\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0c2\u0006\u0010d\u001a\u00020_¢\u0006\u0004\be\u0010fJ/\u0010l\u001a\u00020\b2\b\u0010h\u001a\u0004\u0018\u00010g2\u0006\u0010j\u001a\u00020i2\u0006\u00105\u001a\u00020k2\u0006\u0010Q\u001a\u00020k¢\u0006\u0004\bl\u0010mJ%\u0010p\u001a\u00020\b2\u0006\u0010A\u001a\u00020n2\u0006\u0010j\u001a\u00020i2\u0006\u0010o\u001a\u00020k¢\u0006\u0004\bp\u0010qJ\r\u0010r\u001a\u00020\b¢\u0006\u0004\br\u0010\u0003J!\u0010t\u001a\u00020\b2\u0006\u0010s\u001a\u00020\u00002\n\b\u0002\u0010d\u001a\u0004\u0018\u00010_¢\u0006\u0004\bt\u0010uR\u0014\u0010x\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010w¨\u0006y"}, d2 = {"Landroidx/compose/runtime/changelist/a;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "", "c", "()Z", "d", "", "a", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "b", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "Landroidx/compose/runtime/O0;", "value", "x", "(Landroidx/compose/runtime/O0;)V", "Landroidx/compose/runtime/I0;", "scope", "D", "(Landroidx/compose/runtime/I0;)V", "o", "", "", "groupSlotIndex", "I", "(Ljava/lang/Object;I)V", "Landroidx/compose/runtime/Anchor;", "anchor", "F", "(Ljava/lang/Object;Landroidx/compose/runtime/Anchor;I)V", "f", "(Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)V", "count", "E", "(I)V", "A", "i", "data", "G", "(Ljava/lang/Object;)V", "q", "p", "(Landroidx/compose/runtime/Anchor;)V", "m", "C", "y", "Landroidx/compose/runtime/SlotTable;", "from", "s", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;)V", "Landroidx/compose/runtime/changelist/b;", "fixups", "t", "(Landroidx/compose/runtime/Anchor;Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/changelist/b;)V", "offset", "u", "Lkotlin/Function1;", "Landroidx/compose/runtime/j;", "action", "composition", "l", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/j;)V", "node", "K", "T", "V", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "H", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "removeFrom", "moveCount", "z", "(II)V", "to", "v", "(III)V", "distance", "e", "J", "", "nodes", "k", "([Ljava/lang/Object;)V", "Lkotlin/Function0;", "effect", "B", "(Lkotlin/jvm/functions/Function0;)V", "LJ0/d;", "effectiveNodeIndexOut", "j", "(LJ0/d;Landroidx/compose/runtime/Anchor;)V", "", "effectiveNodeIndex", "g", "(Ljava/util/List;LJ0/d;)V", "Landroidx/compose/runtime/f0;", "resolvedState", "Landroidx/compose/runtime/k;", "parentContext", "Landroidx/compose/runtime/g0;", "h", "(Landroidx/compose/runtime/f0;Landroidx/compose/runtime/k;Landroidx/compose/runtime/g0;Landroidx/compose/runtime/g0;)V", "Landroidx/compose/runtime/z;", "reference", "w", "(Landroidx/compose/runtime/z;Landroidx/compose/runtime/k;Landroidx/compose/runtime/g0;)V", "n", "changeList", "r", "(Landroidx/compose/runtime/changelist/a;LJ0/d;)V", "Landroidx/compose/runtime/changelist/c;", "Landroidx/compose/runtime/changelist/c;", "operations", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c operations = new c();

    public final void g(List<? extends Object> nodes, IntRef effectiveNodeIndex) {
        if (nodes.isEmpty()) {
            return;
        }
        c cVar = this.operations;
        Operation.C5706d c5706d = Operation.C5706d.f50223c;
        cVar.j(c5706d);
        c.b.c(c.b.a(cVar), Operation.r.a(1), nodes, Operation.r.a(0), effectiveNodeIndex);
        cVar.c(c5706d);
    }

    public final void k(Object[] nodes) {
        if (nodes.length == 0) {
            return;
        }
        c cVar = this.operations;
        Operation.C5710h c5710h = Operation.C5710h.f50227c;
        cVar.j(c5710h);
        c.b.b(c.b.a(cVar), Operation.r.a(0), nodes);
        cVar.c(c5710h);
    }

    public final void A() {
        this.operations.i(Operation.x.f50242c);
    }

    public final void B(Function0<Unit> effect) {
        c cVar = this.operations;
        Operation.y yVar = Operation.y.f50243c;
        cVar.j(yVar);
        c.b.b(c.b.a(cVar), Operation.r.a(0), effect);
        cVar.c(yVar);
    }

    public final void C() {
        this.operations.i(Operation.z.f50244c);
    }

    public final void D(I0 scope) {
        c cVar = this.operations;
        Operation.A a10 = Operation.A.f50210c;
        cVar.j(a10);
        c.b.b(c.b.a(cVar), Operation.r.a(0), scope);
        cVar.c(a10);
    }

    public final void E(int count) {
        c cVar = this.operations;
        Operation.B b10 = Operation.B.f50211c;
        cVar.j(b10);
        c cVarA = c.b.a(cVar);
        cVarA.intArgs[cVarA.intArgsSize - cVarA.opCodes[cVarA.opCodesSize - 1].getInts()] = count;
        cVar.c(b10);
    }

    public final void F(Object value, Anchor anchor, int groupSlotIndex) {
        c cVar = this.operations;
        Operation.C c10 = Operation.C.f50212c;
        cVar.j(c10);
        c cVarA = c.b.a(cVar);
        c.b.c(cVarA, Operation.r.a(0), value, Operation.r.a(1), anchor);
        cVarA.intArgs[cVarA.intArgsSize - cVarA.opCodes[cVarA.opCodesSize - 1].getInts()] = groupSlotIndex;
        cVar.c(c10);
    }

    public final void G(Object data) {
        c cVar = this.operations;
        Operation.D d10 = Operation.D.f50213c;
        cVar.j(d10);
        c.b.b(c.b.a(cVar), Operation.r.a(0), data);
        cVar.c(d10);
    }

    public final <T, V> void H(V value, Function2<? super T, ? super V, Unit> block) {
        c cVar = this.operations;
        Operation.E e10 = Operation.E.f50214c;
        cVar.j(e10);
        c cVarA = c.b.a(cVar);
        int iA = Operation.r.a(0);
        int iA2 = Operation.r.a(1);
        Intrinsics.h(block, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        c.b.c(cVarA, iA, value, iA2, (Function2) TypeIntrinsics.f(block, 2));
        cVar.c(e10);
    }

    public final void I(Object value, int groupSlotIndex) {
        c cVar = this.operations;
        Operation.F f10 = Operation.F.f50215c;
        cVar.j(f10);
        c cVarA = c.b.a(cVar);
        c.b.b(cVarA, Operation.r.a(0), value);
        cVarA.intArgs[cVarA.intArgsSize - cVarA.opCodes[cVarA.opCodesSize - 1].getInts()] = groupSlotIndex;
        cVar.c(f10);
    }

    public final void J(int count) {
        c cVar = this.operations;
        Operation.G g10 = Operation.G.f50216c;
        cVar.j(g10);
        c cVarA = c.b.a(cVar);
        cVarA.intArgs[cVarA.intArgsSize - cVarA.opCodes[cVarA.opCodesSize - 1].getInts()] = count;
        cVar.c(g10);
    }

    public final void K(Object node) {
        if (node instanceof InterfaceC5719g) {
            this.operations.i(Operation.H.f50217c);
        }
    }

    public final void a() {
        this.operations.a();
    }

    public final void b(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
        this.operations.d(applier, slots, rememberManager);
    }

    public final boolean c() {
        return this.operations.f();
    }

    public final boolean d() {
        return this.operations.g();
    }

    public final void e(int distance) {
        c cVar = this.operations;
        Operation.C5703a c5703a = Operation.C5703a.f50220c;
        cVar.j(c5703a);
        c cVarA = c.b.a(cVar);
        cVarA.intArgs[cVarA.intArgsSize - cVarA.opCodes[cVarA.opCodesSize - 1].getInts()] = distance;
        cVar.c(c5703a);
    }

    public final void f(Anchor anchor, Object value) {
        c cVar = this.operations;
        Operation.C5704b c5704b = Operation.C5704b.f50221c;
        cVar.j(c5704b);
        c.b.c(c.b.a(cVar), Operation.r.a(0), anchor, Operation.r.a(1), value);
        cVar.c(c5704b);
    }

    public final void h(C5718f0 resolvedState, AbstractC5727k parentContext, C5720g0 from, C5720g0 to2) {
        c cVar = this.operations;
        Operation.C5707e c5707e = Operation.C5707e.f50224c;
        cVar.j(c5707e);
        c.b.d(c.b.a(cVar), Operation.r.a(0), resolvedState, Operation.r.a(1), parentContext, Operation.r.a(3), to2, Operation.r.a(2), from);
        cVar.c(c5707e);
    }

    public final void i() {
        this.operations.i(Operation.C5708f.f50225c);
    }

    public final void j(IntRef effectiveNodeIndexOut, Anchor anchor) {
        c cVar = this.operations;
        Operation.C5709g c5709g = Operation.C5709g.f50226c;
        cVar.j(c5709g);
        c.b.c(c.b.a(cVar), Operation.r.a(0), effectiveNodeIndexOut, Operation.r.a(1), anchor);
        cVar.c(c5709g);
    }

    public final void l(Function1<? super InterfaceC5725j, Unit> action, InterfaceC5725j composition) {
        c cVar = this.operations;
        Operation.i iVar = Operation.i.f50228c;
        cVar.j(iVar);
        c.b.c(c.b.a(cVar), Operation.r.a(0), action, Operation.r.a(1), composition);
        cVar.c(iVar);
    }

    public final void m() {
        this.operations.i(Operation.j.f50229c);
    }

    public final void n() {
        this.operations.i(Operation.k.f50230c);
    }

    public final void o(I0 scope) {
        c cVar = this.operations;
        Operation.l lVar = Operation.l.f50231c;
        cVar.j(lVar);
        c.b.b(c.b.a(cVar), Operation.r.a(0), scope);
        cVar.c(lVar);
    }

    public final void p(Anchor anchor) {
        c cVar = this.operations;
        Operation.m mVar = Operation.m.f50232c;
        cVar.j(mVar);
        c.b.b(c.b.a(cVar), Operation.r.a(0), anchor);
        cVar.c(mVar);
    }

    public final void q() {
        this.operations.i(Operation.n.f50233c);
    }

    public final void s(Anchor anchor, SlotTable from) {
        c cVar = this.operations;
        Operation.InsertSlots insertSlots = Operation.InsertSlots.f50218c;
        cVar.j(insertSlots);
        c.b.c(c.b.a(cVar), Operation.r.a(0), anchor, Operation.r.a(1), from);
        cVar.c(insertSlots);
    }

    public final void t(Anchor anchor, SlotTable from, b fixups) {
        c cVar = this.operations;
        Operation.InsertSlotsWithFixups insertSlotsWithFixups = Operation.InsertSlotsWithFixups.f50219c;
        cVar.j(insertSlotsWithFixups);
        c.b.e(c.b.a(cVar), Operation.r.a(0), anchor, Operation.r.a(1), from, Operation.r.a(2), fixups);
        cVar.c(insertSlotsWithFixups);
    }

    public final void u(int offset) {
        c cVar = this.operations;
        Operation.p pVar = Operation.p.f50235c;
        cVar.j(pVar);
        c cVarA = c.b.a(cVar);
        cVarA.intArgs[cVarA.intArgsSize - cVarA.opCodes[cVarA.opCodesSize - 1].getInts()] = offset;
        cVar.c(pVar);
    }

    public final void v(int to2, int from, int count) {
        c cVar = this.operations;
        Operation.q qVar = Operation.q.f50236c;
        cVar.j(qVar);
        c cVarA = c.b.a(cVar);
        int iA = cVarA.intArgsSize - cVarA.opCodes[cVarA.opCodesSize - 1].getInts();
        int[] iArr = cVarA.intArgs;
        iArr[iA + 1] = to2;
        iArr[iA] = from;
        iArr[iA + 2] = count;
        cVar.c(qVar);
    }

    public final void w(InterfaceC5756z composition, AbstractC5727k parentContext, C5720g0 reference) {
        c cVar = this.operations;
        Operation.t tVar = Operation.t.f50238c;
        cVar.j(tVar);
        c.b.e(c.b.a(cVar), Operation.r.a(0), composition, Operation.r.a(1), parentContext, Operation.r.a(2), reference);
        cVar.c(tVar);
    }

    public final void x(O0 value) {
        c cVar = this.operations;
        Operation.u uVar = Operation.u.f50239c;
        cVar.j(uVar);
        c.b.b(c.b.a(cVar), Operation.r.a(0), value);
        cVar.c(uVar);
    }

    public final void y() {
        this.operations.i(Operation.v.f50240c);
    }

    public final void z(int removeFrom, int moveCount) {
        c cVar = this.operations;
        Operation.w wVar = Operation.w.f50241c;
        cVar.j(wVar);
        c cVarA = c.b.a(cVar);
        int iA = cVarA.intArgsSize - cVarA.opCodes[cVarA.opCodesSize - 1].getInts();
        int[] iArr = cVarA.intArgs;
        iArr[iA] = removeFrom;
        iArr[iA + 1] = moveCount;
        cVar.c(wVar);
    }

    public final void r(a changeList, IntRef effectiveNodeIndex) {
        if (changeList.d()) {
            c cVar = this.operations;
            Operation.C5705c c5705c = Operation.C5705c.f50222c;
            cVar.j(c5705c);
            c.b.c(c.b.a(cVar), Operation.r.a(0), changeList, Operation.r.a(1), effectiveNodeIndex);
            cVar.c(c5705c);
        }
    }
}
