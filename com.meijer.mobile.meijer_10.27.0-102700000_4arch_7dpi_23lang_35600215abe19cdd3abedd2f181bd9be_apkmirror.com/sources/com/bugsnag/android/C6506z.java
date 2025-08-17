package com.bugsnag.android;

import com.bugsnag.android.T0;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u0003R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/bugsnag/android/z;", "Lcom/bugsnag/android/j;", "<init>", "()V", "", "context", "", "d", "(Ljava/lang/String;)V", "c", "b", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "manualContext", "automaticContext", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.bugsnag.android.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6506z extends C6475j {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String manualContext;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String automaticContext;

    public final String b() {
        String str = this.automaticContext;
        if (str == "__BUGSNAG_MANUAL_CONTEXT__") {
            str = null;
        }
        return str != null ? str : this.manualContext;
    }

    public final void c(String context) {
        if (this.automaticContext != "__BUGSNAG_MANUAL_CONTEXT__") {
            this.automaticContext = context;
            a();
        }
    }

    public final void d(String context) {
        this.manualContext = context;
        this.automaticContext = "__BUGSNAG_MANUAL_CONTEXT__";
        a();
    }

    public final void a() {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            T0.m mVar = new T0.m(b());
            Iterator<T> it = getObservers$bugsnag_android_core_release().iterator();
            while (it.hasNext()) {
                ((Q6.l) it.next()).onStateChange(mVar);
            }
        }
    }
}
