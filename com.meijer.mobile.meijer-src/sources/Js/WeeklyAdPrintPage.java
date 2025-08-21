package Js;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, d2 = {"LJs/c;", "", "", "page", "", "left", "width", "top", "height", "", "image", "<init>", "(IFFFFLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getPage", "b", "F", "getLeft", "()F", "c", "getWidth", "d", "getTop", "e", "getHeight", "f", "Ljava/lang/String;", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Js.c, reason: from toString */
/* loaded from: classes12.dex */
public final /* data */ class WeeklyAdPrintPage {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int page;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float left;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float width;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float top;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float height;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String image;

    public WeeklyAdPrintPage() {
        this(0, 0.0f, 0.0f, 0.0f, 0.0f, null, 63, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeeklyAdPrintPage)) {
            return false;
        }
        WeeklyAdPrintPage weeklyAdPrintPage = (WeeklyAdPrintPage) other;
        return this.page == weeklyAdPrintPage.page && Float.compare(this.left, weeklyAdPrintPage.left) == 0 && Float.compare(this.width, weeklyAdPrintPage.width) == 0 && Float.compare(this.top, weeklyAdPrintPage.top) == 0 && Float.compare(this.height, weeklyAdPrintPage.height) == 0 && Intrinsics.e(this.image, weeklyAdPrintPage.image);
    }

    public WeeklyAdPrintPage(int i10, float f10, float f11, float f12, float f13, String str) {
        this.page = i10;
        this.left = f10;
        this.width = f11;
        this.top = f12;
        this.height = f13;
        this.image = str;
    }

    /* renamed from: a, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public int hashCode() {
        int iHashCode = ((((((((Integer.hashCode(this.page) * 31) + Float.hashCode(this.left)) * 31) + Float.hashCode(this.width)) * 31) + Float.hashCode(this.top)) * 31) + Float.hashCode(this.height)) * 31;
        String str = this.image;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "WeeklyAdPrintPage(page=" + this.page + ", left=" + this.left + ", width=" + this.width + ", top=" + this.top + ", height=" + this.height + ", image=" + this.image + ')';
    }

    public /* synthetic */ WeeklyAdPrintPage(int i10, float f10, float f11, float f12, float f13, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 0.0f : f10, (i11 & 4) != 0 ? 0.0f : f11, (i11 & 8) != 0 ? 0.0f : f12, (i11 & 16) != 0 ? 0.0f : f13, (i11 & 32) != 0 ? null : str);
    }
}
