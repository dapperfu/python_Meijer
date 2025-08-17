package L3;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class e extends i {

    /* renamed from: b, reason: collision with root package name */
    public final String f17842b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17843c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17844d;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (Objects.equals(this.f17843c, eVar.f17843c) && Objects.equals(this.f17842b, eVar.f17842b) && Objects.equals(this.f17844d, eVar.f17844d)) {
                return true;
            }
        }
        return false;
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f17842b = str;
        this.f17843c = str2;
        this.f17844d = str3;
    }

    public int hashCode() {
        String str = this.f17842b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f17843c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f17844d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // L3.i
    public String toString() {
        return this.f17854a + ": language=" + this.f17842b + ", description=" + this.f17843c + ", text=" + this.f17844d;
    }
}
