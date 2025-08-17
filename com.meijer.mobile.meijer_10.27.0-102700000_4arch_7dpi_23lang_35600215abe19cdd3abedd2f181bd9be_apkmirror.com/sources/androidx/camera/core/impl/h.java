package androidx.camera.core.impl;

import C.P;
import C.a0;
import F.p0;
import F.y0;
import androidx.camera.core.impl.CameraValidator;

/* loaded from: classes.dex */
public final class h implements p0 {

    /* renamed from: d, reason: collision with root package name */
    private final a0 f47396d;

    class a implements a0 {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ long f47397d;

        a(long j10) {
            this.f47397d = j10;
        }

        @Override // C.a0
        public long a() {
            return this.f47397d;
        }

        @Override // C.a0
        public a0.c b(a0.b bVar) {
            if (bVar.a() == 1) {
                return a0.c.f3345d;
            }
            return a0.c.f3346e;
        }
    }

    public static final class b implements p0 {

        /* renamed from: d, reason: collision with root package name */
        private final a0 f47399d;

        @Override // C.a0
        public long a() {
            return this.f47399d.a();
        }

        @Override // C.a0
        public a0.c b(a0.b bVar) {
            if (this.f47399d.b(bVar).d()) {
                return a0.c.f3346e;
            }
            Throwable thB = bVar.b();
            if (thB instanceof CameraValidator.CameraIdListIncorrectException) {
                P.c("CameraX", "The device might underreport the amount of the cameras. Finish the initialize task since we are already reaching the maximum number of retries.");
                if (((CameraValidator.CameraIdListIncorrectException) thB).a() > 0) {
                    return a0.c.f3348g;
                }
            }
            return a0.c.f3345d;
        }

        @Override // F.p0
        public a0 c(long j10) {
            return new b(j10);
        }

        public b(long j10) {
            this.f47399d = new h(j10);
        }
    }

    @Override // C.a0
    public long a() {
        return this.f47396d.a();
    }

    @Override // C.a0
    public a0.c b(a0.b bVar) {
        return this.f47396d.b(bVar);
    }

    @Override // F.p0
    public a0 c(long j10) {
        return new h(j10);
    }

    public h(long j10) {
        this.f47396d = new y0(j10, new a(j10));
    }
}
