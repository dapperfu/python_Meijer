package Ye;

import Ke.C;
import Xe.p;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final a f43046a;

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
        return this.f43046a.c();
    }

    public byte[] d(C c10) {
        if (c10 != null) {
            return this.f43046a.d();
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    private b(a aVar) {
        this.f43046a = aVar;
    }
}
