package com.bugsnag.android;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R(\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0012\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/bugsnag/android/F0;", "Lkotlin/Function0;", "Lcom/bugsnag/android/b0;", "Ljava/io/File;", "eventFile", "", "apiKey", "Lcom/bugsnag/android/D0;", "logger", "<init>", "(Ljava/io/File;Ljava/lang/String;Lcom/bugsnag/android/D0;)V", "d", "()Lcom/bugsnag/android/b0;", "c", "", "a", "()V", "Ljava/io/File;", "b", "Ljava/lang/String;", "Lcom/bugsnag/android/D0;", "<set-?>", "Lcom/bugsnag/android/b0;", "event", "bugsnag-android-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class F0 implements Function0<C6585b0> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final File eventFile;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String apiKey;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final D0 logger;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private C6585b0 event;

    public final void a() {
        this.event = null;
    }

    private final C6585b0 d() {
        return new C6585b0(new C6612p(this.logger).g(R6.q.f32021a.c(this.eventFile), this.apiKey), this.logger);
    }

    /* renamed from: b, reason: from getter */
    public final C6585b0 getEvent() {
        return this.event;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C6585b0 invoke() {
        C6585b0 c6585b0 = this.event;
        if (c6585b0 != null) {
            return c6585b0;
        }
        C6585b0 c6585b0D = d();
        this.event = c6585b0D;
        return c6585b0D;
    }

    public F0(File file, String str, D0 d02) {
        this.eventFile = file;
        this.apiKey = str;
        this.logger = d02;
    }
}
