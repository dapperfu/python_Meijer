package Vs;

import Dv.C3135e;
import Dv.C3136e0;
import Dv.H;
import Dv.InterfaceC3160z;
import Dv.Z;
import Dv.n0;
import Dv.r0;
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

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u0000 \u001d2\u00020\u0001:\u0003\u0012\u0016\u0018B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0016\u0010\u0017R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001e"}, d2 = {"LVs/o;", "", "", "LVs/o$c;", "entries", "<init>", "(Ljava/util/List;)V", "", "seen0", "LDv/n0;", "serializationConstructorMarker", "(ILjava/util/List;LDv/n0;)V", "self", "LCv/d;", "output", "LBv/f;", "serialDesc", "", "c", "(LVs/o;LCv/d;LBv/f;)V", "", "LVs/h$a;", "b", "()Ljava/util/List;", "a", "Ljava/util/List;", "getEntries", "getEntries$annotations", "()V", "Companion", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
final class o {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: b, reason: collision with root package name */
    @JvmField
    private static final zv.b<Object>[] f40404b = {new C3135e(c.a.f40411a)};

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<c> entries;

    @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/okta/authfoundation/credential/StoredTokens.$serializer", "LDv/z;", "LVs/o;", "<init>", "()V", "LCv/f;", "encoder", "value", "", "g", "(LCv/f;LVs/o;)V", "LCv/e;", "decoder", "f", "(LCv/e;)LVs/o;", "", "Lzv/b;", "e", "()[Lzv/b;", "LBv/f;", "descriptor", "LBv/f;", "a", "()LBv/f;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Deprecated
    public /* synthetic */ class a implements InterfaceC3160z<o> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40406a;
        private static final Bv.f descriptor;

        static {
            a aVar = new a();
            f40406a = aVar;
            C3136e0 c3136e0 = new C3136e0("com.okta.authfoundation.credential.StoredTokens", aVar, 1);
            c3136e0.p("entries", false);
            descriptor = c3136e0;
        }

        @Override // zv.b, zv.h, zv.InterfaceC18555a
        /* renamed from: a */
        public final Bv.f getDescriptor() {
            return descriptor;
        }

        @Override // zv.InterfaceC18555a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final o c(Cv.e decoder) {
            List list;
            Intrinsics.j(decoder, "decoder");
            Bv.f fVar = descriptor;
            Cv.c cVarB = decoder.b(fVar);
            zv.b[] bVarArr = o.f40404b;
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
            return new o(i10, list, n0Var);
        }

