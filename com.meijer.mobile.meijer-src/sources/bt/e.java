package bt;

import Bv.f;
import Dv.C3135e;
import Dv.C3136e0;
import Dv.InterfaceC3160z;
import Dv.Z;
import Dv.n0;
import Dv.r0;
import bt.C6409a;
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

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 \u001c2\u00020\u0001:\u0003\u0011\u0016\u0014B+\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lbt/e;", "", "", "seen0", "", "Lbt/e$c;", "keys", "LDv/n0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;LDv/n0;)V", "self", "LCv/d;", "output", "LBv/f;", "serialDesc", "", "c", "(Lbt/e;LCv/d;LBv/f;)V", "Lbt/a;", "b", "()Lbt/a;", "a", "Ljava/util/List;", "getKeys", "()Ljava/util/List;", "getKeys$annotations", "()V", "Companion", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class e {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    private static final zv.b<Object>[] f60633b = {new C3135e(c.a.f60642a)};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<c> keys;

    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/okta/authfoundation/jwt/SerializableJwks.$serializer", "LDv/z;", "Lbt/e;", "<init>", "()V", "LCv/f;", "encoder", "value", "", "g", "(LCv/f;Lbt/e;)V", "LCv/e;", "decoder", "f", "(LCv/e;)Lbt/e;", "", "Lzv/b;", "e", "()[Lzv/b;", "LBv/f;", "descriptor", "LBv/f;", "a", "()LBv/f;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated
    public /* synthetic */ class a implements InterfaceC3160z<e> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f60635a;
        private static final f descriptor;

        static {
            a aVar = new a();
            f60635a = aVar;
            C3136e0 c3136e0 = new C3136e0("com.okta.authfoundation.jwt.SerializableJwks", aVar, 1);
            c3136e0.p("keys", false);
            descriptor = c3136e0;
        }

        @Override // zv.b, zv.h, zv.InterfaceC18555a
        /* renamed from: a */
        public final f getDescriptor() {
            return descriptor;
        }

        @Override // zv.InterfaceC18555a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final e c(Cv.e decoder) {
            List list;
            Intrinsics.j(decoder, "decoder");
            f fVar = descriptor;
            Cv.c cVarB = decoder.b(fVar);
            zv.b[] bVarArr = e.f60633b;
            int i10 = 1;
            n0 n0Var = null;
            if (cVarB.p()) {
                list = (List) cVarB.e(fVar, 0, bVarArr[0], null);
            } else {
                boolean z10 = true;
                int i11 = 0;
                List list2 = null;
                while (z10) {
                    int iF = cVarB.f(fVar);
                    if (iF == -1) {
                        z10 = false;
                    } else {
                        if (iF != 0) {
                            throw new UnknownFieldException(iF);
                        }
                        list2 = (List) cVarB.e(fVar, 0, bVarArr[0], list2);
                        i11 = 1;
                    }
                }
                list = list2;
                i10 = i11;
            }
            cVarB.a(fVar);
            return new e(i10, list, n0Var);
        }

        @Override // zv.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void b(Cv.f encoder, e value) {
            Intrinsics.j(encoder, "encoder");
            Intrinsics.j(value, "value");
            f fVar = descriptor;
            Cv.d dVarB = encoder.b(fVar);
            e.c(value, dVarB, fVar);
            dVarB.a(fVar);
        }

        private a() {
        }

        @Override // Dv.InterfaceC3160z
        public zv.b<?>[] d() {
            return InterfaceC3160z.a.a(this);
        }

        @Override // Dv.InterfaceC3160z
        public final zv.b<?>[] e() {
            return new zv.b[]{e.f60633b[0]};
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbt/e$b;", "", "<init>", "()V", "Lzv/b;", "Lbt/e;", "serializer", "()Lzv/b;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: bt.e$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zv.b<e> serializer() {
            return a.f60635a;
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002\u0018\u0015BW\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001a\u0012\u0004\b \u0010\u001e\u001a\u0004\b\u001f\u0010\u001cR \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001a\u0012\u0004\b#\u0010\u001e\u001a\u0004\b\"\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010\u001a\u0012\u0004\b&\u0010\u001e\u001a\u0004\b%\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b'\u0010\u001a\u0012\u0004\b)\u0010\u001e\u001a\u0004\b(\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010\u001a\u0012\u0004\b,\u0010\u001e\u001a\u0004\b+\u0010\u001c¨\u0006."}, d2 = {"Lbt/e$c;", "", "", "seen0", "", "keyId", "use", "keyType", "algorithm", "exponent", "modulus", "LDv/n0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LDv/n0;)V", "self", "LCv/d;", "output", "LBv/f;", "serialDesc", "", "b", "(Lbt/e$c;LCv/d;LBv/f;)V", "Lbt/a$a;", "a", "()Lbt/a$a;", "Ljava/lang/String;", "getKeyId", "()Ljava/lang/String;", "getKeyId$annotations", "()V", "getUse", "getUse$annotations", "c", "getKeyType", "getKeyType$annotations", "d", "getAlgorithm", "getAlgorithm$annotations", "e", "getExponent", "getExponent$annotations", "f", "getModulus", "getModulus$annotations", "Companion", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/okta/authfoundation/jwt/SerializableJwks.Key.$serializer", "LDv/z;", "Lbt/e$c;", "<init>", "()V", "LCv/f;", "encoder", "value", "", "g", "(LCv/f;Lbt/e$c;)V", "LCv/e;", "decoder", "f", "(LCv/e;)Lbt/e$c;", "", "Lzv/b;", "e", "()[Lzv/b;", "LBv/f;", "descriptor", "LBv/f;", "a", "()LBv/f;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Deprecated
        public /* synthetic */ class a implements InterfaceC3160z<c> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f60642a;
            private static final f descriptor;

            static {
                a aVar = new a();
                f60642a = aVar;
                C3136e0 c3136e0 = new C3136e0("com.okta.authfoundation.jwt.SerializableJwks.Key", aVar, 6);
                c3136e0.p("kid", false);
                c3136e0.p("use", false);
                c3136e0.p("kty", false);
                c3136e0.p("alg", true);
                c3136e0.p("e", false);
                c3136e0.p("n", false);
                descriptor = c3136e0;
            }

            @Override // zv.b, zv.h, zv.InterfaceC18555a
            /* renamed from: a */
            public final f getDescriptor() {
                return descriptor;
            }

            @Override // Dv.InterfaceC3160z
            public final zv.b<?>[] e() {
                r0 r0Var = r0.f6781a;
                return new zv.b[]{r0Var, r0Var, r0Var, Av.a.p(r0Var), Av.a.p(r0Var), Av.a.p(r0Var)};
            }

            @Override // zv.InterfaceC18555a
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final c c(Cv.e decoder) {
                int i10;
                String str;
                String str2;
                String str3;
                String str4;
                String str5;
                String str6;
                Intrinsics.j(decoder, "decoder");
                f fVar = descriptor;
                Cv.c cVarB = decoder.b(fVar);
                String strQ = null;
                if (cVarB.p()) {
                    String strQ2 = cVarB.q(fVar, 0);
                    String strQ3 = cVarB.q(fVar, 1);
                    String strQ4 = cVarB.q(fVar, 2);
                    r0 r0Var = r0.f6781a;
                    String str7 = (String) cVarB.u(fVar, 3, r0Var, null);
                    String str8 = (String) cVarB.u(fVar, 4, r0Var, null);
                    str = strQ2;
                    str6 = (String) cVarB.u(fVar, 5, r0Var, null);
                    str4 = str7;
                    str5 = str8;
                    str3 = strQ4;
                    str2 = strQ3;
                    i10 = 63;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    String strQ5 = null;
                    String strQ6 = null;
                    String str9 = null;
                    String str10 = null;
                    String str11 = null;
                    while (z10) {
                        int iF = cVarB.f(fVar);
                        switch (iF) {
                            case -1:
                                z10 = false;
                                continue;
                            case 0:
                                strQ = cVarB.q(fVar, 0);
                                i11 |= 1;
                                continue;
                            case 1:
                                strQ5 = cVarB.q(fVar, 1);
                                i11 |= 2;
                                break;
                            case 2:
                                strQ6 = cVarB.q(fVar, 2);
                                i11 |= 4;
                                break;
                            case 3:
                                str9 = (String) cVarB.u(fVar, 3, r0.f6781a, str9);
                                i11 |= 8;
                                break;
                            case 4:
                                str10 = (String) cVarB.u(fVar, 4, r0.f6781a, str10);
                                i11 |= 16;
                                break;
                            case 5:
                                str11 = (String) cVarB.u(fVar, 5, r0.f6781a, str11);
                                i11 |= 32;
                                break;
                            default:
                                throw new UnknownFieldException(iF);
                        }
                    }
                    i10 = i11;
                    str = strQ;
                    str2 = strQ5;
                    str3 = strQ6;
                    str4 = str9;
                    str5 = str10;
                    str6 = str11;
                }
                cVarB.a(fVar);
                return new c(i10, str, str2, str3, str4, str5, str6, null);
            }

            @Override // zv.h
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final void b(Cv.f encoder, c value) {
                Intrinsics.j(encoder, "encoder");
                Intrinsics.j(value, "value");
                f fVar = descriptor;
                Cv.d dVarB = encoder.b(fVar);
                c.b(value, dVarB, fVar);
                dVarB.a(fVar);
            }

            private a() {
            }

            @Override // Dv.InterfaceC3160z
            public zv.b<?>[] d() {
                return InterfaceC3160z.a.a(this);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbt/e$c$b;", "", "<init>", "()V", "Lzv/b;", "Lbt/e$c;", "serializer", "()Lzv/b;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: bt.e$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final zv.b<c> serializer() {
                return a.f60642a;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
        @kotlin.jvm.JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final /* synthetic */ void b(bt.e.c r4, Cv.d r5, Bv.f r6) {
            /*
                r0 = 0
                java.lang.String r1 = r4.keyId
                r5.o(r6, r0, r1)
                r0 = 1
                java.lang.String r1 = r4.use
                r5.o(r6, r0, r1)
                r0 = 2
                java.lang.String r1 = r4.keyType
                r5.o(r6, r0, r1)
                r0 = 3
                boolean r1 = r5.z(r6, r0)
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
                Dv.r0 r1 = Dv.r0.f6781a
                java.lang.String r2 = r4.algorithm
                r5.t(r6, r0, r1, r2)
            L37:
                Dv.r0 r0 = Dv.r0.f6781a
                java.lang.String r1 = r4.exponent
                r2 = 4
                r5.t(r6, r2, r0, r1)
                r1 = 5
                java.lang.String r4 = r4.modulus
                r5.t(r6, r1, r0, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bt.e.c.b(bt.e$c, Cv.d, Bv.f):void");
        }

        public /* synthetic */ c(int i10, String str, String str2, String str3, String str4, String str5, String str6, n0 n0Var) {
            if (55 != (i10 & 55)) {
                Z.a(i10, 55, a.f60642a.getDescriptor());
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

        public final C6409a.C1206a a() {
            String str = this.algorithm;
            String str2 = this.exponent;
            String str3 = this.modulus;
            return new C6409a.C1206a(this.keyId, this.use, this.keyType, str, str2, str3);
        }
    }

    public /* synthetic */ e(int i10, List list, n0 n0Var) {
        if (1 != (i10 & 1)) {
            Z.a(i10, 1, a.f60635a.getDescriptor());
        }
        this.keys = list;
    }

    @JvmStatic
    public static final /* synthetic */ void c(e self, Cv.d output, f serialDesc) {
        output.l(serialDesc, 0, f60633b[0], self.keys);
    }

    public final C6409a b() {
        List<c> list = this.keys;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((c) it.next()).a());
        }
        return new C6409a(arrayList);
    }
}
