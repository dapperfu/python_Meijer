package Vs;

import Hv.C3693e;
import Hv.C3694e0;
import Hv.H;
import Hv.InterfaceC3718z;
import Hv.Z;
import Hv.n0;
import Hv.r0;
import Vs.h;
import Vs.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.UnknownFieldException;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0003\u0012\u0016\u0018B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0016\u0010\u0017R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001e"}, d2 = {"LVs/o;", "", "", "LVs/o$c;", "entries", "<init>", "(Ljava/util/List;)V", "", "seen0", "LHv/n0;", "serializationConstructorMarker", "(ILjava/util/List;LHv/n0;)V", "self", "LGv/d;", "output", "LFv/f;", "serialDesc", "", "c", "(LVs/o;LGv/d;LFv/f;)V", "", "LVs/h$a;", "b", "()Ljava/util/List;", "a", "Ljava/util/List;", "getEntries", "getEntries$annotations", "()V", "Companion", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
final class o {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    private static final Dv.b<Object>[] f37977b = {new C3693e(c.a.f37984a)};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<c> entries;

    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/okta/authfoundation/credential/StoredTokens.$serializer", "LHv/z;", "LVs/o;", "<init>", "()V", "LGv/f;", "encoder", "value", "", "g", "(LGv/f;LVs/o;)V", "LGv/e;", "decoder", "f", "(LGv/e;)LVs/o;", "", "LDv/b;", "e", "()[LDv/b;", "LFv/f;", "descriptor", "LFv/f;", "a", "()LFv/f;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated
    public /* synthetic */ class a implements InterfaceC3718z<o> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f37979a;
        private static final Fv.f descriptor;

        static {
            a aVar = new a();
            f37979a = aVar;
            C3694e0 c3694e0 = new C3694e0("com.okta.authfoundation.credential.StoredTokens", aVar, 1);
            c3694e0.p("entries", false);
            descriptor = c3694e0;
        }

        @Override // Dv.b, Dv.h, Dv.a
        /* renamed from: a */
        public final Fv.f getDescriptor() {
            return descriptor;
        }

        @Override // Dv.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final o d(Gv.e decoder) {
            List list;
            Intrinsics.j(decoder, "decoder");
            Fv.f fVar = descriptor;
            Gv.c cVarC = decoder.c(fVar);
            Dv.b[] bVarArr = o.f37977b;
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
            return new o(i10, list, n0Var);
        }

        @Override // Dv.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void b(Gv.f encoder, o value) {
            Intrinsics.j(encoder, "encoder");
            Intrinsics.j(value, "value");
            Fv.f fVar = descriptor;
            Gv.d dVarC = encoder.c(fVar);
            o.c(value, dVarC, fVar);
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
            return new Dv.b[]{o.f37977b[0]};
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LVs/o$b;", "", "<init>", "()V", "", "LVs/h$a;", "entries", "LVs/o;", "a", "(Ljava/util/List;)LVs/o;", "LDv/b;", "serializer", "()LDv/b;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* renamed from: Vs.o$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final o a(List<h.a> entries) {
            Intrinsics.j(entries, "entries");
            List<h.a> list = entries;
            ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
            for (h.a aVar : list) {
                String identifier = aVar.getIdentifier();
                p token = aVar.getToken();
                arrayList.add(new c(identifier, token != null ? token.a() : null, aVar.b()));
            }
            return new o(arrayList);
        }

