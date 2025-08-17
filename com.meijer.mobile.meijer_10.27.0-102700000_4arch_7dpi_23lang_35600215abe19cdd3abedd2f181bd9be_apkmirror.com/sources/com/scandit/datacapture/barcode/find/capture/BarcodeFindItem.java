package com.scandit.datacapture.barcode.find.capture;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItem;", "", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItemSearchOptions;", "searchOptions", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItemContent;", "content", "<init>", "(Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItemSearchOptions;Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItemContent;)V", "component1", "()Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItemSearchOptions;", "component2", "()Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItemContent;", "copy", "(Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItemSearchOptions;Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItemContent;)Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItem;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItemSearchOptions;", "getSearchOptions", "b", "Lcom/scandit/datacapture/barcode/find/capture/BarcodeFindItemContent;", "getContent", "scandit-barcode-capture"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final /* data */ class BarcodeFindItem {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final BarcodeFindItemSearchOptions searchOptions;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final BarcodeFindItemContent content;

    public static /* synthetic */ BarcodeFindItem copy$default(BarcodeFindItem barcodeFindItem, BarcodeFindItemSearchOptions barcodeFindItemSearchOptions, BarcodeFindItemContent barcodeFindItemContent, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            barcodeFindItemSearchOptions = barcodeFindItem.searchOptions;
        }
        if ((i10 & 2) != 0) {
            barcodeFindItemContent = barcodeFindItem.content;
        }
        return barcodeFindItem.copy(barcodeFindItemSearchOptions, barcodeFindItemContent);
    }

    /* renamed from: component1, reason: from getter */
    public final BarcodeFindItemSearchOptions getSearchOptions() {
        return this.searchOptions;
    }

    /* renamed from: component2, reason: from getter */
    public final BarcodeFindItemContent getContent() {
        return this.content;
    }

    public final BarcodeFindItem copy(BarcodeFindItemSearchOptions searchOptions, BarcodeFindItemContent content) {
        Intrinsics.j(searchOptions, "searchOptions");
        return new BarcodeFindItem(searchOptions, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodeFindItem)) {
            return false;
        }
        BarcodeFindItem barcodeFindItem = (BarcodeFindItem) other;
        return Intrinsics.e(this.searchOptions, barcodeFindItem.searchOptions) && Intrinsics.e(this.content, barcodeFindItem.content);
    }

    public int hashCode() {
        int iHashCode = this.searchOptions.hashCode() * 31;
        BarcodeFindItemContent barcodeFindItemContent = this.content;
        return iHashCode + (barcodeFindItemContent == null ? 0 : barcodeFindItemContent.hashCode());
    }

    public String toString() {
        return "BarcodeFindItem(searchOptions=" + this.searchOptions + ", content=" + this.content + ')';
    }

    public BarcodeFindItem(BarcodeFindItemSearchOptions searchOptions, BarcodeFindItemContent barcodeFindItemContent) {
        Intrinsics.j(searchOptions, "searchOptions");
        this.searchOptions = searchOptions;
        this.content = barcodeFindItemContent;
    }

    public final BarcodeFindItemContent getContent() {
        return this.content;
    }

    public final BarcodeFindItemSearchOptions getSearchOptions() {
        return this.searchOptions;
    }
}
