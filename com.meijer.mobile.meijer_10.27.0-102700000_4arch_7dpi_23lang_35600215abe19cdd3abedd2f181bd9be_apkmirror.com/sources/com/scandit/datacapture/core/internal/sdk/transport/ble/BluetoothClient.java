package com.scandit.datacapture.core.internal.sdk.transport.ble;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import com.fullstory.FS;
import com.scandit.datacapture.core.internal.sdk.data.NativeDataTransportError;
import com.scandit.datacapture.core.internal.sdk.transport.DataTransportListener;
import java.io.ByteArrayOutputStream;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0001\u0018\u0000 *2\u00020\u0001:\u0001*B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0015J'\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010 \u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\f¢\u0006\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/transport/ble/BluetoothClient;", "Landroid/bluetooth/BluetoothGattCallback;", "Landroid/content/Context;", "context", "Lcom/scandit/datacapture/core/internal/sdk/transport/DataTransportListener;", "listener", "Lcom/scandit/datacapture/core/internal/sdk/transport/ble/BleUuids;", "uuids", "<init>", "(Landroid/content/Context;Lcom/scandit/datacapture/core/internal/sdk/transport/DataTransportListener;Lcom/scandit/datacapture/core/internal/sdk/transport/ble/BleUuids;)V", "Landroid/bluetooth/BluetoothDevice;", "device", "", "connect", "(Landroid/bluetooth/BluetoothDevice;)V", "Landroid/bluetooth/BluetoothGatt;", "gatt", "", "status", "newState", "onConnectionStateChange", "(Landroid/bluetooth/BluetoothGatt;II)V", "onServicesDiscovered", "(Landroid/bluetooth/BluetoothGatt;I)V", "mtu", "onMtuChanged", "Landroid/bluetooth/BluetoothGattDescriptor;", "descriptor", "onDescriptorWrite", "(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V", "Landroid/bluetooth/BluetoothGattCharacteristic;", "characteristic", "onCharacteristicWrite", "(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;I)V", "onCharacteristicChanged", "(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V", "", "data", "sendMessage", "([B)V", "disconnect", "()V", "Companion", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"MissingPermission"})
/* loaded from: classes11.dex */
public final class BluetoothClient extends BluetoothGattCallback {

    /* renamed from: a, reason: collision with root package name */
    private final Context f125521a;

    /* renamed from: b, reason: collision with root package name */
    private final DataTransportListener f125522b;

    /* renamed from: c, reason: collision with root package name */
    private final BleUuids f125523c;

    /* renamed from: d, reason: collision with root package name */
    private BluetoothGatt f125524d;

    /* renamed from: e, reason: collision with root package name */
    private BluetoothGattCharacteristic f125525e;

    /* renamed from: f, reason: collision with root package name */
    private BluetoothGattCharacteristic f125526f;

    /* renamed from: g, reason: collision with root package name */
    private BluetoothGattCharacteristic f125527g;

    /* renamed from: h, reason: collision with root package name */
    private final Queue f125528h;

    /* renamed from: i, reason: collision with root package name */
    private final ByteArrayOutputStream f125529i;

    /* renamed from: j, reason: collision with root package name */
    private int f125530j;

