package S5;

import java.util.Date;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Date f34444a;

    public static b a(Date date) {
        return new b(date);
    }

    public static b d() {
        return new b(null);
    }

    public final Date b() {
        return this.f34444a;
    }

    public boolean c() {
        return this.f34444a != null && System.currentTimeMillis() >= this.f34444a.getTime();
    }

    private b(Date date) {
        this.f34444a = date;
    }
}
