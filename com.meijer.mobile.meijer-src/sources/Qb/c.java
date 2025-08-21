package Qb;

import android.location.Location;
import java.util.UUID;

/* loaded from: classes4.dex */
public class c implements Pb.a {

    /* renamed from: a, reason: collision with root package name */
    private String f27971a;

    /* renamed from: b, reason: collision with root package name */
    private d f27972b;

    public static c a(Location location) {
        c cVar = new c();
        cVar.e(UUID.randomUUID().toString());
        cVar.d(d.a(location));
        return cVar;
    }

    public d b() {
        return this.f27972b;
    }

    public String c() {
        return this.f27971a;
    }

    public void d(d dVar) {
        this.f27972b = dVar;
    }

    public void e(String str) {
        this.f27971a = str;
    }

    public String toString() {
        return "BCFix{id='" + this.f27971a + "', fix=" + this.f27972b + '}';
    }
}
