package sa;

import g9.AbstractC14340a;
import java.util.Arrays;

/* renamed from: sa.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17034a extends AbstractC14340a {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f160099a;

    /* renamed from: b, reason: collision with root package name */
    private final String f160100b;

    private String h(String[] strArr) {
        StringBuilder sb2 = new StringBuilder("campaign_id IN (?");
        for (int i10 = 1; i10 < strArr.length; i10++) {
            sb2.append(", ?");
        }
        sb2.append(")");
        return sb2.toString();
    }

    @Override // g9.AbstractC14340a, g9.d
    public String K() {
        return this.f160100b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f160099a, ((C17034a) obj).f160099a);
    }

    @Override // g9.AbstractC14340a, g9.d
    public String[] f() {
        return this.f160099a;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f160099a);
    }

    public C17034a(String... strArr) {
        this.f160099a = strArr;
        this.f160100b = h(strArr);
    }
}
