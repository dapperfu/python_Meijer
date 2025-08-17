package kotlin;

import kotlin.AbstractC6334q;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B!\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB)\b\u0016\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\fJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014J0\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J0\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0014\u0010 \u001a\u00020\u001e8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001f¨\u0006!"}, d2 = {"Lc0/C0;", "Lc0/q;", "V", "Lc0/v0;", "", "dampingRatio", "stiffness", "Lc0/s;", "anims", "<init>", "(FFLc0/s;)V", "visibilityThreshold", "(FFLc0/q;)V", "initialValue", "targetValue", "initialVelocity", "", "b", "(Lc0/q;Lc0/q;Lc0/q;)J", "g", "(Lc0/q;Lc0/q;Lc0/q;)Lc0/q;", "playTimeNanos", "d", "(JLc0/q;Lc0/q;Lc0/q;)Lc0/q;", "f", "a", "F", "getDampingRatio", "()F", "getStiffness", "", "()Z", "isInfinite", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class C0<V extends AbstractC6334q> implements v0<V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float dampingRatio;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float stiffness;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ w0<V> f60882c;

    private C0(float f10, float f11, InterfaceC6336s interfaceC6336s) {
        this.dampingRatio = f10;
        this.stiffness = f11;
        this.f60882c = new w0<>(interfaceC6336s);
    }

    @Override // kotlin.v0, kotlin.r0
    public boolean a() {
        return this.f60882c.a();
    }

    @Override // kotlin.r0
    public long b(V initialValue, V targetValue, V initialVelocity) {
        return this.f60882c.b(initialValue, targetValue, initialVelocity);
    }

    @Override // kotlin.r0
    public V d(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return (V) this.f60882c.d(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    @Override // kotlin.r0
    public V f(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return (V) this.f60882c.f(playTimeNanos, initialValue, targetValue, initialVelocity);
    }

    @Override // kotlin.r0
    public V g(V initialValue, V targetValue, V initialVelocity) {
        return (V) this.f60882c.g(initialValue, targetValue, initialVelocity);
    }

    public C0(float f10, float f11, V v10) {
        this(f10, f11, s0.f(v10, f10, f11));
    }
}
