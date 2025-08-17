package n8;

import java.security.SecureRandom;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ln8/e;", "", "<init>", "()V", "", "a", "()J", "Ljava/security/SecureRandom;", "b", "Ljava/security/SecureRandom;", "random", "agent.core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f151104a = new e();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final SecureRandom random = new SecureRandom();

    @JvmStatic
    public static final long a() {
        SecureRandom secureRandom = random;
        return secureRandom.nextInt(65536) + (secureRandom.nextInt(65536) << 8) + (secureRandom.nextInt(65536) << 16);
    }

    private e() {
    }
}
