package com.radiusnetworks.flybuy.sdk.pickup.service;

import Jd.C3778l;
import Jd.InterfaceC3769c;
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
import androidx.view.AbstractC5985A;
import androidx.view.C5988D;
import androidx.view.InterfaceC5989E;
import androidx.view.b0;
import com.google.android.gms.location.LocationRequest;
import com.radiusnetworks.flybuy.sdk.FlyBuyCore;
import com.radiusnetworks.flybuy.sdk.data.app.SdkConfig;
import com.radiusnetworks.flybuy.sdk.data.push.FlybuyPushData;
import com.radiusnetworks.flybuy.sdk.data.room.domain.BeaconRegion;
import com.radiusnetworks.flybuy.sdk.data.room.domain.Order;
import com.radiusnetworks.flybuy.sdk.data.room.domain.OrderKt;
import com.radiusnetworks.flybuy.sdk.logging.LogExtensionsKt;
import com.radiusnetworks.flybuy.sdk.pickup.PickupManager;
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
import qv.C16623P;
import qv.C16639f0;
import qv.C16648k;

/* loaded from: classes11.dex */
public abstract class t extends Service {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f120057s = 0;

    /* renamed from: a, reason: collision with root package name */
    public com.radiusnetworks.flybuy.sdk.pickup.helper.c f120058a;

    /* renamed from: c, reason: collision with root package name */
    public final i f120060c;

    /* renamed from: d, reason: collision with root package name */
    public final k f120061d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC3769c f120062e;

    /* renamed from: f, reason: collision with root package name */
    public j f120063f;

    /* renamed from: h, reason: collision with root package name */
    public boolean f120065h;

    /* renamed from: k, reason: collision with root package name */
    public boolean f120068k;

    /* renamed from: l, reason: collision with root package name */
    public final C5988D f120069l;

    /* renamed from: m, reason: collision with root package name */
    public com.radiusnetworks.flybuy.sdk.pickup.data.a f120070m;

    /* renamed from: n, reason: collision with root package name */
    public final AbstractC5985A f120071n;

    /* renamed from: o, reason: collision with root package name */
    public List f120072o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC5989E f120073p;

    /* renamed from: q, reason: collision with root package name */
    public final Lazy f120074q;

