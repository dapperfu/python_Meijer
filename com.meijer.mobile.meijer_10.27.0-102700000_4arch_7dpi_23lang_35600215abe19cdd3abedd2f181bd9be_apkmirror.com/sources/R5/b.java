package R5;

import java.util.Date;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private final Date f31906a;

    public static b a(Date date) {
        return new b(date);
    }

    public static b d() {
        return new b(null);
    }

    public final Date b() {
        return this.f31906a;
    }

    public boolean c() {
        return this.f31906a != null && System.currentTimeMillis() >= this.f31906a.getTime();
    }

    private b(Date date) {
        this.f31906a = date;
    }
}
