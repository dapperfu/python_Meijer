package d3;

import java.util.concurrent.Executor;

/* renamed from: d3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13467b {

    /* renamed from: a, reason: collision with root package name */
    private static Executor f127103a;

    public static synchronized Executor a() {
        try {
            if (f127103a == null) {
                f127103a = P.N0("ExoPlayer:BackgroundExecutor");
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f127103a;
    }
}
