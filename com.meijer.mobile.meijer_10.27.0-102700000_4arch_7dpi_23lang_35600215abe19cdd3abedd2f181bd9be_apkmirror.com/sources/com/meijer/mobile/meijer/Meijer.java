package com.meijer.mobile.meijer;

import Jk.AppVersion;
import Tq.PointOfService;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.format.DateFormat;
import androidx.work.a;
import ci.StoreAddress;
import com.fullstory.FS;
import com.fullstory.FSOnReadyListener;
import com.fullstory.FSSessionData;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.messaging.FirebaseMessaging;
import com.medallia.digital.mobilesdk.MDExternalError;
import com.medallia.digital.mobilesdk.MDResultCallback;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import com.meijer.mobile.meijer.Meijer;
import com.meijer.mobile.models.account.MPerksAccountManager;
import ei.C13666c;
import gi.InterfaceC14261a;
import gv.C14313a;
import hi.C14476c;
import hi.TrackingData;
import io.reactivex.exceptions.UndeliverableException;
import j5.InterfaceC14857c;
import java.io.IOException;
import java.lang.Thread;
import java.net.SocketException;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import qv.AbstractC16618K;
import qv.C16644i;
import qv.C16648k;
import qv.InterfaceC16622O;
import tv.C17154h;
import tv.InterfaceC17153g;
import uw.a;
import wj.C17828d;
import wm.C17838h;
import yl.AbstractC18227f;
import yo.C18264a;
import yo.MeijerUser;

