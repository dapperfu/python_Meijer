package ph;

import java.util.concurrent.ThreadLocalRandom;

/* renamed from: ph.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C16439p {
    public static boolean a(long j10) {
        if (j10 == 1) {
            return true;
        }
        return j10 != 0 && ThreadLocalRandom.current().nextLong(j10) == 0;
    }
}
