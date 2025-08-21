package Rf;

import Gf.d;
import com.google.firebase.messaging.M;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static final b f32549b = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final Rf.a f32550a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Rf.a f32551a = null;

        public b a() {
            return new b(this.f32551a);
        }

        public a b(Rf.a aVar) {
            this.f32551a = aVar;
            return this;
        }

        a() {
        }
    }

    public static a b() {
        return new a();
    }

    @d(tag = 1)
    public Rf.a a() {
        return this.f32550a;
    }

    b(Rf.a aVar) {
        this.f32550a = aVar;
    }

    public byte[] c() {
        return M.a(this);
    }
}
