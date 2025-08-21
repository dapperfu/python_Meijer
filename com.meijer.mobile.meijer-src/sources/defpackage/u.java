package defpackage;

import com.squareup.wire.ProtoAdapter;
import gw.C14419h;
import hu.d;
import hu.k;
import hu.n;
import hu.o;
import hu.q;
import io.constructor.data.local.PreferencesHelper;
import iu.C14850b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001-B\u0089\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001fR\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\u0012\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b#\u0010)R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b&\u0010,R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b-\u0010,R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b*\u0010,R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b\f\u0010,R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b \u0010,¨\u00062"}, d2 = {"Lu;", "Lhu/k;", "", "", PreferencesHelper.PREF_ID, "", "name", "", "Lq;", "registers", "backtrace_note", "unreadable_elf_files", "Lc;", "current_backtrace", "Lj;", "memory_dump", "", "tagged_addr_ctrl", "pac_enabled_keys", "Lgw/h;", "unknownFields", "<init>", "(ILjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;JJLgw/h;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "e", "I", "d", "f", "Ljava/lang/String;", "getName", "g", "J", "h", "()J", "i", "Ljava/util/List;", "()Ljava/util/List;", "b", "k", "l", "m", "n", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class u extends k {

    /* renamed from: o, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<u> f163481o = new a(d.f136160e, Reflection.b(u.class), q.f136192d);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int id;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long tagged_addr_ctrl;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long pac_enabled_keys;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<q> registers;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<String> backtrace_note;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final List<String> unreadable_elf_files;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final List<c> current_backtrace;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final List<j> memory_dump;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"u$a", "Lcom/squareup/wire/ProtoAdapter;", "Lu;", "value", "", "o", "(Lu;)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;Lu;)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Lu;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends ProtoAdapter<u> {
        a(d dVar, KClass<u> kClass, q qVar) {
            super(dVar, kClass, "type.googleapis.com/Thread", qVar, null, "tombstone.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public u c(n reader) throws IOException {
            Intrinsics.j(reader, "reader");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            long jD = reader.d();
            int iIntValue = 0;
            String strC = "";
            long jLongValue = 0;
            long jLongValue2 = 0;
            while (true) {
                int iH = reader.h();
                if (iH == -1) {
                    return new u(iIntValue, strC, arrayList, arrayList2, arrayList3, arrayList4, arrayList5, jLongValue, jLongValue2, reader.e(jD));
                }
                switch (iH) {
                    case 1:
                        iIntValue = ProtoAdapter.f127450k.c(reader).intValue();
                        break;
                    case 2:
                        strC = ProtoAdapter.f127431J.c(reader);
                        break;
                    case 3:
                        arrayList.add(q.f157757h.c(reader));
                        break;
                    case 4:
                        arrayList4.add(c.f60652n.c(reader));
                        break;
                    case 5:
                        arrayList5.add(j.f139127k.c(reader));
                        break;
                    case 6:
                        jLongValue = ProtoAdapter.f127460u.c(reader).longValue();
                        break;
                    case 7:
                        arrayList2.add(ProtoAdapter.f127431J.c(reader));
                        break;
                    case 8:
                        jLongValue2 = ProtoAdapter.f127460u.c(reader).longValue();
                        break;
                    case 9:
                        arrayList3.add(ProtoAdapter.f127431J.c(reader));
                        break;
                    default:
                        reader.n(iH);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(o writer, u value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(value, "value");
            if (value.getId() != 0) {
                ProtoAdapter.f127450k.f(writer, 1, Integer.valueOf(value.getId()));
            }
            if (!Intrinsics.e(value.getName(), "")) {
                ProtoAdapter.f127431J.f(writer, 2, value.getName());
            }
            q.f157757h.a().f(writer, 3, value.g());
            ProtoAdapter<String> protoAdapter = ProtoAdapter.f127431J;
            protoAdapter.a().f(writer, 7, value.b());
            protoAdapter.a().f(writer, 9, value.i());
            c.f60652n.a().f(writer, 4, value.c());
            j.f139127k.a().f(writer, 5, value.e());
            if (value.getTagged_addr_ctrl() != 0) {
                ProtoAdapter.f127460u.f(writer, 6, Long.valueOf(value.getTagged_addr_ctrl()));
            }
            if (value.getPac_enabled_keys() != 0) {
                ProtoAdapter.f127460u.f(writer, 8, Long.valueOf(value.getPac_enabled_keys()));
            }
            writer.a(value.a());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int g(u value) {
            Intrinsics.j(value, "value");
            int iV = value.a().V();
            if (value.getId() != 0) {
                iV += ProtoAdapter.f127450k.h(1, Integer.valueOf(value.getId()));
            }
            if (!Intrinsics.e(value.getName(), "")) {
                iV += ProtoAdapter.f127431J.h(2, value.getName());
            }
            int iH = iV + q.f157757h.a().h(3, value.g());
            ProtoAdapter<String> protoAdapter = ProtoAdapter.f127431J;
            int iH2 = iH + protoAdapter.a().h(7, value.b()) + protoAdapter.a().h(9, value.i()) + c.f60652n.a().h(4, value.c()) + j.f139127k.a().h(5, value.e());
            if (value.getTagged_addr_ctrl() != 0) {
                iH2 += ProtoAdapter.f127460u.h(6, Long.valueOf(value.getTagged_addr_ctrl()));
            }
            return value.getPac_enabled_keys() != 0 ? iH2 + ProtoAdapter.f127460u.h(8, Long.valueOf(value.getPac_enabled_keys())) : iH2;
        }
    }

    public u() {
        this(0, null, null, null, null, null, null, 0L, 0L, null, 1023, null);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof u)) {
            return false;
        }
        u uVar = (u) other;
        return Intrinsics.e(a(), uVar.a()) && this.id == uVar.id && Intrinsics.e(this.name, uVar.name) && Intrinsics.e(this.registers, uVar.registers) && Intrinsics.e(this.backtrace_note, uVar.backtrace_note) && Intrinsics.e(this.unreadable_elf_files, uVar.unreadable_elf_files) && Intrinsics.e(this.current_backtrace, uVar.current_backtrace) && Intrinsics.e(this.memory_dump, uVar.memory_dump) && this.tagged_addr_ctrl == uVar.tagged_addr_ctrl && this.pac_enabled_keys == uVar.pac_enabled_keys;
    }

    public /* synthetic */ u(int i10, String str, List list, List list2, List list3, List list4, List list5, long j10, long j11, C14419h c14419h, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? CollectionsKt.m() : list, (i11 & 8) != 0 ? CollectionsKt.m() : list2, (i11 & 16) != 0 ? CollectionsKt.m() : list3, (i11 & 32) != 0 ? CollectionsKt.m() : list4, (i11 & 64) != 0 ? CollectionsKt.m() : list5, (i11 & 128) != 0 ? 0L : j10, (i11 & 256) == 0 ? j11 : 0L, (i11 & 512) != 0 ? C14419h.f134558e : c14419h);
    }

    public final List<String> b() {
        return this.backtrace_note;
    }

    public final List<c> c() {
        return this.current_backtrace;
    }

    /* renamed from: d, reason: from getter */
    public final int getId() {
        return this.id;
    }

    public final List<j> e() {
        return this.memory_dump;
    }

    /* renamed from: f, reason: from getter */
    public final long getPac_enabled_keys() {
        return this.pac_enabled_keys;
    }

    public final List<q> g() {
        return this.registers;
    }

    public final String getName() {
        return this.name;
    }

    /* renamed from: h, reason: from getter */
    public final long getTagged_addr_ctrl() {
        return this.tagged_addr_ctrl;
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = (((((((((((((((((a().hashCode() * 37) + Integer.hashCode(this.id)) * 37) + this.name.hashCode()) * 37) + this.registers.hashCode()) * 37) + this.backtrace_note.hashCode()) * 37) + this.unreadable_elf_files.hashCode()) * 37) + this.current_backtrace.hashCode()) * 37) + this.memory_dump.hashCode()) * 37) + Long.hashCode(this.tagged_addr_ctrl)) * 37) + Long.hashCode(this.pac_enabled_keys);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    public final List<String> i() {
        return this.unreadable_elf_files;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + this.id);
        arrayList.add("name=" + C14850b.c(this.name));
        if (!this.registers.isEmpty()) {
            arrayList.add("registers=" + this.registers);
        }
        if (!this.backtrace_note.isEmpty()) {
            arrayList.add("backtrace_note=" + C14850b.d(this.backtrace_note));
        }
        if (!this.unreadable_elf_files.isEmpty()) {
            arrayList.add("unreadable_elf_files=" + C14850b.d(this.unreadable_elf_files));
        }
        if (!this.current_backtrace.isEmpty()) {
            arrayList.add("current_backtrace=" + this.current_backtrace);
        }
        if (!this.memory_dump.isEmpty()) {
            arrayList.add("memory_dump=" + this.memory_dump);
        }
        arrayList.add("tagged_addr_ctrl=" + this.tagged_addr_ctrl);
        arrayList.add("pac_enabled_keys=" + this.pac_enabled_keys);
        return CollectionsKt.B0(arrayList, ", ", "Thread{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(int i10, String name, List<q> registers, List<String> backtrace_note, List<String> unreadable_elf_files, List<c> current_backtrace, List<j> memory_dump, long j10, long j11, C14419h unknownFields) {
        super(f163481o, unknownFields);
        Intrinsics.j(name, "name");
        Intrinsics.j(registers, "registers");
        Intrinsics.j(backtrace_note, "backtrace_note");
        Intrinsics.j(unreadable_elf_files, "unreadable_elf_files");
        Intrinsics.j(current_backtrace, "current_backtrace");
        Intrinsics.j(memory_dump, "memory_dump");
        Intrinsics.j(unknownFields, "unknownFields");
        this.id = i10;
        this.name = name;
        this.tagged_addr_ctrl = j10;
        this.pac_enabled_keys = j11;
        this.registers = C14850b.a("registers", registers);
        this.backtrace_note = C14850b.a("backtrace_note", backtrace_note);
        this.unreadable_elf_files = C14850b.a("unreadable_elf_files", unreadable_elf_files);
        this.current_backtrace = C14850b.a("current_backtrace", current_backtrace);
        this.memory_dump = C14850b.a("memory_dump", memory_dump);
    }
}
