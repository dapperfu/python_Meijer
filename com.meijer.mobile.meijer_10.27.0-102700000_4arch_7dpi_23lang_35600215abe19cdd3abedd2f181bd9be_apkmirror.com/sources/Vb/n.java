package Vb;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import ib.C14712a;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public class n extends j implements BluetoothAdapter.LeScanCallback {

    /* renamed from: j, reason: collision with root package name */
    private static C6380a f37121j = C6381b.a(n.class.getSimpleName());

    /* renamed from: k, reason: collision with root package name */
    static C6382c f37122k = C6383d.a(n.class.getSimpleName());

    /* renamed from: i, reason: collision with root package name */
    private k f37123i;

    private k m() {
        if (this.f37123i == null) {
            this.f37123i = new k(this);
        }
        return this.f37123i;
    }

    @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
    public void onLeScan(BluetoothDevice bluetoothDevice, int i10, byte[] bArr) {
        ExecutorService executorService = this.f37091d;
        if (executorService != null) {
            executorService.execute(c(i10, bArr));
        }
    }

    public n(a aVar, p pVar, ic.h hVar, C14712a c14712a, tb.e eVar) {
        super(aVar, pVar, hVar, c14712a, eVar);
    }

    @Override // Ua.b
    public final void a() {
        m().f37101g = 1000;
        m().f37102h = HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR;
        m().a();
    }

    @Override // Ua.b
    public final void b() {
        m().f37101g = 1000;
        m().f37102h = 1000;
        m().a();
    }

    @Override // Vb.j
    public final void e() {
        m().i();
    }

    @Override // Vb.j
    public final void f() {
        m().g();
    }

    public final void l() {
        try {
            BluetoothAdapter bluetoothAdapterJ = j();
            if (bluetoothAdapterJ != null) {
                bluetoothAdapterJ.stopLeScan(this);
            } else {
                f37122k.g("BluetoothAdapter - Adapter is null", new Object[0]);
            }
        } catch (Exception e10) {
            f37122k.g("Stop Scan failed ", e10);
        }
        synchronized (this) {
            i();
        }
    }
}
