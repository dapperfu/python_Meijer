package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\t\u001a\u00028\u0000H\u0010¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/H;", "T", "Landroidx/compose/runtime/F0;", "Landroidx/compose/runtime/n1;", "policy", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Landroidx/compose/runtime/n1;Lkotlin/jvm/functions/Function0;)V", "value", "Landroidx/compose/runtime/G0;", "c", "(Ljava/lang/Object;)Landroidx/compose/runtime/G0;", "b", "Landroidx/compose/runtime/n1;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class H<T> extends F0<T> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n1<T> policy;

    @Override // androidx.compose.runtime.F0
    public G0<T> c(T value) {
        return new G0<>(this, value, value == null, this.policy, null, null, true);
    }

    public H(n1<T> n1Var, Function0<? extends T> function0) {
        super(function0);
        this.policy = n1Var;
    }
}
