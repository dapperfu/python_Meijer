package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8293h implements InterfaceC9754uj {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7202Pq f75407a;

    public C8293h(InterfaceC7202Pq interfaceC7202Pq) {
        this.f75407a = interfaceC7202Pq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9754uj
    public final InterfaceC7397Vj a(Context context, Vz0 vz0, InterfaceC10026xB0 interfaceC10026xB0, InterfaceC7203Pr interfaceC7203Pr, Executor executor, List list, long j10) throws zzbz {
        try {
            return ((InterfaceC9754uj) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(InterfaceC7202Pq.class).newInstance(this.f75407a)).a(context, vz0, interfaceC10026xB0, interfaceC7203Pr, executor, list, 0L);
        } catch (Exception e10) {
            if (e10 instanceof zzbz) {
                throw ((zzbz) e10);
            }
            throw new zzbz(e10, -9223372036854775807L);
        }
    }
}
