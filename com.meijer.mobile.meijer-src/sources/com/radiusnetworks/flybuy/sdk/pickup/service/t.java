package com.radiusnetworks.flybuy.sdk.pickup.service;

import Ld.C4022l;
import Ld.InterfaceC4013c;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import androidx.core.app.m;
import androidx.view.AbstractC6127A;
import androidx.view.C6130D;
import androidx.view.InterfaceC6131E;
import androidx.view.b0;
import com.google.android.gms.location.LocationRequest;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.app.SdkConfig;
import com.radiusnetworks.flybuy.sdk.data.push.FlybuyPushData;
import com.radiusnetworks.flybuy.sdk.data.room.domain.BeaconRegion;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Order;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import com.radiusnetworks.flybuy.sdk.manager.NotificationsManager;
import com.radiusnetworks.flybuy.sdk.pickup.PickupManager;
import com.radiusnetworks.flybuy.sdk.pickup.data.LocationFilter;
import com.radiusnetworks.flybuy.sdk.pickup.helper.LocationEventGenerator;
import com.radiusnetworks.flybuy.sdk.util.PermissionExtensionsKt;
import com.radiusnetworks.flybuy.sdk.util.SingletonHolder;
import j$.time.Clock;
import j$.time.Instant;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import mv.C15784P;
import mv.C15800f0;
import mv.C15809k;

/* loaded from: classes12.dex */
public abstract class t extends Service {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f121004s = 0;

    /* renamed from: a, reason: collision with root package name */
    public LocationEventGenerator f121005a;

    /* renamed from: c, reason: collision with root package name */
    public final i f121007c;

    /* renamed from: d, reason: collision with root package name */
    public final k f121008d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC4013c f121009e;

    /* renamed from: f, reason: collision with root package name */
    public j f121010f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f121012h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f121015k;

    /* renamed from: l, reason: collision with root package name */
    public final C6130D f121016l;

    /* renamed from: m, reason: collision with root package name */
    public LocationFilter f121017m;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC6127A f121018n;

    /* renamed from: o, reason: collision with root package name */
    public List f121019o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC6131E f121020p;

    /* renamed from: q, reason: collision with root package name */
    public final Lazy f121021q;

