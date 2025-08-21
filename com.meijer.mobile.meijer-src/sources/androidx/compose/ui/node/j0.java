package androidx.compose.ui.node;

import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u0004\"\f\b\u0000\u0010\u0002*\u00020\u0000*\u00020\u0001*\u00028\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/Modifier$c;", "Landroidx/compose/ui/node/i0;", "T", "Lkotlin/Function0;", "", "block", "a", "(Landroidx/compose/ui/Modifier$c;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class j0 {
    public static final <T extends Modifier.c & i0> void a(T t10, Function0<Unit> function0) {
        k0 ownerScope = t10.getOwnerScope();
        if (ownerScope == null) {
            ownerScope = new k0(t10);
            t10.F2(ownerScope);
        }
        C5957k.p(t10).getSnapshotObserver().observeReads$ui_release(ownerScope, k0.INSTANCE.a(), function0);
    }
}
