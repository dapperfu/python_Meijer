package fsimpl;

import com.fullstory.FS;
import com.fullstory.FSPage;
import com.fullstory.util.Log;
import java.util.Map;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Supplier;

/* loaded from: classes14.dex */
public final class K extends FSPage {

    /* renamed from: a, reason: collision with root package name */
    private static final String f131399a = FSPage.class.getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    private static final UUID f131400b = new UUID(0, 0);

    /* renamed from: c, reason: collision with root package name */
    private final String f131401c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f131402d;

    /* renamed from: e, reason: collision with root package name */
    private UUID f131403e = f131400b;

    public K(String str, Map map) {
        this.f131401c = str;
        this.f131402d = fD.a(map);
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object a(Object obj, Object obj2) {
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return obj2;
        }
        Map map = (Map) obj;
        for (Map.Entry entry : ((Map) obj2).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                map.put(str, null);
            } else {
                map.merge(str, value, new BiFunction() { // from class: fsimpl.K$$ExternalSyntheticLambda1
                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj3, Object obj4) {
                        return this.f$0.a(obj3, obj4);
                    }
                });
            }
        }
        return map;
    }

    private void a() {
        if (this.f131402d.containsKey("pageName")) {
            this.f131402d.remove("pageName");
            Log.w(String.format("%s is a reserved property and has been removed.", "pageName"));
        }
    }

    private void a(Map map) {
        a(this.f131402d, map);
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String b(Map map) {
        return String.format("%s { %s }.updateProperties(properties: %s)", fK.a(this, f131399a), fK.c(this.f131401c), fK.a(map));
    }

    private void b() {
        UUID uuidRandomUUID = UUID.randomUUID();
        this.f131403e = uuidRandomUUID;
        FS.__pageView(uuidRandomUUID, this.f131401c, this.f131402d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String c() {
        return String.format("%s { %s }.end()", fK.a(this, f131399a), fK.c(this.f131401c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String c(Map map) {
        return String.format("%s { %s }.start(propertyUpdates: %s)", fK.a(this, f131399a), fK.c(this.f131401c), fK.a(map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String d() {
        return String.format("%s { %s }.start()", fK.a(this, f131399a), fK.c(this.f131401c));
    }

    @Override // com.fullstory.FSPage
    public void end() {
        fK.a(new Supplier() { // from class: fsimpl.K$$ExternalSyntheticLambda3
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f$0.c();
            }
        });
        UUID uuid = this.f131403e;
        UUID uuid2 = f131400b;
        if (uuid == uuid2) {
            Log.e("Called `end` on FSPage that has not been `start`-ed. `end` should be called on the same FSPage instance that the corresponding `start` is called on.");
        }
        FS.__endPage(this.f131403e);
        this.f131403e = uuid2;
    }

    @Override // com.fullstory.FSPage
    protected String getPageName() {
        return this.f131401c;
    }

    @Override // com.fullstory.FSPage
    public Map getProperties() {
        return this.f131402d;
    }

    @Override // com.fullstory.FSPage
    public void start() {
        fK.a(new Supplier() { // from class: fsimpl.K$$ExternalSyntheticLambda4
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f$0.d();
            }
        });
        b();
    }

    @Override // com.fullstory.FSPage
    public void start(final Map map) {
        fK.a(new Supplier() { // from class: fsimpl.K$$ExternalSyntheticLambda2
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f$0.c(map);
            }
        });
        a(fD.a(map));
        b();
    }

    @Override // com.fullstory.FSPage
    public void updateProperties(final Map map) {
        fK.a(new Supplier() { // from class: fsimpl.K$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f$0.b(map);
            }
        });
        if (this.f131403e == f131400b) {
            Log.alwaysWarn("Called `updateProperties` on FSPage that has not been `start`-ed. This may be a mistake. `updateProperties` should be called on the same FSPage instance that the corresponding `start` is called on.");
        }
        a(fD.a(map));
        FS.__updatePageProperties(this.f131403e, map);
    }
}
