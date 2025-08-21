package rb;

import Db.l;
import Nb.i;
import xb.C18150d;

/* renamed from: rb.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16878a {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f159442d = {-111, 99, 52, 39, -119, -108, 120, 83, -111, 100, 52, 39, -119, -108, 120, 83};

    /* renamed from: a, reason: collision with root package name */
    public l f159443a;

    /* renamed from: b, reason: collision with root package name */
    public C18150d f159444b = new C18150d();

    /* renamed from: c, reason: collision with root package name */
    public i f159445c = new C2481a("123");

    /* renamed from: rb.a$a, reason: collision with other inner class name */
    final class C2481a extends i {
        C2481a(String str) {
            super(str);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // Nb.i
        public final byte[] a() {
            return C16878a.f159442d;
        }
    }

    public C16878a(l lVar) throws Exception {
        this.f159443a = lVar;
    }
}
