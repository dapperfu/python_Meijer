package mb;

import Db.e;
import Nb.s;
import Ob.p;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.location.LocationManager;
import eb.C13784a;
import eb.C13785b;
import kb.C15115a;

/* renamed from: mb.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15703d {

    /* renamed from: l, reason: collision with root package name */
    private static final C13784a f150950l = C13785b.a(C15703d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    e f150951a;

    /* renamed from: b, reason: collision with root package name */
    Nb.c f150952b;

    /* renamed from: c, reason: collision with root package name */
    Nb.b f150953c;

    /* renamed from: d, reason: collision with root package name */
    C15115a f150954d;

    /* renamed from: e, reason: collision with root package name */
    p f150955e;

    /* renamed from: f, reason: collision with root package name */
    Context f150956f;

    /* renamed from: g, reason: collision with root package name */
    bb.e f150957g;

    /* renamed from: h, reason: collision with root package name */
    s f150958h;

    /* renamed from: i, reason: collision with root package name */
    Db.b f150959i;

    /* renamed from: j, reason: collision with root package name */
    Hb.c f150960j;

    /* renamed from: k, reason: collision with root package name */
    LocationManager f150961k;

    static void c(Gb.b bVar, Gb.d dVar) {
        String strB = null;
        bVar.w0((dVar == null || dVar.c() == null) ? null : dVar.c());
        if (dVar != null && dVar.d()) {
            strB = dVar.b();
        }
        bVar.v0(strB);
    }

    static void b(Gb.b bVar, Gb.a aVar) {
        String strA;
        Boolean boolValueOf;
        if (aVar != null) {
            strA = aVar.a();
            boolValueOf = Boolean.valueOf(aVar.b());
        } else {
            strA = null;
            boolValueOf = null;
        }
        bVar.D(strA);
        bVar.E(boolValueOf);
    }

    private BluetoothAdapter e() {
        BluetoothManager bluetoothManagerE = this.f150954d.e();
        if (bluetoothManagerE != null) {
            return bluetoothManagerE.getAdapter();
        }
        return null;
    }

    public C15703d(Context context, bb.e eVar, e eVar2, Nb.c cVar, Nb.b bVar, C15115a c15115a, p pVar, s sVar, Db.b bVar2, Hb.c cVar2) {
        this.f150951a = eVar2;
        this.f150952b = cVar;
        this.f150953c = bVar;
        this.f150954d = c15115a;
        this.f150955e = pVar;
        this.f150956f = context;
        this.f150957g = eVar;
        this.f150958h = sVar;
        this.f150959i = bVar2;
        this.f150960j = cVar2;
    }

    final Integer a() {
        try {
            BluetoothAdapter bluetoothAdapterE = e();
            if (bluetoothAdapterE != null) {
                return Integer.valueOf(bluetoothAdapterE.getState());
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    final Boolean d() {
        try {
            BluetoothAdapter bluetoothAdapterE = e();
            if (bluetoothAdapterE != null) {
                return Boolean.valueOf(bluetoothAdapterE.isEnabled());
            }
            return null;
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }
}
