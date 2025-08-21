package com.okta.authfoundation.client;

import Dv.C3136e0;
import Dv.InterfaceC3160z;
import Dv.Z;
import Dv.n0;
import Ss.q;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0001\u0018\u0000 92\u00020\u0001:\u0002\u001b\u0018Bu\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u001d\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u001fR \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001d\u0012\u0004\b&\u0010!\u001a\u0004\b%\u0010\u001fR\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010\u001d\u0012\u0004\b)\u0010!\u001a\u0004\b(\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\u001d\u0012\u0004\b,\u0010!\u001a\u0004\b+\u0010\u001fR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010\u001d\u0012\u0004\b/\u0010!\u001a\u0004\b.\u0010\u001fR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b0\u0010\u001d\u0012\u0004\b2\u0010!\u001a\u0004\b1\u0010\u001fR\"\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010\u001d\u0012\u0004\b5\u0010!\u001a\u0004\b4\u0010\u001fR\"\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b6\u0010\u001d\u0012\u0004\b8\u0010!\u001a\u0004\b7\u0010\u001f¨\u0006:"}, d2 = {"Lcom/okta/authfoundation/client/k;", "", "", "seen0", "Lokhttp3/HttpUrl;", "issuer", "authorizationEndpoint", "tokenEndpoint", "userInfoEndpoint", "jwksUri", "introspectionEndpoint", "revocationEndpoint", "endSessionEndpoint", "deviceAuthorizationEndpoint", "LDv/n0;", "serializationConstructorMarker", "<init>", "(ILokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;LDv/n0;)V", "self", "LCv/d;", "output", "LBv/f;", "serialDesc", "", "b", "(Lcom/okta/authfoundation/client/k;LCv/d;LBv/f;)V", "LSs/q;", "a", "()LSs/q;", "Lokhttp3/HttpUrl;", "getIssuer", "()Lokhttp3/HttpUrl;", "getIssuer$annotations", "()V", "getAuthorizationEndpoint", "getAuthorizationEndpoint$annotations", "c", "getTokenEndpoint", "getTokenEndpoint$annotations", "d", "getUserInfoEndpoint", "getUserInfoEndpoint$annotations", "e", "getJwksUri", "getJwksUri$annotations", "f", "getIntrospectionEndpoint", "getIntrospectionEndpoint$annotations", "g", "getRevocationEndpoint", "getRevocationEndpoint$annotations", "h", "getEndSessionEndpoint", "getEndSessionEndpoint$annotations", "i", "getDeviceAuthorizationEndpoint", "getDeviceAuthorizationEndpoint$annotations", "Companion", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

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

    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/okta/authfoundation/client/SerializableOidcEndpoints.$serializer", "LDv/z;", "Lcom/okta/authfoundation/client/k;", "<init>", "()V", "LCv/f;", "encoder", "value", "", "g", "(LCv/f;Lcom/okta/authfoundation/client/k;)V", "LCv/e;", "decoder", "f", "(LCv/e;)Lcom/okta/authfoundation/client/k;", "", "Lzv/b;", "e", "()[Lzv/b;", "LBv/f;", "descriptor", "LBv/f;", "a", "()LBv/f;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated
    public /* synthetic */ class a implements InterfaceC3160z<k> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f120722a;
        private static final Bv.f descriptor;

        private a() {
        }

        static {
            a aVar = new a();
            f120722a = aVar;
            C3136e0 c3136e0 = new C3136e0("com.okta.authfoundation.client.SerializableOidcEndpoints", aVar, 9);
            c3136e0.p("issuer", false);
            c3136e0.p("authorization_endpoint", true);
            c3136e0.p("token_endpoint", false);
            c3136e0.p("userinfo_endpoint", true);
            c3136e0.p("jwks_uri", true);
            c3136e0.p("introspection_endpoint", true);
            c3136e0.p("revocation_endpoint", true);
            c3136e0.p("end_session_endpoint", true);
            c3136e0.p("device_authorization_endpoint", true);
            descriptor = c3136e0;
        }

        @Override // zv.b, zv.h, zv.InterfaceC18555a
        /* renamed from: a */
        public final Bv.f getDescriptor() {
            return descriptor;
        }

        @Override // Dv.InterfaceC3160z
        public final zv.b<?>[] e() {
            Ss.h hVar = Ss.h.f35781a;
            return new zv.b[]{hVar, Av.a.p(hVar), hVar, Av.a.p(hVar), Av.a.p(hVar), Av.a.p(hVar), Av.a.p(hVar), Av.a.p(hVar), Av.a.p(hVar)};
        }

        @Override // zv.InterfaceC18555a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final k c(Cv.e decoder) {
            int i10;
            HttpUrl httpUrl;
            HttpUrl httpUrl2;
            HttpUrl httpUrl3;
            HttpUrl httpUrl4;
            HttpUrl httpUrl5;
            HttpUrl httpUrl6;
            HttpUrl httpUrl7;
            HttpUrl httpUrl8;
            HttpUrl httpUrl9;
            Intrinsics.j(decoder, "decoder");
            Bv.f fVar = descriptor;
            Cv.c cVarB = decoder.b(fVar);
            int i11 = 7;
            HttpUrl httpUrl10 = null;
            if (cVarB.p()) {
                Ss.h hVar = Ss.h.f35781a;
                HttpUrl httpUrl11 = (HttpUrl) cVarB.e(fVar, 0, hVar, null);
                HttpUrl httpUrl12 = (HttpUrl) cVarB.u(fVar, 1, hVar, null);
                HttpUrl httpUrl13 = (HttpUrl) cVarB.e(fVar, 2, hVar, null);
                HttpUrl httpUrl14 = (HttpUrl) cVarB.u(fVar, 3, hVar, null);
                HttpUrl httpUrl15 = (HttpUrl) cVarB.u(fVar, 4, hVar, null);
                HttpUrl httpUrl16 = (HttpUrl) cVarB.u(fVar, 5, hVar, null);
                HttpUrl httpUrl17 = (HttpUrl) cVarB.u(fVar, 6, hVar, null);
                HttpUrl httpUrl18 = (HttpUrl) cVarB.u(fVar, 7, hVar, null);
                httpUrl2 = (HttpUrl) cVarB.u(fVar, 8, hVar, null);
                httpUrl = httpUrl18;
                httpUrl3 = httpUrl17;
                httpUrl4 = httpUrl16;
                httpUrl9 = httpUrl14;
                i10 = 511;
                httpUrl5 = httpUrl15;
                httpUrl8 = httpUrl13;
                httpUrl7 = httpUrl12;
                httpUrl6 = httpUrl11;
            } else {
                boolean z10 = true;
                int i12 = 0;
                HttpUrl httpUrl19 = null;
                HttpUrl httpUrl20 = null;
                HttpUrl httpUrl21 = null;
                HttpUrl httpUrl22 = null;
                HttpUrl httpUrl23 = null;
                HttpUrl httpUrl24 = null;
                HttpUrl httpUrl25 = null;
                HttpUrl httpUrl26 = null;
                while (z10) {
                    int iF = cVarB.f(fVar);
                    switch (iF) {
                        case -1:
                            z10 = false;
                            i11 = 7;
                        case 0:
                            httpUrl10 = (HttpUrl) cVarB.e(fVar, 0, Ss.h.f35781a, httpUrl10);
                            i12 |= 1;
                            i11 = 7;
                        case 1:
                            httpUrl24 = (HttpUrl) cVarB.u(fVar, 1, Ss.h.f35781a, httpUrl24);
                            i12 |= 2;
                            i11 = 7;
                        case 2:
                            httpUrl25 = (HttpUrl) cVarB.e(fVar, 2, Ss.h.f35781a, httpUrl25);
                            i12 |= 4;
                            i11 = 7;
                        case 3:
                            httpUrl26 = (HttpUrl) cVarB.u(fVar, 3, Ss.h.f35781a, httpUrl26);
                            i12 |= 8;
                            i11 = 7;
                        case 4:
                            httpUrl23 = (HttpUrl) cVarB.u(fVar, 4, Ss.h.f35781a, httpUrl23);
                            i12 |= 16;
                            i11 = 7;
                        case 5:
                            httpUrl22 = (HttpUrl) cVarB.u(fVar, 5, Ss.h.f35781a, httpUrl22);
                            i12 |= 32;
                            i11 = 7;
                        case 6:
                            httpUrl21 = (HttpUrl) cVarB.u(fVar, 6, Ss.h.f35781a, httpUrl21);
                            i12 |= 64;
                        case 7:
                            httpUrl19 = (HttpUrl) cVarB.u(fVar, i11, Ss.h.f35781a, httpUrl19);
                            i12 |= 128;
                        case 8:
                            httpUrl20 = (HttpUrl) cVarB.u(fVar, 8, Ss.h.f35781a, httpUrl20);
                            i12 |= 256;
                        default:
                            throw new UnknownFieldException(iF);
                    }
                }
                i10 = i12;
                httpUrl = httpUrl19;
                httpUrl2 = httpUrl20;
                httpUrl3 = httpUrl21;
                httpUrl4 = httpUrl22;
                httpUrl5 = httpUrl23;
                httpUrl6 = httpUrl10;
                httpUrl7 = httpUrl24;
                httpUrl8 = httpUrl25;
                httpUrl9 = httpUrl26;
            }
            cVarB.a(fVar);
            return new k(i10, httpUrl6, httpUrl7, httpUrl8, httpUrl9, httpUrl5, httpUrl4, httpUrl3, httpUrl, httpUrl2, null);
        }

        @Override // zv.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void b(Cv.f encoder, k value) {
            Intrinsics.j(encoder, "encoder");
            Intrinsics.j(value, "value");
            Bv.f fVar = descriptor;
            Cv.d dVarB = encoder.b(fVar);
            k.b(value, dVarB, fVar);
            dVarB.a(fVar);
        }

        @Override // Dv.InterfaceC3160z
        public zv.b<?>[] d() {
            return InterfaceC3160z.a.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/okta/authfoundation/client/k$b;", "", "<init>", "()V", "Lzv/b;", "Lcom/okta/authfoundation/client/k;", "serializer", "()Lzv/b;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.okta.authfoundation.client.k$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zv.b<k> serializer() {
            return a.f120722a;
        }
    }

    public /* synthetic */ k(int i10, HttpUrl httpUrl, HttpUrl httpUrl2, HttpUrl httpUrl3, HttpUrl httpUrl4, HttpUrl httpUrl5, HttpUrl httpUrl6, HttpUrl httpUrl7, HttpUrl httpUrl8, HttpUrl httpUrl9, n0 n0Var) {
        if (5 != (i10 & 5)) {
            Z.a(i10, 5, a.f120722a.getDescriptor());
        }
        this.issuer = httpUrl;
        if ((i10 & 2) == 0) {
            this.authorizationEndpoint = null;
        } else {
            this.authorizationEndpoint = httpUrl2;
        }
        this.tokenEndpoint = httpUrl3;
        if ((i10 & 8) == 0) {
            this.userInfoEndpoint = null;
        } else {
            this.userInfoEndpoint = httpUrl4;
        }
        if ((i10 & 16) == 0) {
            this.jwksUri = null;
        } else {
            this.jwksUri = httpUrl5;
        }
        if ((i10 & 32) == 0) {
            this.introspectionEndpoint = null;
        } else {
            this.introspectionEndpoint = httpUrl6;
        }
        if ((i10 & 64) == 0) {
            this.revocationEndpoint = null;
        } else {
            this.revocationEndpoint = httpUrl7;
        }
        if ((i10 & 128) == 0) {
            this.endSessionEndpoint = null;
        } else {
            this.endSessionEndpoint = httpUrl8;
        }
        if ((i10 & 256) == 0) {
            this.deviceAuthorizationEndpoint = null;
        } else {
            this.deviceAuthorizationEndpoint = httpUrl9;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void b(k self, Cv.d output, Bv.f serialDesc) {
        Ss.h hVar = Ss.h.f35781a;
        output.l(serialDesc, 0, hVar, self.issuer);
        if (output.z(serialDesc, 1) || self.authorizationEndpoint != null) {
            output.t(serialDesc, 1, hVar, self.authorizationEndpoint);
        }
        output.l(serialDesc, 2, hVar, self.tokenEndpoint);
        if (output.z(serialDesc, 3) || self.userInfoEndpoint != null) {
            output.t(serialDesc, 3, hVar, self.userInfoEndpoint);
        }
        if (output.z(serialDesc, 4) || self.jwksUri != null) {
            output.t(serialDesc, 4, hVar, self.jwksUri);
        }
        if (output.z(serialDesc, 5) || self.introspectionEndpoint != null) {
            output.t(serialDesc, 5, hVar, self.introspectionEndpoint);
        }
        if (output.z(serialDesc, 6) || self.revocationEndpoint != null) {
            output.t(serialDesc, 6, hVar, self.revocationEndpoint);
        }
        if (output.z(serialDesc, 7) || self.endSessionEndpoint != null) {
            output.t(serialDesc, 7, hVar, self.endSessionEndpoint);
        }
        if (!output.z(serialDesc, 8) && self.deviceAuthorizationEndpoint == null) {
            return;
        }
        output.t(serialDesc, 8, hVar, self.deviceAuthorizationEndpoint);
    }

    public final q a() {
        return new q(this.issuer, this.authorizationEndpoint, this.tokenEndpoint, this.userInfoEndpoint, this.jwksUri, this.introspectionEndpoint, this.revocationEndpoint, this.endSessionEndpoint, this.deviceAuthorizationEndpoint);
    }
}
