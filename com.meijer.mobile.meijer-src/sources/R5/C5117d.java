package R5;

import java.util.Date;
import java.util.UUID;

/* renamed from: R5.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C5117d {

    /* renamed from: a, reason: collision with root package name */
    private final String f31917a;

    /* renamed from: b, reason: collision with root package name */
    private final Date f31918b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31919c;

    public C5117d(String str) {
        this(UUID.randomUUID().toString(), new Date(), str);
    }

    public C5117d(String str, Date date, String str2) {
        this.f31917a = str;
        this.f31918b = date;
        this.f31919c = str2;
    }

    public String a() {
        return this.f31919c;
    }

    public Date b() {
        return this.f31918b;
    }

    public String c() {
        return this.f31917a;
    }

    public String toString() {
        return "DataEntity{uniqueIdentifier='" + this.f31917a + "', timeStamp=" + this.f31918b + ", data=" + this.f31919c + '}';
    }
}
