package Xa;

import android.location.Location;
import android.os.Handler;
import android.os.Message;
import eb.C13784a;
import eb.C13785b;
import hb.C14495b;
import hb.C14499f;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import nt.C16020b;
import ut.C17467a;
import ut.InterfaceC17468b;
import ut.InterfaceC17469c;

/* loaded from: classes4.dex */
public class m {

    /* renamed from: f, reason: collision with root package name */
    private static final C13784a f41757f = C13785b.a(m.class.getName());

    /* renamed from: g, reason: collision with root package name */
    private static m f41758g;

    /* renamed from: a, reason: collision with root package name */
    private C14499f f41759a;

    /* renamed from: b, reason: collision with root package name */
    private Cb.b f41760b;

    /* renamed from: c, reason: collision with root package name */
    private Fb.d f41761c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC17469c f41762d;

    /* renamed from: e, reason: collision with root package name */
    private Map<l, a> f41763e = new WeakHashMap();

    private class a extends Handler implements Cb.d, InterfaceC17468b {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<l> f41764a;

        public a(l lVar, InterfaceC17469c interfaceC17469c) {
            this.f41764a = new WeakReference<>(lVar);
            interfaceC17469c.e(this);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) throws IllegalAccessException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (this.f41764a.get() != null) {
                int i10 = message.what;
                if (i10 == 0) {
                    Cb.a aVar = (Cb.a) message.obj;
                    l lVar = this.f41764a.get();
                    if (lVar != null) {
                        k kVarA = Ab.b.a(aVar.g());
                        lVar.onVisitStart(Ab.c.a(kVarA, aVar));
                        C13784a unused = m.f41757f;
                        kVarA.b();
                        aVar.i();
                        return;
                    }
                    return;
                }
                if (i10 == 4) {
                    Cb.a aVar2 = (Cb.a) message.obj;
                    l lVar2 = this.f41764a.get();
                    if (lVar2 != null) {
                        k kVarA2 = Ab.b.a(aVar2.g());
                        n nVarA = Ab.c.a(kVarA2, aVar2);
                        lVar2.onVisitStartWithDelay(nVarA, aVar2.g().g() > 0 ? (int) (nVarA.b() / 1000) : 0);
                        C13784a unused2 = m.f41757f;
                        kVarA2.b();
                        aVar2.i();
                        return;
                    }
                    return;
                }
                if (i10 == 1) {
                    Cb.a aVar3 = (Cb.a) message.obj;
                    l lVar3 = this.f41764a.get();
                    if (lVar3 != null) {
                        Fb.b bVarG = aVar3.g();
                        k kVarA3 = Ab.b.a(bVarG);
                        lVar3.onVisitEnd(Ab.c.a(kVarA3, aVar3));
                        C13784a unused3 = m.f41757f;
                        kVarA3.b();
                        bVarG.k();
                        aVar3.i();
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    Cb.c cVar = (Cb.c) message.obj;
                    l lVar4 = this.f41764a.get();
                    if (lVar4 != null) {
                        Iterator<Fb.b> it = cVar.f4174a;
                        ArrayList arrayList = new ArrayList();
                        while (it.hasNext()) {
                            Fb.b next = it.next();
                            arrayList.add(Ab.c.b(Ab.b.a(next), next));
                        }
                        lVar4.onBeaconSighting(cVar.f4175b, arrayList);
                        C13784a unused4 = m.f41757f;
                        cVar.f4175b.a().a();
                        return;
                    }
                    return;
                }
                if (i10 != 3) {
                    C13784a unused5 = m.f41757f;
                    return;
                }
                C17467a c17467a = (C17467a) message.obj;
                l lVar5 = this.f41764a.get();
                if (lVar5 != null) {
                    Location location = new Location("gimbal");
                    location.setLatitude(c17467a.f164529a);
                    location.setLongitude(c17467a.f164530b);
                    location.setAccuracy(c17467a.f164532d);
                    lVar5.locationDetected(location);
                }
            }
        }

        @Override // ut.InterfaceC17468b
        public final void a(C17467a c17467a) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 3;
            messageObtain.obj = c17467a;
            sendMessage(messageObtain);
        }

        @Override // Cb.d
        public final void b(Cb.a aVar) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = aVar;
            sendMessage(messageObtain);
        }

        @Override // Cb.d
        public final void c(Cb.a aVar) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 0;
            messageObtain.obj = aVar;
            sendMessage(messageObtain);
        }

        @Override // Cb.d
        public final void d(Cb.a aVar) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            messageObtain.obj = aVar;
            sendMessage(messageObtain);
        }

        @Override // Cb.d
        public final void g(Cb.c cVar) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 2;
            messageObtain.obj = cVar;
            sendMessage(messageObtain);
        }
    }

    public static synchronized m c() {
        try {
            if (f41758g == null) {
                f41758g = new m();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f41758g;
    }

    public void b(l lVar) {
        a aVar = new a(lVar, this.f41762d);
        this.f41763e.put(lVar, aVar);
        this.f41760b.f(aVar);
    }

    public void d() {
        this.f41759a.f135269e.b();
    }

    public void e() {
        this.f41759a.f135269e.c();
    }

    private m() {
        C16020b c16020bA = C16020b.a();
        this.f41759a = C14499f.a();
        this.f41761c = C14495b.a().f135233p;
        this.f41760b = this.f41759a.f135270f;
        this.f41762d = c16020bA.f153242a;
    }
}
