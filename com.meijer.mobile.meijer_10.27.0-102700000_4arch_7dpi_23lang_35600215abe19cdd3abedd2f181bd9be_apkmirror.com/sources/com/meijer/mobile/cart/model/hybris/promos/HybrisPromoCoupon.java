package com.meijer.mobile.cart.model.hybris.promos;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ@\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/promos/HybrisPromoCoupon;", "", "", "clipCode", "clipResult", "description", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/cart/model/hybris/promos/HybrisPromoCoupon;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HybrisPromoCoupon {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clipCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String clipResult;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    public HybrisPromoCoupon() {
        this(null, null, null, null, 15, null);
    }

    public final HybrisPromoCoupon copy(@g(name = "clipCode") String clipCode, @g(name = "clipResult") String clipResult, @g(name = "description") String description, @g(name = "title") String title) {
        return new HybrisPromoCoupon(clipCode, clipResult, description, title);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisPromoCoupon)) {
            return false;
        }
        HybrisPromoCoupon hybrisPromoCoupon = (HybrisPromoCoupon) other;
        return Intrinsics.e(this.clipCode, hybrisPromoCoupon.clipCode) && Intrinsics.e(this.clipResult, hybrisPromoCoupon.clipResult) && Intrinsics.e(this.description, hybrisPromoCoupon.description) && Intrinsics.e(this.title, hybrisPromoCoupon.title);
    }

    public int hashCode() {
        String str = this.clipCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clipResult;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "HybrisPromoCoupon(clipCode=" + this.clipCode + ", clipResult=" + this.clipResult + ", description=" + this.description + ", title=" + this.title + ')';
    }

    public HybrisPromoCoupon(@g(name = "clipCode") String str, @g(name = "clipResult") String str2, @g(name = "description") String str3, @g(name = "title") String str4) {
        this.clipCode = str;
        this.clipResult = str2;
        this.description = str3;
        this.title = str4;
    }

    /* renamed from: a, reason: from getter */
    public final String getClipCode() {
        return this.clipCode;
    }

    /* renamed from: b, reason: from getter */
    public final String getClipResult() {
        return this.clipResult;
    }

    /* renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: d, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ HybrisPromoCoupon(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}
