package ni;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ni.s1;
import ni.v1;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0003\u000f\u000b\bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\u0082\u0001\u0003\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lni/w1;", "", "Lni/v1;", "theme", "Lni/s1;", "enabledState", "<init>", "(Lni/v1;Lni/s1;)V", "a", "Lni/v1;", "()Lni/v1;", "b", "Lni/s1;", "getEnabledState", "()Lni/s1;", "c", "Lni/w1$a;", "Lni/w1$b;", "Lni/w1$c;", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class w1 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v1 theme;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s1 enabledState;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lni/w1$a;", "Lni/w1;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends w1 {

        /* renamed from: c, reason: collision with root package name */
        public static final a f151816c = new a();

        private a() {
            super(v1.b.f151809a, s1.a.f151794a, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lni/w1$b;", "Lni/w1;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends w1 {

        /* renamed from: c, reason: collision with root package name */
        public static final b f151817c = new b();

        private b() {
            super(v1.b.f151809a, t1.f151799a, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lni/w1$c;", "Lni/w1;", "<init>", "()V", "library_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends w1 {

        /* renamed from: c, reason: collision with root package name */
        public static final c f151818c = new c();

        private c() {
            super(v1.b.f151809a, u1.f151803a, null);
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
