package tt;

import java.util.Properties;

/* loaded from: classes11.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public Properties f162096a;

    private d(Properties properties) {
        this.f162096a = properties;
    }

    public final long a() {
        try {
            return Long.valueOf(this.f162096a.getProperty("extra.exit.delay", "900")).longValue();
        } catch (NumberFormatException unused) {
            return 900L;
        }
    }

    public d() {
        this(new Properties());
    }
}
