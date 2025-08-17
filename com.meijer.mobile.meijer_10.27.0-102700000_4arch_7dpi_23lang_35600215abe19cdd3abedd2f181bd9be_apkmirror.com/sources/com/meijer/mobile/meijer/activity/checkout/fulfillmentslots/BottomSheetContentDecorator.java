package com.meijer.mobile.meijer.activity.checkout.fulfillmentslots;

import ak.AbstractC5607a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/f;", "", "Lak/a;", "headerText", "", "Lcom/meijer/mobile/meijer/activity/checkout/fulfillmentslots/g;", "content", "<init>", "(Lak/a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lak/a;", "b", "()Lak/a;", "Ljava/util/List;", "()Ljava/util/List;", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.fulfillmentslots.f, reason: case insensitive filesystem and from toString */
/* loaded from: classes9.dex */
public final /* data */ class BottomSheetContentDecorator {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC5607a headerText;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<ContentRowData> content;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomSheetContentDecorator)) {
            return false;
        }
        BottomSheetContentDecorator bottomSheetContentDecorator = (BottomSheetContentDecorator) other;
        return Intrinsics.e(this.headerText, bottomSheetContentDecorator.headerText) && Intrinsics.e(this.content, bottomSheetContentDecorator.content);
    }

    public int hashCode() {
        AbstractC5607a abstractC5607a = this.headerText;
        return ((abstractC5607a == null ? 0 : abstractC5607a.hashCode()) * 31) + this.content.hashCode();
    }

    public String toString() {
        return "BottomSheetContentDecorator(headerText=" + this.headerText + ", content=" + this.content + ')';
    }

    public BottomSheetContentDecorator(AbstractC5607a abstractC5607a, List<ContentRowData> content) {
        Intrinsics.j(content, "content");
        this.headerText = abstractC5607a;
        this.content = content;
    }

    public final List<ContentRowData> a() {
        return this.content;
    }

    /* renamed from: b, reason: from getter */
    public final AbstractC5607a getHeaderText() {
        return this.headerText;
    }
}