        @Override // zv.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final void b(Cv.f encoder, o value) {
            Intrinsics.j(encoder, "encoder");
            Intrinsics.j(value, "value");
            Bv.f fVar = descriptor;
            Cv.d dVarB = encoder.b(fVar);
            o.c(value, dVarB, fVar);
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
            return new zv.b[]{o.f40404b[0]};
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LVs/o$b;", "", "<init>", "()V", "", "LVs/h$a;", "entries", "LVs/o;", "a", "(Ljava/util/List;)LVs/o;", "Lzv/b;", "serializer", "()Lzv/b;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        public final zv.b<o> serializer() {
            return a.f40406a;
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 %2\u00020\u0001:\u0002\u0017\u0019B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0004\b\b\u0010\tBE\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001d\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u001e\u0010\u001fR,\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b$\u0010\u001c\u001a\u0004\b!\u0010#¨\u0006&"}, d2 = {"LVs/o$c;", "", "", "identifier", "LVs/k;", "token", "", "tags", "<init>", "(Ljava/lang/String;LVs/k;Ljava/util/Map;)V", "", "seen0", "LDv/n0;", "serializationConstructorMarker", "(ILjava/lang/String;LVs/k;Ljava/util/Map;LDv/n0;)V", "self", "LCv/d;", "output", "LBv/f;", "serialDesc", "", "e", "(LVs/o$c;LCv/d;LBv/f;)V", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "getIdentifier$annotations", "()V", "LVs/k;", "d", "()LVs/k;", "getToken$annotations", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "getTags$annotations", "Companion", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: d, reason: collision with root package name */
        @JvmField
        private static final zv.b<Object>[] f40407d;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String identifier;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final k token;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<String, String> tags;

        @Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/okta/authfoundation/credential/StoredTokens.Entry.$serializer", "LDv/z;", "LVs/o$c;", "<init>", "()V", "LCv/f;", "encoder", "value", "", "g", "(LCv/f;LVs/o$c;)V", "LCv/e;", "decoder", "f", "(LCv/e;)LVs/o$c;", "", "Lzv/b;", "e", "()[Lzv/b;", "LBv/f;", "descriptor", "LBv/f;", "a", "()LBv/f;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @Deprecated
        public /* synthetic */ class a implements InterfaceC3160z<c> {

            /* renamed from: a, reason: collision with root package name */
            public static final a f40411a;
            private static final Bv.f descriptor;

            static {
                a aVar = new a();
                f40411a = aVar;
                C3136e0 c3136e0 = new C3136e0("com.okta.authfoundation.credential.StoredTokens.Entry", aVar, 3);
                c3136e0.p("identifier", false);
                c3136e0.p("token", false);
                c3136e0.p("tags", false);
                descriptor = c3136e0;
            }

            @Override // zv.b, zv.h, zv.InterfaceC18555a
            /* renamed from: a */
            public final Bv.f getDescriptor() {
                return descriptor;
            }

            @Override // zv.InterfaceC18555a
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public final c c(Cv.e decoder) {
                int i10;
                String str;
                k kVar;
                Map map;
                Intrinsics.j(decoder, "decoder");
                Bv.f fVar = descriptor;
                Cv.c cVarB = decoder.b(fVar);
                zv.b[] bVarArr = c.f40407d;
                String strQ = null;
                if (cVarB.p()) {
                    String strQ2 = cVarB.q(fVar, 0);
                    k kVar2 = (k) cVarB.u(fVar, 1, k.a.f40386a, null);
                    map = (Map) cVarB.e(fVar, 2, bVarArr[2], null);
                    str = strQ2;
                    i10 = 7;
                    kVar = kVar2;
                } else {
                    boolean z10 = true;
                    int i11 = 0;
                    k kVar3 = null;
                    Map map2 = null;
                    while (z10) {
                        int iF = cVarB.f(fVar);
                        if (iF == -1) {
                            z10 = false;
                        } else if (iF == 0) {
                            strQ = cVarB.q(fVar, 0);
                            i11 |= 1;
                        } else if (iF == 1) {
                            kVar3 = (k) cVarB.u(fVar, 1, k.a.f40386a, kVar3);
                            i11 |= 2;
                        } else {
                            if (iF != 2) {
                                throw new UnknownFieldException(iF);
                            }
                            map2 = (Map) cVarB.e(fVar, 2, bVarArr[2], map2);
                            i11 |= 4;
                        }
                    }
                    i10 = i11;
                    str = strQ;
                    kVar = kVar3;
                    map = map2;
                }
                cVarB.a(fVar);
                return new c(i10, str, kVar, map, null);
            }

            @Override // zv.h
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public final void b(Cv.f encoder, c value) {
                Intrinsics.j(encoder, "encoder");
                Intrinsics.j(value, "value");
                Bv.f fVar = descriptor;
                Cv.d dVarB = encoder.b(fVar);
                c.e(value, dVarB, fVar);
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
                return new zv.b[]{r0.f6781a, Av.a.p(k.a.f40386a), c.f40407d[2]};
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LVs/o$c$b;", "", "<init>", "()V", "Lzv/b;", "LVs/o$c;", "serializer", "()Lzv/b;", "auth-foundation_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: Vs.o$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final zv.b<c> serializer() {
                return a.f40411a;
            }
        }

        public /* synthetic */ c(int i10, String str, k kVar, Map map, n0 n0Var) {
            if (7 != (i10 & 7)) {
                Z.a(i10, 7, a.f40411a.getDescriptor());
            }
            this.identifier = str;
            this.token = kVar;
            this.tags = map;
        }

        static {
            r0 r0Var = r0.f6781a;
            f40407d = new zv.b[]{null, null, new H(r0Var, r0Var)};
        }

        public c(String identifier, k kVar, Map<String, String> tags) {
            Intrinsics.j(identifier, "identifier");
            Intrinsics.j(tags, "tags");
            this.identifier = identifier;
            this.token = kVar;
            this.tags = tags;
        }

        @JvmStatic
        public static final /* synthetic */ void e(c self, Cv.d output, Bv.f serialDesc) {
            zv.b<Object>[] bVarArr = f40407d;
            output.o(serialDesc, 0, self.identifier);
            output.t(serialDesc, 1, k.a.f40386a, self.token);
            output.l(serialDesc, 2, bVarArr[2], self.tags);
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
            Z.a(i10, 1, a.f40406a.getDescriptor());
        }
        this.entries = list;
    }

    public o(List<c> entries) {
        Intrinsics.j(entries, "entries");
        this.entries = entries;
    }

    @JvmStatic
    public static final /* synthetic */ void c(o self, Cv.d output, Bv.f serialDesc) {
        output.l(serialDesc, 0, f40404b[0], self.entries);
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
