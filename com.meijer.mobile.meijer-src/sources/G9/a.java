package G9;

import I9.c;
import g9.AbstractC14340a;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class a extends AbstractC14340a {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f11227a;

    /* renamed from: b, reason: collision with root package name */
    private final String f11228b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            if (!Arrays.equals(this.f11227a, aVar.f11227a)) {
                return false;
            }
            String str = this.f11228b;
            String str2 = aVar.f11228b;
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
        return this.f11228b;
    }

    @Override // g9.AbstractC14340a, g9.d
    public String[] f() {
        return this.f11227a;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.f11227a) * 31;
        String str = this.f11228b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public a(List<F9.a> list) {
        I9.b.c(list, "ShardModels must not be null!");
        String[] strArrH = h(list);
        this.f11227a = strArrH;
        this.f11228b = c.a("shard_id", strArrH);
    }

    private String[] h(List<F9.a> list) {
        String[] strArr = new String[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            strArr[i10] = list.get(i10).b();
        }
        return strArr;
    }
}
