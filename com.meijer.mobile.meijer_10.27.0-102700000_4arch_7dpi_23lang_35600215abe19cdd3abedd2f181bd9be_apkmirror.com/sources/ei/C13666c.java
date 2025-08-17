package ei;

import Jk.AppVersion;
import Td.AbstractC5232j;
import Td.InterfaceC5227e;
import android.app.Application;
import android.content.Context;
import com.adobe.marketing.mobile.A;
import com.adobe.marketing.mobile.AbstractC6453l;
import com.adobe.marketing.mobile.B;
import com.adobe.marketing.mobile.C6444c;
import com.adobe.marketing.mobile.C6445d;
import com.adobe.marketing.mobile.C6446e;
import com.adobe.marketing.mobile.C6447f;
import com.adobe.marketing.mobile.C6448g;
import com.adobe.marketing.mobile.InterfaceC6418a;
import com.adobe.marketing.mobile.InterfaceC6443b;
import com.adobe.marketing.mobile.J;
import com.adobe.marketing.mobile.L;
import com.adobe.marketing.mobile.M;
import com.adobe.marketing.mobile.r;
import com.adobe.marketing.mobile.t;
import com.google.firebase.messaging.FirebaseMessaging;
import io.constructor.data.local.PreferencesHelper;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import qv.AbstractC16618K;
import yl.k;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lei/c;", "Lei/f;", "Landroid/content/Context;", "application", "Lyl/k;", "featureManager", "Lcom/google/firebase/messaging/FirebaseMessaging;", "firebaseMessaging", "LJk/a;", "appVersion", "", "adobeEnterprisePlatformAppId", "Lqv/K;", "ioDispatcher", "<init>", "(Landroid/content/Context;Lyl/k;Lcom/google/firebase/messaging/FirebaseMessaging;LJk/a;Ljava/lang/String;Lqv/K;)V", "", "e", "()V", "token", "d", "(Ljava/lang/String;)V", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "b", "Lyl/k;", "c", "Lcom/google/firebase/messaging/FirebaseMessaging;", "LJk/a;", "Ljava/lang/String;", "f", "Lqv/K;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: ei.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C13666c implements InterfaceC13669f {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context application;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k featureManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final FirebaseMessaging firebaseMessaging;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AppVersion appVersion;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String adobeEnterprisePlatformAppId;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final AbstractC16618K ioDispatcher;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"ei/c$a", "Lcom/adobe/marketing/mobile/b;", "", PreferencesHelper.PREF_ID, "", "c", "(Ljava/lang/String;)V", "Lcom/adobe/marketing/mobile/c;", "p0", "b", "(Lcom/adobe/marketing/mobile/c;)V", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ei.c$a */
    public static final class a implements InterfaceC6443b<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation<String> f128736a;

        /* JADX WARN: Multi-variable type inference failed */
        a(Continuation<? super String> continuation) {
            this.f128736a = continuation;
        }

        @Override // com.adobe.marketing.mobile.InterfaceC6443b
        public void b(C6444c p02) {
            Intrinsics.j(p02, "p0");
            uw.a.INSTANCE.e(new IllegalStateException("AdobeError(errorName=" + p02.b() + ", errorCode=" + p02.a() + ')'));
            this.f128736a.resumeWith(Result.b(null));
        }

        @Override // com.adobe.marketing.mobile.InterfaceC6418a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(String id2) {
            Intrinsics.j(id2, "id");
            this.f128736a.resumeWith(Result.b(id2));
        }
    }

    public C13666c(Context application, k featureManager, FirebaseMessaging firebaseMessaging, AppVersion appVersion, String adobeEnterprisePlatformAppId, AbstractC16618K ioDispatcher) {
        Intrinsics.j(application, "application");
        Intrinsics.j(featureManager, "featureManager");
        Intrinsics.j(firebaseMessaging, "firebaseMessaging");
        Intrinsics.j(appVersion, "appVersion");
        Intrinsics.j(adobeEnterprisePlatformAppId, "adobeEnterprisePlatformAppId");
        Intrinsics.j(ioDispatcher, "ioDispatcher");
        this.application = application;
        this.featureManager = featureManager;
        this.firebaseMessaging = firebaseMessaging;
        this.appVersion = appVersion;
        this.adobeEnterprisePlatformAppId = adobeEnterprisePlatformAppId;
        this.ioDispatcher = ioDispatcher;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Object obj) {
        uw.a.INSTANCE.a("AEP Mobile SDK is initialized.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C13666c c13666c, AbstractC5232j task) {
        Intrinsics.j(task, "task");
        if (task.r()) {
            String str = (String) task.n();
            Intrinsics.g(str);
            if (StringsKt.r0(str)) {
                return;
            }
            c13666c.d(str);
        }
    }

    @Override // ei.InterfaceC13669f
    public Object a(Continuation<? super String> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        r.d(new a(safeContinuation));
        Object objB = safeContinuation.b();
        if (objB == IntrinsicsKt.f()) {
            DebugProbesKt.c(continuation);
        }
        return objB;
    }

    public final void d(String token) {
        Intrinsics.j(token, "token");
        B.r(token);
        uw.a.INSTANCE.a("Firebase instanceId: %s", token);
    }

    public final void e() {
        Context context = this.application;
        Intrinsics.h(context, "null cannot be cast to non-null type android.app.Application");
        B.p((Application) context);
        B.q((this.appVersion.getIsDevMode() || this.appVersion.getIsDebug()) ? A.VERBOSE : A.ERROR);
        Class<? extends AbstractC6453l> cls = C6447f.f62474a;
        Class<? extends AbstractC6453l> cls2 = C6445d.f62472a;
        Class<? extends AbstractC6453l> cls3 = C6448g.f62475a;
        Class<? extends AbstractC6453l> cls4 = M.f62024a;
        Class<? extends AbstractC6453l> cls5 = r.f62658a;
        Class<? extends AbstractC6453l> cls6 = t.f62663a;
        Class<? extends AbstractC6453l> cls7 = J.f62020a;
        Class<? extends AbstractC6453l> cls8 = L.f62021a;
        Class<? extends AbstractC6453l> cls9 = C6446e.f62473a;
        if (Intrinsics.e(this.appVersion.getEnvironment(), "playstore")) {
            cls9 = null;
        }
        List listR = CollectionsKt.r(cls, cls2, cls3, cls4, cls5, cls6, cls7, cls8, cls9);
        B.d(this.adobeEnterprisePlatformAppId);
        B.n(listR, new InterfaceC6418a() { // from class: ei.a
            @Override // com.adobe.marketing.mobile.InterfaceC6418a
            public final void a(Object obj) {
                C13666c.f(obj);
            }
        });
        this.firebaseMessaging.q().c(new InterfaceC5227e() { // from class: ei.b
            @Override // Td.InterfaceC5227e
            public final void onComplete(AbstractC5232j abstractC5232j) {
                C13666c.g(this.f128729a, abstractC5232j);
            }
        });
    }
}
