package wm;

import Eh.BarcodeResponse;
import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import androidx.core.app.m;
import com.adobe.marketing.mobile.u;
import com.adobe.marketing.mobile.v;
import com.meijer.mobile.core.networking.exceptions.RetrofitException;
import com.meijer.mobile.legacy.notifications.broadcastreceiver.NotificationDismissedReceiver;
import ek.NotificationData;
import gi.InterfaceC14261a;
import hi.C14476c;
import hi.TrackingData;
import iv.C14764a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import vm.LifecycleEvent;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002>@BE\b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010%\u001a\u00020$2\b\u0010 \u001a\u0004\u0018\u00010\u001c2\b\u0010!\u001a\u0004\u0018\u00010\u001c2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020\u00142\b\u0010(\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0007¢\u0006\u0004\b,\u0010-J)\u0010.\u001a\u00020\u00142\b\u0010 \u001a\u0004\u0018\u00010\u001c2\b\u0010!\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b.\u0010/J\u0015\u00102\u001a\u00020\u00142\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\r\u00104\u001a\u00020\u0014¢\u0006\u0004\b4\u0010\u0018J\r\u00105\u001a\u00020\"¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00142\u0006\u0010(\u001a\u000207H\u0007¢\u0006\u0004\b8\u00109J)\u0010<\u001a\u00020\"2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010:\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010;\u001a\u00020\"¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\"\u0010K\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010J\u001a\u0004\bK\u00106\"\u0004\bL\u0010M¨\u0006N"}, d2 = {"Lwm/h;", "", "Landroid/content/Context;", "context", "LCk/b;", "meijerBus", "Landroid/app/NotificationManager;", "notificationManager", "Lyo/k;", "userManager", "Lzh/i;", "getMPerksBarcodeCall", "LCl/e;", "meijerIntent", "Lgi/a;", "analyticsEngine", "<init>", "(Landroid/content/Context;LCk/b;Landroid/app/NotificationManager;Lyo/k;Lzh/i;LCl/e;Lgi/a;)V", "", "exception", "", "q", "(Ljava/lang/Throwable;)V", "j", "()V", "Lek/a;", "notificationData", "", "", "Landroid/app/PendingIntent;", "m", "(Lek/a;)Ljava/util/Map;", "title", "message", "", "highPriority", "Landroidx/core/app/m$e;", "i", "(Ljava/lang/String;Ljava/lang/String;Z)Landroidx/core/app/m$e;", "Landroid/graphics/Bitmap;", "barcodeImage", "h", "(Landroid/graphics/Bitmap;)V", "LNu/b;", "t", "()LNu/b;", "s", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V", "", "notificationId", "l", "(I)V", "k", "g", "()Z", "LEh/a;", "r", "(LEh/a;)V", "imageBitmap", "debugging", "n", "(Lek/a;Landroid/graphics/Bitmap;Z)Z", "a", "Landroid/content/Context;", "b", "Landroid/app/NotificationManager;", "c", "Lyo/k;", "d", "Lzh/i;", "e", "LCl/e;", "f", "Lgi/a;", "Z", "isPaused", "setPaused", "(Z)V", "notifications_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* renamed from: wm.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C17838h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final NotificationManager notificationManager;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final yo.k userManager;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final zh.i getMPerksBarcodeCall;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Cl.e meijerIntent;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC14261a analyticsEngine;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isPaused;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0082\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR$\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001f\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010 \u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010!\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0016\u0010\u001e¨\u0006\""}, d2 = {"Lwm/h$a;", "", "", "label", "deepLink", "Landroid/app/PendingIntent;", "contentPendingIntent", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/app/PendingIntent;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getDeepLink", "c", "Landroid/app/PendingIntent;", "()Landroid/app/PendingIntent;", "f", "(Landroid/app/PendingIntent;)V", "d", "Z", "e", "()Z", "isLabeledAction", "isLabelOnly", "isBlank", "notifications_playstoreRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wm.h$a, reason: from toString */
    private static final /* data */ class CallToAction {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String label;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String deepLink;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private PendingIntent contentPendingIntent;

        /* renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final boolean isLabeledAction;

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean isLabelOnly;

        /* renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final boolean isBlank;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CallToAction)) {
                return false;
            }
            CallToAction callToAction = (CallToAction) other;
            return Intrinsics.e(this.label, callToAction.label) && Intrinsics.e(this.deepLink, callToAction.deepLink) && Intrinsics.e(this.contentPendingIntent, callToAction.contentPendingIntent);
        }

        /* renamed from: a, reason: from getter */
        public final PendingIntent getContentPendingIntent() {
            return this.contentPendingIntent;
        }

        /* renamed from: b, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: c, reason: from getter */
        public final boolean getIsBlank() {
            return this.isBlank;
        }

        /* renamed from: d, reason: from getter */
        public final boolean getIsLabelOnly() {
            return this.isLabelOnly;
        }

        /* renamed from: e, reason: from getter */
        public final boolean getIsLabeledAction() {
            return this.isLabeledAction;
        }

        public final void f(PendingIntent pendingIntent) {
            this.contentPendingIntent = pendingIntent;
        }

        public int hashCode() {
            String str = this.label;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.deepLink;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            PendingIntent pendingIntent = this.contentPendingIntent;
            return iHashCode2 + (pendingIntent != null ? pendingIntent.hashCode() : 0);
        }

        public String toString() {
            return "CallToAction(label=" + this.label + ", deepLink=" + this.deepLink + ", contentPendingIntent=" + this.contentPendingIntent + ')';
        }

        public CallToAction(String str, String str2, PendingIntent pendingIntent) {
            boolean z10;
            boolean z11;
            this.label = str;
            this.deepLink = str2;
            this.contentPendingIntent = pendingIntent;
            boolean z12 = false;
            if (str != null && str2 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.isLabeledAction = z10;
            if (str != null && str2 == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.isLabelOnly = z11;
            if (str == null && str2 == null) {
                z12 = true;
            }
            this.isBlank = z12;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wm.h$c */
    /* synthetic */ class c extends FunctionReferenceImpl implements Function1<BarcodeResponse, Unit> {
        c(Object obj) {
            super(1, obj, C17838h.class, "onGetMPerksBarcodeSuccess", "onGetMPerksBarcodeSuccess(Lcom/meijer/mobile/accounts/service/models/network/BarcodeResponse;)V", 0);
        }

        public final void a(BarcodeResponse p02) {
            Intrinsics.j(p02, "p0");
            ((C17838h) this.receiver).r(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(BarcodeResponse barcodeResponse) {
            a(barcodeResponse);
            return Unit.f142422a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wm.h$d */
    /* synthetic */ class d extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        d(Object obj) {
            super(1, obj, C17838h.class, "onGetMPerksBarcodeFailure", "onGetMPerksBarcodeFailure(Ljava/lang/Throwable;)V", 0);
        }

        public final void a(Throwable p02) {
            Intrinsics.j(p02, "p0");
            ((C17838h) this.receiver).q(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
            a(th2);
            return Unit.f142422a;
        }
    }

    public C17838h(Context context, Ck.b meijerBus, NotificationManager notificationManager, yo.k userManager, zh.i getMPerksBarcodeCall, Cl.e meijerIntent, InterfaceC14261a analyticsEngine) {
        Intrinsics.j(context, "context");
        Intrinsics.j(meijerBus, "meijerBus");
        Intrinsics.j(userManager, "userManager");
        Intrinsics.j(getMPerksBarcodeCall, "getMPerksBarcodeCall");
        Intrinsics.j(meijerIntent, "meijerIntent");
        Intrinsics.j(analyticsEngine, "analyticsEngine");
        this.context = context;
        this.notificationManager = notificationManager;
        this.userManager = userManager;
        this.getMPerksBarcodeCall = getMPerksBarcodeCall;
        this.meijerIntent = meijerIntent;
        this.analyticsEngine = analyticsEngine;
        this.isPaused = true;
        meijerBus.b(LifecycleEvent.class, new Pu.g() { // from class: wm.g
            @Override // Pu.g
            public final void accept(Object obj) {
                C17838h.e(this.f166201a, (LifecycleEvent) obj);
            }
        });
        if (Jk.b.a(26)) {
            j();
        }
    }

    private final void h(Bitmap barcodeImage) {
        m.e eVarF = new m.e(this.context, "in store channel").y(C17839i.f166216a).B(this.context.getResources().getString(l.f166221c)).k(this.context.getResources().getString(l.f166221c)).j(this.context.getString(l.f166222d)).f(true);
        RemoteViews remoteViews = new RemoteViews(this.context.getPackageName(), k.f166218a);
        remoteViews.setImageViewBitmap(C17840j.f166217a, barcodeImage);
        Notification notificationC = eVarF.l(remoteViews).c();
        NotificationManager notificationManager = this.notificationManager;
        if (notificationManager != null) {
            notificationManager.notify(963963, notificationC);
        }
    }

    private final m.e i(String title, String message, boolean highPriority) throws Resources.NotFoundException {
        m.e eVarY = new m.e(this.context, "Meijer app info channel").y(C17839i.f166216a);
        if (title == null) {
            title = this.context.getResources().getString(l.f166221c);
            Intrinsics.i(title, "getString(...)");
        }
        m.e eVarV = eVarY.k(title).j(message).f(true).m(-3).A(new m.c().h(message)).v(highPriority ? 1 : 0);
        Intrinsics.i(eVarV, "setPriority(...)");
        return eVarV;
    }

    private final void j() {
        NotificationManager notificationManager = this.notificationManager;
        if (notificationManager != null) {
            v.a();
            NotificationChannel notificationChannelA = u.a("in store channel", this.context.getString(l.f166224f), 3);
            notificationChannelA.setDescription(this.context.getString(l.f166223e));
            notificationChannelA.enableLights(false);
            notificationChannelA.enableVibration(true);
            Unit unit = Unit.f142422a;
            v.a();
            NotificationChannel notificationChannelA2 = u.a("Meijer app info channel", this.context.getString(l.f166220b), 3);
            notificationChannelA2.setDescription(this.context.getString(l.f166219a));
            notificationChannelA2.enableLights(false);
            notificationChannelA2.enableVibration(true);
            v.a();
            NotificationChannel notificationChannelA3 = u.a("Mperks info channel", this.context.getString(l.f166226h), 3);
            notificationChannelA3.setDescription(this.context.getString(l.f166225g));
            notificationChannelA3.enableLights(true);
            notificationChannelA3.enableVibration(true);
            notificationManager.createNotificationChannels(CollectionsKt.p(notificationChannelA, notificationChannelA2, notificationChannelA3));
        }
    }

    private final Map<String, PendingIntent> m(NotificationData notificationData) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String strValueOf = String.valueOf(System.currentTimeMillis());
        Al.v vVar = Al.v.f696a;
        Intent intentA = vVar.a(this.context, notificationData.getDeepLink());
        Intent intentA2 = vVar.a(this.context, notificationData.getCta1Action());
        Intent intentA3 = vVar.a(this.context, notificationData.getCta2Action());
        Intent intent = new Intent(this.context, (Class<?>) NotificationDismissedReceiver.class);
        intent.putExtra("adobe_push_notification_data_broadlogid_extra", notificationData.getBroadlogId());
        intent.putExtra("adobe_push_notification_data_deliveryid_extra", notificationData.getDeliveryId());
        intent.putExtra("Cta notification id", notificationData.hashCode());
        intent.setAction(strValueOf);
        linkedHashMap.put("adobe notification dismissIntent destination key", PendingIntent.getBroadcast(this.context, notificationData.hashCode(), intent, 201326592));
        for (Map.Entry entry : MapsKt.o(TuplesKt.a("adobe notification destination key", intentA), TuplesKt.a("adobe notification CTA1 destination key", intentA2), TuplesKt.a("adobe notification CTA2 destination key", intentA3)).entrySet()) {
            String str = (String) entry.getKey();
            Intent intent2 = (Intent) entry.getValue();
            intent2.setFlags(268468224).setAction(strValueOf).putExtra("adobe_push_notification_data_broadlogid_extra", notificationData.getBroadlogId()).putExtra("adobe_push_notification_data_deliveryid_extra", notificationData.getDeliveryId());
            linkedHashMap.put(str, PendingIntent.getActivity(this.context, 0, intent2, 67108864));
        }
        return linkedHashMap;
    }

    public static /* synthetic */ boolean o(C17838h c17838h, NotificationData notificationData, Bitmap bitmap, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return c17838h.n(notificationData, bitmap, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(NotificationData notificationData, TrackingData track) {
        Intrinsics.j(track, "$this$track");
        track.h("broadlogId", notificationData.getBroadlogId());
        track.h("deliveryId", notificationData.getDeliveryId());
        track.h("action", "7");
        return Unit.f142422a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"TimberExceptionLogging"})
    public final void q(Throwable exception) {
        if (exception instanceof RetrofitException) {
            uw.a.INSTANCE.f(exception, ((RetrofitException) exception).c(this.context), new Object[0]);
        } else {
            uw.a.INSTANCE.e(exception);
        }
    }

    public final boolean g() {
        NotificationManager notificationManager = this.notificationManager;
        return notificationManager != null && notificationManager.areNotificationsEnabled();
    }

    public final void l(int notificationId) {
        NotificationManager notificationManager = this.notificationManager;
        if (notificationManager != null) {
            notificationManager.cancel(notificationId);
        }
    }

    public final boolean n(final NotificationData notificationData, Bitmap imageBitmap, boolean debugging) {
        PendingIntent contentPendingIntent;
        Intrinsics.j(notificationData, "notificationData");
        if (!debugging && !this.userManager.G()) {
            return false;
        }
        Map<String, PendingIntent> mapM = m(notificationData);
        PendingIntent pendingIntent = mapM.get("adobe notification dismissIntent destination key");
        PendingIntent pendingIntent2 = mapM.get("adobe notification destination key");
        CallToAction callToAction = new CallToAction(notificationData.getCta1label(), notificationData.getCta1Action(), mapM.get("adobe notification CTA1 destination key"));
        CallToAction callToAction2 = new CallToAction(notificationData.getCta2Label(), notificationData.getCta2Action(), mapM.get("adobe notification CTA2 destination key"));
        m.e eVarE = new m.e(this.context, "Mperks info channel").y(C17839i.f166216a).B(this.context.getResources().getString(l.f166221c)).k(notificationData.getTitle()).j(notificationData.getBody()).v(0).f(true).E(1);
        Intrinsics.i(eVarE, "setVisibility(...)");
        CallToAction callToAction3 = !callToAction.getIsBlank() ? callToAction : null;
        if (callToAction3 == null || (contentPendingIntent = callToAction3.getContentPendingIntent()) == null) {
            CallToAction callToAction4 = !callToAction2.getIsBlank() ? callToAction2 : null;
            contentPendingIntent = callToAction4 != null ? callToAction4.getContentPendingIntent() : null;
            if (contentPendingIntent == null) {
                contentPendingIntent = pendingIntent2;
            }
        }
        eVarE.i(contentPendingIntent);
        if (callToAction.getIsLabeledAction() && callToAction2.getIsLabelOnly()) {
            callToAction2.f(pendingIntent2);
        } else if (callToAction.getIsLabelOnly() && callToAction2.getIsLabeledAction()) {
            callToAction.f(pendingIntent2);
        } else if (callToAction.getIsLabelOnly() && callToAction2.getIsLabelOnly()) {
            callToAction.f(pendingIntent2);
            callToAction2.f(pendingIntent);
        }
        CallToAction callToAction5 = !callToAction.getIsBlank() ? callToAction : null;
        if (callToAction5 != null) {
            eVarE.a(C17839i.f166216a, callToAction5.getLabel(), callToAction5.getContentPendingIntent());
        }
        CallToAction callToAction6 = !callToAction2.getIsBlank() ? callToAction2 : null;
        if (callToAction6 != null) {
            eVarE.a(C17839i.f166216a, callToAction6.getLabel(), callToAction6.getContentPendingIntent());
        }
        if (callToAction.getIsBlank() && callToAction2.getIsBlank()) {
            eVarE.n(pendingIntent).i(pendingIntent2);
        }
        if (imageBitmap != null) {
            eVarE.q(imageBitmap).A(new m.b().j(imageBitmap).i(null));
        } else {
            eVarE.A(new m.c().h(notificationData.getBody()));
        }
        NotificationManager notificationManager = this.notificationManager;
        if (notificationManager != null) {
            notificationManager.notify(notificationData.hashCode(), eVarE.c());
        }
        this.analyticsEngine.h(C14476c.a("event: tracking"), new Function1() { // from class: wm.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C17838h.p(notificationData, (TrackingData) obj);
            }
        });
        return true;
    }

    public final void r(BarcodeResponse barcodeImage) {
        Intrinsics.j(barcodeImage, "barcodeImage");
        Bitmap bitmap = barcodeImage.getBitmap();
        if (bitmap != null) {
            h(bitmap);
        } else {
            uw.a.INSTANCE.d("Error loading bitmap from server", new Object[0]);
        }
    }

    public final void s(String title, String message, Context context) {
        Intrinsics.j(context, "context");
        Notification notificationC = i(title, message, false).i(this.meijerIntent.V(context)).c();
        NotificationManager notificationManager = this.notificationManager;
        if (notificationManager != null) {
            notificationManager.notify(876543, notificationC);
        }
    }

    public final Nu.b t() {
        io.reactivex.l<BarcodeResponse> lVarObserveOn = this.getMPerksBarcodeCall.e().subscribeOn(C14764a.b()).observeOn(Mu.a.a());
        final c cVar = new c(this);
        Pu.g<? super BarcodeResponse> gVar = new Pu.g() { // from class: wm.d
            @Override // Pu.g
            public final void accept(Object obj) {
                C17838h.u(cVar, obj);
            }
        };
        final d dVar = new d(this);
        Nu.b bVarSubscribe = lVarObserveOn.subscribe(gVar, new Pu.g() { // from class: wm.e
            @Override // Pu.g
            public final void accept(Object obj) {
                C17838h.v(dVar, obj);
            }
        });
        Intrinsics.i(bVarSubscribe, "subscribe(...)");
        return bVarSubscribe;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(C17838h c17838h, LifecycleEvent lifecycleEvent) {
        c17838h.isPaused = lifecycleEvent.getIsPaused();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    public final void k() {
        l(963963);
    }
}
