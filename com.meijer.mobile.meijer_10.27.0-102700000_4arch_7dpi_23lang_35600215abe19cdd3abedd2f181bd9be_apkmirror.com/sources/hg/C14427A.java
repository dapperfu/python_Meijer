package hg;

import android.content.Context;
import android.os.Process;
import hg.InterfaceC14450w;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u00122\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001b\u0010!\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b\u001d\u0010 R\u001a\u0010&\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010(\u001a\u00020\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b'\u0010 R\u001b\u0010+\u001a\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u001f\u001a\u0004\b)\u0010*R\u0016\u0010.\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lhg/A;", "Lhg/w;", "Landroid/content/Context;", "appContext", "Lhg/Z;", "uuidGenerator", "<init>", "(Landroid/content/Context;Lhg/Z;)V", "", "Lhg/C;", "j", "()Ljava/util/List;", "processDetails", "Lhg/v;", "processData", "", "n", "(Lhg/C;Lhg/v;)Z", "", "", "processDataMap", "e", "(Ljava/util/Map;)Z", "b", "", "d", "()V", "c", "(Ljava/util/Map;)Ljava/util/Map;", "a", "Landroid/content/Context;", "Lkotlin/Lazy;", "()Ljava/lang/String;", "myProcessName", "", "I", "k", "()I", "myPid", "m", "myUuid", "l", "()Lhg/C;", "myProcessDetails", "f", "Z", "hasGeneratedSession", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: hg.A, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C14427A implements InterfaceC14450w {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy myProcessName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int myPid;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy myUuid;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy myProcessDetails;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean hasGeneratedSession;

    @Override // hg.InterfaceC14450w
    public void d() {
        this.hasGeneratedSession = true;
    }

    public C14427A(Context appContext, final Z uuidGenerator) {
        Intrinsics.j(appContext, "appContext");
        Intrinsics.j(uuidGenerator, "uuidGenerator");
        this.appContext = appContext;
        this.myProcessName = LazyKt.b(new Function0() { // from class: hg.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C14427A.p(this.f134945a);
            }
        });
        this.myPid = Process.myPid();
        this.myUuid = LazyKt.b(new Function0() { // from class: hg.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C14427A.q(uuidGenerator);
            }
        });
        this.myProcessDetails = LazyKt.b(new Function0() { // from class: hg.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C14427A.o(this.f134947a);
            }
        });
    }

    private final List<ProcessDetails> j() {
        return D.f134735a.a(this.appContext);
    }

    private final ProcessDetails l() {
        return (ProcessDetails) this.myProcessDetails.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProcessDetails o(C14427A c14427a) {
        return D.f134735a.b(c14427a.appContext);
    }

    @Override // hg.InterfaceC14450w
    public String a() {
        return (String) this.myProcessName.getValue();
    }

    @Override // hg.InterfaceC14450w
    public boolean b(Map<String, ProcessData> processDataMap) {
        Intrinsics.j(processDataMap, "processDataMap");
        ProcessData processData = processDataMap.get(a());
        return (processData != null && processData.getPid() == getMyPid() && Intrinsics.e(processData.getUuid(), m())) ? false : true;
    }

    @Override // hg.InterfaceC14450w
    public Map<String, ProcessData> c(Map<String, ProcessData> processDataMap) {
        Map mapD;
        if (processDataMap != null && (mapD = MapsKt.D(processDataMap)) != null) {
            mapD.put(a(), new ProcessData(Process.myPid(), m()));
            Map<String, ProcessData> mapA = MapsKt.A(mapD);
            if (mapA != null) {
                return mapA;
            }
        }
        return MapsKt.g(TuplesKt.a(a(), new ProcessData(Process.myPid(), m())));
    }

    @Override // hg.InterfaceC14450w
    public boolean e(Map<String, ProcessData> processDataMap) {
        Intrinsics.j(processDataMap, "processDataMap");
        if (this.hasGeneratedSession) {
            return false;
        }
        List<ProcessDetails> listJ = j();
        ArrayList<Pair> arrayList = new ArrayList();
        for (ProcessDetails processDetails : listJ) {
            ProcessData processData = processDataMap.get(processDetails.getProcessName());
            Pair pair = processData != null ? new Pair(processDetails, processData) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        for (Pair pair2 : arrayList) {
            if (!n((ProcessDetails) pair2.a(), (ProcessData) pair2.b())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k, reason: from getter */
    public int getMyPid() {
        return this.myPid;
    }

    public String m() {
        return (String) this.myUuid.getValue();
    }

    private final boolean n(ProcessDetails processDetails, ProcessData processData) {
        if (Intrinsics.e(a(), processDetails.getProcessName())) {
            if (processDetails.getPid() != processData.getPid() || !Intrinsics.e(m(), processData.getUuid())) {
                return true;
            }
            return false;
        }
        if (processDetails.getPid() != processData.getPid()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String p(C14427A c14427a) {
        return c14427a.l().getProcessName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String q(Z z10) {
        String string = z10.next().toString();
        Intrinsics.i(string, "toString(...)");
        return string;
    }

    @Override // hg.InterfaceC14450w
    public Map<String, ProcessData> f() {
        return InterfaceC14450w.a.a(this);
    }
}
