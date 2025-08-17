package kotlin.reflect.jvm.internal.impl.platform;

/* loaded from: classes13.dex */
public abstract class SimplePlatform {

    /* renamed from: a, reason: collision with root package name */
    private final String f145813a;

    /* renamed from: b, reason: collision with root package name */
    private final TargetPlatformVersion f145814b;

    public TargetPlatformVersion b() {
        return this.f145814b;
    }

    public String a() {
        return b().getDescription();
    }

    public String toString() {
        String strA = a();
        if (strA.length() > 0) {
            return this.f145813a + " (" + strA + ')';
        }
        return this.f145813a;
    }
}
