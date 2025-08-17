package Ji;

import V0.C5349s0;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0006\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"LJi/T;", "", "LV0/q0;", "color", "<init>", "(J)V", "a", "J", "()J", "b", "LJi/T$a;", "LJi/T$b;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class T {

    /* renamed from: b, reason: collision with root package name */
    public static final int f15798b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long color;

    @Metadata(d1 = {"\u0000Â\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bO\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:L\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001jRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001¨\u0006\u009e\u0001"}, d2 = {"LJi/T$a;", "LJi/T;", "LV0/q0;", "baseColor", "<init>", "(J)V", "u", "v", "w", "x", "y", "z", "A", "B", "C", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "p0", "q0", "r0", "s0", "t0", "u0", "v0", "w0", "x0", "D", "E", "F", "G", "H", "I", "J", "K", "L", "l", "m", "n", "o", "p", "q", "r", "s", "t", "V", "W", "X", "Y", "Z", "a0", "b0", "c0", "d0", "e0", "f0", "g0", "h0", "i0", "j0", "k0", "l0", "m0", "a", "o0", "n0", "LJi/T$a$a;", "LJi/T$a$b;", "LJi/T$a$c;", "LJi/T$a$d;", "LJi/T$a$e;", "LJi/T$a$f;", "LJi/T$a$g;", "LJi/T$a$h;", "LJi/T$a$i;", "LJi/T$a$j;", "LJi/T$a$k;", "LJi/T$a$l;", "LJi/T$a$m;", "LJi/T$a$n;", "LJi/T$a$o;", "LJi/T$a$p;", "LJi/T$a$q;", "LJi/T$a$r;", "LJi/T$a$s;", "LJi/T$a$t;", "LJi/T$a$u;", "LJi/T$a$v;", "LJi/T$a$w;", "LJi/T$a$x;", "LJi/T$a$y;", "LJi/T$a$z;", "LJi/T$a$A;", "LJi/T$a$B;", "LJi/T$a$C;", "LJi/T$a$D;", "LJi/T$a$E;", "LJi/T$a$F;", "LJi/T$a$G;", "LJi/T$a$H;", "LJi/T$a$I;", "LJi/T$a$J;", "LJi/T$a$K;", "LJi/T$a$L;", "LJi/T$a$M;", "LJi/T$a$N;", "LJi/T$a$O;", "LJi/T$a$P;", "LJi/T$a$Q;", "LJi/T$a$R;", "LJi/T$a$S;", "LJi/T$a$T;", "LJi/T$a$U;", "LJi/T$a$V;", "LJi/T$a$W;", "LJi/T$a$X;", "LJi/T$a$Y;", "LJi/T$a$Z;", "LJi/T$a$a0;", "LJi/T$a$b0;", "LJi/T$a$c0;", "LJi/T$a$d0;", "LJi/T$a$e0;", "LJi/T$a$f0;", "LJi/T$a$g0;", "LJi/T$a$h0;", "LJi/T$a$i0;", "LJi/T$a$j0;", "LJi/T$a$k0;", "LJi/T$a$l0;", "LJi/T$a$m0;", "LJi/T$a$n0;", "LJi/T$a$o0;", "LJi/T$a$p0;", "LJi/T$a$q0;", "LJi/T$a$r0;", "LJi/T$a$s0;", "LJi/T$a$t0;", "LJi/T$a$u0;", "LJi/T$a$v0;", "LJi/T$a$w0;", "LJi/T$a$x0;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a extends T {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$X;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class X extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final X f15823c = new X();

            private X() {
                super(C5349s0.b(2013265920), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$Y;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Y extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final Y f15824c = new Y();

            private Y() {
                super(C5349s0.b(1409286144), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$Z;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Z extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final Z f15825c = new Z();

            private Z() {
                super(C5349s0.b(989855744), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$a0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final a0 f15827c = new a0();

            private a0() {
                super(C5349s0.b(637534208), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$b0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final b0 f15829c = new b0();

            private b0() {
                super(C5349s0.b(385875968), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$c0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final c0 f15831c = new c0();

            private c0() {
                super(C5349s0.b(167772160), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$d0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final d0 f15833c = new d0();

            private d0() {
                super(C5349s0.b(83886080), null);
            }
        }

        public /* synthetic */ a(long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(j10);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$l0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class l0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final l0 f15849c = new l0();

            private l0() {
                super(C5349s0.b(1593835519), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$m0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class m0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final m0 f15851c = new m0();

            private m0() {
                super(C5349s0.b(822083583), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$n0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class n0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final n0 f15853c = new n0();

            private n0() {
                super(C5349s0.b(16777215), null);
            }
        }

        private a(long j10) {
            super(j10, null);
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$A;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class A extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final A f15800c = new A();

            private A() {
                super(C5349s0.d(4286022279L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$B;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class B extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final B f15801c = new B();

            private B() {
                super(C5349s0.d(4283587166L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$C;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C f15802c = new C();

            private C() {
                super(C5349s0.d(4280954416L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$D;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class D extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final D f15803c = new D();

            private D() {
                super(C5349s0.d(4293128928L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$E;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class E extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final E f15804c = new E();

            private E() {
                super(C5349s0.d(4291816905L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$F;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class F extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final F f15805c = new F();

            private F() {
                super(C5349s0.d(4289061526L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$G;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class G extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final G f15806c = new G();

            private G() {
                super(C5349s0.d(4286632812L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$H;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class H extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final H f15807c = new H();

            private H() {
                super(C5349s0.d(4284726604L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$I;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class I extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final I f15808c = new I();

            private I() {
                super(C5349s0.d(4283146548L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$J;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class J extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final J f15809c = new J();

            private J() {
                super(C5349s0.d(4281238296L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$K;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class K extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final K f15810c = new K();

            private K() {
                super(C5349s0.d(4279917834L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$L;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class L extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final L f15811c = new L();

            private L() {
                super(C5349s0.d(4278923011L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$M;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class M extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final M f15812c = new M();

            private M() {
                super(C5349s0.d(4294959072L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$N;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class N extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final N f15813c = new N();

            private N() {
                super(C5349s0.d(4294885313L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$O;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class O extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final O f15814c = new O();

            private O() {
                super(C5349s0.d(4294476165L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$P;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class P extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final P f15815c = new P();

            private P() {
                super(C5349s0.d(4293676115L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$Q;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Q extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final Q f15816c = new Q();

            private Q() {
                super(C5349s0.d(4292551469L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$R;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class R extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final R f15817c = new R();

            private R() {
                super(C5349s0.d(4290710291L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$S;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class S extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final S f15818c = new S();

            private S() {
                super(C5349s0.d(4288282630L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$T;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$T, reason: collision with other inner class name */
        public static final class C0269T extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C0269T f15819c = new C0269T();

            private C0269T() {
                super(C5349s0.d(4285267971L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$U;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class U extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final U f15820c = new U();

            private U() {
                super(C5349s0.d(4281794561L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$V;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class V extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final V f15821c = new V();

            private V() {
                super(C5349s0.d(3472883712L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$W;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class W extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final W f15822c = new W();

            private W() {
                super(C5349s0.d(2701131776L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$a;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$a, reason: collision with other inner class name */
        public static final class C0270a extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C0270a f15826c = new C0270a();

            private C0270a() {
                super(C5349s0.d(4278190080L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$b;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$b, reason: case insensitive filesystem */
        public static final class C3848b extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3848b f15828c = new C3848b();

            private C3848b() {
                super(C5349s0.d(4292930299L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$c;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$c, reason: case insensitive filesystem */
        public static final class C3849c extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3849c f15830c = new C3849c();

            private C3849c() {
                super(C5349s0.d(4289644779L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$d;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$d, reason: case insensitive filesystem */
        public static final class C3850d extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3850d f15832c = new C3850d();

            private C3850d() {
                super(C5349s0.d(4284848855L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$e;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$e, reason: case insensitive filesystem */
        public static final class C3851e extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3851e f15834c = new C3851e();

            private C3851e() {
                super(C5349s0.d(4281367233L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$e0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class e0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final e0 f15835c = new e0();

            private e0() {
                super(C5349s0.d(4244635647L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$f;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$f, reason: case insensitive filesystem */
        public static final class C3852f extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3852f f15836c = new C3852f();

            private C3852f() {
                super(C5349s0.d(4279001253L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$f0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class f0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final f0 f15837c = new f0();

            private f0() {
                super(C5349s0.d(4127195135L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$g;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$g, reason: case insensitive filesystem */
        public static final class C3853g extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3853g f15838c = new C3853g();

            private C3853g() {
                super(C5349s0.d(4278214604L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$g0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class g0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final g0 f15839c = new g0();

            private g0() {
                super(C5349s0.d(3909091327L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$h;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$h, reason: case insensitive filesystem */
        public static final class C3854h extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3854h f15840c = new C3854h();

            private C3854h() {
                super(C5349s0.d(4278209427L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$h0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class h0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final h0 f15841c = new h0();

            private h0() {
                super(C5349s0.d(3657433087L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$i;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$i, reason: case insensitive filesystem */
        public static final class C3855i extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3855i f15842c = new C3855i();

            private C3855i() {
                super(C5349s0.d(4278204537L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$i0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class i0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final i0 f15843c = new i0();

            private i0() {
                super(C5349s0.d(3305111551L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$j;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$j, reason: case insensitive filesystem */
        public static final class C3856j extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3856j f15844c = new C3856j();

            private C3856j() {
                super(C5349s0.d(4278199382L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$j0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class j0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final j0 f15845c = new j0();

            private j0() {
                super(C5349s0.d(2885681151L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$k;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$k, reason: case insensitive filesystem */
        public static final class C3857k extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3857k f15846c = new C3857k();

            private C3857k() {
                super(C5349s0.d(4278194476L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$k0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class k0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final k0 f15847c = new k0();

            private k0() {
                super(C5349s0.d(2281701375L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$l;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$l, reason: case insensitive filesystem */
        public static final class C3858l extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3858l f15848c = new C3858l();

            private C3858l() {
                super(C5349s0.d(4293131263L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$m;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$m, reason: case insensitive filesystem */
        public static final class C3859m extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3859m f15850c = new C3859m();

            private C3859m() {
                super(C5349s0.d(4291360255L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$n;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$n, reason: case insensitive filesystem */
        public static final class C3860n extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3860n f15852c = new C3860n();

            private C3860n() {
                super(C5349s0.d(4287489021L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$o;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$o, reason: case insensitive filesystem */
        public static final class C3861o extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3861o f15854c = new C3861o();

            private C3861o() {
                super(C5349s0.d(4284140787L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$o0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class o0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final o0 f15855c = new o0();

            private o0() {
                super(C5349s0.d(4294967295L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$p;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$p, reason: case insensitive filesystem */
        public static final class C3862p extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3862p f15856c = new C3862p();

            private C3862p() {
                super(C5349s0.d(4281512676L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$p0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class p0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final p0 f15857c = new p0();

            private p0() {
                super(C5349s0.d(4294965213L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$q;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$q, reason: case insensitive filesystem */
        public static final class C3863q extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3863q f15858c = new C3863q();

            private C3863q() {
                super(C5349s0.d(4279605446L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$q0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class q0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final q0 f15859c = new q0();

            private q0() {
                super(C5349s0.d(4294963641L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$r;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$r, reason: case insensitive filesystem */
        public static final class C3864r extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3864r f15860c = new C3864r();

            private C3864r() {
                super(C5349s0.d(4278418079L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$r0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class r0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final r0 f15861c = new r0();

            private r0() {
                super(C5349s0.d(4294959221L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$s;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$s, reason: case insensitive filesystem */
        public static final class C3865s extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3865s f15862c = new C3865s();

            private C3865s() {
                super(C5349s0.d(4278212720L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$s0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class s0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final s0 f15863c = new s0();

            private s0() {
                super(C5349s0.d(4294824250L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$t;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class t extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final t f15864c = new t();

            private t() {
                super(C5349s0.d(4278201913L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$t0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class t0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final t0 f15865c = new t0();

            private t0() {
                super(C5349s0.d(4293309207L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$u;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$u, reason: case insensitive filesystem */
        public static final class C3866u extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3866u f15866c = new C3866u();

            private C3866u() {
                super(C5349s0.d(4294310395L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$u0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class u0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final u0 f15867c = new u0();

            private u0() {
                super(C5349s0.d(4291269378L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$v;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$v, reason: case insensitive filesystem */
        public static final class C3867v extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3867v f15868c = new C3867v();

            private C3867v() {
                super(C5349s0.d(4293456116L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$v0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class v0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final v0 f15869c = new v0();

            private v0() {
                super(C5349s0.d(4288705280L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$w;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$w, reason: case insensitive filesystem */
        public static final class C3868w extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3868w f15870c = new C3868w();

            private C3868w() {
                super(C5349s0.d(4292404201L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$w0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class w0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final w0 f15871c = new w0();

            private w0() {
                super(C5349s0.d(4285550336L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$x;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$x, reason: case insensitive filesystem */
        public static final class C3869x extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3869x f15872c = new C3869x();

            private C3869x() {
                super(C5349s0.d(4291220441L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$x0;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class x0 extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final x0 f15873c = new x0();

            private x0() {
                super(C5349s0.d(4281935616L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$y;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$y, reason: case insensitive filesystem */
        public static final class C3870y extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3870y f15874c = new C3870y();

            private C3870y() {
                super(C5349s0.d(4289838789L), null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJi/T$a$z;", "LJi/T$a;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$a$z, reason: case insensitive filesystem */
        public static final class C3871z extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C3871z f15875c = new C3871z();

            private C3871z() {
                super(C5349s0.d(4288127914L), null);
            }
        }
    }

    @Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b8\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:5\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u00014:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklm¨\u0006n"}, d2 = {"LJi/T$b;", "LJi/T;", "themeColor", "<init>", "(LJi/T;)V", "a0", "h", "i", "L", "M", "N", "x", "B", "C", "A", "t", "u", "v", "w", "l", "m", "Y", "P", "j", "D", "H", "J", "O", "F", "E", "I", "K", "G", "z", "y", "Q", "R", "S", "T", "U", "V", "k", "X", "n", "o", "p", "s", "q", "r", "Z", "c", "d", "W", "g", "e", "f", "b", "a", "LJi/T$b$a;", "LJi/T$b$b;", "LJi/T$b$c;", "LJi/T$b$d;", "LJi/T$b$e;", "LJi/T$b$f;", "LJi/T$b$g;", "LJi/T$b$h;", "LJi/T$b$i;", "LJi/T$b$j;", "LJi/T$b$k;", "LJi/T$b$l;", "LJi/T$b$m;", "LJi/T$b$n;", "LJi/T$b$o;", "LJi/T$b$p;", "LJi/T$b$q;", "LJi/T$b$r;", "LJi/T$b$s;", "LJi/T$b$t;", "LJi/T$b$u;", "LJi/T$b$v;", "LJi/T$b$w;", "LJi/T$b$x;", "LJi/T$b$y;", "LJi/T$b$z;", "LJi/T$b$A;", "LJi/T$b$B;", "LJi/T$b$C;", "LJi/T$b$D;", "LJi/T$b$E;", "LJi/T$b$F;", "LJi/T$b$G;", "LJi/T$b$H;", "LJi/T$b$I;", "LJi/T$b$J;", "LJi/T$b$K;", "LJi/T$b$L;", "LJi/T$b$M;", "LJi/T$b$N;", "LJi/T$b$O;", "LJi/T$b$P;", "LJi/T$b$Q;", "LJi/T$b$R;", "LJi/T$b$S;", "LJi/T$b$T;", "LJi/T$b$U;", "LJi/T$b$V;", "LJi/T$b$W;", "LJi/T$b$X;", "LJi/T$b$Y;", "LJi/T$b$Z;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b extends T {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$A;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class A extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public A(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tF = Ji.D.f15628a.f();
                super(tF, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$B;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class B extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public B(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tZ = Ji.D.f15628a.z();
                super(tZ, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$C;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tQ = Ji.D.f15628a.Q();
                super(tQ, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$D;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class D extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public D(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tQ = Ji.D.f15628a.Q();
                super(tQ, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$E;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class E extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public E(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tM = Ji.D.f15628a.M();
                super(tM, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$F;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class F extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public F(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tF = Ji.D.f15628a.f();
                super(tF, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$G;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class G extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public G(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tB = Ji.D.f15628a.b();
                super(tB, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$H;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class H extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public H(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tJ = Ji.D.f15628a.J();
                super(tJ, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$I;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class I extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public I(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tD = Ji.D.f15628a.D();
                super(tD, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$J;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class J extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public J(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tS0 = Ji.D.f15628a.s0();
                super(tS0, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$K;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class K extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public K(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tP0 = Ji.D.f15628a.p0();
                super(tP0, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$L;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class L extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public L(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tC = Ji.D.f15628a.C();
                super(tC, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$M;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class M extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public M(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tB = Ji.D.f15628a.B();
                super(tB, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$N;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class N extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public N(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tF = Ji.D.f15628a.f();
                super(tF, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$O;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class O extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public O(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tR0 = Ji.D.f15628a.r0();
                super(tR0, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$P;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class P extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public P(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tN0 = Ji.D.f15628a.n0();
                super(tN0, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$Q;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Q extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public Q(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tO0 = Ji.D.f15628a.o0();
                super(tO0, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$R;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class R extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public R(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = R.a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tU = Ji.D.f15628a.u();
                super(tU, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$S;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class S extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public S(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tZ = Ji.D.f15628a.z();
                super(tZ, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$T;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$b$T, reason: collision with other inner class name */
        public static final class C0271T extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$T$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C0271T(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tW = Ji.D.f15628a.w();
                super(tW, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$U;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class U extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public U(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tW = Ji.D.f15628a.w();
                super(tW, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$V;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class V extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public V(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tX = Ji.D.f15628a.X();
                super(tX, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$W;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class W extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public W(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tC = Ji.D.f15628a.c();
                super(tC, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$X;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class X extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public X(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tA0 = Ji.D.f15628a.a0();
                super(tA0, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$Y;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Y extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public Y(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tN0 = Ji.D.f15628a.n0();
                super(tN0, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$Z;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Z extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public Z(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tB = Ji.D.f15628a.b();
                super(tB, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$a;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$b$a, reason: case insensitive filesystem */
        public static final class C3872a extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0272a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3872a(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = C0272a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tF = Ji.D.f15628a.f();
                super(tF, null);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$a0;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a0 {

            /* renamed from: a, reason: collision with root package name */
            public static final a0 f15876a = new a0("LIGHT", 0);

            /* renamed from: b, reason: collision with root package name */
            public static final a0 f15877b = new a0("DARK", 1);

            /* renamed from: c, reason: collision with root package name */
            private static final /* synthetic */ a0[] f15878c;

            /* renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ EnumEntries f15879d;

            static {
                a0[] a0VarArrA = a();
                f15878c = a0VarArrA;
                f15879d = EnumEntriesKt.a(a0VarArrA);
            }

            private static final /* synthetic */ a0[] a() {
                return new a0[]{f15876a, f15877b};
            }

            public static a0 valueOf(String str) {
                return (a0) Enum.valueOf(a0.class, str);
            }

            public static a0[] values() {
                return (a0[]) f15878c.clone();
            }

            private a0(String str, int i10) {
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$b;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$b$b, reason: collision with other inner class name */
        public static final class C0273b extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$b$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C0273b(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tD = Ji.D.f15628a.d();
                super(tD, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$c;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$b$c, reason: case insensitive filesystem */
        public static final class C3873c extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$c$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3873c(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tI = Ji.D.f15628a.i();
                super(tI, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$d;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @Deprecated
        /* renamed from: Ji.T$b$d, reason: case insensitive filesystem */
        public static final class C3874d extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$d$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3874d(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tW = Ji.D.f15628a.w();
                super(tW, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$e;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$b$e, reason: case insensitive filesystem */
        public static final class C3875e extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$e$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3875e(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tS = Ji.D.f15628a.S();
                super(tS, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$f;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$b$f, reason: case insensitive filesystem */
        public static final class C3876f extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$f$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3876f(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tW = Ji.D.f15628a.w();
                super(tW, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$g;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$b$g, reason: case insensitive filesystem */
        public static final class C3877g extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$g$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3877g(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tV = Ji.D.f15628a.v();
                super(tV, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$h;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$b$h, reason: case insensitive filesystem */
        public static final class C3878h extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$h$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3878h(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tF = Ji.D.f15628a.f();
                super(tF, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$i;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$b$i, reason: case insensitive filesystem */
        public static final class C3879i extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$i$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3879i(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tQ = Ji.D.f15628a.Q();
                super(tQ, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$j;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$b$j, reason: case insensitive filesystem */
        public static final class C3880j extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$j$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3880j(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tQ = Ji.D.f15628a.Q();
                super(tQ, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$k;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @Deprecated
        /* renamed from: Ji.T$b$k, reason: case insensitive filesystem */
        public static final class C3881k extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$k$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3881k(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tX = Ji.D.f15628a.x();
                super(tX, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$l;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$b$l, reason: case insensitive filesystem */
        public static final class C3882l extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$l$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3882l(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tF = Ji.D.f15628a.f();
                super(tF, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$m;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @Deprecated
        /* renamed from: Ji.T$b$m, reason: case insensitive filesystem */
        public static final class C3883m extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$m$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3883m(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tU = Ji.D.f15628a.u();
                super(tU, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$n;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$b$n, reason: case insensitive filesystem */
        public static final class C3884n extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$n$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3884n(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tG = Ji.D.f15628a.g();
                super(tG, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$o;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$b$o, reason: case insensitive filesystem */
        public static final class C3885o extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$o$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3885o(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tH = Ji.D.f15628a.h();
                super(tH, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$p;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$b$p, reason: case insensitive filesystem */
        public static final class C3886p extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$p$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3886p(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tV = Ji.D.f15628a.v();
                super(tV, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$q;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$b$q, reason: case insensitive filesystem */
        public static final class C3887q extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$q$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3887q(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tR = Ji.D.f15628a.R();
                super(tR, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$r;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$b$r, reason: case insensitive filesystem */
        public static final class C3888r extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$r$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3888r(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tV = Ji.D.f15628a.v();
                super(tV, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$s;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$b$s, reason: case insensitive filesystem */
        public static final class C3889s extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$s$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3889s(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tU = Ji.D.f15628a.u();
                super(tU, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$t;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class t extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public t(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tC = Ji.D.f15628a.C();
                super(tC, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$u;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$b$u, reason: case insensitive filesystem */
        public static final class C3890u extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$u$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3890u(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tB = Ji.D.f15628a.B();
                super(tB, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$v;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$b$v, reason: case insensitive filesystem */
        public static final class C3891v extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$v$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3891v(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tF = Ji.D.f15628a.f();
                super(tF, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$w;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$b$w, reason: case insensitive filesystem */
        public static final class C3892w extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$w$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3892w(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tZ = Ji.D.f15628a.z();
                super(tZ, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$x;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$b$x, reason: case insensitive filesystem */
        public static final class C3893x extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$x$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3893x(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                a.C3867v c3867v = a.C3867v.f15868c;
                super(c3867v, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$y;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$b$y, reason: case insensitive filesystem */
        public static final class C3894y extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$y$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3894y(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tO0 = Ji.D.f15628a.o0();
                super(tO0, null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LJi/T$b$z;", "LJi/T$b;", "LJi/T$b$a0;", "theme", "<init>", "(LJi/T$b$a0;)V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ji.T$b$z, reason: case insensitive filesystem */
        public static final class C3895z extends b {

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ji.T$b$z$a */
            public /* synthetic */ class a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[a0.values().length];
                    try {
                        iArr[a0.f15877b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[a0.f15876a.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public C3895z(a0 theme) {
                Intrinsics.j(theme, "theme");
                int i10 = a.$EnumSwitchMapping$0[theme.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                T tO0 = Ji.D.f15628a.o0();
                super(tO0, null);
            }
        }

        public /* synthetic */ b(T t10, DefaultConstructorMarker defaultConstructorMarker) {
            this(t10);
        }

        private b(T t10) {
            super(t10.getColor(), null);
        }
    }

    public /* synthetic */ T(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    private T(long j10) {
        this.color = j10;
    }

    /* renamed from: a, reason: from getter */
    public final long getColor() {
        return this.color;
    }
}
