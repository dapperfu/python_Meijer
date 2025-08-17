package com.scandit.datacapture.core.logger;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/scandit/datacapture/core/logger/CreateDummySurface;", "Lcom/scandit/datacapture/core/logger/Event;", "", "eglVendor", "eglVersion", "", "eglClientApis", "eglExtensions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "b", "Ljava/lang/String;", "getEglVendor", "()Ljava/lang/String;", "c", "getEglVersion", "d", "Ljava/util/List;", "getEglClientApis", "()Ljava/util/List;", "e", "getEglExtensions", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class CreateDummySurface extends Event {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String eglVendor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String eglVersion;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List eglClientApis;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List eglExtensions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateDummySurface(String str, String str2, List<String> eglClientApis, List<String> eglExtensions) {
        super(null);
        Intrinsics.j(eglClientApis, "eglClientApis");
        Intrinsics.j(eglExtensions, "eglExtensions");
        this.eglVendor = str;
        this.eglVersion = str2;
        this.eglClientApis = eglClientApis;
        this.eglExtensions = eglExtensions;
    }

    public final List<String> getEglClientApis() {
        return this.eglClientApis;
    }

    public final List<String> getEglExtensions() {
        return this.eglExtensions;
    }

    public final String getEglVendor() {
        return this.eglVendor;
    }

    public final String getEglVersion() {
        return this.eglVersion;
    }
}