        public final Dv.b<o> serializer() {
            return a.f37979a;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002\u0017\u0019B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tBE\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001d\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u001fR,\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010\u001c\u001a\u0004\b!\u0010#¨\u0006&"}, d2 = {"LVs/o$c;", "", "", "identifier", "LVs/k;", "token", "", "tags", "<init>", "(Ljava/lang/String;LVs/k;Ljava/util/Map;)V", "", "seen0", "LHv/n0;", "serializationConstructorMarker", "(ILjava/lang/String;LVs/k;Ljava/util/Map;LHv/n0;)V", "self", "LGv/d;", "output", "LFv/f;", "serialDesc", "", "e", "(LVs/o$c;LGv/d;LFv/f;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "getIdentifier$annotations", "()V", "LVs/k;", "d", "()LVs/k;", "getToken$annotations", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "getTags$annotations", "Companion", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: d, reason: collision with root package name */
        @JvmField
        private static final Dv.b<Object>[] f37980d;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String identifier;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final k token;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<String, String> tags;

        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/okta/authfoundation/credential/StoredTokens.Entry.$serializer", "LHv/z;", "LVs/o$c;", "<init>", "()V", "LGv/f;", "encoder", "value", "", "g", "(LGv/f;LVs/o$c;)V", "LGv/e;", "decoder", "f", "(LGv/e;)LVs/o$c;", "", "LDv/b;", "e", "()[LDv/b;", "LFv/f;", "descriptor", "LFv/f;", "a", "()LFv/f;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Deprecated
        public /* synthetic */ class a implements InterfaceC3718z<c> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f37984a;
            private static final Fv.f descriptor;

            static {
                a aVar = new a();
                f37984a = aVar;
                C3694e0 c3694e0 = new C3694e0("com.okta.authfoundation.credential.StoredTokens.Entry", aVar, 3);
                c3694e0.p("identifier", false);
                c3694e0.p("token", false);
                c3694e0.p("tags", false);
                descriptor = c3694e0;
            }

            @Override // Dv.b, Dv.h, Dv.a
            /* renamed from: a */
            public final Fv.f getDescriptor() {
                return descriptor;
            }

            @Override // Dv.a
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final c d(Gv.e decoder) {
                int i10;
                String str;
                k kVar;
                Map map;
                Intrinsics.j(decoder, "decoder");
                Fv.f fVar = descriptor;
                Gv.c cVarC = decoder.c(fVar);
                Dv.b[] bVarArr = c.f37980d;
                String strR = null;
                if (cVarC.n()) {
                    String strR2 = cVarC.r(fVar, 0);
                    k kVar2 = (k) cVarC.l(fVar, 1, k.a.f37959a, null);
                    map = (Map) cVarC.m(fVar, 2, bVarArr[2], null);
                    str = strR2;
                    i10 = 7;
                    kVar = kVar2;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    k kVar3 = null;
                    Map map2 = null;
                    while (z10) {
                        int iV = cVarC.v(fVar);
                        if (iV == -1) {
                            z10 = false;
                        } else if (iV == 0) {
                            strR = cVarC.r(fVar, 0);
                            i11 |= 1;
                        } else if (iV == 1) {
                            kVar3 = (k) cVarC.l(fVar, 1, k.a.f37959a, kVar3);
                            i11 |= 2;
                        } else {
                            if (iV != 2) {
                                throw new UnknownFieldException(iV);
                            }
                            map2 = (Map) cVarC.m(fVar, 2, bVarArr[2], map2);
                            i11 |= 4;
                        }
                    }
                    i10 = i11;
                    str = strR;
                    kVar = kVar3;
                    map = map2;
                }
                cVarC.a(fVar);
                return new c(i10, str, kVar, map, null);
            }

            @Override // Dv.h
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final void b(Gv.f encoder, c value) {
                Intrinsics.j(encoder, "encoder");
                Intrinsics.j(value, "value");
                Fv.f fVar = descriptor;
                Gv.d dVarC = encoder.c(fVar);
                c.e(value, dVarC, fVar);
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
                return new Dv.b[]{r0.f13359a, Ev.a.p(k.a.f37959a), c.f37980d[2]};
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LVs/o$c$b;", "", "<init>", "()V", "LDv/b;", "LVs/o$c;", "serializer", "()LDv/b;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: Vs.o$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Dv.b<c> serializer() {
                return a.f37984a;
            }
        }

        public /* synthetic */ c(int i10, String str, k kVar, Map map, n0 n0Var) {
            if (7 != (i10 & 7)) {
                Z.a(i10, 7, a.f37984a.getDescriptor());
            }
            this.identifier = str;
            this.token = kVar;
            this.tags = map;
        }

        static {
            r0 r0Var = r0.f13359a;
            f37980d = new Dv.b[]{null, null, new H(r0Var, r0Var)};
        }

        public c(String identifier, k kVar, Map<String, String> tags) {
            Intrinsics.j(identifier, "identifier");
            Intrinsics.j(tags, "tags");
            this.identifier = identifier;
            this.token = kVar;
            this.tags = tags;
        }

        @JvmStatic
        public static final /* synthetic */ void e(c self, Gv.d output, Fv.f serialDesc) {
            Dv.b<Object>[] bVarArr = f37980d;
            output.v(serialDesc, 0, self.identifier);
            output.o(serialDesc, 1, k.a.f37959a, self.token);
            output.z(serialDesc, 2, bVarArr[2], self.tags);
        }

        /* renamed from: b, reason: from getter */
        public final String getIdentifier() {
            return this.identifier;
        }

        public final Map<String, String> c() {
            return this.tags;
        }

        /* renamed from: d, reason: from getter */
        public final k getToken() {
            return this.token;
        }
    }

    public /* synthetic */ o(int i10, List list, n0 n0Var) {
        if (1 != (i10 & 1)) {
            Z.a(i10, 1, a.f37979a.getDescriptor());
        }
        this.entries = list;
    }

    public o(List<c> entries) {
        Intrinsics.j(entries, "entries");
        this.entries = entries;
    }

    @JvmStatic
    public static final /* synthetic */ void c(o self, Gv.d output, Fv.f serialDesc) {
        output.z(serialDesc, 0, f37977b[0], self.entries);
    }

    public final List<h.a> b() {
        List<c> list = this.entries;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (c cVar : list) {
            String identifier = cVar.getIdentifier();
            k token = cVar.getToken();
            arrayList.add(new h.a(identifier, token != null ? token.a(cVar.getIdentifier(), com.okta.authfoundation.client.j.INSTANCE.d()) : null, cVar.c()));
        }
        return CollectionsKt.m1(arrayList);
    }
}
