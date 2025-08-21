package com.meijer.mobile.store.model.hybris;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ0\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/store/model/hybris/HybrisScheduleTime;", "", "", "hour", "minute", "", "formattedHour", "<init>", "(IILjava/lang/String;)V", "copy", "(IILjava/lang/String;)Lcom/meijer/mobile/store/model/hybris/HybrisScheduleTime;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "c", "Ljava/lang/String;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HybrisScheduleTime {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int hour;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int minute;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String formattedHour;

    public HybrisScheduleTime(@g(name = "hour") int i10, @g(name = "minute") int i11, @g(name = "formattedHour") String str) {
        this.hour = i10;
        this.minute = i11;
        this.formattedHour = str;
    }

    public final HybrisScheduleTime copy(@g(name = "hour") int hour, @g(name = "minute") int minute, @g(name = "formattedHour") String formattedHour) {
        return new HybrisScheduleTime(hour, minute, formattedHour);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisScheduleTime)) {
            return false;
        }
        HybrisScheduleTime hybrisScheduleTime = (HybrisScheduleTime) other;
        return this.hour == hybrisScheduleTime.hour && this.minute == hybrisScheduleTime.minute && Intrinsics.e(this.formattedHour, hybrisScheduleTime.formattedHour);
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.hour) * 31) + Integer.hashCode(this.minute)) * 31;
        String str = this.formattedHour;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "HybrisScheduleTime(hour=" + this.hour + ", minute=" + this.minute + ", formattedHour=" + this.formattedHour + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getFormattedHour() {
        return this.formattedHour;
    }

    /* renamed from: b, reason: from getter */
    public final int getHour() {
        return this.hour;
    }

    /* renamed from: c, reason: from getter */
    public final int getMinute() {
        return this.minute;
    }

    public /* synthetic */ HybrisScheduleTime(int i10, int i11, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, (i12 & 4) != 0 ? null : str);
    }
}
