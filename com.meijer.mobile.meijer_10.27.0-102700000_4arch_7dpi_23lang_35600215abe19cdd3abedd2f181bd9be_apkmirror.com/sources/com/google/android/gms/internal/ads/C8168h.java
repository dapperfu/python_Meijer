package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.ads.h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8168h implements InterfaceC9629uj {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC7077Pq f74567a;

    public C8168h(InterfaceC7077Pq interfaceC7077Pq) {
        this.f74567a = interfaceC7077Pq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9629uj
    public final InterfaceC7272Vj a(Context context, Vz0 vz0, InterfaceC9901xB0 interfaceC9901xB0, InterfaceC7078Pr interfaceC7078Pr, Executor executor, List list, long j10) throws zzbz {
        try {
            return ((InterfaceC9629uj) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(InterfaceC7077Pq.class).newInstance(this.f74567a)).a(context, vz0, interfaceC9901xB0, interfaceC7078Pr, executor, list, 0L);
        } catch (Exception e10) {
            if (e10 instanceof zzbz) {
                throw ((zzbz) e10);
            }
            throw new zzbz(e10, -9223372036854775807L);
        }
    }
}
