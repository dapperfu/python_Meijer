package Ne;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f21527a = Logger.getLogger(b.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f21528b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: Ne.b$b, reason: collision with other inner class name */
    public static abstract class EnumC0342b {

        /* renamed from: a, reason: collision with root package name */
        public static final EnumC0342b f21529a;

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0342b f21530b;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ EnumC0342b[] f21531c;

        private EnumC0342b(String str, int i10) {
        }

        public abstract boolean a();

        /* renamed from: Ne.b$b$a */
        enum a extends EnumC0342b {
            a(String str, int i10) {
                super(str, i10);
            }

            @Override // Ne.b.EnumC0342b
            public boolean a() {
                return !b.c();
            }
        }

        /* renamed from: Ne.b$b$b, reason: collision with other inner class name */
        enum C0343b extends EnumC0342b {
            C0343b(String str, int i10) {
                super(str, i10);
            }

            @Override // Ne.b.EnumC0342b
            public boolean a() {
                if (b.c() && !b.b()) {
                    return false;
                }
                return true;
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            f21529a = aVar;
            C0343b c0343b = new C0343b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            f21530b = c0343b;
            f21531c = new EnumC0342b[]{aVar, c0343b};
        }

        public static EnumC0342b valueOf(String str) {
            return (EnumC0342b) Enum.valueOf(EnumC0342b.class, str);
        }

        public static EnumC0342b[] values() {
            return (EnumC0342b[]) f21531c.clone();
        }
    }

    static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f21527a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    private b() {
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        if (!Ne.a.a() && !f21528b.get()) {
            return false;
        }
        return true;
    }
}
