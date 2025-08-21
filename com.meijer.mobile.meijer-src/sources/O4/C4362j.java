package O4;

import android.app.Notification;

/* renamed from: O4.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4362j {

    /* renamed from: a, reason: collision with root package name */
    private final int f23189a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23190b;

    /* renamed from: c, reason: collision with root package name */
    private final Notification f23191c;

    public C4362j(int i10, Notification notification) {
        this(i10, notification, 0);
    }

    public C4362j(int i10, Notification notification, int i11) {
        this.f23189a = i10;
        this.f23191c = notification;
        this.f23190b = i11;
    }

    public int a() {
        return this.f23190b;
    }

    public Notification b() {
        return this.f23191c;
    }

    public int c() {
        return this.f23189a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4362j.class != obj.getClass()) {
            return false;
        }
        C4362j c4362j = (C4362j) obj;
        if (this.f23189a == c4362j.f23189a && this.f23190b == c4362j.f23190b) {
            return this.f23191c.equals(c4362j.f23191c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f23189a * 31) + this.f23190b) * 31) + this.f23191c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f23189a + ", mForegroundServiceType=" + this.f23190b + ", mNotification=" + this.f23191c + '}';
    }
}
