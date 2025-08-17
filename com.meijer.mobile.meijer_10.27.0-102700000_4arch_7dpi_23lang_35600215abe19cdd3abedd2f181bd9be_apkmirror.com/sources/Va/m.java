package Va;

import android.location.Location;
import android.os.Handler;
import android.os.Message;
import cb.C6380a;
import cb.C6381b;
import fb.C13865b;
import fb.C13869f;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import nt.C15944b;
import ut.C17315a;
import ut.InterfaceC17316b;
import ut.InterfaceC17317c;
import yb.C18200b;

/* loaded from: classes4.dex */
public class m {

    /* renamed from: f, reason: collision with root package name */
    private static final C6380a f37045f = C6381b.a(m.class.getName());

    /* renamed from: g, reason: collision with root package name */
    private static m f37046g;

    /* renamed from: a, reason: collision with root package name */
    private C13869f f37047a;

    /* renamed from: b, reason: collision with root package name */
    private Ab.b f37048b;

    /* renamed from: c, reason: collision with root package name */
    private Db.d f37049c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC17317c f37050d;

    /* renamed from: e, reason: collision with root package name */
    private Map<l, a> f37051e = new WeakHashMap();

    private class a extends Handler implements Ab.d, InterfaceC17316b {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<l> f37052a;

        public a(l lVar, InterfaceC17317c interfaceC17317c) {
            this.f37052a = new WeakReference<>(lVar);
            interfaceC17317c.e(this);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (this.f37052a.get() != null) {
                int i10 = message.what;
                if (i10 == 0) {
                    Ab.a aVar = (Ab.a) message.obj;
                    l lVar = this.f37052a.get();
                    if (lVar != null) {
                        k kVarA = C18200b.a(aVar.g());
                        lVar.onVisitStart(yb.c.a(kVarA, aVar));
                        C6380a unused = m.f37045f;
                        kVarA.b();
                        aVar.i();
                        return;
                    }
                    return;
                }
                if (i10 == 4) {
                    Ab.a aVar2 = (Ab.a) message.obj;
                    l lVar2 = this.f37052a.get();
                    if (lVar2 != null) {
                        k kVarA2 = C18200b.a(aVar2.g());
                        n nVarA = yb.c.a(kVarA2, aVar2);
                        lVar2.onVisitStartWithDelay(nVarA, aVar2.g().g() > 0 ? (int) (nVarA.b() / 1000) : 0);
                        C6380a unused2 = m.f37045f;
                        kVarA2.b();
                        aVar2.i();
                        return;
                    }
                    return;
                }
                if (i10 == 1) {
                    Ab.a aVar3 = (Ab.a) message.obj;
                    l lVar3 = this.f37052a.get();
                    if (lVar3 != null) {
                        Db.b bVarG = aVar3.g();
                        k kVarA3 = C18200b.a(bVarG);
                        lVar3.onVisitEnd(yb.c.a(kVarA3, aVar3));
                        C6380a unused3 = m.f37045f;
                        kVarA3.b();
                        bVarG.k();
                        aVar3.i();
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    Ab.c cVar = (Ab.c) message.obj;
                    l lVar4 = this.f37052a.get();
                    if (lVar4 != null) {
                        Iterator<Db.b> it = cVar.f178a;
                        ArrayList arrayList = new ArrayList();
                        while (it.hasNext()) {
                            Db.b next = it.next();
                            arrayList.add(yb.c.b(C18200b.a(next), next));
                        }
                        lVar4.onBeaconSighting(cVar.f179b, arrayList);
                        C6380a unused4 = m.f37045f;
                        cVar.f179b.a().a();
                        return;
                    }
                    return;
                }
                if (i10 != 3) {
                    C6380a unused5 = m.f37045f;
                    return;
                }
                C17315a c17315a = (C17315a) message.obj;
                l lVar5 = this.f37052a.get();
                if (lVar5 != null) {
                    Location location = new Location("gimbal");
                    location.setLatitude(c17315a.f163451a);
                    location.setLongitude(c17315a.f163452b);
                    location.setAccuracy(c17315a.f163454d);
                    lVar5.locationDetected(location);
                }
            }
        }

        @Override // ut.InterfaceC17316b
        public final void a(C17315a c17315a) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 3;
            messageObtain.obj = c17315a;
            sendMessage(messageObtain);
        }

        @Override // Ab.d
        public final void b(Ab.a aVar) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = aVar;
            sendMessage(messageObtain);
        }

        @Override // Ab.d
        public final void c(Ab.a aVar) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = aVar;
            sendMessage(messageObtain);
        }

        @Override // Ab.d
        public final void d(Ab.a aVar) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 0;
            messageObtain.obj = aVar;
            sendMessage(messageObtain);
        }

        @Override // Ab.d
        public final void g(Ab.c cVar) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            messageObtain.obj = cVar;
            sendMessage(messageObtain);
        }
    }

    public static synchronized m c() {
        try {
            if (f37046g == null) {
                f37046g = new m();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f37046g;
    }

    public void b(l lVar) {
        a aVar = new a(lVar, this.f37050d);
        this.f37051e.put(lVar, aVar);
        this.f37048b.f(aVar);
    }

    public void d() {
        this.f37047a.f130923e.b();
    }

    public void e() {
        this.f37047a.f130923e.c();
    }

    private m() {
        C15944b c15944bA = C15944b.a();
        this.f37047a = C13869f.a();
        this.f37049c = C13865b.a().f130887p;
        this.f37048b = this.f37047a.f130924f;
        this.f37050d = c15944bA.f152790a;
    }
}
