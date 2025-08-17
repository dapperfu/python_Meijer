package com.google.android.gms.internal.ads;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.k0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8488k0 implements InterfaceC9664v0 {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f75545c = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};

    /* renamed from: d, reason: collision with root package name */
    private static final C8381j0 f75546d = new C8381j0(new InterfaceC8276i0() { // from class: com.google.android.gms.internal.ads.g0
        @Override // com.google.android.gms.internal.ads.InterfaceC8276i0
        public final Constructor zza() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC9130q0.class).getConstructor(Integer.TYPE);
            }
            return null;
        }
    });

    /* renamed from: e, reason: collision with root package name */
    private static final C8381j0 f75547e = new C8381j0(new InterfaceC8276i0() { // from class: com.google.android.gms.internal.ads.h0
        @Override // com.google.android.gms.internal.ads.InterfaceC8276i0
        public final Constructor zza() {
            return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(InterfaceC9130q0.class).getConstructor(null);
        }
    });

    /* renamed from: a, reason: collision with root package name */
    private AbstractC7917eh0 f75548a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8710m4 f75549b = new C8177h4();

    private final void b(int i10, List list) {
        switch (i10) {
            case 0:
                list.add(new C8605l5());
                break;
            case 1:
                list.add(new C8819n5());
                break;
            case 2:
                list.add(new C9033p5(0));
                break;
            case 3:
                list.add(new C7957f1(0));
                break;
            case 4:
                InterfaceC9130q0 interfaceC9130q0A = f75546d.a(0);
                if (interfaceC9130q0A == null) {
                    list.add(new C9880x1(0));
                    break;
                } else {
                    list.add(interfaceC9130q0A);
                    break;
                }
            case 5:
                list.add(new C10094z1());
                break;
            case 6:
                list.add(new T2(this.f75549b, 0));
                break;
            case 7:
                list.add(new Z2(0));
                break;
            case 8:
                list.add(new C9991y3(this.f75549b, 0, null, null, AbstractC7917eh0.t(), null));
                list.add(new D3(this.f75549b, 0));
                break;
            case 9:
                list.add(new U3());
                break;
            case 10:
                list.add(new V5());
                break;
            case 11:
                if (this.f75548a == null) {
                    this.f75548a = AbstractC7917eh0.t();
                }
                list.add(new C7967f6(1, 0, this.f75549b, new C8857nU(0L), new C9246r5(0, this.f75548a), 112800));
                break;
            case 12:
                list.add(new C9248r6());
                break;
            case 14:
                list.add(new F1(0));
                break;
            case 15:
                InterfaceC9130q0 interfaceC9130q0A2 = f75547e.a(new Object[0]);
                if (interfaceC9130q0A2 != null) {
                    list.add(interfaceC9130q0A2);
                    break;
                }
                break;
            case 16:
                list.add(new C8490k1(0, this.f75549b));
                break;
            case 17:
                list.add(new C7963f4());
                break;
            case 18:
                list.add(new C9783w6());
                break;
            case 19:
                list.add(new C9345s1());
                break;
            case 20:
                list.add(new D1());
                break;
            case 21:
                list.add(new C9238r1());
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0204  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9664v0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized com.google.android.gms.internal.ads.InterfaceC9130q0[] a(android.net.Uri r25, java.util.Map r26) {
        /*
            Method dump skipped, instructions count: 1180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C8488k0.a(android.net.Uri, java.util.Map):com.google.android.gms.internal.ads.q0[]");
    }
}
