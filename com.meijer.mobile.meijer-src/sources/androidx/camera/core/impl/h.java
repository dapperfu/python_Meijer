package androidx.camera.core.impl;

import C.P;
import C.a0;
import F.p0;
import F.y0;
import androidx.camera.core.impl.CameraValidator;

/* loaded from: classes.dex */
public final class h implements p0 {

    /* renamed from: d, reason: collision with root package name */
    private final a0 f47620d;

    class a implements a0 {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f47621d;

        a(long j10) {
            this.f47621d = j10;
        }

        @Override // C.a0
        public long a() {
            return this.f47621d;
        }

        @Override // C.a0
        public a0.c b(a0.b bVar) {
            if (bVar.a() == 1) {
                return a0.c.f3803d;
            }
            return a0.c.f3804e;
        }
    }

    public static final class b implements p0 {

        /* renamed from: d, reason: collision with root package name */
        private final a0 f47623d;

        @Override // C.a0
        public long a() {
            return this.f47623d.a();
        }

        @Override // C.a0
        public a0.c b(a0.b bVar) {
            if (this.f47623d.b(bVar).d()) {
                return a0.c.f3804e;
            }
            Throwable thB = bVar.b();
            if (thB instanceof CameraValidator.CameraIdListIncorrectException) {
                P.c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                if (((CameraValidator.CameraIdListIncorrectException) thB).a() > 0) {
                    return a0.c.f3806g;
                }
            }
            return a0.c.f3803d;
        }

        @Override // F.p0
        public a0 c(long j10) {
            return new b(j10);
        }

        public b(long j10) {
            this.f47623d = new h(j10);
        }
    }

    @Override // C.a0
    public long a() {
        return this.f47620d.a();
    }

    @Override // C.a0
    public a0.c b(a0.b bVar) {
        return this.f47620d.b(bVar);
    }

    @Override // F.p0
    public a0 c(long j10) {
        return new h(j10);
    }

    public h(long j10) {
        this.f47620d = new y0(j10, new a(j10));
    }
}
