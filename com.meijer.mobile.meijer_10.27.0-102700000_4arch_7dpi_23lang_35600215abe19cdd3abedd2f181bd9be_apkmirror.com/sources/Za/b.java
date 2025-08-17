package Za;

import java.util.TimeZone;

/* loaded from: classes4.dex */
public final class b implements e {
    @Override // Za.e
    public final long a() {
        return System.currentTimeMillis();
    }

    @Override // Za.e
    public final TimeZone b() {
        return TimeZone.getDefault();
    }
}
