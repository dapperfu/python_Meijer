package na;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import na.s;
import oa.InAppMetaData;
import org.json.JSONObject;
import pa.ButtonClicked;
import r9.C16874a;
import u9.C17361a;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001:\u0001$B\u009b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\u0004\u0018\u0001`\u000e\u0012@\u0010\u0018\u001a<\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010j\u0004\u0018\u0001`\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJM\u0010\"\u001a8\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\r0\u0010j\u0002`!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0007\u001a\u00020\u00068\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b(\u0010)R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b*\u0010+R0\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0018\u00010\fj\u0004\u0018\u0001`\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\\\u0010\u0018\u001a<\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0015¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u0010j\u0004\u0018\u0001`\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0014\u0010\u001a\u001a\u00020\u00198\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u001c\u001a\u00020\u001b8\u0012X\u0092\u0004¢\u0006\u0006\n\u0004\b:\u0010;R$\u0010C\u001a\u0004\u0018\u00010<8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lna/s;", "", "Lr9/a;", "currentActivityProvider", "Ln9/b;", "concurrentHandlerHolder", "Lka/f;", "inAppInternal", "Lg9/c;", "Lpa/a;", "Lg9/d;", "buttonClickedRepository", "Lkotlin/Function0;", "", "Lcom/emarsys/mobileengage/iam/jsbridge/OnCloseListener;", "onCloseTriggered", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "property", "Lorg/json/JSONObject;", "json", "Lcom/emarsys/mobileengage/iam/jsbridge/OnAppEventListener;", "onAppEventTriggered", "Lu9/a;", "timestampProvider", "Landroid/content/ClipboardManager;", "clipboardManager", "<init>", "(Lr9/a;Ln9/b;Lka/f;Lg9/c;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lu9/a;Landroid/content/ClipboardManager;)V", "Lna/s$a;", "command", "Lcom/emarsys/mobileengage/iam/jsbridge/JSCommand;", "m", "(Lna/s$a;)Lkotlin/jvm/functions/Function2;", "a", "Lr9/a;", "b", "Ln9/b;", "c", "Lka/f;", "d", "Lg9/c;", "e", "Lkotlin/jvm/functions/Function0;", "z", "()Lkotlin/jvm/functions/Function0;", "setOnCloseTriggered", "(Lkotlin/jvm/functions/Function0;)V", "f", "Lkotlin/jvm/functions/Function2;", "y", "()Lkotlin/jvm/functions/Function2;", "setOnAppEventTriggered", "(Lkotlin/jvm/functions/Function2;)V", "g", "Lu9/a;", "h", "Landroid/content/ClipboardManager;", "Loa/b;", "i", "Loa/b;", "x", "()Loa/b;", "A", "(Loa/b;)V", "inAppMetaData", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public class s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C16874a currentActivityProvider;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n9.b concurrentHandlerHolder;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ka.f inAppInternal;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final g9.c<ButtonClicked, g9.d> buttonClickedRepository;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Function0<Unit> onCloseTriggered;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Function2<? super String, ? super JSONObject, Unit> onAppEventTriggered;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final C17361a timestampProvider;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ClipboardManager clipboardManager;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private InAppMetaData inAppMetaData;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lna/s$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "mobile-engage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f152156a = new a("ON_APP_EVENT", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f152157b = new a("ON_BUTTON_CLICKED", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final a f152158c = new a("ON_CLOSE", 2);

        /* renamed from: d, reason: collision with root package name */
        public static final a f152159d = new a("ON_ME_EVENT", 3);

        /* renamed from: e, reason: collision with root package name */
        public static final a f152160e = new a("ON_OPEN_EXTERNAL_URL", 4);

        /* renamed from: f, reason: collision with root package name */
        public static final a f152161f = new a("ON_COPY_TO_CLIPBOARD", 5);

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ a[] f152162g;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f152163h;

        static {
            a[] aVarArrA = a();
            f152162g = aVarArrA;
            f152163h = EnumEntriesKt.a(aVarArrA);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f152156a, f152157b, f152158c, f152159d, f152160e, f152161f};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f152162g.clone();
        }

        private a(String str, int i10) {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements Function2<String, JSONObject, Unit> {
        c() {
        }

        public final void b(String str, JSONObject jSONObject) throws Exception {
            Intrinsics.j(jSONObject, "<unused var>");
            final Activity activityA = s.this.currentActivityProvider.a();
            final Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            booleanRef.f143735a = true;
            if (activityA == null) {
                throw new Exception("UI unavailable!");
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            s.this.concurrentHandlerHolder.h(new Runnable() { // from class: na.t
                @Override // java.lang.Runnable
                public final void run() {
                    s.c.c(activityA, intent, booleanRef, countDownLatch);
                }
            });
            countDownLatch.await();
            if (!booleanRef.f143735a) {
                throw new Exception("Url cannot be handled by any application!");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, JSONObject jSONObject) throws Exception {
            b(str, jSONObject);
            return Unit.f143329a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(Activity activity, Intent intent, Ref.BooleanRef booleanRef, CountDownLatch countDownLatch) {
            try {
                activity.startActivity(intent);
            } catch (Exception unused) {
                booleanRef.f143735a = false;
            } finally {
                countDownLatch.countDown();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.f152156a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.f152158c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.f152157b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.f152160e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.f152159d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.f152161f.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public s(C16874a currentActivityProvider, n9.b concurrentHandlerHolder, ka.f inAppInternal, g9.c<ButtonClicked, g9.d> buttonClickedRepository, Function0<Unit> function0, Function2<? super String, ? super JSONObject, Unit> function2, C17361a timestampProvider, ClipboardManager clipboardManager) {
        Intrinsics.j(currentActivityProvider, "currentActivityProvider");
        Intrinsics.j(concurrentHandlerHolder, "concurrentHandlerHolder");
        Intrinsics.j(inAppInternal, "inAppInternal");
        Intrinsics.j(buttonClickedRepository, "buttonClickedRepository");
        Intrinsics.j(timestampProvider, "timestampProvider");
        Intrinsics.j(clipboardManager, "clipboardManager");
        this.currentActivityProvider = currentActivityProvider;
        this.concurrentHandlerHolder = concurrentHandlerHolder;
        this.inAppInternal = inAppInternal;
        this.buttonClickedRepository = buttonClickedRepository;
        this.onCloseTriggered = function0;
        this.onAppEventTriggered = function2;
        this.timestampProvider = timestampProvider;
        this.clipboardManager = clipboardManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(final s sVar, final String str, final JSONObject json) {
        Intrinsics.j(json, "json");
        sVar.concurrentHandlerHolder.h(new Runnable() { // from class: na.o
            @Override // java.lang.Runnable
            public final void run() {
                s.o(this.f152138a, str, json);
            }
        });
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(final s sVar, String str, final JSONObject json) {
        Intrinsics.j(json, "json");
        sVar.concurrentHandlerHolder.getCoreHandler().b(new Runnable() { // from class: na.n
            @Override // java.lang.Runnable
            public final void run() {
                s.q(json, sVar);
            }
        });
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(JSONObject jSONObject, s sVar) {
        String strD = I9.i.d(jSONObject, "text");
        if (strD != null) {
            sVar.clipboardManager.setPrimaryClip(ClipData.newPlainText("copiedFromInapp", strD));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(final s sVar, String str, JSONObject jSONObject) {
        Intrinsics.j(jSONObject, "<unused var>");
        sVar.concurrentHandlerHolder.h(new Runnable() { // from class: na.p
            @Override // java.lang.Runnable
            public final void run() {
                s.s(this.f152141a);
            }
        });
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(final s sVar, final String str, JSONObject jSONObject) {
        Intrinsics.j(jSONObject, "<unused var>");
        if (sVar.getInAppMetaData() != null && str != null) {
            sVar.concurrentHandlerHolder.getCoreHandler().b(new Runnable() { // from class: na.q
                @Override // java.lang.Runnable
                public final void run() {
                    s.u(this.f152142a, str);
                }
            });
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(s sVar, String str) {
        g9.c<ButtonClicked, g9.d> cVar = sVar.buttonClickedRepository;
        InAppMetaData inAppMetaData = sVar.getInAppMetaData();
        Intrinsics.g(inAppMetaData);
        cVar.add(new ButtonClicked(inAppMetaData.getCampaignId(), str, sVar.timestampProvider.a()));
        InAppMetaData inAppMetaData2 = sVar.getInAppMetaData();
        Intrinsics.g(inAppMetaData2);
        Map<String, String> mapR = MapsKt.r(TuplesKt.a("campaignId", inAppMetaData2.getCampaignId()), TuplesKt.a("buttonId", str));
        InAppMetaData inAppMetaData3 = sVar.getInAppMetaData();
        Intrinsics.g(inAppMetaData3);
        if (inAppMetaData3.getSid() != null) {
            InAppMetaData inAppMetaData4 = sVar.getInAppMetaData();
            Intrinsics.g(inAppMetaData4);
            String sid = inAppMetaData4.getSid();
            Intrinsics.h(sid, "null cannot be cast to non-null type kotlin.String");
            mapR.put("sid", sid);
        }
        InAppMetaData inAppMetaData5 = sVar.getInAppMetaData();
        Intrinsics.g(inAppMetaData5);
        if (inAppMetaData5.getUrl() != null) {
            InAppMetaData inAppMetaData6 = sVar.getInAppMetaData();
            Intrinsics.g(inAppMetaData6);
            String url = inAppMetaData6.getUrl();
            Intrinsics.h(url, "null cannot be cast to non-null type kotlin.String");
            mapR.put("url", url);
        }
        sVar.inAppInternal.b("inapp:click", mapR, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(final s sVar, final String str, final JSONObject json) {
        Intrinsics.j(json, "json");
        sVar.concurrentHandlerHolder.getCoreHandler().b(new Runnable() { // from class: na.r
            @Override // java.lang.Runnable
            public final void run() {
                s.w(json, sVar, str);
            }
        });
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(JSONObject jSONObject, s sVar, String str) {
        LinkedHashMap linkedHashMap;
        Iterator<String> itKeys;
        Sequence<String> sequenceH;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("payload");
        if (jSONObjectOptJSONObject == null || (itKeys = jSONObjectOptJSONObject.keys()) == null || (sequenceH = SequencesKt.h(itKeys)) == null) {
            linkedHashMap = null;
        } else {
            linkedHashMap = new LinkedHashMap();
            for (String str2 : sequenceH) {
                linkedHashMap.put(str2, jSONObjectOptJSONObject.getString(str2));
            }
        }
        ka.f fVar = sVar.inAppInternal;
        Intrinsics.g(str);
        fVar.c(str, linkedHashMap, null);
    }

    public void A(InAppMetaData inAppMetaData) {
        this.inAppMetaData = inAppMetaData;
    }

    public Function2<String, JSONObject, Unit> m(a command) throws RuntimeException {
        Intrinsics.j(command, "command");
        switch (b.$EnumSwitchMapping$0[command.ordinal()]) {
            case 1:
                return new Function2() { // from class: na.i
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s.n(this.f152131a, (String) obj, (JSONObject) obj2);
                    }
                };
            case 2:
                return new Function2() { // from class: na.j
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s.r(this.f152132a, (String) obj, (JSONObject) obj2);
                    }
                };
            case 3:
                return new Function2() { // from class: na.k
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s.t(this.f152133a, (String) obj, (JSONObject) obj2);
                    }
                };
            case 4:
                return new c();
            case 5:
                return new Function2() { // from class: na.l
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s.v(this.f152134a, (String) obj, (JSONObject) obj2);
                    }
                };
            case 6:
                return new Function2() { // from class: na.m
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s.p(this.f152135a, (String) obj, (JSONObject) obj2);
                    }
                };
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: x, reason: from getter */
    public InAppMetaData getInAppMetaData() {
        return this.inAppMetaData;
    }

    public Function2<String, JSONObject, Unit> y() {
        return this.onAppEventTriggered;
    }

    public Function0<Unit> z() {
        return this.onCloseTriggered;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(s sVar, String str, JSONObject jSONObject) {
        Function2<String, JSONObject, Unit> function2Y = sVar.y();
        if (function2Y != null) {
            function2Y.invoke(str, jSONObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(s sVar) {
        Function0<Unit> function0Z = sVar.z();
        if (function0Z != null) {
            function0Z.invoke();
        }
    }
}
