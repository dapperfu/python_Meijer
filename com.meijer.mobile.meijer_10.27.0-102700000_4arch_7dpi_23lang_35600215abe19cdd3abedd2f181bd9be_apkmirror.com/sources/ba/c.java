package ba;

import U9.MobileEngageRequestContext;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.fullstory.FS;
import com.google.maps.internal.HttpHeaders;
import ea.C13638a;
import j9.C14877b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import y9.c;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lba/c;", "Lba/b;", "LU9/k;", "requestContext", "Lj9/b;", "deepLinkServiceProvider", "Lw9/b;", "manager", "<init>", "(LU9/k;Lj9/b;Lw9/b;)V", "", "", "b", "()Ljava/util/Map;", "Landroid/app/Activity;", "activity", "Landroid/content/Intent;", "intent", "LV8/a;", "completionListener", "", "a", "(Landroid/app/Activity;Landroid/content/Intent;LV8/a;)V", "LU9/k;", "Lj9/b;", "c", "Lw9/b;", "d", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements InterfaceC6216b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final MobileEngageRequestContext requestContext;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C14877b deepLinkServiceProvider;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w9.b manager;

    public c(MobileEngageRequestContext requestContext, C14877b deepLinkServiceProvider, w9.b manager) {
        Intrinsics.j(requestContext, "requestContext");
        Intrinsics.j(deepLinkServiceProvider, "deepLinkServiceProvider");
        Intrinsics.j(manager, "manager");
        this.requestContext = requestContext;
        this.deepLinkServiceProvider = deepLinkServiceProvider;
        this.manager = manager;
    }

    private final Map<String, String> b() {
        HashMap map = new HashMap();
        StringCompanionObject stringCompanionObject = StringCompanionObject.f142841a;
        String str = String.format("Emarsys SDK %s Android %s", Arrays.copyOf(new Object[]{this.requestContext.getDeviceInfo().getSdkVersion(), Integer.valueOf(Build.VERSION.SDK_INT)}, 2));
        Intrinsics.i(str, "format(...)");
        map.put(HttpHeaders.USER_AGENT, str);
        return map;
    }

    @Override // ba.InterfaceC6216b
    public void a(Activity activity, Intent intent, V8.a completionListener) {
        String queryParameter;
        Intrinsics.j(activity, "activity");
        Intrinsics.j(intent, "intent");
        Uri data = intent.getData();
        Intent intent2 = activity.getIntent();
        if ((intent2 != null ? intent2.getBooleanExtra("ems_deep_link_tracked", false) : false) || data == null) {
            return;
        }
        try {
            queryParameter = data.getQueryParameter("ems_dl");
        } catch (UnsupportedOperationException unused) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.f142841a;
            String str = String.format("Deep-link URI %1$s is not hierarchical", Arrays.copyOf(new Object[]{data}, 1));
            Intrinsics.i(str, "format(...)");
            FS.log_e("Emarsys SDK - DeepLink", str);
            queryParameter = null;
        }
        if (queryParameter != null) {
            HashMap map = new HashMap();
            map.put("ems_dl", queryParameter);
            y9.c cVarA = new c.a(this.requestContext.getTimestampProvider(), this.requestContext.getUuidProvider()).p(this.deepLinkServiceProvider.a() + C13638a.f128651a.b()).j(b()).l(map).a();
            if (intent2 != null) {
                intent2.putExtra("ems_deep_link_tracked", true);
            }
            this.manager.b(cVarA, completionListener);
        }
    }
}
