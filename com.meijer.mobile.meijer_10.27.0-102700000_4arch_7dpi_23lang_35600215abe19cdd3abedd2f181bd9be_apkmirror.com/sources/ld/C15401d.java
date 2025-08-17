package ld;

import Td.AbstractC5232j;
import Td.C5233k;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.internal.C6539v;
import com.google.android.gms.common.internal.C6542y;
import com.google.android.gms.common.internal.InterfaceC6541x;
import hd.AbstractC14417s;
import hd.InterfaceC14415p;
import wd.f;

/* renamed from: ld.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C15401d extends com.google.android.gms.common.api.d implements InterfaceC6541x {

    /* renamed from: a, reason: collision with root package name */
    private static final a.g f148840a;

    /* renamed from: b, reason: collision with root package name */
    private static final a.AbstractC1257a f148841b;

    /* renamed from: c, reason: collision with root package name */
    private static final com.google.android.gms.common.api.a f148842c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f148843d = 0;

    static {
        a.g gVar = new a.g();
        f148840a = gVar;
        C15400c c15400c = new C15400c();
        f148841b = c15400c;
        f148842c = new com.google.android.gms.common.api.a("ClientTelemetry.API", c15400c, gVar);
    }

    public C15401d(Context context, C6542y c6542y) {
        super(context, (com.google.android.gms.common.api.a<C6542y>) f148842c, c6542y, d.a.f64751c);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC6541x
    public final AbstractC5232j<Void> b(final C6539v c6539v) {
        AbstractC14417s.a aVarA = AbstractC14417s.a();
        aVarA.d(f.f166035a);
        aVarA.c(false);
        aVarA.b(new InterfaceC14415p() { // from class: ld.b
            /* JADX WARN: Multi-variable type inference failed */
            @Override // hd.InterfaceC14415p
            public final void accept(Object obj, Object obj2) throws RemoteException {
                int i10 = C15401d.f148843d;
                ((C15398a) ((C15402e) obj).getService()).F2(c6539v);
                ((C5233k) obj2).c(null);
            }
        });
        return doBestEffortWrite(aVarA.a());
    }
}
