package com.meijer.mobile.subscription.service.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0017\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/subscription/service/api/models/PreferredTimeslotResponseJson;", "", "", "dayOfWeek", "", "endTime", "startTime", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "copy", "(ILjava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/subscription/service/api/models/PreferredTimeslotResponseJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/String;", "c", "service_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PreferredTimeslotResponseJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int dayOfWeek;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String endTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String startTime;

    public final PreferredTimeslotResponseJson copy(@g(name = "dayOfWeek") int dayOfWeek, @g(name = "endTime") String endTime, @g(name = "startTime") String startTime) {
        Intrinsics.j(endTime, "endTime");
        Intrinsics.j(startTime, "startTime");
        return new PreferredTimeslotResponseJson(dayOfWeek, endTime, startTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreferredTimeslotResponseJson)) {
            return false;
        }
        PreferredTimeslotResponseJson preferredTimeslotResponseJson = (PreferredTimeslotResponseJson) other;
        return this.dayOfWeek == preferredTimeslotResponseJson.dayOfWeek && Intrinsics.e(this.endTime, preferredTimeslotResponseJson.endTime) && Intrinsics.e(this.startTime, preferredTimeslotResponseJson.startTime);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.dayOfWeek) * 31) + this.endTime.hashCode()) * 31) + this.startTime.hashCode();
    }

    public String toString() {
        return "PreferredTimeslotResponseJson(dayOfWeek=" + this.dayOfWeek + ", endTime=" + this.endTime + ", startTime=" + this.startTime + ')';
    }

    public PreferredTimeslotResponseJson(@g(name = "dayOfWeek") int i10, @g(name = "endTime") String endTime, @g(name = "startTime") String startTime) {
        Intrinsics.j(endTime, "endTime");
        Intrinsics.j(startTime, "startTime");
        this.dayOfWeek = i10;
        this.endTime = endTime;
        this.startTime = startTime;
    }

    /* renamed from: a, reason: from getter */
    public final int getDayOfWeek() {
        return this.dayOfWeek;
    }

    /* renamed from: b, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* renamed from: c, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }
}
