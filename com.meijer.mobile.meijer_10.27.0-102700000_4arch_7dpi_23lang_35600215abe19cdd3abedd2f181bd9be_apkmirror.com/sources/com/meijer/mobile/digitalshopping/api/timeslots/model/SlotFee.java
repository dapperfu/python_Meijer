package com.meijer.mobile.digitalshopping.api.timeslots.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ2\u0010\n\u001a\u00020\u00002\f\b\u0003\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/timeslots/model/SlotFee;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", PreferencesHelper.PREF_ID, "scheduleType", "", "feeAmount", "<init>", "(Ljava/lang/String;Ljava/lang/String;D)V", "copy", "(Ljava/lang/String;Ljava/lang/String;D)Lcom/meijer/mobile/digitalshopping/api/timeslots/model/SlotFee;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "D", "()D", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class SlotFee {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String scheduleType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final double feeAmount;

    public SlotFee() {
        this(null, null, 0.0d, 7, null);
    }

    public final SlotFee copy(@g(name = PreferencesHelper.PREF_ID) String id2, @g(name = "scheduleType") String scheduleType, @g(name = "feeAmount") double feeAmount) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(scheduleType, "scheduleType");
        return new SlotFee(id2, scheduleType, feeAmount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SlotFee)) {
            return false;
        }
        SlotFee slotFee = (SlotFee) other;
        return Intrinsics.e(this.id, slotFee.id) && Intrinsics.e(this.scheduleType, slotFee.scheduleType) && Double.compare(this.feeAmount, slotFee.feeAmount) == 0;
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.scheduleType.hashCode()) * 31) + Double.hashCode(this.feeAmount);
    }

    public String toString() {
        return "SlotFee(id=" + this.id + ", scheduleType=" + this.scheduleType + ", feeAmount=" + this.feeAmount + ')';
    }

    public SlotFee(@g(name = PreferencesHelper.PREF_ID) String id2, @g(name = "scheduleType") String scheduleType, @g(name = "feeAmount") double d10) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(scheduleType, "scheduleType");
        this.id = id2;
        this.scheduleType = scheduleType;
        this.feeAmount = d10;
    }

    /* renamed from: a, reason: from getter */
    public final double getFeeAmount() {
        return this.feeAmount;
    }

    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final String getScheduleType() {
        return this.scheduleType;
    }

    public /* synthetic */ SlotFee(String str, String str2, double d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "-1" : str, (i10 & 2) != 0 ? "4" : str2, (i10 & 4) != 0 ? 0.0d : d10);
    }
}
