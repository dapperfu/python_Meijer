package Ki;

import io.constructor.data.local.PreferencesHelper;
import ji.C15040a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\t\n\u0006\u000b\f\r\u000e\u000f\u0010\u0011B\u0013\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\n\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"LKi/C;", "", "", PreferencesHelper.PREF_ID, "<init>", "(I)V", "a", "I", "()I", "d", "c", "b", "f", "h", "i", "j", "g", "e", "LKi/C$a;", "LKi/C$b;", "LKi/C$c;", "LKi/C$d;", "LKi/C$e;", "LKi/C$f;", "LKi/C$g;", "LKi/C$h;", "LKi/C$i;", "LKi/C$j;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class C {

    /* renamed from: b, reason: collision with root package name */
    public static final int f16859b = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int id;

    @Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:'\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0007\u0018\u0019\u001a\u0006\u001b\u001c\u001d\b\u001e\u001f !\"#$%&'()*+,-B\u0013\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001'./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRST¨\u0006U"}, d2 = {"LKi/C$a;", "LKi/C;", "", PreferencesHelper.PREF_ID, "<init>", "(I)V", "c", "I", "a", "()I", "d", "e", "o", "t", "p", "F", "G", "A", "q", "x", "y", "E", "l", "H", "J", "f", "b", "M", "K", "L", "z", "u", "v", "w", "s", "r", "B", "k", "D", "m", "g", "h", "i", "n", "C", "j", "LKi/C$a$a;", "LKi/C$a$b;", "LKi/C$a$c;", "LKi/C$a$d;", "LKi/C$a$e;", "LKi/C$a$f;", "LKi/C$a$g;", "LKi/C$a$h;", "LKi/C$a$i;", "LKi/C$a$j;", "LKi/C$a$k;", "LKi/C$a$l;", "LKi/C$a$m;", "LKi/C$a$n;", "LKi/C$a$o;", "LKi/C$a$p;", "LKi/C$a$q;", "LKi/C$a$r;", "LKi/C$a$s;", "LKi/C$a$t;", "LKi/C$a$u;", "LKi/C$a$v;", "LKi/C$a$w;", "LKi/C$a$x;", "LKi/C$a$y;", "LKi/C$a$z;", "LKi/C$a$A;", "LKi/C$a$B;", "LKi/C$a$C;", "LKi/C$a$D;", "LKi/C$a$E;", "LKi/C$a$F;", "LKi/C$a$G;", "LKi/C$a$H;", "LKi/C$a$I;", "LKi/C$a$J;", "LKi/C$a$K;", "LKi/C$a$L;", "LKi/C$a$M;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a extends C {

        /* renamed from: d, reason: collision with root package name */
        public static final int f16861d = 0;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int id;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$A;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class A extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final A f16863e = new A();

            public boolean equals(Object other) {
                return this == other || (other instanceof A);
            }

            private A() {
                super(C15040a.f140664B, null);
            }

            public String toString() {
                return "RETURN";
            }

            public int hashCode() {
                return -63504979;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$B;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class B extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final B f16864e = new B();

            /* renamed from: f, reason: collision with root package name */
            public static final int f16865f = 0;

            public boolean equals(Object other) {
                return this == other || (other instanceof B);
            }

            private B() {
                super(C15040a.f140668C, null);
            }

            public String toString() {
                return "SEARCH";
            }

            public int hashCode() {
                return -35445211;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$C;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$a$C, reason: collision with other inner class name */
        public static final /* data */ class C0286C extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final C0286C f16866e = new C0286C();

            public boolean equals(Object other) {
                return this == other || (other instanceof C0286C);
            }

            private C0286C() {
                super(C15040a.f140672D, null);
            }

            public String toString() {
                return "SEND";
            }

            public int hashCode() {
                return -1550872763;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$D;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class D extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final D f16867e = new D();

            public boolean equals(Object other) {
                return this == other || (other instanceof D);
            }

            private D() {
                super(C15040a.f140676E, null);
            }

            public String toString() {
                return "SETTINGS";
            }

            public int hashCode() {
                return 842878304;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$E;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class E extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final E f16868e = new E();

            public boolean equals(Object other) {
                return this == other || (other instanceof E);
            }

            private E() {
                super(C15040a.f140680F, null);
            }

            public String toString() {
                return "SHARE";
            }

            public int hashCode() {
                return -832338014;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$F;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class F extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final F f16869e = new F();

            public boolean equals(Object other) {
                return this == other || (other instanceof F);
            }

            private F() {
                super(C15040a.f140684G, null);
            }

            public String toString() {
                return "SIGN_IN";
            }

            public int hashCode() {
                return -978835958;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$G;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class G extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final G f16870e = new G();

            public boolean equals(Object other) {
                return this == other || (other instanceof G);
            }

            private G() {
                super(C15040a.f140688H, null);
            }

            public String toString() {
                return "SIGN_OUT";
            }

            public int hashCode() {
                return -279137559;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$H;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class H extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final H f16871e = new H();

            public boolean equals(Object other) {
                return this == other || (other instanceof H);
            }

            private H() {
                super(C15040a.f140692I, null);
            }

            public String toString() {
                return "SORT_DOWN";
            }

            public int hashCode() {
                return -1147322106;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$I;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class I extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final I f16872e = new I();

            public boolean equals(Object other) {
                return this == other || (other instanceof I);
            }

            private I() {
                super(C15040a.f140696J, null);
            }

            public String toString() {
                return "SORT_UP";
            }

            public int hashCode() {
                return -796723201;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$J;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class J extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final J f16873e = new J();

            public boolean equals(Object other) {
                return this == other || (other instanceof J);
            }

            private J() {
                super(C15040a.f140700K, null);
            }

            public String toString() {
                return "SUBSCRIPTIONS";
            }

            public int hashCode() {
                return 1391624121;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$K;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class K extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final K f16874e = new K();

            public boolean equals(Object other) {
                return this == other || (other instanceof K);
            }

            private K() {
                super(C15040a.f140704L, null);
            }

            public String toString() {
                return "SUBTRACT_CIRCLE_FILLED";
            }

            public int hashCode() {
                return 163938371;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$L;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class L extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final L f16875e = new L();

            public boolean equals(Object other) {
                return this == other || (other instanceof L);
            }

            private L() {
                super(C15040a.f140708M, null);
            }

            public String toString() {
                return "SUBTRACT_CIRCLE_UNFILLED";
            }

            public int hashCode() {
                return -1028440100;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$M;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class M extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final M f16876e = new M();

            public boolean equals(Object other) {
                return this == other || (other instanceof M);
            }

            private M() {
                super(C15040a.f140712N, null);
            }

            public String toString() {
                return "SUBTRACT_SM";
            }

            public int hashCode() {
                return 155784456;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$a;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0287a extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final C0287a f16877e = new C0287a();

            /* renamed from: f, reason: collision with root package name */
            public static final int f16878f = 0;

            public boolean equals(Object other) {
                return this == other || (other instanceof C0287a);
            }

            private C0287a() {
                super(C15040a.f140769b, null);
            }

            public String toString() {
                return "ADD";
            }

            public int hashCode() {
                return -1296971484;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$b;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$a$b, reason: case insensitive filesystem */
        public static final /* data */ class C3917b extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final C3917b f16879e = new C3917b();

            public boolean equals(Object other) {
                return this == other || (other instanceof C3917b);
            }

            private C3917b() {
                super(C15040a.f140774c, null);
            }

            public String toString() {
                return "ADD_CIRCLE_FILLED";
            }

            public int hashCode() {
                return -1023332394;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$c;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final c f16880e = new c();

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            private c() {
                super(C15040a.f140779d, null);
            }

            public String toString() {
                return "ADD_CIRCLE_UNFILLED";
            }

            public int hashCode() {
                return 465655471;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$d;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$a$d, reason: case insensitive filesystem */
        public static final /* data */ class C3918d extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final C3918d f16881e = new C3918d();

            public boolean equals(Object other) {
                return this == other || (other instanceof C3918d);
            }

            private C3918d() {
                super(C15040a.f140784e, null);
            }

            public String toString() {
                return "AUTO_CLAIM";
            }

            public int hashCode() {
                return -877727863;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$e;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$a$e, reason: case insensitive filesystem */
        public static final /* data */ class C3919e extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final C3919e f16882e = new C3919e();

            /* renamed from: f, reason: collision with root package name */
            public static final int f16883f = 0;

            public boolean equals(Object other) {
                return this == other || (other instanceof C3919e);
            }

            private C3919e() {
                super(C15040a.f140789f, null);
            }

            public String toString() {
                return "AUTO_FILL";
            }

            public int hashCode() {
                return 525962358;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$f;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$a$f, reason: case insensitive filesystem */
        public static final /* data */ class C3920f extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final C3920f f16884e = new C3920f();

            public boolean equals(Object other) {
                return this == other || (other instanceof C3920f);
            }

            private C3920f() {
                super(C15040a.f140794g, null);
            }

            public String toString() {
                return "BACKUP";
            }

            public int hashCode() {
                return -525781441;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$g;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$a$g, reason: case insensitive filesystem */
        public static final /* data */ class C3921g extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final C3921g f16885e = new C3921g();

            /* renamed from: f, reason: collision with root package name */
            public static final int f16886f = 0;

            public boolean equals(Object other) {
                return this == other || (other instanceof C3921g);
            }

            private C3921g() {
                super(C15040a.f140799h, null);
            }

            public String toString() {
                return "CAMERA";
            }

            public int hashCode() {
                return -496860254;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$h;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$a$h, reason: case insensitive filesystem */
        public static final /* data */ class C3922h extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final C3922h f16887e = new C3922h();

            /* renamed from: f, reason: collision with root package name */
            public static final int f16888f = 0;

            public boolean equals(Object other) {
                return this == other || (other instanceof C3922h);
            }

            private C3922h() {
                super(C15040a.f140804i, null);
            }

            public String toString() {
                return "CAMERA_FLIP";
            }

            public int hashCode() {
                return -276552982;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$i;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$a$i, reason: case insensitive filesystem */
        public static final /* data */ class C3923i extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final C3923i f16889e = new C3923i();

            public boolean equals(Object other) {
                return this == other || (other instanceof C3923i);
            }

            private C3923i() {
                super(C15040a.f140809j, null);
            }

            public String toString() {
                return "CHANGE";
            }

            public int hashCode() {
                return -490744787;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$j;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$a$j, reason: case insensitive filesystem */
        public static final /* data */ class C3924j extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final C3924j f16890e = new C3924j();

            public boolean equals(Object other) {
                return this == other || (other instanceof C3924j);
            }

            private C3924j() {
                super(C15040a.f140814k, null);
            }

            public String toString() {
                return "CLIP";
            }

            public int hashCode() {
                return -1551342835;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$k;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$a$k, reason: case insensitive filesystem */
        public static final /* data */ class C3925k extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final C3925k f16891e = new C3925k();

            /* renamed from: f, reason: collision with root package name */
            public static final int f16892f = 0;

            public boolean equals(Object other) {
                return this == other || (other instanceof C3925k);
            }

            private C3925k() {
                super(C15040a.f140819l, null);
            }

            public String toString() {
                return "DELETE";
            }

            public int hashCode() {
                return -464566744;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$l;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$a$l, reason: case insensitive filesystem */
        public static final /* data */ class C3926l extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final C3926l f16893e = new C3926l();

            public boolean equals(Object other) {
                return this == other || (other instanceof C3926l);
            }

            private C3926l() {
                super(C15040a.f140824m, null);
            }

            public String toString() {
                return "DOWNLOAD";
            }

            public int hashCode() {
                return 836065733;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$m;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$a$m, reason: case insensitive filesystem */
        public static final /* data */ class C3927m extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final C3927m f16894e = new C3927m();

            /* renamed from: f, reason: collision with root package name */
            public static final int f16895f = 0;

            public boolean equals(Object other) {
                return this == other || (other instanceof C3927m);
            }

            private C3927m() {
                super(C15040a.f140829n, null);
            }

            public String toString() {
                return "EDIT";
            }

            public int hashCode() {
                return -1551290937;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$n;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class n extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final n f16896e = new n();

            public boolean equals(Object other) {
                return this == other || (other instanceof n);
            }

            private n() {
                super(C15040a.f140834o, null);
            }

            public String toString() {
                return "EDIT_TAG";
            }

            public int hashCode() {
                return 1011574018;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$o;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class o extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final o f16897e = new o();

            public boolean equals(Object other) {
                return this == other || (other instanceof o);
            }

            private o() {
                super(C15040a.f140839p, null);
            }

            public String toString() {
                return "ENLARGE";
            }

            public int hashCode() {
                return -371622091;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$p;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class p extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final p f16898e = new p();

            /* renamed from: f, reason: collision with root package name */
            public static final int f16899f = 0;

            public boolean equals(Object other) {
                return this == other || (other instanceof p);
            }

            private p() {
                super(C15040a.f140844q, null);
            }

            public String toString() {
                return "EXIT";
            }

            public int hashCode() {
                return -1551271717;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$q;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class q extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final q f16900e = new q();

            public boolean equals(Object other) {
                return this == other || (other instanceof q);
            }

            private q() {
                super(C15040a.f140849r, null);
            }

            public String toString() {
                return "FILTER";
            }

            public int hashCode() {
                return -403600395;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$r;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class r extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final r f16901e = new r();

            public boolean equals(Object other) {
                return this == other || (other instanceof r);
            }

            private r() {
                super(C15040a.f140853s, null);
            }

            public String toString() {
                return "GRAB_HANDLE";
            }

            public int hashCode() {
                return 186542366;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$s;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class s extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final s f16902e = new s();

            /* renamed from: f, reason: collision with root package name */
            public static final int f16903f = 0;

            public boolean equals(Object other) {
                return this == other || (other instanceof s);
            }

            private s() {
                super(C15040a.f140857t, null);
            }

            public String toString() {
                return "MENU";
            }

            public int hashCode() {
                return -1551051492;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$t;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class t extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final t f16904e = new t();

            public boolean equals(Object other) {
                return this == other || (other instanceof t);
            }

            private t() {
                super(C15040a.f140861u, null);
            }

            public String toString() {
                return "MINIMIZE";
            }

            public int hashCode() {
                return -1950820389;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$u;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class u extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final u f16905e = new u();

            public boolean equals(Object other) {
                return this == other || (other instanceof u);
            }

            private u() {
                super(C15040a.f140865v, null);
            }

            public String toString() {
                return "MORE_HORIZONTAL";
            }

            public int hashCode() {
                return 1427346289;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$v;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class v extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final v f16906e = new v();

            public boolean equals(Object other) {
                return this == other || (other instanceof v);
            }

            private v() {
                super(C15040a.f140869w, null);
            }

            public String toString() {
                return "MORE_HORIZONTAL_SM";
            }

            public int hashCode() {
                return 1897159144;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$w;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class w extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final w f16907e = new w();

            /* renamed from: f, reason: collision with root package name */
            public static final int f16908f = 0;

            public boolean equals(Object other) {
                return this == other || (other instanceof w);
            }

            private w() {
                super(C15040a.f140873x, null);
            }

            public String toString() {
                return "MORE_VERTICAL";
            }

            public int hashCode() {
                return -2033262077;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$x;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class x extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final x f16909e = new x();

            public boolean equals(Object other) {
                return this == other || (other instanceof x);
            }

            private x() {
                super(C15040a.f140877y, null);
            }

            public String toString() {
                return "MOVE";
            }

            public int hashCode() {
                return -1551041650;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$y;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class y extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final y f16910e = new y();

            /* renamed from: f, reason: collision with root package name */
            public static final int f16911f = 0;

            public boolean equals(Object other) {
                return this == other || (other instanceof y);
            }

            private y() {
                super(C15040a.f140881z, null);
            }

            public String toString() {
                return "REFRESH";
            }

            public int hashCode() {
                return -1981685282;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$a$z;", "LKi/C$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class z extends a {

            /* renamed from: e, reason: collision with root package name */
            public static final z f16912e = new z();

            public boolean equals(Object other) {
                return this == other || (other instanceof z);
            }

            private z() {
                super(C15040a.f140660A, null);
            }

            public String toString() {
                return "REMOVE";
            }

            public int hashCode() {
                return -63719167;
            }
        }

        public /* synthetic */ a(int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10);
        }

        private a(int i10) {
            super(i10, null);
            this.id = i10;
        }

        @Override // Ki.C
        /* renamed from: a, reason: from getter */
        public int getId() {
            return this.id;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\n\b\u000b\u0006\f\r\u000e\u000f\u0010B\u0013\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\t\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"LKi/C$b;", "LKi/C;", "", PreferencesHelper.PREF_ID, "<init>", "(I)V", "c", "I", "a", "()I", "d", "h", "f", "g", "b", "i", "e", "LKi/C$b$a;", "LKi/C$b$b;", "LKi/C$b$c;", "LKi/C$b$d;", "LKi/C$b$e;", "LKi/C$b$f;", "LKi/C$b$g;", "LKi/C$b$h;", "LKi/C$b$i;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b extends C {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int id;

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\b\n\u000b\f\r\u000e\u0006\u000f\u0010\u0011B\u0013\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\n\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"LKi/C$b$a;", "LKi/C$b;", "", PreferencesHelper.PREF_ID, "<init>", "(I)V", "d", "I", "a", "()I", "g", "f", "h", "b", "j", "i", "c", "e", "LKi/C$b$a$a;", "LKi/C$b$a$b;", "LKi/C$b$a$c;", "LKi/C$b$a$d;", "LKi/C$b$a$e;", "LKi/C$b$a$f;", "LKi/C$b$a$g;", "LKi/C$b$a$h;", "LKi/C$b$a$i;", "LKi/C$b$a$j;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class a extends b {

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final int id;

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$a$a;", "LKi/C$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$a$a, reason: collision with other inner class name */
            public static final /* data */ class C0288a extends a {

                /* renamed from: e, reason: collision with root package name */
                public static final C0288a f16915e = new C0288a();

                public boolean equals(Object other) {
                    return this == other || (other instanceof C0288a);
                }

                private C0288a() {
                    super(C15040a.f140720P, null);
                }

                public String toString() {
                    return "ACCOUNT";
                }

                public int hashCode() {
                    return -1606082669;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$a$b;", "LKi/C$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$a$b, reason: collision with other inner class name */
            public static final /* data */ class C0289b extends a {

                /* renamed from: e, reason: collision with root package name */
                public static final C0289b f16916e = new C0289b();

                /* renamed from: f, reason: collision with root package name */
                public static final int f16917f = 0;

                public boolean equals(Object other) {
                    return this == other || (other instanceof C0289b);
                }

                private C0289b() {
                    super(C15040a.f140724Q, null);
                }

                public String toString() {
                    return "ADD_TO_CART";
                }

                public int hashCode() {
                    return -2032214228;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$a$c;", "LKi/C$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class c extends a {

                /* renamed from: e, reason: collision with root package name */
                public static final c f16918e = new c();

                public boolean equals(Object other) {
                    return this == other || (other instanceof c);
                }

                private c() {
                    super(C15040a.f140770b0, null);
                }

                public String toString() {
                    return "CHAT";
                }

                public int hashCode() {
                    return 1007902610;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$a$d;", "LKi/C$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class d extends a {

                /* renamed from: e, reason: collision with root package name */
                public static final d f16919e = new d();

                public boolean equals(Object other) {
                    return this == other || (other instanceof d);
                }

                private d() {
                    super(C15040a.f140845q0, null);
                }

                public String toString() {
                    return "FACE_RECOGNITION";
                }

                public int hashCode() {
                    return -856036881;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$a$e;", "LKi/C$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class e extends a {

                /* renamed from: e, reason: collision with root package name */
                public static final e f16920e = new e();

                public boolean equals(Object other) {
                    return this == other || (other instanceof e);
                }

                private e() {
                    super(C15040a.f140854s0, null);
                }

                public String toString() {
                    return "FEEDBACK";
                }

                public int hashCode() {
                    return -598277441;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$a$f;", "LKi/C$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class f extends a {

                /* renamed from: e, reason: collision with root package name */
                public static final f f16921e = new f();

                /* renamed from: f, reason: collision with root package name */
                public static final int f16922f = 0;

                public boolean equals(Object other) {
                    return this == other || (other instanceof f);
                }

                private f() {
                    super(C15040a.f140697J0, null);
                }

                public String toString() {
                    return "MESSAGES";
                }

                public int hashCode() {
                    return -868870010;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$a$g;", "LKi/C$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class g extends a {

                /* renamed from: e, reason: collision with root package name */
                public static final g f16923e = new g();

                public boolean equals(Object other) {
                    return this == other || (other instanceof g);
                }

                private g() {
                    super(C15040a.f140733S0, null);
                }

                public String toString() {
                    return "PERSONALIZED";
                }

                public int hashCode() {
                    return 1461615114;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$a$h;", "LKi/C$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class h extends a {

                /* renamed from: e, reason: collision with root package name */
                public static final h f16924e = new h();

                public boolean equals(Object other) {
                    return this == other || (other instanceof h);
                }

                private h() {
                    super(C15040a.f140831n1, null);
                }

                public String toString() {
                    return "SHOPPING_CART";
                }

                public int hashCode() {
                    return 150419613;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$a$i;", "LKi/C$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class i extends a {

                /* renamed from: e, reason: collision with root package name */
                public static final i f16925e = new i();

                public boolean equals(Object other) {
                    return this == other || (other instanceof i);
                }

                private i() {
                    super(C15040a.f140841p1, null);
                }

                public String toString() {
                    return "SUBSTITUTION";
                }

                public int hashCode() {
                    return -1749162697;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$a$j;", "LKi/C$b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class j extends a {

                /* renamed from: e, reason: collision with root package name */
                public static final j f16926e = new j();

                public boolean equals(Object other) {
                    return this == other || (other instanceof j);
                }

                private j() {
                    super(C15040a.f140855s1, null);
                }

                public String toString() {
                    return "THUMBPRINT";
                }

                public int hashCode() {
                    return -1770527919;
                }
            }

            public /* synthetic */ a(int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10);
            }

            private a(int i10) {
                super(i10, null);
                this.id = i10;
            }

            @Override // Ki.C.b, Ki.C
            /* renamed from: a, reason: from getter */
            public int getId() {
                return this.id;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\b\n\u000b\f\r\u000e\u000f\u0006\u0010\u0011B\u0013\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\n\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"LKi/C$b$b;", "LKi/C$b;", "", PreferencesHelper.PREF_ID, "<init>", "(I)V", "d", "I", "a", "()I", "b", "j", "e", "g", "f", "h", "c", "i", "LKi/C$b$b$a;", "LKi/C$b$b$b;", "LKi/C$b$b$c;", "LKi/C$b$b$d;", "LKi/C$b$b$e;", "LKi/C$b$b$f;", "LKi/C$b$b$g;", "LKi/C$b$b$h;", "LKi/C$b$b$i;", "LKi/C$b$b$j;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$b$b, reason: collision with other inner class name */
        public static abstract class AbstractC0290b extends b {

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final int id;

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$b$a;", "LKi/C$b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$b$a */
            public static final /* data */ class a extends AbstractC0290b {

                /* renamed from: e, reason: collision with root package name */
                public static final a f16928e = new a();

                /* renamed from: f, reason: collision with root package name */
                public static final int f16929f = 0;

                public boolean equals(Object other) {
                    return this == other || (other instanceof a);
                }

                private a() {
                    super(C15040a.f140728R, null);
                }

                public String toString() {
                    return "APPLE";
                }

                public int hashCode() {
                    return 1049254904;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$b$b;", "LKi/C$b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$b$b, reason: collision with other inner class name */
            public static final /* data */ class C0291b extends AbstractC0290b {

                /* renamed from: e, reason: collision with root package name */
                public static final C0291b f16930e = new C0291b();

                public boolean equals(Object other) {
                    return this == other || (other instanceof C0291b);
                }

                private C0291b() {
                    super(C15040a.f140748W, null);
                }

                public String toString() {
                    return "BEER";
                }

                public int hashCode() {
                    return -1213060174;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$b$c;", "LKi/C$b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$b$c */
            public static final /* data */ class c extends AbstractC0290b {

                /* renamed from: e, reason: collision with root package name */
                public static final c f16931e = new c();

                public boolean equals(Object other) {
                    return this == other || (other instanceof c);
                }

                private c() {
                    super(C15040a.f140866v0, null);
                }

                public String toString() {
                    return "FORKLIFT";
                }

                public int hashCode() {
                    return -1125906097;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$b$d;", "LKi/C$b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$b$d */
            public static final /* data */ class d extends AbstractC0290b {

                /* renamed from: e, reason: collision with root package name */
                public static final d f16932e = new d();

                public boolean equals(Object other) {
                    return this == other || (other instanceof d);
                }

                private d() {
                    super(C15040a.f140878y0, null);
                }

                public String toString() {
                    return "HAND_TRUCK";
                }

                public int hashCode() {
                    return -266860943;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$b$e;", "LKi/C$b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$b$e */
            public static final /* data */ class e extends AbstractC0290b {

                /* renamed from: e, reason: collision with root package name */
                public static final e f16933e = new e();

                public boolean equals(Object other) {
                    return this == other || (other instanceof e);
                }

                private e() {
                    super(C15040a.f140665B0, null);
                }

                public String toString() {
                    return "ICE";
                }

                public int hashCode() {
                    return -39124311;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$b$f;", "LKi/C$b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$b$f */
            public static final /* data */ class f extends AbstractC0290b {

                /* renamed from: e, reason: collision with root package name */
                public static final f f16934e = new f();

                public boolean equals(Object other) {
                    return this == other || (other instanceof f);
                }

                private f() {
                    super(C15040a.f140669C0, null);
                }

                public String toString() {
                    return "KEROSENE";
                }

                public int hashCode() {
                    return -1282992222;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$b$g;", "LKi/C$b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$b$g */
            public static final /* data */ class g extends AbstractC0290b {

                /* renamed from: e, reason: collision with root package name */
                public static final g f16935e = new g();

                public boolean equals(Object other) {
                    return this == other || (other instanceof g);
                }

                private g() {
                    super(C15040a.f140749W0, null);
                }

                public String toString() {
                    return "PIZZA";
                }

                public int hashCode() {
                    return 1062909222;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$b$h;", "LKi/C$b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$b$h */
            public static final /* data */ class h extends AbstractC0290b {

                /* renamed from: e, reason: collision with root package name */
                public static final h f16936e = new h();

                public boolean equals(Object other) {
                    return this == other || (other instanceof h);
                }

                private h() {
                    super(C15040a.f140771b1, null);
                }

                public String toString() {
                    return "PROPANE";
                }

                public int hashCode() {
                    return -499245901;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$b$i;", "LKi/C$b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$b$i */
            public static final /* data */ class i extends AbstractC0290b {

                /* renamed from: e, reason: collision with root package name */
                public static final i f16937e = new i();

                public boolean equals(Object other) {
                    return this == other || (other instanceof i);
                }

                private i() {
                    super(C15040a.f140826m1, null);
                }

                public String toString() {
                    return "SHOPPING_BAG";
                }

                public int hashCode() {
                    return 888117779;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$b$j;", "LKi/C$b$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$b$j */
            public static final /* data */ class j extends AbstractC0290b {

                /* renamed from: e, reason: collision with root package name */
                public static final j f16938e = new j();

                public boolean equals(Object other) {
                    return this == other || (other instanceof j);
                }

                private j() {
                    super(C15040a.f140867v1, null);
                }

                public String toString() {
                    return "TOBACCO";
                }

                public int hashCode() {
                    return -1342536973;
                }
            }

            public /* synthetic */ AbstractC0290b(int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10);
            }

            private AbstractC0290b(int i10) {
                super(i10, null);
                this.id = i10;
            }

            @Override // Ki.C.b, Ki.C
            /* renamed from: a, reason: from getter */
            public int getId() {
                return this.id;
            }
        }

        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\b\u0014\u0006\u0015B\u0013\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u000e\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"LKi/C$b$c;", "LKi/C$b;", "", PreferencesHelper.PREF_ID, "<init>", "(I)V", "d", "I", "a", "()I", "k", "h", "f", "i", "j", "g", "b", "n", "m", "l", "e", "c", "LKi/C$b$c$a;", "LKi/C$b$c$b;", "LKi/C$b$c$c;", "LKi/C$b$c$d;", "LKi/C$b$c$e;", "LKi/C$b$c$f;", "LKi/C$b$c$g;", "LKi/C$b$c$h;", "LKi/C$b$c$i;", "LKi/C$b$c$j;", "LKi/C$b$c$k;", "LKi/C$b$c$l;", "LKi/C$b$c$m;", "LKi/C$b$c$n;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class c extends b {

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final int id;

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$c$a;", "LKi/C$b$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class a extends c {

                /* renamed from: e, reason: collision with root package name */
                public static final a f16940e = new a();

                /* renamed from: f, reason: collision with root package name */
                public static final int f16941f = 0;

                public boolean equals(Object other) {
                    return this == other || (other instanceof a);
                }

                private a() {
                    super(C15040a.f140740U, null);
                }

                public String toString() {
                    return "BAKERY";
                }

                public int hashCode() {
                    return 1897448064;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$c$b;", "LKi/C$b$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$c$b, reason: collision with other inner class name */
            public static final /* data */ class C0292b extends c {

                /* renamed from: e, reason: collision with root package name */
                public static final C0292b f16942e = new C0292b();

                public boolean equals(Object other) {
                    return this == other || (other instanceof C0292b);
                }

                private C0292b() {
                    super(C15040a.f140756Y, null);
                }

                public String toString() {
                    return "CAR_WASH";
                }

                public int hashCode() {
                    return 53843178;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$c$c;", "LKi/C$b$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$c$c, reason: collision with other inner class name */
            public static final /* data */ class C0293c extends c {

                /* renamed from: e, reason: collision with root package name */
                public static final C0293c f16943e = new C0293c();

                public boolean equals(Object other) {
                    return this == other || (other instanceof C0293c);
                }

                private C0293c() {
                    super(C15040a.f140780d0, null);
                }

                public String toString() {
                    return "CORPORATE";
                }

                public int hashCode() {
                    return -137656411;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$c$d;", "LKi/C$b$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class d extends c {

                /* renamed from: e, reason: collision with root package name */
                public static final d f16944e = new d();

                public boolean equals(Object other) {
                    return this == other || (other instanceof d);
                }

                private d() {
                    super(C15040a.f140795g0, null);
                }

                public String toString() {
                    return "CURRENT_LOCATION";
                }

                public int hashCode() {
                    return -386895749;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$c$e;", "LKi/C$b$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class e extends c {

                /* renamed from: e, reason: collision with root package name */
                public static final e f16945e = new e();

                public boolean equals(Object other) {
                    return this == other || (other instanceof e);
                }

                private e() {
                    super(C15040a.f140805i0, null);
                }

                public String toString() {
                    return "DELI";
                }

                public int hashCode() {
                    return 1311533662;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$c$f;", "LKi/C$b$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class f extends c {

                /* renamed from: e, reason: collision with root package name */
                public static final f f16946e = new f();

                public boolean equals(Object other) {
                    return this == other || (other instanceof f);
                }

                private f() {
                    super(C15040a.f140815k0, null);
                }

                public String toString() {
                    return "DIRECTION";
                }

                public int hashCode() {
                    return 156993215;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$c$g;", "LKi/C$b$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class g extends c {

                /* renamed from: e, reason: collision with root package name */
                public static final g f16947e = new g();

                public boolean equals(Object other) {
                    return this == other || (other instanceof g);
                }

                private g() {
                    super(C15040a.f140835o0, null);
                }

                public String toString() {
                    return "EV";
                }

                public int hashCode() {
                    return 1105274193;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$c$h;", "LKi/C$b$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class h extends c {

                /* renamed from: e, reason: collision with root package name */
                public static final h f16948e = new h();

                public boolean equals(Object other) {
                    return this == other || (other instanceof h);
                }

                private h() {
                    super(C15040a.f140858t0, null);
                }

                public String toString() {
                    return "FIND_A_STORE";
                }

                public int hashCode() {
                    return 827330397;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$c$i;", "LKi/C$b$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class i extends c {

                /* renamed from: e, reason: collision with root package name */
                public static final i f16949e = new i();

                public boolean equals(Object other) {
                    return this == other || (other instanceof i);
                }

                private i() {
                    super(C15040a.f140862u0, null);
                }

                public String toString() {
                    return "FOOD";
                }

                public int hashCode() {
                    return 1311602942;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$c$j;", "LKi/C$b$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class j extends c {

                /* renamed from: e, reason: collision with root package name */
                public static final j f16950e = new j();

                public boolean equals(Object other) {
                    return this == other || (other instanceof j);
                }

                private j() {
                    super(C15040a.f140870w0, null);
                }

                public String toString() {
                    return "GAS";
                }

                public int hashCode() {
                    return -96237031;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$c$k;", "LKi/C$b$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class k extends c {

                /* renamed from: e, reason: collision with root package name */
                public static final k f16951e = new k();

                public boolean equals(Object other) {
                    return this == other || (other instanceof k);
                }

                private k() {
                    super(C15040a.f140673D0, null);
                }

                public String toString() {
                    return "LOCATION";
                }

                public int hashCode() {
                    return 1937159253;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$c$l;", "LKi/C$b$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class l extends c {

                /* renamed from: e, reason: collision with root package name */
                public static final l f16952e = new l();

                public boolean equals(Object other) {
                    return this == other || (other instanceof l);
                }

                private l() {
                    super(C15040a.f140677E0, null);
                }

                public String toString() {
                    return "LOTTO";
                }

                public int hashCode() {
                    return 2010532044;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$c$m;", "LKi/C$b$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class m extends c {

                /* renamed from: e, reason: collision with root package name */
                public static final m f16953e = new m();

                public boolean equals(Object other) {
                    return this == other || (other instanceof m);
                }

                private m() {
                    super(C15040a.f140796g1, null);
                }

                public String toString() {
                    return "RESTROOMS";
                }

                public int hashCode() {
                    return -723189020;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$c$n;", "LKi/C$b$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class n extends c {

                /* renamed from: e, reason: collision with root package name */
                public static final n f16954e = new n();

                public boolean equals(Object other) {
                    return this == other || (other instanceof n);
                }

                private n() {
                    super(C15040a.f140694I1, null);
                }

                public String toString() {
                    return "YOUR_STORE";
                }

                public int hashCode() {
                    return -1127655851;
                }
            }

            public /* synthetic */ c(int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10);
            }

            private c(int i10) {
                super(i10, null);
                this.id = i10;
            }

            @Override // Ki.C.b, Ki.C
            /* renamed from: a, reason: from getter */
            public int getId() {
                return this.id;
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0006\n\u000b\f\r\b\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0013\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"LKi/C$b$d;", "LKi/C$b;", "", PreferencesHelper.PREF_ID, "<init>", "(I)V", "d", "I", "a", "()I", "b", "g", "k", "m", "h", "c", "f", "j", "i", "l", "e", "LKi/C$b$d$b;", "LKi/C$b$d$d;", "LKi/C$b$d$e;", "LKi/C$b$d$g;", "LKi/C$b$d$k;", "LKi/C$b$d$l;", "LKi/C$b$d$m;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class d extends b {

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final int id;

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$d$a;", "LKi/C$b$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class a extends e {

                /* renamed from: e, reason: collision with root package name */
                public static final a f16956e = new a();

                public boolean equals(Object other) {
                    return this == other || (other instanceof a);
                }

                private a() {
                    super(C15040a.f140810j0, null);
                }

                public String toString() {
                    return "DEPARTMENT";
                }

                public int hashCode() {
                    return -257350817;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$d$b;", "LKi/C$b$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$d$b, reason: collision with other inner class name */
            public static final /* data */ class C0294b extends d {

                /* renamed from: e, reason: collision with root package name */
                public static final C0294b f16957e = new C0294b();

                public boolean equals(Object other) {
                    return this == other || (other instanceof C0294b);
                }

                private C0294b() {
                    super(C15040a.f140840p0, null);
                }

                public String toString() {
                    return "EXPRESS_PICKUP";
                }

                public int hashCode() {
                    return -1258705960;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$d$c;", "LKi/C$b$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class c extends e {

                /* renamed from: e, reason: collision with root package name */
                public static final c f16958e = new c();

                public boolean equals(Object other) {
                    return this == other || (other instanceof c);
                }

                private c() {
                    super(C15040a.f140681F0, null);
                }

                public String toString() {
                    return "MEIJER_APP";
                }

                public int hashCode() {
                    return 1978329461;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$d$d;", "LKi/C$b$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$d$d, reason: collision with other inner class name */
            public static final /* data */ class C0295d extends d {

                /* renamed from: e, reason: collision with root package name */
                public static final C0295d f16959e = new C0295d();

                public boolean equals(Object other) {
                    return this == other || (other instanceof C0295d);
                }

                private C0295d() {
                    super(C15040a.f140685G0, null);
                }

                public String toString() {
                    return "MEIJER_M";
                }

                public int hashCode() {
                    return -1030342463;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$d$e;", "LKi/C$b$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class e extends d {

                /* renamed from: e, reason: collision with root package name */
                public static final e f16960e = new e();

                public boolean equals(Object other) {
                    return this == other || (other instanceof e);
                }

                private e() {
                    super(C15040a.f140689H0, null);
                }

                public String toString() {
                    return "MEIJER_STYLE";
                }

                public int hashCode() {
                    return -1479146491;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$d$f;", "LKi/C$b$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class f extends e {

                /* renamed from: e, reason: collision with root package name */
                public static final f f16961e = new f();

                public boolean equals(Object other) {
                    return this == other || (other instanceof f);
                }

                private f() {
                    super(C15040a.f140693I0, null);
                }

                public String toString() {
                    return "MEIJER_WEBSITE";
                }

                public int hashCode() {
                    return -1021018641;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$d$g;", "LKi/C$b$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class g extends d {

                /* renamed from: e, reason: collision with root package name */
                public static final g f16962e = new g();

                public boolean equals(Object other) {
                    return this == other || (other instanceof g);
                }

                private g() {
                    super(C15040a.f140701K0, null);
                }

                public String toString() {
                    return "MFUEL";
                }

                public int hashCode() {
                    return 2006852438;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$d$h;", "LKi/C$b$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class h extends e {

                /* renamed from: e, reason: collision with root package name */
                public static final h f16963e = new h();

                /* renamed from: f, reason: collision with root package name */
                public static final int f16964f = 0;

                public boolean equals(Object other) {
                    return this == other || (other instanceof h);
                }

                private h() {
                    super(C15040a.f140705L0, null);
                }

                public String toString() {
                    return "MPERKS";
                }

                public int hashCode() {
                    return 2091654533;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$d$i;", "LKi/C$b$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class i extends h {

                /* renamed from: e, reason: collision with root package name */
                public static final i f16965e = new i();

                public boolean equals(Object other) {
                    return this == other || (other instanceof i);
                }

                private i() {
                    super(C15040a.f140781d1, null);
                }

                public String toString() {
                    return "RECIPES";
                }

                public int hashCode() {
                    return 242300824;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$d$j;", "LKi/C$b$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class j extends e {

                /* renamed from: e, reason: collision with root package name */
                public static final j f16966e = new j();

                public boolean equals(Object other) {
                    return this == other || (other instanceof j);
                }

                private j() {
                    super(C15040a.f140811j1, null);
                }

                public String toString() {
                    return "SERVICES";
                }

                public int hashCode() {
                    return 1105433515;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$d$k;", "LKi/C$b$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class k extends d {

                /* renamed from: e, reason: collision with root package name */
                public static final k f16967e = new k();

                public boolean equals(Object other) {
                    return this == other || (other instanceof k);
                }

                private k() {
                    super(C15040a.f140821l1, null);
                }

                public String toString() {
                    return "SHOP_AND_SCAN";
                }

                public int hashCode() {
                    return -992265215;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$d$l;", "LKi/C$b$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class l extends d {

                /* renamed from: e, reason: collision with root package name */
                public static final l f16968e = new l();

                public boolean equals(Object other) {
                    return this == other || (other instanceof l);
                }

                private l() {
                    super(C15040a.f140851r1, null);
                }

                public String toString() {
                    return "TEACHER_LISTS";
                }

                public int hashCode() {
                    return 1577533835;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$d$m;", "LKi/C$b$d;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class m extends d {

                /* renamed from: e, reason: collision with root package name */
                public static final m f16969e = new m();

                public boolean equals(Object other) {
                    return this == other || (other instanceof m);
                }

                private m() {
                    super(C15040a.f140686G1, null);
                }

                public String toString() {
                    return "WEEKLY_AD";
                }

                public int hashCode() {
                    return -1990266124;
                }
            }

            public /* synthetic */ d(int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10);
            }

            private d(int i10) {
                super(i10, null);
                this.id = i10;
            }

            @Override // Ki.C.b, Ki.C
            /* renamed from: a, reason: from getter */
            public int getId() {
                return this.id;
            }
        }

        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\n\b\u000b\f\u0006\r\u000e\u000f\u0010\u0011B\u0013\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0010\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"LKi/C$b$e;", "LKi/C$b;", "", PreferencesHelper.PREF_ID, "<init>", "(I)V", "d", "I", "a", "()I", "i", "b", "c", "f", "j", "g", "e", "h", "LKi/C$b$d$a;", "LKi/C$b$d$c;", "LKi/C$b$d$f;", "LKi/C$b$d$h;", "LKi/C$b$d$j;", "LKi/C$b$e$a;", "LKi/C$b$e$b;", "LKi/C$b$e$c;", "LKi/C$b$e$d;", "LKi/C$b$e$e;", "LKi/C$b$e$f;", "LKi/C$b$e$g;", "LKi/C$b$e$h;", "LKi/C$b$e$i;", "LKi/C$b$e$j;", "LKi/C$b$h$q;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class e extends b {

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final int id;

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$e$a;", "LKi/C$b$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class a extends e {

                /* renamed from: e, reason: collision with root package name */
                public static final a f16971e = new a();

                public boolean equals(Object other) {
                    return this == other || (other instanceof a);
                }

                private a() {
                    super(C15040a.f140732S, null);
                }

                public String toString() {
                    return "ATM";
                }

                public int hashCode() {
                    return -33006847;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$e$b;", "LKi/C$b$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$e$b, reason: collision with other inner class name */
            public static final /* data */ class C0296b extends e {

                /* renamed from: e, reason: collision with root package name */
                public static final C0296b f16972e = new C0296b();

                public boolean equals(Object other) {
                    return this == other || (other instanceof C0296b);
                }

                private C0296b() {
                    super(C15040a.f140765a0, null);
                }

                public String toString() {
                    return "CASH";
                }

                public int hashCode() {
                    return -1023170676;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$e$c;", "LKi/C$b$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class c extends e {

                /* renamed from: e, reason: collision with root package name */
                public static final c f16973e = new c();

                /* renamed from: f, reason: collision with root package name */
                public static final int f16974f = 0;

                public boolean equals(Object other) {
                    return this == other || (other instanceof c);
                }

                private c() {
                    super(C15040a.f140790f0, null);
                }

                public String toString() {
                    return "CREDIT_CARD";
                }

                public int hashCode() {
                    return 1056761373;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$e$d;", "LKi/C$b$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class d extends e {

                /* renamed from: e, reason: collision with root package name */
                public static final d f16975e = new d();

                /* renamed from: f, reason: collision with root package name */
                public static final int f16976f = 0;

                public boolean equals(Object other) {
                    return this == other || (other instanceof d);
                }

                private d() {
                    super(C15040a.f140800h0, null);
                }

                public String toString() {
                    return "DEBUG";
                }

                public int hashCode() {
                    return -1652493062;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$e$e;", "LKi/C$b$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$e$e, reason: collision with other inner class name */
            public static final /* data */ class C0297e extends e {

                /* renamed from: e, reason: collision with root package name */
                public static final C0297e f16977e = new C0297e();

                public boolean equals(Object other) {
                    return this == other || (other instanceof C0297e);
                }

                private C0297e() {
                    super(C15040a.f140820l0, null);
                }

                public String toString() {
                    return "DOORDASH";
                }

                public int hashCode() {
                    return 148823065;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$e$f;", "LKi/C$b$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class f extends e {

                /* renamed from: e, reason: collision with root package name */
                public static final f f16978e = new f();

                public boolean equals(Object other) {
                    return this == other || (other instanceof f);
                }

                private f() {
                    super(C15040a.f140825m0, null);
                }

                public String toString() {
                    return "EBT_CARD";
                }

                public int hashCode() {
                    return -900858159;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$e$g;", "LKi/C$b$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class g extends e {

                /* renamed from: e, reason: collision with root package name */
                public static final g f16979e = new g();

                public boolean equals(Object other) {
                    return this == other || (other instanceof g);
                }

                private g() {
                    super(C15040a.f140816k1, null);
                }

                public String toString() {
                    return "SHIPT";
                }

                public int hashCode() {
                    return -1638544289;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$e$h;", "LKi/C$b$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class h extends e {

                /* renamed from: e, reason: collision with root package name */
                public static final h f16980e = new h();

                public boolean equals(Object other) {
                    return this == other || (other instanceof h);
                }

                private h() {
                    super(C15040a.f140846q1, null);
                }

                public String toString() {
                    return "TARGETED";
                }

                public int hashCode() {
                    return -1495355959;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$e$i;", "LKi/C$b$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class i extends e {

                /* renamed from: e, reason: collision with root package name */
                public static final i f16981e = new i();

                public boolean equals(Object other) {
                    return this == other || (other instanceof i);
                }

                private i() {
                    super(C15040a.f140716O, null);
                }

                public String toString() {
                    return "TWENTY_FOUR_HOURS";
                }

                public int hashCode() {
                    return -1606488597;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$e$j;", "LKi/C$b$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class j extends e {

                /* renamed from: e, reason: collision with root package name */
                public static final j f16982e = new j();

                public boolean equals(Object other) {
                    return this == other || (other instanceof j);
                }

                private j() {
                    super(C15040a.f140690H1, null);
                }

                public String toString() {
                    return "WEX";
                }

                public int hashCode() {
                    return -32986159;
                }
            }

            public /* synthetic */ e(int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10);
            }

            private e(int i10) {
                super(i10, null);
                this.id = i10;
            }

            @Override // Ki.C.b, Ki.C
            /* renamed from: a, reason: from getter */
            public int getId() {
                return this.id;
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\n\u000b\b\f\r\u0006\u000e\u000f\u0010\u0011B\u0013\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\n\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"LKi/C$b$f;", "LKi/C$b;", "", PreferencesHelper.PREF_ID, "<init>", "(I)V", "d", "I", "a", "()I", "f", "g", "e", "i", "j", "h", "b", "c", "LKi/C$b$f$a;", "LKi/C$b$f$b;", "LKi/C$b$f$c;", "LKi/C$b$f$d;", "LKi/C$b$f$e;", "LKi/C$b$f$f;", "LKi/C$b$f$g;", "LKi/C$b$f$h;", "LKi/C$b$f$i;", "LKi/C$b$f$j;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class f extends b {

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final int id;

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$f$a;", "LKi/C$b$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class a extends f {

                /* renamed from: e, reason: collision with root package name */
                public static final a f16984e = new a();

                /* renamed from: f, reason: collision with root package name */
                public static final int f16985f = 0;

                public boolean equals(Object other) {
                    return this == other || (other instanceof a);
                }

                private a() {
                    super(C15040a.f140850r0, null);
                }

                public String toString() {
                    return "FAMILY_CARE";
                }

                public int hashCode() {
                    return -931657110;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$f$b;", "LKi/C$b$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$f$b, reason: collision with other inner class name */
            public static final /* data */ class C0298b extends f {

                /* renamed from: e, reason: collision with root package name */
                public static final C0298b f16986e = new C0298b();

                public boolean equals(Object other) {
                    return this == other || (other instanceof C0298b);
                }

                private C0298b() {
                    super(C15040a.f140882z0, null);
                }

                public String toString() {
                    return "HEALING";
                }

                public int hashCode() {
                    return 678181688;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$f$c;", "LKi/C$b$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class c extends f {

                /* renamed from: e, reason: collision with root package name */
                public static final c f16987e = new c();

                public boolean equals(Object other) {
                    return this == other || (other instanceof c);
                }

                private c() {
                    super(C15040a.f140661A0, null);
                }

                public String toString() {
                    return "HEARING_AIDS";
                }

                public int hashCode() {
                    return -947650204;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$f$d;", "LKi/C$b$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class d extends f {

                /* renamed from: e, reason: collision with root package name */
                public static final d f16988e = new d();

                public boolean equals(Object other) {
                    return this == other || (other instanceof d);
                }

                private d() {
                    super(C15040a.f140713N0, null);
                }

                public String toString() {
                    return "OPTICAL";
                }

                public int hashCode() {
                    return -1366855114;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$f$e;", "LKi/C$b$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class e extends f {

                /* renamed from: e, reason: collision with root package name */
                public static final e f16989e = new e();

                public boolean equals(Object other) {
                    return this == other || (other instanceof e);
                }

                private e() {
                    super(C15040a.f140745V0, null);
                }

                public String toString() {
                    return "PILL";
                }

                public int hashCode() {
                    return 747354011;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$f$f;", "LKi/C$b$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$f$f, reason: collision with other inner class name */
            public static final /* data */ class C0299f extends f {

                /* renamed from: e, reason: collision with root package name */
                public static final C0299f f16990e = new C0299f();

                public boolean equals(Object other) {
                    return this == other || (other instanceof C0299f);
                }

                private C0299f() {
                    super(C15040a.f140757Y0, null);
                }

                public String toString() {
                    return "PRESCRIBERS";
                }

                public int hashCode() {
                    return 1437558188;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$f$g;", "LKi/C$b$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class g extends f {

                /* renamed from: e, reason: collision with root package name */
                public static final g f16991e = new g();

                public boolean equals(Object other) {
                    return this == other || (other instanceof g);
                }

                private g() {
                    super(C15040a.f140761Z0, null);
                }

                public String toString() {
                    return "PRESCRIPTIONS";
                }

                public int hashCode() {
                    return -1071659177;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$f$h;", "LKi/C$b$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class h extends f {

                /* renamed from: e, reason: collision with root package name */
                public static final h f16992e = new h();

                public boolean equals(Object other) {
                    return this == other || (other instanceof h);
                }

                private h() {
                    super(C15040a.f140786e1, null);
                }

                public String toString() {
                    return "REFILL_BY_SCAN";
                }

                public int hashCode() {
                    return 1361899582;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$f$i;", "LKi/C$b$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class i extends f {

                /* renamed from: e, reason: collision with root package name */
                public static final i f16993e = new i();

                public boolean equals(Object other) {
                    return this == other || (other instanceof i);
                }

                private i() {
                    super(C15040a.f140871w1, null);
                }

                public String toString() {
                    return "TRANSFER_PRESCRIPTIONS";
                }

                public int hashCode() {
                    return 9823239;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$f$j;", "LKi/C$b$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class j extends f {

                /* renamed from: e, reason: collision with root package name */
                public static final j f16994e = new j();

                public boolean equals(Object other) {
                    return this == other || (other instanceof j);
                }

                private j() {
                    super(C15040a.f140875x1, null);
                }

                public String toString() {
                    return "UPDATE_INSURANCE";
                }

                public int hashCode() {
                    return 1324479014;
                }
            }

            public /* synthetic */ f(int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10);
            }

            private f(int i10) {
                super(i10, null);
                this.id = i10;
            }

            @Override // Ki.C.b, Ki.C
            /* renamed from: a, reason: from getter */
            public int getId() {
                return this.id;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0006\b\n\u000b\f\rB\u0013\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"LKi/C$b$g;", "LKi/C$b;", "", PreferencesHelper.PREF_ID, "<init>", "(I)V", "d", "I", "a", "()I", "b", "f", "e", "c", "LKi/C$b$g$a;", "LKi/C$b$g$b;", "LKi/C$b$g$c;", "LKi/C$b$g$d;", "LKi/C$b$g$e;", "LKi/C$b$g$f;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class g extends b {

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final int id;

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$g$a;", "LKi/C$b$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class a extends g {

                /* renamed from: e, reason: collision with root package name */
                public static final a f16996e = new a();

                public boolean equals(Object other) {
                    return this == other || (other instanceof a);
                }

                private a() {
                    super(C15040a.f140785e0, null);
                }

                public String toString() {
                    return "COUPONS";
                }

                public int hashCode() {
                    return 869885959;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$g$b;", "LKi/C$b$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$g$b, reason: collision with other inner class name */
            public static final /* data */ class C0300b extends g {

                /* renamed from: e, reason: collision with root package name */
                public static final C0300b f16997e = new C0300b();

                public boolean equals(Object other) {
                    return this == other || (other instanceof C0300b);
                }

                private C0300b() {
                    super(C15040a.f140874x0, null);
                }

                public String toString() {
                    return "GIFT_CARD";
                }

                public int hashCode() {
                    return 1931237721;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$g$c;", "LKi/C$b$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class c extends g {

                /* renamed from: e, reason: collision with root package name */
                public static final c f16998e = new c();

                public boolean equals(Object other) {
                    return this == other || (other instanceof c);
                }

                private c() {
                    super(C15040a.f140709M0, null);
                }

                public String toString() {
                    return "OFFER";
                }

                public int hashCode() {
                    return 610586582;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$g$d;", "LKi/C$b$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class d extends g {

                /* renamed from: e, reason: collision with root package name */
                public static final d f16999e = new d();

                /* renamed from: f, reason: collision with root package name */
                public static final int f17000f = 0;

                public boolean equals(Object other) {
                    return this == other || (other instanceof d);
                }

                private d() {
                    super(C15040a.f140801h1, null);
                }

                public String toString() {
                    return "REWARDS";
                }

                public int hashCode() {
                    return 1012650526;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$g$e;", "LKi/C$b$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class e extends g {

                /* renamed from: e, reason: collision with root package name */
                public static final e f17001e = new e();

                public boolean equals(Object other) {
                    return this == other || (other instanceof e);
                }

                private e() {
                    super(C15040a.f140806i1, null);
                }

                public String toString() {
                    return "SAVINGS";
                }

                public int hashCode() {
                    return 1784948659;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$g$f;", "LKi/C$b$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class f extends g {

                /* renamed from: e, reason: collision with root package name */
                public static final f f17002e = new f();

                /* renamed from: f, reason: collision with root package name */
                public static final int f17003f = 0;

                public boolean equals(Object other) {
                    return this == other || (other instanceof f);
                }

                private f() {
                    super(C15040a.f140836o1, null);
                }

                public String toString() {
                    return "SPECIAL_OFFER";
                }

                public int hashCode() {
                    return -711709008;
                }
            }

            public /* synthetic */ g(int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10);
            }

            private g(int i10) {
                super(i10, null);
                this.id = i10;
            }

            @Override // Ki.C.b, Ki.C
            /* renamed from: a, reason: from getter */
            public int getId() {
                return this.id;
            }
        }

        @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0012\n\u000b\f\r\u000e\u000f\u0010\u0011\u0006\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\bB\u0013\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0012\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"LKi/C$b$h;", "LKi/C$b;", "", PreferencesHelper.PREF_ID, "<init>", "(I)V", "d", "I", "a", "()I", "k", "l", "e", "c", "n", "p", "f", "g", "o", "j", "i", "m", "b", "q", "r", "h", "LKi/C$b$d$i;", "LKi/C$b$h$a;", "LKi/C$b$h$b;", "LKi/C$b$h$c;", "LKi/C$b$h$d;", "LKi/C$b$h$e;", "LKi/C$b$h$f;", "LKi/C$b$h$g;", "LKi/C$b$h$h;", "LKi/C$b$h$i;", "LKi/C$b$h$j;", "LKi/C$b$h$k;", "LKi/C$b$h$l;", "LKi/C$b$h$m;", "LKi/C$b$h$n;", "LKi/C$b$h$o;", "LKi/C$b$h$p;", "LKi/C$b$h$r;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class h extends b {

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final int id;

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$h$a;", "LKi/C$b$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class a extends h {

                /* renamed from: e, reason: collision with root package name */
                public static final a f17005e = new a();

                public boolean equals(Object other) {
                    return this == other || (other instanceof a);
                }

                private a() {
                    super(C15040a.f140736T, null);
                }

                public String toString() {
                    return "ATTACHMENT";
                }

                public int hashCode() {
                    return -2116939857;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$h$b;", "LKi/C$b$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$h$b, reason: collision with other inner class name */
            public static final /* data */ class C0301b extends h {

                /* renamed from: e, reason: collision with root package name */
                public static final C0301b f17006e = new C0301b();

                /* renamed from: f, reason: collision with root package name */
                public static final int f17007f = 0;

                public boolean equals(Object other) {
                    return this == other || (other instanceof C0301b);
                }

                private C0301b() {
                    super(C15040a.f140744V, null);
                }

                public String toString() {
                    return "BARCODE";
                }

                public int hashCode() {
                    return 531862868;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$h$c;", "LKi/C$b$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class c extends h {

                /* renamed from: e, reason: collision with root package name */
                public static final c f17008e = new c();

                /* renamed from: f, reason: collision with root package name */
                public static final int f17009f = 0;

                public boolean equals(Object other) {
                    return this == other || (other instanceof c);
                }

                private c() {
                    super(C15040a.f140752X, null);
                }

                public String toString() {
                    return "CALENDAR";
                }

                public int hashCode() {
                    return 880732362;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$h$d;", "LKi/C$b$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class d extends h {

                /* renamed from: e, reason: collision with root package name */
                public static final d f17010e = new d();

                public boolean equals(Object other) {
                    return this == other || (other instanceof d);
                }

                private d() {
                    super(C15040a.f140760Z, null);
                }

                public String toString() {
                    return "CASE";
                }

                public int hashCode() {
                    return 653137596;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$h$e;", "LKi/C$b$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class e extends h {

                /* renamed from: e, reason: collision with root package name */
                public static final e f17011e = new e();

                public boolean equals(Object other) {
                    return this == other || (other instanceof e);
                }

                private e() {
                    super(C15040a.f140775c0, null);
                }

                public String toString() {
                    return "CLOCK";
                }

                public int hashCode() {
                    return -1227247134;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$h$f;", "LKi/C$b$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class f extends h {

                /* renamed from: e, reason: collision with root package name */
                public static final f f17012e = new f();

                public boolean equals(Object other) {
                    return this == other || (other instanceof f);
                }

                private f() {
                    super(C15040a.f140830n0, null);
                }

                public String toString() {
                    return "ECO";
                }

                public int hashCode() {
                    return 575260261;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$h$g;", "LKi/C$b$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class g extends h {

                /* renamed from: e, reason: collision with root package name */
                public static final g f17013e = new g();

                /* renamed from: f, reason: collision with root package name */
                public static final int f17014f = 0;

                public boolean equals(Object other) {
                    return this == other || (other instanceof g);
                }

                private g() {
                    super(C15040a.f140717O0, null);
                }

                public String toString() {
                    return "ORDERS";
                }

                public int hashCode() {
                    return 958809969;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$h$h;", "LKi/C$b$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$h$h, reason: collision with other inner class name */
            public static final /* data */ class C0302h extends h {

                /* renamed from: e, reason: collision with root package name */
                public static final C0302h f17015e = new C0302h();

                public boolean equals(Object other) {
                    return this == other || (other instanceof C0302h);
                }

                private C0302h() {
                    super(C15040a.f140721P0, null);
                }

                public String toString() {
                    return "ORGANIC";
                }

                public int hashCode() {
                    return -339014721;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$h$i;", "LKi/C$b$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class i extends h {

                /* renamed from: e, reason: collision with root package name */
                public static final i f17016e = new i();

                public boolean equals(Object other) {
                    return this == other || (other instanceof i);
                }

                private i() {
                    super(C15040a.f140725Q0, null);
                }

                public String toString() {
                    return "PAST_PURCHASE";
                }

                public int hashCode() {
                    return -2090674046;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$h$j;", "LKi/C$b$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class j extends h {

                /* renamed from: e, reason: collision with root package name */
                public static final j f17017e = new j();

                public boolean equals(Object other) {
                    return this == other || (other instanceof j);
                }

                private j() {
                    super(C15040a.f140729R0, null);
                }

                public String toString() {
                    return "PDF";
                }

                public int hashCode() {
                    return 575270854;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$h$k;", "LKi/C$b$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class k extends h {

                /* renamed from: e, reason: collision with root package name */
                public static final k f17018e = new k();

                /* renamed from: f, reason: collision with root package name */
                public static final int f17019f = 0;

                public boolean equals(Object other) {
                    return this == other || (other instanceof k);
                }

                private k() {
                    super(C15040a.f140737T0, null);
                }

                public String toString() {
                    return "PHONE";
                }

                public int hashCode() {
                    return -1215360190;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$h$l;", "LKi/C$b$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class l extends h {

                /* renamed from: e, reason: collision with root package name */
                public static final l f17020e = new l();

                /* renamed from: f, reason: collision with root package name */
                public static final int f17021f = 0;

                public boolean equals(Object other) {
                    return this == other || (other instanceof l);
                }

                private l() {
                    super(C15040a.f140741U0, null);
                }

                public String toString() {
                    return "PHOTO";
                }

                public int hashCode() {
                    return -1215359994;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$h$m;", "LKi/C$b$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class m extends h {

                /* renamed from: e, reason: collision with root package name */
                public static final m f17022e = new m();

                public boolean equals(Object other) {
                    return this == other || (other instanceof m);
                }

                private m() {
                    super(C15040a.f140753X0, null);
                }

                public String toString() {
                    return "PLU";
                }

                public int hashCode() {
                    return 575271117;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$h$n;", "LKi/C$b$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class n extends h {

                /* renamed from: e, reason: collision with root package name */
                public static final n f17023e = new n();

                public boolean equals(Object other) {
                    return this == other || (other instanceof n);
                }

                private n() {
                    super(C15040a.f140766a1, null);
                }

                public String toString() {
                    return "PRINT";
                }

                public int hashCode() {
                    return -1215068031;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$h$o;", "LKi/C$b$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class o extends h {

                /* renamed from: e, reason: collision with root package name */
                public static final o f17024e = new o();

                public boolean equals(Object other) {
                    return this == other || (other instanceof o);
                }

                private o() {
                    super(C15040a.f140776c1, null);
                }

                public String toString() {
                    return "RECEIPT";
                }

                public int hashCode() {
                    return 1947737868;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$h$p;", "LKi/C$b$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class p extends h {

                /* renamed from: e, reason: collision with root package name */
                public static final p f17025e = new p();

                /* renamed from: f, reason: collision with root package name */
                public static final int f17026f = 0;

                public boolean equals(Object other) {
                    return this == other || (other instanceof p);
                }

                private p() {
                    super(C15040a.f140791f1, null);
                }

                public String toString() {
                    return "REMINDER";
                }

                public int hashCode() {
                    return 540454398;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$h$q;", "LKi/C$b$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class q extends e {

                /* renamed from: e, reason: collision with root package name */
                public static final q f17027e = new q();

                public boolean equals(Object other) {
                    return this == other || (other instanceof q);
                }

                private q() {
                    super(C15040a.f140859t1, null);
                }

                public String toString() {
                    return "TIPS";
                }

                public int hashCode() {
                    return 653651652;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$h$r;", "LKi/C$b$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class r extends h {

                /* renamed from: e, reason: collision with root package name */
                public static final r f17028e = new r();

                public boolean equals(Object other) {
                    return this == other || (other instanceof r);
                }

                private r() {
                    super(C15040a.f140863u1, null);
                }

                public String toString() {
                    return "TIPS_RATINGS";
                }

                public int hashCode() {
                    return 2005442523;
                }
            }

            public /* synthetic */ h(int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10);
            }

            private h(int i10) {
                super(i10, null);
                this.id = i10;
            }

            @Override // Ki.C.b, Ki.C
            /* renamed from: a, reason: from getter */
            public int getId() {
                return this.id;
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\n\u0006\u000b\f\r\u000e\u000f\bB\u0013\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\b\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"LKi/C$b$i;", "LKi/C$b;", "", PreferencesHelper.PREF_ID, "<init>", "(I)V", "d", "I", "a", "()I", "e", "c", "b", "f", "h", "g", "LKi/C$b$i$a;", "LKi/C$b$i$b;", "LKi/C$b$i$c;", "LKi/C$b$i$d;", "LKi/C$b$i$e;", "LKi/C$b$i$f;", "LKi/C$b$i$g;", "LKi/C$b$i$h;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class i extends b {

            /* renamed from: d, reason: collision with root package name and from kotlin metadata */
            private final int id;

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$i$a;", "LKi/C$b$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class a extends i {

                /* renamed from: e, reason: collision with root package name */
                public static final a f17030e = new a();

                public boolean equals(Object other) {
                    return this == other || (other instanceof a);
                }

                private a() {
                    super(C15040a.f140879y1, null);
                }

                public String toString() {
                    return "COUPE";
                }

                public int hashCode() {
                    return -1087498781;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$i$b;", "LKi/C$b$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ki.C$b$i$b, reason: collision with other inner class name */
            public static final /* data */ class C0303b extends i {

                /* renamed from: e, reason: collision with root package name */
                public static final C0303b f17031e = new C0303b();

                public boolean equals(Object other) {
                    return this == other || (other instanceof C0303b);
                }

                private C0303b() {
                    super(C15040a.f140883z1, null);
                }

                public String toString() {
                    return "CROSSOVER";
                }

                public int hashCode() {
                    return -1394501831;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$i$c;", "LKi/C$b$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class c extends i {

                /* renamed from: e, reason: collision with root package name */
                public static final c f17032e = new c();

                public boolean equals(Object other) {
                    return this == other || (other instanceof c);
                }

                private c() {
                    super(C15040a.f140662A1, null);
                }

                public String toString() {
                    return "MINIVAN";
                }

                public int hashCode() {
                    return -1302603055;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$i$d;", "LKi/C$b$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class d extends i {

                /* renamed from: e, reason: collision with root package name */
                public static final d f17033e = new d();

                public boolean equals(Object other) {
                    return this == other || (other instanceof d);
                }

                private d() {
                    super(C15040a.f140666B1, null);
                }

                public String toString() {
                    return "MOTORCYCLE";
                }

                public int hashCode() {
                    return -288177172;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$i$e;", "LKi/C$b$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class e extends i {

                /* renamed from: e, reason: collision with root package name */
                public static final e f17034e = new e();

                public boolean equals(Object other) {
                    return this == other || (other instanceof e);
                }

                private e() {
                    super(C15040a.f140670C1, null);
                }

                public String toString() {
                    return "OTHER";
                }

                public int hashCode() {
                    return -1076280395;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$i$f;", "LKi/C$b$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class f extends i {

                /* renamed from: e, reason: collision with root package name */
                public static final f f17035e = new f();

                public boolean equals(Object other) {
                    return this == other || (other instanceof f);
                }

                private f() {
                    super(C15040a.f140674D1, null);
                }

                public String toString() {
                    return "SEDAN";
                }

                public int hashCode() {
                    return -1073037148;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$i$g;", "LKi/C$b$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class g extends i {

                /* renamed from: e, reason: collision with root package name */
                public static final g f17036e = new g();

                public boolean equals(Object other) {
                    return this == other || (other instanceof g);
                }

                private g() {
                    super(C15040a.f140678E1, null);
                }

                public String toString() {
                    return "SUV";
                }

                public int hashCode() {
                    return 763128889;
                }
            }

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$b$i$h;", "LKi/C$b$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class h extends i {

                /* renamed from: e, reason: collision with root package name */
                public static final h f17037e = new h();

                public boolean equals(Object other) {
                    return this == other || (other instanceof h);
                }

                private h() {
                    super(C15040a.f140682F1, null);
                }

                public String toString() {
                    return "TRUCK";
                }

                public int hashCode() {
                    return -1071709948;
                }
            }

            public /* synthetic */ i(int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(i10);
            }

            private i(int i10) {
                super(i10, null);
                this.id = i10;
            }

            @Override // Ki.C.b, Ki.C
            /* renamed from: a, reason: from getter */
            public int getId() {
                return this.id;
            }
        }

        public /* synthetic */ b(int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10);
        }

        private b(int i10) {
            super(i10, null);
            this.id = i10;
        }

        @Override // Ki.C
        /* renamed from: a, reason: from getter */
        public int getId() {
            return this.id;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"LKi/C$c;", "LKi/C;", "", PreferencesHelper.PREF_ID, "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "I", "a", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ki.C$c, reason: from toString */
    public static final /* data */ class Custom extends C {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int id;

        public Custom(int i10) {
            super(i10, null);
            this.id = i10;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Custom) && this.id == ((Custom) other).id;
        }

        @Override // Ki.C
        /* renamed from: a, reason: from getter */
        public int getId() {
            return this.id;
        }

        public int hashCode() {
            return Integer.hashCode(this.id);
        }

        public String toString() {
            return "Custom(id=" + this.id + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$d;", "LKi/C;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class d extends C {

        /* renamed from: c, reason: collision with root package name */
        public static final d f17039c = new d();

        private d() {
            super(0, null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public String toString() {
            return "EMPTY";
        }

        public int hashCode() {
            return -1591934958;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\b\n\u000b\u0006\fB\u0013\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"LKi/C$e;", "LKi/C;", "", PreferencesHelper.PREF_ID, "<init>", "(I)V", "c", "I", "a", "()I", "b", "e", "d", "LKi/C$e$a;", "LKi/C$e$b;", "LKi/C$e$c;", "LKi/C$e$d;", "LKi/C$e$e;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class e extends C {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int id;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$e$a;", "LKi/C$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends e {

            /* renamed from: d, reason: collision with root package name */
            public static final a f17041d = new a();

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            private a() {
                super(C15040a.f140702K1, null);
            }

            public String toString() {
                return "DELIVERY";
            }

            public int hashCode() {
                return -928950628;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$e$b;", "LKi/C$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends e {

            /* renamed from: d, reason: collision with root package name */
            public static final b f17042d = new b();

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            private b() {
                super(C15040a.f140706L1, null);
            }

            public String toString() {
                return "PICKUP";
            }

            public int hashCode() {
                return -999238876;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$e$c;", "LKi/C$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends e {

            /* renamed from: d, reason: collision with root package name */
            public static final c f17043d = new c();

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            private c() {
                super(C15040a.f140710M1, null);
            }

            public String toString() {
                return "PICKUP_MESSAGE";
            }

            public int hashCode() {
                return -2049728052;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$e$d;", "LKi/C$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends e {

            /* renamed from: d, reason: collision with root package name */
            public static final d f17044d = new d();

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            private d() {
                super(C15040a.f140714N1, null);
            }

            public String toString() {
                return "PICKUP_PARKING";
            }

            public int hashCode() {
                return 497112445;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$e$e;", "LKi/C$e;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$e$e, reason: collision with other inner class name */
        public static final /* data */ class C0304e extends e {

            /* renamed from: d, reason: collision with root package name */
            public static final C0304e f17045d = new C0304e();

            public boolean equals(Object other) {
                return this == other || (other instanceof C0304e);
            }

            private C0304e() {
                super(C15040a.f140718O1, null);
            }

            public String toString() {
                return "STORE";
            }

            public int hashCode() {
                return -1414596839;
            }
        }

        public /* synthetic */ e(int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10);
        }

        private e(int i10) {
            super(i10, null);
            this.id = i10;
        }

        @Override // Ki.C
        /* renamed from: a, reason: from getter */
        public int getId() {
            return this.id;
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0010\b\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0006\u0015\u0016\u0017B\u0013\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0010\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"LKi/C$f;", "LKi/C;", "", PreferencesHelper.PREF_ID, "<init>", "(I)V", "c", "I", "a", "()I", "d", "i", "k", "f", "g", "m", "o", "b", "e", "j", "l", "h", "n", "p", "LKi/C$f$a;", "LKi/C$f$b;", "LKi/C$f$c;", "LKi/C$f$d;", "LKi/C$f$e;", "LKi/C$f$f;", "LKi/C$f$g;", "LKi/C$f$h;", "LKi/C$f$i;", "LKi/C$f$j;", "LKi/C$f$k;", "LKi/C$f$l;", "LKi/C$f$m;", "LKi/C$f$n;", "LKi/C$f$o;", "LKi/C$f$p;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class f extends C {

        /* renamed from: d, reason: collision with root package name */
        public static final int f17046d = 0;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int id;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$f$a;", "LKi/C$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends f {

            /* renamed from: e, reason: collision with root package name */
            public static final a f17048e = new a();

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            private a() {
                super(C15040a.f140722P1, null);
            }

            public String toString() {
                return "ARROW_DOWN_LG";
            }

            public int hashCode() {
                return 1557522083;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$f$b;", "LKi/C$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends f {

            /* renamed from: e, reason: collision with root package name */
            public static final b f17049e = new b();

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            private b() {
                super(C15040a.f140726Q1, null);
            }

            public String toString() {
                return "ARROW_DOWN_SM";
            }

            public int hashCode() {
                return 1557522306;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$f$c;", "LKi/C$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends f {

            /* renamed from: e, reason: collision with root package name */
            public static final c f17050e = new c();

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            private c() {
                super(C15040a.f140730R1, null);
            }

            public String toString() {
                return "ARROW_LEFT_FILLED_SM";
            }

            public int hashCode() {
                return 884572500;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$f$d;", "LKi/C$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends f {

            /* renamed from: e, reason: collision with root package name */
            public static final d f17051e = new d();

            /* renamed from: f, reason: collision with root package name */
            public static final int f17052f = 0;

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            private d() {
                super(C15040a.f140734S1, null);
            }

            public String toString() {
                return "ARROW_LEFT_LG";
            }

            public int hashCode() {
                return -234195682;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$f$e;", "LKi/C$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends f {

            /* renamed from: e, reason: collision with root package name */
            public static final e f17053e = new e();

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            private e() {
                super(C15040a.f140738T1, null);
            }

            public String toString() {
                return "ARROW_LEFT_SM";
            }

            public int hashCode() {
                return -234195459;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$f$f;", "LKi/C$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$f$f, reason: collision with other inner class name */
        public static final /* data */ class C0305f extends f {

            /* renamed from: e, reason: collision with root package name */
            public static final C0305f f17054e = new C0305f();

            public boolean equals(Object other) {
                return this == other || (other instanceof C0305f);
            }

            private C0305f() {
                super(C15040a.f140742U1, null);
            }

            public String toString() {
                return "ARROW_NEXT";
            }

            public int hashCode() {
                return 320397928;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$f$g;", "LKi/C$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class g extends f {

            /* renamed from: e, reason: collision with root package name */
            public static final g f17055e = new g();

            public boolean equals(Object other) {
                return this == other || (other instanceof g);
            }

            private g() {
                super(C15040a.f140746V1, null);
            }

            public String toString() {
                return "ARROW_PREVIOUS";
            }

            public int hashCode() {
                return -1663612948;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$f$h;", "LKi/C$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class h extends f {

            /* renamed from: e, reason: collision with root package name */
            public static final h f17056e = new h();

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            private h() {
                super(C15040a.f140750W1, null);
            }

            public String toString() {
                return "ARROW_RIGHT_FILLED_SM";
            }

            public int hashCode() {
                return 605882687;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$f$i;", "LKi/C$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class i extends f {

            /* renamed from: e, reason: collision with root package name */
            public static final i f17057e = new i();

            /* renamed from: f, reason: collision with root package name */
            public static final int f17058f = 0;

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            private i() {
                super(C15040a.f140754X1, null);
            }

            public String toString() {
                return "ARROW_RIGHT_LG";
            }

            public int hashCode() {
                return -1825886317;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$f$j;", "LKi/C$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class j extends f {

            /* renamed from: e, reason: collision with root package name */
            public static final j f17059e = new j();

            /* renamed from: f, reason: collision with root package name */
            public static final int f17060f = 0;

            public boolean equals(Object other) {
                return this == other || (other instanceof j);
            }

            private j() {
                super(C15040a.f140758Y1, null);
            }

            public String toString() {
                return "ARROW_RIGHT_SM";
            }

            public int hashCode() {
                return -1825886094;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$f$k;", "LKi/C$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class k extends f {

            /* renamed from: e, reason: collision with root package name */
            public static final k f17061e = new k();

            public boolean equals(Object other) {
                return this == other || (other instanceof k);
            }

            private k() {
                super(C15040a.f140762Z1, null);
            }

            public String toString() {
                return "ARROW_UP_LG";
            }

            public int hashCode() {
                return 1349200074;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$f$l;", "LKi/C$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class l extends f {

            /* renamed from: e, reason: collision with root package name */
            public static final l f17062e = new l();

            public boolean equals(Object other) {
                return this == other || (other instanceof l);
            }

            private l() {
                super(C15040a.f140767a2, null);
            }

            public String toString() {
                return "ARROW_UP_SM";
            }

            public int hashCode() {
                return 1349200297;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$f$m;", "LKi/C$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class m extends f {

            /* renamed from: e, reason: collision with root package name */
            public static final m f17063e = new m();

            /* renamed from: f, reason: collision with root package name */
            public static final int f17064f = 0;

            public boolean equals(Object other) {
                return this == other || (other instanceof m);
            }

            private m() {
                super(C15040a.f140772b2, null);
            }

            public String toString() {
                return "CHECKMARK_LG";
            }

            public int hashCode() {
                return -407733404;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$f$n;", "LKi/C$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class n extends f {

            /* renamed from: e, reason: collision with root package name */
            public static final n f17065e = new n();

            public boolean equals(Object other) {
                return this == other || (other instanceof n);
            }

            private n() {
                super(C15040a.f140777c2, null);
            }

            public String toString() {
                return "CHECKMARK_SM";
            }

            public int hashCode() {
                return -407733181;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$f$o;", "LKi/C$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class o extends f {

            /* renamed from: e, reason: collision with root package name */
            public static final o f17066e = new o();

            /* renamed from: f, reason: collision with root package name */
            public static final int f17067f = 0;

            public boolean equals(Object other) {
                return this == other || (other instanceof o);
            }

            private o() {
                super(C15040a.f140782d2, null);
            }

            public String toString() {
                return "CLOSE_LG";
            }

            public int hashCode() {
                return -1586602527;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$f$p;", "LKi/C$f;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class p extends f {

            /* renamed from: e, reason: collision with root package name */
            public static final p f17068e = new p();

            public boolean equals(Object other) {
                return this == other || (other instanceof p);
            }

            private p() {
                super(C15040a.f140787e2, null);
            }

            public String toString() {
                return "CLOSE_SM";
            }

            public int hashCode() {
                return -1586602304;
            }
        }

        public /* synthetic */ f(int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10);
        }

        private f(int i10) {
            super(i10, null);
            this.id = i10;
        }

        @Override // Ki.C
        /* renamed from: a, reason: from getter */
        public int getId() {
            return this.id;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\b\n\u000b\f\r\u000e\u000f\u0010\u0011\u0006\u0012B\u0013\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u000b\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"LKi/C$g;", "LKi/C;", "", PreferencesHelper.PREF_ID, "<init>", "(I)V", "c", "I", "a", "()I", "k", "d", "e", "h", "g", "b", "i", "f", "j", "LKi/C$g$a;", "LKi/C$g$b;", "LKi/C$g$c;", "LKi/C$g$d;", "LKi/C$g$e;", "LKi/C$g$f;", "LKi/C$g$g;", "LKi/C$g$h;", "LKi/C$g$i;", "LKi/C$g$j;", "LKi/C$g$k;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class g extends C {

        /* renamed from: d, reason: collision with root package name */
        public static final int f17069d = 0;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int id;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$g$a;", "LKi/C$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends g {

            /* renamed from: e, reason: collision with root package name */
            public static final a f17071e = new a();

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            private a() {
                super(C15040a.f140792f2, null);
            }

            public String toString() {
                return "AMERICAN_EXPRESS";
            }

            public int hashCode() {
                return -587437516;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$g$b;", "LKi/C$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends g {

            /* renamed from: e, reason: collision with root package name */
            public static final b f17072e = new b();

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            private b() {
                super(C15040a.f140797g2, null);
            }

            public String toString() {
                return "APPLE_PAY";
            }

            public int hashCode() {
                return 788036448;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$g$c;", "LKi/C$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends g {

            /* renamed from: e, reason: collision with root package name */
            public static final c f17073e = new c();

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            private c() {
                super(C15040a.f140802h2, null);
            }

            public String toString() {
                return "CARD";
            }

            public int hashCode() {
                return -1793092717;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$g$d;", "LKi/C$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends g {

            /* renamed from: e, reason: collision with root package name */
            public static final d f17074e = new d();

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            private d() {
                super(C15040a.f140807i2, null);
            }

            public String toString() {
                return "DINERS";
            }

            public int hashCode() {
                return -844313600;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$g$e;", "LKi/C$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends g {

            /* renamed from: e, reason: collision with root package name */
            public static final e f17075e = new e();

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            private e() {
                super(C15040a.f140812j2, null);
            }

            public String toString() {
                return "DISCOVER";
            }

            public int hashCode() {
                return 504663788;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$g$f;", "LKi/C$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class f extends g {

            /* renamed from: e, reason: collision with root package name */
            public static final f f17076e = new f();

            /* renamed from: f, reason: collision with root package name */
            public static final int f17077f = 0;

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            private f() {
                super(C15040a.f140817k2, null);
            }

            public String toString() {
                return "EBT";
            }

            public int hashCode() {
                return -334934412;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$g$g;", "LKi/C$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$g$g, reason: collision with other inner class name */
        public static final /* data */ class C0306g extends g {

            /* renamed from: e, reason: collision with root package name */
            public static final C0306g f17078e = new C0306g();

            public boolean equals(Object other) {
                return this == other || (other instanceof C0306g);
            }

            private C0306g() {
                super(C15040a.f140822l2, null);
            }

            public String toString() {
                return "GOOGLE_PAY";
            }

            public int hashCode() {
                return 1874158533;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$g$h;", "LKi/C$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class h extends g {

            /* renamed from: e, reason: collision with root package name */
            public static final h f17079e = new h();

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            private h() {
                super(C15040a.f140827m2, null);
            }

            public String toString() {
                return "MASTERCARD";
            }

            public int hashCode() {
                return 1369309877;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$g$i;", "LKi/C$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class i extends g {

            /* renamed from: e, reason: collision with root package name */
            public static final i f17080e = new i();

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            private i() {
                super(C15040a.f140832n2, null);
            }

            public String toString() {
                return "MEIJER_CREDIT_CARD";
            }

            public int hashCode() {
                return -119201728;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$g$j;", "LKi/C$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class j extends g {

            /* renamed from: e, reason: collision with root package name */
            public static final j f17081e = new j();

            public boolean equals(Object other) {
                return this == other || (other instanceof j);
            }

            private j() {
                super(C15040a.f140837o2, null);
            }

            public String toString() {
                return "MEIJER_MASTERCARD";
            }

            public int hashCode() {
                return 1984156552;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$g$k;", "LKi/C$g;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class k extends g {

            /* renamed from: e, reason: collision with root package name */
            public static final k f17082e = new k();

            public boolean equals(Object other) {
                return this == other || (other instanceof k);
            }

            private k() {
                super(C15040a.f140842p2, null);
            }

            public String toString() {
                return "VISA";
            }

            public int hashCode() {
                return -1792518972;
            }
        }

        public /* synthetic */ g(int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10);
        }

        private g(int i10) {
            super(i10, null);
            this.id = i10;
        }

        @Override // Ki.C
        /* renamed from: a, reason: from getter */
        public int getId() {
            return this.id;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\b\n\u0006\u000b\f\r\u000eB\u0013\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u0007\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LKi/C$h;", "LKi/C;", "", PreferencesHelper.PREF_ID, "<init>", "(I)V", "c", "I", "a", "()I", "b", "e", "g", "d", "f", "LKi/C$h$a;", "LKi/C$h$b;", "LKi/C$h$c;", "LKi/C$h$d;", "LKi/C$h$e;", "LKi/C$h$f;", "LKi/C$h$g;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class h extends C {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int id;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$h$a;", "LKi/C$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends h {

            /* renamed from: d, reason: collision with root package name */
            public static final a f17084d = new a();

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            private a() {
                super(C15040a.f140847q2, null);
            }

            public String toString() {
                return "FACEBOOK";
            }

            public int hashCode() {
                return -26804052;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$h$b;", "LKi/C$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends h {

            /* renamed from: d, reason: collision with root package name */
            public static final b f17085d = new b();

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            private b() {
                super(C15040a.f140852r2, null);
            }

            public String toString() {
                return "INSTAGRAM";
            }

            public int hashCode() {
                return 966811244;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$h$c;", "LKi/C$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends h {

            /* renamed from: d, reason: collision with root package name */
            public static final c f17086d = new c();

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            private c() {
                super(C15040a.f140856s2, null);
            }

            public String toString() {
                return "PINTEREST";
            }

            public int hashCode() {
                return 936873556;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$h$d;", "LKi/C$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends h {

            /* renamed from: d, reason: collision with root package name */
            public static final d f17087d = new d();

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            private d() {
                super(C15040a.f140860t2, null);
            }

            public String toString() {
                return "TIKTOK";
            }

            public int hashCode() {
                return 1387191392;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$h$e;", "LKi/C$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends h {

            /* renamed from: d, reason: collision with root package name */
            public static final e f17088d = new e();

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            private e() {
                super(C15040a.f140864u2, null);
            }

            public String toString() {
                return "TWITTER";
            }

            public int hashCode() {
                return 452225965;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$h$f;", "LKi/C$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class f extends h {

            /* renamed from: d, reason: collision with root package name */
            public static final f f17089d = new f();

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            private f() {
                super(C15040a.f140868v2, null);
            }

            public String toString() {
                return "X";
            }

            public int hashCode() {
                return -1001864910;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$h$g;", "LKi/C$h;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class g extends h {

            /* renamed from: d, reason: collision with root package name */
            public static final g f17090d = new g();

            public boolean equals(Object other) {
                return this == other || (other instanceof g);
            }

            private g() {
                super(C15040a.f140872w2, null);
            }

            public String toString() {
                return "YOUTUBE";
            }

            public int hashCode() {
                return 376826973;
            }
        }

        public /* synthetic */ h(int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10);
        }

        private h(int i10) {
            super(i10, null);
            this.id = i10;
        }

        @Override // Ki.C
        /* renamed from: a, reason: from getter */
        public int getId() {
            return this.id;
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\n\u000b\f\r\u000e\u000f\u0010\u0006\u0011\u0012\u0013\u0014\u0015\bB\u0013\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001\u000e\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#¨\u0006$"}, d2 = {"LKi/C$i;", "LKi/C;", "", PreferencesHelper.PREF_ID, "<init>", "(I)V", "c", "I", "a", "()I", "b", "e", "f", "i", "h", "n", "l", "j", "k", "m", "d", "g", "LKi/C$i$a;", "LKi/C$i$b;", "LKi/C$i$c;", "LKi/C$i$d;", "LKi/C$i$e;", "LKi/C$i$f;", "LKi/C$i$g;", "LKi/C$i$h;", "LKi/C$i$i;", "LKi/C$i$j;", "LKi/C$i$k;", "LKi/C$i$l;", "LKi/C$i$m;", "LKi/C$i$n;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class i extends C {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int id;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$i$a;", "LKi/C$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class a extends i {

            /* renamed from: d, reason: collision with root package name */
            public static final a f17092d = new a();

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            private a() {
                super(C15040a.f140838o3, null);
            }

            public String toString() {
                return "CHECKED_SOLID";
            }

            public int hashCode() {
                return 60893369;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$i$b;", "LKi/C$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class b extends i {

            /* renamed from: d, reason: collision with root package name */
            public static final b f17093d = new b();

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            private b() {
                super(C15040a.f140876x2, null);
            }

            public String toString() {
                return "CHECKMARK_SOLID";
            }

            public int hashCode() {
                return -1282799385;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$i$c;", "LKi/C$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends i {

            /* renamed from: d, reason: collision with root package name */
            public static final c f17094d = new c();

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            private c() {
                super(C15040a.f140880y2, null);
            }

            public String toString() {
                return "DISSATISFIED";
            }

            public int hashCode() {
                return 226084286;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$i$d;", "LKi/C$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class d extends i {

            /* renamed from: d, reason: collision with root package name */
            public static final d f17095d = new d();

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            private d() {
                super(C15040a.f140843p3, null);
            }

            public String toString() {
                return "ELLIPSIS_SOLID";
            }

            public int hashCode() {
                return 603955575;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$i$e;", "LKi/C$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class e extends i {

            /* renamed from: d, reason: collision with root package name */
            public static final e f17096d = new e();

            /* renamed from: e, reason: collision with root package name */
            public static final int f17097e = 0;

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            private e() {
                super(C15040a.f140884z2, null);
            }

            public String toString() {
                return "ERROR_SOLID";
            }

            public int hashCode() {
                return 1009097690;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$i$f;", "LKi/C$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class f extends i {

            /* renamed from: d, reason: collision with root package name */
            public static final f f17098d = new f();

            /* renamed from: e, reason: collision with root package name */
            public static final int f17099e = 0;

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            private f() {
                super(C15040a.f140663A2, null);
            }

            public String toString() {
                return "HELP_OUTLINE";
            }

            public int hashCode() {
                return -1504886914;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÁ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$i$g;", "LKi/C$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class g extends i {

            /* renamed from: d, reason: collision with root package name */
            public static final g f17100d = new g();

            public boolean equals(Object other) {
                return this == other || (other instanceof g);
            }

            private g() {
                super(C15040a.f140848q3, null);
            }

            public String toString() {
                return "INACTIVE_SOLID";
            }

            public int hashCode() {
                return 516948369;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$i$h;", "LKi/C$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class h extends i {

            /* renamed from: d, reason: collision with root package name */
            public static final h f17101d = new h();

            /* renamed from: e, reason: collision with root package name */
            public static final int f17102e = 0;

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            private h() {
                super(C15040a.f140667B2, null);
            }

            public String toString() {
                return "INFORMATION_OUTLINE";
            }

            public int hashCode() {
                return 265842773;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$i$i;", "LKi/C$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$i$i, reason: collision with other inner class name */
        public static final /* data */ class C0307i extends i {

            /* renamed from: d, reason: collision with root package name */
            public static final C0307i f17103d = new C0307i();

            /* renamed from: e, reason: collision with root package name */
            public static final int f17104e = 0;

            public boolean equals(Object other) {
                return this == other || (other instanceof C0307i);
            }

            private C0307i() {
                super(C15040a.f140671C2, null);
            }

            public String toString() {
                return "INFORMATION_SOLID";
            }

            public int hashCode() {
                return -242025602;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$i$j;", "LKi/C$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class j extends i {

            /* renamed from: d, reason: collision with root package name */
            public static final j f17105d = new j();

            public boolean equals(Object other) {
                return this == other || (other instanceof j);
            }

            private j() {
                super(C15040a.f140675D2, null);
            }

            public String toString() {
                return "NEUTRAL";
            }

            public int hashCode() {
                return -67794163;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$i$k;", "LKi/C$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class k extends i {

            /* renamed from: d, reason: collision with root package name */
            public static final k f17106d = new k();

            public boolean equals(Object other) {
                return this == other || (other instanceof k);
            }

            private k() {
                super(C15040a.f140679E2, null);
            }

            public String toString() {
                return "SATISFIED";
            }

            public int hashCode() {
                return -755678216;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$i$l;", "LKi/C$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class l extends i {

            /* renamed from: d, reason: collision with root package name */
            public static final l f17107d = new l();

            public boolean equals(Object other) {
                return this == other || (other instanceof l);
            }

            private l() {
                super(C15040a.f140683F2, null);
            }

            public String toString() {
                return "VERY_DISSATISFIED";
            }

            public int hashCode() {
                return -478380621;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$i$m;", "LKi/C$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class m extends i {

            /* renamed from: d, reason: collision with root package name */
            public static final m f17108d = new m();

            public boolean equals(Object other) {
                return this == other || (other instanceof m);
            }

            private m() {
                super(C15040a.f140687G2, null);
            }

            public String toString() {
                return "VERY_SATISFIED";
            }

            public int hashCode() {
                return 993368099;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$i$n;", "LKi/C$i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class n extends i {

            /* renamed from: d, reason: collision with root package name */
            public static final n f17109d = new n();

            public boolean equals(Object other) {
                return this == other || (other instanceof n);
            }

            private n() {
                super(C15040a.f140691H2, null);
            }

            public String toString() {
                return "WARNING_SOLID";
            }

            public int hashCode() {
                return -1680114450;
            }
        }

        public /* synthetic */ i(int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10);
        }

        private i(int i10) {
            super(i10, null);
            this.id = i10;
        }

        @Override // Ki.C
        /* renamed from: a, reason: from getter */
        public int getId() {
            return this.id;
        }
    }

    @Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:!\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0006\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\b\"#$%&'(B\u0013\b\u0004\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0001!)*+,-./0123456789:;<=>?@ABCDEFGHI¨\u0006J"}, d2 = {"LKi/C$j;", "LKi/C;", "", PreferencesHelper.PREF_ID, "<init>", "(I)V", "c", "I", "a", "()I", "A", "y", "w", "B", "z", "x", "j", "g", "k", "h", "i", "F", "G", "s", "t", "d", "e", "f", "o", "p", "q", "r", "u", "v", "b", "D", "C", "E", "l", "n", "m", "LKi/C$j$a;", "LKi/C$j$b;", "LKi/C$j$c;", "LKi/C$j$d;", "LKi/C$j$e;", "LKi/C$j$f;", "LKi/C$j$g;", "LKi/C$j$h;", "LKi/C$j$i;", "LKi/C$j$j;", "LKi/C$j$k;", "LKi/C$j$l;", "LKi/C$j$m;", "LKi/C$j$n;", "LKi/C$j$o;", "LKi/C$j$p;", "LKi/C$j$q;", "LKi/C$j$r;", "LKi/C$j$s;", "LKi/C$j$t;", "LKi/C$j$u;", "LKi/C$j$v;", "LKi/C$j$w;", "LKi/C$j$x;", "LKi/C$j$y;", "LKi/C$j$z;", "LKi/C$j$A;", "LKi/C$j$B;", "LKi/C$j$C;", "LKi/C$j$D;", "LKi/C$j$E;", "LKi/C$j$F;", "LKi/C$j$G;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class j extends C {

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int id;

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$A;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class A extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final A f17111d = new A();

            public boolean equals(Object other) {
                return this == other || (other instanceof A);
            }

            private A() {
                super(C15040a.f140803h3, null);
            }

            public String toString() {
                return "STAR_UNFILLED";
            }

            public int hashCode() {
                return -1830923767;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$B;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class B extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final B f17112d = new B();

            public boolean equals(Object other) {
                return this == other || (other instanceof B);
            }

            private B() {
                super(C15040a.f140808i3, null);
            }

            public String toString() {
                return "STAR_UNFILLED_SM";
            }

            public int hashCode() {
                return 1034810448;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$C;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$j$C, reason: collision with other inner class name */
        public static final /* data */ class C0308C extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final C0308C f17113d = new C0308C();

            public boolean equals(Object other) {
                return this == other || (other instanceof C0308C);
            }

            private C0308C() {
                super(C15040a.f140813j3, null);
            }

            public String toString() {
                return "THUMBS_DOWN";
            }

            public int hashCode() {
                return 1621894149;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$D;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class D extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final D f17114d = new D();

            public boolean equals(Object other) {
                return this == other || (other instanceof D);
            }

            private D() {
                super(C15040a.f140818k3, null);
            }

            public String toString() {
                return "THUMBS_UP";
            }

            public int hashCode() {
                return 1436323518;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$E;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class E extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final E f17115d = new E();

            public boolean equals(Object other) {
                return this == other || (other instanceof E);
            }

            private E() {
                super(C15040a.f140823l3, null);
            }

            public String toString() {
                return "UNLOCKED";
            }

            public int hashCode() {
                return -1870110526;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$F;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class F extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final F f17116d = new F();

            public boolean equals(Object other) {
                return this == other || (other instanceof F);
            }

            private F() {
                super(C15040a.f140828m3, null);
            }

            public String toString() {
                return "VIEW_GRID";
            }

            public int hashCode() {
                return -1438228831;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$G;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class G extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final G f17117d = new G();

            public boolean equals(Object other) {
                return this == other || (other instanceof G);
            }

            private G() {
                super(C15040a.f140833n3, null);
            }

            public String toString() {
                return "VIEW_LIST";
            }

            public int hashCode() {
                return -1438088199;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$a;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$j$a, reason: case insensitive filesystem */
        public static final /* data */ class C3928a extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final C3928a f17118d = new C3928a();

            public boolean equals(Object other) {
                return this == other || (other instanceof C3928a);
            }

            private C3928a() {
                super(C15040a.f140695I2, null);
            }

            public String toString() {
                return "CLOSED_CAPTIONING_OFF";
            }

            public int hashCode() {
                return -511849856;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$b;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$j$b, reason: case insensitive filesystem */
        public static final /* data */ class C3929b extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final C3929b f17119d = new C3929b();

            public boolean equals(Object other) {
                return this == other || (other instanceof C3929b);
            }

            private C3929b() {
                super(C15040a.f140698J1, null);
            }

            public String toString() {
                return "CLOSED_CAPTIONING_ON";
            }

            public int hashCode() {
                return 2061698702;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$c;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class c extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final c f17120d = new c();

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            private c() {
                super(C15040a.f140699J2, null);
            }

            public String toString() {
                return "FAVORITE_FILLED";
            }

            public int hashCode() {
                return 179457702;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$d;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$j$d, reason: case insensitive filesystem */
        public static final /* data */ class C3930d extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final C3930d f17121d = new C3930d();

            public boolean equals(Object other) {
                return this == other || (other instanceof C3930d);
            }

            private C3930d() {
                super(C15040a.f140703K2, null);
            }

            public String toString() {
                return "FAVORITE_UNFILLED";
            }

            public int hashCode() {
                return 1000735103;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$e;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$j$e, reason: case insensitive filesystem */
        public static final /* data */ class C3931e extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final C3931e f17122d = new C3931e();

            public boolean equals(Object other) {
                return this == other || (other instanceof C3931e);
            }

            private C3931e() {
                super(C15040a.f140707L2, null);
            }

            public String toString() {
                return "FLASH_OFF";
            }

            public int hashCode() {
                return -1040357791;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$f;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$j$f, reason: case insensitive filesystem */
        public static final /* data */ class C3932f extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final C3932f f17123d = new C3932f();

            /* renamed from: e, reason: collision with root package name */
            public static final int f17124e = 0;

            public boolean equals(Object other) {
                return this == other || (other instanceof C3932f);
            }

            private C3932f() {
                super(C15040a.f140711M2, null);
            }

            public String toString() {
                return "FLASH_ON";
            }

            public int hashCode() {
                return -33559923;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$g;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$j$g, reason: case insensitive filesystem */
        public static final /* data */ class C3933g extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final C3933g f17125d = new C3933g();

            public boolean equals(Object other) {
                return this == other || (other instanceof C3933g);
            }

            private C3933g() {
                super(C15040a.f140715N2, null);
            }

            public String toString() {
                return "LIST_ADD";
            }

            public int hashCode() {
                return -312239297;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$h;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class h extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final h f17126d = new h();

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            private h() {
                super(C15040a.f140719O2, null);
            }

            public String toString() {
                return "LIST_DONE";
            }

            public int hashCode() {
                return -1089383292;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$i;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class i extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final i f17127d = new i();

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            private i() {
                super(C15040a.f140723P2, null);
            }

            public String toString() {
                return "LIST_EDIT";
            }

            public int hashCode() {
                return -1089364212;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$j;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ki.C$j$j, reason: collision with other inner class name */
        public static final /* data */ class C0309j extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final C0309j f17128d = new C0309j();

            public boolean equals(Object other) {
                return this == other || (other instanceof C0309j);
            }

            private C0309j() {
                super(C15040a.f140727Q2, null);
            }

            public String toString() {
                return "LIST_REMOVE";
            }

            public int hashCode() {
                return 1466232070;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$k;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class k extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final k f17129d = new k();

            public boolean equals(Object other) {
                return this == other || (other instanceof k);
            }

            private k() {
                super(C15040a.f140731R2, null);
            }

            public String toString() {
                return "LIST_RESORT";
            }

            public int hashCode() {
                return 1466410707;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$l;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class l extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final l f17130d = new l();

            /* renamed from: e, reason: collision with root package name */
            public static final int f17131e = 0;

            public boolean equals(Object other) {
                return this == other || (other instanceof l);
            }

            private l() {
                super(C15040a.f140735S2, null);
            }

            public String toString() {
                return "LOCKED";
            }

            public int hashCode() {
                return 648304809;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$m;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class m extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final m f17132d = new m();

            public boolean equals(Object other) {
                return this == other || (other instanceof m);
            }

            private m() {
                super(C15040a.f140739T2, null);
            }

            public String toString() {
                return "NOTIFICATION_OFF";
            }

            public int hashCode() {
                return 863656666;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$n;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class n extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final n f17133d = new n();

            public boolean equals(Object other) {
                return this == other || (other instanceof n);
            }

            private n() {
                super(C15040a.f140743U2, null);
            }

            public String toString() {
                return "NOTIFICATION_ON";
            }

            public int hashCode() {
                return 1967522548;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$o;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class o extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final o f17134d = new o();

            public boolean equals(Object other) {
                return this == other || (other instanceof o);
            }

            private o() {
                super(C15040a.f140747V2, null);
            }

            public String toString() {
                return "PASSWORD_HIDE";
            }

            public int hashCode() {
                return 1635572199;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$p;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class p extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final p f17135d = new p();

            public boolean equals(Object other) {
                return this == other || (other instanceof p);
            }

            private p() {
                super(C15040a.f140751W2, null);
            }

            public String toString() {
                return "PASSWORD_REVEAL";
            }

            public int hashCode() {
                return 109988658;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$q;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class q extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final q f17136d = new q();

            public boolean equals(Object other) {
                return this == other || (other instanceof q);
            }

            private q() {
                super(C15040a.f140755X2, null);
            }

            public String toString() {
                return "PAUSE";
            }

            public int hashCode() {
                return -1222718377;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$r;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class r extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final r f17137d = new r();

            public boolean equals(Object other) {
                return this == other || (other instanceof r);
            }

            private r() {
                super(C15040a.f140759Y2, null);
            }

            public String toString() {
                return "PLAY";
            }

            public int hashCode() {
                return 514756755;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$s;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class s extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final s f17138d = new s();

            public boolean equals(Object other) {
                return this == other || (other instanceof s);
            }

            private s() {
                super(C15040a.f140763Z2, null);
            }

            public String toString() {
                return "SHOPPING_LIST_OFF";
            }

            public int hashCode() {
                return -507849690;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$t;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class t extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final t f17139d = new t();

            public boolean equals(Object other) {
                return this == other || (other instanceof t);
            }

            private t() {
                super(C15040a.f140768a3, null);
            }

            public String toString() {
                return "SHOPPING_LIST_ON";
            }

            public int hashCode() {
                return -1817497560;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$u;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class u extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final u f17140d = new u();

            public boolean equals(Object other) {
                return this == other || (other instanceof u);
            }

            private u() {
                super(C15040a.f140773b3, null);
            }

            public String toString() {
                return "SOUND_OFF";
            }

            public int hashCode() {
                return -1705601024;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$v;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class v extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final v f17141d = new v();

            public boolean equals(Object other) {
                return this == other || (other instanceof v);
            }

            private v() {
                super(C15040a.f140778c3, null);
            }

            public String toString() {
                return "SOUND_ON";
            }

            public int hashCode() {
                return 83527950;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$w;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class w extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final w f17142d = new w();

            public boolean equals(Object other) {
                return this == other || (other instanceof w);
            }

            private w() {
                super(C15040a.f140783d3, null);
            }

            public String toString() {
                return "STAR_FILLED";
            }

            public int hashCode() {
                return -1745274448;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$x;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class x extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final x f17143d = new x();

            public boolean equals(Object other) {
                return this == other || (other instanceof x);
            }

            private x() {
                super(C15040a.f140788e3, null);
            }

            public String toString() {
                return "STAR_FILLED_SM";
            }

            public int hashCode() {
                return 1403098953;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$y;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class y extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final y f17144d = new y();

            public boolean equals(Object other) {
                return this == other || (other instanceof y);
            }

            private y() {
                super(C15040a.f140793f3, null);
            }

            public String toString() {
                return "STAR_HALF";
            }

            public int hashCode() {
                return -2012935167;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/C$j$z;", "LKi/C$j;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class z extends j {

            /* renamed from: d, reason: collision with root package name */
            public static final z f17145d = new z();

            public boolean equals(Object other) {
                return this == other || (other instanceof z);
            }

            private z() {
                super(C15040a.f140798g3, null);
            }

            public String toString() {
                return "STAR_HALF_SM";
            }

            public int hashCode() {
                return -1018079400;
            }
        }

        public /* synthetic */ j(int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10);
        }

        private j(int i10) {
            super(i10, null);
            this.id = i10;
        }

        @Override // Ki.C
        /* renamed from: a, reason: from getter */
        public int getId() {
            return this.id;
        }
    }

    public /* synthetic */ C(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    private C(int i10) {
        this.id = i10;
    }

    /* renamed from: a, reason: from getter */
    public int getId() {
        return this.id;
    }
}
