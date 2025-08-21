package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.oI, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9077oI implements InterfaceC9952wb {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f78195a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9504sI f78196b;

    C9077oI(C9504sI c9504sI, String str) {
        this.f78195a = str;
        this.f78196b = c9504sI;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9952wb
    public final void C0(C9845vb c9845vb) {
        if (!((Boolean) Oc.A.c().a(C8784lf.f76966R1)).booleanValue()) {
            if (c9845vb.f79930j) {
                C9504sI c9504sI = this.f78196b;
                if (c9504sI.f79053u != null) {
                    c9504sI.f79040E.put(this.f78195a, Boolean.TRUE);
                    C9504sI c9504sI2 = this.f78196b;
                    if (c9504sI2.f79053u == null) {
                        return;
                    }
                    c9504sI2.j(c9504sI2.f79053u.zzf(), this.f78196b.f79053u.zzl(), this.f78196b.f79053u.zzm(), true);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (c9845vb.f79930j) {
                    C9504sI c9504sI3 = this.f78196b;
                    if (c9504sI3.f79053u != null) {
                        c9504sI3.f79040E.put(this.f78195a, Boolean.TRUE);
                        C9504sI c9504sI4 = this.f78196b;
                        if (c9504sI4.f79053u == null) {
                        } else {
                            c9504sI4.j(c9504sI4.f79053u.zzf(), this.f78196b.f79053u.zzl(), this.f78196b.f79053u.zzm(), true);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
