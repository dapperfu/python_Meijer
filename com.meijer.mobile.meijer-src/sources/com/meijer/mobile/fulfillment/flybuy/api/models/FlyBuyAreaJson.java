package com.meijer.mobile.fulfillment.flybuy.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/fulfillment/flybuy/api/models/FlyBuyAreaJson;", "", "", "areaId", "", "areaName", "", "probability", "<init>", "(JLjava/lang/String;D)V", "copy", "(JLjava/lang/String;D)Lcom/meijer/mobile/fulfillment/flybuy/api/models/FlyBuyAreaJson;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "()J", "b", "Ljava/lang/String;", "c", "D", "()D", "flybuy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class FlyBuyAreaJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long areaId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String areaName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double probability;

    public FlyBuyAreaJson() {
        this(0L, null, 0.0d, 7, null);
    }

    public final FlyBuyAreaJson copy(@g(name = "area_id") long areaId, @g(name = "area_name") String areaName, @g(name = "probability") double probability) {
        Intrinsics.j(areaName, "areaName");
        return new FlyBuyAreaJson(areaId, areaName, probability);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlyBuyAreaJson)) {
            return false;
        }
        FlyBuyAreaJson flyBuyAreaJson = (FlyBuyAreaJson) other;
        return this.areaId == flyBuyAreaJson.areaId && Intrinsics.e(this.areaName, flyBuyAreaJson.areaName) && Double.compare(this.probability, flyBuyAreaJson.probability) == 0;
    }

    public int hashCode() {
        return (((Long.hashCode(this.areaId) * 31) + this.areaName.hashCode()) * 31) + Double.hashCode(this.probability);
    }

    public String toString() {
        return "FlyBuyAreaJson(areaId=" + this.areaId + ", areaName=" + this.areaName + ", probability=" + this.probability + ')';
    }

    public FlyBuyAreaJson(@g(name = "area_id") long j10, @g(name = "area_name") String areaName, @g(name = "probability") double d10) {
        Intrinsics.j(areaName, "areaName");
        this.areaId = j10;
        this.areaName = areaName;
        this.probability = d10;
    }

    /* renamed from: a, reason: from getter */
    public final long getAreaId() {
        return this.areaId;
    }

    /* renamed from: b, reason: from getter */
    public final String getAreaName() {
        return this.areaName;
    }

    /* renamed from: c, reason: from getter */
    public final double getProbability() {
        return this.probability;
    }

    public /* synthetic */ FlyBuyAreaJson(long j10, String str, double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? "Pickup Parking" : str, (i10 & 4) != 0 ? 0.0d : d10);
    }
}
