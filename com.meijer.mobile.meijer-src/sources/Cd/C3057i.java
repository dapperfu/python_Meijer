package Cd;

import Ld.AbstractC4021k;
import Ld.C4011a;
import Ld.InterfaceC4013c;
import Vd.AbstractC5507a;
import Vd.AbstractC5516j;
import Vd.C5517k;
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
import jd.AbstractC14995s;
import jd.C14987j;
import jd.C14988k;
import jd.C14992o;
import jd.InterfaceC14993p;

/* renamed from: Cd.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3057i extends com.google.android.gms.common.api.d implements InterfaceC4013c {

    /* renamed from: a, reason: collision with root package name */
    static final a.g f4255a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.android.gms.common.api.a f4256b;

    /* renamed from: c, reason: collision with root package name */
    private static final Object f4257c;

    public C3057i(Activity activity) {
        super(activity, (com.google.android.gms.common.api.a<a.d.c>) f4256b, a.d.f65590a, d.a.f65591c);
    }

    @Override // com.google.android.gms.common.api.d
    protected final String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    static {
        a.g gVar = new a.g();
        f4255a = gVar;
        f4256b = new com.google.android.gms.common.api.a("LocationServices.API", new C3051f(), gVar);
        f4257c = new Object();
    }

    public C3057i(Context context) {
        super(context, (com.google.android.gms.common.api.a<a.d.c>) f4256b, a.d.f65590a, d.a.f65591c);
    }

    private final AbstractC5516j p(final LocationRequest locationRequest, C14987j c14987j) {
        final C3055h c3055h = new C3055h(this, c14987j, C3066q.f4276a);
        return doRegisterEventListener(C14992o.a().b(new InterfaceC14993p() { // from class: Cd.n
            @Override // jd.InterfaceC14993p
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                com.google.android.gms.common.api.a aVar = C3057i.f4256b;
                ((P) obj).i(c3055h, locationRequest, (C5517k) obj2);
            }
        }).f(c3055h).g(c14987j).e(2436).a());
    }

    @Override // Ld.InterfaceC4013c
    public final AbstractC5516j<Location> a(C4011a c4011a, AbstractC5507a abstractC5507a) {
        if (abstractC5507a != null) {
            com.google.android.gms.common.internal.r.b(!abstractC5507a.a(), "cancellationToken may not be already canceled");
        }
        AbstractC5516j<Location> abstractC5516jDoRead = doRead(AbstractC14995s.a().b(new C3059j(c4011a, abstractC5507a)).e(2415).a());
        if (abstractC5507a == null) {
            return abstractC5516jDoRead;
        }
        C5517k c5517k = new C5517k(abstractC5507a);
        abstractC5516jDoRead.i(new C3060k(c5517k));
        return c5517k.a();
    }

    @Override // Ld.InterfaceC4013c
    public final AbstractC5516j<Location> e(int i10, AbstractC5507a abstractC5507a) {
        C4011a.C0329a c0329a = new C4011a.C0329a();
        c0329a.c(i10);
        C4011a c4011aA = c0329a.a();
        if (abstractC5507a != null) {
            com.google.android.gms.common.internal.r.b(!abstractC5507a.a(), "cancellationToken may not be already canceled");
        }
        AbstractC5516j<Location> abstractC5516jDoRead = doRead(AbstractC14995s.a().b(new C3059j(c4011aA, abstractC5507a)).e(2415).a());
        if (abstractC5507a == null) {
            return abstractC5516jDoRead;
        }
        C5517k c5517k = new C5517k(abstractC5507a);
        abstractC5516jDoRead.i(new C3060k(c5517k));
        return c5517k.a();
    }

    @Override // Ld.InterfaceC4013c
    public final AbstractC5516j<Void> f(AbstractC4021k abstractC4021k) {
        return doUnregisterEventListener(C14988k.c(abstractC4021k, AbstractC4021k.class.getSimpleName()), 2418).j(ExecutorC3067s.f4281a, C3064o.f4270a);
    }

    @Override // Ld.InterfaceC4013c
    public final AbstractC5516j<Void> i(LocationRequest locationRequest, AbstractC4021k abstractC4021k, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            com.google.android.gms.common.internal.r.m(looper, "invalid null looper");
        }
        return p(locationRequest, C14988k.a(abstractC4021k, looper, AbstractC4021k.class.getSimpleName()));
    }

    @Override // Ld.InterfaceC4013c
    public final AbstractC5516j<Void> d(final LocationRequest locationRequest, final PendingIntent pendingIntent) {
        return doWrite(AbstractC14995s.a().b(new InterfaceC14993p() { // from class: Cd.m
            @Override // jd.InterfaceC14993p
            public final /* synthetic */ void accept(Object obj, Object obj2) throws RemoteException {
                com.google.android.gms.common.api.a aVar = C3057i.f4256b;
                ((P) obj).j(pendingIntent, locationRequest, (C5517k) obj2);
            }
        }).e(2417).a());
    }

    @Override // Ld.InterfaceC4013c
    public final AbstractC5516j<Location> m() {
        return doRead(AbstractC14995s.a().b(C3065p.f4274a).e(2414).a());
    }

    @Override // Ld.InterfaceC4013c
    public final AbstractC5516j<LocationAvailability> o() {
        return doRead(AbstractC14995s.a().b(C3061l.f4261a).e(2416).a());
    }
}
