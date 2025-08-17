package Vs;

import Hv.C3694e0;
import Hv.E;
import Hv.InterfaceC3718z;
import Hv.L;
import Hv.Z;
import Hv.n0;
import Hv.r0;
import Iv.C;
import com.okta.authfoundation.client.j;
import io.constructor.data.local.PreferencesHelper;
import java.util.Map;
import java.util.Objects;
import kotlin.Deprecated;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0007\u0018\u0000 @2\u00020\u0001:\u0003/#!Bm\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bc\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0013B\u0085\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0000¢\u0006\u0004\b!\u0010\"J1\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0005H\u0016¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010+\u001a\u0004\b.\u0010-R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010*R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010+\u001a\u0004\b2\u0010-R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b3\u0010+\u001a\u0004\b4\u0010-R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b1\u0010+\u001a\u0004\b5\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b6\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b6\u0010+\u001a\u0004\b3\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b7\u0010+\u001a\u0004\b8\u0010-R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R \u0010\u0010\u001a\u00020\u000f8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b:\u0010<\u0012\u0004\b>\u0010?\u001a\u0004\b7\u0010=¨\u0006A"}, d2 = {"LVs/p;", "", "", PreferencesHelper.PREF_ID, "tokenType", "", "expiresIn", "accessToken", "scope", "refreshToken", "idToken", "deviceSecret", "issuedTokenType", "Lcom/okta/authfoundation/client/j;", "oidcConfiguration", "", "issuedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/okta/authfoundation/client/j;J)V", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/okta/authfoundation/client/j;)V", "seen0", "LHv/n0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/okta/authfoundation/client/j;JLHv/n0;)V", "self", "LGv/d;", "output", "LFv/f;", "serialDesc", "", "o", "(LVs/p;LGv/d;LFv/f;)V", "LVs/k;", "a", "()LVs/k;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)LVs/p;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "n", "c", "I", "f", "d", "e", "m", "l", "h", "i", "j", "Lcom/okta/authfoundation/client/j;", "k", "()Lcom/okta/authfoundation/client/j;", "J", "()J", "getIssuedAt$auth_foundation_release$annotations", "()V", "Companion", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String tokenType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int expiresIn;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String accessToken;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String scope;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String refreshToken;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String idToken;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String deviceSecret;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String issuedTokenType;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final com.okta.authfoundation.client.j oidcConfiguration;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long issuedAt;

    @kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/okta/authfoundation/credential/Token.$serializer", "LHv/z;", "LVs/p;", "<init>", "()V", "LGv/f;", "encoder", "value", "", "g", "(LGv/f;LVs/p;)V", "LGv/e;", "decoder", "f", "(LGv/e;)LVs/p;", "", "LDv/b;", "e", "()[LDv/b;", "LFv/f;", "descriptor", "LFv/f;", "a", "()LFv/f;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated
    public /* synthetic */ class a implements InterfaceC3718z<p> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f37996a;
        private static final Fv.f descriptor;

        static {
            a aVar = new a();
            f37996a = aVar;
            C3694e0 c3694e0 = new C3694e0("com.okta.authfoundation.credential.Token", aVar, 11);
            c3694e0.p(PreferencesHelper.PREF_ID, false);
            c3694e0.p("tokenType", false);
            c3694e0.p("expiresIn", false);
            c3694e0.p("accessToken", false);
            c3694e0.p("scope", false);
            c3694e0.p("refreshToken", false);
            c3694e0.p("idToken", false);
            c3694e0.p("deviceSecret", false);
            c3694e0.p("issuedTokenType", false);
            c3694e0.p("oidcConfiguration", false);
            c3694e0.p("issuedAt", true);
            descriptor = c3694e0;
        }

        @Override // Dv.b, Dv.h, Dv.a
        /* renamed from: a */
        public final Fv.f getDescriptor() {
            return descriptor;
        }

        @Override // Hv.InterfaceC3718z
        public final Dv.b<?>[] e() {
            r0 r0Var = r0.f13359a;
            return new Dv.b[]{r0Var, r0Var, E.f13269a, r0Var, Ev.a.p(r0Var), Ev.a.p(r0Var), Ev.a.p(r0Var), Ev.a.p(r0Var), Ev.a.p(r0Var), j.a.f119739a, L.f13286a};
        }

        @Override // Dv.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final p d(Gv.e decoder) {
            int i10;
            com.okta.authfoundation.client.j jVar;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            int i11;
            long jY;
            String str6;
            String str7;
            String str8;
            Intrinsics.j(decoder, "decoder");
            Fv.f fVar = descriptor;
            Gv.c cVarC = decoder.c(fVar);
            int i12 = 10;
            if (cVarC.n()) {
                String strR = cVarC.r(fVar, 0);
                String strR2 = cVarC.r(fVar, 1);
                int iF = cVarC.F(fVar, 2);
                String strR3 = cVarC.r(fVar, 3);
                r0 r0Var = r0.f13359a;
                String str9 = (String) cVarC.l(fVar, 4, r0Var, null);
                String str10 = (String) cVarC.l(fVar, 5, r0Var, null);
                String str11 = (String) cVarC.l(fVar, 6, r0Var, null);
                String str12 = (String) cVarC.l(fVar, 7, r0Var, null);
                String str13 = (String) cVarC.l(fVar, 8, r0Var, null);
                str6 = strR;
                i10 = 2047;
                jVar = (com.okta.authfoundation.client.j) cVarC.m(fVar, 9, j.a.f119739a, null);
                str = str12;
                str3 = str11;
                str4 = str10;
                str8 = strR3;
                str2 = str13;
                str5 = str9;
                i11 = iF;
                str7 = strR2;
                jY = cVarC.y(fVar, 10);
            } else {
                long jY2 = 0;
                boolean z10 = true;
                int i13 = 0;
                com.okta.authfoundation.client.j jVar2 = null;
                String str14 = null;
                String str15 = null;
                String str16 = null;
                String str17 = null;
                String strR4 = null;
                String strR5 = null;
                String strR6 = null;
                int iF2 = 0;
                String str18 = null;
                while (z10) {
                    int iV = cVarC.v(fVar);
                    switch (iV) {
                        case -1:
                            z10 = false;
                            i12 = 10;
                        case 0:
                            strR4 = cVarC.r(fVar, 0);
                            i13 |= 1;
                            i12 = 10;
                        case 1:
                            strR5 = cVarC.r(fVar, 1);
                            i13 |= 2;
                            i12 = 10;
                        case 2:
                            i13 |= 4;
                            iF2 = cVarC.F(fVar, 2);
                            i12 = 10;
                        case 3:
                            strR6 = cVarC.r(fVar, 3);
                            i13 |= 8;
                            i12 = 10;
                        case 4:
                            str18 = (String) cVarC.l(fVar, 4, r0.f13359a, str18);
                            i13 |= 16;
                            i12 = 10;
                        case 5:
                            str17 = (String) cVarC.l(fVar, 5, r0.f13359a, str17);
                            i13 |= 32;
                            i12 = 10;
                        case 6:
                            str16 = (String) cVarC.l(fVar, 6, r0.f13359a, str16);
                            i13 |= 64;
                            i12 = 10;
                        case 7:
                            str14 = (String) cVarC.l(fVar, 7, r0.f13359a, str14);
                            i13 |= 128;
                        case 8:
                            str15 = (String) cVarC.l(fVar, 8, r0.f13359a, str15);
                            i13 |= 256;
                        case 9:
                            jVar2 = (com.okta.authfoundation.client.j) cVarC.m(fVar, 9, j.a.f119739a, jVar2);
                            i13 |= 512;
                        case 10:
                            jY2 = cVarC.y(fVar, i12);
                            i13 |= 1024;
                        default:
                            throw new UnknownFieldException(iV);
                    }
                }
                i10 = i13;
                jVar = jVar2;
                str = str14;
                str2 = str15;
                str3 = str16;
                str4 = str17;
                str5 = str18;
                i11 = iF2;
                jY = jY2;
                str6 = strR4;
                str7 = strR5;
                str8 = strR6;
            }
            cVarC.a(fVar);
            return new p(i10, str6, str7, i11, str8, str5, str4, str3, str, str2, jVar, jY, null);
        }

        @Override // Dv.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void b(Gv.f encoder, p value) {
            Intrinsics.j(encoder, "encoder");
            Intrinsics.j(value, "value");
            Fv.f fVar = descriptor;
            Gv.d dVarC = encoder.c(fVar);
            p.o(value, dVarC, fVar);
            dVarC.a(fVar);
        }

        private a() {
        }

        @Override // Hv.InterfaceC3718z
        public Dv.b<?>[] c() {
            return InterfaceC3718z.a.a(this);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LVs/p$b;", "", "<init>", "()V", "", "idToken", "Lcom/okta/authfoundation/client/j;", "oidcConfiguration", "", "b", "(Ljava/lang/String;Lcom/okta/authfoundation/client/j;)J", "LDv/b;", "LVs/p;", "serializer", "()LDv/b;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Vs.p$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final long b(String idToken, com.okta.authfoundation.client.j oidcConfiguration) {
            r rVar = null;
            if (idToken != null) {
                try {
                    rVar = (r) new bt.d(oidcConfiguration.getJson(), oidcConfiguration.getComputeDispatcher()).a(idToken).a(r.INSTANCE.serializer());
                } catch (Exception unused) {
                }
            }
            return rVar != null ? rVar.getIssuedAt() : oidcConfiguration.getClock().a();
        }

        private Companion() {
        }

        public final Dv.b<p> serializer() {
            return a.f37996a;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0019\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"LVs/p$c;", "", "", PreferencesHelper.PREF_ID, "", "tags", "LIv/C;", "payloadData", "<init>", "(Ljava/lang/String;Ljava/util/Map;LIv/C;)V", "Lbt/b;", "idToken", "(Ljava/lang/String;Ljava/util/Map;Lbt/b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "LIv/C;", "()LIv/C;", "LRs/a;", "d", "LRs/a;", "getClaimsProvider", "()LRs/a;", "claimsProvider", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Vs.p$c, reason: from toString */
    public static final /* data */ class Metadata {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, String> tags;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final C payloadData;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Rs.a claimsProvider;

        public Metadata(String id2, Map<String, String> tags, C c10) {
            Intrinsics.j(id2, "id");
            Intrinsics.j(tags, "tags");
            this.id = id2;
            this.tags = tags;
            this.payloadData = c10;
            this.claimsProvider = c10 != null ? new Rs.b(c10, com.okta.authfoundation.client.j.INSTANCE.b()) : null;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Metadata)) {
                return false;
            }
            Metadata metadata = (Metadata) other;
            return Intrinsics.e(this.id, metadata.id) && Intrinsics.e(this.tags, metadata.tags) && Intrinsics.e(this.payloadData, metadata.payloadData);
        }

        /* renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: b, reason: from getter */
        public final C getPayloadData() {
            return this.payloadData;
        }

        public final Map<String, String> c() {
            return this.tags;
        }

        public int hashCode() {
            int iHashCode = ((this.id.hashCode() * 31) + this.tags.hashCode()) * 31;
            C c10 = this.payloadData;
            return iHashCode + (c10 == null ? 0 : c10.hashCode());
        }

        public String toString() {
            return "Metadata(id=" + this.id + ", tags=" + this.tags + ", payloadData=" + this.payloadData + ")";
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Metadata(String id2, Map<String, String> tags, bt.b bVar) {
            this(id2, tags, bVar != null ? (C) bVar.a(C.INSTANCE.serializer()) : null);
            Intrinsics.j(id2, "id");
            Intrinsics.j(tags, "tags");
        }
    }

    public /* synthetic */ p(int i10, String str, String str2, int i11, String str3, String str4, String str5, String str6, String str7, String str8, com.okta.authfoundation.client.j jVar, long j10, n0 n0Var) {
        if (1023 != (i10 & 1023)) {
            Z.a(i10, 1023, a.f37996a.getDescriptor());
        }
        this.id = str;
        this.tokenType = str2;
        this.expiresIn = i11;
        this.accessToken = str3;
        this.scope = str4;
        this.refreshToken = str5;
        this.idToken = str6;
        this.deviceSecret = str7;
        this.issuedTokenType = str8;
        this.oidcConfiguration = jVar;
        if ((i10 & 1024) == 0) {
            this.issuedAt = jVar.getClock().a() - i11;
        } else {
            this.issuedAt = j10;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void o(p self, Gv.d output, Fv.f serialDesc) {
        output.v(serialDesc, 0, self.id);
        output.v(serialDesc, 1, self.tokenType);
        output.f(serialDesc, 2, self.expiresIn);
        output.v(serialDesc, 3, self.accessToken);
        r0 r0Var = r0.f13359a;
        output.o(serialDesc, 4, r0Var, self.scope);
        output.o(serialDesc, 5, r0Var, self.refreshToken);
        output.o(serialDesc, 6, r0Var, self.idToken);
        output.o(serialDesc, 7, r0Var, self.deviceSecret);
        output.o(serialDesc, 8, r0Var, self.issuedTokenType);
        output.z(serialDesc, 9, j.a.f119739a, self.oidcConfiguration);
        output.e(serialDesc, 10, self.issuedAt);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof p)) {
            return false;
        }
        p pVar = (p) other;
        return Intrinsics.e(pVar.tokenType, this.tokenType) && pVar.expiresIn == this.expiresIn && Intrinsics.e(pVar.accessToken, this.accessToken) && Intrinsics.e(pVar.scope, this.scope) && Intrinsics.e(pVar.refreshToken, this.refreshToken) && Intrinsics.e(pVar.idToken, this.idToken) && Intrinsics.e(pVar.deviceSecret, this.deviceSecret) && Intrinsics.e(pVar.issuedTokenType, this.issuedTokenType);
    }

    public static /* synthetic */ p c(p pVar, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = pVar.id;
        }
        if ((i10 & 2) != 0) {
            str2 = pVar.refreshToken;
        }
        if ((i10 & 4) != 0) {
            str3 = pVar.deviceSecret;
        }
        return pVar.b(str, str2, str3);
    }

    public final k a() {
        return new k(this.tokenType, this.expiresIn, this.accessToken, this.scope, this.refreshToken, this.idToken, this.deviceSecret, this.issuedTokenType);
    }

    public final p b(String id2, String refreshToken, String deviceSecret) {
        Intrinsics.j(id2, "id");
        return new p(id2, this.tokenType, this.expiresIn, this.accessToken, this.scope, refreshToken, this.idToken, deviceSecret, this.issuedTokenType, this.oidcConfiguration);
    }

    /* renamed from: d, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: e, reason: from getter */
    public final String getDeviceSecret() {
        return this.deviceSecret;
    }

    /* renamed from: f, reason: from getter */
    public final int getExpiresIn() {
        return this.expiresIn;
    }

    /* renamed from: g, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: h, reason: from getter */
    public final String getIdToken() {
        return this.idToken;
    }

    public int hashCode() {
        return Objects.hash(this.tokenType, Integer.valueOf(this.expiresIn), this.accessToken, this.scope, this.refreshToken, this.idToken, this.deviceSecret, this.issuedTokenType);
    }

    /* renamed from: i, reason: from getter */
    public final long getIssuedAt() {
        return this.issuedAt;
    }

    /* renamed from: j, reason: from getter */
    public final String getIssuedTokenType() {
        return this.issuedTokenType;
    }

    /* renamed from: k, reason: from getter */
    public final com.okta.authfoundation.client.j getOidcConfiguration() {
        return this.oidcConfiguration;
    }

    /* renamed from: l, reason: from getter */
    public final String getRefreshToken() {
        return this.refreshToken;
    }

    /* renamed from: m, reason: from getter */
    public final String getScope() {
        return this.scope;
    }

    /* renamed from: n, reason: from getter */
    public final String getTokenType() {
        return this.tokenType;
    }

    private p(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, com.okta.authfoundation.client.j jVar, long j10) {
        this.id = str;
        this.tokenType = str2;
        this.expiresIn = i10;
        this.accessToken = str3;
        this.scope = str4;
        this.refreshToken = str5;
        this.idToken = str6;
        this.deviceSecret = str7;
        this.issuedTokenType = str8;
        this.oidcConfiguration = jVar;
        this.issuedAt = j10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(String id2, String tokenType, int i10, String accessToken, String str, String str2, String str3, String str4, String str5, com.okta.authfoundation.client.j oidcConfiguration) {
        this(id2, tokenType, i10, accessToken, str, str2, str3, str4, str5, oidcConfiguration, INSTANCE.b(str3, oidcConfiguration));
        Intrinsics.j(id2, "id");
        Intrinsics.j(tokenType, "tokenType");
        Intrinsics.j(accessToken, "accessToken");
        Intrinsics.j(oidcConfiguration, "oidcConfiguration");
    }
}