    /* renamed from: r, reason: collision with root package name */
    public m f120075r;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5989E f120059b = new InterfaceC5989E() { // from class: com.radiusnetworks.flybuy.sdk.pickup.service.q
        @Override // androidx.view.InterfaceC5989E
        public final void onChanged(Object obj) {
            t.c(this.f120054a, (Pair) obj);
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public final b f120064g = new b();

    /* renamed from: i, reason: collision with root package name */
    public final AbstractC5985A f120066i = FlyBuyCore.getOrders().getOpenLiveData();

    /* renamed from: j, reason: collision with root package name */
    public final InterfaceC5989E f120067j = new InterfaceC5989E() { // from class: com.radiusnetworks.flybuy.sdk.pickup.service.r
        @Override // androidx.view.InterfaceC5989E
        public final void onChanged(Object obj) throws Exception {
            t.f(this.f120055a, (List) obj);
        }
    };

    public static final void b(t this$0, List list) throws Exception {
        Intrinsics.j(this$0, "this$0");
        try {
            LogExtensionsKt.logd(this$0, true, "Beacon Regions Changed!");
            this$0.f120072o = list;
            this$0.e();
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public static final void c(t this$0, Pair p10) {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(p10, "p");
        com.radiusnetworks.flybuy.sdk.pickup.helper.c cVar = this$0.f120058a;
        if (cVar == null) {
            Intrinsics.y("locationEventGenerator");
            cVar = null;
        }
        SdkConfig sdkConfig = (SdkConfig) p10.c();
        cVar.getClass();
        Intrinsics.j(sdkConfig, "<set-?>");
        cVar.f120015d = sdkConfig;
    }

    public static final void f(t this$0, List it) throws Exception {
        Intrinsics.j(this$0, "this$0");
        Intrinsics.j(it, "it");
        try {
            LogExtensionsKt.logd(this$0, true, "Orders Changed!");
            this$0.d(it);
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public final Notification a() {
        m.e eVarV;
        List list = (List) this.f120066i.e();
        Order order = list != null ? (Order) CollectionsKt.u0(list) : null;
        PickupManager.Companion companion = PickupManager.INSTANCE;
        if (((PickupManager) SingletonHolder.getInstance$default(companion, null, 1, null)).getLiveStatusNotificationUpdater() != null) {
            eVarV = new m.e(this, "channel_flybuy_live_status").y(com.radiusnetworks.flybuy.sdk.pickup.e.f119993a).h(Z1.b.c(this, com.radiusnetworks.flybuy.sdk.pickup.d.f119987a)).v(0).x(true);
            Intrinsics.i(eVarV, "setSilent(...)");
            Function2<m.e, Order, Unit> liveStatusNotificationUpdater = ((PickupManager) SingletonHolder.getInstance$default(companion, null, 1, null)).getLiveStatusNotificationUpdater();
            if (liveStatusNotificationUpdater != null) {
                liveStatusNotificationUpdater.invoke(eVarV, order);
            }
        } else {
            eVarV = new m.e(this, "channel_01").y(com.radiusnetworks.flybuy.sdk.pickup.e.f119993a).h(Z1.b.c(this, com.radiusnetworks.flybuy.sdk.pickup.d.f119987a)).k(getString(com.radiusnetworks.flybuy.sdk.pickup.f.f120008c)).j(getString(com.radiusnetworks.flybuy.sdk.pickup.f.f120007b)).A(new m.c().h(getString(com.radiusnetworks.flybuy.sdk.pickup.f.f120007b)).i(getString(com.radiusnetworks.flybuy.sdk.pickup.f.f120008c))).v(-1);
            Intrinsics.g(eVarV);
        }
        eVarV.u(true).F(System.currentTimeMillis());
        if (Build.VERSION.SDK_INT >= 31) {
            eVarV.p(1);
        }
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getApplicationContext().getPackageName());
        if (order != null) {
            Bundle bundle = new Bundle();
            bundle.putString("message_source", FlybuyPushData.MESSAGE_SOURCE_FLYBUY);
            bundle.putString("order_id", String.valueOf(order.getId()));
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

    public final void d(List orders) {
        com.radiusnetworks.flybuy.sdk.pickup.helper.c cVar = this.f120058a;
        if (cVar == null) {
            Intrinsics.y("locationEventGenerator");
            cVar = null;
        }
        cVar.getClass();
        Intrinsics.j(orders, "orders");
        synchronized (cVar.f120018g) {
            try {
                cVar.f120018g.clear();
                ArrayList arrayList = new ArrayList();
                for (Object obj : orders) {
                    if (!OrderKt.getLocationTrackingDeferred((Order) obj)) {
                        arrayList.add(obj);
                    }
                }
                cVar.f120018g.addAll(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        cVar.e();
        if (!orders.isEmpty()) {
            C16648k.d(C16623P.a(C16639f0.b()), null, null, new o(this, null), 3, null);
            return;
        }
        LogExtensionsKt.logd(this, false, "Stopping Pickup location service...");
        stopForeground(1);
        stopSelf();
    }

    public final void e() {
        BluetoothAdapter bluetoothAdapter;
        com.radiusnetworks.flybuy.sdk.pickup.helper.c cVar = this.f120058a;
        if (cVar == null) {
            Intrinsics.y("locationEventGenerator");
            cVar = null;
        }
        if (cVar.f120017f.f119988a >= 500) {
            if (this.f120068k) {
                LogExtensionsKt.logd(this, false, "Stopping Pickup beacon monitoring...");
                BluetoothAdapter bluetoothAdapter2 = (BluetoothAdapter) this.f120074q.getValue();
                if (bluetoothAdapter2 != null) {
                    BluetoothAdapter bluetoothAdapter3 = bluetoothAdapter2.isEnabled() ? bluetoothAdapter2 : null;
                    if (bluetoothAdapter3 != null && this.f120075r != null) {
                        BluetoothLeScanner bluetoothLeScanner = bluetoothAdapter3.getBluetoothLeScanner();
                        m mVar = this.f120075r;
                        Intrinsics.h(mVar, "null cannot be cast to non-null type android.bluetooth.le.ScanCallback");
                        bluetoothLeScanner.stopScan(mVar);
                    }
                }
                this.f120068k = false;
                return;
            }
            return;
        }
        List<BeaconRegion> list = this.f120072o;
        Context applicationContext = getApplicationContext();
        Intrinsics.i(applicationContext, "getApplicationContext(...)");
        if (!PermissionExtensionsKt.hasBluetoothScanPermission(applicationContext) || list == null || !(!list.isEmpty()) || this.f120068k || (bluetoothAdapter = (BluetoothAdapter) this.f120074q.getValue()) == null || !bluetoothAdapter.isEnabled()) {
            return;
        }
        LogExtensionsKt.logd(this, false, "Starting Pickup beacon monitoring...");
        this.f120068k = true;
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
        this.f120075r = new m(this);
        BluetoothAdapter bluetoothAdapter4 = (BluetoothAdapter) this.f120074q.getValue();
        Intrinsics.g(bluetoothAdapter4);
        BluetoothLeScanner bluetoothLeScanner2 = bluetoothAdapter4.getBluetoothLeScanner();
        m mVar2 = this.f120075r;
        Intrinsics.h(mVar2, "null cannot be cast to non-null type android.bluetooth.le.ScanCallback");
        bluetoothLeScanner2.startScan(listM1, scanSettingsBuild, mVar2);
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        Intrinsics.j(intent, "intent");
        LogExtensionsKt.logd(this, true, "onBind");
        return this.f120064g;
    }

    @Override // android.app.Service
    public final void onCreate() throws Exception {
        super.onCreate();
        try {
            Clock clockSystemDefaultZone = Clock.systemDefaultZone();
            Intrinsics.i(clockSystemDefaultZone, "systemDefaultZone(...)");
            this.f120058a = new com.radiusnetworks.flybuy.sdk.pickup.helper.c(clockSystemDefaultZone, this.f120060c, this.f120061d);
            FlyBuyCore.INSTANCE.getConfig().addConfigChangeListener(this.f120059b);
            InterfaceC3769c interfaceC3769cB = C3778l.b(this);
            Intrinsics.i(interfaceC3769cB, "getFusedLocationProviderClient(...)");
            this.f120062e = interfaceC3769cB;
            this.f120063f = new j(this);
            Object systemService = getSystemService("notification");
            Intrinsics.h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            j jVar = null;
            if (Build.VERSION.SDK_INT >= 26) {
                boolean z10 = ((PickupManager) SingletonHolder.getInstance$default(PickupManager.INSTANCE, null, 1, null)).getLiveStatusNotificationUpdater() != null;
                String str = z10 ? "channel_flybuy_live_status" : "channel_01";
                String str2 = z10 ? "channel_01" : "channel_flybuy_live_status";
                int i10 = z10 ? 3 : 2;
                notificationManager.deleteNotificationChannel(str2);
                com.adobe.marketing.mobile.v.a();
                NotificationChannel notificationChannelA = com.adobe.marketing.mobile.u.a(str, getString(com.radiusnetworks.flybuy.sdk.pickup.f.f120006a), i10);
                notificationChannelA.setShowBadge(false);
                notificationManager.createNotificationChannel(notificationChannelA);
            }
            if (!this.f120065h) {
                StringBuilder sb2 = new StringBuilder("Requesting location updates with ");
                LocationRequest locationRequestB = LocationRequest.B();
                Intrinsics.i(locationRequestB, "create(...)");
                com.radiusnetworks.flybuy.sdk.pickup.data.a aVar = this.f120070m;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                long j10 = (long) aVar.f119989b;
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                locationRequestB.J2(timeUnit.convert(j10, timeUnit2));
                locationRequestB.l2(1000L);
                locationRequestB.M2(aVar.f119990c);
                locationRequestB.O2(aVar.f119991d);
                sb2.append(locationRequestB);
                LogExtensionsKt.logd(this, true, sb2.toString());
                InterfaceC3769c interfaceC3769c = this.f120062e;
                if (interfaceC3769c == null) {
                    Intrinsics.y("locationClient");
                    interfaceC3769c = null;
                }
                LocationRequest locationRequestB2 = LocationRequest.B();
                Intrinsics.i(locationRequestB2, "create(...)");
                com.radiusnetworks.flybuy.sdk.pickup.data.a aVar2 = this.f120070m;
                locationRequestB2.J2(timeUnit.convert((long) aVar2.f119989b, timeUnit2));
                locationRequestB2.l2(1000L);
                locationRequestB2.M2(aVar2.f119990c);
                locationRequestB2.O2(aVar2.f119991d);
                j jVar2 = this.f120063f;
                if (jVar2 == null) {
                    Intrinsics.y("locationCallback");
                } else {
                    jVar = jVar2;
                }
                interfaceC3769c.m(locationRequestB2, jVar, Looper.getMainLooper());
                this.f120065h = true;
            }
            this.f120066i.j(this.f120067j);
            this.f120071n.j(this.f120073p);
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() throws Exception {
        try {
            LogExtensionsKt.logd(this, true, "onDestroy");
            FlyBuyCore.INSTANCE.getConfig().removeConfigChangeListener(this.f120059b);
            this.f120071n.n(this.f120073p);
            j jVar = null;
            if (this.f120068k) {
                LogExtensionsKt.logd(this, false, "Stopping Pickup beacon monitoring...");
                BluetoothAdapter bluetoothAdapter = (BluetoothAdapter) this.f120074q.getValue();
                if (bluetoothAdapter != null) {
                    if (!bluetoothAdapter.isEnabled()) {
                        bluetoothAdapter = null;
                    }
                    if (bluetoothAdapter != null && this.f120075r != null) {
                        BluetoothLeScanner bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner();
                        m mVar = this.f120075r;
                        Intrinsics.h(mVar, "null cannot be cast to non-null type android.bluetooth.le.ScanCallback");
                        bluetoothLeScanner.stopScan(mVar);
                    }
                }
                this.f120068k = false;
            }
            this.f120066i.n(this.f120067j);
            if (this.f120065h) {
                LogExtensionsKt.logd(this, true, "Removing location updates");
                InterfaceC3769c interfaceC3769c = this.f120062e;
                if (interfaceC3769c == null) {
                    Intrinsics.y("locationClient");
                    interfaceC3769c = null;
                }
                j jVar2 = this.f120063f;
                if (jVar2 == null) {
                    Intrinsics.y("locationCallback");
                } else {
                    jVar = jVar2;
                }
                interfaceC3769c.h(jVar);
                this.f120065h = false;
            }
            super.onDestroy();
        } catch (Exception e10) {
            FlyBuyCore.INSTANCE.getCrashManager().reportCrash(e10);
            throw e10;
        }
    }

    public t() {
        LocationService locationService = (LocationService) this;
        this.f120060c = new i(locationService);
        this.f120061d = new k(locationService);
        C5988D c5988d = new C5988D();
        this.f120069l = c5988d;
        this.f120070m = com.radiusnetworks.flybuy.sdk.pickup.data.b.f119992a;
        this.f120071n = b0.f(c5988d, c.f120030f);
        this.f120073p = new InterfaceC5989E() { // from class: com.radiusnetworks.flybuy.sdk.pickup.service.s
            @Override // androidx.view.InterfaceC5989E
            public final void onChanged(Object obj) throws Exception {
                t.b(this.f120056a, (List) obj);
            }
        };
        this.f120074q = LazyKt.a(LazyThreadSafetyMode.f142381c, new e(locationService));
    }
}
