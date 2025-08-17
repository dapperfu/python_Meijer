package fsimpl;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: fsimpl.fv, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C14104fv {

    /* renamed from: a, reason: collision with root package name */
    private static final ExecutorService f132289a = Executors.newFixedThreadPool(3, new ThreadFactoryC14105fw());

    public static void a(Runnable runnable) {
        f132289a.execute(runnable);
    }
}
