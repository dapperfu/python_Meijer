package Xb;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import hb.C14495b;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import kb.C15115a;

@TargetApi(21)
/* loaded from: classes4.dex */
public class m extends j implements Db.k {

    /* renamed from: r, reason: collision with root package name */
    private static C13784a f41819r = C13785b.a(m.class.getName());

    /* renamed from: s, reason: collision with root package name */
    private static C13786c f41820s = C13787d.a(m.class.getName());

    /* renamed from: i, reason: collision with root package name */
    private boolean f41821i;

    /* renamed from: j, reason: collision with root package name */
    private s f41822j;

    /* renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f41823k;

    /* renamed from: l, reason: collision with root package name */
    private Handler f41824l;

    /* renamed from: m, reason: collision with root package name */
    private Nb.f f41825m;

    /* renamed from: n, reason: collision with root package name */
    private ThreadFactory f41826n;

    /* renamed from: o, reason: collision with root package name */
    private Db.b f41827o;

    /* renamed from: p, reason: collision with root package name */
    private t f41828p;

    /* renamed from: q, reason: collision with root package name */
    private ScanCallback f41829q;

    final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            m.this.v();
        }
    }

    final class b extends ScanCallback {
        b() {
        }

        @Override // android.bluetooth.le.ScanCallback
        public final void onScanResult(int i10, ScanResult scanResult) {
            m.this.f41825m.a();
            ScanRecord scanRecord = scanResult.getScanRecord();
            if (scanRecord != null) {
                Runnable runnableC = m.this.c(scanResult.getRssi(), scanRecord.getBytes());
                ExecutorService executorService = m.this.f41803d;
                if (executorService != null) {
                    executorService.execute(runnableC);
                }
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public final void onScanFailed(int i10) {
            C13784a unused = m.f41819r;
            m.this.z();
        }
    }

    private class c implements Handler.Callback {
        private c() {
        }

        /* synthetic */ c(m mVar, byte b10) {
            this();
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            synchronized (m.this.f41823k) {
                try {
                    boolean z10 = false;
                    if (!m.this.f41823k.get()) {
                        return false;
                    }
                    int i10 = message.what;
                    if (i10 == 1) {
                        m.this.u();
                    } else {
                        if (i10 != 2) {
                            return z10;
                        }
                        if (m.q(m.this)) {
                            m.this.w();
                            m.this.f41824l.sendEmptyMessageDelayed(1, 500L);
                        } else {
                            C13784a unused = m.f41819r;
                        }
                    }
                    z10 = true;
                    return z10;
                } finally {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void u() {
        Thread threadNewThread = this.f41826n.newThread(new a());
        if (threadNewThread != null) {
            threadNewThread.start();
        } else {
            z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void v() {
        try {
            BluetoothLeScanner bluetoothLeScannerX = x();
            if (bluetoothLeScannerX != null) {
                s sVarA = this.f41828p.a(this.f41821i);
                this.f41822j = sVarA;
                bluetoothLeScannerX.startScan(sVarA.f41842a, sVarA.f41843b, this.f41829q);
                f41820s.e("Started BLE scan", new Object[0]);
                return;
            }
        } catch (Exception unused) {
            f41820s.g("Could not start BLE scan", new Object[0]);
        }
        z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void w() {
        try {
            BluetoothLeScanner bluetoothLeScannerX = x();
            if (bluetoothLeScannerX != null) {
                bluetoothLeScannerX.stopScan(this.f41829q);
                f41820s.e("Stopped BLE scan", new Object[0]);
            }
        } catch (Exception unused) {
            f41820s.g("Could not stop BLE scan", new Object[0]);
        }
    }

    @Override // Wa.b
    public final void a() {
        this.f41821i = true;
        y();
    }

    @Override // Wa.b
    public final void b() {
        this.f41821i = false;
        y();
    }

    private void A() {
        this.f41824l.removeMessages(1);
        this.f41824l.removeMessages(2);
    }

    static /* synthetic */ boolean q(m mVar) {
        return !mVar.f41828p.a(mVar.f41821i).equals(mVar.f41822j);
    }

    private void y() {
        synchronized (this.f41823k) {
            try {
                if (this.f41823k.get()) {
                    A();
                    this.f41824l.sendEmptyMessageDelayed(2, 1000L);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        synchronized (this.f41823k) {
            try {
                if (this.f41823k.get()) {
                    A();
                    Handler handler = this.f41824l;
                    Nb.f fVar = this.f41825m;
                    float f10 = 1.0f / fVar.f20760c;
                    long jMax = Math.max((long) (fVar.f20761d * (f10 + (fVar.f20762e.nextFloat() * (1.0f - f10)))), fVar.f20758a);
                    fVar.f20761d = Math.min((long) (fVar.f20761d * fVar.f20760c), fVar.f20759b);
                    handler.sendEmptyMessageDelayed(1, jMax);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Xb.j
    public final void e() {
        synchronized (this.f41823k) {
            try {
                if (this.f41823k.get()) {
                    A();
                    i();
                    w();
                    this.f41823k.set(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Xb.j
    public final void f() {
        synchronized (this.f41823k) {
            try {
                if (!this.f41823k.get()) {
                    this.f41825m.a();
                    h();
                    u();
                    this.f41823k.set(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public m(Xb.a aVar, p pVar, kc.h hVar, C15115a c15115a, vb.e eVar, Db.b bVar, vb.q qVar) {
        super(aVar, pVar, hVar, c15115a, eVar);
        this.f41829q = new b();
        this.f41827o = bVar;
        this.f41828p = new u(bVar, qVar, Build.MODEL, C14495b.a().f135207D);
        this.f41823k = new AtomicBoolean(false);
        this.f41821i = false;
        this.f41822j = this.f41828p.a(false);
        this.f41824l = new Handler(new c(this, (byte) 0));
        this.f41825m = new Nb.f();
        this.f41826n = new Nb.j("BluetoothScanner", "{0}-{1}");
        this.f41827o.g(this, "ibeaconToResolve");
        this.f41827o.g(this, "foregroundScanMode");
        this.f41827o.g(this, "backgroundScanMode");
        this.f41827o.g(this, "thirdPartyScannerStateChange");
        this.f41827o.g(this, "scanParametersConfiguration");
    }

    private BluetoothLeScanner x() {
        BluetoothAdapter bluetoothAdapterJ = j();
        if (bluetoothAdapterJ != null) {
            return bluetoothAdapterJ.getBluetoothLeScanner();
        }
        f41820s.g("BluetoothAdapter - Adapter is null", new Object[0]);
        return null;
    }

    @Override // Db.k
    public final void a(String str, Object obj) {
        str.getClass();
        switch (str) {
            case "thirdPartyScannerStateChange":
            case "backgroundScanMode":
            case "scanParametersConfiguration":
            case "ibeaconToResolve":
            case "foregroundScanMode":
                y();
                break;
        }
    }
}
