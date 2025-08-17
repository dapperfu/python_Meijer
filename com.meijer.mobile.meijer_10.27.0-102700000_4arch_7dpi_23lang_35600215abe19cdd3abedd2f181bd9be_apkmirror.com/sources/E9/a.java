package E9;

import G9.c;
import e9.AbstractC13636a;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class a extends AbstractC13636a {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f7675a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7676b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            a aVar = (a) obj;
            if (!Arrays.equals(this.f7675a, aVar.f7675a)) {
                return false;
            }
            String str = this.f7676b;
            String str2 = aVar.f7676b;
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
        return this.f7676b;
    }

    @Override // e9.AbstractC13636a, e9.d
    public String[] f() {
        return this.f7675a;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.f7675a) * 31;
        String str = this.f7676b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public a(List<D9.a> list) {
        G9.b.c(list, "ShardModels must not be null!");
        String[] strArrH = h(list);
        this.f7675a = strArrH;
        this.f7676b = c.a("shard_id", strArrH);
    }

    private String[] h(List<D9.a> list) {
        String[] strArr = new String[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            strArr[i10] = list.get(i10).b();
        }
        return strArr;
    }
}
