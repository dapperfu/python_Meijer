package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000 :2\u00020\u0001:\u0001:J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H'¢\u0006\u0004\b\n\u0010\bJ!\u0010\f\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H'¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0004H'¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0010\u001a\u00020\u0004H'¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0004H&¢\u0006\u0004\b\u001c\u0010\bJ\u000f\u0010\u001d\u001a\u00020\u0004H'¢\u0006\u0004\b\u001d\u0010\bJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH'¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H'¢\u0006\u0004\b\"\u0010\bJ\u000f\u0010#\u001a\u00020\u0004H'¢\u0006\u0004\b#\u0010\bJ#\u0010&\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u000e2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$H'¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0004H'¢\u0006\u0004\b(\u0010\bJ\u000f\u0010)\u001a\u00020\u0004H'¢\u0006\u0004\b)\u0010\bJ!\u0010*\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b*\u0010\rJ\u000f\u0010+\u001a\u00020\u0004H'¢\u0006\u0004\b+\u0010\bJ\u000f\u0010,\u001a\u00020\u0004H'¢\u0006\u0004\b,\u0010\bJ\u000f\u0010-\u001a\u00020\u0004H'¢\u0006\u0004\b-\u0010\bJB\u00103\u001a\u00020\u0004\"\u0004\b\u0000\u0010.\"\u0004\b\u0001\u0010\u000e2\u0006\u0010/\u001a\u00028\u00002\u001d\u00102\u001a\u0019\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000400¢\u0006\u0002\b1H'¢\u0006\u0004\b3\u00104J\u0011\u00105\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b5\u00106J\u0019\u00107\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b7\u00108J\u0019\u0010.\u001a\u00020\u001e2\b\u0010/\u001a\u0004\u0018\u00010\u0001H'¢\u0006\u0004\b.\u00109J\u0017\u0010:\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u001eH\u0017¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020<H\u0017¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020\u0002H\u0017¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020AH\u0017¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020DH\u0017¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u001e2\u0006\u0010/\u001a\u00020GH\u0017¢\u0006\u0004\bH\u0010IJ\u0019\u0010J\u001a\u00020\u001e2\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u0017¢\u0006\u0004\bJ\u00109J\u0017\u0010M\u001a\u00020\u00042\u0006\u0010L\u001a\u00020KH'¢\u0006\u0004\bM\u0010NJ\u001f\u0010Q\u001a\u00020\u001e2\u0006\u0010O\u001a\u00020\u001e2\u0006\u0010P\u001a\u00020\u0002H'¢\u0006\u0004\bQ\u0010RJ\u001d\u0010T\u001a\u00020\u00042\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00040$H'¢\u0006\u0004\bT\u0010'J#\u0010V\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000UH'¢\u0006\u0004\bV\u0010WJ#\u0010[\u001a\u00020\u00042\u0012\u0010Z\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030Y0XH'¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\u0004H'¢\u0006\u0004\b]\u0010\bJ\u001b\u0010^\u001a\u00020\u00042\n\u0010/\u001a\u0006\u0012\u0002\b\u00030YH'¢\u0006\u0004\b^\u0010_J\u000f\u0010`\u001a\u00020\u0004H'¢\u0006\u0004\b`\u0010\bJ\u000f\u0010a\u001a\u00020\u0004H&¢\u0006\u0004\ba\u0010\bJ\u000f\u0010c\u001a\u00020bH'¢\u0006\u0004\bc\u0010dR\u001e\u0010i\u001a\u0006\u0012\u0002\b\u00030e8&X§\u0004¢\u0006\f\u0012\u0004\bh\u0010\b\u001a\u0004\bf\u0010gR\u001a\u0010m\u001a\u00020\u001e8&X§\u0004¢\u0006\f\u0012\u0004\bl\u0010\b\u001a\u0004\bj\u0010kR\u001a\u0010p\u001a\u00020\u001e8&X§\u0004¢\u0006\f\u0012\u0004\bo\u0010\b\u001a\u0004\bn\u0010kR\u001a\u0010s\u001a\u00020\u001e8&X§\u0004¢\u0006\f\u0012\u0004\br\u0010\b\u001a\u0004\bq\u0010kR\u001c\u0010w\u001a\u0004\u0018\u00010K8&X§\u0004¢\u0006\f\u0012\u0004\bv\u0010\b\u001a\u0004\bt\u0010uR\u001a\u0010{\u001a\u00020\u00028&X§\u0004¢\u0006\f\u0012\u0004\bz\u0010\b\u001a\u0004\bx\u0010yR\u0014\u0010\u007f\u001a\u00020|8&X¦\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~R\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018&X¦\u0004¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001f\u0010\u0088\u0001\u001a\u00030\u0084\u00018gX§\u0004¢\u0006\u000f\u0012\u0005\b\u0087\u0001\u0010\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\u0082\u0001\u0002\u0089\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u008a\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/Composer;", "", "", "key", "", "startReplaceableGroup", "(I)V", "U", "()V", "startReplaceGroup", "P", "dataKey", "startMovableGroup", "(ILjava/lang/Object;)V", "T", "E", "w", "startRestartGroup", "(I)Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/T0;", "l", "()Landroidx/compose/runtime/T0;", "", "sourceInformation", "J", "(Ljava/lang/String;)V", "L", "(ILjava/lang/String;)V", "S", "K", "", "changed", "i", "(Z)V", "m", "F", "Lkotlin/Function0;", "factory", "I", "(Lkotlin/jvm/functions/Function0;)V", "s", "v", "startReusableGroup", "A", "G", "c", "V", "value", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "block", "n", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "B", "()Ljava/lang/Object;", "t", "(Ljava/lang/Object;)V", "(Ljava/lang/Object;)Z", "a", "(Z)Z", "", "f", "(C)Z", "d", "(I)Z", "", "b", "(F)Z", "", "e", "(J)Z", "", "g", "(D)Z", "D", "Landroidx/compose/runtime/H0;", "scope", "O", "(Landroidx/compose/runtime/H0;)V", "parametersChanged", "flags", "p", "(ZI)Z", "effect", "x", "Landroidx/compose/runtime/p;", "o", "(Landroidx/compose/runtime/p;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/G0;", "values", "W", "([Landroidx/compose/runtime/G0;)V", "M", "H", "(Landroidx/compose/runtime/G0;)V", "u", "y", "Landroidx/compose/runtime/k;", "R", "()Landroidx/compose/runtime/k;", "Landroidx/compose/runtime/Applier;", "k", "()Landroidx/compose/runtime/Applier;", "getApplier$annotations", "applier", "h", "()Z", "getInserting$annotations", "inserting", "j", "getSkipping$annotations", "skipping", "N", "getDefaultsInvalid$annotations", "defaultsInvalid", "z", "()Landroidx/compose/runtime/H0;", "getRecomposeScope$annotations", "recomposeScope", "Q", "()I", "getCompoundKeyHash$annotations", "compoundKeyHash", "Landroidx/compose/runtime/s;", "r", "()Landroidx/compose/runtime/s;", "currentCompositionLocalMap", "LO0/a;", "C", "()LO0/a;", "compositionData", "Lkotlin/coroutines/CoroutineContext;", "q", "()Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext$annotations", "applyCoroutineContext", "Landroidx/compose/runtime/ComposerImpl;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Composer {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f50121a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/Composer$a;", "", "<init>", "()V", "b", "Ljava/lang/Object;", "a", "()Ljava/lang/Object;", "Empty", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.Composer$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f50121a = new Companion();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final Object Empty = new C1052a();

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/runtime/Composer$a$a", "", "", "toString", "()Ljava/lang/String;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.runtime.Composer$a$a, reason: collision with other inner class name */
        public static final class C1052a {
            public String toString() {
                return "Empty";
            }

            C1052a() {
            }
        }

        public final Object a() {
            return Empty;
        }

        private Companion() {
        }
    }

    void A();

    Object B();

    O0.a C();

    void E();

    void F();

    void G();

    void H(G0<?> value);

    <T> void I(Function0<? extends T> factory);

    void J(String sourceInformation);

    void K();

    void L(int key, String sourceInformation);

    void M();

    boolean N();

    void O(H0 scope);

    void P();

    int Q();

    AbstractC5869k R();

    void S();

    void T();

    void U();

    boolean V(Object value);

    void W(G0<?>[] values);

    void c();

    boolean h();

    void i(boolean changed);

    boolean j();

    Applier<?> k();

    T0 l();

    void m();

    <V, T> void n(V value, Function2<? super T, ? super V, Unit> block);

    <T> T o(AbstractC5879p<T> key);

    boolean p(boolean parametersChanged, int flags);

    CoroutineContext q();

    InterfaceC5884s r();

    void s();

    void startMovableGroup(int key, Object dataKey);

    void startReplaceGroup(int key);

    void startReplaceableGroup(int key);

    Composer startRestartGroup(int key);

    void startReusableGroup(int key, Object dataKey);

    void t(Object value);

    void u();

    void v();

    void w();

    void x(Function0<Unit> effect);

    void y();

    H0 z();

    default boolean D(Object value) {
        return V(value);
    }

    default boolean a(boolean value) {
        return a(value);
    }

    default boolean b(float value) {
        return b(value);
    }

    default boolean d(int value) {
        return d(value);
    }

    default boolean e(long value) {
        return e(value);
    }

    default boolean f(char value) {
        return f(value);
    }

    default boolean g(double value) {
        return g(value);
    }
}
