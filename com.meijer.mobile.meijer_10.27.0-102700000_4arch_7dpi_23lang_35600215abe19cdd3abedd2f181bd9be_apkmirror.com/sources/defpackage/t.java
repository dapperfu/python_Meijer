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

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u0000  2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B1\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0003\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u001d¨\u0006!"}, d2 = {"Lt;", "Llu/k;", "", "Lc;", "addr", "", "fp", "tag", "Lkw/h;", "unknownFields", "<init>", "(Lc;JJLkw/h;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "e", "Lc;", "b", "()Lc;", "f", "J", "()J", "g", "d", "h", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class t extends k {

    /* renamed from: i, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<t> f161351i = new a(d.f149408e, Reflection.b(t.class), q.f149440d);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c addr;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long fp;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long tag;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"t$a", "Lcom/squareup/wire/ProtoAdapter;", "Lt;", "value", "", "o", "(Lt;)I", "Llu/o;", "writer", "", "n", "(Llu/o;Lt;)V", "Llu/n;", "reader", "m", "(Llu/n;)Lt;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends ProtoAdapter<t> {
        a(d dVar, KClass<t> kClass, q qVar) {
            super(dVar, kClass, "type.googleapis.com/StackHistoryBufferEntry", qVar, null, "tombstone.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public t d(n reader) throws IOException {
            Intrinsics.j(reader, "reader");
            long jD = reader.d();
            c cVarD = null;
            long jLongValue = 0;
            long jLongValue2 = 0;
            while (true) {
                int iH = reader.h();
                if (iH == -1) {
                    return new t(cVarD, jLongValue, jLongValue2, reader.e(jD));
                }
                if (iH == 1) {
                    cVarD = c.f60853n.d(reader);
                } else if (iH == 2) {
                    jLongValue = ProtoAdapter.f126650w.d(reader).longValue();
                } else if (iH != 3) {
                    reader.n(iH);
                } else {
                    jLongValue2 = ProtoAdapter.f126650w.d(reader).longValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(o writer, t value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(value, "value");
            if (value.getAddr() != null) {
                c.f60853n.f(writer, 1, value.getAddr());
            }
            if (value.getFp() != 0) {
                ProtoAdapter.f126650w.f(writer, 2, Long.valueOf(value.getFp()));
            }
            if (value.getTag() != 0) {
                ProtoAdapter.f126650w.f(writer, 3, Long.valueOf(value.getTag()));
            }
            writer.a(value.a());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int g(t value) {
            Intrinsics.j(value, "value");
            int iV = value.a().V();
            if (value.getAddr() != null) {
                iV += c.f60853n.h(1, value.getAddr());
            }
            if (value.getFp() != 0) {
                iV += ProtoAdapter.f126650w.h(2, Long.valueOf(value.getFp()));
            }
            return value.getTag() != 0 ? iV + ProtoAdapter.f126650w.h(3, Long.valueOf(value.getTag())) : iV;
        }
    }

    public t() {
        this(null, 0L, 0L, null, 15, null);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof t)) {
            return false;
        }
        t tVar = (t) other;
        return Intrinsics.e(a(), tVar.a()) && Intrinsics.e(this.addr, tVar.addr) && this.fp == tVar.fp && this.tag == tVar.tag;
    }

    public /* synthetic */ t(c cVar, long j10, long j11, C15331h c15331h, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : cVar, (i10 & 2) != 0 ? 0L : j10, (i10 & 4) != 0 ? 0L : j11, (i10 & 8) != 0 ? C15331h.f148095e : c15331h);
    }

    /* renamed from: b, reason: from getter */
    public final c getAddr() {
        return this.addr;
    }

    /* renamed from: c, reason: from getter */
    public final long getFp() {
        return this.fp;
    }

    /* renamed from: d, reason: from getter */
    public final long getTag() {
        return this.tag;
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = a().hashCode() * 37;
        c cVar = this.addr;
        int iHashCode2 = ((((iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 37) + Long.hashCode(this.fp)) * 37) + Long.hashCode(this.tag);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.addr != null) {
            arrayList.add("addr=" + this.addr);
        }
        arrayList.add("fp=" + this.fp);
        arrayList.add("tag=" + this.tag);
        return CollectionsKt.B0(arrayList, ", ", "StackHistoryBufferEntry{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(c cVar, long j10, long j11, C15331h unknownFields) {
        super(f161351i, unknownFields);
        Intrinsics.j(unknownFields, "unknownFields");
        this.addr = cVar;
        this.fp = j10;
        this.tag = j11;
    }
}
