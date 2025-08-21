package com.meijer.mobile.authentication.core.model;

import Cs.d;
import com.squareup.moshi.g;
import com.squareup.moshi.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@i(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ@\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u0019R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\f\"\u0004\b\u001c\u0010\u0019R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u001d\u0010\u0019R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001a\u0010\f\"\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Lcom/meijer/mobile/authentication/core/model/TokenDetails;", "LCs/d;", "", "tokenString", "digitalId", "externalShopperId", "shopperId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/meijer/mobile/authentication/core/model/TokenDetails;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "setTokenString", "(Ljava/lang/String;)V", "b", "c", "setDigitalId", "setExternalShopperId", "d", "setShopperId", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class TokenDetails implements d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String tokenString;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private String digitalId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String externalShopperId;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private String shopperId;

    public TokenDetails() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ TokenDetails d(TokenDetails tokenDetails, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = tokenDetails.tokenString;
        }
        if ((i10 & 2) != 0) {
            str2 = tokenDetails.digitalId;
        }
        if ((i10 & 4) != 0) {
            str3 = tokenDetails.externalShopperId;
        }
        if ((i10 & 8) != 0) {
            str4 = tokenDetails.shopperId;
        }
        return tokenDetails.copy(str, str2, str3, str4);
    }

    public final TokenDetails copy(String tokenString, @g(name = "digital_id") String digitalId, @g(name = "mperks_ext_shopper_id") String externalShopperId, @g(name = "mperks_shopper_id") String shopperId) {
        return new TokenDetails(tokenString, digitalId, externalShopperId, shopperId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenDetails)) {
            return false;
        }
        TokenDetails tokenDetails = (TokenDetails) other;
        return Intrinsics.e(this.tokenString, tokenDetails.tokenString) && Intrinsics.e(this.digitalId, tokenDetails.digitalId) && Intrinsics.e(this.externalShopperId, tokenDetails.externalShopperId) && Intrinsics.e(this.shopperId, tokenDetails.shopperId);
    }

    public int hashCode() {
        String str = this.tokenString;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.digitalId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.externalShopperId;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.shopperId;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "TokenDetails(tokenString=" + this.tokenString + ", digitalId=" + this.digitalId + ", externalShopperId=" + this.externalShopperId + ", shopperId=" + this.shopperId + ')';
    }

    public TokenDetails(String str, @g(name = "digital_id") String str2, @g(name = "mperks_ext_shopper_id") String str3, @g(name = "mperks_shopper_id") String str4) {
        this.tokenString = str;
        this.digitalId = str2;
        this.externalShopperId = str3;
        this.shopperId = str4;
    }

    @Override // Cs.d
    /* renamed from: a, reason: from getter */
    public String getExternalShopperId() {
        return this.externalShopperId;
    }

    @Override // Cs.d
    /* renamed from: b, reason: from getter */
    public String getShopperId() {
        return this.shopperId;
    }

    @Override // Cs.d
    /* renamed from: c, reason: from getter */
    public String getDigitalId() {
        return this.digitalId;
    }

    /* renamed from: e, reason: from getter */
    public final String getTokenString() {
        return this.tokenString;
    }

    public /* synthetic */ TokenDetails(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4);
    }
}
