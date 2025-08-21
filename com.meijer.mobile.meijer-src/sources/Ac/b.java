package Ac;

import Ac.f;
import java.util.Map;
import rc.EnumC16886f;

/* loaded from: classes4.dex */
final class b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Dc.a f233a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<EnumC16886f, f.b> f234b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f233a.equals(fVar.e()) && this.f234b.equals(fVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // Ac.f
    Dc.a e() {
        return this.f233a;
    }

    @Override // Ac.f
    Map<EnumC16886f, f.b> h() {
        return this.f234b;
    }

    public int hashCode() {
        return ((this.f233a.hashCode() ^ 1000003) * 1000003) ^ this.f234b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f233a + ", values=" + this.f234b + "}";
    }

    b(Dc.a aVar, Map<EnumC16886f, f.b> map) {
        if (aVar != null) {
            this.f233a = aVar;
            if (map != null) {
                this.f234b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }
}
