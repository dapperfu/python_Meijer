package j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes3.dex */
public final class a extends Clock implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f138732b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* renamed from: a, reason: collision with root package name */
    public final ZoneId f138733a;

    public a(ZoneId zoneId) {
        this.f138733a = zoneId;
    }

    static {
        System.currentTimeMillis();
        f138732b = new a(ZoneOffset.UTC);
    }

    @Override // j$.time.Clock
    public final ZoneId getZone() {
        return this.f138733a;
    }

    @Override // j$.time.Clock
    public final Instant a() {
        return Instant.ofEpochMilli(System.currentTimeMillis());
    }

    @Override // j$.time.Clock
    public final long b() {
        return System.currentTimeMillis();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f138733a.equals(((a) obj).f138733a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f138733a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f138733a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
}
