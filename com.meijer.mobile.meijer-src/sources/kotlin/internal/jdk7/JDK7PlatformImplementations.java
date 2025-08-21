package kotlin.internal.jdk7;

import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.internal.PlatformImplementations;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "Lkotlin/internal/PlatformImplementations;", "<init>", "()V", "", "version", "", "d", "(I)Z", "", "cause", "exception", "", "a", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public class JDK7PlatformImplementations extends PlatformImplementations {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/internal/jdk7/JDK7PlatformImplementations$a;", "", "<init>", "()V", "", "b", "Ljava/lang/Integer;", "sdkVersion", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f143595a = new a();

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        @JvmField
        public static final Integer sdkVersion;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            sdkVersion = num;
        }

        private a() {
        }
    }

    private final boolean d(int version) {
        Integer num = a.sdkVersion;
        return num == null || num.intValue() >= version;
    }

    @Override // kotlin.internal.PlatformImplementations
    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.j(cause, "cause");
        Intrinsics.j(exception, "exception");
        if (d(19)) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }
}
