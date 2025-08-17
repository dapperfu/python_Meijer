package pa;

import Da.b;
import e9.c;
import e9.d;
import f9.C13859a;
import ia.e;
import j9.C14877b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import na.ButtonClicked;
import oa.C16008a;
import s9.C16914a;
import t9.C17074a;
import y9.C18190a;
import z9.C18404b;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001Bk\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\u00020\u00192\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001c2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0!2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0003H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\u0006\u0010(\u001a\u00020\u0003H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u0002002\u0006\u0010$\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0016¢\u0006\u0004\b1\u00102R \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00030\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u00106R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u00107R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u00108R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00109R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010:¨\u0006;"}, d2 = {"Lpa/a;", "Le9/c;", "Ly9/c;", "Le9/d;", "requestRepository", "Loa/a;", "iamRepository", "Lna/a;", "buttonClickedRepository", "Ls9/a;", "timestampProvider", "Lt9/a;", "uuidProvider", "Lia/e;", "inAppEventHandlerInternal", "Lj9/b;", "eventServiceProvider", "LDa/b;", "requestModelHelper", "<init>", "(Le9/c;Le9/c;Le9/c;Ls9/a;Lt9/a;Lia/e;Lj9/b;LDa/b;)V", "", "models", "d", "(Ljava/util/List;)Ljava/util/List;", "Ly9/a;", "f", "(Ljava/util/List;)Ly9/a;", "", "", "", "g", "(Ljava/util/List;)Ljava/util/Map;", "", "e", "(Ljava/util/List;)[Ljava/lang/String;", "item", "", "c", "(Ly9/c;)V", "specification", "i", "(Le9/d;)V", "", "isEmpty", "()Z", "h", "(Le9/d;)Ljava/util/List;", "", "j", "(Ly9/c;Le9/d;)I", "a", "Le9/c;", "b", "Ls9/a;", "Lt9/a;", "Lia/e;", "Lj9/b;", "LDa/b;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: pa.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C16273a implements c<y9.c, d> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c<y9.c, d> requestRepository;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c<C16008a, d> iamRepository;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c<ButtonClicked, d> buttonClickedRepository;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final C16914a timestampProvider;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final C17074a uuidProvider;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final e inAppEventHandlerInternal;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C14877b eventServiceProvider;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final b requestModelHelper;

    private final C18190a f(List<? extends y9.c> models) {
        y9.c cVar = models.get(0);
        Map<String, ? extends Object> mapG = g(models);
        String[] strArrE = e(models);
        C18190a.C2745a c2745a = new C18190a.C2745a(this.timestampProvider, this.uuidProvider);
        String string = cVar.getUrl().toString();
        Intrinsics.i(string, "toString(...)");
        return c2745a.p(string).k(cVar.getMethod()).l(mapG).j(cVar.a()).w(Long.MAX_VALUE).t(strArrE).a();
    }

    public C16273a(c<y9.c, d> requestRepository, c<C16008a, d> iamRepository, c<ButtonClicked, d> buttonClickedRepository, C16914a timestampProvider, C17074a uuidProvider, e inAppEventHandlerInternal, C14877b eventServiceProvider, b requestModelHelper) {
        Intrinsics.j(requestRepository, "requestRepository");
        Intrinsics.j(iamRepository, "iamRepository");
        Intrinsics.j(buttonClickedRepository, "buttonClickedRepository");
        Intrinsics.j(timestampProvider, "timestampProvider");
        Intrinsics.j(uuidProvider, "uuidProvider");
        Intrinsics.j(inAppEventHandlerInternal, "inAppEventHandlerInternal");
        Intrinsics.j(eventServiceProvider, "eventServiceProvider");
        Intrinsics.j(requestModelHelper, "requestModelHelper");
        this.requestRepository = requestRepository;
        this.iamRepository = iamRepository;
        this.buttonClickedRepository = buttonClickedRepository;
        this.timestampProvider = timestampProvider;
        this.uuidProvider = uuidProvider;
        this.inAppEventHandlerInternal = inAppEventHandlerInternal;
        this.eventServiceProvider = eventServiceProvider;
        this.requestModelHelper = requestModelHelper;
    }

    private final List<y9.c> d(List<? extends y9.c> models) {
        ArrayList arrayList = new ArrayList();
        for (y9.c cVar : models) {
            if (this.requestModelHelper.a(cVar)) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    private final String[] e(List<? extends y9.c> models) {
        List<? extends y9.c> list = models;
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((y9.c) it.next()).getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private final Map<String, Object> g(List<? extends y9.c> models) {
        ArrayList arrayList = new ArrayList();
        Iterator<? extends y9.c> it = models.iterator();
        while (it.hasNext()) {
            Map<String, Object> mapD = it.next().d();
            Intrinsics.g(mapD);
            Object obj = mapD.get("events");
            if (obj != null && (obj instanceof List)) {
                arrayList.addAll((Collection) obj);
            }
        }
        return Da.c.a(arrayList, this.iamRepository.b(new C13859a()), this.buttonClickedRepository.b(new C13859a()), this.inAppEventHandlerInternal.a());
    }

    @Override // e9.c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(y9.c item) {
        Intrinsics.j(item, "item");
        if (item instanceof C18190a) {
            return;
        }
        this.requestRepository.add(item);
    }

    @Override // e9.c
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public List<y9.c> b(d specification) {
        Intrinsics.j(specification, "specification");
        List<y9.c> listM1 = CollectionsKt.m1(this.requestRepository.b(specification));
        List<y9.c> listD = d(listM1);
        if (!listD.isEmpty()) {
            List<? extends y9.c> listB = this.requestRepository.b(new C18404b(this.eventServiceProvider.a() + "%"));
            if (!listB.isEmpty()) {
                listM1.add(listM1.indexOf(listD.get(0)), f(listB));
                listM1.removeAll(listD);
            }
        }
        return listM1;
    }

    @Override // e9.c
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public void remove(d specification) {
        Intrinsics.j(specification, "specification");
        this.requestRepository.remove(specification);
    }

    @Override // e9.c
    public boolean isEmpty() {
        return this.requestRepository.isEmpty();
    }

    @Override // e9.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public int a(y9.c item, d specification) {
        Intrinsics.j(item, "item");
        Intrinsics.j(specification, "specification");
        throw new UnsupportedOperationException("update method is not supported in RequestRepositoryProxy");
    }
}
