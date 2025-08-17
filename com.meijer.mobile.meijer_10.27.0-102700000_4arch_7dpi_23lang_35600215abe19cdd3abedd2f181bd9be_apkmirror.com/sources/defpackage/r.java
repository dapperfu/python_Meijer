package defpackage;

import com.squareup.wire.ProtoAdapter;
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
import kw.C15331h;
import lu.d;
import lu.k;
import lu.n;
import lu.o;
import lu.q;
import mu.C15710b;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u001e\u0018\u0000 32\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%Bw\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u001bR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010\u001bR\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b&\u0010\u001dR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b$\u0010)R\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b\u0010\u0010\u001bR\u001a\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b'\u0010\u001bR\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b!\u0010)R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b\u001e\u00102¨\u00064"}, d2 = {"Lr;", "Llu/k;", "", "", "number", "", "name", "code", "code_name", "", "has_sender", "sender_uid", "sender_pid", "has_fault_address", "", "fault_address", "Lj;", "fault_adjacent_metadata", "Lkw/h;", "unknownFields", "<init>", "(ILjava/lang/String;ILjava/lang/String;ZIIZJLj;Lkw/h;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "e", "I", "h", "f", "Ljava/lang/String;", "getName", "g", "b", "c", "i", "Z", "()Z", "k", "l", "m", "J", "d", "()J", "n", "Lj;", "()Lj;", "o", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class r extends k {

    /* renamed from: p, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<r> f157712p = new a(d.f149408e, Reflection.b(r.class), q.f149440d);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int number;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int code;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String code_name;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean has_sender;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int sender_uid;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int sender_pid;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean has_fault_address;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long fault_address;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final j fault_adjacent_metadata;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"r$a", "Lcom/squareup/wire/ProtoAdapter;", "Lr;", "value", "", "o", "(Lr;)I", "Llu/o;", "writer", "", "n", "(Llu/o;Lr;)V", "Llu/n;", "reader", "m", "(Llu/n;)Lr;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends ProtoAdapter<r> {
        a(d dVar, KClass<r> kClass, q qVar) {
            super(dVar, kClass, "type.googleapis.com/Signal", qVar, null, "tombstone.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public r d(n reader) throws IOException {
            Intrinsics.j(reader, "reader");
            long jD = reader.d();
            String strD = "";
            long jLongValue = 0;
            j jVarD = null;
            int iIntValue = 0;
            int iIntValue2 = 0;
            boolean zBooleanValue = false;
            int iIntValue3 = 0;
            int iIntValue4 = 0;
            boolean zBooleanValue2 = false;
            String strD2 = "";
            while (true) {
                long j10 = jLongValue;
                while (true) {
                    int iH = reader.h();
                    if (iH == -1) {
                        return new r(iIntValue, strD, iIntValue2, strD2, zBooleanValue, iIntValue3, iIntValue4, zBooleanValue2, j10, jVarD, reader.e(jD));
                    }
                    switch (iH) {
                        case 1:
                            iIntValue = ProtoAdapter.f126638k.d(reader).intValue();
                            break;
                        case 2:
                            strD = ProtoAdapter.f126619J.d(reader);
                            break;
                        case 3:
                            iIntValue2 = ProtoAdapter.f126638k.d(reader).intValue();
                            break;
                        case 4:
                            strD2 = ProtoAdapter.f126619J.d(reader);
                            break;
                        case 5:
                            zBooleanValue = ProtoAdapter.f126637j.d(reader).booleanValue();
                            break;
                        case 6:
                            iIntValue3 = ProtoAdapter.f126638k.d(reader).intValue();
                            break;
                        case 7:
                            iIntValue4 = ProtoAdapter.f126638k.d(reader).intValue();
                            break;
                        case 8:
                            zBooleanValue2 = ProtoAdapter.f126637j.d(reader).booleanValue();
                            break;
                        case 9:
                            break;
                        case 10:
                            jVarD = j.f138538k.d(reader);
                            break;
                        default:
                            reader.n(iH);
                            break;
                    }
                }
                jLongValue = ProtoAdapter.f126650w.d(reader).longValue();
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(o writer, r value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(value, "value");
            if (value.getNumber() != 0) {
                ProtoAdapter.f126638k.f(writer, 1, Integer.valueOf(value.getNumber()));
            }
            if (!Intrinsics.e(value.getName(), "")) {
                ProtoAdapter.f126619J.f(writer, 2, value.getName());
            }
            if (value.getCode() != 0) {
                ProtoAdapter.f126638k.f(writer, 3, Integer.valueOf(value.getCode()));
            }
            if (!Intrinsics.e(value.getCode_name(), "")) {
                ProtoAdapter.f126619J.f(writer, 4, value.getCode_name());
            }
            if (value.getHas_sender()) {
                ProtoAdapter.f126637j.f(writer, 5, Boolean.valueOf(value.getHas_sender()));
            }
            if (value.getSender_uid() != 0) {
                ProtoAdapter.f126638k.f(writer, 6, Integer.valueOf(value.getSender_uid()));
            }
            if (value.getSender_pid() != 0) {
                ProtoAdapter.f126638k.f(writer, 7, Integer.valueOf(value.getSender_pid()));
            }
            if (value.getHas_fault_address()) {
                ProtoAdapter.f126637j.f(writer, 8, Boolean.valueOf(value.getHas_fault_address()));
            }
            if (value.getFault_address() != 0) {
                ProtoAdapter.f126650w.f(writer, 9, Long.valueOf(value.getFault_address()));
            }
            if (value.getFault_adjacent_metadata() != null) {
                j.f138538k.f(writer, 10, value.getFault_adjacent_metadata());
            }
            writer.a(value.a());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int g(r value) {
            Intrinsics.j(value, "value");
            int iV = value.a().V();
            if (value.getNumber() != 0) {
                iV += ProtoAdapter.f126638k.h(1, Integer.valueOf(value.getNumber()));
            }
            if (!Intrinsics.e(value.getName(), "")) {
                iV += ProtoAdapter.f126619J.h(2, value.getName());
            }
            if (value.getCode() != 0) {
                iV += ProtoAdapter.f126638k.h(3, Integer.valueOf(value.getCode()));
            }
            if (!Intrinsics.e(value.getCode_name(), "")) {
                iV += ProtoAdapter.f126619J.h(4, value.getCode_name());
            }
            if (value.getHas_sender()) {
                iV += ProtoAdapter.f126637j.h(5, Boolean.valueOf(value.getHas_sender()));
            }
            if (value.getSender_uid() != 0) {
                iV += ProtoAdapter.f126638k.h(6, Integer.valueOf(value.getSender_uid()));
            }
            if (value.getSender_pid() != 0) {
                iV += ProtoAdapter.f126638k.h(7, Integer.valueOf(value.getSender_pid()));
            }
            if (value.getHas_fault_address()) {
                iV += ProtoAdapter.f126637j.h(8, Boolean.valueOf(value.getHas_fault_address()));
            }
            if (value.getFault_address() != 0) {
                iV += ProtoAdapter.f126650w.h(9, Long.valueOf(value.getFault_address()));
            }
            return value.getFault_adjacent_metadata() != null ? iV + j.f138538k.h(10, value.getFault_adjacent_metadata()) : iV;
        }
    }

    public r() {
        this(0, null, 0, null, false, 0, 0, false, 0L, null, null, 2047, null);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof r)) {
            return false;
        }
        r rVar = (r) other;
        return Intrinsics.e(a(), rVar.a()) && this.number == rVar.number && Intrinsics.e(this.name, rVar.name) && this.code == rVar.code && Intrinsics.e(this.code_name, rVar.code_name) && this.has_sender == rVar.has_sender && this.sender_uid == rVar.sender_uid && this.sender_pid == rVar.sender_pid && this.has_fault_address == rVar.has_fault_address && this.fault_address == rVar.fault_address && Intrinsics.e(this.fault_adjacent_metadata, rVar.fault_adjacent_metadata);
    }

    public /* synthetic */ r(int i10, String str, int i11, String str2, boolean z10, int i12, int i13, boolean z11, long j10, j jVar, C15331h c15331h, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i10, (i14 & 2) != 0 ? "" : str, (i14 & 4) != 0 ? 0 : i11, (i14 & 8) == 0 ? str2 : "", (i14 & 16) != 0 ? false : z10, (i14 & 32) != 0 ? 0 : i12, (i14 & 64) != 0 ? 0 : i13, (i14 & 128) == 0 ? z11 : false, (i14 & 256) != 0 ? 0L : j10, (i14 & 512) != 0 ? null : jVar, (i14 & 1024) != 0 ? C15331h.f148095e : c15331h);
    }

    /* renamed from: b, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* renamed from: c, reason: from getter */
    public final String getCode_name() {
        return this.code_name;
    }

    /* renamed from: d, reason: from getter */
    public final long getFault_address() {
        return this.fault_address;
    }

    /* renamed from: e, reason: from getter */
    public final j getFault_adjacent_metadata() {
        return this.fault_adjacent_metadata;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getHas_fault_address() {
        return this.has_fault_address;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getHas_sender() {
        return this.has_sender;
    }

    public final String getName() {
        return this.name;
    }

    /* renamed from: h, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((((((((((a().hashCode() * 37) + Integer.hashCode(this.number)) * 37) + this.name.hashCode()) * 37) + Integer.hashCode(this.code)) * 37) + this.code_name.hashCode()) * 37) + Boolean.hashCode(this.has_sender)) * 37) + Integer.hashCode(this.sender_uid)) * 37) + Integer.hashCode(this.sender_pid)) * 37) + Boolean.hashCode(this.has_fault_address)) * 37) + Long.hashCode(this.fault_address)) * 37;
        j jVar = this.fault_adjacent_metadata;
        int iHashCode2 = iHashCode + (jVar != null ? jVar.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    /* renamed from: i, reason: from getter */
    public final int getSender_pid() {
        return this.sender_pid;
    }

    /* renamed from: j, reason: from getter */
    public final int getSender_uid() {
        return this.sender_uid;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("number=" + this.number);
        arrayList.add("name=" + C15710b.c(this.name));
        arrayList.add("code=" + this.code);
        arrayList.add("code_name=" + C15710b.c(this.code_name));
        arrayList.add("has_sender=" + this.has_sender);
        arrayList.add("sender_uid=" + this.sender_uid);
        arrayList.add("sender_pid=" + this.sender_pid);
        arrayList.add("has_fault_address=" + this.has_fault_address);
        arrayList.add("fault_address=" + this.fault_address);
        if (this.fault_adjacent_metadata != null) {
            arrayList.add("fault_adjacent_metadata=" + this.fault_adjacent_metadata);
        }
        return CollectionsKt.B0(arrayList, ", ", "Signal{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i10, String name, int i11, String code_name, boolean z10, int i12, int i13, boolean z11, long j10, j jVar, C15331h unknownFields) {
        super(f157712p, unknownFields);
        Intrinsics.j(name, "name");
        Intrinsics.j(code_name, "code_name");
        Intrinsics.j(unknownFields, "unknownFields");
        this.number = i10;
        this.name = name;
        this.code = i11;
        this.code_name = code_name;
        this.has_sender = z10;
        this.sender_uid = i12;
        this.sender_pid = i13;
        this.has_fault_address = z11;
        this.fault_address = j10;
        this.fault_adjacent_metadata = jVar;
    }
}
