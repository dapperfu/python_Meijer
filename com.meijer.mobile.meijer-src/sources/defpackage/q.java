package defpackage;

import com.squareup.wire.ProtoAdapter;
import gw.C14419h;
import hu.d;
import hu.k;
import hu.n;
import hu.o;
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

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lq;", "Lhu/k;", "", "", "name", "", "u64", "Lgw/h;", "unknownFields", "<init>", "(Ljava/lang/String;JLgw/h;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "e", "Ljava/lang/String;", "getName", "f", "J", "b", "()J", "g", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class q extends k {

    /* renamed from: h, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<q> f157757h = new a(d.f136160e, Reflection.b(q.class), hu.q.f136192d);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long u64;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"q$a", "Lcom/squareup/wire/ProtoAdapter;", "Lq;", "value", "", "o", "(Lq;)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;Lq;)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Lq;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes14.dex */
    public static final class a extends ProtoAdapter<q> {
        a(d dVar, KClass<q> kClass, hu.q qVar) {
            super(dVar, kClass, "type.googleapis.com/Register", qVar, null, "tombstone.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public q c(n reader) throws IOException {
            Intrinsics.j(reader, "reader");
            long jD = reader.d();
            String strC = "";
            long jLongValue = 0;
            while (true) {
                int iH = reader.h();
                if (iH == -1) {
                    return new q(strC, jLongValue, reader.e(jD));
                }
                if (iH == 1) {
                    strC = ProtoAdapter.f127431J.c(reader);
                } else if (iH != 2) {
                    reader.n(iH);
                } else {
                    jLongValue = ProtoAdapter.f127462w.c(reader).longValue();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(o writer, q value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(value, "value");
            if (!Intrinsics.e(value.getName(), "")) {
                ProtoAdapter.f127431J.f(writer, 1, value.getName());
            }
            if (value.getU64() != 0) {
                ProtoAdapter.f127462w.f(writer, 2, Long.valueOf(value.getU64()));
            }
            writer.a(value.a());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int g(q value) {
            Intrinsics.j(value, "value");
            int iV = value.a().V();
            if (!Intrinsics.e(value.getName(), "")) {
                iV += ProtoAdapter.f127431J.h(1, value.getName());
            }
            return value.getU64() != 0 ? iV + ProtoAdapter.f127462w.h(2, Long.valueOf(value.getU64())) : iV;
        }
    }

    public q() {
        this(null, 0L, null, 7, null);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof q)) {
            return false;
        }
        q qVar = (q) other;
        return Intrinsics.e(a(), qVar.a()) && Intrinsics.e(this.name, qVar.name) && this.u64 == qVar.u64;
    }

    public /* synthetic */ q(String str, long j10, C14419h c14419h, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0L : j10, (i10 & 4) != 0 ? C14419h.f134558e : c14419h);
    }

    /* renamed from: b, reason: from getter */
    public final long getU64() {
        return this.u64;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = (((a().hashCode() * 37) + this.name.hashCode()) * 37) + Long.hashCode(this.u64);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("name=" + C14850b.c(this.name));
        arrayList.add("u64=" + this.u64);
        return CollectionsKt.B0(arrayList, ", ", "Register{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String name, long j10, C14419h unknownFields) {
        super(f157757h, unknownFields);
        Intrinsics.j(name, "name");
        Intrinsics.j(unknownFields, "unknownFields");
        this.name = name;
        this.u64 = j10;
    }
}
