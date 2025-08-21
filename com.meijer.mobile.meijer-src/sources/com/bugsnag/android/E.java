package com.bugsnag.android;

import com.fullstory.FS;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/bugsnag/android/E;", "Lcom/bugsnag/android/D0;", "<init>", "()V", "", "msg", "", "e", "(Ljava/lang/String;)V", "", "throwable", "c", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "g", "b", "f", "d", "a", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class E implements D0 {

    /* renamed from: a, reason: collision with root package name */
    public static final E f63902a = new E();

    @Override // com.bugsnag.android.D0
    public void a(String msg, Throwable throwable) {
        FS.log_d("Bugsnag", msg, throwable);
    }

    @Override // com.bugsnag.android.D0
    public void b(String msg, Throwable throwable) {
        FS.log_w("Bugsnag", msg, throwable);
    }

    @Override // com.bugsnag.android.D0
    public void c(String msg, Throwable throwable) {
        FS.log_e("Bugsnag", msg, throwable);
    }

    @Override // com.bugsnag.android.D0
    public void d(String msg) {
        FS.log_d("Bugsnag", msg);
    }

    @Override // com.bugsnag.android.D0
    public void e(String msg) {
        FS.log_e("Bugsnag", msg);
    }

    @Override // com.bugsnag.android.D0
    public void f(String msg) {
        FS.log_i("Bugsnag", msg);
    }

    @Override // com.bugsnag.android.D0
    public void g(String msg) {
        FS.log_w("Bugsnag", msg);
    }

    private E() {
    }
}
