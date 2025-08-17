package Et;

import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import ut.InterfaceC17329o;

/* loaded from: classes11.dex */
public class n {

    /* renamed from: e, reason: collision with root package name */
    private static final C6380a f9862e = C6381b.a(n.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final C6382c f9863f = C6383d.a(n.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, m> f9864a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final List<InterfaceC17329o> f9865b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Za.e f9866c;

    /* renamed from: d, reason: collision with root package name */
    public long f9867d;

    /* JADX INFO: Access modifiers changed from: private */
    public class a implements Comparator<m> {
        private a() {
        }

        public /* synthetic */ a(n nVar, byte b10) {
            this();
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(m mVar, m mVar2) {
            int i10 = mVar.f9858c;
            int i11 = mVar2.f9858c;
            if (i10 == i11) {
                return 0;
            }
            return i10 < i11 ? 1 : -1;
        }
    }

    public final void b(InterfaceC17329o interfaceC17329o) {
        synchronized (this) {
            this.f9865b.add(interfaceC17329o);
        }
    }

    public n(Za.e eVar) {
        this.f9866c = eVar;
    }

    public static int a(List<m> list) {
        if (list.size() >= 10) {
            return 10;
        }
        return list.size();
    }
}
