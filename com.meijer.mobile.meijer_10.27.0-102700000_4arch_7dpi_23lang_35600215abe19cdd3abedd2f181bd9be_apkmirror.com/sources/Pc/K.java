package Pc;

import com.google.android.gms.internal.ads.C9999y7;
import com.google.android.gms.internal.ads.InterfaceC7436a7;
import com.google.android.gms.internal.ads.Z6;
import com.google.android.gms.internal.ads.zzaou;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
final class K extends C9999y7 {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ byte[] f25109o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ Map f25110p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Qc.m f25111q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K(P p10, int i10, String str, InterfaceC7436a7 interfaceC7436a7, Z6 z62, byte[] bArr, Map map, Qc.m mVar) {
        super(i10, str, interfaceC7436a7, z62);
        this.f25109o = bArr;
        this.f25110p = map;
        this.f25111q = mVar;
    }

    @Override // com.google.android.gms.internal.ads.V6
    protected final /* bridge */ /* synthetic */ void C(Object obj) {
        N((String) obj);
    }

    @Override // com.google.android.gms.internal.ads.V6
    public final byte[] L() throws zzaou {
        byte[] bArr = this.f25109o;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.C9999y7
    protected final void N(String str) throws IOException {
        this.f25111q.g(str);
        super.N(str);
    }

    @Override // com.google.android.gms.internal.ads.V6
    public final Map w() throws zzaou {
        Map map = this.f25110p;
        return map == null ? Collections.EMPTY_MAP : map;
    }
}
