package defpackage;

import com.medallia.digital.mobilesdk.l3;
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
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BM\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001b\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0000\u0010\u0019\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u0017¨\u0006#"}, d2 = {"Li;", "Lhu/k;", "", "", "timestamp", "", "pid", "tid", "priority", "tag", "message", "Lgw/h;", "unknownFields", "<init>", "(Ljava/lang/String;IIILjava/lang/String;Ljava/lang/String;Lgw/h;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "e", "Ljava/lang/String;", "g", "f", "I", "c", "h", "d", "j", "b", "k", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends k {

    /* renamed from: l, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<i> f136254l = new a(d.f136160e, Reflection.b(i.class), q.f136192d);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String timestamp;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int pid;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int tid;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int priority;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String tag;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String message;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"i$a", "Lcom/squareup/wire/ProtoAdapter;", "Li;", "value", "", "o", "(Li;)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;Li;)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Li;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends ProtoAdapter<i> {
        a(d dVar, KClass<i> kClass, q qVar) {
            super(dVar, kClass, "type.googleapis.com/LogMessage", qVar, null, "tombstone.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public i c(n reader) throws IOException {
            Intrinsics.j(reader, "reader");
            long jD = reader.d();
            String strC = "";
            String strC2 = "";
            int iIntValue = 0;
            int iIntValue2 = 0;
            int iIntValue3 = 0;
            String strC3 = strC2;
            while (true) {
                int iH = reader.h();
                if (iH == -1) {
                    return new i(strC, iIntValue, iIntValue2, iIntValue3, strC3, strC2, reader.e(jD));
                }
                switch (iH) {
                    case 1:
                        strC = ProtoAdapter.f127431J.c(reader);
                        break;
                    case 2:
                        iIntValue = ProtoAdapter.f127452m.c(reader).intValue();
                        break;
                    case 3:
                        iIntValue2 = ProtoAdapter.f127452m.c(reader).intValue();
                        break;
                    case 4:
                        iIntValue3 = ProtoAdapter.f127452m.c(reader).intValue();
                        break;
                    case 5:
                        strC3 = ProtoAdapter.f127431J.c(reader);
                        break;
                    case 6:
                        strC2 = ProtoAdapter.f127431J.c(reader);
                        break;
                    default:
                        reader.n(iH);
                        break;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(o writer, i value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(value, "value");
            if (!Intrinsics.e(value.getTimestamp(), "")) {
                ProtoAdapter.f127431J.f(writer, 1, value.getTimestamp());
            }
            if (value.getPid() != 0) {
                ProtoAdapter.f127452m.f(writer, 2, Integer.valueOf(value.getPid()));
            }
            if (value.getTid() != 0) {
                ProtoAdapter.f127452m.f(writer, 3, Integer.valueOf(value.getTid()));
            }
            if (value.getPriority() != 0) {
                ProtoAdapter.f127452m.f(writer, 4, Integer.valueOf(value.getPriority()));
            }
            if (!Intrinsics.e(value.getTag(), "")) {
                ProtoAdapter.f127431J.f(writer, 5, value.getTag());
            }
            if (!Intrinsics.e(value.getMessage(), "")) {
                ProtoAdapter.f127431J.f(writer, 6, value.getMessage());
            }
            writer.a(value.a());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int g(i value) {
            Intrinsics.j(value, "value");
            int iV = value.a().V();
            if (!Intrinsics.e(value.getTimestamp(), "")) {
                iV += ProtoAdapter.f127431J.h(1, value.getTimestamp());
            }
            if (value.getPid() != 0) {
                iV += ProtoAdapter.f127452m.h(2, Integer.valueOf(value.getPid()));
            }
            if (value.getTid() != 0) {
                iV += ProtoAdapter.f127452m.h(3, Integer.valueOf(value.getTid()));
            }
            if (value.getPriority() != 0) {
                iV += ProtoAdapter.f127452m.h(4, Integer.valueOf(value.getPriority()));
            }
            if (!Intrinsics.e(value.getTag(), "")) {
                iV += ProtoAdapter.f127431J.h(5, value.getTag());
            }
            return !Intrinsics.e(value.getMessage(), "") ? iV + ProtoAdapter.f127431J.h(6, value.getMessage()) : iV;
        }
    }

    public i() {
        this(null, 0, 0, 0, null, null, null, l3.f93324d, null);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof i)) {
            return false;
        }
        i iVar = (i) other;
        return Intrinsics.e(a(), iVar.a()) && Intrinsics.e(this.timestamp, iVar.timestamp) && this.pid == iVar.pid && this.tid == iVar.tid && this.priority == iVar.priority && Intrinsics.e(this.tag, iVar.tag) && Intrinsics.e(this.message, iVar.message);
    }

    public /* synthetic */ i(String str, int i10, int i11, int i12, String str2, String str3, C14419h c14419h, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? 0 : i10, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? "" : str2, (i13 & 32) != 0 ? "" : str3, (i13 & 64) != 0 ? C14419h.f134558e : c14419h);
    }

    /* renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: c, reason: from getter */
    public final int getPid() {
        return this.pid;
    }

    /* renamed from: d, reason: from getter */
    public final int getPriority() {
        return this.priority;
    }

    /* renamed from: e, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* renamed from: f, reason: from getter */
    public final int getTid() {
        return this.tid;
    }

    /* renamed from: g, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = (((((((((((a().hashCode() * 37) + this.timestamp.hashCode()) * 37) + Integer.hashCode(this.pid)) * 37) + Integer.hashCode(this.tid)) * 37) + Integer.hashCode(this.priority)) * 37) + this.tag.hashCode()) * 37) + this.message.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("timestamp=" + C14850b.c(this.timestamp));
        arrayList.add("pid=" + this.pid);
        arrayList.add("tid=" + this.tid);
        arrayList.add("priority=" + this.priority);
        arrayList.add("tag=" + C14850b.c(this.tag));
        arrayList.add("message=" + C14850b.c(this.message));
        return CollectionsKt.B0(arrayList, ", ", "LogMessage{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String timestamp, int i10, int i11, int i12, String tag, String message, C14419h unknownFields) {
        super(f136254l, unknownFields);
        Intrinsics.j(timestamp, "timestamp");
        Intrinsics.j(tag, "tag");
        Intrinsics.j(message, "message");
        Intrinsics.j(unknownFields, "unknownFields");
        this.timestamp = timestamp;
        this.pid = i10;
        this.tid = i11;
        this.priority = i12;
        this.tag = tag;
        this.message = message;
    }
}
