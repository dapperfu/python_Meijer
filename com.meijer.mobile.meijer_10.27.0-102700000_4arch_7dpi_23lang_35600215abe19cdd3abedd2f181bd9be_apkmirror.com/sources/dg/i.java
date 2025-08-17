package dg;

/* loaded from: classes7.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final long f127383a;

    /* renamed from: b, reason: collision with root package name */
    private final long f127384b;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private long f127385a = 60;

        /* renamed from: b, reason: collision with root package name */
        private long f127386b = com.google.firebase.remoteconfig.internal.m.f89246j;

        public i c() {
            return new i(this);
        }

        public b d(long j10) throws IllegalArgumentException {
            if (j10 < 0) {
                throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", Long.valueOf(j10)));
            }
            this.f127385a = j10;
            return this;
        }

        public b e(long j10) {
            if (j10 >= 0) {
                this.f127386b = j10;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j10 + " is an invalid argument");
        }
    }

    private i(b bVar) {
        this.f127383a = bVar.f127385a;
        this.f127384b = bVar.f127386b;
    }
}
