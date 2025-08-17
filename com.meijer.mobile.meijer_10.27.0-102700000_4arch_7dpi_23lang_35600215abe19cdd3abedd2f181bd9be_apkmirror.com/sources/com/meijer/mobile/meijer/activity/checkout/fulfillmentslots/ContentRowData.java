package com.meijer.mobile.meijer.activity.checkout.fulfillmentslots;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/g;", "", "", "description", "image", "<init>", "(ILjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.g, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class ContentRowData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int description;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer image;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContentRowData)) {
            return false;
        }
        ContentRowData contentRowData = (ContentRowData) other;
        return this.description == contentRowData.description && Intrinsics.e(this.image, contentRowData.image);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.description) * 31;
        Integer num = this.image;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public String toString() {
        return "ContentRowData(description=" + this.description + ", image=" + this.image + ')';
    }

    /* renamed from: a, reason: from getter */
    public final int getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getImage() {
        return this.image;
    }

    public ContentRowData(int i10, Integer num) {
        this.description = i10;
        this.image = num;
    }
}
