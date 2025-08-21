package Pe;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f25762a = Logger.getLogger(b.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f25763b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Pe.b$b, reason: collision with other inner class name */
    public static abstract class EnumC0429b {

        /* renamed from: a, reason: collision with root package name */
        public static final EnumC0429b f25764a;

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0429b f25765b;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ EnumC0429b[] f25766c;

        private EnumC0429b(String str, int i10) {
        }

        public abstract boolean a();

        /* renamed from: Pe.b$b$a */
        enum a extends EnumC0429b {
            a(String str, int i10) {
                super(str, i10);
            }

            @Override // Pe.b.EnumC0429b
            public boolean a() {
                return !b.c();
            }
        }

        /* renamed from: Pe.b$b$b, reason: collision with other inner class name */
        enum C0430b extends EnumC0429b {
            C0430b(String str, int i10) {
                super(str, i10);
            }

            @Override // Pe.b.EnumC0429b
            public boolean a() {
                if (b.c() && !b.b()) {
                    return false;
                }
                return true;
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            f25764a = aVar;
            C0430b c0430b = new C0430b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            f25765b = c0430b;
            f25766c = new EnumC0429b[]{aVar, c0430b};
        }

        public static EnumC0429b valueOf(String str) {
            return (EnumC0429b) Enum.valueOf(EnumC0429b.class, str);
        }

        public static EnumC0429b[] values() {
            return (EnumC0429b[]) f25766c.clone();
        }
    }

    static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f25762a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    private b() {
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        if (!Pe.a.a() && !f25763b.get()) {
            return false;
        }
        return true;
    }
}
