package kotlin.reflect.jvm.internal.impl.platform;

/* loaded from: classes14.dex */
public abstract class SimplePlatform {

    /* renamed from: a, reason: collision with root package name */
    private final String f146720a;

    /* renamed from: b, reason: collision with root package name */
    private final TargetPlatformVersion f146721b;

    public TargetPlatformVersion b() {
        return this.f146721b;
    }

    public String a() {
        return b().getDescription();
    }

    public String toString() {
        String strA = a();
        if (strA.length() > 0) {
            return this.f146720a + " (" + strA + ')';
        }
        return this.f146720a;
    }
}
