package defpackage;

import com.squareup.wire.ProtoAdapter;
import gw.C14419h;
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

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B'\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Ld;", "Lhu/k;", "", "", "human_readable", "Lk;", "memory_error", "Lgw/h;", "unknownFields", "<init>", "(Ljava/lang/String;Lk;Lgw/h;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "e", "Ljava/lang/String;", "b", "f", "Lk;", "c", "()Lk;", "g", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class d extends k {

    /* renamed from: h, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<d> f127610h = new a(hu.d.f136160e, Reflection.b(d.class), q.f136192d);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String human_readable;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k memory_error;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"d$a", "Lcom/squareup/wire/ProtoAdapter;", "Ld;", "value", "", "o", "(Ld;)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;Ld;)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Ld;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends ProtoAdapter<d> {
        a(hu.d dVar, KClass<d> kClass, q qVar) {
            super(dVar, kClass, "type.googleapis.com/Cause", qVar, null, "tombstone.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public d c(n reader) throws IOException {
            Intrinsics.j(reader, "reader");
            long jD = reader.d();
            String strC = "";
            k kVarC = null;
            while (true) {
                int iH = reader.h();
                if (iH == -1) {
                    return new d(strC, kVarC, reader.e(jD));
                }
                if (iH == 1) {
                    strC = ProtoAdapter.f127431J.c(reader);
                } else if (iH != 2) {
                    reader.n(iH);
                } else {
                    kVarC = k.f141301i.c(reader);
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(o writer, d value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(value, "value");
            if (!Intrinsics.e(value.getHuman_readable(), "")) {
                ProtoAdapter.f127431J.f(writer, 1, value.getHuman_readable());
            }
            k.f141301i.f(writer, 2, value.getMemory_error());
            writer.a(value.a());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int g(d value) {
            Intrinsics.j(value, "value");
            int iV = value.a().V();
            if (!Intrinsics.e(value.getHuman_readable(), "")) {
                iV += ProtoAdapter.f127431J.h(1, value.getHuman_readable());
            }
            return iV + k.f141301i.h(2, value.getMemory_error());
        }
    }

    public d() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof d)) {
            return false;
        }
        d dVar = (d) other;
        return Intrinsics.e(a(), dVar.a()) && Intrinsics.e(this.human_readable, dVar.human_readable) && Intrinsics.e(this.memory_error, dVar.memory_error);
    }

    public /* synthetic */ d(String str, k kVar, C14419h c14419h, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? null : kVar, (i10 & 4) != 0 ? C14419h.f134558e : c14419h);
    }

    /* renamed from: b, reason: from getter */
    public final String getHuman_readable() {
        return this.human_readable;
    }

    /* renamed from: c, reason: from getter */
    public final k getMemory_error() {
        return this.memory_error;
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((a().hashCode() * 37) + this.human_readable.hashCode()) * 37;
        k kVar = this.memory_error;
        int iHashCode2 = iHashCode + (kVar != null ? kVar.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("human_readable=" + C14850b.c(this.human_readable));
        if (this.memory_error != null) {
            arrayList.add("memory_error=" + this.memory_error);
        }
        return CollectionsKt.B0(arrayList, ", ", "Cause{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String human_readable, k kVar, C14419h unknownFields) {
        super(f127610h, unknownFields);
        Intrinsics.j(human_readable, "human_readable");
        Intrinsics.j(unknownFields, "unknownFields");
        this.human_readable = human_readable;
        this.memory_error = kVar;
    }
}
