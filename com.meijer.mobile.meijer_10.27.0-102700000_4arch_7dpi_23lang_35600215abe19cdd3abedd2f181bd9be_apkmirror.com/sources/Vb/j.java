package Vb;

import Vb.a;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import ib.C14712a;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public abstract class j implements Ua.b {

    /* renamed from: g, reason: collision with root package name */
    private static C6380a f37086g = C6381b.a(j.class.getName());

    /* renamed from: h, reason: collision with root package name */
    private static C6382c f37087h = C6383d.a(j.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final Vb.a f37088a;

    /* renamed from: b, reason: collision with root package name */
    public final p f37089b;

    /* renamed from: c, reason: collision with root package name */
    final ic.h f37090c;

    /* renamed from: d, reason: collision with root package name */
    ExecutorService f37091d;

    /* renamed from: e, reason: collision with root package name */
    private C14712a f37092e;

    /* renamed from: f, reason: collision with root package name */
    private tb.e f37093f;

    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f37094a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f37095b;

        a(byte[] bArr, int i10) {
            this.f37094a = bArr;
            this.f37095b = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVarA = j.this.f37088a.a(this.f37094a);
            if (dVarA == null) {
                C6380a unused = j.f37086g;
                return;
            }
            int i10 = b.f37097a[dVarA.f37071a.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    C6380a unused2 = j.f37086g;
                    return;
                } else {
                    j.d(j.this, this.f37095b, dVarA.f37073c);
                    return;
                }
            }
            j jVar = j.this;
            int i11 = this.f37095b;
            jVar.f37089b.b(jVar.f37090c.a(dVarA.f37072b, i11));
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
        static final /* synthetic */ int[] f37097a;

        static {
            int[] iArr = new int[a.EnumC0807a.values().length];
            f37097a = iArr;
            try {
                iArr[a.EnumC0807a.GIMBAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37097a[a.EnumC0807a.IBEACON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final Runnable c(int i10, byte[] bArr) {
        return new a(bArr, i10);
    }

    public final ExecutorService h() {
        if (this.f37091d == null) {
            this.f37091d = Wb.a.a("Sightings");
        }
        return this.f37091d;
    }

    public final void i() {
        ExecutorService executorService = this.f37091d;
        if (executorService == null || executorService.isShutdown()) {
            return;
        }
        this.f37091d.shutdownNow();
        this.f37091d = null;
    }

    public final BluetoothAdapter j() {
        try {
            BluetoothManager bluetoothManagerE = this.f37092e.e();
            if (bluetoothManagerE == null) {
                f37087h.g("Unable to initialize BluetoothManager.", new Object[0]);
                return null;
            }
            BluetoothAdapter adapter = bluetoothManagerE.getAdapter();
            if (adapter != null) {
                return adapter;
            }
            f37087h.g("Unable to initialize BluetoothManager.", new Object[0]);
            return null;
        } catch (Exception unused) {
            f37087h.g("Unable to initialize BluetoothManager.", new Object[0]);
            return null;
        }
    }

    public j(Vb.a aVar, p pVar, ic.h hVar, C14712a c14712a, tb.e eVar) {
        this.f37088a = aVar;
        this.f37089b = pVar;
        this.f37090c = hVar;
        this.f37092e = c14712a;
        this.f37093f = eVar;
    }

    static /* synthetic */ void d(j jVar, int i10, tb.d dVar) {
        dVar.toString();
        tb.e eVar = jVar.f37093f;
        String string = dVar.f161546a.toString();
        List<String> listN = eVar.f161550a.e().N();
        boolean zContains = false;
        if (string != null && !"D77657C4-52A7-426F-B9D0-D71E10798C8A".equalsIgnoreCase(string.toString()) && listN != null && listN.size() != 0) {
            zContains = listN.contains(string.toString());
        }
        if (zContains) {
            tb.b bVarB = jVar.f37090c.b(dVar, i10);
            bVarB.toString();
            jVar.f37089b.a(bVarB);
        }
    }
}
