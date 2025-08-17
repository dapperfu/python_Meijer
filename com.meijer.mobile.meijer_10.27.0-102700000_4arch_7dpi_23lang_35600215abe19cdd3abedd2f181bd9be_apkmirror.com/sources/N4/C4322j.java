package N4;

import android.app.Notification;

/* renamed from: N4.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4322j {

    /* renamed from: a, reason: collision with root package name */
    private final int f21416a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21417b;

    /* renamed from: c, reason: collision with root package name */
    private final Notification f21418c;

    public C4322j(int i10, Notification notification) {
        this(i10, notification, 0);
    }

    public C4322j(int i10, Notification notification, int i11) {
        this.f21416a = i10;
        this.f21418c = notification;
        this.f21417b = i11;
    }

    public int a() {
        return this.f21417b;
    }

    public Notification b() {
        return this.f21418c;
    }

    public int c() {
        return this.f21416a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4322j.class != obj.getClass()) {
            return false;
        }
        C4322j c4322j = (C4322j) obj;
        if (this.f21416a == c4322j.f21416a && this.f21417b == c4322j.f21417b) {
            return this.f21418c.equals(c4322j.f21418c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f21416a * 31) + this.f21417b) * 31) + this.f21418c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f21416a + ", mForegroundServiceType=" + this.f21417b + ", mNotification=" + this.f21418c + '}';
    }
}
