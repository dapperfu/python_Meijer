package Q5;

import java.util.Date;
import java.util.UUID;

/* renamed from: Q5.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5072d {

    /* renamed from: a, reason: collision with root package name */
    private final String f29806a;

    /* renamed from: b, reason: collision with root package name */
    private final Date f29807b;

    /* renamed from: c, reason: collision with root package name */
    private final String f29808c;

    public C5072d(String str) {
        this(UUID.randomUUID().toString(), new Date(), str);
    }

    public C5072d(String str, Date date, String str2) {
        this.f29806a = str;
        this.f29807b = date;
        this.f29808c = str2;
    }

    public String a() {
        return this.f29808c;
    }

    public Date b() {
        return this.f29807b;
    }

    public String c() {
        return this.f29806a;
    }

    public String toString() {
        return "DataEntity{uniqueIdentifier='" + this.f29806a + "', timeStamp=" + this.f29807b + ", data=" + this.f29808c + '}';
    }
}
