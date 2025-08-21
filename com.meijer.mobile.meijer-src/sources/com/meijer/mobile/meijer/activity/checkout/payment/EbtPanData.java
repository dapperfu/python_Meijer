package com.meijer.mobile.meijer.activity.checkout.payment;

import Jl.C3881c;
import androidx.recyclerview.widget.RecyclerView;
import com.meijer.mobile.authentication.core.model.BearerToken;
import com.meijer.mobile.meijer.activity.checkout.payment.ebt.request.MjrEbtPanDataRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\nR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/meijer/mobile/meijer/activity/checkout/payment/p0;", "", "", "Lcom/meijer/mobile/core/model/common/ResourceId;", "cartId", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "bearerToken", "<init>", "(Ljava/lang/String;Lcom/meijer/mobile/authentication/core/model/BearerToken;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCartId", "b", "Lcom/meijer/mobile/authentication/core/model/BearerToken;", "()Lcom/meijer/mobile/authentication/core/model/BearerToken;", "c", "panDataEncoded", "Lokhttp3/HttpUrl;", "()Lokhttp3/HttpUrl;", "ebtPinPadUrl", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.meijer.mobile.meijer.activity.checkout.payment.p0, reason: from toString */
/* loaded from: classes10.dex */
public final /* data */ class EbtPanData {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String cartId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final BearerToken bearerToken;

    /* JADX WARN: Multi-variable type inference failed */
    public EbtPanData() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EbtPanData)) {
            return false;
        }
        EbtPanData ebtPanData = (EbtPanData) other;
        return Intrinsics.e(this.cartId, ebtPanData.cartId) && Intrinsics.e(this.bearerToken, ebtPanData.bearerToken);
    }

    public int hashCode() {
        String str = this.cartId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BearerToken bearerToken = this.bearerToken;
        return iHashCode + (bearerToken != null ? bearerToken.hashCode() : 0);
    }

    public String toString() {
        return "EbtPanData(cartId=" + this.cartId + ", bearerToken=" + this.bearerToken + ')';
    }

    public EbtPanData(String str, BearerToken bearerToken) {
        this.cartId = str;
        this.bearerToken = bearerToken;
    }

    private final String c() {
        Hm.e eVar = Hm.e.f13725a;
        MjrEbtPanDataRequest mjrEbtPanDataRequest = new MjrEbtPanDataRequest(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        String str = this.cartId;
        BearerToken bearerToken = this.bearerToken;
        String accessToken = bearerToken != null ? bearerToken.getAccessToken() : null;
        if (accessToken == null) {
            accessToken = "";
        }
        return eVar.h(mjrEbtPanDataRequest.copy((16374 & 1) != 0 ? mjrEbtPanDataRequest.usrToken : accessToken, (16374 & 2) != 0 ? mjrEbtPanDataRequest.divInjectionId : null, (16374 & 4) != 0 ? mjrEbtPanDataRequest.mjrHost : null, (16374 & 8) != 0 ? mjrEbtPanDataRequest.cartId : str, (16374 & 16) != 0 ? mjrEbtPanDataRequest.iframePanId : null, (16374 & 32) != 0 ? mjrEbtPanDataRequest.inputPanId : null, (16374 & 64) != 0 ? mjrEbtPanDataRequest.inputExpId : null, (16374 & 128) != 0 ? mjrEbtPanDataRequest.apiUrl : null, (16374 & 256) != 0 ? mjrEbtPanDataRequest.iframeUrl : null, (16374 & 512) != 0 ? mjrEbtPanDataRequest.mjrApp : null, (16374 & 1024) != 0 ? mjrEbtPanDataRequest.style : null, (16374 & RecyclerView.m.FLAG_MOVED) != 0 ? mjrEbtPanDataRequest.inputExpMonthId : null, (16374 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? mjrEbtPanDataRequest.inputExpYearId : null, (16374 & 8192) != 0 ? mjrEbtPanDataRequest.sapHost : null));
    }

    /* renamed from: a, reason: from getter */
    public final BearerToken getBearerToken() {
        return this.bearerToken;
    }

    public final HttpUrl b() {
        HttpUrl.a aVarI;
        HttpUrl.a aVarL = C3881c.f15937a.h().l("DRTrxPan/Ebt/Pan");
        if (aVarL == null || (aVarI = aVarL.i(c())) == null) {
            return null;
        }
        return aVarI.g();
    }

    public /* synthetic */ EbtPanData(String str, BearerToken bearerToken, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : bearerToken);
    }
}
