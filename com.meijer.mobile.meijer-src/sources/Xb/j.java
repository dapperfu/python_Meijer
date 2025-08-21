package Xb;

import Xb.a;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kb.C15115a;

/* loaded from: classes4.dex */
public abstract class j implements Wa.b {

    /* renamed from: g, reason: collision with root package name */
    private static C13784a f41798g = C13785b.a(j.class.getName());

    /* renamed from: h, reason: collision with root package name */
    private static C13786c f41799h = C13787d.a(j.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Xb.a f41800a;

    /* renamed from: b, reason: collision with root package name */
    public final p f41801b;

    /* renamed from: c, reason: collision with root package name */
    final kc.h f41802c;

    /* renamed from: d, reason: collision with root package name */
    ExecutorService f41803d;

    /* renamed from: e, reason: collision with root package name */
    private C15115a f41804e;

    /* renamed from: f, reason: collision with root package name */
    private vb.e f41805f;

    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f41806a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f41807b;

        a(byte[] bArr, int i10) {
            this.f41806a = bArr;
            this.f41807b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVarA = j.this.f41800a.a(this.f41806a);
            if (dVarA == null) {
                C13784a unused = j.f41798g;
                return;
            }
            int i10 = b.f41809a[dVarA.f41783a.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    C13784a unused2 = j.f41798g;
                    return;
                } else {
                    j.d(j.this, this.f41807b, dVarA.f41785c);
                    return;
                }
            }
            j jVar = j.this;
            int i11 = this.f41807b;
            jVar.f41801b.a(jVar.f41802c.a(dVarA.f41784b, i11));
        }
    }

    public abstract void e();

    public abstract void f();

    public boolean g() {
        try {
            BluetoothAdapter bluetoothAdapterJ = j();
            if (bluetoothAdapterJ != null) {
                return bluetoothAdapterJ.isEnabled();
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f41809a;

        static {
            int[] iArr = new int[a.EnumC0897a.values().length];
            f41809a = iArr;
            try {
                iArr[a.EnumC0897a.GIMBAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41809a[a.EnumC0897a.IBEACON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final Runnable c(int i10, byte[] bArr) {
        return new a(bArr, i10);
    }

    public final ExecutorService h() {
        if (this.f41803d == null) {
            this.f41803d = Yb.a.a("Sightings");
        }
        return this.f41803d;
    }

    public final void i() {
        ExecutorService executorService = this.f41803d;
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        this.f41803d.shutdownNow();
        this.f41803d = null;
    }

    public final BluetoothAdapter j() {
        try {
            BluetoothManager bluetoothManagerE = this.f41804e.e();
            if (bluetoothManagerE == null) {
                f41799h.g("Unable to initialize BluetoothManager.", new Object[0]);
                return null;
            }
            BluetoothAdapter adapter = bluetoothManagerE.getAdapter();
            if (adapter != null) {
                return adapter;
            }
            f41799h.g("Unable to initialize BluetoothManager.", new Object[0]);
            return null;
        } catch (Exception unused) {
            f41799h.g("Unable to initialize BluetoothManager.", new Object[0]);
            return null;
        }
    }

    public j(Xb.a aVar, p pVar, kc.h hVar, C15115a c15115a, vb.e eVar) {
        this.f41800a = aVar;
        this.f41801b = pVar;
        this.f41802c = hVar;
        this.f41804e = c15115a;
        this.f41805f = eVar;
    }

    static /* synthetic */ void d(j jVar, int i10, vb.d dVar) {
        dVar.toString();
        vb.e eVar = jVar.f41805f;
        String string = dVar.f165724a.toString();
        List<String> listN = eVar.f165728a.e().N();
        boolean zContains = false;
        if (string != null && !"D77657C4-52A7-426F-B9D0-D71E10798C8A".equalsIgnoreCase(string.toString()) && listN != null && listN.size() != 0) {
            zContains = listN.contains(string.toString());
        }
        if (zContains) {
            vb.b bVarB = jVar.f41802c.b(dVar, i10);
            bVarB.toString();
            jVar.f41801b.b(bVarB);
        }
    }
}
