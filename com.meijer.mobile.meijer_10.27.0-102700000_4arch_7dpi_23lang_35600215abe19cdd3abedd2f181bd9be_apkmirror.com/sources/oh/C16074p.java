package oh;

import java.util.concurrent.ThreadLocalRandom;

/* renamed from: oh.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C16074p {
    public static boolean a(long j10) {
        if (j10 == 1) {
            return true;
        }
        return j10 != 0 && ThreadLocalRandom.current().nextLong(j10) == 0;
    }
}
