package com.meijer.mobile.meijer.activity.find.viewmodel;

import Co.Image;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0014R\u0014\u0010$\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0014R\u0011\u0010&\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0011\u0010(\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b'\u0010\u0014R\u0011\u0010+\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0011\u0010,\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010-\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b \u0010\u0014R\u0013\u0010/\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b.\u0010\u0014¨\u00060"}, d2 = {"Lcom/meijer/mobile/meijer/activity/find/viewmodel/l1;", "Landroid/os/Parcelable;", "LCo/e;", "smallImage", "largeImage", "", "largeImageLoaded", "<init>", "(LCo/e;LCo/e;Z)V", "Landroid/os/Parcel;", "dest", "", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LCo/e;", "d", "()LCo/e;", "b", "getLargeImage", "c", "Z", "e", "smallImageUrl", "largeImageUrl", "F0", "altText", "a1", "imageId", "z", "()Z", "isPrimary", "initialImage", "primaryImageUrl", "f", "thumbnailImageURL", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.l1, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class ProductImageViewModel implements Parcelable {
    public static final Parcelable.Creator<ProductImageViewModel> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Image smallImage;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Image largeImage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean largeImageLoaded;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.meijer.mobile.meijer.activity.find.viewmodel.l1$a */
    public static final class a implements Parcelable.Creator<ProductImageViewModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProductImageViewModel createFromParcel(Parcel parcel) {
            Intrinsics.j(parcel, "parcel");
            return new ProductImageViewModel((Image) parcel.readParcelable(ProductImageViewModel.class.getClassLoader()), (Image) parcel.readParcelable(ProductImageViewModel.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ProductImageViewModel[] newArray(int i10) {
            return new ProductImageViewModel[i10];
        }
    }

    public ProductImageViewModel(Image smallImage, Image largeImage, boolean z10) {
        Intrinsics.j(smallImage, "smallImage");
        Intrinsics.j(largeImage, "largeImage");
        this.smallImage = smallImage;
        this.largeImage = largeImage;
        this.largeImageLoaded = z10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductImageViewModel)) {
            return false;
        }
        ProductImageViewModel productImageViewModel = (ProductImageViewModel) other;
        return Intrinsics.e(this.smallImage, productImageViewModel.smallImage) && Intrinsics.e(this.largeImage, productImageViewModel.largeImage) && this.largeImageLoaded == productImageViewModel.largeImageLoaded;
    }

    public int hashCode() {
        return (((this.smallImage.hashCode() * 31) + this.largeImage.hashCode()) * 31) + Boolean.hashCode(this.largeImageLoaded);
    }

    public String toString() {
        return "ProductImageViewModel(smallImage=" + this.smallImage + ", largeImage=" + this.largeImage + ", largeImageLoaded=" + this.largeImageLoaded + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.j(dest, "dest");
        dest.writeParcelable(this.smallImage, flags);
        dest.writeParcelable(this.largeImage, flags);
        dest.writeInt(this.largeImageLoaded ? 1 : 0);
    }

    private final String b() {
        Image image = this.largeImage;
        if (!image.h()) {
            image = null;
        }
        String url = image != null ? image.getUrl() : null;
        return url == null ? "" : url;
    }

    private final String e() {
        Image image = this.smallImage;
        if (!image.h()) {
            image = null;
        }
        String url = image != null ? image.getUrl() : null;
        return url == null ? "" : url;
    }

    public final String F0() {
        String altText = this.largeImage.getAltText();
        return altText == null ? "" : altText;
    }

    public final String a() {
        if (!this.largeImageLoaded && this.smallImage.h()) {
            return e();
        }
        this.largeImageLoaded = true;
        return b();
    }

    public final String a1() {
        return this.largeImage.getUrl();
    }

    public final String c() {
        if (!this.largeImage.h()) {
            return e();
        }
        this.largeImageLoaded = true;
        return b();
    }

    /* renamed from: d, reason: from getter */
    public final Image getSmallImage() {
        return this.smallImage;
    }

    public final boolean z() {
        return this.largeImage.z();
    }

    public final String f() {
        String strE = e();
        if (!StringsKt.r0(strE)) {
            return strE;
        }
        return null;
    }

    public /* synthetic */ ProductImageViewModel(Image image, Image image2, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(image, image2, (i10 & 4) != 0 ? false : z10);
    }
}
