package F;

import G.h;
import android.hardware.camera2.CaptureResult;

/* loaded from: classes.dex */
public interface r {

    public static final class a implements r {
        @Override // F.r
        public CaptureResult e() {
            return null;
        }

        public static r k() {
            return new a();
        }

        @Override // F.r
        public EnumC3282q c() {
            return EnumC3282q.UNKNOWN;
        }

        @Override // F.r
        public EnumC3280o d() {
            return EnumC3280o.UNKNOWN;
        }

        @Override // F.r
        public EnumC3276k f() {
            return EnumC3276k.UNKNOWN;
        }

        @Override // F.r
        public EnumC3279n g() {
            return EnumC3279n.UNKNOWN;
        }

        @Override // F.r
        public long getTimestamp() {
            return -1L;
        }

        @Override // F.r
        public EnumC3281p h() {
            return EnumC3281p.UNKNOWN;
        }

        @Override // F.r
        public EnumC3278m i() {
            return EnumC3278m.UNKNOWN;
        }

        @Override // F.r
        public EnumC3277l j() {
            return EnumC3277l.UNKNOWN;
        }

        @Override // F.r
        public x0 a() {
            return x0.b();
        }
    }

    x0 a();

    EnumC3282q c();

    EnumC3280o d();

    default CaptureResult e() {
        return null;
    }

    EnumC3276k f();

    EnumC3279n g();

    long getTimestamp();

    EnumC3281p h();

    EnumC3278m i();

    EnumC3277l j();

    default void b(h.b bVar) {
        bVar.g(c());
    }
}
