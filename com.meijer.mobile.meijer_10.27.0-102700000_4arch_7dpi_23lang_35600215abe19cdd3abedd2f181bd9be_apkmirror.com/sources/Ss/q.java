package Ss;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u000e\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u000f\u001a\u0004\b\u001b\u0010\u0011¨\u0006\u001c"}, d2 = {"LSs/q;", "", "Lokhttp3/HttpUrl;", "issuer", "authorizationEndpoint", "tokenEndpoint", "userInfoEndpoint", "jwksUri", "introspectionEndpoint", "revocationEndpoint", "endSessionEndpoint", "deviceAuthorizationEndpoint", "<init>", "(Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;)V", "a", "Lokhttp3/HttpUrl;", "c", "()Lokhttp3/HttpUrl;", "b", "f", "d", "getUserInfoEndpoint", "e", "getIntrospectionEndpoint", "g", "h", "i", "getDeviceAuthorizationEndpoint", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final HttpUrl issuer;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final HttpUrl authorizationEndpoint;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final HttpUrl tokenEndpoint;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final HttpUrl userInfoEndpoint;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final HttpUrl jwksUri;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final HttpUrl introspectionEndpoint;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final HttpUrl revocationEndpoint;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final HttpUrl endSessionEndpoint;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final HttpUrl deviceAuthorizationEndpoint;

    public q(HttpUrl issuer, HttpUrl httpUrl, HttpUrl tokenEndpoint, HttpUrl httpUrl2, HttpUrl httpUrl3, HttpUrl httpUrl4, HttpUrl httpUrl5, HttpUrl httpUrl6, HttpUrl httpUrl7) {
        Intrinsics.j(issuer, "issuer");
        Intrinsics.j(tokenEndpoint, "tokenEndpoint");
        this.issuer = issuer;
        this.authorizationEndpoint = httpUrl;
        this.tokenEndpoint = tokenEndpoint;
        this.userInfoEndpoint = httpUrl2;
        this.jwksUri = httpUrl3;
        this.introspectionEndpoint = httpUrl4;
        this.revocationEndpoint = httpUrl5;
        this.endSessionEndpoint = httpUrl6;
        this.deviceAuthorizationEndpoint = httpUrl7;
    }

    /* renamed from: a, reason: from getter */
    public final HttpUrl getAuthorizationEndpoint() {
        return this.authorizationEndpoint;
    }

    /* renamed from: b, reason: from getter */
    public final HttpUrl getEndSessionEndpoint() {
        return this.endSessionEndpoint;
    }

    /* renamed from: c, reason: from getter */
    public final HttpUrl getIssuer() {
        return this.issuer;
    }

    /* renamed from: d, reason: from getter */
    public final HttpUrl getJwksUri() {
        return this.jwksUri;
    }

    /* renamed from: e, reason: from getter */
    public final HttpUrl getRevocationEndpoint() {
        return this.revocationEndpoint;
    }

    /* renamed from: f, reason: from getter */
    public final HttpUrl getTokenEndpoint() {
        return this.tokenEndpoint;
    }
}
