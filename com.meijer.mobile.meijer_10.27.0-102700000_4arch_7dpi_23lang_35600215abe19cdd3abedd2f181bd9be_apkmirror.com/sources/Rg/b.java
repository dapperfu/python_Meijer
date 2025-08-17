package Rg;

import com.google.maps.android.BuildConfig;
import java.util.Objects;

/* loaded from: classes7.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Qg.b f32224a;

    /* renamed from: b, reason: collision with root package name */
    private final Qg.b f32225b;

    /* renamed from: c, reason: collision with root package name */
    private final Qg.c f32226c;

    Qg.c a() {
        return this.f32226c;
    }

    Qg.b b() {
        return this.f32224a;
    }

    Qg.b c() {
        return this.f32225b;
    }

    boolean d() {
        return this.f32225b == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f32224a, bVar.f32224a) && Objects.equals(this.f32225b, bVar.f32225b) && Objects.equals(this.f32226c, bVar.f32226c);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f32224a) ^ Objects.hashCode(this.f32225b)) ^ Objects.hashCode(this.f32226c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[ ");
        sb2.append(this.f32224a);
        sb2.append(" , ");
        sb2.append(this.f32225b);
        sb2.append(" : ");
        Qg.c cVar = this.f32226c;
        sb2.append(cVar == null ? BuildConfig.TRAVIS : Integer.valueOf(cVar.c()));
        sb2.append(" ]");
        return sb2.toString();
    }

    b(Qg.b bVar, Qg.b bVar2, Qg.c cVar) {
        this.f32224a = bVar;
        this.f32225b = bVar2;
        this.f32226c = cVar;
    }
}
