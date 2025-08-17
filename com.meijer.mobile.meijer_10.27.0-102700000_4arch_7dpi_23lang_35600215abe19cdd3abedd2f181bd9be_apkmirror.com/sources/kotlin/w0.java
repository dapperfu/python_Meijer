package kotlin;

import kotlin.AbstractC6334q;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0013\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ/\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0012\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J'\u0010\u0013\u001a\u00028\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0016\u0010\u001c\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001d\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001e"}, d2 = {"Lc0/w0;", "Lc0/q;", "V", "Lc0/v0;", "Lc0/s;", "anims", "<init>", "(Lc0/s;)V", "Lc0/G;", "anim", "(Lc0/G;)V", "", "playTimeNanos", "initialValue", "targetValue", "initialVelocity", "d", "(JLc0/q;Lc0/q;Lc0/q;)Lc0/q;", "f", "g", "(Lc0/q;Lc0/q;Lc0/q;)Lc0/q;", "b", "(Lc0/q;Lc0/q;Lc0/q;)J", "a", "Lc0/s;", "Lc0/q;", "valueVector", "c", "velocityVector", "endVelocityVector", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w0<V extends AbstractC6334q> implements v0<V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6336s anims;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private V valueVector;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private V velocityVector;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private V endVelocityVector;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"c0/w0$a", "Lc0/s;", "", "index", "Lc0/G;", "get", "(I)Lc0/G;", "animation-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC6336s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC6294G f61291a;

        a(InterfaceC6294G interfaceC6294G) {
            this.f61291a = interfaceC6294G;
        }

        @Override // kotlin.InterfaceC6336s
        public InterfaceC6294G get(int index) {
            return this.f61291a;
        }
    }

    public w0(InterfaceC6336s interfaceC6336s) {
        this.anims = interfaceC6336s;
    }

    @Override // kotlin.r0
    public V d(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        if (this.valueVector == null) {
            this.valueVector = (V) C6335r.g(initialValue);
        }
        V v10 = this.valueVector;
        if (v10 == null) {
            Intrinsics.y("valueVector");
            v10 = null;
        }
        int size = v10.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            V v11 = this.valueVector;
            if (v11 == null) {
                Intrinsics.y("valueVector");
                v11 = null;
            }
            v11.e(i10, this.anims.get(i10).c(playTimeNanos, initialValue.a(i10), targetValue.a(i10), initialVelocity.a(i10)));
        }
        V v12 = this.valueVector;
        if (v12 != null) {
            return v12;
        }
        Intrinsics.y("valueVector");
        return null;
    }

    @Override // kotlin.r0
    public V f(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        if (this.velocityVector == null) {
            this.velocityVector = (V) C6335r.g(initialVelocity);
        }
        V v10 = this.velocityVector;
        if (v10 == null) {
            Intrinsics.y("velocityVector");
            v10 = null;
        }
        int size = v10.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            V v11 = this.velocityVector;
            if (v11 == null) {
                Intrinsics.y("velocityVector");
                v11 = null;
            }
            v11.e(i10, this.anims.get(i10).d(playTimeNanos, initialValue.a(i10), targetValue.a(i10), initialVelocity.a(i10)));
        }
        V v12 = this.velocityVector;
        if (v12 != null) {
            return v12;
        }
        Intrinsics.y("velocityVector");
        return null;
    }

    @Override // kotlin.r0
    public V g(V initialValue, V targetValue, V initialVelocity) {
        if (this.endVelocityVector == null) {
            this.endVelocityVector = (V) C6335r.g(initialVelocity);
        }
        V v10 = this.endVelocityVector;
        if (v10 == null) {
            Intrinsics.y("endVelocityVector");
            v10 = null;
        }
        int size = v10.getSize();
        for (int i10 = 0; i10 < size; i10++) {
            V v11 = this.endVelocityVector;
            if (v11 == null) {
                Intrinsics.y("endVelocityVector");
                v11 = null;
            }
            v11.e(i10, this.anims.get(i10).b(initialValue.a(i10), targetValue.a(i10), initialVelocity.a(i10)));
        }
        V v12 = this.endVelocityVector;
        if (v12 != null) {
            return v12;
        }
        Intrinsics.y("endVelocityVector");
        return null;
    }

    public w0(InterfaceC6294G interfaceC6294G) {
        this(new a(interfaceC6294G));
    }

    @Override // kotlin.r0
    public long b(V initialValue, V targetValue, V initialVelocity) {
        int size = initialValue.getSize();
        long jMax = 0;
        for (int i10 = 0; i10 < size; i10++) {
            jMax = Math.max(jMax, this.anims.get(i10).e(initialValue.a(i10), targetValue.a(i10), initialVelocity.a(i10)));
        }
        return jMax;
    }
}
