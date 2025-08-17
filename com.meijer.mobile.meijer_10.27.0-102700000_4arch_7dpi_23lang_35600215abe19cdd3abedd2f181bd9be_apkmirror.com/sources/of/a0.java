package of;

import Td.AbstractC5232j;
import Td.C5235m;
import Td.InterfaceC5225c;
import W4.C5407i;
import android.app.ApplicationExitInfo;
import android.content.Context;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import qf.EventMetadata;
import rf.AbstractC16777F;
import vf.C17563b;
import xf.InterfaceC18044d;

/* loaded from: classes7.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    private final B f153482a;

    /* renamed from: b, reason: collision with root package name */
    private final uf.e f153483b;

    /* renamed from: c, reason: collision with root package name */
    private final C17563b f153484c;

    /* renamed from: d, reason: collision with root package name */
    private final qf.f f153485d;

    /* renamed from: e, reason: collision with root package name */
    private final qf.p f153486e;

    /* renamed from: f, reason: collision with root package name */
    private final K f153487f;

    /* renamed from: g, reason: collision with root package name */
    private final pf.i f153488g;

    private static AbstractC16777F.a h(ApplicationExitInfo applicationExitInfo) throws IOException {
        String strI = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strI = i(traceInputStream);
            }
        } catch (IOException e10) {
            lf.g.f().k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e10);
        }
        return AbstractC16777F.a.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(strI).a();
    }

    public AbstractC5232j<Void> y(Executor executor) {
        return z(executor, null);
    }

    private AbstractC16777F.e.d d(AbstractC16777F.e.d dVar, qf.f fVar, qf.p pVar) {
        return e(dVar, fVar, pVar, Collections.EMPTY_MAP);
    }

    private AbstractC16777F.e.d f(AbstractC16777F.e.d dVar, Map<String, String> map) {
        return g(e(dVar, this.f153485d, this.f153486e, map), this.f153486e);
    }

    public static String i(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i10 = bufferedInputStream.read(bArr);
                    if (i10 == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                }
            } finally {
            }
        } catch (Throwable th2) {
            try {
                bufferedInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static a0 j(Context context, K k10, uf.g gVar, C16033a c16033a, qf.f fVar, qf.p pVar, InterfaceC18044d interfaceC18044d, wf.j jVar, P p10, C16045m c16045m, pf.i iVar) {
        return new a0(new B(context, k10, c16033a, interfaceC18044d, jVar), new uf.e(gVar, jVar, c16045m), C17563b.b(context, jVar, p10), fVar, pVar, k10, iVar);
    }

    private ApplicationExitInfo n(String str, List<ApplicationExitInfo> list) {
        long jQ = this.f153483b.q(str);
        Iterator<ApplicationExitInfo> it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoA = C5407i.a(it.next());
            if (applicationExitInfoA.getTimestamp() < jQ) {
                return null;
            }
            if (applicationExitInfoA.getReason() == 6) {
                return applicationExitInfoA;
            }
        }
        return null;
    }

    private static List<AbstractC16777F.c> o(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(AbstractC16777F.c.a().b(entry.getKey()).c(entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: of.Z
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((AbstractC16777F.c) obj).b().compareTo(((AbstractC16777F.c) obj2).b());
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    private void t(Throwable th2, Thread thread, String str, final EventMetadata eventMetadata, boolean z10) {
        final boolean zEquals = str.equals("crash");
        final AbstractC16777F.e.d dVarF = f(this.f153482a.d(th2, thread, str, eventMetadata.getTimestamp(), 4, 8, z10), eventMetadata.a());
        if (z10) {
            this.f153483b.w(dVarF, eventMetadata.getSessionId(), zEquals);
        } else {
            this.f153488g.diskWrite.d(new Runnable() { // from class: of.X
                @Override // java.lang.Runnable
                public final void run() {
                    a0.a(this.f153469a, dVarF, eventMetadata, zEquals);
                }
            });
        }
    }

    public void m(long j10, String str) {
        this.f153483b.k(str, j10);
    }

    public boolean p() {
        return this.f153483b.r();
    }

    public SortedSet<String> q() {
        return this.f153483b.p();
    }

    public void r(String str, long j10) {
        this.f153483b.x(this.f153482a.e(str, j10));
    }

    public void x() {
        this.f153483b.i();
    }

    public AbstractC5232j<Void> z(Executor executor, String str) {
        List<C> listU = this.f153483b.u();
        ArrayList arrayList = new ArrayList();
        for (C c10 : listU) {
            if (str == null || str.equals(c10.d())) {
                arrayList.add(this.f153484c.c(k(c10), str != null).j(executor, new InterfaceC5225c() { // from class: of.Y
                    @Override // Td.InterfaceC5225c
                    public final Object then(AbstractC5232j abstractC5232j) {
                        return Boolean.valueOf(this.f153473a.s(abstractC5232j));
                    }
                }));
            }
        }
        return C5235m.g(arrayList);
    }

    a0(B b10, uf.e eVar, C17563b c17563b, qf.f fVar, qf.p pVar, K k10, pf.i iVar) {
        this.f153482a = b10;
        this.f153483b = eVar;
        this.f153484c = c17563b;
        this.f153485d = fVar;
        this.f153486e = pVar;
        this.f153487f = k10;
        this.f153488g = iVar;
    }

    public static /* synthetic */ void a(a0 a0Var, AbstractC16777F.e.d dVar, EventMetadata eventMetadata, boolean z10) {
        a0Var.getClass();
        lf.g.f().b("disk worker: log non-fatal event to persistence");
        a0Var.f153483b.w(dVar, eventMetadata.getSessionId(), z10);
    }

    private AbstractC16777F.e.d e(AbstractC16777F.e.d dVar, qf.f fVar, qf.p pVar, Map<String, String> map) {
        AbstractC16777F.e.d.b bVarH = dVar.h();
        String strC = fVar.c();
        if (strC != null) {
            bVarH.d(AbstractC16777F.e.d.AbstractC2461d.a().b(strC).a());
        } else {
            lf.g.f().i("No log data to include with this event.");
        }
        List<AbstractC16777F.c> listO = o(pVar.g(map));
        List<AbstractC16777F.c> listO2 = o(pVar.h());
        if (!listO.isEmpty() || !listO2.isEmpty()) {
            bVarH.b(dVar.b().i().e(listO).g(listO2).a());
        }
        return bVarH.a();
    }

    private AbstractC16777F.e.d g(AbstractC16777F.e.d dVar, qf.p pVar) {
        List<AbstractC16777F.e.d.AbstractC2462e> listI = pVar.i();
        if (listI.isEmpty()) {
            return dVar;
        }
        AbstractC16777F.e.d.b bVarH = dVar.h();
        bVarH.e(AbstractC16777F.e.d.f.a().b(listI).a());
        return bVarH.a();
    }

    private C k(C c10) {
        if (c10.b().h() != null && c10.b().g() != null) {
            return c10;
        }
        FirebaseInstallationId firebaseInstallationIdD = this.f153487f.d(true);
        return C.a(c10.b().t(firebaseInstallationIdD.getFid()).s(firebaseInstallationIdD.getAuthToken()), c10.d(), c10.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean s(AbstractC5232j<C> abstractC5232j) {
        if (abstractC5232j.r()) {
            C cN = abstractC5232j.n();
            lf.g.f().b("Crashlytics report successfully enqueued to DataTransport: " + cN.d());
            File fileC = cN.c();
            if (fileC.delete()) {
                lf.g.f().b("Deleted report file: " + fileC.getPath());
                return true;
            }
            lf.g.f().k("Crashlytics could not delete report file: " + fileC.getPath());
            return true;
        }
        lf.g.f().l("Crashlytics report could not be enqueued to DataTransport", abstractC5232j.m());
        return false;
    }

    public void l(String str, List<N> list, AbstractC16777F.a aVar) {
        lf.g.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator<N> it = list.iterator();
        while (it.hasNext()) {
            AbstractC16777F.d.b bVarA = it.next().a();
            if (bVarA != null) {
                arrayList.add(bVarA);
            }
        }
        this.f153483b.l(str, AbstractC16777F.d.a().b(Collections.unmodifiableList(arrayList)).a(), aVar);
    }

    public void u(Throwable th2, Thread thread, String str, long j10) {
        lf.g.f().i("Persisting fatal event for session " + str);
        t(th2, thread, "crash", new EventMetadata(str, j10), true);
    }

    public void v(Throwable th2, Thread thread, EventMetadata eventMetadata) {
        lf.g.f().i("Persisting non-fatal event for session " + eventMetadata.getSessionId());
        t(th2, thread, "error", eventMetadata, false);
    }

    public void w(String str, List<ApplicationExitInfo> list, qf.f fVar, qf.p pVar) {
        ApplicationExitInfo applicationExitInfoN = n(str, list);
        if (applicationExitInfoN == null) {
            lf.g.f().i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        AbstractC16777F.e.d dVarC = this.f153482a.c(h(applicationExitInfoN));
        lf.g.f().b("Persisting anr for session " + str);
        this.f153483b.w(g(d(dVarC, fVar, pVar), pVar), str, true);
    }
}
