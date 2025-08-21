package com.meijer.mobile.product.model.hybris.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nk.g;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJJ\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0015\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0018\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0019\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/product/model/hybris/api/models/HybrisImage;", "", "", "url", "altText", "formatString", "imageTypeString", "", "galleryIndex", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/meijer/mobile/product/model/hybris/api/models/HybrisImage;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "c", "d", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class HybrisImage {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String altText;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String formatString;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String imageTypeString;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer galleryIndex;

    public HybrisImage() {
        this(null, null, null, null, null, 31, null);
    }

    public final HybrisImage copy(@g(name = "url") String url, @g(name = "altText") String altText, @g(name = "format") String formatString, @g(name = "imageType") String imageTypeString, @g(name = "galleryIndex") Integer galleryIndex) {
        Intrinsics.j(url, "url");
        return new HybrisImage(url, altText, formatString, imageTypeString, galleryIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HybrisImage)) {
            return false;
        }
        HybrisImage hybrisImage = (HybrisImage) other;
        return Intrinsics.e(this.url, hybrisImage.url) && Intrinsics.e(this.altText, hybrisImage.altText) && Intrinsics.e(this.formatString, hybrisImage.formatString) && Intrinsics.e(this.imageTypeString, hybrisImage.imageTypeString) && Intrinsics.e(this.galleryIndex, hybrisImage.galleryIndex);
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        String str = this.altText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.formatString;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageTypeString;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.galleryIndex;
        return iHashCode4 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "HybrisImage(url=" + this.url + ", altText=" + this.altText + ", formatString=" + this.formatString + ", imageTypeString=" + this.imageTypeString + ", galleryIndex=" + this.galleryIndex + ')';
    }

    public HybrisImage(@g(name = "url") String url, @g(name = "altText") String str, @g(name = "format") String str2, @g(name = "imageType") String str3, @g(name = "galleryIndex") Integer num) {
        Intrinsics.j(url, "url");
        this.url = url;
        this.altText = str;
        this.formatString = str2;
        this.imageTypeString = str3;
        this.galleryIndex = num;
    }

    /* renamed from: a, reason: from getter */
    public final String getAltText() {
        return this.altText;
    }

    /* renamed from: b, reason: from getter */
    public final String getFormatString() {
        return this.formatString;
    }

    /* renamed from: c, reason: from getter */
    public final Integer getGalleryIndex() {
        return this.galleryIndex;
    }

    /* renamed from: d, reason: from getter */
    public final String getImageTypeString() {
        return this.imageTypeString;
    }

    /* renamed from: e, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public /* synthetic */ HybrisImage(String str, String str2, String str3, String str4, Integer num, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? g.b.f152485c.getFormat() : str3, (i10 & 8) != 0 ? g.c.f152490b.getType() : str4, (i10 & 16) != 0 ? 0 : num);
    }
}
