package com.bugsnag.android;

import com.bugsnag.android.C6482m0;
import io.constructor.data.local.PreferencesHelper;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u001e\u0018\u00002\u00020\u0001B9\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b\u001b\u0010/R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\"\u001a\u0004\b1\u0010$\"\u0004\b2\u0010&¨\u00063"}, d2 = {"Lcom/bugsnag/android/a1;", "Lcom/bugsnag/android/m0$a;", "", PreferencesHelper.PREF_ID, "", "name", "Lcom/bugsnag/android/d1;", "type", "", "isErrorReportingThread", "state", "Lcom/bugsnag/android/S0;", "stacktrace", "<init>", "(JLjava/lang/String;Lcom/bugsnag/android/d1;ZLjava/lang/String;Lcom/bugsnag/android/S0;)V", "Lcom/bugsnag/android/m0;", "writer", "", "toStream", "(Lcom/bugsnag/android/m0;)V", "", "Lcom/bugsnag/android/R0;", "a", "Ljava/util/List;", "()Ljava/util/List;", "setStacktrace", "(Ljava/util/List;)V", "b", "J", "getId", "()J", "setId", "(J)V", "c", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "d", "Lcom/bugsnag/android/d1;", "getType", "()Lcom/bugsnag/android/d1;", "setType", "(Lcom/bugsnag/android/d1;)V", "e", "Z", "()Z", "f", "getState", "setState", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class a1 implements C6482m0.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private List<R0> stacktrace;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private d1 type;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isErrorReportingThread;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String state;

    public final List<R0> a() {
        return this.stacktrace;
    }

    /* renamed from: b, reason: from getter */
    public final boolean getIsErrorReportingThread() {
        return this.isErrorReportingThread;
    }

    public a1(long j10, String str, d1 d1Var, boolean z10, String str2, S0 s02) {
        this.id = j10;
        this.name = str;
        this.type = d1Var;
        this.isErrorReportingThread = z10;
        this.state = str2;
        this.stacktrace = CollectionsKt.m1(s02.a());
    }

    @Override // com.bugsnag.android.C6482m0.a
    public void toStream(C6482m0 writer) throws IOException {
        writer.d();
        writer.l(PreferencesHelper.PREF_ID).H(this.id);
        writer.l("name").O(this.name);
        writer.l("type").O(this.type.getDesc());
        writer.l("state").O(this.state);
        writer.l("stacktrace");
        writer.c();
        Iterator<T> it = this.stacktrace.iterator();
        while (it.hasNext()) {
            writer.e0((R0) it.next());
        }
        writer.h();
        if (this.isErrorReportingThread) {
            writer.l("errorReportingThread").R(true);
        }
        writer.i();
    }
}
