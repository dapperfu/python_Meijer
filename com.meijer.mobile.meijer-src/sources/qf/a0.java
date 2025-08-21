package qf;

import Vd.AbstractC5516j;
import Vd.C5519m;
import Vd.InterfaceC5509c;
import X4.C5560i;
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
import sf.EventMetadata;
import tf.AbstractC17251F;
import xf.C18175b;
import zf.InterfaceC18481d;

/* loaded from: classes8.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    private final B f158334a;

    /* renamed from: b, reason: collision with root package name */
    private final wf.e f158335b;

    /* renamed from: c, reason: collision with root package name */
    private final C18175b f158336c;

    /* renamed from: d, reason: collision with root package name */
    private final sf.f f158337d;

    /* renamed from: e, reason: collision with root package name */
    private final sf.p f158338e;

    /* renamed from: f, reason: collision with root package name */
    private final K f158339f;

    /* renamed from: g, reason: collision with root package name */
    private final rf.i f158340g;

    private static AbstractC17251F.a h(ApplicationExitInfo applicationExitInfo) throws IOException {
        String strI = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strI = i(traceInputStream);
            }
        } catch (IOException e10) {
            nf.g.f().k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e10);
        }
        return AbstractC17251F.a.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(strI).a();
    }

    public AbstractC5516j<Void> y(Executor executor) {
        return z(executor, null);
    }

    private AbstractC17251F.e.d d(AbstractC17251F.e.d dVar, sf.f fVar, sf.p pVar) {
        return e(dVar, fVar, pVar, Collections.EMPTY_MAP);
    }

    private AbstractC17251F.e.d f(AbstractC17251F.e.d dVar, Map<String, String> map) {
        return g(e(dVar, this.f158337d, this.f158338e, map), this.f158338e);
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

    public static a0 j(Context context, K k10, wf.g gVar, C16641a c16641a, sf.f fVar, sf.p pVar, InterfaceC18481d interfaceC18481d, yf.j jVar, P p10, C16653m c16653m, rf.i iVar) {
        return new a0(new B(context, k10, c16641a, interfaceC18481d, jVar), new wf.e(gVar, jVar, c16653m), C18175b.b(context, jVar, p10), fVar, pVar, k10, iVar);
    }

    private ApplicationExitInfo n(String str, List<ApplicationExitInfo> list) {
        long jQ = this.f158335b.q(str);
        Iterator<ApplicationExitInfo> it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoA = C5560i.a(it.next());
            if (applicationExitInfoA.getTimestamp() < jQ) {
                return null;
            }
            if (applicationExitInfoA.getReason() == 6) {
                return applicationExitInfoA;
            }
        }
        return null;
    }

    private static List<AbstractC17251F.c> o(Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(AbstractC17251F.c.a().b(entry.getKey()).c(entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: qf.Z
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((AbstractC17251F.c) obj).b().compareTo(((AbstractC17251F.c) obj2).b());
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    private void t(Throwable th2, Thread thread, String str, final EventMetadata eventMetadata, boolean z10) {
        final boolean zEquals = str.equals("crash");
        final AbstractC17251F.e.d dVarF = f(this.f158334a.d(th2, thread, str, eventMetadata.getTimestamp(), 4, 8, z10), eventMetadata.a());
        if (z10) {
            this.f158335b.w(dVarF, eventMetadata.getSessionId(), zEquals);
        } else {
            this.f158340g.diskWrite.d(new Runnable() { // from class: qf.X
                @Override // java.lang.Runnable
                public final void run() {
                    a0.a(this.f158321a, dVarF, eventMetadata, zEquals);
                }
            });
        }
    }

    public void m(long j10, String str) {
        this.f158335b.k(str, j10);
    }

    public boolean p() {
        return this.f158335b.r();
    }

    public SortedSet<String> q() {
        return this.f158335b.p();
    }

    public void r(String str, long j10) {
        this.f158335b.x(this.f158334a.e(str, j10));
    }

    public void x() {
        this.f158335b.i();
    }

    public AbstractC5516j<Void> z(Executor executor, String str) {
        List<C> listU = this.f158335b.u();
        ArrayList arrayList = new ArrayList();
        for (C c10 : listU) {
            if (str == null || str.equals(c10.d())) {
                arrayList.add(this.f158336c.c(k(c10), str != null).j(executor, new InterfaceC5509c() { // from class: qf.Y
                    @Override // Vd.InterfaceC5509c
                    public final Object then(AbstractC5516j abstractC5516j) {
                        return Boolean.valueOf(this.f158325a.s(abstractC5516j));
                    }
                }));
            }
        }
        return C5519m.g(arrayList);
    }

    a0(B b10, wf.e eVar, C18175b c18175b, sf.f fVar, sf.p pVar, K k10, rf.i iVar) {
        this.f158334a = b10;
        this.f158335b = eVar;
        this.f158336c = c18175b;
        this.f158337d = fVar;
        this.f158338e = pVar;
        this.f158339f = k10;
        this.f158340g = iVar;
    }

    public static /* synthetic */ void a(a0 a0Var, AbstractC17251F.e.d dVar, EventMetadata eventMetadata, boolean z10) {
        a0Var.getClass();
        nf.g.f().b("disk worker: log non-fatal event to persistence");
        a0Var.f158335b.w(dVar, eventMetadata.getSessionId(), z10);
    }

    private AbstractC17251F.e.d e(AbstractC17251F.e.d dVar, sf.f fVar, sf.p pVar, Map<String, String> map) {
        AbstractC17251F.e.d.b bVarH = dVar.h();
        String strC = fVar.c();
        if (strC != null) {
            bVarH.d(AbstractC17251F.e.d.AbstractC2567d.a().b(strC).a());
        } else {
            nf.g.f().i("No log data to include with this event.");
        }
        List<AbstractC17251F.c> listO = o(pVar.g(map));
        List<AbstractC17251F.c> listO2 = o(pVar.h());
        if (!listO.isEmpty() || !listO2.isEmpty()) {
            bVarH.b(dVar.b().i().e(listO).g(listO2).a());
        }
        return bVarH.a();
    }

    private AbstractC17251F.e.d g(AbstractC17251F.e.d dVar, sf.p pVar) {
        List<AbstractC17251F.e.d.AbstractC2568e> listI = pVar.i();
        if (listI.isEmpty()) {
            return dVar;
        }
        AbstractC17251F.e.d.b bVarH = dVar.h();
        bVarH.e(AbstractC17251F.e.d.f.a().b(listI).a());
        return bVarH.a();
    }

    private C k(C c10) {
        if (c10.b().h() != null && c10.b().g() != null) {
            return c10;
        }
        FirebaseInstallationId firebaseInstallationIdD = this.f158339f.d(true);
        return C.a(c10.b().t(firebaseInstallationIdD.getFid()).s(firebaseInstallationIdD.getAuthToken()), c10.d(), c10.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean s(AbstractC5516j<C> abstractC5516j) {
        if (abstractC5516j.r()) {
            C cN = abstractC5516j.n();
            nf.g.f().b("Crashlytics report successfully enqueued to DataTransport: " + cN.d());
            File fileC = cN.c();
            if (fileC.delete()) {
                nf.g.f().b("Deleted report file: " + fileC.getPath());
                return true;
            }
            nf.g.f().k("Crashlytics could not delete report file: " + fileC.getPath());
            return true;
        }
        nf.g.f().l("Crashlytics report could not be enqueued to DataTransport", abstractC5516j.m());
        return false;
    }

    public void l(String str, List<N> list, AbstractC17251F.a aVar) {
        nf.g.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator<N> it = list.iterator();
        while (it.hasNext()) {
            AbstractC17251F.d.b bVarA = it.next().a();
            if (bVarA != null) {
                arrayList.add(bVarA);
            }
        }
        this.f158335b.l(str, AbstractC17251F.d.a().b(Collections.unmodifiableList(arrayList)).a(), aVar);
    }

    public void u(Throwable th2, Thread thread, String str, long j10) {
        nf.g.f().i("Persisting fatal event for session " + str);
        t(th2, thread, "crash", new EventMetadata(str, j10), true);
    }

    public void v(Throwable th2, Thread thread, EventMetadata eventMetadata) {
        nf.g.f().i("Persisting non-fatal event for session " + eventMetadata.getSessionId());
        t(th2, thread, "error", eventMetadata, false);
    }

    public void w(String str, List<ApplicationExitInfo> list, sf.f fVar, sf.p pVar) {
        ApplicationExitInfo applicationExitInfoN = n(str, list);
        if (applicationExitInfoN == null) {
            nf.g.f().i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        AbstractC17251F.e.d dVarC = this.f158334a.c(h(applicationExitInfoN));
        nf.g.f().b("Persisting anr for session " + str);
        this.f158335b.w(g(d(dVarC, fVar, pVar), pVar), str, true);
    }
}
