package Q3;

import com.fullstory.Reason;
import x3.J;

/* loaded from: classes4.dex */
interface g extends J {

    public static class a extends J.b implements g {
        @Override // Q3.g
        public long f() {
            return -1L;
        }

        @Override // Q3.g
        public long h(long j10) {
            return 0L;
        }

        @Override // Q3.g
        public int k() {
            return Reason.OS_VERSION_TOO_LOW;
        }

        public a() {
            super(-9223372036854775807L);
        }
    }

    long f();

    long h(long j10);

    int k();
}
