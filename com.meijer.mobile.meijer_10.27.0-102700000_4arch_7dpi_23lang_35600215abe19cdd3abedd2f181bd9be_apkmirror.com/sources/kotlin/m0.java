package kotlin;

import androidx.compose.runtime.InterfaceC5730l0;
import androidx.compose.runtime.t1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H ¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H ¢\u0006\u0004\b\n\u0010\u0004R+\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R$\u0010\u0017\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00008&@`X¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u001a\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u00008&@`X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016\u0082\u0001\u0002\u001b\u001c¨\u0006\u001d"}, d2 = {"Lc0/m0;", "S", "", "<init>", "()V", "Lc0/k0;", "transition", "", "f", "(Lc0/k0;)V", "g", "", "<set-?>", "a", "Landroidx/compose/runtime/l0;", "c", "()Z", "e", "(Z)V", "isRunning", "()Ljava/lang/Object;", "d", "(Ljava/lang/Object;)V", "currentState", "b", "setTargetState$animation_core_release", "targetState", "Lc0/U;", "Lc0/Z;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public abstract class m0<S> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5730l0 isRunning;

    public /* synthetic */ m0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract S a();

    public abstract S b();

    public abstract void d(S s10);

    public abstract void f(k0<S> transition);

    public abstract void g();

    private m0() {
        this.isRunning = t1.e(Boolean.FALSE, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    public final void e(boolean z10) {
        this.isRunning.setValue(Boolean.valueOf(z10));
    }
}
