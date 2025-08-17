package com.bugsnag.android;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/bugsnag/android/v0;", "Lkotlin/Function0;", "Lcom/bugsnag/android/V;", "Ljava/io/File;", "eventFile", "", "apiKey", "Lcom/bugsnag/android/t0;", "logger", "<init>", "(Ljava/io/File;Ljava/lang/String;Lcom/bugsnag/android/t0;)V", "d", "()Lcom/bugsnag/android/V;", "c", "", "a", "()V", "<set-?>", "Lcom/bugsnag/android/V;", "b", "event", "Ljava/io/File;", "Ljava/lang/String;", "Lcom/bugsnag/android/t0;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.bugsnag.android.v0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C6499v0 implements Function0<V> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private V event;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final File eventFile;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String apiKey;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC6495t0 logger;

    public final void a() {
        this.event = null;
    }

    private final V d() {
        return new V(new C6481m(this.logger).g(Q6.k.f29894c.a(this.eventFile), this.apiKey), this.logger);
    }

    /* renamed from: b, reason: from getter */
    public final V getEvent() {
        return this.event;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public V invoke() {
        V v10 = this.event;
        if (v10 != null) {
            return v10;
        }
        V vD = d();
        this.event = vD;
        return vD;
    }

    public C6499v0(File file, String str, InterfaceC6495t0 interfaceC6495t0) {
        this.eventFile = file;
        this.apiKey = str;
        this.logger = interfaceC6495t0;
    }
}
