package tt;

import java.util.Properties;

/* loaded from: classes12.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public Properties f163398a;

    private d(Properties properties) {
        this.f163398a = properties;
    }

    public final long a() {
        try {
            return Long.valueOf(this.f163398a.getProperty("extra.exit.delay", "900")).longValue();
        } catch (NumberFormatException unused) {
            return 900L;
        }
    }

    public d() {
        this(new Properties());
    }
}
