package com.scandit.datacapture.barcode.find.capture;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, d2 = {"Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItemContent;", "", "", "info", "additionalInfo", "Landroid/graphics/Bitmap;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Landroid/graphics/Bitmap;", "copy", "(Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Bitmap;)Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItemContent;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getInfo", "b", "getAdditionalInfo", "c", "Landroid/graphics/Bitmap;", "getImage", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final /* data */ class BarcodeFindItemContent {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String info;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String additionalInfo;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Bitmap image;

    public static /* synthetic */ BarcodeFindItemContent copy$default(BarcodeFindItemContent barcodeFindItemContent, String str, String str2, Bitmap bitmap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = barcodeFindItemContent.info;
        }
        if ((i10 & 2) != 0) {
            str2 = barcodeFindItemContent.additionalInfo;
        }
        if ((i10 & 4) != 0) {
            bitmap = barcodeFindItemContent.image;
        }
        return barcodeFindItemContent.copy(str, str2, bitmap);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAdditionalInfo() {
        return this.additionalInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final Bitmap getImage() {
        return this.image;
    }

    public final BarcodeFindItemContent copy(String info, String additionalInfo, Bitmap image) {
        return new BarcodeFindItemContent(info, additionalInfo, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodeFindItemContent)) {
            return false;
        }
        BarcodeFindItemContent barcodeFindItemContent = (BarcodeFindItemContent) other;
        return Intrinsics.e(this.info, barcodeFindItemContent.info) && Intrinsics.e(this.additionalInfo, barcodeFindItemContent.additionalInfo) && Intrinsics.e(this.image, barcodeFindItemContent.image);
    }

    public int hashCode() {
        String str = this.info;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.additionalInfo;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Bitmap bitmap = this.image;
        return iHashCode2 + (bitmap != null ? bitmap.hashCode() : 0);
    }

    public String toString() {
        return "BarcodeFindItemContent(info=" + this.info + ", additionalInfo=" + this.additionalInfo + ", image=" + this.image + ')';
    }

    public final String getAdditionalInfo() {
        return this.additionalInfo;
    }

    public final Bitmap getImage() {
        return this.image;
    }

    public final String getInfo() {
        return this.info;
    }

    public BarcodeFindItemContent(String str, String str2, Bitmap bitmap) {
        this.info = str;
        this.additionalInfo = str2;
        this.image = bitmap;
    }
}
