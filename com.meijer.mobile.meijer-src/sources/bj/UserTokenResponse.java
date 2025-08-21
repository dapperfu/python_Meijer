package bj;

import Cs.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import sk.EnumC17080a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010\u001bR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b\u0017\u0010'\"\u0004\b(\u0010)R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010\u0018\u001a\u0004\b+\u0010\u000f\"\u0004\b,\u0010\u001bR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102¨\u00063"}, d2 = {"Lbj/a;", "", "", "tokenType", "", "expiresIn", "refreshToken", "LCs/d;", "tokenDetails", "error", "Lsk/a;", "errorType", "<init>", "(Ljava/lang/String;JLjava/lang/String;LCs/d;Ljava/lang/String;Lsk/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getTokenType", "setTokenType", "(Ljava/lang/String;)V", "b", "J", "getExpiresIn", "()J", "setExpiresIn", "(J)V", "c", "getRefreshToken", "setRefreshToken", "d", "LCs/d;", "()LCs/d;", "setTokenDetails", "(LCs/d;)V", "e", "getError", "setError", "f", "Lsk/a;", "getErrorType", "()Lsk/a;", "setErrorType", "(Lsk/a;)V", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bj.a, reason: case insensitive filesystem and from toString */
/* loaded from: classes8.dex */
public final /* data */ class UserTokenResponse {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private String tokenType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private long expiresIn;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private String refreshToken;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private d tokenDetails;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private String error;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private EnumC17080a errorType;

    public UserTokenResponse() {
        this(null, 0L, null, null, null, null, 63, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserTokenResponse)) {
            return false;
        }
        UserTokenResponse userTokenResponse = (UserTokenResponse) other;
        return Intrinsics.e(this.tokenType, userTokenResponse.tokenType) && this.expiresIn == userTokenResponse.expiresIn && Intrinsics.e(this.refreshToken, userTokenResponse.refreshToken) && Intrinsics.e(this.tokenDetails, userTokenResponse.tokenDetails) && Intrinsics.e(this.error, userTokenResponse.error) && this.errorType == userTokenResponse.errorType;
    }

    public UserTokenResponse(String str, long j10, String str2, d dVar, String str3, EnumC17080a enumC17080a) {
        this.tokenType = str;
        this.expiresIn = j10;
        this.refreshToken = str2;
        this.tokenDetails = dVar;
        this.error = str3;
        this.errorType = enumC17080a;
    }

    /* renamed from: a, reason: from getter */
    public final d getTokenDetails() {
        return this.tokenDetails;
    }

    public int hashCode() {
        String str = this.tokenType;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.expiresIn)) * 31;
        String str2 = this.refreshToken;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        d dVar = this.tokenDetails;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str3 = this.error;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        EnumC17080a enumC17080a = this.errorType;
        return iHashCode4 + (enumC17080a != null ? enumC17080a.hashCode() : 0);
    }

    public String toString() {
        return "UserTokenResponse(tokenType=" + this.tokenType + ", expiresIn=" + this.expiresIn + ", refreshToken=" + this.refreshToken + ", tokenDetails=" + this.tokenDetails + ", error=" + this.error + ", errorType=" + this.errorType + ')';
    }

    public /* synthetic */ UserTokenResponse(String str, long j10, String str2, d dVar, String str3, EnumC17080a enumC17080a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? 0L : j10, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : dVar, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : enumC17080a);
    }
}
