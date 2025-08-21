package H5;

import R5.t;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ;\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u0017*\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000eH\u0001¢\u0006\u0004\b\u001d\u0010\u0016R \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR$\u0010#\u001a\u0012\u0012\u0004\u0012\u00020\u00070 j\b\u0012\u0004\u0012\u00020\u0007`!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\"¨\u0006$"}, d2 = {"LH5/b;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "", "c", "(Landroid/app/Activity;)Ljava/util/Map;", "Landroid/os/Bundle;", "bundle", "originalKey", "transformedKey", "", "marshalledData", "", "f", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "Landroid/content/Intent;", "intent", "d", "(Landroid/content/Intent;Ljava/util/Map;)V", "Landroid/net/Uri;", "", "b", "(Landroid/net/Uri;)Z", "a", "(Landroid/net/Uri;)Landroid/net/Uri;", "e", "Ljava/util/Map;", "KNOWN_KEYS_MAP", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "adobeQueryKeys", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f13422a = new b();

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Map<String, String> KNOWN_KEYS_MAP = MapsKt.o(TuplesKt.a("adb_m_id", "pushmessageid"), TuplesKt.a("NOTIFICATION_IDENTIFIER", "notificationid"));

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final ArrayList<String> adobeQueryKeys = CollectionsKt.g("a.deeplink.id", "at_preview_token", "at_preview_endpoint");

    @JvmStatic
    public static final Map<String, Object> c(Activity activity) {
        Intent intent;
        if (activity == null || (intent = activity.getIntent()) == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b bVar = f13422a;
        bVar.e(intent, linkedHashMap);
        bVar.d(intent, linkedHashMap);
        return linkedHashMap;
    }

    private final void f(Bundle bundle, String originalKey, String transformedKey, Map<String, Object> marshalledData) {
        try {
            String string = bundle.getString(originalKey);
            if (string != null) {
                if (string.length() <= 0) {
                    string = null;
                }
                if (string != null) {
                    marshalledData.put(transformedKey, string);
                }
            }
        } catch (Exception e10) {
            t.b("MobileCore", "DataMarshaller", "Failed to retrieve data (key = " + originalKey + ") from Activity, error is: " + e10.getMessage(), new Object[0]);
        }
        try {
            bundle.remove(originalKey);
        } catch (Exception e11) {
            t.b("MobileCore", "DataMarshaller", "Failed to remove known key (" + originalKey + ") from bundle, error is: " + e11.getMessage(), new Object[0]);
        }
    }

    public final void e(Intent intent, Map<String, Object> marshalledData) {
        Object obj;
        String string;
        Intrinsics.j(intent, "intent");
        Intrinsics.j(marshalledData, "marshalledData");
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        for (Map.Entry<String, String> entry : KNOWN_KEYS_MAP.entrySet()) {
            f13422a.f(extras, entry.getKey(), entry.getValue(), marshalledData);
        }
        try {
            Set<String> setKeySet = extras.keySet();
            if (setKeySet != null) {
                for (String key : setKeySet) {
                    try {
                        if (!KNOWN_KEYS_MAP.containsKey(key) && (obj = extras.get(key)) != null && (string = obj.toString()) != null && string.length() > 0) {
                            Intrinsics.i(key, "key");
                            marshalledData.put(key, obj);
                        }
                    } catch (Exception e10) {
                        t.b("MobileCore", "DataMarshaller", "Failed to retrieve data (key = " + key + ") from Activity, error is: " + e10.getMessage(), new Object[0]);
                    }
                }
            }
        } catch (Exception e11) {
            t.b("MobileCore", "DataMarshaller", "Failed to retrieve data from Activity, error is: " + e11.getMessage(), new Object[0]);
        }
    }

    private b() {
    }

    private final Uri a(Uri uri) {
        List<String> queryParameters;
        if (uri.isHierarchical()) {
            try {
                Set<String> queryParameterNames = uri.getQueryParameterNames();
                if (queryParameterNames != null && !queryParameterNames.isEmpty()) {
                    Uri.Builder builderBuildUpon = uri.buildUpon();
                    builderBuildUpon.clearQuery();
                    for (String str : queryParameterNames) {
                        if (!adobeQueryKeys.contains(str) && (queryParameters = uri.getQueryParameters(str)) != null) {
                            Iterator<T> it = queryParameters.iterator();
                            while (it.hasNext()) {
                                builderBuildUpon.appendQueryParameter(str, (String) it.next());
                            }
                        }
                    }
                    Uri uriBuild = builderBuildUpon.build();
                    Intrinsics.i(uriBuild, "cleanUriBuilder.build()");
                    return uriBuild;
                }
            } catch (UnsupportedOperationException unused) {
            }
        }
        return uri;
    }

    private final boolean b(Uri uri) {
        Set<String> queryParameterNames;
        if (!uri.isHierarchical() || (queryParameterNames = uri.getQueryParameterNames()) == null) {
            return false;
        }
        ArrayList<String> arrayList = adobeQueryKeys;
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = arrayList.iterator();
        while (it.hasNext()) {
            if (queryParameterNames.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final void d(Intent intent, Map<String, Object> marshalledData) {
        Uri data = intent.getData();
        if (data != null) {
            String string = data.toString();
            Intrinsics.i(string, "data.toString()");
            if (string.length() == 0) {
                return;
            }
            t.e("MobileCore", "DataMarshaller", "Receiving the Activity Uri " + data, new Object[0]);
            String string2 = data.toString();
            Intrinsics.i(string2, "data.toString()");
            marshalledData.put("deeplink", string2);
            if (b(data)) {
                intent.setData(a(data));
            }
        }
    }
}
