package defpackage;

import com.squareup.wire.ProtoAdapter;
import gw.C14419h;
import hu.d;
import hu.k;
import hu.n;
import hu.o;
import hu.q;
import iu.C14850b;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u0000 \u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nBE\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u001c\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u0019\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\n\u0010&¨\u0006'"}, d2 = {"Lj;", "Lhu/k;", "", "", "register_name", "mapping_name", "", "begin_address", "Lgw/h;", "memory", "Lb;", "arm_mte_metadata", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLgw/h;Lb;Lgw/h;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "e", "Ljava/lang/String;", "f", "d", "g", "J", "c", "()J", "h", "Lgw/h;", "()Lgw/h;", "i", "Lb;", "()Lb;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j extends k {

    /* renamed from: k, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<j> f139127k = new a(d.f136160e, Reflection.b(j.class), q.f136192d);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String register_name;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String mapping_name;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long begin_address;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final C14419h memory;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final b arm_mte_metadata;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"j$a", "Lcom/squareup/wire/ProtoAdapter;", "Lj;", "value", "", "o", "(Lj;)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;Lj;)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Lj;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends ProtoAdapter<j> {
        a(d dVar, KClass<j> kClass, q qVar) {
            super(dVar, kClass, "type.googleapis.com/MemoryDump", qVar, null, "tombstone.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public j c(n reader) throws IOException {
            Intrinsics.j(reader, "reader");
            C14419h c14419hC = C14419h.f134558e;
            long jD = reader.d();
            String strC = "";
            b bVarC = null;
            long jLongValue = 0;
            String strC2 = "";
            while (true) {
                int iH = reader.h();
                if (iH == -1) {
                    return new j(strC, strC2, jLongValue, c14419hC, bVarC, reader.e(jD));
                }
                if (iH == 1) {
                    strC = ProtoAdapter.f127431J.c(reader);
                } else if (iH == 2) {
                    strC2 = ProtoAdapter.f127431J.c(reader);
                } else if (iH == 3) {
                    jLongValue = ProtoAdapter.f127462w.c(reader).longValue();
                } else if (iH == 4) {
                    c14419hC = ProtoAdapter.f127430I.c(reader);
                } else if (iH != 6) {
                    reader.n(iH);
                } else {
                    bVarC = b.f59715g.c(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(o writer, j value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(value, "value");
            if (!Intrinsics.e(value.getRegister_name(), "")) {
                ProtoAdapter.f127431J.f(writer, 1, value.getRegister_name());
            }
            if (!Intrinsics.e(value.getMapping_name(), "")) {
                ProtoAdapter.f127431J.f(writer, 2, value.getMapping_name());
            }
            if (value.getBegin_address() != 0) {
                ProtoAdapter.f127462w.f(writer, 3, Long.valueOf(value.getBegin_address()));
            }
            if (!Intrinsics.e(value.getMemory(), C14419h.f134558e)) {
                ProtoAdapter.f127430I.f(writer, 4, value.getMemory());
            }
            b.f59715g.f(writer, 6, value.getArm_mte_metadata());
            writer.a(value.a());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int g(j value) {
            Intrinsics.j(value, "value");
            int iV = value.a().V();
            if (!Intrinsics.e(value.getRegister_name(), "")) {
                iV += ProtoAdapter.f127431J.h(1, value.getRegister_name());
            }
            if (!Intrinsics.e(value.getMapping_name(), "")) {
                iV += ProtoAdapter.f127431J.h(2, value.getMapping_name());
            }
            if (value.getBegin_address() != 0) {
                iV += ProtoAdapter.f127462w.h(3, Long.valueOf(value.getBegin_address()));
            }
            if (!Intrinsics.e(value.getMemory(), C14419h.f134558e)) {
                iV += ProtoAdapter.f127430I.h(4, value.getMemory());
            }
            return iV + b.f59715g.h(6, value.getArm_mte_metadata());
        }
    }

    public j() {
        this(null, null, 0L, null, null, null, 63, null);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof j)) {
            return false;
        }
        j jVar = (j) other;
        return Intrinsics.e(a(), jVar.a()) && Intrinsics.e(this.register_name, jVar.register_name) && Intrinsics.e(this.mapping_name, jVar.mapping_name) && this.begin_address == jVar.begin_address && Intrinsics.e(this.memory, jVar.memory) && Intrinsics.e(this.arm_mte_metadata, jVar.arm_mte_metadata);
    }

    public /* synthetic */ j(String str, String str2, long j10, C14419h c14419h, b bVar, C14419h c14419h2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? 0L : j10, (i10 & 8) != 0 ? C14419h.f134558e : c14419h, (i10 & 16) != 0 ? null : bVar, (i10 & 32) != 0 ? C14419h.f134558e : c14419h2);
    }

    /* renamed from: b, reason: from getter */
    public final b getArm_mte_metadata() {
        return this.arm_mte_metadata;
    }

    /* renamed from: c, reason: from getter */
    public final long getBegin_address() {
        return this.begin_address;
    }

    /* renamed from: d, reason: from getter */
    public final String getMapping_name() {
        return this.mapping_name;
    }

    /* renamed from: e, reason: from getter */
    public final C14419h getMemory() {
        return this.memory;
    }

    /* renamed from: f, reason: from getter */
    public final String getRegister_name() {
        return this.register_name;
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((a().hashCode() * 37) + this.register_name.hashCode()) * 37) + this.mapping_name.hashCode()) * 37) + Long.hashCode(this.begin_address)) * 37) + this.memory.hashCode()) * 37;
        b bVar = this.arm_mte_metadata;
        int iHashCode2 = iHashCode + (bVar != null ? bVar.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("register_name=" + C14850b.c(this.register_name));
        arrayList.add("mapping_name=" + C14850b.c(this.mapping_name));
        arrayList.add("begin_address=" + this.begin_address);
        arrayList.add("memory=" + this.memory);
        if (this.arm_mte_metadata != null) {
            arrayList.add("arm_mte_metadata=" + this.arm_mte_metadata);
        }
        return CollectionsKt.B0(arrayList, ", ", "MemoryDump{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String register_name, String mapping_name, long j10, C14419h memory, b bVar, C14419h unknownFields) {
        super(f139127k, unknownFields);
        Intrinsics.j(register_name, "register_name");
        Intrinsics.j(mapping_name, "mapping_name");
        Intrinsics.j(memory, "memory");
        Intrinsics.j(unknownFields, "unknownFields");
        this.register_name = register_name;
        this.mapping_name = mapping_name;
        this.begin_address = j10;
        this.memory = memory;
        this.arm_mte_metadata = bVar;
    }
}
