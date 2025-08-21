package Tg;

import com.google.maps.android.BuildConfig;
import java.util.Objects;

/* loaded from: classes8.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Sg.b f36224a;

    /* renamed from: b, reason: collision with root package name */
    private final Sg.b f36225b;

    /* renamed from: c, reason: collision with root package name */
    private final Sg.c f36226c;

    Sg.c a() {
        return this.f36226c;
    }

    Sg.b b() {
        return this.f36224a;
    }

    Sg.b c() {
        return this.f36225b;
    }

    boolean d() {
        return this.f36225b == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f36224a, bVar.f36224a) && Objects.equals(this.f36225b, bVar.f36225b) && Objects.equals(this.f36226c, bVar.f36226c);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f36224a) ^ Objects.hashCode(this.f36225b)) ^ Objects.hashCode(this.f36226c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[ ");
        sb2.append(this.f36224a);
        sb2.append(" , ");
        sb2.append(this.f36225b);
        sb2.append(" : ");
        Sg.c cVar = this.f36226c;
        sb2.append(cVar == null ? BuildConfig.TRAVIS : Integer.valueOf(cVar.c()));
        sb2.append(" ]");
        return sb2.toString();
    }

    b(Sg.b bVar, Sg.b bVar2, Sg.c cVar) {
        this.f36224a = bVar;
        this.f36225b = bVar2;
        this.f36226c = cVar;
    }
}
