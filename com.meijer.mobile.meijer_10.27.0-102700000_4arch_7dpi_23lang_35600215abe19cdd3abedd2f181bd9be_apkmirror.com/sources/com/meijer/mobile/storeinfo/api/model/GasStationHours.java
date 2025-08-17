package com.meijer.mobile.storeinfo.api.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import j$.time.LocalTime;
import kj.C15170c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ok.GasStationHour;
import vk.C17590a;
import vk.d;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0013B+\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\b\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/meijer/mobile/storeinfo/api/model/GasStationHours;", "", "", "dayOfTheWeek", "openTime", "closeTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/storeinfo/api/model/GasStationHours;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "storeinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class GasStationHours {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dayOfTheWeek;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String openTime;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String closeTime;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/meijer/mobile/storeinfo/api/model/GasStationHours$a;", "", "<init>", "()V", "Lcom/meijer/mobile/storeinfo/api/model/GasStationHours;", "Lok/e;", "a", "(Lcom/meijer/mobile/storeinfo/api/model/GasStationHours;)Lok/e;", "storeinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.storeinfo.api.model.GasStationHours$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final GasStationHour a(GasStationHours gasStationHours) {
            Intrinsics.j(gasStationHours, "<this>");
            String dayOfTheWeek = gasStationHours.getDayOfTheWeek();
            String openTime = gasStationHours.getOpenTime();
            LocalTime localTime = openTime != null ? (LocalTime) d.b(openTime, C17590a.f164803a.u(), new C15170c()) : null;
            String closeTime = gasStationHours.getCloseTime();
            return new GasStationHour(dayOfTheWeek, localTime, closeTime != null ? (LocalTime) d.b(closeTime, C17590a.f164803a.u(), new C15170c()) : null);
        }
    }

    public GasStationHours() {
        this(null, null, null, 7, null);
    }

    public final GasStationHours copy(@g(name = "DayOfTheWeek") String dayOfTheWeek, @g(name = "OpenTime") String openTime, @g(name = "CloseTime") String closeTime) {
        return new GasStationHours(dayOfTheWeek, openTime, closeTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GasStationHours)) {
            return false;
        }
        GasStationHours gasStationHours = (GasStationHours) other;
        return Intrinsics.e(this.dayOfTheWeek, gasStationHours.dayOfTheWeek) && Intrinsics.e(this.openTime, gasStationHours.openTime) && Intrinsics.e(this.closeTime, gasStationHours.closeTime);
    }

    public int hashCode() {
        String str = this.dayOfTheWeek;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.openTime;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.closeTime;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "GasStationHours(dayOfTheWeek=" + this.dayOfTheWeek + ", openTime=" + this.openTime + ", closeTime=" + this.closeTime + ')';
    }

    public GasStationHours(@g(name = "DayOfTheWeek") String str, @g(name = "OpenTime") String str2, @g(name = "CloseTime") String str3) {
        this.dayOfTheWeek = str;
        this.openTime = str2;
        this.closeTime = str3;
    }

    /* renamed from: a, reason: from getter */
    public final String getCloseTime() {
        return this.closeTime;
    }

    /* renamed from: b, reason: from getter */
    public final String getDayOfTheWeek() {
        return this.dayOfTheWeek;
    }

    /* renamed from: c, reason: from getter */
    public final String getOpenTime() {
        return this.openTime;
    }

    public /* synthetic */ GasStationHours(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3);
    }
}
