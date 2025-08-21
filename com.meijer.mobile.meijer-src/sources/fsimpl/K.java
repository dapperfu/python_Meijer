package fsimpl;

import com.fullstory.FS;
import com.fullstory.FSPage;
import com.fullstory.util.Log;
import java.util.Map;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Supplier;

/* loaded from: classes15.dex */
public final class K extends FSPage {

    /* renamed from: a, reason: collision with root package name */
    private static final String f132649a = FSPage.class.getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    private static final UUID f132650b = new UUID(0, 0);

    /* renamed from: c, reason: collision with root package name */
    private final String f132651c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f132652d;

    /* renamed from: e, reason: collision with root package name */
    private UUID f132653e = f132650b;

    public K(String str, Map map) {
        this.f132651c = str;
        this.f132652d = fD.a(map);
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
        if (this.f132652d.containsKey("pageName")) {
            this.f132652d.remove("pageName");
            Log.w(String.format("%s is a reserved property and has been removed.", "pageName"));
        }
    }

    private void a(Map map) {
        a(this.f132652d, map);
        a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String b(Map map) {
        return String.format("%s { %s }.updateProperties(properties: %s)", fK.a(this, f132649a), fK.c(this.f132651c), fK.a(map));
    }

    private void b() {
        UUID uuidRandomUUID = UUID.randomUUID();
        this.f132653e = uuidRandomUUID;
        FS.__pageView(uuidRandomUUID, this.f132651c, this.f132652d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String c() {
        return String.format("%s { %s }.end()", fK.a(this, f132649a), fK.c(this.f132651c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String c(Map map) {
        return String.format("%s { %s }.start(propertyUpdates: %s)", fK.a(this, f132649a), fK.c(this.f132651c), fK.a(map));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String d() {
        return String.format("%s { %s }.start()", fK.a(this, f132649a), fK.c(this.f132651c));
    }

    @Override // com.fullstory.FSPage
    public void end() {
        fK.a(new Supplier() { // from class: fsimpl.K$$ExternalSyntheticLambda3
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.f$0.c();
            }
        });
        UUID uuid = this.f132653e;
        UUID uuid2 = f132650b;
        if (uuid == uuid2) {
            Log.e("Called `end` on FSPage that has not been `start`-ed. `end` should be called on the same FSPage instance that the corresponding `start` is called on.");
        }
        FS.__endPage(this.f132653e);
        this.f132653e = uuid2;
    }

    @Override // com.fullstory.FSPage
    protected String getPageName() {
        return this.f132651c;
    }

    @Override // com.fullstory.FSPage
    public Map getProperties() {
        return this.f132652d;
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
        if (this.f132653e == f132650b) {
            Log.alwaysWarn("Called `updateProperties` on FSPage that has not been `start`-ed. This may be a mistake. `updateProperties` should be called on the same FSPage instance that the corresponding `start` is called on.");
        }
        a(fD.a(map));
        FS.__updatePageProperties(this.f132653e, map);
    }
}
