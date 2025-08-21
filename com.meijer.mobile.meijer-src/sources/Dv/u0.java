package Dv;

import Cv.c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import zv.InterfaceC18555a;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b,\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000b\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00028\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0010\u001a\u00028\u0000*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH$¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020&2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u00032\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\rH\u0014¢\u0006\u0004\b-\u0010.J3\u00102\u001a\u00028\u0001\"\n\b\u0001\u0010\u001e*\u0004\u0018\u00010\u00012\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010/2\b\u00101\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u00032\u0006\u00104\u001a\u00020\rH\u0016¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u0012¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u0015¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0018¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\u000e¢\u0006\u0004\b@\u0010AJ\r\u0010B\u001a\u00020\u001d¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020 ¢\u0006\u0004\bD\u0010EJ\r\u0010F\u001a\u00020#¢\u0006\u0004\bF\u0010GJ\r\u0010H\u001a\u00020&¢\u0006\u0004\bH\u0010IJ\r\u0010J\u001a\u00020)¢\u0006\u0004\bJ\u0010KJ\u001d\u0010L\u001a\u00020\u00122\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bL\u0010MJ\u001d\u0010N\u001a\u00020\u00152\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bN\u0010OJ\u001d\u0010P\u001a\u00020\u00182\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bP\u0010QJ\u001d\u0010R\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bR\u0010SJ\u001d\u0010T\u001a\u00020\u001d2\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bT\u0010UJ\u001d\u0010V\u001a\u00020 2\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bV\u0010WJ\u001d\u0010X\u001a\u00020#2\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bX\u0010YJ\u001d\u0010Z\u001a\u00020&2\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\bZ\u0010[J\u001d\u0010\\\u001a\u00020)2\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\\\u0010]J\u001d\u0010^\u001a\u00020\u00032\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b^\u0010_JA\u0010`\u001a\u00028\u0001\"\n\b\u0001\u0010\u001e*\u0004\u0018\u00010\u00012\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010/2\b\u00101\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\b`\u0010aJC\u0010b\u001a\u0004\u0018\u00018\u0001\"\b\b\u0001\u0010\u001e*\u00020\u00012\u0006\u00104\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010/2\b\u00101\u001a\u0004\u0018\u00018\u0001¢\u0006\u0004\bb\u0010aJ\u0017\u0010e\u001a\u00020d2\u0006\u0010c\u001a\u00028\u0000H\u0004¢\u0006\u0004\be\u0010fJ\u000f\u0010g\u001a\u00028\u0000H\u0004¢\u0006\u0004\bg\u0010hR*\u0010o\u001a\u0012\u0012\u0004\u0012\u00028\u00000ij\b\u0012\u0004\u0012\u00028\u0000`j8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0016\u0010q\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010gR\u0016\u0010s\u001a\u0004\u0018\u00018\u00008DX\u0084\u0004¢\u0006\u0006\u001a\u0004\br\u0010h¨\u0006t"}, d2 = {"LDv/u0;", "", "Tag", "LCv/e;", "LCv/c;", "<init>", "()V", "E", "tag", "Lkotlin/Function0;", "block", "b0", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "LBv/f;", "", "index", "X", "(LBv/f;I)Ljava/lang/Object;", "", "M", "(Ljava/lang/Object;)Z", "", "N", "(Ljava/lang/Object;)B", "", "U", "(Ljava/lang/Object;)S", "S", "(Ljava/lang/Object;)I", "", "T", "(Ljava/lang/Object;)J", "", "Q", "(Ljava/lang/Object;)F", "", "P", "(Ljava/lang/Object;)D", "", "O", "(Ljava/lang/Object;)C", "", "V", "(Ljava/lang/Object;)Ljava/lang/String;", "inlineDescriptor", "R", "(Ljava/lang/Object;LBv/f;)LCv/e;", "Lzv/a;", "deserializer", "previousValue", "L", "(Lzv/a;Ljava/lang/Object;)Ljava/lang/Object;", "descriptor", "y", "(LBv/f;)LCv/e;", "", "l", "()Ljava/lang/Void;", "v", "()Z", "G", "()B", "r", "()S", "k", "()I", "n", "()J", "s", "()F", "t", "()D", "x", "()C", "B", "()Ljava/lang/String;", "h", "(LBv/f;I)Z", "F", "(LBv/f;I)B", "A", "(LBv/f;I)S", "w", "(LBv/f;I)I", "C", "(LBv/f;I)J", "g", "(LBv/f;I)F", "D", "(LBv/f;I)D", "i", "(LBv/f;I)C", "q", "(LBv/f;I)Ljava/lang/String;", "o", "(LBv/f;I)LCv/e;", "e", "(LBv/f;ILzv/a;Ljava/lang/Object;)Ljava/lang/Object;", "u", "name", "", "a0", "(Ljava/lang/Object;)V", "Z", "()Ljava/lang/Object;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "Y", "()Ljava/util/ArrayList;", "tagStack", "b", "flag", "W", "currentTagOrNull", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes14.dex */
public abstract class u0<Tag> implements Cv.e, Cv.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<Tag> tagStack = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean flag;

    protected abstract boolean M(Tag tag);

    protected abstract byte N(Tag tag);

    protected abstract char O(Tag tag);

    protected abstract double P(Tag tag);

    protected abstract float Q(Tag tag);

    protected abstract int S(Tag tag);

    protected abstract long T(Tag tag);

    protected abstract short U(Tag tag);

    protected abstract String V(Tag tag);

    protected abstract Tag X(Bv.f fVar, int i10);

    @Override // Cv.e
    public final Void l() {
        return null;
    }

    @Override // Cv.e
    public abstract <T> T z(InterfaceC18555a<? extends T> interfaceC18555a);

    @Override // Cv.c
    public final short A(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return U(X(descriptor, index));
    }

    @Override // Cv.c
    public final long C(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return T(X(descriptor, index));
    }

    @Override // Cv.c
    public final double D(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return P(X(descriptor, index));
    }

    @Override // Cv.c
    public final byte F(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return N(X(descriptor, index));
    }

    protected <T> T L(InterfaceC18555a<? extends T> deserializer, T previousValue) {
        Intrinsics.j(deserializer, "deserializer");
        return (T) z(deserializer);
    }

    protected Cv.e R(Tag tag, Bv.f inlineDescriptor) {
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

    @Override // Cv.c
    public final <T> T e(Bv.f descriptor, int index, final InterfaceC18555a<? extends T> deserializer, final T previousValue) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(deserializer, "deserializer");
        return (T) b0(X(descriptor, index), new Function0() { // from class: Dv.s0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u0.K(this.f6784a, deserializer, previousValue);
            }
        });
    }

    @Override // Cv.c
    public final float g(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return Q(X(descriptor, index));
    }

    @Override // Cv.c
    public final boolean h(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return M(X(descriptor, index));
    }

    @Override // Cv.c
    public final char i(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return O(X(descriptor, index));
    }

    @Override // Cv.c
    public final Cv.e o(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return R(X(descriptor, index), descriptor.l(index));
    }

    @Override // Cv.c
    public final String q(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return V(X(descriptor, index));
    }

    @Override // Cv.c
    public final <T> T u(Bv.f descriptor, int index, final InterfaceC18555a<? extends T> deserializer, final T previousValue) {
        Intrinsics.j(descriptor, "descriptor");
        Intrinsics.j(deserializer, "deserializer");
        return (T) b0(X(descriptor, index), new Function0() { // from class: Dv.t0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u0.J(this.f6789a, deserializer, previousValue);
            }
        });
    }

    @Override // Cv.c
    public final int w(Bv.f descriptor, int index) {
        Intrinsics.j(descriptor, "descriptor");
        return S(X(descriptor, index));
    }

    @Override // Cv.e
    public Cv.e y(Bv.f descriptor) {
        Intrinsics.j(descriptor, "descriptor");
        return R(Z(), descriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object J(u0 u0Var, InterfaceC18555a interfaceC18555a, Object obj) {
        if (!interfaceC18555a.getDescriptor().g() && !u0Var.E()) {
            return u0Var.l();
        }
        return u0Var.L(interfaceC18555a, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object K(u0 u0Var, InterfaceC18555a interfaceC18555a, Object obj) {
        return u0Var.L(interfaceC18555a, obj);
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

    @Override // Cv.e
    public final String B() {
        return V(Z());
    }

    @Override // Cv.e
    public final byte G() {
        return N(Z());
    }

    @Override // Cv.e
    public final int k() {
        return S(Z());
    }

    @Override // Cv.c
    public int m(Bv.f fVar) {
        return c.a.a(this, fVar);
    }

    @Override // Cv.e
    public final long n() {
        return T(Z());
    }

    @Override // Cv.c
    public boolean p() {
        return c.a.b(this);
    }

    @Override // Cv.e
    public final short r() {
        return U(Z());
    }

    @Override // Cv.e
    public final float s() {
        return Q(Z());
    }

    @Override // Cv.e
    public final double t() {
        return P(Z());
    }

    @Override // Cv.e
    public final boolean v() {
        return M(Z());
    }

    @Override // Cv.e
    public final char x() {
        return O(Z());
    }
}
