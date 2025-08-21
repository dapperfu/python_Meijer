package zu;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lzu/a;", "", "a", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: zu.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C18553a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: b, reason: collision with root package name */
    private static final String f173279b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f173280c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f173281d;

    /* renamed from: e, reason: collision with root package name */
    private static final String f173282e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f173283f;

    /* renamed from: g, reason: collision with root package name */
    private static final String f173284g;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lzu/a$a;", "", "<init>", "()V", "", "EVENT_QUERY_SENT", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "EXTRA_QUERY", "b", "EXTRA_TERM", "d", "EXTRA_SUGGESTION", "c", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: zu.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String a() {
            return C18553a.f173279b;
        }

        public final String b() {
            return C18553a.f173281d;
        }

        public final String c() {
            return C18553a.f173284g;
        }

        public final String d() {
            return C18553a.f173282e;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        f173279b = Reflection.b(companion.getClass()).t() + "query_sent";
        f173280c = Reflection.b(companion.getClass()).t() + "suggestions_retrieved";
        f173281d = Reflection.b(companion.getClass()).t() + "query";
        f173282e = Reflection.b(companion.getClass()).t() + "term";
        f173283f = Reflection.b(companion.getClass()).t() + "suggestions";
        f173284g = Reflection.b(companion.getClass()).t() + "suggestion";
    }
}
