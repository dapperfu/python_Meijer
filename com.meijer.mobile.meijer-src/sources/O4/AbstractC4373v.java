package O4;

import com.fullstory.FS;

/* renamed from: O4.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4373v {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f23208a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile AbstractC4373v f23209b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final int f23210c = 20;

    /* renamed from: O4.v$a */
    public static class a extends AbstractC4373v {

        /* renamed from: d, reason: collision with root package name */
        private final int f23211d;

        @Override // O4.AbstractC4373v
        public void a(String str, String str2) {
            if (this.f23211d <= 3) {
                FS.log_d(str, str2);
            }
        }

        @Override // O4.AbstractC4373v
        public void b(String str, String str2, Throwable th2) {
            if (this.f23211d <= 3) {
                FS.log_d(str, str2, th2);
            }
        }

        @Override // O4.AbstractC4373v
        public void c(String str, String str2) {
            if (this.f23211d <= 6) {
                FS.log_e(str, str2);
            }
        }

        @Override // O4.AbstractC4373v
        public void d(String str, String str2, Throwable th2) {
            if (this.f23211d <= 6) {
                FS.log_e(str, str2, th2);
            }
        }

        @Override // O4.AbstractC4373v
        public void f(String str, String str2) {
            if (this.f23211d <= 4) {
                FS.log_i(str, str2);
            }
        }

        @Override // O4.AbstractC4373v
        public void g(String str, String str2, Throwable th2) {
            if (this.f23211d <= 4) {
                FS.log_i(str, str2, th2);
            }
        }

        @Override // O4.AbstractC4373v
        public void j(String str, String str2) {
            if (this.f23211d <= 2) {
                FS.log_v(str, str2);
            }
        }

        @Override // O4.AbstractC4373v
        public void k(String str, String str2) {
            if (this.f23211d <= 5) {
                FS.log_w(str, str2);
            }
        }

        @Override // O4.AbstractC4373v
        public void l(String str, String str2, Throwable th2) {
            if (this.f23211d <= 5) {
                FS.log_w(str, str2, th2);
            }
        }

        public a(int i10) {
            super(i10);
            this.f23211d = i10;
        }
    }

    public abstract void a(String str, String str2);

    public abstract void b(String str, String str2, Throwable th2);

    public abstract void c(String str, String str2);

    public abstract void d(String str, String str2, Throwable th2);

    public abstract void f(String str, String str2);

    public abstract void g(String str, String str2, Throwable th2);

    public abstract void j(String str, String str2);

    public abstract void k(String str, String str2);

    public abstract void l(String str, String str2, Throwable th2);

    public static AbstractC4373v e() {
        AbstractC4373v abstractC4373v;
        synchronized (f23208a) {
            try {
                if (f23209b == null) {
                    f23209b = new a(3);
                }
                abstractC4373v = f23209b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC4373v;
    }

    public static void h(AbstractC4373v abstractC4373v) {
        synchronized (f23208a) {
            try {
                if (f23209b == null) {
                    f23209b = abstractC4373v;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public AbstractC4373v(int i10) {
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i10 = f23210c;
        if (length >= i10) {
            sb2.append(str.substring(0, i10));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }
}