    private final void a() {
        byte[] bArr = (byte[]) ((ArrayDeque) this.f125528h).poll();
        if (bArr == null) {
            return;
        }
        if (bArr.length == 0) {
            return;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f125526f;
        if (bluetoothGattCharacteristic != null) {
            bluetoothGattCharacteristic.setValue(bArr);
        }
        try {
            BluetoothGatt bluetoothGatt = this.f125524d;
            Intrinsics.g(bluetoothGatt);
            if (bluetoothGatt.writeCharacteristic(this.f125526f)) {
                return;
            }
            a(NativeDataTransportError.WRITE_FAILED);
        } catch (SecurityException unused) {
            a(NativeDataTransportError.WRITE_FAILED);
        }
    }

    public BluetoothClient(Context context, DataTransportListener listener, BleUuids uuids) {
        Intrinsics.j(context, "context");
        Intrinsics.j(listener, "listener");
        Intrinsics.j(uuids, "uuids");
        this.f125521a = context;
        this.f125522b = listener;
        this.f125523c = uuids;
        this.f125528h = new ArrayDeque();
        this.f125529i = new ByteArrayOutputStream();
    }

    public final void connect(BluetoothDevice device) {
        Intrinsics.j(device, "device");
        try {
            this.f125524d = device.connectGatt(this.f125521a, false, this, 2);
        } catch (Exception unused) {
            a(NativeDataTransportError.CONNECTION_FAILED);
        }
    }

    public final void disconnect() {
        BluetoothGatt bluetoothGatt = this.f125524d;
        if (bluetoothGatt != null) {
            bluetoothGatt.disconnect();
        }
        BluetoothGatt bluetoothGatt2 = this.f125524d;
        if (bluetoothGatt2 != null) {
            bluetoothGatt2.close();
        }
        this.f125524d = null;
    }

    @Override // android.bluetooth.BluetoothGattCallback
    @Deprecated
    public void onCharacteristicChanged(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic) {
        Intrinsics.j(gatt, "gatt");
        Intrinsics.j(characteristic, "characteristic");
        if (Intrinsics.e(characteristic.getUuid(), this.f125523c.getServerToClientCharacteristic())) {
            byte[] value = characteristic.getValue();
            Intrinsics.g(value);
            if (value.length == 0) {
                a(NativeDataTransportError.READ_FAILED);
                return;
            }
            this.f125529i.write(value, 1, value.length - 1);
            if (value[0] != 0) {
                a(NativeDataTransportError.READ_FAILED);
                return;
            }
            byte[] byteArray = this.f125529i.toByteArray();
            this.f125529i.reset();
            this.f125522b.onDataReceived(byteArray);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicWrite(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status) {
        Intrinsics.j(gatt, "gatt");
        Intrinsics.j(characteristic, "characteristic");
        UUID uuid = characteristic.getUuid();
        if (Intrinsics.e(uuid, this.f125523c.getStateCharacteristic())) {
            if (status == 0) {
                this.f125522b.onConnected();
                return;
            } else {
                a(NativeDataTransportError.WRITE_FAILED);
                return;
            }
        }
        if (Intrinsics.e(uuid, this.f125523c.getClientToServerCharacteristic())) {
            if (status == 0) {
                a();
            } else {
                a(NativeDataTransportError.WRITE_FAILED);
            }
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onConnectionStateChange(BluetoothGatt gatt, int status, int newState) {
        Intrinsics.j(gatt, "gatt");
        if (newState == 0) {
            this.f125522b.onDisconnected();
        } else {
            if (newState != 2) {
                return;
            }
            try {
                gatt.requestConnectionPriority(1);
                gatt.discoverServices();
            } catch (SecurityException unused) {
                a(NativeDataTransportError.CONNECTION_FAILED);
            }
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onDescriptorWrite(BluetoothGatt gatt, BluetoothGattDescriptor descriptor, int status) {
        BluetoothGattDescriptor descriptor2;
        Intrinsics.j(gatt, "gatt");
        Intrinsics.j(descriptor, "descriptor");
        try {
            UUID uuid = descriptor.getCharacteristic().getUuid();
            if (!Intrinsics.e(uuid, this.f125523c.getServerToClientCharacteristic()) || !Intrinsics.e(descriptor.getUuid(), this.f125523c.getClientCharacteristicConfiguration())) {
                if (!Intrinsics.e(uuid, this.f125523c.getStateCharacteristic()) || !Intrinsics.e(descriptor.getUuid(), this.f125523c.getClientCharacteristicConfiguration())) {
                    a(NativeDataTransportError.WRITE_FAILED);
                    return;
                }
                BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f125525e;
                if (bluetoothGattCharacteristic != null) {
                    bluetoothGattCharacteristic.setValue(new byte[]{1});
                }
                if (gatt.writeCharacteristic(this.f125525e)) {
                    return;
                }
                a(NativeDataTransportError.WRITE_FAILED);
                return;
            }
            if (!gatt.setCharacteristicNotification(this.f125525e, true)) {
                a(NativeDataTransportError.WRITE_FAILED);
                return;
            }
            BluetoothGattCharacteristic bluetoothGattCharacteristic2 = this.f125525e;
            if (bluetoothGattCharacteristic2 == null || (descriptor2 = bluetoothGattCharacteristic2.getDescriptor(this.f125523c.getClientCharacteristicConfiguration())) == null) {
                return;
            }
            descriptor2.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            if (gatt.writeDescriptor(descriptor2)) {
                return;
            }
            a(NativeDataTransportError.WRITE_FAILED);
        } catch (SecurityException unused) {
            a(NativeDataTransportError.WRITE_FAILED);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onMtuChanged(BluetoothGatt gatt, int mtu, int status) {
        Intrinsics.j(gatt, "gatt");
        if (mtu == 0) {
            mtu = 23;
        }
        this.f125530j = mtu > 515 ? 512 : mtu - 3;
        if (status != 0) {
            a(NativeDataTransportError.CONNECTION_FAILED);
        }
        try {
            if (!gatt.setCharacteristicNotification(this.f125527g, true)) {
                a(NativeDataTransportError.CONNECTION_FAILED);
                return;
            }
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f125527g;
            BluetoothGattDescriptor descriptor = bluetoothGattCharacteristic != null ? bluetoothGattCharacteristic.getDescriptor(this.f125523c.getClientCharacteristicConfiguration()) : null;
            if (descriptor == null) {
                a(NativeDataTransportError.CONNECTION_FAILED);
                return;
            }
            descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            if (gatt.writeDescriptor(descriptor)) {
                return;
            }
            a(NativeDataTransportError.CONNECTION_FAILED);
        } catch (SecurityException unused) {
            a(NativeDataTransportError.CONNECTION_FAILED);
        }
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onServicesDiscovered(BluetoothGatt gatt, int status) {
        Intrinsics.j(gatt, "gatt");
        if (status == 0) {
            BluetoothGattService service = gatt.getService(this.f125523c.getService());
            if (service != null) {
                BluetoothGattCharacteristic characteristic = service.getCharacteristic(this.f125523c.getStateCharacteristic());
                this.f125525e = characteristic;
                if (characteristic == null) {
                    a(NativeDataTransportError.CONNECTION_FAILED);
                    return;
                }
                BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(this.f125523c.getClientToServerCharacteristic());
                this.f125526f = characteristic2;
                if (characteristic2 == null) {
                    a(NativeDataTransportError.CONNECTION_FAILED);
                    return;
                }
                BluetoothGattCharacteristic characteristic3 = service.getCharacteristic(this.f125523c.getServerToClientCharacteristic());
                this.f125527g = characteristic3;
                if (characteristic3 == null) {
                    a(NativeDataTransportError.CONNECTION_FAILED);
                    return;
                }
            }
            try {
                if (gatt.requestMtu(515)) {
                    this.f125524d = gatt;
                } else {
                    a(NativeDataTransportError.CONNECTION_FAILED);
                }
            } catch (SecurityException unused) {
                a(NativeDataTransportError.CONNECTION_FAILED);
            }
        }
    }

    public final void sendMessage(byte[] data) {
        Intrinsics.j(data, "data");
        boolean zIsEmpty = ((ArrayDeque) this.f125528h).isEmpty();
        if (data.length == 0) {
            ((ArrayDeque) this.f125528h).add(data);
        } else {
            int i10 = this.f125530j - 1;
            int i11 = 0;
            do {
                byte b10 = i11 + i10 < data.length ? (byte) 1 : (byte) 0;
                int length = data.length - i11;
                if (length > i10) {
                    length = i10;
                }
                byte[] bArr = new byte[length + 1];
                bArr[0] = b10;
                System.arraycopy(data, i11, bArr, 1, length);
                ((ArrayDeque) this.f125528h).add(bArr);
                i11 += length;
            } while (i11 < data.length);
        }
        if (zIsEmpty) {
            a();
        }
    }

    private final void a(NativeDataTransportError nativeDataTransportError) {
        FS.log_e("BluetoothClient", nativeDataTransportError.toString());
        this.f125522b.onError(nativeDataTransportError);
    }
}
