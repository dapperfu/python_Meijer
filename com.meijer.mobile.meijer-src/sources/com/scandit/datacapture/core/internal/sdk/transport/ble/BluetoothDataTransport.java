package com.scandit.datacapture.core.internal.sdk.transport.ble;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.os.Build;
import android.os.ParcelUuid;
import com.scandit.datacapture.core.internal.sdk.data.NativeDataTransportConnectionOptions;
import com.scandit.datacapture.core.internal.sdk.data.NativeDataTransportError;
import com.scandit.datacapture.core.internal.sdk.data.NativeDataTransportType;
import com.scandit.datacapture.core.internal.sdk.transport.DataTransport;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/transport/ble/BluetoothDataTransport;", "Lcom/scandit/datacapture/core/internal/sdk/transport/DataTransport;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isAvailable", "()Z", "Lcom/scandit/datacapture/core/internal/sdk/data/NativeDataTransportConnectionOptions;", "options", "", "connect", "(Lcom/scandit/datacapture/core/internal/sdk/data/NativeDataTransportConnectionOptions;)V", "disconnect", "()V", "", "data", "write", "([B)V", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"MissingPermission"})
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class BluetoothDataTransport extends DataTransport {

    /* renamed from: f, reason: collision with root package name */
    private static final List f126483f;

    /* renamed from: b, reason: collision with root package name */
    private final Context f126484b;

    /* renamed from: c, reason: collision with root package name */
    private final BluetoothManager f126485c;

    /* renamed from: d, reason: collision with root package name */
    private BluetoothClient f126486d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f126487e;

    static {
        f126483f = Build.VERSION.SDK_INT >= 31 ? CollectionsKt.p("android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT") : CollectionsKt.e("android.permission.ACCESS_FINE_LOCATION");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BluetoothDataTransport(Context context) {
        super(NativeDataTransportType.BLUETOOTH);
        Intrinsics.j(context, "context");
        this.f126484b = context;
        Object systemService = context.getSystemService("bluetooth");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        this.f126485c = (BluetoothManager) systemService;
        this.f126487e = new AtomicBoolean(false);
    }

    @Override // com.scandit.datacapture.core.internal.sdk.data.NativeDataTransport
    public void connect(final NativeDataTransportConnectionOptions options) {
        Intrinsics.j(options, "options");
        BluetoothAdapter adapter = this.f126485c.getAdapter();
        BluetoothLeScanner bluetoothLeScanner = adapter != null ? adapter.getBluetoothLeScanner() : null;
        if (bluetoothLeScanner == null) {
            getListener().onError(NativeDataTransportError.CONNECTION_FAILED);
            return;
        }
        UUID uuidFromString = UUID.fromString(options.getPeripheralServerModeUuid());
        ScanCallback scanCallback = new ScanCallback() { // from class: com.scandit.datacapture.core.internal.sdk.transport.ble.BluetoothDataTransport$connect$scanCallback$1
            @Override // android.bluetooth.le.ScanCallback
            public void onScanResult(int callbackType, ScanResult result) {
                Intrinsics.j(result, "result");
                super.onScanResult(callbackType, result);
                if (this.f126488a.f126487e.get()) {
                    return;
                }
                this.f126488a.f126487e.set(true);
                BluetoothDataTransport bluetoothDataTransport = this.f126488a;
                BluetoothClient bluetoothClient = new BluetoothClient(this.f126488a.f126484b, this.f126488a.getListener(), new BleUuids(options));
                BluetoothDevice device = result.getDevice();
                Intrinsics.i(device, "getDevice(...)");
                bluetoothClient.connect(device);
                bluetoothDataTransport.f126486d = bluetoothClient;
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanFailed(int errorCode) {
                super.onScanFailed(errorCode);
                this.f126488a.getListener().onError(NativeDataTransportError.CONNECTION_FAILED);
            }
        };
        try {
            bluetoothLeScanner.startScan(CollectionsKt.s(new ScanFilter.Builder().setServiceUuid(new ParcelUuid(uuidFromString)).build()), new ScanSettings.Builder().setCallbackType(1).setScanMode(2).build(), scanCallback);
        } catch (Exception unused) {
            getListener().onError(NativeDataTransportError.CONNECTION_FAILED);
        }
    }

    @Override // com.scandit.datacapture.core.internal.sdk.data.NativeDataTransport
    public void disconnect() {
        this.f126487e.set(false);
        this.f126486d = null;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.data.NativeDataTransport
    public boolean isAvailable() {
        boolean z10;
        boolean zHasSystemFeature = this.f126484b.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
        BluetoothAdapter adapter = this.f126485c.getAdapter();
        boolean z11 = adapter != null && adapter.isEnabled();
        List list = f126483f;
        if ((list instanceof Collection) && list.isEmpty()) {
            z10 = true;
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (this.f126484b.checkSelfPermission((String) it.next()) != 0) {
                    z10 = false;
                    break;
                }
            }
            z10 = true;
        }
        return zHasSystemFeature && z11 && z10;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.data.NativeDataTransport
    public void write(byte[] data) {
        Intrinsics.j(data, "data");
        BluetoothClient bluetoothClient = this.f126486d;
        if (bluetoothClient != null) {
            bluetoothClient.sendMessage(data);
        }
    }
}
