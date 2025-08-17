package Du;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LDu/a;", "", "a", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: b, reason: collision with root package name */
    private static final String f7369b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f7370c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f7371d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f7372e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f7373f;

    /* renamed from: g, reason: collision with root package name */
    private static final String f7374g;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"LDu/a$a;", "", "<init>", "()V", "", "EVENT_QUERY_SENT", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "EXTRA_QUERY", "b", "EXTRA_TERM", "d", "EXTRA_SUGGESTION", "c", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: Du.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String a() {
            return a.f7369b;
        }

        public final String b() {
            return a.f7371d;
        }

        public final String c() {
            return a.f7374g;
        }

        public final String d() {
            return a.f7372e;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f7369b = Reflection.b(companion.getClass()).t() + "query_sent";
        f7370c = Reflection.b(companion.getClass()).t() + "suggestions_retrieved";
        f7371d = Reflection.b(companion.getClass()).t() + "query";
        f7372e = Reflection.b(companion.getClass()).t() + "term";
        f7373f = Reflection.b(companion.getClass()).t() + "suggestions";
        f7374g = Reflection.b(companion.getClass()).t() + "suggestion";
    }
}
