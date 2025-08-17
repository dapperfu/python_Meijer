package E9;

import e9.AbstractC13636a;

/* loaded from: classes4.dex */
public class b extends AbstractC13636a {

    /* renamed from: a, reason: collision with root package name */
    private final String f7677a;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            String str = this.f7677a;
            String str2 = ((b) obj).f7677a;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // e9.AbstractC13636a, e9.d
    public String K() {
        return "type LIKE ?";
    }

    @Override // e9.AbstractC13636a, e9.d
    public String b() {
        return "ROWID ASC";
    }

    @Override // e9.AbstractC13636a, e9.d
    public String[] f() {
        return new String[]{this.f7677a};
    }

    public int hashCode() {
        String str = this.f7677a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public b(String str) {
        G9.b.c(str, "Type must not be null!");
        this.f7677a = str;
    }
}
