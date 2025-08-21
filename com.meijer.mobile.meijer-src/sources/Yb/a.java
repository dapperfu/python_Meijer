package Yb;

import Nb.j;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes4.dex */
public final class a {
    public static ExecutorService a(String str) {
        return Executors.newFixedThreadPool(1, new j(str));
    }
}
