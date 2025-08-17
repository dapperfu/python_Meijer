package We;

import Ie.C;
import Ve.p;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final a f38647a;

    public static b a(byte[] bArr, C c10) {
        if (c10 != null) {
            return new b(a.a(bArr));
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public static b b(int i10) {
        return new b(a.a(p.a(i10)));
    }

    public int c() {
        return this.f38647a.c();
    }

    public byte[] d(C c10) {
        if (c10 != null) {
            return this.f38647a.d();
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    private b(a aVar) {
        this.f38647a = aVar;
    }
}
