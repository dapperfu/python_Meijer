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

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0000\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"Le;", "Llu/k;", "", "Lkw/h;", "name", "data_", "unknownFields", "<init>", "(Lkw/h;Lkw/h;Lkw/h;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lkw/h;", "c", "()Lkw/h;", "f", "b", "g", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class e extends k {

    /* renamed from: h, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<e> f127637h = new a(d.f149408e, Reflection.b(e.class), q.f149440d);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final C15331h name;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final C15331h data_;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"e$a", "Lcom/squareup/wire/ProtoAdapter;", "Le;", "value", "", "o", "(Le;)I", "Llu/o;", "writer", "", "n", "(Llu/o;Le;)V", "Llu/n;", "reader", "m", "(Llu/n;)Le;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends ProtoAdapter<e> {
        a(d dVar, KClass<e> kClass, q qVar) {
            super(dVar, kClass, "type.googleapis.com/CrashDetail", qVar, null, "tombstone.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public e d(n reader) throws IOException {
            Intrinsics.j(reader, "reader");
            C15331h c15331hD = C15331h.f148095e;
            long jD = reader.d();
            C15331h c15331hD2 = c15331hD;
            while (true) {
                int iH = reader.h();
                if (iH == -1) {
                    return new e(c15331hD, c15331hD2, reader.e(jD));
                }
                if (iH == 1) {
                    c15331hD = ProtoAdapter.f126618I.d(reader);
                } else if (iH != 2) {
                    reader.n(iH);
                } else {
                    c15331hD2 = ProtoAdapter.f126618I.d(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(o writer, e value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(value, "value");
            C15331h name = value.getName();
            C15331h c15331h = C15331h.f148095e;
            if (!Intrinsics.e(name, c15331h)) {
                ProtoAdapter.f126618I.f(writer, 1, value.getName());
            }
            if (!Intrinsics.e(value.getData_(), c15331h)) {
                ProtoAdapter.f126618I.f(writer, 2, value.getData_());
            }
            writer.a(value.a());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int g(e value) {
            Intrinsics.j(value, "value");
            int iV = value.a().V();
            C15331h name = value.getName();
            C15331h c15331h = C15331h.f148095e;
            if (!Intrinsics.e(name, c15331h)) {
                iV += ProtoAdapter.f126618I.h(1, value.getName());
            }
            return !Intrinsics.e(value.getData_(), c15331h) ? iV + ProtoAdapter.f126618I.h(2, value.getData_()) : iV;
        }
    }

    public e() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof e)) {
            return false;
        }
        e eVar = (e) other;
        return Intrinsics.e(a(), eVar.a()) && Intrinsics.e(this.name, eVar.name) && Intrinsics.e(this.data_, eVar.data_);
    }

    public /* synthetic */ e(C15331h c15331h, C15331h c15331h2, C15331h c15331h3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C15331h.f148095e : c15331h, (i10 & 2) != 0 ? C15331h.f148095e : c15331h2, (i10 & 4) != 0 ? C15331h.f148095e : c15331h3);
    }

    /* renamed from: b, reason: from getter */
    public final C15331h getData_() {
        return this.data_;
    }

    /* renamed from: c, reason: from getter */
    public final C15331h getName() {
        return this.name;
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = (((a().hashCode() * 37) + this.name.hashCode()) * 37) + this.data_.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("name=" + this.name);
        arrayList.add("data_=" + this.data_);
        return CollectionsKt.B0(arrayList, ", ", "CrashDetail{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C15331h name, C15331h data_, C15331h unknownFields) {
        super(f127637h, unknownFields);
        Intrinsics.j(name, "name");
        Intrinsics.j(data_, "data_");
        Intrinsics.j(unknownFields, "unknownFields");
        this.name = name;
        this.data_ = data_;
    }
}
