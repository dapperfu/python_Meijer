package com.bugsnag.android;

import Q6.ImmutableConfig;
import com.bugsnag.android.C6482m0;
import java.io.File;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B;\b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R.\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010!\u001a\u0004\b\u0018\u0010\"\"\u0004\b#\u0010$R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010(¨\u0006)"}, d2 = {"Lcom/bugsnag/android/Y;", "Lcom/bugsnag/android/m0$a;", "", "apiKey", "Lcom/bugsnag/android/V;", "event", "Ljava/io/File;", "eventFile", "Lcom/bugsnag/android/B0;", "notifier", "LQ6/f;", "config", "<init>", "(Ljava/lang/String;Lcom/bugsnag/android/V;Ljava/io/File;Lcom/bugsnag/android/B0;LQ6/f;)V", "", "Lcom/bugsnag/android/ErrorType;", "b", "()Ljava/util/Set;", "Lcom/bugsnag/android/m0;", "writer", "", "toStream", "(Lcom/bugsnag/android/m0;)V", "value", "a", "Lcom/bugsnag/android/V;", "c", "()Lcom/bugsnag/android/V;", "f", "(Lcom/bugsnag/android/V;)V", "Lcom/bugsnag/android/B0;", "getNotifier$bugsnag_android_core_release", "()Lcom/bugsnag/android/B0;", "Ljava/lang/String;", "()Ljava/lang/String;", "e", "(Ljava/lang/String;)V", "d", "Ljava/io/File;", "()Ljava/io/File;", "LQ6/f;", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class Y implements C6482m0.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private V event;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final B0 notifier;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String apiKey;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final File eventFile;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ImmutableConfig config;

    @JvmOverloads
    public Y(String str, V v10, B0 b02, ImmutableConfig immutableConfig) {
        this(str, v10, null, b02, immutableConfig, 4, null);
    }

    @JvmOverloads
    public Y(String str, V v10, File file, B0 b02, ImmutableConfig immutableConfig) {
        this.apiKey = str;
        this.eventFile = file;
        this.config = immutableConfig;
        this.event = v10;
        B0 b03 = new B0(b02.getName(), b02.getVersion(), b02.getUrl());
        b03.e(CollectionsKt.m1(b02.a()));
        Unit unit = Unit.f142422a;
        this.notifier = b03;
    }

    /* renamed from: a, reason: from getter */
    public final String getApiKey() {
        return this.apiKey;
    }

    public final Set<ErrorType> b() {
        V v10 = this.event;
        if (v10 != null) {
            return v10.f().g();
        }
        File file = this.eventFile;
        return file != null ? EventFilenameInfo.INSTANCE.i(file, this.config).f() : SetsKt.e();
    }

    /* renamed from: c, reason: from getter */
    public final V getEvent() {
        return this.event;
    }

    /* renamed from: d, reason: from getter */
    public final File getEventFile() {
        return this.eventFile;
    }

    public final void e(String str) {
        this.apiKey = str;
    }

    public final void f(V v10) {
        this.event = v10;
    }

    @Override // com.bugsnag.android.C6482m0.a
    public void toStream(C6482m0 writer) throws Throwable {
        writer.d();
        writer.l("apiKey").O(this.apiKey);
        writer.l("payloadVersion").O("4.0");
        writer.l("notifier").e0(this.notifier);
        writer.l("events").c();
        V v10 = this.event;
        if (v10 != null) {
            writer.e0(v10);
        } else {
            File file = this.eventFile;
            if (file != null) {
                writer.c0(file);
            }
        }
        writer.h();
        writer.i();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Y(String str, V v10, File file, B0 b02, ImmutableConfig immutableConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        ImmutableConfig immutableConfig2;
        B0 b03;
        File file2;
        v10 = (i10 & 2) != 0 ? null : v10;
        if ((i10 & 4) != 0) {
            immutableConfig2 = immutableConfig;
            b03 = b02;
            file2 = null;
        } else {
            immutableConfig2 = immutableConfig;
            b03 = b02;
            file2 = file;
        }
        this(str, v10, file2, b03, immutableConfig2);
    }
}
