package kotlin;

import androidx.compose.runtime.InterfaceC5872l0;
import androidx.compose.runtime.t1;
import androidx.compose.runtime.z1;
import kotlin.AbstractC6460q;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b&\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004BM\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R+\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u00008V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010%\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00028\u00018\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010\n\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R*\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t8F@@X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+R*\u0010\r\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0011\u00105\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b4\u0010\u001b¨\u00066"}, d2 = {"Lc0/k;", "T", "Lc0/q;", "V", "Landroidx/compose/runtime/z1;", "Lc0/o0;", "typeConverter", "initialValue", "initialVelocityVector", "", "lastFrameTimeNanos", "finishedTimeNanos", "", "isRunning", "<init>", "(Lc0/o0;Ljava/lang/Object;Lc0/q;JJZ)V", "", "toString", "()Ljava/lang/String;", "a", "Lc0/o0;", "l", "()Lc0/o0;", "<set-?>", "b", "Landroidx/compose/runtime/l0;", "getValue", "()Ljava/lang/Object;", "D", "(Ljava/lang/Object;)V", "value", "c", "Lc0/q;", "p", "()Lc0/q;", "H", "(Lc0/q;)V", "velocityVector", "d", "J", "k", "()J", "w", "(J)V", "e", "f", "u", "Z", "t", "()Z", "z", "(Z)V", "m", "velocity", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: c0.k, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class AnimationState<T, V extends AbstractC6460q> implements z1<T> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o0<T, V> typeConverter;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC5872l0 value;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private V velocityVector;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private long lastFrameTimeNanos;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private long finishedTimeNanos;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean isRunning;

    public AnimationState(o0<T, V> o0Var, T t10, V v10, long j10, long j11, boolean z10) {
        V v11;
        this.typeConverter = o0Var;
        this.value = t1.e(t10, null, 2, null);
        this.velocityVector = (v10 == null || (v11 = (V) C6461r.e(v10)) == null) ? (V) C6455l.i(o0Var, t10) : v11;
        this.lastFrameTimeNanos = j10;
        this.finishedTimeNanos = j11;
        this.isRunning = z10;
    }

    public void D(T t10) {
        this.value.setValue(t10);
    }

    public final void H(V v10) {
        this.velocityVector = v10;
    }

    /* renamed from: f, reason: from getter */
    public final long getFinishedTimeNanos() {
        return this.finishedTimeNanos;
    }

    @Override // androidx.compose.runtime.z1
    public T getValue() {
        return this.value.getValue();
    }

    /* renamed from: k, reason: from getter */
    public final long getLastFrameTimeNanos() {
        return this.lastFrameTimeNanos;
    }

    public final o0<T, V> l() {
        return this.typeConverter;
    }

    public final T m() {
        return this.typeConverter.b().invoke(this.velocityVector);
    }

    public final V p() {
        return this.velocityVector;
    }

    /* renamed from: t, reason: from getter */
    public final boolean getIsRunning() {
        return this.isRunning;
    }

    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + m() + ", isRunning=" + this.isRunning + ", lastFrameTimeNanos=" + this.lastFrameTimeNanos + ", finishedTimeNanos=" + this.finishedTimeNanos + ')';
    }

    public final void u(long j10) {
        this.finishedTimeNanos = j10;
    }

    public final void w(long j10) {
        this.lastFrameTimeNanos = j10;
    }

    public final void z(boolean z10) {
        this.isRunning = z10;
    }

    public /* synthetic */ AnimationState(o0 o0Var, Object obj, AbstractC6460q abstractC6460q, long j10, long j11, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(o0Var, obj, (i10 & 4) != 0 ? null : abstractC6460q, (i10 & 8) != 0 ? Long.MIN_VALUE : j10, (i10 & 16) != 0 ? Long.MIN_VALUE : j11, (i10 & 32) != 0 ? false : z10);
    }
}
