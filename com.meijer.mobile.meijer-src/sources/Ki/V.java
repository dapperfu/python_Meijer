package Ki;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0001\u000f¨\u0006\u0010"}, d2 = {"LKi/V;", "", "LH1/h;", "dp", "LH1/v;", "unit", "<init>", "(FJ)V", "a", "F", "()F", "b", "J", "getUnit-XSAIIZE", "()J", "LKi/V$a;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class V {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float dp;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long unit;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\r\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0001\r\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !¨\u0006\""}, d2 = {"LKi/V$a;", "LKi/V;", "LH1/h;", "dp", "LH1/v;", "rem", "<init>", "(FJ)V", "f", "m", "k", "d", "c", "h", "g", "a", "e", "i", "b", "l", "j", "LKi/V$a$a;", "LKi/V$a$b;", "LKi/V$a$c;", "LKi/V$a$d;", "LKi/V$a$e;", "LKi/V$a$f;", "LKi/V$a$g;", "LKi/V$a$h;", "LKi/V$a$i;", "LKi/V$a$j;", "LKi/V$a$k;", "LKi/V$a$l;", "LKi/V$a$m;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a extends V {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/V$a$a;", "LKi/V$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        /* renamed from: Ki.V$a$a, reason: collision with other inner class name */
        public static final /* data */ class C0316a extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final C0316a f17431c = new C0316a();

            public boolean equals(Object other) {
                return this == other || (other instanceof C0316a);
            }

            private C0316a() {
                super(H1.h.p(32), H1.w.f(2), null);
            }

            public String toString() {
                return "Eight";
            }

            public int hashCode() {
                return 477814964;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/V$a$b;", "LKi/V$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final /* data */ class b extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final b f17432c = new b();

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            private b() {
                super(H1.h.p(64), H1.w.f(4), null);
            }

            public String toString() {
                return "Eleven";
            }

            public int hashCode() {
                return 1930086076;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/V$a$c;", "LKi/V$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final /* data */ class c extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final c f17433c = new c();

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            private c() {
                super(H1.h.p(16), H1.w.f(1), null);
            }

            public String toString() {
                return "Five";
            }

            public int hashCode() {
                return 1955106285;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/V$a$d;", "LKi/V$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final /* data */ class d extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final d f17434c = new d();

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            private d() {
                super(H1.h.p(12), H1.w.d(0.75d), null);
            }

            public String toString() {
                return "Four";
            }

            public int hashCode() {
                return 1955112033;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/V$a$e;", "LKi/V$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final /* data */ class e extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final e f17435c = new e();

            public boolean equals(Object other) {
                return this == other || (other instanceof e);
            }

            private e() {
                super(H1.h.p(40), H1.w.d(2.5d), null);
            }

            public String toString() {
                return "Nine";
            }

            public int hashCode() {
                return 1955344365;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/V$a$f;", "LKi/V$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final /* data */ class f extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final f f17436c = new f();

            private f() {
                super(H1.h.p(2), H1.w.d(0.125d), null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof f);
            }

            public String toString() {
                return "One";
            }

            public int hashCode() {
                return -1460943925;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/V$a$g;", "LKi/V$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final /* data */ class g extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final g f17437c = new g();

            public boolean equals(Object other) {
                return this == other || (other instanceof g);
            }

            private g() {
                super(H1.h.p(24), H1.w.d(1.5d), null);
            }

            public String toString() {
                return "Seven";
            }

            public int hashCode() {
                return 490639410;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/V$a$h;", "LKi/V$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final /* data */ class h extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final h f17438c = new h();

            public boolean equals(Object other) {
                return this == other || (other instanceof h);
            }

            private h() {
                super(H1.h.p(20), H1.w.d(1.25d), null);
            }

            public String toString() {
                return "Six";
            }

            public int hashCode() {
                return -1460940217;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/V$a$i;", "LKi/V$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final /* data */ class i extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final i f17439c = new i();

            public boolean equals(Object other) {
                return this == other || (other instanceof i);
            }

            private i() {
                super(H1.h.p(48), H1.w.f(3), null);
            }

            public String toString() {
                return "Ten";
            }

            public int hashCode() {
                return -1460939390;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/V$a$j;", "LKi/V$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final /* data */ class j extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final j f17440c = new j();

            public boolean equals(Object other) {
                return this == other || (other instanceof j);
            }

            private j() {
                super(H1.h.p(96), H1.w.f(6), null);
            }

            public String toString() {
                return "Thirteen";
            }

            public int hashCode() {
                return 615414962;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/V$a$k;", "LKi/V$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final /* data */ class k extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final k f17441c = new k();

            public boolean equals(Object other) {
                return this == other || (other instanceof k);
            }

            private k() {
                super(H1.h.p(8), H1.w.d(0.5d), null);
            }

            public String toString() {
                return "Three";
            }

            public int hashCode() {
                return 491648451;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/V$a$l;", "LKi/V$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final /* data */ class l extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final l f17442c = new l();

            public boolean equals(Object other) {
                return this == other || (other instanceof l);
            }

            private l() {
                super(H1.h.p(80), H1.w.f(5), null);
            }

            public String toString() {
                return "Twelve";
            }

            public int hashCode() {
                return -1925294316;
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LKi/V$a$m;", "LKi/V$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final /* data */ class m extends a {

            /* renamed from: c, reason: collision with root package name */
            public static final m f17443c = new m();

            private m() {
                super(H1.h.p(4), H1.w.d(0.25d), null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof m);
            }

            public String toString() {
                return "Two";
            }

            public int hashCode() {
                return -1460938831;
            }
        }

        public /* synthetic */ a(float f10, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            this(f10, j10);
        }

        private a(float f10, long j10) {
            super(f10, j10, null);
        }
    }

    public /* synthetic */ V(float f10, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, j10);
    }

    private V(float f10, long j10) {
        this.dp = f10;
        this.unit = j10;
    }

    /* renamed from: a, reason: from getter */
    public final float getDp() {
        return this.dp;
    }
}
