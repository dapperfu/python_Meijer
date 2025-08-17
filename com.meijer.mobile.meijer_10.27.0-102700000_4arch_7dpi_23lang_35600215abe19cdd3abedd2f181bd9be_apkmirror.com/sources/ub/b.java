package ub;

import Ib.f;
import Ib.j;
import android.location.Location;
import android.location.LocationManager;
import cb.C6380a;
import cb.C6381b;
import cb.C6382c;
import cb.C6383d;
import ib.C14712a;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import lt.C15500d;
import lt.EnumC15498b;
import nt.InterfaceC15945c;
import sb.C16920c;
import vb.C17538d;

/* loaded from: classes4.dex */
public class b implements InterfaceC17238a {

    /* renamed from: j, reason: collision with root package name */
    private static final C6380a f162838j = C6381b.a(b.class.getName());

    /* renamed from: k, reason: collision with root package name */
    private static final C6382c f162839k = C6383d.a(b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final c f162840a;

    /* renamed from: b, reason: collision with root package name */
    private final C17538d f162841b = new C17538d();

    /* renamed from: c, reason: collision with root package name */
    private final Za.e f162842c;

    /* renamed from: d, reason: collision with root package name */
    private final f f162843d;

    /* renamed from: e, reason: collision with root package name */
    private final String f162844e;

    /* renamed from: f, reason: collision with root package name */
    private Bb.e f162845f;

    /* renamed from: g, reason: collision with root package name */
    private LocationManager f162846g;

    /* renamed from: h, reason: collision with root package name */
    private e f162847h;

    /* renamed from: i, reason: collision with root package name */
    private C14712a f162848i;

    private String g(C15500d c15500d) {
        try {
            return this.f162841b.h(c15500d);
        } catch (Exception e10) {
            f162839k.g("Unable to convert event to JSON", e10);
            c15500d.toString();
            return null;
        }
    }

    @Override // ub.InterfaceC17238a
    public final void b(e eVar) {
        this.f162847h = eVar;
    }

    @Override // ub.InterfaceC17238a
    public final void c(C15500d c15500d) {
        if (this.f162845f.v()) {
            c15500d.n(this.f162845f.x().i());
            e(c15500d);
            d(c15500d);
            a(c15500d);
            c15500d.toString();
            this.f162840a.b(g(c15500d));
            this.f162847h.u();
        }
    }

    @Override // ub.InterfaceC17238a
    public final void d(C15500d c15500d) {
        String strName = EnumC15498b.IDENTIFIER.name();
        String str = this.f162844e;
        Map<String, String> mapA = c15500d.a();
        if (mapA != null) {
            mapA.put(strName, str);
            c15500d.f(mapA);
        }
    }

    @Override // ub.InterfaceC17238a
    public final void k(InterfaceC15945c<String> interfaceC15945c) {
        String strF = this.f162843d.f(j.f13786e);
        c cVar = this.f162840a;
        File fileC = cVar.c(cVar.f162851a);
        synchronized (cVar) {
            try {
                if (fileC.exists()) {
                    int size = cVar.d().size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 100) {
                            c.f162850e.g("Failed to rename file", new Object[0]);
                            interfaceC15945c.a(20003, "Failed to rename file");
                            break;
                        }
                        StringBuilder sb2 = new StringBuilder("upload-in-progress");
                        size++;
                        sb2.append(size);
                        if (fileC.renameTo(cVar.c(sb2.toString()))) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    List<String> listD = cVar.d();
                    try {
                        Iterator<String> it = listD.iterator();
                        while (it.hasNext()) {
                            File fileC2 = cVar.c(it.next());
                            d dVar = cVar.f162853c;
                            HashMap map = new HashMap();
                            Ib.a aVarG = dVar.f162856b.G();
                            if (aVarG != null) {
                                dVar.f162855a.g(aVarG.a(), aVarG.b());
                            }
                            map.put("X-Client-Timezone", TimeZone.getDefault().getID());
                            map.put("X-Client-Platform", "android");
                            map.put(C16920c.f160382h, C16920c.f160383i);
                            try {
                                if (!dVar.f162855a.d(strF, fileC2, map).f160375c) {
                                    throw new Exception("Failed to upload the file");
                                }
                                fileC2.getName();
                                fileC2.delete();
                            } catch (com.gimbal.internal.i.c unused) {
                                throw new Exception("Something went wrong with uploading the analytic file.");
                            }
                        }
                        interfaceC15945c.a(listD.size() + " files uploaded successfully");
                    } catch (Exception e10) {
                        e10.getMessage();
                        interfaceC15945c.a(20003, e10.getMessage());
                    }
                } else {
                    interfaceC15945c.a("Nothing to upload");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(Bb.e eVar, Za.e eVar2, c cVar, f fVar, String str, C14712a c14712a) {
        this.f162845f = eVar;
        this.f162840a = cVar;
        this.f162843d = fVar;
        this.f162842c = eVar2;
        this.f162844e = str;
        this.f162848i = c14712a;
    }

    private static boolean f(String str) throws NumberFormatException {
        try {
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    @Override // ub.InterfaceC17238a
    public final void a(C15500d c15500d) {
        Location lastKnownLocation;
        if (c15500d.b() == null || c15500d.c() == null) {
            LocationManager locationManager = this.f162846g;
            if (locationManager == null) {
                this.f162846g = this.f162848i.a();
                lastKnownLocation = null;
            } else {
                lastKnownLocation = locationManager.getLastKnownLocation("network");
            }
            if (lastKnownLocation != null && lastKnownLocation.getLatitude() != 0.0d && lastKnownLocation.getLongitude() != 0.0d) {
                c15500d.g(String.valueOf(lastKnownLocation.getLatitude()));
                c15500d.h(String.valueOf(lastKnownLocation.getLongitude()));
            }
        }
    }

    @Override // ub.InterfaceC17238a
    public final void e(C15500d c15500d) {
        String strValueOf;
        if (c15500d.d() != null && (c15500d.d().length() != 0 || f(c15500d.d()))) {
            strValueOf = c15500d.d();
        } else {
            strValueOf = String.valueOf(this.f162842c.a());
        }
        c15500d.l(strValueOf);
        c15500d.k(this.f162842c.b().getOffset(Long.valueOf(strValueOf).longValue()));
    }
}
