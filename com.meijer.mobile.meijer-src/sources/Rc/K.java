package Rc;

import com.google.android.gms.internal.ads.C10124y7;
import com.google.android.gms.internal.ads.InterfaceC7561a7;
import com.google.android.gms.internal.ads.Z6;
import com.google.android.gms.internal.ads.zzaou;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes4.dex */
final class K extends C10124y7 {

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ byte[] f32323o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ Map f32324p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Sc.m f32325q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K(P p10, int i10, String str, InterfaceC7561a7 interfaceC7561a7, Z6 z62, byte[] bArr, Map map, Sc.m mVar) {
        super(i10, str, interfaceC7561a7, z62);
        this.f32323o = bArr;
        this.f32324p = map;
        this.f32325q = mVar;
    }

    @Override // com.google.android.gms.internal.ads.V6
    protected final /* bridge */ /* synthetic */ void C(Object obj) {
        N((String) obj);
    }

    @Override // com.google.android.gms.internal.ads.V6
    public final byte[] L() throws zzaou {
        byte[] bArr = this.f32323o;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.C10124y7
    protected final void N(String str) throws IOException {
        this.f32325q.g(str);
        super.N(str);
    }

    @Override // com.google.android.gms.internal.ads.V6
    public final Map w() throws zzaou {
        Map map = this.f32324p;
        return map == null ? Collections.EMPTY_MAP : map;
    }
}
