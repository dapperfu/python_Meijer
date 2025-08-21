package com.meijer.mobile.meijer;

import Kk.AppVersion;
import Tq.PointOfService;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.format.DateFormat;
import androidx.work.a;
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
import cv.C13558a;
import di.StoreAddress;
import fi.C13998c;
import hi.InterfaceC14523a;
import ii.C14756c;
import ii.TrackingData;
import io.reactivex.exceptions.UndeliverableException;
import java.io.IOException;
import java.lang.Thread;
import java.net.SocketException;
import k5.InterfaceC15089c;
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
import mv.AbstractC15779K;
import mv.C15805i;
import mv.C15809k;
import mv.InterfaceC15783O;
import pv.C16563h;
import pv.InterfaceC16562g;
import qw.a;
import xj.C18187d;
import xm.C18197h;
import yo.C18335a;
import yo.MeijerUser;
import zl.AbstractC18503f;

@Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u008a\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002Ó\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0005J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0005J\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0005J\u001d\u0010\u0012\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0005J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0005J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR(\u0010W\u001a\u00020O8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\bP\u0010Q\u0012\u0004\bV\u0010\u0005\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR(\u0010`\u001a\u00020X8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\bY\u0010Z\u0012\u0004\b_\u0010\u0005\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R(\u0010i\u001a\u00020a8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\bb\u0010c\u0012\u0004\bh\u0010\u0005\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010q\u001a\u00020j8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010x\u001a\u00020r8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\n\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\"\u0010\u007f\u001a\u00020y8\u0000@\u0000X\u0081.¢\u0006\u0012\n\u0004\b\u0015\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R)\u0010\u0086\u0001\u001a\u00030\u0080\u00018\u0006@\u0006X\u0087.¢\u0006\u0017\n\u0005\b\b\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R*\u0010\u008e\u0001\u001a\u00030\u0087\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R*\u0010\u0096\u0001\u001a\u00030\u008f\u00018\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R*\u0010\u009e\u0001\u001a\u00030\u0097\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R)\u0010¥\u0001\u001a\u00030\u009f\u00018\u0000@\u0000X\u0081.¢\u0006\u0017\n\u0005\b\t\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0006\b£\u0001\u0010¤\u0001R0\u0010\u00ad\u0001\u001a\u00030¦\u00018\u0000@\u0000X\u0081.¢\u0006\u001e\n\u0005\bt\u0010§\u0001\u0012\u0005\b¬\u0001\u0010\u0005\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R*\u0010´\u0001\u001a\u00030®\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010¯\u0001\u001a\u0006\b°\u0001\u0010±\u0001\"\u0006\b²\u0001\u0010³\u0001R*\u0010»\u0001\u001a\u00030µ\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b¶\u0001\u0010·\u0001\u001a\u0006\b¶\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R*\u0010Ã\u0001\u001a\u00030¼\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R*\u0010É\u0001\u001a\u00030Ä\u00018\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0006\b¡\u0001\u0010Å\u0001\u001a\u0006\b½\u0001\u0010Æ\u0001\"\u0006\bÇ\u0001\u0010È\u0001R\u0017\u0010Ì\u0001\u001a\u00030Ê\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bB\u0010Ë\u0001R!\u0010Ñ\u0001\u001a\u00030Í\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b°\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001R\u0018\u0010Õ\u0001\u001a\u00030Ò\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÓ\u0001\u0010Ô\u0001¨\u0006Ö\u0001"}, d2 = {"Lcom/meijer/mobile/meijer/Meijer;", "Landroid/app/Application;", "Landroidx/work/a$c;", "Lcom/fullstory/FSOnReadyListener;", "<init>", "()V", "", "O", "o", "s", "m", "R", "U", "M", "N", "Luk/c;", "LTq/c;", "pointOfServiceResource", "Q", "(Luk/c;)V", "P", "n", "onCreate", "", "level", "onTrimMemory", "(I)V", "Lcom/fullstory/FSSessionData;", "sessionData", "onReady", "(Lcom/fullstory/FSSessionData;)V", "Lcom/meijer/mobile/models/account/MPerksAccountManager;", "c", "Lcom/meijer/mobile/models/account/MPerksAccountManager;", "I", "()Lcom/meijer/mobile/models/account/MPerksAccountManager;", "setMPerksAccountManager", "(Lcom/meijer/mobile/models/account/MPerksAccountManager;)V", "mPerksAccountManager", "Lyo/k;", "d", "Lyo/k;", "K", "()Lyo/k;", "setUserManager", "(Lyo/k;)V", "userManager", "Lyo/a;", "e", "Lyo/a;", "getAppPrefManager", "()Lyo/a;", "setAppPrefManager", "(Lyo/a;)V", "appPrefManager", "Lyo/f;", "f", "Lyo/f;", "J", "()Lyo/f;", "setStoreManager", "(Lyo/f;)V", "storeManager", "Lil/m;", "g", "Lil/m;", "y", "()Lil/m;", "setCartRepository", "(Lil/m;)V", "cartRepository", "Lzl/k;", "h", "Lzl/k;", "D", "()Lzl/k;", "setFeatureManager", "(Lzl/k;)V", "featureManager", "LRn/P;", "i", "LRn/P;", "getGeoFenceManager", "()LRn/P;", "setGeoFenceManager", "(LRn/P;)V", "getGeoFenceManager$annotations", "geoFenceManager", "LRn/V;", "j", "LRn/V;", "getPollingManager", "()LRn/V;", "setPollingManager", "(LRn/V;)V", "getPollingManager$annotations", "pollingManager", "Lxm/h;", "k", "Lxm/h;", "getMperksNotificationManager", "()Lxm/h;", "setMperksNotificationManager", "(Lxm/h;)V", "getMperksNotificationManager$annotations", "mperksNotificationManager", "Lxj/d;", "l", "Lxj/d;", "E", "()Lxj/d;", "setFirebaseLoggingUtil", "(Lxj/d;)V", "firebaseLoggingUtil", "Lfi/c;", "Lfi/c;", "t", "()Lfi/c;", "setAdobeManager$Meijer_playstoreRelease", "(Lfi/c;)V", "adobeManager", "LRn/I;", "LRn/I;", "F", "()LRn/I;", "setFlyBuyManager$Meijer_playstoreRelease", "(LRn/I;)V", "flyBuyManager", "Lhi/a;", "Lhi/a;", "u", "()Lhi/a;", "setAnalyticsEngine", "(Lhi/a;)V", "analyticsEngine", "Lcom/google/firebase/crashlytics/a;", "p", "Lcom/google/firebase/crashlytics/a;", "A", "()Lcom/google/firebase/crashlytics/a;", "setCrashlytics", "(Lcom/google/firebase/crashlytics/a;)V", "crashlytics", "LP2/a;", "q", "LP2/a;", "L", "()LP2/a;", "setWorkerFactory", "(LP2/a;)V", "workerFactory", "Lcom/meijer/mobile/meijer/p;", "r", "Lcom/meijer/mobile/meijer/p;", "G", "()Lcom/meijer/mobile/meijer/p;", "setFullStoryManager$Meijer_playstoreRelease", "(Lcom/meijer/mobile/meijer/p;)V", "fullStoryManager", "Lmv/O;", "Lmv/O;", "x", "()Lmv/O;", "setApplicationScope$Meijer_playstoreRelease", "(Lmv/O;)V", "applicationScope", "Lmv/K;", "Lmv/K;", "H", "()Lmv/K;", "setIoDispatcher$Meijer_playstoreRelease", "(Lmv/K;)V", "getIoDispatcher$Meijer_playstoreRelease$annotations", "ioDispatcher", "La5/h;", "La5/h;", "z", "()La5/h;", "setCoilImageLoader$Meijer_playstoreRelease", "(La5/h;)V", "coilImageLoader", "LPn/a;", "v", "LPn/a;", "()LPn/a;", "setAppIconObserver$Meijer_playstoreRelease", "(LPn/a;)V", "appIconObserver", "LVn/b;", "w", "LVn/b;", "C", "()LVn/b;", "setEmarsysManager$Meijer_playstoreRelease", "(LVn/b;)V", "emarsysManager", "LKk/a;", "LKk/a;", "()LKk/a;", "setAppVersion$Meijer_playstoreRelease", "(LKk/a;)V", "appVersion", "LJu/a;", "LJu/a;", "disposables", "LQn/a;", "Lkotlin/Lazy;", "B", "()LQn/a;", "dynatraceTree", "Landroidx/work/a;", "a", "()Landroidx/work/a;", "workManagerConfiguration", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"NewApi"})
/* loaded from: classes10.dex */
public final class Meijer extends AbstractApplicationC12771t implements a.c, FSOnReadyListener {

    /* renamed from: B, reason: collision with root package name */
    public static final int f99462B = 8;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public MPerksAccountManager mPerksAccountManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public yo.k userManager;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public C18335a appPrefManager;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public yo.f storeManager;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public il.m cartRepository;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public zl.k featureManager;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public Rn.P geoFenceManager;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    public Rn.V pollingManager;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    public C18197h mperksNotificationManager;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    public C18187d firebaseLoggingUtil;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public C13998c adobeManager;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public Rn.I flyBuyManager;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public InterfaceC14523a analyticsEngine;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public com.google.firebase.crashlytics.a crashlytics;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public P2.a workerFactory;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public C12686p fullStoryManager;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public InterfaceC15783O applicationScope;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public AbstractC15779K ioDispatcher;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public a5.h coilImageLoader;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public Pn.a appIconObserver;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public Vn.b emarsysManager;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public AppVersion appVersion;

    /* renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final Ju.a disposables = new Ju.a();

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final Lazy dynatraceTree = LazyKt.b(new Function0() { // from class: com.meijer.mobile.meijer.A
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Meijer.r();
        }
    });

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/meijer/mobile/meijer/Meijer$b", "Lcom/medallia/digital/mobilesdk/MDResultCallback;", "", "onSuccess", "()V", "Lcom/medallia/digital/mobilesdk/MDExternalError;", "error", "onError", "(Lcom/medallia/digital/mobilesdk/MDExternalError;)V", "Meijer_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements MDResultCallback {
        @Override // com.medallia.digital.mobilesdk.MDResultCallback
        public void onError(MDExternalError error) {
            Intrinsics.j(error, "error");
            qw.a.INSTANCE.d(error.getMessage(), new Object[0]);
        }

        @Override // com.medallia.digital.mobilesdk.MDResultCallback
        public void onSuccess() {
            qw.a.INSTANCE.a("MedalliaDigital Initialization", new Object[0]);
        }

        b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.Meijer$initMobileAds$1", f = "Meijer.kt", l = {355}, m = "invokeSuspend")
    static final class c extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f99487a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lmv/O;", "", "<anonymous>", "(Lmv/O;)V"}, k = 3, mv = {2, 1, 0})
        @DebugMetadata(c = "com.meijer.mobile.meijer.Meijer$initMobileAds$1$1", f = "Meijer.kt", l = {}, m = "invokeSuspend")
        @SourceDebugExtension
        static final class a extends SuspendLambda implements Function2<InterfaceC15783O, Continuation<? super Unit>, Object> {

            /* renamed from: a, reason: collision with root package name */
            int f99489a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Meijer f99490b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Meijer meijer, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f99490b = meijer;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f99490b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
                return ((a) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.f();
                if (this.f99489a == 0) {
                    ResultKt.b(obj);
                    a.Companion companion = qw.a.INSTANCE;
                    companion.k("Initializing MobileAds...", new Object[0]);
                    Meijer meijer = this.f99490b;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    MobileAds.a(meijer);
                    companion.k("Finished initializing MobileAds in " + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms", new Object[0]);
                    return Unit.f143329a;
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
        public final Object invoke(InterfaceC15783O interfaceC15783O, Continuation<? super Unit> continuation) {
            return ((c) create(interfaceC15783O, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objF = IntrinsicsKt.f();
            int i10 = this.f99487a;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.b(obj);
                AbstractC15779K abstractC15779KH = Meijer.this.H();
                a aVar = new a(Meijer.this, null);
                this.f99487a = 1;
                if (C15805i.g(abstractC15779KH, aVar, this) == objF) {
                    return objF;
                }
            }
            return Unit.f143329a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyo/c;", "user", "", "<anonymous>", "(Lyo/c;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.Meijer$onCreate$1", f = "Meijer.kt", l = {}, m = "invokeSuspend")
    static final class d extends SuspendLambda implements Function2<MeijerUser, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f99491a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f99492b;

        d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            d dVar = Meijer.this.new d(continuation);
            dVar.f99492b = obj;
            return dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit k(MeijerUser meijerUser, TrackingData trackingData) {
            trackingData.h("pushPlatform", "gcm");
            trackingData.h("cusFirstName", meijerUser.getFirstName());
            trackingData.h("cusLastName", meijerUser.getLastName());
            trackingData.h("cusEmail", meijerUser.getEmail());
            return Unit.f143329a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(MeijerUser meijerUser, Continuation<? super Unit> continuation) {
            return ((d) create(meijerUser, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f99491a == 0) {
                ResultKt.b(obj);
                final MeijerUser meijerUser = (MeijerUser) this.f99492b;
                Meijer.this.A().i(meijerUser.getExternalShopperId());
                i8.u.c(meijerUser.getExternalShopperId());
                Meijer.this.E().e(meijerUser.getExternalShopperId());
                Meijer.this.u().a(C14756c.a("event: collect PII"), new Function1() { // from class: com.meijer.mobile.meijer.B
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Meijer.d.k(meijerUser, (TrackingData) obj2);
                    }
                });
                if (meijerUser.getRequiresLogin()) {
                    Meijer.this.s();
                }
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lpv/g;", "Lyo/c;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.Meijer$onCreate$2", f = "Meijer.kt", l = {}, m = "invokeSuspend")
    static final class e extends SuspendLambda implements Function3<InterfaceC16562g<? super MeijerUser>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f99494a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f99495b;

        e(Continuation<? super e> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super MeijerUser> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            e eVar = new e(continuation);
            eVar.f99495b = th2;
            return eVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f99494a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.u((Throwable) this.f99495b, "Failure in userFlow in application", new Object[0]);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lpv/g;", "Luk/c;", "LTq/c;", "", "it", "", "<anonymous>", "(Lpv/g;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.Meijer$onCreate$4", f = "Meijer.kt", l = {}, m = "invokeSuspend")
    static final class g extends SuspendLambda implements Function3<InterfaceC16562g<? super uk.c<PointOfService>>, Throwable, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f99499a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f99500b;

        g(Continuation<? super g> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC16562g<? super uk.c<PointOfService>> interfaceC16562g, Throwable th2, Continuation<? super Unit> continuation) {
            g gVar = new g(continuation);
            gVar.f99500b = th2;
            return gVar.invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f99499a == 0) {
                ResultKt.b(obj);
                qw.a.INSTANCE.u((Throwable) this.f99500b, "Failure in cartStoreFlow from Meijer application", new Object[0]);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(Meijer meijer, boolean z10) {
        if (z10) {
            qw.a.INSTANCE.a("Starting FullStory tracking...", new Object[0]);
            meijer.G().c0();
        } else {
            qw.a.INSTANCE.a("Stopping FullStory tracking...", new Object[0]);
            meijer.G().d0();
        }
        return Unit.f143329a;
    }

    @Override // com.meijer.mobile.meijer.AbstractApplicationC12771t, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        FS.init(this, context);
        super.attachBaseContext(context);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luk/c;", "LTq/c;", "it", "", "<anonymous>", "(Luk/c;)V"}, k = 3, mv = {2, 1, 0})
    @DebugMetadata(c = "com.meijer.mobile.meijer.Meijer$onCreate$3", f = "Meijer.kt", l = {}, m = "invokeSuspend")
    static final class f extends SuspendLambda implements Function2<uk.c<PointOfService>, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        int f99496a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f99497b;

        f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            f fVar = Meijer.this.new f(continuation);
            fVar.f99497b = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Object invoke(uk.c<PointOfService> cVar, Continuation<? super Unit> continuation) {
            return ((f) create(cVar, continuation)).invokeSuspend(Unit.f143329a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.f();
            if (this.f99496a == 0) {
                ResultKt.b(obj);
                Meijer.this.Q((uk.c) this.f99497b);
                return Unit.f143329a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private final Qn.a B() {
        return (Qn.a) this.dynatraceTree.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(boolean z10) {
        if (z10) {
            androidx.appcompat.app.f.M(-1);
        } else {
            androidx.appcompat.app.f.M(1);
        }
        return Unit.f143329a;
    }

    private final void m() {
        i8.u.i(this, new m8.k(BuildConfig.DYNATRACE_APPLICATION_ID, "https://bf78653bpp.bf.dynatrace.com/mbeacon").c(true).d(w().getIsDevMode()).a());
    }

    private final void n() {
        qw.a.INSTANCE.k("logging configured. Build version_name=" + w().getVersionName() + ", version=" + BuildConfig.BuildVersion, new Object[0]);
    }

    private final void o() {
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Meijer.p((Throwable) obj);
            }
        };
        C13558a.B(new Lu.g() { // from class: com.meijer.mobile.meijer.v
            @Override // Lu.g
            public final void accept(Object obj) {
                Meijer.q(function1, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(Throwable e10) {
        Intrinsics.j(e10, "e");
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.currentThread().getUncaughtExceptionHandler();
        if (e10 instanceof UndeliverableException) {
            e10 = e10.getCause();
            Intrinsics.g(e10);
            qw.a.INSTANCE.e(e10);
        }
        if ((e10 instanceof IOException) || (e10 instanceof SocketException)) {
            return Unit.f143329a;
        }
        if (e10 instanceof InterruptedException) {
            return Unit.f143329a;
        }
        if ((e10 instanceof NullPointerException) || (e10 instanceof IllegalArgumentException)) {
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), e10);
            }
            return Unit.f143329a;
        }
        if (!(e10 instanceof IllegalStateException)) {
            qw.a.INSTANCE.u(e10, "Undeliverable exception received, not sure what to do", new Object[0]);
            return Unit.f143329a;
        }
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), e10);
        }
        return Unit.f143329a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Qn.a r() {
        return new Qn.a();
    }

    public final com.google.firebase.crashlytics.a A() {
        com.google.firebase.crashlytics.a aVar = this.crashlytics;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.x("crashlytics");
        return null;
    }

    public final Vn.b C() {
        Vn.b bVar = this.emarsysManager;
        if (bVar != null) {
            return bVar;
        }
        Intrinsics.x("emarsysManager");
        return null;
    }

    public final zl.k D() {
        zl.k kVar = this.featureManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("featureManager");
        return null;
    }

    public final C18187d E() {
        C18187d c18187d = this.firebaseLoggingUtil;
        if (c18187d != null) {
            return c18187d;
        }
        Intrinsics.x("firebaseLoggingUtil");
        return null;
    }

    public final Rn.I F() {
        Rn.I i10 = this.flyBuyManager;
        if (i10 != null) {
            return i10;
        }
        Intrinsics.x("flyBuyManager");
        return null;
    }

    public final C12686p G() {
        C12686p c12686p = this.fullStoryManager;
        if (c12686p != null) {
            return c12686p;
        }
        Intrinsics.x("fullStoryManager");
        return null;
    }

    public final AbstractC15779K H() {
        AbstractC15779K abstractC15779K = this.ioDispatcher;
        if (abstractC15779K != null) {
            return abstractC15779K;
        }
        Intrinsics.x("ioDispatcher");
        return null;
    }

    public final MPerksAccountManager I() {
        MPerksAccountManager mPerksAccountManager = this.mPerksAccountManager;
        if (mPerksAccountManager != null) {
            return mPerksAccountManager;
        }
        Intrinsics.x("mPerksAccountManager");
        return null;
    }

    public final yo.f J() {
        yo.f fVar = this.storeManager;
        if (fVar != null) {
            return fVar;
        }
        Intrinsics.x("storeManager");
        return null;
    }

    public final yo.k K() {
        yo.k kVar = this.userManager;
        if (kVar != null) {
            return kVar;
        }
        Intrinsics.x("userManager");
        return null;
    }

    public final P2.a L() {
        P2.a aVar = this.workerFactory;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.x("workerFactory");
        return null;
    }

    @Override // androidx.work.a.c
    public androidx.work.a a() {
        return new a.C1169a().u(L()).a();
    }

    @Override // com.meijer.mobile.meijer.AbstractApplicationC12771t, android.app.Application
    public void onCreate() throws Exception {
        a.Companion companion = qw.a.INSTANCE;
        companion.y(B());
        companion.y(new Ds.e());
        super.onCreate();
        a5.a.c(z());
        m();
        n();
        R();
        U();
        FirebaseMessaging.p().A(true);
        companion.a("******* using %s environment *******", w().getEnvironment());
        t().e();
        u().j(DateFormat.is24HourFormat(getApplicationContext()) ? "24 Hour Format" : "12 Hour Format");
        F().E();
        C().h();
        O();
        C16563h.J(C16563h.g(C16563h.O(K().E(), new d(null)), new e(null)), x());
        A().i(K().a());
        o();
        P();
        I().startPeriodicPolling();
        if (K().b()) {
            C16563h.J(C16563h.g(C16563h.O(y().A(), new f(null)), new g(null)), x());
        }
        M();
        N();
    }

    @Override // com.fullstory.FSOnReadyListener
    public void onReady(FSSessionData sessionData) {
        if (sessionData != null) {
            qw.a.INSTANCE.z("FullStoryManager").q("FullSessionURL + " + sessionData.getCurrentSessionURL(), new Object[0]);
            A().h("FSsessionURL", sessionData.getCurrentSessionURL());
        }
    }

    public final C13998c t() {
        C13998c c13998c = this.adobeManager;
        if (c13998c != null) {
            return c13998c;
        }
        Intrinsics.x("adobeManager");
        return null;
    }

    public final InterfaceC14523a u() {
        InterfaceC14523a interfaceC14523a = this.analyticsEngine;
        if (interfaceC14523a != null) {
            return interfaceC14523a;
        }
        Intrinsics.x("analyticsEngine");
        return null;
    }

    public final Pn.a v() {
        Pn.a aVar = this.appIconObserver;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.x("appIconObserver");
        return null;
    }

    public final AppVersion w() {
        AppVersion appVersion = this.appVersion;
        if (appVersion != null) {
            return appVersion;
        }
        Intrinsics.x("appVersion");
        return null;
    }

    public final InterfaceC15783O x() {
        InterfaceC15783O interfaceC15783O = this.applicationScope;
        if (interfaceC15783O != null) {
            return interfaceC15783O;
        }
        Intrinsics.x("applicationScope");
        return null;
    }

    public final il.m y() {
        il.m mVar = this.cartRepository;
        if (mVar != null) {
            return mVar;
        }
        Intrinsics.x("cartRepository");
        return null;
    }

    public final a5.h z() {
        a5.h hVar = this.coilImageLoader;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.x("coilImageLoader");
        return null;
    }

    private final void M() {
        MedalliaDigital.setCustomParameter("APP_ENVIRONMENT", w().getEnvironment());
        MedalliaDigital.init(this, BuildConfig.MEDALLIA_SDK_APP_KEY, new b());
    }

    private final void N() {
        if (D().e(AbstractC18503f.C.f172844h)) {
            C15809k.d(x(), null, null, new c(null), 3, null);
        }
    }

    private final void O() {
        v().a();
    }

    private final void P() {
        int i10 = getResources().getConfiguration().uiMode & 48;
        if (i10 != 16) {
            if (i10 != 32) {
                return;
            }
            E().f("UsesDarkMode", "true");
            return;
        }
        E().f("UsesDarkMode", "false");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(uk.c<PointOfService> pointOfServiceResource) {
        String postalCode;
        PointOfService pointOfServiceA = pointOfServiceResource.a();
        if (pointOfServiceA != null) {
            StoreAddress address = pointOfServiceA.getAddress();
            yo.f fVarJ = J();
            yo.d dVar = yo.d.f171589b;
            int storeId = pointOfServiceA.getStoreId();
            String displayName = pointOfServiceA.getDisplayName();
            if (address != null) {
                postalCode = address.getPostalCode();
            } else {
                postalCode = null;
            }
            yo.f.q(fVarJ, dVar, storeId, displayName, postalCode, null, 16, null);
            A().g("CART_STORE_ID", pointOfServiceA.getStoreId());
            return;
        }
        J().j(yo.d.f171589b);
        A().h("CART_STORE_ID", "");
    }

    private final void R() {
        if (w().getIsDevMode()) {
            io.reactivex.l<Boolean> lVarF = D().f(AbstractC18503f.C18519q.f172896h);
            final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Meijer.S(((Boolean) obj).booleanValue());
                }
            };
            Dk.a.a(lVarF.subscribe(new Lu.g() { // from class: com.meijer.mobile.meijer.x
                @Override // Lu.g
                public final void accept(Object obj) {
                    Meijer.T(function1, obj);
                }
            }), this.disposables);
            return;
        }
        androidx.appcompat.app.f.M(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    private final void U() {
        io.reactivex.l<Boolean> lVarF = D().f(AbstractC18503f.B.f172843h);
        final Function1 function1 = new Function1() { // from class: com.meijer.mobile.meijer.y
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Meijer.V(this.f114370a, ((Boolean) obj).booleanValue());
            }
        };
        Dk.a.a(lVarF.subscribe(new Lu.g() { // from class: com.meijer.mobile.meijer.z
            @Override // Lu.g
            public final void accept(Object obj) {
                Meijer.W(function1, obj);
            }
        }), this.disposables);
        G().b0(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        if (K().b()) {
            startActivity(Bl.k.f3130a.e(this, true).addFlags(872415232));
        }
    }

    @Override // android.app.Application, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        InterfaceC15089c interfaceC15089cE = z().e();
        if (interfaceC15089cE != null) {
            interfaceC15089cE.a(level);
        }
    }
}
