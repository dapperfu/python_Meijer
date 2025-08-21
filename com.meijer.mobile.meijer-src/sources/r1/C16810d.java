package r1;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.u0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B0\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\b*\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0005\u0010\u0012\"\u0004\b\u0016\u0010\u0014R3\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\b\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0012R\u0014\u0010 \u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0012¨\u0006!"}, d2 = {"Lr1/d;", "Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/u0;", "", "mergeDescendants", "isClearingSemantics", "Lkotlin/Function1;", "Lr1/u;", "", "Lkotlin/ExtensionFunctionType;", "properties", "<init>", "(ZZLkotlin/jvm/functions/Function1;)V", "T1", "(Lr1/u;)V", "o", "Z", "getMergeDescendants", "()Z", "K2", "(Z)V", "p", "setClearingSemantics", "q", "Lkotlin/jvm/functions/Function1;", "getProperties", "()Lkotlin/jvm/functions/Function1;", "L2", "(Lkotlin/jvm/functions/Function1;)V", "l0", "shouldClearDescendantSemantics", "Z1", "shouldMergeDescendantSemantics", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: r1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16810d extends Modifier.c implements u0 {

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private boolean mergeDescendants;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isClearingSemantics;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private Function1<? super u, Unit> properties;

    public final void K2(boolean z10) {
        this.mergeDescendants = z10;
    }

    public final void L2(Function1<? super u, Unit> function1) {
        this.properties = function1;
    }

    @Override // androidx.compose.ui.node.u0
    public void T1(u uVar) {
        this.properties.invoke(uVar);
    }

    @Override // androidx.compose.ui.node.u0
    /* renamed from: Z1, reason: from getter */
    public boolean getMergeDescendants() {
        return this.mergeDescendants;
    }

    @Override // androidx.compose.ui.node.u0
    /* renamed from: l0, reason: from getter */
    public boolean getIsClearingSemantics() {
        return this.isClearingSemantics;
    }

    public C16810d(boolean z10, boolean z11, Function1<? super u, Unit> function1) {
        this.mergeDescendants = z10;
        this.isClearingSemantics = z11;
        this.properties = function1;
    }
}
