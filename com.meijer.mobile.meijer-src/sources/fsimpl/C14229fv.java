package fsimpl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: fsimpl.fv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C14229fv {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f133539a = Executors.newFixedThreadPool(3, new ThreadFactoryC14230fw());

    public static void a(Runnable runnable) {
        f133539a.execute(runnable);
    }
}
