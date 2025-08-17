package Ob;

/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private Long f23493a;

    /* renamed from: b, reason: collision with root package name */
    private Long f23494b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        Long l10 = this.f23493a;
        if (l10 == null) {
            if (eVar.f23493a != null) {
                return false;
            }
        } else if (!l10.equals(eVar.f23493a)) {
            return false;
        }
        Long l11 = this.f23494b;
        if (l11 == null) {
            if (eVar.f23494b != null) {
                return false;
            }
        } else if (!l11.equals(eVar.f23494b)) {
            return false;
        }
        return true;
    }

    public void a(Long l10) {
        this.f23493a = l10;
    }

    public void b(Long l10) {
        this.f23494b = l10;
    }

    public int hashCode() {
        Long l10 = this.f23493a;
        int iHashCode = ((l10 == null ? 0 : l10.hashCode()) + 31) * 31;
        Long l11 = this.f23494b;
        return iHashCode + (l11 != null ? l11.hashCode() : 0);
    }

    public String toString() {
        return String.format("InstanceStatus [enabledAt=%s, permittedAt=%s]", this.f23493a, this.f23494b);
    }
}
