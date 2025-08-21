package defpackage;

import com.squareup.wire.ProtoAdapter;
import gw.C14419h;
import hu.n;
import hu.o;
import hu.q;
import hu.r;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003!\u001a\u001eB1\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lk;", "Lhu/k;", "", "Lk$c;", "tool", "Lk$d;", "type", "Lg;", "heap", "Lgw/h;", "unknownFields", "<init>", "(Lk$c;Lk$d;Lg;Lgw/h;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "e", "Lk$c;", "c", "()Lk$c;", "f", "Lk$d;", "d", "()Lk$d;", "Lg;", "b", "()Lg;", "h", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class k extends hu.k {

    /* renamed from: i, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<k> f141301i = new a(hu.d.f136160e, Reflection.b(k.class), q.f136192d);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final c tool;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final d type;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final g heap;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"k$a", "Lcom/squareup/wire/ProtoAdapter;", "Lk;", "value", "", "o", "(Lk;)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;Lk;)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Lk;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<k> {
        a(hu.d dVar, KClass<k> kClass, q qVar) {
            super(dVar, kClass, "type.googleapis.com/MemoryError", qVar, null, "tombstone.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public k c(n reader) throws IOException {
            Intrinsics.j(reader, "reader");
            c cVarC = c.f141321d;
            d dVarC = d.f141328d;
            long jD = reader.d();
            g gVarC = null;
            while (true) {
                int iH = reader.h();
                if (iH == -1) {
                    return new k(cVarC, dVarC, gVarC, reader.e(jD));
                }
                if (iH == 1) {
                    try {
                        cVarC = c.f141320c.c(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                        reader.a(iH, hu.d.f136158c, Long.valueOf(e10.value));
                    }
                } else if (iH == 2) {
                    try {
                        dVarC = d.f141327c.c(reader);
                    } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                        reader.a(iH, hu.d.f136158c, Long.valueOf(e11.value));
                    }
                } else if (iH != 3) {
                    reader.n(iH);
                } else {
                    gVarC = g.f133712l.c(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(o writer, k value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(value, "value");
            if (value.getTool() != c.f141321d) {
                c.f141320c.f(writer, 1, value.getTool());
            }
            if (value.getType() != d.f141328d) {
                d.f141327c.f(writer, 2, value.getType());
            }
            g.f133712l.f(writer, 3, value.getHeap());
            writer.a(value.a());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int g(k value) {
            Intrinsics.j(value, "value");
            int iV = value.a().V();
            if (value.getTool() != c.f141321d) {
                iV += c.f141320c.h(1, value.getTool());
            }
            if (value.getType() != d.f141328d) {
                iV += d.f141327c.h(2, value.getType());
            }
            return iV + g.f133712l.h(3, value.getHeap());
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lk$c;", "Lhu/r;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "a", "I", "getValue", "()I", "b", "d", "e", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class c implements r {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE;

        /* renamed from: c, reason: collision with root package name */
        @JvmField
        public static final ProtoAdapter<c> f141320c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f141321d;

        /* renamed from: e, reason: collision with root package name */
        public static final c f141322e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ c[] f141323f;

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f141324g;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"k$c$a", "Lhu/c;", "Lk$c;", "", "value", "q", "(I)Lk$c;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends hu.c<c> {
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // hu.c
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public c p(int value) {
                return c.INSTANCE.a(value);
            }

            a(KClass<c> kClass, q qVar, c cVar) {
                super(kClass, qVar, cVar);
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lk$c$b;", "", "<init>", "()V", "", "value", "Lk$c;", "a", "(I)Lk$c;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: k$c$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final c a(int value) {
                if (value == 0) {
                    return c.f141321d;
                }
                if (value != 1) {
                    return null;
                }
                return c.f141322e;
            }
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f141321d, f141322e};
        }

        static {
            c cVar = new c("GWP_ASAN", 0, 0);
            f141321d = cVar;
            f141322e = new c("SCUDO", 1, 1);
            c[] cVarArrA = a();
            f141323f = cVarArrA;
            f141324g = EnumEntriesKt.a(cVarArrA);
            INSTANCE = new Companion(null);
            f141320c = new a(Reflection.b(c.class), q.f136192d, cVar);
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f141323f.clone();
        }

        @Override // hu.r
        public int getValue() {
            return this.value;
        }

        private c(String str, int i10, int i11) {
            this.value = i11;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lk$d;", "Lhu/r;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "a", "I", "getValue", "()I", "b", "d", "e", "f", "g", "h", "i", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class d implements r {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE;

        /* renamed from: c, reason: collision with root package name */
        @JvmField
        public static final ProtoAdapter<d> f141327c;

        /* renamed from: d, reason: collision with root package name */
        public static final d f141328d;

        /* renamed from: e, reason: collision with root package name */
        public static final d f141329e;

        /* renamed from: f, reason: collision with root package name */
        public static final d f141330f;

        /* renamed from: g, reason: collision with root package name */
        public static final d f141331g;

        /* renamed from: h, reason: collision with root package name */
        public static final d f141332h;

        /* renamed from: i, reason: collision with root package name */
        public static final d f141333i;

        /* renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ d[] f141334j;

        /* renamed from: k, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f141335k;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int value;

        @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"k$d$a", "Lhu/c;", "Lk$d;", "", "value", "q", "(I)Lk$d;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class a extends hu.c<d> {
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // hu.c
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public d p(int value) {
                return d.INSTANCE.a(value);
            }

            a(KClass<d> kClass, q qVar, d dVar) {
                super(kClass, qVar, dVar);
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lk$d$b;", "", "<init>", "()V", "", "value", "Lk$d;", "a", "(I)Lk$d;", "Lcom/squareup/wire/ProtoAdapter;", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: k$d$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final d a(int value) {
                if (value == 0) {
                    return d.f141328d;
                }
                if (value == 1) {
                    return d.f141329e;
                }
                if (value == 2) {
                    return d.f141330f;
                }
                if (value == 3) {
                    return d.f141331g;
                }
                if (value == 4) {
                    return d.f141332h;
                }
                if (value != 5) {
                    return null;
                }
                return d.f141333i;
            }
        }

        private static final /* synthetic */ d[] a() {
            return new d[]{f141328d, f141329e, f141330f, f141331g, f141332h, f141333i};
        }

        static {
            d dVar = new d("UNKNOWN", 0, 0);
            f141328d = dVar;
            f141329e = new d("USE_AFTER_FREE", 1, 1);
            f141330f = new d("DOUBLE_FREE", 2, 2);
            f141331g = new d("INVALID_FREE", 3, 3);
            f141332h = new d("BUFFER_OVERFLOW", 4, 4);
            f141333i = new d("BUFFER_UNDERFLOW", 5, 5);
            d[] dVarArrA = a();
            f141334j = dVarArrA;
            f141335k = EnumEntriesKt.a(dVarArrA);
            INSTANCE = new Companion(null);
            f141327c = new a(Reflection.b(d.class), q.f136192d, dVar);
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f141334j.clone();
        }

        @Override // hu.r
        public int getValue() {
            return this.value;
        }

        private d(String str, int i10, int i11) {
            this.value = i11;
        }
    }

    public k() {
        this(null, null, null, null, 15, null);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof k)) {
            return false;
        }
        k kVar = (k) other;
        return Intrinsics.e(a(), kVar.a()) && this.tool == kVar.tool && this.type == kVar.type && Intrinsics.e(this.heap, kVar.heap);
    }

    public /* synthetic */ k(c cVar, d dVar, g gVar, C14419h c14419h, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? c.f141321d : cVar, (i10 & 2) != 0 ? d.f141328d : dVar, (i10 & 4) != 0 ? null : gVar, (i10 & 8) != 0 ? C14419h.f134558e : c14419h);
    }

    /* renamed from: b, reason: from getter */
    public final g getHeap() {
        return this.heap;
    }

    /* renamed from: c, reason: from getter */
    public final c getTool() {
        return this.tool;
    }

    /* renamed from: d, reason: from getter */
    public final d getType() {
        return this.type;
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((a().hashCode() * 37) + this.tool.hashCode()) * 37) + this.type.hashCode()) * 37;
        g gVar = this.heap;
        int iHashCode2 = iHashCode + (gVar != null ? gVar.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("tool=" + this.tool);
        arrayList.add("type=" + this.type);
        if (this.heap != null) {
            arrayList.add("heap=" + this.heap);
        }
        return CollectionsKt.B0(arrayList, ", ", "MemoryError{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c tool, d type, g gVar, C14419h unknownFields) {
        super(f141301i, unknownFields);
        Intrinsics.j(tool, "tool");
        Intrinsics.j(type, "type");
        Intrinsics.j(unknownFields, "unknownFields");
        this.tool = tool;
        this.type = type;
        this.heap = gVar;
    }
}
