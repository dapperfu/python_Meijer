package defpackage;

import com.squareup.wire.ProtoAdapter;
import gw.C14419h;
import hu.d;
import hu.k;
import hu.n;
import hu.o;
import hu.q;
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

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB+\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lh;", "Lhu/k;", "", "", "name", "", "Li;", "logs", "Lgw/h;", "unknownFields", "<init>", "(Ljava/lang/String;Ljava/util/List;Lgw/h;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "e", "Ljava/lang/String;", "getName", "f", "Ljava/util/List;", "b", "()Ljava/util/List;", "g", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h extends k {

    /* renamed from: h, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<h> f134603h = new a(d.f136160e, Reflection.b(h.class), q.f136192d);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<i> logs;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"h$a", "Lcom/squareup/wire/ProtoAdapter;", "Lh;", "value", "", "o", "(Lh;)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;Lh;)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Lh;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends ProtoAdapter<h> {
        a(d dVar, KClass<h> kClass, q qVar) {
            super(dVar, kClass, "type.googleapis.com/LogBuffer", qVar, null, "tombstone.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public h c(n reader) throws IOException {
            Intrinsics.j(reader, "reader");
            ArrayList arrayList = new ArrayList();
            long jD = reader.d();
            String strC = "";
            while (true) {
                int iH = reader.h();
                if (iH == -1) {
                    return new h(strC, arrayList, reader.e(jD));
                }
                if (iH == 1) {
                    strC = ProtoAdapter.f127431J.c(reader);
                } else if (iH != 2) {
                    reader.n(iH);
                } else {
                    arrayList.add(i.f136254l.c(reader));
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(o writer, h value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(value, "value");
            if (!Intrinsics.e(value.getName(), "")) {
                ProtoAdapter.f127431J.f(writer, 1, value.getName());
            }
            i.f136254l.a().f(writer, 2, value.b());
            writer.a(value.a());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int g(h value) {
            Intrinsics.j(value, "value");
            int iV = value.a().V();
            if (!Intrinsics.e(value.getName(), "")) {
                iV += ProtoAdapter.f127431J.h(1, value.getName());
            }
            return iV + i.f136254l.a().h(2, value.b());
        }
    }

    public h() {
        this(null, null, null, 7, null);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof h)) {
            return false;
        }
        h hVar = (h) other;
        return Intrinsics.e(a(), hVar.a()) && Intrinsics.e(this.name, hVar.name) && Intrinsics.e(this.logs, hVar.logs);
    }

    public /* synthetic */ h(String str, List list, C14419h c14419h, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? CollectionsKt.m() : list, (i10 & 4) != 0 ? C14419h.f134558e : c14419h);
    }

    public final List<i> b() {
        return this.logs;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = (((a().hashCode() * 37) + this.name.hashCode()) * 37) + this.logs.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("name=" + C14850b.c(this.name));
        if (!this.logs.isEmpty()) {
            arrayList.add("logs=" + this.logs);
        }
        return CollectionsKt.B0(arrayList, ", ", "LogBuffer{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String name, List<i> logs, C14419h unknownFields) {
        super(f134603h, unknownFields);
        Intrinsics.j(name, "name");
        Intrinsics.j(logs, "logs");
        Intrinsics.j(unknownFields, "unknownFields");
        this.name = name;
        this.logs = C14850b.a("logs", logs);
    }
}
