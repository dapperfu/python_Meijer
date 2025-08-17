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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\u0018\u0000 (2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'Ba\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001a\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b$\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001c\u001a\u0004\b\u0000\u0010\u001eR\u001a\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010\u001a¨\u0006)"}, d2 = {"Lc;", "Llu/k;", "", "", "rel_pc", "pc", "sp", "", "function_name", "function_offset", "file_name", "file_map_offset", "build_id", "Lkw/h;", "unknownFields", "<init>", "(JJJLjava/lang/String;JLjava/lang/String;JLjava/lang/String;Lkw/h;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "e", "J", "h", "()J", "f", "g", "i", "Ljava/lang/String;", "j", "d", "k", "l", "b", "m", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class c extends k {

    /* renamed from: n, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<c> f60853n = new a(d.f149408e, Reflection.b(c.class), q.f149440d);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long rel_pc;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long pc;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long sp;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String function_name;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long function_offset;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String file_name;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long file_map_offset;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final String build_id;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"c$a", "Lcom/squareup/wire/ProtoAdapter;", "Lc;", "value", "", "o", "(Lc;)I", "Llu/o;", "writer", "", "n", "(Llu/o;Lc;)V", "Llu/n;", "reader", "m", "(Llu/n;)Lc;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends ProtoAdapter<c> {
        a(d dVar, KClass<c> kClass, q qVar) {
            super(dVar, kClass, "type.googleapis.com/BacktraceFrame", qVar, null, "tombstone.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public c d(n reader) throws IOException {
            Intrinsics.j(reader, "reader");
            long jD = reader.d();
            String strD = "";
            long jLongValue = 0;
            long jLongValue2 = 0;
            long jLongValue3 = 0;
            long jLongValue4 = 0;
            long jLongValue5 = 0;
            String strD2 = "";
            String strD3 = strD2;
            while (true) {
                int iH = reader.h();
                if (iH == -1) {
                    return new c(jLongValue, jLongValue2, jLongValue3, strD, jLongValue4, strD2, jLongValue5, strD3, reader.e(jD));
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
                        strD = ProtoAdapter.f126619J.d(reader);
                        break;
                    case 5:
                        jLongValue4 = ProtoAdapter.f126650w.d(reader).longValue();
                        break;
                    case 6:
                        strD2 = ProtoAdapter.f126619J.d(reader);
                        break;
                    case 7:
                        jLongValue5 = ProtoAdapter.f126650w.d(reader).longValue();
                        break;
                    case 8:
                        strD3 = ProtoAdapter.f126619J.d(reader);
                        break;
                    default:
                        reader.n(iH);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(o writer, c value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(value, "value");
            if (value.getRel_pc() != 0) {
                ProtoAdapter.f126650w.f(writer, 1, Long.valueOf(value.getRel_pc()));
            }
            if (value.getPc() != 0) {
                ProtoAdapter.f126650w.f(writer, 2, Long.valueOf(value.getPc()));
            }
            if (value.getSp() != 0) {
                ProtoAdapter.f126650w.f(writer, 3, Long.valueOf(value.getSp()));
            }
            if (!Intrinsics.e(value.getFunction_name(), "")) {
                ProtoAdapter.f126619J.f(writer, 4, value.getFunction_name());
            }
            if (value.getFunction_offset() != 0) {
                ProtoAdapter.f126650w.f(writer, 5, Long.valueOf(value.getFunction_offset()));
            }
            if (!Intrinsics.e(value.getFile_name(), "")) {
                ProtoAdapter.f126619J.f(writer, 6, value.getFile_name());
            }
            if (value.getFile_map_offset() != 0) {
                ProtoAdapter.f126650w.f(writer, 7, Long.valueOf(value.getFile_map_offset()));
            }
            if (!Intrinsics.e(value.getBuild_id(), "")) {
                ProtoAdapter.f126619J.f(writer, 8, value.getBuild_id());
            }
            writer.a(value.a());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int g(c value) {
            Intrinsics.j(value, "value");
            int iV = value.a().V();
            if (value.getRel_pc() != 0) {
                iV += ProtoAdapter.f126650w.h(1, Long.valueOf(value.getRel_pc()));
            }
            if (value.getPc() != 0) {
                iV += ProtoAdapter.f126650w.h(2, Long.valueOf(value.getPc()));
            }
            if (value.getSp() != 0) {
                iV += ProtoAdapter.f126650w.h(3, Long.valueOf(value.getSp()));
            }
            if (!Intrinsics.e(value.getFunction_name(), "")) {
                iV += ProtoAdapter.f126619J.h(4, value.getFunction_name());
            }
            if (value.getFunction_offset() != 0) {
                iV += ProtoAdapter.f126650w.h(5, Long.valueOf(value.getFunction_offset()));
            }
            if (!Intrinsics.e(value.getFile_name(), "")) {
                iV += ProtoAdapter.f126619J.h(6, value.getFile_name());
            }
            if (value.getFile_map_offset() != 0) {
                iV += ProtoAdapter.f126650w.h(7, Long.valueOf(value.getFile_map_offset()));
            }
            return !Intrinsics.e(value.getBuild_id(), "") ? iV + ProtoAdapter.f126619J.h(8, value.getBuild_id()) : iV;
        }
    }

    public c() {
        this(0L, 0L, 0L, null, 0L, null, 0L, null, null, 511, null);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return Intrinsics.e(a(), cVar.a()) && this.rel_pc == cVar.rel_pc && this.pc == cVar.pc && this.sp == cVar.sp && Intrinsics.e(this.function_name, cVar.function_name) && this.function_offset == cVar.function_offset && Intrinsics.e(this.file_name, cVar.file_name) && this.file_map_offset == cVar.file_map_offset && Intrinsics.e(this.build_id, cVar.build_id);
    }

    public /* synthetic */ c(long j10, long j11, long j12, String str, long j13, String str2, long j14, String str3, C15331h c15331h, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0L : j11, (i10 & 4) != 0 ? 0L : j12, (i10 & 8) != 0 ? "" : str, (i10 & 16) != 0 ? 0L : j13, (i10 & 32) != 0 ? "" : str2, (i10 & 64) == 0 ? j14 : 0L, (i10 & 128) == 0 ? str3 : "", (i10 & 256) != 0 ? C15331h.f148095e : c15331h);
    }

    /* renamed from: b, reason: from getter */
    public final String getBuild_id() {
        return this.build_id;
    }

    /* renamed from: c, reason: from getter */
    public final long getFile_map_offset() {
        return this.file_map_offset;
    }

    /* renamed from: d, reason: from getter */
    public final String getFile_name() {
        return this.file_name;
    }

    /* renamed from: e, reason: from getter */
    public final String getFunction_name() {
        return this.function_name;
    }

    /* renamed from: f, reason: from getter */
    public final long getFunction_offset() {
        return this.function_offset;
    }

    /* renamed from: g, reason: from getter */
    public final long getPc() {
        return this.pc;
    }

    /* renamed from: h, reason: from getter */
    public final long getRel_pc() {
        return this.rel_pc;
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = (((((((((((((((a().hashCode() * 37) + Long.hashCode(this.rel_pc)) * 37) + Long.hashCode(this.pc)) * 37) + Long.hashCode(this.sp)) * 37) + this.function_name.hashCode()) * 37) + Long.hashCode(this.function_offset)) * 37) + this.file_name.hashCode()) * 37) + Long.hashCode(this.file_map_offset)) * 37) + this.build_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    /* renamed from: i, reason: from getter */
    public final long getSp() {
        return this.sp;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("rel_pc=" + this.rel_pc);
        arrayList.add("pc=" + this.pc);
        arrayList.add("sp=" + this.sp);
        arrayList.add("function_name=" + C15710b.c(this.function_name));
        arrayList.add("function_offset=" + this.function_offset);
        arrayList.add("file_name=" + C15710b.c(this.file_name));
        arrayList.add("file_map_offset=" + this.file_map_offset);
        arrayList.add("build_id=" + C15710b.c(this.build_id));
        return CollectionsKt.B0(arrayList, ", ", "BacktraceFrame{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j10, long j11, long j12, String function_name, long j13, String file_name, long j14, String build_id, C15331h unknownFields) {
        super(f60853n, unknownFields);
        Intrinsics.j(function_name, "function_name");
        Intrinsics.j(file_name, "file_name");
        Intrinsics.j(build_id, "build_id");
        Intrinsics.j(unknownFields, "unknownFields");
        this.rel_pc = j10;
        this.pc = j11;
        this.sp = j12;
        this.function_name = function_name;
        this.function_offset = j13;
        this.file_name = file_name;
        this.file_map_offset = j14;
        this.build_id = build_id;
    }
}
