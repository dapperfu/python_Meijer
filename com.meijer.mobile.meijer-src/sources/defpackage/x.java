package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.b;
import com.squareup.wire.ProtoAdapter;
import defpackage.x;
import gw.C14419h;
import hu.d;
import hu.k;
import hu.n;
import hu.o;
import hu.q;
import iu.C14850b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b(\u0018\u0000 S2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001FB·\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f\u0012\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f\u0012\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000f\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000f\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000f\u0012\b\b\u0002\u0010#\u001a\u00020\n\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\b\b\u0002\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020$2\b\u0010-\u001a\u0004\u0018\u00010,H\u0096\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\nH\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0006H\u0016¢\u0006\u0004\b2\u00103R\u001a\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u00104\u001a\u0004\b\u001f\u00106R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b\u0017\u00103R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u00108\u001a\u0004\b9\u00103R\u001a\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b:\u00108\u001a\u0004\b\u0000\u00103R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u00101R\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010<\u001a\u0004\b?\u00101R\u001a\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010<\u001a\u0004\b@\u00101R\u001a\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bA\u00108\u001a\u0004\b\u0012\u00103R\u001a\u0010\u0011\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010<\u001a\u0004\bC\u00101R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010D\u001a\u0004\b&\u0010ER\u001a\u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\bC\u00108\u001a\u0004\bF\u00103R\u001a\u0010#\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010<\u001a\u0004\bB\u00101R\u001a\u0010%\u001a\u00020$8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010G\u001a\u0004\b;\u0010HR\u001c\u0010'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010I\u001a\u0004\bJ\u0010KR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010L\u001a\u0004\b!\u0010MR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010L\u001a\u0004\b7\u0010MR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010L\u001a\u0004\b\u0015\u0010MR&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a0\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\b\u001a\u0010PR&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u001a0\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0000\u0010O\u001a\u0004\b:\u0010PR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010L\u001a\u0004\b\u001d\u0010MR \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010L\u001a\u0004\b>\u0010MR \u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010L\u001a\u0004\bA\u0010M¨\u0006T"}, d2 = {"Lx;", "Lhu/k;", "", "La;", "arch", "guest_arch", "", "build_fingerprint", "revision", "timestamp", "", "pid", "tid", "uid", "selinux_label", "", "command_line", "process_uptime", "Lr;", "signal_info", "abort_message", "Le;", "crash_details", "Ld;", "causes", "", "Lu;", "threads", "guest_threads", "Ll;", "memory_mappings", "Lh;", "log_buffers", "Lf;", "open_fds", "page_size", "", "has_been_16kb_mode", "Ls;", "stack_history_buffer", "Lgw/h;", "unknownFields", "<init>", "(La;La;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIILjava/lang/String;Ljava/util/List;ILr;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;IZLs;Lgw/h;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "La;", "c", "()La;", "g", "Ljava/lang/String;", "q", "i", "j", "I", "o", "k", "v", "y", "m", "n", "p", "Lr;", "()Lr;", "b", "Z", "()Z", "Ls;", "t", "()Ls;", "Ljava/util/List;", "()Ljava/util/List;", "w", "Ljava/util/Map;", "()Ljava/util/Map;", "z", "A", "B", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class x extends k {

    /* renamed from: C, reason: collision with root package name */
    @JvmField
    public static final ProtoAdapter<x> f167671C = new a(d.f136160e, Reflection.b(x.class), q.f136192d);

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final List<f> open_fds;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final defpackage.a arch;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final defpackage.a guest_arch;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String build_fingerprint;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String revision;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String timestamp;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final int pid;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final int tid;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int uid;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String selinux_label;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int process_uptime;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final r signal_info;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final String abort_message;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int page_size;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final boolean has_been_16kb_mode;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final s stack_history_buffer;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final List<String> command_line;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final List<e> crash_details;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final List<d> causes;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, u> threads;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, u> guest_threads;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final List<l> memory_mappings;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final List<h> log_buffers;

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR-\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00100\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R-\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00110\u00100\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u001a"}, d2 = {"x$a", "Lcom/squareup/wire/ProtoAdapter;", "Lx;", "value", "", "q", "(Lx;)I", "Lhu/o;", "writer", "", "p", "(Lhu/o;Lx;)V", "Lhu/n;", "reader", "o", "(Lhu/n;)Lx;", "", "Lu;", "a0", "Lkotlin/Lazy;", "s", "()Lcom/squareup/wire/ProtoAdapter;", "threadsAdapter", "b0", "r", "guest_threadsAdapter", "com.dynatrace.agent_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension
    public static final class a extends ProtoAdapter<x> {

        /* renamed from: a0, reason: collision with root package name and from kotlin metadata */
        private final Lazy threadsAdapter;

        /* renamed from: b0, reason: collision with root package name and from kotlin metadata */
        private final Lazy guest_threadsAdapter;

        a(d dVar, KClass<x> kClass, q qVar) {
            super(dVar, kClass, "type.googleapis.com/Tombstone", qVar, null, "tombstone.proto");
            this.threadsAdapter = LazyKt.b(new Function0() { // from class: v
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x.a.u();
                }
            });
            this.guest_threadsAdapter = LazyKt.b(new Function0() { // from class: w
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return x.a.t();
                }
            });
        }

        private final ProtoAdapter<Map<Integer, u>> r() {
            return (ProtoAdapter) this.guest_threadsAdapter.getValue();
        }

        private final ProtoAdapter<Map<Integer, u>> s() {
            return (ProtoAdapter) this.threadsAdapter.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ProtoAdapter t() {
            return ProtoAdapter.INSTANCE.a(ProtoAdapter.f127452m, u.f163481o);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ProtoAdapter u() {
            return ProtoAdapter.INSTANCE.a(ProtoAdapter.f127452m, u.f163481o);
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public x c(n reader) throws IOException {
            LinkedHashMap linkedHashMap;
            defpackage.a aVar;
            String str;
            Intrinsics.j(reader, "reader");
            defpackage.a aVar2 = defpackage.a.f44149d;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            long jD = reader.d();
            defpackage.a aVarC = aVar2;
            String strC = "";
            String strC2 = strC;
            String strC3 = strC2;
            String strC4 = strC3;
            int iIntValue = 0;
            int iIntValue2 = 0;
            int iIntValue3 = 0;
            int iIntValue4 = 0;
            int iIntValue5 = 0;
            boolean zBooleanValue = false;
            r rVarC = null;
            s sVarC = null;
            defpackage.a aVarC2 = aVarC;
            String strC5 = strC4;
            while (true) {
                int iH = reader.h();
                if (iH == -1) {
                    return new x(aVarC, aVarC2, strC5, strC, strC2, iIntValue, iIntValue2, iIntValue3, strC3, arrayList, iIntValue4, rVarC, strC4, arrayList2, arrayList3, linkedHashMap2, linkedHashMap3, arrayList4, arrayList5, arrayList6, iIntValue5, zBooleanValue, sVarC, reader.e(jD));
                }
                switch (iH) {
                    case 1:
                        linkedHashMap = linkedHashMap3;
                        aVar = aVarC2;
                        str = strC5;
                        try {
                            aVarC = defpackage.a.f44148c.c(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e10) {
                            reader.a(iH, d.f136158c, Long.valueOf(e10.value));
                        }
                        strC5 = str;
                        aVarC2 = aVar;
                        break;
                    case 2:
                        linkedHashMap = linkedHashMap3;
                        strC5 = ProtoAdapter.f127431J.c(reader);
                        break;
                    case 3:
                        linkedHashMap = linkedHashMap3;
                        strC = ProtoAdapter.f127431J.c(reader);
                        break;
                    case 4:
                        linkedHashMap = linkedHashMap3;
                        strC2 = ProtoAdapter.f127431J.c(reader);
                        break;
                    case 5:
                        linkedHashMap = linkedHashMap3;
                        iIntValue = ProtoAdapter.f127452m.c(reader).intValue();
                        break;
                    case 6:
                        linkedHashMap = linkedHashMap3;
                        iIntValue2 = ProtoAdapter.f127452m.c(reader).intValue();
                        break;
                    case 7:
                        linkedHashMap = linkedHashMap3;
                        iIntValue3 = ProtoAdapter.f127452m.c(reader).intValue();
                        break;
                    case 8:
                        linkedHashMap = linkedHashMap3;
                        strC3 = ProtoAdapter.f127431J.c(reader);
                        break;
                    case 9:
                        linkedHashMap = linkedHashMap3;
                        aVar = aVarC2;
                        str = strC5;
                        arrayList.add(ProtoAdapter.f127431J.c(reader));
                        strC5 = str;
                        aVarC2 = aVar;
                        break;
                    case 10:
                        linkedHashMap = linkedHashMap3;
                        rVarC = r.f159098p.c(reader);
                        break;
                    case 11:
                    case 12:
                    case 13:
                    default:
                        reader.n(iH);
                        linkedHashMap = linkedHashMap3;
                        aVar = aVarC2;
                        str = strC5;
                        strC5 = str;
                        aVarC2 = aVar;
                        break;
                    case 14:
                        linkedHashMap = linkedHashMap3;
                        strC4 = ProtoAdapter.f127431J.c(reader);
                        break;
                    case 15:
                        linkedHashMap = linkedHashMap3;
                        aVar = aVarC2;
                        str = strC5;
                        arrayList3.add(d.f127610h.c(reader));
                        strC5 = str;
                        aVarC2 = aVar;
                        break;
                    case 16:
                        linkedHashMap = linkedHashMap3;
                        aVar = aVarC2;
                        str = strC5;
                        linkedHashMap2.putAll(s().c(reader));
                        strC5 = str;
                        aVarC2 = aVar;
                        break;
                    case 17:
                        linkedHashMap = linkedHashMap3;
                        aVar = aVarC2;
                        str = strC5;
                        arrayList4.add(l.f148927o.c(reader));
                        strC5 = str;
                        aVarC2 = aVar;
                        break;
                    case 18:
                        linkedHashMap = linkedHashMap3;
                        aVar = aVarC2;
                        str = strC5;
                        arrayList5.add(h.f134603h.c(reader));
                        strC5 = str;
                        aVarC2 = aVar;
                        break;
                    case 19:
                        linkedHashMap = linkedHashMap3;
                        aVar = aVarC2;
                        str = strC5;
                        arrayList6.add(f.f130927j.c(reader));
                        strC5 = str;
                        aVarC2 = aVar;
                        break;
                    case 20:
                        linkedHashMap = linkedHashMap3;
                        iIntValue4 = ProtoAdapter.f127452m.c(reader).intValue();
                        break;
                    case 21:
                        linkedHashMap = linkedHashMap3;
                        aVar = aVarC2;
                        str = strC5;
                        arrayList2.add(e.f128973h.c(reader));
                        strC5 = str;
                        aVarC2 = aVar;
                        break;
                    case b.RECONNECTION_TIMED_OUT /* 22 */:
                        linkedHashMap = linkedHashMap3;
                        iIntValue5 = ProtoAdapter.f127452m.c(reader).intValue();
                        break;
                    case 23:
                        linkedHashMap = linkedHashMap3;
                        zBooleanValue = ProtoAdapter.f127449j.c(reader).booleanValue();
                        break;
                    case 24:
                        try {
                            aVarC2 = defpackage.a.f44148c.c(reader);
                            linkedHashMap = linkedHashMap3;
                            break;
                        } catch (ProtoAdapter.EnumConstantNotFoundException e11) {
                            linkedHashMap = linkedHashMap3;
                            aVar = aVarC2;
                            str = strC5;
                            reader.a(iH, d.f136158c, Long.valueOf(e11.value));
                            break;
                        }
                    case 25:
                        linkedHashMap3.putAll(r().c(reader));
                        linkedHashMap = linkedHashMap3;
                        aVar = aVarC2;
                        str = strC5;
                        strC5 = str;
                        aVarC2 = aVar;
                        break;
                    case 26:
                        sVarC = s.f159683h.c(reader);
                        linkedHashMap = linkedHashMap3;
                        break;
                }
                linkedHashMap3 = linkedHashMap;
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public void e(o writer, x value) throws IOException {
            Intrinsics.j(writer, "writer");
            Intrinsics.j(value, "value");
            defpackage.a arch = value.getArch();
            defpackage.a aVar = defpackage.a.f44149d;
            if (arch != aVar) {
                defpackage.a.f44148c.f(writer, 1, value.getArch());
            }
            if (value.getGuest_arch() != aVar) {
                defpackage.a.f44148c.f(writer, 24, value.getGuest_arch());
            }
            if (!Intrinsics.e(value.getBuild_fingerprint(), "")) {
                ProtoAdapter.f127431J.f(writer, 2, value.getBuild_fingerprint());
            }
            if (!Intrinsics.e(value.getRevision(), "")) {
                ProtoAdapter.f127431J.f(writer, 3, value.getRevision());
            }
            if (!Intrinsics.e(value.getTimestamp(), "")) {
                ProtoAdapter.f127431J.f(writer, 4, value.getTimestamp());
            }
            if (value.getPid() != 0) {
                ProtoAdapter.f127452m.f(writer, 5, Integer.valueOf(value.getPid()));
            }
            if (value.getTid() != 0) {
                ProtoAdapter.f127452m.f(writer, 6, Integer.valueOf(value.getTid()));
            }
            if (value.getUid() != 0) {
                ProtoAdapter.f127452m.f(writer, 7, Integer.valueOf(value.getUid()));
            }
            if (!Intrinsics.e(value.getSelinux_label(), "")) {
                ProtoAdapter.f127431J.f(writer, 8, value.getSelinux_label());
            }
            ProtoAdapter<String> protoAdapter = ProtoAdapter.f127431J;
            protoAdapter.a().f(writer, 9, value.f());
            if (value.getProcess_uptime() != 0) {
                ProtoAdapter.f127452m.f(writer, 20, Integer.valueOf(value.getProcess_uptime()));
            }
            if (value.getSignal_info() != null) {
                r.f159098p.f(writer, 10, value.getSignal_info());
            }
            if (!Intrinsics.e(value.getAbort_message(), "")) {
                protoAdapter.f(writer, 14, value.getAbort_message());
            }
            e.f128973h.a().f(writer, 21, value.g());
            d.f127610h.a().f(writer, 15, value.e());
            s().f(writer, 16, value.u());
            r().f(writer, 25, value.i());
            l.f148927o.a().f(writer, 17, value.l());
            h.f134603h.a().f(writer, 18, value.k());
            f.f130927j.a().f(writer, 19, value.m());
            if (value.getPage_size() != 0) {
                ProtoAdapter.f127452m.f(writer, 22, Integer.valueOf(value.getPage_size()));
            }
            if (value.getHas_been_16kb_mode()) {
                ProtoAdapter.f127449j.f(writer, 23, Boolean.valueOf(value.getHas_been_16kb_mode()));
            }
            if (value.getStack_history_buffer() != null) {
                s.f159683h.f(writer, 26, value.getStack_history_buffer());
            }
            writer.a(value.a());
        }

        @Override // com.squareup.wire.ProtoAdapter
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public int g(x value) {
            Intrinsics.j(value, "value");
            int iV = value.a().V();
            defpackage.a arch = value.getArch();
            defpackage.a aVar = defpackage.a.f44149d;
            if (arch != aVar) {
                iV += defpackage.a.f44148c.h(1, value.getArch());
            }
            if (value.getGuest_arch() != aVar) {
                iV += defpackage.a.f44148c.h(24, value.getGuest_arch());
            }
            if (!Intrinsics.e(value.getBuild_fingerprint(), "")) {
                iV += ProtoAdapter.f127431J.h(2, value.getBuild_fingerprint());
            }
            if (!Intrinsics.e(value.getRevision(), "")) {
                iV += ProtoAdapter.f127431J.h(3, value.getRevision());
            }
            if (!Intrinsics.e(value.getTimestamp(), "")) {
                iV += ProtoAdapter.f127431J.h(4, value.getTimestamp());
            }
            if (value.getPid() != 0) {
                iV += ProtoAdapter.f127452m.h(5, Integer.valueOf(value.getPid()));
            }
            if (value.getTid() != 0) {
                iV += ProtoAdapter.f127452m.h(6, Integer.valueOf(value.getTid()));
            }
            if (value.getUid() != 0) {
                iV += ProtoAdapter.f127452m.h(7, Integer.valueOf(value.getUid()));
            }
            if (!Intrinsics.e(value.getSelinux_label(), "")) {
                iV += ProtoAdapter.f127431J.h(8, value.getSelinux_label());
            }
            ProtoAdapter<String> protoAdapter = ProtoAdapter.f127431J;
            int iH = iV + protoAdapter.a().h(9, value.f());
            if (value.getProcess_uptime() != 0) {
                iH += ProtoAdapter.f127452m.h(20, Integer.valueOf(value.getProcess_uptime()));
            }
            if (value.getSignal_info() != null) {
                iH += r.f159098p.h(10, value.getSignal_info());
            }
            if (!Intrinsics.e(value.getAbort_message(), "")) {
                iH += protoAdapter.h(14, value.getAbort_message());
            }
            int iH2 = iH + e.f128973h.a().h(21, value.g()) + d.f127610h.a().h(15, value.e()) + s().h(16, value.u()) + r().h(25, value.i()) + l.f148927o.a().h(17, value.l()) + h.f134603h.a().h(18, value.k()) + f.f130927j.a().h(19, value.m());
            if (value.getPage_size() != 0) {
                iH2 += ProtoAdapter.f127452m.h(22, Integer.valueOf(value.getPage_size()));
            }
            if (value.getHas_been_16kb_mode()) {
                iH2 += ProtoAdapter.f127449j.h(23, Boolean.valueOf(value.getHas_been_16kb_mode()));
            }
            return value.getStack_history_buffer() != null ? iH2 + s.f159683h.h(26, value.getStack_history_buffer()) : iH2;
        }
    }

    public x() {
        this(null, null, null, null, null, 0, 0, 0, null, null, 0, null, null, null, null, null, null, null, null, null, 0, false, null, null, 16777215, null);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof x)) {
            return false;
        }
        x xVar = (x) other;
        return Intrinsics.e(a(), xVar.a()) && this.arch == xVar.arch && this.guest_arch == xVar.guest_arch && Intrinsics.e(this.build_fingerprint, xVar.build_fingerprint) && Intrinsics.e(this.revision, xVar.revision) && Intrinsics.e(this.timestamp, xVar.timestamp) && this.pid == xVar.pid && this.tid == xVar.tid && this.uid == xVar.uid && Intrinsics.e(this.selinux_label, xVar.selinux_label) && Intrinsics.e(this.command_line, xVar.command_line) && this.process_uptime == xVar.process_uptime && Intrinsics.e(this.signal_info, xVar.signal_info) && Intrinsics.e(this.abort_message, xVar.abort_message) && Intrinsics.e(this.crash_details, xVar.crash_details) && Intrinsics.e(this.causes, xVar.causes) && Intrinsics.e(this.threads, xVar.threads) && Intrinsics.e(this.guest_threads, xVar.guest_threads) && Intrinsics.e(this.memory_mappings, xVar.memory_mappings) && Intrinsics.e(this.log_buffers, xVar.log_buffers) && Intrinsics.e(this.open_fds, xVar.open_fds) && this.page_size == xVar.page_size && this.has_been_16kb_mode == xVar.has_been_16kb_mode && Intrinsics.e(this.stack_history_buffer, xVar.stack_history_buffer);
    }

    public /* synthetic */ x(defpackage.a aVar, defpackage.a aVar2, String str, String str2, String str3, int i10, int i11, int i12, String str4, List list, int i13, r rVar, String str5, List list2, List list3, Map map, Map map2, List list4, List list5, List list6, int i14, boolean z10, s sVar, C14419h c14419h, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? defpackage.a.f44149d : aVar, (i15 & 2) != 0 ? defpackage.a.f44149d : aVar2, (i15 & 4) != 0 ? "" : str, (i15 & 8) != 0 ? "" : str2, (i15 & 16) != 0 ? "" : str3, (i15 & 32) != 0 ? 0 : i10, (i15 & 64) != 0 ? 0 : i11, (i15 & 128) != 0 ? 0 : i12, (i15 & 256) != 0 ? "" : str4, (i15 & 512) != 0 ? CollectionsKt.m() : list, (i15 & 1024) != 0 ? 0 : i13, (i15 & RecyclerView.m.FLAG_MOVED) != 0 ? null : rVar, (i15 & RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT) == 0 ? str5 : "", (i15 & 8192) != 0 ? CollectionsKt.m() : list2, (i15 & 16384) != 0 ? CollectionsKt.m() : list3, (i15 & 32768) != 0 ? MapsKt.k() : map, (i15 & 65536) != 0 ? MapsKt.k() : map2, (i15 & 131072) != 0 ? CollectionsKt.m() : list4, (i15 & 262144) != 0 ? CollectionsKt.m() : list5, (i15 & 524288) != 0 ? CollectionsKt.m() : list6, (i15 & 1048576) != 0 ? 0 : i14, (i15 & 2097152) != 0 ? false : z10, (i15 & 4194304) != 0 ? null : sVar, (i15 & 8388608) != 0 ? C14419h.f134558e : c14419h);
    }

    /* renamed from: b, reason: from getter */
    public final String getAbort_message() {
        return this.abort_message;
    }

    /* renamed from: c, reason: from getter */
    public final defpackage.a getArch() {
        return this.arch;
    }

    /* renamed from: d, reason: from getter */
    public final String getBuild_fingerprint() {
        return this.build_fingerprint;
    }

    public final List<d> e() {
        return this.causes;
    }

    public final List<String> f() {
        return this.command_line;
    }

    public final List<e> g() {
        return this.crash_details;
    }

    /* renamed from: h, reason: from getter */
    public final defpackage.a getGuest_arch() {
        return this.guest_arch;
    }

    public int hashCode() {
        int i10 = this.hashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ((((((((((((((((((((((a().hashCode() * 37) + this.arch.hashCode()) * 37) + this.guest_arch.hashCode()) * 37) + this.build_fingerprint.hashCode()) * 37) + this.revision.hashCode()) * 37) + this.timestamp.hashCode()) * 37) + Integer.hashCode(this.pid)) * 37) + Integer.hashCode(this.tid)) * 37) + Integer.hashCode(this.uid)) * 37) + this.selinux_label.hashCode()) * 37) + this.command_line.hashCode()) * 37) + Integer.hashCode(this.process_uptime)) * 37;
        r rVar = this.signal_info;
        int iHashCode2 = (((((((((((((((((((((iHashCode + (rVar != null ? rVar.hashCode() : 0)) * 37) + this.abort_message.hashCode()) * 37) + this.crash_details.hashCode()) * 37) + this.causes.hashCode()) * 37) + this.threads.hashCode()) * 37) + this.guest_threads.hashCode()) * 37) + this.memory_mappings.hashCode()) * 37) + this.log_buffers.hashCode()) * 37) + this.open_fds.hashCode()) * 37) + Integer.hashCode(this.page_size)) * 37) + Boolean.hashCode(this.has_been_16kb_mode)) * 37;
        s sVar = this.stack_history_buffer;
        int iHashCode3 = iHashCode2 + (sVar != null ? sVar.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    public final Map<Integer, u> i() {
        return this.guest_threads;
    }

    /* renamed from: j, reason: from getter */
    public final boolean getHas_been_16kb_mode() {
        return this.has_been_16kb_mode;
    }

    public final List<h> k() {
        return this.log_buffers;
    }

    public final List<l> l() {
        return this.memory_mappings;
    }

    public final List<f> m() {
        return this.open_fds;
    }

    /* renamed from: n, reason: from getter */
    public final int getPage_size() {
        return this.page_size;
    }

    /* renamed from: o, reason: from getter */
    public final int getPid() {
        return this.pid;
    }

    /* renamed from: p, reason: from getter */
    public final int getProcess_uptime() {
        return this.process_uptime;
    }

    /* renamed from: q, reason: from getter */
    public final String getRevision() {
        return this.revision;
    }

    /* renamed from: r, reason: from getter */
    public final String getSelinux_label() {
        return this.selinux_label;
    }

    /* renamed from: s, reason: from getter */
    public final r getSignal_info() {
        return this.signal_info;
    }

    /* renamed from: t, reason: from getter */
    public final s getStack_history_buffer() {
        return this.stack_history_buffer;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("arch=" + this.arch);
        arrayList.add("guest_arch=" + this.guest_arch);
        arrayList.add("build_fingerprint=" + C14850b.c(this.build_fingerprint));
        arrayList.add("revision=" + C14850b.c(this.revision));
        arrayList.add("timestamp=" + C14850b.c(this.timestamp));
        arrayList.add("pid=" + this.pid);
        arrayList.add("tid=" + this.tid);
        arrayList.add("uid=" + this.uid);
        arrayList.add("selinux_label=" + C14850b.c(this.selinux_label));
        if (!this.command_line.isEmpty()) {
            arrayList.add("command_line=" + C14850b.d(this.command_line));
        }
        arrayList.add("process_uptime=" + this.process_uptime);
        if (this.signal_info != null) {
            arrayList.add("signal_info=" + this.signal_info);
        }
        arrayList.add("abort_message=" + C14850b.c(this.abort_message));
        if (!this.crash_details.isEmpty()) {
            arrayList.add("crash_details=" + this.crash_details);
        }
        if (!this.causes.isEmpty()) {
            arrayList.add("causes=" + this.causes);
        }
        if (!this.threads.isEmpty()) {
            arrayList.add("threads=" + this.threads);
        }
        if (!this.guest_threads.isEmpty()) {
            arrayList.add("guest_threads=" + this.guest_threads);
        }
        if (!this.memory_mappings.isEmpty()) {
            arrayList.add("memory_mappings=" + this.memory_mappings);
        }
        if (!this.log_buffers.isEmpty()) {
            arrayList.add("log_buffers=" + this.log_buffers);
        }
        if (!this.open_fds.isEmpty()) {
            arrayList.add("open_fds=" + this.open_fds);
        }
        arrayList.add("page_size=" + this.page_size);
        arrayList.add("has_been_16kb_mode=" + this.has_been_16kb_mode);
        if (this.stack_history_buffer != null) {
            arrayList.add("stack_history_buffer=" + this.stack_history_buffer);
        }
        return CollectionsKt.B0(arrayList, ", ", "Tombstone{", "}", 0, null, null, 56, null);
    }

    public final Map<Integer, u> u() {
        return this.threads;
    }

    /* renamed from: v, reason: from getter */
    public final int getTid() {
        return this.tid;
    }

    /* renamed from: x, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: y, reason: from getter */
    public final int getUid() {
        return this.uid;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(defpackage.a arch, defpackage.a guest_arch, String build_fingerprint, String revision, String timestamp, int i10, int i11, int i12, String selinux_label, List<String> command_line, int i13, r rVar, String abort_message, List<e> crash_details, List<d> causes, Map<Integer, u> threads, Map<Integer, u> guest_threads, List<l> memory_mappings, List<h> log_buffers, List<f> open_fds, int i14, boolean z10, s sVar, C14419h unknownFields) {
        super(f167671C, unknownFields);
        Intrinsics.j(arch, "arch");
        Intrinsics.j(guest_arch, "guest_arch");
        Intrinsics.j(build_fingerprint, "build_fingerprint");
        Intrinsics.j(revision, "revision");
        Intrinsics.j(timestamp, "timestamp");
        Intrinsics.j(selinux_label, "selinux_label");
        Intrinsics.j(command_line, "command_line");
        Intrinsics.j(abort_message, "abort_message");
        Intrinsics.j(crash_details, "crash_details");
        Intrinsics.j(causes, "causes");
        Intrinsics.j(threads, "threads");
        Intrinsics.j(guest_threads, "guest_threads");
        Intrinsics.j(memory_mappings, "memory_mappings");
        Intrinsics.j(log_buffers, "log_buffers");
        Intrinsics.j(open_fds, "open_fds");
        Intrinsics.j(unknownFields, "unknownFields");
        this.arch = arch;
        this.guest_arch = guest_arch;
        this.build_fingerprint = build_fingerprint;
        this.revision = revision;
        this.timestamp = timestamp;
        this.pid = i10;
        this.tid = i11;
        this.uid = i12;
        this.selinux_label = selinux_label;
        this.process_uptime = i13;
        this.signal_info = rVar;
        this.abort_message = abort_message;
        this.page_size = i14;
        this.has_been_16kb_mode = z10;
        this.stack_history_buffer = sVar;
        this.command_line = C14850b.a("command_line", command_line);
        this.crash_details = C14850b.a("crash_details", crash_details);
        this.causes = C14850b.a("causes", causes);
        this.threads = C14850b.b("threads", threads);
        this.guest_threads = C14850b.b("guest_threads", guest_threads);
        this.memory_mappings = C14850b.a("memory_mappings", memory_mappings);
        this.log_buffers = C14850b.a("log_buffers", log_buffers);
        this.open_fds = C14850b.a("open_fds", open_fds);
    }
}
