package androidx.media3.common;

import android.os.Bundle;
import d3.P;

/* loaded from: classes.dex */
public class PlaybackException extends Exception {

    /* renamed from: d, reason: collision with root package name */
    private static final String f55552d = P.y0(0);

    /* renamed from: e, reason: collision with root package name */
    private static final String f55553e = P.y0(1);

    /* renamed from: f, reason: collision with root package name */
    private static final String f55554f = P.y0(2);

    /* renamed from: g, reason: collision with root package name */
    private static final String f55555g = P.y0(3);

    /* renamed from: h, reason: collision with root package name */
    private static final String f55556h = P.y0(4);

    /* renamed from: i, reason: collision with root package name */
    private static final String f55557i = P.y0(5);

    /* renamed from: a, reason: collision with root package name */
    public final int f55558a;

    /* renamed from: b, reason: collision with root package name */
    public final long f55559b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f55560c;

    protected PlaybackException(String str, Throwable th2, int i10, Bundle bundle, long j10) {
        super(str, th2);
        this.f55558a = i10;
        this.f55560c = bundle;
        this.f55559b = j10;
    }
}
