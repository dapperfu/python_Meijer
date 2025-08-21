package Fd;

import com.google.android.gms.common.api.a;

/* renamed from: Fd.c1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3317c1 {

    /* renamed from: a, reason: collision with root package name */
    private C3353f1 f10048a;

    /* renamed from: b, reason: collision with root package name */
    private Integer f10049b;

    /* renamed from: c, reason: collision with root package name */
    private C3586z6 f10050c;

    public final C3317c1 b(C3586z6 c3586z6) {
        this.f10050c = c3586z6;
        return this;
    }

    public final C3317c1 c(C3353f1 c3353f1) {
        this.f10048a = c3353f1;
        return this;
    }

    public final C3377h1 e() {
        return new C3377h1(this, null);
    }

    public final C3317c1 a(Integer num) {
        this.f10049b = Integer.valueOf(num.intValue() & a.e.API_PRIORITY_OTHER);
        return this;
    }
}
