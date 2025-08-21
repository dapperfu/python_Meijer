package com.okta.authfoundation.client;

import Dv.C3136e0;
import Dv.E;
import Dv.InterfaceC3160z;
import Dv.Z;
import Dv.n0;
import Dv.r0;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0019\b\u0001\u0018\u0000 -2\u00020\u0001:\u0002\u0018\u001eB]\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u0012\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u0018\u0010\u001bR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010\u001d\u001a\u0004\b \u0010\"R \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010!\u0012\u0004\b%\u0010\u001d\u001a\u0004\b$\u0010\"R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u0019\u0012\u0004\b'\u0010\u001d\u001a\u0004\b&\u0010\u001bR\"\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010(\u0012\u0004\b*\u0010\u001d\u001a\u0004\b\u001e\u0010)R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010\u0019\u0012\u0004\b,\u0010\u001d\u001a\u0004\b+\u0010\u001b¨\u0006."}, d2 = {"Lcom/okta/authfoundation/client/g;", "", "", "seen0", "", "iss", "aud", "exp", "iat", "nonce", "authTime", "sub", "LDv/n0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;LDv/n0;)V", "self", "LCv/d;", "output", "LBv/f;", "serialDesc", "", "h", "(Lcom/okta/authfoundation/client/g;LCv/d;LBv/f;)V", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "getIss$annotations", "()V", "b", "getAud$annotations", "c", "I", "()I", "getExp$annotations", "d", "getIat$annotations", "f", "getNonce$annotations", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "getAuthTime$annotations", "g", "getSub$annotations", "Companion", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class g {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String iss;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String aud;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int exp;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int iat;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String nonce;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Integer authTime;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String sub;

    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/okta/authfoundation/client/IdTokenValidationPayload.$serializer", "LDv/z;", "Lcom/okta/authfoundation/client/g;", "<init>", "()V", "LCv/f;", "encoder", "value", "", "g", "(LCv/f;Lcom/okta/authfoundation/client/g;)V", "LCv/e;", "decoder", "f", "(LCv/e;)Lcom/okta/authfoundation/client/g;", "", "Lzv/b;", "e", "()[Lzv/b;", "LBv/f;", "descriptor", "LBv/f;", "a", "()LBv/f;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated
    public /* synthetic */ class a implements InterfaceC3160z<g> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f120647a;
        private static final Bv.f descriptor;

        private a() {
        }

        static {
            a aVar = new a();
            f120647a = aVar;
            C3136e0 c3136e0 = new C3136e0("com.okta.authfoundation.client.IdTokenValidationPayload", aVar, 7);
            c3136e0.p("iss", false);
            c3136e0.p("aud", false);
            c3136e0.p("exp", false);
            c3136e0.p("iat", false);
            c3136e0.p("nonce", true);
            c3136e0.p("auth_time", true);
            c3136e0.p("sub", true);
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
            E e10 = E.f6691a;
            return new zv.b[]{r0Var, r0Var, e10, e10, Av.a.p(r0Var), Av.a.p(e10), Av.a.p(r0Var)};
        }

        @Override // zv.InterfaceC18555a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final g c(Cv.e decoder) {
            int i10;
            String str;
            int i11;
            int i12;
            String str2;
            String str3;
            String str4;
            Integer num;
            Intrinsics.j(decoder, "decoder");
            Bv.f fVar = descriptor;
            Cv.c cVarB = decoder.b(fVar);
            if (cVarB.p()) {
                String strQ = cVarB.q(fVar, 0);
                String strQ2 = cVarB.q(fVar, 1);
                int iW = cVarB.w(fVar, 2);
                int iW2 = cVarB.w(fVar, 3);
                r0 r0Var = r0.f6781a;
                String str5 = (String) cVarB.u(fVar, 4, r0Var, null);
                Integer num2 = (Integer) cVarB.u(fVar, 5, E.f6691a, null);
                str2 = strQ;
                str = (String) cVarB.u(fVar, 6, r0Var, null);
                num = num2;
                i10 = iW2;
                str4 = str5;
                i11 = iW;
                str3 = strQ2;
                i12 = 127;
            } else {
                boolean z10 = true;
                int iW3 = 0;
                int i13 = 0;
                String strQ3 = null;
                String strQ4 = null;
                String str6 = null;
                Integer num3 = null;
                int iW4 = 0;
                String str7 = null;
                while (z10) {
                    int iF = cVarB.f(fVar);
                    switch (iF) {
                        case -1:
                            z10 = false;
                            break;
                        case 0:
                            i13 |= 1;
                            strQ3 = cVarB.q(fVar, 0);
                            continue;
                        case 1:
                            strQ4 = cVarB.q(fVar, 1);
                            i13 |= 2;
                            continue;
                        case 2:
                            iW4 = cVarB.w(fVar, 2);
                            i13 |= 4;
                            break;
                        case 3:
                            iW3 = cVarB.w(fVar, 3);
                            i13 |= 8;
                            break;
                        case 4:
                            str6 = (String) cVarB.u(fVar, 4, r0.f6781a, str6);
                            i13 |= 16;
                            break;
                        case 5:
                            num3 = (Integer) cVarB.u(fVar, 5, E.f6691a, num3);
                            i13 |= 32;
                            break;
                        case 6:
                            str7 = (String) cVarB.u(fVar, 6, r0.f6781a, str7);
                            i13 |= 64;
                            break;
                        default:
                            throw new UnknownFieldException(iF);
                    }
                }
                i10 = iW3;
                str = str7;
                i11 = iW4;
                i12 = i13;
                str2 = strQ3;
                str3 = strQ4;
                str4 = str6;
                num = num3;
            }
            cVarB.a(fVar);
            return new g(i12, str2, str3, i11, i10, str4, num, str, null);
        }

        @Override // zv.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void b(Cv.f encoder, g value) {
            Intrinsics.j(encoder, "encoder");
            Intrinsics.j(value, "value");
            Bv.f fVar = descriptor;
            Cv.d dVarB = encoder.b(fVar);
            g.h(value, dVarB, fVar);
            dVarB.a(fVar);
        }

        @Override // Dv.InterfaceC3160z
        public zv.b<?>[] d() {
            return InterfaceC3160z.a.a(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/okta/authfoundation/client/g$b;", "", "<init>", "()V", "Lzv/b;", "Lcom/okta/authfoundation/client/g;", "serializer", "()Lzv/b;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.okta.authfoundation.client.g$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zv.b<g> serializer() {
            return a.f120647a;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void h(g self, Cv.d output, Bv.f serialDesc) {
        output.o(serialDesc, 0, self.iss);
        output.o(serialDesc, 1, self.aud);
        output.C(serialDesc, 2, self.exp);
        output.C(serialDesc, 3, self.iat);
        if (output.z(serialDesc, 4) || self.nonce != null) {
            output.t(serialDesc, 4, r0.f6781a, self.nonce);
        }
        if (output.z(serialDesc, 5) || self.authTime != null) {
            output.t(serialDesc, 5, E.f6691a, self.authTime);
        }
        if (!output.z(serialDesc, 6) && self.sub == null) {
            return;
        }
        output.t(serialDesc, 6, r0.f6781a, self.sub);
    }

    public /* synthetic */ g(int i10, String str, String str2, int i11, int i12, String str3, Integer num, String str4, n0 n0Var) {
        if (15 != (i10 & 15)) {
            Z.a(i10, 15, a.f120647a.getDescriptor());
        }
        this.iss = str;
        this.aud = str2;
        this.exp = i11;
        this.iat = i12;
        if ((i10 & 16) == 0) {
            this.nonce = null;
        } else {
            this.nonce = str3;
        }
        if ((i10 & 32) == 0) {
            this.authTime = null;
        } else {
            this.authTime = num;
        }
        if ((i10 & 64) == 0) {
            this.sub = null;
        } else {
            this.sub = str4;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getAud() {
        return this.aud;
    }

    /* renamed from: b, reason: from getter */
    public final Integer getAuthTime() {
        return this.authTime;
    }

    /* renamed from: c, reason: from getter */
    public final int getExp() {
        return this.exp;
    }

    /* renamed from: d, reason: from getter */
    public final int getIat() {
        return this.iat;
    }

    /* renamed from: e, reason: from getter */
    public final String getIss() {
        return this.iss;
    }

    /* renamed from: f, reason: from getter */
    public final String getNonce() {
        return this.nonce;
    }

    /* renamed from: g, reason: from getter */
    public final String getSub() {
        return this.sub;
    }
}
