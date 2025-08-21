package oi;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oi.s1;
import oi.v1;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u000f\u000b\bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Loi/w1;", "", "Loi/v1;", "theme", "Loi/s1;", "enabledState", "<init>", "(Loi/v1;Loi/s1;)V", "a", "Loi/v1;", "()Loi/v1;", "b", "Loi/s1;", "getEnabledState", "()Loi/s1;", "c", "Loi/w1$a;", "Loi/w1$b;", "Loi/w1$c;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class w1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v1 theme;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s1 enabledState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loi/w1$a;", "Loi/w1;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends w1 {

        /* renamed from: c, reason: collision with root package name */
        public static final a f154275c = new a();

        private a() {
            super(v1.b.f154268a, s1.a.f154253a, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loi/w1$b;", "Loi/w1;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends w1 {

        /* renamed from: c, reason: collision with root package name */
        public static final b f154276c = new b();

        private b() {
            super(v1.b.f154268a, t1.f154258a, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loi/w1$c;", "Loi/w1;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends w1 {

        /* renamed from: c, reason: collision with root package name */
        public static final c f154277c = new c();

        private c() {
            super(v1.b.f154268a, u1.f154262a, null);
        }
    }

    public /* synthetic */ w1(v1 v1Var, s1 s1Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(v1Var, s1Var);
    }

    private w1(v1 v1Var, s1 s1Var) {
        this.theme = v1Var;
        this.enabledState = s1Var;
    }

    /* renamed from: a, reason: from getter */
    public final v1 getTheme() {
        return this.theme;
    }
}
