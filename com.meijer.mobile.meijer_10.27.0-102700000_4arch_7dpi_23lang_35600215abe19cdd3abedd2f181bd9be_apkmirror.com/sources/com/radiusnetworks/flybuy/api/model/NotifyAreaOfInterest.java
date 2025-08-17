package com.radiusnetworks.flybuy.api.model;

import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import mg.InterfaceC15617c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/radiusnetworks/flybuy/api/model/NotifyAreaOfInterest;", "", PreferencesHelper.PREF_ID, "", "beaconMajor", "(II)V", "getBeaconMajor", "()I", "getId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "api_defaultRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class NotifyAreaOfInterest {

    @InterfaceC15617c("beacon_major")
    private final int beaconMajor;
    private final int id;

    public NotifyAreaOfInterest(int i10, int i11) {
        this.id = i10;
        this.beaconMajor = i11;
    }

    public static /* synthetic */ NotifyAreaOfInterest copy$default(NotifyAreaOfInterest notifyAreaOfInterest, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = notifyAreaOfInterest.id;
        }
        if ((i12 & 2) != 0) {
            i11 = notifyAreaOfInterest.beaconMajor;
        }
        return notifyAreaOfInterest.copy(i10, i11);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBeaconMajor() {
        return this.beaconMajor;
    }

    public final NotifyAreaOfInterest copy(int id2, int beaconMajor) {
        return new NotifyAreaOfInterest(id2, beaconMajor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotifyAreaOfInterest)) {
            return false;
        }
        NotifyAreaOfInterest notifyAreaOfInterest = (NotifyAreaOfInterest) other;
        return this.id == notifyAreaOfInterest.id && this.beaconMajor == notifyAreaOfInterest.beaconMajor;
    }

    public final int getBeaconMajor() {
        return this.beaconMajor;
    }

    public final int getId() {
        return this.id;
    }

    public int hashCode() {
        return Integer.hashCode(this.beaconMajor) + (Integer.hashCode(this.id) * 31);
    }

    public String toString() {
        return "NotifyAreaOfInterest(id=" + this.id + ", beaconMajor=" + this.beaconMajor + ')';
    }
}
