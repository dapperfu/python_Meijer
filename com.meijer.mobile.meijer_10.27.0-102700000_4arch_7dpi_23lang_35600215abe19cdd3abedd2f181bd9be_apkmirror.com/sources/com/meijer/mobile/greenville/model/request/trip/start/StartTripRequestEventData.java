package com.meijer.mobile.greenville.model.request.trip.start;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ8\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/meijer/mobile/greenville/model/request/trip/start/StartTripRequestEventData;", "", "", "barcodeType", "mPerksBarcode", "", "selectedHighValueOnly", "rollDepositsInPrimary", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZ)V", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZ)Lcom/meijer/mobile/greenville/model/request/trip/start/StartTripRequestEventData;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "d", "()Z", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class StartTripRequestEventData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String barcodeType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String mPerksBarcode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean selectedHighValueOnly;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean rollDepositsInPrimary;

    public StartTripRequestEventData(@g(name = "barcodeType") String barcodeType, @g(name = "mPerksBarcode") String mPerksBarcode, @g(name = "selectedHighValueOnly") boolean z10, @g(name = "rollDepositsInPrimary") boolean z11) {
        Intrinsics.j(barcodeType, "barcodeType");
        Intrinsics.j(mPerksBarcode, "mPerksBarcode");
        this.barcodeType = barcodeType;
        this.mPerksBarcode = mPerksBarcode;
        this.selectedHighValueOnly = z10;
        this.rollDepositsInPrimary = z11;
    }

    public final StartTripRequestEventData copy(@g(name = "barcodeType") String barcodeType, @g(name = "mPerksBarcode") String mPerksBarcode, @g(name = "selectedHighValueOnly") boolean selectedHighValueOnly, @g(name = "rollDepositsInPrimary") boolean rollDepositsInPrimary) {
        Intrinsics.j(barcodeType, "barcodeType");
        Intrinsics.j(mPerksBarcode, "mPerksBarcode");
        return new StartTripRequestEventData(barcodeType, mPerksBarcode, selectedHighValueOnly, rollDepositsInPrimary);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartTripRequestEventData)) {
            return false;
        }
        StartTripRequestEventData startTripRequestEventData = (StartTripRequestEventData) other;
        return Intrinsics.e(this.barcodeType, startTripRequestEventData.barcodeType) && Intrinsics.e(this.mPerksBarcode, startTripRequestEventData.mPerksBarcode) && this.selectedHighValueOnly == startTripRequestEventData.selectedHighValueOnly && this.rollDepositsInPrimary == startTripRequestEventData.rollDepositsInPrimary;
    }

    public int hashCode() {
        return (((((this.barcodeType.hashCode() * 31) + this.mPerksBarcode.hashCode()) * 31) + Boolean.hashCode(this.selectedHighValueOnly)) * 31) + Boolean.hashCode(this.rollDepositsInPrimary);
    }

    public String toString() {
        return "StartTripRequestEventData(barcodeType=" + this.barcodeType + ", mPerksBarcode=" + this.mPerksBarcode + ", selectedHighValueOnly=" + this.selectedHighValueOnly + ", rollDepositsInPrimary=" + this.rollDepositsInPrimary + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getBarcodeType() {
        return this.barcodeType;
    }

    /* renamed from: b, reason: from getter */
    public final String getMPerksBarcode() {
        return this.mPerksBarcode;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getRollDepositsInPrimary() {
        return this.rollDepositsInPrimary;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getSelectedHighValueOnly() {
        return this.selectedHighValueOnly;
    }

    public /* synthetic */ StartTripRequestEventData(String str, String str2, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i10 & 4) != 0 ? true : z10, (i10 & 8) != 0 ? true : z11);
    }
}
