package G9;

import g9.AbstractC14340a;

/* loaded from: classes4.dex */
public class b extends AbstractC14340a {

    /* renamed from: a, reason: collision with root package name */
    private final String f11229a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            String str = this.f11229a;
            String str2 = ((b) obj).f11229a;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // g9.AbstractC14340a, g9.d
    public String K() {
        return "type LIKE ?";
    }

    @Override // g9.AbstractC14340a, g9.d
    public String b() {
        return "ROWID ASC";
    }

    @Override // g9.AbstractC14340a, g9.d
    public String[] f() {
        return new String[]{this.f11229a};
    }

    public int hashCode() {
        String str = this.f11229a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public b(String str) {
        I9.b.c(str, "Type must not be null!");
        this.f11229a = str;
    }
}
