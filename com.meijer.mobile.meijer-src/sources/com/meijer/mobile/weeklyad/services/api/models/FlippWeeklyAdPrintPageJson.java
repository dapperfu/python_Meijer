package com.meijer.mobile.weeklyad.services.api.models;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0003\u0010\b\u001a\u00020\u0004\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJN\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001d\u001a\u0004\b\u0017\u0010\u001f\"\u0004\b&\u0010!R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010'\u001a\u0004\b\u001c\u0010\u0010\"\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/meijer/mobile/weeklyad/services/api/models/FlippWeeklyAdPrintPageJson;", "", "", "page", "", "left", "width", "top", "height", "", "image", "<init>", "(IFFFFLjava/lang/String;)V", "copy", "(IFFFFLjava/lang/String;)Lcom/meijer/mobile/weeklyad/services/api/models/FlippWeeklyAdPrintPageJson;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "d", "setPage", "(I)V", "b", "F", "c", "()F", "setLeft", "(F)V", "f", "setWidth", "e", "setTop", "setHeight", "Ljava/lang/String;", "setImage", "(Ljava/lang/String;)V", "flipp_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FlippWeeklyAdPrintPageJson {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private int page;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private float left;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private float width;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private float top;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private float height;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private String image;

    public FlippWeeklyAdPrintPageJson() {
        this(0, 0.0f, 0.0f, 0.0f, 0.0f, null, 63, null);
    }

    public final FlippWeeklyAdPrintPageJson copy(@g(name = "page") int page, @g(name = "left") float left, @g(name = "width") float width, @g(name = "top") float top, @g(name = "height") float height, @g(name = "image_400h_url") String image) {
        return new FlippWeeklyAdPrintPageJson(page, left, width, top, height, image);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlippWeeklyAdPrintPageJson)) {
            return false;
        }
        FlippWeeklyAdPrintPageJson flippWeeklyAdPrintPageJson = (FlippWeeklyAdPrintPageJson) other;
        return this.page == flippWeeklyAdPrintPageJson.page && Float.compare(this.left, flippWeeklyAdPrintPageJson.left) == 0 && Float.compare(this.width, flippWeeklyAdPrintPageJson.width) == 0 && Float.compare(this.top, flippWeeklyAdPrintPageJson.top) == 0 && Float.compare(this.height, flippWeeklyAdPrintPageJson.height) == 0 && Intrinsics.e(this.image, flippWeeklyAdPrintPageJson.image);
    }

    public int hashCode() {
        int iHashCode = ((((((((Integer.hashCode(this.page) * 31) + Float.hashCode(this.left)) * 31) + Float.hashCode(this.width)) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.height)) * 31;
        String str = this.image;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FlippWeeklyAdPrintPageJson(page=" + this.page + ", left=" + this.left + ", width=" + this.width + ", top=" + this.top + ", height=" + this.height + ", image=" + this.image + ')';
    }

    public FlippWeeklyAdPrintPageJson(@g(name = "page") int i10, @g(name = "left") float f10, @g(name = "width") float f11, @g(name = "top") float f12, @g(name = "height") float f13, @g(name = "image_400h_url") String str) {
        this.page = i10;
        this.left = f10;
        this.width = f11;
        this.top = f12;
        this.height = f13;
        this.image = str;
    }

    /* renamed from: a, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* renamed from: b, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* renamed from: c, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    /* renamed from: d, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    /* renamed from: e, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    /* renamed from: f, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public /* synthetic */ FlippWeeklyAdPrintPageJson(int i10, float f10, float f11, float f12, float f13, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 0.0f : f10, (i11 & 4) != 0 ? 0.0f : f11, (i11 & 8) != 0 ? 0.0f : f12, (i11 & 16) != 0 ? 0.0f : f13, (i11 & 32) != 0 ? null : str);
    }
}
