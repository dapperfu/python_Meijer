package za;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.m;
import da.C13500b;
import io.constructor.data.local.PreferencesHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00142\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lza/j;", "", "<init>", "()V", "Landroid/content/Intent;", "intent", "Lta/i;", "commandFactory", "", "d", "(Landroid/content/Intent;Lta/i;)V", "Lorg/json/JSONObject;", "action", "Landroid/content/Context;", "context", "Lza/k;", "notificationData", "Landroidx/core/app/m$a;", "b", "(Lorg/json/JSONObject;Landroid/content/Context;Lza/k;)Landroidx/core/app/m$a;", "", "", "f", "(Lorg/json/JSONObject;)Ljava/util/List;", "Lorg/json/JSONArray;", "actionsData", "c", "(Landroid/content/Context;Lorg/json/JSONArray;Lza/k;)Ljava/util/List;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f171672a = new j();

    private final m.a b(JSONObject action, Context context, NotificationData notificationData) throws JSONException {
        try {
            String string = action.getString(PreferencesHelper.PREF_ID);
            if (f(action).isEmpty()) {
                return new m.a.C1094a(0, action.getString("title"), C18409e.d(context, notificationData, string)).a();
            }
            return null;
        } catch (JSONException unused) {
            return null;
        }
    }

    @JvmStatic
    public static final void d(final Intent intent, final ta.i commandFactory) {
        Intrinsics.j(intent, "intent");
        Intrinsics.j(commandFactory, "commandFactory");
        C13500b.b().getConcurrentHandlerHolder().getCoreHandler().b(new Runnable() { // from class: za.i
            @Override // java.lang.Runnable
            public final void run() {
                j.e(commandFactory, intent);
            }
        });
    }

    private final List<String> f(JSONObject action) throws JSONException {
        String string = action.getString("type");
        M9.a aVarA = M9.a.a(action);
        if (Intrinsics.e("MEAppEvent", string)) {
            aVarA.b("name");
        }
        if (Intrinsics.e("OpenExternalUrl", string)) {
            aVarA.b("url");
        }
        if (Intrinsics.e("MECustomEvent", string)) {
            aVarA.b("name");
        }
        List<String> listD = aVarA.d();
        Intrinsics.i(listD, "validate(...)");
        return listD;
    }

    public final List<m.a> c(Context context, JSONArray actionsData, NotificationData notificationData) throws JSONException {
        Intrinsics.j(context, "context");
        Intrinsics.j(actionsData, "actionsData");
        Intrinsics.j(notificationData, "notificationData");
        ArrayList arrayList = new ArrayList();
        try {
            int length = actionsData.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = actionsData.getJSONObject(i10);
                Intrinsics.i(jSONObject, "getJSONObject(...)");
                m.a aVarB = b(jSONObject, context, notificationData);
                if (aVarB != null) {
                    arrayList.add(aVarB);
                }
            }
        } catch (JSONException unused) {
        }
        return arrayList;
    }

    private j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(ta.i iVar, Intent intent) {
        iVar.h(intent).run();
    }
}
