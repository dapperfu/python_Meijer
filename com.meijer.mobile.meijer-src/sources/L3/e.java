package L3;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class e extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f17989b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17990c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17991d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f17990c, eVar.f17990c) && Objects.equals(this.f17989b, eVar.f17989b) && Objects.equals(this.f17991d, eVar.f17991d)) {
                return true;
            }
        }
        return false;
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f17989b = str;
        this.f17990c = str2;
        this.f17991d = str3;
    }

    public int hashCode() {
        String str = this.f17989b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17990c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f17991d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // L3.i
    public String toString() {
        return this.f18001a + ": language=" + this.f17989b + ", description=" + this.f17990c + ", text=" + this.f17991d;
    }
}
