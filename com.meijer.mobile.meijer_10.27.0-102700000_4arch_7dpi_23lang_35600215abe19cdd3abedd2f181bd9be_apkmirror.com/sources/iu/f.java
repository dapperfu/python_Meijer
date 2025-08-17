package iu;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f138506a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f138507b = new String[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Charset f138508c = Charset.forName("UTF-8");

    static class a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f138509a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f138510b;

        a(String str, boolean z10) {
            this.f138509a = str;
            this.f138510b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f138509a);
            thread.setDaemon(this.f138510b);
            return thread;
        }
    }

    public static ThreadFactory b(String str, boolean z10) {
        return new a(str, z10);
    }

    public static <T> List<T> a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }
}
