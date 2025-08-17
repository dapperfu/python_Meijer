package Hv;

import Gv.c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b+\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00028\u0000*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH$¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\rH\u0014¢\u0006\u0004\b-\u0010.J3\u00102\u001a\u00028\u0001\"\n\b\u0001\u0010\u001e*\u0004\u0018\u00010\u00012\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010/2\b\u00101\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00032\u0006\u00104\u001a\u00020\rH\u0016¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u0012¢\u0006\u0004\b:\u0010;J\r\u0010\u0007\u001a\u00020\u0015¢\u0006\u0004\b\u0007\u0010<J\r\u0010=\u001a\u00020\u0018¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u000e¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u001d¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020 ¢\u0006\u0004\bC\u0010DJ\r\u0010E\u001a\u00020#¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020&¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020)¢\u0006\u0004\bI\u0010JJ\u001d\u0010K\u001a\u00020\u00122\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bK\u0010LJ\u001d\u0010M\u001a\u00020\u00152\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bM\u0010NJ\u001d\u0010O\u001a\u00020\u00182\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bO\u0010PJ\u001d\u0010Q\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bQ\u0010RJ\u001d\u0010S\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bS\u0010TJ\u001d\u0010U\u001a\u00020 2\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bU\u0010VJ\u001d\u0010W\u001a\u00020#2\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bW\u0010XJ\u001d\u0010Y\u001a\u00020&2\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bY\u0010ZJ\u001d\u0010[\u001a\u00020)2\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b[\u0010\\J\u001d\u0010]\u001a\u00020\u00032\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b]\u0010^JA\u0010_\u001a\u00028\u0001\"\n\b\u0001\u0010\u001e*\u0004\u0018\u00010\u00012\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010/2\b\u00101\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b_\u0010`JC\u0010a\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u001e*\u00020\u00012\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010/2\b\u00101\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\ba\u0010`J\u0017\u0010d\u001a\u00020c2\u0006\u0010b\u001a\u00028\u0000H\u0004¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00028\u0000H\u0004¢\u0006\u0004\bf\u0010gR*\u0010n\u001a\u0012\u0012\u0004\u0012\u00028\u00000hj\b\u0012\u0004\u0012\u00028\u0000`i8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR\u0016\u0010p\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010fR\u0016\u0010r\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bq\u0010g¨\u0006s"}, d2 = {"LHv/u0;", "", "Tag", "LGv/e;", "LGv/c;", "<init>", "()V", "E", "tag", "Lkotlin/Function0;", "block", "b0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "LFv/f;", "", "index", "X", "(LFv/f;I)Ljava/lang/Object;", "", "M", "(Ljava/lang/Object;)Z", "", "N", "(Ljava/lang/Object;)B", "", "U", "(Ljava/lang/Object;)S", "S", "(Ljava/lang/Object;)I", "", "T", "(Ljava/lang/Object;)J", "", "Q", "(Ljava/lang/Object;)F", "", "P", "(Ljava/lang/Object;)D", "", "O", "(Ljava/lang/Object;)C", "", "V", "(Ljava/lang/Object;)Ljava/lang/String;", "inlineDescriptor", "R", "(Ljava/lang/Object;LFv/f;)LGv/e;", "LDv/a;", "deserializer", "previousValue", "L", "(LDv/a;Ljava/lang/Object;)Ljava/lang/Object;", "descriptor", "f", "(LFv/f;)LGv/e;", "", "i", "()Ljava/lang/Void;", "s", "()Z", "()B", "o", "()S", "h", "()I", "k", "()J", "p", "()F", "q", "()D", "t", "()C", "A", "()Ljava/lang/String;", "w", "(LFv/f;I)Z", "D", "(LFv/f;I)B", "j", "(LFv/f;I)S", "F", "(LFv/f;I)I", "y", "(LFv/f;I)J", "x", "(LFv/f;I)F", "e", "(LFv/f;I)D", "z", "(LFv/f;I)C", "r", "(LFv/f;I)Ljava/lang/String;", "u", "(LFv/f;I)LGv/e;", "m", "(LFv/f;ILDv/a;Ljava/lang/Object;)Ljava/lang/Object;", "l", "name", "", "a0", "(Ljava/lang/Object;)V", "Z", "()Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "Y", "()Ljava/util/ArrayList;", "tagStack", "b", "flag", "W", "currentTagOrNull", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes13.dex */
public abstract class u0<Tag> implements Gv.e, Gv.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<Tag> tagStack = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean flag;

    @Override // Gv.e
    public abstract <T> T G(Dv.a<? extends T> aVar);

    protected abstract boolean M(Tag tag);

    protected abstract byte N(Tag tag);

    protected abstract char O(Tag tag);

    protected abstract double P(Tag tag);

    protected abstract float Q(Tag tag);

    protected abstract int S(Tag tag);

    protected abstract long T(Tag tag);

    protected abstract short U(Tag tag);

    protected abstract String V(Tag tag);

    protected abstract Tag X(Fv.f fVar, int i10);

    @Override // Gv.e
    public final Void i() {
        return null;
    }

    @Override // Gv.c
    public final byte D(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return N(X(descriptor, index));
    }

    @Override // Gv.c
    public final int F(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return S(X(descriptor, index));
    }

    protected <T> T L(Dv.a<? extends T> deserializer, T previousValue) {
        Intrinsics.j(deserializer, "deserializer");
        return (T) G(deserializer);
    }

    protected Gv.e R(Tag tag, Fv.f inlineDescriptor) {
        Intrinsics.j(inlineDescriptor, "inlineDescriptor");
        a0(tag);
        return this;
    }

    protected final Tag W() {
        return (Tag) CollectionsKt.F0(this.tagStack);
    }

    public final ArrayList<Tag> Y() {
        return this.tagStack;
    }

    protected final Tag Z() {
        ArrayList<Tag> arrayList = this.tagStack;
        Tag tagRemove = arrayList.remove(CollectionsKt.o(arrayList));
        this.flag = true;
        return tagRemove;
    }

    protected final void a0(Tag name) {
        this.tagStack.add(name);
    }

    @Override // Gv.c
    public final double e(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return P(X(descriptor, index));
    }

    @Override // Gv.e
    public Gv.e f(Fv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        return R(Z(), descriptor);
    }

    @Override // Gv.c
    public final short j(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return U(X(descriptor, index));
    }

    @Override // Gv.c
    public final <T> T l(Fv.f descriptor, int index, final Dv.a<? extends T> deserializer, final T previousValue) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(deserializer, "deserializer");
        return (T) b0(X(descriptor, index), new Function0() { // from class: Hv.t0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u0.J(this.f13367a, deserializer, previousValue);
            }
        });
    }

    @Override // Gv.c
    public final <T> T m(Fv.f descriptor, int index, final Dv.a<? extends T> deserializer, final T previousValue) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(deserializer, "deserializer");
        return (T) b0(X(descriptor, index), new Function0() { // from class: Hv.s0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u0.K(this.f13362a, deserializer, previousValue);
            }
        });
    }

    @Override // Gv.c
    public final String r(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return V(X(descriptor, index));
    }

    @Override // Gv.c
    public final Gv.e u(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return R(X(descriptor, index), descriptor.l(index));
    }

    @Override // Gv.c
    public final boolean w(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return M(X(descriptor, index));
    }

    @Override // Gv.c
    public final float x(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return Q(X(descriptor, index));
    }

    @Override // Gv.c
    public final long y(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return T(X(descriptor, index));
    }

    @Override // Gv.c
    public final char z(Fv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return O(X(descriptor, index));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object J(u0 u0Var, Dv.a aVar, Object obj) {
        if (!aVar.getDescriptor().g() && !u0Var.B()) {
            return u0Var.i();
        }
        return u0Var.L(aVar, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object K(u0 u0Var, Dv.a aVar, Object obj) {
        return u0Var.L(aVar, obj);
    }

    private final <E> E b0(Tag tag, Function0<? extends E> block) {
        a0(tag);
        E eInvoke = block.invoke();
        if (!this.flag) {
            Z();
        }
        this.flag = false;
        return eInvoke;
    }

    @Override // Gv.e
    public final String A() {
        return V(Z());
    }

    @Override // Gv.c
    public int C(Fv.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // Gv.e
    public final byte E() {
        return N(Z());
    }

    @Override // Gv.e
    public final int h() {
        return S(Z());
    }

    @Override // Gv.e
    public final long k() {
        return T(Z());
    }

    @Override // Gv.c
    public boolean n() {
        return c.a.b(this);
    }

    @Override // Gv.e
    public final short o() {
        return U(Z());
    }

    @Override // Gv.e
    public final float p() {
        return Q(Z());
    }

    @Override // Gv.e
    public final double q() {
        return P(Z());
    }

    @Override // Gv.e
    public final boolean s() {
        return M(Z());
    }

    @Override // Gv.e
    public final char t() {
        return O(Z());
    }
}
