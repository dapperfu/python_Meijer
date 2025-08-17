package qa;

import e9.AbstractC13636a;
import java.util.Arrays;

/* renamed from: qa.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C16486a extends AbstractC13636a {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f156984a;

    /* renamed from: b, reason: collision with root package name */
    private final String f156985b;

    private String h(String[] strArr) {
        StringBuilder sb2 = new StringBuilder("campaign_id IN (?");
        for (int i10 = 1; i10 < strArr.length; i10++) {
            sb2.append(", ?");
        }
        sb2.append(")");
        return sb2.toString();
    }

    @Override // e9.AbstractC13636a, e9.d
    public String K() {
        return this.f156985b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f156984a, ((C16486a) obj).f156984a);
    }

    @Override // e9.AbstractC13636a, e9.d
    public String[] f() {
        return this.f156984a;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f156984a);
    }

    public C16486a(String... strArr) {
        this.f156984a = strArr;
        this.f156985b = h(strArr);
    }
}
