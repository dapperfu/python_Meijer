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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0000B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0000\u0010\u0015¨\u0006\u0017"}, d2 = {"Lb;", "Llu/k;", "", "Lkw/h;", "memory_tags", "unknownFields", "<init>", "(Lkw/h;Lkw/h;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "e", "Lkw/h;", "()Lkw/h;", "f", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b extends k {

    /* renamed from: g, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<b> f59508g = new a(d.f149408e, Reflection.b(b.class), q.f149440d);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final C15331h memory_tags;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"b$a", "Lcom/squareup/wire/ProtoAdapter;", "Lb;", "value", "", "o", "(Lb;)I", "Llu/o;", "writer", "", "n", "(Llu/o;Lb;)V", "Llu/n;", "reader", "m", "(Llu/n;)Lb;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes6.dex */
    public static final class a extends ProtoAdapter<b> {
        a(d dVar, KClass<b> kClass, q qVar) {
            super(dVar, kClass, "type.googleapis.com/ArmMTEMetadata", qVar, null, "tombstone.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public b d(n reader) throws IOException {
            Intrinsics.j(reader, "reader");
            C15331h c15331hD = C15331h.f148095e;
            long jD = reader.d();
            while (true) {
                int iH = reader.h();
                if (iH == -1) {
                    return new b(c15331hD, reader.e(jD));
                }
                if (iH == 1) {
                    c15331hD = ProtoAdapter.f126618I.d(reader);
                } else {
                    reader.n(iH);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(o writer, b value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(value, "value");
            if (!Intrinsics.e(value.getMemory_tags(), C15331h.f148095e)) {
                ProtoAdapter.f126618I.f(writer, 1, value.getMemory_tags());
            }
            writer.a(value.a());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int g(b value) {
            Intrinsics.j(value, "value");
            int iV = value.a().V();
            return !Intrinsics.e(value.getMemory_tags(), C15331h.f148095e) ? iV + ProtoAdapter.f126618I.h(1, value.getMemory_tags()) : iV;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        return Intrinsics.e(a(), bVar.a()) && Intrinsics.e(this.memory_tags, bVar.memory_tags);
    }

    public /* synthetic */ b(C15331h c15331h, C15331h c15331h2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C15331h.f148095e : c15331h, (i10 & 2) != 0 ? C15331h.f148095e : c15331h2);
    }

    /* renamed from: b, reason: from getter */
    public final C15331h getMemory_tags() {
        return this.memory_tags;
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = (a().hashCode() * 37) + this.memory_tags.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("memory_tags=" + this.memory_tags);
        return CollectionsKt.B0(arrayList, ", ", "ArmMTEMetadata{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(C15331h memory_tags, C15331h unknownFields) {
        super(f59508g, unknownFields);
        Intrinsics.j(memory_tags, "memory_tags");
        Intrinsics.j(unknownFields, "unknownFields");
        this.memory_tags = memory_tags;
    }
}
