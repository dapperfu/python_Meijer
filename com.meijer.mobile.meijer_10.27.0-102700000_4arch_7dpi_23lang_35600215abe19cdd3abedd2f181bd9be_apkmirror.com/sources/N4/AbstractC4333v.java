package N4;

import com.fullstory.FS;

/* renamed from: N4.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4333v {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f21435a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static volatile AbstractC4333v f21436b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final int f21437c = 20;

    /* renamed from: N4.v$a */
    public static class a extends AbstractC4333v {

        /* renamed from: d, reason: collision with root package name */
        private final int f21438d;

        @Override // N4.AbstractC4333v
        public void a(String str, String str2) {
            if (this.f21438d <= 3) {
                FS.log_d(str, str2);
            }
        }

        @Override // N4.AbstractC4333v
        public void b(String str, String str2, Throwable th2) {
            if (this.f21438d <= 3) {
                FS.log_d(str, str2, th2);
            }
        }

        @Override // N4.AbstractC4333v
        public void c(String str, String str2) {
            if (this.f21438d <= 6) {
                FS.log_e(str, str2);
            }
        }

        @Override // N4.AbstractC4333v
        public void d(String str, String str2, Throwable th2) {
            if (this.f21438d <= 6) {
                FS.log_e(str, str2, th2);
            }
        }

        @Override // N4.AbstractC4333v
        public void f(String str, String str2) {
            if (this.f21438d <= 4) {
                FS.log_i(str, str2);
            }
        }

        @Override // N4.AbstractC4333v
        public void g(String str, String str2, Throwable th2) {
            if (this.f21438d <= 4) {
                FS.log_i(str, str2, th2);
            }
        }

        @Override // N4.AbstractC4333v
        public void j(String str, String str2) {
            if (this.f21438d <= 2) {
                FS.log_v(str, str2);
            }
        }

        @Override // N4.AbstractC4333v
        public void k(String str, String str2) {
            if (this.f21438d <= 5) {
                FS.log_w(str, str2);
            }
        }

        @Override // N4.AbstractC4333v
        public void l(String str, String str2, Throwable th2) {
            if (this.f21438d <= 5) {
                FS.log_w(str, str2, th2);
            }
        }

        public a(int i10) {
            super(i10);
            this.f21438d = i10;
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

    public static AbstractC4333v e() {
        AbstractC4333v abstractC4333v;
        synchronized (f21435a) {
            try {
                if (f21436b == null) {
                    f21436b = new a(3);
                }
                abstractC4333v = f21436b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC4333v;
    }

    public static void h(AbstractC4333v abstractC4333v) {
        synchronized (f21435a) {
            try {
                if (f21436b == null) {
                    f21436b = abstractC4333v;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public AbstractC4333v(int i10) {
    }

    public static String i(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder(23);
        sb2.append("WM-");
        int i10 = f21437c;
        if (length >= i10) {
            sb2.append(str.substring(0, i10));
        } else {
            sb2.append(str);
        }
        return sb2.toString();
    }
}
