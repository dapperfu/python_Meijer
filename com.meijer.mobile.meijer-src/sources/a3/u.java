package a3;

import d3.P;
import java.util.Objects;

/* loaded from: classes.dex */
public class u {

    /* renamed from: c, reason: collision with root package name */
    private static final String f44818c = P.y0(0);

    /* renamed from: d, reason: collision with root package name */
    private static final String f44819d = P.y0(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f44820a;

    /* renamed from: b, reason: collision with root package name */
    public final String f44821b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            u uVar = (u) obj;
            if (Objects.equals(this.f44820a, uVar.f44820a) && Objects.equals(this.f44821b, uVar.f44821b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f44821b.hashCode() * 31;
        String str = this.f44820a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public u(String str, String str2) {
        this.f44820a = P.P0(str);
        this.f44821b = str2;
    }
}
