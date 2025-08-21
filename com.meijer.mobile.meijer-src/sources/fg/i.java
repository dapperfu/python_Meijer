package fg;

/* loaded from: classes8.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final long f131712a;

    /* renamed from: b, reason: collision with root package name */
    private final long f131713b;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f131714a = 60;

        /* renamed from: b, reason: collision with root package name */
        private long f131715b = com.google.firebase.remoteconfig.internal.m.f90088j;

        public i c() {
            return new i(this);
        }

        public b d(long j10) throws IllegalArgumentException {
            if (j10 < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
            }
            this.f131714a = j10;
            return this;
        }

        public b e(long j10) {
            if (j10 >= 0) {
                this.f131715b = j10;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j10 + " is an invalid argument");
        }
    }

    private i(b bVar) {
        this.f131712a = bVar.f131714a;
        this.f131713b = bVar.f131715b;
    }
}
