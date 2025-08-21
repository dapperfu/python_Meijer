package wb;

import Kb.f;
import Kb.j;
import android.location.Location;
import android.location.LocationManager;
import eb.C13784a;
import eb.C13785b;
import eb.C13786c;
import eb.C13787d;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kb.C15115a;
import lt.C15611d;
import lt.EnumC15609b;
import nt.InterfaceC16021c;
import ub.C17367c;
import xb.C18150d;

/* loaded from: classes4.dex */
public class b implements InterfaceC17855a {

    /* renamed from: j, reason: collision with root package name */
    private static final C13784a f167047j = C13785b.a(b.class.getName());

    /* renamed from: k, reason: collision with root package name */
    private static final C13786c f167048k = C13787d.a(b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final c f167049a;

    /* renamed from: b, reason: collision with root package name */
    private final C18150d f167050b = new C18150d();

    /* renamed from: c, reason: collision with root package name */
    private final bb.e f167051c;

    /* renamed from: d, reason: collision with root package name */
    private final f f167052d;

    /* renamed from: e, reason: collision with root package name */
    private final String f167053e;

    /* renamed from: f, reason: collision with root package name */
    private Db.e f167054f;

    /* renamed from: g, reason: collision with root package name */
    private LocationManager f167055g;

    /* renamed from: h, reason: collision with root package name */
    private e f167056h;

    /* renamed from: i, reason: collision with root package name */
    private C15115a f167057i;

    private String g(C15611d c15611d) {
        try {
            return this.f167050b.h(c15611d);
        } catch (Exception e10) {
            f167048k.g("Unable to convert event to JSON", e10);
            c15611d.toString();
            return null;
        }
    }

    @Override // wb.InterfaceC17855a
    public final void b(e eVar) {
        this.f167056h = eVar;
    }

    @Override // wb.InterfaceC17855a
    public final void c(C15611d c15611d) {
        if (this.f167054f.v()) {
            c15611d.n(this.f167054f.x().i());
            e(c15611d);
            d(c15611d);
            a(c15611d);
            c15611d.toString();
            this.f167049a.b(g(c15611d));
            this.f167056h.u();
        }
    }

    @Override // wb.InterfaceC17855a
    public final void d(C15611d c15611d) {
        String strName = EnumC15609b.IDENTIFIER.name();
        String str = this.f167053e;
        Map<String, String> mapA = c15611d.a();
        if (mapA != null) {
            mapA.put(strName, str);
            c15611d.f(mapA);
        }
    }

    @Override // wb.InterfaceC17855a
    public final void k(InterfaceC16021c<String> interfaceC16021c) {
        String strF = this.f167052d.f(j.f16532e);
        c cVar = this.f167049a;
        File fileC = cVar.c(cVar.f167060a);
        synchronized (cVar) {
            try {
                if (fileC.exists()) {
                    int size = cVar.d().size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 100) {
                            c.f167059e.g("Failed to rename file", new Object[0]);
                            interfaceC16021c.a(20003, "Failed to rename file");
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
                            d dVar = cVar.f167062c;
                            HashMap map = new HashMap();
                            Kb.a aVarG = dVar.f167065b.G();
                            if (aVarG != null) {
                                dVar.f167064a.g(aVarG.a(), aVarG.b());
                            }
                            map.put("X-Client-Timezone", TimeZone.getDefault().getID());
                            map.put("X-Client-Platform", "android");
                            map.put(C17367c.f163868h, C17367c.f163869i);
                            try {
                                if (!dVar.f167064a.d(strF, fileC2, map).f163861c) {
                                    throw new Exception("Failed to upload the file");
                                }
                                fileC2.getName();
                                fileC2.delete();
                            } catch (com.gimbal.internal.i.c unused) {
                                throw new Exception("Something went wrong with uploading the analytic file.");
                            }
                        }
                        interfaceC16021c.a(listD.size() + " files uploaded successfully");
                    } catch (Exception e10) {
                        e10.getMessage();
                        interfaceC16021c.a(20003, e10.getMessage());
                    }
                } else {
                    interfaceC16021c.a("Nothing to upload");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b(Db.e eVar, bb.e eVar2, c cVar, f fVar, String str, C15115a c15115a) {
        this.f167054f = eVar;
        this.f167049a = cVar;
        this.f167052d = fVar;
        this.f167051c = eVar2;
        this.f167053e = str;
        this.f167057i = c15115a;
    }

    private static boolean f(String str) throws NumberFormatException {
        try {
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    @Override // wb.InterfaceC17855a
    public final void a(C15611d c15611d) {
        Location lastKnownLocation;
        if (c15611d.b() == null || c15611d.c() == null) {
            LocationManager locationManager = this.f167055g;
            if (locationManager == null) {
                this.f167055g = this.f167057i.a();
                lastKnownLocation = null;
            } else {
                lastKnownLocation = locationManager.getLastKnownLocation("network");
            }
            if (lastKnownLocation != null && lastKnownLocation.getLatitude() != 0.0d && lastKnownLocation.getLongitude() != 0.0d) {
                c15611d.g(String.valueOf(lastKnownLocation.getLatitude()));
                c15611d.h(String.valueOf(lastKnownLocation.getLongitude()));
            }
        }
    }

    @Override // wb.InterfaceC17855a
    public final void e(C15611d c15611d) {
        String strValueOf;
        if (c15611d.d() != null && (c15611d.d().length() != 0 || f(c15611d.d()))) {
            strValueOf = c15611d.d();
        } else {
            strValueOf = String.valueOf(this.f167051c.a());
        }
        c15611d.l(strValueOf);
        c15611d.k(this.f167051c.b().getOffset(Long.valueOf(strValueOf).longValue()));
    }
}
