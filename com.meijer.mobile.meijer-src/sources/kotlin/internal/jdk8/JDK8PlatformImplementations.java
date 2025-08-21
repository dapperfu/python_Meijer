package kotlin.internal.jdk8;

import kotlin.Metadata;
import kotlin.internal.jdk7.JDK7PlatformImplementations;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.random.jdk8.PlatformThreadLocalRandom;
import kotlin.time.Clock;
import kotlin.time.ExperimentalTime;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations;", "Lkotlin/internal/jdk7/JDK7PlatformImplementations;", "<init>", "()V", "", "version", "", "d", "(I)Z", "Lkotlin/random/Random;", "b", "()Lkotlin/random/Random;", "Lkotlin/time/Clock;", "c", "()Lkotlin/time/Clock;", "a", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public class JDK8PlatformImplementations extends JDK7PlatformImplementations {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lkotlin/internal/jdk8/JDK8PlatformImplementations$a;", "", "<init>", "()V", "", "b", "Ljava/lang/Integer;", "sdkVersion", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f143597a = new a();

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
    public Random b() {
        return d(34) ? new PlatformThreadLocalRandom() : super.b();
    }

    @Override // kotlin.internal.PlatformImplementations
    @ExperimentalTime
    public Clock c() {
        return d(26) ? new Clock() { // from class: kotlin.internal.jdk8.JDK8PlatformImplementations$getSystemClock$1
        } : new Clock() { // from class: kotlin.internal.jdk8.JDK8PlatformImplementations$getSystemClock$2
        };
    }
}
