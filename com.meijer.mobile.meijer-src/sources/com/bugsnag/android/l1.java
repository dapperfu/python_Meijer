package com.bugsnag.android;

import com.bugsnag.android.C6624v0;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0019\u0010$R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0014\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018R(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020)0(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b\u0013\u0010,\"\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/bugsnag/android/l1;", "Lcom/bugsnag/android/v0$a;", "", PreferencesHelper.PREF_ID, "name", "Lcom/bugsnag/android/ErrorType;", "type", "", "isErrorReportingThread", "state", "Lcom/bugsnag/android/d1;", "stacktrace", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/bugsnag/android/ErrorType;ZLjava/lang/String;Lcom/bugsnag/android/d1;)V", "Lcom/bugsnag/android/v0;", "writer", "", "toStream", "(Lcom/bugsnag/android/v0;)V", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "b", "getName", "setName", "c", "Lcom/bugsnag/android/ErrorType;", "getType", "()Lcom/bugsnag/android/ErrorType;", "setType", "(Lcom/bugsnag/android/ErrorType;)V", "d", "Z", "()Z", "e", "getState", "setState", "", "Lcom/bugsnag/android/c1;", "f", "Ljava/util/List;", "()Ljava/util/List;", "setStacktrace", "(Ljava/util/List;)V", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class l1 implements C6624v0.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private ErrorType type;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean isErrorReportingThread;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String state;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private List<c1> stacktrace;

    public final List<c1> a() {
        return this.stacktrace;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsErrorReportingThread() {
        return this.isErrorReportingThread;
    }

    public l1(String str, String str2, ErrorType errorType, boolean z10, String str3, d1 d1Var) {
        this.id = str;
        this.name = str2;
        this.type = errorType;
        this.isErrorReportingThread = z10;
        this.state = str3;
        this.stacktrace = CollectionsKt.m1(d1Var.a());
    }

    @Override // com.bugsnag.android.C6624v0.a
    public void toStream(C6624v0 writer) throws IOException {
        writer.d();
        writer.l(PreferencesHelper.PREF_ID).O(this.id);
        writer.l("name").O(this.name);
        writer.l("type").O(this.type.getDesc());
        writer.l("state").O(this.state);
        writer.l("stacktrace");
        writer.c();
        Iterator<T> it = this.stacktrace.iterator();
        while (it.hasNext()) {
            writer.e0((c1) it.next());
        }
        writer.h();
        if (this.isErrorReportingThread) {
            writer.l("errorReportingThread").R(true);
        }
        writer.i();
    }
}
