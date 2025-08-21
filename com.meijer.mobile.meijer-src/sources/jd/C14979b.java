package jd;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.internal.C6660q;

/* renamed from: jd.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14979b<O extends a.d> {

    /* renamed from: a, reason: collision with root package name */
    private final int f140298a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.api.a f140299b;

    /* renamed from: c, reason: collision with root package name */
    private final a.d f140300c;

    /* renamed from: d, reason: collision with root package name */
    private final String f140301d;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14979b)) {
            return false;
        }
        C14979b c14979b = (C14979b) obj;
        return C6660q.a(this.f140299b, c14979b.f140299b) && C6660q.a(this.f140300c, c14979b.f140300c) && C6660q.a(this.f140301d, c14979b.f140301d);
    }

    public static <O extends a.d> C14979b<O> a(com.google.android.gms.common.api.a<O> aVar, O o10, String str) {
        return new C14979b<>(aVar, o10, str);
    }

    public final String b() {
        return this.f140299b.c();
    }

    public final int hashCode() {
        return this.f140298a;
    }

    private C14979b(com.google.android.gms.common.api.a aVar, a.d dVar, String str) {
        this.f140299b = aVar;
        this.f140300c = dVar;
        this.f140301d = str;
        this.f140298a = C6660q.b(aVar, dVar, str);
    }
}
