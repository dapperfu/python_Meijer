package Vs;

import Dv.C3136e0;
import Dv.E;
import Dv.InterfaceC3160z;
import Dv.Z;
import Dv.n0;
import Dv.r0;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0001\u0018\u0000 ;2\u00020\u0001:\u0002\u001e\u0018B]\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rBi\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010 \u0012\u0004\b+\u0010$\u001a\u0004\b*\u0010\"R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b,\u0010 \u0012\u0004\b.\u0010$\u001a\u0004\b-\u0010\"R\"\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u0010 \u0012\u0004\b1\u0010$\u001a\u0004\b0\u0010\"R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b2\u0010 \u0012\u0004\b4\u0010$\u001a\u0004\b3\u0010\"R\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010 \u0012\u0004\b7\u0010$\u001a\u0004\b6\u0010\"R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010 \u0012\u0004\b:\u0010$\u001a\u0004\b9\u0010\"¨\u0006<"}, d2 = {"LVs/k;", "", "", "tokenType", "", "expiresIn", "accessToken", "scope", "refreshToken", "idToken", "deviceSecret", "issuedTokenType", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "LDv/n0;", "serializationConstructorMarker", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LDv/n0;)V", "self", "LCv/d;", "output", "LBv/f;", "serialDesc", "", "b", "(LVs/k;LCv/d;LBv/f;)V", PreferencesHelper.PREF_ID, "Lcom/okta/authfoundation/client/j;", "oidcConfiguration", "LVs/p;", "a", "(Ljava/lang/String;Lcom/okta/authfoundation/client/j;)LVs/p;", "Ljava/lang/String;", "getTokenType", "()Ljava/lang/String;", "getTokenType$annotations", "()V", "I", "getExpiresIn", "()I", "getExpiresIn$annotations", "c", "getAccessToken", "getAccessToken$annotations", "d", "getScope", "getScope$annotations", "e", "getRefreshToken", "getRefreshToken$annotations", "f", "getIdToken", "getIdToken$annotations", "g", "getDeviceSecret", "getDeviceSecret$annotations", "h", "getIssuedTokenType", "getIssuedTokenType$annotations", "Companion", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String tokenType;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int expiresIn;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String accessToken;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String scope;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String refreshToken;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String idToken;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String deviceSecret;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String issuedTokenType;

    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/okta/authfoundation/credential/SerializableToken.$serializer", "LDv/z;", "LVs/k;", "<init>", "()V", "LCv/f;", "encoder", "value", "", "g", "(LCv/f;LVs/k;)V", "LCv/e;", "decoder", "f", "(LCv/e;)LVs/k;", "", "Lzv/b;", "e", "()[Lzv/b;", "LBv/f;", "descriptor", "LBv/f;", "a", "()LBv/f;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated
    public /* synthetic */ class a implements InterfaceC3160z<k> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40386a;
        private static final Bv.f descriptor;

        static {
            a aVar = new a();
            f40386a = aVar;
            C3136e0 c3136e0 = new C3136e0("com.okta.authfoundation.credential.SerializableToken", aVar, 8);
            c3136e0.p("token_type", false);
            c3136e0.p("expires_in", false);
            c3136e0.p("access_token", false);
            c3136e0.p("scope", true);
            c3136e0.p("refresh_token", true);
            c3136e0.p("id_token", true);
            c3136e0.p("device_secret", true);
            c3136e0.p("issued_token_type", true);
            descriptor = c3136e0;
        }

        @Override // zv.b, zv.h, zv.InterfaceC18555a
        /* renamed from: a */
        public final Bv.f getDescriptor() {
            return descriptor;
        }

        @Override // Dv.InterfaceC3160z
        public final zv.b<?>[] e() {
            r0 r0Var = r0.f6781a;
            return new zv.b[]{r0Var, E.f6691a, r0Var, Av.a.p(r0Var), Av.a.p(r0Var), Av.a.p(r0Var), Av.a.p(r0Var), Av.a.p(r0Var)};
        }

        @Override // zv.InterfaceC18555a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final k c(Cv.e decoder) {
            int i10;
            String str;
            String str2;
            String str3;
            int i11;
            String str4;
            String str5;
            String str6;
            String str7;
            char c10;
            Intrinsics.j(decoder, "decoder");
            Bv.f fVar = descriptor;
            Cv.c cVarB = decoder.b(fVar);
            int i12 = 7;
            if (cVarB.p()) {
                String strQ = cVarB.q(fVar, 0);
                int iW = cVarB.w(fVar, 1);
                String strQ2 = cVarB.q(fVar, 2);
                r0 r0Var = r0.f6781a;
                String str8 = (String) cVarB.u(fVar, 3, r0Var, null);
                String str9 = (String) cVarB.u(fVar, 4, r0Var, null);
                String str10 = (String) cVarB.u(fVar, 5, r0Var, null);
                String str11 = (String) cVarB.u(fVar, 6, r0Var, null);
                str4 = strQ;
                str = (String) cVarB.u(fVar, 7, r0Var, null);
                str2 = str11;
                str3 = str10;
                str6 = str8;
                str7 = str9;
                str5 = strQ2;
                i10 = iW;
                i11 = 255;
            } else {
                boolean z10 = true;
                int iW2 = 0;
                String str12 = null;
                String str13 = null;
                String strQ3 = null;
                String strQ4 = null;
                String str14 = null;
                String str15 = null;
                int i13 = 0;
                String str16 = null;
                while (z10) {
                    int iF = cVarB.f(fVar);
                    switch (iF) {
                        case -1:
                            z10 = false;
                        case 0:
                            i13 |= 1;
                            strQ3 = cVarB.q(fVar, 0);
                            i12 = 7;
                        case 1:
                            i13 |= 2;
                            iW2 = cVarB.w(fVar, 1);
                            i12 = 7;
                        case 2:
                            c10 = 3;
                            strQ4 = cVarB.q(fVar, 2);
                            i13 |= 4;
                            i12 = 7;
                        case 3:
                            c10 = 3;
                            str14 = (String) cVarB.u(fVar, 3, r0.f6781a, str14);
                            i13 |= 8;
                            i12 = 7;
                        case 4:
                            str15 = (String) cVarB.u(fVar, 4, r0.f6781a, str15);
                            i13 |= 16;
                        case 5:
                            str16 = (String) cVarB.u(fVar, 5, r0.f6781a, str16);
                            i13 |= 32;
                        case 6:
                            str13 = (String) cVarB.u(fVar, 6, r0.f6781a, str13);
                            i13 |= 64;
                        case 7:
                            str12 = (String) cVarB.u(fVar, i12, r0.f6781a, str12);
                            i13 |= 128;
                        default:
                            throw new UnknownFieldException(iF);
                    }
                }
                i10 = iW2;
                str = str12;
                str2 = str13;
                str3 = str16;
                i11 = i13;
                str4 = strQ3;
                str5 = strQ4;
                str6 = str14;
                str7 = str15;
            }
            cVarB.a(fVar);
            return new k(i11, str4, i10, str5, str6, str7, str3, str2, str, null);
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

        private a() {
        }

        @Override // Dv.InterfaceC3160z
        public zv.b<?>[] d() {
            return InterfaceC3160z.a.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LVs/k$b;", "", "<init>", "()V", "Lzv/b;", "LVs/k;", "serializer", "()Lzv/b;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Vs.k$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zv.b<k> serializer() {
            return a.f40386a;
        }
    }

    public /* synthetic */ k(int i10, String str, int i11, String str2, String str3, String str4, String str5, String str6, String str7, n0 n0Var) {
        if (7 != (i10 & 7)) {
            Z.a(i10, 7, a.f40386a.getDescriptor());
        }
        this.tokenType = str;
        this.expiresIn = i11;
        this.accessToken = str2;
        if ((i10 & 8) == 0) {
            this.scope = null;
        } else {
            this.scope = str3;
        }
        if ((i10 & 16) == 0) {
            this.refreshToken = null;
        } else {
            this.refreshToken = str4;
        }
        if ((i10 & 32) == 0) {
            this.idToken = null;
        } else {
            this.idToken = str5;
        }
        if ((i10 & 64) == 0) {
            this.deviceSecret = null;
        } else {
            this.deviceSecret = str6;
        }
        if ((i10 & 128) == 0) {
            this.issuedTokenType = null;
        } else {
            this.issuedTokenType = str7;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void b(k self, Cv.d output, Bv.f serialDesc) {
        output.o(serialDesc, 0, self.tokenType);
        output.C(serialDesc, 1, self.expiresIn);
        output.o(serialDesc, 2, self.accessToken);
        if (output.z(serialDesc, 3) || self.scope != null) {
            output.t(serialDesc, 3, r0.f6781a, self.scope);
        }
        if (output.z(serialDesc, 4) || self.refreshToken != null) {
            output.t(serialDesc, 4, r0.f6781a, self.refreshToken);
        }
        if (output.z(serialDesc, 5) || self.idToken != null) {
            output.t(serialDesc, 5, r0.f6781a, self.idToken);
        }
        if (output.z(serialDesc, 6) || self.deviceSecret != null) {
            output.t(serialDesc, 6, r0.f6781a, self.deviceSecret);
        }
        if (!output.z(serialDesc, 7) && self.issuedTokenType == null) {
            return;
        }
        output.t(serialDesc, 7, r0.f6781a, self.issuedTokenType);
    }

    public k(String tokenType, int i10, String accessToken, String str, String str2, String str3, String str4, String str5) {
        Intrinsics.j(tokenType, "tokenType");
        Intrinsics.j(accessToken, "accessToken");
        this.tokenType = tokenType;
        this.expiresIn = i10;
        this.accessToken = accessToken;
        this.scope = str;
        this.refreshToken = str2;
        this.idToken = str3;
        this.deviceSecret = str4;
        this.issuedTokenType = str5;
    }

    public final p a(String id2, com.okta.authfoundation.client.j oidcConfiguration) {
        Intrinsics.j(id2, "id");
        Intrinsics.j(oidcConfiguration, "oidcConfiguration");
        return new p(id2, this.tokenType, this.expiresIn, this.accessToken, this.scope, this.refreshToken, this.idToken, this.deviceSecret, this.issuedTokenType, oidcConfiguration);
    }
}
