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
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B9\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0000\u0010\u001a\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0017\u0010 ¨\u0006\""}, d2 = {"Lf;", "Lhu/k;", "", "", "fd", "", "path", "owner", "", "tag", "Lgw/h;", "unknownFields", "<init>", "(ILjava/lang/String;Ljava/lang/String;JLgw/h;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "e", "I", "b", "Ljava/lang/String;", "d", "g", "c", "h", "J", "()J", "i", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f extends k {

    /* renamed from: j, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<f> f130927j = new a(d.f136160e, Reflection.b(f.class), q.f136192d);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int fd;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final String path;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String owner;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long tag;

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"f$a", "Lcom/squareup/wire/ProtoAdapter;", "Lf;", "value", "", "o", "(Lf;)I", "Lhu/o;", "writer", "", "n", "(Lhu/o;Lf;)V", "Lhu/n;", "reader", "m", "(Lhu/n;)Lf;", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends ProtoAdapter<f> {
        a(d dVar, KClass<f> kClass, q qVar) {
            super(dVar, kClass, "type.googleapis.com/FD", qVar, null, "tombstone.proto");
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public f c(n reader) throws IOException {
            Intrinsics.j(reader, "reader");
            long jD = reader.d();
            String strC = "";
            long jLongValue = 0;
            int iIntValue = 0;
            String strC2 = "";
            while (true) {
                long j10 = jLongValue;
                while (true) {
                    int iH = reader.h();
                    if (iH == -1) {
                        return new f(iIntValue, strC, strC2, j10, reader.e(jD));
                    }
                    if (iH == 1) {
                        iIntValue = ProtoAdapter.f127450k.c(reader).intValue();
                    } else if (iH == 2) {
                        strC = ProtoAdapter.f127431J.c(reader);
                    } else if (iH == 3) {
                        strC2 = ProtoAdapter.f127431J.c(reader);
                    } else if (iH != 4) {
                        reader.n(iH);
                    }
                }
                jLongValue = ProtoAdapter.f127462w.c(reader).longValue();
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void e(o writer, f value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(value, "value");
            if (value.getFd() != 0) {
                ProtoAdapter.f127450k.f(writer, 1, Integer.valueOf(value.getFd()));
            }
            if (!Intrinsics.e(value.getPath(), "")) {
                ProtoAdapter.f127431J.f(writer, 2, value.getPath());
            }
            if (!Intrinsics.e(value.getOwner(), "")) {
                ProtoAdapter.f127431J.f(writer, 3, value.getOwner());
            }
            if (value.getTag() != 0) {
                ProtoAdapter.f127462w.f(writer, 4, Long.valueOf(value.getTag()));
            }
            writer.a(value.a());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public int g(f value) {
            Intrinsics.j(value, "value");
            int iV = value.a().V();
            if (value.getFd() != 0) {
                iV += ProtoAdapter.f127450k.h(1, Integer.valueOf(value.getFd()));
            }
            if (!Intrinsics.e(value.getPath(), "")) {
                iV += ProtoAdapter.f127431J.h(2, value.getPath());
            }
            if (!Intrinsics.e(value.getOwner(), "")) {
                iV += ProtoAdapter.f127431J.h(3, value.getOwner());
            }
            return value.getTag() != 0 ? iV + ProtoAdapter.f127462w.h(4, Long.valueOf(value.getTag())) : iV;
        }
    }

    public f() {
        this(0, null, null, 0L, null, 31, null);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof f)) {
            return false;
        }
        f fVar = (f) other;
        return Intrinsics.e(a(), fVar.a()) && this.fd == fVar.fd && Intrinsics.e(this.path, fVar.path) && Intrinsics.e(this.owner, fVar.owner) && this.tag == fVar.tag;
    }

    public /* synthetic */ f(int i10, String str, String str2, long j10, C14419h c14419h, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? "" : str, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? 0L : j10, (i11 & 16) != 0 ? C14419h.f134558e : c14419h);
    }

    /* renamed from: b, reason: from getter */
    public final int getFd() {
        return this.fd;
    }

    /* renamed from: c, reason: from getter */
    public final String getOwner() {
        return this.owner;
    }

    /* renamed from: d, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    /* renamed from: e, reason: from getter */
    public final long getTag() {
        return this.tag;
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = (((((((a().hashCode() * 37) + Integer.hashCode(this.fd)) * 37) + this.path.hashCode()) * 37) + this.owner.hashCode()) * 37) + Long.hashCode(this.tag);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("fd=" + this.fd);
        arrayList.add("path=" + C14850b.c(this.path));
        arrayList.add("owner=" + C14850b.c(this.owner));
        arrayList.add("tag=" + this.tag);
        return CollectionsKt.B0(arrayList, ", ", "FD{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i10, String path, String owner, long j10, C14419h unknownFields) {
        super(f130927j, unknownFields);
        Intrinsics.j(path, "path");
        Intrinsics.j(owner, "owner");
        Intrinsics.j(unknownFields, "unknownFields");
        this.fd = i10;
        this.path = path;
        this.owner = owner;
        this.tag = j10;
    }
}
