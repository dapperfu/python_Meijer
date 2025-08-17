package Ad;

import Jd.AbstractC3777k;
import Jd.C3767a;
import Jd.InterfaceC3769c;
import Td.AbstractC5223a;
import Td.AbstractC5232j;
import Td.C5233k;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import hd.AbstractC14417s;
import hd.C14409j;
import hd.C14410k;
import hd.C14414o;
import hd.InterfaceC14415p;

/* renamed from: Ad.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2819i extends com.google.android.gms.common.api.d implements InterfaceC3769c {

    /* renamed from: a, reason: collision with root package name */
    static final a.g f259a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f260b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f261c;

    public C2819i(Activity activity) {
        super(activity, (com.google.android.gms.common.api.a<a.d.c>) f260b, a.d.f64750a, d.a.f64751c);
    }

    @Override // com.google.android.gms.common.api.d
    protected final String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    static {
        a.g gVar = new a.g();
        f259a = gVar;
        f260b = new com.google.android.gms.common.api.a("LocationServices.API", new C2813f(), gVar);
        f261c = new Object();
    }

    public C2819i(Context context) {
        super(context, (com.google.android.gms.common.api.a<a.d.c>) f260b, a.d.f64750a, d.a.f64751c);
    }

    private final AbstractC5232j p(final LocationRequest locationRequest, C14409j c14409j) {
        final C2817h c2817h = new C2817h(this, c14409j, C2828q.f280a);
        return doRegisterEventListener(C14414o.a().b(new InterfaceC14415p() { // from class: Ad.n
            @Override // hd.InterfaceC14415p
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                com.google.android.gms.common.api.a aVar = C2819i.f260b;
                ((P) obj).i(c2817h, locationRequest, (C5233k) obj2);
            }
        }).f(c2817h).g(c14409j).e(2436).a());
    }

    @Override // Jd.InterfaceC3769c
    public final AbstractC5232j<Location> e(int i10, AbstractC5223a abstractC5223a) {
        C3767a.C0237a c0237a = new C3767a.C0237a();
        c0237a.c(i10);
        C3767a c3767aA = c0237a.a();
        if (abstractC5223a != null) {
            com.google.android.gms.common.internal.r.b(!abstractC5223a.a(), "cancellationToken may not be already canceled");
        }
        AbstractC5232j<Location> abstractC5232jDoRead = doRead(AbstractC14417s.a().b(new C2821j(c3767aA, abstractC5223a)).e(2415).a());
        if (abstractC5223a == null) {
            return abstractC5232jDoRead;
        }
        C5233k c5233k = new C5233k(abstractC5223a);
        abstractC5232jDoRead.i(new C2822k(c5233k));
        return c5233k.a();
    }

    @Override // Jd.InterfaceC3769c
    public final AbstractC5232j<Void> h(AbstractC3777k abstractC3777k) {
        return doUnregisterEventListener(C14410k.c(abstractC3777k, AbstractC3777k.class.getSimpleName()), 2418).j(ExecutorC2829s.f285a, C2826o.f274a);
    }

    @Override // Jd.InterfaceC3769c
    public final AbstractC5232j<Location> j(C3767a c3767a, AbstractC5223a abstractC5223a) {
        if (abstractC5223a != null) {
            com.google.android.gms.common.internal.r.b(!abstractC5223a.a(), "cancellationToken may not be already canceled");
        }
        AbstractC5232j<Location> abstractC5232jDoRead = doRead(AbstractC14417s.a().b(new C2821j(c3767a, abstractC5223a)).e(2415).a());
        if (abstractC5223a == null) {
            return abstractC5232jDoRead;
        }
        C5233k c5233k = new C5233k(abstractC5223a);
        abstractC5232jDoRead.i(new C2822k(c5233k));
        return c5233k.a();
    }

    @Override // Jd.InterfaceC3769c
    public final AbstractC5232j<Void> m(LocationRequest locationRequest, AbstractC3777k abstractC3777k, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            com.google.android.gms.common.internal.r.m(looper, "invalid null looper");
        }
        return p(locationRequest, C14410k.a(abstractC3777k, looper, AbstractC3777k.class.getSimpleName()));
    }

    @Override // Jd.InterfaceC3769c
    public final AbstractC5232j<Void> d(final LocationRequest locationRequest, final PendingIntent pendingIntent) {
        return doWrite(AbstractC14417s.a().b(new InterfaceC14415p() { // from class: Ad.m
            @Override // hd.InterfaceC14415p
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                com.google.android.gms.common.api.a aVar = C2819i.f260b;
                ((P) obj).j(pendingIntent, locationRequest, (C5233k) obj2);
            }
        }).e(2417).a());
    }

    @Override // Jd.InterfaceC3769c
    public final AbstractC5232j<Location> l() {
        return doRead(AbstractC14417s.a().b(C2827p.f278a).e(2414).a());
    }

    @Override // Jd.InterfaceC3769c
    public final AbstractC5232j<LocationAvailability> o() {
        return doRead(AbstractC14417s.a().b(C2823l.f265a).e(2416).a());
    }
}
