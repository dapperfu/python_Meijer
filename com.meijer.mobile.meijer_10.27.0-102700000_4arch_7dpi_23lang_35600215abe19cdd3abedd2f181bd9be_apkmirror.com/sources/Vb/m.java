package Vb;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import fb.C13865b;
import ib.C14712a;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(21)
/* loaded from: classes4.dex */
public class m extends j implements Bb.k {

    /* renamed from: r, reason: collision with root package name */
    private static C6380a f37107r = C6381b.a(m.class.getName());

    /* renamed from: s, reason: collision with root package name */
    private static C6382c f37108s = C6383d.a(m.class.getName());

    /* renamed from: i, reason: collision with root package name */
    private boolean f37109i;

    /* renamed from: j, reason: collision with root package name */
    private s f37110j;

    /* renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f37111k;

    /* renamed from: l, reason: collision with root package name */
    private Handler f37112l;

    /* renamed from: m, reason: collision with root package name */
    private Lb.f f37113m;

    /* renamed from: n, reason: collision with root package name */
    private ThreadFactory f37114n;

    /* renamed from: o, reason: collision with root package name */
    private Bb.b f37115o;

    /* renamed from: p, reason: collision with root package name */
    private t f37116p;

    /* renamed from: q, reason: collision with root package name */
    private ScanCallback f37117q;

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
            m.this.f37113m.a();
            ScanRecord scanRecord = scanResult.getScanRecord();
            if (scanRecord != null) {
                Runnable runnableC = m.this.c(scanResult.getRssi(), scanRecord.getBytes());
                ExecutorService executorService = m.this.f37091d;
                if (executorService != null) {
                    executorService.execute(runnableC);
                }
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public final void onScanFailed(int i10) {
            C6380a unused = m.f37107r;
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
            synchronized (m.this.f37111k) {
                try {
                    boolean z10 = false;
                    if (!m.this.f37111k.get()) {
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
                            m.this.f37112l.sendEmptyMessageDelayed(1, 500L);
                        } else {
                            C6380a unused = m.f37107r;
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
        Thread threadNewThread = this.f37114n.newThread(new a());
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
                s sVarA = this.f37116p.a(this.f37109i);
                this.f37110j = sVarA;
                bluetoothLeScannerX.startScan(sVarA.f37130a, sVarA.f37131b, this.f37117q);
                f37108s.e("Started BLE scan", new Object[0]);
                return;
            }
        } catch (Exception unused) {
            f37108s.g("Could not start BLE scan", new Object[0]);
        }
        z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void w() {
        try {
            BluetoothLeScanner bluetoothLeScannerX = x();
            if (bluetoothLeScannerX != null) {
                bluetoothLeScannerX.stopScan(this.f37117q);
                f37108s.e("Stopped BLE scan", new Object[0]);
            }
        } catch (Exception unused) {
            f37108s.g("Could not stop BLE scan", new Object[0]);
        }
    }

    @Override // Ua.b
    public final void a() {
        this.f37109i = true;
        y();
    }

    @Override // Ua.b
    public final void b() {
        this.f37109i = false;
        y();
    }

    private void A() {
        this.f37112l.removeMessages(1);
        this.f37112l.removeMessages(2);
    }

    static /* synthetic */ boolean q(m mVar) {
        return !mVar.f37116p.a(mVar.f37109i).equals(mVar.f37110j);
    }

    private void y() {
        synchronized (this.f37111k) {
            try {
                if (this.f37111k.get()) {
                    A();
                    this.f37112l.sendEmptyMessageDelayed(2, 1000L);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        synchronized (this.f37111k) {
            try {
                if (this.f37111k.get()) {
                    A();
                    Handler handler = this.f37112l;
                    Lb.f fVar = this.f37113m;
                    float f10 = 1.0f / fVar.f17940c;
                    long jMax = Math.max((long) (fVar.f17941d * (f10 + (fVar.f17942e.nextFloat() * (1.0f - f10)))), fVar.f17938a);
                    fVar.f17941d = Math.min((long) (fVar.f17941d * fVar.f17940c), fVar.f17939b);
                    handler.sendEmptyMessageDelayed(1, jMax);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Vb.j
    public final void e() {
        synchronized (this.f37111k) {
            try {
                if (this.f37111k.get()) {
                    A();
                    i();
                    w();
                    this.f37111k.set(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Vb.j
    public final void f() {
        synchronized (this.f37111k) {
            try {
                if (!this.f37111k.get()) {
                    this.f37113m.a();
                    h();
                    u();
                    this.f37111k.set(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public m(Vb.a aVar, p pVar, ic.h hVar, C14712a c14712a, tb.e eVar, Bb.b bVar, tb.q qVar) {
        super(aVar, pVar, hVar, c14712a, eVar);
        this.f37117q = new b();
        this.f37115o = bVar;
        this.f37116p = new u(bVar, qVar, Build.MODEL, C13865b.a().f130861D);
        this.f37111k = new AtomicBoolean(false);
        this.f37109i = false;
        this.f37110j = this.f37116p.a(false);
        this.f37112l = new Handler(new c(this, (byte) 0));
        this.f37113m = new Lb.f();
        this.f37114n = new Lb.j("BluetoothScanner", "{0}-{1}");
        this.f37115o.g(this, "ibeaconToResolve");
        this.f37115o.g(this, "foregroundScanMode");
        this.f37115o.g(this, "backgroundScanMode");
        this.f37115o.g(this, "thirdPartyScannerStateChange");
        this.f37115o.g(this, "scanParametersConfiguration");
    }

    private BluetoothLeScanner x() {
        BluetoothAdapter bluetoothAdapterJ = j();
        if (bluetoothAdapterJ != null) {
            return bluetoothAdapterJ.getBluetoothLeScanner();
        }
        f37108s.g("BluetoothAdapter - Adapter is null", new Object[0]);
        return null;
    }

    @Override // Bb.k
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
