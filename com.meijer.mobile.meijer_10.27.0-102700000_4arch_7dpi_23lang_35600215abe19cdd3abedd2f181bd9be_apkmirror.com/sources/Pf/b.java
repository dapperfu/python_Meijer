package Pf;

import Ef.d;
import com.google.firebase.messaging.K;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final b f25335b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final Pf.a f25336a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Pf.a f25337a = null;

        public b a() {
            return new b(this.f25337a);
        }

        public a b(Pf.a aVar) {
            this.f25337a = aVar;
            return this;
        }

        a() {
        }
    }

    public static a b() {
        return new a();
    }

    @d(tag = 1)
    public Pf.a a() {
        return this.f25336a;
    }

    b(Pf.a aVar) {
        this.f25336a = aVar;
    }

    public byte[] c() {
        return K.a(this);
    }
}
