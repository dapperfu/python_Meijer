package Xb;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.radiusnetworks.flybuy.api.network.response.HttpResponseStatus;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.util.concurrent.ExecutorService;
import kb.C15115a;

/* loaded from: classes4.dex */
public class n extends j implements BluetoothAdapter.LeScanCallback {

    /* renamed from: j, reason: collision with root package name */
    private static C13784a f41833j = C13785b.a(n.class.getSimpleName());

    /* renamed from: k, reason: collision with root package name */
    static C13786c f41834k = C13787d.a(n.class.getSimpleName());

    /* renamed from: i, reason: collision with root package name */
    private k f41835i;

    private k m() {
        if (this.f41835i == null) {
            this.f41835i = new k(this);
        }
        return this.f41835i;
    }

    @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
    public void onLeScan(BluetoothDevice bluetoothDevice, int i10, byte[] bArr) {
        ExecutorService executorService = this.f41803d;
        if (executorService != null) {
            executorService.execute(c(i10, bArr));
        }
    }

    public n(a aVar, p pVar, kc.h hVar, C15115a c15115a, vb.e eVar) {
        super(aVar, pVar, hVar, c15115a, eVar);
    }

    @Override // Wa.b
    public final void a() {
        m().f41813g = 1000;
        m().f41814h = HttpResponseStatus.ERROR_INTERNAL_SERVER_ERROR;
        m().a();
    }

    @Override // Wa.b
    public final void b() {
        m().f41813g = 1000;
        m().f41814h = 1000;
        m().a();
    }

    @Override // Xb.j
    public final void e() {
        m().i();
    }

    @Override // Xb.j
    public final void f() {
        m().g();
    }

    public final void l() {
        try {
            BluetoothAdapter bluetoothAdapterJ = j();
            if (bluetoothAdapterJ != null) {
                bluetoothAdapterJ.stopLeScan(this);
            } else {
                f41834k.g("BluetoothAdapter - Adapter is null", new Object[0]);
            }
        } catch (Exception e10) {
            f41834k.g("Stop Scan failed ", e10);
        }
        synchronized (this) {
            i();
        }
    }
}
