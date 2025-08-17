package Lb;

import android.support.annotation.NonNull;
import java.lang.Thread;
import java.text.MessageFormat;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes4.dex */
public final class j implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private String f17951a;

    /* renamed from: b, reason: collision with root package name */
    private String f17952b;

    /* renamed from: c, reason: collision with root package name */
    private int f17953c;

    /* renamed from: d, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f17954d;

    public j(String str) {
        this(str, "{0}");
    }

    public j(String str, @NonNull String str2) {
        this.f17952b = str;
        this.f17951a = str2;
        this.f17954d = new k();
        this.f17953c = 0;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@NonNull Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setUncaughtExceptionHandler(this.f17954d);
        int i10 = this.f17953c + 1;
        this.f17953c = i10;
        String str = this.f17952b;
        if (str != null) {
            thread.setName(MessageFormat.format(this.f17951a, str, Integer.valueOf(i10)));
        }
        return thread;
    }
}
