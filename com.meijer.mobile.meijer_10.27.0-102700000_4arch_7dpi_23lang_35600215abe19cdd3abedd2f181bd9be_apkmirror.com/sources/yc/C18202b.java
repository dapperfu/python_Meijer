package yc;

import java.util.Map;
import pc.EnumC16282f;
import yc.f;

/* renamed from: yc.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
final class C18202b extends f {

    /* renamed from: a, reason: collision with root package name */
    private final Bc.a f170384a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<EnumC16282f, f.b> f170385b;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f170384a.equals(fVar.e()) && this.f170385b.equals(fVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // yc.f
    Bc.a e() {
        return this.f170384a;
    }

    @Override // yc.f
    Map<EnumC16282f, f.b> h() {
        return this.f170385b;
    }

    public int hashCode() {
        return ((this.f170384a.hashCode() ^ 1000003) * 1000003) ^ this.f170385b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f170384a + ", values=" + this.f170385b + "}";
    }

    C18202b(Bc.a aVar, Map<EnumC16282f, f.b> map) {
        if (aVar != null) {
            this.f170384a = aVar;
            if (map != null) {
                this.f170385b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }
}
