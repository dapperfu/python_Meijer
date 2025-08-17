package et;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.browser.customtabs.d;
import at.C6154b;
import ft.C14129a;
import ft.C14130b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Let/a;", "Let/k;", "Lat/b;", "eventCoordinator", "<init>", "(Lat/b;)V", "Landroid/content/Context;", "context", "", "b", "(Landroid/content/Context;)Ljava/lang/String;", "Lokhttp3/HttpUrl;", "url", "Ljava/lang/Exception;", "Lkotlin/Exception;", "a", "(Landroid/content/Context;Lokhttp3/HttpUrl;)Ljava/lang/Exception;", "Lat/b;", "web-authentication-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: et.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13768a implements InterfaceC13778k {

    /* renamed from: c, reason: collision with root package name */
    private static final String f130047c = "web-authentication-ui/" + Build.VERSION.SDK_INT + " com.okta.webauthenticationui/2.0.0";

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C6154b eventCoordinator;

    public C13768a(C6154b eventCoordinator) {
        Intrinsics.j(eventCoordinator, "eventCoordinator");
        this.eventCoordinator = eventCoordinator;
    }

    private final String b(Context context) {
        C14129a c14129a = new C14129a(0, null, 3, null);
        this.eventCoordinator.a(c14129a);
        PackageManager packageManager = context.getPackageManager();
        Intrinsics.i(packageManager, "getPackageManager(...)");
        Intent intent = new Intent();
        intent.setAction("android.support.customtabs.action.CustomTabsService");
        List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, c14129a.getQueryIntentServicesFlags());
        Intrinsics.i(listQueryIntentServices, "queryIntentServices(...)");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<ResolveInfo> it = listQueryIntentServices.iterator();
        while (it.hasNext()) {
            String packageName = it.next().serviceInfo.packageName;
            Intrinsics.i(packageName, "packageName");
            linkedHashSet.add(packageName);
        }
        for (String str : c14129a.a()) {
            if (linkedHashSet.contains(str)) {
                return str;
            }
        }
        return (String) CollectionsKt.t0(linkedHashSet);
    }

    @Override // et.InterfaceC13778k
    public Exception a(Context context, HttpUrl url) {
        Intrinsics.j(context, "context");
        Intrinsics.j(url, "url");
        d.C0965d c0965d = new d.C0965d();
        this.eventCoordinator.a(new C14130b(context, c0965d));
        androidx.browser.customtabs.d dVarA = c0965d.a();
        Intrinsics.i(dVarA, "build(...)");
        String strB = b(context);
        if (strB != null) {
            dVarA.f47181a.setPackage(strB);
        }
        Bundle bundle = new Bundle();
        bundle.putString("X-Okta-User-Agent-Extended", f130047c);
        dVarA.f47181a.putExtra("com.android.browser.headers", bundle);
        try {
            dVarA.a(context, Uri.parse(url.getUrl()));
            return null;
        } catch (ActivityNotFoundException e10) {
            return e10;
        }
    }
}
