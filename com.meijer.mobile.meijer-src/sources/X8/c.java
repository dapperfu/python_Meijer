package X8;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\u0018\u0000 \u000e*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\bB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u000f"}, d2 = {"LX8/c;", "T", "", "result", "", "errorCause", "<init>", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "c", "core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c<T> {

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final T result;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Throwable errorCause;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\u0006\u0010\u0005\u001a\u00028\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\"\u0004\b\u0001\u0010\u00042\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\nH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LX8/c$a;", "", "<init>", "()V", "T", "result", "LX8/c;", "b", "(Ljava/lang/Object;)LX8/c;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "errorCause", "a", "(Ljava/lang/Exception;)LX8/c;", "core-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: X8.c$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final <T> c<T> a(Exception errorCause) {
            return new c<>(null, errorCause);
        }

        @JvmStatic
        public final <T> c<T> b(T result) {
            return new c<>(result, null);
        }
    }

    /* renamed from: a, reason: from getter */
    public final Throwable getErrorCause() {
        return this.errorCause;
    }

    public final T b() {
        return this.result;
    }

    public c(T t10, Throwable th2) {
        this.result = t10;
        this.errorCause = th2;
    }
}
