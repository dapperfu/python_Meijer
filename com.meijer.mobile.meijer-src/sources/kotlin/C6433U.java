package kotlin;

import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0010¢\u0006\u0004\b\u000b\u0010\fR+\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0005R+\u0010\u0016\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00008V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011\"\u0004\b\u0015\u0010\u0005¨\u0006\u0017"}, d2 = {"Lc0/U;", "S", "Lc0/m0;", "initialState", "<init>", "(Ljava/lang/Object;)V", "Lc0/k0;", "transition", "", "f", "(Lc0/k0;)V", "g", "()V", "<set-?>", "b", "Landroidx/compose/runtime/l0;", "a", "()Ljava/lang/Object;", "d", "currentState", "c", "h", "targetState", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: c0.U, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6433U<S> extends m0<S> {

    /* renamed from: d, reason: collision with root package name */
    public static final int f60755d = 0;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 currentState;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 targetState;

    public C6433U(S s10) {
        super(null);
        this.currentState = t1.e(s10, null, 2, null);
        this.targetState = t1.e(s10, null, 2, null);
    }

    @Override // kotlin.m0
    public void f(k0<S> transition) {
    }

    @Override // kotlin.m0
    public void g() {
    }

    @Override // kotlin.m0
    public S a() {
        return (S) this.currentState.getValue();
    }

    @Override // kotlin.m0
    public S b() {
        return (S) this.targetState.getValue();
    }

    @Override // kotlin.m0
    public void d(S s10) {
        this.currentState.setValue(s10);
    }

    public void h(S s10) {
        this.targetState.setValue(s10);
    }
}
