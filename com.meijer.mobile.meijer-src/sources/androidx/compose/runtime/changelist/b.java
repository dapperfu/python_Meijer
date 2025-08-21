package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003J)\u0010\u000f\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0018\u001a\u00020\u00072\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001a\u0010\u0003J@\u0010!\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u001b\"\u0004\b\u0001\u0010\u001c2\u0006\u0010\u001d\u001a\u00028\u00002\u001d\u0010 \u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u001e¢\u0006\u0002\b\u001f¢\u0006\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010$¨\u0006'"}, d2 = {"Landroidx/compose/runtime/changelist/b;", "Landroidx/compose/runtime/changelist/d;", "<init>", "()V", "", "e", "()Z", "", "a", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "d", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "Lkotlin/Function0;", "", "factory", "", "insertIndex", "Landroidx/compose/runtime/Anchor;", "groupAnchor", "b", "(Lkotlin/jvm/functions/Function0;ILandroidx/compose/runtime/Anchor;)V", "c", "V", "T", "value", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "f", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/runtime/changelist/c;", "Landroidx/compose/runtime/changelist/c;", "operations", "pendingOperations", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class b extends d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c operations = new c();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c pendingOperations = new c();

    public final void a() {
        this.pendingOperations.a();
        this.operations.a();
    }

    public final void b(Function0<? extends Object> factory, int insertIndex, Anchor groupAnchor) {
        c cVar = this.operations;
        Operation.o oVar = Operation.o.f50458c;
        cVar.j(oVar);
        c cVarA = c.b.a(cVar);
        c.b.b(cVarA, Operation.r.a(0), factory);
        cVarA.intArgs[cVarA.intArgsSize - cVarA.opCodes[cVarA.opCodesSize - 1].getInts()] = insertIndex;
        c.b.b(cVarA, Operation.r.a(1), groupAnchor);
        cVar.c(oVar);
        c cVar2 = this.pendingOperations;
        Operation.s sVar = Operation.s.f50461c;
        cVar2.j(sVar);
        c cVarA2 = c.b.a(cVar2);
        cVarA2.intArgs[cVarA2.intArgsSize - cVarA2.opCodes[cVarA2.opCodesSize - 1].getInts()] = insertIndex;
        c.b.b(cVarA2, Operation.r.a(0), groupAnchor);
        cVar2.c(sVar);
    }

    public final void c() {
        if (!this.pendingOperations.g()) {
            ComposerKt.t("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.pendingOperations.h(this.operations);
    }

    public final void d(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
        if (!this.pendingOperations.f()) {
            ComposerKt.t("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        this.operations.d(applier, slots, rememberManager);
    }

    public final boolean e() {
        return this.operations.f();
    }

    public final <V, T> void f(V value, Function2<? super T, ? super V, Unit> block) {
        c cVar = this.operations;
        Operation.E e10 = Operation.E.f50438c;
        cVar.j(e10);
        c cVarA = c.b.a(cVar);
        c.b.b(cVarA, Operation.r.a(0), value);
        int iA = Operation.r.a(1);
        Intrinsics.h(block, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        c.b.b(cVarA, iA, (Function2) TypeIntrinsics.f(block, 2));
        cVar.c(e10);
    }
}
