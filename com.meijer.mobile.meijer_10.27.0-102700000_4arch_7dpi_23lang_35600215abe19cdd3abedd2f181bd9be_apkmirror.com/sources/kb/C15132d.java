package kb;

import Bb.e;
import Lb.s;
import Mb.p;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.location.LocationManager;
import cb.C6380a;
import cb.C6381b;
import ib.C14712a;

/* renamed from: kb.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C15132d {

    /* renamed from: l, reason: collision with root package name */
    private static final C6380a f141804l = C6381b.a(C15132d.class.getName());

    /* renamed from: a, reason: collision with root package name */
    e f141805a;

    /* renamed from: b, reason: collision with root package name */
    Lb.c f141806b;

    /* renamed from: c, reason: collision with root package name */
    Lb.b f141807c;

    /* renamed from: d, reason: collision with root package name */
    C14712a f141808d;

    /* renamed from: e, reason: collision with root package name */
    p f141809e;

    /* renamed from: f, reason: collision with root package name */
    Context f141810f;

    /* renamed from: g, reason: collision with root package name */
    Za.e f141811g;

    /* renamed from: h, reason: collision with root package name */
    s f141812h;

    /* renamed from: i, reason: collision with root package name */
    Bb.b f141813i;

    /* renamed from: j, reason: collision with root package name */
    Fb.c f141814j;

    /* renamed from: k, reason: collision with root package name */
    LocationManager f141815k;

    static void c(Eb.b bVar, Eb.d dVar) {
        String strB = null;
        bVar.w0((dVar == null || dVar.c() == null) ? null : dVar.c());
        if (dVar != null && dVar.d()) {
            strB = dVar.b();
        }
        bVar.v0(strB);
    }

    static void b(Eb.b bVar, Eb.a aVar) {
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
        BluetoothManager bluetoothManagerE = this.f141808d.e();
        if (bluetoothManagerE != null) {
            return bluetoothManagerE.getAdapter();
        }
        return null;
    }

    public C15132d(Context context, Za.e eVar, e eVar2, Lb.c cVar, Lb.b bVar, C14712a c14712a, p pVar, s sVar, Bb.b bVar2, Fb.c cVar2) {
        this.f141805a = eVar2;
        this.f141806b = cVar;
        this.f141807c = bVar;
        this.f141808d = c14712a;
        this.f141809e = pVar;
        this.f141810f = context;
        this.f141811g = eVar;
        this.f141812h = sVar;
        this.f141813i = bVar2;
        this.f141814j = cVar2;
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
