package nd;

import Vd.AbstractC5516j;
import Vd.C5517k;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.internal.C6664v;
import com.google.android.gms.common.internal.C6667y;
import com.google.android.gms.common.internal.InterfaceC6666x;
import jd.AbstractC14995s;
import jd.InterfaceC14993p;
import yd.f;

/* renamed from: nd.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15935d extends com.google.android.gms.common.api.d implements InterfaceC6666x {

    /* renamed from: a, reason: collision with root package name */
    private static final a.g f152237a;

    /* renamed from: b, reason: collision with root package name */
    private static final a.AbstractC1266a f152238b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f152239c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f152240d = 0;

    static {
        a.g gVar = new a.g();
        f152237a = gVar;
        C15934c c15934c = new C15934c();
        f152238b = c15934c;
        f152239c = new com.google.android.gms.common.api.a("ClientTelemetry.API", c15934c, gVar);
    }

    public C15935d(Context context, C6667y c6667y) {
        super(context, (com.google.android.gms.common.api.a<C6667y>) f152239c, c6667y, d.a.f65591c);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC6666x
    public final AbstractC5516j<Void> c(final C6664v c6664v) {
        AbstractC14995s.a aVarA = AbstractC14995s.a();
        aVarA.d(f.f171357a);
        aVarA.c(false);
        aVarA.b(new InterfaceC14993p() { // from class: nd.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // jd.InterfaceC14993p
            public final void accept(Object obj, Object obj2) throws RemoteException {
                int i10 = C15935d.f152240d;
                ((C15932a) ((C15936e) obj).getService()).I2(c6664v);
                ((C5517k) obj2).c(null);
            }
        });
        return doBestEffortWrite(aVarA.a());
    }
}
