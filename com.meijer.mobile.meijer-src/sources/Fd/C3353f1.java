package Fd;

import com.google.android.gms.common.internal.C6660q;

/* renamed from: Fd.f1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3353f1 {

    /* renamed from: a, reason: collision with root package name */
    private final Y6 f10078a;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f10080c;

    /* renamed from: e, reason: collision with root package name */
    private final C3556w9 f10082e;

    /* renamed from: f, reason: collision with root package name */
    private final AbstractC3400j0 f10083f;

    /* renamed from: g, reason: collision with root package name */
    private final AbstractC3400j0 f10084g;

    /* renamed from: b, reason: collision with root package name */
    private final Boolean f10079b = null;

    /* renamed from: d, reason: collision with root package name */
    private final G6 f10081d = null;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3353f1)) {
            return false;
        }
        C3353f1 c3353f1 = (C3353f1) obj;
        return C6660q.a(this.f10078a, c3353f1.f10078a) && C6660q.a(null, null) && C6660q.a(this.f10080c, c3353f1.f10080c) && C6660q.a(null, null) && C6660q.a(this.f10082e, c3353f1.f10082e) && C6660q.a(this.f10083f, c3353f1.f10083f) && C6660q.a(this.f10084g, c3353f1.f10084g);
    }

    @Q0(zza = 6)
    public final AbstractC3400j0 a() {
        return this.f10083f;
    }

    @Q0(zza = 7)
    public final AbstractC3400j0 b() {
        return this.f10084g;
    }

    @Q0(zza = 1)
    public final Y6 c() {
        return this.f10078a;
    }

    @Q0(zza = 5)
    public final C3556w9 d() {
        return this.f10082e;
    }

    @Q0(zza = 3)
    public final Boolean e() {
        return this.f10080c;
    }

    public final int hashCode() {
        return C6660q.b(this.f10078a, null, this.f10080c, null, this.f10082e, this.f10083f, this.f10084g);
    }

    /* synthetic */ C3353f1(C3329d1 c3329d1, C3341e1 c3341e1) {
        this.f10078a = c3329d1.f10062a;
        this.f10080c = c3329d1.f10063b;
        this.f10082e = c3329d1.f10064c;
        this.f10083f = c3329d1.f10065d;
        this.f10084g = c3329d1.f10066e;
    }
}