@Metadata(d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u0092\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002Û\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u001d\u0010\u0012\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0005J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010?\u001a\u0002088\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010G\u001a\u00020@8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\"\u0010O\u001a\u00020H8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR(\u0010X\u001a\u00020P8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\bQ\u0010R\u0012\u0004\bW\u0010\u0005\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR(\u0010a\u001a\u00020Y8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\bZ\u0010[\u0012\u0004\b`\u0010\u0005\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R(\u0010j\u001a\u00020b8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\bc\u0010d\u0012\u0004\bi\u0010\u0005\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010r\u001a\u00020k8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010y\u001a\u00020s8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\n\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR#\u0010\u0080\u0001\u001a\u00020z8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u0016\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR)\u0010\u0087\u0001\u001a\u00030\u0081\u00018\u0000@\u0000X\u0081.¢\u0006\u0017\n\u0005\b\u0015\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R)\u0010\u008e\u0001\u001a\u00030\u0088\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\b\b\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R*\u0010\u0096\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u0010\u009e\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R*\u0010¦\u0001\u001a\u00030\u009f\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b \u0001\u0010¡\u0001\u001a\u0006\b¢\u0001\u0010£\u0001\"\u0006\b¤\u0001\u0010¥\u0001R)\u0010\u00ad\u0001\u001a\u00030§\u00018\u0000@\u0000X\u0081.¢\u0006\u0017\n\u0005\b\t\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R0\u0010µ\u0001\u001a\u00030®\u00018\u0000@\u0000X\u0081.¢\u0006\u001e\n\u0005\b|\u0010¯\u0001\u0012\u0005\b´\u0001\u0010\u0005\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R*\u0010¼\u0001\u001a\u00030¶\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001R*\u0010Ã\u0001\u001a\u00030½\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\b¾\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R*\u0010Ë\u0001\u001a\u00030Ä\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\bÅ\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001\"\u0006\bÉ\u0001\u0010Ê\u0001R*\u0010Ñ\u0001\u001a\u00030Ì\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b©\u0001\u0010Í\u0001\u001a\u0006\bÅ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R\u0017\u0010Ô\u0001\u001a\u00030Ò\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bC\u0010Ó\u0001R!\u0010Ù\u0001\u001a\u00030Õ\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¸\u0001\u0010Ö\u0001\u001a\u0006\b×\u0001\u0010Ø\u0001R\u0018\u0010Ý\u0001\u001a\u00030Ú\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÛ\u0001\u0010Ü\u0001¨\u0006Þ\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/Meijer;", "Landroid/app/Application;", "Landroidx/work/a$c;", "Lcom/fullstory/FSOnReadyListener;", "<init>", "()V", "", "Q", "p", "t", "m", "T", "W", "O", "P", "Ltk/c;", "LTq/c;", "pointOfServiceResource", "S", "(Ltk/c;)V", "R", "o", "n", "onCreate", "", "level", "onTrimMemory", "(I)V", "Lcom/fullstory/FSSessionData;", "sessionData", "onReady", "(Lcom/fullstory/FSSessionData;)V", "Lcom/meijer/mobile/models/account/MPerksAccountManager;", "c", "Lcom/meijer/mobile/models/account/MPerksAccountManager;", "J", "()Lcom/meijer/mobile/models/account/MPerksAccountManager;", "setMPerksAccountManager", "(Lcom/meijer/mobile/models/account/MPerksAccountManager;)V", "mPerksAccountManager", "Lyo/k;", "d", "Lyo/k;", "M", "()Lyo/k;", "setUserManager", "(Lyo/k;)V", "userManager", "Lyo/a;", "e", "Lyo/a;", "getAppPrefManager", "()Lyo/a;", "setAppPrefManager", "(Lyo/a;)V", "appPrefManager", "Lyo/f;", "f", "Lyo/f;", "L", "()Lyo/f;", "setStoreManager", "(Lyo/f;)V", "storeManager", "Lhl/m;", "g", "Lhl/m;", "z", "()Lhl/m;", "setCartRepository", "(Lhl/m;)V", "cartRepository", "Lyl/k;", "h", "Lyl/k;", "E", "()Lyl/k;", "setFeatureManager", "(Lyl/k;)V", "featureManager", "LQn/P;", "i", "LQn/P;", "getGeoFenceManager", "()LQn/P;", "setGeoFenceManager", "(LQn/P;)V", "getGeoFenceManager$annotations", "geoFenceManager", "LQn/V;", "j", "LQn/V;", "getPollingManager", "()LQn/V;", "setPollingManager", "(LQn/V;)V", "getPollingManager$annotations", "pollingManager", "Lwm/h;", "k", "Lwm/h;", "getMperksNotificationManager", "()Lwm/h;", "setMperksNotificationManager", "(Lwm/h;)V", "getMperksNotificationManager$annotations", "mperksNotificationManager", "Lwj/d;", "l", "Lwj/d;", "F", "()Lwj/d;", "setFirebaseLoggingUtil", "(Lwj/d;)V", "firebaseLoggingUtil", "Lcom/squareup/picasso/o;", "Lcom/squareup/picasso/o;", "K", "()Lcom/squareup/picasso/o;", "setPicasso", "(Lcom/squareup/picasso/o;)V", "picasso", "Lei/c;", "Lei/c;", "u", "()Lei/c;", "setAdobeManager$Meijer_playstoreRelease", "(Lei/c;)V", "adobeManager", "LQn/I;", "LQn/I;", "G", "()LQn/I;", "setFlyBuyManager$Meijer_playstoreRelease", "(LQn/I;)V", "flyBuyManager", "Lgi/a;", "Lgi/a;", "v", "()Lgi/a;", "setAnalyticsEngine", "(Lgi/a;)V", "analyticsEngine", "Lcom/google/firebase/crashlytics/a;", "q", "Lcom/google/firebase/crashlytics/a;", "B", "()Lcom/google/firebase/crashlytics/a;", "setCrashlytics", "(Lcom/google/firebase/crashlytics/a;)V", "crashlytics", "LP2/a;", "r", "LP2/a;", "N", "()LP2/a;", "setWorkerFactory", "(LP2/a;)V", "workerFactory", "Lcom/meijer/mobile/meijer/p;", "s", "Lcom/meijer/mobile/meijer/p;", "H", "()Lcom/meijer/mobile/meijer/p;", "setFullStoryManager$Meijer_playstoreRelease", "(Lcom/meijer/mobile/meijer/p;)V", "fullStoryManager", "Lqv/O;", "Lqv/O;", "y", "()Lqv/O;", "setApplicationScope$Meijer_playstoreRelease", "(Lqv/O;)V", "applicationScope", "Lqv/K;", "Lqv/K;", "I", "()Lqv/K;", "setIoDispatcher$Meijer_playstoreRelease", "(Lqv/K;)V", "getIoDispatcher$Meijer_playstoreRelease$annotations", "ioDispatcher", "LZ4/h;", "LZ4/h;", "A", "()LZ4/h;", "setCoilImageLoader$Meijer_playstoreRelease", "(LZ4/h;)V", "coilImageLoader", "LOn/a;", "w", "LOn/a;", "()LOn/a;", "setAppIconObserver$Meijer_playstoreRelease", "(LOn/a;)V", "appIconObserver", "LUn/b;", "x", "LUn/b;", "D", "()LUn/b;", "setEmarsysManager$Meijer_playstoreRelease", "(LUn/b;)V", "emarsysManager", "LJk/a;", "LJk/a;", "()LJk/a;", "setAppVersion$Meijer_playstoreRelease", "(LJk/a;)V", "appVersion", "LNu/a;", "LNu/a;", "disposables", "LPn/a;", "Lkotlin/Lazy;", "C", "()LPn/a;", "dynatraceTree", "Landroidx/work/a;", "a", "()Landroidx/work/a;", "workManagerConfiguration", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"NewApi"})
/* loaded from: classes9.dex */
public final class Meijer extends AbstractApplicationC12645t implements a.c, FSOnReadyListener {

