package com.meijer.mobile.greenville.model.response;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/meijer/mobile/greenville/model/response/SpecialItemResponse;", "", "", "", "itemList", "", "customerMessageTitle", "customerMessage", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/greenville/model/response/SpecialItemResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Ljava/lang/String;", "greenville_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class SpecialItemResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Integer> itemList;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerMessageTitle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String customerMessage;

    public final SpecialItemResponse copy(@g(name = "itemList") List<Integer> itemList, @g(name = "customerMessageTitle") String customerMessageTitle, @g(name = "customerMessage") String customerMessage) {
        Intrinsics.j(itemList, "itemList");
        Intrinsics.j(customerMessageTitle, "customerMessageTitle");
        Intrinsics.j(customerMessage, "customerMessage");
        return new SpecialItemResponse(itemList, customerMessageTitle, customerMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpecialItemResponse)) {
            return false;
        }
        SpecialItemResponse specialItemResponse = (SpecialItemResponse) other;
        return Intrinsics.e(this.itemList, specialItemResponse.itemList) && Intrinsics.e(this.customerMessageTitle, specialItemResponse.customerMessageTitle) && Intrinsics.e(this.customerMessage, specialItemResponse.customerMessage);
    }

    public int hashCode() {
        return (((this.itemList.hashCode() * 31) + this.customerMessageTitle.hashCode()) * 31) + this.customerMessage.hashCode();
    }

    public String toString() {
        return "SpecialItemResponse(itemList=" + this.itemList + ", customerMessageTitle=" + this.customerMessageTitle + ", customerMessage=" + this.customerMessage + ')';
    }

    public SpecialItemResponse(@g(name = "itemList") List<Integer> itemList, @g(name = "customerMessageTitle") String customerMessageTitle, @g(name = "customerMessage") String customerMessage) {
        Intrinsics.j(itemList, "itemList");
        Intrinsics.j(customerMessageTitle, "customerMessageTitle");
        Intrinsics.j(customerMessage, "customerMessage");
        this.itemList = itemList;
        this.customerMessageTitle = customerMessageTitle;
        this.customerMessage = customerMessage;
    }

    /* renamed from: a, reason: from getter */
    public final String getCustomerMessage() {
        return this.customerMessage;
    }

    /* renamed from: b, reason: from getter */
    public final String getCustomerMessageTitle() {
        return this.customerMessageTitle;
    }

    public final List<Integer> c() {
        return this.itemList;
    }
}
