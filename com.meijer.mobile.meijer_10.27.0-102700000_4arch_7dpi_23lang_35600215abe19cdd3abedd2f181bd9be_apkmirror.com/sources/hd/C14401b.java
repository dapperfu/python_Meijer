package hd;

import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.internal.C6535q;

/* renamed from: hd.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14401b<O extends a.d> {

    /* renamed from: a, reason: collision with root package name */
    private final int f134609a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.api.a f134610b;

    /* renamed from: c, reason: collision with root package name */
    private final a.d f134611c;

    /* renamed from: d, reason: collision with root package name */
    private final String f134612d;

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C14401b)) {
            return false;
        }
        C14401b c14401b = (C14401b) obj;
        return C6535q.a(this.f134610b, c14401b.f134610b) && C6535q.a(this.f134611c, c14401b.f134611c) && C6535q.a(this.f134612d, c14401b.f134612d);
    }

    public static <O extends a.d> C14401b<O> a(com.google.android.gms.common.api.a<O> aVar, O o10, String str) {
        return new C14401b<>(aVar, o10, str);
    }

    public final String b() {
        return this.f134610b.c();
    }

    public final int hashCode() {
        return this.f134609a;
    }

    private C14401b(com.google.android.gms.common.api.a aVar, a.d dVar, String str) {
        this.f134610b = aVar;
        this.f134611c = dVar;
        this.f134612d = str;
        this.f134609a = C6535q.b(aVar, dVar, str);
    }
}
