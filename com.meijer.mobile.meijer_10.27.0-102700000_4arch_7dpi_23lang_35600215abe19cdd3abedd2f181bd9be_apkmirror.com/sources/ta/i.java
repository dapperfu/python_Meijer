package ta;

import Z9.NotificationInformation;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import da.C13500b;
import fa.InterfaceC13862c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ua.k;
import ua.l;
import va.C17531g;
import va.InterfaceC17532h;
import za.NotificationData;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 \u001f2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0013¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0012¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0012¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0012¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0019\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0012¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001d\u001a\u0004\u0018\u00010\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\bH\u0012¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\bH\u0012¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020&8RX\u0092\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001b\u00100\u001a\u00020,8RX\u0092\u0084\u0002¢\u0006\f\n\u0004\b-\u0010(\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018RX\u0092\u0084\u0002¢\u0006\f\n\u0004\b2\u0010(\u001a\u0004\b3\u00104R\u001b\u0010:\u001a\u0002068RX\u0092\u0084\u0002¢\u0006\f\n\u0004\b7\u0010(\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lta/i;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/content/Intent;", "intent", "Lza/k;", "k", "(Landroid/content/Intent;)Lza/k;", "notificationData", "Lua/g;", "s", "(Lza/k;)Lua/g;", "", "Ljava/lang/Runnable;", "g", "(Lza/k;)Ljava/util/List;", "Lorg/json/JSONObject;", "action", "q", "(Lorg/json/JSONObject;)Ljava/lang/Runnable;", "", "actionId", "t", "(Ljava/lang/String;Lza/k;Lorg/json/JSONObject;)Ljava/lang/Runnable;", "r", "(Lza/k;)Ljava/lang/Runnable;", "l", "(Lza/k;Ljava/lang/String;)Lorg/json/JSONObject;", "f", "(Lza/k;)Lorg/json/JSONObject;", "j", "h", "(Landroid/content/Intent;)Ljava/lang/Runnable;", "a", "Landroid/content/Context;", "Lfa/c;", "b", "Lkotlin/Lazy;", "n", "()Lfa/c;", "eventServiceInternal", "Lva/h;", "c", "p", "()Lva/h;", "pushInternal", "Lta/a;", "d", "m", "()Lta/a;", "actionCommandFactory", "Lva/g;", "e", "o", "()Lva/g;", "notificationInformationListenerProvider", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class i {

    /* renamed from: f, reason: collision with root package name */
    private static final a f161530f = new a(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Lazy eventServiceInternal;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Lazy pushInternal;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Lazy actionCommandFactory;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Lazy notificationInformationListenerProvider;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lta/i$a;", "", "<init>", "()V", "", "SDK_ACTIVITY_NAME", "Ljava/lang/String;", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private JSONObject l(NotificationData notificationData, String actionId) {
        String actions;
        if (notificationData != null) {
            try {
                actions = notificationData.getActions();
            } catch (JSONException unused) {
            }
        } else {
            actions = null;
        }
        if (actions != null && actionId != null) {
            return m().e(new JSONArray(notificationData.getActions()), actionId);
        }
        if ((notificationData != null ? notificationData.getDefaultAction() : null) != null) {
            return new JSONObject(notificationData.getDefaultAction());
        }
        return null;
    }

    private Runnable r(NotificationData notificationData) {
        if ((notificationData != null ? notificationData.getInapp() : null) != null) {
            return new ua.i(notificationData);
        }
        return null;
    }

    private ua.g s(NotificationData notificationData) {
        String campaignId = notificationData != null ? notificationData.getCampaignId() : null;
        if (campaignId == null || campaignId.length() == 0) {
            return null;
        }
        return new ua.g(o(), new NotificationInformation(campaignId));
    }

    public i(Context context) {
        Intrinsics.j(context, "context");
        this.context = context;
        this.eventServiceInternal = LazyKt.b(new Function0() { // from class: ta.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.i();
            }
        });
        this.pushInternal = LazyKt.b(new Function0() { // from class: ta.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.v();
            }
        });
        this.actionCommandFactory = LazyKt.b(new Function0() { // from class: ta.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.e();
            }
        });
        this.notificationInformationListenerProvider = LazyKt.b(new Function0() { // from class: ta.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.u();
            }
        });
    }

    private JSONObject f(NotificationData notificationData) {
        HashMap map = new HashMap();
        map.put("type", "MEAppEvent");
        map.put("name", "push:payload");
        map.put("payload", j(notificationData));
        return new JSONObject(map);
    }

    private List<Runnable> g(NotificationData notificationData) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ua.e(this.context, notificationData));
        if (notificationData != null) {
            arrayList.add(m().a(f(notificationData)));
        }
        return arrayList;
    }

    @TargetApi(34)
    private NotificationData k(Intent intent) {
        return (NotificationData) intent.getParcelableExtra("payload", NotificationData.class);
    }

    private C17075a m() {
        return (C17075a) this.actionCommandFactory.getValue();
    }

    private InterfaceC13862c n() {
        return (InterfaceC13862c) this.eventServiceInternal.getValue();
    }

    private C17531g o() {
        return (C17531g) this.notificationInformationListenerProvider.getValue();
    }

    private InterfaceC17532h p() {
        return (InterfaceC17532h) this.pushInternal.getValue();
    }

    private Runnable q(JSONObject action) {
        Runnable runnableA;
        if (action == null || (runnableA = m().a(action)) == null) {
            return null;
        }
        return runnableA;
    }

    private Runnable t(String actionId, NotificationData notificationData, JSONObject action) {
        if (action == null || actionId == null || notificationData == null) {
            return new l(p(), notificationData != null ? notificationData.getSid() : null);
        }
        return new k(n(), actionId, notificationData.getSid());
    }

    public Runnable h(Intent intent) {
        Activity activityA;
        Intrinsics.j(intent, "intent");
        String action = intent.getAction();
        NotificationData notificationDataK = G9.a.f11285a.d() ? (NotificationData) intent.getParcelableExtra("payload") : k(intent);
        JSONObject jSONObjectL = l(notificationDataK, action);
        List<Runnable> listG = g(notificationDataK);
        if ((jSONObjectL == null || !Intrinsics.e(jSONObjectL.optString("type"), "Dismiss")) && ((activityA = C13500b.b().W().a()) == null || StringsKt.W(activityA.toString(), "com.emarsys.NotificationOpenedActivity", false, 2, null))) {
            listG.add(new ua.f(intent, this.context, new c()));
        }
        Runnable runnableR = r(notificationDataK);
        if (runnableR != null) {
            listG.add(runnableR);
        }
        listG.add(s(notificationDataK));
        listG.add(t(action, notificationDataK, jSONObjectL));
        Runnable runnableQ = q(jSONObjectL);
        if (runnableQ != null) {
            listG.add(runnableQ);
        }
        return new ua.c(CollectionsKt.p0(listG));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C17075a e() {
        return C13500b.b().K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC13862c i() {
        return C13500b.b().i();
    }

    private JSONObject j(NotificationData notificationData) throws JSONException {
        JSONArray jSONArray;
        String actions = notificationData.getActions();
        if (actions != null) {
            jSONArray = new JSONArray(actions);
        } else {
            jSONArray = null;
        }
        JSONObject jSONObject = new JSONObject();
        Iterator<T> it = notificationData.r().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        jSONObject.put("imageUrl", notificationData.getImageUrl());
        jSONObject.put("iconImageUrl", notificationData.getIconImageUrl());
        jSONObject.put("style", notificationData.getStyle());
        jSONObject.put("title", notificationData.getTitle());
        jSONObject.put("body", notificationData.getBody());
        jSONObject.put("channelId", notificationData.getChannelId());
        jSONObject.put("campaignId", notificationData.getCampaignId());
        jSONObject.put("sid", notificationData.getSid());
        jSONObject.put("smallIconResourceId", notificationData.getSmallIconResourceId());
        jSONObject.put("colorResourceId", notificationData.getColorResourceId());
        jSONObject.put("collapseId", notificationData.getCollapseId());
        jSONObject.put("operation", notificationData.getOperation());
        jSONObject.put("actions", jSONArray);
        jSONObject.put("defaultAction", notificationData.getDefaultAction());
        jSONObject.put("inapp", notificationData.getInapp());
        jSONObject.put("u", notificationData.getU());
        jSONObject.put("message_id", notificationData.getMessage_id());
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C17531g u() {
        return C13500b.b().s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC17532h v() {
        return C13500b.b().P();
    }
}
