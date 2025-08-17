package defpackage;

import com.google.android.libraries.places.api.model.PlaceTypes;
import com.medallia.digital.mobilesdk.l3;
import com.squareup.wire.ProtoAdapter;
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
import kw.C15331h;
import lu.d;
import lu.k;
import lu.n;
import lu.o;
import lu.q;
import mu.C15710b;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dBY\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u0000\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0000\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\b\u0010$R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b\u001b\u0010$¨\u0006'"}, d2 = {"Lg;", "Llu/k;", "", "", PlaceTypes.ADDRESS, "size", "allocation_tid", "", "Lc;", "allocation_backtrace", "deallocation_tid", "deallocation_backtrace", "Lkw/h;", "unknownFields", "<init>", "(JJJLjava/util/List;JLjava/util/List;Lkw/h;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "e", "J", "b", "()J", "f", "d", "h", "i", "Ljava/util/List;", "()Ljava/util/List;", "j", "k", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class g extends k {

    /* renamed from: l, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<g> f132422l = new a(d.f149408e, Reflection.b(g.class), q.f149440d);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long address;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long allocation_tid;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long deallocation_tid;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final List<c> allocation_backtrace;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<c> deallocation_backtrace;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"g$a", "Lcom/squareup/wire/ProtoAdapter;", "Lg;", "value", "", "o", "(Lg;)I", "Llu/o;", "writer", "", "n", "(Llu/o;Lg;)V", "Llu/n;", "reader", "m", "(Llu/n;)Lg;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends ProtoAdapter<g> {
        a(d dVar, KClass<g> kClass, q qVar) {
            super(dVar, kClass, "type.googleapis.com/HeapObject", qVar, null, "tombstone.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public g d(n reader) throws IOException {
            Intrinsics.j(reader, "reader");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            long jD = reader.d();
            long jLongValue = 0;
            long jLongValue2 = 0;
            long jLongValue3 = 0;
            long jLongValue4 = 0;
            while (true) {
                int iH = reader.h();
                if (iH == -1) {
                    return new g(jLongValue, jLongValue2, jLongValue3, arrayList, jLongValue4, arrayList2, reader.e(jD));
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
                        arrayList.add(c.f60853n.d(reader));
                        break;
                    case 5:
                        jLongValue4 = ProtoAdapter.f126650w.d(reader).longValue();
                        break;
                    case 6:
                        arrayList2.add(c.f60853n.d(reader));
                        break;
                    default:
                        reader.n(iH);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(o writer, g value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(value, "value");
            if (value.getAddress() != 0) {
                ProtoAdapter.f126650w.f(writer, 1, Long.valueOf(value.getAddress()));
            }
            if (value.getSize() != 0) {
                ProtoAdapter.f126650w.f(writer, 2, Long.valueOf(value.getSize()));
            }
            if (value.getAllocation_tid() != 0) {
                ProtoAdapter.f126650w.f(writer, 3, Long.valueOf(value.getAllocation_tid()));
            }
            ProtoAdapter<c> protoAdapter = c.f60853n;
            protoAdapter.a().f(writer, 4, value.c());
            if (value.getDeallocation_tid() != 0) {
                ProtoAdapter.f126650w.f(writer, 5, Long.valueOf(value.getDeallocation_tid()));
            }
            protoAdapter.a().f(writer, 6, value.e());
            writer.a(value.a());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int g(g value) {
            Intrinsics.j(value, "value");
            int iV = value.a().V();
            if (value.getAddress() != 0) {
                iV += ProtoAdapter.f126650w.h(1, Long.valueOf(value.getAddress()));
            }
            if (value.getSize() != 0) {
                iV += ProtoAdapter.f126650w.h(2, Long.valueOf(value.getSize()));
            }
            if (value.getAllocation_tid() != 0) {
                iV += ProtoAdapter.f126650w.h(3, Long.valueOf(value.getAllocation_tid()));
            }
            ProtoAdapter<c> protoAdapter = c.f60853n;
            int iH = iV + protoAdapter.a().h(4, value.c());
            if (value.getDeallocation_tid() != 0) {
                iH += ProtoAdapter.f126650w.h(5, Long.valueOf(value.getDeallocation_tid()));
            }
            return iH + protoAdapter.a().h(6, value.e());
        }
    }

    public g() {
        this(0L, 0L, 0L, null, 0L, null, null, l3.f92485d, null);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof g)) {
            return false;
        }
        g gVar = (g) other;
        return Intrinsics.e(a(), gVar.a()) && this.address == gVar.address && this.size == gVar.size && this.allocation_tid == gVar.allocation_tid && Intrinsics.e(this.allocation_backtrace, gVar.allocation_backtrace) && this.deallocation_tid == gVar.deallocation_tid && Intrinsics.e(this.deallocation_backtrace, gVar.deallocation_backtrace);
    }

    public /* synthetic */ g(long j10, long j11, long j12, List list, long j13, List list2, C15331h c15331h, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, (i10 & 2) != 0 ? 0L : j11, (i10 & 4) != 0 ? 0L : j12, (i10 & 8) != 0 ? CollectionsKt.m() : list, (i10 & 16) != 0 ? 0L : j13, (i10 & 32) != 0 ? CollectionsKt.m() : list2, (i10 & 64) != 0 ? C15331h.f148095e : c15331h);
    }

    /* renamed from: b, reason: from getter */
    public final long getAddress() {
        return this.address;
    }

    public final List<c> c() {
        return this.allocation_backtrace;
    }

    /* renamed from: d, reason: from getter */
    public final long getAllocation_tid() {
        return this.allocation_tid;
    }

    public final List<c> e() {
        return this.deallocation_backtrace;
    }

    /* renamed from: f, reason: from getter */
    public final long getDeallocation_tid() {
        return this.deallocation_tid;
    }

    /* renamed from: g, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = (((((((((((a().hashCode() * 37) + Long.hashCode(this.address)) * 37) + Long.hashCode(this.size)) * 37) + Long.hashCode(this.allocation_tid)) * 37) + this.allocation_backtrace.hashCode()) * 37) + Long.hashCode(this.deallocation_tid)) * 37) + this.deallocation_backtrace.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("address=" + this.address);
        arrayList.add("size=" + this.size);
        arrayList.add("allocation_tid=" + this.allocation_tid);
        if (!this.allocation_backtrace.isEmpty()) {
            arrayList.add("allocation_backtrace=" + this.allocation_backtrace);
        }
        arrayList.add("deallocation_tid=" + this.deallocation_tid);
        if (!this.deallocation_backtrace.isEmpty()) {
            arrayList.add("deallocation_backtrace=" + this.deallocation_backtrace);
        }
        return CollectionsKt.B0(arrayList, ", ", "HeapObject{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(long j10, long j11, long j12, List<c> allocation_backtrace, long j13, List<c> deallocation_backtrace, C15331h unknownFields) {
        super(f132422l, unknownFields);
        Intrinsics.j(allocation_backtrace, "allocation_backtrace");
        Intrinsics.j(deallocation_backtrace, "deallocation_backtrace");
        Intrinsics.j(unknownFields, "unknownFields");
        this.address = j10;
        this.size = j11;
        this.allocation_tid = j12;
        this.deallocation_tid = j13;
        this.allocation_backtrace = C15710b.a("allocation_backtrace", allocation_backtrace);
        this.deallocation_backtrace = C15710b.a("deallocation_backtrace", deallocation_backtrace);
    }
}
