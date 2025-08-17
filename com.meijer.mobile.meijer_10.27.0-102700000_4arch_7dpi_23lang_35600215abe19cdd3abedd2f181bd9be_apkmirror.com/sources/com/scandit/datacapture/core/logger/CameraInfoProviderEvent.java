package com.scandit.datacapture.core.logger;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/scandit/datacapture/core/logger/CameraInfoProviderEvent;", "Lcom/scandit/datacapture/core/logger/Event;", "", "api", "numCameras", "", "exceptionDescription", "extraInfo", "<init>", "(IILjava/lang/String;Ljava/lang/String;)V", "b", "I", "getApi", "()I", "c", "getNumCameras", "d", "Ljava/lang/String;", "getExceptionDescription", "()Ljava/lang/String;", "e", "getExtraInfo", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class CameraInfoProviderEvent extends Event {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int api;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int numCameras;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String exceptionDescription;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String extraInfo;

    public /* synthetic */ CameraInfoProviderEvent(int i10, int i11, String str, String str2, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i12 & 2) != 0 ? -1 : i11, (i12 & 4) != 0 ? "" : str, (i12 & 8) != 0 ? null : str2);
    }

    public final int getApi() {
        return this.api;
    }

    public final String getExceptionDescription() {
        return this.exceptionDescription;
    }

    public final String getExtraInfo() {
        return this.extraInfo;
    }

    public final int getNumCameras() {
        return this.numCameras;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraInfoProviderEvent(int i10, int i11, String exceptionDescription, String str) {
        super(null);
        Intrinsics.j(exceptionDescription, "exceptionDescription");
        this.api = i10;
        this.numCameras = i11;
        this.exceptionDescription = exceptionDescription;
        this.extraInfo = str;
    }
}
