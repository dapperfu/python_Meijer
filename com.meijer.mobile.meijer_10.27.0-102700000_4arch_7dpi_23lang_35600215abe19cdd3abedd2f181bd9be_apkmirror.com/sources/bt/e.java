package bt;

import Fv.f;
import Hv.C3693e;
import Hv.C3694e0;
import Hv.InterfaceC3718z;
import Hv.Z;
import Hv.n0;
import Hv.r0;
import bt.C6283a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0003\u0011\u0016\u0014B+\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lbt/e;", "", "", "seen0", "", "Lbt/e$c;", "keys", "LHv/n0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;LHv/n0;)V", "self", "LGv/d;", "output", "LFv/f;", "serialDesc", "", "c", "(Lbt/e;LGv/d;LFv/f;)V", "Lbt/a;", "b", "()Lbt/a;", "a", "Ljava/util/List;", "getKeys", "()Ljava/util/List;", "getKeys$annotations", "()V", "Companion", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class e {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    private static final Dv.b<Object>[] f60759b = {new C3693e(c.a.f60768a)};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<c> keys;

    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/okta/authfoundation/jwt/SerializableJwks.$serializer", "LHv/z;", "Lbt/e;", "<init>", "()V", "LGv/f;", "encoder", "value", "", "g", "(LGv/f;Lbt/e;)V", "LGv/e;", "decoder", "f", "(LGv/e;)Lbt/e;", "", "LDv/b;", "e", "()[LDv/b;", "LFv/f;", "descriptor", "LFv/f;", "a", "()LFv/f;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated
    public /* synthetic */ class a implements InterfaceC3718z<e> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f60761a;
        private static final f descriptor;

        static {
            a aVar = new a();
            f60761a = aVar;
            C3694e0 c3694e0 = new C3694e0("com.okta.authfoundation.jwt.SerializableJwks", aVar, 1);
            c3694e0.p("keys", false);
            descriptor = c3694e0;
        }

        @Override // Dv.b, Dv.h, Dv.a
        /* renamed from: a */
        public final f getDescriptor() {
            return descriptor;
        }

        @Override // Dv.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final e d(Gv.e decoder) {
            List list;
            Intrinsics.j(decoder, "decoder");
            f fVar = descriptor;
            Gv.c cVarC = decoder.c(fVar);
            Dv.b[] bVarArr = e.f60759b;
            int i10 = 1;
            n0 n0Var = null;
            if (cVarC.n()) {
                list = (List) cVarC.m(fVar, 0, bVarArr[0], null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                List list2 = null;
                while (z10) {
                    int iV = cVarC.v(fVar);
                    if (iV == -1) {
                        z10 = false;
                    } else {
                        if (iV != 0) {
                            throw new UnknownFieldException(iV);
                        }
                        list2 = (List) cVarC.m(fVar, 0, bVarArr[0], list2);
                        i11 = 1;
                    }
                }
                list = list2;
                i10 = i11;
            }
            cVarC.a(fVar);
            return new e(i10, list, n0Var);
        }

        @Override // Dv.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void b(Gv.f encoder, e value) {
            Intrinsics.j(encoder, "encoder");
            Intrinsics.j(value, "value");
            f fVar = descriptor;
            Gv.d dVarC = encoder.c(fVar);
            e.c(value, dVarC, fVar);
            dVarC.a(fVar);
        }

        private a() {
        }

        @Override // Hv.InterfaceC3718z
        public Dv.b<?>[] c() {
            return InterfaceC3718z.a.a(this);
        }

        @Override // Hv.InterfaceC3718z
        public final Dv.b<?>[] e() {
            return new Dv.b[]{e.f60759b[0]};
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbt/e$b;", "", "<init>", "()V", "LDv/b;", "Lbt/e;", "serializer", "()LDv/b;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: bt.e$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Dv.b<e> serializer() {
            return a.f60761a;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002\u0018\u0015BW\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001a\u0012\u0004\b \u0010\u001e\u001a\u0004\b\u001f\u0010\u001cR \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001a\u0012\u0004\b#\u0010\u001e\u001a\u0004\b\"\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001a\u0012\u0004\b&\u0010\u001e\u001a\u0004\b%\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010\u001a\u0012\u0004\b)\u0010\u001e\u001a\u0004\b(\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\u001a\u0012\u0004\b,\u0010\u001e\u001a\u0004\b+\u0010\u001c¨\u0006."}, d2 = {"Lbt/e$c;", "", "", "seen0", "", "keyId", "use", "keyType", "algorithm", "exponent", "modulus", "LHv/n0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LHv/n0;)V", "self", "LGv/d;", "output", "LFv/f;", "serialDesc", "", "b", "(Lbt/e$c;LGv/d;LFv/f;)V", "Lbt/a$a;", "a", "()Lbt/a$a;", "Ljava/lang/String;", "getKeyId", "()Ljava/lang/String;", "getKeyId$annotations", "()V", "getUse", "getUse$annotations", "c", "getKeyType", "getKeyType$annotations", "d", "getAlgorithm", "getAlgorithm$annotations", "e", "getExponent", "getExponent$annotations", "f", "getModulus", "getModulus$annotations", "Companion", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String keyId;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String use;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String keyType;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final String algorithm;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String exponent;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String modulus;

        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/okta/authfoundation/jwt/SerializableJwks.Key.$serializer", "LHv/z;", "Lbt/e$c;", "<init>", "()V", "LGv/f;", "encoder", "value", "", "g", "(LGv/f;Lbt/e$c;)V", "LGv/e;", "decoder", "f", "(LGv/e;)Lbt/e$c;", "", "LDv/b;", "e", "()[LDv/b;", "LFv/f;", "descriptor", "LFv/f;", "a", "()LFv/f;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Deprecated
        public /* synthetic */ class a implements InterfaceC3718z<c> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f60768a;
            private static final f descriptor;

            static {
                a aVar = new a();
                f60768a = aVar;
                C3694e0 c3694e0 = new C3694e0("com.okta.authfoundation.jwt.SerializableJwks.Key", aVar, 6);
                c3694e0.p("kid", false);
                c3694e0.p("use", false);
                c3694e0.p("kty", false);
                c3694e0.p("alg", true);
                c3694e0.p("e", false);
                c3694e0.p("n", false);
                descriptor = c3694e0;
            }

            @Override // Dv.b, Dv.h, Dv.a
            /* renamed from: a */
            public final f getDescriptor() {
                return descriptor;
            }

            @Override // Hv.InterfaceC3718z
            public final Dv.b<?>[] e() {
                r0 r0Var = r0.f13359a;
                return new Dv.b[]{r0Var, r0Var, r0Var, Ev.a.p(r0Var), Ev.a.p(r0Var), Ev.a.p(r0Var)};
            }

            @Override // Dv.a
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final c d(Gv.e decoder) {
                int i10;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                Intrinsics.j(decoder, "decoder");
                f fVar = descriptor;
                Gv.c cVarC = decoder.c(fVar);
                String strR = null;
                if (cVarC.n()) {
                    String strR2 = cVarC.r(fVar, 0);
                    String strR3 = cVarC.r(fVar, 1);
                    String strR4 = cVarC.r(fVar, 2);
                    r0 r0Var = r0.f13359a;
                    String str7 = (String) cVarC.l(fVar, 3, r0Var, null);
                    String str8 = (String) cVarC.l(fVar, 4, r0Var, null);
                    str = strR2;
                    str6 = (String) cVarC.l(fVar, 5, r0Var, null);
                    str4 = str7;
                    str5 = str8;
                    str3 = strR4;
                    str2 = strR3;
                    i10 = 63;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    String strR5 = null;
                    String strR6 = null;
                    String str9 = null;
                    String str10 = null;
                    String str11 = null;
                    while (z10) {
                        int iV = cVarC.v(fVar);
                        switch (iV) {
                            case -1:
                                z10 = false;
                                continue;
                            case 0:
                                strR = cVarC.r(fVar, 0);
                                i11 |= 1;
                                continue;
                            case 1:
                                strR5 = cVarC.r(fVar, 1);
                                i11 |= 2;
                                break;
                            case 2:
                                strR6 = cVarC.r(fVar, 2);
                                i11 |= 4;
                                break;
                            case 3:
                                str9 = (String) cVarC.l(fVar, 3, r0.f13359a, str9);
                                i11 |= 8;
                                break;
                            case 4:
                                str10 = (String) cVarC.l(fVar, 4, r0.f13359a, str10);
                                i11 |= 16;
                                break;
                            case 5:
                                str11 = (String) cVarC.l(fVar, 5, r0.f13359a, str11);
                                i11 |= 32;
                                break;
                            default:
                                throw new UnknownFieldException(iV);
                        }
                    }
                    i10 = i11;
                    str = strR;
                    str2 = strR5;
                    str3 = strR6;
                    str4 = str9;
                    str5 = str10;
                    str6 = str11;
                }
                cVarC.a(fVar);
                return new c(i10, str, str2, str3, str4, str5, str6, null);
            }

            @Override // Dv.h
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final void b(Gv.f encoder, c value) {
                Intrinsics.j(encoder, "encoder");
                Intrinsics.j(value, "value");
                f fVar = descriptor;
                Gv.d dVarC = encoder.c(fVar);
                c.b(value, dVarC, fVar);
                dVarC.a(fVar);
            }

            private a() {
            }

            @Override // Hv.InterfaceC3718z
            public Dv.b<?>[] c() {
                return InterfaceC3718z.a.a(this);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbt/e$c$b;", "", "<init>", "()V", "LDv/b;", "Lbt/e$c;", "serializer", "()LDv/b;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: bt.e$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Dv.b<c> serializer() {
                return a.f60768a;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void b(bt.e.c r4, Gv.d r5, Fv.f r6) {
            /*
                r0 = 0
                java.lang.String r1 = r4.keyId
                r5.v(r6, r0, r1)
                r0 = 1
                java.lang.String r1 = r4.use
                r5.v(r6, r0, r1)
                r0 = 2
                java.lang.String r1 = r4.keyType
                r5.v(r6, r0, r1)
                r0 = 3
                boolean r1 = r5.m(r6, r0)
                if (r1 == 0) goto L1a
                goto L30
            L1a:
                java.lang.String r1 = r4.algorithm
                java.lang.String r2 = r4.keyType
                java.lang.String r3 = "RSA"
                boolean r2 = kotlin.jvm.internal.Intrinsics.e(r2, r3)
                if (r2 == 0) goto L29
                java.lang.String r2 = "RS256"
                goto L2a
            L29:
                r2 = 0
            L2a:
                boolean r1 = kotlin.jvm.internal.Intrinsics.e(r1, r2)
                if (r1 != 0) goto L37
            L30:
                Hv.r0 r1 = Hv.r0.f13359a
                java.lang.String r2 = r4.algorithm
                r5.o(r6, r0, r1, r2)
            L37:
                Hv.r0 r0 = Hv.r0.f13359a
                java.lang.String r1 = r4.exponent
                r2 = 4
                r5.o(r6, r2, r0, r1)
                r1 = 5
                java.lang.String r4 = r4.modulus
                r5.o(r6, r1, r0, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bt.e.c.b(bt.e$c, Gv.d, Fv.f):void");
        }

        public /* synthetic */ c(int i10, String str, String str2, String str3, String str4, String str5, String str6, n0 n0Var) {
            if (55 != (i10 & 55)) {
                Z.a(i10, 55, a.f60768a.getDescriptor());
            }
            this.keyId = str;
            this.use = str2;
            this.keyType = str3;
            if ((i10 & 8) == 0) {
                this.algorithm = Intrinsics.e(str3, "RSA") ? "RS256" : null;
            } else {
                this.algorithm = str4;
            }
            this.exponent = str5;
            this.modulus = str6;
        }

        public final C6283a.C1194a a() {
            String str = this.algorithm;
            String str2 = this.exponent;
            String str3 = this.modulus;
            return new C6283a.C1194a(this.keyId, this.use, this.keyType, str, str2, str3);
        }
    }

    public /* synthetic */ e(int i10, List list, n0 n0Var) {
        if (1 != (i10 & 1)) {
            Z.a(i10, 1, a.f60761a.getDescriptor());
        }
        this.keys = list;
    }

    @JvmStatic
    public static final /* synthetic */ void c(e self, Gv.d output, f serialDesc) {
        output.z(serialDesc, 0, f60759b[0], self.keys);
    }

    public final C6283a b() {
        List<c> list = this.keys;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((c) it.next()).a());
        }
        return new C6283a(arrayList);
    }
}
