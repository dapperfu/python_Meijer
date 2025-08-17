package Ob;

import android.location.Location;
import java.util.UUID;

/* loaded from: classes4.dex */
public class c implements Nb.a {

    /* renamed from: a, reason: collision with root package name */
    private String f23483a;

    /* renamed from: b, reason: collision with root package name */
    private d f23484b;

    public static c a(Location location) {
        c cVar = new c();
        cVar.e(UUID.randomUUID().toString());
        cVar.d(d.a(location));
        return cVar;
    }

    public d b() {
        return this.f23484b;
    }

    public String c() {
        return this.f23483a;
    }

    public void d(d dVar) {
        this.f23484b = dVar;
    }

    public void e(String str) {
        this.f23483a = str;
    }

    public String toString() {
        return "BCFix{id='" + this.f23483a + "', fix=" + this.f23484b + '}';
    }
}