    /* renamed from: r, reason: collision with root package name */
    public m f121022r;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC6131E f121006b = new InterfaceC6131E() { // from class: com.radiusnetworks.flybuy.sdk.pickup.service.q
        @Override // androidx.view.InterfaceC6131E
        public final void onChanged(Object obj) {
            t.c(this.f121001a, (Pair) obj);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public final b f121011g = new b();

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC6127A f121013i = FlyBuyCore.getOrders().getOpenLiveData();

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC6131E f121014j = new InterfaceC6131E() { // from class: com.radiusnetworks.flybuy.sdk.pickup.service.r
        @Override // androidx.view.InterfaceC6131E
        public final void onChanged(Object obj) throws Exception {
            t.e(this.f121002a, (List) obj);
        }
    };

    @Override // android.app.Service
    public final void onDestroy() throws Exception {
        try {
            LogExtensionsKt.logd(this, true, "onDestroy");
            FlyBuyCore.INSTANCE.getConfig().removeConfigChangeListener(this.f121006b);
            this.f121018n.n(this.f121020p);
            g();
            this.f121013i.n(this.f121014j);
            if (this.f121012h) {
                LogExtensionsKt.logd(this, true, "Removing location updates");
                InterfaceC4013c interfaceC4013c = this.f121009e;
                j jVar = null;
                if (interfaceC4013c == null) {
                    Intrinsics.x("locationClient");
                    interfaceC4013c = null;
                }
                j jVar2 = this.f121010f;
                if (jVar2 == null) {
                    Intrinsics.x("locationCallback");
                } else {
                    jVar = jVar2;
                }
                interfaceC4013c.f(jVar);
                this.f121012h = false;
            }
            super.onDestroy();
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            FlyBuyCore flyBuyCore = FlyBuyCore.INSTANCE;
            flyBuyCore.getCrashManager().log("catchAndThrow caught exception");
            flyBuyCore.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public static final void b(t this$0, List list) throws Exception {
        Intrinsics.j(this$0, "this$0");
        try {
            LogExtensionsKt.logd(this$0, true, "Beacon Regions Changed!");
            this$0.f121019o = list;
            this$0.f();
        } catch (Exception e10) {
            LogExtensionsKt.logd(this$0, true, e10, "catchAndThrow caught exception", new Object[0]);
            FlyBuyCore flyBuyCore = FlyBuyCore.INSTANCE;
            flyBuyCore.getCrashManager().log("catchAndThrow caught exception");
            flyBuyCore.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public static final void c(t this$0, Pair p10) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(p10, "p");
        LocationEventGenerator locationEventGenerator = this$0.f121005a;
        if (locationEventGenerator == null) {
            Intrinsics.x("locationEventGenerator");
            locationEventGenerator = null;
        }
        locationEventGenerator.setSdkConfig((SdkConfig) p10.c());
    }

    public static final void e(t this$0, List it) throws Exception {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(it, "it");
        try {
            LogExtensionsKt.logd(this$0, true, "Orders Changed!");
            LocationEventGenerator locationEventGenerator = this$0.f121005a;
            if (locationEventGenerator == null) {
                Intrinsics.x("locationEventGenerator");
                locationEventGenerator = null;
            }
            locationEventGenerator.updateOpenOrders(it);
            if (!it.isEmpty()) {
                C15809k.d(C15784P.a(C15800f0.b()), null, null, new o(this$0, null), 3, null);
                return;
            }
            LogExtensionsKt.logd(this$0, false, "Stopping Pickup location service...");
            this$0.stopForeground(1);
            this$0.stopSelf();
        } catch (Exception e10) {
            LogExtensionsKt.logd(this$0, true, e10, "catchAndThrow caught exception", new Object[0]);
            FlyBuyCore flyBuyCore = FlyBuyCore.INSTANCE;
            flyBuyCore.getCrashManager().log("catchAndThrow caught exception");
            flyBuyCore.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final Notification a() {
        m.e eVarV;
        List list = (List) this.f121013i.e();
        Order order = list != null ? (Order) CollectionsKt.u0(list) : null;
        PickupManager.Companion companion = PickupManager.INSTANCE;
        if (((PickupManager) SingletonHolder.getInstance$default(companion, null, 1, null)).getLiveStatusNotificationUpdater() != null) {
            eVarV = new m.e(this, "channel_flybuy_live_status").y(com.radiusnetworks.flybuy.sdk.pickup.e.f120966a).h(Z1.b.c(this, com.radiusnetworks.flybuy.sdk.pickup.d.f120964a)).v(0).x(true);
            Intrinsics.i(eVarV, "setSilent(...)");
            Function2<m.e, Order, Unit> liveStatusNotificationUpdater = ((PickupManager) SingletonHolder.getInstance$default(companion, null, 1, null)).getLiveStatusNotificationUpdater();
            if (liveStatusNotificationUpdater != null) {
                liveStatusNotificationUpdater.invoke(eVarV, order);
            }
        } else {
            eVarV = new m.e(this, "channel_01").y(com.radiusnetworks.flybuy.sdk.pickup.e.f120966a).h(Z1.b.c(this, com.radiusnetworks.flybuy.sdk.pickup.d.f120964a)).k(getString(com.radiusnetworks.flybuy.sdk.pickup.f.f120969c)).j(getString(com.radiusnetworks.flybuy.sdk.pickup.f.f120968b)).A(new m.c().h(getString(com.radiusnetworks.flybuy.sdk.pickup.f.f120968b)).i(getString(com.radiusnetworks.flybuy.sdk.pickup.f.f120969c))).v(-1);
            Intrinsics.g(eVarV);
        }
        eVarV.u(true).F(System.currentTimeMillis());
        if (Build.VERSION.SDK_INT >= 31) {
            eVarV.p(1);
        }
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getApplicationContext().getPackageName());
        if (order != null) {
            Bundle bundle = new Bundle();
            bundle.putString(NotificationsManager.INTENT_EXTRA_MESSAGE_SOURCE, FlybuyPushData.MESSAGE_SOURCE_FLYBUY);
            bundle.putString(NotificationsManager.INTENT_EXTRA_ORDER_ID, String.valueOf(order.getId()));
            bundle.putString("order_state", order.getState());
            bundle.putString("customer_state", order.getCustomerState());
            Instant etaAt = order.getEtaAt();
            if (etaAt != null) {
                bundle.putString("eta_at", etaAt.toString());
            }
            if (launchIntentForPackage != null) {
                launchIntentForPackage.putExtras(bundle);
            }
        }
        eVarV.i(PendingIntent.getActivity(this, 0, launchIntentForPackage, 201326592));
        Notification notificationC = eVarV.c();
        Intrinsics.i(notificationC, "build(...)");
        return notificationC;
    }

    public final void d() {
        if (this.f121012h) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Requesting location updates with ");
        LocationFilter locationFilter = this.f121017m;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long intervalSeconds = (long) locationFilter.getIntervalSeconds();
        TimeUnit timeUnit2 = TimeUnit.SECONDS;
        LocationRequest locationRequestA = new LocationRequest.a(timeUnit.convert(intervalSeconds, timeUnit2)).i(1000L).j(locationFilter.getPriority()).h(locationFilter.getSmallestDisplacement()).a();
        Intrinsics.i(locationRequestA, "build(...)");
        sb2.append(locationRequestA);
        LogExtensionsKt.logd(this, true, sb2.toString());
        InterfaceC4013c interfaceC4013c = this.f121009e;
        j jVar = null;
        if (interfaceC4013c == null) {
            Intrinsics.x("locationClient");
            interfaceC4013c = null;
        }
        LocationFilter locationFilter2 = this.f121017m;
        LocationRequest locationRequestA2 = new LocationRequest.a(timeUnit.convert((long) locationFilter2.getIntervalSeconds(), timeUnit2)).i(1000L).j(locationFilter2.getPriority()).h(locationFilter2.getSmallestDisplacement()).a();
        Intrinsics.i(locationRequestA2, "build(...)");
        j jVar2 = this.f121010f;
        if (jVar2 == null) {
            Intrinsics.x("locationCallback");
        } else {
            jVar = jVar2;
        }
        interfaceC4013c.i(locationRequestA2, jVar, Looper.getMainLooper());
        this.f121012h = true;
    }

    public final void f() {
        BluetoothAdapter bluetoothAdapter;
        LocationEventGenerator locationEventGenerator = this.f121005a;
        if (locationEventGenerator == null) {
            Intrinsics.x("locationEventGenerator");
            locationEventGenerator = null;
        }
        if (!locationEventGenerator.getShouldStartBeaconing()) {
            g();
            return;
        }
        List<BeaconRegion> list = this.f121019o;
        Context applicationContext = getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        if (!PermissionExtensionsKt.hasBluetoothScanPermission(applicationContext) || list == null || !(!list.isEmpty()) || this.f121015k || (bluetoothAdapter = (BluetoothAdapter) this.f121021q.getValue()) == null || !bluetoothAdapter.isEnabled()) {
            return;
        }
        LogExtensionsKt.logd(this, false, "Starting Pickup beacon monitoring...");
        this.f121015k = true;
        char c10 = '\n';
        ArrayList arrayList = new ArrayList(CollectionsKt.x(list, 10));
        for (BeaconRegion beaconRegion : list) {
            Intrinsics.j(beaconRegion, "<this>");
            ScanFilter.Builder builder = new ScanFilter.Builder();
            byte[] bArr = new byte[23];
            bArr[0] = 0;
            bArr[1] = 0;
            bArr[2] = 0;
            bArr[3] = 0;
            bArr[4] = 0;
            bArr[5] = 0;
            bArr[6] = 0;
            bArr[7] = 0;
            bArr[8] = 0;
            bArr[9] = 0;
            bArr[c10] = 0;
            bArr[11] = 0;
            bArr[12] = 0;
            bArr[13] = 0;
            bArr[14] = 0;
            bArr[15] = 0;
            char c11 = c10;
            bArr[16] = 0;
            bArr[17] = 0;
            bArr[18] = 0;
            bArr[19] = 0;
            bArr[20] = 0;
            bArr[21] = 0;
            bArr[22] = 0;
            byte[] bArr2 = new byte[23];
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 1;
            bArr2[3] = 1;
            bArr2[4] = 1;
            bArr2[5] = 1;
            bArr2[6] = 1;
            bArr2[7] = 1;
            bArr2[8] = 1;
            bArr2[9] = 1;
            bArr2[c11] = 1;
            bArr2[11] = 1;
            bArr2[12] = 1;
            bArr2[13] = 1;
            bArr2[14] = 1;
            bArr2[15] = 1;
            bArr2[16] = 1;
            bArr2[17] = 1;
            bArr2[18] = 0;
            bArr2[19] = 0;
            bArr2[20] = 0;
            bArr2[21] = 0;
            bArr2[22] = 0;
            UUID uuid = beaconRegion.getUuid();
            Intrinsics.j(uuid, "<this>");
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
            byteBufferWrap.putLong(uuid.getMostSignificantBits());
            byteBufferWrap.putLong(uuid.getLeastSignificantBits());
            byte[] bArrArray = byteBufferWrap.array();
            Intrinsics.i(bArrArray, "array(...)");
            System.arraycopy(bArrArray, 0, bArr, 2, 16);
            Integer major = beaconRegion.getMajor();
            if (major != null) {
                int iIntValue = major.intValue();
                bArr[18] = (byte) (iIntValue / 256);
                bArr[19] = (byte) (iIntValue % 256);
                bArr2[18] = 1;
                bArr2[19] = 1;
            }
            Integer minor = beaconRegion.getMinor();
            if (minor != null) {
                int iIntValue2 = minor.intValue();
                bArr[20] = (byte) (iIntValue2 / 256);
                bArr[21] = (byte) (iIntValue2 % 256);
                bArr2[20] = 1;
                bArr2[21] = 1;
            }
            builder.setManufacturerData(76, bArr, bArr2);
            ScanFilter scanFilterBuild = builder.build();
            Intrinsics.i(scanFilterBuild, "build(...)");
            arrayList.add(scanFilterBuild);
            c10 = c11;
        }
        List<ScanFilter> listM1 = CollectionsKt.m1(arrayList);
        ScanSettings scanSettingsBuild = new ScanSettings.Builder().setScanMode(1).build();
        this.f121022r = new m(this);
        BluetoothAdapter bluetoothAdapter2 = (BluetoothAdapter) this.f121021q.getValue();
        Intrinsics.g(bluetoothAdapter2);
        BluetoothLeScanner bluetoothLeScanner = bluetoothAdapter2.getBluetoothLeScanner();
        m mVar = this.f121022r;
        Intrinsics.h(mVar, "null cannot be cast to non-null type android.bluetooth.le.ScanCallback");
        bluetoothLeScanner.startScan(listM1, scanSettingsBuild, mVar);
    }

    public final void g() {
        if (this.f121015k) {
            LogExtensionsKt.logd(this, false, "Stopping Pickup beacon monitoring...");
            BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) this.f121021q.getValue();
            if (bluetoothAdapter != null) {
                if (!bluetoothAdapter.isEnabled()) {
                    bluetoothAdapter = null;
                }
                if (bluetoothAdapter != null && this.f121022r != null) {
                    BluetoothLeScanner bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner();
                    m mVar = this.f121022r;
                    Intrinsics.h(mVar, "null cannot be cast to non-null type android.bluetooth.le.ScanCallback");
                    bluetoothLeScanner.stopScan(mVar);
                }
            }
            this.f121015k = false;
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.j(intent, "intent");
        LogExtensionsKt.logd(this, true, "onBind");
        return this.f121011g;
    }

    public t() {
        LocationService locationService = (LocationService) this;
        this.f121007c = new i(locationService);
        this.f121008d = new k(locationService);
        C6130D c6130d = new C6130D();
        this.f121016l = c6130d;
        this.f121017m = com.radiusnetworks.flybuy.sdk.pickup.data.a.f120965a;
        this.f121018n = b0.f(c6130d, c.f120976f);
        this.f121020p = new InterfaceC6131E() { // from class: com.radiusnetworks.flybuy.sdk.pickup.service.s
            @Override // androidx.view.InterfaceC6131E
            public final void onChanged(Object obj) throws Exception {
                t.b(this.f121003a, (List) obj);
            }
        };
        this.f121021q = LazyKt.a(LazyThreadSafetyMode.f143288c, new e(locationService));
    }

    @Override // android.app.Service
    public final void onCreate() throws Exception {
        boolean z10;
        String str;
        int i10;
        super.onCreate();
        try {
            Clock clockSystemDefaultZone = Clock.systemDefaultZone();
            Intrinsics.i(clockSystemDefaultZone, "systemDefaultZone(...)");
            this.f121005a = new LocationEventGenerator(clockSystemDefaultZone, this.f121007c, this.f121008d);
            FlyBuyCore.INSTANCE.getConfig().addConfigChangeListener(this.f121006b);
            InterfaceC4013c interfaceC4013cB = C4022l.b(this);
            Intrinsics.i(interfaceC4013cB, "getFusedLocationProviderClient(...)");
            this.f121009e = interfaceC4013cB;
            this.f121010f = new j(this);
            Object systemService = getSystemService("notification");
            Intrinsics.h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (Build.VERSION.SDK_INT >= 26) {
                if (((PickupManager) SingletonHolder.getInstance$default(PickupManager.INSTANCE, null, 1, null)).getLiveStatusNotificationUpdater() != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                String str2 = "channel_01";
                if (!z10) {
                    str = "channel_01";
                } else {
                    str = "channel_flybuy_live_status";
                }
                if (!z10) {
                    str2 = "channel_flybuy_live_status";
                }
                if (z10) {
                    i10 = 3;
                } else {
                    i10 = 2;
                }
                notificationManager.deleteNotificationChannel(str2);
                com.adobe.marketing.mobile.v.a();
                NotificationChannel notificationChannelA = com.adobe.marketing.mobile.u.a(str, getString(com.radiusnetworks.flybuy.sdk.pickup.f.f120967a), i10);
                notificationChannelA.setShowBadge(false);
                notificationManager.createNotificationChannel(notificationChannelA);
            }
            d();
            this.f121013i.j(this.f121014j);
            this.f121018n.j(this.f121020p);
        } catch (Exception e10) {
            LogExtensionsKt.logd(this, true, e10, "catchAndThrow caught exception", new Object[0]);
            FlyBuyCore flyBuyCore = FlyBuyCore.INSTANCE;
            flyBuyCore.getCrashManager().log("catchAndThrow caught exception");
            flyBuyCore.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }
}
