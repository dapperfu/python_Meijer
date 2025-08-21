package Et;

import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import ut.InterfaceC17481o;

/* loaded from: classes12.dex */
public class n {

    /* renamed from: e, reason: collision with root package name */
    private static final C13784a f8574e = C13785b.a(n.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final C13786c f8575f = C13787d.a(n.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, m> f8576a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final List<InterfaceC17481o> f8577b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final bb.e f8578c;

    /* renamed from: d, reason: collision with root package name */
    public long f8579d;

    /* JADX INFO: Access modifiers changed from: private */
    public class a implements Comparator<m> {
        private a() {
        }

        public /* synthetic */ a(n nVar, byte b10) {
            this();
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(m mVar, m mVar2) {
            int i10 = mVar.f8570c;
            int i11 = mVar2.f8570c;
            if (i10 == i11) {
                return 0;
            }
            return i10 < i11 ? 1 : -1;
        }
    }

    public final void b(InterfaceC17481o interfaceC17481o) {
        synchronized (this) {
            this.f8577b.add(interfaceC17481o);
        }
    }

    public n(bb.e eVar) {
        this.f8578c = eVar;
    }

    public static int a(List<m> list) {
        if (list.size() >= 10) {
            return 10;
        }
        return list.size();
    }
}
