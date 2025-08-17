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
        public EnumC3620q c() {
            return EnumC3620q.UNKNOWN;
        }

        @Override // F.r
        public EnumC3618o d() {
            return EnumC3618o.UNKNOWN;
        }

        @Override // F.r
        public EnumC3614k f() {
            return EnumC3614k.UNKNOWN;
        }

        @Override // F.r
        public EnumC3617n g() {
            return EnumC3617n.UNKNOWN;
        }

        @Override // F.r
        public long getTimestamp() {
            return -1L;
        }

        @Override // F.r
        public EnumC3619p h() {
            return EnumC3619p.UNKNOWN;
        }

        @Override // F.r
        public EnumC3616m i() {
            return EnumC3616m.UNKNOWN;
        }

        @Override // F.r
        public EnumC3615l j() {
            return EnumC3615l.UNKNOWN;
        }

        @Override // F.r
        public x0 a() {
            return x0.b();
        }
    }

    x0 a();

    EnumC3620q c();

    EnumC3618o d();

    default CaptureResult e() {
        return null;
    }

    EnumC3614k f();

    EnumC3617n g();

    long getTimestamp();

    EnumC3619p h();

    EnumC3616m i();

    EnumC3615l j();

    default void b(h.b bVar) {
        bVar.g(c());
    }
}
