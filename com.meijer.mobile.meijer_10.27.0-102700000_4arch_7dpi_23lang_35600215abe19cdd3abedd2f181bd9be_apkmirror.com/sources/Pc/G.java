package Pc;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private final List f25098a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f25099b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List f25100c = new ArrayList();

    public final G a(String str, double d10, double d11) {
        int i10 = 0;
        while (i10 < this.f25098a.size()) {
            double dDoubleValue = ((Double) this.f25100c.get(i10)).doubleValue();
            double dDoubleValue2 = ((Double) this.f25099b.get(i10)).doubleValue();
            if (d10 < dDoubleValue || (dDoubleValue == d10 && d11 < dDoubleValue2)) {
                break;
            }
            i10++;
        }
        this.f25098a.add(i10, str);
        this.f25100c.add(i10, Double.valueOf(d10));
        this.f25099b.add(i10, Double.valueOf(d11));
        return this;
    }

    public final I b() {
        return new I(this, null);
    }
}
