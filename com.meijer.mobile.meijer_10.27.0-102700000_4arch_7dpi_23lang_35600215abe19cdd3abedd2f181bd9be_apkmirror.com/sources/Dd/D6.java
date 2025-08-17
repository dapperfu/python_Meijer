package Dd;

import com.google.android.gms.common.api.a;

/* loaded from: classes6.dex */
public final class D6 {

    /* renamed from: a, reason: collision with root package name */
    private E6 f5187a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f5188b;

    public final D6 a(E6 e62) {
        this.f5187a = e62;
        return this;
    }

    public final G6 d() {
        return new G6(this, null);
    }

    public final D6 b(Integer num) {
        this.f5188b = Integer.valueOf(num.intValue() & a.e.API_PRIORITY_OTHER);
        return this;
    }
}
