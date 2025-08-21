package Nb;

import android.support.annotation.NonNull;
import java.lang.Thread;
import java.text.MessageFormat;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes4.dex */
public final class j implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private String f20771a;

    /* renamed from: b, reason: collision with root package name */
    private String f20772b;

    /* renamed from: c, reason: collision with root package name */
    private int f20773c;

    /* renamed from: d, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f20774d;

    public j(String str) {
        this(str, "{0}");
    }

    public j(String str, @NonNull String str2) {
        this.f20772b = str;
        this.f20771a = str2;
        this.f20774d = new k();
        this.f20773c = 0;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setUncaughtExceptionHandler(this.f20774d);
        int i10 = this.f20773c + 1;
        this.f20773c = i10;
        String str = this.f20772b;
        if (str != null) {
            thread.setName(MessageFormat.format(this.f20771a, str, Integer.valueOf(i10)));
        }
        return thread;
    }
}
