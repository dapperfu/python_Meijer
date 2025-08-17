package com.bugsnag.android;

import com.bugsnag.android.C6482m0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0010\u0018\u00002\u00020\u0001B'\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR(\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00000\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001c\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/bugsnag/android/B0;", "Lcom/bugsnag/android/m0$a;", "", "name", "version", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/bugsnag/android/m0;", "writer", "", "toStream", "(Lcom/bugsnag/android/m0;)V", "", "a", "Ljava/util/List;", "()Ljava/util/List;", "e", "(Ljava/util/List;)V", "dependencies", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "c", "d", "setVersion", "setUrl", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class B0 implements C6482m0.a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private List<B0> dependencies;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private String version;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private String url;

    @JvmOverloads
    public B0() {
        this(null, null, null, 7, null);
    }

    @JvmOverloads
    public B0(String str, String str2, String str3) {
        this.name = str;
        this.version = str2;
        this.url = str3;
        this.dependencies = CollectionsKt.m();
    }

    public final List<B0> a() {
        return this.dependencies;
    }

    /* renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: c, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: d, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    public final void e(List<B0> list) {
        this.dependencies = list;
    }

    @Override // com.bugsnag.android.C6482m0.a
    public void toStream(C6482m0 writer) throws IOException {
        writer.d();
        writer.l("name").O(this.name);
        writer.l("version").O(this.version);
        writer.l("url").O(this.url);
        if (!this.dependencies.isEmpty()) {
            writer.l("dependencies");
            writer.c();
            Iterator<T> it = this.dependencies.iterator();
            while (it.hasNext()) {
                writer.e0((B0) it.next());
            }
            writer.h();
        }
        writer.i();
    }

    public /* synthetic */ B0(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "Android Bugsnag Notifier" : str, (i10 & 2) != 0 ? "5.31.0" : str2, (i10 & 4) != 0 ? "https://bugsnag.com" : str3);
    }
}
