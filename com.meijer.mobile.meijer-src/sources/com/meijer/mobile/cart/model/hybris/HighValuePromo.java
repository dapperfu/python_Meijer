package com.meijer.mobile.cart.model.hybris;

import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0015BC\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJL\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001a\u0010\r¨\u0006\u001c"}, d2 = {"Lcom/meijer/mobile/cart/model/hybris/HighValuePromo;", "", "", "advText", "expirationDate", "promoDesc", "promoNum", "promptResponse", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/cart/model/hybris/HighValuePromo;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "f", "hybris_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class HighValuePromo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String advText;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String expirationDate;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoDesc;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promoNum;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String promptResponse;

    public final HighValuePromo copy(@g(name = "advText") String advText, @g(name = "expirationDate") String expirationDate, @g(name = "promoDesc") String promoDesc, @g(name = "promoNum") String promoNum, @g(name = "promptResponse") String promptResponse) {
        return new HighValuePromo(advText, expirationDate, promoDesc, promoNum, promptResponse);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HighValuePromo)) {
            return false;
        }
        HighValuePromo highValuePromo = (HighValuePromo) other;
        return Intrinsics.e(this.advText, highValuePromo.advText) && Intrinsics.e(this.expirationDate, highValuePromo.expirationDate) && Intrinsics.e(this.promoDesc, highValuePromo.promoDesc) && Intrinsics.e(this.promoNum, highValuePromo.promoNum) && Intrinsics.e(this.promptResponse, highValuePromo.promptResponse);
    }

    public int hashCode() {
        String str = this.advText;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.expirationDate;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.promoDesc;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.promoNum;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.promptResponse;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "HighValuePromo(advText=" + this.advText + ", expirationDate=" + this.expirationDate + ", promoDesc=" + this.promoDesc + ", promoNum=" + this.promoNum + ", promptResponse=" + this.promptResponse + ')';
    }

    /* renamed from: a, reason: from getter */
    public final String getAdvText() {
        return this.advText;
    }

    /* renamed from: b, reason: from getter */
    public final String getExpirationDate() {
        return this.expirationDate;
    }

    /* renamed from: c, reason: from getter */
    public final String getPromoDesc() {
        return this.promoDesc;
    }

    /* renamed from: d, reason: from getter */
    public final String getPromoNum() {
        return this.promoNum;
    }

    /* renamed from: e, reason: from getter */
    public final String getPromptResponse() {
        return this.promptResponse;
    }

    public HighValuePromo(@g(name = "advText") String str, @g(name = "expirationDate") String str2, @g(name = "promoDesc") String str3, @g(name = "promoNum") String str4, @g(name = "promptResponse") String str5) {
        this.advText = str;
        this.expirationDate = str2;
        this.promoDesc = str3;
        this.promoNum = str4;
        this.promptResponse = str5;
    }
}
