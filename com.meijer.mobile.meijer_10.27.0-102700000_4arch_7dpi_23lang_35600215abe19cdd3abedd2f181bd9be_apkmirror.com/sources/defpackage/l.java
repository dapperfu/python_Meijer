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

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBk\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b'\u0010&R\u001a\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b\u001c\u0010&R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\"\u0010\u001bR\u001a\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0000\u0010)\u001a\u0004\b*\u0010\u001bR\u001a\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u001d\u001a\u0004\b \u0010\u001f¨\u0006-"}, d2 = {"Ll;", "Llu/k;", "", "", "begin_address", "end_address", "offset", "", "read", "write", "execute", "", "mapping_name", "build_id", "load_bias", "Lkw/h;", "unknownFields", "<init>", "(JJJZZZLjava/lang/String;Ljava/lang/String;JLkw/h;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "e", "J", "b", "()J", "f", "d", "g", "h", "Z", "i", "()Z", "j", "k", "Ljava/lang/String;", "c", "m", "n", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l extends k {

    /* renamed from: o, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<l> f148140o = new a(d.f149408e, Reflection.b(l.class), q.f149440d);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long begin_address;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long end_address;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long offset;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean read;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final boolean write;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean execute;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final String mapping_name;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final String build_id;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long load_bias;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"l$a", "Lcom/squareup/wire/ProtoAdapter;", "Ll;", "value", "", "o", "(Ll;)I", "Llu/o;", "writer", "", "n", "(Llu/o;Ll;)V", "Llu/n;", "reader", "m", "(Llu/n;)Ll;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends ProtoAdapter<l> {
        a(d dVar, KClass<l> kClass, q qVar) {
            super(dVar, kClass, "type.googleapis.com/MemoryMapping", qVar, null, "tombstone.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public l d(n reader) throws IOException {
            Intrinsics.j(reader, "reader");
            long jD = reader.d();
            String strD = "";
            long jLongValue = 0;
            long jLongValue2 = 0;
            long jLongValue3 = 0;
            long jLongValue4 = 0;
            boolean zBooleanValue = false;
            boolean zBooleanValue2 = false;
            boolean zBooleanValue3 = false;
            String strD2 = "";
            while (true) {
                int iH = reader.h();
                if (iH == -1) {
                    return new l(jLongValue, jLongValue2, jLongValue3, zBooleanValue, zBooleanValue2, zBooleanValue3, strD, strD2, jLongValue4, reader.e(jD));
                }
                switch (iH) {
                    case 1:
                        jLongValue = ProtoAdapter.f126650w.d(reader).longValue();
                        break;
                    case 2:
                        jLongValue2 = ProtoAdapter.f126650w.d(reader).longValue();
                        break;
                    case 3:
                        jLongValue3 = ProtoAdapter.f126650w.d(reader).longValue();
                        break;
                    case 4:
                        zBooleanValue = ProtoAdapter.f126637j.d(reader).booleanValue();
                        break;
                    case 5:
                        zBooleanValue2 = ProtoAdapter.f126637j.d(reader).booleanValue();
                        break;
                    case 6:
                        zBooleanValue3 = ProtoAdapter.f126637j.d(reader).booleanValue();
                        break;
                    case 7:
                        strD = ProtoAdapter.f126619J.d(reader);
                        break;
                    case 8:
                        strD2 = ProtoAdapter.f126619J.d(reader);
                        break;
                    case 9:
                        jLongValue4 = ProtoAdapter.f126650w.d(reader).longValue();
                        break;
                    default:
                        reader.n(iH);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(o writer, l value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(value, "value");
            if (value.getBegin_address() != 0) {
                ProtoAdapter.f126650w.f(writer, 1, Long.valueOf(value.getBegin_address()));
            }
            if (value.getEnd_address() != 0) {
                ProtoAdapter.f126650w.f(writer, 2, Long.valueOf(value.getEnd_address()));
            }
            if (value.getOffset() != 0) {
                ProtoAdapter.f126650w.f(writer, 3, Long.valueOf(value.getOffset()));
            }
            if (value.getRead()) {
                ProtoAdapter.f126637j.f(writer, 4, Boolean.valueOf(value.getRead()));
            }
            if (value.getWrite()) {
                ProtoAdapter.f126637j.f(writer, 5, Boolean.valueOf(value.getWrite()));
            }
            if (value.getExecute()) {
                ProtoAdapter.f126637j.f(writer, 6, Boolean.valueOf(value.getExecute()));
            }
            if (!Intrinsics.e(value.getMapping_name(), "")) {
                ProtoAdapter.f126619J.f(writer, 7, value.getMapping_name());
            }
            if (!Intrinsics.e(value.getBuild_id(), "")) {
                ProtoAdapter.f126619J.f(writer, 8, value.getBuild_id());
            }
            if (value.getLoad_bias() != 0) {
                ProtoAdapter.f126650w.f(writer, 9, Long.valueOf(value.getLoad_bias()));
            }
            writer.a(value.a());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int g(l value) {
            Intrinsics.j(value, "value");
            int iV = value.a().V();
            if (value.getBegin_address() != 0) {
                iV += ProtoAdapter.f126650w.h(1, Long.valueOf(value.getBegin_address()));
            }
            if (value.getEnd_address() != 0) {
                iV += ProtoAdapter.f126650w.h(2, Long.valueOf(value.getEnd_address()));
            }
            if (value.getOffset() != 0) {
                iV += ProtoAdapter.f126650w.h(3, Long.valueOf(value.getOffset()));
            }
            if (value.getRead()) {
                iV += ProtoAdapter.f126637j.h(4, Boolean.valueOf(value.getRead()));
            }
            if (value.getWrite()) {
                iV += ProtoAdapter.f126637j.h(5, Boolean.valueOf(value.getWrite()));
            }
            if (value.getExecute()) {
                iV += ProtoAdapter.f126637j.h(6, Boolean.valueOf(value.getExecute()));
            }
            if (!Intrinsics.e(value.getMapping_name(), "")) {
                iV += ProtoAdapter.f126619J.h(7, value.getMapping_name());
            }
            if (!Intrinsics.e(value.getBuild_id(), "")) {
                iV += ProtoAdapter.f126619J.h(8, value.getBuild_id());
            }
            return value.getLoad_bias() != 0 ? iV + ProtoAdapter.f126650w.h(9, Long.valueOf(value.getLoad_bias())) : iV;
        }
    }

    public l() {
        this(0L, 0L, 0L, false, false, false, null, null, 0L, null, 1023, null);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof l)) {
            return false;
        }
        l lVar = (l) other;
        return Intrinsics.e(a(), lVar.a()) && this.begin_address == lVar.begin_address && this.end_address == lVar.end_address && this.offset == lVar.offset && this.read == lVar.read && this.write == lVar.write && this.execute == lVar.execute && Intrinsics.e(this.mapping_name, lVar.mapping_name) && Intrinsics.e(this.build_id, lVar.build_id) && this.load_bias == lVar.load_bias;
    }

    public /* synthetic */ l(long j10, long j11, long j12, boolean z10, boolean z11, boolean z12, String str, String str2, long j13, C15331h c15331h, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0L : j11, (i10 & 4) != 0 ? 0L : j12, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? false : z11, (i10 & 32) == 0 ? z12 : false, (i10 & 64) != 0 ? "" : str, (i10 & 128) == 0 ? str2 : "", (i10 & 256) == 0 ? j13 : 0L, (i10 & 512) != 0 ? C15331h.f148095e : c15331h);
    }

    /* renamed from: b, reason: from getter */
    public final long getBegin_address() {
        return this.begin_address;
    }

    /* renamed from: c, reason: from getter */
    public final String getBuild_id() {
        return this.build_id;
    }

    /* renamed from: d, reason: from getter */
    public final long getEnd_address() {
        return this.end_address;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getExecute() {
        return this.execute;
    }

    /* renamed from: f, reason: from getter */
    public final long getLoad_bias() {
        return this.load_bias;
    }

    /* renamed from: g, reason: from getter */
    public final String getMapping_name() {
        return this.mapping_name;
    }

    /* renamed from: h, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = (((((((((((((((((a().hashCode() * 37) + Long.hashCode(this.begin_address)) * 37) + Long.hashCode(this.end_address)) * 37) + Long.hashCode(this.offset)) * 37) + Boolean.hashCode(this.read)) * 37) + Boolean.hashCode(this.write)) * 37) + Boolean.hashCode(this.execute)) * 37) + this.mapping_name.hashCode()) * 37) + this.build_id.hashCode()) * 37) + Long.hashCode(this.load_bias);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    /* renamed from: i, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("begin_address=" + this.begin_address);
        arrayList.add("end_address=" + this.end_address);
        arrayList.add("offset=" + this.offset);
        arrayList.add("read=" + this.read);
        arrayList.add("write=" + this.write);
        arrayList.add("execute=" + this.execute);
        arrayList.add("mapping_name=" + C15710b.c(this.mapping_name));
        arrayList.add("build_id=" + C15710b.c(this.build_id));
        arrayList.add("load_bias=" + this.load_bias);
        return CollectionsKt.B0(arrayList, ", ", "MemoryMapping{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(long j10, long j11, long j12, boolean z10, boolean z11, boolean z12, String mapping_name, String build_id, long j13, C15331h unknownFields) {
        super(f148140o, unknownFields);
        Intrinsics.j(mapping_name, "mapping_name");
        Intrinsics.j(build_id, "build_id");
        Intrinsics.j(unknownFields, "unknownFields");
        this.begin_address = j10;
        this.end_address = j11;
        this.offset = j12;
        this.read = z10;
        this.write = z11;
        this.execute = z12;
        this.mapping_name = mapping_name;
        this.build_id = build_id;
        this.load_bias = j13;
    }
}