    /* renamed from: C, reason: collision with root package name */
    public static final int f98604C = 8;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public MPerksAccountManager mPerksAccountManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public yo.k userManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public C18264a appPrefManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public yo.f storeManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public hl.m cartRepository;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public yl.k featureManager;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public Qn.P geoFenceManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public Qn.V pollingManager;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public C17838h mperksNotificationManager;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public C17828d firebaseLoggingUtil;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public com.squareup.picasso.o picasso;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public C13666c adobeManager;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public Qn.I flyBuyManager;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14261a analyticsEngine;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public com.google.firebase.crashlytics.a crashlytics;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public P2.a workerFactory;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public C12560p fullStoryManager;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public InterfaceC16622O applicationScope;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public AbstractC16618K ioDispatcher;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Z4.h coilImageLoader;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public On.a appIconObserver;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public Un.b emarsysManager;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    public AppVersion appVersion;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Nu.a disposables = new Nu.a();

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    private final Lazy dynatraceTree = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.A
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Meijer.s();
        }
    });

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/meijer/mobile/meijer/Meijer$b", "Lcom/medallia/digital/mobilesdk/MDResultCallback;", "", "onSuccess", "()V", "Lcom/medallia/digital/mobilesdk/MDExternalError;", "error", "onError", "(Lcom/medallia/digital/mobilesdk/MDExternalError;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements MDResultCallback {
        @Override // com.medallia.digital.mobilesdk.MDResultCallback
        public void onError(MDExternalError error) {
            Intrinsics.j(error, "error");
            uw.a.INSTANCE.d(error.getMessage(), new Object[0]);
        }

        @Override // com.medallia.digital.mobilesdk.MDResultCallback
        public void onSuccess() {
            uw.a.INSTANCE.a("MedalliaDigital Initialization", new Object[0]);
        }

        b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.Meijer$initMobileAds$1", f = "Meijer.kt", l = {361}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f98630a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lqv/O;", "", "<anonymous>", "(Lqv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.Meijer$initMobileAds$1$1", f = "Meijer.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class a extends SuspendLambda implements Function2<InterfaceC16622O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f98632a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Meijer f98633b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Meijer meijer, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f98633b = meijer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f98633b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f98632a == 0) {
                    ResultKt.b(obj);
                    a.Companion companion = uw.a.INSTANCE;
                    companion.k("Initializing MobileAds...", new Object[0]);
                    Meijer meijer = this.f98633b;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    MobileAds.a(meijer);
                    companion.k("Finished initializing MobileAds in " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms", new Object[0]);
                    return Unit.f142422a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return Meijer.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC16622O interfaceC16622O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC16622O, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f98630a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AbstractC16618K abstractC16618KI = Meijer.this.I();
                a aVar = new a(Meijer.this, null);
                this.f98630a = 1;
                if (C16644i.g(abstractC16618KI, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f142422a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyo/c;", "user", "", "<anonymous>", "(Lyo/c;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.Meijer$onCreate$1", f = "Meijer.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<MeijerUser, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f98634a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f98635b;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = Meijer.this.new d(continuation);
            dVar.f98635b = obj;
            return dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(MeijerUser meijerUser, TrackingData trackingData) {
            trackingData.h("pushPlatform", "gcm");
            trackingData.h("cusFirstName", meijerUser.getFirstName());
            trackingData.h("cusLastName", meijerUser.getLastName());
            trackingData.h("cusEmail", meijerUser.getEmail());
            return Unit.f142422a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MeijerUser meijerUser, Continuation<? super Unit> continuation) {
            return ((d) create(meijerUser, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f98634a == 0) {
                ResultKt.b(obj);
                final MeijerUser meijerUser = (MeijerUser) this.f98635b;
                Meijer.this.B().i(meijerUser.getExternalShopperId());
                g8.u.c(meijerUser.getExternalShopperId());
                Meijer.this.F().e(meijerUser.getExternalShopperId());
                Meijer.this.v().c(C14476c.a("event: collect PII"), new Function1() { // from class: com.meijer.mobile.meijer.B
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Meijer.d.k(meijerUser, (TrackingData) obj2);
                    }
                });
                if (meijerUser.getRequiresLogin()) {
                    Meijer.this.t();
                }
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ltv/g;", "Lyo/c;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.Meijer$onCreate$2", f = "Meijer.kt", l = {}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function3<InterfaceC17153g<? super MeijerUser>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f98637a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f98638b;

        e(Continuation<? super e> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super MeijerUser> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            e eVar = new e(continuation);
            eVar.f98638b = th2;
            return eVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f98637a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.u((Throwable) this.f98638b, "Failure in userFlow in application", new Object[0]);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltv/g;", "Ltk/c;", "LTq/c;", "", "it", "", "<anonymous>", "(Ltv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.Meijer$onCreate$4", f = "Meijer.kt", l = {}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function3<InterfaceC17153g<? super tk.c<PointOfService>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f98642a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f98643b;

        g(Continuation<? super g> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC17153g<? super tk.c<PointOfService>> interfaceC17153g, Throwable th2, Continuation<? super Unit> continuation) {
            g gVar = new g(continuation);
            gVar.f98643b = th2;
            return gVar.invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f98642a == 0) {
                ResultKt.b(obj);
                uw.a.INSTANCE.u((Throwable) this.f98643b, "Failure in cartStoreFlow from Meijer application", new Object[0]);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(Meijer meijer, boolean z10) {
        if (z10) {
            uw.a.INSTANCE.a("Starting FullStory tracking...", new Object[0]);
            meijer.H().a0();
        } else {
            uw.a.INSTANCE.a("Stopping FullStory tracking...", new Object[0]);
            meijer.H().b0();
        }
        return Unit.f142422a;
    }

    @Override // com.meijer.mobile.meijer.AbstractApplicationC12645t, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        FS.init(this, context);
        super.attachBaseContext(context);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltk/c;", "LTq/c;", "it", "", "<anonymous>", "(Ltk/c;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.Meijer$onCreate$3", f = "Meijer.kt", l = {}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<tk.c<PointOfService>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f98639a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f98640b;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = Meijer.this.new f(continuation);
            fVar.f98640b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(tk.c<PointOfService> cVar, Continuation<? super Unit> continuation) {
            return ((f) create(cVar, continuation)).invokeSuspend(Unit.f142422a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f98639a == 0) {
                ResultKt.b(obj);
                Meijer.this.S((tk.c) this.f98640b);
                return Unit.f142422a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final Pn.a C() {
        return (Pn.a) this.dynatraceTree.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(boolean z10) {
        if (z10) {
            androidx.appcompat.app.f.M(-1);
        } else {
            androidx.appcompat.app.f.M(1);
        }
        return Unit.f142422a;
    }

    private final void m() {
        g8.u.i(this, new k8.k(BuildConfig.DYNATRACE_APPLICATION_ID, "https://bf78653bpp.bf.dynatrace.com/mbeacon").c(true).d(x().getIsDevMode()).a());
    }

    private final void n() {
        uw.a.INSTANCE.k("logging configured. Build version_name=" + x().getVersionName() + ", version=" + BuildConfig.BuildVersion, new Object[0]);
    }

    private final void p() {
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Meijer.q((Throwable) obj);
            }
        };
        C14313a.B(new Pu.g() { // from class: com.meijer.mobile.meijer.v
            @Override // Pu.g
            public final void accept(Object obj) {
                Meijer.r(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(Throwable e10) {
        Intrinsics.j(e10, "e");
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.currentThread().getUncaughtExceptionHandler();
        if (e10 instanceof UndeliverableException) {
            e10 = e10.getCause();
            Intrinsics.g(e10);
            uw.a.INSTANCE.e(e10);
        }
        if ((e10 instanceof IOException) || (e10 instanceof SocketException)) {
            return Unit.f142422a;
        }
        if (e10 instanceof InterruptedException) {
            return Unit.f142422a;
        }
        if ((e10 instanceof NullPointerException) || (e10 instanceof IllegalArgumentException)) {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), e10);
            }
            return Unit.f142422a;
        }
        if (!(e10 instanceof IllegalStateException)) {
            uw.a.INSTANCE.u(e10, "Undeliverable exception received, not sure what to do", new Object[0]);
            return Unit.f142422a;
        }
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), e10);
        }
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Pn.a s() {
        return new Pn.a();
    }

    public final Z4.h A() {
        Z4.h hVar = this.coilImageLoader;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.y("coilImageLoader");
        return null;
    }

    public final com.google.firebase.crashlytics.a B() {
        com.google.firebase.crashlytics.a aVar = this.crashlytics;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.y("crashlytics");
        return null;
    }

    public final Un.b D() {
        Un.b bVar = this.emarsysManager;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.y("emarsysManager");
        return null;
    }

    public final yl.k E() {
        yl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("featureManager");
        return null;
    }

    public final C17828d F() {
        C17828d c17828d = this.firebaseLoggingUtil;
        if (c17828d != null) {
            return c17828d;
        }
        Intrinsics.y("firebaseLoggingUtil");
        return null;
    }

    public final Qn.I G() {
        Qn.I i10 = this.flyBuyManager;
        if (i10 != null) {
            return i10;
        }
        Intrinsics.y("flyBuyManager");
        return null;
    }

    public final C12560p H() {
        C12560p c12560p = this.fullStoryManager;
        if (c12560p != null) {
            return c12560p;
        }
        Intrinsics.y("fullStoryManager");
        return null;
    }

    public final AbstractC16618K I() {
        AbstractC16618K abstractC16618K = this.ioDispatcher;
        if (abstractC16618K != null) {
            return abstractC16618K;
        }
        Intrinsics.y("ioDispatcher");
        return null;
    }

    public final MPerksAccountManager J() {
        MPerksAccountManager mPerksAccountManager = this.mPerksAccountManager;
        if (mPerksAccountManager != null) {
            return mPerksAccountManager;
        }
        Intrinsics.y("mPerksAccountManager");
        return null;
    }

    public final com.squareup.picasso.o K() {
        com.squareup.picasso.o oVar = this.picasso;
        if (oVar != null) {
            return oVar;
        }
        Intrinsics.y("picasso");
        return null;
    }

    public final yo.f L() {
        yo.f fVar = this.storeManager;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.y("storeManager");
        return null;
    }

    public final yo.k M() {
        yo.k kVar = this.userManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.y("userManager");
        return null;
    }

    public final P2.a N() {
        P2.a aVar = this.workerFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.y("workerFactory");
        return null;
    }

    @Override // androidx.work.a.c
    public androidx.work.a a() {
        return new a.C1159a().u(N()).a();
    }

    @Override // com.meijer.mobile.meijer.AbstractApplicationC12645t, android.app.Application
    public void onCreate() throws Exception {
        a.Companion companion = uw.a.INSTANCE;
        companion.w(C());
        companion.w(new Ds.e());
        super.onCreate();
        Z4.a.c(A());
        m();
        n();
        T();
        W();
        FirebaseMessaging.n().y(true);
        companion.a("******* using %s environment *******", x().getEnvironment());
        u().e();
        v().k(DateFormat.is24HourFormat(getApplicationContext()) ? "24 Hour Format" : "12 Hour Format");
        G().E();
        D().h();
        Q();
        o();
        C17154h.J(C17154h.g(C17154h.O(M().E(), new d(null)), new e(null)), y());
        B().i(M().a());
        p();
        R();
        J().startPeriodicPolling();
        if (M().b()) {
            C17154h.J(C17154h.g(C17154h.O(z().A(), new f(null)), new g(null)), y());
        }
        O();
        P();
    }

    @Override // com.fullstory.FSOnReadyListener
    public void onReady(FSSessionData sessionData) {
        if (sessionData != null) {
            uw.a.INSTANCE.x("FullStoryManager").q("FullSessionURL + " + sessionData.getCurrentSessionURL(), new Object[0]);
            B().h("FSsessionURL", sessionData.getCurrentSessionURL());
        }
    }

    public final C13666c u() {
        C13666c c13666c = this.adobeManager;
        if (c13666c != null) {
            return c13666c;
        }
        Intrinsics.y("adobeManager");
        return null;
    }

    public final InterfaceC14261a v() {
        InterfaceC14261a interfaceC14261a = this.analyticsEngine;
        if (interfaceC14261a != null) {
            return interfaceC14261a;
        }
        Intrinsics.y("analyticsEngine");
        return null;
    }

    public final On.a w() {
        On.a aVar = this.appIconObserver;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.y("appIconObserver");
        return null;
    }

    public final AppVersion x() {
        AppVersion appVersion = this.appVersion;
        if (appVersion != null) {
            return appVersion;
        }
        Intrinsics.y("appVersion");
        return null;
    }

    public final InterfaceC16622O y() {
        InterfaceC16622O interfaceC16622O = this.applicationScope;
        if (interfaceC16622O != null) {
            return interfaceC16622O;
        }
        Intrinsics.y("applicationScope");
        return null;
    }

    public final hl.m z() {
        hl.m mVar = this.cartRepository;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.y("cartRepository");
        return null;
    }

    private final void O() {
        MedalliaDigital.setCustomParameter("APP_ENVIRONMENT", x().getEnvironment());
        MedalliaDigital.init(this, BuildConfig.MEDALLIA_SDK_APP_KEY, new b());
    }

    private final void P() {
        if (E().e(AbstractC18227f.C.f170544h)) {
            C16648k.d(y(), null, null, new c(null), 3, null);
        }
    }

    private final void Q() {
        w().a();
    }

    private final void R() {
        int i10 = getResources().getConfiguration().uiMode & 48;
        if (i10 != 16) {
            if (i10 != 32) {
                return;
            }
            F().f("UsesDarkMode", "true");
            return;
        }
        F().f("UsesDarkMode", "false");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(tk.c<PointOfService> pointOfServiceResource) {
        String postalCode;
        PointOfService pointOfServiceA = pointOfServiceResource.a();
        if (pointOfServiceA != null) {
            StoreAddress address = pointOfServiceA.getAddress();
            yo.f fVarL = L();
            yo.d dVar = yo.d.f170814b;
            int storeId = pointOfServiceA.getStoreId();
            String displayName = pointOfServiceA.getDisplayName();
            if (address != null) {
                postalCode = address.getPostalCode();
            } else {
                postalCode = null;
            }
            yo.f.q(fVarL, dVar, storeId, displayName, postalCode, null, 16, null);
            B().g("CART_STORE_ID", pointOfServiceA.getStoreId());
            return;
        }
        L().j(yo.d.f170814b);
        B().h("CART_STORE_ID", "");
    }

    private final void T() {
        if (x().getIsDevMode()) {
            io.reactivex.l<Boolean> lVarF = E().f(AbstractC18227f.C18243q.f170596h);
            final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Meijer.U(((Boolean) obj).booleanValue());
                }
            };
            Ck.a.a(lVarF.subscribe(new Pu.g() { // from class: com.meijer.mobile.meijer.x
                @Override // Pu.g
                public final void accept(Object obj) {
                    Meijer.V(function1, obj);
                }
            }), this.disposables);
            return;
        }
        androidx.appcompat.app.f.M(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void W() {
        io.reactivex.l<Boolean> lVarF = E().f(AbstractC18227f.B.f170543h);
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Meijer.X(this.f113517a, ((Boolean) obj).booleanValue());
            }
        };
        Ck.a.a(lVarF.subscribe(new Pu.g() { // from class: com.meijer.mobile.meijer.z
            @Override // Pu.g
            public final void accept(Object obj) {
                Meijer.Y(function1, obj);
            }
        }), this.disposables);
        H().Z(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void o() {
        com.squareup.picasso.o.k(K());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        if (M().b()) {
            startActivity(Al.k.f672a.e(this, true).addFlags(872415232));
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        InterfaceC14857c interfaceC14857cE = A().e();
        if (interfaceC14857cE != null) {
            interfaceC14857cE.a(level);
        }
    }
}
