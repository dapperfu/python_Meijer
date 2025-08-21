package va;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ha.C14490a;
import ha.InterfaceC14492c;
import io.constructor.data.local.PreferencesHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wa.RunnableC17854b;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0012¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0012¢\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0012¢\u0006\u0004\b\u0012\u0010\u0010J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J!\u0010\u0018\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001d¨\u0006\u001e"}, d2 = {"Lva/a;", "", "Landroid/content/Context;", "context", "Lha/c;", "eventServiceInternal", "Lha/a;", "cacheableEventHandler", "Ln9/b;", "concurrentHandlerHolder", "<init>", "(Landroid/content/Context;Lha/c;Lha/a;Ln9/b;)V", "Lorg/json/JSONObject;", "action", "Ljava/lang/Runnable;", "b", "(Lorg/json/JSONObject;)Ljava/lang/Runnable;", "d", "c", "a", "Lorg/json/JSONArray;", "actions", "", "actionId", "e", "(Lorg/json/JSONArray;Ljava/lang/String;)Lorg/json/JSONObject;", "Landroid/content/Context;", "Lha/c;", "Lha/a;", "Ln9/b;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: va.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17650a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14492c eventServiceInternal;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final C14490a cacheableEventHandler;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final n9.b concurrentHandlerHolder;

    public C17650a(Context context, InterfaceC14492c eventServiceInternal, C14490a cacheableEventHandler, n9.b concurrentHandlerHolder) {
        Intrinsics.j(context, "context");
        Intrinsics.j(eventServiceInternal, "eventServiceInternal");
        Intrinsics.j(cacheableEventHandler, "cacheableEventHandler");
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        this.context = context;
        this.eventServiceInternal = eventServiceInternal;
        this.cacheableEventHandler = cacheableEventHandler;
        this.concurrentHandlerHolder = concurrentHandlerHolder;
    }

    private Runnable b(JSONObject action) throws JSONException {
        Context context = this.context;
        C14490a c14490a = this.cacheableEventHandler;
        n9.b bVar = this.concurrentHandlerHolder;
        String string = action.getString("name");
        Intrinsics.i(string, "getString(...)");
        return new RunnableC17854b(context, c14490a, bVar, string, action.optJSONObject("payload"));
    }

    private Runnable c(JSONObject action) throws JSONException {
        String string = action.getString("name");
        JSONObject jSONObjectOptJSONObject = action.optJSONObject("payload");
        return new wa.d(this.eventServiceInternal, string, jSONObjectOptJSONObject != null ? I9.h.d(jSONObjectOptJSONObject) : null);
    }

    private Runnable d(JSONObject action) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(action.getString("url")));
        intent.addFlags(268435456);
        return new wa.h(intent, this.context);
    }

    public Runnable a(JSONObject action) throws JSONException {
        Intrinsics.j(action, "action");
        try {
            String string = action.getString("type");
            runnableB = Intrinsics.e("MEAppEvent", string) ? b(action) : null;
            if (Intrinsics.e("OpenExternalUrl", string)) {
                runnableB = d(action);
            }
            if (Intrinsics.e("MECustomEvent", string)) {
                return c(action);
            }
        } catch (JSONException unused) {
        }
        return runnableB;
    }

    public JSONObject e(JSONArray actions, String actionId) throws JSONException {
        Intrinsics.j(actions, "actions");
        Intrinsics.j(actionId, "actionId");
        int length = actions.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject = actions.optJSONObject(i10);
            if (jSONObjectOptJSONObject != null && Intrinsics.e(actionId, jSONObjectOptJSONObject.optString(PreferencesHelper.PREF_ID))) {
                return jSONObjectOptJSONObject;
            }
        }
        throw new JSONException("Cannot find action with id: " + actionId);
    }
}
