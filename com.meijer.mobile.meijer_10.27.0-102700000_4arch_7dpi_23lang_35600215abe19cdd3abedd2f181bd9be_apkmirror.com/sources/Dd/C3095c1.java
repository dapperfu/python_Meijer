package Dd;

import com.google.android.gms.common.api.a;

/* renamed from: Dd.c1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3095c1 {

    /* renamed from: a, reason: collision with root package name */
    private C3131f1 f6015a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f6016b;

    /* renamed from: c, reason: collision with root package name */
    private C3364z6 f6017c;

    public final C3095c1 b(C3364z6 c3364z6) {
        this.f6017c = c3364z6;
        return this;
    }

    public final C3095c1 c(C3131f1 c3131f1) {
        this.f6015a = c3131f1;
        return this;
    }

    public final C3155h1 e() {
        return new C3155h1(this, null);
    }

    public final C3095c1 a(Integer num) {
        this.f6016b = Integer.valueOf(num.intValue() & a.e.API_PRIORITY_OTHER);
        return this;
    }
}
