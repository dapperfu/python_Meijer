package fi;

import Kk.AppVersion;
import Vd.AbstractC5516j;
import Vd.InterfaceC5511e;
import android.app.Application;
import android.content.Context;
import com.adobe.marketing.mobile.A;
import com.adobe.marketing.mobile.AbstractC6578l;
import com.adobe.marketing.mobile.B;
import com.adobe.marketing.mobile.C6569c;
import com.adobe.marketing.mobile.C6570d;
import com.adobe.marketing.mobile.C6571e;
import com.adobe.marketing.mobile.C6572f;
import com.adobe.marketing.mobile.C6573g;
import com.adobe.marketing.mobile.InterfaceC6543a;
import com.adobe.marketing.mobile.InterfaceC6568b;
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
import mv.AbstractC15779K;
import zl.k;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B?\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lfi/c;", "Lfi/f;", "Landroid/content/Context;", "application", "Lzl/k;", "featureManager", "Lcom/google/firebase/messaging/FirebaseMessaging;", "firebaseMessaging", "LKk/a;", "appVersion", "", "adobeEnterprisePlatformAppId", "Lmv/K;", "ioDispatcher", "<init>", "(Landroid/content/Context;Lzl/k;Lcom/google/firebase/messaging/FirebaseMessaging;LKk/a;Ljava/lang/String;Lmv/K;)V", "", "e", "()V", "token", "d", "(Ljava/lang/String;)V", "a", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "b", "Lzl/k;", "c", "Lcom/google/firebase/messaging/FirebaseMessaging;", "LKk/a;", "Ljava/lang/String;", "f", "Lmv/K;", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: fi.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C13998c implements InterfaceC14001f {

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
    private final AbstractC15779K ioDispatcher;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"fi/c$a", "Lcom/adobe/marketing/mobile/b;", "", PreferencesHelper.PREF_ID, "", "c", "(Ljava/lang/String;)V", "Lcom/adobe/marketing/mobile/c;", "p0", "b", "(Lcom/adobe/marketing/mobile/c;)V", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: fi.c$a */
    public static final class a implements InterfaceC6568b<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Continuation<String> f131725a;

        /* JADX WARN: Multi-variable type inference failed */
        a(Continuation<? super String> continuation) {
            this.f131725a = continuation;
        }

        @Override // com.adobe.marketing.mobile.InterfaceC6568b
        public void b(C6569c p02) {
            Intrinsics.j(p02, "p0");
            qw.a.INSTANCE.e(new IllegalStateException("AdobeError(errorName=" + p02.b() + ", errorCode=" + p02.a() + ')'));
            this.f131725a.resumeWith(Result.b(null));
        }

        @Override // com.adobe.marketing.mobile.InterfaceC6543a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(String id2) {
            Intrinsics.j(id2, "id");
            this.f131725a.resumeWith(Result.b(id2));
        }
    }

    public C13998c(Context application, k featureManager, FirebaseMessaging firebaseMessaging, AppVersion appVersion, String adobeEnterprisePlatformAppId, AbstractC15779K ioDispatcher) {
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
        qw.a.INSTANCE.a("AEP Mobile SDK is initialized.", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(C13998c c13998c, AbstractC5516j task) {
        Intrinsics.j(task, "task");
        if (task.r()) {
            String str = (String) task.n();
            Intrinsics.g(str);
            if (StringsKt.s0(str)) {
                return;
            }
            c13998c.d(str);
        }
    }

    @Override // fi.InterfaceC14001f
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
        qw.a.INSTANCE.a("Firebase instanceId: %s", token);
    }

    public final void e() {
        Context context = this.application;
        Intrinsics.h(context, "null cannot be cast to non-null type android.app.Application");
        B.p((Application) context);
        B.q((this.appVersion.getIsDevMode() || this.appVersion.getIsDebug()) ? A.VERBOSE : A.ERROR);
        Class<? extends AbstractC6578l> cls = C6572f.f63313a;
        Class<? extends AbstractC6578l> cls2 = C6570d.f63311a;
        Class<? extends AbstractC6578l> cls3 = C6573g.f63314a;
        Class<? extends AbstractC6578l> cls4 = M.f62863a;
        Class<? extends AbstractC6578l> cls5 = r.f63497a;
        Class<? extends AbstractC6578l> cls6 = t.f63502a;
        Class<? extends AbstractC6578l> cls7 = J.f62859a;
        Class<? extends AbstractC6578l> cls8 = L.f62860a;
        Class<? extends AbstractC6578l> cls9 = C6571e.f63312a;
        if (Intrinsics.e(this.appVersion.getEnvironment(), "playstore")) {
            cls9 = null;
        }
        List listR = CollectionsKt.r(cls, cls2, cls3, cls4, cls5, cls6, cls7, cls8, cls9);
        B.d(this.adobeEnterprisePlatformAppId);
        B.n(listR, new InterfaceC6543a() { // from class: fi.a
            @Override // com.adobe.marketing.mobile.InterfaceC6543a
            public final void a(Object obj) {
                C13998c.f(obj);
            }
        });
        this.firebaseMessaging.s().c(new InterfaceC5511e() { // from class: fi.b
            @Override // Vd.InterfaceC5511e
            public final void onComplete(AbstractC5516j abstractC5516j) {
                C13998c.g(this.f131718a, abstractC5516j);
            }
        });
    }
}
