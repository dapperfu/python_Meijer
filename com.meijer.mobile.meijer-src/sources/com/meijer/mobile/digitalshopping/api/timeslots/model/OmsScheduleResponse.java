package com.meijer.mobile.digitalshopping.api.timeslots.model;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsScheduleResponse;", "", "", "date", "", "Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsDeliveryWindowResponse;", "deliveryWindows", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/util/List;)Lcom/meijer/mobile/digitalshopping/api/timeslots/model/OmsScheduleResponse;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "digitalshopping_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class OmsScheduleResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String date;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<OmsDeliveryWindowResponse> deliveryWindows;

    public final OmsScheduleResponse copy(@g(name = "date") String date, @g(name = "deliveryWindows") List<OmsDeliveryWindowResponse> deliveryWindows) {
        Intrinsics.j(date, "date");
        Intrinsics.j(deliveryWindows, "deliveryWindows");
        return new OmsScheduleResponse(date, deliveryWindows);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OmsScheduleResponse)) {
            return false;
        }
        OmsScheduleResponse omsScheduleResponse = (OmsScheduleResponse) other;
        return Intrinsics.e(this.date, omsScheduleResponse.date) && Intrinsics.e(this.deliveryWindows, omsScheduleResponse.deliveryWindows);
    }

    public int hashCode() {
        return (this.date.hashCode() * 31) + this.deliveryWindows.hashCode();
    }

    public String toString() {
        return "OmsScheduleResponse(date=" + this.date + ", deliveryWindows=" + this.deliveryWindows + ')';
    }

    public OmsScheduleResponse(@g(name = "date") String date, @g(name = "deliveryWindows") List<OmsDeliveryWindowResponse> deliveryWindows) {
        Intrinsics.j(date, "date");
        Intrinsics.j(deliveryWindows, "deliveryWindows");
        this.date = date;
        this.deliveryWindows = deliveryWindows;
    }

    /* renamed from: a, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    public final List<OmsDeliveryWindowResponse> b() {
        return this.deliveryWindows;
    }
}
